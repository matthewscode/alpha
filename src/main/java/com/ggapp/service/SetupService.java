package com.ggapp.service;

import com.ggapp.entity.Cue;

public interface SetupService {

    boolean startChamber(long id);
    boolean sendCue(Cue cue);
}
