package com.robinhood.android.internalassettransfers.accountselection;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionEvent;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState3;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheet2;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.InternalAssetTransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aÜ\u0001\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000526\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u001f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\"\u001a{\u0010#\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000526\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001a\u0017\u0010%\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010&\u001am\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u000326\u0010*\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010.\u001a\u001b\u0010/\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u00100¨\u00061²\u0006\u0012\u00102\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\f\u00103\u001a\u0004\u0018\u000104X\u008a\u008e\u0002"}, m3636d2 = {"AccountSelectionComposable", "", "callbacks", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;", "onBackClicked", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSelectionScreen", "viewState", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "events", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;", "onAccountSelected", "Lkotlin/Function2;", "", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "refresh", "validateAccountPair", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "Lkotlin/ParameterName;", "name", "sourceIatAccount", "sinkIatAccount", "dismissErrorDialog", "handleAlertSheetAction", "Lkotlin/Function1;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "action", "(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;Lkotlinx/coroutines/flow/StateFlow;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSelectionScaffoldContent", "(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewAccountSelectionScreen", "(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;Landroidx/compose/runtime/Composer;I)V", "AccountSelectionLoaded", "state", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Loaded;", "onButtonClick", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "onErrorDialogDismiss", "(Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Loaded;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionCallbacks;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSelectionToolbar", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-internal-asset-transfers_externalDebug", "event", "bottomSheetData", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AlertSheetWarning;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AccountSelectionComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionComposable$lambda$5(AccountSelectionCallbacks accountSelectionCallbacks, Function0 function0, AccountSelectionDuxo accountSelectionDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectionComposable(accountSelectionCallbacks, function0, accountSelectionDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionLoaded$lambda$34(AccountSelectionViewState.Loaded loaded, AccountSelectionCallbacks accountSelectionCallbacks, Function2 function2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectionLoaded(loaded, accountSelectionCallbacks, function2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionScaffoldContent$lambda$18(AccountSelectionViewState accountSelectionViewState, AccountSelectionCallbacks accountSelectionCallbacks, Function0 function0, Function2 function2, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectionScaffoldContent(accountSelectionViewState, accountSelectionCallbacks, function0, function2, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionScreen$lambda$13(AccountSelectionViewState accountSelectionViewState, StateFlow stateFlow, AccountSelectionCallbacks accountSelectionCallbacks, Function0 function0, Function2 function2, Function0 function02, Function2 function22, Function0 function03, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectionScreen(accountSelectionViewState, stateFlow, accountSelectionCallbacks, function0, function2, function02, function22, function03, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionToolbar$lambda$35(Function0 function0, int i, Composer composer, int i2) {
        AccountSelectionToolbar(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAccountSelectionScreen$lambda$19(AccountSelectionViewState accountSelectionViewState, int i, Composer composer, int i2) {
        PreviewAccountSelectionScreen(accountSelectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final Event<AccountSelectionEvent> AccountSelectionScreen$lambda$7(SnapshotState4<Event<AccountSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectionEvent.AlertSheetWarning AccountSelectionScreen$lambda$9(SnapshotState<AccountSelectionEvent.AlertSheetWarning> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionComposable(final AccountSelectionCallbacks callbacks, final Function0<Unit> onBackClicked, final AccountSelectionDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        boolean zChangedInstance4;
        Object objRememberedValue4;
        boolean zChangedInstance5;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(757246469);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(757246469, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposable (AccountSelectionComposable.kt:94)");
                }
                AccountSelectionViewState accountSelectionViewState = (AccountSelectionViewState) FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
                int i5 = i3;
                StateFlow<Event<AccountSelectionEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AccountSelectionComposableKt$AccountSelectionComposable$1$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function2 function2 = (Function2) ((KFunction) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AccountSelectionComposableKt$AccountSelectionComposable$2$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AccountSelectionComposableKt$AccountSelectionComposable$3$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function2 function22 = (Function2) ((KFunction) objRememberedValue3);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new AccountSelectionComposableKt$AccountSelectionComposable$4$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new AccountSelectionComposableKt$AccountSelectionComposable$5$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                AccountSelectionScreen(accountSelectionViewState, eventFlow, callbacks, onBackClicked, function2, function0, function22, function02, (Function1) ((KFunction) objRememberedValue5), modifier4, composerStartRestartGroup, ((i5 << 18) & 1879048192) | ((i5 << 6) & 8064), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectionComposableKt.AccountSelectionComposable$lambda$5(callbacks, onBackClicked, duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AccountSelectionViewState accountSelectionViewState2 = (AccountSelectionViewState) FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            int i52 = i3;
            StateFlow<Event<AccountSelectionEvent>> eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new AccountSelectionComposableKt$AccountSelectionComposable$1$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Function2 function23 = (Function2) ((KFunction) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new AccountSelectionComposableKt$AccountSelectionComposable$2$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function03 = (Function0) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue3 = new AccountSelectionComposableKt$AccountSelectionComposable$3$1(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Function2 function222 = (Function2) ((KFunction) objRememberedValue3);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance4) {
                            objRememberedValue4 = new AccountSelectionComposableKt$AccountSelectionComposable$4$1(duxo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            Function0 function022 = (Function0) ((KFunction) objRememberedValue4);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance5) {
                                objRememberedValue5 = new AccountSelectionComposableKt$AccountSelectionComposable$5$1(duxo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier42 = modifier3;
                                AccountSelectionScreen(accountSelectionViewState2, eventFlow2, callbacks, onBackClicked, function23, function03, function222, function022, (Function1) ((KFunction) objRememberedValue5), modifier42, composerStartRestartGroup, ((i52 << 18) & 1879048192) | ((i52 << 6) & 8064), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier42;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectionScreen$lambda$10(SnapshotState<AccountSelectionEvent.AlertSheetWarning> snapshotState, AccountSelectionEvent.AlertSheetWarning alertSheetWarning) {
        snapshotState.setValue(alertSheetWarning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionScreen(final AccountSelectionViewState accountSelectionViewState, final StateFlow<Event<AccountSelectionEvent>> stateFlow, final AccountSelectionCallbacks accountSelectionCallbacks, final Function0<Unit> function0, final Function2<? super String, ? super AccountSelectionListFragment.AccountSelectionType, Unit> function2, final Function0<Unit> function02, final Function2<? super UiIatAccount, ? super UiIatAccount, Unit> function22, final Function0<Unit> function03, final Function1<? super AccountSelectionDuxo.AlertSheetAction, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        StateFlow<Event<AccountSelectionEvent>> stateFlow2;
        Function0<Unit> function04;
        Function1<? super AccountSelectionDuxo.AlertSheetAction, Unit> function12;
        int i4;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        final Event<AccountSelectionEvent> eventAccountSelectionScreen$lambda$7;
        final Event<AccountSelectionEvent> eventAccountSelectionScreen$lambda$72;
        Composer composer2;
        final Modifier modifier3;
        EventConsumer<AccountSelectionEvent> eventConsumerInvoke;
        EventConsumer<AccountSelectionEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-456655094);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountSelectionViewState) : composerStartRestartGroup.changedInstance(accountSelectionViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            stateFlow2 = stateFlow;
        } else {
            stateFlow2 = stateFlow;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(stateFlow2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(accountSelectionCallbacks) : composerStartRestartGroup.changedInstance(accountSelectionCallbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                function04 = function02;
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else {
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 100663296) == 0) {
                            function12 = function1;
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                        }
                        i4 = i2 & 512;
                        if (i4 != 0) {
                            i3 |= 805306368;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                            }
                        }
                        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-456655094, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionScreen (AccountSelectionComposable.kt:121)");
                            }
                            Unit unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            z = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(accountSelectionCallbacks))) | ((57344 & i3) != 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new AccountSelectionComposableKt$AccountSelectionScreen$1$1(accountSelectionCallbacks, function2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(stateFlow2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, (i3 >> 3) & 14, 7);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            eventAccountSelectionScreen$lambda$7 = AccountSelectionScreen$lambda$7(snapshotState4CollectAsStateWithLifecycle);
                            if (eventAccountSelectionScreen$lambda$7 != null && (eventAccountSelectionScreen$lambda$7.getData() instanceof AccountSelectionEvent.AccountsSelected) && (eventConsumerInvoke2 = eventAccountSelectionScreen$lambda$7.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(eventAccountSelectionScreen$lambda$7, new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m15374invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m15374invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AccountSelectionEvent.AccountsSelected accountsSelected = (AccountSelectionEvent.AccountsSelected) eventAccountSelectionScreen$lambda$7.getData();
                                        accountSelectionCallbacks.onAccountsSelected(accountsSelected.getSourceAccount(), accountsSelected.getSinkAccount(), accountsSelected.getEligibleAssets());
                                    }
                                });
                            }
                            eventAccountSelectionScreen$lambda$72 = AccountSelectionScreen$lambda$7(snapshotState4CollectAsStateWithLifecycle);
                            if (eventAccountSelectionScreen$lambda$72 != null && (eventAccountSelectionScreen$lambda$72.getData() instanceof AccountSelectionEvent.AlertSheetWarning) && (eventConsumerInvoke = eventAccountSelectionScreen$lambda$72.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(eventAccountSelectionScreen$lambda$72, new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m15375invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m15375invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AccountSelectionComposableKt.AccountSelectionScreen$lambda$10(snapshotState, (AccountSelectionEvent.AlertSheetWarning) eventAccountSelectionScreen$lambda$72.getData());
                                    }
                                });
                            }
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-901222194, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt.AccountSelectionScreen.4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i5) {
                                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-901222194, i5, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionScreen.<anonymous> (AccountSelectionComposable.kt:142)");
                                    }
                                    AccountSelectionComposableKt.AccountSelectionToolbar(function0, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier5 = modifier4;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1381112665, true, new C189925(accountSelectionViewState, accountSelectionCallbacks, function04, function22, function03, snapshotState, function12), composerStartRestartGroup, 54), composer2, ((i3 >> 27) & 14) | 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AccountSelectionComposableKt.AccountSelectionScreen$lambda$13(accountSelectionViewState, stateFlow, accountSelectionCallbacks, function0, function2, function02, function22, function03, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    function12 = function1;
                    i4 = i2 & 512;
                    if (i4 != 0) {
                    }
                    if ((i3 & 306783379) != 306783378) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((i3 & 896) != 256) {
                            z = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(accountSelectionCallbacks))) | ((57344 & i3) != 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue = new AccountSelectionComposableKt$AccountSelectionScreen$1$1(accountSelectionCallbacks, function2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(stateFlow2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, (i3 >> 3) & 14, 7);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                snapshotState = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                eventAccountSelectionScreen$lambda$7 = AccountSelectionScreen$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                                if (eventAccountSelectionScreen$lambda$7 != null) {
                                    eventConsumerInvoke2.consume(eventAccountSelectionScreen$lambda$7, new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$$inlined$consumeIfType$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            m15374invoke(obj);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m15374invoke(Object it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            AccountSelectionEvent.AccountsSelected accountsSelected = (AccountSelectionEvent.AccountsSelected) eventAccountSelectionScreen$lambda$7.getData();
                                            accountSelectionCallbacks.onAccountsSelected(accountsSelected.getSourceAccount(), accountsSelected.getSinkAccount(), accountsSelected.getEligibleAssets());
                                        }
                                    });
                                }
                                eventAccountSelectionScreen$lambda$72 = AccountSelectionScreen$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                                if (eventAccountSelectionScreen$lambda$72 != null) {
                                    eventConsumerInvoke.consume(eventAccountSelectionScreen$lambda$72, new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$$inlined$consumeIfType$2
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            m15375invoke(obj);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m15375invoke(Object it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            AccountSelectionComposableKt.AccountSelectionScreen$lambda$10(snapshotState, (AccountSelectionEvent.AlertSheetWarning) eventAccountSelectionScreen$lambda$72.getData());
                                        }
                                    });
                                }
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-901222194, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt.AccountSelectionScreen.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i52) {
                                        if ((i52 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-901222194, i52, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionScreen.<anonymous> (AccountSelectionComposable.kt:142)");
                                        }
                                        AccountSelectionComposableKt.AccountSelectionToolbar(function0, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i52 = BentoTheme.$stable;
                                composer2 = composerStartRestartGroup;
                                Modifier modifier52 = modifier4;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, composableLambdaRememberComposableLambda2, null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1381112665, true, new C189925(accountSelectionViewState, accountSelectionCallbacks, function04, function22, function03, snapshotState, function12), composerStartRestartGroup, 54), composer2, ((i3 >> 27) & 14) | 805306416, 316);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 256) != 0) {
                }
                function12 = function1;
                i4 = i2 & 512;
                if (i4 != 0) {
                }
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            function12 = function1;
            i4 = i2 & 512;
            if (i4 != 0) {
            }
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function04 = function02;
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        function12 = function1;
        i4 = i2 & 512;
        if (i4 != 0) {
        }
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: AccountSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$5 */
    static final class C189925 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<AccountSelectionEvent.AlertSheetWarning> $bottomSheetData$delegate;
        final /* synthetic */ AccountSelectionCallbacks $callbacks;
        final /* synthetic */ Function0<Unit> $dismissErrorDialog;
        final /* synthetic */ Function1<AccountSelectionDuxo.AlertSheetAction, Unit> $handleAlertSheetAction;
        final /* synthetic */ Function0<Unit> $refresh;
        final /* synthetic */ Function2<UiIatAccount, UiIatAccount, Unit> $validateAccountPair;
        final /* synthetic */ AccountSelectionViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C189925(AccountSelectionViewState accountSelectionViewState, AccountSelectionCallbacks accountSelectionCallbacks, Function0<Unit> function0, Function2<? super UiIatAccount, ? super UiIatAccount, Unit> function2, Function0<Unit> function02, SnapshotState<AccountSelectionEvent.AlertSheetWarning> snapshotState, Function1<? super AccountSelectionDuxo.AlertSheetAction, Unit> function1) {
            this.$viewState = accountSelectionViewState;
            this.$callbacks = accountSelectionCallbacks;
            this.$refresh = function0;
            this.$validateAccountPair = function2;
            this.$dismissErrorDialog = function02;
            this.$bottomSheetData$delegate = snapshotState;
            this.$handleAlertSheetAction = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381112665, i2, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionScreen.<anonymous> (AccountSelectionComposable.kt:146)");
            }
            AccountSelectionComposableKt.AccountSelectionScaffoldContent(this.$viewState, this.$callbacks, this.$refresh, this.$validateAccountPair, this.$dismissErrorDialog, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
            final AccountSelectionEvent.AlertSheetWarning alertSheetWarningAccountSelectionScreen$lambda$9 = AccountSelectionComposableKt.AccountSelectionScreen$lambda$9(this.$bottomSheetData$delegate);
            if (alertSheetWarningAccountSelectionScreen$lambda$9 != null) {
                final Function1<AccountSelectionDuxo.AlertSheetAction, Unit> function1 = this.$handleAlertSheetAction;
                final SnapshotState<AccountSelectionEvent.AlertSheetWarning> snapshotState = this.$bottomSheetData$delegate;
                AccountFeatureParityBottomSheetData alertSheetData = alertSheetWarningAccountSelectionScreen$lambda$9.getAlertSheetData();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(alertSheetWarningAccountSelectionScreen$lambda$9);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionComposableKt.C189925.invoke$lambda$7$lambda$1$lambda$0(function1, alertSheetWarningAccountSelectionScreen$lambda$9);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(alertSheetWarningAccountSelectionScreen$lambda$9) | composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionComposableKt.C189925.invoke$lambda$7$lambda$4$lambda$3(alertSheetWarningAccountSelectionScreen$lambda$9, function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$5$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionComposableKt.C189925.invoke$lambda$7$lambda$6$lambda$5(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                AccountFeatureParityBottomSheet2.AccountFeatureParityBottomSheet(alertSheetData, function0, function02, (Function0) objRememberedValue3, composer, StringResource.$stable | 3072);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
            AccountSelectionComposableKt.AccountSelectionScreen$lambda$10(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$1$lambda$0(Function1 function1, AccountSelectionEvent.AlertSheetWarning alertSheetWarning) {
            function1.invoke(alertSheetWarning.getPrimaryButtonAction());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4$lambda$3(AccountSelectionEvent.AlertSheetWarning alertSheetWarning, Function1 function1) {
            AccountSelectionDuxo.AlertSheetAction secondaryButtonAction = alertSheetWarning.getSecondaryButtonAction();
            if (secondaryButtonAction != null) {
                function1.invoke(secondaryButtonAction);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionScaffoldContent(final AccountSelectionViewState accountSelectionViewState, final AccountSelectionCallbacks accountSelectionCallbacks, final Function0<Unit> function0, final Function2<? super UiIatAccount, ? super UiIatAccount, Unit> function2, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-287985241);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountSelectionViewState) : composerStartRestartGroup.changedInstance(accountSelectionViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountSelectionCallbacks) : composerStartRestartGroup.changedInstance(accountSelectionCallbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-287985241, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionScaffoldContent (AccountSelectionComposable.kt:176)");
                    }
                    if (!(accountSelectionViewState instanceof AccountSelectionViewState.Loading)) {
                        composerStartRestartGroup.startReplaceGroup(-1875896670);
                        LoadingScreenComposablesKt.ListLoadingScreenComposable(modifier2, true, true, 2, composerStartRestartGroup, ((i3 >> 15) & 14) | 3504, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (accountSelectionViewState instanceof AccountSelectionViewState.Error) {
                        composerStartRestartGroup.startReplaceGroup(-1875890365);
                        ErrorScreenComposable.ErrorScreenComposable(modifier2, function03, 0, null, null, null, null, false, composerStartRestartGroup, ((i3 >> 15) & 14) | ((i3 >> 3) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(accountSelectionViewState instanceof AccountSelectionViewState.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(-1875898064);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1977085539);
                        AccountSelectionViewState.Loaded loaded = (AccountSelectionViewState.Loaded) accountSelectionViewState;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z = (i3 & 7168) == 2048;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AccountSelectionComposableKt.AccountSelectionScaffoldContent$lambda$15$lambda$14(function2, (UiIatAccount) obj, (UiIatAccount) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function2 function22 = (Function2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z2 = (i3 & 57344) == 16384;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountSelectionComposableKt.AccountSelectionScaffoldContent$lambda$17$lambda$16(function02);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AccountSelectionLoaded(loaded, accountSelectionCallbacks, function22, (Function0) objRememberedValue2, modifier2, composerStartRestartGroup, (57344 & (i3 >> 3)) | (i3 & 112), 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectionComposableKt.AccountSelectionScaffoldContent$lambda$18(accountSelectionViewState, accountSelectionCallbacks, function0, function2, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!(accountSelectionViewState instanceof AccountSelectionViewState.Loading)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function03 = function0;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionScaffoldContent$lambda$15$lambda$14(Function2 function2, UiIatAccount sourceAccount, UiIatAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        function2.invoke(sourceAccount, sinkAccount);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionScaffoldContent$lambda$17$lambda$16(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void PreviewAccountSelectionScreen(final AccountSelectionViewState accountSelectionViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2096075474);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountSelectionViewState) : composerStartRestartGroup.changedInstance(accountSelectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2096075474, i2, -1, "com.robinhood.android.internalassettransfers.accountselection.PreviewAccountSelectionScreen (AccountSelectionComposable.kt:208)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-1005295726, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt.PreviewAccountSelectionScreen.1

                /* compiled from: AccountSelectionComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AccountSelectionViewState $viewState;

                    AnonymousClass1(AccountSelectionViewState accountSelectionViewState) {
                        this.$viewState = accountSelectionViewState;
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
                            ComposerKt.traceEventStart(-1643779766, i, -1, "com.robinhood.android.internalassettransfers.accountselection.PreviewAccountSelectionScreen.<anonymous>.<anonymous> (AccountSelectionComposable.kt:214)");
                        }
                        AccountSelectionViewState accountSelectionViewState = this.$viewState;
                        StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
                        AccountSelectionCallbacks accountSelectionCallbacks = new AccountSelectionCallbacks() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt.PreviewAccountSelectionScreen.1.1.1
                            @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks
                            public void onAccountsSelected(UiIatAccount source, UiIatAccount sink, EligibleAssets sourceEligibleAssets) {
                                Intrinsics.checkNotNullParameter(source, "source");
                                Intrinsics.checkNotNullParameter(sink, "sink");
                                Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
                            }

                            @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks
                            public void onRowClicked(AccountSelectionListFragment.AccountSelectionType selectionType, List<AccountSelectionListFragment.Args.AccountSelectionOption> options) {
                                Intrinsics.checkNotNullParameter(selectionType, "selectionType");
                                Intrinsics.checkNotNullParameter(options, "options");
                            }

                            @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionCallbacks
                            public Flow getAccountSelectionFlow() {
                                return FlowKt.flowOf((Object) null);
                            }
                        };
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1$$ExternalSyntheticLambda0
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
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AccountSelectionComposableKt.C189941.AnonymousClass1.invoke$lambda$3$lambda$2((String) obj, (AccountSelectionListFragment.AccountSelectionType) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function2 function2 = (Function2) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function02 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AccountSelectionComposableKt.C189941.AnonymousClass1.invoke$lambda$7$lambda$6((UiIatAccount) obj, (UiIatAccount) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function2 function22 = (Function2) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        Function0 function03 = (Function0) objRememberedValue5;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$PreviewAccountSelectionScreen$1$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountSelectionComposableKt.C189941.AnonymousClass1.invoke$lambda$11$lambda$10((AccountSelectionDuxo.AlertSheetAction) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceGroup();
                        AccountSelectionComposableKt.AccountSelectionScreen(accountSelectionViewState, stateFlow2MutableStateFlow, accountSelectionCallbacks, function0, function2, function02, function22, function03, (Function1) objRememberedValue6, null, composer, 115043328, 512);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(String str, AccountSelectionListFragment.AccountSelectionType accountSelectionType) {
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                        Intrinsics.checkNotNullParameter(accountSelectionType, "<unused var>");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2) {
                        Intrinsics.checkNotNullParameter(uiIatAccount, "<unused var>");
                        Intrinsics.checkNotNullParameter(uiIatAccount2, "<unused var>");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$11$lambda$10(AccountSelectionDuxo.AlertSheetAction alertSheetAction) {
                        Intrinsics.checkNotNullParameter(alertSheetAction, "<unused var>");
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-1005295726, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.PreviewAccountSelectionScreen.<anonymous> (AccountSelectionComposable.kt:213)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1643779766, true, new AnonymousClass1(accountSelectionViewState), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionComposableKt.PreviewAccountSelectionScreen$lambda$19(accountSelectionViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectionLoaded(final AccountSelectionViewState.Loaded state, final AccountSelectionCallbacks callbacks, final Function2<? super UiIatAccount, ? super UiIatAccount, Unit> onButtonClick, final Function0<Unit> onErrorDialogDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean zChangedInstance;
        Object objRememberedValue;
        AccountSelectionViewState3.Enabled enabled;
        AccountSelectionViewState3 buttonState;
        boolean z;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Modifier modifier3;
        final Function0<Unit> function0;
        UiIatAccount sinkAccount;
        BrokerageAccountType brokerageAccountType;
        BrokerageAccountTypeDto brokerageAccountTypeDto;
        UiIatAccount sourceAccount;
        BrokerageAccountType brokerageAccountType2;
        BrokerageAccountTypeDto brokerageAccountTypeDto2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(onErrorDialogDismiss, "onErrorDialogDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1496225139);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onErrorDialogDismiss) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1496225139, i3, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionLoaded (AccountSelectionComposable.kt:344)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                String strStringResource = StringResources_androidKt.stringResource(C18977R.string.select_accounts, composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8120);
                composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.startReplaceGroup(-887390288);
                for (final AccountSelectionRowState accountSelectionRowState : state.getAccountSelectionRows()) {
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    StringResource label = accountSelectionRowState.getLabel();
                    int i6 = StringResource.$stable;
                    String string2 = StringResource2.getString(label, composer2, i6);
                    String string3 = StringResource2.getString(accountSelectionRowState.getValue(), composer2, i6);
                    boolean enabled2 = accountSelectionRowState.getEnabled();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && composer2.changedInstance(callbacks))) | composer2.changedInstance(accountSelectionRowState);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSelectionComposableKt.m2064x94e39ae6(callbacks, accountSelectionRowState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoSettingsRowKt.BentoSettingsRow(modifierFillMaxWidth$default2, string2, string3, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, enabled2, false, (Function0<Unit>) objRememberedValue3, composer3, 6, 88);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composer2, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion4);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                Modifier modifierAlign = Column6.INSTANCE.align(companion4, companion5.getCenterHorizontally());
                String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.learn_more_about_transferring_assets, composer2, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i7).m21426getFg20d7_KjU();
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(context);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$29$lambda$28$lambda$25$lambda$24(context);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource2, modifierAlign, null, null, false, Color.m6701boximpl(jM21426getFg20d7_KjU), composer2, 0, 56);
                AccountSelectionViewState3 buttonState2 = state.getButtonState();
                enabled = !(buttonState2 instanceof AccountSelectionViewState3.Enabled) ? (AccountSelectionViewState3.Enabled) buttonState2 : null;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                if (enabled != null || (sourceAccount = enabled.getSourceAccount()) == null || (brokerageAccountType2 = sourceAccount.getBrokerageAccountType()) == null || (brokerageAccountTypeDto2 = brokerageAccountType2.toBrokerageAccountTypeDto()) == null || (brokerageAccountType = (rosetta.account.BrokerageAccountType) brokerageAccountTypeDto2.toProto()) == null) {
                    rosetta.account.BrokerageAccountType brokerageAccountType3 = rosetta.account.BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                }
                rosetta.account.BrokerageAccountType brokerageAccountType4 = brokerageAccountType3;
                if (enabled != null || (sinkAccount = enabled.getSinkAccount()) == null || (brokerageAccountType = sinkAccount.getBrokerageAccountType()) == null || (brokerageAccountTypeDto = brokerageAccountType.toBrokerageAccountTypeDto()) == null || (brokerageAccountType = (rosetta.account.BrokerageAccountType) brokerageAccountTypeDto.toProto()) == null) {
                    rosetta.account.BrokerageAccountType brokerageAccountType5 = rosetta.account.BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5143paddingVpY3zN4, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InternalAssetTransferContext(brokerageAccountType4, brokerageAccountType5, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -32769, 16383, null), component, null, 35, null)), true, false, false, true, false, null, 108, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0);
                buttonState = state.getButtonState();
                if (!(buttonState instanceof AccountSelectionViewState3.Disabled)) {
                    z = false;
                } else {
                    if (!(buttonState instanceof AccountSelectionViewState3.Enabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                boolean loading = state.getButtonState().getLoading();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance2 = composer2.changedInstance(state) | ((i3 & 896) != 256);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$29$lambda$28$lambda$27$lambda$26(state, onButtonClick);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default, null, null, z, loading, null, null, null, null, false, null, composer4, 0, 0, 8088);
                composerStartRestartGroup = composer4;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (state.getDialogError() != null) {
                    String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_accountselection_martial_check_error, composerStartRestartGroup, 0));
                    String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i8 = i3 & 7168;
                    boolean z2 = i8 == 2048;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        function0 = onErrorDialogDismiss;
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$31$lambda$30(function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        function0 = onErrorDialogDismiss;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource5, (Function0) objRememberedValue4);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z3 = i8 == 2048;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$33$lambda$32(function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertDialog.BentoAlertDialog(strStringResource4, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue5, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$34(state, callbacks, onButtonClick, onErrorDialogDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top3 = arrangement2.getTop();
            Alignment.Companion companion7 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top3, companion7.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion32, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    String strStringResource6 = StringResources_androidKt.stringResource(C18977R.string.select_accounts, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                    int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(strStringResource6, modifierFillMaxWidth$default3, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8120);
                    composer2 = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM()), composer2, 0);
                    composer2.startReplaceGroup(-887390288);
                    while (r4.hasNext()) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Arrangement.Vertical top22 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion52 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(top22, companion52.getStart(), composer2, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, companion42);
                    ComposeUiNode.Companion companion62 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor32 = companion62.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion62.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion62.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion62.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion62.getSetModifier());
                        Modifier modifierAlign2 = Column6.INSTANCE.align(companion42, companion52.getCenterHorizontally());
                        String strStringResource22 = StringResources_androidKt.stringResource(C18977R.string.learn_more_about_transferring_assets, composer2, 0);
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i72 = BentoTheme.$stable;
                        long jM21426getFg20d7_KjU2 = bentoTheme22.getColors(composer2, i72).m21426getFg20d7_KjU();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(context);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$29$lambda$28$lambda$25$lambda$24(context);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceGroup();
                            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource22, modifierAlign2, null, null, false, Color.m6701boximpl(jM21426getFg20d7_KjU2), composer2, 0, 56);
                            AccountSelectionViewState3 buttonState22 = state.getButtonState();
                            if (!(buttonState22 instanceof AccountSelectionViewState3.Enabled)) {
                            }
                            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), bentoTheme22.getSpacing(composer2, i72).m21592getMediumD9Ej5fM(), bentoTheme22.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM());
                            UserInteractionEventDescriptor userInteractionEventDescriptor3 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Component component2 = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.CONTINUE;
                            if (enabled != null) {
                                rosetta.account.BrokerageAccountType brokerageAccountType32 = rosetta.account.BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                                rosetta.account.BrokerageAccountType brokerageAccountType42 = brokerageAccountType32;
                                if (enabled != null) {
                                    rosetta.account.BrokerageAccountType brokerageAccountType52 = rosetta.account.BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifierM5143paddingVpY3zN42, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor22, null, null, action2, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InternalAssetTransferContext(brokerageAccountType42, brokerageAccountType52, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -32769, 16383, null), component2, null, 35, null)), true, false, false, true, false, null, 108, null);
                                    String strStringResource32 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0);
                                    buttonState = state.getButtonState();
                                    if (!(buttonState instanceof AccountSelectionViewState3.Disabled)) {
                                    }
                                    boolean loading2 = state.getButtonState().getLoading();
                                    composer2.startReplaceGroup(-1633490746);
                                    zChangedInstance2 = composer2.changedInstance(state) | ((i3 & 896) != 256);
                                    objRememberedValue2 = composer2.rememberedValue();
                                    if (!zChangedInstance2) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AccountSelectionComposableKt.AccountSelectionLoaded$lambda$29$lambda$28$lambda$27$lambda$26(state, onButtonClick);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                        composer2.endReplaceGroup();
                                        Composer composer42 = composer2;
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource32, modifierAutoLogEvents$default2, null, null, z, loading2, null, null, null, null, false, null, composer42, 0, 0, 8088);
                                        composerStartRestartGroup = composer42;
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        if (state.getDialogError() != null) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier52;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountSelectionLoaded$lambda$29$lambda$23$lambda$22$lambda$21$lambda$20 */
    public static final Unit m2064x94e39ae6(AccountSelectionCallbacks accountSelectionCallbacks, AccountSelectionRowState accountSelectionRowState) {
        accountSelectionCallbacks.onRowClicked(accountSelectionRowState.getAccountSelectionType(), accountSelectionRowState.getOptions());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionLoaded$lambda$29$lambda$28$lambda$25$lambda$24(Context context) {
        WebUtils.viewUrl$default(context, C18977R.string.internal_asset_transfer_help_center_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionLoaded$lambda$29$lambda$28$lambda$27$lambda$26(AccountSelectionViewState.Loaded loaded, Function2 function2) {
        AccountSelectionViewState3 buttonState = loaded.getButtonState();
        if (buttonState instanceof AccountSelectionViewState3.Enabled) {
            function2.invoke(((AccountSelectionViewState3.Enabled) loaded.getButtonState()).getSourceAccount(), ((AccountSelectionViewState3.Enabled) loaded.getButtonState()).getSinkAccount());
        } else if (!(buttonState instanceof AccountSelectionViewState3.Disabled)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionLoaded$lambda$31$lambda$30(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectionLoaded$lambda$33$lambda$32(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void AccountSelectionToolbar(final Function0<Unit> onBackClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1810693338);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1810693338, i2, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionToolbar (AccountSelectionComposable.kt:461)");
            }
            ComposableSingletons$AccountSelectionComposableKt composableSingletons$AccountSelectionComposableKt = ComposableSingletons$AccountSelectionComposableKt.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$AccountSelectionComposableKt.m2066x5bfbae59(), null, ComposableLambda3.rememberComposableLambda(-750568089, true, new C189931(onBackClicked), composerStartRestartGroup, 54), null, composableSingletons$AccountSelectionComposableKt.m2065x2d3390c7(), false, false, null, null, 0L, null, composerStartRestartGroup, 24966, 0, 2026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectionComposableKt.AccountSelectionToolbar$lambda$35(onBackClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionToolbar$1 */
    static final class C189931 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onBackClicked;

        C189931(Function0<Unit> function0) {
            this.$onBackClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-750568089, i, -1, "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionToolbar.<anonymous> (AccountSelectionComposable.kt:465)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onBackClicked);
            final Function0<Unit> function0 = this.$onBackClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionToolbar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountSelectionComposableKt.C189931.invoke$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
