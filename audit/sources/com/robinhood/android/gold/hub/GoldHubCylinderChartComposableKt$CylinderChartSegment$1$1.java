package com.robinhood.android.gold.hub;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotFloatState2;
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

/* compiled from: GoldHubCylinderChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1", m3645f = "GoldHubCylinderChartComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SegmentAnimationSpec $animationSpec;
    final /* synthetic */ SnapshotFloatState2 $targetWidth$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $visibleWidth;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1(SegmentAnimationSpec segmentAnimationSpec, Animatable<Float, AnimationVectors2> animatable, SnapshotFloatState2 snapshotFloatState2, Continuation<? super GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1> continuation) {
        super(2, continuation);
        this.$animationSpec = segmentAnimationSpec;
        this.$visibleWidth = animatable;
        this.$targetWidth$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1(this.$animationSpec, this.$visibleWidth, this.$targetWidth$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldHubCylinderChartComposableKt$CylinderChartSegment$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r12, 12, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
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
            if (this.$animationSpec != null) {
                Animatable<Float, AnimationVectors2> animatable = this.$visibleWidth;
                Float fBoxFloat = boxing.boxFloat(this.$targetWidth$delegate.getFloatValue());
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(this.$animationSpec.getDurationMillis(), this.$animationSpec.getDelayMillis(), Easing3.getLinearEasing());
                this.label = 1;
            } else {
                Animatable<Float, AnimationVectors2> animatable2 = this.$visibleWidth;
                Float fBoxFloat2 = boxing.boxFloat(this.$targetWidth$delegate.getFloatValue());
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
