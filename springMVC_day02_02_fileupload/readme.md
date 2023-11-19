# 跨文件服务器上传注意点 tomcat9

异常处理——跨服务器上传 UniformInterfaceException

解决方式
> 在Tomcat目录下的conf文件夹下的web.xml中加入readonly属性为false
> 
>注意参数的顺序要一致

```xml
    <servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
            <param-value>0</param-value>
        </init-param>
        <init-param>
            <param-name>readonly</param-name>
            <param-value>false</param-value>
        </init-param>
        <init-param>
            <param-name>listings</param-name>
            <param-value>false</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
```