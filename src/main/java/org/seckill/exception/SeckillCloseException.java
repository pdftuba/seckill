package org.seckill.exception;

/**
 * @description:秒杀关闭
 * @author: Pandf
 * @date: 2018-05-08 0:34
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
