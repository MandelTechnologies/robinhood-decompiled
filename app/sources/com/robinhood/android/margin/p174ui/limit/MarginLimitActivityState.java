package com.robinhood.android.margin.p174ui.limit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitActivityState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityState;", "", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginLimitActivityState {
    public static final int $stable = 0;
    private final String accountNumber;

    public static /* synthetic */ MarginLimitActivityState copy$default(MarginLimitActivityState marginLimitActivityState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginLimitActivityState.accountNumber;
        }
        return marginLimitActivityState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final MarginLimitActivityState copy(String accountNumber) {
        return new MarginLimitActivityState(accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarginLimitActivityState) && Intrinsics.areEqual(this.accountNumber, ((MarginLimitActivityState) other).accountNumber);
    }

    public int hashCode() {
        String str = this.accountNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "MarginLimitActivityState(accountNumber=" + this.accountNumber + ")";
    }

    public MarginLimitActivityState(String str) {
        this.accountNumber = str;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
