package com.loiane.gxt3.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.loiane.gxt3.client.grid.SimpleGrid;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Resizable;
import com.sencha.gxt.widget.core.client.Resizable.Dir;

public class SimpleGridExample implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		ContentPanel root = new ContentPanel();
		
		root.setHeadingText("Simple Grid");
	    root.setPixelSize(550, 250);
	    root.addStyleName("margin-10");
		
	    Resizable r = new Resizable(root, Dir.E, Dir.SE, Dir.S);
	    r.setMinHeight(200);
	    r.setMinWidth(300);
	    
	    root.setWidget(new SimpleGrid());
	    
	    RootPanel.get().add(root);
	}

}
