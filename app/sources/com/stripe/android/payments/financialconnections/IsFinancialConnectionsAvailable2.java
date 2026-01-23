package com.stripe.android.payments.financialconnections;

import kotlin.Metadata;

/* compiled from: IsFinancialConnectionsAvailable.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;", "()V", "invoke", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.financialconnections.DefaultIsFinancialConnectionsAvailable, reason: use source file name */
/* loaded from: classes22.dex */
public final class IsFinancialConnectionsAvailable2 implements IsFinancialConnectionsAvailable {
    public static final IsFinancialConnectionsAvailable2 INSTANCE = new IsFinancialConnectionsAvailable2();

    private IsFinancialConnectionsAvailable2() {
    }

    @Override // com.stripe.android.payments.financialconnections.IsFinancialConnectionsAvailable
    public boolean invoke() throws ClassNotFoundException {
        try {
            Class.forName("com.stripe.android.financialconnections.FinancialConnectionsSheet");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
