package Epicode.designPatterns;

import Epicode.designPatterns.adapter.AdattatoreInfo;
import Epicode.designPatterns.adapter.DataSource;
import Epicode.designPatterns.adapter.Info;
import Epicode.designPatterns.adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		System.out.println("ESERCIZIO 1-----------------------");

		Info info=new Info("Claudia","Perugini", LocalDate.of(1995,9,1));
	    DataSource adattatoreInfo=new AdattatoreInfo(info);
		UserData userData=new UserData("Eddy Turpo",34);
		userData.getData(adattatoreInfo);
		System.out.println(userData);
	}

}
