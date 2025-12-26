package com.dev.work.scenarios.dynamic_tests;

import com.dev.work.scenarios.dynamic_tests.model.DomainNameResolver;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTestUsingJava8 {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

        DomainNameResolver resolver = new DomainNameResolver();
        List<String> domainNames = Arrays.asList(
                "www.somedomain.com", "www.anotherdomain.com", "www.yetanotherdomain.com");
        List<String> outputList = Arrays.asList(
                "154.174.10.56", "211.152.104.132", "178.144.120.156");
        return domainNames.stream()
                .map(dom -> DynamicTest.dynamicTest("Resolving: " + dom,
                        () -> {int id = domainNames.indexOf(dom);

                            assertEquals(outputList.get(id), resolver.resolveDomain(dom));
                        }));
    }
}
