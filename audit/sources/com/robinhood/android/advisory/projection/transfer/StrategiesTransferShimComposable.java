package com.robinhood.android.advisory.projection.transfer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: StrategiesTransferShimComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.transfer.ComposableSingletons$StrategiesTransferShimComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StrategiesTransferShimComposable {
    public static final StrategiesTransferShimComposable INSTANCE = new StrategiesTransferShimComposable();
    private static Function2<Composer, Integer, Unit> lambda$301999301 = ComposableLambda3.composableLambdaInstance(301999301, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.ComposableSingletons$StrategiesTransferShimComposableKt$lambda$301999301$1
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
                ComposerKt.traceEventStart(301999301, i, -1, "com.robinhood.android.advisory.projection.transfer.ComposableSingletons$StrategiesTransferShimComposableKt.lambda$301999301.<anonymous> (StrategiesTransferShimComposable.kt:25)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$301999301$feature_projected_returns_externalDebug() {
        return lambda$301999301;
    }
}
