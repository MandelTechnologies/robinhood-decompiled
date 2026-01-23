package com.robinhood.android.common.gold;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoAppBarWithTransition.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.ComposableSingletons$BentoAppBarWithTransitionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BentoAppBarWithTransition4 {
    public static final BentoAppBarWithTransition4 INSTANCE = new BentoAppBarWithTransition4();
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$2020769610 = ComposableLambda3.composableLambdaInstance(2020769610, false, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.ComposableSingletons$BentoAppBarWithTransitionKt$lambda$2020769610$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope bentoAppBarScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(bentoAppBarScope, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020769610, i, -1, "com.robinhood.android.common.gold.ComposableSingletons$BentoAppBarWithTransitionKt.lambda$2020769610.<anonymous> (BentoAppBarWithTransition.kt:43)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$2020769610$feature_lib_gold_externalRelease() {
        return lambda$2020769610;
    }
}
