package com.truelayer.payments.p419ui.screens.formflows.model;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FormScreensCreator.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.formflows.model.ComposableSingletons$FormScreensCreatorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FormScreensCreator2 {
    public static final FormScreensCreator2 INSTANCE = new FormScreensCreator2();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9604lambda1 = ComposableLambda3.composableLambdaInstance(-389124498, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.ComposableSingletons$FormScreensCreatorKt$lambda-1$1
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
                ComposerKt.traceEventStart(-389124498, i, -1, "com.truelayer.payments.ui.screens.formflows.model.ComposableSingletons$FormScreensCreatorKt.lambda-1.<anonymous> (FormScreensCreator.kt:324)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9605lambda2 = ComposableLambda3.composableLambdaInstance(652091288, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.ComposableSingletons$FormScreensCreatorKt$lambda-2$1
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
                ComposerKt.traceEventStart(652091288, i, -1, "com.truelayer.payments.ui.screens.formflows.model.ComposableSingletons$FormScreensCreatorKt.lambda-2.<anonymous> (FormScreensCreator.kt:334)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27115getLambda1$payments_ui_release() {
        return f9604lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27116getLambda2$payments_ui_release() {
        return f9605lambda2;
    }
}
