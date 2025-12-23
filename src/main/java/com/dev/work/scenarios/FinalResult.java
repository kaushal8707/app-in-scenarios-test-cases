package com.dev.work.scenarios;

import lombok.*;

@Builder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class FinalResult {
    String customerName;
    String bankName;
    boolean approvalStatus;
}
