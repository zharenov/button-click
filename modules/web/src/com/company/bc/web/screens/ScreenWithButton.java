package com.company.bc.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;

public class ScreenWithButton extends AbstractWindow {

    public void onNotifyClick() {
        showNotification("Hello world!");
    }
}