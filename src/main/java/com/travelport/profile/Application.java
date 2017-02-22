
package com.travelport.profile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	CommandLineRunner initData(TravelerRepository travelerRepository) {
//		return args -> {
//			//System.out.println("Creating new traveler");
//			//travelerRepository.save(new Traveler("Bill", "Smith"));
//			//travelerRepository.save(new Traveler("Robin", "Smith"));
//			
//			importDataFromDB2(travelerRepository);
//			
//		};
//	}
//
//	private void importDataFromDB2(TravelerRepository travelerRepository) {
//		try
//		{
//			System.out.println("Preparing to open DataBase");
//			String dbURL="jdbc:db2://vhligesdb604.tvlport.net:51060/POLSVI1";
//			String dbDriver = "com.ibm.db2.jcc.DB2Driver";
//			System.out.println("dbURL is : "+dbURL);
//			
//			Class.forName(dbDriver);    
//
//			System.out.println("Loaded the instantDB JDBC driver.");
//
//			Connection conn = DriverManager.getConnection(dbURL, "polsvusr", "g0rmst3r");
//			
//			System.out.println("Created and connected to database");
//			System.out.println("Database opened");
//			Statement lsStmt=conn.createStatement();
//			ResultSet rs = lsStmt.executeQuery("SELECT * FROM MMGR.GEO_HIER with UR");
//			
//			int i = 1;
//			
//			while(rs.next() && i++ < 2) {
//				System.out.println("GEO_CITY_CD is:"+ rs.getString("GEO_CITY_CD") + "<BR>");
//				System.out.println("Creating new traveler");
//				String cityCode = StringUtils.trim(rs.getString("GEO_CITY_CD"));
//				travelerRepository.save(new Traveler(cityCode, cityCode));
//			}
//			System.out.println("Finished retrieving Data");
//			conn.close();
//			System.out.println("DataBase closed");
//
//		}
//		catch (Throwable e)
//		{
//			System.out.println("exception thrown");
//			e.printStackTrace();
//		}
//	}
}
