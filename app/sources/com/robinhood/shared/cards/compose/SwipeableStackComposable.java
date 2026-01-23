package com.robinhood.shared.cards.compose;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeableStackComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.cards.compose.ComposableSingletons$SwipeableStackComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class SwipeableStackComposable {
    public static final SwipeableStackComposable INSTANCE = new SwipeableStackComposable();
    private static Function3<Row5, Composer, Integer, Unit> lambda$2044217549 = ComposableLambda3.composableLambdaInstance(2044217549, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.cards.compose.ComposableSingletons$SwipeableStackComposableKt$lambda$2044217549$1
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
                ComposerKt.traceEventStart(2044217549, i, -1, "com.robinhood.shared.cards.compose.ComposableSingletons$SwipeableStackComposableKt.lambda$2044217549.<anonymous> (SwipeableStackComposable.kt:81)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<Row5, Composer, Integer, Unit> getLambda$2044217549$lib_cards_compose_externalDebug() {
        return lambda$2044217549;
    }
}
