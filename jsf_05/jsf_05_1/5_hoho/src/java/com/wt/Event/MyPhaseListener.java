package com.wt.Event;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener{

    @Override
    public void afterPhase(PhaseEvent event) {
        PhaseId id = event.getPhaseId();
        System.out.println("PhaseEvent occurred afterPhase" + 
                            ", id = " + id);
    }   

    @Override
    public void beforePhase(PhaseEvent event) {
        PhaseId id = event.getPhaseId();
        System.out.println("PhaseEvent occurred beforePhase" + 
                            ", id = " + id);
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
