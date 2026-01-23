package com.robinhood.android.gold.rejoin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldRejoinSubmissionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinSubmissionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldRejoinSubmissionComposable {
    public static final GoldRejoinSubmissionComposable INSTANCE = new GoldRejoinSubmissionComposable();
    private static Function2<Composer, Integer, Unit> lambda$2134505976 = ComposableLambda3.composableLambdaInstance(2134505976, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinSubmissionComposableKt$lambda$2134505976$1
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
                ComposerKt.traceEventStart(2134505976, i, -1, "com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinSubmissionComposableKt.lambda$2134505976.<anonymous> (GoldRejoinSubmissionComposable.kt:56)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1763470348 = ComposableLambda3.composableLambdaInstance(1763470348, false, GoldRejoinSubmissionComposable2.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1763470348$feature_gold_rejoin_externalRelease() {
        return lambda$1763470348;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2134505976$feature_gold_rejoin_externalRelease() {
        return lambda$2134505976;
    }
}
