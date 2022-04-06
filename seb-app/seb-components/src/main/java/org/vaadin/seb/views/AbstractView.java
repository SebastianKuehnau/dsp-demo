package org.vaadin.seb.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public abstract class AbstractView extends VerticalLayout {

    public AbstractView() {
        H1 header = new H1(viewName());
        header.setClassName("header");
        add(header);
    }

    public abstract String viewName() ;
}

