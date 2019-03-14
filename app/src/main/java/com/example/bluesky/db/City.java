package com.example.bluesky.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int cityId;
    private int cityCode;
    private String cityName;
    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
