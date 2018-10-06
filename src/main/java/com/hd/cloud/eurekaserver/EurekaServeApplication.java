package com.hd.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
  * @ClassName: EurekaServeApplication
  * @Description: Eureka Server中心
  * @author ShengHao shenghaohao@hadoop-tech.com
  * @Company hadoop-tech 
  * @date 2017年11月20日 上午11:21:46
  *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServeApplication    {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServeApplication .class, args);
    }
}
