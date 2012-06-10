package com.loiane.gxt3.client.grid;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.loiane.gxt3.client.model.Contact;
import com.loiane.gxt3.client.model.ContactProperties;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;

public class SimpleGrid extends Grid<Contact> {

	private static final ContactProperties props = GWT.create(ContactProperties.class);

	public SimpleGrid() {
		
		super(generateData(), createColumnModel());

		this.getView().setStripeRows(true);
		this.getView().setColumnLines(true);
		this.setBorders(false);
		this.setColumnReordering(true);
	}

	private static ColumnModel<Contact> createColumnModel(){

		ColumnConfig<Contact, String> nameCol = new ColumnConfig<Contact, String>(props.name(), 150, "Name");
		ColumnConfig<Contact, String> phoneCol = new ColumnConfig<Contact, String>(props.phone(), 75, "Phone");
		ColumnConfig<Contact, String> emailCol = new ColumnConfig<Contact, String>(props.email(), 100, "Email");

		List<ColumnConfig<Contact, ?>> columnConfigList = new ArrayList<ColumnConfig<Contact, ?>>();
		columnConfigList.add(nameCol);
		columnConfigList.add(phoneCol);
		columnConfigList.add(emailCol);

		return new ColumnModel<Contact>(columnConfigList);
	}

	private static ListStore<Contact> generateData(){
		ListStore<Contact> store = new ListStore<Contact>(props.key());
		return store;
	}
}
