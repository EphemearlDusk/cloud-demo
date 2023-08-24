package cn.itcast.feign.clients;


import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author EphemeralDusk
 * @version 1.0
 * @project cloud-demo
 * @description userservice的远程调用
 * @date 2023/8/22 21:41:16
 */
@FeignClient("userservice")
public interface UserClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable Long id);
}
