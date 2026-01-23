package com.robinhood.android.retirement.partnerships.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementPartnershipsDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.partnerships.details.ComposableSingletons$RetirementPartnershipsDetailScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementPartnershipsDetailScreen {
    public static final RetirementPartnershipsDetailScreen INSTANCE = new RetirementPartnershipsDetailScreen();
    private static Function2<Composer, Integer, Unit> lambda$656532906 = ComposableLambda3.composableLambdaInstance(656532906, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.ComposableSingletons$RetirementPartnershipsDetailScreenKt$lambda$656532906$1
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
                ComposerKt.traceEventStart(656532906, i, -1, "com.robinhood.android.retirement.partnerships.details.ComposableSingletons$RetirementPartnershipsDetailScreenKt.lambda$656532906.<anonymous> (RetirementPartnershipsDetailScreen.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$656532906$feature_retirement_partnerships_externalDebug */
    public final Function2<Composer, Integer, Unit> m2436xab8decac() {
        return lambda$656532906;
    }
}
