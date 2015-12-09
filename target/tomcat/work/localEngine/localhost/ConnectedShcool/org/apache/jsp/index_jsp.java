package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/jsp/layout/main.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body class=\"layout-boxed sidebar-mini skin-black\">\r\n");
      out.write("<!-- Site wrapper -->\r\n");
      out.write("<div class=\"wrapper\"><header class=\"main-header\"> <!-- Logo -->\r\n");
      out.write("<a href=\"../../index2.html\" class=\"logo\"> <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("<span class=\"logo-mini\"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->\r\n");
      out.write("<span class=\"logo-lg\"><b>Admin</b>LTE</span> </a> <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("<nav class=\"navbar navbar-static-top\" role=\"navigation\"> <!-- Sidebar toggle button-->\r\n");
      out.write("<a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("<span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span>\r\n");
      out.write("<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </a>\r\n");
      out.write("<div class=\"navbar-custom-menu\">\r\n");
      out.write("<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t<!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("\t<li class=\"dropdown messages-menu\"><a href=\"#\"\r\n");
      out.write("\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"> <i\r\n");
      out.write("\t\tclass=\"fa fa-envelope-o\"></i> <span class=\"label label-success\">4</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t<li class=\"header\">You have 4 messages</li>\r\n");
      out.write("\t\t<li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<!-- Notifications: style can be found in dropdown.less -->\r\n");
      out.write("\t<li class=\"dropdown notifications-menu\"><a href=\"#\"\r\n");
      out.write("\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"> <i\r\n");
      out.write("\t\tclass=\"fa fa-bell-o\"></i> <span class=\"label label-warning\">10</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t<li class=\"header\">You have 10 notifications</li>\r\n");
      out.write("\t\t<li class=\"footer\"><a href=\"#\">View all</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<!-- Tasks: style can be found in dropdown.less -->\r\n");
      out.write("\t<li class=\"dropdown tasks-menu\"><a href=\"#\"\r\n");
      out.write("\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"> <i\r\n");
      out.write("\t\tclass=\"fa fa-flag-o\"></i> <span class=\"label label-danger\">9</span> </a></li>\r\n");
      out.write("\t<!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("\t<li class=\"dropdown user user-menu\"><a href=\"#\"\r\n");
      out.write("\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"> <img\r\n");
      out.write("\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\tclass=\"user-image\" alt=\"User Image\"> <span class=\"hidden-xs\">Alexander\r\n");
      out.write("\tPierce</span> </a>\r\n");
      out.write("\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t<!-- User image -->\r\n");
      out.write("\t\t<li class=\"user-header\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\tclass=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\t\t<p>Alexander Pierce - Web Developer <small>Member since\r\n");
      out.write("\t\tNov. 2012</small></p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<!-- Menu Body -->\r\n");
      out.write("\t\t<li class=\"user-body\">\r\n");
      out.write("\t\t<div class=\"col-xs-4 text-center\"><a href=\"#\">Followers</a></div>\r\n");
      out.write("\t\t<div class=\"col-xs-4 text-center\"><a href=\"#\">Sales</a></div>\r\n");
      out.write("\t\t<div class=\"col-xs-4 text-center\"><a href=\"#\">Friends</a></div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<!-- Menu Footer-->\r\n");
      out.write("\t\t<li class=\"user-footer\">\r\n");
      out.write("\t\t<div class=\"pull-left\"><a href=\"#\"\r\n");
      out.write("\t\t\tclass=\"btn btn-default btn-flat\">Profile</a></div>\r\n");
      out.write("\t\t<div class=\"pull-right\"><a href=\"#\"\r\n");
      out.write("\t\t\tclass=\"btn btn-default btn-flat\">Sign out</a></div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<!-- Control Sidebar Toggle Button -->\r\n");
      out.write("\t\r\n");
      out.write("\t<li class=\"dropdown\" id=\"loader-el\" ><img\r\n");
      out.write("\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" /></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</nav> </header> <!-- =============================================== --> <!-- Left side column. contains the sidebar -->\r\n");
      out.write("<aside class=\"main-sidebar\"> <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("<div class=\"slimScrollDiv\"\r\n");
      out.write("\tstyle=\"position: relative; overflow: hidden; width: auto; height: 270px;\"><section\r\n");
      out.write("\tclass=\"sidebar\" style=\"height: 270px; overflow: hidden; width: auto;\">\r\n");
      out.write("<!-- Sidebar user panel -->\r\n");
      out.write("<div class=\"user-panel\">\r\n");
      out.write("<div class=\"pull-left image\"><img\r\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\tclass=\"img-circle\" alt=\"User Image\"></div>\r\n");
      out.write("<div class=\"pull-left info\">\r\n");
      out.write("<p>Alexander Pierce</p>\r\n");
      out.write("<a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- search form -->\r\n");
      out.write("<form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("<div class=\"input-group\"><input type=\"text\" name=\"q\"\r\n");
      out.write("\tclass=\"form-control\" placeholder=\"Search...\"> <span\r\n");
      out.write("\tclass=\"input-group-btn\">\r\n");
      out.write("<button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i\r\n");
      out.write("\tclass=\"fa fa-search\"></i></button>\r\n");
      out.write("</span></div>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("<ul class=\"sidebar-menu\">\r\n");
      out.write("\t<li class=\"header\">MAIN NAVIGATION</li>\r\n");
      out.write("\t<li class=\"treeview\"><a href=\"etablissement/list\" class=\"ajaxlink\">\r\n");
      out.write("\t<i class=\"fa fa-fw fa-bank\"></i> Etablissement </a></li>\r\n");
      out.write("\t<li class=\"treeview\"><a href=\"professeur/list\" class=\"ajaxlink\">\r\n");
      out.write("\t<i class=\"fa fa-fw fa-bank\"></i> Professeur </a></li>\r\n");
      out.write("\t<li class=\"treeview\"><a href=\"eleve/list\" class=\"ajaxlink\">\r\n");
      out.write("\t<i class=\"fa fa-fw fa-bank\"></i> Eleve </a></li>\r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("</section> </aside> <!-- =============================================== --> <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("<div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\" style=\"padding: 10px;\">\r\n");
      out.write("xqq\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /index.jsp(47,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/dist/img/user2-160x160.jpg");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /index.jsp(53,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/dist/img/user2-160x160.jpg");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /index.jsp(76,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/dist/img/loader/500 (3).GIF");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /index.jsp(88,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/dist/img/user2-160x160.jpg");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }
}
