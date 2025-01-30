package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();
    public CarServiceImpl() {
        addCars();
    }
    @Override
    public void addCars() {

        cars.add(new Car("Toyota", 2020, 150.00));
        cars.add(new Car("BMW", 2021, 200.15));
        cars.add(new Car("Nissan", 2025, 300.5));
        cars.add(new Car("Opel", 1999, 0.7));
        cars.add(new Car("Mersedes", 2023, 360.15));
    }

    @Override
    public List<Car> showCars(int count) {

        return cars.stream()
                .limit((count >= 5 || count <= 0) ? cars.size() : count)
                .toList();
    }
}


