package com.barcelona.smartCycle.infraestructure.persistence.bikeLane;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.locationtech.jts.geom.Point;


import java.util.UUID;

@Entity
@Table(name="bike_lanes")
public class BikeLaneEntity {

    @Id
    private UUID id;

    @Column(columnDefinition = "geometry(Point, 4326)", nullable = false)
    private Point location;

    protected BikeLaneEntity(){}

    public BikeLaneEntity(UUID id, Point location) {
        this.id = id;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public Point getLocation() {
        return location;
    }
}
