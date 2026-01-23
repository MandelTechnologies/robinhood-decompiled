package com.robinhood.android.rhy.referral.welcome;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralOnboardingActionDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"RhyReferralOnboardingActionDialog", "", "dialog", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "onPrimaryCta", "Lkotlin/Function0;", "onSecondaryCta", "(Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialogKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralOnboardingActionDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralOnboardingActionDialog$lambda$0(RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        RhyReferralOnboardingActionDialog(dialogContent, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralOnboardingActionDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialogKt$RhyReferralOnboardingActionDialog$1 */
    static final class C275491 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RhyReferralOnboardingStore4.Dialog.DialogContent $dialog;
        final /* synthetic */ Function0<Unit> $onPrimaryCta;
        final /* synthetic */ Function0<Unit> $onSecondaryCta;

        C275491(RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent, Function0<Unit> function0, Function0<Unit> function02) {
            this.$dialog = dialogContent;
            this.$onPrimaryCta = function0;
            this.$onSecondaryCta = function02;
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
                ComposerKt.traceEventStart(1316323018, i, -1, "com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialog.<anonymous> (RhyReferralOnboardingActionDialog.kt:18)");
            }
            String strStringResource = StringResources_androidKt.stringResource(this.$dialog.getTitleRes(), composer, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(this.$dialog.getBodyRes(), composer, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(this.$dialog.getPrimaryCtaRes(), composer, 0), this.$onPrimaryCta);
            Integer secondaryCtaRes = this.$dialog.getSecondaryCtaRes();
            composer.startReplaceGroup(-2028920329);
            BentoAlertButton bentoAlertButton2 = secondaryCtaRes == null ? null : new BentoAlertButton(StringResources_androidKt.stringResource(secondaryCtaRes.intValue(), composer, 0), this.$onSecondaryCta);
            composer.endReplaceGroup();
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = this.$dialog.getShowWarningPictogram() ? ServerToBentoAssetMapper3.WARNING : null;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialogKt$RhyReferralOnboardingActionDialog$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            int i2 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
            int i3 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, serverToBentoAssetMapper3, false, null, function0, composer, i2 | (i3 << 6) | (i3 << 12), 200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void RhyReferralOnboardingActionDialog(final RhyReferralOnboardingStore4.Dialog.DialogContent dialog, final Function0<Unit> onPrimaryCta, final Function0<Unit> onSecondaryCta, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(onPrimaryCta, "onPrimaryCta");
        Intrinsics.checkNotNullParameter(onSecondaryCta, "onSecondaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(179378559);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryCta) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryCta) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(179378559, i2, -1, "com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialog (RhyReferralOnboardingActionDialog.kt:16)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1316323018, true, new C275491(dialog, onPrimaryCta, onSecondaryCta), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.RhyReferralOnboardingActionDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralOnboardingActionDialog.RhyReferralOnboardingActionDialog$lambda$0(dialog, onPrimaryCta, onSecondaryCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
