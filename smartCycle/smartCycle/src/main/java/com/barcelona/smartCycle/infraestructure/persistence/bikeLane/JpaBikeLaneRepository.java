package com.barcelona.smartCycle.infraestructure.persistence.bikeLane;

import com.barcelona.smartCycle.domain.bikelane.BikeLane;
import com.barcelona.smartCycle.domain.bikelane.BikeLaneId;
import com.barcelona.smartCycle.domain.bikelane.BikeLaneRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaBikeLaneRepository implements BikeLaneRepository {


    private final SpringDataBikeLaneRepository repository;

    public JpaBikeLaneRepository (SpringDataBikeLaneRepository repository){
        this.repository = repository;
    }
    @Override
    public void save(BikeLane bikelane) {
        repository.save(BikeLaneMapper.toEntity(bikelane));
    }

    @Override
    public Optional<BikeLane> findById(BikeLaneId id) {
        return repository.findById(id.id()).map(BikeLaneMapper::toDomain);
    }
}
