package com.athensoft.i18n.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath*:/spring/application_spring_mvc.xml"})  

// ���ע��@Transactional �ع������ݿ����    
@Transactional  
public class BaseSpringTestCase {


}
