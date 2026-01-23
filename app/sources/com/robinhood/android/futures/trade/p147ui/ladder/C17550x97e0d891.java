package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotFloatState2;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$2$2", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$2$2 */
/* loaded from: classes10.dex */
final class C17550x97e0d891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Boolean, Unit> $onPendingOrderDragEnded;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderXOffset;
    final /* synthetic */ Float $velocityX;
    final /* synthetic */ SnapshotFloatState2 $workingPillWidth$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C17550x97e0d891(Animatable<Float, AnimationVectors2> animatable, Float f, Function2<? super Boolean, ? super Boolean, Unit> function2, SnapshotFloatState2 snapshotFloatState2, Continuation<? super C17550x97e0d891> continuation) {
        super(2, continuation);
        this.$selectedPendingOrderXOffset = animatable;
        this.$velocityX = f;
        this.$onPendingOrderDragEnded = function2;
        this.$workingPillWidth$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C17550x97e0d891(this.$selectedPendingOrderXOffset, this.$velocityX, this.$onPendingOrderDragEnded, this.$workingPillWidth$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C17550x97e0d891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        C17550x97e0d891 c17550x97e0d891;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$selectedPendingOrderXOffset;
            Float fBoxFloat = boxing.boxFloat(animatable.getValue().floatValue() > 0.0f ? this.$workingPillWidth$delegate.getFloatValue() : -this.$workingPillWidth$delegate.getFloatValue());
            Float f = this.$velocityX;
            this.label = 1;
            c17550x97e0d891 = this;
            if (Animatable.animateTo$default(animatable, fBoxFloat, null, f, null, c17550x97e0d891, 10, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c17550x97e0d891 = this;
        }
        c17550x97e0d891.$onPendingOrderDragEnded.invoke(boxing.boxBoolean(true), boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
