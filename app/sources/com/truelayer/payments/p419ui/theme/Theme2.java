package com.truelayer.payments.p419ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.theme.ComposableSingletons$ThemeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Theme2 {
    public static final Theme2 INSTANCE = new Theme2();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9636lambda1 = ComposableLambda3.composableLambdaInstance(-1208418041, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.theme.ComposableSingletons$ThemeKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1208418041, i, -1, "com.truelayer.payments.ui.theme.ComposableSingletons$ThemeKt.lambda-1.<anonymous> (Theme.kt:84)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<Map<String, String>, Composer, Integer, Unit> f9637lambda2 = ComposableLambda3.composableLambdaInstance(-146937533, false, new Function3<Map<String, String>, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.theme.ComposableSingletons$ThemeKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map, Composer composer, Integer num) {
            invoke(map, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Map<String, String> it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-146937533, i, -1, "com.truelayer.payments.ui.theme.ComposableSingletons$ThemeKt.lambda-2.<anonymous> (Theme.kt:100)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27160getLambda1$payments_ui_release() {
        return f9636lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function3<Map<String, String>, Composer, Integer, Unit> m27161getLambda2$payments_ui_release() {
        return f9637lambda2;
    }
}
