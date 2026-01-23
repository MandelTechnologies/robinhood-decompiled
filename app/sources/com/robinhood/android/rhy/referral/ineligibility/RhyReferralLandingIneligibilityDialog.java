package com.robinhood.android.rhy.referral.ineligibility;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.rhy.referral.p345db.RhyReferralIneligibilityData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralLandingIneligibilityDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RhyReferralLandingIneligibilityDialog", "", "ineligibilityData", "Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.ineligibility.RhyReferralLandingIneligibilityDialogKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralLandingIneligibilityDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralLandingIneligibilityDialog$lambda$0(RhyReferralIneligibilityData rhyReferralIneligibilityData, Function0 function0, int i, Composer composer, int i2) {
        RhyReferralLandingIneligibilityDialog(rhyReferralIneligibilityData, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RhyReferralLandingIneligibilityDialog(final RhyReferralIneligibilityData ineligibilityData, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ineligibilityData, "ineligibilityData");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1784920596);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(ineligibilityData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1784920596, i2, -1, "com.robinhood.android.rhy.referral.ineligibility.RhyReferralLandingIneligibilityDialog (RhyReferralLandingIneligibilityDialog.kt:21)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(505217769, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.ineligibility.RhyReferralLandingIneligibilityDialogKt.RhyReferralLandingIneligibilityDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(505217769, i3, -1, "com.robinhood.android.rhy.referral.ineligibility.RhyReferralLandingIneligibilityDialog.<anonymous> (RhyReferralLandingIneligibilityDialog.kt:23)");
                    }
                    BentoAlertDialog.BentoAlertDialog(ineligibilityData.getTitle(), new BentoAlertDialog2.Body.Text(ineligibilityData.getBody()), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0), onDismiss), null, null, ServerToBentoAssetMapper3.WARNING, false, null, onDismiss, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | 196608 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.ineligibility.RhyReferralLandingIneligibilityDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralLandingIneligibilityDialog.RhyReferralLandingIneligibilityDialog$lambda$0(ineligibilityData, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
