package com.robinhood.shared.crypto.transfer.receive;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ReceiveSuccessComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ReceiveSuccessComposable {
    public static final ReceiveSuccessComposable INSTANCE = new ReceiveSuccessComposable();
    private static Function2<Composer, Integer, Unit> lambda$209107158 = ComposableLambda3.composableLambdaInstance(209107158, false, ReceiveSuccessComposable3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$134337558 = ComposableLambda3.composableLambdaInstance(134337558, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt$lambda$134337558$1
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
                ComposerKt.traceEventStart(134337558, i, -1, "com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt.lambda$134337558.<anonymous> (ReceiveSuccessComposable.kt:401)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), ReceiveSuccessComposable.INSTANCE.getLambda$209107158$feature_crypto_transfer_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$134337558$feature_crypto_transfer_externalDebug() {
        return lambda$134337558;
    }

    public final Function2<Composer, Integer, Unit> getLambda$209107158$feature_crypto_transfer_externalDebug() {
        return lambda$209107158;
    }
}
