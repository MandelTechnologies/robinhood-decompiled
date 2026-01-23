package com.robinhood.android.equitytradeladder.bottombar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.equities.equitytrade.EquityTradeButtonState;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTradeLadderBottomBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$1346593434$1 */
/* loaded from: classes3.dex */
final class C15915x56bcf18f implements Function2<Composer, Integer, Unit> {
    public static final C15915x56bcf18f INSTANCE = new C15915x56bcf18f();

    C15915x56bcf18f() {
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
            ComposerKt.traceEventStart(1346593434, i, -1, "com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt.lambda$1346593434.<anonymous> (EquityTradeLadderBottomBar.kt:293)");
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
            objRememberedValue = SnapshotState3.mutableStateOf$default(new EquityTradeLadderViewState.BottomBarData.MarketOrderData(stringResourceInvoke, ONE, stringResourceInvoke2, false, false, false, false, false, null, new EquityTradeButtonState(true, false, false, false, companion2.invoke("Buy MKT"), 14, null), new EquityTradeButtonState(true, false, false, false, companion2.invoke("Sell MKT"), 14, null), TradeQuantity.REPLACE, false), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderDataInvoke$lambda$1 = invoke$lambda$1(snapshotState);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$1346593434$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15915x56bcf18f.invoke$lambda$4$lambda$3(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$1346593434$1$$ExternalSyntheticLambda1
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
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$1346593434$1$$ExternalSyntheticLambda2
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
            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitytradeladder.bottombar.ComposableSingletons$EquityTradeLadderBottomBarKt$lambda$1346593434$1$$ExternalSyntheticLambda3
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
        snapshotState.setValue(EquityTradeLadderViewState.BottomBarData.MarketOrderData.copy$default(invoke$lambda$1(snapshotState), null, null, null, false, !invoke$lambda$1(snapshotState).getShowLoadingOnMarketBuyButton(), false, false, false, null, null, null, null, false, 8175, null));
        return Unit.INSTANCE;
    }
}
