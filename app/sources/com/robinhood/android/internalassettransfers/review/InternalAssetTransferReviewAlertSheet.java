package com.robinhood.android.internalassettransfers.review;

import android.app.Activity;
import android.content.Context;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.LocalActivity;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionCheckAlertSheets2;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferReviewAlertSheet.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"PresubmitAlertSheet", "", "presubmitAlertsWrapper", "Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;", "onContinue", "Lkotlin/Function0;", "onTryAgain", "onEditTransfer", "(Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-internal-asset-transfers_externalDebug", "currentAlertIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferReviewAlertSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PresubmitAlertSheet$lambda$11(PresubmitAlertsWrapper presubmitAlertsWrapper, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        PresubmitAlertSheet(presubmitAlertsWrapper, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PresubmitAlertSheet(final PresubmitAlertsWrapper presubmitAlertsWrapper, final Function0<Unit> onContinue, final Function0<Unit> onTryAgain, final Function0<Unit> onEditTransfer, Composer composer, final int i) {
        int i2;
        final SnapshotIntState2 snapshotIntState2;
        int i3;
        Intrinsics.checkNotNullParameter(presubmitAlertsWrapper, "presubmitAlertsWrapper");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onTryAgain, "onTryAgain");
        Intrinsics.checkNotNullParameter(onEditTransfer, "onEditTransfer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1278821923);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(presubmitAlertsWrapper) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTryAgain) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEditTransfer) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278821923, i2, -1, "com.robinhood.android.internalassettransfers.review.PresubmitAlertSheet (InternalAssetTransferReviewAlertSheet.kt:27)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Activity activity = (Activity) composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InternalAssetTransferReviewAlertSheet2(sheetStateRememberModalBottomSheetState, snapshotIntState22, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(presubmitAlertsWrapper, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            final List<PresubmissionChecksAlertSheet> alerts = presubmitAlertsWrapper.getAlerts();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(alerts) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(activity);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                snapshotIntState2 = snapshotIntState22;
                i3 = -1633490746;
                Function2 function2 = new Function2() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferReviewAlertSheet.PresubmitAlertSheet$lambda$10$lambda$7$lambda$6(alerts, onContinue, onTryAgain, navigator, context, activity, snapshotIntState2, onEditTransfer, (RhModalBottomSheet5) obj, (PresubmissionCheckAlertSheets2) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function2);
                objRememberedValue3 = function2;
            } else {
                snapshotIntState2 = snapshotIntState22;
                i3 = -1633490746;
            }
            Function2 function22 = (Function2) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            PresubmissionChecksAlertSheet presubmissionChecksAlertSheet = (PresubmissionChecksAlertSheet) CollectionsKt.getOrNull(alerts, snapshotIntState2.getIntValue());
            composerStartRestartGroup.startReplaceGroup(-587151125);
            if (presubmissionChecksAlertSheet != null) {
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(presubmitAlertsWrapper);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferReviewAlertSheet.PresubmitAlertSheet$lambda$10$lambda$9$lambda$8(presubmitAlertsWrapper, snapshotIntState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1352456329, true, new InternalAssetTransferReviewAlertSheet3(presubmissionChecksAlertSheet, function22), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 62);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferReviewAlertSheet.PresubmitAlertSheet$lambda$11(presubmitAlertsWrapper, onContinue, onTryAgain, onEditTransfer, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PresubmitAlertSheet$lambda$10$lambda$7$lambda$6(List list, Function0 function0, Function0 function02, Navigator navigator, Context context, Activity activity, SnapshotIntState2 snapshotIntState2, final Function0 function03, RhModalBottomSheet5 rhModalBottomSheet5, PresubmissionCheckAlertSheets2 action) {
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof PresubmissionCheckAlertSheets2.ContinueTransfer)) {
            if ((action instanceof PresubmissionCheckAlertSheets2.Close) || (action instanceof PresubmissionCheckAlertSheets2.GoBack)) {
                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            } else if (action instanceof PresubmissionCheckAlertSheets2.TryAgain) {
                function02.invoke();
            } else if (action instanceof PresubmissionCheckAlertSheets2.NavigateToTransferSelection) {
                rhModalBottomSheet5.hideBottomSheet(new Function0() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferReviewAlertSheet.PresubmitAlertSheet$lambda$10$lambda$7$lambda$6$lambda$4(function03);
                    }
                });
            } else if (action instanceof PresubmissionCheckAlertSheets2.Navigate) {
                Navigator.DefaultImpls.showFragment$default(navigator, context, ((PresubmissionCheckAlertSheets2.Navigate) action).getKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
            } else {
                if (!(action instanceof PresubmissionCheckAlertSheets2.ExitFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (activity != null) {
                    activity.finish();
                }
                TabLinkIntentKey exitDestination = ((PresubmissionCheckAlertSheets2.ExitFlow) action).getExitDestination();
                if (exitDestination != null) {
                    Navigator.DefaultImpls.startActivity$default(navigator, context, exitDestination, null, false, null, null, 60, null);
                }
            }
        } else if (snapshotIntState2.getIntValue() == list.size() - 1) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            function0.invoke();
        } else {
            snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PresubmitAlertSheet$lambda$10$lambda$7$lambda$6$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PresubmitAlertSheet$lambda$10$lambda$9$lambda$8(PresubmitAlertsWrapper presubmitAlertsWrapper, SnapshotIntState2 snapshotIntState2) {
        snapshotIntState2.setIntValue(presubmitAlertsWrapper.getAlerts().size());
        return Unit.INSTANCE;
    }
}
