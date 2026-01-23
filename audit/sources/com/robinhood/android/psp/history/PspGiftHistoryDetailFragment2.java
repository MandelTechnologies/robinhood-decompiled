package com.robinhood.android.psp.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PspGiftHistoryDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.history.ComposableSingletons$PspGiftHistoryDetailFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PspGiftHistoryDetailFragment2 {
    public static final PspGiftHistoryDetailFragment2 INSTANCE = new PspGiftHistoryDetailFragment2();

    /* renamed from: lambda$-1211995999, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9185lambda$1211995999 = ComposableLambda3.composableLambdaInstance(-1211995999, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.psp.history.ComposableSingletons$PspGiftHistoryDetailFragmentKt$lambda$-1211995999$1
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
                ComposerKt.traceEventStart(-1211995999, i, -1, "com.robinhood.android.psp.history.ComposableSingletons$PspGiftHistoryDetailFragmentKt.lambda$-1211995999.<anonymous> (PspGiftHistoryDetailFragment.kt:90)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1211995999$feature_partner_stock_program_externalDebug */
    public final Function2<Composer, Integer, Unit> m2389xcd5be32b() {
        return f9185lambda$1211995999;
    }
}
