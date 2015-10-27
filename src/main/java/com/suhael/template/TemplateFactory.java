package com.suhael.template;

import com.suhael.template.brands.cmd.CMDContext;
import com.suhael.template.brands.cmd.CMDTemplate;

import javax.servlet.ServletContext;
import java.io.IOException;

public class TemplateFactory {

    private static final String TEMPLATE_PREFIX_PATH = "/templates";

    public static String getTemplate(String type, ServletContext servletContext) throws IOException {

        TemplateGenerator templateGenerator = new TemplateGenerator(servletContext, TEMPLATE_PREFIX_PATH);

        String html = "";
        if(type.equalsIgnoreCase("cmd")){
            CMDTemplate template = templateGenerator.compileTemplate("/cmd/cmd_template").as(CMDTemplate.class);
            html = templateGenerator.generateHTML(template, new CMDContext());
        }

        return html;
    }
}
