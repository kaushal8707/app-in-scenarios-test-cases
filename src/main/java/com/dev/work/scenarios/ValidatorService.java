package com.dev.work.scenarios;

import java.util.Set;
import java.util.TreeSet;

public class ValidatorService {
    static Set<AmountValidator> amountValidators;
    static boolean validateDetails;
    ValidatorService(){
        amountValidators = new TreeSet<>();
        amountValidators.add(new AxisAmountValidator());
        amountValidators.add(new HdfcAmountValidator());
        amountValidators.add(new IcIcIAmountValidator());
    }

    public FinalResult validate(UserDetail userDetail){
        return validateFinalResult(userDetail);
    }

    FinalResult validateFinalResult(UserDetail userDetail){
        for(AmountValidator amountValidator : amountValidators){
            validateDetails = amountValidator.validateDetails(userDetail);
           if(validateDetails){
                return amountValidator.retrieveFinalResult(userDetail);
           }
        }
        return null;
    }
}
