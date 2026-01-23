package com.robinhood.android.futures.trade.p147ui.ordertype;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderTypeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ordertype.ComposableSingletons$FuturesOrderTypeFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class FuturesOrderTypeFragment2 {
    public static final FuturesOrderTypeFragment2 INSTANCE = new FuturesOrderTypeFragment2();
    private static Function2<Composer, Integer, Unit> lambda$416601601 = ComposableLambda3.composableLambdaInstance(416601601, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ordertype.ComposableSingletons$FuturesOrderTypeFragmentKt$lambda$416601601$1
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
                ComposerKt.traceEventStart(416601601, i, -1, "com.robinhood.android.futures.trade.ui.ordertype.ComposableSingletons$FuturesOrderTypeFragmentKt.lambda$416601601.<anonymous> (FuturesOrderTypeFragment.kt:67)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$416601601$feature_futures_trade_externalDebug() {
        return lambda$416601601;
    }
}
