package com.robinhood.android.mcw.mcwconversionorderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ConversionOrderDetailsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.mcwconversionorderdetails.ComposableSingletons$ConversionOrderDetailsComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConversionOrderDetailsComposable {
    public static final ConversionOrderDetailsComposable INSTANCE = new ConversionOrderDetailsComposable();
    private static Function2<Composer, Integer, Unit> lambda$315765583 = ComposableLambda3.composableLambdaInstance(315765583, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwconversionorderdetails.ComposableSingletons$ConversionOrderDetailsComposableKt$lambda$315765583$1
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
                ComposerKt.traceEventStart(315765583, i, -1, "com.robinhood.android.mcw.mcwconversionorderdetails.ComposableSingletons$ConversionOrderDetailsComposableKt.lambda$315765583.<anonymous> (ConversionOrderDetailsComposable.kt:51)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$315765583$feature_mcw_conversion_order_details_externalDebug */
    public final Function2<Composer, Integer, Unit> m2178x3d385832() {
        return lambda$315765583;
    }
}
