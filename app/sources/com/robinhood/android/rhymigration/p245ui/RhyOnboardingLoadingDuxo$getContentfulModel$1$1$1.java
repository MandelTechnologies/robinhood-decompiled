package com.robinhood.android.rhymigration.p245ui;

import com.airbnb.lottie.LottieCompositionFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyOnboardingLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, String str, Continuation<? super RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rhyOnboardingLoadingDuxo;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1(this.this$0, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Throwable exception = LottieCompositionFactory.fromUrlSync(this.this$0.app.getApplicationContext(), this.$url).getException();
        if (exception == null) {
            return Unit.INSTANCE;
        }
        throw exception;
    }
}
