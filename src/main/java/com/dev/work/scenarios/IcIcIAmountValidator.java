package com.dev.work.scenarios;

public class IcIcIAmountValidator implements AmountValidator {
    @Override
    public boolean validateDetails(UserDetail userDetail) {
        if(userDetail.salary > 5000 && userDetail.salary < 10000){
            return true;
        }
        return false;
    }

    @Override
    public Integer getPriority() {
        return 7;
    }

    @Override
    public FinalResult retrieveFinalResult(UserDetail userDetail) {
        return FinalResult.builder()
                .customerName(userDetail.userName)
                .bankName("IcIcI")
                .approvalStatus(validateDetails(userDetail))
                .build();
    }
}
