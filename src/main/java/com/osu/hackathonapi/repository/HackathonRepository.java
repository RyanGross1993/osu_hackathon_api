package com.osu.hackathonapi.repository;

import com.osu.hackathonapi.model.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HackathonRepository extends JpaRepository<Hackathon, Long> {

    public Hackathon findById(int id);

}
