package com.robinhood.android.cash.lib.atm.p072ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AtmMiniFinderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.lib.atm.ui.ComposableSingletons$AtmMiniFinderComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AtmMiniFinderComposable4 {
    public static final AtmMiniFinderComposable4 INSTANCE = new AtmMiniFinderComposable4();

    /* renamed from: lambda$-1366625606, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8676lambda$1366625606 = ComposableLambda3.composableLambdaInstance(-1366625606, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.lib.atm.ui.ComposableSingletons$AtmMiniFinderComposableKt$lambda$-1366625606$1
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
                ComposerKt.traceEventStart(-1366625606, i, -1, "com.robinhood.android.cash.lib.atm.ui.ComposableSingletons$AtmMiniFinderComposableKt.lambda$-1366625606.<anonymous> (AtmMiniFinderComposable.kt:146)");
            }
            AtmMiniFinderComposable.AtmMiniFinderNeedsPermission(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1366625606$lib_cash_atm_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11557getLambda$1366625606$lib_cash_atm_externalDebug() {
        return f8676lambda$1366625606;
    }
}
