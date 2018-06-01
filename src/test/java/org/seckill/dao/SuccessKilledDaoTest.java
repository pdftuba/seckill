package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/*配置spring和junit整合，junit启动时加载springIOC容器
  spring-test,junit

 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {


    //注入Dao实现类依赖
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void inserSuccessKilled() {
        //不允许重复
        //联合主键
        int inserCount=successKilledDao.inserSuccessKilled(1000L,13123165222L);
        System.out.println("inserCount="+inserCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(1000L,13123165222L);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}