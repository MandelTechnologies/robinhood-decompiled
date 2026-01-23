package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotIntState2;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetector;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.models.p320db.OptionContractType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TableCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$3$1, reason: use source file name */
/* loaded from: classes11.dex */
final class TableCell5 implements PointerInputEventHandler {
    final /* synthetic */ TableCellState.BidAsk $cellState;
    final /* synthetic */ Function1<DragTarget, Unit> $onSelectedLegBundleDownInitiated;
    final /* synthetic */ int $rowIndex;
    final /* synthetic */ SpreadSelectionState $spreadSelectionState;
    final /* synthetic */ SnapshotIntState2 $xOffset$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    TableCell5(TableCellState.BidAsk bidAsk, Function1<? super DragTarget, Unit> function1, SpreadSelectionState spreadSelectionState, int i, SnapshotIntState2 snapshotIntState2) {
        this.$cellState = bidAsk;
        this.$onSelectedLegBundleDownInitiated = function1;
        this.$spreadSelectionState = spreadSelectionState;
        this.$rowIndex = i;
        this.$xOffset$delegate = snapshotIntState2;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function1<DragTarget, Unit> function1;
        if (!this.$cellState.getIsEnabled() || (function1 = this.$onSelectedLegBundleDownInitiated) == null) {
            return Unit.INSTANCE;
        }
        final TableCellState.BidAsk bidAsk = this.$cellState;
        final SpreadSelectionState spreadSelectionState = this.$spreadSelectionState;
        final int i = this.$rowIndex;
        final SnapshotIntState2 snapshotIntState2 = this.$xOffset$delegate;
        Object objDetectBidAskCellTouchDown = OptionChainCustomGestureDetector.detectBidAskCellTouchDown(pointerInputScope, new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TableCell5.invoke$lambda$1(function1, bidAsk, spreadSelectionState, i, snapshotIntState2);
            }
        }, continuation);
        return objDetectBidAskCellTouchDown == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectBidAskCellTouchDown : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function1 function1, TableCellState.BidAsk bidAsk, SpreadSelectionState spreadSelectionState, int i, SnapshotIntState2 snapshotIntState2) {
        function1.invoke(null);
        if (bidAsk.isSelected()) {
            OptionLegBundleWithRowIndex legBundleWithRowIndex = bidAsk.getLegBundleWithRowIndex();
            if (legBundleWithRowIndex != null) {
                function1.invoke(new DragTarget.OptionLegDragTarget(i, snapshotIntState2.getIntValue(), extensions2.persistentListOf(legBundleWithRowIndex)));
            }
        } else if (spreadSelectionState != null && bidAsk.getLegBundleWithRowIndex() != null) {
            OptionContractType optionContractType = bidAsk.getLegBundleWithRowIndex().getLegBundle().getOptionConfigurationBundle().getOptionContractType();
            ImmutableList<OptionLegBundleWithRowIndex> legsWithRowIndex = spreadSelectionState.getLegsWithRowIndex(optionContractType);
            PrimitiveRanges2 rowIndexRange = spreadSelectionState.getRowIndexRange(optionContractType);
            if (rowIndexRange != null && rowIndexRange.contains(i)) {
                function1.invoke(new DragTarget.OptionSpreadDragTarget(i, snapshotIntState2.getIntValue(), legsWithRowIndex));
            }
        }
        return Unit.INSTANCE;
    }
}
