package com.robinhood.android.advisory.portfolio.restrictstocks;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksComponents.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RestrictStocksComponents {
    public static final RestrictStocksComponents INSTANCE = new RestrictStocksComponents();

    /* renamed from: lambda$-1733193317, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8643lambda$1733193317 = ComposableLambda3.composableLambdaInstance(-1733193317, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksComponentsKt$lambda$-1733193317$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 SwipeToDismissBox, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SwipeToDismissBox, "$this$SwipeToDismissBox");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1733193317, i, -1, "com.robinhood.android.advisory.portfolio.restrictstocks.ComposableSingletons$RestrictStocksComponentsKt.lambda$-1733193317.<anonymous> (RestrictStocksComponents.kt:274)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1733193317$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m11161getLambda$1733193317$feature_advisory_portfolio_externalDebug() {
        return f8643lambda$1733193317;
    }
}
