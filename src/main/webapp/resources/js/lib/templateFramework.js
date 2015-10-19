function TemplateFramework(){

    this.setContent = function (templateId, context, target){
        var source   = $(templateId).html();
        var template = Handlebars.compile(source);
        var html = template(context);
        $(target).append(html);
    }

    this.createPage = function(){
        document.write("<html></html>");
    }

    this.initPage = function(){
        this.createPage();
        $.get("../resources/html/static_template.html", function( html ) {

            var context = {};
            var template = Handlebars.compile(html);
            var html = template(context);

            $("html").html(html);
        }, 'html');
    }

}