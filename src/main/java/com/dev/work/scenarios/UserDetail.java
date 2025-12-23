package com.dev.work.scenarios;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDetail {
    String userName;
    int salary;
    String address;
}
