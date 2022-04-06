package com.vaadin.demo.component.sebtextfield;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.seb.components.SebTextField;
import com.vaadin.demo.DemoExporter;

@Route("sebtextfield-basic")
public class SebTextFieldBasic extends VerticalLayout {
    public SebTextFieldBasic() {
        // tag::snippet[]
        add(new SebTextField("test"));
        // end::snippet[]
    }
    public static class Exporter extends DemoExporter<SebTextFieldBasic> { // hidden-source-line
    } // hidden-source-line
}
