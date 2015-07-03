package com.person.java.demo;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceI implements CustomerService {

	@Override
	public List getServiceCatalog() {
		 List<Service> serviceList = new ArrayList<Service>();
		 Service s1 = new Service(1, "Grocery", "Banana", 100);
		 Service s2 = new Service(2, "Vegetables", "Tomato", 200);
		 Service s3 = new Service(3, "Grocery", "Apple", 300);
		 Service s4 = new Service(4, "Grocery", "Potato", 400);
		 Service s5 = new Service(5, "Vegetables", "Cereal", 600);
		 Service s6 = new Service(6, "Vegetables", "Peas", 500);
		 Service s7 = new Service(7, "Grocery", "Sugar", 200);
		 serviceList.add(s1);
		 serviceList.add(s2);
		 serviceList.add(s3);
		 serviceList.add(s4);
		 serviceList.add(s5);
		 serviceList.add(s6);
		 serviceList.add(s7);
		 return serviceList;
	}

}
