package org.apache.jsp.console;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lo.config.Confs;
import com.lo.ContextParams;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_basename_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_fmt_setBundle_basename_nobody.release();
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      if (_jspx_meth_fmt_setBundle_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=8; IE=9\" />\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("        <link type=\"text/css\" href=\"../js/lib/jquery/themes/base/jquery.ui.all.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link type=\"text/css\" href=\"../js/lib/jquery/themes/tableSorter/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/lib/korem.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/locales/en.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            colorTabShown = false;\r\n");
      out.write("            tradeAreaHistoryShown = false;\r\n");
      out.write("            groupLayerManagementShown = false;\r\n");
      out.write("            \r\n");
      out.write("            am.consoleConfig = {\r\n");
      out.write("                datagrids: {\r\n");
      out.write("                    pageSize: ");
      out.print( Confs.CONSOLE_CONFIG.datagridsPageSize() );
      out.write(",\r\n");
      out.write("                    tradeAreas: {\r\n");
      out.write("                        pageSize: ");
      out.print( Confs.CONSOLE_CONFIG.datagridsTradeAreasPageSize());
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\"  src=\"../js/lib/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\"  src=\"../js/lib/jquery/jquery-ui-1.10.4.custom.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\"  src=\"../js/lib/jquery/jquery.tablesorter.min.js\"></script>\r\n");
      out.write("        <link href=\"../js/lib/ext4/resources/css/ext-all-gray.css\"  rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/lib/ext4/ext-all-debug.js\"></script>\r\n");
      out.write("        <!--the color picker plugin-->        \r\n");
      out.write("        <link href=\"../js/lib/ext4/ux/grid/css/GridFilters.css\"  rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../js/lib/ext4/ux/grid/css/RangeMenu.css\"  rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"../js/lib/jscolor/colorpicker.css\"  rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/lib/jscolor/jscolor.js\"></script>  \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/app.js\"></script>  \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/ext-overrides.js\"></script>  \r\n");
      out.write("        <link href=\"main.css\"  rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            ContextParams cp = ContextParams.get(session);
            boolean legal = cp.getUser().isAdmin();
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var colorTab = null;\r\n");
      out.write("            \r\n");
      out.write("            $(function() {\r\n");
      out.write("                var $tabs = $(\"#tabs\").tabs({\r\n");
      out.write("                    activate: function(e, ui) {\r\n");
      out.write("                        var thistab = ui;\r\n");
      out.write("                        var active = $( \"#tabs\" ).tabs( \"option\", \"active\" );\r\n");
      out.write("                        showTab(active);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                var legal = ");
      out.print(legal);
      out.write(";\r\n");
      out.write("                if (!legal) {\r\n");
      out.write("                    window.location = '../console';\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            function showTab(thistab) {\r\n");
      out.write("                selectedtab = thistab;\r\n");
      out.write("                if (selectedtab != 2) {\r\n");
      out.write("                    colorTab && colorTab.fireEvent('tabHidden');\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                switch (thistab) {\r\n");
      out.write("                    case 0:\r\n");
      out.write("                        console.log('0');\r\n");
      out.write("                        break;\r\n");
      out.write("\r\n");
      out.write("                    case 1:\r\n");
      out.write("                        console.log('01');\r\n");
      out.write("                        break;\r\n");
      out.write("\r\n");
      out.write("                    case 2:\r\n");
      out.write("                        console.log('02');\r\n");
      out.write("                        if (colorTabShown == false) {\r\n");
      out.write("                            colorTabShown = true;\r\n");
      out.write("                            Ext.create('Ext.panel.Panel', {\r\n");
      out.write("                                renderTo: 'color-grid',\r\n");
      out.write("                                layout: 'fit',\r\n");
      out.write("                                width: 925,\r\n");
      out.write("                                items: [\r\n");
      out.write("                                    colorTab = Ext.create('AMAP.view.locationcolorlist')\r\n");
      out.write("                                ]\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                        break;\r\n");
      out.write("\r\n");
      out.write("                    case 3:\r\n");
      out.write("                        console.log('03');\r\n");
      out.write("                        if (tradeAreaHistoryShown == false) {\r\n");
      out.write("                            tradeAreaHistoryShown = true;\r\n");
      out.write("                            Ext.create('Ext.panel.Panel', {\r\n");
      out.write("                                renderTo: 'tradearea_div',\r\n");
      out.write("                                layout: 'fit',\r\n");
      out.write("                                width: 925,\r\n");
      out.write("                                items: [\r\n");
      out.write("                                    {\r\n");
      out.write("                                        xtype: 'tamanagementlist'\r\n");
      out.write("                                    }\r\n");
      out.write("                                ]\r\n");
      out.write("                            });\r\n");
      out.write("                            Ext.getCmp('changeDateButton').fireEvent('click');\r\n");
      out.write("                        }\r\n");
      out.write("                        break;\r\n");
      out.write("\r\n");
      out.write("                    case 4:\r\n");
      out.write("                        console.log('04');\r\n");
      out.write("                        if (groupLayerManagementShown == false) {\r\n");
      out.write("                            groupLayerManagementShown = true;\r\n");
      out.write("                            Ext.create('Ext.panel.Panel', {\r\n");
      out.write("                                renderTo: 'layer-group',\r\n");
      out.write("                                layout: 'fit',\r\n");
      out.write("                                width: 925,\r\n");
      out.write("                                items: [{\r\n");
      out.write("                                    xtype: 'layergroup'\r\n");
      out.write("                                }]\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                        break;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"divMain\" style=\"width: 970px\" >\r\n");
      out.write("            <div id=\"tabs\" style=\"height: 575px; font-size: 12px\" >\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#tabs-1\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                    <li><a href=\"#tabs-2\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                    <li><a href=\"#tabs-3\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                    <li><a href=\"#tabs-4\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                    <li><a href=\"#tabs-5\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div id=\"tabs-1\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"tabs-2\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"tabs-3\" align=\"center\" style=\"\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_import_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>                \r\n");
      out.write("                    <div id=\"tabs-4\" align=\"center\" style=\"\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_import_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"tabs-5\" align=\"center\" style=\"\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_import_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("mc.title");
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
    _jspx_th_fmt_message_1.setKey("mc.usagemonitoring");
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
    _jspx_th_fmt_message_2.setKey("mc.sponsors");
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
    _jspx_th_fmt_message_3.setKey("mc.colormanagement");
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
    _jspx_th_fmt_message_4.setKey("mc.tahistorymanagement");
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
    _jspx_th_fmt_message_5.setKey("mc.layergroupmanagement");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("/console/jspf/monitoring.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setUrl("/console/jspf/sponsors.jsp");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_2.setPageContext(_jspx_page_context);
    _jspx_th_c_import_2.setParent(null);
    _jspx_th_c_import_2.setUrl("/console/jspf/colorManagement.jsp");
    int[] _jspx_push_body_count_c_import_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_2 = _jspx_th_c_import_2.doStartTag();
      if (_jspx_th_c_import_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_2.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_3 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_3.setPageContext(_jspx_page_context);
    _jspx_th_c_import_3.setParent(null);
    _jspx_th_c_import_3.setUrl("/console/jspf/tradeareamanagement.jsp");
    int[] _jspx_push_body_count_c_import_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_3 = _jspx_th_c_import_3.doStartTag();
      if (_jspx_th_c_import_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_3.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_4 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_4.setPageContext(_jspx_page_context);
    _jspx_th_c_import_4.setParent(null);
    _jspx_th_c_import_4.setUrl("/console/jspf/layergroupmanagement.jsp");
    int[] _jspx_push_body_count_c_import_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_4 = _jspx_th_c_import_4.doStartTag();
      if (_jspx_th_c_import_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_4.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_4);
    }
    return false;
  }
}
