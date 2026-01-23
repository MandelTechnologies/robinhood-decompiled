package com.robinhood.android.dashboard.lib.buyingpower;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PortfolioBuyingPower.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.ComposableSingletons$PortfolioBuyingPowerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioBuyingPower2 {
    public static final PortfolioBuyingPower2 INSTANCE = new PortfolioBuyingPower2();
    private static Function2<Composer, Integer, Unit> lambda$295175956 = ComposableLambda3.composableLambdaInstance(295175956, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.buyingpower.ComposableSingletons$PortfolioBuyingPowerKt$lambda$295175956$1
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
                ComposerKt.traceEventStart(295175956, i, -1, "com.robinhood.android.dashboard.lib.buyingpower.ComposableSingletons$PortfolioBuyingPowerKt.lambda$295175956.<anonymous> (PortfolioBuyingPower.kt:165)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13691R.string.portfolio_buying_power_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$295175956$lib_account_home_externalDebug() {
        return lambda$295175956;
    }
}
