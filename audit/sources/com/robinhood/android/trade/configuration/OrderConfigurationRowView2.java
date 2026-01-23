package com.robinhood.android.trade.configuration;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderConfigurationRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.configuration.ComposableSingletons$OrderConfigurationRowViewKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderConfigurationRowView2 {
    public static final OrderConfigurationRowView2 INSTANCE = new OrderConfigurationRowView2();

    /* renamed from: lambda$-1785325336, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9268lambda$1785325336 = ComposableLambda3.composableLambdaInstance(-1785325336, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.ComposableSingletons$OrderConfigurationRowViewKt$lambda$-1785325336$1
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
                ComposerKt.traceEventStart(-1785325336, i, -1, "com.robinhood.android.trade.configuration.ComposableSingletons$OrderConfigurationRowViewKt.lambda$-1785325336.<anonymous> (OrderConfigurationRowView.kt:44)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1987762207 = ComposableLambda3.composableLambdaInstance(1987762207, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.ComposableSingletons$OrderConfigurationRowViewKt$lambda$1987762207$1
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
                ComposerKt.traceEventStart(1987762207, i, -1, "com.robinhood.android.trade.configuration.ComposableSingletons$OrderConfigurationRowViewKt.lambda$1987762207.<anonymous> (OrderConfigurationRowView.kt:54)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1785325336$feature_lib_trade_configuration_externalDebug */
    public final Function2<Composer, Integer, Unit> m2482x5ae56886() {
        return f9268lambda$1785325336;
    }

    /* renamed from: getLambda$1987762207$feature_lib_trade_configuration_externalDebug */
    public final Function2<Composer, Integer, Unit> m2483x995bb4d1() {
        return lambda$1987762207;
    }
}
