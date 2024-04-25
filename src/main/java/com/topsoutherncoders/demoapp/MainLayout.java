package com.topsoutherncoders.demoapp;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.Route;

@Route("secondary")
public class MainLayout extends AppLayout {

    public MainLayout() {
    }
    // In each class, replace RouterLayoutView
    // with AppLayoutView for a different implementation
    @Route(layout = RouterLayoutView.class)
    public static class HomeView extends VerticalLayout {
        public HomeView() {
            add(new H1("Welcome to Our Website"), new Span("This is the home page."));
        }
    }

    @Route(layout = RouterLayoutView.class)
    public static class ServicesView extends VerticalLayout {
        public ServicesView() {
            add(new H1("Our Services"), new Span("Details about services."));
        }
    }

    @Route(layout = RouterLayoutView.class)
    public static class AboutView extends VerticalLayout {
        public AboutView() {
            add(new H1("About Us"), new Span("Information about our company."));
        }
    }

    @Route(layout = RouterLayoutView.class)
    public static class ContactView extends VerticalLayout {
        public ContactView() {
            add(new H1("Contact Us"), new Span("How to reach us."));
        }
    }

    public static class RouterLayoutView extends VerticalLayout implements RouterLayout {
        public RouterLayoutView() {
            add("This is a header for all views using this layout");
            DatePicker datePicker = new DatePicker("Start date");
            add(datePicker);
        }
    }

    public static class AutoLayoutView
            extends org.vaadin.firitin.appframework.MainLayout {
        @Override
        protected String getDrawerHeader() {
            return null;
        }
    }
}
