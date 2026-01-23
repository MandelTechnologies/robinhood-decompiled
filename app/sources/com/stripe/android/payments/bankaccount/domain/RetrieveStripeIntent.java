package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetrieveStripeIntent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086Bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "invoke", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "publishableKey", "", "clientSecret", "invoke-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class RetrieveStripeIntent {
    private final StripeRepository stripeRepository;

    public RetrieveStripeIntent(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: invoke-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26924invoke0E7RQCE(String str, String str2, Continuation<? super Result<? extends StripeIntent>> continuation) {
        RetrieveStripeIntent2 retrieveStripeIntent2;
        if (continuation instanceof RetrieveStripeIntent2) {
            retrieveStripeIntent2 = (RetrieveStripeIntent2) continuation;
            int i = retrieveStripeIntent2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                retrieveStripeIntent2.label = i - Integer.MIN_VALUE;
            } else {
                retrieveStripeIntent2 = new RetrieveStripeIntent2(this, continuation);
            }
        }
        RetrieveStripeIntent2 retrieveStripeIntent22 = retrieveStripeIntent2;
        Object obj = retrieveStripeIntent22.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = retrieveStripeIntent22.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
        retrieveStripeIntent22.label = 1;
        Object objM26910retrieveStripeIntentBWLJW6A$default = StripeRepository.DefaultImpls.m26910retrieveStripeIntentBWLJW6A$default(stripeRepository, str2, options, null, retrieveStripeIntent22, 4, null);
        return objM26910retrieveStripeIntentBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM26910retrieveStripeIntentBWLJW6A$default;
    }
}
