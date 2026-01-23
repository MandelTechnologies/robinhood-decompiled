package com.robinhood.android.equitytradeladder.bottombar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.equities.equitytrade.EquityTradeButtonState;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: EquityTradeLadderBottomBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$-615249085$1 */
/* loaded from: classes3.dex */
final class C15912x4f680268 implements Function2<Composer, Integer, Unit> {
    public static final C15912x4f680268 INSTANCE = new C15912x4f680268();

    C15912x4f680268() {
    }

    private static final EquityTradeLadderViewState.BottomBarData.MarketOrderData invoke$lambda$1(SnapshotState<EquityTradeLadderViewState.BottomBarData.MarketOrderData> snapshotState) {
        return snapshotState.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-615249085, i, -1, "com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt.lambda$-615249085.<anonymous> (EquityTradeLadderBottomBar.kt:460)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion2.invoke("account");
            StringResource stringResourceInvoke2 = companion2.invoke("buying power");
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            Instant instant = Instant.parse("2023-10-01T12:00:00Z");
            Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            Money money$default = Money3.toMoney$default(bigDecimalValueOf, null, 1, null);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(101);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            objRememberedValue = SnapshotState3.mutableStateOf$default(new EquityTradeLadderViewState.BottomBarData.MarketOrderData(stringResourceInvoke, ONE, stringResourceInvoke2, false, false, false, true, false, new NbboSummary(uuidRandomUUID, "Bid 126.00 x 350 Q * Ask 126.00 x 158 P \n Last sale 126.00 x 193 X * 9:57AM PT", "", "Refresh", instant, "100.00", "101.00", money$default, Money3.toMoney$default(bigDecimalValueOf2, null, 1, null), new NbboSummary.NbboSummaryMarketDialog("Last Sale: $100.50", "Last Sale Size: 100", "Best Bid: $100.00", "Best Bid Size: 200", "Best Ask: $101.00", "Best Ask Size: 150", "Market Summary", "This is a summary of the market data.")), new EquityTradeButtonState(true, false, false, false, companion2.invoke("Buy MKT"), 14, null), new EquityTradeButtonState(true, false, false, true, companion2.invoke("Submit"), 6, null), TradeQuantity.REPLACE, false), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderDataInvoke$lambda$1 = invoke$lambda$1(snapshotState);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$-615249085$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15912x4f680268.invoke$lambda$4$lambda$3(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$-615249085$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function02 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$-615249085$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function03 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$-615249085$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        EquityTradeLadderBottomBarKt.EquityTradeLadderBottomBar(marketOrderDataInvoke$lambda$1, function0, function02, function03, (Function0) objRememberedValue5, null, composer, 28080, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
        snapshotState.setValue(EquityTradeLadderViewState.BottomBarData.MarketOrderData.copy$default(invoke$lambda$1(snapshotState), null, null, null, false, !invoke$lambda$1(snapshotState).getShowLoadingOnMarketBuyButton(), false, false, false, null, EquityTradeButtonState.copy$default(invoke$lambda$1(snapshotState).getBuyButtonState(), false, false, !invoke$lambda$1(snapshotState).getBuyButtonState().getHide(), false, null, 27, null), EquityTradeButtonState.copy$default(invoke$lambda$1(snapshotState).getSellButtonState(), false, false, !invoke$lambda$1(snapshotState).getSellButtonState().getHide(), false, null, 27, null), null, false, 6639, null));
        return Unit.INSTANCE;
    }
}
