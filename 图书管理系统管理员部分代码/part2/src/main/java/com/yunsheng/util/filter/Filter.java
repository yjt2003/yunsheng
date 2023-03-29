package com.yunsheng.util.filter;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Filter implements javax.servlet.Filter {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        // 不使用*，自动适配跨域域名，避免携带Cookie时失效
        String origin = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", origin);
        // 自适应所有自定义头
        String headers = request.getHeader("Access-Control-Request-Headers");
        response.setHeader("Access-Control-Allow-Headers", headers);
        response.setHeader("Access-Control-Expose-Headers", headers);
        // 允许跨域的请求方法类型
        response.setHeader("Access-Control-Allow-Methods", "*");
        // 预检命令（OPTIONS）缓存时间，单位：秒
        response.setHeader("Access-Control-Max-Age", "3600");
        // 明确许可客户端发送Cookie，不允许删除字段即可
        response.setHeader("Access-Control-Allow-Credentials", "true");
        //参数 request, response 为web 容器或 Filter 链的上一个 Filter 传递过来的请求和相应对象；参数 chain 代表当前 Filter 链的对象。
       // 交给下一个过滤器或servlet处理
        chain.doFilter(request, response);
        //添加一个给后台的反馈
        System.out.println("过滤器已执行");

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }
}
