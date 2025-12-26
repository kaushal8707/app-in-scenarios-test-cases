package com.dev.work.scenarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KpiProcessing {
    @Autowired
    ProcessEvent processEvent;

    public void execute(){
        UserDetail userDetail = UserDetail.builder()
                .userName("user-1")
                .address("bangalore")
                .salary(17901)
                .build();
        processEvent.processEvent(userDetail, "kpi");
    }
}
