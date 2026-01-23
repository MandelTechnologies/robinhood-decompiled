package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeErrorRequestExecutor.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$executeAsync$3$1", m3645f = "StripeErrorRequestExecutor.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$executeAsync$3$1, reason: use source file name */
/* loaded from: classes26.dex */
final class StripeErrorRequestExecutor2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeErrorRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeErrorRequestExecutor2(StripeErrorRequestExecutor stripeErrorRequestExecutor, String str, Continuation<? super StripeErrorRequestExecutor2> continuation) {
        super(2, continuation);
        this.this$0 = stripeErrorRequestExecutor;
        this.$requestBody = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeErrorRequestExecutor2 stripeErrorRequestExecutor2 = new StripeErrorRequestExecutor2(this.this$0, this.$requestBody, continuation);
        stripeErrorRequestExecutor2.L$0 = obj;
        return stripeErrorRequestExecutor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StripeErrorRequestExecutor2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StripeErrorRequestExecutor stripeErrorRequestExecutor = this.this$0;
                String str = this.$requestBody;
                Result.Companion companion = Result.INSTANCE;
                HttpClient httpClient = stripeErrorRequestExecutor.httpClient;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = httpClient.doPostRequest(str, "application/json; charset=utf-8", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((HttpResponse) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        StripeErrorRequestExecutor stripeErrorRequestExecutor2 = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            stripeErrorRequestExecutor2.errorReporter.reportError(thM28553exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
