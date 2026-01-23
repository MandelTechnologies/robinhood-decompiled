package com.robinhood.android.crypto.pulse.primer;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoPulsePrimer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.pulse.primer.ComposableSingletons$CryptoPulsePrimerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulsePrimer {
    public static final CryptoPulsePrimer INSTANCE = new CryptoPulsePrimer();
    private static Function2<Composer, Integer, Unit> lambda$734174888 = ComposableLambda3.composableLambdaInstance(734174888, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.primer.ComposableSingletons$CryptoPulsePrimerKt$lambda$734174888$1
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
                ComposerKt.traceEventStart(734174888, i, -1, "com.robinhood.android.crypto.pulse.primer.ComposableSingletons$CryptoPulsePrimerKt.lambda$734174888.<anonymous> (CryptoPulsePrimer.kt:48)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$367442684 = ComposableLambda3.composableLambdaInstance(367442684, false, CryptoPulsePrimer3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$2037594491 = ComposableLambda3.composableLambdaInstance(2037594491, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.primer.ComposableSingletons$CryptoPulsePrimerKt$lambda$2037594491$1
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
                ComposerKt.traceEventStart(2037594491, i, -1, "com.robinhood.android.crypto.pulse.primer.ComposableSingletons$CryptoPulsePrimerKt.lambda$2037594491.<anonymous> (CryptoPulsePrimer.kt:46)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            CryptoPulsePrimer cryptoPulsePrimer = CryptoPulsePrimer.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(cryptoPulsePrimer.getLambda$734174888$feature_crypto_pulse_externalDebug(), modifierFillMaxWidth$default, cryptoPulsePrimer.getLambda$367442684$feature_crypto_pulse_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 438, 0, 2040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2037594491$feature_crypto_pulse_externalDebug() {
        return lambda$2037594491;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$367442684$feature_crypto_pulse_externalDebug() {
        return lambda$367442684;
    }

    public final Function2<Composer, Integer, Unit> getLambda$734174888$feature_crypto_pulse_externalDebug() {
        return lambda$734174888;
    }
}
