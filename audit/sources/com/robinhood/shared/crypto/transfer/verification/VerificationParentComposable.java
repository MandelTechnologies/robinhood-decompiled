package com.robinhood.shared.crypto.transfer.verification;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationParentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.ComposableSingletons$VerificationParentComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class VerificationParentComposable {
    public static final VerificationParentComposable INSTANCE = new VerificationParentComposable();

    /* renamed from: lambda$-1284103489, reason: not valid java name */
    private static Function4<AnimatedContentScope, String, Composer, Integer, Unit> f9437lambda$1284103489 = ComposableLambda3.composableLambdaInstance(-1284103489, false, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.ComposableSingletons$VerificationParentComposableKt$lambda$-1284103489$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer, Integer num) {
            invoke(animatedContentScope, str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1284103489, i, -1, "com.robinhood.shared.crypto.transfer.verification.ComposableSingletons$VerificationParentComposableKt.lambda$-1284103489.<anonymous> (VerificationParentComposable.kt:65)");
            }
            BentoText2.m20747BentoText38GnDrw(it, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, (i >> 3) & 14, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1284103489$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function4<AnimatedContentScope, String, Composer, Integer, Unit> m25174getLambda$1284103489$feature_crypto_transfer_externalDebug() {
        return f9437lambda$1284103489;
    }
}
