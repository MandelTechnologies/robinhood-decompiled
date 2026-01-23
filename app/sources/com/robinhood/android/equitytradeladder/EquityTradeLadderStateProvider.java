package com.robinhood.android.equitytradeladder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityTradeLadderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderStateProvider implements StateProvider<EquityTradeLadderDataState, EquityTradeLadderViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityTradeLadderViewState reduce(EquityTradeLadderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getLadderPriceData().getLastTradePrice() == null || dataState.getLadderPriceLevels() == null || dataState.getInstrument() == null) {
            return new EquityTradeLadderViewState(dataState.getTopBarData$feature_equity_trade_ladder_externalDebug(), dataState.m1997xeb3a5268(), dataState.m1996x9e573c94(), dataState.m1995xde5e887(), LadderState.Loading.INSTANCE, dataState.getBottomBarData$feature_equity_trade_ladder_externalDebug(), null, dataState.getLadderScreenState(), null, null, dataState.getLadderFtuxProgressState(), dataState.getEquitiesLadderContext(), EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, null);
        }
        EquityTradeLadderViewState.TopBarData topBarData$feature_equity_trade_ladder_externalDebug = dataState.getTopBarData$feature_equity_trade_ladder_externalDebug();
        EquityTradeLadderViewState.MarketClosedHeaderData marketClosedHeaderDataM1997xeb3a5268 = dataState.m1997xeb3a5268();
        EquityTradeLadderViewState.L2DataUnavailableHeaderData l2DataUnavailableHeaderDataM1996x9e573c94 = dataState.m1996x9e573c94();
        EquityTradeLadderViewState.InstrumentHaltedHeaderData instrumentHaltedHeaderDataM1995xde5e887 = dataState.m1995xde5e887();
        LadderState ladderState$feature_equity_trade_ladder_externalDebug = dataState.getLadderState$feature_equity_trade_ladder_externalDebug();
        EquityTradeLadderViewState.BottomBarData bottomBarData$feature_equity_trade_ladder_externalDebug = dataState.getBottomBarData$feature_equity_trade_ladder_externalDebug();
        EquityTradeLadderViewState.SettingsBottomSheetData settingsBottomSheetDataM1998xbf92d998 = dataState.m1998xbf92d998();
        LadderScreenState ladderScreenState = dataState.getLadderScreenState();
        EquityLadderOrderState equityLadderOrderState = dataState.getEquityLadderOrderState();
        Map<Integer, BigDecimal> zoomOverlayData$feature_equity_trade_ladder_externalDebug = dataState.getZoomOverlayData$feature_equity_trade_ladder_externalDebug();
        return new EquityTradeLadderViewState(topBarData$feature_equity_trade_ladder_externalDebug, marketClosedHeaderDataM1997xeb3a5268, l2DataUnavailableHeaderDataM1996x9e573c94, instrumentHaltedHeaderDataM1995xde5e887, ladderState$feature_equity_trade_ladder_externalDebug, bottomBarData$feature_equity_trade_ladder_externalDebug, settingsBottomSheetDataM1998xbf92d998, ladderScreenState, equityLadderOrderState, zoomOverlayData$feature_equity_trade_ladder_externalDebug != null ? extensions2.toImmutableMap(zoomOverlayData$feature_equity_trade_ladder_externalDebug) : null, dataState.getLadderFtuxProgressState(), dataState.getEquitiesLadderContext());
    }
}
