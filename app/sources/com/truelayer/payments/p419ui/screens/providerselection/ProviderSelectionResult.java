package com.truelayer.payments.p419ui.screens.providerselection;

import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderSelectionResult.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "branch", "Lcom/truelayer/payments/core/domain/payments/Branch;", "isRecommendedProvider", "", "schemeId", "", "consentGiven", "saveUserAccount", "(Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/Branch;ZLjava/lang/String;ZZ)V", "getBranch", "()Lcom/truelayer/payments/core/domain/payments/Branch;", "getConsentGiven", "()Z", "getProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getSaveUserAccount", "getSchemeId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProviderSelectionResult {
    public static final int $stable = 8;
    private final Branch branch;
    private final boolean consentGiven;
    private final boolean isRecommendedProvider;
    private final PaymentProvider provider;
    private final boolean saveUserAccount;
    private final String schemeId;

    public static /* synthetic */ ProviderSelectionResult copy$default(ProviderSelectionResult providerSelectionResult, PaymentProvider paymentProvider, Branch branch, boolean z, String str, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProvider = providerSelectionResult.provider;
        }
        if ((i & 2) != 0) {
            branch = providerSelectionResult.branch;
        }
        if ((i & 4) != 0) {
            z = providerSelectionResult.isRecommendedProvider;
        }
        if ((i & 8) != 0) {
            str = providerSelectionResult.schemeId;
        }
        if ((i & 16) != 0) {
            z2 = providerSelectionResult.consentGiven;
        }
        if ((i & 32) != 0) {
            z3 = providerSelectionResult.saveUserAccount;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return providerSelectionResult.copy(paymentProvider, branch, z, str, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component2, reason: from getter */
    public final Branch getBranch() {
        return this.branch;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRecommendedProvider() {
        return this.isRecommendedProvider;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSchemeId() {
        return this.schemeId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getConsentGiven() {
        return this.consentGiven;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSaveUserAccount() {
        return this.saveUserAccount;
    }

    public final ProviderSelectionResult copy(PaymentProvider provider, Branch branch, boolean isRecommendedProvider, String schemeId, boolean consentGiven, boolean saveUserAccount) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new ProviderSelectionResult(provider, branch, isRecommendedProvider, schemeId, consentGiven, saveUserAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderSelectionResult)) {
            return false;
        }
        ProviderSelectionResult providerSelectionResult = (ProviderSelectionResult) other;
        return Intrinsics.areEqual(this.provider, providerSelectionResult.provider) && Intrinsics.areEqual(this.branch, providerSelectionResult.branch) && this.isRecommendedProvider == providerSelectionResult.isRecommendedProvider && Intrinsics.areEqual(this.schemeId, providerSelectionResult.schemeId) && this.consentGiven == providerSelectionResult.consentGiven && this.saveUserAccount == providerSelectionResult.saveUserAccount;
    }

    public int hashCode() {
        int iHashCode = this.provider.hashCode() * 31;
        Branch branch = this.branch;
        int iHashCode2 = (((iHashCode + (branch == null ? 0 : branch.hashCode())) * 31) + Boolean.hashCode(this.isRecommendedProvider)) * 31;
        String str = this.schemeId;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.consentGiven)) * 31) + Boolean.hashCode(this.saveUserAccount);
    }

    public String toString() {
        return "ProviderSelectionResult(provider=" + this.provider + ", branch=" + this.branch + ", isRecommendedProvider=" + this.isRecommendedProvider + ", schemeId=" + this.schemeId + ", consentGiven=" + this.consentGiven + ", saveUserAccount=" + this.saveUserAccount + ")";
    }

    public ProviderSelectionResult(PaymentProvider provider, Branch branch, boolean z, String str, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
        this.branch = branch;
        this.isRecommendedProvider = z;
        this.schemeId = str;
        this.consentGiven = z2;
        this.saveUserAccount = z3;
    }

    public final PaymentProvider getProvider() {
        return this.provider;
    }

    public final Branch getBranch() {
        return this.branch;
    }

    public final boolean isRecommendedProvider() {
        return this.isRecommendedProvider;
    }

    public final String getSchemeId() {
        return this.schemeId;
    }

    public final boolean getConsentGiven() {
        return this.consentGiven;
    }

    public final boolean getSaveUserAccount() {
        return this.saveUserAccount;
    }
}
