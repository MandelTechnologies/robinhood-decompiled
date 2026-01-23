package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PositionInstrumentRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$PositionInstrumentRow$2$1$1", m3645f = "PositionInstrumentRow.kt", m3646l = {106}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.position.PositionInstrumentRowKt$PositionInstrumentRow$2$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PositionInstrumentRow2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    final /* synthetic */ SwipeAnimationPreview $swipeAnimationPreview;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionInstrumentRow2(SwipeAnimationPreview swipeAnimationPreview, SwipeToDismiss2 swipeToDismiss2, Continuation<? super PositionInstrumentRow2> continuation) {
        super(2, continuation);
        this.$swipeAnimationPreview = swipeAnimationPreview;
        this.$dismissState = swipeToDismiss2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionInstrumentRow2(this.$swipeAnimationPreview, this.$dismissState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionInstrumentRow2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UiEvent<?> event;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SwipeAnimationPreview swipeAnimationPreview = this.$swipeAnimationPreview;
            if (swipeAnimationPreview != null && (event = swipeAnimationPreview.getEvent()) != null && !event.getConsumed()) {
                this.$swipeAnimationPreview.getEvent().consume();
                SwipeToDismiss2 swipeToDismiss2 = this.$dismissState;
                this.label = 1;
                if (SwipeRow3.runSwipeAnimationPreview(swipeToDismiss2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$swipeAnimationPreview.getOnAnimationComplete().invoke();
        return Unit.INSTANCE;
    }
}
