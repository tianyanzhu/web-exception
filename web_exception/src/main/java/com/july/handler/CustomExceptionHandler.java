package com.july.handler;

import com.july.enums.AjaxStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 方式二
 * Created by Administrator on 2017/11/1.
 * 统一对异常进行处理，对未处理的错误进行统一返回错误信息（而不是返回500错误）
 * 统一返回json
 * @author  zy
 */
/*public class CustomExceptionHandler implements HandlerExceptionResolver {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.warn("<<<webapp系统发生异常>>>",ex);
        return isAjaxRequest(request) ? createRestException(request, response, ex) : null;
    }
    *//**
     * 判断是否是ajax请求
     * @param request
     * @return
     *//*
    private boolean isAjaxRequest(HttpServletRequest request) {
        return request.getHeader("accept").contains("application/json")
                || (request.getHeader("X-Requested-With") != null
                && request.getHeader("X-Requested-With").contains("XMLHttpRequest"));
    }

    private ModelAndView createRestException(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
        modelAndView.addAllObjects(generateJsonResult(exception));
        return modelAndView;
    }

    protected Map<String, Object> generateJsonResult(Exception exception) {
        final Map<String, Object> result = new HashMap<String, Object>(3);
        result.put("status", AjaxStatus.ERROR);
        result.put("resultstr", "访问服务器发生异常");
        result.put("bean", exception.getClass().getName());
        return result;
    }
}*/
