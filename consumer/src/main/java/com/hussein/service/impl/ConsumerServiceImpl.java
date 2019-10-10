package com.hussein.service.impl;

import com.hussein.service.ConsumerService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

/**
 * <p>Title: ConsumerServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/10/9 11:03 AM
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void consumeMsg(ConsumerRecord<String, String> record) {
        System.out.println(record);
    }
}
