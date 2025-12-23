package com.dev.work.scenarios;

public class ProcessEvent {
    void processEvent(UserDetail userDetail, String eventChannel) {
        FinalResult result = FinalResult.builder()
                .bankName("XYZ")
                .approvalStatus(true)
                .customerName("ABC")
                .build();
    }
}
