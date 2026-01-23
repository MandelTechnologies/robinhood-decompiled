package com.robinhood.android.advisory.promo.screen;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositPromoDetailsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DepositPromoDetailsScreen {
    public static final DepositPromoDetailsScreen INSTANCE = new DepositPromoDetailsScreen();
    private static Function2<Composer, Integer, Unit> lambda$1660834777 = ComposableLambda3.composableLambdaInstance(1660834777, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt$lambda$1660834777$1
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
                ComposerKt.traceEventStart(1660834777, i, -1, "com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt.lambda$1660834777.<anonymous> (DepositPromoDetailsScreen.kt:104)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Row5, Composer, Integer, Unit> lambda$831822724 = ComposableLambda3.composableLambdaInstance(831822724, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt$lambda$831822724$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(831822724, i, -1, "com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt.lambda$831822724.<anonymous> (DepositPromoDetailsScreen.kt:105)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$48063166 = ComposableLambda3.composableLambdaInstance(48063166, false, DepositPromoDetailsScreen3.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1660834777$feature_advisory_promo_externalDebug() {
        return lambda$1660834777;
    }

    public final Function2<Composer, Integer, Unit> getLambda$48063166$feature_advisory_promo_externalDebug() {
        return lambda$48063166;
    }

    public final Function3<Row5, Composer, Integer, Unit> getLambda$831822724$feature_advisory_promo_externalDebug() {
        return lambda$831822724;
    }
}
