package com.robinhood.compose.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarqueeText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.common.ComposableSingletons$MarqueeTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class MarqueeText {
    public static final MarqueeText INSTANCE = new MarqueeText();

    /* renamed from: lambda$-1023894442, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9353lambda$1023894442 = ComposableLambda3.composableLambdaInstance(-1023894442, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$MarqueeTextKt$lambda$-1023894442$1
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
                ComposerKt.traceEventStart(-1023894442, i, -1, "com.robinhood.compose.common.ComposableSingletons$MarqueeTextKt.lambda$-1023894442.<anonymous> (MarqueeText.kt:130)");
            }
            MarqueeText4.Gradient(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1023894442$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21642getLambda$1023894442$lib_compose_common_externalDebug() {
        return f9353lambda$1023894442;
    }
}
