package com.truelayer.payments.p419ui.screens.formflows.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ContentScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.formflows.components.ComposableSingletons$ContentScaffoldKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ContentScaffold {
    public static final ContentScaffold INSTANCE = new ContentScaffold();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9601lambda1 = ComposableLambda3.composableLambdaInstance(-1450543888, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.ComposableSingletons$ContentScaffoldKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1450543888, i, -1, "com.truelayer.payments.ui.screens.formflows.components.ComposableSingletons$ContentScaffoldKt.lambda-1.<anonymous> (ContentScaffold.kt:18)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9602lambda2 = ComposableLambda3.composableLambdaInstance(-290026350, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.ComposableSingletons$ContentScaffoldKt$lambda-2$1
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
                ComposerKt.traceEventStart(-290026350, i, -1, "com.truelayer.payments.ui.screens.formflows.components.ComposableSingletons$ContentScaffoldKt.lambda-2.<anonymous> (ContentScaffold.kt:19)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27112getLambda1$payments_ui_release() {
        return f9601lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27113getLambda2$payments_ui_release() {
        return f9602lambda2;
    }
}
