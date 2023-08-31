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
        var icon = MaterialIcons.FACE.create();
        var button = new Button("Change icon", e -> {
            icon.setCharCode(MaterialIcons.LIGHTBULB.getCharCode());
        });

        add(icon, button);
    }

    enum MaterialIcons {
        FACE("face"), LIGHTBULB("lightbulb");

        private String ligature;

        MaterialIcons(String ligature) {
            this.ligature = ligature;
        }

        public FontIcon create() {
            var icon = new FontIcon("material-icons");
            icon.setCharCode(getCharCode());
            return icon;
        }

        public String getCharCode() {
            return ligature;
        }
    }


}
