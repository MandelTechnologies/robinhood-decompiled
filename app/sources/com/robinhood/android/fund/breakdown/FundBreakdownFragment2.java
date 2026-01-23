package com.robinhood.android.fund.breakdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FundBreakdownFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.fund.breakdown.ComposableSingletons$FundBreakdownFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FundBreakdownFragment2 {
    public static final FundBreakdownFragment2 INSTANCE = new FundBreakdownFragment2();
    private static Function2<Composer, Integer, Unit> lambda$379634040 = ComposableLambda3.composableLambdaInstance(379634040, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.fund.breakdown.ComposableSingletons$FundBreakdownFragmentKt$lambda$379634040$1
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
                ComposerKt.traceEventStart(379634040, i, -1, "com.robinhood.android.fund.breakdown.ComposableSingletons$FundBreakdownFragmentKt.lambda$379634040.<anonymous> (FundBreakdownFragment.kt:52)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$379634040$feature_fund_breakdown_externalDebug() {
        return lambda$379634040;
    }
}
