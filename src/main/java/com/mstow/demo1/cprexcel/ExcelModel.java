package com.mstow.demo1.cprexcel;

import java.util.List;

// odchodzi nam ColumnId, ExcelRow, ModelMapper - 3 klasy do usunięcia.
public class ExcelModel {
    private List<MasterPharmacy> pharmacies;
    private String cprIdColumnName;
    private List<String> attributesColumnNames;
}
