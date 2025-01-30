package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {

        cars.add(car);
    }

    @Override
    public List<Car> showCars(int count) {

        return cars.stream()
                .limit(count >= 5 ? cars.size() : count)
                .toList();
    }
}


