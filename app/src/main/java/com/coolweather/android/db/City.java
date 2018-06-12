package com.coolweather.android.db;

/**
 * Created by 刘欢 on 2018/6/12.
 */
public class City {
    private int id;
    private String cityName;
    private int cityCode;
    private int provineId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvineId() {
        return provineId;
    }

    public void setProvineId(int provineId) {
        this.provineId = provineId;
    }
}
