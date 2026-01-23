package com.robinhood.android.retirement.onboarding.managementstyle;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementManagementStyleSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.managementstyle.ComposableSingletons$RetirementManagementStyleSelectionComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementManagementStyleSelectionComposable {
    public static final RetirementManagementStyleSelectionComposable INSTANCE = new RetirementManagementStyleSelectionComposable();

    /* renamed from: lambda$-1453226662, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9217lambda$1453226662 = ComposableLambda3.composableLambdaInstance(-1453226662, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.ComposableSingletons$RetirementManagementStyleSelectionComposableKt$lambda$-1453226662$1
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
                ComposerKt.traceEventStart(-1453226662, i, -1, "com.robinhood.android.retirement.onboarding.managementstyle.ComposableSingletons$RetirementManagementStyleSelectionComposableKt.lambda$-1453226662.<anonymous> (RetirementManagementStyleSelectionComposable.kt:80)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1453226662$feature_retirement_onboarding_externalDebug */
    public final Function2<Composer, Integer, Unit> m2433x1f154f40() {
        return f9217lambda$1453226662;
    }
}
