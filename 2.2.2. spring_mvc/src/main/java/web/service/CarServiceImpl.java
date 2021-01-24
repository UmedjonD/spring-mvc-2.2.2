package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    public CarServiceImpl() {
    }

    @Override
    public List<Car> getListCar(int number) {
        List<Car> carList = new ArrayList<>();
        List<Car> carListForsend = new ArrayList<>();

        carList.add(new Car("Vaz", "2107", "07"));
        carList.add(new Car("Nexia", "Vectra", "1996"));
        carList.add(new Car("Opel", "astra", "2000"));
        carList.add(new Car("Jeep", "XX-10", "10"));
        carList.add(new Car("Ford", "focul", "2"));

        for (int i = 0; i < number; i++) {
            carListForsend.add(carList.get(i));
        }

        return carListForsend;

    }
}
