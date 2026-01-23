package com.robinhood.android.onboarding.p205ui.usercreation;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationRewardsEmailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.ComposableSingletons$UserCreationRewardsEmailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UserCreationRewardsEmailComposable {
    public static final UserCreationRewardsEmailComposable INSTANCE = new UserCreationRewardsEmailComposable();

    /* renamed from: lambda$-2130125579, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9126lambda$2130125579 = ComposableLambda3.composableLambdaInstance(-2130125579, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.ComposableSingletons$UserCreationRewardsEmailComposableKt$lambda$-2130125579$1
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
                ComposerKt.traceEventStart(-2130125579, i, -1, "com.robinhood.android.onboarding.ui.usercreation.ComposableSingletons$UserCreationRewardsEmailComposableKt.lambda$-2130125579.<anonymous> (UserCreationRewardsEmailComposable.kt:185)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22739R.string.user_creation_create_your_profile, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$345503824 = ComposableLambda3.composableLambdaInstance(345503824, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.ComposableSingletons$UserCreationRewardsEmailComposableKt$lambda$345503824$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345503824, i, -1, "com.robinhood.android.onboarding.ui.usercreation.ComposableSingletons$UserCreationRewardsEmailComposableKt.lambda$345503824.<anonymous> (UserCreationRewardsEmailComposable.kt:197)");
            }
            OnboardingProgress onboardingProgress = OnboardingProgress.EMAIL;
            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(onboardingProgress.getSegmentIdx(), onboardingProgress.getProgress(), 5, null, 0L, 0L, false, composer, 384, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2130125579$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16860getLambda$2130125579$feature_onboarding_externalDebug() {
        return f9126lambda$2130125579;
    }

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$345503824$feature_onboarding_externalDebug() {
        return lambda$345503824;
    }
}
