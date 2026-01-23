package com.robinhood.android.crypto.p094ui.view.availableCoins;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AvailableCoinsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.view.availableCoins.ComposableSingletons$AvailableCoinsViewKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AvailableCoinsView3 {
    public static final AvailableCoinsView3 INSTANCE = new AvailableCoinsView3();
    private static Function2<Composer, Integer, Unit> lambda$309403311 = ComposableLambda3.composableLambdaInstance(309403311, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.view.availableCoins.ComposableSingletons$AvailableCoinsViewKt$lambda$309403311$1
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
                ComposerKt.traceEventStart(309403311, i, -1, "com.robinhood.android.crypto.ui.view.availableCoins.ComposableSingletons$AvailableCoinsViewKt.lambda$309403311.<anonymous> (AvailableCoinsView.kt:24)");
            }
            AvailableCoinsHeaderComposable.AvailableCoinsHeaderComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-717445897, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8858lambda$717445897 = ComposableLambda3.composableLambdaInstance(-717445897, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.view.availableCoins.ComposableSingletons$AvailableCoinsViewKt$lambda$-717445897$1
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
                ComposerKt.traceEventStart(-717445897, i, -1, "com.robinhood.android.crypto.ui.view.availableCoins.ComposableSingletons$AvailableCoinsViewKt.lambda$-717445897.<anonymous> (AvailableCoinsView.kt:23)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, AvailableCoinsView3.INSTANCE.getLambda$309403311$feature_crypto_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-717445897$feature_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13167getLambda$717445897$feature_crypto_externalDebug() {
        return f8858lambda$717445897;
    }

    public final Function2<Composer, Integer, Unit> getLambda$309403311$feature_crypto_externalDebug() {
        return lambda$309403311;
    }
}
