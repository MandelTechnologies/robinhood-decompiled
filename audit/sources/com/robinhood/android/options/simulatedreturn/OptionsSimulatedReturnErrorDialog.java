package com.robinhood.android.options.simulatedreturn;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsSimulatedReturnErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"OptionsSimulatedReturnErrorDialog", "", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "isSingleLeg", "", "onNavigateBack", "Lkotlin/Function0;", "navigateToHome", "(Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnErrorDialog {

    /* compiled from: OptionsSimulatedReturnErrorDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedReturnErrorState.values().length];
            try {
                iArr[OptionsSimulatedReturnErrorState.POSITION_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedReturnErrorState.POSITION_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsSimulatedReturnErrorState.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionsSimulatedReturnErrorState.NULL_CHART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionsSimulatedReturnErrorState.INVALID_IV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnErrorDialog$lambda$8(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Boolean bool, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        OptionsSimulatedReturnErrorDialog(optionsSimulatedReturnErrorState, bool, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionsSimulatedReturnErrorDialog(final OptionsSimulatedReturnErrorState errorState, final Boolean bool, final Function0<Unit> onNavigateBack, final Function0<Unit> navigateToHome, Composer composer, final int i) {
        int i2;
        String strStringResource;
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(onNavigateBack, "onNavigateBack");
        Intrinsics.checkNotNullParameter(navigateToHome, "navigateToHome");
        Composer composerStartRestartGroup = composer.startRestartGroup(-789107971);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(errorState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNavigateBack) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navigateToHome) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-789107971, i2, -1, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialog (OptionsSimulatedReturnErrorDialog.kt:15)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[errorState.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(1876461099);
                String strStringResource2 = StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_position_expired_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_position_expired_message, composerStartRestartGroup, 0));
                BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_primary_button_text, composerStartRestartGroup, 0), navigateToHome);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource2, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(1876480937);
                String strStringResource3 = StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_position_closed_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_position_closed_message, composerStartRestartGroup, 0));
                BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_primary_button_text, composerStartRestartGroup, 0), onNavigateBack);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource3, text2, bentoAlertButton2, null, null, null, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 3 || i3 == 4) {
                composerStartRestartGroup.startReplaceGroup(1876502509);
                String strStringResource4 = StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_network_error_title, composerStartRestartGroup, 0);
                BentoAlertDialog2.Body.Text text3 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_network_error_message, composerStartRestartGroup, 0));
                BentoAlertButton bentoAlertButton3 = new BentoAlertButton(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_primary_button_text, composerStartRestartGroup, 0), onNavigateBack);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource4, text3, bentoAlertButton3, null, null, null, false, null, (Function0) objRememberedValue3, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 5) {
                    composerStartRestartGroup.startReplaceGroup(1876460725);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1876523432);
                String strStringResource5 = StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_null_iv_title, composerStartRestartGroup, 0);
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    composerStartRestartGroup.startReplaceGroup(-1957134617);
                    strStringResource = StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_single_leg_null_iv_message, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1957003704);
                    strStringResource = StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_multi_leg_null_iv_message, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoAlertDialog2.Body.Text text4 = new BentoAlertDialog2.Body.Text(strStringResource);
                BentoAlertButton bentoAlertButton4 = new BentoAlertButton(StringResources_androidKt.stringResource(C23755R.string.options_projected_return_edge_case_primary_button_text, composerStartRestartGroup, 0), onNavigateBack);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAlertDialog.BentoAlertDialog(strStringResource5, text4, bentoAlertButton4, null, null, null, false, null, (Function0) objRememberedValue4, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnErrorDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnErrorDialog.OptionsSimulatedReturnErrorDialog$lambda$8(errorState, bool, onNavigateBack, navigateToHome, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
