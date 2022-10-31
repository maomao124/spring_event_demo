package mao.spring_event_demo.controller;

import mao.spring_event_demo.entity.OptLogDTO;
import mao.spring_event_demo.event.SysLogEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：spring_event_demo
 * Package(包名): mao.spring_event_demo.controller
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/31
 * Time(创建时间)： 20:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private ApplicationContext applicationContext;

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/getUser")
    public String getUser()
    {
        //构造操作日志信息
        OptLogDTO logInfo = new OptLogDTO();
        logInfo.setRequestIp("127.0.0.1");
        logInfo.setUserName("admin");
        logInfo.setType("OPT");
        logInfo.setDescription("查询用户信息");

        //构造事件对象
        ApplicationEvent event = new SysLogEvent(logInfo);

        //发布事件
        applicationContext.publishEvent(event);

        long id = Thread.currentThread().getId();
        log.info("发布事件,线程id：" + id);
        return "OK";
    }
}
