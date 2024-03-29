package com.vaadin.demo.component.radiobutton;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.demo.DemoExporter; // hidden-source-line

@Route("radio-button-group-labels")
public class RadioButtonGroupLabels extends VerticalLayout {

    public RadioButtonGroupLabels() {
        setPadding(false);
        setSpacing(false);

        // tag::snippet[]
        RadioButtonGroup<String> jobTitleGroup = new RadioButtonGroup<>();
        jobTitleGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        jobTitleGroup.setLabel("Job title");
        jobTitleGroup.setItems("Analyst", "Administrator", "Engineer");
        jobTitleGroup.setValue("Analyst");
        add(jobTitleGroup);

        RadioButtonGroup<String> departmentGroup = new RadioButtonGroup<>();
        departmentGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        departmentGroup.setLabel("Department");
        departmentGroup.setItems("Engineering", "Human Resources", "Marketing");
        departmentGroup.setValue("Engineering");
        add(departmentGroup);
        // end::snippet[]
    }

    public static class Exporter extends DemoExporter<RadioButtonGroupLabels> { // hidden-source-line
    } // hidden-source-line
}
