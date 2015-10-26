(function() {
  var template = Handlebars.template, templates = Handlebars.templates = Handlebars.templates || {};
templates['footer'] = template({"compiler":[7,">= 4.0.0"],"main":function(container,depth0,helpers,partials,data) {
    return "<div class=\"center footer\">\n    <div class=\"column-center\">\n        <span class=\"heading\">Maersk Group</span><br/>\n        some text to go here<br/>\n        another link<br/>\n    </div>\n    <div class=\"column-left\">\n        <span class=\"heading\">Static Text</span><br/>\n        This is static<br/>\n        content is the same across pages<br/>\n        key links\n    </div>\n    <div class=\"column-right\">\n        <span class=\"heading\">Placeholder text</span><br/>\n        some text\n    </div>\n    <div class=\"clear-div\"></div>\n</div>";
},"useData":true});
})();