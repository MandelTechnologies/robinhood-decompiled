package com.robinhood.android.equities.tradesettings.equity.p119ts;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityTradingSessionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.ComposableSingletons$EquityTradingSessionBottomSheetKt$lambda$1127386294$1 */
/* loaded from: classes3.dex */
final class C15023xa10d72db implements Function2<Composer, Integer, Unit> {
    public static final C15023xa10d72db INSTANCE = new C15023xa10d72db();

    C15023xa10d72db() {
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
            ComposerKt.traceEventStart(1127386294, i, -1, "com.robinhood.android.equities.tradesettings.equity.ts.ComposableSingletons$EquityTradingSessionBottomSheetKt.lambda$1127386294.<anonymous> (EquityTradingSessionBottomSheet.kt:278)");
        }
        OrderMarketHours orderMarketHours = OrderMarketHours.ALL_DAY_HOURS;
        OrderMarketHours orderMarketHours2 = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        SelectionRowState selectionRowState = new SelectionRowState(orderMarketHours2, companion.invoke("Market Hours"), companion.invoke("From 6:30 AM to 1:00 PM"), false, 8, null);
        OrderMarketHours orderMarketHours3 = OrderMarketHours.EXTENDED_HOURS;
        EquityTradingSessionViewState equityTradingSessionViewState = new EquityTradingSessionViewState(orderMarketHours, extensions2.persistentListOf(selectionRowState, new SelectionRowState(orderMarketHours3, companion.invoke("Extended Hours"), companion.invoke("From 4:00 AM to 5:00 PM"), false, 8, null), new SelectionRowState(orderMarketHours, companion.invoke("24 Hour Market"), companion.invoke("From 5:00 PM to 5:00 PM"), false, 8, null)), true, orderMarketHours3, extensions2.persistentListOf(new SelectionRowState(orderMarketHours2, companion.invoke("Market Hours"), companion.invoke("From 6:30 AM to 1:00 PM"), false, 8, null), new SelectionRowState(orderMarketHours3, companion.invoke("Extended Hours"), companion.invoke("From 4:00 AM to 5:00 PM"), false, 8, null)), companion.invoke(C14990R.string.trading_session_eh_24_disclosure, new Object[0]), true);
        TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.TRADE_FLOW;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function3() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.ComposableSingletons$EquityTradingSessionBottomSheetKt$lambda$1127386294$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C15023xa10d72db.invoke$lambda$1$lambda$0((TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderMarketHours) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function3 function3 = (Function3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.ts.ComposableSingletons$EquityTradingSessionBottomSheetKt$lambda$1127386294$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EquityTradingSessionBottomSheetKt.EquityTradingSessionComposable(equityTradingSessionViewState, tradeSettingsStore4, function3, (Function0) objRememberedValue2, null, composer, StringResource.$stable | 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderMarketHours orderMarketHours) {
        Intrinsics.checkNotNullParameter(tradeSettingsStore4, "<unused var>");
        Intrinsics.checkNotNullParameter(tradeSettingsStore3, "<unused var>");
        Intrinsics.checkNotNullParameter(orderMarketHours, "<unused var>");
        return Unit.INSTANCE;
    }
}
