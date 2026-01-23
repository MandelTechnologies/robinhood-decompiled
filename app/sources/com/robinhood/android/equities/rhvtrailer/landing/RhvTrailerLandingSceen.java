package com.robinhood.android.equities.rhvtrailer.landing;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhvTrailerLandingSceen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.rhvtrailer.landing.ComposableSingletons$RhvTrailerLandingSceenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhvTrailerLandingSceen {
    public static final RhvTrailerLandingSceen INSTANCE = new RhvTrailerLandingSceen();

    /* renamed from: lambda$-1231144210, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8883lambda$1231144210 = ComposableLambda3.composableLambdaInstance(-1231144210, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.landing.ComposableSingletons$RhvTrailerLandingSceenKt$lambda$-1231144210$1
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
                ComposerKt.traceEventStart(-1231144210, i, -1, "com.robinhood.android.equities.rhvtrailer.landing.ComposableSingletons$RhvTrailerLandingSceenKt.lambda$-1231144210.<anonymous> (RhvTrailerLandingSceen.kt:66)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1231144210$feature_rhv_trailer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13560getLambda$1231144210$feature_rhv_trailer_externalDebug() {
        return f8883lambda$1231144210;
    }
}
