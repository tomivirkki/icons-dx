package com.example.application.views.svgicon;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Svg Icon")
@Route(value = "svg-icon", layout = MainLayout.class)
public class SvgIconView extends VerticalLayout {

    public SvgIconView() {

        /*
         * Task 1. Standalone SVG
         * 
         * - Add the "code-branch.svg" file to the theme folder
         * 
         * - Add a SvgIcon using the SVG file
         */

        /*
         * Task 2. Spritesheet SVG
         * 
         * - Add the "solid.svg" file to the resources folder
         * 
         * - Add a SvgIcon using the SVG file with the "code-branch" sprite
         * 
         * - Add another SvgIcon using the same file with the "user" sprite
         */
    }

}
