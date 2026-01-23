package com.robinhood.android.tradingtrends.microgram;

import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import microgram.p507ui.sdui.SduiChartGroup;
import microgram.p507ui.sdui.SduiComponent;

/* compiled from: TradingTrendsMicrogramSduiConverters.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsMicrogramSduiConverters;", "", "convertChartGroup", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "chartGroup", "Lmicrogram/ui/sdui/SduiChartGroup;", "convertUiComponent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component", "Lmicrogram/ui/sdui/SduiComponent;", "lib-trading-trends-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TradingTrendsMicrogramSduiConverters {
    ChartGroup<GenericAction> convertChartGroup(SduiChartGroup chartGroup);

    UIComponent<?> convertUiComponent(SduiComponent component);
}
