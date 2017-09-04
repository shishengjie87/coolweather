package com.example.android.db;

import org.litepal.crud.DataSupport;


/**
 * Created by shengjie.shi on 2017-09-04.
 */

public class Province extends DataSupport{
    private int id;
    private String provincName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincName() {
        return provincName;
    }

    public void setProvincName(String provincName) {
        this.provincName = provincName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
