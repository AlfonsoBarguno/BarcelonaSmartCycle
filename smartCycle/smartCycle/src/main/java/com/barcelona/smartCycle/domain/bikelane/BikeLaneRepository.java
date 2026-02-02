package com.barcelona.smartCycle.domain.bikelane;

import java.util.Optional;

public interface BikeLaneRepository {

    void save (BikeLane bikelane);

    Optional<BikeLane> findById (BikeLaneId id);
}
