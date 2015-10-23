(function() {
  var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['base_template'] = template({"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    var stack1, helper, alias1=depth0 != null ? depth0 : {}, alias2=helpers.helperMissing, alias3="function";

  return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n        \"http://www.w3.org/TR/html4/loose.dtd\">\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <title>Page Title</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/theme.css\">\n</head>\n<body>\n<div id=\"header\" class=\"header\">"
    + ((stack1 = ((helper = (helper = helpers.header || (depth0 != null ? depth0.header : depth0)) != null ? helper : alias2),(typeof helper === alias3 ? helper.call(alias1,{"name":"header","hash":{},"data":data}) : helper))) != null ? stack1 : "")
    + "</div>\n<div id=\"menu\" class=\"menu\">"
    + ((stack1 = ((helper = (helper = helpers.menu || (depth0 != null ? depth0.menu : depth0)) != null ? helper : alias2),(typeof helper === alias3 ? helper.call(alias1,{"name":"menu","hash":{},"data":data}) : helper))) != null ? stack1 : "")
    + "</div>\n<div id=\"body\">"
    + ((stack1 = ((helper = (helper = helpers.body || (depth0 != null ? depth0.body : depth0)) != null ? helper : alias2),(typeof helper === alias3 ? helper.call(alias1,{"name":"body","hash":{},"data":data}) : helper))) != null ? stack1 : "")
    + "</div>\n<div id=\"footer\">"
    + ((stack1 = ((helper = (helper = helpers.footer || (depth0 != null ? depth0.footer : depth0)) != null ? helper : alias2),(typeof helper === alias3 ? helper.call(alias1,{"name":"footer","hash":{},"data":data}) : helper))) != null ? stack1 : "")
    + "</div>\n<div id=\"disclaimer\">"
    + ((stack1 = ((helper = (helper = helpers.disclaimer || (depth0 != null ? depth0.disclaimer : depth0)) != null ? helper : alias2),(typeof helper === alias3 ? helper.call(alias1,{"name":"disclaimer","hash":{},"data":data}) : helper))) != null ? stack1 : "")
    + "</div>\n</body>\n</html>";
},"useData":true});
templates['disclaimer_template'] = template({"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    return "<div class=\"center\">\n    <span class=\"heading\">Legal And Site Information</span><br/>\n    © Maersk Line A/S. All Rights Reserved\n</div>";
},"useData":true});
templates['footer_template'] = template({"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    return "<div class=\"center footer\">\n    <div class=\"column-center\">\n        <span class=\"heading\">Maersk Group</span><br/>\n        some text to go here<br/>\n        another link<br/>\n    </div>\n    <div class=\"column-left\">\n        <span class=\"heading\">Static Text</span><br/>\n        This is static<br/>\n        content is the same across pages<br/>\n        key links\n    </div>\n    <div class=\"column-right\">\n        <span class=\"heading\">Placeholder text</span><br/>\n        some text\n    </div>\n    <div class=\"clear-div\"></div>\n</div>";
},"useData":true});
templates['header_template'] = template({"1":function(container,depth0,helpers,partials,data) {
    var stack1;

  return "Welcome "
    + container.escapeExpression(container.lambda(((stack1 = (depth0 != null ? depth0.user : depth0)) != null ? stack1.name : stack1), depth0));
},"3":function(container,depth0,helpers,partials,data) {
    return "You are not logged in";
},"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    var stack1;

  return "<div class=\"center\">\n    <div class=\"column-left\">"
    + container.escapeExpression(container.lambda(((stack1 = (depth0 != null ? depth0.site : depth0)) != null ? stack1.title : stack1), depth0))
    + "</div>\n    <div class=\"column-right login\">"
    + ((stack1 = helpers["if"].call(depth0 != null ? depth0 : {},((stack1 = (depth0 != null ? depth0.user : depth0)) != null ? stack1.name : stack1),{"name":"if","hash":{},"fn":container.program(1, data, 0),"inverse":container.program(3, data, 0),"data":data})) != null ? stack1 : "")
    + "</div>\n</div>\n<div class=\"clear-div\"></div>";
},"useData":true});
templates['menu_template'] = template({"1":function(container,depth0,helpers,partials,data) {
    var alias1=container.lambda, alias2=container.escapeExpression;

  return "            <li><a href=\""
    + alias2(alias1(depth0, depth0))
    + ".html\">"
    + alias2(alias1(depth0, depth0))
    + "</a></li>\n";
},"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    var stack1;

  return "<div class=\"center\">\n    <ul>\n"
    + ((stack1 = helpers.each.call(depth0 != null ? depth0 : {},(depth0 != null ? depth0.menu : depth0),{"name":"each","hash":{},"fn":container.program(1, data, 0),"inverse":container.noop,"data":data})) != null ? stack1 : "")
    + "    </ul>\n</div>";
},"useData":true});
})();