package com.robinhood.android.investmentstracker.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ConnectAccountComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.ComposableSingletons$ConnectAccountComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ConnectAccountComposable {
    public static final ConnectAccountComposable INSTANCE = new ConnectAccountComposable();

    /* renamed from: lambda$-1791171997, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9062lambda$1791171997 = ComposableLambda3.composableLambdaInstance(-1791171997, false, ConnectAccountComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1559387864 = ComposableLambda3.composableLambdaInstance(1559387864, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.ComposableSingletons$ConnectAccountComposableKt$lambda$1559387864$1
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
                ComposerKt.traceEventStart(1559387864, i, -1, "com.robinhood.android.investmentstracker.composables.ComposableSingletons$ConnectAccountComposableKt.lambda$1559387864.<anonymous> (ConnectAccountComposable.kt:15)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ConnectAccountComposable.INSTANCE.m15560getLambda$1791171997$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1791171997$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15560getLambda$1791171997$feature_investments_tracker_externalDebug() {
        return f9062lambda$1791171997;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1559387864$feature_investments_tracker_externalDebug() {
        return lambda$1559387864;
    }
}
