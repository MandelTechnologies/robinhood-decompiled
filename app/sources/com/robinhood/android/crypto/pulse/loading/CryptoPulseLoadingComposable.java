package com.robinhood.android.crypto.pulse.loading;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoPulseLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.pulse.loading.ComposableSingletons$CryptoPulseLoadingComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseLoadingComposable {
    public static final CryptoPulseLoadingComposable INSTANCE = new CryptoPulseLoadingComposable();
    private static Function2<Composer, Integer, Unit> lambda$1397817721 = ComposableLambda3.composableLambdaInstance(1397817721, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.loading.ComposableSingletons$CryptoPulseLoadingComposableKt$lambda$1397817721$1
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
                ComposerKt.traceEventStart(1397817721, i, -1, "com.robinhood.android.crypto.pulse.loading.ComposableSingletons$CryptoPulseLoadingComposableKt.lambda$1397817721.<anonymous> (CryptoPulseLoadingComposable.kt:91)");
            }
            CryptoPulseLoadingComposable3.CryptoPulseLoadingComposable(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1397817721$feature_crypto_pulse_externalDebug() {
        return lambda$1397817721;
    }
}
