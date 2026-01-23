package com.robinhood.android.options.simulatedreturn;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\t\u0010\\\u001a\u00020\u0010HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010^\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010_\u001a\u00020\u0012HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00108J\t\u0010a\u001a\u00020\u0018HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010g\u001a\u00020\u0012HÆ\u0003J\t\u0010h\u001a\u00020$HÆ\u0003J\t\u0010i\u001a\u00020\u0010HÆ\u0003Jô\u0001\u0010j\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010kJ\u0013\u0010l\u001a\u00020\u00122\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010n\u001a\u00020$HÖ\u0001J\t\u0010o\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010<R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00109\u001a\u0004\b\u0016\u00108R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\"\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010%\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0013\u0010L\u001a\u0004\u0018\u00010M¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010P\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0013\u0010R\u001a\u0004\u0018\u00010S¢\u0006\b\n\u0000\u001a\u0004\bT\u0010U¨\u0006p"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "chartType", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "equityInstrument", "Lcom/robinhood/models/db/Instrument;", "estimatedContractPrice", "", "fixedAccountNumber", "", "hasRealPosition", "", "indexInstrument", "Lcom/robinhood/android/indexes/models/db/Index;", "isLegContext", "isWatching", "lastAppearEventTimestamp", "", "nuxSliderTooltip", "Lcom/robinhood/models/db/OptionTooltip;", "nuxInfoTooltip", "uiAggregatePositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "uiOptionInstrumentPositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "uiStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "useWatchlist", "tradebarHeight", "", "strategyCode", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/models/db/CuratedListItem;Lcom/robinhood/models/db/Instrument;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/android/indexes/models/db/Index;ZLjava/lang/Boolean;JLcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Lcom/robinhood/models/ui/UiOptionStrategyInfo;ZILjava/lang/String;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getAllAccounts", "()Ljava/util/List;", "getChartType", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "getEquityInstrument", "()Lcom/robinhood/models/db/Instrument;", "getEstimatedContractPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFixedAccountNumber", "()Ljava/lang/String;", "getHasRealPosition", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIndexInstrument", "()Lcom/robinhood/android/indexes/models/db/Index;", "()Z", "getLastAppearEventTimestamp", "()J", "getNuxSliderTooltip", "()Lcom/robinhood/models/db/OptionTooltip;", "getNuxInfoTooltip", "getUiAggregatePositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getUiOptionInstrumentPositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "getUiStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getUseWatchlist", "getTradebarHeight", "()I", "getStrategyCode", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingSymbol", "getUnderlyingSymbol", "underlyingInstrumentId", "Ljava/util/UUID;", "getUnderlyingInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/models/db/CuratedListItem;Lcom/robinhood/models/db/Instrument;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/android/indexes/models/db/Index;ZLjava/lang/Boolean;JLcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Lcom/robinhood/models/ui/UiOptionStrategyInfo;ZILjava/lang/String;)Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;", "equals", "other", "hashCode", "toString", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnDataState {
    public static final int $stable = 8;
    private final BrokerageAccountType accountType;
    private final List<Account> allAccounts;
    private final OptionsSimulatedReturnChartViewState3 chartType;
    private final CuratedListItem curatedListItem;
    private final Instrument equityInstrument;
    private final Double estimatedContractPrice;
    private final String fixedAccountNumber;
    private final Boolean hasRealPosition;
    private final Index indexInstrument;
    private final boolean isLegContext;
    private final Boolean isWatching;
    private final long lastAppearEventTimestamp;
    private final OptionTooltip nuxInfoTooltip;
    private final OptionTooltip nuxSliderTooltip;
    private final String strategyCode;
    private final int tradebarHeight;
    private final UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity;
    private final UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity;
    private final UiOptionStrategyInfo uiStrategyInfo;
    private final UUID underlyingInstrumentId;
    private final String underlyingSymbol;
    private final OptionChain.UnderlyingType underlyingType;
    private final boolean useWatchlist;

    /* compiled from: OptionsSimulatedReturnDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OptionsSimulatedReturnDataState copy$default(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, BrokerageAccountType brokerageAccountType, List list, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, CuratedListItem curatedListItem, Instrument instrument, Double d, String str, Boolean bool, Index index, boolean z, Boolean bool2, long j, OptionTooltip optionTooltip, OptionTooltip optionTooltip2, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionStrategyInfo uiOptionStrategyInfo, boolean z2, int i, String str2, int i2, Object obj) {
        String str3;
        int i3;
        BrokerageAccountType brokerageAccountType2 = (i2 & 1) != 0 ? optionsSimulatedReturnDataState.accountType : brokerageAccountType;
        List list2 = (i2 & 2) != 0 ? optionsSimulatedReturnDataState.allAccounts : list;
        OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState32 = (i2 & 4) != 0 ? optionsSimulatedReturnDataState.chartType : optionsSimulatedReturnChartViewState3;
        CuratedListItem curatedListItem2 = (i2 & 8) != 0 ? optionsSimulatedReturnDataState.curatedListItem : curatedListItem;
        Instrument instrument2 = (i2 & 16) != 0 ? optionsSimulatedReturnDataState.equityInstrument : instrument;
        Double d2 = (i2 & 32) != 0 ? optionsSimulatedReturnDataState.estimatedContractPrice : d;
        String str4 = (i2 & 64) != 0 ? optionsSimulatedReturnDataState.fixedAccountNumber : str;
        Boolean bool3 = (i2 & 128) != 0 ? optionsSimulatedReturnDataState.hasRealPosition : bool;
        Index index2 = (i2 & 256) != 0 ? optionsSimulatedReturnDataState.indexInstrument : index;
        boolean z3 = (i2 & 512) != 0 ? optionsSimulatedReturnDataState.isLegContext : z;
        Boolean bool4 = (i2 & 1024) != 0 ? optionsSimulatedReturnDataState.isWatching : bool2;
        long j2 = (i2 & 2048) != 0 ? optionsSimulatedReturnDataState.lastAppearEventTimestamp : j;
        OptionTooltip optionTooltip3 = (i2 & 4096) != 0 ? optionsSimulatedReturnDataState.nuxSliderTooltip : optionTooltip;
        BrokerageAccountType brokerageAccountType3 = brokerageAccountType2;
        OptionTooltip optionTooltip4 = (i2 & 8192) != 0 ? optionsSimulatedReturnDataState.nuxInfoTooltip : optionTooltip2;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull2 = (i2 & 16384) != 0 ? optionsSimulatedReturnDataState.uiAggregatePositionIncludingZeroQuantity : uiAggregateOptionPositionFull;
        UiOptionInstrumentPosition uiOptionInstrumentPosition2 = (i2 & 32768) != 0 ? optionsSimulatedReturnDataState.uiOptionInstrumentPositionIncludingZeroQuantity : uiOptionInstrumentPosition;
        UiOptionStrategyInfo uiOptionStrategyInfo2 = (i2 & 65536) != 0 ? optionsSimulatedReturnDataState.uiStrategyInfo : uiOptionStrategyInfo;
        boolean z4 = (i2 & 131072) != 0 ? optionsSimulatedReturnDataState.useWatchlist : z2;
        int i4 = (i2 & 262144) != 0 ? optionsSimulatedReturnDataState.tradebarHeight : i;
        if ((i2 & 524288) != 0) {
            i3 = i4;
            str3 = optionsSimulatedReturnDataState.strategyCode;
        } else {
            str3 = str2;
            i3 = i4;
        }
        return optionsSimulatedReturnDataState.copy(brokerageAccountType3, list2, optionsSimulatedReturnChartViewState32, curatedListItem2, instrument2, d2, str4, bool3, index2, z3, bool4, j2, optionTooltip3, optionTooltip4, uiAggregateOptionPositionFull2, uiOptionInstrumentPosition2, uiOptionStrategyInfo2, z4, i3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsLegContext() {
        return this.isLegContext;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsWatching() {
        return this.isWatching;
    }

    /* renamed from: component12, reason: from getter */
    public final long getLastAppearEventTimestamp() {
        return this.lastAppearEventTimestamp;
    }

    /* renamed from: component13, reason: from getter */
    public final OptionTooltip getNuxSliderTooltip() {
        return this.nuxSliderTooltip;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionTooltip getNuxInfoTooltip() {
        return this.nuxInfoTooltip;
    }

    /* renamed from: component15, reason: from getter */
    public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
        return this.uiAggregatePositionIncludingZeroQuantity;
    }

    /* renamed from: component16, reason: from getter */
    public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
        return this.uiOptionInstrumentPositionIncludingZeroQuantity;
    }

    /* renamed from: component17, reason: from getter */
    public final UiOptionStrategyInfo getUiStrategyInfo() {
        return this.uiStrategyInfo;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getUseWatchlist() {
        return this.useWatchlist;
    }

    /* renamed from: component19, reason: from getter */
    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    public final List<Account> component2() {
        return this.allAccounts;
    }

    /* renamed from: component20, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsSimulatedReturnChartViewState3 getChartType() {
        return this.chartType;
    }

    /* renamed from: component4, reason: from getter */
    public final CuratedListItem getCuratedListItem() {
        return this.curatedListItem;
    }

    /* renamed from: component5, reason: from getter */
    public final Instrument getEquityInstrument() {
        return this.equityInstrument;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFixedAccountNumber() {
        return this.fixedAccountNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHasRealPosition() {
        return this.hasRealPosition;
    }

    /* renamed from: component9, reason: from getter */
    public final Index getIndexInstrument() {
        return this.indexInstrument;
    }

    public final OptionsSimulatedReturnDataState copy(BrokerageAccountType accountType, List<Account> allAccounts, OptionsSimulatedReturnChartViewState3 chartType, CuratedListItem curatedListItem, Instrument equityInstrument, Double estimatedContractPrice, String fixedAccountNumber, Boolean hasRealPosition, Index indexInstrument, boolean isLegContext, Boolean isWatching, long lastAppearEventTimestamp, OptionTooltip nuxSliderTooltip, OptionTooltip nuxInfoTooltip, UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity, UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity, UiOptionStrategyInfo uiStrategyInfo, boolean useWatchlist, int tradebarHeight, String strategyCode) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(fixedAccountNumber, "fixedAccountNumber");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        return new OptionsSimulatedReturnDataState(accountType, allAccounts, chartType, curatedListItem, equityInstrument, estimatedContractPrice, fixedAccountNumber, hasRealPosition, indexInstrument, isLegContext, isWatching, lastAppearEventTimestamp, nuxSliderTooltip, nuxInfoTooltip, uiAggregatePositionIncludingZeroQuantity, uiOptionInstrumentPositionIncludingZeroQuantity, uiStrategyInfo, useWatchlist, tradebarHeight, strategyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnDataState)) {
            return false;
        }
        OptionsSimulatedReturnDataState optionsSimulatedReturnDataState = (OptionsSimulatedReturnDataState) other;
        return this.accountType == optionsSimulatedReturnDataState.accountType && Intrinsics.areEqual(this.allAccounts, optionsSimulatedReturnDataState.allAccounts) && this.chartType == optionsSimulatedReturnDataState.chartType && Intrinsics.areEqual(this.curatedListItem, optionsSimulatedReturnDataState.curatedListItem) && Intrinsics.areEqual(this.equityInstrument, optionsSimulatedReturnDataState.equityInstrument) && Intrinsics.areEqual((Object) this.estimatedContractPrice, (Object) optionsSimulatedReturnDataState.estimatedContractPrice) && Intrinsics.areEqual(this.fixedAccountNumber, optionsSimulatedReturnDataState.fixedAccountNumber) && Intrinsics.areEqual(this.hasRealPosition, optionsSimulatedReturnDataState.hasRealPosition) && Intrinsics.areEqual(this.indexInstrument, optionsSimulatedReturnDataState.indexInstrument) && this.isLegContext == optionsSimulatedReturnDataState.isLegContext && Intrinsics.areEqual(this.isWatching, optionsSimulatedReturnDataState.isWatching) && this.lastAppearEventTimestamp == optionsSimulatedReturnDataState.lastAppearEventTimestamp && Intrinsics.areEqual(this.nuxSliderTooltip, optionsSimulatedReturnDataState.nuxSliderTooltip) && Intrinsics.areEqual(this.nuxInfoTooltip, optionsSimulatedReturnDataState.nuxInfoTooltip) && Intrinsics.areEqual(this.uiAggregatePositionIncludingZeroQuantity, optionsSimulatedReturnDataState.uiAggregatePositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiOptionInstrumentPositionIncludingZeroQuantity, optionsSimulatedReturnDataState.uiOptionInstrumentPositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiStrategyInfo, optionsSimulatedReturnDataState.uiStrategyInfo) && this.useWatchlist == optionsSimulatedReturnDataState.useWatchlist && this.tradebarHeight == optionsSimulatedReturnDataState.tradebarHeight && Intrinsics.areEqual(this.strategyCode, optionsSimulatedReturnDataState.strategyCode);
    }

    public int hashCode() {
        BrokerageAccountType brokerageAccountType = this.accountType;
        int iHashCode = (((((brokerageAccountType == null ? 0 : brokerageAccountType.hashCode()) * 31) + this.allAccounts.hashCode()) * 31) + this.chartType.hashCode()) * 31;
        CuratedListItem curatedListItem = this.curatedListItem;
        int iHashCode2 = (iHashCode + (curatedListItem == null ? 0 : curatedListItem.hashCode())) * 31;
        Instrument instrument = this.equityInstrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Double d = this.estimatedContractPrice;
        int iHashCode4 = (((iHashCode3 + (d == null ? 0 : d.hashCode())) * 31) + this.fixedAccountNumber.hashCode()) * 31;
        Boolean bool = this.hasRealPosition;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Index index = this.indexInstrument;
        int iHashCode6 = (((iHashCode5 + (index == null ? 0 : index.hashCode())) * 31) + Boolean.hashCode(this.isLegContext)) * 31;
        Boolean bool2 = this.isWatching;
        int iHashCode7 = (((iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Long.hashCode(this.lastAppearEventTimestamp)) * 31;
        OptionTooltip optionTooltip = this.nuxSliderTooltip;
        int iHashCode8 = (iHashCode7 + (optionTooltip == null ? 0 : optionTooltip.hashCode())) * 31;
        OptionTooltip optionTooltip2 = this.nuxInfoTooltip;
        int iHashCode9 = (iHashCode8 + (optionTooltip2 == null ? 0 : optionTooltip2.hashCode())) * 31;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull = this.uiAggregatePositionIncludingZeroQuantity;
        int iHashCode10 = (iHashCode9 + (uiAggregateOptionPositionFull == null ? 0 : uiAggregateOptionPositionFull.hashCode())) * 31;
        UiOptionInstrumentPosition uiOptionInstrumentPosition = this.uiOptionInstrumentPositionIncludingZeroQuantity;
        int iHashCode11 = (iHashCode10 + (uiOptionInstrumentPosition == null ? 0 : uiOptionInstrumentPosition.hashCode())) * 31;
        UiOptionStrategyInfo uiOptionStrategyInfo = this.uiStrategyInfo;
        return ((((((iHashCode11 + (uiOptionStrategyInfo != null ? uiOptionStrategyInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.useWatchlist)) * 31) + Integer.hashCode(this.tradebarHeight)) * 31) + this.strategyCode.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnDataState(accountType=" + this.accountType + ", allAccounts=" + this.allAccounts + ", chartType=" + this.chartType + ", curatedListItem=" + this.curatedListItem + ", equityInstrument=" + this.equityInstrument + ", estimatedContractPrice=" + this.estimatedContractPrice + ", fixedAccountNumber=" + this.fixedAccountNumber + ", hasRealPosition=" + this.hasRealPosition + ", indexInstrument=" + this.indexInstrument + ", isLegContext=" + this.isLegContext + ", isWatching=" + this.isWatching + ", lastAppearEventTimestamp=" + this.lastAppearEventTimestamp + ", nuxSliderTooltip=" + this.nuxSliderTooltip + ", nuxInfoTooltip=" + this.nuxInfoTooltip + ", uiAggregatePositionIncludingZeroQuantity=" + this.uiAggregatePositionIncludingZeroQuantity + ", uiOptionInstrumentPositionIncludingZeroQuantity=" + this.uiOptionInstrumentPositionIncludingZeroQuantity + ", uiStrategyInfo=" + this.uiStrategyInfo + ", useWatchlist=" + this.useWatchlist + ", tradebarHeight=" + this.tradebarHeight + ", strategyCode=" + this.strategyCode + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionsSimulatedReturnDataState(BrokerageAccountType brokerageAccountType, List<Account> allAccounts, OptionsSimulatedReturnChartViewState3 chartType, CuratedListItem curatedListItem, Instrument instrument, Double d, String fixedAccountNumber, Boolean bool, Index index, boolean z, Boolean bool2, long j, OptionTooltip optionTooltip, OptionTooltip optionTooltip2, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionStrategyInfo uiOptionStrategyInfo, boolean z2, int i, String strategyCode) {
        String symbol;
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(fixedAccountNumber, "fixedAccountNumber");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        this.accountType = brokerageAccountType;
        this.allAccounts = allAccounts;
        this.chartType = chartType;
        this.curatedListItem = curatedListItem;
        this.equityInstrument = instrument;
        this.estimatedContractPrice = d;
        this.fixedAccountNumber = fixedAccountNumber;
        this.hasRealPosition = bool;
        this.indexInstrument = index;
        this.isLegContext = z;
        this.isWatching = bool2;
        this.lastAppearEventTimestamp = j;
        this.nuxSliderTooltip = optionTooltip;
        this.nuxInfoTooltip = optionTooltip2;
        this.uiAggregatePositionIncludingZeroQuantity = uiAggregateOptionPositionFull;
        this.uiOptionInstrumentPositionIncludingZeroQuantity = uiOptionInstrumentPosition;
        this.uiStrategyInfo = uiOptionStrategyInfo;
        this.useWatchlist = z2;
        this.tradebarHeight = i;
        this.strategyCode = strategyCode;
        UUID id = null;
        OptionChain.UnderlyingType underlyingType = uiOptionStrategyInfo != null ? uiOptionStrategyInfo.getUnderlyingType() : null;
        this.underlyingType = underlyingType;
        int i2 = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
        if (i2 != 1) {
            symbol = (i2 == 2 && index != null) ? index.getSymbol() : null;
        } else if (instrument != null) {
            symbol = instrument.getSymbol();
        }
        this.underlyingSymbol = symbol;
        int i3 = underlyingType != null ? WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()] : -1;
        if (i3 != 1) {
            if (i3 == 2 && index != null) {
                id = index.getId();
            }
        } else if (instrument != null) {
            id = instrument.getId();
        }
        this.underlyingInstrumentId = id;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public /* synthetic */ OptionsSimulatedReturnDataState(BrokerageAccountType brokerageAccountType, List list, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, CuratedListItem curatedListItem, Instrument instrument, Double d, String str, Boolean bool, Index index, boolean z, Boolean bool2, long j, OptionTooltip optionTooltip, OptionTooltip optionTooltip2, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionStrategyInfo uiOptionStrategyInfo, boolean z2, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : brokerageAccountType, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? OptionsSimulatedReturnChartViewState3.DOLLAR : optionsSimulatedReturnChartViewState3, (i2 & 8) != 0 ? null : curatedListItem, (i2 & 16) != 0 ? null : instrument, (i2 & 32) != 0 ? null : d, str, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : index, z, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? 0L : j, (i2 & 4096) != 0 ? null : optionTooltip, (i2 & 8192) != 0 ? null : optionTooltip2, (i2 & 16384) != 0 ? null : uiAggregateOptionPositionFull, (32768 & i2) != 0 ? null : uiOptionInstrumentPosition, (65536 & i2) != 0 ? null : uiOptionStrategyInfo, (131072 & i2) != 0 ? false : z2, (i2 & 262144) != 0 ? 0 : i, str2);
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final OptionsSimulatedReturnChartViewState3 getChartType() {
        return this.chartType;
    }

    public final CuratedListItem getCuratedListItem() {
        return this.curatedListItem;
    }

    public final Instrument getEquityInstrument() {
        return this.equityInstrument;
    }

    public final Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    public final String getFixedAccountNumber() {
        return this.fixedAccountNumber;
    }

    public final Boolean getHasRealPosition() {
        return this.hasRealPosition;
    }

    public final Index getIndexInstrument() {
        return this.indexInstrument;
    }

    public final boolean isLegContext() {
        return this.isLegContext;
    }

    public final Boolean isWatching() {
        return this.isWatching;
    }

    public final long getLastAppearEventTimestamp() {
        return this.lastAppearEventTimestamp;
    }

    public final OptionTooltip getNuxSliderTooltip() {
        return this.nuxSliderTooltip;
    }

    public final OptionTooltip getNuxInfoTooltip() {
        return this.nuxInfoTooltip;
    }

    public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
        return this.uiAggregatePositionIncludingZeroQuantity;
    }

    public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
        return this.uiOptionInstrumentPositionIncludingZeroQuantity;
    }

    public final UiOptionStrategyInfo getUiStrategyInfo() {
        return this.uiStrategyInfo;
    }

    public final boolean getUseWatchlist() {
        return this.useWatchlist;
    }

    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final String getUnderlyingSymbol() {
        return this.underlyingSymbol;
    }

    public final UUID getUnderlyingInstrumentId() {
        return this.underlyingInstrumentId;
    }
}
