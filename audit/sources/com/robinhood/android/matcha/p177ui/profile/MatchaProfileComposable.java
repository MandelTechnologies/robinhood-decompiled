package com.robinhood.android.matcha.p177ui.profile;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaProfileComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.profile.ComposableSingletons$MatchaProfileComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaProfileComposable {
    public static final MatchaProfileComposable INSTANCE = new MatchaProfileComposable();

    /* renamed from: lambda$-2029177582, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9109lambda$2029177582 = ComposableLambda3.composableLambdaInstance(-2029177582, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.profile.ComposableSingletons$MatchaProfileComposableKt$lambda$-2029177582$1
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
                ComposerKt.traceEventStart(-2029177582, i, -1, "com.robinhood.android.matcha.ui.profile.ComposableSingletons$MatchaProfileComposableKt.lambda$-2029177582.<anonymous> (MatchaProfileComposable.kt:98)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2029177582$feature_p2p_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16367getLambda$2029177582$feature_p2p_externalDebug() {
        return f9109lambda$2029177582;
    }
}
