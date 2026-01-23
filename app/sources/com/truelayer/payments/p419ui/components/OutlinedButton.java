package com.truelayer.payments.p419ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OutlinedButton.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.ComposableSingletons$OutlinedButtonKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class OutlinedButton {
    public static final OutlinedButton INSTANCE = new OutlinedButton();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9564lambda1 = ComposableLambda3.composableLambdaInstance(1382739225, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ComposableSingletons$OutlinedButtonKt$lambda-1$1
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
                ComposerKt.traceEventStart(1382739225, i, -1, "com.truelayer.payments.ui.components.ComposableSingletons$OutlinedButtonKt.lambda-1.<anonymous> (OutlinedButton.kt:12)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27034getLambda1$payments_ui_release() {
        return f9564lambda1;
    }
}
