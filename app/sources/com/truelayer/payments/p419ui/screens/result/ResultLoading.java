package com.truelayer.payments.p419ui.screens.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ResultLoading.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultLoadingKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResultLoading {
    public static final ResultLoading INSTANCE = new ResultLoading();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9627lambda1 = ComposableLambda3.composableLambdaInstance(-1044386498, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultLoadingKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1044386498, i, -1, "com.truelayer.payments.ui.screens.result.ComposableSingletons$ResultLoadingKt.lambda-1.<anonymous> (ResultLoading.kt:59)");
            }
            ResultLoading3.ResultLoading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27140getLambda1$payments_ui_release() {
        return f9627lambda1;
    }
}
