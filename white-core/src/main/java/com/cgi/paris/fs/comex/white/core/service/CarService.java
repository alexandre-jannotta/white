package com.cgi.paris.fs.comex.white.core.service;

import com.cgi.paris.fs.comex.white.core.bean.Car;

import java.util.Optional;

public class CarService {

    public void handleLight(Car car, String light) {
        if ("GREEN".equals(light)) {
            car.setAction("RUNNING");
        } else {
            car.setAction("STOPPED");
        }
    }

}
