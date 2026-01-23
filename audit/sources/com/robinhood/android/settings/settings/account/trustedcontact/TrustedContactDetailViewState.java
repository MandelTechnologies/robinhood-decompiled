package com.robinhood.android.settings.settings.account.trustedcontact;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedContactDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailViewState;", "", "loading", "", "fullName", "", "email", "phoneNumber", PlaceTypes.ADDRESS, "isAddressRowVisible", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLoading", "()Z", "getFullName", "()Ljava/lang/String;", "getEmail", "getPhoneNumber", "getAddress", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrustedContactDetailViewState {
    public static final int $stable = 0;
    private final String address;
    private final String email;
    private final String fullName;
    private final boolean isAddressRowVisible;
    private final boolean loading;
    private final String phoneNumber;

    public static /* synthetic */ TrustedContactDetailViewState copy$default(TrustedContactDetailViewState trustedContactDetailViewState, boolean z, String str, String str2, String str3, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = trustedContactDetailViewState.loading;
        }
        if ((i & 2) != 0) {
            str = trustedContactDetailViewState.fullName;
        }
        if ((i & 4) != 0) {
            str2 = trustedContactDetailViewState.email;
        }
        if ((i & 8) != 0) {
            str3 = trustedContactDetailViewState.phoneNumber;
        }
        if ((i & 16) != 0) {
            str4 = trustedContactDetailViewState.address;
        }
        if ((i & 32) != 0) {
            z2 = trustedContactDetailViewState.isAddressRowVisible;
        }
        String str5 = str4;
        boolean z3 = z2;
        return trustedContactDetailViewState.copy(z, str, str2, str3, str5, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsAddressRowVisible() {
        return this.isAddressRowVisible;
    }

    public final TrustedContactDetailViewState copy(boolean loading, String fullName, String email, String phoneNumber, String address, boolean isAddressRowVisible) {
        return new TrustedContactDetailViewState(loading, fullName, email, phoneNumber, address, isAddressRowVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedContactDetailViewState)) {
            return false;
        }
        TrustedContactDetailViewState trustedContactDetailViewState = (TrustedContactDetailViewState) other;
        return this.loading == trustedContactDetailViewState.loading && Intrinsics.areEqual(this.fullName, trustedContactDetailViewState.fullName) && Intrinsics.areEqual(this.email, trustedContactDetailViewState.email) && Intrinsics.areEqual(this.phoneNumber, trustedContactDetailViewState.phoneNumber) && Intrinsics.areEqual(this.address, trustedContactDetailViewState.address) && this.isAddressRowVisible == trustedContactDetailViewState.isAddressRowVisible;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAddressRowVisible);
    }

    public String toString() {
        return "TrustedContactDetailViewState(loading=" + this.loading + ", fullName=" + this.fullName + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", address=" + this.address + ", isAddressRowVisible=" + this.isAddressRowVisible + ")";
    }

    public TrustedContactDetailViewState(boolean z, String str, String str2, String str3, String str4, boolean z2) {
        this.loading = z;
        this.fullName = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.address = str4;
        this.isAddressRowVisible = z2;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getAddress() {
        return this.address;
    }

    public final boolean isAddressRowVisible() {
        return this.isAddressRowVisible;
    }
}
