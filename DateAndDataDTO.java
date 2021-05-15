package com.parleagro.backend.dto;

public class DateAndDataDTO {

    private String date;
    private String data;
    private String dataType;
    private String description;

    @Override
    public String toString() {
        return "DateAndDataDTO{" +
                "date='" + date + '\'' +
                ", data='" + data + '\'' +
                ", dataType='" + dataType + '\'' +
                ", description='" + description + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    private String className;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
