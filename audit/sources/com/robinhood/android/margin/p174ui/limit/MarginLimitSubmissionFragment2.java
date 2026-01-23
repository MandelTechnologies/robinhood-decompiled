package com.robinhood.android.margin.p174ui.limit;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitSubmissionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.limit.ComposableSingletons$MarginLimitSubmissionFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginLimitSubmissionFragment2 {
    public static final MarginLimitSubmissionFragment2 INSTANCE = new MarginLimitSubmissionFragment2();

    /* renamed from: lambda$-1122672931, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9105lambda$1122672931 = ComposableLambda3.composableLambdaInstance(-1122672931, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.limit.ComposableSingletons$MarginLimitSubmissionFragmentKt$lambda$-1122672931$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1122672931, i, -1, "com.robinhood.android.margin.ui.limit.ComposableSingletons$MarginLimitSubmissionFragmentKt.lambda$-1122672931.<anonymous> (MarginLimitSubmissionFragment.kt:32)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, true, true, composer, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1122672931$feature_margin_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m16199getLambda$1122672931$feature_margin_externalDebug() {
        return f9105lambda$1122672931;
    }
}
