package com.suhael.template.brands.cmd;

import com.github.jknack.handlebars.TypeSafeTemplate;

public interface CMDTemplate extends TypeSafeTemplate<CMDContext> {

    public void setTitle(String title);
}
