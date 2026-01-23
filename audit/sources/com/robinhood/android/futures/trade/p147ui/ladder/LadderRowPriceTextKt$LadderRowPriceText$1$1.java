package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderRowPriceText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$LadderRowPriceText$1$1", m3645f = "LadderRowPriceText.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LadderRowPriceTextKt$LadderRowPriceText$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ int $offsetTime;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $rotation;
    final /* synthetic */ float $targetRotation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderRowPriceTextKt$LadderRowPriceText$1$1(CoroutineScope coroutineScope, Animatable<Float, AnimationVectors2> animatable, float f, int i, Continuation<? super LadderRowPriceTextKt$LadderRowPriceText$1$1> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$rotation = animatable;
        this.$targetRotation = f;
        this.$offsetTime = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderRowPriceTextKt$LadderRowPriceText$1$1(this.$coroutineScope, this.$rotation, this.$targetRotation, this.$offsetTime, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderRowPriceTextKt$LadderRowPriceText$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: LadderRowPriceText.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$LadderRowPriceText$1$1$1", m3645f = "LadderRowPriceText.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderRowPriceTextKt$LadderRowPriceText$1$1$1 */
    static final class C175651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $offsetTime;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $rotation;
        final /* synthetic */ float $targetRotation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175651(Animatable<Float, AnimationVectors2> animatable, float f, int i, Continuation<? super C175651> continuation) {
            super(2, continuation);
            this.$rotation = animatable;
            this.$targetRotation = f;
            this.$offsetTime = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C175651(this.$rotation, this.$targetRotation, this.$offsetTime, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$rotation;
                Float fBoxFloat = boxing.boxFloat(this.$targetRotation);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, this.$offsetTime, null, 4, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C175651(this.$rotation, this.$targetRotation, this.$offsetTime, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
