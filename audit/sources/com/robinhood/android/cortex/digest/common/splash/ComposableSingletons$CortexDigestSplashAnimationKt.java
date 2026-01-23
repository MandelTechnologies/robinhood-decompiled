package com.robinhood.android.cortex.digest.common.splash;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CortexDigestSplashAnimation.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CortexDigestSplashAnimationKt {
    public static final ComposableSingletons$CortexDigestSplashAnimationKt INSTANCE = new ComposableSingletons$CortexDigestSplashAnimationKt();

    /* renamed from: lambda$-2014003038, reason: not valid java name */
    private static Function4<BoxScope, Float, Composer, Integer, Unit> f8745lambda$2014003038 = ComposableLambda3.composableLambdaInstance(-2014003038, false, new Function4<BoxScope, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.splash.ComposableSingletons$CortexDigestSplashAnimationKt$lambda$-2014003038$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Float f, Composer composer, Integer num) {
            invoke(boxScope, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope boxScope, float f, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            if ((i & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2014003038, i, -1, "com.robinhood.android.cortex.digest.common.splash.ComposableSingletons$CortexDigestSplashAnimationKt.lambda$-2014003038.<anonymous> (CortexDigestSplashAnimation.kt:53)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-495484214, reason: not valid java name */
    private static Function4<BoxScope, Float, Composer, Integer, Unit> f8746lambda$495484214 = ComposableLambda3.composableLambdaInstance(-495484214, false, new Function4<BoxScope, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.splash.ComposableSingletons$CortexDigestSplashAnimationKt$lambda$-495484214$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Float f, Composer composer, Integer num) {
            invoke(boxScope, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope boxScope, float f, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            if ((i & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-495484214, i, -1, "com.robinhood.android.cortex.digest.common.splash.ComposableSingletons$CortexDigestSplashAnimationKt.lambda$-495484214.<anonymous> (CortexDigestSplashAnimation.kt:54)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2014003038$lib_cortex_digest_common_externalDebug, reason: not valid java name */
    public final Function4<BoxScope, Float, Composer, Integer, Unit> m12584getLambda$2014003038$lib_cortex_digest_common_externalDebug() {
        return f8745lambda$2014003038;
    }

    /* renamed from: getLambda$-495484214$lib_cortex_digest_common_externalDebug, reason: not valid java name */
    public final Function4<BoxScope, Float, Composer, Integer, Unit> m12585getLambda$495484214$lib_cortex_digest_common_externalDebug() {
        return f8746lambda$495484214;
    }
}
