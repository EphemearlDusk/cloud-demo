package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author EphemeralDusk
 * @version 1.0
 * @project cloud-demo
 * @description
 * @date 2023/8/22 22:34:08
 */
public class FeignClientConfiguration {
    @Bean
    public Logger.Level fatalLevel() {
        return Logger.Level.BASIC;
    }
}
