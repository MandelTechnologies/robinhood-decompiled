package com.robinhood.android.crypto.pulse.feed;

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

/* compiled from: CryptoPulseFeedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.pulse.feed.ComposableSingletons$CryptoPulseFeedComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseFeedComposable {
    public static final CryptoPulseFeedComposable INSTANCE = new CryptoPulseFeedComposable();
    private static Function2<Composer, Integer, Unit> lambda$1204978202 = ComposableLambda3.composableLambdaInstance(1204978202, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.ComposableSingletons$CryptoPulseFeedComposableKt$lambda$1204978202$1
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
                ComposerKt.traceEventStart(1204978202, i, -1, "com.robinhood.android.crypto.pulse.feed.ComposableSingletons$CryptoPulseFeedComposableKt.lambda$1204978202.<anonymous> (CryptoPulseFeedComposable.kt:90)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1074452882, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f8820lambda$1074452882 = ComposableLambda3.composableLambdaInstance(-1074452882, false, CryptoPulseFeedComposable2.INSTANCE);

    /* renamed from: lambda$-628028691, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8821lambda$628028691 = ComposableLambda3.composableLambdaInstance(-628028691, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.ComposableSingletons$CryptoPulseFeedComposableKt$lambda$-628028691$1
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
                ComposerKt.traceEventStart(-628028691, i, -1, "com.robinhood.android.crypto.pulse.feed.ComposableSingletons$CryptoPulseFeedComposableKt.lambda$-628028691.<anonymous> (CryptoPulseFeedComposable.kt:88)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            CryptoPulseFeedComposable cryptoPulseFeedComposable = CryptoPulseFeedComposable.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(cryptoPulseFeedComposable.getLambda$1204978202$feature_crypto_pulse_externalDebug(), modifierFillMaxWidth$default, cryptoPulseFeedComposable.m12955getLambda$1074452882$feature_crypto_pulse_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 438, 0, 2040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1074452882$feature_crypto_pulse_externalDebug, reason: not valid java name */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m12955getLambda$1074452882$feature_crypto_pulse_externalDebug() {
        return f8820lambda$1074452882;
    }

    /* renamed from: getLambda$-628028691$feature_crypto_pulse_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12956getLambda$628028691$feature_crypto_pulse_externalDebug() {
        return f8821lambda$628028691;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1204978202$feature_crypto_pulse_externalDebug() {
        return lambda$1204978202;
    }
}
