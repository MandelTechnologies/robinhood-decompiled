package com.robinhood.shared.crypto.messaging;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoSduiMessagingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.messaging.ComposableSingletons$CryptoSduiMessagingScreenKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoSduiMessagingScreen {
    public static final CryptoSduiMessagingScreen INSTANCE = new CryptoSduiMessagingScreen();

    /* renamed from: lambda$-1920865509, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9407lambda$1920865509 = ComposableLambda3.composableLambdaInstance(-1920865509, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.messaging.ComposableSingletons$CryptoSduiMessagingScreenKt$lambda$-1920865509$1
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
                ComposerKt.traceEventStart(-1920865509, i, -1, "com.robinhood.shared.crypto.messaging.ComposableSingletons$CryptoSduiMessagingScreenKt.lambda$-1920865509.<anonymous> (CryptoSduiMessagingScreen.kt:36)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1920865509$feature_crypto_sdui_messaging_externalDebug */
    public final Function2<Composer, Integer, Unit> m2772x5c97db97() {
        return f9407lambda$1920865509;
    }
}
