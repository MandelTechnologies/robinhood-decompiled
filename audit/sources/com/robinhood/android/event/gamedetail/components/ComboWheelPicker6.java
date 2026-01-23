package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ComboWheelPicker.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1$1$1", m3645f = "ComboWheelPicker.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ComboWheelPicker6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $dragAmount;
    final /* synthetic */ ImmutableList<String> $items;
    final /* synthetic */ ComboWheelPicker7 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComboWheelPicker6(ComboWheelPicker7 comboWheelPicker7, long j, ImmutableList<String> immutableList, Continuation<? super ComboWheelPicker6> continuation) {
        super(2, continuation);
        this.$state = comboWheelPicker7;
        this.$dragAmount = j;
        this.$items = immutableList;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComboWheelPicker6(this.$state, this.$dragAmount, this.$items, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ComboWheelPicker6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float fCoerceIn = RangesKt.coerceIn(this.$state.getScrollOffset$feature_game_detail_externalDebug().getValue().floatValue() - Float.intBitsToFloat((int) (this.$dragAmount & 4294967295L)), 0.0f, CollectionsKt.getLastIndex(this.$items) * 110.0f);
            Animatable<Float, AnimationVectors2> scrollOffset$feature_game_detail_externalDebug = this.$state.getScrollOffset$feature_game_detail_externalDebug();
            Float fBoxFloat = boxing.boxFloat(fCoerceIn);
            this.label = 1;
            if (scrollOffset$feature_game_detail_externalDebug.snapTo(fBoxFloat, this) == coroutine_suspended) {
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
