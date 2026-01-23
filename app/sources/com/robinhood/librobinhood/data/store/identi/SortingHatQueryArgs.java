package com.robinhood.librobinhood.data.store.identi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SortingHatQueryArgs.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "", "applicationId", "", "accountNumber", "hasCryptoImpression", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getApplicationId", "()Ljava/lang/String;", "getAccountNumber", "getHasCryptoImpression", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SortingHatQueryArgs {
    private final String accountNumber;
    private final String applicationId;
    private final boolean hasCryptoImpression;

    public SortingHatQueryArgs() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ SortingHatQueryArgs copy$default(SortingHatQueryArgs sortingHatQueryArgs, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sortingHatQueryArgs.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = sortingHatQueryArgs.accountNumber;
        }
        if ((i & 4) != 0) {
            z = sortingHatQueryArgs.hasCryptoImpression;
        }
        return sortingHatQueryArgs.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasCryptoImpression() {
        return this.hasCryptoImpression;
    }

    public final SortingHatQueryArgs copy(String applicationId, String accountNumber, boolean hasCryptoImpression) {
        return new SortingHatQueryArgs(applicationId, accountNumber, hasCryptoImpression);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortingHatQueryArgs)) {
            return false;
        }
        SortingHatQueryArgs sortingHatQueryArgs = (SortingHatQueryArgs) other;
        return Intrinsics.areEqual(this.applicationId, sortingHatQueryArgs.applicationId) && Intrinsics.areEqual(this.accountNumber, sortingHatQueryArgs.accountNumber) && this.hasCryptoImpression == sortingHatQueryArgs.hasCryptoImpression;
    }

    public int hashCode() {
        String str = this.applicationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountNumber;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasCryptoImpression);
    }

    public String toString() {
        return "SortingHatQueryArgs(applicationId=" + this.applicationId + ", accountNumber=" + this.accountNumber + ", hasCryptoImpression=" + this.hasCryptoImpression + ")";
    }

    public SortingHatQueryArgs(String str, String str2, boolean z) {
        this.applicationId = str;
        this.accountNumber = str2;
        this.hasCryptoImpression = z;
    }

    public /* synthetic */ SortingHatQueryArgs(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getHasCryptoImpression() {
        return this.hasCryptoImpression;
    }
}
