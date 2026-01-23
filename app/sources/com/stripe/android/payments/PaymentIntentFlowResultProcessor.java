package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.PaymentIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0094@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0014J:\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 H\u0094@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J:\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 H\u0094@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m3636d2 = {"Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/PaymentIntentResult;", "context", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "cancelStripeIntentSource", "Lkotlin/Result;", "stripeIntentId", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "sourceId", "cancelStripeIntentSource-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "stripeIntent", "outcomeFromFlow", "", "failureMessage", "refreshStripeIntent", "clientSecret", "expandFields", "", "refreshStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "retrieveStripeIntent-BWLJW6A", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class PaymentIntentFlowResultProcessor extends PaymentFlowResultProcessor<PaymentIntent, PaymentIntentResult> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentFlowResultProcessor(Context context, final Function0<String> publishableKeyProvider, StripeRepository stripeRepository, Logger logger, CoroutineContext workContext) {
        super(context, new Provider() { // from class: com.stripe.android.payments.PaymentIntentFlowResultProcessor$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                return PaymentIntentFlowResultProcessor._init_$lambda$0(publishableKeyProvider);
            }
        }, stripeRepository, logger, workContext, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: retrieveStripeIntent-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object mo26916retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        PaymentIntentFlowResultProcessor$retrieveStripeIntent$1 paymentIntentFlowResultProcessor$retrieveStripeIntent$1;
        if (continuation instanceof PaymentIntentFlowResultProcessor$retrieveStripeIntent$1) {
            paymentIntentFlowResultProcessor$retrieveStripeIntent$1 = (PaymentIntentFlowResultProcessor$retrieveStripeIntent$1) continuation;
            int i = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentIntentFlowResultProcessor$retrieveStripeIntent$1 = new PaymentIntentFlowResultProcessor$retrieveStripeIntent$1(this, continuation);
            }
        }
        Object obj = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = getStripeRepository();
        paymentIntentFlowResultProcessor$retrieveStripeIntent$1.label = 1;
        Object objMo26885retrievePaymentIntentBWLJW6A = stripeRepository.mo26885retrievePaymentIntentBWLJW6A(str, options, list, paymentIntentFlowResultProcessor$retrieveStripeIntent$1);
        return objMo26885retrievePaymentIntentBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo26885retrievePaymentIntentBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: refreshStripeIntent-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object mo26915refreshStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        PaymentIntentFlowResultProcessor$refreshStripeIntent$1 paymentIntentFlowResultProcessor$refreshStripeIntent$1;
        if (continuation instanceof PaymentIntentFlowResultProcessor$refreshStripeIntent$1) {
            paymentIntentFlowResultProcessor$refreshStripeIntent$1 = (PaymentIntentFlowResultProcessor$refreshStripeIntent$1) continuation;
            int i = paymentIntentFlowResultProcessor$refreshStripeIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentIntentFlowResultProcessor$refreshStripeIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentIntentFlowResultProcessor$refreshStripeIntent$1 = new PaymentIntentFlowResultProcessor$refreshStripeIntent$1(this, continuation);
            }
        }
        Object obj = paymentIntentFlowResultProcessor$refreshStripeIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentIntentFlowResultProcessor$refreshStripeIntent$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = getStripeRepository();
        paymentIntentFlowResultProcessor$refreshStripeIntent$1.label = 1;
        Object objMo26882refreshPaymentIntent0E7RQCE = stripeRepository.mo26882refreshPaymentIntent0E7RQCE(str, options, paymentIntentFlowResultProcessor$refreshStripeIntent$1);
        return objMo26882refreshPaymentIntent0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo26882refreshPaymentIntent0E7RQCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    /* renamed from: cancelStripeIntentSource-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object mo26913cancelStripeIntentSourceBWLJW6A(String str, ApiRequest.Options options, String str2, Continuation<? super Result<PaymentIntent>> continuation) {
        PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1 paymentIntentFlowResultProcessor$cancelStripeIntentSource$1;
        if (continuation instanceof PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1) {
            paymentIntentFlowResultProcessor$cancelStripeIntentSource$1 = (PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1) continuation;
            int i = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentIntentFlowResultProcessor$cancelStripeIntentSource$1 = new PaymentIntentFlowResultProcessor$cancelStripeIntentSource$1(this, continuation);
            }
        }
        Object obj = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = getStripeRepository();
        paymentIntentFlowResultProcessor$cancelStripeIntentSource$1.label = 1;
        Object objMo26869cancelPaymentIntentSourceBWLJW6A = stripeRepository.mo26869cancelPaymentIntentSourceBWLJW6A(str, str2, options, paymentIntentFlowResultProcessor$cancelStripeIntentSource$1);
        return objMo26869cancelPaymentIntentSourceBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo26869cancelPaymentIntentSourceBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.payments.PaymentFlowResultProcessor
    public PaymentIntentResult createStripeIntentResult(PaymentIntent stripeIntent, int outcomeFromFlow, String failureMessage) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        return new PaymentIntentResult(stripeIntent, outcomeFromFlow, failureMessage);
    }
}
