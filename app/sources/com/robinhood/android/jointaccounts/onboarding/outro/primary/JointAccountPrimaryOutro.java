package com.robinhood.android.jointaccounts.onboarding.outro.primary;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.jointaccounts.onboarding.Components5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountPrimaryOutro.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.ComposableSingletons$JointAccountPrimaryOutroKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountPrimaryOutro {
    public static final JointAccountPrimaryOutro INSTANCE = new JointAccountPrimaryOutro();

    /* renamed from: lambda$-349112913, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9090lambda$349112913 = ComposableLambda3.composableLambdaInstance(-349112913, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.ComposableSingletons$JointAccountPrimaryOutroKt$lambda$-349112913$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349112913, i, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.ComposableSingletons$JointAccountPrimaryOutroKt.lambda$-349112913.<anonymous> (JointAccountPrimaryOutro.kt:148)");
            }
            Components5.JointAccountOnboardingPlaceholder(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-349112913$feature_joint_account_onboarding_externalDebug */
    public final Function3<PaddingValues, Composer, Integer, Unit> m2147x815d26bd() {
        return f9090lambda$349112913;
    }
}
