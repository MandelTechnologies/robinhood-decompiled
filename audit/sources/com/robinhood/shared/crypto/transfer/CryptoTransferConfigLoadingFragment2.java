package com.robinhood.shared.crypto.transfer;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferConfigLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.ComposableSingletons$CryptoTransferConfigLoadingFragmentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferConfigLoadingFragment2 {
    public static final CryptoTransferConfigLoadingFragment2 INSTANCE = new CryptoTransferConfigLoadingFragment2();

    /* renamed from: lambda$-1276308726, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9417lambda$1276308726 = ComposableLambda3.composableLambdaInstance(-1276308726, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.ComposableSingletons$CryptoTransferConfigLoadingFragmentKt$lambda$-1276308726$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1276308726, i, -1, "com.robinhood.shared.crypto.transfer.ComposableSingletons$CryptoTransferConfigLoadingFragmentKt.lambda$-1276308726.<anonymous> (CryptoTransferConfigLoadingFragment.kt:46)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, true, false, composer, 384, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1276308726$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m24990getLambda$1276308726$feature_crypto_transfer_externalDebug() {
        return f9417lambda$1276308726;
    }
}
