package com.dev.work.scenarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class KpiProcessingTest {

    @InjectMocks
    KpiProcessing kpiProcessing;
    @Mock
    ProcessEvent processEvent;
    @Captor
    ArgumentCaptor<UserDetail> userDetailArgumentCaptor;
    @Captor
    ArgumentCaptor<String> eventChannelArgumentCaptor;

    @Test
    void test_event_processing(){
        kpiProcessing.execute();
        verify(processEvent).processEvent(userDetailArgumentCaptor.capture(), eventChannelArgumentCaptor.capture());
        UserDetail userDetail = userDetailArgumentCaptor.getValue();
        String channel = eventChannelArgumentCaptor.getValue();
        Assertions.assertNotNull(userDetail);
        Assertions.assertNotNull(channel);
        Assertions.assertEquals(ChannelType.kpi.name(), channel);
        Assertions.assertEquals(17901, userDetail.salary);
        Assertions.assertEquals("bangalore", userDetail.address);
    }
}
