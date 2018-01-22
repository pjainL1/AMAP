package org.apache.jsp.main.jspf;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class storeLevelAnalysis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<table class=\"fullTable\" id=\"slaStf\">\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <h3>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaStfTotalCollectors\" type=\"checkbox\" name=\"slaAnalysisValue\" value=\"collectors\"/>\n");
      out.write("            <label for=\"slaStfTotalCollectors\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td>   \n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>        \n");
      out.write("    </tr>    \n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaStfTotalSales\" type=\"checkbox\" name=\"slaAnalysisValue\" value=\"spend\"/>\n");
      out.write("            <label for=\"slaStfTotalSales\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaStfTotalTransactions\" type=\"checkbox\" name=\"slaAnalysisValue\" value=\"transactions\"/>\n");
      out.write("            <label for=\"slaStfTotalTransactions\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaStfTotalUnit\" type=\"checkbox\" name=\"slaAnalysisValue\" value=\"units\"/>\n");
      out.write("            <label for=\"slaStfTotalUnit\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td> \n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table class=\"fullTable hidden\" id=\"slaCa\">\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <h3>");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</h3>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaCaTotalCollectors\" class=\"slaAnalysisValue\" type=\"checkbox\" name=\"slaAnalysisValue\" value=\"collectors\">\n");
      out.write("            <label for=\"slaCaTotalCollectors\">");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td> \n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>    \n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaCaTotalSales\" class=\"slaAnalysisValue\"  type=\"checkbox\" name=\"slaAnalysisValue\" value=\"spend\">\n");
      out.write("            <label for=\"slaCaTotalSales\">");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td> \n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaCaTotalTransactions\" class=\"slaAnalysisValue\"  type=\"checkbox\" name=\"slaAnalysisValue\" value=\"transactions\">\n");
      out.write("            <label for=\"slaCaTotalTransactions\">");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td>  \n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"slaCaTotalUnit\" class=\"slaAnalysisValue\"  type=\"checkbox\" name=\"slaAnalysisValue\" value=\"units\">\n");
      out.write("            <label for=\"slaCaTotalUnit\">");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("</labe>\n");
      out.write("        </td>        \n");
      out.write("        <td>\n");
      out.write("            <div class=\"customizeRangeBtn\" style=\"position: relative;\"></div>\n");
      out.write("        </td>         \n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("<div id=\"slaDescBtn\">\n");
      out.write("    <!-- stuff -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"display: none\">\n");
      out.write("    <div id=\"selectedAnalysis\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div id=\"rangeAttributesWindow\">\n");
      out.write("        <p id=\"rangeAttributesTitle\"></p>\n");
      out.write("        <div id=\"rangeAttributesWindowHook\"></div>\n");
      out.write("    </div> \n");
      out.write("</div>\n");
      out.write("<div id=\"techmaticConfigTable\" style=\"display: none\">\n");
      out.write("<table  class=\"fullTable colorFullTable\">\n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <th>Range</th>\n");
      out.write("            <th>From</th>\n");
      out.write("            <th>To</th></tr> \n");
      out.write("        <tr class=\"greyTabLine\"> \n");
      out.write("            <td><div class=\"colorRangeDiv rangeOneColor\"></div></td>\n");
      out.write("            <td><input class=\"rangeInput\" type=\"text\" value=\"{0}\"></td>\n");
      out.write("            <td class=\"inifinityTd\">+&infin;</td>\n");
      out.write("        </tr> <tr class=\"\"> \n");
      out.write("            <td><div class=\"colorRangeDiv  rangeTwoColor\"></div></td> \n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{2}\"></td>\n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{1}\"></td>\n");
      out.write("        </tr> <tr class=\"greyTabLine\"> \n");
      out.write("            <td><div class=\"colorRangeDiv  rangeThreeColor\"></div></td> \n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{4}\"></td>\n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{3}\"></td>\n");
      out.write("        </tr> <tr class=\"\"> \n");
      out.write("            <td><div class=\"colorRangeDiv  rangeFourColor\"></div></td> \n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{6}\"></td>\n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{5}\"></td>\n");
      out.write("        </tr> <tr class=\"greyTabLine\"> \n");
      out.write("            <td class=\"\"><div class=\"colorRangeDiv  rangeFiveColor\"></div></td>\n");
      out.write("            <td class=\"inifinityTd\">-&infin;</td>\n");
      out.write("            <td><input type=\"text\" class=\"rangeInput\" value=\"{7}\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </tbody>\n");
      out.write("</table>\t\t        \n");
      out.write("</div>");
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
    _jspx_th_fmt_message_0.setKey("sla.menu.single.title");
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
    _jspx_th_fmt_message_1.setKey("sla.menu.single.totalCollector");
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
    _jspx_th_fmt_message_2.setKey("sla.menu.single.totalSales");
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
    _jspx_th_fmt_message_3.setKey("sla.menu.single.totalTransactions");
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
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setKey("sla.menu.single.totalUnit");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setKey("sla.menu.comparison.title");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setKey("sla.menu.comparison.totalCollector");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(null);
    _jspx_th_fmt_message_7.setKey("sla.menu.comparison.totalSales");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(null);
    _jspx_th_fmt_message_8.setKey("sla.menu.comparison.totalTransactions");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(null);
    _jspx_th_fmt_message_9.setKey("sla.menu.comparison.totalUnit");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }
}
