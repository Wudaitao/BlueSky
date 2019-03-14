package com.example.bluesky.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int provinceId;
    private int provinceCode;
    private String provinceName;

    public int getprovinceId(){
        return provinceId;
    }

    public void setId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
