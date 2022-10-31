package mao.spring_event_demo.listener;

import mao.spring_event_demo.entity.OptLogDTO;
import mao.spring_event_demo.event.SysLogEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

/**
 * Project name(项目名称)：spring_event_demo
 * Package(包名): mao.spring_event_demo.listener
 * Class(类名): SysLogListener
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/31
 * Time(创建时间)： 20:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class SysLogListener
{
    @Async
    @EventListener(SysLogListener.class)
    public void saveSysLog(SysLogEvent event)
    {
        OptLogDTO sysLog = (OptLogDTO) event.getSource();
        long id = Thread.currentThread().getId();
        System.out.println("监听到日志操作事件：" + sysLog + " 线程id：" + id);
        //将日志信息保存到数据库或者其它地方

    }
}
