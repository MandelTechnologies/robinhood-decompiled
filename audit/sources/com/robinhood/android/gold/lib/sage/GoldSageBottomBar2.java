package com.robinhood.android.gold.lib.sage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldSageBottomBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageBottomBarKt$lambda$1285061559$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageBottomBar2 implements Function2<Composer, Integer, Unit> {
    public static final GoldSageBottomBar2 INSTANCE = new GoldSageBottomBar2();

    GoldSageBottomBar2() {
    }

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
            ComposerKt.traceEventStart(1285061559, i, -1, "com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageBottomBarKt.lambda$1285061559.<anonymous> (GoldSageBottomBar.kt:81)");
        }
        Icon icon = Icon.ICON_BANKING_16;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageBottomBarKt$lambda$1285061559$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.lib.sage.ComposableSingletons$GoldSageBottomBarKt$lambda$1285061559$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GoldSageBottomBar3.GoldSageBottomBar("Continue", function0, null, icon, "Something about Gold cost or free trial [with link]()", "No thanks", (Function0) objRememberedValue2, false, composer, 1797174, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
