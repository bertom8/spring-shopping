package com.bereczki.work.spring.service;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Value("${mail.from}")
    private String fromAddress;

    @Value("${mail.to.test}")
    private String testAddress;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private VelocityEngine velocityEngine;

    private MimeMessage createConfirmationMessage() throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();

        // TODO: implement the email sending with velocity template

        return message;
    }
}
