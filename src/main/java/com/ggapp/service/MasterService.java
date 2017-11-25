package com.ggapp.service;

import com.ggapp.entity.Master;

import java.util.List;

/**
 * Created by Matthew on 11/18/2017.
 */
public interface MasterService {
    // GETS
    List<Master> getMasters();

    // POSTS
    Master addMaster(Master master);
}
