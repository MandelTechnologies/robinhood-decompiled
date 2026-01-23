package com.robinhood.android.onboarding.p205ui.usercreation.loading;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: UserCreationLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UserCreationLoadingFragment2 {
    public static final UserCreationLoadingFragment2 INSTANCE = new UserCreationLoadingFragment2();
    private static Function3<BentoButtonBar3, Composer, Integer, Unit> lambda$2086390927 = ComposableLambda3.composableLambdaInstance(2086390927, false, UserCreationLoadingFragment6.INSTANCE);

    /* renamed from: lambda$-1589441668, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9127lambda$1589441668 = ComposableLambda3.composableLambdaInstance(-1589441668, false, UserCreationLoadingFragment3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1454864228 = ComposableLambda3.composableLambdaInstance(1454864228, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt$lambda$1454864228$1
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
                ComposerKt.traceEventStart(1454864228, i, -1, "com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt.lambda$1454864228.<anonymous> (UserCreationLoadingFragment.kt:60)");
            }
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2);
            UserCreationLoadingFragment2 userCreationLoadingFragment2 = UserCreationLoadingFragment2.INSTANCE;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierM21622defaultHorizontalPaddingWMci_g0, false, userCreationLoadingFragment2.getLambda$2086390927$feature_onboarding_externalDebug(), userCreationLoadingFragment2.m16878getLambda$1589441668$feature_onboarding_externalDebug(), composer, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1042011604 = ComposableLambda3.composableLambdaInstance(1042011604, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt$lambda$1042011604$1
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
                ComposerKt.traceEventStart(1042011604, i, -1, "com.robinhood.android.onboarding.ui.usercreation.loading.ComposableSingletons$UserCreationLoadingFragmentKt.lambda$1042011604.<anonymous> (UserCreationLoadingFragment.kt:59)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, UserCreationLoadingFragment2.INSTANCE.getLambda$1454864228$feature_onboarding_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1589441668$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m16878getLambda$1589441668$feature_onboarding_externalDebug() {
        return f9127lambda$1589441668;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1042011604$feature_onboarding_externalDebug() {
        return lambda$1042011604;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1454864228$feature_onboarding_externalDebug() {
        return lambda$1454864228;
    }

    public final Function3<BentoButtonBar3, Composer, Integer, Unit> getLambda$2086390927$feature_onboarding_externalDebug() {
        return lambda$2086390927;
    }
}
