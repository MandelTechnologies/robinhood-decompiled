package com.robinhood.android.crypto.pulse.feed.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoPulseEmptyFeed.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.pulse.feed.views.ComposableSingletons$CryptoPulseEmptyFeedKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseEmptyFeed {
    public static final CryptoPulseEmptyFeed INSTANCE = new CryptoPulseEmptyFeed();

    /* renamed from: lambda$-1982960830, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8822lambda$1982960830 = ComposableLambda3.composableLambdaInstance(-1982960830, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.views.ComposableSingletons$CryptoPulseEmptyFeedKt$lambda$-1982960830$1
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
                ComposerKt.traceEventStart(-1982960830, i, -1, "com.robinhood.android.crypto.pulse.feed.views.ComposableSingletons$CryptoPulseEmptyFeedKt.lambda$-1982960830.<anonymous> (CryptoPulseEmptyFeed.kt:117)");
            }
            CryptoPulseEmptyFeed3.CryptoPulseEmptyFeed(Direction.DOWN, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1982960830$feature_crypto_pulse_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12958getLambda$1982960830$feature_crypto_pulse_externalDebug() {
        return f8822lambda$1982960830;
    }
}
