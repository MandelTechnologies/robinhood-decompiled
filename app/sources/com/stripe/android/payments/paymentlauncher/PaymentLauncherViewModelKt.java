package com.stripe.android.payments.paymentlauncher;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, m3636d2 = {"toStripeId", "", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class PaymentLauncherViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toStripeId(String str) {
        return StringsKt.substringBefore$default(str, "_secret_", (String) null, 2, (Object) null);
    }
}
