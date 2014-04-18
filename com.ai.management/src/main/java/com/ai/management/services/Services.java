package com.ai.management.services;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ai.management.services.project.ProjectService;

public class Services extends Application {
	
	private static final Set<Class<?>> services;

    static {
        HashSet<Class<?>> tmp = new HashSet<Class<?>>();
        tmp.add(ProjectService.class);

        services = Collections.unmodifiableSet(tmp);
    }

    @Override
    public Set<Class<?>> getClasses(){
       return  services;
    }  

}
