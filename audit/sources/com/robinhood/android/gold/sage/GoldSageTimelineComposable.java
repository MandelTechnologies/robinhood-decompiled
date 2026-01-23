package com.robinhood.android.gold.sage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import gold.proto.p464v1.GoldSageTimelineItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageTimelineComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.ComposableSingletons$GoldSageTimelineComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageTimelineComposable {
    public static final GoldSageTimelineComposable INSTANCE = new GoldSageTimelineComposable();
    private static Function2<Composer, Integer, Unit> lambda$142836251 = ComposableLambda3.composableLambdaInstance(142836251, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.ComposableSingletons$GoldSageTimelineComposableKt$lambda$142836251$1
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
                ComposerKt.traceEventStart(142836251, i, -1, "com.robinhood.android.gold.sage.ComposableSingletons$GoldSageTimelineComposableKt.lambda$142836251.<anonymous> (GoldSageTimelineComposable.kt:277)");
            }
            GoldSageTimelineComposable3.Content("How it works", "Here’s a step-by-step on how you’ll lock in one of the lowest rates on the market with Sage.", extensions2.persistentListOf(new GoldSageTimelineItem("Complete your application", "Answer some questions to see the exclusive rate you’ll get with your Gold membership.", null, 4, null), new GoldSageTimelineItem("Lock in your mortgage rate", "Get your final rate when your home offer is accepted. Or if you’re refinancing, choose when to lock in your rate. [See rates with Gold]()", null, 4, null), new GoldSageTimelineItem("Earn a $500 bonus", "Score a cash bonus to apply towards your closing costs.", null, 4, null)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$142836251$feature_gold_sage_externalRelease() {
        return lambda$142836251;
    }
}
