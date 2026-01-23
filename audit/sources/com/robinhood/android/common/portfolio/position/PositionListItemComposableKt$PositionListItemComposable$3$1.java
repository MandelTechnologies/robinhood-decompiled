package com.robinhood.android.common.portfolio.position;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.common.portfolio.position.PositionItemState;
import com.robinhood.android.common.portfolio.unified.StaleCheck;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$PositionListItemComposable$3$1", m3645f = "PositionListItemComposable.kt", m3646l = {393}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PositionListItemComposableKt$PositionListItemComposable$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PositionItemState $concreteUiState;
    final /* synthetic */ SnapshotState<Boolean> $isStale$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionListItemComposableKt$PositionListItemComposable$3$1(PositionItemState positionItemState, SnapshotState<Boolean> snapshotState, Continuation<? super PositionListItemComposableKt$PositionListItemComposable$3$1> continuation) {
        super(2, continuation);
        this.$concreteUiState = positionItemState;
        this.$isStale$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionListItemComposableKt$PositionListItemComposable$3$1(this.$concreteUiState, this.$isStale$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionListItemComposableKt$PositionListItemComposable$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = Duration3.toDuration(1, DurationUnitJvm.MINUTES);
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PositionListItemComposableKt.PositionListItemComposable$lambda$7(this.$isStale$delegate, StaleCheck.checkIfDataIsStale(((PositionItemState.Loaded) this.$concreteUiState).getDetails().getReceivedAt()));
        return Unit.INSTANCE;
    }
}
