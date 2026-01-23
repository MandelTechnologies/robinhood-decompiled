package com.robinhood.android.psp;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HoldToActionButton.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$5$1", m3645f = "HoldToActionButton.kt", m3646l = {49}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$5$1, reason: use source file name */
/* loaded from: classes11.dex */
final class HoldToActionButton2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $duration;
    final /* synthetic */ SnapshotState<Boolean> $hasReachedThreshold$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isDown$delegate;
    final /* synthetic */ Function2<Float, Boolean, Unit> $onProgress;
    final /* synthetic */ Function0<Unit> $onThreshold;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $progress;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HoldToActionButton2(SnapshotState<Boolean> snapshotState, int i, Animatable<Float, AnimationVectors2> animatable, Function0<Unit> function0, Function2<? super Float, ? super Boolean, Unit> function2, SnapshotState<Boolean> snapshotState2, Continuation<? super HoldToActionButton2> continuation) {
        super(2, continuation);
        this.$isDown$delegate = snapshotState;
        this.$duration = i;
        this.$progress = animatable;
        this.$onThreshold = function0;
        this.$onProgress = function2;
        this.$hasReachedThreshold$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HoldToActionButton2(this.$isDown$delegate, this.$duration, this.$progress, this.$onThreshold, this.$onProgress, this.$hasReachedThreshold$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HoldToActionButton2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Tuples2 tuples2M3642to;
        boolean z;
        Function0<Unit> function0;
        SnapshotState<Boolean> snapshotState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Boolean boolHoldToActionButton_By00fGY$lambda$10 = HoldToActionButton.HoldToActionButton_By00fGY$lambda$10(this.$isDown$delegate);
            if (boolHoldToActionButton_By00fGY$lambda$10 != null) {
                int i2 = this.$duration;
                Animatable<Float, AnimationVectors2> animatable = this.$progress;
                Function0<Unit> function02 = this.$onThreshold;
                final Function2<Float, Boolean, Unit> function2 = this.$onProgress;
                SnapshotState<Boolean> snapshotState2 = this.$hasReachedThreshold$delegate;
                final boolean zBooleanValue = boolHoldToActionButton_By00fGY$lambda$10.booleanValue();
                if (zBooleanValue) {
                    tuples2M3642to = Tuples4.m3642to(boxing.boxFloat(1.0f), boxing.boxInt((int) (i2 * (1 - animatable.getValue().floatValue()))));
                } else {
                    tuples2M3642to = Tuples4.m3642to(boxing.boxFloat(0.0f), boxing.boxInt((int) (i2 * animatable.getValue().floatValue())));
                }
                float fFloatValue = ((Number) tuples2M3642to.component1()).floatValue();
                int iIntValue = ((Number) tuples2M3642to.component2()).intValue();
                Float fBoxFloat = boxing.boxFloat(fFloatValue);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(iIntValue, 0, Easing3.getLinearEasing(), 2, null);
                Function1 function1 = new Function1() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$5$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HoldToActionButton2.invokeSuspend$lambda$1$lambda$0(function2, zBooleanValue, (Animatable) obj2);
                    }
                };
                this.L$0 = function02;
                this.L$1 = snapshotState2;
                this.Z$0 = zBooleanValue;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, function1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
                function0 = function02;
                snapshotState = snapshotState2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = this.Z$0;
        snapshotState = (SnapshotState) this.L$1;
        function0 = (Function0) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (z) {
            HoldToActionButton.HoldToActionButton_By00fGY$lambda$14(snapshotState, true);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(Function2 function2, boolean z, Animatable animatable) {
        function2.invoke(animatable.getValue(), Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
