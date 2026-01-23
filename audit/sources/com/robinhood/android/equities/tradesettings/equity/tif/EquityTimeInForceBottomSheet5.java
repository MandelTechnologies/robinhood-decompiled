package com.robinhood.android.equities.tradesettings.equity.tif;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equities.tradesettings.equity.tif.EquityTimeInForceViewState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityTimeInForceBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.equity.tif.ComposableSingletons$EquityTimeInForceBottomSheetKt$lambda$1640125144$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTimeInForceBottomSheet5 implements Function2<Composer, Integer, Unit> {
    public static final EquityTimeInForceBottomSheet5 INSTANCE = new EquityTimeInForceBottomSheet5();

    EquityTimeInForceBottomSheet5() {
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
            ComposerKt.traceEventStart(1640125144, i, -1, "com.robinhood.android.equities.tradesettings.equity.tif.ComposableSingletons$EquityTimeInForceBottomSheetKt.lambda$1640125144.<anonymous> (EquityTimeInForceBottomSheet.kt:198)");
        }
        EquityTimeInForceViewState.Loading loading = EquityTimeInForceViewState.Loading.INSTANCE;
        TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.MAC;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function3() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.ComposableSingletons$EquityTimeInForceBottomSheetKt$lambda$1640125144$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return EquityTimeInForceBottomSheet5.invoke$lambda$1$lambda$0((TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderTimeInForce) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function3 function3 = (Function3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.equity.tif.ComposableSingletons$EquityTimeInForceBottomSheetKt$lambda$1640125144$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EquityTimeInForceBottomSheet7.EquityTimeInForceComposable(loading, tradeSettingsStore4, function3, (Function0) objRememberedValue2, null, composer, 3510, 16);
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
