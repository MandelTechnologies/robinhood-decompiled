package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
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
/* loaded from: classes12.dex */
final class LadderRowKt$LadderRow$7$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Integer> $getIndexOfMiddleVisibleItem;
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ Function2<OrderType, OrderTrigger, Unit> $onEndOrderClicked;
    final /* synthetic */ Function0<Unit> $onRowClicked;
    final /* synthetic */ Function2<OrderType, OrderTrigger, Unit> $onStartOrderClicked;
    final /* synthetic */ SnapshotState<LadderState.LadderData.SelectedRow> $previousSelectedRowData$delegate;
    final /* synthetic */ int $rowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    LadderRowKt$LadderRow$7$3(LadderState.LadderData ladderData, int i, Function0<Integer> function0, Function0<Unit> function02, Function2<? super OrderType, ? super OrderTrigger, Unit> function2, Function2<? super OrderType, ? super OrderTrigger, Unit> function22, SnapshotState<LadderState.LadderData.SelectedRow> snapshotState) {
        this.$ladderData = ladderData;
        this.$rowIndex = i;
        this.$getIndexOfMiddleVisibleItem = function0;
        this.$onRowClicked = function02;
        this.$onStartOrderClicked = function2;
        this.$onEndOrderClicked = function22;
        this.$previousSelectedRowData$delegate = snapshotState;
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final String invoke$lambda$3(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030718802, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRow.<anonymous>.<anonymous> (LadderRow.kt:210)");
        }
        SnapshotState4 snapshotState4RememberTargetRotationState = LadderRowKt.rememberTargetRotationState(this.$ladderData.getLadderDisplayMode(), composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$ladderData);
        final LadderState.LadderData ladderData = this.$ladderData;
        final int i2 = this.$rowIndex;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$LadderRow$7$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderRowKt$LadderRow$7$3.invoke$lambda$2$lambda$1(ladderData, i2);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        String strInvoke$lambda$3 = invoke$lambda$3((SnapshotState4) objRememberedValue);
        int i3 = this.$rowIndex;
        int iIntValue = this.$getIndexOfMiddleVisibleItem.invoke().intValue();
        float fInvoke$lambda$0 = invoke$lambda$0(snapshotState4RememberTargetRotationState);
        LadderState.LadderData.SelectedRow selectedRowLadderRow$lambda$46$lambda$44 = LadderRowKt.LadderRow$lambda$46$lambda$44(this.$previousSelectedRowData$delegate);
        LadderState.LadderData.SelectedRow.OrderConfig startConfig = selectedRowLadderRow$lambda$46$lambda$44 != null ? selectedRowLadderRow$lambda$46$lambda$44.getStartConfig() : null;
        LadderState.LadderData.SelectedRow selectedRowLadderRow$lambda$46$lambda$442 = LadderRowKt.LadderRow$lambda$46$lambda$44(this.$previousSelectedRowData$delegate);
        LadderState.LadderData.SelectedRow.OrderConfig endConfig = selectedRowLadderRow$lambda$46$lambda$442 != null ? selectedRowLadderRow$lambda$46$lambda$442.getEndConfig() : null;
        Function0<Unit> function0 = this.$onRowClicked;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$ladderData) | composer.changed(this.$onStartOrderClicked);
        final LadderState.LadderData ladderData2 = this.$ladderData;
        final SnapshotState<LadderState.LadderData.SelectedRow> snapshotState = this.$previousSelectedRowData$delegate;
        final Function2<OrderType, OrderTrigger, Unit> function2 = this.$onStartOrderClicked;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$LadderRow$7$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderRowKt$LadderRow$7$3.invoke$lambda$6$lambda$5(ladderData2, snapshotState, function2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance2 = composer.changedInstance(this.$ladderData) | composer.changed(this.$onEndOrderClicked);
        final LadderState.LadderData ladderData3 = this.$ladderData;
        final SnapshotState<LadderState.LadderData.SelectedRow> snapshotState2 = this.$previousSelectedRowData$delegate;
        final Function2<OrderType, OrderTrigger, Unit> function22 = this.$onEndOrderClicked;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$LadderRow$7$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LadderRowKt$LadderRow$7$3.invoke$lambda$9$lambda$8(ladderData3, snapshotState2, function22);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        LadderRowKt.SelectedLadderRow(strInvoke$lambda$3, i3, iIntValue, fInvoke$lambda$0, startConfig, endConfig, function0, function02, (Function0) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$2$lambda$1(LadderState.LadderData ladderData, int i) {
        return ladderData.getSelectedPriceText().invoke(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(LadderState.LadderData ladderData, SnapshotState snapshotState, Function2 function2) {
        LadderState.LadderData.SelectedRow.OrderConfig startConfig;
        LadderState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
        if (selectedRow == null) {
            selectedRow = LadderRowKt.LadderRow$lambda$46$lambda$44(snapshotState);
        }
        if (selectedRow != null && (startConfig = selectedRow.getStartConfig()) != null) {
            function2.invoke(startConfig.getType(), startConfig.getTrigger());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(LadderState.LadderData ladderData, SnapshotState snapshotState, Function2 function2) {
        LadderState.LadderData.SelectedRow.OrderConfig endConfig;
        LadderState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
        if (selectedRow == null) {
            selectedRow = LadderRowKt.LadderRow$lambda$46$lambda$44(snapshotState);
        }
        if (selectedRow != null && (endConfig = selectedRow.getEndConfig()) != null) {
            function2.invoke(endConfig.getType(), endConfig.getTrigger());
        }
        return Unit.INSTANCE;
    }
}
