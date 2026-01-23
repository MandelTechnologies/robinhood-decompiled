package com.robinhood.android.resumeapplication;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ResurrectionInactiveAndLowAumComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.resumeapplication.ComposableSingletons$ResurrectionInactiveAndLowAumComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ResurrectionInactiveAndLowAumComposable {
    public static final ResurrectionInactiveAndLowAumComposable INSTANCE = new ResurrectionInactiveAndLowAumComposable();

    /* renamed from: lambda$-662842330, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9211lambda$662842330 = ComposableLambda3.composableLambdaInstance(-662842330, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ComposableSingletons$ResurrectionInactiveAndLowAumComposableKt$lambda$-662842330$1
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
                ComposerKt.traceEventStart(-662842330, i, -1, "com.robinhood.android.resumeapplication.ComposableSingletons$ResurrectionInactiveAndLowAumComposableKt.lambda$-662842330.<anonymous> (ResurrectionInactiveAndLowAumComposable.kt:78)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-662842330$feature_lib_resume_application_externalDebug */
    public final Function2<Composer, Integer, Unit> m2422xcd65f908() {
        return f9211lambda$662842330;
    }
}
