package com.robinhood.shared.cards.compose;

import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeableStackComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.cards.compose.SwipeableStackComposableKt$SwipeableStackComposable$1$1$1$1$1$1", m3645f = "SwipeableStackComposable.kt", m3646l = {85}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$SwipeableStackComposable$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class SwipeableStackComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SwipeToDismissBoxState $swipeToDismissState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableStackComposable5(SwipeToDismissBoxState swipeToDismissBoxState, Continuation<? super SwipeableStackComposable5> continuation) {
        super(2, continuation);
        this.$swipeToDismissState = swipeToDismissBoxState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeableStackComposable5(this.$swipeToDismissState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeableStackComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SwipeToDismissBoxState swipeToDismissBoxState = this.$swipeToDismissState;
            SwipeToDismissBoxValue swipeToDismissBoxValue = SwipeToDismissBoxValue.StartToEnd;
            this.label = 1;
            if (swipeToDismissBoxState.dismiss(swipeToDismissBoxValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
