package com.robinhood.shared.crypto.staking.staking.receipt;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingReceiptComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.receipt.ComposableSingletons$CryptoStakingReceiptComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingReceiptComposable {
    public static final CryptoStakingReceiptComposable INSTANCE = new CryptoStakingReceiptComposable();
    private static Function2<Composer, Integer, Unit> lambda$776577587 = ComposableLambda3.composableLambdaInstance(776577587, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.receipt.ComposableSingletons$CryptoStakingReceiptComposableKt$lambda$776577587$1
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
                ComposerKt.traceEventStart(776577587, i, -1, "com.robinhood.shared.crypto.staking.staking.receipt.ComposableSingletons$CryptoStakingReceiptComposableKt.lambda$776577587.<anonymous> (CryptoStakingReceiptComposable.kt:70)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$776577587$feature_crypto_staking_externalDebug() {
        return lambda$776577587;
    }
}
