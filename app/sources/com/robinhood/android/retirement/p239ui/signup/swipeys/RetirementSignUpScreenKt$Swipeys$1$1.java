package com.robinhood.android.retirement.p239ui.signup.swipeys;

import androidx.compose.runtime.SnapshotIntState2;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.retirement.api.RetirementSignupSwipey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementSignUpScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpScreenKt$Swipeys$1$1", m3645f = "RetirementSignUpScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetirementSignUpScreenKt$Swipeys$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LottieClipSpec.Frame $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ RetirementSignupSwipey $currentSwipey;
    final /* synthetic */ LottieAnimatable $lottieAnimatable;
    final /* synthetic */ SnapshotIntState2 $startFrame$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpScreenKt$Swipeys$1$1(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, RetirementSignupSwipey retirementSignupSwipey, LottieClipSpec.Frame frame, SnapshotIntState2 snapshotIntState2, Continuation<? super RetirementSignUpScreenKt$Swipeys$1$1> continuation) {
        super(2, continuation);
        this.$lottieAnimatable = lottieAnimatable;
        this.$composition = lottieComposition;
        this.$currentSwipey = retirementSignupSwipey;
        this.$clipSpec = frame;
        this.$startFrame$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementSignUpScreenKt$Swipeys$1$1(this.$lottieAnimatable, this.$composition, this.$currentSwipey, this.$clipSpec, this.$startFrame$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RetirementSignUpScreenKt$Swipeys$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LottieAnimatable lottieAnimatable = this.$lottieAnimatable;
            LottieComposition lottieComposition = this.$composition;
            int i2 = this.$currentSwipey.getLottie_animation_loop_start_frame() != null ? Integer.MAX_VALUE : 1;
            LottieClipSpec.Frame frame = this.$clipSpec;
            LottieComposition lottieComposition2 = this.$composition;
            float progressForFrame = lottieComposition2 != null ? lottieComposition2.getProgressForFrame(this.$startFrame$delegate.getIntValue()) : 0.0f;
            this.label = 1;
            if (LottieAnimatable.DefaultImpls.animate$default(lottieAnimatable, lottieComposition, 0, i2, false, 0.0f, frame, progressForFrame, false, null, false, false, this, 1946, null) == coroutine_suspended) {
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
