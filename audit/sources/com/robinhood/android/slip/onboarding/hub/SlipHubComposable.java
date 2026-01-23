package com.robinhood.android.slip.onboarding.hub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.hub.ComposableSingletons$SlipHubComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipHubComposable {
    public static final SlipHubComposable INSTANCE = new SlipHubComposable();
    private static Function2<Composer, Integer, Unit> lambda$1519746689 = ComposableLambda3.composableLambdaInstance(1519746689, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.ComposableSingletons$SlipHubComposableKt$lambda$1519746689$1
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
                ComposerKt.traceEventStart(1519746689, i, -1, "com.robinhood.android.slip.onboarding.hub.ComposableSingletons$SlipHubComposableKt.lambda$1519746689.<anonymous> (SlipHubComposable.kt:123)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1519746689$feature_slip_externalDebug() {
        return lambda$1519746689;
    }
}
