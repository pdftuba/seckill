package org.seckill.exception;

/**
 * @description:重复秒杀异常（运行异常）
 * @author: Pandf
 * @date: 2018-05-08 0:32
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
