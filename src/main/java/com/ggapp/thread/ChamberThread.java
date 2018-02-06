package com.ggapp.thread;

import com.ggapp.entity.Cue;
import com.ggapp.service.SetupService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ChamberThread implements Runnable {
    private SetupService setupService;

    public ChamberThread(SetupService setupService) {
        this.setupService = setupService;
    }

    private List<Cue> cueList ;
    private Random rand;
    private Cue currentCue;
    public ChamberThread(List<Cue> cueList, SetupService setupService){
        this.cueList      = cueList;
        this.rand         = new Random();
        this.setupService = setupService;
    }

    public ChamberThread(){}

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep( 20000 );
                int index = rand.nextInt(cueList.size());
                System.out.println("WE'RE RUNNING - index  IS " + index);
                currentCue = cueList.get(index);
                setupService.sendCue(currentCue);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}
