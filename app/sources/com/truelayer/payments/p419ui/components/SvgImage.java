package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SvgImage.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.ComposableSingletons$SvgImageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SvgImage {
    public static final SvgImage INSTANCE = new SvgImage();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f9566lambda1 = ComposableLambda3.composableLambdaInstance(-1601657206, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ComposableSingletons$SvgImageKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1601657206, i, -1, "com.truelayer.payments.ui.components.ComposableSingletons$SvgImageKt.lambda-1.<anonymous> (SvgImage.kt:32)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f9567lambda2 = ComposableLambda3.composableLambdaInstance(269050841, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ComposableSingletons$SvgImageKt$lambda-2$1
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
                ComposerKt.traceEventStart(269050841, i, -1, "com.truelayer.payments.ui.components.ComposableSingletons$SvgImageKt.lambda-2.<anonymous> (SvgImage.kt:33)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m27036getLambda1$payments_ui_release() {
        return f9566lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m27037getLambda2$payments_ui_release() {
        return f9567lambda2;
    }
}
