/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nuril
 */
public class CarSpecifucation {
    
    private int carId;
    private String specification;

    public CarSpecifucation(int carId, String specification) {
        this.carId = carId;
        this.specification = specification;
    }

    public int getCarId() {
        return carId;
    }

    public String getSpecification() {
        return specification;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Specification: " + specification;
    }
}
