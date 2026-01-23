package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$PillLoadingPlaceholderModifierKt {
    public static final ComposableSingletons$PillLoadingPlaceholderModifierKt INSTANCE = new ComposableSingletons$PillLoadingPlaceholderModifierKt();

    /* renamed from: lambda$-1616995916, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9523lambda$1616995916 = ComposableLambda3.composableLambdaInstance(-1616995916, false, C41031x3ebaedd5.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$838299183 = ComposableLambda3.composableLambdaInstance(838299183, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$838299183$1
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
                ComposerKt.traceEventStart(838299183, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PillLoadingPlaceholderModifierKt.lambda$838299183.<anonymous> (PillLoadingPlaceholderModifier.kt:170)");
            }
            SurfaceKt.m5967SurfaceT9BRK9s(null, null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$PillLoadingPlaceholderModifierKt.INSTANCE.m26154getLambda$1616995916$lib_trade_ladder_externalDebug(), composer, 12582912, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1616995916$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26154getLambda$1616995916$lib_trade_ladder_externalDebug() {
        return f9523lambda$1616995916;
    }

    public final Function2<Composer, Integer, Unit> getLambda$838299183$lib_trade_ladder_externalDebug() {
        return lambda$838299183;
    }
}
