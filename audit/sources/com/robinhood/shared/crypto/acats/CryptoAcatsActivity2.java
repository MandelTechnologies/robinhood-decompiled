package com.robinhood.shared.crypto.acats;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoAcatsActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsActivityKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsActivity2 {
    public static final CryptoAcatsActivity2 INSTANCE = new CryptoAcatsActivity2();

    /* renamed from: lambda$-1151033871, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9390lambda$1151033871 = ComposableLambda3.composableLambdaInstance(-1151033871, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsActivityKt$lambda$-1151033871$1
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
                ComposerKt.traceEventStart(-1151033871, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsActivityKt.lambda$-1151033871.<anonymous> (CryptoAcatsActivity.kt:36)");
            }
            CryptoAcatsComposable.CryptoAcatsComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1151033871$feature_acats_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24861getLambda$1151033871$feature_acats_externalRelease() {
        return f9390lambda$1151033871;
    }
}
