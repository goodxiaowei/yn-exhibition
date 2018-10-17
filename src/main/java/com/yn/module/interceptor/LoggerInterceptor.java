package com.yn.module.interceptor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import java.util.Random;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yn.common.bean.Encodes;
import com.yn.common.utils.TitleUtils;
import com.yn.module.entity.SysLog;
import com.yn.module.service.SysLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 日志管理拦截器
 * @ClassName: LoggerInterceptor.java 
 * @Description: LoggerInterceptor.java
 * @author: xw
 * @date: 2018年5月2日下午6:25:11
 */
public class LoggerInterceptor implements HandlerInterceptor {
	Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);

	private final String SYS_LOG = "SYS_LOG";

	@Resource
	private SysLogService sysLogService;
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        return true;// 只有返回true才会继续向下执行，返回false取消当前请求 
    }  
  
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
		Map<String, String[]> parameterMap = request.getParameterMap();
    }
  
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  
            throws Exception {
		SysLog sysLog = new SysLog();
		String ip = request.getHeader("x-forwarded-for");
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
			ip = request.getHeader("Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
			ip = request.getRemoteAddr();
		}
		String uri = request.getRequestURI();
		sysLog.setRequestUri(uri);
		String paramData = JSON.toJSONString(request.getParameterMap());
		sysLog.setParams(paramData);
		sysLog.setRemoteAddr(ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip);
		sysLog.setMethod(request.getMethod());
		sysLog.setCreateDate(new Date());
		sysLog.setUserAgent(request.getHeader("user-agent"));
		sysLog.setCreateBy("2");
		sysLog.setType("2");
		Random random = new Random();
		byte[] randomBytes = new byte[32];
		random.nextBytes(randomBytes);
		sysLog.setId(Encodes.encodeBase62(randomBytes));
		sysLog.setTitle(TitleUtils.getTitle(uri));
		if(ex != null){
			sysLog.setException(ex.getMessage());
		}
		sysLogService.insertSysLog(sysLog);
    }  
  
}