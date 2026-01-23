package com.truelayer.payments.p419ui.screens.result.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ProgressIndicatorWithImageForResultScreen.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$ProgressIndicatorWithImageForResultScreenKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProgressIndicatorWithImageForResultScreen {
    public static final ProgressIndicatorWithImageForResultScreen INSTANCE = new ProgressIndicatorWithImageForResultScreen();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9631lambda1 = ComposableLambda3.composableLambdaInstance(-416898976, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$ProgressIndicatorWithImageForResultScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-416898976, i, -1, "com.truelayer.payments.ui.screens.result.components.ComposableSingletons$ProgressIndicatorWithImageForResultScreenKt.lambda-1.<anonymous> (ProgressIndicatorWithImageForResultScreen.kt:26)");
                }
                ProgressIndicatorWithImageForResultScreen3.ProgressIndicatorWithImageForResultScreen(null, null, composer, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27150getLambda1$payments_ui_release() {
        return f9631lambda1;
    }
}
