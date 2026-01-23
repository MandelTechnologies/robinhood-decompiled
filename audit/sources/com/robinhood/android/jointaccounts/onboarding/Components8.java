package com.robinhood.android.jointaccounts.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Components.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.ComposableSingletons$ComponentsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Components8 {
    public static final Components8 INSTANCE = new Components8();

    /* renamed from: lambda$-760026818, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9087lambda$760026818 = ComposableLambda3.composableLambdaInstance(-760026818, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.ComposableSingletons$ComponentsKt$lambda$-760026818$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760026818, i, -1, "com.robinhood.android.jointaccounts.onboarding.ComposableSingletons$ComponentsKt.lambda$-760026818.<anonymous> (Components.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-760026818$feature_joint_account_onboarding_externalDebug */
    public final Function2<Composer, Integer, Unit> m2141xcbfd8c42() {
        return f9087lambda$760026818;
    }
}
