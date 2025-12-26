package com.dev.work.scenarios;
import org.springframework.stereotype.Component;

@Component
public class ProcessEvent {
    void processEvent(UserDetail userDetail, String eventChannel) {
        FinalResult result = FinalResult.builder()
                .bankName("XYZ")
                .approvalStatus(true)
                .customerName("ABC")
                .build();
    }
}
