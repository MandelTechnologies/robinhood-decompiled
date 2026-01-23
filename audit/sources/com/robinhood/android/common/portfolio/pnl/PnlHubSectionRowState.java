package com.robinhood.android.common.portfolio.pnl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubSectionRowState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionRowState;", "", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PnlHubSectionRowState {
    public static final int $stable = 0;
    private final String accountNumber;

    public static /* synthetic */ PnlHubSectionRowState copy$default(PnlHubSectionRowState pnlHubSectionRowState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnlHubSectionRowState.accountNumber;
        }
        return pnlHubSectionRowState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PnlHubSectionRowState copy(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new PnlHubSectionRowState(accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PnlHubSectionRowState) && Intrinsics.areEqual(this.accountNumber, ((PnlHubSectionRowState) other).accountNumber);
    }

    public int hashCode() {
        return this.accountNumber.hashCode();
    }

    public String toString() {
        return "PnlHubSectionRowState(accountNumber=" + this.accountNumber + ")";
    }

    public PnlHubSectionRowState(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
