package com.robinhood.android.equitytradeladder;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnPlacedModifier3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.bottombar.EquityTradeLadderBottomBarKt;
import com.robinhood.android.equitytradeladder.models.EquityLadderUserInteractionData;
import com.robinhood.android.equitytradeladder.nux.EquityTradingLadderNuxScreen5;
import com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandler2;
import com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderBottomSheet;
import com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreen7;
import com.robinhood.android.equitytradeladder.topbar.EquityTradeLadderTopBar3;
import com.robinhood.android.linking.MobileLinkingData;
import com.robinhood.android.udf.event.Event;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.tradeladder.p398ui.LadderInteraction;
import com.robinhood.shared.tradeladder.p398ui.ladder.GenericLadderScreenKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.LadderFtuxUi6;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderGestureConfiguration;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderPillData;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.floating.FloatingLadderItems;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.loading.LoadingNux;
import com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.AutoSendUpsellBottomSheet;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u008e\u0002"}, m3636d2 = {"EquityTradeLadderComposable", "", "duxo", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "onBackPress", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "mobileLinkingData", "Lcom/robinhood/android/linking/MobileLinkingData;", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingData;Landroidx/compose/runtime/Composer;II)V", "EquityTradeLadderScreenStates", "screenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "ladderViewState", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;", "(Lcom/robinhood/android/equitytradeladder/LadderScreenState;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;Landroidx/compose/runtime/Composer;I)V", "feature-equity-trade-ladder_externalDebug", "viewState", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "isFloatingLastPriceOnTop", "", "isFloatingLastPriceVisible", "ladderScreenState", "offscreenOrders", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderPillData;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradeLadderComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderComposable$lambda$17(EquityTradeLadderDuxo equityTradeLadderDuxo, Function0 function0, Function1 function1, Modifier modifier, MobileLinkingData mobileLinkingData, int i, int i2, Composer composer, int i3) {
        EquityTradeLadderComposable(equityTradeLadderDuxo, function0, function1, modifier, mobileLinkingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$47(LadderScreenState ladderScreenState, EquityTradeLadderViewState equityTradeLadderViewState, EquityTradeLadderDuxo equityTradeLadderDuxo, int i, Composer composer, int i2) {
        EquityTradeLadderScreenStates(ladderScreenState, equityTradeLadderViewState, equityTradeLadderDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradeLadderComposable(final EquityTradeLadderDuxo duxo, final Function0<Unit> onBackPress, final Function1<? super Throwable, Unit> onError, Modifier modifier, MobileLinkingData mobileLinkingData, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        LadderState.LadderData ladder;
        SnapshotState4 snapshotState4;
        LazyListState lazyListState;
        SnapshotState4 snapshotState42;
        LadderState.LadderData ladderData;
        Composer composer2;
        final Modifier modifier3;
        final MobileLinkingData mobileLinkingData2;
        Composer.Companion companion2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        MobileLinkingData mobileLinkingData3 = mobileLinkingData;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBackPress, "onBackPress");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1023338968);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPress) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(mobileLinkingData3) : composerStartRestartGroup.changedInstance(mobileLinkingData3) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    mobileLinkingData3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1023338968, i3, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderComposable (EquityTradeLadderComposable.kt:63)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new SnackbarHostState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue3 = snapshotStateMutableStateOf$default;
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$10$lambda$9(snapshotState4CollectAsStateWithLifecycle);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                MobileLinkingData mobileLinkingData4 = mobileLinkingData3;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                ladder = EquityTradeLadderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLadderState().getLadder();
                composerStartRestartGroup.startReplaceGroup(118791319);
                if (ladder == null) {
                    Integer numValueOf = Integer.valueOf(ladder.getLastPriceIndex());
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(ladder);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                        EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1 equityTradeLadderComposableKt$EquityTradeLadderComposable$1$1 = new EquityTradeLadderComposableKt$EquityTradeLadderComposable$1$1(lazyListStateRememberLazyListState, ladder, snapshotState2, snapshotState, null);
                        companion2 = companion;
                        objRememberedValue6 = equityTradeLadderComposableKt$EquityTradeLadderComposable$1$1;
                        lazyListState = lazyListStateRememberLazyListState;
                        snapshotState42 = snapshotState43;
                        ladderData = ladder;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        lazyListState = lazyListStateRememberLazyListState;
                        companion2 = companion;
                        snapshotState42 = snapshotState43;
                        ladderData = ladder;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                    Map<Integer, LadderState.LadderData.PendingOrderRow> pendingOrders = ladderData.getPendingOrders();
                    LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = ladderData.getSelectedPendingOrders();
                    List<LadderState.LadderData.UiPendingOrder> orders = selectedPendingOrders != null ? selectedPendingOrders.getOrders() : null;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(ladderData) | composerStartRestartGroup.changed(lazyListState);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue7 == companion2.getEmpty()) {
                        objRememberedValue7 = new EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1(ladderData, snapshotState3, lazyListState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(pendingOrders, orders, (Function2) objRememberedValue7, composerStartRestartGroup, 0);
                } else {
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    lazyListState = lazyListStateRememberLazyListState;
                    snapshotState42 = snapshotState43;
                    ladderData = ladder;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EquityTradeLadderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-1398382381, true, new C157953(lazyListState, snackbarHostState, onError, duxo, modifier4, ladderData, snapshotState4, onBackPress, mobileLinkingData4, snapshotState4CollectAsStateWithLifecycle, snapshotState2, snapshotState, snapshotState3, snapshotState42), composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                mobileLinkingData2 = mobileLinkingData4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                mobileLinkingData2 = mobileLinkingData3;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$17(duxo, onBackPress, onError, modifier3, mobileLinkingData2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState432 = (SnapshotState4) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            MobileLinkingData mobileLinkingData42 = mobileLinkingData3;
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            SnapshotState snapshotState32 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            ladder = EquityTradeLadderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getLadderState().getLadder();
            composerStartRestartGroup.startReplaceGroup(118791319);
            if (ladder == null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier42 = modifier2;
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EquityTradeLadderComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-1398382381, true, new C157953(lazyListState, snackbarHostState2, onError, duxo, modifier42, ladderData, snapshotState4, onBackPress, mobileLinkingData42, snapshotState4CollectAsStateWithLifecycle3, snapshotState22, snapshotState5, snapshotState32, snapshotState42), composer2, 54), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
            mobileLinkingData2 = mobileLinkingData42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EquityTradeLadderComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EquityTradeLadderComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderScreenState EquityTradeLadderComposable$lambda$10$lambda$9(SnapshotState4 snapshotState4) {
        return EquityTradeLadderComposable$lambda$0(snapshotState4).getLadderScreenState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityTradeLadderViewState EquityTradeLadderComposable$lambda$0(SnapshotState4<EquityTradeLadderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<EquityTradeLadderEvent> EquityTradeLadderComposable$lambda$1(SnapshotState4<Event<EquityTradeLadderEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderScreenState EquityTradeLadderComposable$lambda$11(SnapshotState4<? extends LadderScreenState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList<OrderPillData> EquityTradeLadderComposable$lambda$13(SnapshotState<ImmutableList<OrderPillData>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EquityTradeLadderComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EquityTradeLadderComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: EquityTradeLadderComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3 */
    static final class C157953 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EquityTradeLadderDuxo $duxo;
        final /* synthetic */ SnapshotState4<Event<EquityTradeLadderEvent>> $eventState$delegate;
        final /* synthetic */ SnapshotState<Boolean> $isFloatingLastPriceOnTop$delegate;
        final /* synthetic */ SnapshotState<Boolean> $isFloatingLastPriceVisible$delegate;
        final /* synthetic */ LadderState.LadderData $ladderData;
        final /* synthetic */ SnapshotState4<LadderScreenState> $ladderScreenState$delegate;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ MobileLinkingData $mobileLinkingData;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState<ImmutableList<OrderPillData>> $offscreenOrders$delegate;
        final /* synthetic */ Function0<Unit> $onBackPress;
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ SnackbarHostState $snackbarHostState;
        final /* synthetic */ SnapshotState4<EquityTradeLadderViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C157953(LazyListState lazyListState, SnackbarHostState snackbarHostState, Function1<? super Throwable, Unit> function1, EquityTradeLadderDuxo equityTradeLadderDuxo, Modifier modifier, LadderState.LadderData ladderData, SnapshotState4<Event<EquityTradeLadderEvent>> snapshotState4, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState4<EquityTradeLadderViewState> snapshotState42, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<ImmutableList<OrderPillData>> snapshotState3, SnapshotState4<? extends LadderScreenState> snapshotState43) {
            this.$listState = lazyListState;
            this.$snackbarHostState = snackbarHostState;
            this.$onError = function1;
            this.$duxo = equityTradeLadderDuxo;
            this.$modifier = modifier;
            this.$ladderData = ladderData;
            this.$eventState$delegate = snapshotState4;
            this.$onBackPress = function0;
            this.$mobileLinkingData = mobileLinkingData;
            this.$viewState$delegate = snapshotState42;
            this.$isFloatingLastPriceVisible$delegate = snapshotState;
            this.$isFloatingLastPriceOnTop$delegate = snapshotState2;
            this.$offscreenOrders$delegate = snapshotState3;
            this.$ladderScreenState$delegate = snapshotState43;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderEvent.OrderCheckAlert alert, ServerDrivenButton button) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(button, "button");
            equityTradeLadderDuxo.onOrderCheckAction(alert, button);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityOrderIntent equityOrderIntent, GenericAction genericAction) {
            Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
            equityTradeLadderDuxo.onDirectOrderCheckAction(equityOrderIntent, genericAction);
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeLadderComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ EquityTradeLadderDuxo $duxo;
            final /* synthetic */ MobileLinkingData $mobileLinkingData;
            final /* synthetic */ Function0<Unit> $onBackPress;
            final /* synthetic */ SnapshotState4<EquityTradeLadderViewState> $viewState$delegate;

            AnonymousClass3(EquityTradeLadderDuxo equityTradeLadderDuxo, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState4<EquityTradeLadderViewState> snapshotState4) {
                this.$duxo = equityTradeLadderDuxo;
                this.$onBackPress = function0;
                this.$mobileLinkingData = mobileLinkingData;
                this.$viewState$delegate = snapshotState4;
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
                    ComposerKt.traceEventStart(1077242718, i, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderComposable.<anonymous>.<anonymous> (EquityTradeLadderComposable.kt:148)");
                }
                EquityTradeLadderViewState.TopBarData topBarData = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$0(this.$viewState$delegate).getTopBarData();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo = this.$duxo;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$1$lambda$0(equityTradeLadderDuxo);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$onBackPress);
                final Function0<Unit> function02 = this.$onBackPress;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$3$lambda$2(function02);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function03 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.$duxo;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$5$lambda$4(equityTradeLadderDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function04 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo3 = this.$duxo;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$7$lambda$6(equityTradeLadderDuxo3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function05 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo4 = this.$duxo;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$9$lambda$8(equityTradeLadderDuxo4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function06 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo5 = this.$duxo;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$11$lambda$10(equityTradeLadderDuxo5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function0 function07 = (Function0) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo6 = this.$duxo;
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$13$lambda$12(equityTradeLadderDuxo6);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                Function0 function08 = (Function0) objRememberedValue7;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance7 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo7 = this.$duxo;
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$3$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass3.invoke$lambda$15$lambda$14(equityTradeLadderDuxo7);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                EquityTradeLadderTopBar3.EquityTradeLadderTopBar(topBarData, function0, function03, function04, function05, function06, function07, function08, (Function0) objRememberedValue8, null, this.$mobileLinkingData, composer, 0, MobileLinkingData.$stable, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onNbboRefreshed();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$5$lambda$4(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onSettingsVisibilityChanged(true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onFlattenClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$9$lambda$8(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onPnlClick();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$11$lambda$10(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onOpenOrdersClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$13$lambda$12(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.showNextPostTradeFtuxState();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$15$lambda$14(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.showNextPostTradeFtuxState();
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$4, reason: invalid class name */
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ EquityTradeLadderDuxo $duxo;
            final /* synthetic */ SnapshotState4<EquityTradeLadderViewState> $viewState$delegate;

            AnonymousClass4(EquityTradeLadderDuxo equityTradeLadderDuxo, SnapshotState4<EquityTradeLadderViewState> snapshotState4) {
                this.$duxo = equityTradeLadderDuxo;
                this.$viewState$delegate = snapshotState4;
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
                    ComposerKt.traceEventStart(12275487, i, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderComposable.<anonymous>.<anonymous> (EquityTradeLadderComposable.kt:181)");
                }
                EquityTradeLadderViewState.BottomBarData bottomBarData = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$0(this.$viewState$delegate).getBottomBarData();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo = this.$duxo;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass4.invoke$lambda$1$lambda$0(equityTradeLadderDuxo);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$4$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass4.invoke$lambda$3$lambda$2(equityTradeLadderDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo3 = this.$duxo;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass4.invoke$lambda$5$lambda$4(equityTradeLadderDuxo3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function03 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo4 = this.$duxo;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$4$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157953.AnonymousClass4.invoke$lambda$7$lambda$6(equityTradeLadderDuxo4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                EquityTradeLadderBottomBarKt.EquityTradeLadderBottomBar(bottomBarData, function0, function02, function03, (Function0) objRememberedValue4, null, composer, 0, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onQuantitySelectorClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onMarketBuyClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$5$lambda$4(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onMarketSellClicked();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                equityTradeLadderDuxo.onNbboRefreshed();
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            LadderPriceLevels ladderPriceLevels;
            List<BigDecimal> optionalPriceIncrementLevels;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1398382381, i, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderComposable.<anonymous> (EquityTradeLadderComposable.kt:124)");
            }
            Event eventEquityTradeLadderComposable$lambda$1 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$1(this.$eventState$delegate);
            LazyListState lazyListState = this.$listState;
            SnackbarHostState snackbarHostState = this.$snackbarHostState;
            Function1<Throwable, Unit> function1 = this.$onError;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final EquityTradeLadderDuxo equityTradeLadderDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradeLadderComposableKt.C157953.invoke$lambda$1$lambda$0(equityTradeLadderDuxo, (EquityTradeLadderEvent.OrderCheckAlert) obj, (ServerDrivenButton) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EquityTradeLadderEventHandler.EquityTradeLadderEventHandler(eventEquityTradeLadderComposable$lambda$1, lazyListState, snackbarHostState, function1, (Function2) objRememberedValue, composer, 384);
            Event eventEquityTradeLadderComposable$lambda$12 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$1(this.$eventState$delegate);
            SnackbarHostState snackbarHostState2 = this.$snackbarHostState;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
            final EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityTradeLadderComposableKt.C157953.invoke$lambda$3$lambda$2(equityTradeLadderDuxo2, (EquityOrderIntent) obj, (GenericAction) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            QuickConversionEventHandler2.QuickConversionEventHandler(eventEquityTradeLadderComposable$lambda$12, snackbarHostState2, (Function2) objRememberedValue2, null, composer, 48, 8);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(this.$modifier, (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            LadderState.LadderData ladderData = this.$ladderData;
            LadderGestureConfiguration ladderGestureConfiguration = new LadderGestureConfiguration(false, 0.0f, ((ladderData == null || (ladderPriceLevels = ladderData.getLadderPriceLevels()) == null || (optionalPriceIncrementLevels = ladderPriceLevels.getOptionalPriceIncrementLevels()) == null) ? 0 : optionalPriceIncrementLevels.size()) + 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 506, null);
            EquityTradeLadderDuxo equityTradeLadderDuxo3 = this.$duxo;
            SnackbarHostState snackbarHostState3 = this.$snackbarHostState;
            LazyListState lazyListState2 = this.$listState;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1077242718, true, new AnonymousClass3(equityTradeLadderDuxo3, this.$onBackPress, this.$mobileLinkingData, this.$viewState$delegate), composer, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(12275487, true, new AnonymousClass4(this.$duxo, this.$viewState$delegate), composer, 54);
            final LadderState.LadderData ladderData2 = this.$ladderData;
            final LazyListState lazyListState3 = this.$listState;
            final SnapshotState<Boolean> snapshotState = this.$isFloatingLastPriceVisible$delegate;
            final SnapshotState<Boolean> snapshotState2 = this.$isFloatingLastPriceOnTop$delegate;
            final SnapshotState4<EquityTradeLadderViewState> snapshotState4 = this.$viewState$delegate;
            final SnapshotState<ImmutableList<OrderPillData>> snapshotState3 = this.$offscreenOrders$delegate;
            GenericLadderScreenKt.GenericLadderScreen(equityTradeLadderDuxo3, ladderGestureConfiguration, modifierAutoLogEvents$default, snackbarHostState3, lazyListState2, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-1026276745, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt.EquityTradeLadderComposable.3.5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope GenericLadderScreen, Composer composer2, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(GenericLadderScreen, "$this$GenericLadderScreen");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.changed(GenericLadderScreen) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1026276745, i3, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderComposable.<anonymous>.<anonymous> (EquityTradeLadderComposable.kt:198)");
                    }
                    LadderState.LadderData ladderData3 = ladderData2;
                    if (ladderData3 != null) {
                        boolean fadedOut = ladderData3.getFadedOut();
                        boolean zEquityTradeLadderComposable$lambda$7 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$7(snapshotState);
                        boolean zEquityTradeLadderComposable$lambda$4 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$4(snapshotState2);
                        StringResource lastPriceFloatingButtonLabel = ladderData2.getLastPriceFloatingButtonLabel();
                        int lastPriceIndex = ladderData2.getLastPriceIndex();
                        StringResource headerString = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$0(snapshotState4).getMarketClosedHeaderData().getHeaderString();
                        StringResource headerString2 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$0(snapshotState4).getL2DataUnavailableHeaderData().getHeaderString();
                        StringResource headerString3 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$0(snapshotState4).getInstrumentHaltedHeaderData().getHeaderString();
                        LazyListState lazyListState4 = lazyListState3;
                        ImmutableList immutableListEquityTradeLadderComposable$lambda$13 = EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$13(snapshotState3);
                        int i4 = StringResource.$stable;
                        FloatingLadderItems.FloatingLadderItems(GenericLadderScreen, fadedOut, zEquityTradeLadderComposable$lambda$7, zEquityTradeLadderComposable$lambda$4, lastPriceFloatingButtonLabel, lastPriceIndex, headerString, headerString2, headerString3, lazyListState4, immutableListEquityTradeLadderComposable$lambda$13, composer2, (i3 & 14) | (i4 << 12) | (i4 << 18) | (i4 << 21) | (i4 << 24), OrderPillData.$stable);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, ComposableSingletons$EquityTradeLadderComposableKt.INSTANCE.getLambda$1112341090$feature_equity_trade_ladder_externalDebug(), composer, 819661824 | (LadderGestureConfiguration.$stable << 3), 256);
            EquityTradeLadderComposableKt.EquityTradeLadderScreenStates(EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$11(this.$ladderScreenState$delegate), EquityTradeLadderComposableKt.EquityTradeLadderComposable$lambda$0(this.$viewState$delegate), this.$duxo, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:159:0x044d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityTradeLadderScreenStates(final LadderScreenState ladderScreenState, final EquityTradeLadderViewState equityTradeLadderViewState, final EquityTradeLadderDuxo equityTradeLadderDuxo, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final EquityTradeLadderDuxo equityTradeLadderDuxo2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1727970461);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ladderScreenState) : composerStartRestartGroup.changedInstance(ladderScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(equityTradeLadderViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(equityTradeLadderDuxo) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            equityTradeLadderDuxo2 = equityTradeLadderDuxo;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1727970461, i2, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderScreenStates (EquityTradeLadderComposable.kt:236)");
            }
            if (ladderScreenState instanceof LadderScreenState.Ftux) {
                composerStartRestartGroup.startReplaceGroup(-1509669636);
                GenericLadderFtuxProgressState ftuxProgressState = equityTradeLadderViewState.getFtuxProgressState();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$19$lambda$18((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                AnimatedContentKt.AnimatedContent(ftuxProgressState, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(549599368, true, new C157962(equityTradeLadderDuxo), composerStartRestartGroup, 54), composer2, 1573248, 58);
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                if (ladderScreenState instanceof LadderScreenState.NewNux) {
                    composer2.startReplaceGroup(-1507762144);
                    StringResource disclosure = ((LadderScreenState.NewNux) ladderScreenState).getDisclosure();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$21$lambda$20(equityTradeLadderDuxo, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnPlaced = OnPlacedModifier3.onPlaced(companion, (Function1) objRememberedValue2);
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$23$lambda$22(equityTradeLadderDuxo);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$25$lambda$24(equityTradeLadderDuxo);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    EquityTradingLadderNuxScreen5.EquityTradingLadderNuxScreen(disclosure, function0, (Function0) objRememberedValue4, modifierOnPlaced, composer2, StringResource.$stable, 0);
                    composer2.endReplaceGroup();
                } else if (ladderScreenState instanceof LadderScreenState.ExistingNux) {
                    composer2.startReplaceGroup(-1507298570);
                    StringResource disclosure2 = ((LadderScreenState.ExistingNux) ladderScreenState).getDisclosure();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$27$lambda$26(equityTradeLadderDuxo, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnPlaced2 = OnPlacedModifier3.onPlaced(companion2, (Function1) objRememberedValue5);
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$29$lambda$28(equityTradeLadderDuxo);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function02 = (Function0) objRememberedValue6;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance6 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$31$lambda$30(equityTradeLadderDuxo);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    EquityTradingLadderNuxScreen5.EquityTradingLadderNuxScreen(disclosure2, function02, (Function0) objRememberedValue7, modifierOnPlaced2, composer2, StringResource.$stable, 0);
                    composer2.endReplaceGroup();
                } else if (ladderScreenState instanceof LadderScreenState.NuxLoading) {
                    composer2.startReplaceGroup(-1506834841);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance7 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$33$lambda$32(equityTradeLadderDuxo, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceGroup();
                    LoadingNux.LoadingNux(OnPlacedModifier3.onPlaced(companion3, (Function1) objRememberedValue8), null, composer2, 0, 2);
                    composer2.endReplaceGroup();
                } else if (ladderScreenState instanceof LadderScreenState.SlideUp) {
                    composer2.startReplaceGroup(-1506632349);
                    LadderScreenState.SlideUp slideUp = (LadderScreenState.SlideUp) ladderScreenState;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance8 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$10$1(equityTradeLadderDuxo);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue9;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance9 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChangedInstance9 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$11$1(equityTradeLadderDuxo);
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue10;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance10 = composer2.changedInstance(equityTradeLadderDuxo);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChangedInstance10 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$12$1(equityTradeLadderDuxo);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceGroup();
                    SlideUpScreen7.SlideUpScreen(slideUp, (Function2) kFunction2, (Function1) kFunction, (Function1) ((KFunction) objRememberedValue11), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    if (ladderScreenState instanceof LadderScreenState.BottomSheet) {
                        composer2.startReplaceGroup(-1506284436);
                        composer2.startMovableGroup(-1572610050, ladderScreenState);
                        LadderScreenState.BottomSheet bottomSheet = (LadderScreenState.BottomSheet) ladderScreenState;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance11 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChangedInstance11 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$13$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        composer2.endReplaceGroup();
                        Function2 function2 = (Function2) ((KFunction) objRememberedValue12);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance12 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (zChangedInstance12 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$14$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        composer2.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue13);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance13 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (zChangedInstance13 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$15$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        composer2.endReplaceGroup();
                        Function1 function12 = (Function1) ((KFunction) objRememberedValue14);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance14 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (zChangedInstance14 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue15 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$16$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        composer2.endReplaceGroup();
                        Function0 function03 = (Function0) ((KFunction) objRememberedValue15);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance15 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (zChangedInstance15 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue16 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$17$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        composer2.endReplaceGroup();
                        Function1 function13 = (Function1) ((KFunction) objRememberedValue16);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance16 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue17 = composer2.rememberedValue();
                        if (zChangedInstance16 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue17 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$18$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue17);
                        }
                        composer2.endReplaceGroup();
                        Function0 function04 = (Function0) ((KFunction) objRememberedValue17);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance17 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue18 = composer2.rememberedValue();
                        if (zChangedInstance17 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue18 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$19$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue18);
                        }
                        composer2.endReplaceGroup();
                        Function1 function14 = (Function1) ((KFunction) objRememberedValue18);
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance18 = composer2.changedInstance(equityTradeLadderDuxo);
                        Object objRememberedValue19 = composer2.rememberedValue();
                        if (zChangedInstance18 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue19 = new EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$20$1(equityTradeLadderDuxo);
                            composer2.updateRememberedValue(objRememberedValue19);
                        }
                        composer2.endReplaceGroup();
                        LadderBottomSheet.LadderBottomSheet(bottomSheet, equityTradeLadderViewState, function2, function1, function12, function03, function13, function04, function14, (Function0) ((KFunction) objRememberedValue19), null, composer2, i2 & 112, 0, 1024);
                        composer2.endMovableGroup();
                        composer2.endReplaceGroup();
                        equityTradeLadderDuxo2 = equityTradeLadderDuxo;
                    } else if (ladderScreenState instanceof LadderScreenState.AutoSendUpsell) {
                        composer2.startReplaceGroup(-1505475305);
                        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                        SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer2, 6, 2);
                        composer2.startReplaceGroup(5004770);
                        equityTradeLadderDuxo2 = equityTradeLadderDuxo;
                        boolean zChangedInstance19 = composer2.changedInstance(equityTradeLadderDuxo2);
                        Object objRememberedValue20 = composer2.rememberedValue();
                        if (zChangedInstance19 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue20 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$46$lambda$45(equityTradeLadderDuxo2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue20);
                        }
                        composer2.endReplaceGroup();
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue20, modifierStatusBarsPadding, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(2074269106, true, new C1579722(equityTradeLadderDuxo2), composer2, 54), composer2, 1572864, 52);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                    } else {
                        equityTradeLadderDuxo2 = equityTradeLadderDuxo;
                        composer2.startReplaceGroup(-1504551133);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            equityTradeLadderDuxo2 = equityTradeLadderDuxo;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradeLadderComposableKt.EquityTradeLadderScreenStates$lambda$47(ladderScreenState, equityTradeLadderViewState, equityTradeLadderDuxo2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform EquityTradeLadderScreenStates$lambda$19$lambda$18(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (AnimatedContent.getTargetState() == 0) {
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(tweenSpecTween$default, 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(tweenSpecTween$default, 0.0f, 2, null));
        }
        return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
    }

    /* compiled from: EquityTradeLadderComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$2 */
    static final class C157962 implements Function4<AnimatedContentScope, GenericLadderFtuxProgressState, Composer, Integer, Unit> {
        final /* synthetic */ EquityTradeLadderDuxo $duxo;

        C157962(EquityTradeLadderDuxo equityTradeLadderDuxo) {
            this.$duxo = equityTradeLadderDuxo;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, GenericLadderFtuxProgressState genericLadderFtuxProgressState, Composer composer, Integer num) {
            invoke(animatedContentScope, genericLadderFtuxProgressState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, GenericLadderFtuxProgressState genericLadderFtuxProgressState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(549599368, i, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderScreenStates.<anonymous> (EquityTradeLadderComposable.kt:251)");
            }
            if (genericLadderFtuxProgressState != null) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo = this.$duxo;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157962.invoke$lambda$1$lambda$0(equityTradeLadderDuxo);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157962.invoke$lambda$3$lambda$2(equityTradeLadderDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
                final EquityTradeLadderDuxo equityTradeLadderDuxo3 = this.$duxo;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityTradeLadderComposableKt.C157962.invoke$lambda$5$lambda$4(equityTradeLadderDuxo3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                LadderFtuxUi6.LadderFtuxUi(genericLadderFtuxProgressState, function0, function02, (Function0) objRememberedValue3, WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), composer, (i >> 3) & 14, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EquityTradeLadderDuxo equityTradeLadderDuxo) {
            equityTradeLadderDuxo.onUserInteraction(LadderInteraction.ContinueToNextFtuxState.INSTANCE, EquityLadderUserInteractionData.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EquityTradeLadderDuxo equityTradeLadderDuxo) {
            equityTradeLadderDuxo.onUserInteraction(LadderInteraction.BackToPreviousFtuxState.INSTANCE, EquityLadderUserInteractionData.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(EquityTradeLadderDuxo equityTradeLadderDuxo) {
            equityTradeLadderDuxo.onUserInteraction(LadderInteraction.ExitFtux.INSTANCE, EquityLadderUserInteractionData.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$21$lambda$20(EquityTradeLadderDuxo equityTradeLadderDuxo, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityTradeLadderDuxo.onNuxSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$23$lambda$22(EquityTradeLadderDuxo equityTradeLadderDuxo) {
        equityTradeLadderDuxo.onNewNuxContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$25$lambda$24(EquityTradeLadderDuxo equityTradeLadderDuxo) {
        equityTradeLadderDuxo.onNewNuxBackClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$27$lambda$26(EquityTradeLadderDuxo equityTradeLadderDuxo, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityTradeLadderDuxo.onNuxSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$29$lambda$28(EquityTradeLadderDuxo equityTradeLadderDuxo) {
        equityTradeLadderDuxo.onExistingNuxContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$31$lambda$30(EquityTradeLadderDuxo equityTradeLadderDuxo) {
        equityTradeLadderDuxo.onExistingNuxBackClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$33$lambda$32(EquityTradeLadderDuxo equityTradeLadderDuxo, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityTradeLadderDuxo.onLoadingNuxSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityTradeLadderScreenStates$lambda$46$lambda$45(EquityTradeLadderDuxo equityTradeLadderDuxo) {
        equityTradeLadderDuxo.onAutosendUpsellDismissed();
        equityTradeLadderDuxo.advanceScreenState(null);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$22 */
    static final class C1579722 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ EquityTradeLadderDuxo $duxo;

        C1579722(EquityTradeLadderDuxo equityTradeLadderDuxo) {
            this.$duxo = equityTradeLadderDuxo;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2074269106, i2, -1, "com.robinhood.android.equitytradeladder.EquityTradeLadderScreenStates.<anonymous> (EquityTradeLadderComposable.kt:353)");
            }
            composer.startReplaceGroup(-1633490746);
            int i3 = i2 & 14;
            boolean z = true;
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | (i3 == 4 || ((i2 & 8) != 0 && composer.changedInstance(RhModalBottomSheet)));
            final EquityTradeLadderDuxo equityTradeLadderDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$22$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderComposableKt.C1579722.invoke$lambda$1$lambda$0(equityTradeLadderDuxo, RhModalBottomSheet);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            if (i3 != 4 && ((i2 & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                z = false;
            }
            Object objRememberedValue2 = composer.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$22$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderComposableKt.C1579722.invoke$lambda$3$lambda$2(RhModalBottomSheet);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AutoSendUpsellBottomSheet.AutoSendUpsellBottomSheet(function0, (Function0) objRememberedValue2, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EquityTradeLadderDuxo equityTradeLadderDuxo, RhModalBottomSheet5 rhModalBottomSheet5) {
            equityTradeLadderDuxo.setScreenState(new LadderScreenState.SlideUp.IdentiAgreement(null, true, true, null, 9, null), false);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
