package com.ms_paractica1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MsParactica1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsParactica1Application.class, args);
	}

}
