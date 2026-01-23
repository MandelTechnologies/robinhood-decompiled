package com.robinhood.android.support.supporthub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ConciergeFaqComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeFaqComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergeFaqComposable {
    public static final ConciergeFaqComposable INSTANCE = new ConciergeFaqComposable();

    /* renamed from: lambda$-1707062770, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9254lambda$1707062770 = ComposableLambda3.composableLambdaInstance(-1707062770, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeFaqComposableKt$lambda$-1707062770$1
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
                ComposerKt.traceEventStart(-1707062770, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeFaqComposableKt.lambda$-1707062770.<anonymous> (ConciergeFaqComposable.kt:53)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1707062770$feature_support_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19093getLambda$1707062770$feature_support_externalRelease() {
        return f9254lambda$1707062770;
    }
}
