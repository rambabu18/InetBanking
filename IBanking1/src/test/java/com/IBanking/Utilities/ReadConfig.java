package com.IBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

		Properties pro;
		
		
		public ReadConfig(){
			
			File file = new File("./Configuration//config.properties");
			
			try {
				
				FileInputStream fis = new FileInputStream(file); // file input stream to read data from .properties file
				
				pro = new Properties(); // initiate Properties file here
				
				pro.load(fis);  // load method will read complete file
			
			} catch (Exception e) {
				
				System.out.print("Exception is :" + e.getMessage());
			}
			
			
		}
			
				public String getApplicationUrl() {
					
					String url = pro.getProperty("baseURL");
					return url;
				}
			
		

				public String getUserName() {
	    	  
	    	  	String uname = pro.getProperty("username");
	    	  	return uname;		


				}
				public String getPassword() {
			    	  
		    	  	String password = pro.getProperty("password");
		    	  	return password;		


					}
				
				public String getChromePath() {
			    	  
		    	  	String chromepath = pro.getProperty("chromepath");
		    	  	return chromepath;		


					}


				public String getSafariPath() {
			    	  
		    	  	String safaripath = pro.getProperty("safari");
		    	  	return safaripath;		


					}

	}






