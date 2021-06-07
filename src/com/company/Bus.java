package com.company;

import java.util.Objects;

public class Bus {
    private String gaiNumberBus;
    private int yearOfCommencementOfOperation;
    private int numberRoute;
    private int mileage;
    private String surnameAndNameDriver = "";
    private String brandBas = new String();

    public static void   out() {
        System.out.println();


    }

    public String getGaiNumberBus() {
        return this.gaiNumberBus;
    }

    public void setGaiNumberBus(String gaiNumberBus) {
        this.gaiNumberBus = gaiNumberBus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "gaiNumberBus='" + gaiNumberBus + '\'' +
                ", yearOfCommencementOfOperation=" + yearOfCommencementOfOperation +
                ", numberRoute=" + numberRoute +
                ", mileage=" + mileage +
                ", surnameAndNameDriver='" + surnameAndNameDriver + '\'' +
                ", brandBas=" + brandBas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return getYearOfCommencementOfOperation() == bus.getYearOfCommencementOfOperation() && getNumberRoute() == bus.getNumberRoute() && getMileage() == bus.getMileage() && Objects.equals(getGaiNumberBus(), bus.getGaiNumberBus()) && Objects.equals(getSurnameAndNameDriver(), bus.getSurnameAndNameDriver()) && Objects.equals(getBrandBas(), bus.getBrandBas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGaiNumberBus(), getYearOfCommencementOfOperation(), getNumberRoute(), getMileage(), getSurnameAndNameDriver(), getBrandBas());
    }

    public int getYearOfCommencementOfOperation() {
        return yearOfCommencementOfOperation;
    }

    public void setYearOfCommencementOfOperation(int yearOfCommencementOfOperation) {
        this.yearOfCommencementOfOperation = yearOfCommencementOfOperation;
    }

    public int getNumberRoute() {
        return numberRoute;
    }

    public void setNumberRoute(int numberRoute) {
        this.numberRoute = numberRoute;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getSurnameAndNameDriver() {
        return surnameAndNameDriver;
    }

    public void setSurnameAndNameDriver(String surnameAndNameDriver) {
        this.surnameAndNameDriver = surnameAndNameDriver;
    }

    public String getBrandBas() {
        return brandBas;
    }

    public void setBrandBas(String brandBas) {
        this.brandBas = brandBas;
    }

    public Bus(String gaiNumberBus, int yearOfCommencementOfOperation, int numberRoute, int mileage, String surnameAndNameDriver, String brandBas) {
        this.gaiNumberBus = gaiNumberBus;
        this.yearOfCommencementOfOperation = yearOfCommencementOfOperation;
        this.numberRoute = numberRoute;
        this.mileage = mileage;
        this.surnameAndNameDriver = surnameAndNameDriver;
        this.brandBas = brandBas;
    }
}
