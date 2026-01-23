package com.robinhood.android.crypto.tab.p093ui.nux;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeNuxComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.nux.ComposableSingletons$CryptoHomeNuxComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeNuxComposable {
    public static final CryptoHomeNuxComposable INSTANCE = new CryptoHomeNuxComposable();
    private static Function2<Composer, Integer, Unit> lambda$1714664538 = ComposableLambda3.composableLambdaInstance(1714664538, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.nux.ComposableSingletons$CryptoHomeNuxComposableKt$lambda$1714664538$1
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
                ComposerKt.traceEventStart(1714664538, i, -1, "com.robinhood.android.crypto.tab.ui.nux.ComposableSingletons$CryptoHomeNuxComposableKt.lambda$1714664538.<anonymous> (CryptoHomeNuxComposable.kt:80)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1714664538$feature_crypto_tab_externalDebug() {
        return lambda$1714664538;
    }
}
