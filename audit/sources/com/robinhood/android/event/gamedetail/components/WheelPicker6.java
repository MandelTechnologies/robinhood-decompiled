package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.p011ui.geometry.Offset;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WheelPicker.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1$4$1", m3645f = "WheelPicker.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1$4$1, reason: use source file name */
/* loaded from: classes3.dex */
final class WheelPicker6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Offset $dragAmount;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $scrollOffset;
    final /* synthetic */ WheelPickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WheelPicker6(Animatable<Float, AnimationVectors2> animatable, Offset offset, WheelPickerState wheelPickerState, Continuation<? super WheelPicker6> continuation) {
        super(2, continuation);
        this.$scrollOffset = animatable;
        this.$dragAmount = offset;
        this.$state = wheelPickerState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WheelPicker6(this.$scrollOffset, this.$dragAmount, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WheelPicker6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float fCoerceIn = RangesKt.coerceIn(this.$scrollOffset.getValue().floatValue() - Float.intBitsToFloat((int) (this.$dragAmount.getPackedValue() & 4294967295L)), 0.0f, (this.$state.getItems().size() - 1) * 110.0f);
            Animatable<Float, AnimationVectors2> animatable = this.$scrollOffset;
            Float fBoxFloat = boxing.boxFloat(fCoerceIn);
            this.label = 1;
            if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
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
