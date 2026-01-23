package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Ladder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class LadderKt$LadderUi$4$7$1$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ boolean $animateQuantityBarsEntry;
    final /* synthetic */ LadderCallbacks $callbacks;
    final /* synthetic */ FuturesLadderViewState.LadderData $ladderData;
    final /* synthetic */ LazyListState $ladderLazyListState;
    final /* synthetic */ LadderLazyListScope $listScope;
    final /* synthetic */ int $numRows;
    final /* synthetic */ SnapshotState<Integer> $previousScrollIndex$delegate;

    LadderKt$LadderUi$4$7$1$1(FuturesLadderViewState.LadderData ladderData, boolean z, LadderCallbacks ladderCallbacks, LadderLazyListScope ladderLazyListScope, LazyListState lazyListState, int i, SnapshotState<Integer> snapshotState) {
        this.$ladderData = ladderData;
        this.$animateQuantityBarsEntry = z;
        this.$callbacks = ladderCallbacks;
        this.$listScope = ladderLazyListScope;
        this.$ladderLazyListState = lazyListState;
        this.$numRows = i;
        this.$previousScrollIndex$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LadderCallbacks ladderCallbacks, int i) {
        ladderCallbacks.onRowSelected(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(LadderCallbacks ladderCallbacks, int i, FuturesOrderType type2, FuturesOrderTrigger trigger) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        ladderCallbacks.onPlaceOrder(OrderSpec.INSTANCE.from(type2, trigger, FuturesOrderSide.BUY, i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(LadderCallbacks ladderCallbacks, int i, FuturesOrderType type2, FuturesOrderTrigger trigger) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        ladderCallbacks.onPlaceOrder(OrderSpec.INSTANCE.from(type2, trigger, FuturesOrderSide.SELL, i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(LadderLazyListScope ladderLazyListScope, FuturesLadderViewState.LadderData.SelectedPendingOrders orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        ladderLazyListScope.updatePotentialDragTarget(orders);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$10$lambda$9(LazyListState lazyListState) {
        return lazyListState.getFirstVisibleItemIndex() + (lazyListState.getLayoutInfo().getVisibleItemsInfo().size() / 2);
    }

    public final void invoke(LazyItemScope items, final int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1870049951, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Ladder.kt:148)");
        }
        int i4 = i3;
        FuturesLadderViewState.LadderData ladderData = this.$ladderData;
        boolean z = this.$animateQuantityBarsEntry;
        composer.startReplaceGroup(-1633490746);
        int i5 = i4 & 112;
        boolean zChangedInstance = (i5 == 32) | composer.changedInstance(this.$callbacks);
        final LadderCallbacks ladderCallbacks = this.$callbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$7$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderKt$LadderUi$4$7$1$1.invoke$lambda$1$lambda$0(ladderCallbacks, i);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$callbacks) | (i5 == 32);
        final LadderCallbacks ladderCallbacks2 = this.$callbacks;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$7$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderKt$LadderUi$4$7$1$1.invoke$lambda$3$lambda$2(ladderCallbacks2, i, (FuturesOrderType) obj, (FuturesOrderTrigger) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function2 function2 = (Function2) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance3 = composer.changedInstance(this.$callbacks) | (i5 == 32);
        final LadderCallbacks ladderCallbacks3 = this.$callbacks;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$7$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderKt$LadderUi$4$7$1$1.invoke$lambda$5$lambda$4(ladderCallbacks3, i, (FuturesOrderType) obj, (FuturesOrderTrigger) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function2 function22 = (Function2) objRememberedValue3;
        composer.endReplaceGroup();
        LadderCallbacks ladderCallbacks4 = this.$callbacks;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance4 = composer.changedInstance(ladderCallbacks4);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new LadderKt$LadderUi$4$7$1$1$4$1(ladderCallbacks4);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) objRememberedValue4);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance5 = composer.changedInstance(this.$listScope);
        final LadderLazyListScope ladderLazyListScope = this.$listScope;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$7$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LadderKt$LadderUi$4$7$1$1.invoke$lambda$8$lambda$7(ladderLazyListScope, (FuturesLadderViewState.LadderData.SelectedPendingOrders) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function12 = (Function1) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$ladderLazyListState);
        final LazyListState lazyListState = this.$ladderLazyListState;
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$7$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(LadderKt$LadderUi$4$7$1$1.invoke$lambda$10$lambda$9(lazyListState));
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        LadderRowKt.LadderRow(ladderData, i, z, function0, function2, function22, function1, function12, (Function0) objRememberedValue6, null, composer, i5, 512);
        if (i == 0 || i == this.$numRows - 1) {
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance6 = composer.changedInstance(this.$callbacks) | (i5 == 32);
            LadderCallbacks ladderCallbacks5 = this.$callbacks;
            SnapshotState<Integer> snapshotState = this.$previousScrollIndex$delegate;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new LadderKt$LadderUi$4$7$1$1$7$1(i, ladderCallbacks5, snapshotState, null);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
