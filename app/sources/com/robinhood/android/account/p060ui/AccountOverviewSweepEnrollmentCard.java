package com.robinhood.android.account.p060ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.SweepSectionState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.rosetta.eventlogging.Component;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountOverviewSweepEnrollmentCard.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0013\u001a'\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u0016\u001a\u00020\u001cX\u008a\u008e\u0002"}, m3636d2 = {"SWEEP_SECTION_TITLE_TEST_TAG", "", "SWEEP_SECTION_SUMMARY_TEST_TAG", "SWEEP_SECTION_ROWS_TEST_TAG", "SWEEP_SECTION_INTEREST_EARNED_ROW_TEST_TAG", "SWEEP_SECTION_SHOW_DIALOG_TEST_TAG", "SWEEP_SECTION_DIALOG_TEST_TAG", "SWEEP_SECTION_CTA_TEST_TAG", "SweepSectionTitle", "", "state", "Lcom/robinhood/android/account/ui/SweepSectionState$MainText;", "callbacks", "Lcom/robinhood/android/account/ui/SweepSectionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/account/ui/SweepSectionState$MainText;Lcom/robinhood/android/account/ui/SweepSectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SweepSectionSummary", "Lcom/robinhood/android/account/ui/SweepSectionState;", "(Lcom/robinhood/android/account/ui/SweepSectionState;Lcom/robinhood/android/account/ui/SweepSectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SweepSectionRows", "Lcom/robinhood/android/account/ui/SweepSectionState$RowsState;", "showDialog", "Lkotlin/Function0;", "(Lcom/robinhood/android/account/ui/SweepSectionState$RowsState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SweepSectionCta", "SweepSection", "feature-account-overview_externalRelease", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountOverviewSweepEnrollmentCard {
    public static final String SWEEP_SECTION_CTA_TEST_TAG = "sweep_section_cta";
    public static final String SWEEP_SECTION_DIALOG_TEST_TAG = "sweep_section_dialog";
    public static final String SWEEP_SECTION_INTEREST_EARNED_ROW_TEST_TAG = "sweep_section_interest_earned_row";
    public static final String SWEEP_SECTION_ROWS_TEST_TAG = "sweep_section_rows";
    public static final String SWEEP_SECTION_SHOW_DIALOG_TEST_TAG = "sweep_section_show_dialog";
    public static final String SWEEP_SECTION_SUMMARY_TEST_TAG = "sweep_section_summary";
    public static final String SWEEP_SECTION_TITLE_TEST_TAG = "sweep_section_title";

    /* compiled from: AccountOverviewSweepEnrollmentCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SweepSectionState.SweepState.values().length];
            try {
                iArr[SweepSectionState.SweepState.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SweepSectionState.SweepState.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SweepSectionState.SweepState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSection$lambda$31(SweepSectionState accountOverviewSweepEnrollmentCard3, AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SweepSection(accountOverviewSweepEnrollmentCard3, accountOverviewSweepEnrollmentCard2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionCta$lambda$17(SweepSectionState accountOverviewSweepEnrollmentCard3, AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SweepSectionCta(accountOverviewSweepEnrollmentCard3, accountOverviewSweepEnrollmentCard2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionRows$lambda$9(SweepSectionState.RowsState rowsState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        SweepSectionRows(rowsState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionSummary$lambda$5(SweepSectionState accountOverviewSweepEnrollmentCard3, AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SweepSectionSummary(accountOverviewSweepEnrollmentCard3, accountOverviewSweepEnrollmentCard2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionTitle$lambda$2(SweepSectionState.MainText mainText, AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SweepSectionTitle(mainText, accountOverviewSweepEnrollmentCard2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean SweepSection$lambda$30$lambda$19(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SweepSectionTitle(final SweepSectionState.MainText mainText, final AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifierM4893clickableXHw0xAI$default;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1933656238);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(mainText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountOverviewSweepEnrollmentCard2) : composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1933656238, i3, -1, "com.robinhood.android.account.ui.SweepSectionTitle (AccountOverviewSweepEnrollmentCard.kt:218)");
                }
                String strStringResource = StringResources_androidKt.stringResource(mainText.getRes(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1477204127);
                if (!mainText.getClickable()) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2))) | composerStartRestartGroup.changedInstance(mainText);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewSweepEnrollmentCard.SweepSectionTitle$lambda$1$lambda$0(accountOverviewSweepEnrollmentCard2, mainText);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                } else {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = modifier4.then(modifierM4893clickableXHw0xAI$default);
                String strStringResource2 = StringResources_androidKt.stringResource(C8159R.string.account_overview_cash_sweep_program_label, composerStartRestartGroup, 0);
                BentoIcon4 drawableEndRes = mainText.getDrawableEndRes();
                composerStartRestartGroup.startReplaceGroup(1477222064);
                String strStringResource3 = mainText.getDrawableEndRes() == null ? StringResources_androidKt.stringResource(C8159R.string.cd_swept_cash_info_icon, new Object[]{strStringResource}, composerStartRestartGroup, 0) : null;
                composerStartRestartGroup.endReplaceGroup();
                AccountOverviewComponents.AccountOverviewSectionTitle(modifierThen, strStringResource2, strStringResource, drawableEndRes, strStringResource3, composerStartRestartGroup, BentoIcon4.$stable << 9, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountOverviewSweepEnrollmentCard.SweepSectionTitle$lambda$2(mainText, accountOverviewSweepEnrollmentCard2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String strStringResource4 = StringResources_androidKt.stringResource(mainText.getRes(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1477204127);
            if (!mainText.getClickable()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen2 = modifier4.then(modifierM4893clickableXHw0xAI$default);
            String strStringResource22 = StringResources_androidKt.stringResource(C8159R.string.account_overview_cash_sweep_program_label, composerStartRestartGroup, 0);
            BentoIcon4 drawableEndRes2 = mainText.getDrawableEndRes();
            composerStartRestartGroup.startReplaceGroup(1477222064);
            String strStringResource32 = mainText.getDrawableEndRes() == null ? StringResources_androidKt.stringResource(C8159R.string.cd_swept_cash_info_icon, new Object[]{strStringResource4}, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            AccountOverviewComponents.AccountOverviewSectionTitle(modifierThen2, strStringResource22, strStringResource4, drawableEndRes2, strStringResource32, composerStartRestartGroup, BentoIcon4.$stable << 9, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionTitle$lambda$1$lambda$0(AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, SweepSectionState.MainText mainText) {
        accountOverviewSweepEnrollmentCard2.onPausedInfoClick(mainText.getEnrollmentData(), mainText.isInLeveredMarginRegionGate());
        return Unit.INSTANCE;
    }

    private static final void SweepSectionSummary(final SweepSectionState accountOverviewSweepEnrollmentCard3, final AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-74120892);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountOverviewSweepEnrollmentCard2) : composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-74120892, i3, -1, "com.robinhood.android.account.ui.SweepSectionSummary (AccountOverviewSweepEnrollmentCard.kt:249)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String detailText = accountOverviewSweepEnrollmentCard3.getDetailText(resources);
            if (accountOverviewSweepEnrollmentCard3.getIsPausedDueToPdt()) {
                if (Intrinsics.areEqual(accountOverviewSweepEnrollmentCard3.getCountryCode(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    i4 = C8159R.string.account_overview_non_margin_sweep_paused_pdt_link;
                } else {
                    i4 = C8159R.string.account_overview_cash_sweep_paused_pdt_link;
                }
            } else {
                i4 = C11048R.string.general_action_learn_more;
            }
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard3);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2))) {
                z = true;
            }
            boolean z2 = zChangedInstance | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountOverviewSweepEnrollmentCard.SweepSectionSummary$lambda$4$lambda$3(accountOverviewSweepEnrollmentCard3, accountOverviewSweepEnrollmentCard2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountOverviewComponents.AccountOverviewSectionSummaryWithLink(modifier3, detailText, strStringResource, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewSweepEnrollmentCard.SweepSectionSummary$lambda$5(accountOverviewSweepEnrollmentCard3, accountOverviewSweepEnrollmentCard2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionSummary$lambda$4$lambda$3(SweepSectionState accountOverviewSweepEnrollmentCard3, AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2) {
        BigDecimal interestRate;
        if (accountOverviewSweepEnrollmentCard3.getIsPausedDueToPdt()) {
            accountOverviewSweepEnrollmentCard2.onSweepSwitchToCashAccountClicked(InstantCashUtils.getSwitchAccountSassyInputParams(accountOverviewSweepEnrollmentCard3.getAccount(), InstantCashConstants2.SOURCE_SWEEP_SECTION));
        } else {
            SweepsInterest sweepInterest = accountOverviewSweepEnrollmentCard3.getEnrollmentData().getSweepInterest();
            if (sweepInterest.getGoldInterestRate() != null) {
                interestRate = sweepInterest.getGoldInterestRate();
                Intrinsics.checkNotNull(interestRate);
            } else {
                interestRate = sweepInterest.getInterestRate();
            }
            accountOverviewSweepEnrollmentCard2.onSweepLearnMoreClicked(accountOverviewSweepEnrollmentCard3.getInterestEarningDisclosure(), interestRate);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SweepSectionRows(SweepSectionState.RowsState rowsState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        final SweepSectionState.RowsState rowsState2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final String strStringResource;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548730760);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            rowsState2 = rowsState;
        } else if ((i & 6) == 0) {
            rowsState2 = rowsState;
            i3 = (composerStartRestartGroup.changed(rowsState2) ? 4 : 2) | i;
        } else {
            rowsState2 = rowsState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1548730760, i3, -1, "com.robinhood.android.account.ui.SweepSectionRows (AccountOverviewSweepEnrollmentCard.kt:293)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i6 = C8159R.string.account_overview_card_annual_percentage_yield;
                AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, LocalityStringResources2.localityStringResource(i6, C8159R.string.account_overview_card_annual_equivalent_rate, i6, composerStartRestartGroup, 0), rowsState2.getApyText(), null, null, composerStartRestartGroup, 0, 25);
                String strStringResource2 = StringResources_androidKt.stringResource(C8159R.string.account_overview_card_swept_cash_balance, composerStartRestartGroup, 0);
                strStringResource = StringResources_androidKt.stringResource(C8159R.string.cd_swept_cash_balance_info_icon, new Object[]{strStringResource2}, composerStartRestartGroup, 0);
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(TestTag3.testTag(Modifier.INSTANCE, SWEEP_SECTION_SHOW_DIALOG_TEST_TAG), false, null, null, function02, 7, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountOverviewSweepEnrollmentCard.SweepSectionRows$lambda$8$lambda$7$lambda$6(strStringResource, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default, false, (Function1) objRememberedValue, 1, null), strStringResource2, rowsState2.getSweptCashText(), new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), composerStartRestartGroup, BentoIcon4.Size16.$stable << 9, 0);
                AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, StringResources_androidKt.stringResource(C8159R.string.account_overview_card_pending_interest, composerStartRestartGroup, 0), rowsState2.getPendingInterestText(), null, null, composerStartRestartGroup, 0, 25);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountOverviewSweepEnrollmentCard.SweepSectionRows$lambda$9(rowsState2, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Modifier modifier52 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                int i62 = C8159R.string.account_overview_card_annual_percentage_yield;
                AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, LocalityStringResources2.localityStringResource(i62, C8159R.string.account_overview_card_annual_equivalent_rate, i62, composerStartRestartGroup, 0), rowsState2.getApyText(), null, null, composerStartRestartGroup, 0, 25);
                String strStringResource22 = StringResources_androidKt.stringResource(C8159R.string.account_overview_card_swept_cash_balance, composerStartRestartGroup, 0);
                strStringResource = StringResources_androidKt.stringResource(C8159R.string.cd_swept_cash_balance_info_icon, new Object[]{strStringResource22}, composerStartRestartGroup, 0);
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(TestTag3.testTag(Modifier.INSTANCE, SWEEP_SECTION_SHOW_DIALOG_TEST_TAG), false, null, null, function02, 7, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountOverviewSweepEnrollmentCard.SweepSectionRows$lambda$8$lambda$7$lambda$6(strStringResource, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default2, false, (Function1) objRememberedValue, 1, null), strStringResource22, rowsState2.getSweptCashText(), new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), composerStartRestartGroup, BentoIcon4.Size16.$stable << 9, 0);
                    AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(null, StringResources_androidKt.stringResource(C8159R.string.account_overview_card_pending_interest, composerStartRestartGroup, 0), rowsState2.getPendingInterestText(), null, null, composerStartRestartGroup, 0, 25);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionRows$lambda$8$lambda$7$lambda$6(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SweepSectionCta(final SweepSectionState accountOverviewSweepEnrollmentCard3, final AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final SweepSectionState accountOverviewSweepEnrollmentCard32;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        int i5;
        String str;
        Object obj;
        float f;
        Modifier modifier5;
        ?? r1;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1259288402);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountOverviewSweepEnrollmentCard2) : composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1259288402, i3, -1, "com.robinhood.android.account.ui.SweepSectionCta (AccountOverviewSweepEnrollmentCard.kt:331)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[accountOverviewSweepEnrollmentCard3.getState$feature_account_overview_externalRelease().ordinal()];
                if (i4 != 1) {
                    accountOverviewSweepEnrollmentCard32 = accountOverviewSweepEnrollmentCard3;
                    int i7 = i3;
                    composerStartRestartGroup.startReplaceGroup(1078783265);
                    modifier3 = modifier6;
                    if (!accountOverviewSweepEnrollmentCard32.getAccount().isManaged()) {
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(modifier3, SWEEP_SECTION_CTA_TEST_TAG), 0.0f, composerStartRestartGroup, 0, 1);
                        String strStringResource = StringResources_androidKt.stringResource(C8159R.string.account_overview_cash_sweep_enable_cash_sweep, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard32) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2)));
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountOverviewSweepEnrollmentCard.SweepSectionCta$lambda$11$lambda$10(accountOverviewSweepEnrollmentCard2, accountOverviewSweepEnrollmentCard32);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AccountOverviewComponents.AccountOverviewSectionCta(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource, false, false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 12);
                    }
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else if (i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(1079380666);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier6, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1887348851);
                    if (accountOverviewSweepEnrollmentCard3.isMcwEnabled()) {
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM(), 1, null);
                        String strStringResource2 = StringResources_androidKt.stringResource(C8159R.string.account_overview_cash_sweep_view_cash_sweep, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2))) | composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard3);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountOverviewSweepEnrollmentCard.SweepSectionCta$lambda$16$lambda$13$lambda$12(accountOverviewSweepEnrollmentCard2, accountOverviewSweepEnrollmentCard3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier5 = modifier6;
                        f = 0.0f;
                        i5 = i3;
                        obj = null;
                        r1 = 1;
                        str = SWEEP_SECTION_CTA_TEST_TAG;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        i5 = i3;
                        str = SWEEP_SECTION_CTA_TEST_TAG;
                        obj = null;
                        f = 0.0f;
                        modifier5 = modifier6;
                        r1 = 1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1887365231);
                    if (accountOverviewSweepEnrollmentCard3.getAccount().isManaged()) {
                        accountOverviewSweepEnrollmentCard32 = accountOverviewSweepEnrollmentCard3;
                    } else {
                        Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, f, r1, obj), str);
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        String strStringResource3 = StringResources_androidKt.stringResource(C8159R.string.account_overview_cash_sweep_disable_cash_sweep, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        accountOverviewSweepEnrollmentCard32 = accountOverviewSweepEnrollmentCard3;
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard32) | (((i5 & 112) == 32 || ((i5 & 64) != 0 && composerStartRestartGroup.changedInstance(accountOverviewSweepEnrollmentCard2))) ? r1 : false);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountOverviewSweepEnrollmentCard.SweepSectionCta$lambda$16$lambda$15$lambda$14(accountOverviewSweepEnrollmentCard2, accountOverviewSweepEnrollmentCard32);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource3, modifierTestTag, null, type3, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                        composerStartRestartGroup = composer3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier5;
                } else {
                    if (i4 != 3) {
                        composerStartRestartGroup.startReplaceGroup(1004629965);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1080593169);
                    composerStartRestartGroup.endReplaceGroup();
                    accountOverviewSweepEnrollmentCard32 = accountOverviewSweepEnrollmentCard3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                accountOverviewSweepEnrollmentCard32 = accountOverviewSweepEnrollmentCard3;
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final SweepSectionState accountOverviewSweepEnrollmentCard33 = accountOverviewSweepEnrollmentCard32;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AccountOverviewSweepEnrollmentCard.SweepSectionCta$lambda$17(accountOverviewSweepEnrollmentCard33, accountOverviewSweepEnrollmentCard2, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[accountOverviewSweepEnrollmentCard3.getState$feature_account_overview_externalRelease().ordinal()];
            if (i4 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionCta$lambda$11$lambda$10(AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, SweepSectionState accountOverviewSweepEnrollmentCard3) {
        accountOverviewSweepEnrollmentCard2.onStartSweepEnrollmentClicked(accountOverviewSweepEnrollmentCard3.getAccount().getAccountNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionCta$lambda$16$lambda$13$lambda$12(AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, SweepSectionState accountOverviewSweepEnrollmentCard3) {
        accountOverviewSweepEnrollmentCard2.onClickViewCashSweep(accountOverviewSweepEnrollmentCard3.getAccount().getAccountNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSectionCta$lambda$16$lambda$15$lambda$14(AccountOverviewSweepEnrollmentCard2 accountOverviewSweepEnrollmentCard2, SweepSectionState accountOverviewSweepEnrollmentCard3) {
        accountOverviewSweepEnrollmentCard2.onDisableSweepClicked(accountOverviewSweepEnrollmentCard3.getAccount());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SweepSection(final SweepSectionState state, final AccountOverviewSweepEnrollmentCard2 callbacks, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion2;
        final SnapshotState snapshotState;
        Alignment.Companion companion3;
        Composer composer2;
        int i4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int i5;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-168769108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-168769108, i3, -1, "com.robinhood.android.account.ui.SweepSection (AccountOverviewSweepEnrollmentCard.kt:385)");
                }
                companion = Modifier.INSTANCE;
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-336521991);
                if (SweepSection$lambda$30$lambda$19(snapshotState)) {
                    companion3 = companion4;
                    composer2 = composerStartRestartGroup;
                    i4 = 0;
                } else {
                    companion3 = companion4;
                    Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(TestTag3.testTag(companion, SWEEP_SECTION_DIALOG_TEST_TAG), Component.ComponentType.SWEPT_CASH_BALANCE_EXPLANATION_DIALOG, "dialog_id_swept_cash_explanation", false, composerStartRestartGroup, 438, 4);
                    String strStringResource = StringResources_androidKt.stringResource(C8159R.string.swept_cash_explanation_dialog_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(state.isMcwEnabled() ? C8159R.string.mcw_swept_cash_explanation_dialog_message : C8159R.string.swept_cash_explanation_dialog_message, composerStartRestartGroup, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewSweepEnrollmentCard.SweepSection$lambda$30$lambda$22$lambda$21(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewSweepEnrollmentCard.SweepSection$lambda$30$lambda$24$lambda$23(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    i4 = 0;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, modifierAutoLogEvents, null, null, false, null, (Function0) objRememberedValue3, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                }
                composer2.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composerStartRestartGroup = composer2;
                Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier5, 0.0f, true, composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 1);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, i4);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ);
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, i4);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                i5 = i3 & 112;
                i6 = i3;
                int i8 = i4;
                SweepSectionTitle(state.getMainText$feature_account_overview_externalRelease(), callbacks, TestTag3.testTag(companion, SWEEP_SECTION_TITLE_TEST_TAG), composerStartRestartGroup, i5 | 384, 0);
                composerStartRestartGroup.startReplaceGroup(287283991);
                if (state.getAccount().isManaged() || state.getState$feature_account_overview_externalRelease() != SweepSectionState.SweepState.DISABLED) {
                    SweepSectionSummary(state, callbacks, TestTag3.testTag(companion, SWEEP_SECTION_SUMMARY_TEST_TAG), composerStartRestartGroup, (i6 & 14) | 384 | i5, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(24280781);
                if (!state.isMcwEnabled()) {
                    Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    SweepSectionState.RowsState rowsState$feature_account_overview_externalRelease = state.getRowsState$feature_account_overview_externalRelease(resources);
                    composerStartRestartGroup.startReplaceGroup(24283217);
                    if (rowsState$feature_account_overview_externalRelease != null) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountOverviewSweepEnrollmentCard.SweepSection$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SweepSectionRows(rowsState$feature_account_overview_externalRelease, (Function0) objRememberedValue4, TestTag3.testTag(companion, SWEEP_SECTION_ROWS_TEST_TAG), composerStartRestartGroup, 432, 0);
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (state.getShowTotalInterestEarnedRow()) {
                        AccountOverviewComponents.m10804AccountOverviewRowM8YrEPQ(TestTag3.testTag(companion, SWEEP_SECTION_INTEREST_EARNED_ROW_TEST_TAG), StringResources_androidKt.stringResource(C8159R.string.account_overview_card_total_interest_earned, composerStartRestartGroup, i8), state.getTotalInterestEarnedMetaText(), null, null, composerStartRestartGroup, 6, 24);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                SweepSectionCta(state, callbacks, null, composerStartRestartGroup, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewSweepEnrollmentCardKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountOverviewSweepEnrollmentCard.SweepSection$lambda$31(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            companion = Modifier.INSTANCE;
            Alignment.Companion companion42 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion52.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion52.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion52.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion52.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-336521991);
                if (SweepSection$lambda$30$lambda$19(snapshotState)) {
                }
                composer2.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composerStartRestartGroup = composer2;
                Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ2 = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier52, 0.0f, true, composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 1);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, i4);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ2);
                Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion52.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, i4);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    Function0<ComposeUiNode> constructor32 = companion52.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion52.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion52.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion52.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion52.getSetModifier());
                        i5 = i3 & 112;
                        i6 = i3;
                        int i82 = i4;
                        SweepSectionTitle(state.getMainText$feature_account_overview_externalRelease(), callbacks, TestTag3.testTag(companion, SWEEP_SECTION_TITLE_TEST_TAG), composerStartRestartGroup, i5 | 384, 0);
                        composerStartRestartGroup.startReplaceGroup(287283991);
                        if (state.getAccount().isManaged()) {
                            SweepSectionSummary(state, callbacks, TestTag3.testTag(companion, SWEEP_SECTION_SUMMARY_TEST_TAG), composerStartRestartGroup, (i6 & 14) | 384 | i5, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(24280781);
                            if (!state.isMcwEnabled()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SweepSectionCta(state, callbacks, null, composerStartRestartGroup, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SweepSection$lambda$30$lambda$20(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSection$lambda$30$lambda$22$lambda$21(SnapshotState snapshotState) {
        SweepSection$lambda$30$lambda$20(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSection$lambda$30$lambda$24$lambda$23(SnapshotState snapshotState) {
        SweepSection$lambda$30$lambda$20(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepSection$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26(SnapshotState snapshotState) {
        SweepSection$lambda$30$lambda$20(snapshotState, true);
        return Unit.INSTANCE;
    }
}
