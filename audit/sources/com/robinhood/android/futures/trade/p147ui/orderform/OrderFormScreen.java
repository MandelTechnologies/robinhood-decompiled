package com.robinhood.android.futures.trade.p147ui.orderform;

import android.view.KeyEvent;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.analytics.LoggingUtils6;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trading.tradeflow.OrderForm2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderFormScreen.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0091\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u001f\u001aY\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#¨\u0006$"}, m3636d2 = {"OrderFormScreen", "", "state", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;", "quantityFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "limitPriceFocusRequester", "stopPriceFocusRequester", "onKeyPressed", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onFocusChanged", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "onDisabledClicked", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$DisabledClickSource;", "onSwipeToTrade", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "onReviewClicked", "Lkotlin/Function0;", "onCaretClicked", "Lcom/robinhood/android/futures/trade/ui/orderform/CaretType;", "onBackPressed", "onOrderTypeClicked", "onShowTimeInForceSelector", "onTimeInForceSelected", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "onTimeInForceSelectorDismissed", "onDone", "onViewOrder", "Ljava/util/UUID;", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "OrderFormNumpad", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OrderFormScreen {

    /* compiled from: OrderFormScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesOrderFormDataState.FocusedText.values().length];
            try {
                iArr[FuturesOrderFormDataState.FocusedText.QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderFormDataState.FocusedText.LIMIT_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesOrderFormDataState.FocusedText.STOP_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormNumpad$lambda$3(FuturesOrderFormViewState futuresOrderFormViewState, Function1 function1, Function0 function0, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormNumpad(futuresOrderFormViewState, function1, function0, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormScreen$lambda$1(FuturesOrderFormViewState futuresOrderFormViewState, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function1 function15, Function0 function02, Function0 function03, Function0 function04, Function1 function16, Function0 function05, Function0 function06, Function1 function17, int i, int i2, Composer composer, int i3) {
        OrderFormScreen(futuresOrderFormViewState, focusRequester, focusRequester2, focusRequester3, function1, function12, function13, function14, function0, function15, function02, function03, function04, function16, function05, function06, function17, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    public static final void OrderFormScreen(FuturesOrderFormViewState futuresOrderFormViewState, final FocusRequester quantityFocusRequester, final FocusRequester limitPriceFocusRequester, final FocusRequester stopPriceFocusRequester, Function1<? super KeyEvent, Unit> onKeyPressed, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, final Function1<? super UiFuturesOrderContext, Unit> onSwipeToTrade, final Function0<Unit> onReviewClicked, final Function1<? super CaretType, Unit> onCaretClicked, final Function0<Unit> onBackPressed, final Function0<Unit> onOrderTypeClicked, final Function0<Unit> onShowTimeInForceSelector, final Function1<? super FuturesTimeInForce, Unit> onTimeInForceSelected, Function0<Unit> onTimeInForceSelectorDismissed, Function0<Unit> onDone, final Function1<? super UUID, Unit> onViewOrder, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        OrderForm6 orderForm6;
        Function0<Unit> function0;
        final Function1<? super KeyEvent, Unit> function1;
        Composer composer2;
        final Function0<Unit> function02;
        final FuturesOrderFormViewState state = futuresOrderFormViewState;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(quantityFocusRequester, "quantityFocusRequester");
        Intrinsics.checkNotNullParameter(limitPriceFocusRequester, "limitPriceFocusRequester");
        Intrinsics.checkNotNullParameter(stopPriceFocusRequester, "stopPriceFocusRequester");
        Intrinsics.checkNotNullParameter(onKeyPressed, "onKeyPressed");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Intrinsics.checkNotNullParameter(onSwipeToTrade, "onSwipeToTrade");
        Intrinsics.checkNotNullParameter(onReviewClicked, "onReviewClicked");
        Intrinsics.checkNotNullParameter(onCaretClicked, "onCaretClicked");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onOrderTypeClicked, "onOrderTypeClicked");
        Intrinsics.checkNotNullParameter(onShowTimeInForceSelector, "onShowTimeInForceSelector");
        Intrinsics.checkNotNullParameter(onTimeInForceSelected, "onTimeInForceSelected");
        Intrinsics.checkNotNullParameter(onTimeInForceSelectorDismissed, "onTimeInForceSelectorDismissed");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onViewOrder, "onViewOrder");
        Composer composerStartRestartGroup = composer.startRestartGroup(785752275);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(quantityFocusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(limitPriceFocusRequester) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(stopPriceFocusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyPressed) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSwipeToTrade) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReviewClicked) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCaretClicked) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onOrderTypeClicked) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onShowTimeInForceSelector) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTimeInForceSelected) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTimeInForceSelectorDismissed) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDone) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onViewOrder) ? 1048576 : 524288;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (599187 & i6) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785752275, i5, i6, "com.robinhood.android.futures.trade.ui.orderform.OrderFormScreen (OrderFormScreen.kt:51)");
            }
            OrderSubmissionState orderSubmissionState = state.getOrderSubmissionState();
            if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Editing.INSTANCE)) {
                orderForm6 = OrderForm6.EDITING;
            } else if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE)) {
                orderForm6 = OrderForm6.REVIEWING;
            } else {
                if (!(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result = ((OrderSubmissionState.Submitting) state.getOrderSubmissionState()).getResult();
                if (result instanceof OrderSubmissionManager.Result.Failure) {
                    orderForm6 = OrderForm6.EDITING;
                } else if (result instanceof OrderSubmissionManager.Result.Sending) {
                    orderForm6 = OrderForm6.SUBMITTING;
                } else {
                    if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) state.getOrderSubmissionState()).getResult()).getTriggersConfirmation() || ((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) state.getOrderSubmissionState()).getResult()).getHasTriggeredConfirmation()) {
                        orderForm6 = OrderForm6.CONFIRMATION;
                    } else {
                        orderForm6 = OrderForm6.SUBMITTED;
                    }
                }
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            final OrderForm6 orderForm62 = orderForm6;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(companion, LoggingUtils6.updateWithOrderData((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getOrderSubmissionState(), state.getCandidateOrder(), state.getContractId(), state.getRefId(), state.getSide(), state.getSourceScreen()));
            UiFuturesOrderContext candidateOrder = state.getCandidateOrder();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-481687703, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$OrderFormScreen$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-481687703, i7, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormScreen.<anonymous>.<anonymous> (OrderFormScreen.kt:89)");
                    }
                    OrderFormTopBar.OrderFormTopBar(state.getOrderTypeLabel(), state.getShowOrderTypeMenuItem(), state.getShowCloseAsBack(), onBackPressed, onOrderTypeClicked, WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            function0 = onDone;
            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$OrderFormScreen$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-259776022, i7, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormScreen.<anonymous>.<anonymous> (OrderFormScreen.kt:99)");
                    }
                    OrderFormContent.OrderFormContent(orderForm62, quantityFocusRequester, limitPriceFocusRequester, stopPriceFocusRequester, state.getOrderFormContentData(), onFocusChanged, onDisabledClicked, onShowTimeInForceSelector, null, composer3, StringResource.$stable << 12, 256);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            state = state;
            function1 = onKeyPressed;
            OrderForm2.m26341OrderFormVzGUr2s(orderForm62, candidateOrder, onSwipeToTrade, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-259776022, true, function2, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-37864341, true, new OrderFormScreen4(state, orderForm62, function0, onViewOrder), composerStartRestartGroup, 54), modifierLogScreenTransitions, ComposableLambda3.rememberComposableLambda(1575191446, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$OrderFormScreen$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer3, Integer num) {
                    invoke(modifier, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Modifier numpadModifier, Composer composer3, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(numpadModifier, "numpadModifier");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer3.changed(numpadModifier) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1575191446, i8, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormScreen.<anonymous>.<anonymous> (OrderFormScreen.kt:120)");
                    }
                    OrderFormScreen.OrderFormNumpad(state, function1, onReviewClicked, onCaretClicked, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null).then(numpadModifier), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(627870702, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$OrderFormScreen$1$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(627870702, i7, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormScreen.<anonymous>.<anonymous> (OrderFormScreen.kt:111)");
                    }
                    StringResource orderSummaryString = state.getOrderFormContentData().getOrderSummaryString();
                    if (orderSummaryString != null) {
                        StringResource quoteSummaryString = state.getOrderFormContentData().getQuoteSummaryString();
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), composer3, 6, 1);
                        int i8 = StringResource.$stable;
                        OrderFormContent.SummaryStrings(orderSummaryString, quoteSummaryString, modifierM21622defaultHorizontalPaddingWMci_g0, composer3, i8 | (i8 << 3), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), false, null, 0L, 0L, null, null, null, composerStartRestartGroup, ((i5 >> 15) & 896) | 113470464, 0, 65024);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(581193355);
            if (state.getShowingTimeInForceSelector()) {
                int i7 = i6 >> 6;
                function02 = onTimeInForceSelectorDismissed;
                TimeInForceSelectorBottomSheet.TimeInForceSelectorBottomSheet(state.getOrderFormContentData(), onTimeInForceSelected, function02, composer2, StringResource.$stable | (i7 & 112) | (i7 & 896));
            } else {
                function02 = onTimeInForceSelectorDismissed;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function1 = onKeyPressed;
            function0 = onDone;
            composer2 = composerStartRestartGroup;
            function02 = onTimeInForceSelectorDismissed;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function03 = function0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormScreen.OrderFormScreen$lambda$1(state, quantityFocusRequester, limitPriceFocusRequester, stopPriceFocusRequester, function1, onFocusChanged, onDisabledClicked, onSwipeToTrade, onReviewClicked, onCaretClicked, onBackPressed, onOrderTypeClicked, onShowTimeInForceSelector, onTimeInForceSelected, function02, function03, onViewOrder, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderFormNumpad(FuturesOrderFormViewState futuresOrderFormViewState, final Function1<? super KeyEvent, Unit> function1, final Function0<Unit> function0, final Function1<? super CaretType, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        FuturesOrderFormViewState futuresOrderFormViewState2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int i5;
        boolean z;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1182979940);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            futuresOrderFormViewState2 = futuresOrderFormViewState;
        } else if ((i & 6) == 0) {
            futuresOrderFormViewState2 = futuresOrderFormViewState;
            i3 = (composerStartRestartGroup.changedInstance(futuresOrderFormViewState2) ? 4 : 2) | i;
        } else {
            futuresOrderFormViewState2 = futuresOrderFormViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1182979940, i3, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormNumpad (OrderFormScreen.kt:168)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null);
                    Modifier modifier4 = modifier2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                    String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_review_button_label, composerStartRestartGroup, 0);
                    boolean reviewButtonEnabled = futuresOrderFormViewState2.getReviewButtonEnabled();
                    boolean showReviewAsLoading = futuresOrderFormViewState2.getShowReviewAsLoading();
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, FuturesAnalyticsStrings.FUTURES_ORDER_FORM_REVIEW_BUTTON, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                    int i7 = i3 >> 6;
                    int i8 = i3;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, reviewButtonEnabled, showReviewAsLoading, null, null, null, null, false, null, composerStartRestartGroup, i7 & 14, 0, 8088);
                    composer2 = composerStartRestartGroup;
                    i5 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormViewState2.getFocusedText().ordinal()];
                    if (i5 != 1) {
                        z = false;
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = true;
                    }
                    FuturesNumpad.FuturesNumpad(function1, function12, z, composer2, (i7 & 112) | ((i8 >> 3) & 14));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final FuturesOrderFormViewState futuresOrderFormViewState3 = futuresOrderFormViewState2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OrderFormScreen.OrderFormNumpad$lambda$3(futuresOrderFormViewState3, function1, function0, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null);
                Modifier modifier42 = modifier2;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
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
                    String strStringResource2 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_review_button_label, composerStartRestartGroup, 0);
                    boolean reviewButtonEnabled2 = futuresOrderFormViewState2.getReviewButtonEnabled();
                    boolean showReviewAsLoading2 = futuresOrderFormViewState2.getShowReviewAsLoading();
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, FuturesAnalyticsStrings.FUTURES_ORDER_FORM_REVIEW_BUTTON, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                    int i72 = i3 >> 6;
                    int i82 = i3;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource2, modifierM5146paddingqDBjuR0$default2, null, null, reviewButtonEnabled2, showReviewAsLoading2, null, null, null, null, false, null, composerStartRestartGroup, i72 & 14, 0, 8088);
                    composer2 = composerStartRestartGroup;
                    i5 = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormViewState2.getFocusedText().ordinal()];
                    if (i5 != 1) {
                    }
                    FuturesNumpad.FuturesNumpad(function1, function12, z, composer2, (i72 & 112) | ((i82 >> 3) & 14));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
