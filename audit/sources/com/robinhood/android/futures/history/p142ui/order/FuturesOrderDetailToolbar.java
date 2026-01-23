package com.robinhood.android.futures.history.p142ui.order;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderDetailToolbar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.order.ComposableSingletons$FuturesOrderDetailToolbarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOrderDetailToolbar {
    public static final FuturesOrderDetailToolbar INSTANCE = new FuturesOrderDetailToolbar();

    /* renamed from: lambda$-345251164, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8984lambda$345251164 = ComposableLambda3.composableLambdaInstance(-345251164, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.order.ComposableSingletons$FuturesOrderDetailToolbarKt$lambda$-345251164$1
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
                ComposerKt.traceEventStart(-345251164, i, -1, "com.robinhood.android.futures.history.ui.order.ComposableSingletons$FuturesOrderDetailToolbarKt.lambda$-345251164.<anonymous> (FuturesOrderDetailToolbar.kt:20)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-345251164$feature_futures_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14659getLambda$345251164$feature_futures_history_externalDebug() {
        return f8984lambda$345251164;
    }
}
