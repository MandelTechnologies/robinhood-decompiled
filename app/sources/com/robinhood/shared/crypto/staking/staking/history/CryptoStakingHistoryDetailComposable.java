package com.robinhood.shared.crypto.staking.staking.history;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingHistoryDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.history.ComposableSingletons$CryptoStakingHistoryDetailComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingHistoryDetailComposable {
    public static final CryptoStakingHistoryDetailComposable INSTANCE = new CryptoStakingHistoryDetailComposable();

    /* renamed from: lambda$-343599387, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9409lambda$343599387 = ComposableLambda3.composableLambdaInstance(-343599387, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.history.ComposableSingletons$CryptoStakingHistoryDetailComposableKt$lambda$-343599387$1
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
                ComposerKt.traceEventStart(-343599387, i, -1, "com.robinhood.shared.crypto.staking.staking.history.ComposableSingletons$CryptoStakingHistoryDetailComposableKt.lambda$-343599387.<anonymous> (CryptoStakingHistoryDetailComposable.kt:124)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-343599387$feature_crypto_staking_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24933getLambda$343599387$feature_crypto_staking_externalDebug() {
        return f9409lambda$343599387;
    }
}
