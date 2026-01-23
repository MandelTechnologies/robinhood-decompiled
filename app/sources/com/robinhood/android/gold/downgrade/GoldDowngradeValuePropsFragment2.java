package com.robinhood.android.gold.downgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldDowngradeValuePropsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.downgrade.ComposableSingletons$GoldDowngradeValuePropsFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDowngradeValuePropsFragment2 {
    public static final GoldDowngradeValuePropsFragment2 INSTANCE = new GoldDowngradeValuePropsFragment2();
    private static Function2<Composer, Integer, Unit> lambda$858985538 = ComposableLambda3.composableLambdaInstance(858985538, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.ComposableSingletons$GoldDowngradeValuePropsFragmentKt$lambda$858985538$1
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
                ComposerKt.traceEventStart(858985538, i, -1, "com.robinhood.android.gold.downgrade.ComposableSingletons$GoldDowngradeValuePropsFragmentKt.lambda$858985538.<anonymous> (GoldDowngradeValuePropsFragment.kt:39)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$858985538$feature_gold_downgrade_externalDebug() {
        return lambda$858985538;
    }
}
