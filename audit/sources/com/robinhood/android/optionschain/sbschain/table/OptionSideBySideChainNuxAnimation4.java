package com.robinhood.android.optionschain.sbschain.table;

import com.airbnb.lottie.compose.LottieAnimationState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainNuxAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$OptionSideBySideChainNuxAnimation$2$2$1$1", m3645f = "OptionSideBySideChainNuxAnimation.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$OptionSideBySideChainNuxAnimation$2$2$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainNuxAnimation4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LottieAnimationState $leftAnimationState;
    final /* synthetic */ Function0<Unit> $onNuxExitAnimationFinished;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainNuxAnimation4(LottieAnimationState lottieAnimationState, Function0<Unit> function0, Continuation<? super OptionSideBySideChainNuxAnimation4> continuation) {
        super(2, continuation);
        this.$leftAnimationState = lottieAnimationState;
        this.$onNuxExitAnimationFinished = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainNuxAnimation4(this.$leftAnimationState, this.$onNuxExitAnimationFinished, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainNuxAnimation4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$leftAnimationState.isPlaying() && this.$leftAnimationState.getProgress() > 0.99d) {
            this.$onNuxExitAnimationFinished.invoke();
        }
        return Unit.INSTANCE;
    }
}
