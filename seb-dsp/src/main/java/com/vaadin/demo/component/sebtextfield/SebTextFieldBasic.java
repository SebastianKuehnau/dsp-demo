package com.vaadin.demo.component.sebtextfield;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.seb.components.SebTextField;
import com.vaadin.demo.DemoExporter;

@Route("sebtextfield-basic")
public class SebTextFieldBasic extends VerticalLayout {
    public SebTextFieldBasic() {
        // tag::snippet[]
        SebTextField seb_text_field_caption = new SebTextField("Seb Text Field Caption");
        add(seb_text_field_caption);
        seb_text_field_caption.addClassName("test");
        // end::snippet[]
    }
    public static class Exporter extends DemoExporter<SebTextFieldBasic> { // hidden-source-line
    } // hidden-source-line
}
