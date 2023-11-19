package com.zjw.utils;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 朱俊伟
 * @date 2022/06/12 19:30
 */
public class ServletInfo {
    /**
     * 打印HttpServletRequest对象信息
     * @param request HttpServletRequest
     */
    public static void requestInfo(HttpServletRequest request){

        System.out.println("ServletRequestInfo...requestInfo...start");

        String agent = request.getHeader("User-Agent");
        System.out.println("User-Agent:" + agent);
        //解析agent字符串
        UserAgent userAgent = UserAgent.parseUserAgentString(agent);
        //获取浏览器对象
        Browser browser = userAgent.getBrowser();
        //获取操作系统对象
        OperatingSystem operatingSystem = userAgent.getOperatingSystem();

        System.out.println("浏览器名:" + browser.getName());
        System.out.println("浏览器类型:" + browser.getBrowserType());
        System.out.println("浏览器家族:" + browser.getGroup());
        System.out.println("浏览器生产厂商:" + browser.getManufacturer());
        System.out.println("浏览器使用的渲染引擎:" + browser.getRenderingEngine());
        System.out.println("浏览器版本:" + userAgent.getBrowserVersion());
        System.out.println("操作系统名:" + operatingSystem.getName());
        System.out.println("访问设备类型:" + operatingSystem.getDeviceType());
        System.out.println("操作系统家族:" + operatingSystem.getGroup());
        System.out.println("操作系统生产厂商:" + operatingSystem.getManufacturer());

        //返回客户端发出请求时的完整URL
        String requestUri = request.getRequestURI();
        System.out.println("requestUri:" + requestUri);

        //返回请求行中的参数部分
        StringBuffer requestUrl = request.getRequestURL();
        System.out.println("requestUrl:" + requestUrl);

        //方法返回请求行中的参数部分（参数名+值）
        String queryString = request.getQueryString();
        System.out.println("queryString:" + queryString);

        //返回发出请求的客户机的完整主机名
        String remoteHost = request.getRemoteHost();
        System.out.println("remoteHost:" + remoteHost);

        //返回发出请求的客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println("remoteAddr:" + remoteAddr);

        //返回请求URL中的额外路径信息。额外路径信息是请求URL中的位于Servlet的路径之后和查询参数之前的内容，它以"/"开头
        String pathInfo = request.getPathInfo();
        System.out.println("pathInfo:" + pathInfo);

        //返回客户机所使用的网络端口号
        int remotePort = request.getRemotePort();
        System.out.println("remotePort:" + remotePort);

        //返回WEB服务器的IP地址
        String localAddr = request.getLocalAddr();
        System.out.println("localAddr:" + localAddr);

        //返回WEB服务器的主机名
        String localName = request.getLocalName();
        System.out.println("localName:" + localName);

        System.out.println("ServletRequestInfo...requestInfo...end");
    }

}
