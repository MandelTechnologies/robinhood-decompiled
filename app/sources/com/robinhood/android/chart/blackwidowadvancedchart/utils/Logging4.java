package com.robinhood.android.chart.blackwidowadvancedchart.utils;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logging.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a®\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0000¨\u0006\u0018"}, m3636d2 = {"updateEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "selectedSpan", "", "selectedInterval", "selectedTemplate", "activeIndicators", "", "instrumentId", "tradeAmount", "", "autoSendEnabled", "", "indicatorId", "setId", "indicatorSettings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;", "chartSettings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "refId", "searchQuery", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.LoggingKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Logging4 {
    public static /* synthetic */ UserInteractionEventDescriptor updateEventDescriptor$default(UserInteractionEventDescriptor userInteractionEventDescriptor, Component component, String str, String str2, String str3, List list, String str4, double d, boolean z, String str5, String str6, LegendAdvancedChartsContext.IndicatorSettings indicatorSettings, LegendAdvancedChartsContext.ChartSettings chartSettings, double d2, String str7, String str8, int i, Object obj) {
        String selected_span;
        String selected_interval;
        String selected_template;
        List listEmptyList;
        String instrument_id;
        double trade_amount;
        boolean auto_send_enabled;
        String indicator_id;
        String set_id;
        LegendAdvancedChartsContext.IndicatorSettings indicator_settings;
        LegendAdvancedChartsContext.ChartSettings chart_settings;
        double price;
        String ref_id;
        LegendAdvancedChartsContext legend_advanced_charts_context;
        LegendAdvancedChartsContext legend_advanced_charts_context2;
        LegendAdvancedChartsContext legend_advanced_charts_context3;
        LegendAdvancedChartsContext legend_advanced_charts_context4;
        LegendAdvancedChartsContext legend_advanced_charts_context5;
        LegendAdvancedChartsContext legend_advanced_charts_context6;
        LegendAdvancedChartsContext legend_advanced_charts_context7;
        LegendAdvancedChartsContext legend_advanced_charts_context8;
        LegendAdvancedChartsContext legend_advanced_charts_context9;
        LegendAdvancedChartsContext legend_advanced_charts_context10;
        LegendAdvancedChartsContext legend_advanced_charts_context11;
        LegendAdvancedChartsContext legend_advanced_charts_context12;
        LegendAdvancedChartsContext legend_advanced_charts_context13;
        Component component2 = (i & 1) != 0 ? null : component;
        if ((i & 2) != 0) {
            Context context = userInteractionEventDescriptor.getContext();
            if (context == null || (legend_advanced_charts_context13 = context.getLegend_advanced_charts_context()) == null || (selected_span = legend_advanced_charts_context13.getSelected_span()) == null) {
                selected_span = "";
            }
        } else {
            selected_span = str;
        }
        if ((i & 4) != 0) {
            Context context2 = userInteractionEventDescriptor.getContext();
            if (context2 == null || (legend_advanced_charts_context12 = context2.getLegend_advanced_charts_context()) == null || (selected_interval = legend_advanced_charts_context12.getSelected_interval()) == null) {
                selected_interval = "";
            }
        } else {
            selected_interval = str2;
        }
        if ((i & 8) != 0) {
            Context context3 = userInteractionEventDescriptor.getContext();
            if (context3 == null || (legend_advanced_charts_context11 = context3.getLegend_advanced_charts_context()) == null || (selected_template = legend_advanced_charts_context11.getSelected_template()) == null) {
                selected_template = "";
            }
        } else {
            selected_template = str3;
        }
        if ((i & 16) != 0) {
            Context context4 = userInteractionEventDescriptor.getContext();
            if (context4 == null || (legend_advanced_charts_context10 = context4.getLegend_advanced_charts_context()) == null || (listEmptyList = legend_advanced_charts_context10.getActive_indicators()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = list;
        }
        if ((i & 32) != 0) {
            Context context5 = userInteractionEventDescriptor.getContext();
            if (context5 == null || (legend_advanced_charts_context9 = context5.getLegend_advanced_charts_context()) == null || (instrument_id = legend_advanced_charts_context9.getInstrument_id()) == null) {
                instrument_id = "";
            }
        } else {
            instrument_id = str4;
        }
        if ((i & 64) != 0) {
            Context context6 = userInteractionEventDescriptor.getContext();
            trade_amount = (context6 == null || (legend_advanced_charts_context8 = context6.getLegend_advanced_charts_context()) == null) ? 0.0d : legend_advanced_charts_context8.getTrade_amount();
        } else {
            trade_amount = d;
        }
        if ((i & 128) != 0) {
            Context context7 = userInteractionEventDescriptor.getContext();
            auto_send_enabled = (context7 == null || (legend_advanced_charts_context7 = context7.getLegend_advanced_charts_context()) == null) ? false : legend_advanced_charts_context7.getAuto_send_enabled();
        } else {
            auto_send_enabled = z;
        }
        if ((i & 256) != 0) {
            Context context8 = userInteractionEventDescriptor.getContext();
            if (context8 == null || (legend_advanced_charts_context6 = context8.getLegend_advanced_charts_context()) == null || (indicator_id = legend_advanced_charts_context6.getIndicator_id()) == null) {
                indicator_id = "";
            }
        } else {
            indicator_id = str5;
        }
        if ((i & 512) != 0) {
            Context context9 = userInteractionEventDescriptor.getContext();
            if (context9 == null || (legend_advanced_charts_context5 = context9.getLegend_advanced_charts_context()) == null || (set_id = legend_advanced_charts_context5.getSet_id()) == null) {
                set_id = "";
            }
        } else {
            set_id = str6;
        }
        if ((i & 1024) != 0) {
            Context context10 = userInteractionEventDescriptor.getContext();
            indicator_settings = (context10 == null || (legend_advanced_charts_context4 = context10.getLegend_advanced_charts_context()) == null) ? null : legend_advanced_charts_context4.getIndicator_settings();
        } else {
            indicator_settings = indicatorSettings;
        }
        if ((i & 2048) != 0) {
            Context context11 = userInteractionEventDescriptor.getContext();
            chart_settings = (context11 == null || (legend_advanced_charts_context3 = context11.getLegend_advanced_charts_context()) == null) ? null : legend_advanced_charts_context3.getChart_settings();
        } else {
            chart_settings = chartSettings;
        }
        if ((i & 4096) != 0) {
            Context context12 = userInteractionEventDescriptor.getContext();
            price = (context12 == null || (legend_advanced_charts_context2 = context12.getLegend_advanced_charts_context()) == null) ? 0.0d : legend_advanced_charts_context2.getPrice();
        } else {
            price = d2;
        }
        if ((i & 8192) != 0) {
            Context context13 = userInteractionEventDescriptor.getContext();
            if (context13 == null || (legend_advanced_charts_context = context13.getLegend_advanced_charts_context()) == null || (ref_id = legend_advanced_charts_context.getRef_id()) == null) {
                ref_id = "";
            }
        } else {
            ref_id = str7;
        }
        return updateEventDescriptor(userInteractionEventDescriptor, component2, selected_span, selected_interval, selected_template, listEmptyList, instrument_id, trade_amount, auto_send_enabled, indicator_id, set_id, indicator_settings, chart_settings, price, ref_id, (i & 16384) != 0 ? "" : str8);
    }

    public static final UserInteractionEventDescriptor updateEventDescriptor(UserInteractionEventDescriptor userInteractionEventDescriptor, Component component, String selectedSpan, String selectedInterval, String selectedTemplate, List<String> activeIndicators, String instrumentId, double d, boolean z, String indicatorId, String setId, LegendAdvancedChartsContext.IndicatorSettings indicatorSettings, LegendAdvancedChartsContext.ChartSettings chartSettings, double d2, String refId, String searchQuery) {
        Context contextCopy$default;
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        Intrinsics.checkNotNullParameter(selectedInterval, "selectedInterval");
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        Intrinsics.checkNotNullParameter(activeIndicators, "activeIndicators");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(indicatorId, "indicatorId");
        Intrinsics.checkNotNullParameter(setId, "setId");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Context context = userInteractionEventDescriptor.getContext();
        if (context != null) {
            contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, searchQuery, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LegendAdvancedChartsContext(selectedSpan, selectedInterval, selectedTemplate, activeIndicators, instrumentId, d, z, indicatorId, setId, indicatorSettings, chartSettings, d2, refId, null, 8192, null), null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16381, null);
        } else {
            contextCopy$default = null;
        }
        return UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, contextCopy$default, component, null, 39, null);
    }
}
