package com.callibrity.kubert.hello;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class HelloResponse {
    String greeting;
    String hostName;
}
