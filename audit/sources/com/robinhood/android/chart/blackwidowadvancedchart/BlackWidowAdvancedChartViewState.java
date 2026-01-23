package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020\u000b¢\u0006\u0004\b(\u0010)J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0015HÆ\u0003J\t\u0010Y\u001a\u00020\u0017HÆ\u0003J\t\u0010Z\u001a\u00020\u0019HÆ\u0003J\t\u0010[\u001a\u00020\u001bHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010]\u001a\u00020\u001fHÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020!0\u0010HÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010a\u001a\u00020&HÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003Jù\u0001\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00102\b\b\u0002\u0010\"\u001a\u00020\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u000bHÆ\u0001J\u0013\u0010d\u001a\u00020\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0011\u0010\"\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010'\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u00103¨\u0006i"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;", "", "activeInstrumentId", "Ljava/util/UUID;", "activeInstrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "activeAccountNumber", "", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "chartError", "", "loadingComplete", "selectedTemplate", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "availableTemplates", "Lkotlinx/collections/immutable/ImmutableList;", "availableColorPickerColors", "Lrh_server_driven_ui/v1/ThemedColorDto;", "chartUrl", "topBarState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;", "lowerTopBarState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState;", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "slideUpScreenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/SlideUpScreenState;", "settingsBottomSheetState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/SettingsBottomSheetState;", "bottomBarState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BottomBarState;", "searchContentTypes", "Lcom/robinhood/models/api/search/SearchContentType;", "webViewVersionUnsupported", "yAxisSection", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "chartContext", "Lcom/robinhood/android/chart/blackwidowadvancedchart/ChartContext;", "webLoadingSkeletonEnabled", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;Ljava/lang/String;Lcom/robinhood/compose/bento/theme/Direction;ZZLblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState;Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;Lcom/robinhood/android/chart/blackwidowadvancedchart/SlideUpScreenState;Lcom/robinhood/android/chart/blackwidowadvancedchart/SettingsBottomSheetState;Lcom/robinhood/android/chart/blackwidowadvancedchart/BottomBarState;Lkotlinx/collections/immutable/ImmutableList;ZLblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;Lcom/robinhood/android/chart/blackwidowadvancedchart/ChartContext;Z)V", "getActiveInstrumentId", "()Ljava/util/UUID;", "getActiveInstrumentType", "()Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "getActiveAccountNumber", "()Ljava/lang/String;", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getChartError", "()Z", "getLoadingComplete", "getSelectedTemplate", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "getAvailableTemplates", "()Lkotlinx/collections/immutable/ImmutableList;", "getAvailableColorPickerColors", "getChartUrl", "getTopBarState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;", "getLowerTopBarState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState;", "getScreenState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "getSlideUpScreenState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/SlideUpScreenState;", "getSettingsBottomSheetState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/SettingsBottomSheetState;", "getBottomBarState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BottomBarState;", "getSearchContentTypes", "getWebViewVersionUnsupported", "getYAxisSection", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSectionDto;", "getChartContext", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/ChartContext;", "getWebLoadingSkeletonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "", "toString", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BlackWidowAdvancedChartViewState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final UUID activeInstrumentId;
    private final BlackWidowAdvancedChartFragmentKey2 activeInstrumentType;
    private final ImmutableList<ThemedColorDto> availableColorPickerColors;
    private final ImmutableList<TemplateDto> availableTemplates;
    private final BottomBarState bottomBarState;
    private final ChartContext chartContext;
    private final boolean chartError;
    private final String chartUrl;
    private final BentoTheme4 direction;
    private final boolean loadingComplete;
    private final LowerTopBarState lowerTopBarState;
    private final ChartScreenState screenState;
    private final ImmutableList<SearchContentType> searchContentTypes;
    private final TemplateDto selectedTemplate;
    private final SettingsBottomSheetState settingsBottomSheetState;
    private final SlideUpScreenState slideUpScreenState;
    private final TopBarState topBarState;
    private final boolean webLoadingSkeletonEnabled;
    private final boolean webViewVersionUnsupported;
    private final ChartSettingSectionDto yAxisSection;

    public static /* synthetic */ BlackWidowAdvancedChartViewState copy$default(BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState, UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, String str, BentoTheme4 bentoTheme4, boolean z, boolean z2, TemplateDto templateDto, ImmutableList immutableList, ImmutableList immutableList2, String str2, TopBarState topBarState, LowerTopBarState lowerTopBarState, ChartScreenState chartScreenState, SlideUpScreenState slideUpScreenState, SettingsBottomSheetState settingsBottomSheetState, BottomBarState bottomBarState, ImmutableList immutableList3, boolean z3, ChartSettingSectionDto chartSettingSectionDto, ChartContext chartContext, boolean z4, int i, Object obj) {
        boolean z5;
        ChartContext chartContext2;
        UUID uuid2 = (i & 1) != 0 ? blackWidowAdvancedChartViewState.activeInstrumentId : uuid;
        BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey22 = (i & 2) != 0 ? blackWidowAdvancedChartViewState.activeInstrumentType : blackWidowAdvancedChartFragmentKey2;
        String str3 = (i & 4) != 0 ? blackWidowAdvancedChartViewState.activeAccountNumber : str;
        BentoTheme4 bentoTheme42 = (i & 8) != 0 ? blackWidowAdvancedChartViewState.direction : bentoTheme4;
        boolean z6 = (i & 16) != 0 ? blackWidowAdvancedChartViewState.chartError : z;
        boolean z7 = (i & 32) != 0 ? blackWidowAdvancedChartViewState.loadingComplete : z2;
        TemplateDto templateDto2 = (i & 64) != 0 ? blackWidowAdvancedChartViewState.selectedTemplate : templateDto;
        ImmutableList immutableList4 = (i & 128) != 0 ? blackWidowAdvancedChartViewState.availableTemplates : immutableList;
        ImmutableList immutableList5 = (i & 256) != 0 ? blackWidowAdvancedChartViewState.availableColorPickerColors : immutableList2;
        String str4 = (i & 512) != 0 ? blackWidowAdvancedChartViewState.chartUrl : str2;
        TopBarState topBarState2 = (i & 1024) != 0 ? blackWidowAdvancedChartViewState.topBarState : topBarState;
        LowerTopBarState lowerTopBarState2 = (i & 2048) != 0 ? blackWidowAdvancedChartViewState.lowerTopBarState : lowerTopBarState;
        ChartScreenState chartScreenState2 = (i & 4096) != 0 ? blackWidowAdvancedChartViewState.screenState : chartScreenState;
        SlideUpScreenState slideUpScreenState2 = (i & 8192) != 0 ? blackWidowAdvancedChartViewState.slideUpScreenState : slideUpScreenState;
        UUID uuid3 = uuid2;
        SettingsBottomSheetState settingsBottomSheetState2 = (i & 16384) != 0 ? blackWidowAdvancedChartViewState.settingsBottomSheetState : settingsBottomSheetState;
        BottomBarState bottomBarState2 = (i & 32768) != 0 ? blackWidowAdvancedChartViewState.bottomBarState : bottomBarState;
        ImmutableList immutableList6 = (i & 65536) != 0 ? blackWidowAdvancedChartViewState.searchContentTypes : immutableList3;
        boolean z8 = (i & 131072) != 0 ? blackWidowAdvancedChartViewState.webViewVersionUnsupported : z3;
        ChartSettingSectionDto chartSettingSectionDto2 = (i & 262144) != 0 ? blackWidowAdvancedChartViewState.yAxisSection : chartSettingSectionDto;
        ChartContext chartContext3 = (i & 524288) != 0 ? blackWidowAdvancedChartViewState.chartContext : chartContext;
        if ((i & 1048576) != 0) {
            chartContext2 = chartContext3;
            z5 = blackWidowAdvancedChartViewState.webLoadingSkeletonEnabled;
        } else {
            z5 = z4;
            chartContext2 = chartContext3;
        }
        return blackWidowAdvancedChartViewState.copy(uuid3, blackWidowAdvancedChartFragmentKey22, str3, bentoTheme42, z6, z7, templateDto2, immutableList4, immutableList5, str4, topBarState2, lowerTopBarState2, chartScreenState2, slideUpScreenState2, settingsBottomSheetState2, bottomBarState2, immutableList6, z8, chartSettingSectionDto2, chartContext2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getChartUrl() {
        return this.chartUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final TopBarState getTopBarState() {
        return this.topBarState;
    }

    /* renamed from: component12, reason: from getter */
    public final LowerTopBarState getLowerTopBarState() {
        return this.lowerTopBarState;
    }

    /* renamed from: component13, reason: from getter */
    public final ChartScreenState getScreenState() {
        return this.screenState;
    }

    /* renamed from: component14, reason: from getter */
    public final SlideUpScreenState getSlideUpScreenState() {
        return this.slideUpScreenState;
    }

    /* renamed from: component15, reason: from getter */
    public final SettingsBottomSheetState getSettingsBottomSheetState() {
        return this.settingsBottomSheetState;
    }

    /* renamed from: component16, reason: from getter */
    public final BottomBarState getBottomBarState() {
        return this.bottomBarState;
    }

    public final ImmutableList<SearchContentType> component17() {
        return this.searchContentTypes;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getWebViewVersionUnsupported() {
        return this.webViewVersionUnsupported;
    }

    /* renamed from: component19, reason: from getter */
    public final ChartSettingSectionDto getYAxisSection() {
        return this.yAxisSection;
    }

    /* renamed from: component2, reason: from getter */
    public final BlackWidowAdvancedChartFragmentKey2 getActiveInstrumentType() {
        return this.activeInstrumentType;
    }

    /* renamed from: component20, reason: from getter */
    public final ChartContext getChartContext() {
        return this.chartContext;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getWebLoadingSkeletonEnabled() {
        return this.webLoadingSkeletonEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoTheme4 getDirection() {
        return this.direction;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChartError() {
        return this.chartError;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getLoadingComplete() {
        return this.loadingComplete;
    }

    /* renamed from: component7, reason: from getter */
    public final TemplateDto getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final ImmutableList<TemplateDto> component8() {
        return this.availableTemplates;
    }

    public final ImmutableList<ThemedColorDto> component9() {
        return this.availableColorPickerColors;
    }

    public final BlackWidowAdvancedChartViewState copy(UUID activeInstrumentId, BlackWidowAdvancedChartFragmentKey2 activeInstrumentType, String activeAccountNumber, BentoTheme4 direction, boolean chartError, boolean loadingComplete, TemplateDto selectedTemplate, ImmutableList<TemplateDto> availableTemplates, ImmutableList<ThemedColorDto> availableColorPickerColors, String chartUrl, TopBarState topBarState, LowerTopBarState lowerTopBarState, ChartScreenState screenState, SlideUpScreenState slideUpScreenState, SettingsBottomSheetState settingsBottomSheetState, BottomBarState bottomBarState, ImmutableList<? extends SearchContentType> searchContentTypes, boolean webViewVersionUnsupported, ChartSettingSectionDto yAxisSection, ChartContext chartContext, boolean webLoadingSkeletonEnabled) {
        Intrinsics.checkNotNullParameter(activeInstrumentId, "activeInstrumentId");
        Intrinsics.checkNotNullParameter(activeInstrumentType, "activeInstrumentType");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(lowerTopBarState, "lowerTopBarState");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(slideUpScreenState, "slideUpScreenState");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
        Intrinsics.checkNotNullParameter(chartContext, "chartContext");
        return new BlackWidowAdvancedChartViewState(activeInstrumentId, activeInstrumentType, activeAccountNumber, direction, chartError, loadingComplete, selectedTemplate, availableTemplates, availableColorPickerColors, chartUrl, topBarState, lowerTopBarState, screenState, slideUpScreenState, settingsBottomSheetState, bottomBarState, searchContentTypes, webViewVersionUnsupported, yAxisSection, chartContext, webLoadingSkeletonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackWidowAdvancedChartViewState)) {
            return false;
        }
        BlackWidowAdvancedChartViewState blackWidowAdvancedChartViewState = (BlackWidowAdvancedChartViewState) other;
        return Intrinsics.areEqual(this.activeInstrumentId, blackWidowAdvancedChartViewState.activeInstrumentId) && this.activeInstrumentType == blackWidowAdvancedChartViewState.activeInstrumentType && Intrinsics.areEqual(this.activeAccountNumber, blackWidowAdvancedChartViewState.activeAccountNumber) && this.direction == blackWidowAdvancedChartViewState.direction && this.chartError == blackWidowAdvancedChartViewState.chartError && this.loadingComplete == blackWidowAdvancedChartViewState.loadingComplete && Intrinsics.areEqual(this.selectedTemplate, blackWidowAdvancedChartViewState.selectedTemplate) && Intrinsics.areEqual(this.availableTemplates, blackWidowAdvancedChartViewState.availableTemplates) && Intrinsics.areEqual(this.availableColorPickerColors, blackWidowAdvancedChartViewState.availableColorPickerColors) && Intrinsics.areEqual(this.chartUrl, blackWidowAdvancedChartViewState.chartUrl) && Intrinsics.areEqual(this.topBarState, blackWidowAdvancedChartViewState.topBarState) && Intrinsics.areEqual(this.lowerTopBarState, blackWidowAdvancedChartViewState.lowerTopBarState) && Intrinsics.areEqual(this.screenState, blackWidowAdvancedChartViewState.screenState) && Intrinsics.areEqual(this.slideUpScreenState, blackWidowAdvancedChartViewState.slideUpScreenState) && Intrinsics.areEqual(this.settingsBottomSheetState, blackWidowAdvancedChartViewState.settingsBottomSheetState) && Intrinsics.areEqual(this.bottomBarState, blackWidowAdvancedChartViewState.bottomBarState) && Intrinsics.areEqual(this.searchContentTypes, blackWidowAdvancedChartViewState.searchContentTypes) && this.webViewVersionUnsupported == blackWidowAdvancedChartViewState.webViewVersionUnsupported && Intrinsics.areEqual(this.yAxisSection, blackWidowAdvancedChartViewState.yAxisSection) && Intrinsics.areEqual(this.chartContext, blackWidowAdvancedChartViewState.chartContext) && this.webLoadingSkeletonEnabled == blackWidowAdvancedChartViewState.webLoadingSkeletonEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.activeInstrumentId.hashCode() * 31) + this.activeInstrumentType.hashCode()) * 31;
        String str = this.activeAccountNumber;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.chartError)) * 31) + Boolean.hashCode(this.loadingComplete)) * 31;
        TemplateDto templateDto = this.selectedTemplate;
        int iHashCode3 = (iHashCode2 + (templateDto == null ? 0 : templateDto.hashCode())) * 31;
        ImmutableList<TemplateDto> immutableList = this.availableTemplates;
        int iHashCode4 = (((iHashCode3 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + this.availableColorPickerColors.hashCode()) * 31;
        String str2 = this.chartUrl;
        int iHashCode5 = (((((((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.topBarState.hashCode()) * 31) + this.lowerTopBarState.hashCode()) * 31) + this.screenState.hashCode()) * 31) + this.slideUpScreenState.hashCode()) * 31;
        SettingsBottomSheetState settingsBottomSheetState = this.settingsBottomSheetState;
        int iHashCode6 = (((((((iHashCode5 + (settingsBottomSheetState == null ? 0 : settingsBottomSheetState.hashCode())) * 31) + this.bottomBarState.hashCode()) * 31) + this.searchContentTypes.hashCode()) * 31) + Boolean.hashCode(this.webViewVersionUnsupported)) * 31;
        ChartSettingSectionDto chartSettingSectionDto = this.yAxisSection;
        return ((((iHashCode6 + (chartSettingSectionDto != null ? chartSettingSectionDto.hashCode() : 0)) * 31) + this.chartContext.hashCode()) * 31) + Boolean.hashCode(this.webLoadingSkeletonEnabled);
    }

    public String toString() {
        return "BlackWidowAdvancedChartViewState(activeInstrumentId=" + this.activeInstrumentId + ", activeInstrumentType=" + this.activeInstrumentType + ", activeAccountNumber=" + this.activeAccountNumber + ", direction=" + this.direction + ", chartError=" + this.chartError + ", loadingComplete=" + this.loadingComplete + ", selectedTemplate=" + this.selectedTemplate + ", availableTemplates=" + this.availableTemplates + ", availableColorPickerColors=" + this.availableColorPickerColors + ", chartUrl=" + this.chartUrl + ", topBarState=" + this.topBarState + ", lowerTopBarState=" + this.lowerTopBarState + ", screenState=" + this.screenState + ", slideUpScreenState=" + this.slideUpScreenState + ", settingsBottomSheetState=" + this.settingsBottomSheetState + ", bottomBarState=" + this.bottomBarState + ", searchContentTypes=" + this.searchContentTypes + ", webViewVersionUnsupported=" + this.webViewVersionUnsupported + ", yAxisSection=" + this.yAxisSection + ", chartContext=" + this.chartContext + ", webLoadingSkeletonEnabled=" + this.webLoadingSkeletonEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlackWidowAdvancedChartViewState(UUID activeInstrumentId, BlackWidowAdvancedChartFragmentKey2 activeInstrumentType, String str, BentoTheme4 direction, boolean z, boolean z2, TemplateDto templateDto, ImmutableList<TemplateDto> immutableList, ImmutableList<ThemedColorDto> availableColorPickerColors, String str2, TopBarState topBarState, LowerTopBarState lowerTopBarState, ChartScreenState screenState, SlideUpScreenState slideUpScreenState, SettingsBottomSheetState settingsBottomSheetState, BottomBarState bottomBarState, ImmutableList<? extends SearchContentType> searchContentTypes, boolean z3, ChartSettingSectionDto chartSettingSectionDto, ChartContext chartContext, boolean z4) {
        Intrinsics.checkNotNullParameter(activeInstrumentId, "activeInstrumentId");
        Intrinsics.checkNotNullParameter(activeInstrumentType, "activeInstrumentType");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(lowerTopBarState, "lowerTopBarState");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(slideUpScreenState, "slideUpScreenState");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
        Intrinsics.checkNotNullParameter(chartContext, "chartContext");
        this.activeInstrumentId = activeInstrumentId;
        this.activeInstrumentType = activeInstrumentType;
        this.activeAccountNumber = str;
        this.direction = direction;
        this.chartError = z;
        this.loadingComplete = z2;
        this.selectedTemplate = templateDto;
        this.availableTemplates = immutableList;
        this.availableColorPickerColors = availableColorPickerColors;
        this.chartUrl = str2;
        this.topBarState = topBarState;
        this.lowerTopBarState = lowerTopBarState;
        this.screenState = screenState;
        this.slideUpScreenState = slideUpScreenState;
        this.settingsBottomSheetState = settingsBottomSheetState;
        this.bottomBarState = bottomBarState;
        this.searchContentTypes = searchContentTypes;
        this.webViewVersionUnsupported = z3;
        this.yAxisSection = chartSettingSectionDto;
        this.chartContext = chartContext;
        this.webLoadingSkeletonEnabled = z4;
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

    public final BentoTheme4 getDirection() {
        return this.direction;
    }

    public final boolean getChartError() {
        return this.chartError;
    }

    public final boolean getLoadingComplete() {
        return this.loadingComplete;
    }

    public final TemplateDto getSelectedTemplate() {
        return this.selectedTemplate;
    }

    public final ImmutableList<TemplateDto> getAvailableTemplates() {
        return this.availableTemplates;
    }

    public final ImmutableList<ThemedColorDto> getAvailableColorPickerColors() {
        return this.availableColorPickerColors;
    }

    public final String getChartUrl() {
        return this.chartUrl;
    }

    public final TopBarState getTopBarState() {
        return this.topBarState;
    }

    public final LowerTopBarState getLowerTopBarState() {
        return this.lowerTopBarState;
    }

    public final ChartScreenState getScreenState() {
        return this.screenState;
    }

    public final SlideUpScreenState getSlideUpScreenState() {
        return this.slideUpScreenState;
    }

    public final SettingsBottomSheetState getSettingsBottomSheetState() {
        return this.settingsBottomSheetState;
    }

    public final BottomBarState getBottomBarState() {
        return this.bottomBarState;
    }

    public final ImmutableList<SearchContentType> getSearchContentTypes() {
        return this.searchContentTypes;
    }

    public final boolean getWebViewVersionUnsupported() {
        return this.webViewVersionUnsupported;
    }

    public final ChartSettingSectionDto getYAxisSection() {
        return this.yAxisSection;
    }

    public final ChartContext getChartContext() {
        return this.chartContext;
    }

    public final boolean getWebLoadingSkeletonEnabled() {
        return this.webLoadingSkeletonEnabled;
    }
}
