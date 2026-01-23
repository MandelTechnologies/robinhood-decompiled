package com.robinhood.android.futures.onboarding.p145ui.submission;

import com.robinhood.android.futures.onboarding.p145ui.submission.FuturesAccountSubmissionDuxo4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesAccountSubmissionScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionScreenKt$FuturesAccountSubmissionScreen$2$1$1", m3645f = "FuturesAccountSubmissionScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionScreenKt$FuturesAccountSubmissionScreen$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesAccountSubmissionScreen5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<FuturesAccountSubmissionDuxo4.Success, Unit> $onSubmitted;
    final /* synthetic */ FuturesAccountSubmissionDuxo4 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FuturesAccountSubmissionScreen5(Function1<? super FuturesAccountSubmissionDuxo4.Success, Unit> function1, FuturesAccountSubmissionDuxo4 futuresAccountSubmissionDuxo4, Continuation<? super FuturesAccountSubmissionScreen5> continuation) {
        super(2, continuation);
        this.$onSubmitted = function1;
        this.$state = futuresAccountSubmissionDuxo4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAccountSubmissionScreen5(this.$onSubmitted, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAccountSubmissionScreen5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onSubmitted.invoke(this.$state);
        return Unit.INSTANCE;
    }
}
