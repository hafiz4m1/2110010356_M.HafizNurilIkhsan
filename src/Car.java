/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nuril
 */
public class Car {

    private int carId;
    private String brand;
    private String model;
    private int year;
    private int typeId;

    public Car(int carId, String brand, String model, int year, int typeId) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.typeId = typeId;
    }

    public int getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getTypeId() {
        return typeId;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Type ID: " + typeId;
    }
}
