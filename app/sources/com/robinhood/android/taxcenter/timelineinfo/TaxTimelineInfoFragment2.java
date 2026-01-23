package com.robinhood.android.taxcenter.timelineinfo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TaxTimelineInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcenter.timelineinfo.ComposableSingletons$TaxTimelineInfoFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TaxTimelineInfoFragment2 {
    public static final TaxTimelineInfoFragment2 INSTANCE = new TaxTimelineInfoFragment2();

    /* renamed from: lambda$-1138310269, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9259lambda$1138310269 = ComposableLambda3.composableLambdaInstance(-1138310269, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.timelineinfo.ComposableSingletons$TaxTimelineInfoFragmentKt$lambda$-1138310269$1
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
                ComposerKt.traceEventStart(-1138310269, i, -1, "com.robinhood.android.taxcenter.timelineinfo.ComposableSingletons$TaxTimelineInfoFragmentKt.lambda$-1138310269.<anonymous> (TaxTimelineInfoFragment.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1138310269$feature_tax_center_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19222getLambda$1138310269$feature_tax_center_externalDebug() {
        return f9259lambda$1138310269;
    }
}
