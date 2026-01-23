package com.robinhood.android.cash.cushion.upsell;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CashCushionUpsellBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt$lambda$-602914372$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CashCushionUpsellBottomSheetComposable3 implements Function2<Composer, Integer, Unit> {
    public static final CashCushionUpsellBottomSheetComposable3 INSTANCE = new CashCushionUpsellBottomSheetComposable3();

    CashCushionUpsellBottomSheetComposable3() {
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
            ComposerKt.traceEventStart(-602914372, i, -1, "com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt.lambda$-602914372.<anonymous> (CashCushionUpsellBottomSheetComposable.kt:90)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt$lambda$-602914372$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt$lambda$-602914372$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CashCushionUpsellBottomSheetComposable.CashCushionUpsellBottomSheetComposable(modifierM4872backgroundbw27NRU$default, false, function0, (Function0) objRememberedValue2, composer, 3504, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
