package com.robinhood.android.pathfinder.corepages.supportlanding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportLandingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class SupportLandingComposable {
    public static final SupportLandingComposable INSTANCE = new SupportLandingComposable();

    /* renamed from: lambda$-611670323, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9168lambda$611670323 = ComposableLambda3.composableLambdaInstance(-611670323, false, SupportLandingComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$115351429 = ComposableLambda3.composableLambdaInstance(115351429, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt$lambda$115351429$1
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
                ComposerKt.traceEventStart(115351429, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.ComposableSingletons$SupportLandingComposableKt.lambda$115351429.<anonymous> (SupportLandingComposable.kt:165)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SupportLandingComposable.INSTANCE.m17543getLambda$611670323$feature_pathfinder_core_pages_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-611670323$feature_pathfinder_core_pages_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17543getLambda$611670323$feature_pathfinder_core_pages_externalDebug() {
        return f9168lambda$611670323;
    }

    public final Function2<Composer, Integer, Unit> getLambda$115351429$feature_pathfinder_core_pages_externalDebug() {
        return lambda$115351429;
    }
}
