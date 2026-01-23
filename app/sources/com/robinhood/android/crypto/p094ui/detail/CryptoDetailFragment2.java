package com.robinhood.android.crypto.p094ui.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.ComposableSingletons$CryptoDetailFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailFragment2 {
    public static final CryptoDetailFragment2 INSTANCE = new CryptoDetailFragment2();

    /* renamed from: lambda$-68255838, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8845lambda$68255838 = ComposableLambda3.composableLambdaInstance(-68255838, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.ComposableSingletons$CryptoDetailFragmentKt$lambda$-68255838$1
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
                ComposerKt.traceEventStart(-68255838, i, -1, "com.robinhood.android.crypto.ui.detail.ComposableSingletons$CryptoDetailFragmentKt.lambda$-68255838.<anonymous> (CryptoDetailFragment.kt:501)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-68255838$feature_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13062getLambda$68255838$feature_crypto_externalDebug() {
        return f8845lambda$68255838;
    }
}
