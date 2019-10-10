package com.hussein.service.impl;

import com.hussein.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.IntStream;

/**
 * <p>Title: ProducerServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/10/9 10:57 AM
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Transactional(rollbackFor = Exception.class, transactionManager = "kafkaTransactionManager")
    @Override
    public void sendMsg(String msg) {
        kafkaTemplate.send("test-topic", "hello " + msg);
    }

    @Transactional(rollbackFor = Exception.class, transactionManager = "kafkaTransactionManager")
    @Override
    public void sendMsgWithTrans(String msg) {
        kafkaTemplate.send("test-topic-trans", "hello " + msg);
        throw new RuntimeException();
    }

    @Transactional(rollbackFor = Exception.class, transactionManager = "kafkaTransactionManager")
    @Override
    public void batchSendMsg(String msg) {
        IntStream.range(1, 10).forEach(i -> kafkaTemplate.send("test-topic-batch", "hello " + msg + "-" + i));
    }
}
