package com.cgi.paris.fs.comex.white.core.service;

import com.cgi.paris.fs.comex.white.core.bean.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void handleLight() {
        CarService carService = new CarService();

        Car car = new Car();

        carService.handleLight(car, "GREEN");
        assertThat(car.getAction()).isEqualTo("RUNNING");

        carService.handleLight(car, "RED");
        assertThat(car.getAction()).isEqualTo("STOPPED");
    }
}