package org.apache.jsp.main.jspf;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    var reportObj = {};\n");
      out.write("    var reportKmsLayer = {};\n");
      out.write("    var cancel = false;\n");
      out.write("    var reportPlacemarkInfo = {};\n");
      out.write("    var reportLayerControl = {};\n");
      out.write("    var globalOpacity = 0.5;\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    reportStatus = {\n");
      out.write("        none: \"none\",\n");
      out.write("        process: \"process\",\n");
      out.write("        ready: \"ready\"\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    am.initReportDisplay = function (status) {\n");
      out.write("        if (status == reportStatus.process) {\n");
      out.write("            $(\"#reportButtons\").hide();\n");
      out.write("            $(\"#reportProgress\").show();\n");
      out.write("            $(\"#reportDownload\").hide();\n");
      out.write("            updateProgress();\n");
      out.write("        } else if (status == reportStatus.ready) {\n");
      out.write("            $(\"#reportButtons\").hide();\n");
      out.write("            $(\"#reportProgress\").hide();\n");
      out.write("            $(\"#reportDownload\").show();\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    getGoogleType = function () {\n");
      out.write("        var googleType = \"\";\n");
      out.write("\n");
      out.write("        $(\"#baseLayers > input\").each(function() {\n");
      out.write("            if ($(this).is(\":checked\")) {\n");
      out.write("                if ($(this).val() == \"Physical\") {\n");
      out.write("                    googleType = \"terrain\";\n");
      out.write("                } else if ($(this).val() == \"Satellite\") {\n");
      out.write("                    googleType = \"satellite\";\n");
      out.write("                } else if ($(this).val() == \"Grey\") {\n");
      out.write("                    googleType = \"grey\";\n");
      out.write("                } else if ($(this).val() == \"Night\") {\n");
      out.write("                    googleType = \"night\";\n");
      out.write("                } else {\n");
      out.write("                    googleType = \"map\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        return googleType;\n");
      out.write("    };\n");
      out.write("    getTransitType = function(){\n");
      out.write("        var transitType = \"\";\n");
      out.write("        $(\".dataLayersDiv input[type='checkbox']\").each(function() {\n");
      out.write("            if ($(this).is(\":checked\")) {\n");
      out.write("                if ($(this).val() == \"Live Traffic\") {\n");
      out.write("                    transitType = \"traffic\";\n");
      out.write("                } else if($(this).val() == \"Transit\") {\n");
      out.write("                    transitType = \"transit\";\n");
      out.write("                } else {\n");
      out.write("                    transitType = \"bicycling\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        return transitType;\n");
      out.write("    }\n");
      out.write("    getActiveLayers = function () {\n");
      out.write("        var layers = \"\";\n");
      out.write("        $('#layerController').find(\".layergroup\").each(function (index) {\n");
      out.write("            $(this).find(\".layergroupchk\").each(function (index) {\n");
      out.write("                if ($(this).is(\":visible\") && this.checked === true) {\n");
      out.write("                    var value = $(this).parents(\".layerNameLine\").find(\".layerNameElement\").contents().filter(function(){return this.nodeType == 3;})[0].nodeValue.trim();\n");
      out.write("                    if (layers === \"\") {\n");
      out.write("                        //layers = layers + $(this).parents(\".layerNameLine\").find(\".layerNameElement\").html();\n");
      out.write("                        layers = layers + value;\n");
      out.write("                    } else {\n");
      out.write("                        layers = layers + \",\" + value;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        return layers;\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    getLocationKeys = function () {\n");
      out.write("        var locationKeys = \"\";\n");
      out.write("        if ($('#locationList').val() != \"\") {\n");
      out.write("            locationKeys = $('#locationList').val();\n");
      out.write("        } else {\n");
      out.write("            $('#locationList option').each(function () {\n");
      out.write("                if (locationKeys == \"\") {\n");
      out.write("                    locationKeys = locationKeys + $(this).val();\n");
      out.write("                } else {\n");
      out.write("                    locationKeys = locationKeys + \",\" + $(this).val();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        return locationKeys;\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    getThemeLayerIDs = function () {\n");
      out.write("        var themeLayerIds = \"\";\n");
      out.write("        for (var i = 0; i < reportLayerControl.layers.length; ++i) {\n");
      out.write("            var layer = reportLayerControl.layers[i].layer;\n");
      out.write("            var checkbox = reportLayerControl.layers[i].checkbox;\n");
      out.write("            if (layer.isTheme && checkbox.checked) {\n");
      out.write("                if (themeLayerIds == \"\") {\n");
      out.write("                    themeLayerIds = themeLayerIds + layer.id;\n");
      out.write("                } else {\n");
      out.write("                    themeLayerIds = themeLayerIds + \",\" + layer.id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        return themeLayerIds;\n");
      out.write("\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    generatePDF = function (reportType) {\n");
      out.write("        if (korem.get('reportButtons').style.display == 'none') {\n");
      out.write("            if (korem.get('reportProgress').style.display == 'none') {\n");
      out.write("                downloadPdf();\n");
      out.write("            }\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        cancel = false;\n");
      out.write("        var mapObj = reportObj.map.map;\n");
      out.write("\n");
      out.write("        //get the selected rollup codes and insert the in an array \n");
      out.write("        var rollupCodesFilters = [];\n");
      out.write("        if ($(\"#sponsorFilterContainer\").css('display') != 'none') {\n");
      out.write("            var selectedRollupFilters = $(\"#sponsorFilterCmb\").multiselect(\"getChecked\");\n");
      out.write("            for (var i = 0; i < selectedRollupFilters.length; i++) {\n");
      out.write("                rollupCodesFilters.push(selectedRollupFilters[i].title);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var data = {\n");
      out.write("            isTaTextHidden: '',\n");
      out.write("            methods: 'report',\n");
      out.write("            report: '',\n");
      out.write("            from: '',\n");
      out.write("            to: '',\n");
      out.write("            formatFrom: '',\n");
      out.write("            formatTo: '',\n");
      out.write("            locations: '',\n");
      out.write("            datatType: '',\n");
      out.write("            type: reportType,\n");
      out.write("            tradearea: '',\n");
      out.write("            taLayerId: '',\n");
      out.write("            issuance: '',\n");
      out.write("            distance: '',\n");
      out.write("            projected: '',\n");
      out.write("            longitude: '',\n");
      out.write("            latitude: '',\n");
      out.write("            hotspot: '',\n");
      out.write("            density: '',\n");
      out.write("            nwatch: '',\n");
      out.write("            themeLayerIds: getThemeLayerIDs,\n");
      out.write("            mapInstanceKey: reportObj.map.mapInstanceKey,\n");
      out.write("            googleType: getGoogleType(),\n");
      out.write("            transitType: getTransitType(),\n");
      out.write("            zoom: mapObj.getZoom(),\n");
      out.write("            xmin: mapObj.getExtent().transform(mapObj.projection, mapObj.displayProjection).left,\n");
      out.write("            xmax: mapObj.getExtent().transform(mapObj.projection, mapObj.displayProjection).right,\n");
      out.write("            ymin: mapObj.getExtent().transform(mapObj.projection, mapObj.displayProjection).bottom,\n");
      out.write("            ymax: mapObj.getExtent().transform(mapObj.projection, mapObj.displayProjection).top,\n");
      out.write("            centerX: mapObj.getCenter().lon,\n");
      out.write("            centerY: mapObj.getCenter().lat,\n");
      out.write("            width: reportKmsLayer.getImageSize().w,\n");
      out.write("            height: reportKmsLayer.getImageSize().h,\n");
      out.write("            locationKeys: getLocationKeys(),\n");
      out.write("            layers: getActiveLayers(),\n");
      out.write("            opacity: globalOpacity,\n");
      out.write("            rollupCodesFilters: JSON.stringify(rollupCodesFilters)\n");
      out.write("        };\n");
      out.write("        \n");
      out.write("        data.dateType = am.instance.datePickers.selectedDateType;\n");
      out.write("\n");
      out.write("        if (data.locationKeys == '");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("') {\n");
      out.write("            data.locationKeys = '';\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        data.tradearea = \"\";\n");
      out.write("        if ($(\"#tradeAreaChkProjected:checked\").val() != null) {\n");
      out.write("            data.tradearea += \"projected,\";\n");
      out.write("            data.projected = $(\"#tradeAreaTxtProjected\").val();\n");
      out.write("            data.longitude = reportPlacemarkInfo.lonLat.lon;\n");
      out.write("            data.latitude = reportPlacemarkInfo.lonLat.lat;\n");
      out.write("        }\n");
      out.write("        // trade area info\n");
      out.write("        if ($(\"#tradeAreaChkIssuance:checked\").val() != null) {\n");
      out.write("            data.tradearea += \"issuance,\";\n");
      out.write("            data.issuance = $(\"#tradeAreaSelectIssuance\").val();\n");
      out.write("        } else if ($(\"#tradeAreaChkUnits:checked\").val() != null) {\n");
      out.write("            data.tradearea += \"units,\";\n");
      out.write("            data.issuance = $(\"#tradeAreaSelectUnits\").val();\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            data.issuance = -1;\n");
      out.write("        }\n");
      out.write("        if ($(\"#tradeAreaChkDistance:checked\").val() != null) {\n");
      out.write("            data.tradearea += \"distance,\";\n");
      out.write("            data.distance = $(\"#tradeAreaTxtDistance\").val();\n");
      out.write("        } else {\n");
      out.write("            data.distance = -1;\n");
      out.write("        }\n");
      out.write("        if ($(\"#tradeAreaChkCustom:checked\").val() != null) {\n");
      out.write("            data.tradearea += \"custom,\";\n");
      out.write("            data.polygon = am.instance.customTradeArea.getJSONPolygon();\n");
      out.write("        }\n");
      out.write("        data.tradearea = data.tradearea.substring(0, data.tradearea.length - 1);\n");
      out.write("        \n");
      out.write("        //hot spot info\n");
      out.write("        if(am.instance.hotSpot.selectedCheckbox){\n");
      out.write("            data.hotspot = am.instance.hotSpot.selectedCheckbox.value;\n");
      out.write("            if(data.dateType==\"single\"){\n");
      out.write("                data.dataType = $(\"input:radio[name='hotSpotRadioSingle']:checked\").val();\n");
      out.write("            }else{\n");
      out.write("                data.dataType = $(\"input:radio[name='hotSpotCompareRadio']:checked\").val();\n");
      out.write("                data.hotspotComparisonType = $(\"#comparisonType\").val();\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // timeframe info\n");
      out.write("        data.to = $(\"#toPicker\").val();\n");
      out.write("        data.from = $(\"#fromPicker\").val();\n");
      out.write("        data.compareTo = $(\"#comparisonToPicker\").val();\n");
      out.write("        data.compareFrom = $(\"#comparisonFromPicker\").val();\n");
      out.write("        data.formatTo = formatDate($(\"#toPicker\"));\n");
      out.write("        data.formatFrom = formatDate($(\"#fromPicker\"));\n");
      out.write("\n");
      out.write("        //Minimum values info \n");
      out.write("        data.minTransactions = $(\"#minTrans\").val();\n");
      out.write("        data.minSpend = $(\"#minSpend\").val();\n");
      out.write("        data.minUnit = $(\"#minUnit\").val();\n");
      out.write("\n");
      out.write("        // report info\n");
      out.write("        if ($(\"#reportChkDistanceDecay:checked\").val() != null) {\n");
      out.write("            data.report = \"decay\";\n");
      out.write("        }\n");
      out.write("        if ($(\"#reportChkLocationSummary:checked\").val() != null) {\n");
      out.write("            data.report = \"summary\";\n");
      out.write("        }\n");
      out.write("        if ($(\"#reportChkLocationSummary:checked\").val() != null && $(\"#reportChkDistanceDecay:checked\").val() != null) {\n");
      out.write("            data.report = \"both\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        //store level analysis\n");
      out.write("        var checkboxes = $('input[name=slaAnalysisValue]');\n");
      out.write("        checkboxes.each(function () {\n");
      out.write("            if ($(this).is(\":checked\")) {\n");
      out.write("                data.slaTransactionValue = $(this).val();\n");
      out.write("                data.dateType = am.instance.datePickers.selectedDateType;\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        var inCompareMode = am.instance.mapsManager.inCompareMode;\n");
      out.write("        if (inCompareMode) {\n");
      out.write("            // var visibility = korem.get('tradeAreaInfoContainer2');\n");
      out.write("            var visibility = korem.get('tradeAreaInfoContainer2').style.visibility;\n");
      out.write("            if (visibility == \"visible\") {\n");
      out.write("                data.isTaTextHidden = 'false';\n");
      out.write("            } else {\n");
      out.write("                data.isTaTextHidden = 'true';\n");
      out.write("            }\n");
      out.write("        } else {\n");
      out.write("            // We are NOT in compare mode\n");
      out.write("            var visibility = korem.get('tradeAreaInfoContainer1').style.visibility;\n");
      out.write("            if (visibility == \"visible\") {\n");
      out.write("                data.isTaTextHidden = 'false';\n");
      out.write("            } else {\n");
      out.write("                data.isTaTextHidden = 'true';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            url: '../apply.safe',\n");
      out.write("            context: this,\n");
      out.write("            type: 'post',\n");
      out.write("            data: data,\n");
      out.write("            success: function (json) {\n");
      out.write("                $(\"#reportButtons\").hide();\n");
      out.write("                $(\"#reportProgress\").show();\n");
      out.write("                $(\"#reportDownload\").hide();\n");
      out.write("                updateProgress();\n");
      out.write("                if (json.invalid) {\n");
      out.write("                    window.location = 'expired.do';\n");
      out.write("                    document.location = 'expired.do';\n");
      out.write("                    window.alert('alert raised');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    EnableDisableBtns = function () {\n");
      out.write("        var selectedLocation = getLocationKeys();\n");
      out.write("        if (jQuery.trim($(\"#applyBtnCenter\").html()) == \"Apply\" /*&& selectedLocation != \"Please make a selection\"*/) {\n");
      out.write("            if ($(\"#reportChkDistanceDecay:checked\").val() == null\n");
      out.write("                    && $(\"#reportChkLocationSummary:checked\").val() == null) {\n");
      out.write("//                $(\"#reportBtn\").attr('disabled', true);\n");
      out.write("                $(\"#batchBtn\").attr('disabled', true);\n");
      out.write("            } else {\n");
      out.write("//                $(\"#reportBtn\").removeAttr('disabled');\n");
      out.write("                $(\"#batchBtn\").removeAttr('disabled');\n");
      out.write("            }\n");
      out.write("        } else {\n");
      out.write("//            $(\"#reportBtn\").attr('disabled', true);\n");
      out.write("            $(\"#batchBtn\").attr('disabled', true);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    EnableDisableLocSummary = function () {\n");
      out.write("        if ($(\"#tradeAreaChkDistance:checked\").val() == null &&\n");
      out.write("                $(\"#tradeAreaChkIssuance:checked\").val() == null &&\n");
      out.write("                $(\"#tradeAreaChkProjected:checked\").val() == null &&\n");
      out.write("                $(\"#tradeAreaChkCustom:checked\").val() == null &&\n");
      out.write("                $(\"#tradeAreaChkUnits:checked\").val() == null) {\n");
      out.write("            $(\"#reportChkLocationSummary\").attr('disabled', true);\n");
      out.write("            $(\"#reportChkLocationSummary\").attr('checked', false);\n");
      out.write("        } else {\n");
      out.write("            $(\"#reportChkLocationSummary\").removeAttr('disabled');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    updateProgress = function () {\n");
      out.write("        cancel = false;\n");
      out.write("        var data = {\n");
      out.write("            methods: 'report'\n");
      out.write("        };\n");
      out.write("        $.ajax({\n");
      out.write("            url: '../getProgress.safe',\n");
      out.write("            context: this,\n");
      out.write("            data: data,\n");
      out.write("            type: 'post',\n");
      out.write("            success: function (returnData) {\n");
      out.write("                if (cancel) {\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                var progressBar;\n");
      out.write("                progressBar = $(\"#reportProgressBar\").progressbar();\n");
      out.write("                progressBar.progressbar('option', 'value', returnData.progress);\n");
      out.write("                if (returnData.progress < 100) {\n");
      out.write("                    this.updateProgress();\n");
      out.write("                } else {\n");
      out.write("                    $(\"#reportButtons\").hide();\n");
      out.write("                    $(\"#reportProgress\").hide();\n");
      out.write("                    $(\"#reportDownload\").show();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    cancelPdf = function () {\n");
      out.write("        var data = {\n");
      out.write("            methods: 'report'\n");
      out.write("        };\n");
      out.write("        cancel = true;\n");
      out.write("        $.ajax({\n");
      out.write("            url: '../cancelProgress.safe',\n");
      out.write("            context: this,\n");
      out.write("            data: data,\n");
      out.write("            type: 'post',\n");
      out.write("            success: function (returnData) {\n");
      out.write("                initButtons();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    downloadPdf = function () {\n");
      out.write("        initButtons();\n");
      out.write("        window.location = 'DownloadPDF.do';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    donePdf = function () {\n");
      out.write("        cancelPdf();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    initButtons = function () {\n");
      out.write("        $(\"#reportButtons\").show();\n");
      out.write("        $(\"#reportProgress\").hide();\n");
      out.write("        $(\"#reportDownload\").hide();\n");
      out.write("        //        $('#reportChkDistanceDecay').checked = false;\n");
      out.write("        //        $('#reportChkLocationSummary').checked = false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    formatDate = function (el) {\n");
      out.write("        return $.datepicker.formatDate('yymmdd', $(el).datepicker('getDate'));\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<table class=\"fullTable tradeAreaTable\">\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"reportChkDistanceDecay\" value=\"decay\" type=\"checkbox\" /><label for=\"reportChkDistanceDecay\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <input id=\"reportChkLocationSummary\" value=\"summary\" type=\"checkbox\" disabled=\"disabled\" /><label for=\"reportChkLocationSummary\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr id=\"reportButtons\">\n");
      out.write("        <td style=\"padding-top: 40px\" >\n");
      out.write("            <input id=\"reportBtn\" value=\"");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\" onclick=\"generatePDF('report')\" type=\"button\" />\n");
      out.write("            <input id=\"batchBtn\" value=\"");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("\" onclick=\"generatePDF('batch')\" type=\"button\" disabled=\"disabled\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr id=\"reportProgress\" style=\"display:none\" >\n");
      out.write("        <td style=\"padding-top: 40px\" >\n");
      out.write("            <table class=\"fullTable\">\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"width:100%\"><div id=\"reportProgressBar\" /></td>\n");
      out.write("                    <td style=\"text-align:right\" ><input id=\"cancelBtn\" onclick=\"cancelPdf()\" value=\"");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("\" type=\"button\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    <tr id=\"reportDownload\" style=\"display:none\" >\n");
      out.write("        <td style=\"padding-top: 40px\" >\n");
      out.write("            <input id=\"downloadBtn\" value=\"");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("\" onclick=\"downloadPdf()\" type=\"button\" />\n");
      out.write("            <input id=\"doneBtn\" value=\"");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("\" onclick=\"donePdf()\" type=\"button\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<div id=\"reportDescBtn\"><!-- stuff --></div>\n");
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
    _jspx_th_fmt_message_0.setKey("apply.locations.makeSelection");
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
    _jspx_th_fmt_message_1.setKey("report.menu.decay");
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
    _jspx_th_fmt_message_2.setKey("report.menu.summary");
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
    _jspx_th_fmt_message_3.setKey("report.menu.report");
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
    _jspx_th_fmt_message_4.setKey("report.menu.batch");
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
    _jspx_th_fmt_message_5.setKey("report.menu.cancel");
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
    _jspx_th_fmt_message_6.setKey("report.menu.download");
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
    _jspx_th_fmt_message_7.setKey("report.menu.done");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }
}
