package com.robinhood.android.equities.companyfinancials.onboarding;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CompanyFinancialsOnboardingSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.companyfinancials.onboarding.ComposableSingletons$CompanyFinancialsOnboardingSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsOnboardingSection2 {
    public static final CompanyFinancialsOnboardingSection2 INSTANCE = new CompanyFinancialsOnboardingSection2();

    /* renamed from: lambda$-172793108, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8877lambda$172793108 = ComposableLambda3.composableLambdaInstance(-172793108, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.ComposableSingletons$CompanyFinancialsOnboardingSectionKt$lambda$-172793108$1
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
                ComposerKt.traceEventStart(-172793108, i, -1, "com.robinhood.android.equities.companyfinancials.onboarding.ComposableSingletons$CompanyFinancialsOnboardingSectionKt.lambda$-172793108.<anonymous> (CompanyFinancialsOnboardingSection.kt:85)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1900460059 = ComposableLambda3.composableLambdaInstance(1900460059, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.onboarding.ComposableSingletons$CompanyFinancialsOnboardingSectionKt$lambda$1900460059$1
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
                ComposerKt.traceEventStart(1900460059, i, -1, "com.robinhood.android.equities.companyfinancials.onboarding.ComposableSingletons$CompanyFinancialsOnboardingSectionKt.lambda$1900460059.<anonymous> (CompanyFinancialsOnboardingSection.kt:91)");
            }
            IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$450096200 = ComposableLambda3.composableLambdaInstance(450096200, false, CompanyFinancialsOnboardingSection5.INSTANCE);

    /* renamed from: getLambda$-172793108$lib_company_financials_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13522getLambda$172793108$lib_company_financials_externalDebug() {
        return f8877lambda$172793108;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1900460059$lib_company_financials_externalDebug() {
        return lambda$1900460059;
    }

    public final Function2<Composer, Integer, Unit> getLambda$450096200$lib_company_financials_externalDebug() {
        return lambda$450096200;
    }
}
