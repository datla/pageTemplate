package com.suhael.template;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.TypeSafeTemplate;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import java.io.IOException;

public class TemplateGenerator {

    private Handlebars handlebars;

    public TemplateGenerator(String templatePath){
        TemplateLoader templateLoader = getTemplateLoader(templatePath);
        this.handlebars = new Handlebars(templateLoader);
    }

    public Template compileTemplate(String template) throws IOException {
        return handlebars.compile(template);
    }

    public String generateHTML(TypeSafeTemplate template, Object context) throws IOException {
        return template.apply(context);
    }

    private TemplateLoader getTemplateLoader(String templatePath){
        TemplateLoader loader = new ClassPathTemplateLoader();
        loader.setPrefix(templatePath);
        return loader;
    }
}
