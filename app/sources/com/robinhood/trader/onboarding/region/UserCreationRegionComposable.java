package com.robinhood.trader.onboarding.region;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.trader.onboarding.C41676R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationRegionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UserCreationRegionComposable {
    public static final UserCreationRegionComposable INSTANCE = new UserCreationRegionComposable();

    /* renamed from: lambda$-190979066, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9539lambda$190979066 = ComposableLambda3.composableLambdaInstance(-190979066, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionComposableKt$lambda$-190979066$1
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
                ComposerKt.traceEventStart(-190979066, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionComposableKt.lambda$-190979066.<anonymous> (UserCreationRegionComposable.kt:43)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41676R.string.user_creation_create_your_account, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$1197698251 = ComposableLambda3.composableLambdaInstance(1197698251, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionComposableKt$lambda$1197698251$1
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
                ComposerKt.traceEventStart(1197698251, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionComposableKt.lambda$1197698251.<anonymous> (UserCreationRegionComposable.kt:53)");
            }
            OnboardingProgress onboardingProgress = OnboardingProgress.REGION;
            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(onboardingProgress.getSegmentIdx(), onboardingProgress.getProgress(), 5, null, 0L, 0L, false, composer, 384, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-190979066$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26527getLambda$190979066$feature_onboarding_externalDebug() {
        return f9539lambda$190979066;
    }

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$1197698251$feature_onboarding_externalDebug() {
        return lambda$1197698251;
    }
}
