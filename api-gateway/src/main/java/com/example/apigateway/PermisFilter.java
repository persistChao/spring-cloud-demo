package com.example.apigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author answer
 * @description
 * @create 2018/1/18 16:58
 **/

public class PermisFilter extends ZuulFilter{

    private static final Logger log = LoggerFactory.getLogger(PermisFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("This is a per filter ,it will throw a RuntimeException");
        doSomting();
        return null;
    }

    private void doSomting(){
        throw new RuntimeException("Exits some errors...");
    }

//    @Override
//    public Object run() {
//
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        String login = request.getParameter("login");
//        if (login == null) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            ctx.addZuulResponseHeader("content-type","text/html;charset=utf-8");
//            ctx.setResponseBody("非法访问");
//        }
//        return null;
//    }
}
