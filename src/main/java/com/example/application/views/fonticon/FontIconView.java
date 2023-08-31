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

        var icon = FontAwesomeIcons.USER.create();
        var button = new Button("Change icon", e -> {
            icon.setFont(FontAwesomeIcons.CAMERA.getFont());
        });

        add(icon, button);
    }

        enum FontAwesomeIcons {
            CAMERA("fa-camera"), USER("fa-user");

            private String iconClassName;

            FontAwesomeIcons(String iconClassName) {
                this.iconClassName = iconClassName;
            }

            public FontIcon create() {
                return new FontIcon(getFont());
            }

            public String[] getFont() {
                return new String[] { "fa-solid", iconClassName };
            }
        }

}
