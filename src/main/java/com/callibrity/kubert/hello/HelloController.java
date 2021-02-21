package com.callibrity.kubert.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message.pattern:Hello, %s!}")
    private String greetingPattern;

    @GetMapping("/hello/{name}")
    public HelloResponse sayHello(@PathVariable("name") String name) {
        return new HelloResponse(String.format(greetingPattern, name));
    }
}
