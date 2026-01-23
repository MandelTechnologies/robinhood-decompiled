package com.robinhood.android.event.detail.contractselector.multicontractselector;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.digest.common.LocalClock;
import com.robinhood.android.cortex.digest.common.LocalClock3;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.contractselector.ContractSelectorRow;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialog4;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialogData;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EventMultiContractSelectorFullScreenContent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"EventMultiContractSelectorFullScreenContent", "", "state", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorViewState;", "callbacks", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFullScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "isCenterAligned", "", "onTradeClicked", "Lkotlin/Function2;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "", "(Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorViewState;Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFullScreenCallbacks;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventMultiContractSelectorFullScreenContent2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventMultiContractSelectorFullScreenContent$lambda$11(EventContractSelectorViewState eventContractSelectorViewState, EventMultiContractSelectorFullScreenContent eventMultiContractSelectorFullScreenContent, Modifier modifier, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        EventMultiContractSelectorFullScreenContent(eventContractSelectorViewState, eventMultiContractSelectorFullScreenContent, modifier, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventMultiContractSelectorFullScreenContent(final EventContractSelectorViewState state, final EventMultiContractSelectorFullScreenContent callbacks, Modifier modifier, boolean z, final Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> onTradeClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        Clock current;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        boolean zChanged2;
        Object objRememberedValue2;
        final ImmutableList<ContractSelectorRowTreatmentViewState> contractList;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final boolean z4;
        EventTradeOverlayDialogData eventTradeOverlayDialog;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onTradeClicked, "onTradeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1473545341);
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
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onTradeClicked) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = true;
                    z3 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473545341, i3, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContent (EventMultiContractSelectorFullScreenContent.kt:40)");
                    }
                    current = LocalClock3.getLocalClock().getCurrent(composerStartRestartGroup, LocalClock.$stable);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(current);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Instant.now(current), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(current);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new EventMultiContractSelectorFullScreenContent3(snapshotState, current, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(current, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    contractList = state.getContractList();
                    if (contractList == null) {
                        contractList = extensions2.persistentListOf();
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(contractList) | ((57344 & i3) != 16384) | composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EventMultiContractSelectorFullScreenContent2.m2000xb7bd5ae5(contractList, z3, onTradeClicked, snapshotState, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    z4 = z3;
                    LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, function1, composerStartRestartGroup, 0, 511);
                    composerStartRestartGroup = composerStartRestartGroup;
                    eventTradeOverlayDialog = state.getEventTradeOverlayDialog();
                    composerStartRestartGroup.startReplaceGroup(-604281931);
                    if (eventTradeOverlayDialog != null) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i6 = i3 & 112;
                        boolean z6 = i6 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EventMultiContractSelectorFullScreenContent2.m2002x8f4f0fd9(callbacks, (ContractSelectorButtonViewState.Metadata) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function12 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i6 != 32 && ((i3 & 64) == 0 || !composerStartRestartGroup.changedInstance(callbacks))) {
                            z5 = false;
                        }
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new EventMultiContractSelectorFullScreenContent5(callbacks);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EventTradeOverlayDialog4.EventTradeOverlayDialog(eventTradeOverlayDialog, function12, (Function0) ((KFunction) objRememberedValue5), null, composerStartRestartGroup, 0, 8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EventMultiContractSelectorFullScreenContent2.EventMultiContractSelectorFullScreenContent$lambda$11(state, callbacks, modifier3, z4, onTradeClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
                if (i5 == 0) {
                }
                boolean z52 = true;
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                current = LocalClock3.getLocalClock().getCurrent(composerStartRestartGroup, LocalClock.$stable);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(current);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Instant.now(current), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(current);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue2 = new EventMultiContractSelectorFullScreenContent3(snapshotState, current, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(current, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        contractList = state.getContractList();
                        if (contractList == null) {
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(contractList) | ((57344 & i3) != 16384) | composerStartRestartGroup.changed(snapshotState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EventMultiContractSelectorFullScreenContent2.m2000xb7bd5ae5(contractList, z3, onTradeClicked, snapshotState, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                Function1 function13 = (Function1) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier52 = modifier4;
                                z4 = z3;
                                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, function13, composerStartRestartGroup, 0, 511);
                                composerStartRestartGroup = composerStartRestartGroup;
                                eventTradeOverlayDialog = state.getEventTradeOverlayDialog();
                                composerStartRestartGroup.startReplaceGroup(-604281931);
                                if (eventTradeOverlayDialog != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
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
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EventMultiContractSelectorFullScreenContent$lambda$10$lambda$5$lambda$4 */
    public static final Unit m2000xb7bd5ae5(final ImmutableList immutableList, final boolean z, final Function2 function2, final SnapshotState snapshotState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1714596810, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$EventMultiContractSelectorFullScreenContent$2$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1714596810, i2, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreenContent.kt:55)");
                }
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                boolean z2 = z;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                EventMultiContractSelectorHeader2.ContractSelectorHeader(z2 ? EventMultiContractSelectorHeader.CENTER_ALIGNED : EventMultiContractSelectorHeader.LEFT_ALIGNED, null, composer, 0, 2);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMultiContractSelectorFullScreenContent2.m2001x7bc93574((ContractSelectorRowTreatmentViewState) obj);
            }
        };
        final C16170xc2821839 c16170xc2821839 = new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$EventMultiContractSelectorFullScreenContent$lambda$10$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ContractSelectorRowTreatmentViewState) obj);
            }
        };
        LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$EventMultiContractSelectorFullScreenContent$lambda$10$lambda$5$lambda$4$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(immutableList.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$EventMultiContractSelectorFullScreenContent$lambda$10$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c16170xc2821839.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$EventMultiContractSelectorFullScreenContent$lambda$10$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState = (ContractSelectorRowTreatmentViewState) immutableList.get(i);
                composer.startReplaceGroup(1235650761);
                ContractSelectorRow.ContractSelectorRow(contractSelectorRowTreatmentViewState, function2, snapshotState, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EventMultiContractSelectorFullScreenContent$lambda$10$lambda$5$lambda$4$lambda$2 */
    public static final Object m2001x7bc93574(ContractSelectorRowTreatmentViewState item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getContractId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EventMultiContractSelectorFullScreenContent$lambda$10$lambda$9$lambda$7$lambda$6 */
    public static final Unit m2002x8f4f0fd9(EventMultiContractSelectorFullScreenContent eventMultiContractSelectorFullScreenContent, ContractSelectorButtonViewState.Metadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        eventMultiContractSelectorFullScreenContent.onTrade(metadata.getContractId(), metadata.getOrderSide(), metadata.getPositionEffect());
        eventMultiContractSelectorFullScreenContent.onTradeOverlayDialogDismiss();
        return Unit.INSTANCE;
    }
}
