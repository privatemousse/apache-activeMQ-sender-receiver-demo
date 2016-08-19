package com.qizhi.mq.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;
import com.qizhi.mq.entity.User;
import com.qizhi.mq.service.UserBusinessService;
import com.qizhi.mq.service.UserService;
import com.qizhi.mq.util.JsonMapper;
import com.zjp.mq.annotation.AMQ;
import com.zjp.mq.producer.MessageSender;

/**
 * author:zjprevenge
 * time: 2016/6/30
 * copyright all reserved
 */
@Component
public class UserBusinessServiceImpl implements UserBusinessService {

    private static final Logger log = LoggerFactory.getLogger(UserBusinessServiceImpl.class);

    @Resource(name = "messageProducer")
    private MessageSender messageSender;

    @Resource
    private UserService userService;

    @AMQ
    @Transactional
    public void sendUpdateMessage1(Integer id) {
        log.info("发送用户更新消息1..."+id);
        User user = new User();
        user.setName("axcsvd");
        user.setAge(id);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "140xxxxxxx");
        messageSender.sendMessage(map);

//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage2(Integer id) {
        log.info("发送用户更新消息2...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "141xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage3(Integer id) {
        log.info("发送用户更新消息3...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "141xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage4(Integer id) {
        log.info("发送用户更新消息4...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "142xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage5(Integer id) {
        log.info("发送用户更新消息5...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "143xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage6(Integer id) {
        log.info("发送用户更新消息6...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "144xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage7(Integer id) {
        log.info("发送用户更新消息7...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "145xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage8(Integer id) {
        log.info("发送用户更新消息8...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "146xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage9(Integer id) {
        log.info("发送用户更新消息9...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(23);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "147xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }

    @AMQ
    @Transactional
    public void sendUpdateMessage(Integer id) {
        log.info("发送用户更新消息10...");
        User user = new User();
        user.setName("axcsvd");
        user.setAge(id);
        user.setSex(0);
        user.setPhone("138xxxxxxxx");
        String json = null;
        try {
            json = JsonMapper.toJson(user);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> map = Maps.newHashMap();
        //传入发送消息的内容
        map.put("message", json);
        //如果n2设置为true，必须出入业务标识
        map.put("businessMark", "148xxxxxxx");
        messageSender.sendMessage(map);
//        int a = 1/0;
//        System.out.println(1/0);
    }
}
