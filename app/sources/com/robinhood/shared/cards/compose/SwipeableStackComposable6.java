package com.robinhood.shared.cards.compose;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.shared.cards.compose.SwipeableStackState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeableStackComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.cards.compose.SwipeableStackComposableKt$SwipeableStackComposable$1$1$2$1", m3645f = "SwipeableStackComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.cards.compose.SwipeableStackComposableKt$SwipeableStackComposable$1$1$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class SwipeableStackComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $isNotDismissed$delegate;

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ SwipeableStackState.CardInStack $listItem;
    final /* synthetic */ Function1<T, Unit> $onCardDismissed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;TT;Landroidx/compose/runtime/State<Ljava/lang/Boolean;>;Lkotlin/coroutines/Continuation<-Lcom/robinhood/shared/cards/compose/SwipeableStackComposableKt$SwipeableStackComposable$1$1$2$1;>;)V */
    SwipeableStackComposable6(Function1 function1, SwipeableStackState.CardInStack cardInStack, SnapshotState4 snapshotState4, Continuation continuation) {
        super(2, continuation);
        this.$onCardDismissed = function1;
        this.$listItem = cardInStack;
        this.$isNotDismissed$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeableStackComposable6(this.$onCardDismissed, this.$listItem, this.$isNotDismissed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeableStackComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!SwipeableStackComposable3.SwipeableStackComposable$lambda$14$lambda$13$lambda$10(this.$isNotDismissed$delegate)) {
                this.$onCardDismissed.invoke(this.$listItem);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
