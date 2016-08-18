package org.dubbo.service.impl;

import org.dubbo.service.TestService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by hanxy on 2016/8/12.
 * projectName : dubbo
 * description :
 */
@Service("demoService")
//@com.alibaba.dubbo.config.annotation.Service
public class TestServiceImpl implements TestService , Serializable{

    public String say(String s) throws  Exception{
        return  s+" : say  hello dubbo";
    }
}
