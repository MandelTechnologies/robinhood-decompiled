package com.robinhood.android.equitytradeladder;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.equities.equitytrade.EquityTradeButtonState;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState;
import com.robinhood.android.equitytradeladder.models.EquityLadderUserInteractionData;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.eventlogging.EquitiesLadderContext;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderUserInteractionData;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.DayPnlInfo;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContentState;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: EquityTradeLadderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0007QRSTUVWB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010;\u001a\u00020<H\u0016J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010D\u001a\u00020\u0012HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010H\u001a\u00020\u001cHÆ\u0003J\u0095\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0017HÖ\u0001J\t\u0010O\u001a\u00020PHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "topBarData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;", "marketClosedHeaderData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$MarketClosedHeaderData;", "l2DataUnavailableHeaderData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$L2DataUnavailableHeaderData;", "instrumentHaltedHeaderData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$InstrumentHaltedHeaderData;", "ladderState", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "bottomBarData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "settingsBottomSheetData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;", "ladderScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "orderState", "Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;", "zoomOverlayData", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Ljava/math/BigDecimal;", "ftuxProgressState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "equitiesLadderContext", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "<init>", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$MarketClosedHeaderData;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$L2DataUnavailableHeaderData;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$InstrumentHaltedHeaderData;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;Lcom/robinhood/android/equitytradeladder/LadderScreenState;Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;Lkotlinx/collections/immutable/ImmutableMap;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;)V", "getTopBarData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;", "getMarketClosedHeaderData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$MarketClosedHeaderData;", "getL2DataUnavailableHeaderData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$L2DataUnavailableHeaderData;", "getInstrumentHaltedHeaderData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$InstrumentHaltedHeaderData;", "getLadderState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "getBottomBarData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "getSettingsBottomSheetData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;", "getLadderScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "getOrderState", "()Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;", "getZoomOverlayData", "()Lkotlinx/collections/immutable/ImmutableMap;", "getFtuxProgressState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "getEquitiesLadderContext", "()Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "userInteractionData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "getUserInteractionData", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "toString", "", "TopBarData", "MarketClosedHeaderData", "L2DataUnavailableHeaderData", "InstrumentHaltedHeaderData", "BottomBarData", "SettingsBottomSheetData", "EquityTradeLadderPerformanceIdentifier", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityTradeLadderViewState implements BaseLadderDuxo5, LoggableViewState {
    public static final int $stable = 8;
    private final BottomBarData bottomBarData;
    private final EquitiesLadderContext equitiesLadderContext;
    private final GenericLadderFtuxProgressState ftuxProgressState;
    private final InstrumentHaltedHeaderData instrumentHaltedHeaderData;
    private final L2DataUnavailableHeaderData l2DataUnavailableHeaderData;
    private final LadderScreenState ladderScreenState;
    private final LadderState ladderState;
    private final MarketClosedHeaderData marketClosedHeaderData;
    private final EquityLadderOrderState orderState;
    private final SettingsBottomSheetData settingsBottomSheetData;
    private final TopBarData topBarData;
    private final ImmutableMap<Integer, BigDecimal> zoomOverlayData;

    public static /* synthetic */ EquityTradeLadderViewState copy$default(EquityTradeLadderViewState equityTradeLadderViewState, TopBarData topBarData, MarketClosedHeaderData marketClosedHeaderData, L2DataUnavailableHeaderData l2DataUnavailableHeaderData, InstrumentHaltedHeaderData instrumentHaltedHeaderData, LadderState ladderState, BottomBarData bottomBarData, SettingsBottomSheetData settingsBottomSheetData, LadderScreenState ladderScreenState, EquityLadderOrderState equityLadderOrderState, ImmutableMap immutableMap, GenericLadderFtuxProgressState genericLadderFtuxProgressState, EquitiesLadderContext equitiesLadderContext, int i, Object obj) {
        if ((i & 1) != 0) {
            topBarData = equityTradeLadderViewState.topBarData;
        }
        if ((i & 2) != 0) {
            marketClosedHeaderData = equityTradeLadderViewState.marketClosedHeaderData;
        }
        if ((i & 4) != 0) {
            l2DataUnavailableHeaderData = equityTradeLadderViewState.l2DataUnavailableHeaderData;
        }
        if ((i & 8) != 0) {
            instrumentHaltedHeaderData = equityTradeLadderViewState.instrumentHaltedHeaderData;
        }
        if ((i & 16) != 0) {
            ladderState = equityTradeLadderViewState.ladderState;
        }
        if ((i & 32) != 0) {
            bottomBarData = equityTradeLadderViewState.bottomBarData;
        }
        if ((i & 64) != 0) {
            settingsBottomSheetData = equityTradeLadderViewState.settingsBottomSheetData;
        }
        if ((i & 128) != 0) {
            ladderScreenState = equityTradeLadderViewState.ladderScreenState;
        }
        if ((i & 256) != 0) {
            equityLadderOrderState = equityTradeLadderViewState.orderState;
        }
        if ((i & 512) != 0) {
            immutableMap = equityTradeLadderViewState.zoomOverlayData;
        }
        if ((i & 1024) != 0) {
            genericLadderFtuxProgressState = equityTradeLadderViewState.ftuxProgressState;
        }
        if ((i & 2048) != 0) {
            equitiesLadderContext = equityTradeLadderViewState.equitiesLadderContext;
        }
        GenericLadderFtuxProgressState genericLadderFtuxProgressState2 = genericLadderFtuxProgressState;
        EquitiesLadderContext equitiesLadderContext2 = equitiesLadderContext;
        EquityLadderOrderState equityLadderOrderState2 = equityLadderOrderState;
        ImmutableMap immutableMap2 = immutableMap;
        SettingsBottomSheetData settingsBottomSheetData2 = settingsBottomSheetData;
        LadderScreenState ladderScreenState2 = ladderScreenState;
        LadderState ladderState2 = ladderState;
        BottomBarData bottomBarData2 = bottomBarData;
        return equityTradeLadderViewState.copy(topBarData, marketClosedHeaderData, l2DataUnavailableHeaderData, instrumentHaltedHeaderData, ladderState2, bottomBarData2, settingsBottomSheetData2, ladderScreenState2, equityLadderOrderState2, immutableMap2, genericLadderFtuxProgressState2, equitiesLadderContext2);
    }

    /* renamed from: component1, reason: from getter */
    public final TopBarData getTopBarData() {
        return this.topBarData;
    }

    public final ImmutableMap<Integer, BigDecimal> component10() {
        return this.zoomOverlayData;
    }

    /* renamed from: component11, reason: from getter */
    public final GenericLadderFtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    /* renamed from: component12, reason: from getter */
    public final EquitiesLadderContext getEquitiesLadderContext() {
        return this.equitiesLadderContext;
    }

    /* renamed from: component2, reason: from getter */
    public final MarketClosedHeaderData getMarketClosedHeaderData() {
        return this.marketClosedHeaderData;
    }

    /* renamed from: component3, reason: from getter */
    public final L2DataUnavailableHeaderData getL2DataUnavailableHeaderData() {
        return this.l2DataUnavailableHeaderData;
    }

    /* renamed from: component4, reason: from getter */
    public final InstrumentHaltedHeaderData getInstrumentHaltedHeaderData() {
        return this.instrumentHaltedHeaderData;
    }

    /* renamed from: component5, reason: from getter */
    public final LadderState getLadderState() {
        return this.ladderState;
    }

    /* renamed from: component6, reason: from getter */
    public final BottomBarData getBottomBarData() {
        return this.bottomBarData;
    }

    /* renamed from: component7, reason: from getter */
    public final SettingsBottomSheetData getSettingsBottomSheetData() {
        return this.settingsBottomSheetData;
    }

    /* renamed from: component8, reason: from getter */
    public final LadderScreenState getLadderScreenState() {
        return this.ladderScreenState;
    }

    /* renamed from: component9, reason: from getter */
    public final EquityLadderOrderState getOrderState() {
        return this.orderState;
    }

    public final EquityTradeLadderViewState copy(TopBarData topBarData, MarketClosedHeaderData marketClosedHeaderData, L2DataUnavailableHeaderData l2DataUnavailableHeaderData, InstrumentHaltedHeaderData instrumentHaltedHeaderData, LadderState ladderState, BottomBarData bottomBarData, SettingsBottomSheetData settingsBottomSheetData, LadderScreenState ladderScreenState, EquityLadderOrderState orderState, ImmutableMap<Integer, ? extends BigDecimal> zoomOverlayData, GenericLadderFtuxProgressState ftuxProgressState, EquitiesLadderContext equitiesLadderContext) {
        Intrinsics.checkNotNullParameter(topBarData, "topBarData");
        Intrinsics.checkNotNullParameter(marketClosedHeaderData, "marketClosedHeaderData");
        Intrinsics.checkNotNullParameter(l2DataUnavailableHeaderData, "l2DataUnavailableHeaderData");
        Intrinsics.checkNotNullParameter(instrumentHaltedHeaderData, "instrumentHaltedHeaderData");
        Intrinsics.checkNotNullParameter(ladderState, "ladderState");
        Intrinsics.checkNotNullParameter(bottomBarData, "bottomBarData");
        Intrinsics.checkNotNullParameter(ladderScreenState, "ladderScreenState");
        Intrinsics.checkNotNullParameter(equitiesLadderContext, "equitiesLadderContext");
        return new EquityTradeLadderViewState(topBarData, marketClosedHeaderData, l2DataUnavailableHeaderData, instrumentHaltedHeaderData, ladderState, bottomBarData, settingsBottomSheetData, ladderScreenState, orderState, zoomOverlayData, ftuxProgressState, equitiesLadderContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTradeLadderViewState)) {
            return false;
        }
        EquityTradeLadderViewState equityTradeLadderViewState = (EquityTradeLadderViewState) other;
        return Intrinsics.areEqual(this.topBarData, equityTradeLadderViewState.topBarData) && Intrinsics.areEqual(this.marketClosedHeaderData, equityTradeLadderViewState.marketClosedHeaderData) && Intrinsics.areEqual(this.l2DataUnavailableHeaderData, equityTradeLadderViewState.l2DataUnavailableHeaderData) && Intrinsics.areEqual(this.instrumentHaltedHeaderData, equityTradeLadderViewState.instrumentHaltedHeaderData) && Intrinsics.areEqual(this.ladderState, equityTradeLadderViewState.ladderState) && Intrinsics.areEqual(this.bottomBarData, equityTradeLadderViewState.bottomBarData) && Intrinsics.areEqual(this.settingsBottomSheetData, equityTradeLadderViewState.settingsBottomSheetData) && Intrinsics.areEqual(this.ladderScreenState, equityTradeLadderViewState.ladderScreenState) && Intrinsics.areEqual(this.orderState, equityTradeLadderViewState.orderState) && Intrinsics.areEqual(this.zoomOverlayData, equityTradeLadderViewState.zoomOverlayData) && Intrinsics.areEqual(this.ftuxProgressState, equityTradeLadderViewState.ftuxProgressState) && Intrinsics.areEqual(this.equitiesLadderContext, equityTradeLadderViewState.equitiesLadderContext);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.topBarData.hashCode() * 31) + this.marketClosedHeaderData.hashCode()) * 31) + this.l2DataUnavailableHeaderData.hashCode()) * 31) + this.instrumentHaltedHeaderData.hashCode()) * 31) + this.ladderState.hashCode()) * 31) + this.bottomBarData.hashCode()) * 31;
        SettingsBottomSheetData settingsBottomSheetData = this.settingsBottomSheetData;
        int iHashCode2 = (((iHashCode + (settingsBottomSheetData == null ? 0 : settingsBottomSheetData.hashCode())) * 31) + this.ladderScreenState.hashCode()) * 31;
        EquityLadderOrderState equityLadderOrderState = this.orderState;
        int iHashCode3 = (iHashCode2 + (equityLadderOrderState == null ? 0 : equityLadderOrderState.hashCode())) * 31;
        ImmutableMap<Integer, BigDecimal> immutableMap = this.zoomOverlayData;
        int iHashCode4 = (iHashCode3 + (immutableMap == null ? 0 : immutableMap.hashCode())) * 31;
        GenericLadderFtuxProgressState genericLadderFtuxProgressState = this.ftuxProgressState;
        return ((iHashCode4 + (genericLadderFtuxProgressState != null ? genericLadderFtuxProgressState.hashCode() : 0)) * 31) + this.equitiesLadderContext.hashCode();
    }

    public String toString() {
        return "EquityTradeLadderViewState(topBarData=" + this.topBarData + ", marketClosedHeaderData=" + this.marketClosedHeaderData + ", l2DataUnavailableHeaderData=" + this.l2DataUnavailableHeaderData + ", instrumentHaltedHeaderData=" + this.instrumentHaltedHeaderData + ", ladderState=" + this.ladderState + ", bottomBarData=" + this.bottomBarData + ", settingsBottomSheetData=" + this.settingsBottomSheetData + ", ladderScreenState=" + this.ladderScreenState + ", orderState=" + this.orderState + ", zoomOverlayData=" + this.zoomOverlayData + ", ftuxProgressState=" + this.ftuxProgressState + ", equitiesLadderContext=" + this.equitiesLadderContext + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityTradeLadderViewState(TopBarData topBarData, MarketClosedHeaderData marketClosedHeaderData, L2DataUnavailableHeaderData l2DataUnavailableHeaderData, InstrumentHaltedHeaderData instrumentHaltedHeaderData, LadderState ladderState, BottomBarData bottomBarData, SettingsBottomSheetData settingsBottomSheetData, LadderScreenState ladderScreenState, EquityLadderOrderState equityLadderOrderState, ImmutableMap<Integer, ? extends BigDecimal> immutableMap, GenericLadderFtuxProgressState genericLadderFtuxProgressState, EquitiesLadderContext equitiesLadderContext) {
        Intrinsics.checkNotNullParameter(topBarData, "topBarData");
        Intrinsics.checkNotNullParameter(marketClosedHeaderData, "marketClosedHeaderData");
        Intrinsics.checkNotNullParameter(l2DataUnavailableHeaderData, "l2DataUnavailableHeaderData");
        Intrinsics.checkNotNullParameter(instrumentHaltedHeaderData, "instrumentHaltedHeaderData");
        Intrinsics.checkNotNullParameter(ladderState, "ladderState");
        Intrinsics.checkNotNullParameter(bottomBarData, "bottomBarData");
        Intrinsics.checkNotNullParameter(ladderScreenState, "ladderScreenState");
        Intrinsics.checkNotNullParameter(equitiesLadderContext, "equitiesLadderContext");
        this.topBarData = topBarData;
        this.marketClosedHeaderData = marketClosedHeaderData;
        this.l2DataUnavailableHeaderData = l2DataUnavailableHeaderData;
        this.instrumentHaltedHeaderData = instrumentHaltedHeaderData;
        this.ladderState = ladderState;
        this.bottomBarData = bottomBarData;
        this.settingsBottomSheetData = settingsBottomSheetData;
        this.ladderScreenState = ladderScreenState;
        this.orderState = equityLadderOrderState;
        this.zoomOverlayData = immutableMap;
        this.ftuxProgressState = genericLadderFtuxProgressState;
        this.equitiesLadderContext = equitiesLadderContext;
    }

    public final TopBarData getTopBarData() {
        return this.topBarData;
    }

    public final MarketClosedHeaderData getMarketClosedHeaderData() {
        return this.marketClosedHeaderData;
    }

    public final L2DataUnavailableHeaderData getL2DataUnavailableHeaderData() {
        return this.l2DataUnavailableHeaderData;
    }

    public final InstrumentHaltedHeaderData getInstrumentHaltedHeaderData() {
        return this.instrumentHaltedHeaderData;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5
    public LadderState getLadderState() {
        return this.ladderState;
    }

    public final BottomBarData getBottomBarData() {
        return this.bottomBarData;
    }

    public final SettingsBottomSheetData getSettingsBottomSheetData() {
        return this.settingsBottomSheetData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EquityTradeLadderViewState(TopBarData topBarData, MarketClosedHeaderData marketClosedHeaderData, L2DataUnavailableHeaderData l2DataUnavailableHeaderData, InstrumentHaltedHeaderData instrumentHaltedHeaderData, LadderState ladderState, BottomBarData bottomBarData, SettingsBottomSheetData settingsBottomSheetData, LadderScreenState ladderScreenState, EquityLadderOrderState equityLadderOrderState, ImmutableMap immutableMap, GenericLadderFtuxProgressState genericLadderFtuxProgressState, EquitiesLadderContext equitiesLadderContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        EquitiesLadderContext equitiesLadderContext2;
        GenericLadderFtuxProgressState genericLadderFtuxProgressState2;
        settingsBottomSheetData = (i & 64) != 0 ? null : settingsBottomSheetData;
        ladderScreenState = (i & 128) != 0 ? LadderScreenState.Ladder.INSTANCE : ladderScreenState;
        equityLadderOrderState = (i & 256) != 0 ? null : equityLadderOrderState;
        if ((i & 1024) != 0) {
            equitiesLadderContext2 = equitiesLadderContext;
            genericLadderFtuxProgressState2 = null;
        } else {
            equitiesLadderContext2 = equitiesLadderContext;
            genericLadderFtuxProgressState2 = genericLadderFtuxProgressState;
        }
        this(topBarData, marketClosedHeaderData, l2DataUnavailableHeaderData, instrumentHaltedHeaderData, ladderState, bottomBarData, settingsBottomSheetData, ladderScreenState, equityLadderOrderState, immutableMap, genericLadderFtuxProgressState2, equitiesLadderContext2);
    }

    public final LadderScreenState getLadderScreenState() {
        return this.ladderScreenState;
    }

    public final EquityLadderOrderState getOrderState() {
        return this.orderState;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5
    public ImmutableMap<Integer, BigDecimal> getZoomOverlayData() {
        return this.zoomOverlayData;
    }

    public final GenericLadderFtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    public final EquitiesLadderContext getEquitiesLadderContext() {
        return this.equitiesLadderContext;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5
    public LadderUserInteractionData getUserInteractionData() {
        return EquityLadderUserInteractionData.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        LadderState.LadderData ladder = getLadderState().getLadder();
        BottomBarData bottomBarData = this.bottomBarData;
        BottomBarData.MarketOrderData marketOrderData = bottomBarData instanceof BottomBarData.MarketOrderData ? (BottomBarData.MarketOrderData) bottomBarData : null;
        if (ladder != null && this.orderState != null && marketOrderData != null && (marketOrderData.getBuyButtonState().getEnabled() || marketOrderData.getSellButtonState().getEnabled())) {
            return new LoggableViewState2.Completed("EQUITY_TRADE_LADDER", null, 2, null);
        }
        return new LoggableViewState2.Loading("EQUITY_TRADE_LADDER");
    }

    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00019Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J}\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000fHÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;", "", "titleContentState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;", "dayPL", "Ljava/math/BigDecimal;", "openPL", "hasPosition", "", "positionsDisplay", "Lcom/robinhood/utils/resource/StringResource;", "flattenData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData$FlattenButtonData;", "showPnlPriceSwitcherTooltip", "pendingOrderQuantity", "", "pendingOrderClickable", "showFtuxTooltip", "dayPnlInfo", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData$FlattenButtonData;ZIZZLcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;)V", "getTitleContentState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;", "getDayPL", "()Ljava/math/BigDecimal;", "getOpenPL", "getHasPosition", "()Z", "getPositionsDisplay", "()Lcom/robinhood/utils/resource/StringResource;", "getFlattenData", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData$FlattenButtonData;", "getShowPnlPriceSwitcherTooltip", "getPendingOrderQuantity", "()I", "getPendingOrderClickable", "getShowFtuxTooltip", "getDayPnlInfo", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "FlattenButtonData", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopBarData {
        public static final int $stable = 8;
        private final BigDecimal dayPL;
        private final DayPnlInfo dayPnlInfo;
        private final FlattenButtonData flattenData;
        private final boolean hasPosition;
        private final BigDecimal openPL;
        private final boolean pendingOrderClickable;
        private final int pendingOrderQuantity;
        private final StringResource positionsDisplay;
        private final boolean showFtuxTooltip;
        private final boolean showPnlPriceSwitcherTooltip;
        private final TitleContentState titleContentState;

        public static /* synthetic */ TopBarData copy$default(TopBarData topBarData, TitleContentState titleContent5, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource, FlattenButtonData flattenButtonData, boolean z2, int i, boolean z3, boolean z4, DayPnlInfo dayPnlInfo, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                titleContent5 = topBarData.titleContentState;
            }
            if ((i2 & 2) != 0) {
                bigDecimal = topBarData.dayPL;
            }
            if ((i2 & 4) != 0) {
                bigDecimal2 = topBarData.openPL;
            }
            if ((i2 & 8) != 0) {
                z = topBarData.hasPosition;
            }
            if ((i2 & 16) != 0) {
                stringResource = topBarData.positionsDisplay;
            }
            if ((i2 & 32) != 0) {
                flattenButtonData = topBarData.flattenData;
            }
            if ((i2 & 64) != 0) {
                z2 = topBarData.showPnlPriceSwitcherTooltip;
            }
            if ((i2 & 128) != 0) {
                i = topBarData.pendingOrderQuantity;
            }
            if ((i2 & 256) != 0) {
                z3 = topBarData.pendingOrderClickable;
            }
            if ((i2 & 512) != 0) {
                z4 = topBarData.showFtuxTooltip;
            }
            if ((i2 & 1024) != 0) {
                dayPnlInfo = topBarData.dayPnlInfo;
            }
            boolean z5 = z4;
            DayPnlInfo dayPnlInfo2 = dayPnlInfo;
            int i3 = i;
            boolean z6 = z3;
            FlattenButtonData flattenButtonData2 = flattenButtonData;
            boolean z7 = z2;
            StringResource stringResource2 = stringResource;
            BigDecimal bigDecimal3 = bigDecimal2;
            return topBarData.copy(titleContent5, bigDecimal, bigDecimal3, z, stringResource2, flattenButtonData2, z7, i3, z6, z5, dayPnlInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final TitleContentState getTitleContentState() {
            return this.titleContentState;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowFtuxTooltip() {
            return this.showFtuxTooltip;
        }

        /* renamed from: component11, reason: from getter */
        public final DayPnlInfo getDayPnlInfo() {
            return this.dayPnlInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getDayPL() {
            return this.dayPL;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getOpenPL() {
            return this.openPL;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getPositionsDisplay() {
            return this.positionsDisplay;
        }

        /* renamed from: component6, reason: from getter */
        public final FlattenButtonData getFlattenData() {
            return this.flattenData;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowPnlPriceSwitcherTooltip() {
            return this.showPnlPriceSwitcherTooltip;
        }

        /* renamed from: component8, reason: from getter */
        public final int getPendingOrderQuantity() {
            return this.pendingOrderQuantity;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getPendingOrderClickable() {
            return this.pendingOrderClickable;
        }

        public final TopBarData copy(TitleContentState titleContentState, BigDecimal dayPL, BigDecimal openPL, boolean hasPosition, StringResource positionsDisplay, FlattenButtonData flattenData, boolean showPnlPriceSwitcherTooltip, int pendingOrderQuantity, boolean pendingOrderClickable, boolean showFtuxTooltip, DayPnlInfo dayPnlInfo) {
            Intrinsics.checkNotNullParameter(titleContentState, "titleContentState");
            Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
            Intrinsics.checkNotNullParameter(flattenData, "flattenData");
            return new TopBarData(titleContentState, dayPL, openPL, hasPosition, positionsDisplay, flattenData, showPnlPriceSwitcherTooltip, pendingOrderQuantity, pendingOrderClickable, showFtuxTooltip, dayPnlInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopBarData)) {
                return false;
            }
            TopBarData topBarData = (TopBarData) other;
            return Intrinsics.areEqual(this.titleContentState, topBarData.titleContentState) && Intrinsics.areEqual(this.dayPL, topBarData.dayPL) && Intrinsics.areEqual(this.openPL, topBarData.openPL) && this.hasPosition == topBarData.hasPosition && Intrinsics.areEqual(this.positionsDisplay, topBarData.positionsDisplay) && Intrinsics.areEqual(this.flattenData, topBarData.flattenData) && this.showPnlPriceSwitcherTooltip == topBarData.showPnlPriceSwitcherTooltip && this.pendingOrderQuantity == topBarData.pendingOrderQuantity && this.pendingOrderClickable == topBarData.pendingOrderClickable && this.showFtuxTooltip == topBarData.showFtuxTooltip && Intrinsics.areEqual(this.dayPnlInfo, topBarData.dayPnlInfo);
        }

        public int hashCode() {
            int iHashCode = this.titleContentState.hashCode() * 31;
            BigDecimal bigDecimal = this.dayPL;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.openPL;
            int iHashCode3 = (((((((((((((((iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.hasPosition)) * 31) + this.positionsDisplay.hashCode()) * 31) + this.flattenData.hashCode()) * 31) + Boolean.hashCode(this.showPnlPriceSwitcherTooltip)) * 31) + Integer.hashCode(this.pendingOrderQuantity)) * 31) + Boolean.hashCode(this.pendingOrderClickable)) * 31) + Boolean.hashCode(this.showFtuxTooltip)) * 31;
            DayPnlInfo dayPnlInfo = this.dayPnlInfo;
            return iHashCode3 + (dayPnlInfo != null ? dayPnlInfo.hashCode() : 0);
        }

        public String toString() {
            return "TopBarData(titleContentState=" + this.titleContentState + ", dayPL=" + this.dayPL + ", openPL=" + this.openPL + ", hasPosition=" + this.hasPosition + ", positionsDisplay=" + this.positionsDisplay + ", flattenData=" + this.flattenData + ", showPnlPriceSwitcherTooltip=" + this.showPnlPriceSwitcherTooltip + ", pendingOrderQuantity=" + this.pendingOrderQuantity + ", pendingOrderClickable=" + this.pendingOrderClickable + ", showFtuxTooltip=" + this.showFtuxTooltip + ", dayPnlInfo=" + this.dayPnlInfo + ")";
        }

        public TopBarData(TitleContentState titleContentState, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource positionsDisplay, FlattenButtonData flattenData, boolean z2, int i, boolean z3, boolean z4, DayPnlInfo dayPnlInfo) {
            Intrinsics.checkNotNullParameter(titleContentState, "titleContentState");
            Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
            Intrinsics.checkNotNullParameter(flattenData, "flattenData");
            this.titleContentState = titleContentState;
            this.dayPL = bigDecimal;
            this.openPL = bigDecimal2;
            this.hasPosition = z;
            this.positionsDisplay = positionsDisplay;
            this.flattenData = flattenData;
            this.showPnlPriceSwitcherTooltip = z2;
            this.pendingOrderQuantity = i;
            this.pendingOrderClickable = z3;
            this.showFtuxTooltip = z4;
            this.dayPnlInfo = dayPnlInfo;
        }

        public final TitleContentState getTitleContentState() {
            return this.titleContentState;
        }

        public final BigDecimal getDayPL() {
            return this.dayPL;
        }

        public final BigDecimal getOpenPL() {
            return this.openPL;
        }

        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        public final StringResource getPositionsDisplay() {
            return this.positionsDisplay;
        }

        public final FlattenButtonData getFlattenData() {
            return this.flattenData;
        }

        public final boolean getShowPnlPriceSwitcherTooltip() {
            return this.showPnlPriceSwitcherTooltip;
        }

        public final int getPendingOrderQuantity() {
            return this.pendingOrderQuantity;
        }

        public final boolean getPendingOrderClickable() {
            return this.pendingOrderClickable;
        }

        public final boolean getShowFtuxTooltip() {
            return this.showFtuxTooltip;
        }

        public final DayPnlInfo getDayPnlInfo() {
            return this.dayPnlInfo;
        }

        /* compiled from: EquityTradeLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData$FlattenButtonData;", "", "isFlattenButtonVisible", "", "isFlattenButtonEnabled", "isFlattenLoading", "showFlattenOrdersTooltip", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "nbboLoading", "<init>", "(ZZZZLcom/robinhood/nbbo/models/db/NbboSummary;Z)V", "()Z", "getShowFlattenOrdersTooltip", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getNbboLoading", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FlattenButtonData {
            public static final int $stable = 8;
            private final boolean isFlattenButtonEnabled;
            private final boolean isFlattenButtonVisible;
            private final boolean isFlattenLoading;
            private final boolean nbboLoading;
            private final NbboSummary nbboSummary;
            private final boolean showFlattenOrdersTooltip;

            public static /* synthetic */ FlattenButtonData copy$default(FlattenButtonData flattenButtonData, boolean z, boolean z2, boolean z3, boolean z4, NbboSummary nbboSummary, boolean z5, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = flattenButtonData.isFlattenButtonVisible;
                }
                if ((i & 2) != 0) {
                    z2 = flattenButtonData.isFlattenButtonEnabled;
                }
                if ((i & 4) != 0) {
                    z3 = flattenButtonData.isFlattenLoading;
                }
                if ((i & 8) != 0) {
                    z4 = flattenButtonData.showFlattenOrdersTooltip;
                }
                if ((i & 16) != 0) {
                    nbboSummary = flattenButtonData.nbboSummary;
                }
                if ((i & 32) != 0) {
                    z5 = flattenButtonData.nbboLoading;
                }
                NbboSummary nbboSummary2 = nbboSummary;
                boolean z6 = z5;
                return flattenButtonData.copy(z, z2, z3, z4, nbboSummary2, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsFlattenButtonVisible() {
                return this.isFlattenButtonVisible;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsFlattenButtonEnabled() {
                return this.isFlattenButtonEnabled;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsFlattenLoading() {
                return this.isFlattenLoading;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowFlattenOrdersTooltip() {
                return this.showFlattenOrdersTooltip;
            }

            /* renamed from: component5, reason: from getter */
            public final NbboSummary getNbboSummary() {
                return this.nbboSummary;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getNbboLoading() {
                return this.nbboLoading;
            }

            public final FlattenButtonData copy(boolean isFlattenButtonVisible, boolean isFlattenButtonEnabled, boolean isFlattenLoading, boolean showFlattenOrdersTooltip, NbboSummary nbboSummary, boolean nbboLoading) {
                return new FlattenButtonData(isFlattenButtonVisible, isFlattenButtonEnabled, isFlattenLoading, showFlattenOrdersTooltip, nbboSummary, nbboLoading);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlattenButtonData)) {
                    return false;
                }
                FlattenButtonData flattenButtonData = (FlattenButtonData) other;
                return this.isFlattenButtonVisible == flattenButtonData.isFlattenButtonVisible && this.isFlattenButtonEnabled == flattenButtonData.isFlattenButtonEnabled && this.isFlattenLoading == flattenButtonData.isFlattenLoading && this.showFlattenOrdersTooltip == flattenButtonData.showFlattenOrdersTooltip && Intrinsics.areEqual(this.nbboSummary, flattenButtonData.nbboSummary) && this.nbboLoading == flattenButtonData.nbboLoading;
            }

            public int hashCode() {
                int iHashCode = ((((((Boolean.hashCode(this.isFlattenButtonVisible) * 31) + Boolean.hashCode(this.isFlattenButtonEnabled)) * 31) + Boolean.hashCode(this.isFlattenLoading)) * 31) + Boolean.hashCode(this.showFlattenOrdersTooltip)) * 31;
                NbboSummary nbboSummary = this.nbboSummary;
                return ((iHashCode + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + Boolean.hashCode(this.nbboLoading);
            }

            public String toString() {
                return "FlattenButtonData(isFlattenButtonVisible=" + this.isFlattenButtonVisible + ", isFlattenButtonEnabled=" + this.isFlattenButtonEnabled + ", isFlattenLoading=" + this.isFlattenLoading + ", showFlattenOrdersTooltip=" + this.showFlattenOrdersTooltip + ", nbboSummary=" + this.nbboSummary + ", nbboLoading=" + this.nbboLoading + ")";
            }

            public FlattenButtonData(boolean z, boolean z2, boolean z3, boolean z4, NbboSummary nbboSummary, boolean z5) {
                this.isFlattenButtonVisible = z;
                this.isFlattenButtonEnabled = z2;
                this.isFlattenLoading = z3;
                this.showFlattenOrdersTooltip = z4;
                this.nbboSummary = nbboSummary;
                this.nbboLoading = z5;
            }

            public final boolean isFlattenButtonVisible() {
                return this.isFlattenButtonVisible;
            }

            public final boolean isFlattenButtonEnabled() {
                return this.isFlattenButtonEnabled;
            }

            public final boolean isFlattenLoading() {
                return this.isFlattenLoading;
            }

            public final boolean getShowFlattenOrdersTooltip() {
                return this.showFlattenOrdersTooltip;
            }

            public final NbboSummary getNbboSummary() {
                return this.nbboSummary;
            }

            public final boolean getNbboLoading() {
                return this.nbboLoading;
            }
        }
    }

    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$MarketClosedHeaderData;", "", "headerString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getHeaderString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketClosedHeaderData {
        public static final int $stable = StringResource.$stable;
        private final StringResource headerString;

        public static /* synthetic */ MarketClosedHeaderData copy$default(MarketClosedHeaderData marketClosedHeaderData, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = marketClosedHeaderData.headerString;
            }
            return marketClosedHeaderData.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getHeaderString() {
            return this.headerString;
        }

        public final MarketClosedHeaderData copy(StringResource headerString) {
            return new MarketClosedHeaderData(headerString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarketClosedHeaderData) && Intrinsics.areEqual(this.headerString, ((MarketClosedHeaderData) other).headerString);
        }

        public int hashCode() {
            StringResource stringResource = this.headerString;
            if (stringResource == null) {
                return 0;
            }
            return stringResource.hashCode();
        }

        public String toString() {
            return "MarketClosedHeaderData(headerString=" + this.headerString + ")";
        }

        public MarketClosedHeaderData(StringResource stringResource) {
            this.headerString = stringResource;
        }

        public final StringResource getHeaderString() {
            return this.headerString;
        }
    }

    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$L2DataUnavailableHeaderData;", "", "headerString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getHeaderString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class L2DataUnavailableHeaderData {
        public static final int $stable = StringResource.$stable;
        private final StringResource headerString;

        public static /* synthetic */ L2DataUnavailableHeaderData copy$default(L2DataUnavailableHeaderData l2DataUnavailableHeaderData, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = l2DataUnavailableHeaderData.headerString;
            }
            return l2DataUnavailableHeaderData.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getHeaderString() {
            return this.headerString;
        }

        public final L2DataUnavailableHeaderData copy(StringResource headerString) {
            return new L2DataUnavailableHeaderData(headerString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof L2DataUnavailableHeaderData) && Intrinsics.areEqual(this.headerString, ((L2DataUnavailableHeaderData) other).headerString);
        }

        public int hashCode() {
            StringResource stringResource = this.headerString;
            if (stringResource == null) {
                return 0;
            }
            return stringResource.hashCode();
        }

        public String toString() {
            return "L2DataUnavailableHeaderData(headerString=" + this.headerString + ")";
        }

        public L2DataUnavailableHeaderData(StringResource stringResource) {
            this.headerString = stringResource;
        }

        public final StringResource getHeaderString() {
            return this.headerString;
        }
    }

    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$InstrumentHaltedHeaderData;", "", "headerString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getHeaderString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstrumentHaltedHeaderData {
        public static final int $stable = StringResource.$stable;
        private final StringResource headerString;

        public static /* synthetic */ InstrumentHaltedHeaderData copy$default(InstrumentHaltedHeaderData instrumentHaltedHeaderData, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = instrumentHaltedHeaderData.headerString;
            }
            return instrumentHaltedHeaderData.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getHeaderString() {
            return this.headerString;
        }

        public final InstrumentHaltedHeaderData copy(StringResource headerString) {
            return new InstrumentHaltedHeaderData(headerString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InstrumentHaltedHeaderData) && Intrinsics.areEqual(this.headerString, ((InstrumentHaltedHeaderData) other).headerString);
        }

        public int hashCode() {
            StringResource stringResource = this.headerString;
            if (stringResource == null) {
                return 0;
            }
            return stringResource.hashCode();
        }

        public String toString() {
            return "InstrumentHaltedHeaderData(headerString=" + this.headerString + ")";
        }

        public InstrumentHaltedHeaderData(StringResource stringResource) {
            this.headerString = stringResource;
        }

        public final StringResource getHeaderString() {
            return this.headerString;
        }
    }

    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "", "MarketOrderData", "NbboData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData$MarketOrderData;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData$NbboData;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BottomBarData {

        /* compiled from: EquityTradeLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\u0091\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\bHÆ\u0001J\u0013\u00107\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001d¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData$MarketOrderData;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "quantity", "Ljava/math/BigDecimal;", "buyingPowerDisplay", "quantitySelectorOpen", "", "showLoadingOnMarketBuyButton", "showLoadingOnMarketSellButton", "showNbbo", "nbboLoading", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "buyButtonState", "Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;", "sellButtonState", "quantityInputMode", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "isShorting", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Lcom/robinhood/utils/resource/StringResource;ZZZZZLcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;Z)V", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getQuantity", "()Ljava/math/BigDecimal;", "getBuyingPowerDisplay", "getQuantitySelectorOpen", "()Z", "getShowLoadingOnMarketBuyButton", "getShowLoadingOnMarketSellButton", "getShowNbbo", "getNbboLoading", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getBuyButtonState", "()Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;", "getSellButtonState", "getQuantityInputMode", "()Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarketOrderData implements BottomBarData {
            public static final int $stable = 8;
            private final StringResource accountDisplayName;
            private final EquityTradeButtonState buyButtonState;
            private final StringResource buyingPowerDisplay;
            private final boolean isShorting;
            private final boolean nbboLoading;
            private final NbboSummary nbboSummary;
            private final BigDecimal quantity;
            private final TradeQuantity quantityInputMode;
            private final boolean quantitySelectorOpen;
            private final EquityTradeButtonState sellButtonState;
            private final boolean showLoadingOnMarketBuyButton;
            private final boolean showLoadingOnMarketSellButton;
            private final boolean showNbbo;

            public static /* synthetic */ MarketOrderData copy$default(MarketOrderData marketOrderData, StringResource stringResource, BigDecimal bigDecimal, StringResource stringResource2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, NbboSummary nbboSummary, EquityTradeButtonState equityTradeButtonState, EquityTradeButtonState equityTradeButtonState2, TradeQuantity tradeQuantity, boolean z6, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = marketOrderData.accountDisplayName;
                }
                return marketOrderData.copy(stringResource, (i & 2) != 0 ? marketOrderData.quantity : bigDecimal, (i & 4) != 0 ? marketOrderData.buyingPowerDisplay : stringResource2, (i & 8) != 0 ? marketOrderData.quantitySelectorOpen : z, (i & 16) != 0 ? marketOrderData.showLoadingOnMarketBuyButton : z2, (i & 32) != 0 ? marketOrderData.showLoadingOnMarketSellButton : z3, (i & 64) != 0 ? marketOrderData.showNbbo : z4, (i & 128) != 0 ? marketOrderData.nbboLoading : z5, (i & 256) != 0 ? marketOrderData.nbboSummary : nbboSummary, (i & 512) != 0 ? marketOrderData.buyButtonState : equityTradeButtonState, (i & 1024) != 0 ? marketOrderData.sellButtonState : equityTradeButtonState2, (i & 2048) != 0 ? marketOrderData.quantityInputMode : tradeQuantity, (i & 4096) != 0 ? marketOrderData.isShorting : z6);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getAccountDisplayName() {
                return this.accountDisplayName;
            }

            /* renamed from: component10, reason: from getter */
            public final EquityTradeButtonState getBuyButtonState() {
                return this.buyButtonState;
            }

            /* renamed from: component11, reason: from getter */
            public final EquityTradeButtonState getSellButtonState() {
                return this.sellButtonState;
            }

            /* renamed from: component12, reason: from getter */
            public final TradeQuantity getQuantityInputMode() {
                return this.quantityInputMode;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getIsShorting() {
                return this.isShorting;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getQuantity() {
                return this.quantity;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getBuyingPowerDisplay() {
                return this.buyingPowerDisplay;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getQuantitySelectorOpen() {
                return this.quantitySelectorOpen;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowLoadingOnMarketBuyButton() {
                return this.showLoadingOnMarketBuyButton;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getShowLoadingOnMarketSellButton() {
                return this.showLoadingOnMarketSellButton;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getShowNbbo() {
                return this.showNbbo;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getNbboLoading() {
                return this.nbboLoading;
            }

            /* renamed from: component9, reason: from getter */
            public final NbboSummary getNbboSummary() {
                return this.nbboSummary;
            }

            public final MarketOrderData copy(StringResource accountDisplayName, BigDecimal quantity, StringResource buyingPowerDisplay, boolean quantitySelectorOpen, boolean showLoadingOnMarketBuyButton, boolean showLoadingOnMarketSellButton, boolean showNbbo, boolean nbboLoading, NbboSummary nbboSummary, EquityTradeButtonState buyButtonState, EquityTradeButtonState sellButtonState, TradeQuantity quantityInputMode, boolean isShorting) {
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(buyButtonState, "buyButtonState");
                Intrinsics.checkNotNullParameter(sellButtonState, "sellButtonState");
                Intrinsics.checkNotNullParameter(quantityInputMode, "quantityInputMode");
                return new MarketOrderData(accountDisplayName, quantity, buyingPowerDisplay, quantitySelectorOpen, showLoadingOnMarketBuyButton, showLoadingOnMarketSellButton, showNbbo, nbboLoading, nbboSummary, buyButtonState, sellButtonState, quantityInputMode, isShorting);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarketOrderData)) {
                    return false;
                }
                MarketOrderData marketOrderData = (MarketOrderData) other;
                return Intrinsics.areEqual(this.accountDisplayName, marketOrderData.accountDisplayName) && Intrinsics.areEqual(this.quantity, marketOrderData.quantity) && Intrinsics.areEqual(this.buyingPowerDisplay, marketOrderData.buyingPowerDisplay) && this.quantitySelectorOpen == marketOrderData.quantitySelectorOpen && this.showLoadingOnMarketBuyButton == marketOrderData.showLoadingOnMarketBuyButton && this.showLoadingOnMarketSellButton == marketOrderData.showLoadingOnMarketSellButton && this.showNbbo == marketOrderData.showNbbo && this.nbboLoading == marketOrderData.nbboLoading && Intrinsics.areEqual(this.nbboSummary, marketOrderData.nbboSummary) && Intrinsics.areEqual(this.buyButtonState, marketOrderData.buyButtonState) && Intrinsics.areEqual(this.sellButtonState, marketOrderData.sellButtonState) && this.quantityInputMode == marketOrderData.quantityInputMode && this.isShorting == marketOrderData.isShorting;
            }

            public int hashCode() {
                StringResource stringResource = this.accountDisplayName;
                int iHashCode = (((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.quantity.hashCode()) * 31;
                StringResource stringResource2 = this.buyingPowerDisplay;
                int iHashCode2 = (((((((((((iHashCode + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + Boolean.hashCode(this.quantitySelectorOpen)) * 31) + Boolean.hashCode(this.showLoadingOnMarketBuyButton)) * 31) + Boolean.hashCode(this.showLoadingOnMarketSellButton)) * 31) + Boolean.hashCode(this.showNbbo)) * 31) + Boolean.hashCode(this.nbboLoading)) * 31;
                NbboSummary nbboSummary = this.nbboSummary;
                return ((((((((iHashCode2 + (nbboSummary != null ? nbboSummary.hashCode() : 0)) * 31) + this.buyButtonState.hashCode()) * 31) + this.sellButtonState.hashCode()) * 31) + this.quantityInputMode.hashCode()) * 31) + Boolean.hashCode(this.isShorting);
            }

            public String toString() {
                return "MarketOrderData(accountDisplayName=" + this.accountDisplayName + ", quantity=" + this.quantity + ", buyingPowerDisplay=" + this.buyingPowerDisplay + ", quantitySelectorOpen=" + this.quantitySelectorOpen + ", showLoadingOnMarketBuyButton=" + this.showLoadingOnMarketBuyButton + ", showLoadingOnMarketSellButton=" + this.showLoadingOnMarketSellButton + ", showNbbo=" + this.showNbbo + ", nbboLoading=" + this.nbboLoading + ", nbboSummary=" + this.nbboSummary + ", buyButtonState=" + this.buyButtonState + ", sellButtonState=" + this.sellButtonState + ", quantityInputMode=" + this.quantityInputMode + ", isShorting=" + this.isShorting + ")";
            }

            public MarketOrderData(StringResource stringResource, BigDecimal quantity, StringResource stringResource2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, NbboSummary nbboSummary, EquityTradeButtonState buyButtonState, EquityTradeButtonState sellButtonState, TradeQuantity quantityInputMode, boolean z6) {
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(buyButtonState, "buyButtonState");
                Intrinsics.checkNotNullParameter(sellButtonState, "sellButtonState");
                Intrinsics.checkNotNullParameter(quantityInputMode, "quantityInputMode");
                this.accountDisplayName = stringResource;
                this.quantity = quantity;
                this.buyingPowerDisplay = stringResource2;
                this.quantitySelectorOpen = z;
                this.showLoadingOnMarketBuyButton = z2;
                this.showLoadingOnMarketSellButton = z3;
                this.showNbbo = z4;
                this.nbboLoading = z5;
                this.nbboSummary = nbboSummary;
                this.buyButtonState = buyButtonState;
                this.sellButtonState = sellButtonState;
                this.quantityInputMode = quantityInputMode;
                this.isShorting = z6;
            }

            public final StringResource getAccountDisplayName() {
                return this.accountDisplayName;
            }

            public final BigDecimal getQuantity() {
                return this.quantity;
            }

            public final StringResource getBuyingPowerDisplay() {
                return this.buyingPowerDisplay;
            }

            public final boolean getQuantitySelectorOpen() {
                return this.quantitySelectorOpen;
            }

            public final boolean getShowLoadingOnMarketBuyButton() {
                return this.showLoadingOnMarketBuyButton;
            }

            public final boolean getShowLoadingOnMarketSellButton() {
                return this.showLoadingOnMarketSellButton;
            }

            public final boolean getShowNbbo() {
                return this.showNbbo;
            }

            public final boolean getNbboLoading() {
                return this.nbboLoading;
            }

            public final NbboSummary getNbboSummary() {
                return this.nbboSummary;
            }

            public final EquityTradeButtonState getBuyButtonState() {
                return this.buyButtonState;
            }

            public final EquityTradeButtonState getSellButtonState() {
                return this.sellButtonState;
            }

            public final TradeQuantity getQuantityInputMode() {
                return this.quantityInputMode;
            }

            public final boolean isShorting() {
                return this.isShorting;
            }
        }

        /* compiled from: EquityTradeLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData$NbboData;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "nbboLoading", "", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "<init>", "(ZLcom/robinhood/nbbo/models/db/NbboSummary;)V", "getNbboLoading", "()Z", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NbboData implements BottomBarData {
            public static final int $stable = 8;
            private final boolean nbboLoading;
            private final NbboSummary nbboSummary;

            public static /* synthetic */ NbboData copy$default(NbboData nbboData, boolean z, NbboSummary nbboSummary, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = nbboData.nbboLoading;
                }
                if ((i & 2) != 0) {
                    nbboSummary = nbboData.nbboSummary;
                }
                return nbboData.copy(z, nbboSummary);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getNbboLoading() {
                return this.nbboLoading;
            }

            /* renamed from: component2, reason: from getter */
            public final NbboSummary getNbboSummary() {
                return this.nbboSummary;
            }

            public final NbboData copy(boolean nbboLoading, NbboSummary nbboSummary) {
                return new NbboData(nbboLoading, nbboSummary);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NbboData)) {
                    return false;
                }
                NbboData nbboData = (NbboData) other;
                return this.nbboLoading == nbboData.nbboLoading && Intrinsics.areEqual(this.nbboSummary, nbboData.nbboSummary);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.nbboLoading) * 31;
                NbboSummary nbboSummary = this.nbboSummary;
                return iHashCode + (nbboSummary == null ? 0 : nbboSummary.hashCode());
            }

            public String toString() {
                return "NbboData(nbboLoading=" + this.nbboLoading + ", nbboSummary=" + this.nbboSummary + ")";
            }

            public NbboData(boolean z, NbboSummary nbboSummary) {
                this.nbboLoading = z;
                this.nbboSummary = nbboSummary;
            }

            public final boolean getNbboLoading() {
                return this.nbboLoading;
            }

            public final NbboSummary getNbboSummary() {
                return this.nbboSummary;
            }
        }
    }

    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "account", "Lcom/robinhood/models/db/Account;", "stocksAndEtfTitle", "Lcom/robinhood/utils/resource/StringResource;", "autoSend", "", "autoSendLoading", "hideAutoSendToggle", "shortingEnabled", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;ZZZ)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getStocksAndEtfTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAutoSend", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutoSendLoading", "()Z", "getHideAutoSendToggle", "getShortingEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;ZZZ)Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;", "equals", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SettingsBottomSheetData {
        public static final int $stable = 8;
        private final Account account;
        private final Boolean autoSend;
        private final boolean autoSendLoading;
        private final boolean hideAutoSendToggle;
        private final Instrument instrument;
        private final boolean shortingEnabled;
        private final StringResource stocksAndEtfTitle;

        public static /* synthetic */ SettingsBottomSheetData copy$default(SettingsBottomSheetData settingsBottomSheetData, Instrument instrument, Account account, StringResource stringResource, Boolean bool, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = settingsBottomSheetData.instrument;
            }
            if ((i & 2) != 0) {
                account = settingsBottomSheetData.account;
            }
            if ((i & 4) != 0) {
                stringResource = settingsBottomSheetData.stocksAndEtfTitle;
            }
            if ((i & 8) != 0) {
                bool = settingsBottomSheetData.autoSend;
            }
            if ((i & 16) != 0) {
                z = settingsBottomSheetData.autoSendLoading;
            }
            if ((i & 32) != 0) {
                z2 = settingsBottomSheetData.hideAutoSendToggle;
            }
            if ((i & 64) != 0) {
                z3 = settingsBottomSheetData.shortingEnabled;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            boolean z6 = z;
            StringResource stringResource2 = stringResource;
            return settingsBottomSheetData.copy(instrument, account, stringResource2, bool, z6, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getStocksAndEtfTitle() {
            return this.stocksAndEtfTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getAutoSend() {
            return this.autoSend;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAutoSendLoading() {
            return this.autoSendLoading;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHideAutoSendToggle() {
            return this.hideAutoSendToggle;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShortingEnabled() {
            return this.shortingEnabled;
        }

        public final SettingsBottomSheetData copy(Instrument instrument, Account account, StringResource stocksAndEtfTitle, Boolean autoSend, boolean autoSendLoading, boolean hideAutoSendToggle, boolean shortingEnabled) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(stocksAndEtfTitle, "stocksAndEtfTitle");
            return new SettingsBottomSheetData(instrument, account, stocksAndEtfTitle, autoSend, autoSendLoading, hideAutoSendToggle, shortingEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsBottomSheetData)) {
                return false;
            }
            SettingsBottomSheetData settingsBottomSheetData = (SettingsBottomSheetData) other;
            return Intrinsics.areEqual(this.instrument, settingsBottomSheetData.instrument) && Intrinsics.areEqual(this.account, settingsBottomSheetData.account) && Intrinsics.areEqual(this.stocksAndEtfTitle, settingsBottomSheetData.stocksAndEtfTitle) && Intrinsics.areEqual(this.autoSend, settingsBottomSheetData.autoSend) && this.autoSendLoading == settingsBottomSheetData.autoSendLoading && this.hideAutoSendToggle == settingsBottomSheetData.hideAutoSendToggle && this.shortingEnabled == settingsBottomSheetData.shortingEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((this.instrument.hashCode() * 31) + this.account.hashCode()) * 31) + this.stocksAndEtfTitle.hashCode()) * 31;
            Boolean bool = this.autoSend;
            return ((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.autoSendLoading)) * 31) + Boolean.hashCode(this.hideAutoSendToggle)) * 31) + Boolean.hashCode(this.shortingEnabled);
        }

        public String toString() {
            return "SettingsBottomSheetData(instrument=" + this.instrument + ", account=" + this.account + ", stocksAndEtfTitle=" + this.stocksAndEtfTitle + ", autoSend=" + this.autoSend + ", autoSendLoading=" + this.autoSendLoading + ", hideAutoSendToggle=" + this.hideAutoSendToggle + ", shortingEnabled=" + this.shortingEnabled + ")";
        }

        public SettingsBottomSheetData(Instrument instrument, Account account, StringResource stocksAndEtfTitle, Boolean bool, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(stocksAndEtfTitle, "stocksAndEtfTitle");
            this.instrument = instrument;
            this.account = account;
            this.stocksAndEtfTitle = stocksAndEtfTitle;
            this.autoSend = bool;
            this.autoSendLoading = z;
            this.hideAutoSendToggle = z2;
            this.shortingEnabled = z3;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Account getAccount() {
            return this.account;
        }

        public final StringResource getStocksAndEtfTitle() {
            return this.stocksAndEtfTitle;
        }

        public final Boolean getAutoSend() {
            return this.autoSend;
        }

        public final boolean getAutoSendLoading() {
            return this.autoSendLoading;
        }

        public final boolean getHideAutoSendToggle() {
            return this.hideAutoSendToggle;
        }

        public final boolean getShortingEnabled() {
            return this.shortingEnabled;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityTradeLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$EquityTradeLadderPerformanceIdentifier;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY_TRADE_LADDER", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EquityTradeLadderPerformanceIdentifier {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EquityTradeLadderPerformanceIdentifier[] $VALUES;
        public static final EquityTradeLadderPerformanceIdentifier EQUITY_TRADE_LADDER = new EquityTradeLadderPerformanceIdentifier("EQUITY_TRADE_LADDER", 0);

        private static final /* synthetic */ EquityTradeLadderPerformanceIdentifier[] $values() {
            return new EquityTradeLadderPerformanceIdentifier[]{EQUITY_TRADE_LADDER};
        }

        public static EnumEntries<EquityTradeLadderPerformanceIdentifier> getEntries() {
            return $ENTRIES;
        }

        private EquityTradeLadderPerformanceIdentifier(String str, int i) {
        }

        static {
            EquityTradeLadderPerformanceIdentifier[] equityTradeLadderPerformanceIdentifierArr$values = $values();
            $VALUES = equityTradeLadderPerformanceIdentifierArr$values;
            $ENTRIES = EnumEntries2.enumEntries(equityTradeLadderPerformanceIdentifierArr$values);
        }

        public static EquityTradeLadderPerformanceIdentifier valueOf(String str) {
            return (EquityTradeLadderPerformanceIdentifier) Enum.valueOf(EquityTradeLadderPerformanceIdentifier.class, str);
        }

        public static EquityTradeLadderPerformanceIdentifier[] values() {
            return (EquityTradeLadderPerformanceIdentifier[]) $VALUES.clone();
        }
    }
}
