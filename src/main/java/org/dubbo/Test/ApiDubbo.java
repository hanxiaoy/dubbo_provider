package org.dubbo.Test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import org.dubbo.service.TestService;
import org.dubbo.service.impl.TestServiceImpl;

/**
 * Created by hanxy on 2016/8/18.
 * projectName : dubbo-provider
 * modualName  :
 * description :
 */
public class ApiDubbo {
    TestService testService = new TestServiceImpl();

    public static void main(String[] args) {
        new ApiDubbo().test();
    }

    public  void test(){
//        // 当前应用配置
//        ApplicationConfig application = new ApplicationConfig();
//        application.setName("test");
//
//        // 连接注册中心配置
//        RegistryConfig registry = new RegistryConfig();
//        registry.setAddress("127.0.0.1:20880");
//        registry.setUsername("aaa");
//        registry.setPassword("bbb");
//
//        // 服务提供者协议配置
//        ProtocolConfig protocol = new ProtocolConfig();
//        protocol.setName("dubbo");
//        protocol.setPort(20880);
//        protocol.setThreads(200);
//
//        // 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口
//
//        // 服务提供者暴露服务配置
//        // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
//        ServiceConfig<TestService> serviceConfig = new ServiceConfig<TestService>();
//        serviceConfig.setApplication(application);
//        serviceConfig.setRegistry(registry);
//        serviceConfig.setProtocol(protocol);
//        serviceConfig.setInterface(TestService.class);
//        serviceConfig.setRef(testService);
//        serviceConfig.setVersion("1.0.0");
//
//        // 暴露及注册服务
//        serviceConfig.export();

    }
}
