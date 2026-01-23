package com.robinhood.android.retirement.p239ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PostChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.ComposableSingletons$PostChartSectionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class PostChartSection2 {
    public static final PostChartSection2 INSTANCE = new PostChartSection2();

    /* renamed from: lambda$-725816702, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9221lambda$725816702 = ComposableLambda3.composableLambdaInstance(-725816702, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.ComposableSingletons$PostChartSectionKt$lambda$-725816702$1
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
                ComposerKt.traceEventStart(-725816702, i, -1, "com.robinhood.android.retirement.ui.ComposableSingletons$PostChartSectionKt.lambda$-725816702.<anonymous> (PostChartSection.kt:37)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-725816702$feature_retirement_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18195getLambda$725816702$feature_retirement_tab_externalDebug() {
        return f9221lambda$725816702;
    }
}
