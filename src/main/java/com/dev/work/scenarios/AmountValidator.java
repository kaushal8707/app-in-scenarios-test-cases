package com.dev.work.scenarios;

public interface AmountValidator extends Comparable<AmountValidator>{
    boolean validateDetails(UserDetail bankDetail);
    Integer getPriority();
    @Override
    default int compareTo(AmountValidator amountValidator){
        return this.getPriority()-amountValidator.getPriority();
    }

    FinalResult retrieveFinalResult(UserDetail userDetail);
}
