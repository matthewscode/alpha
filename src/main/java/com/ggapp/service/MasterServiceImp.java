package com.ggapp.service;

import com.ggapp.dao.MasterDao;
import com.ggapp.entity.Master;
import com.ggapp.utility.TimeUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matthew on 11/18/2017.
 */
@Service
public class MasterServiceImp implements MasterService {

    @Autowired
    private MasterDao masterDao;

    @Override
    public List<Master> getMasters() {
        return masterDao.findAll();
    }

    @Override
    public Master addMaster(Master master) {

        master.setTimestamp(TimeUtility.generateTimeStamp());

        try{
            return masterDao.save(master);
        } catch (Exception e) {
            System.out.println(e);
            return new Master();
        }

    }
}
