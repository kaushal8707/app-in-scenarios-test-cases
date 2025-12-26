package com.dev;
import com.dev.work.scenarios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp implements CommandLineRunner{
    @Autowired
    KpiProcessing kpiProcessing;
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ValidatorService app = new ValidatorService();
        UserDetail userDetail = UserDetail.builder()
                .userName("user-1")
                .address("bangalore")
                .salary(17901)
                .build();
        FinalResult finalResult = app.validate(userDetail);
        kpiProcessing.execute();
        System.out.println("Final Result : " +finalResult);
    }
}
