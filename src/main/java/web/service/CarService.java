package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCars();
    List<Car> showCars(int count);
}
