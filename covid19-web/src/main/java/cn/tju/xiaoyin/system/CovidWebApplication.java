package cn.tju.xiaoyin.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-04 17:54
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("cn.tju.xiaoyin.system.mapper")
public class CovidWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidWebApplication.class,args);
    }
}
