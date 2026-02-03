package com.barcelona.smartCycle.application.bikelane;

import com.barcelona.smartCycle.domain.bikelane.BikeLane;
import com.barcelona.smartCycle.domain.bikelane.BikeLaneId;
import com.barcelona.smartCycle.domain.bikelane.BikeLaneRepository;
import com.barcelona.smartCycle.domain.bikelane.Geolocation;

public class RegisterBikeLaneUseCase {
    private final BikeLaneRepository repository;
    public RegisterBikeLaneUseCase(BikeLaneRepository bikeLaneRepository) {
        this.repository = bikeLaneRepository;
    }

    public BikeLaneId register (double latitude, double longitude) {

        BikeLaneId id = BikeLaneId.newId();
        Geolocation geolocation = new Geolocation(latitude, longitude);

        BikeLane bikeLane = new BikeLane(id, geolocation);

        repository.save(bikeLane);

        return id;
    }
}
