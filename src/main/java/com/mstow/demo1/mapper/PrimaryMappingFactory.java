package com.mstow.demo1.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class PrimaryMappingFactory {

    List<PrimaryAttributeMapping> getPrimaryAttributeMappings() {
        List<PrimaryAttributeMapping> mappings = new ArrayList<PrimaryAttributeMapping>();
        mappings.add(of("NAME", MasterPharmacyEntity::setName, MasterPharmacyEntity::getName));
        mappings.add(of("ADDRESS", MasterPharmacyEntity::setAddress, MasterPharmacyEntity::getAddress));
        return mappings;
    }

    private PrimaryAttributeMapping of(String name, BiConsumer<MasterPharmacyEntity, String> setter, Function<MasterPharmacyEntity, String> getter) {
        return new PrimaryAttributeMapping(name, setter, getter);
    }
}