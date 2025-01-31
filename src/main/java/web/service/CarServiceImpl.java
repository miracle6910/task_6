package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        List<Car> cars = carDao.listOfCars();
        return cars.stream()
                .limit((count >= 5 || count <= 0) ? cars.size() : count)
                .toList();
    }
}