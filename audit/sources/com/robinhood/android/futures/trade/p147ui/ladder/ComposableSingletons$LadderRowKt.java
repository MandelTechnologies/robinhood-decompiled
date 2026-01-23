package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$LadderRowKt {
    public static final ComposableSingletons$LadderRowKt INSTANCE = new ComposableSingletons$LadderRowKt();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$2034366580 = ComposableLambda3.composableLambdaInstance(2034366580, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderRowKt$lambda$2034366580$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2034366580, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderRowKt.lambda$2034366580.<anonymous> (LadderRow.kt:161)");
            }
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$2034366580$feature_futures_trade_externalDebug() {
        return lambda$2034366580;
    }
}
