package org.seckill.service;

//业务接口：站在“使用者”角度设计接口
//三个方面：方法定义粒度，参数，返回类型（return 类型/异常）

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;
import org.seckill.entity.Seckill;

import java.util.List;

public interface SeckillService {
    /*
        查询所有秒杀记录
     * @author Pandf
     * @date 2018/5/8 0:07
     * @param null:
     * @return
     */
    List<Seckill> getSeckillList();

    /*
         查询单个秒杀记录
     * @author Pandf
     * @date 2018/5/8 0:09
     * @param seckillId:
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启时，输出秒杀接口的地址，
     * 否则输出系统时间和秒杀时间
     *
     * @param seckillId:
     * @return
     * @author Pandf
     * @date 2018/5/8 0:11
     */

    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @author Pandf
     * @date 2018/5/8 0:26
     * @param null:
     * @return
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException,RepeatKillException,SeckillCloseException;
}
