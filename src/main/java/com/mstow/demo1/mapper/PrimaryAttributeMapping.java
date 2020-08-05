package com.mstow.demo1.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.BiConsumer;
import java.util.function.Function;

@AllArgsConstructor
@Data
public class PrimaryAttributeMapping {
    private String name;
    private BiConsumer<MasterPharmacyEntity, String> entitySetter;
    private Function<MasterPharmacyEntity, String> attributeGetter;
}
