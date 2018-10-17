package com.yn.module.service;

import javax.annotation.Resource;
import com.yn.module.entity.SysLog;
import com.yn.module.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

@Service
public class SysLogService {

	@Resource
	private SysLogMapper sysLogMapper;

	public void insertSysLog(SysLog sysLog) {
		sysLogMapper.insert(sysLog);
	}


}
