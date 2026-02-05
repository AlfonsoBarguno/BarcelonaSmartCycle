package com.barcelona.smartCycle.infraestructure.persistence.bikeLane;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataBikeLaneRepository extends JpaRepository <BikeLaneEntity, UUID> {
}
