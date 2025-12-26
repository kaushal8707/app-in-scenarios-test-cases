package com.dev.work.scenarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.Set;
import java.util.TreeSet;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ValidatorServiceTest {
    @InjectMocks
    ValidatorService validatorService;
    Set<AmountValidator> amountValidators = new TreeSet<>();
    @Mock
    AmountValidator amountValidator;
    @Mock
    HdfcAmountValidator hdfcAmountValidator;
    @Mock
    IcIcIAmountValidator icIcIAmountValidator;
    @Mock
    AxisAmountValidator axisAmountValidator;

    @BeforeEach
    void init(){
        amountValidators.add(axisAmountValidator);
        amountValidators.add(icIcIAmountValidator);
        amountValidators.add(hdfcAmountValidator);
        ReflectionTestUtils.setField(validatorService, "amountValidators", amountValidators);
    }

    @Test
    void test_validate_amount_13000(){
        UserDetail user_detail = UserDetail.builder()
                .salary(13000)
                .userName("c101")
                .address("usa")
                .build();
        when(hdfcAmountValidator.validateDetails(any())).thenReturn(true);
        when(hdfcAmountValidator.retrieveFinalResult(any())).thenReturn(FinalResult.builder().build());

        FinalResult finalResult = validatorService.validate(user_detail);

        Assertions.assertNotNull(finalResult);
        verify(hdfcAmountValidator, times(1)).validateDetails(any());
        verify(hdfcAmountValidator, times(0)).getPriority();
        verify(hdfcAmountValidator, times(1)).retrieveFinalResult(any());
    }
}
