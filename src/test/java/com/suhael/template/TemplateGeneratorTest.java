package com.suhael.template;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import junit.framework.TestCase;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TemplateGeneratorTest extends TestCase {

    private Handlebars handlebars;
    private ObjectMapper mapper;

    public void setUp() throws Exception {
        super.setUp();

        TemplateLoader loader = new ClassPathTemplateLoader();
        loader.setPrefix("/templates");
        this.handlebars = new Handlebars(loader);
        this.mapper = new ObjectMapper();
    }

    public void testHandlebars() throws IOException {
        Template template = handlebars.compile("/cmd/cmd_template");
//        Template template = handlebars.compileInline("<div class=\"center\">\n" +
//                "    <ul>\n" +
//                "        {{#each menuItems}}\n" +
//                "            <li><a href=\"{{this}}.html\">{{this}}</a></li>\n" +
//                "        {{/each}}\n" +
//                "    </ul>\n" +
//                "</div>");

//        Template template = handlebars.compileInline("");
//
//        String json = "{menuItems: [\"home\", \"about\"]}";
//        Map<String, Object> map = new HashMap<String, Object>();
//
//        // convert JSON string to Map
//        map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
//
//        Map<String, Object> values = new HashMap<>();
//        values.put("menuItems", Arrays.asList("home", "about"));
//
//        String html = template.apply(map);
//        System.out.println(html);
    }
}