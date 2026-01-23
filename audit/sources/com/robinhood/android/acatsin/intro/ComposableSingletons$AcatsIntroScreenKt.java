package com.robinhood.android.acatsin.intro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ComposableSingletons$AcatsIntroScreenKt {
    public static final ComposableSingletons$AcatsIntroScreenKt INSTANCE = new ComposableSingletons$AcatsIntroScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1837485852 = ComposableLambda3.composableLambdaInstance(1837485852, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.intro.ComposableSingletons$AcatsIntroScreenKt$lambda$1837485852$1
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
                ComposerKt.traceEventStart(1837485852, i, -1, "com.robinhood.android.acatsin.intro.ComposableSingletons$AcatsIntroScreenKt.lambda$1837485852.<anonymous> (AcatsIntroScreen.kt:96)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1837485852$feature_acats_in_externalDebug() {
        return lambda$1837485852;
    }
}
