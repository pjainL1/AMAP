package org.apache.jsp.main.jspf;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.korem.LanguageManager;

public final class compare_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_basename_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_fmt_setBundle_0(_jspx_page_context))
        return;
      out.write('\n');

    LanguageManager lm = new LanguageManager(request.getServletContext(), request);

      out.write("\n");
      out.write("<div class=\"filterDatesWrapper\">\n");
      out.write("    <span class=\"dateRangeCaption\">");
      out.print( lm.get("datePickers.dateRange"));
      out.write("</span>  \n");
      out.write("    <select name=\"datesFilterSelect\" id=\"datesFilterTypesSelect\" class=\"datesFilterSelect\">\n");
      out.write("        <option value=\"single\" selected=\"selected\">");
      out.print( lm.get("datePickers.singleRange"));
      out.write("</option>\n");
      out.write("        <option value=\"comparison\">");
      out.print( lm.get("datePickers.comparisonRange"));
      out.write("</option>\n");
      out.write("    </select>    \n");
      out.write("    <div class=\"basicDates\">\n");
      out.write("        <span class=\"periodCaption\">");
      out.print( lm.get("datePickers.periodOne"));
      out.write("</span>\n");
      out.write("        <input id=\"fromPicker\" type=\"text\"/>-\n");
      out.write("        <input id=\"toPicker\" type=\"text\"/>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"comparisonDates\">\n");
      out.write("        <span class=\"periodCaption\">");
      out.print( lm.get("datePickers.periodTwo"));
      out.write("</span>\n");
      out.write("        <input id=\"comparisonFromPicker\" type=\"text\"/>-\n");
      out.write("        <input id=\"comparisonToPicker\" type=\"text\"/>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"defaultBtnWrapper\">    \n");
      out.write("        <button type=\"button\" id=\"defaultBtnCenter\">");
      out.print( lm.get("datePickers.defaultButtonText"));
      out.write("</button>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table id=\"fullTableDataFiltering\" class=\"fullTable\" style=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print( lm.get("minimumValues.minTransactions"));
      out.write("</td>\n");
      out.write("        <td  align=\"right\"><input id=\"minTrans\" type=\"text\" size=\"8\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print( lm.get("minimumValues.minSpend"));
      out.write("</td>\n");
      out.write("        <td  align=\"right\" style=\"color:#0072cf\"><b> $</b><input id=\"minSpend\" type=\"text\" size=\"8\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print( lm.get("minimumValues.minUnit"));
      out.write("</td>\n");
      out.write("        <td  align=\"right\"><input id=\"minUnit\" type=\"text\" size=\"8\"/></td>\n");
      out.write("    </tr>\n");
      out.write("</table>  \n");
      out.write("        \n");
      out.write("<div id=\"dataFilteringDescWindow\" title='Data Filtering help'>\n");
      out.write("    <div id=\"dataFilteringWindowContent\">\n");
      out.write("        ");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        \n");
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("filter.desc");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }
}
