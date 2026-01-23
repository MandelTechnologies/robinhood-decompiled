package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentsClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/google/android/gms/wallet/PaymentsClient;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory, reason: use source file name */
/* loaded from: classes8.dex */
public final class PaymentsClientFactory2 implements PaymentsClientFactory {
    private final Context context;

    public PaymentsClientFactory2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.stripe.android.googlepaylauncher.PaymentsClientFactory
    public PaymentsClient create(GooglePayEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(environment.getValue()).build();
        Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "build(...)");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(this.context, walletOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(paymentsClient, "getPaymentsClient(...)");
        return paymentsClient;
    }
}
