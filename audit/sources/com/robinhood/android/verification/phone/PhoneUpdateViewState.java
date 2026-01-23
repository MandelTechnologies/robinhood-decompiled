package com.robinhood.android.verification.phone;

import com.robinhood.android.common.util.InternationalInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneUpdateViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateViewState;", "", "isLoading", "", "selectedInternationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "isValidPhoneNumber", "trimmedPhoneNumber", "", "<init>", "(ZLcom/robinhood/android/common/util/InternationalInfo;ZLjava/lang/String;)V", "()Z", "getSelectedInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "getTrimmedPhoneNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PhoneUpdateViewState {
    public static final int $stable = InternationalInfo.$stable;
    private final boolean isLoading;
    private final boolean isValidPhoneNumber;
    private final InternationalInfo selectedInternationalInfo;
    private final String trimmedPhoneNumber;

    public static /* synthetic */ PhoneUpdateViewState copy$default(PhoneUpdateViewState phoneUpdateViewState, boolean z, InternationalInfo internationalInfo, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = phoneUpdateViewState.isLoading;
        }
        if ((i & 2) != 0) {
            internationalInfo = phoneUpdateViewState.selectedInternationalInfo;
        }
        if ((i & 4) != 0) {
            z2 = phoneUpdateViewState.isValidPhoneNumber;
        }
        if ((i & 8) != 0) {
            str = phoneUpdateViewState.trimmedPhoneNumber;
        }
        return phoneUpdateViewState.copy(z, internationalInfo, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final InternationalInfo getSelectedInternationalInfo() {
        return this.selectedInternationalInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsValidPhoneNumber() {
        return this.isValidPhoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTrimmedPhoneNumber() {
        return this.trimmedPhoneNumber;
    }

    public final PhoneUpdateViewState copy(boolean isLoading, InternationalInfo selectedInternationalInfo, boolean isValidPhoneNumber, String trimmedPhoneNumber) {
        Intrinsics.checkNotNullParameter(selectedInternationalInfo, "selectedInternationalInfo");
        Intrinsics.checkNotNullParameter(trimmedPhoneNumber, "trimmedPhoneNumber");
        return new PhoneUpdateViewState(isLoading, selectedInternationalInfo, isValidPhoneNumber, trimmedPhoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneUpdateViewState)) {
            return false;
        }
        PhoneUpdateViewState phoneUpdateViewState = (PhoneUpdateViewState) other;
        return this.isLoading == phoneUpdateViewState.isLoading && Intrinsics.areEqual(this.selectedInternationalInfo, phoneUpdateViewState.selectedInternationalInfo) && this.isValidPhoneNumber == phoneUpdateViewState.isValidPhoneNumber && Intrinsics.areEqual(this.trimmedPhoneNumber, phoneUpdateViewState.trimmedPhoneNumber);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + this.selectedInternationalInfo.hashCode()) * 31) + Boolean.hashCode(this.isValidPhoneNumber)) * 31) + this.trimmedPhoneNumber.hashCode();
    }

    public String toString() {
        return "PhoneUpdateViewState(isLoading=" + this.isLoading + ", selectedInternationalInfo=" + this.selectedInternationalInfo + ", isValidPhoneNumber=" + this.isValidPhoneNumber + ", trimmedPhoneNumber=" + this.trimmedPhoneNumber + ")";
    }

    public PhoneUpdateViewState(boolean z, InternationalInfo selectedInternationalInfo, boolean z2, String trimmedPhoneNumber) {
        Intrinsics.checkNotNullParameter(selectedInternationalInfo, "selectedInternationalInfo");
        Intrinsics.checkNotNullParameter(trimmedPhoneNumber, "trimmedPhoneNumber");
        this.isLoading = z;
        this.selectedInternationalInfo = selectedInternationalInfo;
        this.isValidPhoneNumber = z2;
        this.trimmedPhoneNumber = trimmedPhoneNumber;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final InternationalInfo getSelectedInternationalInfo() {
        return this.selectedInternationalInfo;
    }

    public final boolean isValidPhoneNumber() {
        return this.isValidPhoneNumber;
    }

    public final String getTrimmedPhoneNumber() {
        return this.trimmedPhoneNumber;
    }
}
