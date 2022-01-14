package com.abiao.template.interceptor;


import com.abiao.template.util.ServletUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class MetricInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 记录请求开始时间
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        // 请求结束时间
        Long endTime = System.currentTimeMillis();
        // 从HttpServletRequest获取开始时间
        Long startTime = (Long) request.getAttribute("startTime");
        // 打印接口信息及耗时
        log.info("ip:{} url:{} parameter:{};耗时：{}ms", ServletUtil.getIpAddr(request),
                request.getRequestURL(), JSONObject.toJSON(request.getParameterMap()), endTime - startTime);
    }
}
