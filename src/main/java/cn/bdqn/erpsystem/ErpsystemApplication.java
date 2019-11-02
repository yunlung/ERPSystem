package cn.bdqn.erpsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.erpsystem.dao")
public class ErpsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpsystemApplication.class, args);
    }

}
