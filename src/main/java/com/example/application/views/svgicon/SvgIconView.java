package com.example.application.views.svgicon;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.SvgIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Svg Icon")
@Route(value = "svg-icon", layout = MainLayout.class)
public class SvgIconView extends VerticalLayout {

    public SvgIconView() {
        var icon = new SvgIcon("/themes/myapp/code-branch.svg");

        var button = new Button("Change color", e -> {
            icon.setColor("#1a81fa");
        });

        add(icon, button);
    }
}
