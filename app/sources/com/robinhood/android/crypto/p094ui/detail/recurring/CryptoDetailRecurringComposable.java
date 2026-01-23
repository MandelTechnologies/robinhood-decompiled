package com.robinhood.android.crypto.p094ui.detail.recurring;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoDetailRecurringComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.recurring.ComposableSingletons$CryptoDetailRecurringComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailRecurringComposable {
    public static final CryptoDetailRecurringComposable INSTANCE = new CryptoDetailRecurringComposable();
    private static Function2<Composer, Integer, Unit> lambda$1848323999 = ComposableLambda3.composableLambdaInstance(1848323999, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.recurring.ComposableSingletons$CryptoDetailRecurringComposableKt$lambda$1848323999$1
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
                ComposerKt.traceEventStart(1848323999, i, -1, "com.robinhood.android.crypto.ui.detail.recurring.ComposableSingletons$CryptoDetailRecurringComposableKt.lambda$1848323999.<anonymous> (CryptoDetailRecurringComposable.kt:133)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1848323999$feature_crypto_externalDebug() {
        return lambda$1848323999;
    }
}
