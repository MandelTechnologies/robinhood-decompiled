package com.robinhood.shared.crypto.staking.staking.stakinghub;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingHubComposable {
    public static final CryptoStakingHubComposable INSTANCE = new CryptoStakingHubComposable();
    private static Function3<CryptoStakingHubViewState, Composer, Integer, Unit> lambda$1757818423 = ComposableLambda3.composableLambdaInstance(1757818423, false, new Function3<CryptoStakingHubViewState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubComposableKt$lambda$1757818423$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(CryptoStakingHubViewState cryptoStakingHubViewState, Composer composer, Integer num) {
            invoke(cryptoStakingHubViewState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(CryptoStakingHubViewState state, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(state, "state");
            if ((i & 6) == 0) {
                i |= composer.changed(state) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757818423, i, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubComposableKt.lambda$1757818423.<anonymous> (CryptoStakingHubComposable.kt:41)");
            }
            if (Intrinsics.areEqual(state, CryptoStakingHubViewState.Error.INSTANCE)) {
                composer.startReplaceGroup(1341359781);
                CryptoStakingHubComposable4.ErrorContent(null, composer, 0, 1);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(state, CryptoStakingHubViewState.Loading.INSTANCE)) {
                composer.startReplaceGroup(1341361837);
                CryptoStakingHubComposable4.LoadingReviewContent(null, composer, 0, 1);
                composer.endReplaceGroup();
            } else {
                if (!(state instanceof CryptoStakingHubViewState.Content)) {
                    composer.startReplaceGroup(1341358149);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1341364866);
                CryptoStakingHubComposable4.MainContent((CryptoStakingHubViewState.Content) state, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$681451344 = ComposableLambda3.composableLambdaInstance(681451344, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubComposableKt$lambda$681451344$1
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
                ComposerKt.traceEventStart(681451344, i, -1, "com.robinhood.shared.crypto.staking.staking.stakinghub.ComposableSingletons$CryptoStakingHubComposableKt.lambda$681451344.<anonymous> (CryptoStakingHubComposable.kt:68)");
            }
            CryptoStakingHubComposable4.LoadingReviewContent(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<CryptoStakingHubViewState, Composer, Integer, Unit> getLambda$1757818423$feature_crypto_staking_externalDebug() {
        return lambda$1757818423;
    }

    public final Function2<Composer, Integer, Unit> getLambda$681451344$feature_crypto_staking_externalDebug() {
        return lambda$681451344;
    }
}
