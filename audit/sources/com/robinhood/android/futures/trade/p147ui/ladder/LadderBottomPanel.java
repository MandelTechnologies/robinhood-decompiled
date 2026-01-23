package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LadderBottomPanel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderBottomPanel {
    public static final LadderBottomPanel INSTANCE = new LadderBottomPanel();

    /* renamed from: lambda$-1170507185, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9001lambda$1170507185 = ComposableLambda3.composableLambdaInstance(-1170507185, false, LadderBottomPanel2.INSTANCE);

    /* renamed from: lambda$-1598380876, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9003lambda$1598380876 = ComposableLambda3.composableLambdaInstance(-1598380876, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt$lambda$-1598380876$1
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
                ComposerKt.traceEventStart(-1598380876, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt.lambda$-1598380876.<anonymous> (LadderBottomPanel.kt:167)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SurfaceKt.m5967SurfaceT9BRK9s(null, null, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, LadderBottomPanel.INSTANCE.m14761getLambda$1170507185$feature_futures_trade_externalDebug(), composer, 12582912, 115);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-202600082, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9004lambda$202600082 = ComposableLambda3.composableLambdaInstance(-202600082, false, LadderBottomPanel5.INSTANCE);

    /* renamed from: lambda$-1532918061, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9002lambda$1532918061 = ComposableLambda3.composableLambdaInstance(-1532918061, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt$lambda$-1532918061$1
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
                ComposerKt.traceEventStart(-1532918061, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderBottomPanelKt.lambda$-1532918061.<anonymous> (LadderBottomPanel.kt:191)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SurfaceKt.m5967SurfaceT9BRK9s(null, null, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, LadderBottomPanel.INSTANCE.m14764getLambda$202600082$feature_futures_trade_externalDebug(), composer, 12582912, 115);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1170507185$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14761getLambda$1170507185$feature_futures_trade_externalDebug() {
        return f9001lambda$1170507185;
    }

    /* renamed from: getLambda$-1532918061$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14762getLambda$1532918061$feature_futures_trade_externalDebug() {
        return f9002lambda$1532918061;
    }

    /* renamed from: getLambda$-1598380876$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14763getLambda$1598380876$feature_futures_trade_externalDebug() {
        return f9003lambda$1598380876;
    }

    /* renamed from: getLambda$-202600082$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14764getLambda$202600082$feature_futures_trade_externalDebug() {
        return f9004lambda$202600082;
    }
}
