package com.robinhood.shared.equities.instrumentdetail.p378ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AnalystRatingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.ComposableSingletons$AnalystRatingsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AnalystRatingsComposable2 {
    public static final AnalystRatingsComposable2 INSTANCE = new AnalystRatingsComposable2();
    private static Function2<Composer, Integer, Unit> lambda$1244533305 = ComposableLambda3.composableLambdaInstance(1244533305, false, AnalystRatingsComposable4.INSTANCE);

    /* renamed from: lambda$-993220879, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9457lambda$993220879 = ComposableLambda3.composableLambdaInstance(-993220879, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.ComposableSingletons$AnalystRatingsComposableKt$lambda$-993220879$1
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
                ComposerKt.traceEventStart(-993220879, i, -1, "com.robinhood.shared.equities.instrumentdetail.ui.ComposableSingletons$AnalystRatingsComposableKt.lambda$-993220879.<anonymous> (AnalystRatingsComposable.kt:50)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, AnalystRatingsComposable2.INSTANCE.getLambda$1244533305$lib_instrument_detail_ui_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-993220879$lib_instrument_detail_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25419getLambda$993220879$lib_instrument_detail_ui_externalDebug() {
        return f9457lambda$993220879;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1244533305$lib_instrument_detail_ui_externalDebug() {
        return lambda$1244533305;
    }
}
