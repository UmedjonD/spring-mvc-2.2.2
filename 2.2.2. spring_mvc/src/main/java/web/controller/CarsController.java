package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    private CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "number", defaultValue = "5") int number, Model model) {
        int result;
        if (number == 0) {
            result = Math.min(1000, 5);
        } else {
            result = Math.min(number, 5);
        }
        List<Car> carsL = carService.getListCar(result);
        model.addAttribute("cars", carsL);

        return "cars";
    }

}
