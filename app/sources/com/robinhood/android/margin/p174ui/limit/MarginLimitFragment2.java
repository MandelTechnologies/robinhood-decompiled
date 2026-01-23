package com.robinhood.android.margin.p174ui.limit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginLimitFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.limit.ComposableSingletons$MarginLimitFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginLimitFragment2 {
    public static final MarginLimitFragment2 INSTANCE = new MarginLimitFragment2();

    /* renamed from: lambda$-923567876, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9104lambda$923567876 = ComposableLambda3.composableLambdaInstance(-923567876, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.limit.ComposableSingletons$MarginLimitFragmentKt$lambda$-923567876$1
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
                ComposerKt.traceEventStart(-923567876, i, -1, "com.robinhood.android.margin.ui.limit.ComposableSingletons$MarginLimitFragmentKt.lambda$-923567876.<anonymous> (MarginLimitFragment.kt:97)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-923567876$feature_margin_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16198getLambda$923567876$feature_margin_externalDebug() {
        return f9104lambda$923567876;
    }
}
