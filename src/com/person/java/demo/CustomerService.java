package com.person.java.demo;

import java.util.List;

@FunctionalInterface
public interface CustomerService {
public List getServiceCatalog();
default void getPortalVersion(String version){
	System.out.println(version);
}
}
