package com.osu.hackathonapi.repository;

import com.osu.hackathonapi.model.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HackathonRepository extends JpaRepository<Hackathon, Long> {
  public List<Hackathon> findAllByStartDateGreaterThanEqualAndEndDateLessThanEqual(
      Date startDate, Date endDate);
}
