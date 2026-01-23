package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryFundingMethodsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.ComposableSingletons$AdvisoryFundingMethodsScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryFundingMethodsScreen4 {
    public static final AdvisoryFundingMethodsScreen4 INSTANCE = new AdvisoryFundingMethodsScreen4();
    private static Function2<Composer, Integer, Unit> lambda$704474301 = ComposableLambda3.composableLambdaInstance(704474301, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.ComposableSingletons$AdvisoryFundingMethodsScreenKt$lambda$704474301$1
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
                ComposerKt.traceEventStart(704474301, i, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.ComposableSingletons$AdvisoryFundingMethodsScreenKt.lambda$704474301.<anonymous> (AdvisoryFundingMethodsScreen.kt:255)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$704474301$feature_advisory_onboarding_externalDebug() {
        return lambda$704474301;
    }
}
