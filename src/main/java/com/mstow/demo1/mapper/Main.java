package com.mstow.demo1.mapper;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PrimaryAttributeMapping> mappings = new PrimaryMappingFactory().getPrimaryAttributeMappings();

        Mapper mapper = new Mapper(mappings);
        MasterPharmacyEntity entity = new MasterPharmacyEntity();
        MasterPharmacyModel model = new MasterPharmacyModel();
        List<MasterPharmacyAttribute> attributes = new ArrayList<>();
        attributes.add(new MasterPharmacyAttribute("NAME","name_val"));
        attributes.add(new MasterPharmacyAttribute("ADDRESS","address_val"));
        model.setMasterPharmacyAttributes(attributes);
        mapper.toEntity(model, entity);

        System.out.println(entity);
    }

}
