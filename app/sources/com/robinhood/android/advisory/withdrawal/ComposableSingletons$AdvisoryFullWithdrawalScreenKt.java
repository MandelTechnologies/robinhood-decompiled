package com.robinhood.android.advisory.withdrawal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryFullWithdrawalScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$AdvisoryFullWithdrawalScreenKt {
    public static final ComposableSingletons$AdvisoryFullWithdrawalScreenKt INSTANCE = new ComposableSingletons$AdvisoryFullWithdrawalScreenKt();

    /* renamed from: lambda$-1749288127, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8664lambda$1749288127 = ComposableLambda3.composableLambdaInstance(-1749288127, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.withdrawal.ComposableSingletons$AdvisoryFullWithdrawalScreenKt$lambda$-1749288127$1
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
                ComposerKt.traceEventStart(-1749288127, i, -1, "com.robinhood.android.advisory.withdrawal.ComposableSingletons$AdvisoryFullWithdrawalScreenKt.lambda$-1749288127.<anonymous> (AdvisoryFullWithdrawalScreen.kt:298)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1749288127$feature_advisory_full_withdrawal_externalDebug */
    public final Function2<Composer, Integer, Unit> m1737xb4fec220() {
        return f8664lambda$1749288127;
    }
}
