package com.example.application.views.fonticon;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.FontIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Font Icon")
@Route(value = "font-icon", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class FontIconView extends VerticalLayout {

    public FontIconView() {
        var icon = LumoIcons.BELL.create();
        var button = new Button("Change icon", e -> {
            icon.setCharCode(LumoIcons.COG.getCharCode());
        });

        add(icon, button);
    }

    enum LumoIcons {
        BELL("\uea0d"), COG("\uea15");

        private String codepoint;

        LumoIcons(String codepoint) {
            this.codepoint = codepoint;
        }

        public FontIcon create() {
            var icon = new FontIcon();
            icon.setFontFamily("Lumo icons");
            icon.setCharCode(codepoint);
            return icon;
        }

        public String getCharCode() {
            return codepoint;
        }
    }
}
