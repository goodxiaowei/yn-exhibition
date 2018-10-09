package com.yn.test;

import com.yn.common.bean.Encodes;
import com.yn.module.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.UnsupportedEncodingException;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ExhibitionTest {

    private  final Logger logger = LoggerFactory.getLogger(getClass());

    private final String SMTP_HOST = "smtp.mxhichina.com";
    private final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    @Autowired
    private JavaMailSenderImpl mailSender;
    @Autowired
    private TemplateEngine templateEngine;
    @Autowired
    private MailService mailService;

    @Test
    public void testInfo(){
        System.out.println("========start===");
        System.out.println("========end=====");
    }

    @Test
    public void randomBase62()
    {
        Random random = new Random();
        byte[] randomBytes = new byte[32];
        random.nextBytes(randomBytes);
        System.out.print("生成" + Encodes.encodeBase62(randomBytes));
    }

    @Test
    public void testNum(){
        Random random = new Random();
        byte[] randomBytes = new byte[9];
        random.nextBytes(randomBytes);
        System.out.print("生成" + Encodes.encodeBase10(randomBytes));
    }

    @Test
    public void testMail(){
//        Boolean flag = mailService.sendEmail("871308180@qq.com", "en", "18746454569");
//        logger.debug("结果-------" + flag.toString());
    }
}
