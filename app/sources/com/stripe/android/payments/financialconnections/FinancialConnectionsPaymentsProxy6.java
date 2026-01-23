package com.stripe.android.payments.financialconnections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsPaymentsProxy.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/financialconnections/UnsupportedFinancialConnectionsPaymentsProxy;", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "()V", "present", "", "financialConnectionsSessionClientSecret", "", "publishableKey", "stripeAccountId", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.financialconnections.UnsupportedFinancialConnectionsPaymentsProxy, reason: use source file name */
/* loaded from: classes22.dex */
public final class FinancialConnectionsPaymentsProxy6 implements FinancialConnectionsPaymentsProxy {
    @Override // com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy
    public void present(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }
}
