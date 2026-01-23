package com.robinhood.android.retirement.onboarding.accountcomparison;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementAccountComparison.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.accountcomparison.ComposableSingletons$RetirementAccountComparisonKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementAccountComparison2 {
    public static final RetirementAccountComparison2 INSTANCE = new RetirementAccountComparison2();

    /* renamed from: lambda$-534044941, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9216lambda$534044941 = ComposableLambda3.composableLambdaInstance(-534044941, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.ComposableSingletons$RetirementAccountComparisonKt$lambda$-534044941$1
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
                ComposerKt.traceEventStart(-534044941, i, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.ComposableSingletons$RetirementAccountComparisonKt.lambda$-534044941.<anonymous> (RetirementAccountComparison.kt:77)");
            }
            RetirementAccountComparison5.Success(RetirementAccountComparisonViewState.INSTANCE.getLoadingMock().getComparison(), new RetirementAccountComparison4() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.ComposableSingletons$RetirementAccountComparisonKt$lambda$-534044941$1.1
                @Override // com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparison4
                public void onCloseClick() {
                }
            }, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-534044941$feature_retirement_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18150getLambda$534044941$feature_retirement_onboarding_externalDebug() {
        return f9216lambda$534044941;
    }
}
