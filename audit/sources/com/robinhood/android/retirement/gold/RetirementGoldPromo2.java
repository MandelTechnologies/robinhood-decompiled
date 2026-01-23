package com.robinhood.android.retirement.gold;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementGoldPromo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.gold.ComposableSingletons$RetirementGoldPromoKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementGoldPromo2 {
    public static final RetirementGoldPromo2 INSTANCE = new RetirementGoldPromo2();
    private static Function2<Composer, Integer, Unit> lambda$412700722 = ComposableLambda3.composableLambdaInstance(412700722, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.gold.ComposableSingletons$RetirementGoldPromoKt$lambda$412700722$1
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
                ComposerKt.traceEventStart(412700722, i, -1, "com.robinhood.android.retirement.gold.ComposableSingletons$RetirementGoldPromoKt.lambda$412700722.<anonymous> (RetirementGoldPromo.kt:71)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$412700722$feature_retirement_gold_externalDebug() {
        return lambda$412700722;
    }
}
