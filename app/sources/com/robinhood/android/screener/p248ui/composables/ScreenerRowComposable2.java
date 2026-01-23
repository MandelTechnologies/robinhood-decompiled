package com.robinhood.android.screener.p248ui.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenerRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.screener.ui.composables.ComposableSingletons$ScreenerRowComposableKt$lambda$-1729678300$1, reason: use source file name */
/* loaded from: classes5.dex */
final class ScreenerRowComposable2 implements Function2<Composer, Integer, Unit> {
    public static final ScreenerRowComposable2 INSTANCE = new ScreenerRowComposable2();

    ScreenerRowComposable2() {
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
            ComposerKt.traceEventStart(-1729678300, i, -1, "com.robinhood.android.screener.ui.composables.ComposableSingletons$ScreenerRowComposableKt.lambda$-1729678300.<anonymous> (ScreenerRowComposable.kt:166)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.screener.ui.composables.ComposableSingletons$ScreenerRowComposableKt$lambda$-1729678300$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.screener.ui.composables.ComposableSingletons$ScreenerRowComposableKt$lambda$-1729678300$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ScreenerRowComposable8.ScreenerRowComposable("Top 100 bestTop 100 bestThe best stocks that the stock market has is stock", "The best stocks that the stock market has is stock", null, false, function0, (Function0) objRememberedValue2, false, composer, 221622, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
