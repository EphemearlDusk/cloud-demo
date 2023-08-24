package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author EphemeralDusk
 * @version 1.0
 * @project cloud-demo
 * @description
 * @date 2023/8/20 00:32:32
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class ConfigProperties {

    private String dateformat;

    private String envSharedValue;

    private String name;
}
