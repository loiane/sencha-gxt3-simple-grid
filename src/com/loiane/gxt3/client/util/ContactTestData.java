package com.loiane.gxt3.client.util;

import java.util.ArrayList;
import java.util.List;

import com.loiane.gxt3.client.model.Contact;

public class ContactTestData {

	public static List<Contact> generateData(){
		
		List<Contact> list = new ArrayList<Contact>();
		
		list.add(new Contact(1, "Loiane", "1234-5678", "loiane@email.com"));
		list.add(new Contact(2, "Peter", "2345-6789", "peter@email.com"));
		list.add(new Contact(3, "Andrew", "9876-1234", "andrew@email.com"));
		list.add(new Contact(4, "Caroline", "5647-8473", "caroline@email.com"));
		list.add(new Contact(5, "Jared", "4034-4585", "jared@email.com"));
		list.add(new Contact(6, "Linda", "3455-0234", "linda@email.com"));
		list.add(new Contact(7, "Elena", "3454-4543", "elena@email.com"));
		list.add(new Contact(8, "Stefan", "5677-5677", "stefan@email.com"));
		list.add(new Contact(9, "Ana", "2434-2343", "ana@email.com"));
		
		return list;
	}
}
