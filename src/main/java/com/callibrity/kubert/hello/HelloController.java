package com.callibrity.kubert.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message.pattern:Hello, %s!}")
    private String greetingPattern;

    @Value("${HOSTNAME:NO_HOST_NAME_FOUND}")
    private String hostName;

    @GetMapping("/hello/{name}")
    public HelloResponse sayHello(@PathVariable("name") String name) {
        return HelloResponse.builder()
                .greeting(String.format(greetingPattern, name))
                .hostName(hostName)
                .build();
    }
}
