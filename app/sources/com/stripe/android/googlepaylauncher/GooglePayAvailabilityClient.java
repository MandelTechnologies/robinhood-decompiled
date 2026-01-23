package com.stripe.android.googlepaylauncher;

import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GooglePayAvailabilityClient.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "", "isReady", "", "request", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface GooglePayAvailabilityClient {

    /* compiled from: GooglePayAvailabilityClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface Factory {
        GooglePayAvailabilityClient create(PaymentsClient paymentsClient);
    }

    Object isReady(IsReadyToPayRequest isReadyToPayRequest, Continuation<? super Boolean> continuation);
}
