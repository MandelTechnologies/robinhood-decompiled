package com.robinhood.android.resumeapplication;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ResumeApplicationStandardPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.resumeapplication.ComposableSingletons$ResumeApplicationStandardPageFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ResumeApplicationStandardPageFragment2 {
    public static final ResumeApplicationStandardPageFragment2 INSTANCE = new ResumeApplicationStandardPageFragment2();

    /* renamed from: lambda$-717144200, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9210lambda$717144200 = ComposableLambda3.composableLambdaInstance(-717144200, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ComposableSingletons$ResumeApplicationStandardPageFragmentKt$lambda$-717144200$1
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
                ComposerKt.traceEventStart(-717144200, i, -1, "com.robinhood.android.resumeapplication.ComposableSingletons$ResumeApplicationStandardPageFragmentKt.lambda$-717144200.<anonymous> (ResumeApplicationStandardPageFragment.kt:103)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$2126158500 = ComposableLambda3.composableLambdaInstance(2126158500, false, ResumeApplicationStandardPageFragment4.INSTANCE);

    /* renamed from: getLambda$-717144200$feature_lib_resume_application_externalDebug */
    public final Function2<Composer, Integer, Unit> m2420x96a35316() {
        return f9210lambda$717144200;
    }

    /* renamed from: getLambda$2126158500$feature_lib_resume_application_externalDebug */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m2421xc5361083() {
        return lambda$2126158500;
    }
}
