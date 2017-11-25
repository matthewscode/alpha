package com.ggapp.dao;

import com.ggapp.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matthew on 11/18/2017.
 */
@Repository
public interface MarkDao extends JpaRepository<Mark, Long> {
}
