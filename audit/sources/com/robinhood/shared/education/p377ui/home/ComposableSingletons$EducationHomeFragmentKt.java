package com.robinhood.shared.education.p377ui.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EducationHomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$EducationHomeFragmentKt {
    public static final ComposableSingletons$EducationHomeFragmentKt INSTANCE = new ComposableSingletons$EducationHomeFragmentKt();

    /* renamed from: lambda$-1928994216, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9452lambda$1928994216 = ComposableLambda3.composableLambdaInstance(-1928994216, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.home.ComposableSingletons$EducationHomeFragmentKt$lambda$-1928994216$1
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
                ComposerKt.traceEventStart(-1928994216, i, -1, "com.robinhood.shared.education.ui.home.ComposableSingletons$EducationHomeFragmentKt.lambda$-1928994216.<anonymous> (EducationHomeFragment.kt:424)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1928994216$feature_education_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25353getLambda$1928994216$feature_education_externalDebug() {
        return f9452lambda$1928994216;
    }
}
