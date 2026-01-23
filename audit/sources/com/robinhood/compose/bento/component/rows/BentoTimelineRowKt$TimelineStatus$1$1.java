package com.robinhood.compose.bento.component.rows;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.animation.core.TweenSpec;
import com.robinhood.compose.bento.component.rows.Timeline;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BentoTimelineRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.component.rows.BentoTimelineRowKt$TimelineStatus$1$1", m3645f = "BentoTimelineRow.kt", m3646l = {395}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BentoTimelineRowKt$TimelineStatus$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $animateEntry;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animationProgress;
    final /* synthetic */ boolean $startAnimation;
    final /* synthetic */ Timeline.StatusInfo $statusInfo;
    int label;

    /* compiled from: BentoTimelineRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Timeline.Position.values().length];
            try {
                iArr[Timeline.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Timeline.Position.BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Timeline.Position.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BentoTimelineRowKt$TimelineStatus$1$1(boolean z, boolean z2, Timeline.StatusInfo statusInfo, Animatable<Float, AnimationVectors2> animatable, Continuation<? super BentoTimelineRowKt$TimelineStatus$1$1> continuation) {
        super(2, continuation);
        this.$animateEntry = z;
        this.$startAnimation = z2;
        this.$statusInfo = statusInfo;
        this.$animationProgress = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BentoTimelineRowKt$TimelineStatus$1$1(this.$animateEntry, this.$startAnimation, this.$statusInfo, this.$animationProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BentoTimelineRowKt$TimelineStatus$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Easing easeIn;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$animateEntry && this.$startAnimation) {
                Timeline.Position position = this.$statusInfo.getPosition();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i3 = iArr[position.ordinal()];
                if (i3 == 1) {
                    easeIn = EasingFunctions.getEaseIn();
                } else if (i3 == 2) {
                    easeIn = Easing3.getLinearEasing();
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    easeIn = EasingFunctions.getEaseOut();
                }
                int i4 = iArr[this.$statusInfo.getPosition().ordinal()];
                if (i4 == 1 || i4 == 2) {
                    i = 271;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 542;
                }
                Animatable<Float, AnimationVectors2> animatable = this.$animationProgress;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(i, this.$statusInfo.getIndex() * 271, easeIn);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
