package com.robinhood.android.common.portfolio.position;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.position.ComposableSingletons$SwipeRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SwipeRow {
    public static final SwipeRow INSTANCE = new SwipeRow();
    private static Function3<SwipeToDismiss2, Composer, Integer, Unit> lambda$1541770572 = ComposableLambda3.composableLambdaInstance(1541770572, false, new Function3<SwipeToDismiss2, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.ComposableSingletons$SwipeRowKt$lambda$1541770572$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SwipeToDismiss2 swipeToDismiss2, Composer composer, Integer num) {
            invoke(swipeToDismiss2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SwipeToDismiss2 it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541770572, i, -1, "com.robinhood.android.common.portfolio.position.ComposableSingletons$SwipeRowKt.lambda$1541770572.<anonymous> (SwipeRow.kt:60)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<SwipeToDismiss2, Composer, Integer, Unit> getLambda$1541770572$feature_lib_portfolio_externalDebug() {
        return lambda$1541770572;
    }
}
