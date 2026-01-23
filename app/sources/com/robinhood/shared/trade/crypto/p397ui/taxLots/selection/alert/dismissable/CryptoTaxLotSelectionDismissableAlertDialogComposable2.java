package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.alert.dismissable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionDismissableAlertDialogComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.dismissable.ComposableSingletons$CryptoTaxLotSelectionDismissableAlertDialogComposableKt$lambda$970489642$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTaxLotSelectionDismissableAlertDialogComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoTaxLotSelectionDismissableAlertDialogComposable2 INSTANCE = new CryptoTaxLotSelectionDismissableAlertDialogComposable2();

    CryptoTaxLotSelectionDismissableAlertDialogComposable2() {
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
            ComposerKt.traceEventStart(970489642, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.dismissable.ComposableSingletons$CryptoTaxLotSelectionDismissableAlertDialogComposableKt.lambda$970489642.<anonymous> (CryptoTaxLotSelectionDismissableAlertDialogComposable.kt:58)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.alert.dismissable.ComposableSingletons$CryptoTaxLotSelectionDismissableAlertDialogComposableKt$lambda$970489642$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoTaxLotSelectionDismissableAlertDialogComposable3.CryptoTaxLotSelectionDismissableAlertDialogComposable("You’ve reached your lot limit", "You can select up to 50 lots per order. Place another order for the remaining lots or contact customer support to place an order with more than 50 lots.", "", (Function0) objRememberedValue, null, composer, 3462, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
