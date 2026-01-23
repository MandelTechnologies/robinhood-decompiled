package com.robinhood.android.advisory.history.fee;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryFeeDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryFeeDetailsFragment2 {
    public static final AdvisoryFeeDetailsFragment2 INSTANCE = new AdvisoryFeeDetailsFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1346527919 = ComposableLambda3.composableLambdaInstance(1346527919, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsFragmentKt$lambda$1346527919$1
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
                ComposerKt.traceEventStart(1346527919, i, -1, "com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsFragmentKt.lambda$1346527919.<anonymous> (AdvisoryFeeDetailsFragment.kt:17)");
            }
            AdvisoryFeeDetails.AdvisoryFeeDetails(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1346527919$feature_advisory_history_externalDebug() {
        return lambda$1346527919;
    }
}
