package com.robinhood.android.optionsrolling.p209ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionRollingNuxComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsrolling.ui.ComposableSingletons$OptionRollingNuxComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionRollingNuxComposable {
    public static final OptionRollingNuxComposable INSTANCE = new OptionRollingNuxComposable();

    /* renamed from: lambda$-1636095085, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9158lambda$1636095085 = ComposableLambda3.composableLambdaInstance(-1636095085, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.ComposableSingletons$OptionRollingNuxComposableKt$lambda$-1636095085$1
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
                ComposerKt.traceEventStart(-1636095085, i, -1, "com.robinhood.android.optionsrolling.ui.ComposableSingletons$OptionRollingNuxComposableKt.lambda$-1636095085.<anonymous> (OptionRollingNuxComposable.kt:42)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1636095085$feature_options_rolling_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17338getLambda$1636095085$feature_options_rolling_externalDebug() {
        return f9158lambda$1636095085;
    }
}
