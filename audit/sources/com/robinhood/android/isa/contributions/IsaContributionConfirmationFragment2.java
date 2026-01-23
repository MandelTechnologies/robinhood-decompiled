package com.robinhood.android.isa.contributions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: IsaContributionConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionConfirmationFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionConfirmationFragment2 {
    public static final IsaContributionConfirmationFragment2 INSTANCE = new IsaContributionConfirmationFragment2();
    private static Function2<Composer, Integer, Unit> lambda$198420514 = ComposableLambda3.composableLambdaInstance(198420514, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionConfirmationFragmentKt$lambda$198420514$1
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
                ComposerKt.traceEventStart(198420514, i, -1, "com.robinhood.android.isa.contributions.ComposableSingletons$IsaContributionConfirmationFragmentKt.lambda$198420514.<anonymous> (IsaContributionConfirmationFragment.kt:183)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$198420514$lib_isa_contributions_externalDebug() {
        return lambda$198420514;
    }
}
