package com.ggapp.dao;

import com.ggapp.entity.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matthew on 11/18/2017.
 */
@Repository
public interface MasterDao extends JpaRepository<Master, Long> {
}
