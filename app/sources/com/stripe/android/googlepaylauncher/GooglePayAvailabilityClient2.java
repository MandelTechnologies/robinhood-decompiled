package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayAvailabilityClient.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "(Lcom/google/android/gms/wallet/PaymentsClient;)V", "isReady", "", "request", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient, reason: use source file name */
/* loaded from: classes8.dex */
public final class GooglePayAvailabilityClient2 implements GooglePayAvailabilityClient {
    private final PaymentsClient paymentsClient;

    /* compiled from: GooglePayAvailabilityClient.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient", m3645f = "GooglePayAvailabilityClient.kt", m3646l = {22}, m3647m = "isReady")
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient$isReady$1 */
    static final class C425241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C425241(Continuation<? super C425241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayAvailabilityClient2.this.isReady(null, this);
        }
    }

    public GooglePayAvailabilityClient2(PaymentsClient paymentsClient) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        this.paymentsClient = paymentsClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isReady(IsReadyToPayRequest isReadyToPayRequest, Continuation<? super Boolean> continuation) {
        C425241 c425241;
        if (continuation instanceof C425241) {
            c425241 = (C425241) continuation;
            int i = c425241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425241.label = i - Integer.MIN_VALUE;
            } else {
                c425241 = new C425241(continuation);
            }
        }
        Object objAwait = c425241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Task<Boolean> taskIsReadyToPay = this.paymentsClient.isReadyToPay(isReadyToPayRequest);
            Intrinsics.checkNotNullExpressionValue(taskIsReadyToPay, "isReadyToPay(...)");
            c425241.label = 1;
            objAwait = kotlinx.coroutines.tasks.TasksKt.await(taskIsReadyToPay, c425241);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "await(...)");
        return objAwait;
    }

    /* compiled from: GooglePayAvailabilityClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient$Factory */
    public static final class Factory implements GooglePayAvailabilityClient.Factory {
        @Override // com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient.Factory
        public GooglePayAvailabilityClient create(PaymentsClient paymentsClient) {
            Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
            return new GooglePayAvailabilityClient2(paymentsClient);
        }
    }
}
