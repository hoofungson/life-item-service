package cn.hoofungson.life.item.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class LifeItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeItemServiceApplication.class, args);
        log.info("========== LifeItemServiceApplication启动成功 ============");
    }

}
