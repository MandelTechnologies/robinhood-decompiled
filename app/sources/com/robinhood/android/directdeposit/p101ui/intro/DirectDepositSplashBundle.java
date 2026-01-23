package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashBundle;", "", "rhyAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "hasSetUpAnyDirectDepositsFeatures", "", "<init>", "(Lcom/robinhood/utils/Optional;Z)V", "getRhyAccount", "()Lcom/robinhood/utils/Optional;", "getHasSetUpAnyDirectDepositsFeatures", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DirectDepositSplashBundle {
    public static final int $stable = 8;
    private final boolean hasSetUpAnyDirectDepositsFeatures;
    private final Optional<RhyAccount> rhyAccount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectDepositSplashBundle copy$default(DirectDepositSplashBundle directDepositSplashBundle, Optional optional, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            optional = directDepositSplashBundle.rhyAccount;
        }
        if ((i & 2) != 0) {
            z = directDepositSplashBundle.hasSetUpAnyDirectDepositsFeatures;
        }
        return directDepositSplashBundle.copy(optional, z);
    }

    public final Optional<RhyAccount> component1() {
        return this.rhyAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasSetUpAnyDirectDepositsFeatures() {
        return this.hasSetUpAnyDirectDepositsFeatures;
    }

    public final DirectDepositSplashBundle copy(Optional<RhyAccount> rhyAccount, boolean hasSetUpAnyDirectDepositsFeatures) {
        Intrinsics.checkNotNullParameter(rhyAccount, "rhyAccount");
        return new DirectDepositSplashBundle(rhyAccount, hasSetUpAnyDirectDepositsFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositSplashBundle)) {
            return false;
        }
        DirectDepositSplashBundle directDepositSplashBundle = (DirectDepositSplashBundle) other;
        return Intrinsics.areEqual(this.rhyAccount, directDepositSplashBundle.rhyAccount) && this.hasSetUpAnyDirectDepositsFeatures == directDepositSplashBundle.hasSetUpAnyDirectDepositsFeatures;
    }

    public int hashCode() {
        return (this.rhyAccount.hashCode() * 31) + Boolean.hashCode(this.hasSetUpAnyDirectDepositsFeatures);
    }

    public String toString() {
        return "DirectDepositSplashBundle(rhyAccount=" + this.rhyAccount + ", hasSetUpAnyDirectDepositsFeatures=" + this.hasSetUpAnyDirectDepositsFeatures + ")";
    }

    public DirectDepositSplashBundle(Optional<RhyAccount> rhyAccount, boolean z) {
        Intrinsics.checkNotNullParameter(rhyAccount, "rhyAccount");
        this.rhyAccount = rhyAccount;
        this.hasSetUpAnyDirectDepositsFeatures = z;
    }

    public final Optional<RhyAccount> getRhyAccount() {
        return this.rhyAccount;
    }

    public final boolean getHasSetUpAnyDirectDepositsFeatures() {
        return this.hasSetUpAnyDirectDepositsFeatures;
    }
}
