package com.robinhood.shared.crypto.staking.staking.initialization;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitialLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.initialization.ComposableSingletons$InitialLoadingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InitialLoadingComposable {
    public static final InitialLoadingComposable INSTANCE = new InitialLoadingComposable();
    private static Function2<Composer, Integer, Unit> lambda$434378577 = ComposableLambda3.composableLambdaInstance(434378577, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.ComposableSingletons$InitialLoadingComposableKt$lambda$434378577$1
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
                ComposerKt.traceEventStart(434378577, i, -1, "com.robinhood.shared.crypto.staking.staking.initialization.ComposableSingletons$InitialLoadingComposableKt.lambda$434378577.<anonymous> (InitialLoadingComposable.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$2132577331 = ComposableLambda3.composableLambdaInstance(2132577331, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.initialization.ComposableSingletons$InitialLoadingComposableKt$lambda$2132577331$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i |= composer.changed(contentPadding) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2132577331, i, -1, "com.robinhood.shared.crypto.staking.staking.initialization.ComposableSingletons$InitialLoadingComposableKt.lambda$2132577331.<anonymous> (InitialLoadingComposable.kt:71)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, contentPadding), true, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$2132577331$feature_crypto_staking_externalDebug() {
        return lambda$2132577331;
    }

    public final Function2<Composer, Integer, Unit> getLambda$434378577$feature_crypto_staking_externalDebug() {
        return lambda$434378577;
    }
}
