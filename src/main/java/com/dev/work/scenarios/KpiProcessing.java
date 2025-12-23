package com.dev.work.scenarios;

public class KpiProcessing {
    ProcessEvent processEvent;
    void execute(){
        UserDetail userDetail = UserDetail.builder()
                .userName("user-1")
                .address("bangalore")
                .salary(17901)
                .build();
        processEvent.processEvent(userDetail, "kpi");
    }
}
