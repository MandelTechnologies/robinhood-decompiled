package com.robinhood.android.chart.blackwidowadvancedchart;

import android.webkit.WebView;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.MobileAppFeature;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderEditedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderSubmittedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSettingsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.WebBlackWidowChartMessage;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartTradeAction;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import com.robinhood.android.chart.blackwidowadvancedchart.models.YAxisLongPress;
import com.robinhood.coroutines.job.CachedJobManager7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: RealBwWebViewManager.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H¦@¢\u0006\u0002\u0010:J \u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010+H¦@¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\u0002072\u0006\u0010>\u001a\u00020+H¦@¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020\bH¦@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020GH¦@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020KH¦@¢\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020+H¦@¢\u0006\u0002\u0010AJ\u0016\u0010O\u001a\u0002072\u0006\u0010N\u001a\u00020+H¦@¢\u0006\u0002\u0010AJ\u0016\u0010P\u001a\u0002072\u0006\u0010Q\u001a\u00020RH¦@¢\u0006\u0002\u0010SJ\u0016\u0010T\u001a\u0002072\u0006\u0010Q\u001a\u00020UH¦@¢\u0006\u0002\u0010VJ\u0016\u0010W\u001a\u0002072\u0006\u0010N\u001a\u00020+H¦@¢\u0006\u0002\u0010AJ\u0016\u0010X\u001a\u0002072\u0006\u0010N\u001a\u00020+H¦@¢\u0006\u0002\u0010AR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006R \u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R \u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u001f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u001a\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0006R\u001a\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0006R\u0018\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u001e\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0006¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "webView", "Lkotlinx/coroutines/flow/Flow;", "Landroid/webkit/WebView;", "getWebView", "()Lkotlinx/coroutines/flow/Flow;", "webViewVersionUnsupported", "", "getWebViewVersionUnsupported", "chartTradeActions", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartTradeAction;", "getChartTradeActions", "spanIntervalData", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "getSpanIntervalData", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getQuote", "scrubMode", "getScrubMode", "chartSettings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "getChartSettings", "webViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "getWebViewState", "availableIndicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "getAvailableIndicators", "currentIndicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "getCurrentIndicators", "availableIndicatorTemplates", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "getAvailableIndicatorTemplates", "availableColorPickerColors", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getAvailableColorPickerColors", "activeTemplate", "getActiveTemplate", "chartUrl", "", "getChartUrl", "onYAxisLongPress", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/YAxisLongPress;", "getOnYAxisLongPress", "hapticEvents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "getHapticEvents", "chartFeatures", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;", "getChartFeatures", "sendMessage", "", "message", "Lblack_widow/contracts/mobile_app_chart/proto/v1/WebBlackWidowChartMessage;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/WebBlackWidowChartMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChartInstrument", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAccountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setWebViewTheme", "isDay", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChartSpan", "timeSpan", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChartInterval", "interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderFailedToSubmit", "refId", "notifyOrderFailedToEdit", "notifyOrderEditSuccess", "event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderSubmitSuccess", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderCanceled", "notifyOrderFailedToCancel", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BwWebViewManager extends CachedJobManager7 {
    Flow<TemplateDto> getActiveTemplate();

    Flow<List<ThemedColorDto>> getAvailableColorPickerColors();

    Flow<List<TemplateDto>> getAvailableIndicatorTemplates();

    Flow<SetIndicatorsDto> getAvailableIndicators();

    Flow<List<MobileAppFeature>> getChartFeatures();

    Flow<SetChartSettingsDto> getChartSettings();

    Flow<ChartTradeAction> getChartTradeActions();

    Flow<String> getChartUrl();

    Flow<List<IndicatorStateDto>> getCurrentIndicators();

    Flow<HapticDto> getHapticEvents();

    Flow<YAxisLongPress> getOnYAxisLongPress();

    Flow<QuoteDto> getQuote();

    Flow<Boolean> getScrubMode();

    Flow<SpanIntervalData> getSpanIntervalData();

    Flow<WebView> getWebView();

    Flow<BwWebViewManagerState> getWebViewState();

    Flow<Boolean> getWebViewVersionUnsupported();

    Object notifyOrderCanceled(String str, Continuation<? super Unit> continuation);

    Object notifyOrderEditSuccess(OrderEditedEvent orderEditedEvent, Continuation<? super Unit> continuation);

    Object notifyOrderFailedToCancel(String str, Continuation<? super Unit> continuation);

    Object notifyOrderFailedToEdit(String str, Continuation<? super Unit> continuation);

    Object notifyOrderFailedToSubmit(String str, Continuation<? super Unit> continuation);

    Object notifyOrderSubmitSuccess(OrderSubmittedEvent orderSubmittedEvent, Continuation<? super Unit> continuation);

    Object sendMessage(WebBlackWidowChartMessage webBlackWidowChartMessage, Continuation<? super Unit> continuation);

    Object setAccountNumber(String str, Continuation<? super Unit> continuation);

    Object setChartInstrument(SetChartInstrumentDto.InstrumentDto instrumentDto, String str, Continuation<? super Unit> continuation);

    Object setChartInterval(IntervalDto intervalDto, Continuation<? super Unit> continuation);

    Object setChartSpan(TimeSpanDto timeSpanDto, Continuation<? super Unit> continuation);

    Object setWebViewTheme(boolean z, Continuation<? super Unit> continuation);
}
