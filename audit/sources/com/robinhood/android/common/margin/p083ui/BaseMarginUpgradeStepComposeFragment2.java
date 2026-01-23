package com.robinhood.android.common.margin.p083ui;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BaseMarginUpgradeStepComposeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.ComposableSingletons$BaseMarginUpgradeStepComposeFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BaseMarginUpgradeStepComposeFragment2 {
    public static final BaseMarginUpgradeStepComposeFragment2 INSTANCE = new BaseMarginUpgradeStepComposeFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1235124860 = ComposableLambda3.composableLambdaInstance(1235124860, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.margin.ui.ComposableSingletons$BaseMarginUpgradeStepComposeFragmentKt$lambda$1235124860$1
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
                ComposerKt.traceEventStart(1235124860, i, -1, "com.robinhood.android.common.margin.ui.ComposableSingletons$BaseMarginUpgradeStepComposeFragmentKt.lambda$1235124860.<anonymous> (BaseMarginUpgradeStepComposeFragment.kt:56)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11223R.string.margin_investing_toolbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1235124860$feature_lib_margin_externalDebug() {
        return lambda$1235124860;
    }
}
