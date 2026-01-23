package com.robinhood.android.advisory.tlh.flow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HarvestFlowScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.flow.ComposableSingletons$HarvestFlowScaffoldKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestFlowScaffold {
    public static final HarvestFlowScaffold INSTANCE = new HarvestFlowScaffold();

    /* renamed from: lambda$-637525980, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8657lambda$637525980 = ComposableLambda3.composableLambdaInstance(-637525980, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.ComposableSingletons$HarvestFlowScaffoldKt$lambda$-637525980$1
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
                ComposerKt.traceEventStart(-637525980, i, -1, "com.robinhood.android.advisory.tlh.flow.ComposableSingletons$HarvestFlowScaffoldKt.lambda$-637525980.<anonymous> (HarvestFlowScaffold.kt:46)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-637525980$feature_tax_loss_harvesting_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug() {
        return f8657lambda$637525980;
    }
}
