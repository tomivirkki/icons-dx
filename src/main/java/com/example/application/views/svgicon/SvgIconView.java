package com.example.application.views.svgicon;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.icon.SvgIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Svg Icon")
@Route(value = "svg-icon", layout = MainLayout.class)
public class SvgIconView extends VerticalLayout {

    public SvgIconView() {
        add(FAIcons.CODE_BRANCH.create(), FAIcons.USER.create());
    }

    enum FAIcons {
        USER, CODE_BRANCH;

        public SvgIcon create() {
            var src = String.format("/themes/myapp/solid.svg#%s",
                    this.name().toLowerCase().replace("_", "-"));
            return new SvgIcon(src);
        }

    }

}
