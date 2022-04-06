package org.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.seb.components.SebTextField;
import org.vaadin.seb.views.AbstractView;

/**
 * The main view contains a button and a click listener.
 */
@Route("main")
@RouteAlias("")
public class MainView extends AbstractView {

    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button, new SebTextField("example input"));
    }

    @Override
    public String viewName() {
        return "Main";
    }
}
