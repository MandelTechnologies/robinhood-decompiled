package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoQuickTradeSwipeToSubmit.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1$4$1", m3645f = "CryptoQuickTradeSwipeToSubmit.kt", m3646l = {136, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1$4$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeSwipeToSubmit6 extends ContinuationImpl7 implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animTargetOffset;
    final /* synthetic */ float $horizontalPaddingPx;
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    final /* synthetic */ SnapshotFloatState2 $knobOffsetPx$delegate;
    final /* synthetic */ float $maxOffset;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ SnapshotState<Boolean> $submitted$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuickTradeSwipeToSubmit6(float f, Function0<Unit> function0, Animatable<Float, AnimationVectors2> animatable, float f2, SnapshotState<Boolean> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Boolean> snapshotState2, Continuation<? super CryptoQuickTradeSwipeToSubmit6> continuation) {
        super(3, continuation);
        this.$maxOffset = f;
        this.$onSubmit = function0;
        this.$animTargetOffset = animatable;
        this.$horizontalPaddingPx = f2;
        this.$isDragging$delegate = snapshotState;
        this.$knobOffsetPx$delegate = snapshotFloatState2;
        this.$submitted$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f.floatValue(), continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, float f, Continuation<? super Unit> continuation) {
        return new CryptoQuickTradeSwipeToSubmit6(this.$maxOffset, this.$onSubmit, this.$animTargetOffset, this.$horizontalPaddingPx, this.$isDragging$delegate, this.$knobOffsetPx$delegate, this.$submitted$delegate, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r12.snapTo(r1, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, null, null, null, r11, 14, null) != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$9(this.$isDragging$delegate, false);
            float floatValue = this.$knobOffsetPx$delegate.getFloatValue();
            float f = this.$maxOffset;
            if (floatValue >= f) {
                this.$knobOffsetPx$delegate.setFloatValue(f);
                CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$2(this.$submitted$delegate, true);
                this.$onSubmit.invoke();
                Animatable<Float, AnimationVectors2> animatable = this.$animTargetOffset;
                Float fBoxFloat = boxing.boxFloat(this.$maxOffset);
                this.label = 1;
            } else {
                Animatable<Float, AnimationVectors2> animatable2 = this.$animTargetOffset;
                Float fBoxFloat2 = boxing.boxFloat(this.$knobOffsetPx$delegate.getFloatValue());
                this.label = 2;
                if (animatable2.snapTo(fBoxFloat2, this) != coroutine_suspended) {
                    this.$knobOffsetPx$delegate.setFloatValue(this.$horizontalPaddingPx);
                    Animatable<Float, AnimationVectors2> animatable3 = this.$animTargetOffset;
                    Float fBoxFloat3 = boxing.boxFloat(this.$horizontalPaddingPx);
                    this.label = 3;
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.$knobOffsetPx$delegate.setFloatValue(this.$horizontalPaddingPx);
        Animatable<Float, AnimationVectors2> animatable32 = this.$animTargetOffset;
        Float fBoxFloat32 = boxing.boxFloat(this.$horizontalPaddingPx);
        this.label = 3;
    }
}
