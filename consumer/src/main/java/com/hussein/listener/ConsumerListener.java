package com.hussein.listener;

import com.hussein.service.ConsumerService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * <p>Title: ConsumerListener</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/10/9 11:00 AM
 */
@Component
public class ConsumerListener {

    @Autowired
    private ConsumerService consumerService;

    @KafkaListener(topics = "test-topic", groupId = "test001")
    public void consumeMsg(ConsumerRecord<String, String> record) {
        consumerService.consumeMsg(record);
    }

    @KafkaListener(topics = "test-topic-trans", groupId = "test001")
    public void consumeMsgWithTrans(ConsumerRecord<String, String> record) {
        consumerService.consumeMsg(record);
    }
}
