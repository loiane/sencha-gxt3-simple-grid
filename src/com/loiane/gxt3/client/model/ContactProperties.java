package com.loiane.gxt3.client.model;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface ContactProperties extends PropertyAccess<Contact> {

	@Path("id")
	ModelKeyProvider<Contact> key();
	
	ValueProvider<Contact, String> name();
	
	ValueProvider<Contact, String> phone();
	
	ValueProvider<Contact, String> email();
}
