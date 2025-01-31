package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> listOfCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2020, 150.00));
        cars.add(new Car("BMW", 2021, 200.15));
        cars.add(new Car("Nissan", 2025, 300.5));
        cars.add(new Car("Opel", 1999, 0.7));
        cars.add(new Car("Mersedes", 2023, 360.15));
        return cars;
    }
}
