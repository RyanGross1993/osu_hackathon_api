package com.osu.hackathonapi.repository;

import com.osu.hackathonapi.model.Hackathon;
import org.springframework.data.repository.CrudRepository;

public interface HackathonRepository extends CrudRepository<Long, Hackathon> {}
