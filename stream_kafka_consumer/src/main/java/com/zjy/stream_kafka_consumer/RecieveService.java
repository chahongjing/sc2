package com.zjy.stream_kafka_consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * TODO
 */
@EnableBinding(Sink.class)
public class RecieveService {

    @StreamListener(Sink.INPUT)
    public void recieve(Object payload) {
        System.out.println(payload);
    }
}