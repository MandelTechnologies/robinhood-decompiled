package com.robinhood.android.gold.lib.sage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldSageScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageScaffoldKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageScaffold {
    public static final GoldSageScaffold INSTANCE = new GoldSageScaffold();
    private static Function2<Composer, Integer, Unit> lambda$996566535 = ComposableLambda3.composableLambdaInstance(996566535, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageScaffoldKt$lambda$996566535$1
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
                ComposerKt.traceEventStart(996566535, i, -1, "com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageScaffoldKt.lambda$996566535.<anonymous> (GoldSageScaffold.kt:19)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$996566535$lib_gold_sage_externalRelease() {
        return lambda$996566535;
    }
}
