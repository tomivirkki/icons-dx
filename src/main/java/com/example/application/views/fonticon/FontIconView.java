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
        /*
         * Task 1. Font
         * 
         * - Add FontAwesome icon font to the app (from test-resources)
         * 
         * - Add a FontIcon using an icon from the FontAwesome collection
         * 
         * - Add a button that changes the icon on click
         */

        /*
         * Task 2. FontFamily and char
         *
         * - Add Lumo icon font to the app (from test-resources)
         *
         * - Add a FontIcon using an icon from the Lumo icons collection
         *
         * - Add a button that changes the icon on click
         */

         /*
          * Task 3. Ligatures
          * 
          * - Add Material icon font to the app (from test-resources)
          * 
          * - Add a FontIcon using an icon from the Material icons collection.
          * Use icon ligatures (not codepoint).
          * 
          * - Add a button that changes the icon on click\
          */
    }
}
