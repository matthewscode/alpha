package com.ggapp.service;

import com.ggapp.entity.Cue;
import com.ggapp.thread.ChamberThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SetupServiceImpl implements SetupService{

    @Autowired
    private SimpMessagingTemplate template;
    @Autowired
    private ChamberService chamberService;

    @Override
    @Transactional
    public boolean startChamber(long id) {
        List<Cue> cueList = chamberService.getChamber(id).getCueList();
        ChamberThread newThread = new ChamberThread(cueList, this);
        new Thread(newThread).start();
        return true;
    }

    public boolean sendCue(Cue cue){
        this.template.convertAndSend("/running", cue);
        return true;
    }
}
