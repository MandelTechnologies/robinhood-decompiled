package com.robinhood.android.directdeposit.p101ui.redirect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RedirectDirectDepositBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class RedirectDirectDepositBottomSheetComposable {
    public static final RedirectDirectDepositBottomSheetComposable INSTANCE = new RedirectDirectDepositBottomSheetComposable();
    private static Function2<Composer, Integer, Unit> lambda$874699410 = ComposableLambda3.composableLambdaInstance(874699410, false, RedirectDirectDepositBottomSheetComposable3.INSTANCE);

    /* renamed from: lambda$-547449539, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8873lambda$547449539 = ComposableLambda3.composableLambdaInstance(-547449539, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt$lambda$-547449539$1
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
                ComposerKt.traceEventStart(-547449539, i, -1, "com.robinhood.android.directdeposit.ui.redirect.ComposableSingletons$RedirectDirectDepositBottomSheetComposableKt.lambda$-547449539.<anonymous> (RedirectDirectDepositBottomSheetComposable.kt:101)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(RedirectDirectDepositBottomSheetComposable.INSTANCE.getLambda$874699410$feature_direct_deposit_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-547449539$feature_direct_deposit_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13330getLambda$547449539$feature_direct_deposit_externalDebug() {
        return f8873lambda$547449539;
    }

    public final Function2<Composer, Integer, Unit> getLambda$874699410$feature_direct_deposit_externalDebug() {
        return lambda$874699410;
    }
}
