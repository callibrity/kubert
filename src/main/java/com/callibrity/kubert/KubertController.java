package com.callibrity.kubert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubertController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return String.format("Hello, %s!", name);
    }

    @PostMapping("/kill")
    public void kill() {
        System.exit(99);
    }
}
