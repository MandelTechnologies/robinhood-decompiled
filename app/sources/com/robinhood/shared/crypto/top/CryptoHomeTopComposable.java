package com.robinhood.shared.crypto.top;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeTopComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.top.ComposableSingletons$CryptoHomeTopComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoHomeTopComposable {
    public static final CryptoHomeTopComposable INSTANCE = new CryptoHomeTopComposable();

    /* renamed from: lambda$-553982989, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9416lambda$553982989 = ComposableLambda3.composableLambdaInstance(-553982989, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.top.ComposableSingletons$CryptoHomeTopComposableKt$lambda$-553982989$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-553982989, i, -1, "com.robinhood.shared.crypto.top.ComposableSingletons$CryptoHomeTopComposableKt.lambda$-553982989.<anonymous> (CryptoHomeTopComposable.kt:44)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-553982989$lib_top_crypto_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m24985getLambda$553982989$lib_top_crypto_externalDebug() {
        return f9416lambda$553982989;
    }
}
