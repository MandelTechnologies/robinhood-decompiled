package com.truelayer.payments.p419ui.components.inputs;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextInputWithImage.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$TextInputWithImageKt {
    public static final ComposableSingletons$TextInputWithImageKt INSTANCE = new ComposableSingletons$TextInputWithImageKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f9570lambda1 = ComposableLambda3.composableLambdaInstance(-733980875, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.ComposableSingletons$TextInputWithImageKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope SvgImage, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SvgImage, "$this$SvgImage");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733980875, i, -1, "com.truelayer.payments.ui.components.inputs.ComposableSingletons$TextInputWithImageKt.lambda-1.<anonymous> (TextInputWithImage.kt:164)");
            }
            TextKt.m6028Text4IGK_g("Failed to load the image", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m27055getLambda1$payments_ui_release() {
        return f9570lambda1;
    }
}
