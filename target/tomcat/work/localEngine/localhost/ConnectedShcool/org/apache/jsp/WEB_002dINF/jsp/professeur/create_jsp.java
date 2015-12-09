package org.apache.jsp.WEB_002dINF.jsp.professeur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/java-tags-angular.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fpanel_0026_005ftitle_005fcolumnWidth;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fclass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fui_005fpanel_0026_005ftitle_005fcolumnWidth = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fui_005fpanel_0026_005ftitle_005fcolumnWidth.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fclass_005faction.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      if (_jspx_meth_ui_005fpanel_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_ui_005fpanel_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ui:panel
    com.connected.ui.tags.page.Panel _jspx_th_ui_005fpanel_005f0 = (com.connected.ui.tags.page.Panel) _005fjspx_005ftagPool_005fui_005fpanel_0026_005ftitle_005fcolumnWidth.get(com.connected.ui.tags.page.Panel.class);
    _jspx_th_ui_005fpanel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fpanel_005f0.setParent(null);
    // /WEB-INF/jsp/professeur/create.jsp(9,1) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fpanel_005f0.setTitle("PROFESSEUR");
    // /WEB-INF/jsp/professeur/create.jsp(9,1) name = columnWidth type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fpanel_005f0.setColumnWidth("12");
    int _jspx_eval_ui_005fpanel_005f0 = _jspx_th_ui_005fpanel_005f0.doStartTag();
    if (_jspx_eval_ui_005fpanel_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fpanel_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fpanel_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fpanel_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write(" \t\t ");
        if (_jspx_meth_form_005fform_005f0(_jspx_th_ui_005fpanel_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        out.write('	');
        int evalDoAfterBody = _jspx_th_ui_005fpanel_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fpanel_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fpanel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fpanel_0026_005ftitle_005fcolumnWidth.reuse(_jspx_th_ui_005fpanel_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fpanel_0026_005ftitle_005fcolumnWidth.reuse(_jspx_th_ui_005fpanel_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fpanel_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fpanel_005f0);
    // /WEB-INF/jsp/professeur/create.jsp(10,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("form-etablissement");
    // /WEB-INF/jsp/professeur/create.jsp(10,4) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", new String("ajaxform"));
    // /WEB-INF/jsp/professeur/create.jsp(10,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("professeur/create");
    // /WEB-INF/jsp/professeur/create.jsp(10,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/professeur/create.jsp(10,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setName("professeur");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  <div class=\"box-body\">\n");
          out.write("                    <div class=\"form-group\" id=\"div-field-name\">\n");
          out.write("                      <label for=\"div-field-name\">Matricule</label>\n");
          out.write("                      <input type=\"text\" name=\"matricule\" class=\"form-control\" id=\"name\" placeholder=\"Matricule professeur\">\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"form-group\" id=\"div-field-name\">\n");
          out.write("                      <label for=\"div-field-name\">Nom </label>\n");
          out.write("                      <input type=\"text\" name=\"firstName\" class=\"form-control\" id=\"name\" placeholder=\"Nom professeur\">\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"form-group\" id=\"div-field-name\">\n");
          out.write("                      <label for=\"div-field-name\">Type contrat :</label>\n");
          out.write("                      <input type=\"checkbox\" name=\"permanent\" class=\"form-control\" id=\"permanant\" >\n");
          out.write("                      <input type=\"radio\" name=\"id\" value=\".NET\"> .NET<BR>\n");
          out.write("                    </div>\n");
          out.write("                   \n");
          out.write("                  </div><!-- /.box-body -->\n");
          out.write("\n");
          out.write("                  <div class=\"box-footer\">\n");
          out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
          out.write("                  </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
