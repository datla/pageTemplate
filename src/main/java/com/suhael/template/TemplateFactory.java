package com.suhael.template;

import com.github.jknack.handlebars.TypeSafeTemplate;
import com.suhael.template.brands.cmd.CMDContext;
import com.suhael.template.brands.cmd.CMDTemplate;

import java.io.IOException;

public class TemplateFactory {

    private static final String TEMPLATE_PREFIX_PATH = "/templates";

    public static String getTemplate(String type) throws IOException {

        TemplateGenerator templateGenerator = new TemplateGenerator(TEMPLATE_PREFIX_PATH);

        ContextObject context = null;
        TypeSafeTemplate template = null;

        if(type.equalsIgnoreCase("cmd")){
            template = templateGenerator.compileTemplate("/cmd/cmd_template").as(CMDTemplate.class);
            context = new CMDContext();
        }

        return templateGenerator.generateHTML(template, context);
    }
}
