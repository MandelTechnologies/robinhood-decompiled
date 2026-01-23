package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WheelPicker.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$1$1", m3645f = "WheelPicker.kt", m3646l = {104}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class WheelPicker4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Function1<Integer, Unit>> $currentOnItemSelected$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $scrollOffset;
    final /* synthetic */ WheelPickerState $state;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WheelPicker4(Animatable<Float, AnimationVectors2> animatable, WheelPickerState wheelPickerState, SnapshotState<Boolean> snapshotState, SnapshotState4<? extends Function1<? super Integer, Unit>> snapshotState4, Continuation<? super WheelPicker4> continuation) {
        super(2, continuation);
        this.$scrollOffset = animatable;
        this.$state = wheelPickerState;
        this.$isDragging$delegate = snapshotState;
        this.$currentOnItemSelected$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WheelPicker4(this.$scrollOffset, this.$state, this.$isDragging$delegate, this.$currentOnItemSelected$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WheelPicker4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        WheelPicker4 wheelPicker4;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!WheelPicker3.WheelPicker$lambda$3(this.$isDragging$delegate)) {
                int iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(this.$scrollOffset.getValue().floatValue() / 110.0f), 0, this.$state.getItems().size() - 1);
                Animatable<Float, AnimationVectors2> animatable = this.$scrollOffset;
                Float fBoxFloat = boxing.boxFloat(iCoerceIn * 110.0f);
                this.I$0 = iCoerceIn;
                this.label = 1;
                wheelPicker4 = this;
                if (Animatable.animateTo$default(animatable, fBoxFloat, null, null, null, wheelPicker4, 14, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iCoerceIn;
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            wheelPicker4 = this;
        }
        WheelPicker3.WheelPicker$lambda$0(wheelPicker4.$currentOnItemSelected$delegate).invoke(boxing.boxInt(i));
        return Unit.INSTANCE;
    }
}
