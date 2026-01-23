package com.robinhood.android.moneymovement.checkoutflow;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoneyMovementPaymentPreferenceDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceDataState;", "", "preferredAccountName", "", "preferredAccountId", "unexpectedError", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPreferredAccountName", "()Ljava/lang/String;", "getPreferredAccountId", "getUnexpectedError", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MoneyMovementPaymentPreferenceDataState {
    public static final int $stable = 0;
    private final String preferredAccountId;
    private final String preferredAccountName;
    private final boolean unexpectedError;

    public static /* synthetic */ MoneyMovementPaymentPreferenceDataState copy$default(MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moneyMovementPaymentPreferenceDataState.preferredAccountName;
        }
        if ((i & 2) != 0) {
            str2 = moneyMovementPaymentPreferenceDataState.preferredAccountId;
        }
        if ((i & 4) != 0) {
            z = moneyMovementPaymentPreferenceDataState.unexpectedError;
        }
        return moneyMovementPaymentPreferenceDataState.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreferredAccountName() {
        return this.preferredAccountName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreferredAccountId() {
        return this.preferredAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUnexpectedError() {
        return this.unexpectedError;
    }

    public final MoneyMovementPaymentPreferenceDataState copy(String preferredAccountName, String preferredAccountId, boolean unexpectedError) {
        return new MoneyMovementPaymentPreferenceDataState(preferredAccountName, preferredAccountId, unexpectedError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoneyMovementPaymentPreferenceDataState)) {
            return false;
        }
        MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState = (MoneyMovementPaymentPreferenceDataState) other;
        return Intrinsics.areEqual(this.preferredAccountName, moneyMovementPaymentPreferenceDataState.preferredAccountName) && Intrinsics.areEqual(this.preferredAccountId, moneyMovementPaymentPreferenceDataState.preferredAccountId) && this.unexpectedError == moneyMovementPaymentPreferenceDataState.unexpectedError;
    }

    public int hashCode() {
        String str = this.preferredAccountName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preferredAccountId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.unexpectedError);
    }

    public String toString() {
        return "MoneyMovementPaymentPreferenceDataState(preferredAccountName=" + this.preferredAccountName + ", preferredAccountId=" + this.preferredAccountId + ", unexpectedError=" + this.unexpectedError + ")";
    }

    public MoneyMovementPaymentPreferenceDataState(String str, String str2, boolean z) {
        this.preferredAccountName = str;
        this.preferredAccountId = str2;
        this.unexpectedError = z;
    }

    public /* synthetic */ MoneyMovementPaymentPreferenceDataState(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public final String getPreferredAccountName() {
        return this.preferredAccountName;
    }

    public final String getPreferredAccountId() {
        return this.preferredAccountId;
    }

    public final boolean getUnexpectedError() {
        return this.unexpectedError;
    }
}
