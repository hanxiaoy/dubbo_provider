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
//        // ��ǰӦ������
//        ApplicationConfig application = new ApplicationConfig();
//        application.setName("test");
//
//        // ����ע����������
//        RegistryConfig registry = new RegistryConfig();
//        registry.setAddress("127.0.0.1:20880");
//        registry.setUsername("aaa");
//        registry.setPassword("bbb");
//
//        // �����ṩ��Э������
//        ProtocolConfig protocol = new ProtocolConfig();
//        protocol.setName("dubbo");
//        protocol.setPort(20880);
//        protocol.setThreads(200);
//
//        // ע�⣺ServiceConfigΪ�ض����ڲ���װ����ע�����ĵ����ӣ��Լ���������˿�
//
//        // �����ṩ�߱�¶��������
//        // ��ʵ�����أ���װ����ע�����ĵ����ӣ������л��棬�����������ڴ������й©
//        ServiceConfig<TestService> serviceConfig = new ServiceConfig<TestService>();
//        serviceConfig.setApplication(application);
//        serviceConfig.setRegistry(registry);
//        serviceConfig.setProtocol(protocol);
//        serviceConfig.setInterface(TestService.class);
//        serviceConfig.setRef(testService);
//        serviceConfig.setVersion("1.0.0");
//
//        // ��¶��ע�����
//        serviceConfig.export();

    }
}
