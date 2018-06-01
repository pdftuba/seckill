package org.seckill.exception;

/**
 * @description:秒杀相关业务异常
 * @author: Pandf
 * @date: 2018-05-08 0:36
 */
public class SeckillException  extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
