package com.robinhood.shared.crypto.staking.staking.input;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoStakingInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingInputComposable {
    public static final CryptoStakingInputComposable INSTANCE = new CryptoStakingInputComposable();
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$1018950565 = ComposableLambda3.composableLambdaInstance(1018950565, false, CryptoStakingInputComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$418727833 = ComposableLambda3.composableLambdaInstance(418727833, false, CryptoStakingInputComposable4.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1821240325 = ComposableLambda3.composableLambdaInstance(1821240325, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt$lambda$1821240325$1
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
                ComposerKt.traceEventStart(1821240325, i, -1, "com.robinhood.shared.crypto.staking.staking.input.ComposableSingletons$CryptoStakingInputComposableKt.lambda$1821240325.<anonymous> (CryptoStakingInputComposable.kt:315)");
            }
            CryptoStakingInputComposable5.LoadingReviewContent(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$1018950565$feature_crypto_staking_externalDebug() {
        return lambda$1018950565;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1821240325$feature_crypto_staking_externalDebug() {
        return lambda$1821240325;
    }

    public final Function2<Composer, Integer, Unit> getLambda$418727833$feature_crypto_staking_externalDebug() {
        return lambda$418727833;
    }
}
