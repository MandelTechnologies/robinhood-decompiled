package com.robinhood.android.gold.upgrade.legacy;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.theme.style.ButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.ComposableSingletons$LegacyGoldUpgradeLoadPlanFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeLoadPlanFragment2 {
    public static final LegacyGoldUpgradeLoadPlanFragment2 INSTANCE = new LegacyGoldUpgradeLoadPlanFragment2();

    /* renamed from: lambda$-1049053657, reason: not valid java name */
    private static Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> f9026lambda$1049053657 = ComposableLambda3.composableLambdaInstance(-1049053657, false, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.ComposableSingletons$LegacyGoldUpgradeLoadPlanFragmentKt$lambda$-1049053657$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer, Integer num) {
            invoke(row5, style, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoButton, ButtonStyle.Style unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if ((i & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1049053657, i, -1, "com.robinhood.android.gold.upgrade.legacy.ComposableSingletons$LegacyGoldUpgradeLoadPlanFragmentKt.lambda$-1049053657.<anonymous> (LegacyGoldUpgradeLoadPlanFragment.kt:116)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$540612644 = ComposableLambda3.composableLambdaInstance(540612644, false, LegacyGoldUpgradeLoadPlanFragment4.INSTANCE);

    /* renamed from: getLambda$-1049053657$feature_gold_upgrade_externalRelease, reason: not valid java name */
    public final Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> m15112getLambda$1049053657$feature_gold_upgrade_externalRelease() {
        return f9026lambda$1049053657;
    }

    public final Function2<Composer, Integer, Unit> getLambda$540612644$feature_gold_upgrade_externalRelease() {
        return lambda$540612644;
    }
}
