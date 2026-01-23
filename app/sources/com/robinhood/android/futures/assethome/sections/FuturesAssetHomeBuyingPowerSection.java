package com.robinhood.android.futures.assethome.sections;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.assethome.C16973R;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAssetHomeBuyingPowerSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"FuturesAssetHomeBuyingPowerSection", "", "state", "Lcom/robinhood/android/futures/assethome/sections/FuturesBuyingPowerViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/assethome/sections/FuturesBuyingPowerViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeBuyingPowerSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeBuyingPowerSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeBuyingPowerSection$lambda$0(FuturesBuyingPowerViewState futuresBuyingPowerViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeBuyingPowerSection(futuresBuyingPowerViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void FuturesAssetHomeBuyingPowerSection(final FuturesBuyingPowerViewState futuresBuyingPowerViewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-667877271);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(futuresBuyingPowerViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-667877271, i3, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeBuyingPowerSection (FuturesAssetHomeBuyingPowerSection.kt:19)");
            }
            LocalShowPlaceholder.Loadable(futuresBuyingPowerViewState == null, modifier2, null, ComposableLambda3.rememberComposableLambda(-595074855, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeBuyingPowerSectionKt.FuturesAssetHomeBuyingPowerSection.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-595074855, i5, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeBuyingPowerSection.<anonymous> (FuturesAssetHomeBuyingPowerSection.kt:21)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_buying_power_label, composer2, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_margin_held_label, composer2, 0);
                    FuturesBuyingPowerViewState futuresBuyingPowerViewState2 = futuresBuyingPowerViewState;
                    String buyingPowerDisplay = futuresBuyingPowerViewState2 != null ? futuresBuyingPowerViewState2.getBuyingPowerDisplay() : null;
                    if (buyingPowerDisplay == null) {
                        buyingPowerDisplay = "";
                    }
                    FuturesBuyingPowerViewState futuresBuyingPowerViewState3 = futuresBuyingPowerViewState;
                    String marginWithheldDisplay = futuresBuyingPowerViewState3 != null ? futuresBuyingPowerViewState3.getMarginWithheldDisplay() : null;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource, strStringResource2, null, new BentoBaseRowState.Meta.TwoLine(buyingPowerDisplay, marginWithheldDisplay != null ? marginWithheldDisplay : ""), null, true, false, false, 0L, null, composer2, (BentoBaseRowState.Meta.TwoLine.$stable << 15) | 12582912, 0, 3923);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeBuyingPowerSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeBuyingPowerSection.FuturesAssetHomeBuyingPowerSection$lambda$0(futuresBuyingPowerViewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
