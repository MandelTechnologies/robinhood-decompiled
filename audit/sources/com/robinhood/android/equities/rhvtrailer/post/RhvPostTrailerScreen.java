package com.robinhood.android.equities.rhvtrailer.post;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhvPostTrailerScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.rhvtrailer.post.ComposableSingletons$RhvPostTrailerScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhvPostTrailerScreen {
    public static final RhvPostTrailerScreen INSTANCE = new RhvPostTrailerScreen();

    /* renamed from: lambda$-5316609, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8884lambda$5316609 = ComposableLambda3.composableLambdaInstance(-5316609, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.post.ComposableSingletons$RhvPostTrailerScreenKt$lambda$-5316609$1
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
                ComposerKt.traceEventStart(-5316609, i, -1, "com.robinhood.android.equities.rhvtrailer.post.ComposableSingletons$RhvPostTrailerScreenKt.lambda$-5316609.<anonymous> (RhvPostTrailerScreen.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-5316609$feature_rhv_trailer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13564getLambda$5316609$feature_rhv_trailer_externalDebug() {
        return f8884lambda$5316609;
    }
}
