package com.robinhood.compose.bento.component.rows;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.unit.C2002Dp;
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

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$2$1", m3645f = "BentoTimelineRow.kt", m3646l = {224}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BentoTimelineRowKt$BentoTimelineRow$2$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $middleAndMetaAlpha;
    final /* synthetic */ SnapshotState<C2002Dp> $middleAndMetaHeightDp$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $middleAndMetaYOffset;
    final /* synthetic */ SnapshotState<Boolean> $startEntryAnimation$delegate;
    final /* synthetic */ BentoTimelineRowState $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BentoTimelineRowKt$BentoTimelineRow$2$2$1(BentoTimelineRowState bentoTimelineRowState, Animatable<Float, AnimationVectors2> animatable, SnapshotState<Boolean> snapshotState, SnapshotState<C2002Dp> snapshotState2, Animatable<Float, AnimationVectors2> animatable2, Continuation<? super BentoTimelineRowKt$BentoTimelineRow$2$2$1> continuation) {
        super(2, continuation);
        this.$this_with = bentoTimelineRowState;
        this.$middleAndMetaYOffset = animatable;
        this.$startEntryAnimation$delegate = snapshotState;
        this.$middleAndMetaHeightDp$delegate = snapshotState2;
        this.$middleAndMetaAlpha = animatable2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BentoTimelineRowKt$BentoTimelineRow$2$2$1 bentoTimelineRowKt$BentoTimelineRow$2$2$1 = new BentoTimelineRowKt$BentoTimelineRow$2$2$1(this.$this_with, this.$middleAndMetaYOffset, this.$startEntryAnimation$delegate, this.$middleAndMetaHeightDp$delegate, this.$middleAndMetaAlpha, continuation);
        bentoTimelineRowKt$BentoTimelineRow$2$2$1.L$0 = obj;
        return bentoTimelineRowKt$BentoTimelineRow$2$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BentoTimelineRowKt$BentoTimelineRow$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            if (this.$this_with.getAnimateEntry() && BentoTimelineRowKt.BentoTimelineRow$lambda$14$lambda$3(this.$startEntryAnimation$delegate)) {
                Animatable<Float, AnimationVectors2> animatable = this.$middleAndMetaYOffset;
                Float fBoxFloat = boxing.boxFloat(BentoTimelineRowKt.BentoTimelineRow$lambda$14$lambda$6(this.$middleAndMetaHeightDp$delegate));
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        coroutineScope = coroutineScope3;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C325931(this.$middleAndMetaYOffset, this.$this_with, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C325942(this.$middleAndMetaAlpha, this.$this_with, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$2$1$1", m3645f = "BentoTimelineRow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$2$1$1 */
    static final class C325931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $middleAndMetaYOffset;
        final /* synthetic */ BentoTimelineRowState $this_with;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C325931(Animatable<Float, AnimationVectors2> animatable, BentoTimelineRowState bentoTimelineRowState, Continuation<? super C325931> continuation) {
            super(2, continuation);
            this.$middleAndMetaYOffset = animatable;
            this.$this_with = bentoTimelineRowState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C325931(this.$middleAndMetaYOffset, this.$this_with, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C325931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$middleAndMetaYOffset;
                Float fBoxFloat = boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, this.$this_with.getIndex() * 250, EasingFunctions.getEaseOut());
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween, null, null, this, 12, null) == coroutine_suspended) {
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

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$2$1$2", m3645f = "BentoTimelineRow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$BentoTimelineRow$2$2$1$2 */
    static final class C325942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $middleAndMetaAlpha;
        final /* synthetic */ BentoTimelineRowState $this_with;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C325942(Animatable<Float, AnimationVectors2> animatable, BentoTimelineRowState bentoTimelineRowState, Continuation<? super C325942> continuation) {
            super(2, continuation);
            this.$middleAndMetaAlpha = animatable;
            this.$this_with = bentoTimelineRowState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C325942(this.$middleAndMetaAlpha, this.$this_with, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C325942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$middleAndMetaAlpha;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(283, this.$this_with.getIndex() * 250, EasingFunctions.getEaseOut());
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween, null, null, this, 12, null) == coroutine_suspended) {
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
}
