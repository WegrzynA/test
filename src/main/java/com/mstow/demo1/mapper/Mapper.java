package com.mstow.demo1.mapper;

import java.util.List;
import java.util.Optional;

public class Mapper {
    private final List<PrimaryAttributeMapping> primaryAttributeMappings;

    public Mapper(List<PrimaryAttributeMapping> primaryAttributeMappings) {
        this.primaryAttributeMappings = primaryAttributeMappings;
    }

    public MasterPharmacyEntity toEntity(MasterPharmacyModel model, MasterPharmacyEntity entity) {
        for (MasterPharmacyAttribute attribute : model.getMasterPharmacyAttributes()) {
            Optional<PrimaryAttributeMapping> primaryMapping = findPrimaryMapping(attribute.getName());
            if (primaryMapping.isPresent()) {
                primaryMapping.get().getEntitySetter().accept(entity,attribute.getValue());
            }
        }

        return entity;
    }

    private Optional<PrimaryAttributeMapping> findPrimaryMapping(String name) {
        return primaryAttributeMappings.stream()
                .filter(mapping -> mapping.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
