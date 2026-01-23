package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: LadderRowPriceText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$LadderRowPriceText$3$1", m3645f = "LadderRowPriceText.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LadderRowPriceTextKt$LadderRowPriceText$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotState<Boolean> $isAnimating$delegate;
    final /* synthetic */ int $offsetTime;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $rotation;
    final /* synthetic */ float $targetRotation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderRowPriceTextKt$LadderRowPriceText$3$1(CoroutineScope coroutineScope, int i, Animatable<Float, AnimationVectors2> animatable, float f, SnapshotState<Boolean> snapshotState, Continuation<? super LadderRowPriceTextKt$LadderRowPriceText$3$1> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$offsetTime = i;
        this.$rotation = animatable;
        this.$targetRotation = f;
        this.$isAnimating$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderRowPriceTextKt$LadderRowPriceText$3$1(this.$coroutineScope, this.$offsetTime, this.$rotation, this.$targetRotation, this.$isAnimating$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderRowPriceTextKt$LadderRowPriceText$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: LadderRowPriceText.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$LadderRowPriceText$3$1$1", m3645f = "LadderRowPriceText.kt", m3646l = {100, 102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$LadderRowPriceText$3$1$1 */
    static final class C410401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Boolean> $isAnimating$delegate;
        final /* synthetic */ int $offsetTime;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $rotation;
        final /* synthetic */ float $targetRotation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C410401(int i, Animatable<Float, AnimationVectors2> animatable, float f, SnapshotState<Boolean> snapshotState, Continuation<? super C410401> continuation) {
            super(2, continuation);
            this.$offsetTime = i;
            this.$rotation = animatable;
            this.$targetRotation = f;
            this.$isAnimating$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C410401(this.$offsetTime, this.$rotation, this.$targetRotation, this.$isAnimating$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C410401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C410401 c410401;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.$offsetTime;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c410401 = this;
                LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$9(c410401.$isAnimating$delegate, false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$9(this.$isAnimating$delegate, true);
            Animatable<Float, AnimationVectors2> animatable = this.$rotation;
            Float fBoxFloat = boxing.boxFloat(this.$targetRotation);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 0, null, 4, null);
            this.label = 2;
            c410401 = this;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C410401(this.$offsetTime, this.$rotation, this.$targetRotation, this.$isAnimating$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
