package com.suhael.template.brands.cmd;

import com.suhael.template.ContextObject;

public class CMDContext implements ContextObject {

    private String title = "CMD Title";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
