package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*配置spring和junit整合，junit启动时加载springIOC容器
  spring-test,junit

 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDAOTest {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() {
        long id =1000;
         Seckill seckill= seckillDao.queryById(id);
         System.out.println(seckill.getName());
         System.out.println(seckill);
    }


    //java没有保存形参的记录：queryAll(int offet, int limit)->queryAll(arg0,arg1)
    @Test
    public void queryAll() {
        List<Seckill> seckills= seckillDao.queryAll(0,100);
        for(Seckill seckill:seckills)
        {
            System.out.println(seckill);
        }
    }

    @Test
    public void reduceNumber() {

        Date killtime =new Date();
        int updateCount=seckillDao.reduceNumber(1000L,killtime);
        System.out.println("updateCount:"+updateCount);
    }




}