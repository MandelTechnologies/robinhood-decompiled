package com.robinhood.android.tickerinputview;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TickerInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tickerinputview.ComposableSingletons$TickerInputComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TickerInputComposable {
    public static final TickerInputComposable INSTANCE = new TickerInputComposable();

    /* renamed from: lambda$-1126196669, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9267lambda$1126196669 = ComposableLambda3.composableLambdaInstance(-1126196669, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tickerinputview.ComposableSingletons$TickerInputComposableKt$lambda$-1126196669$1
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
                ComposerKt.traceEventStart(-1126196669, i, -1, "com.robinhood.android.tickerinputview.ComposableSingletons$TickerInputComposableKt.lambda$-1126196669.<anonymous> (TickerInputComposable.kt:126)");
            }
            TickerInputComposable3.m19249TickerInputComposableuSRqIlo("$500.42", null, false, false, C2002Dp.m7995constructorimpl(48), 0, false, null, composer, 24966, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1126196669$lib_ticker_input_view_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19247getLambda$1126196669$lib_ticker_input_view_externalDebug() {
        return f9267lambda$1126196669;
    }
}
