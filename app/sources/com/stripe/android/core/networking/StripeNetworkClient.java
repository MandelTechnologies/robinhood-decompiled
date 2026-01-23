package com.stripe.android.core.networking;

import com.stripe.android.core.exception.APIConnectionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: StripeNetworkClient.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeNetworkClient;", "", "Lcom/stripe/android/core/networking/StripeRequest;", "request", "Lcom/stripe/android/core/networking/StripeResponse;", "", "executeRequest", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface StripeNetworkClient {
    Object executeRequest(StripeRequest stripeRequest, Continuation<? super StripeResponse<String>> continuation) throws APIConnectionException;
}
