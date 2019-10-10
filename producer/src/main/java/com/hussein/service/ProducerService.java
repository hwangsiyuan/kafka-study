package com.hussein.service;

/**
 * <p>Title: ProducerService</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/10/9 10:56 AM
 */
public interface ProducerService {

    void sendMsg(String msg);

    void sendMsgWithTrans(String msg);
}
