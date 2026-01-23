package com.robinhood.android.gold.upgrade.unified.screen.sage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldSageStartApplicationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.ComposableSingletons$GoldSageStartApplicationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageStartApplicationComposable2 {
    public static final GoldSageStartApplicationComposable2 INSTANCE = new GoldSageStartApplicationComposable2();

    /* renamed from: lambda$-1511183916, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9030lambda$1511183916 = ComposableLambda3.composableLambdaInstance(-1511183916, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.sage.ComposableSingletons$GoldSageStartApplicationComposableKt$lambda$-1511183916$1
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
                ComposerKt.traceEventStart(-1511183916, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.sage.ComposableSingletons$GoldSageStartApplicationComposableKt.lambda$-1511183916.<anonymous> (GoldSageStartApplicationComposable.kt:64)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1511183916$feature_gold_upgrade_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15176getLambda$1511183916$feature_gold_upgrade_externalRelease() {
        return f9030lambda$1511183916;
    }
}
