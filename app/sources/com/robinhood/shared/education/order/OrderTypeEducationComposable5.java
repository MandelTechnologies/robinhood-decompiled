package com.robinhood.shared.education.order;

import androidx.compose.runtime.SnapshotState;
import com.airbnb.lottie.compose.LottieAnimationState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrderTypeEducationComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationLottie$1$1", m3645f = "OrderTypeEducationComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationLottie$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class OrderTypeEducationComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderTypeEducation $orderTypeEducation;
    final /* synthetic */ LottieAnimationState $progress;
    final /* synthetic */ SnapshotState<Boolean> $shouldRepeat$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTypeEducationComposable5(LottieAnimationState lottieAnimationState, OrderTypeEducation orderTypeEducation, SnapshotState<Boolean> snapshotState, Continuation<? super OrderTypeEducationComposable5> continuation) {
        super(2, continuation);
        this.$progress = lottieAnimationState;
        this.$orderTypeEducation = orderTypeEducation;
        this.$shouldRepeat$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTypeEducationComposable5(this.$progress, this.$orderTypeEducation, this.$shouldRepeat$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderTypeEducationComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$progress.getValue().floatValue() == 1.0f) {
            OrderTypeEducationComposable4.OrderTypeEducationLottie$lambda$16(this.$shouldRepeat$delegate, this.$orderTypeEducation.getRepeatMarker() != null);
        }
        return Unit.INSTANCE;
    }
}
