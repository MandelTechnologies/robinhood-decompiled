package com.robinhood.compose.app;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ShimmerLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.app.ComposableSingletons$ShimmerLoadingFragmentKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ShimmerLoadingFragment2 {
    public static final ShimmerLoadingFragment2 INSTANCE = new ShimmerLoadingFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1916351204 = ComposableLambda3.composableLambdaInstance(1916351204, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.ComposableSingletons$ShimmerLoadingFragmentKt$lambda$1916351204$1
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
                ComposerKt.traceEventStart(1916351204, i, -1, "com.robinhood.compose.app.ComposableSingletons$ShimmerLoadingFragmentKt.lambda$1916351204.<anonymous> (ShimmerLoadingFragment.kt:31)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1916351204$lib_compose_app_externalDebug() {
        return lambda$1916351204;
    }
}
