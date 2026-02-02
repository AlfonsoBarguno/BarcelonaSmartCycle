package com.barcelona.smartCycle.domain.bikelane;

import java.util.UUID;

public record BikeLaneId(UUID id) {

    public static BikeLaneId newId(){

        return new BikeLaneId(UUID.randomUUID());
    }
}
