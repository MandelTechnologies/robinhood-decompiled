package com.robinhood.android.notification.p202ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ProductUpsellScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ProductUpsellScreen2 {
    public static final ProductUpsellScreen2 INSTANCE = new ProductUpsellScreen2();

    /* renamed from: lambda$-2052431872, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9123lambda$2052431872 = ComposableLambda3.composableLambdaInstance(-2052431872, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt$lambda$-2052431872$1
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
                ComposerKt.traceEventStart(-2052431872, i, -1, "com.robinhood.android.notification.ui.ComposableSingletons$ProductUpsellScreenKt.lambda$-2052431872.<anonymous> (ProductUpsellScreen.kt:266)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1596150525 = ComposableLambda3.composableLambdaInstance(1596150525, false, ProductUpsellScreen4.INSTANCE);

    /* renamed from: getLambda$-2052431872$feature_product_upsell_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16765getLambda$2052431872$feature_product_upsell_externalDebug() {
        return f9123lambda$2052431872;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1596150525$feature_product_upsell_externalDebug() {
        return lambda$1596150525;
    }
}
