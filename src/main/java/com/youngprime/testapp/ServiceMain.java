package com.youngprime.testapp;

import static spark.Spark.*;

public class ServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		port(8081);
		
		get("/ci", (req, res) -> {
			
			String username = req.queryParamOrDefault("username", "Murtadha");
			
			res.header("Content-Type", "text/plain");
			return "Welcome to CI, " + username + "!";
		});
	}

}
