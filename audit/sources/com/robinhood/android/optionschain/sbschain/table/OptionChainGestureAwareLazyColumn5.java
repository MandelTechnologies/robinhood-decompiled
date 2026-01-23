package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
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

/* compiled from: OptionChainGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$3$1", m3645f = "OptionChainGestureAwareLazyColumn.kt", m3646l = {211, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$3$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainGestureAwareLazyColumn5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $boundedOffset;
    final /* synthetic */ float $currentRowY;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedContractYOffset;
    final /* synthetic */ boolean $shouldSnap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainGestureAwareLazyColumn5(boolean z, Animatable<Float, AnimationVectors2> animatable, float f, float f2, Continuation<? super OptionChainGestureAwareLazyColumn5> continuation) {
        super(2, continuation);
        this.$shouldSnap = z;
        this.$selectedContractYOffset = animatable;
        this.$currentRowY = f;
        this.$boundedOffset = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainGestureAwareLazyColumn5(this.$shouldSnap, this.$selectedContractYOffset, this.$currentRowY, this.$boundedOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainGestureAwareLazyColumn5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r12, 12, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r13.snapTo(r1, r12) == r0) goto L17;
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
            if (this.$shouldSnap) {
                Animatable<Float, AnimationVectors2> animatable = this.$selectedContractYOffset;
                Float fBoxFloat = boxing.boxFloat(this.$currentRowY);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(50, 0, Easing3.getLinearOutSlowInEasing(), 2, null);
                this.label = 1;
            } else {
                Animatable<Float, AnimationVectors2> animatable2 = this.$selectedContractYOffset;
                Float fBoxFloat2 = boxing.boxFloat(this.$boundedOffset);
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
