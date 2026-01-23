package com.robinhood.android.equities.taxlots;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.equities.taxlots.SelectLotsComposableKt;
import com.robinhood.android.equities.taxlots.SelectLotsEvent;
import com.robinhood.android.equities.taxlots.SelectLotsKey;
import com.robinhood.android.equities.taxlots.alert.TaxLotsIntraDayLotAlert;
import com.robinhood.android.equities.taxlots.alert.TaxLotsLimitOrderFractionalLotsAlert;
import com.robinhood.android.equities.taxlots.alert.TaxLotsMarketOrderFractionalLotsAlert;
import com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlert;
import com.robinhood.android.equities.taxlots.alert.TaxLotsNotEnoughShares;
import com.robinhood.android.equities.taxlots.alert.TaxLotsUnsavedLotsAlert;
import com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBar;
import com.robinhood.android.equities.taxlots.appbar.TaxLotsTopAppBarNestedScrollConnection;
import com.robinhood.android.equities.taxlots.footer.FooterComposable6;
import com.robinhood.android.equities.taxlots.footer.FooterDuxo;
import com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRow2;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers4;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableKt;
import com.robinhood.android.equities.taxlots.table.TaxLotsTableViewState;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayoutV2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SelectLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u001a7\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\u0012\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002"}, m3636d2 = {"SelectLotsComposable", "", "dismissFragment", "Lkotlin/Function0;", "onReviewOrder", "Lkotlin/Function1;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "duxo", "Lcom/robinhood/android/equities/taxlots/SelectLotsDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/equities/taxlots/SelectLotsDuxo;Landroidx/compose/runtime/Composer;I)V", "viewState", "Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;", "events", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "setKeyboardVisible", "", "requestNextPage", "resetToInitialSelection", "setSelectionStrategy", "Lkotlin/Function2;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "Ljava/math/BigDecimal;", "onSelectionStrategyAlertDismiss", "onNotEnoughSharesAlertDismiss", "(Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewSelectLotsComposable", "(Lcom/robinhood/android/equities/taxlots/SelectLotsViewState;Landroidx/compose/runtime/Composer;I)V", "HIDE_KEYBOARD_TEST_TAG", "", "SELECT_LOTS_NUMPAD_TEST_TAG", "lib-tax-lots_externalDebug", "scrollToTop", "eventState", "showMarketOrderFractionalLotAlert", "showLimitOrderFractionalLotAlert", "showIntraDayLotOrderAlert", "showUnsavedAlert", "showInvalidNumberOfSharesFooter"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SelectLotsComposableKt {
    public static final String HIDE_KEYBOARD_TEST_TAG = "hide_keyboard";
    public static final String SELECT_LOTS_NUMPAD_TEST_TAG = "select_lots_numpad";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectLotsComposable$lambda$47(SelectLotsViewState selectLotsViewState, int i, Composer composer, int i2) {
        PreviewSelectLotsComposable(selectLotsViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$46(SelectLotsViewState selectLotsViewState, StateFlow stateFlow, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function2 function2, Function0 function04, Function0 function05, int i, Composer composer, int i2) {
        SelectLotsComposable(selectLotsViewState, stateFlow, function0, function1, function12, function02, function03, function2, function04, function05, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$6(Function0 function0, Function1 function1, SelectLotsDuxo selectLotsDuxo, int i, Composer composer, int i2) {
        SelectLotsComposable(function0, function1, selectLotsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SelectLotsComposable(final Function0<Unit> dismissFragment, final Function1<? super SelectLotsKey.Result, Unit> onReviewOrder, final SelectLotsDuxo duxo, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(dismissFragment, "dismissFragment");
        Intrinsics.checkNotNullParameter(onReviewOrder, "onReviewOrder");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(300931317);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dismissFragment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onReviewOrder) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(300931317, i2, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable (SelectLotsComposable.kt:79)");
            }
            SelectLotsViewState selectLotsViewState = (SelectLotsViewState) FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            int i3 = i2;
            StateFlow<Event<SelectLotsEvent>> eventFlow = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SelectLotsComposableKt$SelectLotsComposable$1$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SelectLotsComposableKt$SelectLotsComposable$2$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new SelectLotsComposableKt$SelectLotsComposable$3$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) objRememberedValue3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new SelectLotsComposableKt$SelectLotsComposable$4$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function2 function2 = (Function2) ((KFunction) objRememberedValue4);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new SelectLotsComposableKt$SelectLotsComposable$5$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function03 = (Function0) ((KFunction) objRememberedValue5);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new SelectLotsComposableKt$SelectLotsComposable$6$1(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            SelectLotsComposable(selectLotsViewState, eventFlow, dismissFragment, onReviewOrder, function1, function0, function02, function2, function03, (Function0) ((KFunction) objRememberedValue6), composerStartRestartGroup, (i3 << 6) & 8064);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectLotsComposableKt.SelectLotsComposable$lambda$6(dismissFragment, onReviewOrder, duxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Event<SelectLotsEvent> SelectLotsComposable$lambda$10(SnapshotState4<Event<SelectLotsEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean SelectLotsComposable$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean SelectLotsComposable$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean SelectLotsComposable$lambda$19(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean SelectLotsComposable$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal SelectLotsComposable$lambda$25(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SelectLotsComposable$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: SelectLotsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10 */
    static final class C1482310 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $dismissFragment;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ InteractionSource3 $interactionSource;
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ Function1<SelectLotsKey.Result, Unit> $onReviewOrder;
        final /* synthetic */ Function0<Unit> $requestNextPage;
        final /* synthetic */ LazyListState $scrollState;
        final /* synthetic */ Function1<Boolean, Unit> $setKeyboardVisible;
        final /* synthetic */ Function2<SelectionStrategy, BigDecimal, Unit> $setSelectionStrategy;
        final /* synthetic */ SnapshotState<BigDecimal> $showInvalidNumberOfSharesFooter$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showLimitOrderFractionalLotAlert$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showMarketOrderFractionalLotAlert$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showUnsavedAlert$delegate;
        final /* synthetic */ TaxLotsTopAppBarNestedScrollConnection $topAppBarNestedScrollConnection;
        final /* synthetic */ SelectLotsViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C1482310(SelectLotsViewState selectLotsViewState, TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, InteractionSource3 interactionSource3, FocusManager focusManager, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, Function1<? super SelectLotsKey.Result, Unit> function12, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<BigDecimal> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Boolean> snapshotState4, Function2<? super SelectionStrategy, ? super BigDecimal, Unit> function2, Function0<Unit> function02, BentoNumpadScopeV22 bentoNumpadScopeV22, LazyListState lazyListState) {
            this.$viewState = selectLotsViewState;
            this.$topAppBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection;
            this.$interactionSource = interactionSource3;
            this.$focusManager = focusManager;
            this.$setKeyboardVisible = function1;
            this.$dismissFragment = function0;
            this.$showUnsavedAlert$delegate = snapshotState;
            this.$onReviewOrder = function12;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$showInvalidNumberOfSharesFooter$delegate = snapshotState2;
            this.$showMarketOrderFractionalLotAlert$delegate = snapshotState3;
            this.$showLimitOrderFractionalLotAlert$delegate = snapshotState4;
            this.$setSelectionStrategy = function2;
            this.$requestNextPage = function02;
            this.$numpadScope = bentoNumpadScopeV22;
            this.$scrollState = lazyListState;
        }

        /* compiled from: SelectLotsComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$4, reason: invalid class name */
        static final class AnonymousClass4 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
            final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
            final /* synthetic */ Function0<Unit> $requestNextPage;
            final /* synthetic */ LazyListState $scrollState;
            final /* synthetic */ Function1<Boolean, Unit> $setKeyboardVisible;
            final /* synthetic */ Function2<SelectionStrategy, BigDecimal, Unit> $setSelectionStrategy;
            final /* synthetic */ SnapshotState<BigDecimal> $showInvalidNumberOfSharesFooter$delegate;
            final /* synthetic */ SelectLotsViewState $viewState;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(SelectLotsViewState selectLotsViewState, Function2<? super SelectionStrategy, ? super BigDecimal, Unit> function2, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, BentoNumpadScopeV22 bentoNumpadScopeV22, LazyListState lazyListState, SnapshotState<BigDecimal> snapshotState) {
                this.$viewState = selectLotsViewState;
                this.$setSelectionStrategy = function2;
                this.$eventDescriptor = userInteractionEventDescriptor;
                this.$setKeyboardVisible = function1;
                this.$requestNextPage = function0;
                this.$numpadScope = bentoNumpadScopeV22;
                this.$scrollState = lazyListState;
                this.$showInvalidNumberOfSharesFooter$delegate = snapshotState;
            }

            public final void invoke(PaddingValues padding, Composer composer, int i) {
                int i2;
                EquityOrderContext equity_order_context;
                Intrinsics.checkNotNullParameter(padding, "padding");
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(padding) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(893679194, i2, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable.<anonymous>.<anonymous> (SelectLotsComposable.kt:270)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(companion, padding);
                SelectLotsViewState selectLotsViewState = this.$viewState;
                Function2<SelectionStrategy, BigDecimal, Unit> function2 = this.$setSelectionStrategy;
                UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                Function1<Boolean, Unit> function1 = this.$setKeyboardVisible;
                Function0<Unit> function0 = this.$requestNextPage;
                BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
                LazyListState lazyListState = this.$scrollState;
                final SnapshotState<BigDecimal> snapshotState = this.$showInvalidNumberOfSharesFooter$delegate;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer.startReplaceGroup(-1436636976);
                if (selectLotsViewState.getM1Experiment() && !selectLotsViewState.getSelectionStrategies().isEmpty()) {
                    TaxLotSelectionMethodRow2.TaxLotSelectionMethodRow(selectLotsViewState.getSelectionStrategies(), function2, composer, 0);
                }
                composer.endReplaceGroup();
                Context contextCopy$default = null;
                equityOrderContextCopy = null;
                EquityOrderContext equityOrderContextCopy = null;
                Modifier modifierZIndex = ZIndexModifier2.zIndex(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), -1.0f);
                Context context = userInteractionEventDescriptor.getContext();
                if (context != null) {
                    Context context2 = userInteractionEventDescriptor.getContext();
                    if (context2 != null && (equity_order_context = context2.getEquity_order_context()) != null) {
                        equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : selectLotsViewState.getTaxLotsLoggingContext(), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                    }
                    contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierZIndex, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, contextCopy$default, null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                GenericTableData<TaxLotsTableHelpers4> tableData = ((TaxLotsTableViewState.Loaded) selectLotsViewState.getTableState()).getTableData();
                boolean canRequestNextPage = ((TaxLotsTableViewState.Loaded) selectLotsViewState.getTableState()).getCanRequestNextPage();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelectLotsComposableKt.C1482310.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(snapshotState, (BigDecimal) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                TaxLotsTableKt.TaxLotsTable(tableData, canRequestNextPage, function1, function0, bentoNumpadScopeV22, modifierAutoLogEvents$default, lazyListState, (Function1) objRememberedValue, composer, (BentoNumpadScopeV22.$stable << 12) | 12582912 | GenericTableData.$stable, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, BigDecimal bigDecimal) {
                SelectLotsComposableKt.SelectLotsComposable$lambda$26(snapshotState, bigDecimal);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
            invoke(bentoNumpadScopeV2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1960673322, i, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable.<anonymous> (SelectLotsComposable.kt:158)");
            }
            TaxLotsTableViewState tableState = this.$viewState.getTableState();
            if (tableState instanceof TaxLotsTableViewState.Loading) {
                composer.startReplaceGroup(-1283577239);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), true, true, 0, composer, 438, 8);
                composer.endReplaceGroup();
            } else {
                if (!(tableState instanceof TaxLotsTableViewState.Loaded)) {
                    composer.startReplaceGroup(-1283571292);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1135691534);
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(NestedScrollModifier7.nestedScroll$default(Modifier.INSTANCE, this.$topAppBarNestedScrollConnection, null, 2, null), 0.0f, 1, null), "hide_keyboard");
                InteractionSource3 interactionSource3 = this.$interactionSource;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$focusManager) | composer.changed(this.$setKeyboardVisible);
                final FocusManager focusManager = this.$focusManager;
                final Function1<Boolean, Unit> function1 = this.$setKeyboardVisible;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SelectLotsComposableKt.C1482310.invoke$lambda$1$lambda$0(focusManager, function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag, interactionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierM4891clickableO2vRcR0$default, ComposableLambda3.rememberComposableLambda(1924494031, true, new AnonymousClass2(this.$viewState, this.$dismissFragment, this.$topAppBarNestedScrollConnection, this.$showUnsavedAlert$delegate), composer, 54), ComposableLambda3.rememberComposableLambda(1975179024, true, new AnonymousClass3(this.$viewState, this.$focusManager, this.$setKeyboardVisible, this.$onReviewOrder, this.$eventLogger, this.$eventDescriptor, this.$showInvalidNumberOfSharesFooter$delegate, this.$showMarketOrderFractionalLotAlert$delegate, this.$showLimitOrderFractionalLotAlert$delegate), composer, 54), null, null, 0, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(893679194, true, new AnonymousClass4(this.$viewState, this.$setSelectionStrategy, this.$eventDescriptor, this.$setKeyboardVisible, this.$requestNextPage, this.$numpadScope, this.$scrollState, this.$showInvalidNumberOfSharesFooter$delegate), composer, 54), composer, 805306800, EnumC7081g.f2774x74902ae0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, Function1 function1) {
            focusManager.clearFocus(true);
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        /* compiled from: SelectLotsComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Function0<Unit> $dismissFragment;
            final /* synthetic */ SnapshotState<Boolean> $showUnsavedAlert$delegate;
            final /* synthetic */ TaxLotsTopAppBarNestedScrollConnection $topAppBarNestedScrollConnection;
            final /* synthetic */ SelectLotsViewState $viewState;

            AnonymousClass2(SelectLotsViewState selectLotsViewState, Function0<Unit> function0, TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection, SnapshotState<Boolean> snapshotState) {
                this.$viewState = selectLotsViewState;
                this.$dismissFragment = function0;
                this.$topAppBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection;
                this.$showUnsavedAlert$delegate = snapshotState;
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
                    ComposerKt.traceEventStart(1924494031, i, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable.<anonymous>.<anonymous> (SelectLotsComposable.kt:181)");
                }
                UUID instrumentId = this.$viewState.getInstrumentId();
                String accountNumber = this.$viewState.getAccountNumber();
                UUID orderId = this.$viewState.getOrderId();
                TaxLotStatus taxLotStatus = TaxLotStatus.OPEN;
                TaxLotsContext taxLotsLoggingContext = this.$viewState.getTaxLotsLoggingContext();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changed(this.$dismissFragment);
                final SelectLotsViewState selectLotsViewState = this.$viewState;
                final Function0<Unit> function0 = this.$dismissFragment;
                final SnapshotState<Boolean> snapshotState = this.$showUnsavedAlert$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SelectLotsComposableKt.C1482310.AnonymousClass2.invoke$lambda$1$lambda$0(selectLotsViewState, function0, snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                TaxLotsTopAppBar.TaxLotsTopAppBar(accountNumber, orderId, instrumentId, taxLotStatus, taxLotsLoggingContext, (Function0) objRememberedValue, this.$topAppBarNestedScrollConnection, null, null, composer, 3072, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SelectLotsViewState selectLotsViewState, Function0 function0, SnapshotState snapshotState) {
                if (selectLotsViewState.getShowUnsavedAlert()) {
                    SelectLotsComposableKt.SelectLotsComposable$lambda$23(snapshotState, true);
                } else {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: SelectLotsComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ FocusManager $focusManager;
            final /* synthetic */ Function1<SelectLotsKey.Result, Unit> $onReviewOrder;
            final /* synthetic */ Function1<Boolean, Unit> $setKeyboardVisible;
            final /* synthetic */ SnapshotState<BigDecimal> $showInvalidNumberOfSharesFooter$delegate;
            final /* synthetic */ SnapshotState<Boolean> $showLimitOrderFractionalLotAlert$delegate;
            final /* synthetic */ SnapshotState<Boolean> $showMarketOrderFractionalLotAlert$delegate;
            final /* synthetic */ SelectLotsViewState $viewState;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(SelectLotsViewState selectLotsViewState, FocusManager focusManager, Function1<? super Boolean, Unit> function1, Function1<? super SelectLotsKey.Result, Unit> function12, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<BigDecimal> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3) {
                this.$viewState = selectLotsViewState;
                this.$focusManager = focusManager;
                this.$setKeyboardVisible = function1;
                this.$onReviewOrder = function12;
                this.$eventLogger = eventLogger;
                this.$eventDescriptor = userInteractionEventDescriptor;
                this.$showInvalidNumberOfSharesFooter$delegate = snapshotState;
                this.$showMarketOrderFractionalLotAlert$delegate = snapshotState2;
                this.$showLimitOrderFractionalLotAlert$delegate = snapshotState3;
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
                    ComposerKt.traceEventStart(1975179024, i, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable.<anonymous>.<anonymous> (SelectLotsComposable.kt:202)");
                }
                if (!this.$viewState.getReadOnly()) {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Divider5.m5851HorizontalDivider9IZ8Weo(null, 0.0f, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), composer, 0, 3);
                    FooterDuxo.Args args = new FooterDuxo.Args(this.$viewState.getAccountNumber(), this.$viewState.getOrderId(), this.$viewState.getInstrumentId(), SelectLotsComposableKt.SelectLotsComposable$lambda$25(this.$showInvalidNumberOfSharesFooter$delegate));
                    composer.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$focusManager) | composer.changed(this.$setKeyboardVisible) | composer.changed(this.$onReviewOrder) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor);
                    final SelectLotsViewState selectLotsViewState = this.$viewState;
                    final FocusManager focusManager = this.$focusManager;
                    final Function1<Boolean, Unit> function1 = this.$setKeyboardVisible;
                    final Function1<SelectLotsKey.Result, Unit> function12 = this.$onReviewOrder;
                    final EventLogger eventLogger = this.$eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                    final SnapshotState<Boolean> snapshotState = this.$showMarketOrderFractionalLotAlert$delegate;
                    final SnapshotState<Boolean> snapshotState2 = this.$showLimitOrderFractionalLotAlert$delegate;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$10$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SelectLotsComposableKt.C1482310.AnonymousClass3.invoke$lambda$1$lambda$0(selectLotsViewState, focusManager, function1, function12, eventLogger, userInteractionEventDescriptor, snapshotState, snapshotState2);
                            }
                        };
                        composer.updateRememberedValue(function0);
                        objRememberedValue = function0;
                    }
                    composer.endReplaceGroup();
                    FooterComposable6.FooterComposable(args, (Function0) objRememberedValue, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0), null, composer, 0, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SelectLotsViewState selectLotsViewState, FocusManager focusManager, Function1 function1, Function1 function12, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState snapshotState, SnapshotState snapshotState2) {
                EquityOrderContext equity_order_context;
                if (selectLotsViewState.getShouldShowMarketOrderFractionalLotAlert()) {
                    SelectLotsComposableKt.SelectLotsComposable$lambda$14(snapshotState, true);
                } else if (selectLotsViewState.getKeyboardVisible()) {
                    focusManager.clearFocus(true);
                    function1.invoke(Boolean.FALSE);
                } else if (selectLotsViewState.getShouldShowLimitOrderFractionalLotAlert()) {
                    SelectLotsComposableKt.SelectLotsComposable$lambda$17(snapshotState2, true);
                } else if (selectLotsViewState.getShouldAdvanceToReview()) {
                    function12.invoke(new SelectLotsKey.Result.Review(selectLotsViewState.getNumberOfShares(), selectLotsViewState.getSelectedTaxLots()));
                } else {
                    Context context = userInteractionEventDescriptor.getContext();
                    Context contextCopy$default = null;
                    equityOrderContextCopy = null;
                    EquityOrderContext equityOrderContextCopy = null;
                    if (context != null) {
                        Context context2 = userInteractionEventDescriptor.getContext();
                        if (context2 != null && (equity_order_context = context2.getEquity_order_context()) != null) {
                            equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : selectLotsViewState.getTaxLotsLoggingContext(), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                        }
                        contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                    }
                    EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.CONTINUE, contextCopy$default, new Component(Component.ComponentType.BUTTON, "tax_lots.table.continue", null, 4, null), null, 35, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                    function12.invoke(new SelectLotsKey.Result.Complete(selectLotsViewState.getNumberOfShares(), selectLotsViewState.getSelectedTaxLots()));
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final void SelectLotsComposable(SelectLotsViewState viewState, final StateFlow<Event<SelectLotsEvent>> events, final Function0<Unit> dismissFragment, final Function1<? super SelectLotsKey.Result, Unit> onReviewOrder, final Function1<? super Boolean, Unit> setKeyboardVisible, final Function0<Unit> requestNextPage, Function0<Unit> resetToInitialSelection, final Function2<? super SelectionStrategy, ? super BigDecimal, Unit> setSelectionStrategy, final Function0<Unit> onSelectionStrategyAlertDismiss, Function0<Unit> onNotEnoughSharesAlertDismiss, Composer composer, final int i) {
        int i2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState;
        int i3;
        TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection;
        final BentoNumpadScopeV22 bentoNumpadScopeV22;
        final CoroutineScope coroutineScope;
        SnapshotState snapshotState2;
        SelectLotsViewState selectLotsViewState;
        Composer composer2;
        int i4;
        int i5;
        final Function0<Unit> function0;
        final Function0<Unit> function02;
        String str;
        EventConsumer<SelectLotsEvent> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(dismissFragment, "dismissFragment");
        Intrinsics.checkNotNullParameter(onReviewOrder, "onReviewOrder");
        Intrinsics.checkNotNullParameter(setKeyboardVisible, "setKeyboardVisible");
        Intrinsics.checkNotNullParameter(requestNextPage, "requestNextPage");
        Intrinsics.checkNotNullParameter(resetToInitialSelection, "resetToInitialSelection");
        Intrinsics.checkNotNullParameter(setSelectionStrategy, "setSelectionStrategy");
        Intrinsics.checkNotNullParameter(onSelectionStrategyAlertDismiss, "onSelectionStrategyAlertDismiss");
        Intrinsics.checkNotNullParameter(onNotEnoughSharesAlertDismiss, "onNotEnoughSharesAlertDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1159527195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(events) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissFragment) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onReviewOrder) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(setKeyboardVisible) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(requestNextPage) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(resetToInitialSelection) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(setSelectionStrategy) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectionStrategyAlertDismiss) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNotEnoughSharesAlertDismiss) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            function02 = resetToInitialSelection;
            function0 = onNotEnoughSharesAlertDismiss;
            selectLotsViewState = viewState;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1159527195, i2, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable (SelectLotsComposable.kt:107)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i6 = i2;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(events, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, (i2 >> 3) & 14, 7);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new BentoNumpadScopeV22(coroutineScope2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BentoNumpadScopeV22 bentoNumpadScopeV222 = (BentoNumpadScopeV22) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                snapshotMutationPolicy = null;
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                snapshotState = snapshotState5;
                i3 = 2;
                objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                snapshotState = snapshotState5;
                i3 = 2;
            }
            final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                objRememberedValue7 = snapshotStateMutableStateOf$default;
            }
            final SnapshotState snapshotState7 = (SnapshotState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotState3.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            SnapshotState snapshotState8 = (SnapshotState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue9;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new TaxLotsTopAppBarNestedScrollConnection(lazyListStateRememberLazyListState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection2 = (TaxLotsTopAppBarNestedScrollConnection) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            final Event<SelectLotsEvent> eventSelectLotsComposable$lambda$10 = SelectLotsComposable$lambda$10(snapshotState4CollectAsStateWithLifecycle);
            if (eventSelectLotsComposable$lambda$10 != null) {
                if (!(eventSelectLotsComposable$lambda$10.getData() instanceof SelectLotsEvent) || (eventConsumerInvoke = eventSelectLotsComposable$lambda$10.getGetEventConsumer().invoke()) == null) {
                    taxLotsTopAppBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection2;
                    bentoNumpadScopeV22 = bentoNumpadScopeV222;
                    coroutineScope = coroutineScope2;
                    snapshotState2 = snapshotState3;
                } else {
                    bentoNumpadScopeV22 = bentoNumpadScopeV222;
                    coroutineScope = coroutineScope2;
                    taxLotsTopAppBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection2;
                    snapshotState2 = snapshotState3;
                    eventConsumerInvoke.consume(eventSelectLotsComposable$lambda$10, new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13584invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13584invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            SelectLotsEvent selectLotsEvent = (SelectLotsEvent) eventSelectLotsComposable$lambda$10.getData();
                            if (Intrinsics.areEqual(selectLotsEvent, SelectLotsEvent.ScrollToTop.INSTANCE)) {
                                SelectLotsComposableKt.SelectLotsComposable$lambda$9(snapshotState3, true);
                            } else if (selectLotsEvent instanceof SelectLotsEvent.SelectionStrategyChange) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SelectLotsComposableKt$SelectLotsComposable$8$1(selectLotsEvent, bentoNumpadScopeV22, null), 3, null);
                            } else if (Intrinsics.areEqual(selectLotsEvent, SelectLotsEvent.ShowIntraDayLotsOrderAlert.INSTANCE)) {
                                SelectLotsComposableKt.SelectLotsComposable$lambda$20(snapshotState6, true);
                            }
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            } else {
                taxLotsTopAppBarNestedScrollConnection = taxLotsTopAppBarNestedScrollConnection2;
                bentoNumpadScopeV22 = bentoNumpadScopeV222;
                coroutineScope = coroutineScope2;
                snapshotState2 = snapshotState3;
            }
            composerStartRestartGroup.startReplaceGroup(1909173604);
            if (SelectLotsComposable$lambda$8(snapshotState2)) {
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new SelectLotsComposableKt$SelectLotsComposable$9$1(lazyListStateRememberLazyListState, snapshotState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
            final SnapshotState snapshotState9 = snapshotState;
            TaxLotsTopAppBarNestedScrollConnection taxLotsTopAppBarNestedScrollConnection3 = taxLotsTopAppBarNestedScrollConnection;
            BentoNumpadScopeV22 bentoNumpadScopeV223 = bentoNumpadScopeV22;
            C1482310 c1482310 = new C1482310(viewState, taxLotsTopAppBarNestedScrollConnection3, interactionSource3, focusManager, setKeyboardVisible, dismissFragment, snapshotState7, onReviewOrder, current, userInteractionEventDescriptor, snapshotState8, snapshotState4, snapshotState9, setSelectionStrategy, requestNextPage, bentoNumpadScopeV223, lazyListStateRememberLazyListState);
            selectLotsViewState = viewState;
            composer2 = composerStartRestartGroup;
            BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV223, ComposableLambda3.rememberComposableLambda(1960673322, true, c1482310, composer2, 54), modifierNavigationBarsPadding, coroutineScope, ComposableLambda3.rememberComposableLambda(1448154951, true, new C1482411(selectLotsViewState, bentoNumpadScopeV223), composer2, 54), composer2, BentoNumpadScopeV22.$stable | 24624, 0);
            if (SelectLotsComposable$lambda$19(snapshotState6)) {
                composer2.startReplaceGroup(1909481060);
                composer2.startReplaceGroup(5004770);
                Object objRememberedValue12 = composer2.rememberedValue();
                if (objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SelectLotsComposableKt.SelectLotsComposable$lambda$32$lambda$31(snapshotState6);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue12);
                }
                composer2.endReplaceGroup();
                i4 = 0;
                TaxLotsIntraDayLotAlert.TaxLotsIntraDayLotAlert(true, (Function0) objRememberedValue12, composer2, 54, 0);
                composer2.endReplaceGroup();
                function02 = resetToInitialSelection;
                function0 = onNotEnoughSharesAlertDismiss;
                i5 = -1633490746;
            } else {
                i4 = 0;
                if (selectLotsViewState.getSetSelectionStrategyFailure() != null) {
                    composer2.startReplaceGroup(-935445545);
                    final SetSelectionStrategyFailure setSelectionStrategyFailure = selectLotsViewState.getSetSelectionStrategyFailure();
                    String plainString = setSelectionStrategyFailure.getMaxNumberOfShares().toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    SelectionStrategy selectionStrategy = setSelectionStrategyFailure.getSelectionStrategy();
                    StringResource estGainLoss = setSelectionStrategyFailure.getEstGainLoss();
                    Resources resources = ((android.content.Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String string2 = estGainLoss.getText(resources).toString();
                    boolean z = true;
                    int maxNumberOfTaxLots = selectLotsViewState.getMaxNumberOfTaxLots();
                    i5 = -1633490746;
                    composer2.startReplaceGroup(-1633490746);
                    if ((i6 & 29360128) != 8388608) {
                        z = false;
                    }
                    boolean zChangedInstance = z | composer2.changedInstance(setSelectionStrategyFailure);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue13 == companion.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SelectLotsComposableKt.SelectLotsComposable$lambda$34$lambda$33(setSelectionStrategy, setSelectionStrategyFailure);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    composer2.endReplaceGroup();
                    TaxLotsMaximumSelectedLotsAlert.TaxLotsSelectionStrategyMaximumSelectedLotsAlert(plainString, string2, selectionStrategy, maxNumberOfTaxLots, (Function0) objRememberedValue13, onSelectionStrategyAlertDismiss, null, composer2, (i6 >> 9) & 458752, 64);
                    composer2.endReplaceGroup();
                } else {
                    boolean z2 = true;
                    i5 = -1633490746;
                    if (SelectLotsComposable$lambda$13(snapshotState4)) {
                        composer2.startReplaceGroup(1909512954);
                        String symbol = selectLotsViewState.getSymbol();
                        str = symbol != null ? symbol : "";
                        composer2.startReplaceGroup(5004770);
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (objRememberedValue14 == companion.getEmpty()) {
                            objRememberedValue14 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelectLotsComposableKt.SelectLotsComposable$lambda$36$lambda$35(snapshotState4);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        composer2.endReplaceGroup();
                        TaxLotsMarketOrderFractionalLotsAlert.TaxLotsMarketOrderFractionalLotsAlert(str, (Function0) objRememberedValue14, composer2, 48);
                        composer2.endReplaceGroup();
                    } else if (SelectLotsComposable$lambda$16(snapshotState9)) {
                        composer2.startReplaceGroup(1909519456);
                        composer2.startReplaceGroup(5004770);
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (objRememberedValue15 == companion.getEmpty()) {
                            objRememberedValue15 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelectLotsComposableKt.SelectLotsComposable$lambda$38$lambda$37(snapshotState9);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        composer2.endReplaceGroup();
                        TaxLotsLimitOrderFractionalLotsAlert.TaxLotsLimitOrderFractionalLotsAlert((Function0) objRememberedValue15, composer2, 6);
                        composer2.endReplaceGroup();
                    } else if (selectLotsViewState.getShowNotEnoughSharesDialog() != null) {
                        composer2.startReplaceGroup(1909524621);
                        String symbol2 = selectLotsViewState.getSymbol();
                        str = symbol2 != null ? symbol2 : "";
                        BigDecimal sharesAvailableForSellsTaxLots = selectLotsViewState.getShowNotEnoughSharesDialog().getSharesAvailableForSellsTaxLots();
                        composer2.startReplaceGroup(5004770);
                        if ((i6 & 1879048192) != 536870912) {
                            z2 = false;
                        }
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (z2 || objRememberedValue16 == companion.getEmpty()) {
                            function0 = onNotEnoughSharesAlertDismiss;
                            objRememberedValue16 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelectLotsComposableKt.SelectLotsComposable$lambda$40$lambda$39(function0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue16);
                        } else {
                            function0 = onNotEnoughSharesAlertDismiss;
                        }
                        composer2.endReplaceGroup();
                        TaxLotsNotEnoughShares.TaxLotsNotEnoughSharesAlert(str, sharesAvailableForSellsTaxLots, (Function0) objRememberedValue16, composer2, 0);
                        composer2.endReplaceGroup();
                        function02 = resetToInitialSelection;
                    } else {
                        function0 = onNotEnoughSharesAlertDismiss;
                        if (SelectLotsComposable$lambda$22(snapshotState7)) {
                            composer2.startReplaceGroup(1909532378);
                            boolean m1Experiment = selectLotsViewState.getM1Experiment();
                            composer2.startReplaceGroup(-1633490746);
                            boolean z3 = (i6 & 3670016) == 1048576;
                            Object objRememberedValue17 = composer2.rememberedValue();
                            if (z3 || objRememberedValue17 == companion.getEmpty()) {
                                function02 = resetToInitialSelection;
                                objRememberedValue17 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SelectLotsComposableKt.SelectLotsComposable$lambda$42$lambda$41(function02, snapshotState7);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue17);
                            } else {
                                function02 = resetToInitialSelection;
                            }
                            Function0 function03 = (Function0) objRememberedValue17;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(5004770);
                            Object objRememberedValue18 = composer2.rememberedValue();
                            if (objRememberedValue18 == companion.getEmpty()) {
                                objRememberedValue18 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SelectLotsComposableKt.SelectLotsComposable$lambda$44$lambda$43(snapshotState7);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue18);
                            }
                            composer2.endReplaceGroup();
                            TaxLotsUnsavedLotsAlert.TaxLotsUnsavedLotsAlert(m1Experiment, function03, (Function0) objRememberedValue18, composer2, 384);
                            composer2.endReplaceGroup();
                        } else {
                            function02 = resetToInitialSelection;
                            composer2.startReplaceGroup(-933756665);
                            composer2.endReplaceGroup();
                        }
                    }
                }
                function02 = resetToInitialSelection;
                function0 = onNotEnoughSharesAlertDismiss;
            }
            Boolean boolValueOf = Boolean.valueOf(selectLotsViewState.getKeyboardVisible());
            composer2.startReplaceGroup(i5);
            boolean zChangedInstance2 = composer2.changedInstance(taxLotsTopAppBarNestedScrollConnection3) | composer2.changedInstance(selectLotsViewState);
            Object objRememberedValue19 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue19 == companion.getEmpty()) {
                objRememberedValue19 = new SelectLotsComposableKt$SelectLotsComposable$19$1(taxLotsTopAppBarNestedScrollConnection3, selectLotsViewState, null);
                composer2.updateRememberedValue(objRememberedValue19);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue19, composer2, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function04 = function0;
            final SelectLotsViewState selectLotsViewState2 = selectLotsViewState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectLotsComposableKt.SelectLotsComposable$lambda$46(selectLotsViewState2, events, dismissFragment, onReviewOrder, setKeyboardVisible, requestNextPage, function02, setSelectionStrategy, onSelectionStrategyAlertDismiss, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectLotsComposable$lambda$26(SnapshotState<BigDecimal> snapshotState, BigDecimal bigDecimal) {
        snapshotState.setValue(bigDecimal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectLotsComposable$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectLotsComposable$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectLotsComposable$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectLotsComposable$lambda$20(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectLotsComposable$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: SelectLotsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$11 */
    static final class C1482411 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ SelectLotsViewState $viewState;

        C1482411(SelectLotsViewState selectLotsViewState, BentoNumpadScopeV22 bentoNumpadScopeV22) {
            this.$viewState = selectLotsViewState;
            this.$numpadScope = bentoNumpadScopeV22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
            invoke(bentoNumpadScopeV2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1448154951, i, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable.<anonymous> (SelectLotsComposable.kt:308)");
            }
            Boolean boolValueOf = Boolean.valueOf(this.$viewState.getKeyboardVisible());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$SelectLotsComposable$11$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelectLotsComposableKt.C1482411.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, "", null, ComposableLambda3.rememberComposableLambda(971734410, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt.SelectLotsComposable.11.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(971734410, i2, -1, "com.robinhood.android.equities.taxlots.SelectLotsComposable.<anonymous>.<anonymous> (SelectLotsComposable.kt:312)");
                    }
                    if (z) {
                        bentoNumpadScopeV22.BentoNumpadOnly(TestTag3.testTag(Modifier.INSTANCE, SelectLotsComposableKt.SELECT_LOTS_NUMPAD_TEST_TAG), false, false, false, null, composer2, (BentoNumpadScopeV22.$stable << 15) | 6, 30);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$32$lambda$31(SnapshotState snapshotState) {
        SelectLotsComposable$lambda$20(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$34$lambda$33(Function2 function2, SetSelectionStrategyFailure setSelectionStrategyFailure) {
        function2.invoke(setSelectionStrategyFailure.getSelectionStrategy(), setSelectionStrategyFailure.getMaxNumberOfShares());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$36$lambda$35(SnapshotState snapshotState) {
        SelectLotsComposable$lambda$14(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$38$lambda$37(SnapshotState snapshotState) {
        SelectLotsComposable$lambda$17(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$40$lambda$39(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$42$lambda$41(Function0 function0, SnapshotState snapshotState) {
        SelectLotsComposable$lambda$23(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectLotsComposable$lambda$44$lambda$43(SnapshotState snapshotState) {
        SelectLotsComposable$lambda$23(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void PreviewSelectLotsComposable(final SelectLotsViewState selectLotsViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2018989082);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(selectLotsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2018989082, i2, -1, "com.robinhood.android.equities.taxlots.PreviewSelectLotsComposable (SelectLotsComposable.kt:379)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(-1138827482, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt.PreviewSelectLotsComposable.1

                /* compiled from: SelectLotsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SelectLotsViewState $viewState;

                    AnonymousClass1(SelectLotsViewState selectLotsViewState) {
                        this.$viewState = selectLotsViewState;
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
                            ComposerKt.traceEventStart(1098926702, i, -1, "com.robinhood.android.equities.taxlots.PreviewSelectLotsComposable.<anonymous>.<anonymous> (SelectLotsComposable.kt:384)");
                        }
                        SelectLotsViewState selectLotsViewState = this.$viewState;
                        StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda0
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
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SelectLotsComposableKt.C148221.AnonymousClass1.invoke$lambda$3$lambda$2((SelectLotsKey.Result) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SelectLotsComposableKt.C148221.AnonymousClass1.invoke$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function12 = (Function1) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function02 = (Function0) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda4
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
                            objRememberedValue6 = new Function2() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SelectLotsComposableKt.C148221.AnonymousClass1.invoke$lambda$11$lambda$10((SelectionStrategy) obj, (BigDecimal) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        Function2 function2 = (Function2) objRememberedValue6;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue7 = composer.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue7);
                        }
                        Function0 function04 = (Function0) objRememberedValue7;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue8 = composer.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$PreviewSelectLotsComposable$1$1$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue8);
                        }
                        composer.endReplaceGroup();
                        SelectLotsComposableKt.SelectLotsComposable(selectLotsViewState, stateFlow2MutableStateFlow, function0, function1, function12, function02, function03, function2, function04, (Function0) objRememberedValue8, composer, 920350080);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(SelectLotsKey.Result it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(boolean z) {
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$11$lambda$10(SelectionStrategy selectionStrategy, BigDecimal bigDecimal) {
                        Intrinsics.checkNotNullParameter(selectionStrategy, "<unused var>");
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
                        ComposerKt.traceEventStart(-1138827482, i3, -1, "com.robinhood.android.equities.taxlots.PreviewSelectLotsComposable.<anonymous> (SelectLotsComposable.kt:383)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1098926702, true, new AnonymousClass1(selectLotsViewState), composer2, 54), composer2, 100663296, 255);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.SelectLotsComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectLotsComposableKt.PreviewSelectLotsComposable$lambda$47(selectLotsViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
