package com.robinhood.android.dashboard.lib.buyingpower;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PortfolioBuyingPowerRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.ComposableSingletons$PortfolioBuyingPowerRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioBuyingPowerRow {
    public static final PortfolioBuyingPowerRow INSTANCE = new PortfolioBuyingPowerRow();

    /* renamed from: lambda$-1818133930, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8864lambda$1818133930 = ComposableLambda3.composableLambdaInstance(-1818133930, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.ComposableSingletons$PortfolioBuyingPowerRowKt$lambda$-1818133930$1
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
                ComposerKt.traceEventStart(-1818133930, i, -1, "com.robinhood.android.dashboard.lib.buyingpower.ComposableSingletons$PortfolioBuyingPowerRowKt.lambda$-1818133930.<anonymous> (PortfolioBuyingPowerRow.kt:26)");
            }
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "Buying power", null, null, new BentoBaseRowState.Meta.SingleLine("$X,XXX.XX"), null, false, false, false, 0L, null, composer, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12583296, 0, 3931);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1818133930$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13192getLambda$1818133930$lib_account_home_externalDebug() {
        return f8864lambda$1818133930;
    }
}
