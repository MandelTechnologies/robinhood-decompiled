package com.stripe.android.model;

import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ConfirmStripeIntentParams.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "shouldUseStripeSdk", "withShouldUseStripeSdk", "(Z)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "", "getClientSecret", "()Ljava/lang/String;", "clientSecret", "getReturnUrl", "setReturnUrl", "(Ljava/lang/String;)V", "returnUrl", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface ConfirmStripeIntentParams extends StripeParamsModel, Parcelable {
    String getClientSecret();

    String getReturnUrl();

    void setReturnUrl(String str);

    ConfirmStripeIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk);
}
