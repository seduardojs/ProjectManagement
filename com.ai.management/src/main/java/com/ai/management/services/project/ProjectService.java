package com.ai.management.services.project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/project")
public class ProjectService {
	@GET
	public String helloworld() {
		return "Hello World!";
	}
}
