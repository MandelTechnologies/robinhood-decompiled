package com.robinhood.android.feature.linking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MobileLinkingErrorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.linking.ComposableSingletons$MobileLinkingErrorFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MobileLinkingErrorFragment2 {
    public static final MobileLinkingErrorFragment2 INSTANCE = new MobileLinkingErrorFragment2();

    /* renamed from: lambda$-2008060180, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8965lambda$2008060180 = ComposableLambda3.composableLambdaInstance(-2008060180, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.linking.ComposableSingletons$MobileLinkingErrorFragmentKt$lambda$-2008060180$1
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
                ComposerKt.traceEventStart(-2008060180, i, -1, "com.robinhood.android.feature.linking.ComposableSingletons$MobileLinkingErrorFragmentKt.lambda$-2008060180.<anonymous> (MobileLinkingErrorFragment.kt:72)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-498038355, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8966lambda$498038355 = ComposableLambda3.composableLambdaInstance(-498038355, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.linking.ComposableSingletons$MobileLinkingErrorFragmentKt$lambda$-498038355$1
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
                ComposerKt.traceEventStart(-498038355, i, -1, "com.robinhood.android.feature.linking.ComposableSingletons$MobileLinkingErrorFragmentKt.lambda$-498038355.<anonymous> (MobileLinkingErrorFragment.kt:73)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2008060180$feature_mobile_linking_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14454getLambda$2008060180$feature_mobile_linking_externalDebug() {
        return f8965lambda$2008060180;
    }

    /* renamed from: getLambda$-498038355$feature_mobile_linking_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14455getLambda$498038355$feature_mobile_linking_externalDebug() {
        return f8966lambda$498038355;
    }
}
