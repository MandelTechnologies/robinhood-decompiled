package com.robinhood.android.referral.rewardoffers.referralOffer;

import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SymmetricReferralPrepareInviteDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"ReferralInviteDialog", "", "preparationText", "", "cancelCta", "onCancel", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ReferralInviteDialogPreviewDay", "(Landroidx/compose/runtime/Composer;I)V", "ReferralInviteDialogPreviewNight", "ReferralInviteDialogPreviews", "isDay", "", "(ZLandroidx/compose/runtime/Composer;I)V", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SymmetricReferralPrepareInviteDialogFragment5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralInviteDialog$lambda$0(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        ReferralInviteDialog(str, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralInviteDialogPreviewDay$lambda$1(int i, Composer composer, int i2) {
        ReferralInviteDialogPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralInviteDialogPreviewNight$lambda$2(int i, Composer composer, int i2) {
        ReferralInviteDialogPreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralInviteDialogPreviews$lambda$3(boolean z, int i, Composer composer, int i2) {
        ReferralInviteDialogPreviews(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ReferralInviteDialog(final String preparationText, final String cancelCta, final Function0<Unit> onCancel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(preparationText, "preparationText");
        Intrinsics.checkNotNullParameter(cancelCta, "cancelCta");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1077489628);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(preparationText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cancelCta) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancel) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1077489628, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralInviteDialog (SymmetricReferralPrepareInviteDialogFragment.kt:51)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1677771441, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt.ReferralInviteDialog.1
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
                        ComposerKt.traceEventStart(1677771441, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralInviteDialog.<anonymous> (SymmetricReferralPrepareInviteDialogFragment.kt:53)");
                    }
                    final Function0<Unit> function0 = onCancel;
                    final String str = cancelCta;
                    final String str2 = preparationText;
                    AndroidDialog_androidKt.Dialog(function0, null, ComposableLambda3.rememberComposableLambda(1902830778, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt.ReferralInviteDialog.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1902830778, i4, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralInviteDialog.<anonymous>.<anonymous> (SymmetricReferralPrepareInviteDialogFragment.kt:56)");
                            }
                            BentoAlerts2.AlertContent(null, null, str2, null, CollectionsKt.listOf(new BentoAlertButton(str, function0, BentoButtons.Type.Secondary)), true, SymmetricReferralPrepareInviteDialogFragment2.INSTANCE.getLambda$2002553642$feature_referral_externalDebug(), composer3, (BentoAlertButton.$stable << 12) | 1769472, 11);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SymmetricReferralPrepareInviteDialogFragment5.ReferralInviteDialog$lambda$0(preparationText, cancelCta, onCancel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ReferralInviteDialogPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1540674696);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1540674696, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralInviteDialogPreviewDay (SymmetricReferralPrepareInviteDialogFragment.kt:82)");
            }
            ReferralInviteDialogPreviews(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SymmetricReferralPrepareInviteDialogFragment5.ReferralInviteDialogPreviewDay$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ReferralInviteDialogPreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1265202036);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1265202036, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralInviteDialogPreviewNight (SymmetricReferralPrepareInviteDialogFragment.kt:88)");
            }
            ReferralInviteDialogPreviews(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SymmetricReferralPrepareInviteDialogFragment5.ReferralInviteDialogPreviewNight$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ReferralInviteDialogPreviews(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1242154473);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1242154473, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ReferralInviteDialogPreviews (SymmetricReferralPrepareInviteDialogFragment.kt:93)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, SymmetricReferralPrepareInviteDialogFragment2.INSTANCE.getLambda$1585655647$feature_referral_externalDebug(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SymmetricReferralPrepareInviteDialogFragment5.ReferralInviteDialogPreviews$lambda$3(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
