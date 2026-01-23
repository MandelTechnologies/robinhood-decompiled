package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoConfirmationScreenComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoConfirmationScreenComposable {
    public static final CryptoConfirmationScreenComposable INSTANCE = new CryptoConfirmationScreenComposable();
    private static Function2<Composer, Integer, Unit> lambda$1639472970 = ComposableLambda3.composableLambdaInstance(1639472970, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt$lambda$1639472970$1
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
                ComposerKt.traceEventStart(1639472970, i, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt.lambda$1639472970.<anonymous> (CryptoConfirmationScreenComposable.kt:155)");
            }
            CryptoConfirmationScreenComposable6.ConfirmationReceiptCardPreviewComposable(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$1917778247 = ComposableLambda3.composableLambdaInstance(1917778247, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt$lambda$1917778247$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1917778247, i, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt.lambda$1917778247.<anonymous> (CryptoConfirmationScreenComposable.kt:153)");
            }
            CryptoConfirmationScreenComposable6.CryptoConfirmationScreenComposable(AnimatedVisibility, null, CryptoConfirmationScreenComposable.INSTANCE.getLambda$1639472970$lib_crypto_ui_externalDebug(), composer, (i & 14) | 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$400084767 = ComposableLambda3.composableLambdaInstance(400084767, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt$lambda$400084767$1
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
                ComposerKt.traceEventStart(400084767, i, -1, "com.robinhood.shared.crypto.ui.trade.confirmation.ComposableSingletons$CryptoConfirmationScreenComposableKt.lambda$400084767.<anonymous> (CryptoConfirmationScreenComposable.kt:152)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) CryptoConfirmationScreenComposable.INSTANCE.getLambda$1917778247$lib_crypto_ui_externalDebug(), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1639472970$lib_crypto_ui_externalDebug() {
        return lambda$1639472970;
    }

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$1917778247$lib_crypto_ui_externalDebug() {
        return lambda$1917778247;
    }

    public final Function2<Composer, Integer, Unit> getLambda$400084767$lib_crypto_ui_externalDebug() {
        return lambda$400084767;
    }
}
