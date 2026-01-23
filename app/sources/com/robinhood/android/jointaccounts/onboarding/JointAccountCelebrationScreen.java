package com.robinhood.android.jointaccounts.onboarding;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCelebrationScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.ComposableSingletons$JointAccountCelebrationScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountCelebrationScreen {
    public static final JointAccountCelebrationScreen INSTANCE = new JointAccountCelebrationScreen();

    /* renamed from: lambda$-1033860604, reason: not valid java name */
    private static Function4<AnimatedContentScope, TextState, Composer, Integer, Unit> f9088lambda$1033860604 = ComposableLambda3.composableLambdaInstance(-1033860604, false, new Function4<AnimatedContentScope, TextState, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.ComposableSingletons$JointAccountCelebrationScreenKt$lambda$-1033860604$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, TextState textState, Composer composer, Integer num) {
            invoke(animatedContentScope, textState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, TextState destruct$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(destruct$, "$destruct$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1033860604, i, -1, "com.robinhood.android.jointaccounts.onboarding.ComposableSingletons$JointAccountCelebrationScreenKt.lambda$-1033860604.<anonymous> (JointAccountCelebrationScreen.kt:150)");
            }
            JointAccountCelebrationScreen4.CelebrationText(destruct$.getTitle(), destruct$.getBody(), destruct$.getTextStyleData(), null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1033860604$feature_joint_account_onboarding_externalDebug */
    public final Function4<AnimatedContentScope, TextState, Composer, Integer, Unit> m2142xff95276b() {
        return f9088lambda$1033860604;
    }
}
