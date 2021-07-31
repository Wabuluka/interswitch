package com.dev.interswitch.leave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LeaveRepository
        extends JpaRepository<Leave, Long> {

    // @Query("SELECT s FROM Leave s WHERE s.user = ?1")
    Optional<Leave> findLeaveByUser(Long user);
}
