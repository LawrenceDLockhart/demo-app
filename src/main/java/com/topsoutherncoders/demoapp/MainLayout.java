package com.topsoutherncoders.demoapp;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.dialog.Dialog;

@Route("secondary")
public class MainLayout extends AppLayout {

    public MainLayout() {
        createHeader();
    }

    private void createHeader() {
        H1 logo = new H1("Vaadin Application");
        logo.addClassNames("text-l", "m-m");

        RouterLink homeLink = new RouterLink("Home", HomeView.class);
        RouterLink servicesLink = new RouterLink("Services", ServicesView.class);
        RouterLink aboutLink = new RouterLink("About", AboutView.class);
        RouterLink contactLink = new RouterLink("Contact", ContactView.class);

        homeLink.addClassNames("me-m");
        servicesLink.addClassNames("me-m");
        aboutLink.addClassNames("me-m");

        addToNavbar(true, logo, homeLink, servicesLink, aboutLink, contactLink);
    }

    @Route(value = "vertical", layout = MainLayout.class)
    public static class HomeView extends VerticalLayout {
        public HomeView() {
            add(new H1("Welcome to Our Website"), new Span("This is the home page."));
        }
    }

    @Route(value = "services", layout = MainLayout.class)
    public static class ServicesView extends VerticalLayout {
        public ServicesView() {
            add(new H1("Our Services"), new Span("Details about services."));
        }
    }

    @Route(value = "about", layout = MainLayout.class)
    public static class AboutView extends VerticalLayout {
        public AboutView() {
            add(new H1("About Us"), new Span("Information about our company."));
        }
    }

    @Route(value = "contact", layout = MainLayout.class)
    public static class ContactView extends VerticalLayout {
        public ContactView() {
            add(new H1("Contact Us"), new Span("How to reach us."));
        }
    }
}
