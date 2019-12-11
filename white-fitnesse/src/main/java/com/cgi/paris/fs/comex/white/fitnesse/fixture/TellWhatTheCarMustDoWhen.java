package com.cgi.paris.fs.comex.white.fitnesse.fixture;

import com.cgi.paris.fs.comex.white.core.bean.Car;
import com.cgi.paris.fs.comex.white.core.service.CarService;
import fit.ColumnFixture;

public class TellWhatTheCarMustDoWhen extends ColumnFixture {

    private final CarService carService = new CarService();

    private String light;

    private Car car;

    @Override
    protected void executeIfNeeded() throws Exception {
        this.car = new Car();
        this.carService.handleLight(car, this.light);
        super.executeIfNeeded();
    }

    public String action() {
        return this.car.getAction();
    }

}
