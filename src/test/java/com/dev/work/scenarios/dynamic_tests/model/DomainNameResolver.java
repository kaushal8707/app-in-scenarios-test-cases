package com.dev.work.scenarios.dynamic_tests.model;

import java.util.HashMap;
import java.util.Map;

public class DomainNameResolver {
    Map<String, String> domainDetails = new HashMap<>();

    public DomainNameResolver() {
        domainDetails.put("www.somedomain.com", "154.174.10.56");
        domainDetails.put("www.anotherdomain.com", "211.152.104.132");
        domainDetails.put("www.yetanotherdomain.com", "178.144.120.156");
    }

    public String resolveDomain(String domainName) {
        return domainDetails.get(domainName);
    }
}
