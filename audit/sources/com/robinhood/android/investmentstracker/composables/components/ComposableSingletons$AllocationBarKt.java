package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AllocationBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$AllocationBarKt {
    public static final ComposableSingletons$AllocationBarKt INSTANCE = new ComposableSingletons$AllocationBarKt();
    private static Function2<Composer, Integer, Unit> lambda$150110749 = ComposableLambda3.composableLambdaInstance(150110749, false, ComposableSingletons$AllocationBarKt$lambda$150110749$1.INSTANCE);

    /* renamed from: lambda$-988732664, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9064lambda$988732664 = ComposableLambda3.composableLambdaInstance(-988732664, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AllocationBarKt$lambda$-988732664$1
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
                ComposerKt.traceEventStart(-988732664, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$AllocationBarKt.lambda$-988732664.<anonymous> (AllocationBar.kt:86)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableSingletons$AllocationBarKt.INSTANCE.getLambda$150110749$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-988732664$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15583getLambda$988732664$feature_investments_tracker_externalDebug() {
        return f9064lambda$988732664;
    }

    public final Function2<Composer, Integer, Unit> getLambda$150110749$feature_investments_tracker_externalDebug() {
        return lambda$150110749;
    }
}
