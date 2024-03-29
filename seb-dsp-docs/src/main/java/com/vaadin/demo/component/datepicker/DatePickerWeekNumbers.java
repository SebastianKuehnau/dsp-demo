package com.vaadin.demo.component.datepicker;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.demo.DemoExporter; // hidden-source-line

@Route("date-picker-week-numbers")
public class DatePickerWeekNumbers extends Div {

    public DatePickerWeekNumbers() {
        DatePicker datePicker = new DatePicker("Vacation start date");
        // tag::snippet[]
        datePicker.setWeekNumbersVisible(true);
        datePicker
                .setI18n(new DatePicker.DatePickerI18n().setFirstDayOfWeek(1));
        // end::snippet[]

        add(datePicker);
    }

    public static class Exporter extends DemoExporter<DatePickerWeekNumbers> { // hidden-source-line
    } // hidden-source-line
}
