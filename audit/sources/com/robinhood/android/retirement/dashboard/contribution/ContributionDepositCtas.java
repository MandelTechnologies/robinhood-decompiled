package com.robinhood.android.retirement.dashboard.contribution;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.advisory.dashboard.deposit.DepositCtaBlock;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionSummary;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.dashboard.C26985R;
import com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardViewState;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.RecurringDepositsListKey;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.math.BigDecimals7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContributionDepositCtas.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m3636d2 = {"hasMaxedOutForYear", "", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionSummary;", "getHasMaxedOutForYear", "(Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionSummary;)Z", "ContributionDepositCtas", "", "state", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionDepositCtas {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionDepositCtas$lambda$6(ContributionSummaryCardViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionDepositCtas(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final boolean getHasMaxedOutForYear(RetirementCombinedContributionSummary retirementCombinedContributionSummary) {
        Intrinsics.checkNotNullParameter(retirementCombinedContributionSummary, "<this>");
        return BigDecimals7.isZero(retirementCombinedContributionSummary.getUntilMax().getAmount());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionDepositCtas(final ContributionSummaryCardViewState.Loaded state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final Navigator navigator;
        final Context context;
        final RetirementCombinedContributionSummary summary;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-621747241);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-621747241, i3, -1, "com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtas (ContributionDepositCtas.kt:27)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                summary = state.getViewModel().getSummary();
                if (summary == null && getHasMaxedOutForYear(summary)) {
                    composerStartRestartGroup.startReplaceGroup(1722220146);
                    final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                    String strStringResource = StringResources_androidKt.stringResource(C26985R.string.retirement_recurring_contribution_maxed_out_info, composerStartRestartGroup, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(sduiActionHandlerCurrentActionHandler) | composerStartRestartGroup.changedInstance(summary);
                    int i6 = i3;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContributionDepositCtas.ContributionDepositCtas$lambda$1$lambda$0(sduiActionHandlerCurrentActionHandler, summary);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue3, modifier4, jM21426getFg20d7_KjU, jM21425getFg0d7_KjU, textM, 0, composer2, (i6 << 6) & 7168, 128);
                    modifier3 = modifier4;
                    composer2.endReplaceGroup();
                } else {
                    int i7 = i3;
                    composerStartRestartGroup.startReplaceGroup(1722838751);
                    String strStringResource3 = StringResources_androidKt.stringResource(C26985R.string.retirement_one_time_contribution, composerStartRestartGroup, 0);
                    String strStringResource4 = StringResources_androidKt.stringResource(C26985R.string.retirement_recurring_contribution, composerStartRestartGroup, 0);
                    String accountNumber = state.getAccountNumber();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContributionDepositCtas.ContributionDepositCtas$lambda$3$lambda$2(navigator, context, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContributionDepositCtas.ContributionDepositCtas$lambda$5$lambda$4(navigator, context, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    DepositCtaBlock.DepositCtaBlock(accountNumber, strStringResource3, strStringResource4, "one_time_contribution", "recurring_contribution", true, function0, (Function0) objRememberedValue2, modifier3, composerStartRestartGroup, ((i7 << 21) & 234881024) | 224256, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionDepositCtas.ContributionDepositCtas$lambda$6(state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            summary = state.getViewModel().getSummary();
            if (summary == null) {
                int i72 = i3;
                composerStartRestartGroup.startReplaceGroup(1722838751);
                String strStringResource32 = StringResources_androidKt.stringResource(C26985R.string.retirement_one_time_contribution, composerStartRestartGroup, 0);
                String strStringResource42 = StringResources_androidKt.stringResource(C26985R.string.retirement_recurring_contribution, composerStartRestartGroup, 0);
                String accountNumber2 = state.getAccountNumber();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionDepositCtas.ContributionDepositCtas$lambda$3$lambda$2(navigator, context, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionDepositCtasKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContributionDepositCtas.ContributionDepositCtas$lambda$5$lambda$4(navigator, context, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        DepositCtaBlock.DepositCtaBlock(accountNumber2, strStringResource32, strStringResource42, "one_time_contribution", "recurring_contribution", true, function02, (Function0) objRememberedValue2, modifier3, composerStartRestartGroup, ((i72 << 21) & 234881024) | 224256, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionDepositCtas$lambda$1$lambda$0(SduiActionHandler sduiActionHandler, RetirementCombinedContributionSummary retirementCombinedContributionSummary) {
        sduiActionHandler.mo15941handle(new GenericAction.InfoAlert(retirementCombinedContributionSummary.getUntilMaxAction()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionDepositCtas$lambda$3$lambda$2(Navigator navigator, Context context, ContributionSummaryCardViewState.Loaded loaded) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CreateRetirementContribution(null, loaded.getAccountNumber(), null, false, false, MAXTransferContext.EntryPoint.RETIREMENT_FUNDED_DASHBOARD, 29, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionDepositCtas$lambda$5$lambda$4(Navigator navigator, Context context, ContributionSummaryCardViewState.Loaded loaded) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new RecurringDepositsListKey(loaded.getAccountNumber(), null, 2, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
