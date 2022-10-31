package mao.spring_event_demo.event;

import mao.spring_event_demo.entity.OptLogDTO;
import org.springframework.context.ApplicationEvent;

/**
 * Project name(项目名称)：spring_event_demo
 * Package(包名): mao.spring_event_demo.event
 * Class(类名): SysLogEvent
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/31
 * Time(创建时间)： 20:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class SysLogEvent extends ApplicationEvent
{
    public SysLogEvent(OptLogDTO optLogDTO)
    {
        super(optLogDTO);
    }
}
