package com.example.bluesky.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int countyId;
    private int cityId;
    private String countName;
    private String weatherId;

    public int getCityId() {
        return cityId;
    }

    public int getCountyId() {
        return countyId;
    }

    public String getCountName() {
        return countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
