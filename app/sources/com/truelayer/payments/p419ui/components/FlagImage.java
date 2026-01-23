package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlagImage.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.ComposableSingletons$FlagImageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FlagImage {
    public static final FlagImage INSTANCE = new FlagImage();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f9559lambda1 = ComposableLambda3.composableLambdaInstance(-737409686, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ComposableSingletons$FlagImageKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "$this$null");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-737409686, i, -1, "com.truelayer.payments.ui.components.ComposableSingletons$FlagImageKt.lambda-1.<anonymous> (FlagImage.kt:21)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m27029getLambda1$payments_ui_release() {
        return f9559lambda1;
    }
}
