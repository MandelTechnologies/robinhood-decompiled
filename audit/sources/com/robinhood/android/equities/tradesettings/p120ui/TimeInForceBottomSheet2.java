package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equities.tradesettings.TimeInForceViewState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TimeInForceBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt$lambda$-1259808703$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TimeInForceBottomSheet2 implements Function2<Composer, Integer, Unit> {
    public static final TimeInForceBottomSheet2 INSTANCE = new TimeInForceBottomSheet2();

    TimeInForceBottomSheet2() {
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
            ComposerKt.traceEventStart(-1259808703, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt.lambda$-1259808703.<anonymous> (TimeInForceBottomSheet.kt:133)");
        }
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
        StringResource.Companion companion = StringResource.INSTANCE;
        TimeInForceViewState.Loaded loaded = new TimeInForceViewState.Loaded(orderTimeInForce, extensions2.persistentListOf(new SelectionRowState(orderTimeInForce, companion.invoke("5 PM today"), companion.invoke("Good til 24-hour session close"), false, 8, null), new SelectionRowState(OrderTimeInForce.GTC, companion.invoke("Sep 7, 2025"), companion.invoke("Good til canceled (up to 90 days)"), false, 8, null)));
        TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.MAC;
        TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(EquityPositionType.LONG);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function3() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt$lambda$-1259808703$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TimeInForceBottomSheet2.invoke$lambda$1$lambda$0((TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderTimeInForce) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function3 function3 = (Function3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt$lambda$-1259808703$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        TimeInForceBottomSheet5.TimeInForceComposable(loaded, tradeSettingsStore4, equity, function3, (Function0) objRememberedValue2, null, composer, StringResource.$stable | 27696, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(tradeSettingsStore4, "<unused var>");
        Intrinsics.checkNotNullParameter(tradeSettingsStore3, "<unused var>");
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<unused var>");
        return Unit.INSTANCE;
    }
}
