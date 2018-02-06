package com.ggapp.dao;

import com.ggapp.entity.Chamber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matthew on 11/18/2017.
 */
@Repository
public interface ChamberDao extends JpaRepository<Chamber, Long> {
}
