package com.robinhood.shared.education.order;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderTypeEducationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.order.ComposableSingletons$OrderTypeEducationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeEducationComposable2 {
    public static final OrderTypeEducationComposable2 INSTANCE = new OrderTypeEducationComposable2();
    private static Function2<Composer, Integer, Unit> lambda$517788316 = ComposableLambda3.composableLambdaInstance(517788316, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.ComposableSingletons$OrderTypeEducationComposableKt$lambda$517788316$1
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
                ComposerKt.traceEventStart(517788316, i, -1, "com.robinhood.shared.education.order.ComposableSingletons$OrderTypeEducationComposableKt.lambda$517788316.<anonymous> (OrderTypeEducationComposable.kt:182)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$517788316$lib_order_education_externalDebug() {
        return lambda$517788316;
    }
}
