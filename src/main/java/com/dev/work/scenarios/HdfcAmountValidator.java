package com.dev.work.scenarios;

public class HdfcAmountValidator implements AmountValidator {
    @Override
    public boolean validateDetails(UserDetail userDetail) {
        if(userDetail.salary > 15000 && userDetail.salary < 20000){
            return true;
        }
        return false;
    }

    @Override
    public Integer getPriority() {
        return 5;
    }

    @Override
    public FinalResult retrieveFinalResult(UserDetail userDetail) {
        return FinalResult.builder()
                .customerName(userDetail.userName)
                .bankName("Hdfc")
                .approvalStatus(validateDetails(userDetail))
                .build();
    }
}
