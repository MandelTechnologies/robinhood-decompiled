package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BlackWidowAdvancedChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J4\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016H\u0002J$\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002JD\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00162\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u001a\u0010)\u001a\u0004\u0018\u00010*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0016H\u0002J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0014\u00101\u001a\u0004\u0018\u00010\u00102\b\u0010/\u001a\u0004\u0018\u000100H\u0002J*\u00102\u001a\u0004\u0018\u00010\u001e2\u0014\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020605\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0002J$\u00108\u001a\u0004\u0018\u00010 2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u00162\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;", "<init>", "()V", "reduce", "dataState", "searchContentTypes", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/api/search/SearchContentType;", "activeInstrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "createTopBarState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;", "quoteState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/QuoteState;", "lowerTopBarDisplayStatus", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "createIndicatorQuickAccessState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;", "selectedIndicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "selectedTemplate", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "availableTemplates", "createBottomBarState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BottomBarState;", "spanSelectorState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/SpanSelectorState;", "intervalSelectorState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/IntervalSelectorState;", "scrollingIntervalPickerEnabled", "", "createIndicatorScreenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;", "indicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorDto;", "popularIndicators", "", "createBottomSheetState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/SettingsBottomSheetState;", "chartSettingSections", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "createQuoteState", "createSpanSelectorState", "unifiedSpans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "selectedSpan", "createIntervalSelectorState", "intervals", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "selectedInterval", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartStateProvider implements StateProvider<BlackWidowAdvancedChartDataState, BlackWidowAdvancedChartViewState> {
    public static final int $stable = 0;

    /* compiled from: BlackWidowAdvancedChartStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlackWidowAdvancedChartFragmentKey2.values().length];
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.FUTURES_CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.FUTURES_PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public BlackWidowAdvancedChartViewState reduce(BlackWidowAdvancedChartDataState dataState) {
        List listEmptyList;
        String name;
        String label;
        String label2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID activeInstrumentId = dataState.getActiveInstrumentId();
        BlackWidowAdvancedChartFragmentKey2 activeInstrumentType = dataState.getActiveInstrumentType();
        String activeAccountNumber = dataState.getActiveAccountNumber();
        boolean webViewVersionUnsupported = dataState.getWebViewVersionUnsupported();
        ImmutableList3<SearchContentType> immutableList3SearchContentTypes = searchContentTypes(dataState.getActiveInstrumentType());
        boolean chartError = dataState.getChartError();
        boolean chartReady = dataState.getChartReady();
        BentoTheme4 direction = getDirection(dataState.getQuote());
        SettingsBottomSheetState settingsBottomSheetStateCreateBottomSheetState = createBottomSheetState(dataState.getChartSettingSections());
        ChartScreenState screenState = dataState.getScreenState();
        BottomBarState bottomBarStateCreateBottomBarState = createBottomBarState(createSpanSelectorState(dataState.getUnifiedSpans(), dataState.getSelectedSpan()), createIntervalSelectorState(dataState.getIntervals(), dataState.getSelectedInterval()), dataState.getScrollingIntervalPickerEnabled());
        TopBarState topBarStateCreateTopBarState = createTopBarState(createQuoteState(dataState.getQuote()), dataState.getLowerTopBarDisplayStatus());
        TemplateDto selectedTemplate = dataState.getSelectedTemplate();
        List<TemplateDto> templates = dataState.getTemplates();
        ImmutableList immutableList = templates != null ? extensions2.toImmutableList(templates) : null;
        LowerTopBarState lowerTopBarState = new LowerTopBarState(createIndicatorQuickAccessState(dataState.getSelectedIndicators(), dataState.getSelectedTemplate(), dataState.getTemplates()), dataState.getLowerTopBarDisplayStatus());
        SlideUpScreenState slideUpScreenState = new SlideUpScreenState(createIndicatorScreenState(dataState.getIndicators(), dataState.getPopularIndicators(), dataState.getSelectedIndicators(), dataState.getSelectedTemplate()));
        ImmutableList immutableList2 = extensions2.toImmutableList(dataState.getAvailableColorPickerColors());
        String chartUrl = dataState.getChartUrl();
        ChartSettingSectionDto yAxisSection = dataState.getYAxisSection();
        TimeSpanDto selectedSpan = dataState.getSelectedSpan();
        String str = (selectedSpan == null || (label2 = selectedSpan.getLabel()) == null) ? "" : label2;
        IntervalDto selectedInterval = dataState.getSelectedInterval();
        String str2 = (selectedInterval == null || (label = selectedInterval.getLabel()) == null) ? "" : label;
        TemplateDto selectedTemplate2 = dataState.getSelectedTemplate();
        String str3 = (selectedTemplate2 == null || (name = selectedTemplate2.getName()) == null) ? "" : name;
        List<IndicatorStateDto> selectedIndicators = dataState.getSelectedIndicators();
        if (selectedIndicators == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : selectedIndicators) {
                if (IndicatorQuickAccessRowKt.isVisible((IndicatorStateDto) obj)) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((IndicatorStateDto) it.next()).getId());
            }
        }
        return new BlackWidowAdvancedChartViewState(activeInstrumentId, activeInstrumentType, activeAccountNumber, direction, chartError, chartReady, selectedTemplate, immutableList, immutableList2, chartUrl, topBarStateCreateTopBarState, lowerTopBarState, screenState, slideUpScreenState, settingsBottomSheetStateCreateBottomSheetState, bottomBarStateCreateBottomBarState, immutableList3SearchContentTypes, webViewVersionUnsupported, yAxisSection, new ChartContext(str, str2, str3, listEmptyList, Uuids.safeToString(dataState.getActiveInstrumentId())), dataState.getWebLoadingSkeletonEnabled());
    }

    private final ImmutableList3<SearchContentType> searchContentTypes(BlackWidowAdvancedChartFragmentKey2 activeInstrumentType) {
        int i = WhenMappings.$EnumSwitchMapping$0[activeInstrumentType.ordinal()];
        if (i == 1) {
            return extensions2.persistentListOf(SearchContentType.INSTRUMENTS, SearchContentType.MARKET_INDEXES);
        }
        if (i == 2) {
            return extensions2.persistentListOf(SearchContentType.CURRENCY_PAIRS);
        }
        if (i == 3 || i == 4) {
            return extensions2.persistentListOf(SearchContentType.ACTIVE_FUTURES, SearchContentType.FUTURES_CONTRACTS, SearchContentType.FUTURES_PRODUCTS);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final TopBarState createTopBarState(QuoteState quoteState, LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus) {
        return new TopBarState(quoteState, lowerTopBarDisplayStatus);
    }

    private final IndicatorQuickAccessState createIndicatorQuickAccessState(List<IndicatorStateDto> selectedIndicators, TemplateDto selectedTemplate, List<TemplateDto> availableTemplates) {
        if (selectedIndicators != null) {
            return new IndicatorQuickAccessState(extensions2.toImmutableList(selectedIndicators), selectedTemplate, availableTemplates != null ? extensions2.toImmutableList(availableTemplates) : null);
        }
        return null;
    }

    private final BottomBarState createBottomBarState(SpanSelectorState spanSelectorState, IntervalSelectorState intervalSelectorState, boolean scrollingIntervalPickerEnabled) {
        return new BottomBarState(spanSelectorState, intervalSelectorState, scrollingIntervalPickerEnabled);
    }

    private final AddIndicatorScreenState createIndicatorScreenState(List<IndicatorDto> indicators, List<String> popularIndicators, List<IndicatorStateDto> selectedIndicators, TemplateDto selectedTemplate) {
        ImmutableList immutableListPersistentListOf;
        if (indicators == null || popularIndicators == null) {
            return null;
        }
        boolean z = selectedTemplate != null;
        List<IndicatorDto> list = indicators;
        ImmutableList immutableList = extensions2.toImmutableList(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (popularIndicators.contains(((IndicatorDto) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ImmutableList immutableList2 = extensions2.toImmutableList(arrayList);
        if (selectedIndicators == null || (immutableListPersistentListOf = extensions2.toImmutableList(selectedIndicators)) == null) {
            immutableListPersistentListOf = extensions2.persistentListOf();
        }
        return new AddIndicatorScreenState(z, immutableList, immutableList2, immutableListPersistentListOf);
    }

    private final SettingsBottomSheetState createBottomSheetState(List<ChartSettingSectionDto> chartSettingSections) {
        if (chartSettingSections != null) {
            return new SettingsBottomSheetState(extensions2.toImmutableList(chartSettingSections));
        }
        return null;
    }

    private final BentoTheme4 getDirection(QuoteDto quote) {
        if (quote != null) {
            BigDecimal bigDecimalSubtract = BigDecimals7.orZero(quote.getLast_trade_price().toBigDecimalOrNull()).subtract(BigDecimals7.orZero(quote.getPrevious_close_price().toBigDecimalOrNull()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            if (BigDecimals7.isPositive(bigDecimalSubtract)) {
                return BentoTheme4.POSITIVE;
            }
            return BentoTheme4.NEGATIVE;
        }
        return BentoTheme4.POSITIVE;
    }

    private final QuoteState createQuoteState(QuoteDto quote) {
        if (quote == null) {
            return null;
        }
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(quote.getLast_trade_price().toBigDecimalOrNull());
        BigDecimal bigDecimalOrZero2 = BigDecimals7.orZero(quote.getPrevious_close_price().toBigDecimalOrNull());
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(Formats.getCurrencyFormat().format(bigDecimalOrZero));
        int i = C10963R.string.top_bar_precent_change;
        NumberFormatter hundredthPercentFormat = Formats.getHundredthPercentFormat();
        BigDecimal bigDecimalSubtract = bigDecimalOrZero.subtract(bigDecimalOrZero2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new QuoteState(stringResourceInvoke, companion.invoke(i, hundredthPercentFormat.format(BigDecimals7.safeDivide(bigDecimalSubtract.abs(), bigDecimalOrZero2))));
    }

    private final SpanSelectorState createSpanSelectorState(ImmutableList<UnifiedSpan<TimeSpanDto>> unifiedSpans, TimeSpanDto selectedSpan) {
        if (unifiedSpans == null || selectedSpan == null) {
            return null;
        }
        return new SpanSelectorState(unifiedSpans, selectedSpan);
    }

    private final IntervalSelectorState createIntervalSelectorState(List<IntervalDto> intervals, IntervalDto selectedInterval) {
        if (intervals == null || selectedInterval == null) {
            return null;
        }
        return new IntervalSelectorState(selectedInterval, extensions2.toImmutableList(intervals));
    }
}
