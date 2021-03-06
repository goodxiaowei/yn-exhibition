package com.yn.module.service;

import com.yn.common.bean.Encodes;
import com.yn.common.msg.ResultResponse;
import com.yn.common.utils.DateUtils;
import com.yn.module.entity.VisiterReg;
import com.yn.module.mapper.VisiterRegMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Random;

/**
 * @Author: xw
 * @Description:
 * @Date: 12:45 2018/10/5
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VisiterRegService {

    @Autowired
    private VisiterRegMapper visiterRegMapper;
    @Autowired
    private MailService mailService;

    public ResultResponse insertVisiterReg(VisiterReg visiterReg){
        Random random = new Random();
        byte[] randomBytes = new byte[32];
        random.nextBytes(randomBytes);
        visiterReg.setId(Encodes.encodeBase62(randomBytes));
//        byte[] randomBytes10 = new byte[9];
//        random.nextBytes(randomBytes10);
//        String num = Encodes.encodeBase10(randomBytes10);
        String num = visiterRegMapper.queryMaxNum();
        visiterReg.setNum(num);
        visiterReg.setAudit("2");
        visiterReg.setDelFlag("0");
        visiterReg.setCreateDate(DateUtils.getNow());
        if (!ObjectUtils.isEmpty(visiterReg.getLan())){
            if ("C".equals(visiterReg.getLan())){
                visiterReg.setLan("1");
            }else if ("E".equals(visiterReg.getLan())){
                visiterReg.setLan("0");
            }
        }
        Integer result = visiterRegMapper.insertVisiterReg(visiterReg);
        if (result > 0){
            mailService.sendEmail(visiterReg.getEmail(), visiterReg.getLan(), num);
            return ResultResponse.success(visiterReg);
        }else {
            return ResultResponse.fail("注册失败");
        }
    }

    public ResultResponse select(VisiterReg visiterReg){
        VisiterReg visiterReg1 = visiterRegMapper.select(visiterReg);
        return ResultResponse.success(visiterReg1);
    }
}
