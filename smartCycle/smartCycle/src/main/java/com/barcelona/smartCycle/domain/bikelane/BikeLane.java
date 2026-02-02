package com.barcelona.smartCycle.domain.bikelane;

import java.time.Instant;

public class BikeLane {
    private final BikeLaneId id;
    private Geolocation location;
    private LaneStatus status;
    private Instant lastInspection;

    public BikeLane (BikeLaneId id, Geolocation location) {
        this.id = id;
        this.location = location;
        this.status = LaneStatus.OK;
        this.lastInspection = Instant.now();
    }

    public void markDamaged(){
        this.status = LaneStatus.DAMAGED;
        this.lastInspection = Instant.now();
    }

    public void markBlocked() {
        this.status = LaneStatus.BLOCKED;
        this.lastInspection = Instant.now();
    }

    public BikeLaneId getId() {
        return id;
    }

    public Geolocation getLocation() {
        return location;
    }

    public LaneStatus getStatus() {
        return status;
    }

    public Instant getLastInspection() {
        return lastInspection;
    }

}
