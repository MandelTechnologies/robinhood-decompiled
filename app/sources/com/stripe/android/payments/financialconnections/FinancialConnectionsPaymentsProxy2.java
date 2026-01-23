package com.stripe.android.payments.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsPaymentsProxy.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/payments/financialconnections/FinancialConnectionsLauncherProxy;", "T", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsPaymentsProxy;", "launcher", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "present", "", "financialConnectionsSessionClientSecret", "", "publishableKey", "stripeAccountId", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.financialconnections.FinancialConnectionsLauncherProxy, reason: use source file name */
/* loaded from: classes22.dex */
public final class FinancialConnectionsPaymentsProxy2<T extends FinancialConnectionsSheetLauncher> implements FinancialConnectionsPaymentsProxy {
    private final T launcher;

    public FinancialConnectionsPaymentsProxy2(T launcher) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.launcher = launcher;
    }

    @Override // com.stripe.android.payments.financialconnections.FinancialConnectionsPaymentsProxy
    public void present(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.launcher.present(new FinancialConnectionsSheet.Configuration(financialConnectionsSessionClientSecret, publishableKey, stripeAccountId));
    }
}
