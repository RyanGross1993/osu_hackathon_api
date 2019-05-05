package com.osu.hackathonapi.repository;

import com.osu.hackathonapi.model.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface HackathonRepository extends JpaRepository<Hackathon, Long> {

  //  Checks if hackathons exist b/w two dates: prevents double-booking.
  //  Requires a custom query
  List<Hackathon> findAllByStartDateGreaterThanEqualAndEndDateLessThanEqual(
      OffsetDateTime startDate, OffsetDateTime endDate);

  // Gets hackathons that already occurred.
  @Query(value = "select * from hackathon where start_date > :{date}", nativeQuery = true)
  List<Hackathon> getPreviousHackathons(OffsetDateTime date);

  @Query(value = "select * from hackathon", nativeQuery = true)
  List<Hackathon> getAll();

  // Gets all upcoming events.
  List<Hackathon> findAllByStartDateGreaterThan(OffsetDateTime startDate);
}
