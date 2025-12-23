package com.dev.work.scenarios;

public class MainApp {
    public static void main(String[] args) {
        ValidatorService app = new ValidatorService();
        UserDetail userDetail = UserDetail.builder()
                .userName("user-1")
                .address("bangalore")
                .salary(17901)
                .build();
        FinalResult finalResult = app.validate(userDetail);

        new KpiProcessing().execute();
        System.out.println("Final Result : " +finalResult);
    }
}
