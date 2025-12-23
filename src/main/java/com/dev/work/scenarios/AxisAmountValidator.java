package com.dev.work.scenarios;

public class AxisAmountValidator implements AmountValidator {

    @Override
    public boolean validateDetails(UserDetail userDetail) {
        if(userDetail.salary > 10000 && userDetail.salary < 15000){
            return true;
        }
        return false;
    }

    @Override
    public Integer getPriority() {
        return 6;
    }

    @Override
    public FinalResult retrieveFinalResult(UserDetail userDetail) {
        return FinalResult.builder()
                .customerName(userDetail.userName)
                .bankName("AXIS")
                .approvalStatus(validateDetails(userDetail))
                .build();
    }
}
