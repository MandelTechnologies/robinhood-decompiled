package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import kotlin.Metadata;

/* compiled from: GooglePayPaymentMethodLauncherContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toV2", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherContract2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final GooglePayPaymentMethodLauncherContractV2.Args toV2(GooglePayPaymentMethodLauncherContract.Args args) {
        return new GooglePayPaymentMethodLauncherContractV2.Args(args.getConfig$payments_core_release(), args.getCurrencyCode$payments_core_release(), args.getAmount$payments_core_release(), null, args.getTransactionId$payments_core_release(), 8, null);
    }
}
