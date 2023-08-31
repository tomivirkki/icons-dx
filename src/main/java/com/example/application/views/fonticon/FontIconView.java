package com.example.application.views.fonticon;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Font Icon")
@Route(value = "font-icon", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class FontIconView extends VerticalLayout {

    public FontIconView() {
        
    }
}
