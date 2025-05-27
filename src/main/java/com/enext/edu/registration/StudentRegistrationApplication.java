// package com.enext.edu.registration;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;


// @SpringBootApplication
// public class RegistrationApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(RegistrationApplication.class, args);
// 	}
// }

package com.enext.edu.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StudentRegistrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentRegistrationApplication.class, args);
    }
}

