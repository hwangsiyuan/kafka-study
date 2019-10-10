package com.hussein.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.support.Acknowledgment;

import java.util.List;

/**
 * <p>Title: ConsumerService</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/10/9 11:03 AM
 */
public interface ConsumerService {

    void consumeMsg(ConsumerRecord<String, String> record);

    void consumeMsgBatch(List<ConsumerRecord<String, String>> recordList, Acknowledgment ack);
}
