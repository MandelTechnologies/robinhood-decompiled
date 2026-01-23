package com.robinhood.android.transfers.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentIntentHistoryDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.history.ComposableSingletons$PaymentIntentHistoryDetailComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PaymentIntentHistoryDetailComposable {
    public static final PaymentIntentHistoryDetailComposable INSTANCE = new PaymentIntentHistoryDetailComposable();
    private static Function2<Composer, Integer, Unit> lambda$1031691527 = ComposableLambda3.composableLambdaInstance(1031691527, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.ComposableSingletons$PaymentIntentHistoryDetailComposableKt$lambda$1031691527$1
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
                ComposerKt.traceEventStart(1031691527, i, -1, "com.robinhood.android.transfers.history.ComposableSingletons$PaymentIntentHistoryDetailComposableKt.lambda$1031691527.<anonymous> (PaymentIntentHistoryDetailComposable.kt:60)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1031691527$feature_transfers_externalRelease() {
        return lambda$1031691527;
    }
}
