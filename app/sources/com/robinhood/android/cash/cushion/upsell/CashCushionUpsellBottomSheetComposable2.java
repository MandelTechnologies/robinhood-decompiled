package com.robinhood.android.cash.cushion.upsell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CashCushionUpsellBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CashCushionUpsellBottomSheetComposable2 {
    public static final CashCushionUpsellBottomSheetComposable2 INSTANCE = new CashCushionUpsellBottomSheetComposable2();

    /* renamed from: lambda$-602914372, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8675lambda$602914372 = ComposableLambda3.composableLambdaInstance(-602914372, false, CashCushionUpsellBottomSheetComposable3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$560612903 = ComposableLambda3.composableLambdaInstance(560612903, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt$lambda$560612903$1
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
                ComposerKt.traceEventStart(560612903, i, -1, "com.robinhood.android.cash.cushion.upsell.ComposableSingletons$CashCushionUpsellBottomSheetComposableKt.lambda$560612903.<anonymous> (CashCushionUpsellBottomSheetComposable.kt:89)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(CashCushionUpsellBottomSheetComposable2.INSTANCE.m11489getLambda$602914372$feature_lib_cash_cushion_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-602914372$feature_lib_cash_cushion_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11489getLambda$602914372$feature_lib_cash_cushion_externalDebug() {
        return f8675lambda$602914372;
    }

    public final Function2<Composer, Integer, Unit> getLambda$560612903$feature_lib_cash_cushion_externalDebug() {
        return lambda$560612903;
    }
}
