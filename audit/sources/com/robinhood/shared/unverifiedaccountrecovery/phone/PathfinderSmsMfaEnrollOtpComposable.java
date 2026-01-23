package com.robinhood.shared.unverifiedaccountrecovery.phone;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.pathfinder.input.FlowState;
import com.robinhood.models.p355ui.pathfinder.contexts.SmsMfaEnrollOtpContext;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;
import com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathfinderSmsMfaEnrollOtpComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"PathfinderSmsMfaEnrollOtpComposable", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollOtpContext;", "inputState", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "onRetrySendInput", "Lkotlin/Function1;", "Lcom/robinhood/models/api/pathfinder/input/FlowState;", "onClickContinue", "Lkotlin/Function0;", "onClickTryAgain", "onClickContactSupport", "(Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollOtpContext;Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SuccessDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UpdateFailedDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-unverified-account-recovery_externalDebug", "showSuccessDialog", "", "showUpdateFailedDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PathfinderSmsMfaEnrollOtpComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSmsMfaEnrollOtpComposable$lambda$14(SmsMfaEnrollOtpContext smsMfaEnrollOtpContext, PathfinderSmsMfaEnrollOtpViewState.InputState inputState, Function1 function1, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        PathfinderSmsMfaEnrollOtpComposable(smsMfaEnrollOtpContext, inputState, function1, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessDialog$lambda$15(Function0 function0, int i, Composer composer, int i2) {
        SuccessDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateFailedDialog$lambda$16(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        UpdateFailedDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PathfinderSmsMfaEnrollOtpComposable(final SmsMfaEnrollOtpContext context, final PathfinderSmsMfaEnrollOtpViewState.InputState inputState, final Function1<? super FlowState, Unit> onRetrySendInput, final Function0<Unit> onClickContinue, final Function0<Unit> onClickTryAgain, final Function0<Unit> onClickContactSupport, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(onRetrySendInput, "onRetrySendInput");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Intrinsics.checkNotNullParameter(onClickTryAgain, "onClickTryAgain");
        Intrinsics.checkNotNullParameter(onClickContactSupport, "onClickContactSupport");
        Composer composerStartRestartGroup = composer.startRestartGroup(-906634434);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(inputState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRetrySendInput) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickTryAgain) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContactSupport) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-906634434, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposable (PathfinderSmsMfaEnrollOtpComposable.kt:25)");
            }
            if (inputState instanceof PathfinderSmsMfaEnrollOtpViewState.InputState.SendFailed) {
                composerStartRestartGroup.startReplaceGroup(1503308313);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PathfinderSmsMfaEnrollOtpComposable.PathfinderSmsMfaEnrollOtpComposable$lambda$1$lambda$0(onRetrySendInput, inputState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                if (inputState instanceof PathfinderSmsMfaEnrollOtpViewState.InputState.Sending) {
                    composer2.startReplaceGroup(1503493228);
                    LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composer2, 0, 3);
                    composer2.endReplaceGroup();
                } else if (context.getSuccess()) {
                    composer2.startReplaceGroup(1503584120);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                    composer2.endReplaceGroup();
                    if (PathfinderSmsMfaEnrollOtpComposable$lambda$3(snapshotState)) {
                        composer2.startReplaceGroup(-1633490746);
                        boolean z2 = (i2 & 7168) == 2048;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (z2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PathfinderSmsMfaEnrollOtpComposable.PathfinderSmsMfaEnrollOtpComposable$lambda$6$lambda$5(onClickContinue, snapshotState);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        SuccessDialog((Function0) objRememberedValue3, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                } else if (context.getUpdateFailed()) {
                    composer2.startReplaceGroup(1503891826);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
                    composer2.endReplaceGroup();
                    if (PathfinderSmsMfaEnrollOtpComposable$lambda$8(snapshotState2)) {
                        composer2.startReplaceGroup(-1633490746);
                        boolean z3 = (57344 & i2) == 16384;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (z3 || objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PathfinderSmsMfaEnrollOtpComposable.PathfinderSmsMfaEnrollOtpComposable$lambda$11$lambda$10(onClickTryAgain, snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        Function0 function0 = (Function0) objRememberedValue5;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        boolean z4 = (i2 & 458752) == 131072;
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (z4 || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PathfinderSmsMfaEnrollOtpComposable.PathfinderSmsMfaEnrollOtpComposable$lambda$13$lambda$12(onClickContactSupport, snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        UpdateFailedDialog(function0, (Function0) objRememberedValue6, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1504407108);
                    composer2.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSmsMfaEnrollOtpComposable.PathfinderSmsMfaEnrollOtpComposable$lambda$14(context, inputState, onRetrySendInput, onClickContinue, onClickTryAgain, onClickContactSupport, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSmsMfaEnrollOtpComposable$lambda$1$lambda$0(Function1 function1, PathfinderSmsMfaEnrollOtpViewState.InputState inputState) {
        function1.invoke(((PathfinderSmsMfaEnrollOtpViewState.InputState.SendFailed) inputState).getFlowState());
        return Unit.INSTANCE;
    }

    private static final void PathfinderSmsMfaEnrollOtpComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSmsMfaEnrollOtpComposable$lambda$6$lambda$5(Function0 function0, SnapshotState snapshotState) {
        PathfinderSmsMfaEnrollOtpComposable$lambda$4(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void PathfinderSmsMfaEnrollOtpComposable$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSmsMfaEnrollOtpComposable$lambda$11$lambda$10(Function0 function0, SnapshotState snapshotState) {
        PathfinderSmsMfaEnrollOtpComposable$lambda$9(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSmsMfaEnrollOtpComposable$lambda$13$lambda$12(Function0 function0, SnapshotState snapshotState) {
        PathfinderSmsMfaEnrollOtpComposable$lambda$9(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void SuccessDialog(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482017602);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482017602, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.SuccessDialog (PathfinderSmsMfaEnrollOtpComposable.kt:66)");
            }
            function02 = function0;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C41128R.string.pathfinder_sms_mfa_enroll_otp_success_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C41128R.string.pathfinder_sms_mfa_enroll_otp_success_body, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composerStartRestartGroup, 0), function0), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSmsMfaEnrollOtpComposable.SuccessDialog$lambda$15(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void UpdateFailedDialog(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-287747831);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287747831, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.UpdateFailedDialog (PathfinderSmsMfaEnrollOtpComposable.kt:76)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C41128R.string.pathfinder_sms_mfa_enroll_otp_update_failed_title, composerStartRestartGroup, 0);
            int i3 = i2;
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C41128R.string.pathfinder_sms_mfa_enroll_otp_update_failed_body, composerStartRestartGroup, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C41128R.string.pathfinder_sms_mfa_enroll_otp_update_failed_try_again, composerStartRestartGroup, 0), function0);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C41128R.string.pathfinder_sms_mfa_enroll_otp_update_failed_support, composerStartRestartGroup, 0), function02);
            int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12) | ((i3 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSmsMfaEnrollOtpComposable.UpdateFailedDialog$lambda$16(function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean PathfinderSmsMfaEnrollOtpComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean PathfinderSmsMfaEnrollOtpComposable$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
