package com.robinhood.shared.crypto.staking.staking.stakinghub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubFragmentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingHubFragment2 {
    public static final CryptoStakingHubFragment2 INSTANCE = new CryptoStakingHubFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1036401467 = ComposableLambda3.composableLambdaInstance(1036401467, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubFragmentKt$lambda$1036401467$1
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
                ComposerKt.traceEventStart(1036401467, i, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubFragmentKt.lambda$1036401467.<anonymous> (CryptoStakingHubFragment.kt:45)");
            }
            CryptoStakingHubComposable4.CryptoStakingHubComposable(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1036401467$feature_crypto_staking_externalDebug() {
        return lambda$1036401467;
    }
}
