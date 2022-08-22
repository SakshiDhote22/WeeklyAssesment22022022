/*Develop an application using SpringBoot with RestFull Web Services(CRUD Operations).

 Perform Insert,delete,update,select operations and Test this application using PostMan Tool.

Hint: TableName: Customer

  columnnames: customerid,customername,customerphone,customeraddress,customerloginid,customerpassword ..etc

*/

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamSpringBootRestFull22082022Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamSpringBootRestFull22082022Application.class, args);
		System.out.println("Customer.......................");
	}

}
