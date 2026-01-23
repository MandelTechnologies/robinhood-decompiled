package com.stripe.android;

import android.content.Intent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: PaymentController.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/PaymentController;", "", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "", "startConfirmAndAuth", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestCode", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "", "shouldHandlePaymentResult", "(ILandroid/content/Intent;)Z", "shouldHandleSetupResult", "Lkotlin/Result;", "Lcom/stripe/android/PaymentIntentResult;", "getPaymentIntentResult-gIAlu-s", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentIntentResult", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult-gIAlu-s", "getSetupIntentResult", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface PaymentController {
    /* renamed from: getPaymentIntentResult-gIAlu-s, reason: not valid java name */
    Object mo26836getPaymentIntentResultgIAlus(Intent intent, Continuation<? super Result<PaymentIntentResult>> continuation);

    /* renamed from: getSetupIntentResult-gIAlu-s, reason: not valid java name */
    Object mo26837getSetupIntentResultgIAlus(Intent intent, Continuation<? super Result<SetupIntentResult>> continuation);

    boolean shouldHandlePaymentResult(int requestCode, Intent data);

    boolean shouldHandleSetupResult(int requestCode, Intent data);

    Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, Continuation<? super Unit> continuation);
}
