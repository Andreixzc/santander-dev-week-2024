package me.dio.sdw24.Domain.Ports;

import java.util.List;
import java.util.Optional;

import me.dio.sdw24.Domain.Model.Champions;

public interface ChampionsRepository {
    List<Champions> findAll();
    Optional<Champions> findById(long id);
}
