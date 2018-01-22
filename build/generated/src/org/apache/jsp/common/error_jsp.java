package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.esapi.ESAPI;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_bundle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_var_scope_basename_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_basename_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_bundle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_var_scope_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_fmt_message_key_bundle_nobody.release();
    _jspx_tagPool_fmt_setBundle_var_scope_basename_nobody.release();
    _jspx_tagPool_fmt_setBundle_basename_nobody.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_fmt_setBundle_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_fmt_setBundle_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"../common/style.css\"/>\r\n");
      out.write("        <title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("        <script type=\"text/javascript\"  src=\"../js/lib/jquery/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .errorMsg {\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                color: red;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("            // on the page loading we check the url and also if the parameters are present\r\n");
      out.write("            $(document).ready(function() {\r\n");
      out.write("                if (jQuery.trim($('#errortype').val()) == \"6001\") {\r\n");
      out.write("                    $(\"#error\").html('");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("');\r\n");
      out.write("                } else if (jQuery.trim($('#errortype').val()) == \"5000\") {\r\n");
      out.write("                    $(\"#error\").html(jQuery.trim($('#errormessage').val()));\r\n");
      out.write("                } else if (jQuery.trim($('#errortype').val()) == \"6000\") {\r\n");
      out.write("                    $(\"#error\").html(\"");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("                } else if (jQuery.trim($('#errortype').val()) != \"200\") {\r\n");
      out.write("                    $(\"#error\").html(jQuery.trim($('#errormessage').val()));\r\n");
      out.write("                }\r\n");
      out.write("\t                    \r\n");
      out.write("                var expired = '");
      out.print(ESAPI.encoder().encodeForJavaScript(request.getParameter("expired")));
      out.write("';\r\n");
      out.write("                if(expired == 'true'){\r\n");
      out.write("                    $(\"#error\").html(\"");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\t\t\r\n");
      out.write("            sso = function() {\r\n");
      out.write("                var consumerKey = '");
      out.print(ESAPI.encoder().encodeForJavaScript(request.getParameter("consumerKey")));
      out.write("';\r\n");
      out.write("                var token = '");
      out.print(ESAPI.encoder().encodeForJavaScript(request.getParameter("token")));
      out.write("';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                return (consumerKey != null && token != null && consumerKey != '' && token != '');\r\n");
      out.write("            }\r\n");
      out.write("            ssoerror = function() {\r\n");
      out.write("                var ssoerror = '");
      out.print( ESAPI.encoder().encodeForJavaScript(request.getParameter("ssoerror")));
      out.write("';\r\n");
      out.write("\t\t\r\n");
      out.write("                return (sso() && ssoerror != 'null' && ssoerror != '');\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"sso\">\r\n");
      out.write("            <input type=\"hidden\" name=\"build\" value=\"");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write('.');
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write(' ');
      out.write('b');
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("            <input id=\"expired\" name=\"expired\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${expired}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <input id=\"errormessage\" name=\"errormessage\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errormessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <input id=\"ssoerror\" name=\"ssoerror\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ssoerror}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <input id=\"errortype\" name=\"errortype\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errortype}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <div id=\"error\" class=\"errorMsg\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_setBundle_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_setBundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _jspx_tagPool_fmt_setBundle_basename_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_setBundle_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setBundle_0.setParent(null);
    _jspx_th_fmt_setBundle_0.setBasename("loLocalString");
    int _jspx_eval_fmt_setBundle_0 = _jspx_th_fmt_setBundle_0.doStartTag();
    if (_jspx_th_fmt_setBundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
      return true;
    }
    _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
    return false;
  }

  private boolean _jspx_meth_fmt_setBundle_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_setBundle_1 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _jspx_tagPool_fmt_setBundle_var_scope_basename_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_setBundle_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setBundle_1.setParent(null);
    _jspx_th_fmt_setBundle_1.setBasename("build");
    _jspx_th_fmt_setBundle_1.setVar("build");
    _jspx_th_fmt_setBundle_1.setScope("page");
    int _jspx_eval_fmt_setBundle_1 = _jspx_th_fmt_setBundle_1.doStartTag();
    if (_jspx_th_fmt_setBundle_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setBundle_var_scope_basename_nobody.reuse(_jspx_th_fmt_setBundle_1);
      return true;
    }
    _jspx_tagPool_fmt_setBundle_var_scope_basename_nobody.reuse(_jspx_th_fmt_setBundle_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("secure.login.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMsgKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("secure.login.valid.invalidaccess");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("secure.login.valid.expired");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_bundle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setBundle((javax.servlet.jsp.jstl.fmt.LocalizationContext) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${build}", javax.servlet.jsp.jstl.fmt.LocalizationContext.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_message_4.setKey("version");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_bundle_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_bundle_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_bundle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setBundle((javax.servlet.jsp.jstl.fmt.LocalizationContext) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${build}", javax.servlet.jsp.jstl.fmt.LocalizationContext.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_message_5.setKey("minor");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_bundle_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_bundle_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_bundle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setBundle((javax.servlet.jsp.jstl.fmt.LocalizationContext) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${build}", javax.servlet.jsp.jstl.fmt.LocalizationContext.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_message_6.setKey("build");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_bundle_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_bundle_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }
}
