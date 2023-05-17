/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nuril
 */
public class CashPrice {
    
    private int carId;
    private double price;

    public CashPrice(int carId, double price) {
        this.carId = carId;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Cash Price: $" + price;
    }
}
