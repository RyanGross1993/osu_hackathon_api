package com.osu.hackathonapi.repository;

import com.osu.hackathonapi.model.Hackathon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HackathonRepository extends CrudRepository<Hackathon, Long> {}
