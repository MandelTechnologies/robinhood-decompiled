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
import com.robinhood.coroutines.job.CachedJobManager5;
import com.robinhood.coroutines.job.CachedJobManager7;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: RealBwWebViewManager.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0096@¢\u0006\u0002\u0010?J \u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u000100H\u0096@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020<2\u0006\u0010C\u001a\u000200H\u0096@¢\u0006\u0002\u0010FJ\u0016\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010IJ\u0016\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020LH\u0096@¢\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0096@¢\u0006\u0002\u0010QJ\u0016\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u000200H\u0096@¢\u0006\u0002\u0010FJ\u0016\u0010T\u001a\u00020<2\u0006\u0010S\u001a\u000200H\u0096@¢\u0006\u0002\u0010FJ\u0016\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020WH\u0096@¢\u0006\u0002\u0010XJ\u0016\u0010Y\u001a\u00020<2\u0006\u0010V\u001a\u00020ZH\u0096@¢\u0006\u0002\u0010[J\u0016\u0010\\\u001a\u00020<2\u0006\u0010S\u001a\u000200H\u0096@¢\u0006\u0002\u0010FJ\u0016\u0010]\u001a\u00020<2\u0006\u0010S\u001a\u000200H\u0096@¢\u0006\u0002\u0010FJ\u000e\u0010^\u001a\u00020_H\u0096A¢\u0006\u0002\u0010`R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000bR\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010$0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000bR\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010$0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000bR\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010$0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u000bR\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u000bR\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000bR \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090$0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u000b¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/RealBwWebViewManager;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "bwWebViewCachedJobManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewCachedJobManager;", "<init>", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewCachedJobManager;)V", "webView", "Lkotlinx/coroutines/flow/Flow;", "Landroid/webkit/WebView;", "getWebView", "()Lkotlinx/coroutines/flow/Flow;", "webViewVersionUnsupported", "", "getWebViewVersionUnsupported", "chartTradeActions", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartTradeAction;", "getChartTradeActions", "spanIntervalData", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "getSpanIntervalData", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getQuote", "scrubMode", "getScrubMode", "chartSettings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "getChartSettings", "webViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "getWebViewState", "availableIndicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "getAvailableIndicators", "currentIndicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "getCurrentIndicators", "availableIndicatorTemplates", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "getAvailableIndicatorTemplates", "availableColorPickerColors", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getAvailableColorPickerColors", "activeTemplate", "getActiveTemplate", "chartUrl", "", "getChartUrl", "onYAxisLongPress", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/YAxisLongPress;", "getOnYAxisLongPress", "hapticEvents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "getHapticEvents", "chartFeatures", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;", "getChartFeatures", "sendMessage", "", "message", "Lblack_widow/contracts/mobile_app_chart/proto/v1/WebBlackWidowChartMessage;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/WebBlackWidowChartMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChartInstrument", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAccountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setWebViewTheme", "isDay", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChartSpan", "timeSpan", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChartInterval", "interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderFailedToSubmit", "refId", "notifyOrderFailedToEdit", "notifyOrderEditSuccess", "event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderSubmitSuccess", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderCanceled", "notifyOrderFailedToCancel", "retainUntilCanceled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RealBwWebViewManager implements BwWebViewManager, CachedJobManager7 {
    public static final int $stable = 8;
    private final Flow<TemplateDto> activeTemplate;
    private final Flow<List<ThemedColorDto>> availableColorPickerColors;
    private final Flow<List<TemplateDto>> availableIndicatorTemplates;
    private final Flow<SetIndicatorsDto> availableIndicators;
    private final BwWebViewCachedJobManager bwWebViewCachedJobManager;
    private final Flow<List<MobileAppFeature>> chartFeatures;
    private final Flow<SetChartSettingsDto> chartSettings;
    private final Flow<ChartTradeAction> chartTradeActions;
    private final Flow<String> chartUrl;
    private final Flow<List<IndicatorStateDto>> currentIndicators;
    private final Flow<HapticDto> hapticEvents;
    private final Flow<YAxisLongPress> onYAxisLongPress;
    private final Flow<QuoteDto> quote;
    private final Flow<Boolean> scrubMode;
    private final Flow<SpanIntervalData> spanIntervalData;
    private final Flow<WebView> webView;
    private final Flow<BwWebViewManagerState> webViewState;
    private final Flow<Boolean> webViewVersionUnsupported;

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return this.bwWebViewCachedJobManager.retainUntilCanceled(continuation);
    }

    public RealBwWebViewManager(BwWebViewCachedJobManager bwWebViewCachedJobManager) {
        Intrinsics.checkNotNullParameter(bwWebViewCachedJobManager, "bwWebViewCachedJobManager");
        this.bwWebViewCachedJobManager = bwWebViewCachedJobManager;
        this.webView = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$webView$1(null));
        this.webViewVersionUnsupported = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$webViewVersionUnsupported$1(null));
        this.chartTradeActions = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$chartTradeActions$1(null));
        this.spanIntervalData = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$spanIntervalData$1(null));
        this.quote = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$quote$1(null));
        this.scrubMode = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$scrubMode$1(null));
        this.chartSettings = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$chartSettings$1(null));
        this.webViewState = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$webViewState$1(null));
        this.availableIndicators = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$availableIndicators$1(null));
        this.currentIndicators = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$currentIndicators$1(null));
        this.availableIndicatorTemplates = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$availableIndicatorTemplates$1(null));
        this.availableColorPickerColors = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$availableColorPickerColors$1(null));
        this.activeTemplate = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$activeTemplate$1(null));
        this.chartUrl = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$chartUrl$1(null));
        this.onYAxisLongPress = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$onYAxisLongPress$1(null));
        this.hapticEvents = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$hapticEvents$1(null));
        this.chartFeatures = CachedJobManager5.flowFrom(bwWebViewCachedJobManager, new RealBwWebViewManager$chartFeatures$1(null));
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<WebView> getWebView() {
        return this.webView;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<Boolean> getWebViewVersionUnsupported() {
        return this.webViewVersionUnsupported;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<ChartTradeAction> getChartTradeActions() {
        return this.chartTradeActions;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<SpanIntervalData> getSpanIntervalData() {
        return this.spanIntervalData;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<QuoteDto> getQuote() {
        return this.quote;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<Boolean> getScrubMode() {
        return this.scrubMode;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<SetChartSettingsDto> getChartSettings() {
        return this.chartSettings;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<BwWebViewManagerState> getWebViewState() {
        return this.webViewState;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<SetIndicatorsDto> getAvailableIndicators() {
        return this.availableIndicators;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<List<IndicatorStateDto>> getCurrentIndicators() {
        return this.currentIndicators;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<List<TemplateDto>> getAvailableIndicatorTemplates() {
        return this.availableIndicatorTemplates;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<List<ThemedColorDto>> getAvailableColorPickerColors() {
        return this.availableColorPickerColors;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<TemplateDto> getActiveTemplate() {
        return this.activeTemplate;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<String> getChartUrl() {
        return this.chartUrl;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<YAxisLongPress> getOnYAxisLongPress() {
        return this.onYAxisLongPress;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<HapticDto> getHapticEvents() {
        return this.hapticEvents;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Flow<List<MobileAppFeature>> getChartFeatures() {
        return this.chartFeatures;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$sendMessage$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$sendMessage$2 */
    static final class C106212 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ WebBlackWidowChartMessage $message;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106212(WebBlackWidowChartMessage webBlackWidowChartMessage, Continuation<? super C106212> continuation) {
            super(3, continuation);
            this.$message = webBlackWidowChartMessage;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106212 c106212 = new C106212(this.$message, continuation);
            c106212.L$0 = bwWebViewComponent;
            return c106212.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).sendMessage(this.$message);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object sendMessage(WebBlackWidowChartMessage webBlackWidowChartMessage, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106212(webBlackWidowChartMessage, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setChartInstrument$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setChartInstrument$2 */
    static final class C106232 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ SetChartInstrumentDto.InstrumentDto $instrument;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106232(SetChartInstrumentDto.InstrumentDto instrumentDto, String str, Continuation<? super C106232> continuation) {
            super(3, continuation);
            this.$instrument = instrumentDto;
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106232 c106232 = new C106232(this.$instrument, this.$accountNumber, continuation);
            c106232.L$0 = bwWebViewComponent;
            return c106232.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).setChartInstrument(this.$instrument, this.$accountNumber);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object setChartInstrument(SetChartInstrumentDto.InstrumentDto instrumentDto, String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106232(instrumentDto, str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setAccountNumber$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setAccountNumber$2 */
    static final class C106222 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106222(String str, Continuation<? super C106222> continuation) {
            super(3, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106222 c106222 = new C106222(this.$accountNumber, continuation);
            c106222.L$0 = bwWebViewComponent;
            return c106222.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).setAccountNumber(this.$accountNumber);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object setAccountNumber(String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106222(str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setWebViewTheme$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setWebViewTheme$2 */
    static final class C106262 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isDay;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106262(boolean z, Continuation<? super C106262> continuation) {
            super(3, continuation);
            this.$isDay = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106262 c106262 = new C106262(this.$isDay, continuation);
            c106262.L$0 = bwWebViewComponent;
            return c106262.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).setWebViewTheme(this.$isDay);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object setWebViewTheme(boolean z, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106262(z, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setChartSpan$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setChartSpan$2 */
    static final class C106252 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ TimeSpanDto $timeSpan;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106252(TimeSpanDto timeSpanDto, Continuation<? super C106252> continuation) {
            super(3, continuation);
            this.$timeSpan = timeSpanDto;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106252 c106252 = new C106252(this.$timeSpan, continuation);
            c106252.L$0 = bwWebViewComponent;
            return c106252.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).setChartSpan(this.$timeSpan);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object setChartSpan(TimeSpanDto timeSpanDto, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106252(timeSpanDto, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setChartInterval$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$setChartInterval$2 */
    static final class C106242 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ IntervalDto $interval;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106242(IntervalDto intervalDto, Continuation<? super C106242> continuation) {
            super(3, continuation);
            this.$interval = intervalDto;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106242 c106242 = new C106242(this.$interval, continuation);
            c106242.L$0 = bwWebViewComponent;
            return c106242.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).setChartInterval(this.$interval);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object setChartInterval(IntervalDto intervalDto, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106242(intervalDto, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderFailedToSubmit$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderFailedToSubmit$2 */
    static final class C106192 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $refId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106192(String str, Continuation<? super C106192> continuation) {
            super(3, continuation);
            this.$refId = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106192 c106192 = new C106192(this.$refId, continuation);
            c106192.L$0 = bwWebViewComponent;
            return c106192.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).notifyOrderFailedToSubmit(this.$refId);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object notifyOrderFailedToSubmit(String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106192(str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderFailedToEdit$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderFailedToEdit$2 */
    static final class C106182 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $refId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106182(String str, Continuation<? super C106182> continuation) {
            super(3, continuation);
            this.$refId = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106182 c106182 = new C106182(this.$refId, continuation);
            c106182.L$0 = bwWebViewComponent;
            return c106182.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).notifyOrderFailedToEdit(this.$refId);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object notifyOrderFailedToEdit(String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106182(str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderEditSuccess$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderEditSuccess$2 */
    static final class C106162 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderEditedEvent $event;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106162(OrderEditedEvent orderEditedEvent, Continuation<? super C106162> continuation) {
            super(3, continuation);
            this.$event = orderEditedEvent;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106162 c106162 = new C106162(this.$event, continuation);
            c106162.L$0 = bwWebViewComponent;
            return c106162.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).notifyOrderEditSuccess(this.$event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object notifyOrderEditSuccess(OrderEditedEvent orderEditedEvent, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106162(orderEditedEvent, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderSubmitSuccess$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderSubmitSuccess$2 */
    static final class C106202 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderSubmittedEvent $event;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106202(OrderSubmittedEvent orderSubmittedEvent, Continuation<? super C106202> continuation) {
            super(3, continuation);
            this.$event = orderSubmittedEvent;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106202 c106202 = new C106202(this.$event, continuation);
            c106202.L$0 = bwWebViewComponent;
            return c106202.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).notifyOrderSubmitSuccess(this.$event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object notifyOrderSubmitSuccess(OrderSubmittedEvent orderSubmittedEvent, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106202(orderSubmittedEvent, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderCanceled$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderCanceled$2 */
    static final class C106152 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $refId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106152(String str, Continuation<? super C106152> continuation) {
            super(3, continuation);
            this.$refId = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106152 c106152 = new C106152(this.$refId, continuation);
            c106152.L$0 = bwWebViewComponent;
            return c106152.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).notifyOrderCanceled(this.$refId);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object notifyOrderCanceled(String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106152(str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    /* compiled from: RealBwWebViewManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "manager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderFailedToCancel$2", m3645f = "RealBwWebViewManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.RealBwWebViewManager$notifyOrderFailedToCancel$2 */
    static final class C106172 extends ContinuationImpl7 implements Function3<CoroutineScope, BwWebViewComponent, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $refId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C106172(String str, Continuation<? super C106172> continuation) {
            super(3, continuation);
            this.$refId = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
            C106172 c106172 = new C106172(this.$refId, continuation);
            c106172.L$0 = bwWebViewComponent;
            return c106172.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BwWebViewComponent) this.L$0).notifyOrderFailedToCancel(this.$refId);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager
    public Object notifyOrderFailedToCancel(String str, Continuation<? super Unit> continuation) {
        Object objExecute = this.bwWebViewCachedJobManager.execute(new C106172(str, null), continuation);
        return objExecute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }
}
