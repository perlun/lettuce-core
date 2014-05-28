package com.lambdaworks.redis;

import java.io.Closeable;
import java.util.List;

/**
 * 
 * Basic synchronous executed commands.
 * 
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 17.05.14 21:05
 */
public interface BaseRedisConnection<K, V> extends Closeable {

    Long publish(K channel, V message);

    V echo(V msg);

    String ping();

    String quit();

    void close();

    String digest(V script);

    String discard();

    List<Object> exec();

    String multi();

    String watch(K... keys);

    String unwatch();

    boolean isOpen();

}
