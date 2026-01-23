package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
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
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ComboWheelPicker.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$2$1", m3645f = "ComboWheelPicker.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ComboWheelPicker2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableList<String> $items;
    final /* synthetic */ ComboWheelPicker7 $state;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComboWheelPicker2(ComboWheelPicker7 comboWheelPicker7, ImmutableList<String> immutableList, Continuation<? super ComboWheelPicker2> continuation) {
        super(2, continuation);
        this.$state = comboWheelPicker7;
        this.$items = immutableList;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComboWheelPicker2(this.$state, this.$items, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ComboWheelPicker2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$state.getCurrentSelectedIndex() >= this.$items.size() && !this.$items.isEmpty()) {
                int iCoerceAtLeast = RangesKt.coerceAtLeast(this.$items.size() - 1, 0);
                Animatable<Float, AnimationVectors2> scrollOffset$feature_game_detail_externalDebug = this.$state.getScrollOffset$feature_game_detail_externalDebug();
                Float fBoxFloat = boxing.boxFloat(iCoerceAtLeast * 110.0f);
                this.I$0 = iCoerceAtLeast;
                this.label = 1;
                if (scrollOffset$feature_game_detail_externalDebug.snapTo(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iCoerceAtLeast;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        ResultKt.throwOnFailure(obj);
        this.$state.getSelectedIndexState$feature_game_detail_externalDebug().setValue(boxing.boxInt(i));
        return Unit.INSTANCE;
    }
}
