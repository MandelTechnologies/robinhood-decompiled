package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class LadderRowKt$LadderRow$1$4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Integer> $getIndexOfMiddleVisibleItem;
    final /* synthetic */ FuturesLadderViewState.LadderData $ladderData;
    final /* synthetic */ Function2<FuturesOrderType, FuturesOrderTrigger, Unit> $onBuyClicked;
    final /* synthetic */ Function0<Unit> $onRowClicked;
    final /* synthetic */ Function2<FuturesOrderType, FuturesOrderTrigger, Unit> $onSellClicked;
    final /* synthetic */ SnapshotState<FuturesLadderViewState.LadderData.SelectedRow> $previousSelectedRowData$delegate;
    final /* synthetic */ int $rowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    LadderRowKt$LadderRow$1$4(FuturesLadderViewState.LadderData ladderData, int i, Function0<Integer> function0, Function0<Unit> function02, Function2<? super FuturesOrderType, ? super FuturesOrderTrigger, Unit> function2, Function2<? super FuturesOrderType, ? super FuturesOrderTrigger, Unit> function22, SnapshotState<FuturesLadderViewState.LadderData.SelectedRow> snapshotState) {
        this.$ladderData = ladderData;
        this.$rowIndex = i;
        this.$getIndexOfMiddleVisibleItem = function0;
        this.$onRowClicked = function02;
        this.$onBuyClicked = function2;
        this.$onSellClicked = function22;
        this.$previousSelectedRowData$delegate = snapshotState;
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1750303197, i, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderRow.<anonymous>.<anonymous> (LadderRow.kt:178)");
        }
        SnapshotState4 snapshotState4RememberTargetRotationState = LadderRowKt.rememberTargetRotationState(this.$ladderData.getLadderDisplayMode(), composer, 0);
        String rowDisplay = this.$ladderData.getRowDisplay(FuturesLadderDataState2.PRICE, this.$rowIndex);
        String rowDisplay2 = this.$ladderData.getRowDisplay(FuturesLadderDataState2.PNL, this.$rowIndex);
        int i2 = this.$rowIndex;
        int iIntValue = this.$getIndexOfMiddleVisibleItem.invoke().intValue();
        float fInvoke$lambda$0 = invoke$lambda$0(snapshotState4RememberTargetRotationState);
        FuturesLadderViewState.LadderData.SelectedRow selectedRowLadderRow$lambda$7$lambda$5 = LadderRowKt.LadderRow$lambda$7$lambda$5(this.$previousSelectedRowData$delegate);
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig buyConfig = selectedRowLadderRow$lambda$7$lambda$5 != null ? selectedRowLadderRow$lambda$7$lambda$5.getBuyConfig() : null;
        FuturesLadderViewState.LadderData.SelectedRow selectedRowLadderRow$lambda$7$lambda$52 = LadderRowKt.LadderRow$lambda$7$lambda$5(this.$previousSelectedRowData$delegate);
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig sellConfig = selectedRowLadderRow$lambda$7$lambda$52 != null ? selectedRowLadderRow$lambda$7$lambda$52.getSellConfig() : null;
        Function0<Unit> function0 = this.$onRowClicked;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$ladderData) | composer.changed(this.$onBuyClicked);
        final FuturesLadderViewState.LadderData ladderData = this.$ladderData;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedRow> snapshotState = this.$previousSelectedRowData$delegate;
        final Function2<FuturesOrderType, FuturesOrderTrigger, Unit> function2 = this.$onBuyClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$LadderRow$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderRowKt$LadderRow$1$4.invoke$lambda$3$lambda$2(ladderData, snapshotState, function2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance2 = composer.changedInstance(this.$ladderData) | composer.changed(this.$onSellClicked);
        final FuturesLadderViewState.LadderData ladderData2 = this.$ladderData;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedRow> snapshotState2 = this.$previousSelectedRowData$delegate;
        final Function2<FuturesOrderType, FuturesOrderTrigger, Unit> function22 = this.$onSellClicked;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$LadderRow$1$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderRowKt$LadderRow$1$4.invoke$lambda$6$lambda$5(ladderData2, snapshotState2, function22);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        LadderRowKt.SelectedLadderRow(rowDisplay, rowDisplay2, i2, iIntValue, fInvoke$lambda$0, buyConfig, sellConfig, function0, function02, (Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FuturesLadderViewState.LadderData ladderData, SnapshotState snapshotState, Function2 function2) {
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig buyConfig;
        FuturesLadderViewState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
        if (selectedRow == null) {
            selectedRow = LadderRowKt.LadderRow$lambda$7$lambda$5(snapshotState);
        }
        if (selectedRow != null && (buyConfig = selectedRow.getBuyConfig()) != null) {
            function2.invoke(buyConfig.getType(), buyConfig.getTrigger());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(FuturesLadderViewState.LadderData ladderData, SnapshotState snapshotState, Function2 function2) {
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig sellConfig;
        FuturesLadderViewState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
        if (selectedRow == null) {
            selectedRow = LadderRowKt.LadderRow$lambda$7$lambda$5(snapshotState);
        }
        if (selectedRow != null && (sellConfig = selectedRow.getSellConfig()) != null) {
            function2.invoke(sellConfig.getType(), sellConfig.getTrigger());
        }
        return Unit.INSTANCE;
    }
}
