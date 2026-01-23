package com.robinhood.shared.crypto.staking.staking.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoStakingReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.review.ComposableSingletons$CryptoStakingReviewComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingReviewComposable {
    public static final CryptoStakingReviewComposable INSTANCE = new CryptoStakingReviewComposable();
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$791472108 = ComposableLambda3.composableLambdaInstance(791472108, false, CryptoStakingReviewComposable3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1423085745 = ComposableLambda3.composableLambdaInstance(1423085745, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.review.ComposableSingletons$CryptoStakingReviewComposableKt$lambda$1423085745$1
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
                ComposerKt.traceEventStart(1423085745, i, -1, "com.robinhood.shared.crypto.staking.staking.review.ComposableSingletons$CryptoStakingReviewComposableKt.lambda$1423085745.<anonymous> (CryptoStakingReviewComposable.kt:204)");
            }
            CryptoStakingReviewComposable4.LoadingReviewContent(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1423085745$feature_crypto_staking_externalDebug() {
        return lambda$1423085745;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$791472108$feature_crypto_staking_externalDebug() {
        return lambda$791472108;
    }
}
