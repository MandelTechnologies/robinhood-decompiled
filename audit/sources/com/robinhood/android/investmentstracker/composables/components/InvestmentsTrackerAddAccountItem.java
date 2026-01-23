package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerAddAccountItem.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerAddAccountItem {
    public static final InvestmentsTrackerAddAccountItem INSTANCE = new InvestmentsTrackerAddAccountItem();

    /* renamed from: lambda$-1935760765, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9067lambda$1935760765 = ComposableLambda3.composableLambdaInstance(-1935760765, false, InvestmentsTrackerAddAccountItem2.INSTANCE);

    /* renamed from: lambda$-354155282, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9068lambda$354155282 = ComposableLambda3.composableLambdaInstance(-354155282, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt$lambda$-354155282$1
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
                ComposerKt.traceEventStart(-354155282, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt.lambda$-354155282.<anonymous> (InvestmentsTrackerAddAccountItem.kt:30)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerAddAccountItem.INSTANCE.m15589getLambda$1935760765$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1935760765$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15589getLambda$1935760765$feature_investments_tracker_externalDebug() {
        return f9067lambda$1935760765;
    }

    /* renamed from: getLambda$-354155282$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15590getLambda$354155282$feature_investments_tracker_externalDebug() {
        return f9068lambda$354155282;
    }
}
