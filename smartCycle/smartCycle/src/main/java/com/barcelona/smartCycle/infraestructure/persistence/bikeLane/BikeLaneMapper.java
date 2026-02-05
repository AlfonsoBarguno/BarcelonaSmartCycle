package com.barcelona.smartCycle.infraestructure.persistence.bikeLane;

import com.barcelona.smartCycle.domain.bikelane.BikeLane;
import com.barcelona.smartCycle.domain.bikelane.BikeLaneId;
import com.barcelona.smartCycle.domain.bikelane.Geolocation;
import org.locationtech.jts.geom.*;

public class BikeLaneMapper {

    private static final GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);

    public static BikeLaneEntity toEntity (BikeLane lane) {

        Geolocation loc = lane.getLocation();
        Point point = factory.createPoint(new Coordinate(loc.longitude(), loc.latitude()));

        return new BikeLaneEntity(lane.getId().id(), point);
    }

    public static BikeLane toDomain (BikeLaneEntity entity){

        Point p = entity.getLocation();

        Geolocation location = new Geolocation(p.getY(), p.getX());

        return new BikeLane(new BikeLaneId(entity.getId()), location);
    }
}
