package mao.spring_event_demo.entity;

/**
 * Project name(项目名称)：spring_event_demo
 * Package(包名): mao.spring_event_demo.entity
 * Class(类名): OptLogDTO
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/31
 * Time(创建时间)： 20:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class OptLogDTO
{
    /**
     * 操作IP
     */
    private String requestIp;

    /**
     * 日志类型 LogType{OPT:操作类型;EX:异常类型}
     */
    private String type;

    /**
     * 操作人
     */
    private String userName;

    /**
     * 操作描述
     */
    private String description;

    /**
     * Instantiates a new Opt log dto.
     */
    public OptLogDTO()
    {

    }

    /**
     * Instantiates a new Opt log dto.
     *
     * @param requestIp   the request ip
     * @param type        the type
     * @param userName    the user name
     * @param description the description
     */
    public OptLogDTO(String requestIp, String type, String userName, String description)
    {
        this.requestIp = requestIp;
        this.type = type;
        this.userName = userName;
        this.description = description;
    }

    /**
     * Gets request ip.
     *
     * @return the request ip
     */
    public String getRequestIp()
    {
        return requestIp;
    }

    /**
     * Sets request ip.
     *
     * @param requestIp the request ip
     */
    public void setRequestIp(String requestIp)
    {
        this.requestIp = requestIp;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        OptLogDTO optLogDTO = (OptLogDTO) o;

        if (getRequestIp() != null ? !getRequestIp().equals(optLogDTO.getRequestIp()) : optLogDTO.getRequestIp() != null)
        {
            return false;
        }
        if (getType() != null ? !getType().equals(optLogDTO.getType()) : optLogDTO.getType() != null)
        {
            return false;
        }
        if (getUserName() != null ? !getUserName().equals(optLogDTO.getUserName()) : optLogDTO.getUserName() != null)
        {
            return false;
        }
        return getDescription() != null ? getDescription().equals(optLogDTO.getDescription()) : optLogDTO.getDescription() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getRequestIp() != null ? getRequestIp().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        final StringBuffer stringBuffer = new StringBuffer("OptLogDTO{");
        stringBuffer.append("requestIp='").append(requestIp).append('\'');
        stringBuffer.append(", type='").append(type).append('\'');
        stringBuffer.append(", userName='").append(userName).append('\'');
        stringBuffer.append(", description='").append(description).append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
