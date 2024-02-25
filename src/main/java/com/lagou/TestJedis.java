package com.lagou;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2024/2/24
 */
public class TestJedis {

    public static void main(String[] args) {
        JedisShardInfo shardInfo = new JedisShardInfo("redis://47.103.155.255:6379/0");
        shardInfo.setPassword("123");//这里是密码
        Jedis jedis = new Jedis(shardInfo);
        jedis.set("name", "Jack");
        System.out.println(jedis.get("name"));
        jedis.lpush("list", "1", "2", "3", "4", "5");
        System.out.println(jedis.llen("list"));
    }
}
