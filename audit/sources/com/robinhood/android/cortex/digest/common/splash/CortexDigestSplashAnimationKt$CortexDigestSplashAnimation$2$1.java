package com.robinhood.android.cortex.digest.common.splash;

import kotlin.Metadata;
import kotlin.ResultKt;
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

/* compiled from: CortexDigestSplashAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1", m3645f = "CortexDigestSplashAnimation.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onAnimationComplete;
    final /* synthetic */ Function1<Long, Unit> $onAnimationStarted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1(Function1<? super Long, Unit> function1, Function0<Unit> function0, Continuation<? super CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1> continuation) {
        super(2, continuation);
        this.$onAnimationStarted = function1;
        this.$onAnimationComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1(this.$onAnimationStarted, this.$onAnimationComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onAnimationStarted.invoke(boxing.boxLong(0L));
        this.$onAnimationComplete.invoke();
        return Unit.INSTANCE;
    }
}
