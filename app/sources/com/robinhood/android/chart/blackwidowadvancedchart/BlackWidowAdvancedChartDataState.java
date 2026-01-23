package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.Chart;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: BlackWidowAdvancedChartDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0010\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0010\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0010\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010+\u001a\u00020\u0016\u0012\b\b\u0002\u0010,\u001a\u00020\u0016\u0012\b\b\u0002\u0010-\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\\\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010a\u001a\u00020\u0016HÆ\u0003J\t\u0010b\u001a\u00020\u0016HÆ\u0003J\t\u0010c\u001a\u00020\u0016HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0010HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0010HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010k\u001a\u00020%HÆ\u0003J\t\u0010l\u001a\u00020'HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020)0\u0010HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010o\u001a\u00020\u0016HÆ\u0003J\t\u0010p\u001a\u00020\u0016HÆ\u0003J\t\u0010q\u001a\u00020\u0016HÆ\u0003Já\u0002\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00102\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00102\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00102\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\u0016HÆ\u0001J\u0013\u0010s\u001a\u00020\u00162\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001f\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0011\u0010\u0018\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bE\u0010CR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bF\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010=R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=R\u0013\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0010¢\u0006\b\n\u0000\u001a\u0004\bS\u0010=R\u0013\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bT\u00105R\u0011\u0010+\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bU\u0010CR\u0011\u0010,\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bV\u0010CR\u0011\u0010-\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bW\u0010C¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;", "", "activeInstrumentId", "Ljava/util/UUID;", "activeInstrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "activeAccountNumber", "", "activeRhsAccount", "Lcom/robinhood/models/db/Account;", "unifiedSpans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "selectedSpan", "intervals", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "selectedInterval", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "scrubbing", "", "chartReady", "chartError", "chartSettingSections", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "yAxisSection", "indicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorDto;", "popularIndicators", "selectedIndicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "templates", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "selectedTemplate", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "lowerTopBarDisplayStatus", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "availableColorPickerColors", "Lrh_server_driven_ui/v1/ThemedColorDto;", "chartUrl", "webViewVersionUnsupported", "scrollingIntervalPickerEnabled", "webLoadingSkeletonEnabled", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;Ljava/lang/String;Lcom/robinhood/models/db/Account;Lkotlinx/collections/immutable/ImmutableList;Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;ZZZLjava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;Ljava/util/List;Ljava/lang/String;ZZZ)V", "getActiveInstrumentId", "()Ljava/util/UUID;", "getActiveInstrumentType", "()Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "getActiveAccountNumber", "()Ljava/lang/String;", "getActiveRhsAccount", "()Lcom/robinhood/models/db/Account;", "getUnifiedSpans", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedSpan", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "getIntervals", "()Ljava/util/List;", "getSelectedInterval", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "getQuote", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getScrubbing", "()Z", "getChartReady", "getChartError", "getChartSettingSections", "getYAxisSection", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getIndicators", "getPopularIndicators", "getSelectedIndicators", "getTemplates", "getSelectedTemplate", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "getScreenState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "getLowerTopBarDisplayStatus", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "getAvailableColorPickerColors", "getChartUrl", "getWebViewVersionUnsupported", "getScrollingIntervalPickerEnabled", "getWebLoadingSkeletonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "other", "hashCode", "", "toString", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BlackWidowAdvancedChartDataState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final UUID activeInstrumentId;
    private final BlackWidowAdvancedChartFragmentKey2 activeInstrumentType;
    private final Account activeRhsAccount;
    private final List<ThemedColorDto> availableColorPickerColors;
    private final boolean chartError;
    private final boolean chartReady;
    private final List<ChartSettingSectionDto> chartSettingSections;
    private final String chartUrl;
    private final List<IndicatorDto> indicators;
    private final List<IntervalDto> intervals;
    private final LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus;
    private final List<String> popularIndicators;
    private final QuoteDto quote;
    private final ChartScreenState screenState;
    private final boolean scrollingIntervalPickerEnabled;
    private final boolean scrubbing;
    private final List<IndicatorStateDto> selectedIndicators;
    private final IntervalDto selectedInterval;
    private final TimeSpanDto selectedSpan;
    private final TemplateDto selectedTemplate;
    private final List<TemplateDto> templates;
    private final ImmutableList<UnifiedSpan<TimeSpanDto>> unifiedSpans;
    private final boolean webLoadingSkeletonEnabled;
    private final boolean webViewVersionUnsupported;
    private final ChartSettingSectionDto yAxisSection;

    public static /* synthetic */ BlackWidowAdvancedChartDataState copy$default(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, String str, Account account, ImmutableList immutableList, TimeSpanDto timeSpanDto, List list, IntervalDto intervalDto, QuoteDto quoteDto, boolean z, boolean z2, boolean z3, List list2, ChartSettingSectionDto chartSettingSectionDto, List list3, List list4, List list5, List list6, TemplateDto templateDto, ChartScreenState chartScreenState, LowerTopBarState.DisplayStatus displayStatus, List list7, String str2, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7;
        boolean z8;
        UUID uuid2 = (i & 1) != 0 ? blackWidowAdvancedChartDataState.activeInstrumentId : uuid;
        BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey22 = (i & 2) != 0 ? blackWidowAdvancedChartDataState.activeInstrumentType : blackWidowAdvancedChartFragmentKey2;
        String str3 = (i & 4) != 0 ? blackWidowAdvancedChartDataState.activeAccountNumber : str;
        Account account2 = (i & 8) != 0 ? blackWidowAdvancedChartDataState.activeRhsAccount : account;
        ImmutableList immutableList2 = (i & 16) != 0 ? blackWidowAdvancedChartDataState.unifiedSpans : immutableList;
        TimeSpanDto timeSpanDto2 = (i & 32) != 0 ? blackWidowAdvancedChartDataState.selectedSpan : timeSpanDto;
        List list8 = (i & 64) != 0 ? blackWidowAdvancedChartDataState.intervals : list;
        IntervalDto intervalDto2 = (i & 128) != 0 ? blackWidowAdvancedChartDataState.selectedInterval : intervalDto;
        QuoteDto quoteDto2 = (i & 256) != 0 ? blackWidowAdvancedChartDataState.quote : quoteDto;
        boolean z9 = (i & 512) != 0 ? blackWidowAdvancedChartDataState.scrubbing : z;
        boolean z10 = (i & 1024) != 0 ? blackWidowAdvancedChartDataState.chartReady : z2;
        boolean z11 = (i & 2048) != 0 ? blackWidowAdvancedChartDataState.chartError : z3;
        List list9 = (i & 4096) != 0 ? blackWidowAdvancedChartDataState.chartSettingSections : list2;
        ChartSettingSectionDto chartSettingSectionDto2 = (i & 8192) != 0 ? blackWidowAdvancedChartDataState.yAxisSection : chartSettingSectionDto;
        UUID uuid3 = uuid2;
        List list10 = (i & 16384) != 0 ? blackWidowAdvancedChartDataState.indicators : list3;
        List list11 = (i & 32768) != 0 ? blackWidowAdvancedChartDataState.popularIndicators : list4;
        List list12 = (i & 65536) != 0 ? blackWidowAdvancedChartDataState.selectedIndicators : list5;
        List list13 = (i & 131072) != 0 ? blackWidowAdvancedChartDataState.templates : list6;
        TemplateDto templateDto2 = (i & 262144) != 0 ? blackWidowAdvancedChartDataState.selectedTemplate : templateDto;
        ChartScreenState chartScreenState2 = (i & 524288) != 0 ? blackWidowAdvancedChartDataState.screenState : chartScreenState;
        LowerTopBarState.DisplayStatus displayStatus2 = (i & 1048576) != 0 ? blackWidowAdvancedChartDataState.lowerTopBarDisplayStatus : displayStatus;
        List list14 = (i & 2097152) != 0 ? blackWidowAdvancedChartDataState.availableColorPickerColors : list7;
        String str4 = (i & 4194304) != 0 ? blackWidowAdvancedChartDataState.chartUrl : str2;
        boolean z12 = (i & 8388608) != 0 ? blackWidowAdvancedChartDataState.webViewVersionUnsupported : z4;
        boolean z13 = (i & 16777216) != 0 ? blackWidowAdvancedChartDataState.scrollingIntervalPickerEnabled : z5;
        if ((i & 33554432) != 0) {
            z8 = z13;
            z7 = blackWidowAdvancedChartDataState.webLoadingSkeletonEnabled;
        } else {
            z7 = z6;
            z8 = z13;
        }
        return blackWidowAdvancedChartDataState.copy(uuid3, blackWidowAdvancedChartFragmentKey22, str3, account2, immutableList2, timeSpanDto2, list8, intervalDto2, quoteDto2, z9, z10, z11, list9, chartSettingSectionDto2, list10, list11, list12, list13, templateDto2, chartScreenState2, displayStatus2, list14, str4, z12, z8, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getScrubbing() {
        return this.scrubbing;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getChartReady() {
        return this.chartReady;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getChartError() {
        return this.chartError;
    }

    public final List<ChartSettingSectionDto> component13() {
        return this.chartSettingSections;
    }

    /* renamed from: component14, reason: from getter */
    public final ChartSettingSectionDto getYAxisSection() {
        return this.yAxisSection;
    }

    public final List<IndicatorDto> component15() {
        return this.indicators;
    }

    public final List<String> component16() {
        return this.popularIndicators;
    }

    public final List<IndicatorStateDto> component17() {
        return this.selectedIndicators;
    }

    public final List<TemplateDto> component18() {
        return this.templates;
    }

    /* renamed from: component19, reason: from getter */
    public final TemplateDto getSelectedTemplate() {
        return this.selectedTemplate;
    }

    /* renamed from: component2, reason: from getter */
    public final BlackWidowAdvancedChartFragmentKey2 getActiveInstrumentType() {
        return this.activeInstrumentType;
    }

    /* renamed from: component20, reason: from getter */
    public final ChartScreenState getScreenState() {
        return this.screenState;
    }

    /* renamed from: component21, reason: from getter */
    public final LowerTopBarState.DisplayStatus getLowerTopBarDisplayStatus() {
        return this.lowerTopBarDisplayStatus;
    }

    public final List<ThemedColorDto> component22() {
        return this.availableColorPickerColors;
    }

    /* renamed from: component23, reason: from getter */
    public final String getChartUrl() {
        return this.chartUrl;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getWebViewVersionUnsupported() {
        return this.webViewVersionUnsupported;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getScrollingIntervalPickerEnabled() {
        return this.scrollingIntervalPickerEnabled;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getWebLoadingSkeletonEnabled() {
        return this.webLoadingSkeletonEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final Account getActiveRhsAccount() {
        return this.activeRhsAccount;
    }

    public final ImmutableList<UnifiedSpan<TimeSpanDto>> component5() {
        return this.unifiedSpans;
    }

    /* renamed from: component6, reason: from getter */
    public final TimeSpanDto getSelectedSpan() {
        return this.selectedSpan;
    }

    public final List<IntervalDto> component7() {
        return this.intervals;
    }

    /* renamed from: component8, reason: from getter */
    public final IntervalDto getSelectedInterval() {
        return this.selectedInterval;
    }

    /* renamed from: component9, reason: from getter */
    public final QuoteDto getQuote() {
        return this.quote;
    }

    public final BlackWidowAdvancedChartDataState copy(UUID activeInstrumentId, BlackWidowAdvancedChartFragmentKey2 activeInstrumentType, String activeAccountNumber, Account activeRhsAccount, ImmutableList<UnifiedSpan<TimeSpanDto>> unifiedSpans, TimeSpanDto selectedSpan, List<IntervalDto> intervals, IntervalDto selectedInterval, QuoteDto quote, boolean scrubbing, boolean chartReady, boolean chartError, List<ChartSettingSectionDto> chartSettingSections, ChartSettingSectionDto yAxisSection, List<IndicatorDto> indicators, List<String> popularIndicators, List<IndicatorStateDto> selectedIndicators, List<TemplateDto> templates, TemplateDto selectedTemplate, ChartScreenState screenState, LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus, List<ThemedColorDto> availableColorPickerColors, String chartUrl, boolean webViewVersionUnsupported, boolean scrollingIntervalPickerEnabled, boolean webLoadingSkeletonEnabled) {
        Intrinsics.checkNotNullParameter(activeInstrumentId, "activeInstrumentId");
        Intrinsics.checkNotNullParameter(activeInstrumentType, "activeInstrumentType");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(lowerTopBarDisplayStatus, "lowerTopBarDisplayStatus");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        return new BlackWidowAdvancedChartDataState(activeInstrumentId, activeInstrumentType, activeAccountNumber, activeRhsAccount, unifiedSpans, selectedSpan, intervals, selectedInterval, quote, scrubbing, chartReady, chartError, chartSettingSections, yAxisSection, indicators, popularIndicators, selectedIndicators, templates, selectedTemplate, screenState, lowerTopBarDisplayStatus, availableColorPickerColors, chartUrl, webViewVersionUnsupported, scrollingIntervalPickerEnabled, webLoadingSkeletonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackWidowAdvancedChartDataState)) {
            return false;
        }
        BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState = (BlackWidowAdvancedChartDataState) other;
        return Intrinsics.areEqual(this.activeInstrumentId, blackWidowAdvancedChartDataState.activeInstrumentId) && this.activeInstrumentType == blackWidowAdvancedChartDataState.activeInstrumentType && Intrinsics.areEqual(this.activeAccountNumber, blackWidowAdvancedChartDataState.activeAccountNumber) && Intrinsics.areEqual(this.activeRhsAccount, blackWidowAdvancedChartDataState.activeRhsAccount) && Intrinsics.areEqual(this.unifiedSpans, blackWidowAdvancedChartDataState.unifiedSpans) && Intrinsics.areEqual(this.selectedSpan, blackWidowAdvancedChartDataState.selectedSpan) && Intrinsics.areEqual(this.intervals, blackWidowAdvancedChartDataState.intervals) && Intrinsics.areEqual(this.selectedInterval, blackWidowAdvancedChartDataState.selectedInterval) && Intrinsics.areEqual(this.quote, blackWidowAdvancedChartDataState.quote) && this.scrubbing == blackWidowAdvancedChartDataState.scrubbing && this.chartReady == blackWidowAdvancedChartDataState.chartReady && this.chartError == blackWidowAdvancedChartDataState.chartError && Intrinsics.areEqual(this.chartSettingSections, blackWidowAdvancedChartDataState.chartSettingSections) && Intrinsics.areEqual(this.yAxisSection, blackWidowAdvancedChartDataState.yAxisSection) && Intrinsics.areEqual(this.indicators, blackWidowAdvancedChartDataState.indicators) && Intrinsics.areEqual(this.popularIndicators, blackWidowAdvancedChartDataState.popularIndicators) && Intrinsics.areEqual(this.selectedIndicators, blackWidowAdvancedChartDataState.selectedIndicators) && Intrinsics.areEqual(this.templates, blackWidowAdvancedChartDataState.templates) && Intrinsics.areEqual(this.selectedTemplate, blackWidowAdvancedChartDataState.selectedTemplate) && Intrinsics.areEqual(this.screenState, blackWidowAdvancedChartDataState.screenState) && Intrinsics.areEqual(this.lowerTopBarDisplayStatus, blackWidowAdvancedChartDataState.lowerTopBarDisplayStatus) && Intrinsics.areEqual(this.availableColorPickerColors, blackWidowAdvancedChartDataState.availableColorPickerColors) && Intrinsics.areEqual(this.chartUrl, blackWidowAdvancedChartDataState.chartUrl) && this.webViewVersionUnsupported == blackWidowAdvancedChartDataState.webViewVersionUnsupported && this.scrollingIntervalPickerEnabled == blackWidowAdvancedChartDataState.scrollingIntervalPickerEnabled && this.webLoadingSkeletonEnabled == blackWidowAdvancedChartDataState.webLoadingSkeletonEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.activeInstrumentId.hashCode() * 31) + this.activeInstrumentType.hashCode()) * 31;
        String str = this.activeAccountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Account account = this.activeRhsAccount;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        ImmutableList<UnifiedSpan<TimeSpanDto>> immutableList = this.unifiedSpans;
        int iHashCode4 = (iHashCode3 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        TimeSpanDto timeSpanDto = this.selectedSpan;
        int iHashCode5 = (iHashCode4 + (timeSpanDto == null ? 0 : timeSpanDto.hashCode())) * 31;
        List<IntervalDto> list = this.intervals;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        IntervalDto intervalDto = this.selectedInterval;
        int iHashCode7 = (iHashCode6 + (intervalDto == null ? 0 : intervalDto.hashCode())) * 31;
        QuoteDto quoteDto = this.quote;
        int iHashCode8 = (((((((iHashCode7 + (quoteDto == null ? 0 : quoteDto.hashCode())) * 31) + Boolean.hashCode(this.scrubbing)) * 31) + Boolean.hashCode(this.chartReady)) * 31) + Boolean.hashCode(this.chartError)) * 31;
        List<ChartSettingSectionDto> list2 = this.chartSettingSections;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ChartSettingSectionDto chartSettingSectionDto = this.yAxisSection;
        int iHashCode10 = (iHashCode9 + (chartSettingSectionDto == null ? 0 : chartSettingSectionDto.hashCode())) * 31;
        List<IndicatorDto> list3 = this.indicators;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.popularIndicators;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<IndicatorStateDto> list5 = this.selectedIndicators;
        int iHashCode13 = (iHashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TemplateDto> list6 = this.templates;
        int iHashCode14 = (iHashCode13 + (list6 == null ? 0 : list6.hashCode())) * 31;
        TemplateDto templateDto = this.selectedTemplate;
        int iHashCode15 = (((((((iHashCode14 + (templateDto == null ? 0 : templateDto.hashCode())) * 31) + this.screenState.hashCode()) * 31) + this.lowerTopBarDisplayStatus.hashCode()) * 31) + this.availableColorPickerColors.hashCode()) * 31;
        String str2 = this.chartUrl;
        return ((((((iHashCode15 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.webViewVersionUnsupported)) * 31) + Boolean.hashCode(this.scrollingIntervalPickerEnabled)) * 31) + Boolean.hashCode(this.webLoadingSkeletonEnabled);
    }

    public String toString() {
        return "BlackWidowAdvancedChartDataState(activeInstrumentId=" + this.activeInstrumentId + ", activeInstrumentType=" + this.activeInstrumentType + ", activeAccountNumber=" + this.activeAccountNumber + ", activeRhsAccount=" + this.activeRhsAccount + ", unifiedSpans=" + this.unifiedSpans + ", selectedSpan=" + this.selectedSpan + ", intervals=" + this.intervals + ", selectedInterval=" + this.selectedInterval + ", quote=" + this.quote + ", scrubbing=" + this.scrubbing + ", chartReady=" + this.chartReady + ", chartError=" + this.chartError + ", chartSettingSections=" + this.chartSettingSections + ", yAxisSection=" + this.yAxisSection + ", indicators=" + this.indicators + ", popularIndicators=" + this.popularIndicators + ", selectedIndicators=" + this.selectedIndicators + ", templates=" + this.templates + ", selectedTemplate=" + this.selectedTemplate + ", screenState=" + this.screenState + ", lowerTopBarDisplayStatus=" + this.lowerTopBarDisplayStatus + ", availableColorPickerColors=" + this.availableColorPickerColors + ", chartUrl=" + this.chartUrl + ", webViewVersionUnsupported=" + this.webViewVersionUnsupported + ", scrollingIntervalPickerEnabled=" + this.scrollingIntervalPickerEnabled + ", webLoadingSkeletonEnabled=" + this.webLoadingSkeletonEnabled + ")";
    }

    public BlackWidowAdvancedChartDataState(UUID activeInstrumentId, BlackWidowAdvancedChartFragmentKey2 activeInstrumentType, String str, Account account, ImmutableList<UnifiedSpan<TimeSpanDto>> immutableList, TimeSpanDto timeSpanDto, List<IntervalDto> list, IntervalDto intervalDto, QuoteDto quoteDto, boolean z, boolean z2, boolean z3, List<ChartSettingSectionDto> list2, ChartSettingSectionDto chartSettingSectionDto, List<IndicatorDto> list3, List<String> list4, List<IndicatorStateDto> list5, List<TemplateDto> list6, TemplateDto templateDto, ChartScreenState screenState, LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus, List<ThemedColorDto> availableColorPickerColors, String str2, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(activeInstrumentId, "activeInstrumentId");
        Intrinsics.checkNotNullParameter(activeInstrumentType, "activeInstrumentType");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(lowerTopBarDisplayStatus, "lowerTopBarDisplayStatus");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        this.activeInstrumentId = activeInstrumentId;
        this.activeInstrumentType = activeInstrumentType;
        this.activeAccountNumber = str;
        this.activeRhsAccount = account;
        this.unifiedSpans = immutableList;
        this.selectedSpan = timeSpanDto;
        this.intervals = list;
        this.selectedInterval = intervalDto;
        this.quote = quoteDto;
        this.scrubbing = z;
        this.chartReady = z2;
        this.chartError = z3;
        this.chartSettingSections = list2;
        this.yAxisSection = chartSettingSectionDto;
        this.indicators = list3;
        this.popularIndicators = list4;
        this.selectedIndicators = list5;
        this.templates = list6;
        this.selectedTemplate = templateDto;
        this.screenState = screenState;
        this.lowerTopBarDisplayStatus = lowerTopBarDisplayStatus;
        this.availableColorPickerColors = availableColorPickerColors;
        this.chartUrl = str2;
        this.webViewVersionUnsupported = z4;
        this.scrollingIntervalPickerEnabled = z5;
        this.webLoadingSkeletonEnabled = z6;
    }

    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
    }

    public final BlackWidowAdvancedChartFragmentKey2 getActiveInstrumentType() {
        return this.activeInstrumentType;
    }

    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public final Account getActiveRhsAccount() {
        return this.activeRhsAccount;
    }

    public final ImmutableList<UnifiedSpan<TimeSpanDto>> getUnifiedSpans() {
        return this.unifiedSpans;
    }

    public final TimeSpanDto getSelectedSpan() {
        return this.selectedSpan;
    }

    public final List<IntervalDto> getIntervals() {
        return this.intervals;
    }

    public final IntervalDto getSelectedInterval() {
        return this.selectedInterval;
    }

    public final QuoteDto getQuote() {
        return this.quote;
    }

    public final boolean getScrubbing() {
        return this.scrubbing;
    }

    public final boolean getChartReady() {
        return this.chartReady;
    }

    public final boolean getChartError() {
        return this.chartError;
    }

    public final List<ChartSettingSectionDto> getChartSettingSections() {
        return this.chartSettingSections;
    }

    public final ChartSettingSectionDto getYAxisSection() {
        return this.yAxisSection;
    }

    public final List<IndicatorDto> getIndicators() {
        return this.indicators;
    }

    public final List<String> getPopularIndicators() {
        return this.popularIndicators;
    }

    public final List<IndicatorStateDto> getSelectedIndicators() {
        return this.selectedIndicators;
    }

    public final List<TemplateDto> getTemplates() {
        return this.templates;
    }

    public final TemplateDto getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public /* synthetic */ BlackWidowAdvancedChartDataState(UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, String str, Account account, ImmutableList immutableList, TimeSpanDto timeSpanDto, List list, IntervalDto intervalDto, QuoteDto quoteDto, boolean z, boolean z2, boolean z3, List list2, ChartSettingSectionDto chartSettingSectionDto, List list3, List list4, List list5, List list6, TemplateDto templateDto, ChartScreenState chartScreenState, LowerTopBarState.DisplayStatus displayStatus, List list7, String str2, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, blackWidowAdvancedChartFragmentKey2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : account, (i & 16) != 0 ? null : immutableList, (i & 32) != 0 ? null : timeSpanDto, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : intervalDto, (i & 256) != 0 ? null : quoteDto, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? null : list2, (i & 8192) != 0 ? null : chartSettingSectionDto, (i & 16384) != 0 ? null : list3, (32768 & i) != 0 ? null : list4, (65536 & i) != 0 ? null : list5, (131072 & i) != 0 ? null : list6, (262144 & i) != 0 ? null : templateDto, (524288 & i) != 0 ? Chart.INSTANCE : chartScreenState, (1048576 & i) != 0 ? LowerTopBarState.DisplayStatus.Gone.INSTANCE : displayStatus, (2097152 & i) != 0 ? CollectionsKt.emptyList() : list7, (4194304 & i) != 0 ? null : str2, (8388608 & i) != 0 ? false : z4, (16777216 & i) != 0 ? false : z5, (i & 33554432) != 0 ? true : z6);
    }

    public final ChartScreenState getScreenState() {
        return this.screenState;
    }

    public final LowerTopBarState.DisplayStatus getLowerTopBarDisplayStatus() {
        return this.lowerTopBarDisplayStatus;
    }

    public final List<ThemedColorDto> getAvailableColorPickerColors() {
        return this.availableColorPickerColors;
    }

    public final String getChartUrl() {
        return this.chartUrl;
    }

    public final boolean getWebViewVersionUnsupported() {
        return this.webViewVersionUnsupported;
    }

    public final boolean getScrollingIntervalPickerEnabled() {
        return this.scrollingIntervalPickerEnabled;
    }

    public final boolean getWebLoadingSkeletonEnabled() {
        return this.webLoadingSkeletonEnabled;
    }
}
