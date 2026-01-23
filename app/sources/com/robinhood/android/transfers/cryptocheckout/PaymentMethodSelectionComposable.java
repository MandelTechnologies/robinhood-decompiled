package com.robinhood.android.transfers.cryptocheckout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentMethodSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.cryptocheckout.ComposableSingletons$PaymentMethodSelectionComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PaymentMethodSelectionComposable {
    public static final PaymentMethodSelectionComposable INSTANCE = new PaymentMethodSelectionComposable();
    private static Function2<Composer, Integer, Unit> lambda$558792795 = ComposableLambda3.composableLambdaInstance(558792795, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.cryptocheckout.ComposableSingletons$PaymentMethodSelectionComposableKt$lambda$558792795$1
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
                ComposerKt.traceEventStart(558792795, i, -1, "com.robinhood.android.transfers.cryptocheckout.ComposableSingletons$PaymentMethodSelectionComposableKt.lambda$558792795.<anonymous> (PaymentMethodSelectionComposable.kt:86)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, false, false, 3, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$558792795$feature_crypto_checkout_externalDebug() {
        return lambda$558792795;
    }
}
