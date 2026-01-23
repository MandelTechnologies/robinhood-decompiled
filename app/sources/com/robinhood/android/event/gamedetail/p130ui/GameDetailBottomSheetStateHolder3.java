package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailBottomSheetStateHolder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.ui.BottomSheetStateHolder$UpdateContentState$3$1", m3645f = "GameDetailBottomSheetStateHolder.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.ui.BottomSheetStateHolder$UpdateContentState$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class GameDetailBottomSheetStateHolder3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GameDetailBottomSheetState $bottomSheetContentState;
    final /* synthetic */ SnapshotState4<Function0<Unit>> $latestOnPositionDetailSheetHidden$delegate;
    final /* synthetic */ SnapshotState4<Function0<Unit>> $latestOnTradeSheetHidden$delegate;
    int label;
    final /* synthetic */ GameDetailBottomSheetStateHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GameDetailBottomSheetStateHolder3(GameDetailBottomSheetState gameDetailBottomSheetState, GameDetailBottomSheetStateHolder gameDetailBottomSheetStateHolder, SnapshotState4<? extends Function0<Unit>> snapshotState4, SnapshotState4<? extends Function0<Unit>> snapshotState42, Continuation<? super GameDetailBottomSheetStateHolder3> continuation) {
        super(2, continuation);
        this.$bottomSheetContentState = gameDetailBottomSheetState;
        this.this$0 = gameDetailBottomSheetStateHolder;
        this.$latestOnTradeSheetHidden$delegate = snapshotState4;
        this.$latestOnPositionDetailSheetHidden$delegate = snapshotState42;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GameDetailBottomSheetStateHolder3(this.$bottomSheetContentState, this.this$0, this.$latestOnTradeSheetHidden$delegate, this.$latestOnPositionDetailSheetHidden$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GameDetailBottomSheetStateHolder3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GameDetailBottomSheetState gameDetailBottomSheetState = this.$bottomSheetContentState;
        if (gameDetailBottomSheetState instanceof GameDetailBottomSheetState.Trade) {
            if (Intrinsics.areEqual(this.this$0.getBottomSheetStateValue().getCurrentValue(), MultiModeSheetState2.Hidden.INSTANCE)) {
                GameDetailBottomSheetStateHolder.UpdateContentState$lambda$4(this.$latestOnTradeSheetHidden$delegate).invoke();
                this.this$0.setDoNotAnimateBottomSheet(true);
            }
        } else if (gameDetailBottomSheetState instanceof GameDetailBottomSheetState.PositionDetail) {
            if (Intrinsics.areEqual(this.this$0.getBottomSheetStateValue().getCurrentValue(), MultiModeSheetState2.Hidden.INSTANCE)) {
                GameDetailBottomSheetStateHolder.UpdateContentState$lambda$5(this.$latestOnPositionDetailSheetHidden$delegate).invoke();
                this.this$0.setDoNotAnimateBottomSheet(true);
            }
        } else if (gameDetailBottomSheetState != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
