package com.truelayer.payments.p419ui.components.toolbars;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibleTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AccessibleTopAppBar4 {
    public static final AccessibleTopAppBar4 INSTANCE = new AccessibleTopAppBar4();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9571lambda1 = ComposableLambda3.composableLambdaInstance(516213007, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt$lambda-1$1
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
                ComposerKt.traceEventStart(516213007, i, -1, "com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt.lambda-1.<anonymous> (AccessibleTopAppBar.kt:18)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<Row5, Composer, Integer, Unit> f9572lambda2 = ComposableLambda3.composableLambdaInstance(-115535375, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(row5, "$this$null");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115535375, i, -1, "com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt.lambda-2.<anonymous> (AccessibleTopAppBar.kt:19)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9573lambda3 = ComposableLambda3.composableLambdaInstance(1325449070, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt$lambda-3$1
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
                ComposerKt.traceEventStart(1325449070, i, -1, "com.truelayer.payments.ui.components.toolbars.ComposableSingletons$AccessibleTopAppBarKt.lambda-3.<anonymous> (AccessibleTopAppBar.kt:25)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27066getLambda1$payments_ui_release() {
        return f9571lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m27067getLambda2$payments_ui_release() {
        return f9572lambda2;
    }

    /* renamed from: getLambda-3$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27068getLambda3$payments_ui_release() {
        return f9573lambda3;
    }
}
