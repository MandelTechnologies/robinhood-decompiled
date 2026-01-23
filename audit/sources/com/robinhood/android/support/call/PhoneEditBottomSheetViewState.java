package com.robinhood.android.support.call;

import com.robinhood.android.common.util.InternationalInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneEditBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/support/call/PhoneEditBottomSheetViewState;", "", "phoneNumber", "", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/common/util/InternationalInfo;)V", "isPhoneNumberValid", "", "phoneNumberWithCountryCode", "getPhoneNumberWithCountryCode", "()Ljava/lang/String;", "enableSaveButton", "getEnableSaveButton", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PhoneEditBottomSheetViewState {
    public static final int $stable = InternationalInfo.$stable;
    private final boolean enableSaveButton;
    private final InternationalInfo internationalInfo;
    private final boolean isPhoneNumberValid;
    private final String phoneNumber;
    private final String phoneNumberWithCountryCode;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneEditBottomSheetViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    private final InternationalInfo getInternationalInfo() {
        return this.internationalInfo;
    }

    public static /* synthetic */ PhoneEditBottomSheetViewState copy$default(PhoneEditBottomSheetViewState phoneEditBottomSheetViewState, String str, InternationalInfo internationalInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneEditBottomSheetViewState.phoneNumber;
        }
        if ((i & 2) != 0) {
            internationalInfo = phoneEditBottomSheetViewState.internationalInfo;
        }
        return phoneEditBottomSheetViewState.copy(str, internationalInfo);
    }

    public final PhoneEditBottomSheetViewState copy(String phoneNumber, InternationalInfo internationalInfo) {
        return new PhoneEditBottomSheetViewState(phoneNumber, internationalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneEditBottomSheetViewState)) {
            return false;
        }
        PhoneEditBottomSheetViewState phoneEditBottomSheetViewState = (PhoneEditBottomSheetViewState) other;
        return Intrinsics.areEqual(this.phoneNumber, phoneEditBottomSheetViewState.phoneNumber) && Intrinsics.areEqual(this.internationalInfo, phoneEditBottomSheetViewState.internationalInfo);
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InternationalInfo internationalInfo = this.internationalInfo;
        return iHashCode + (internationalInfo != null ? internationalInfo.hashCode() : 0);
    }

    public String toString() {
        return "PhoneEditBottomSheetViewState(phoneNumber=" + this.phoneNumber + ", internationalInfo=" + this.internationalInfo + ")";
    }

    public PhoneEditBottomSheetViewState(String str, InternationalInfo internationalInfo) {
        String str2;
        Function1<String, Boolean> validatePhoneNumber;
        this.phoneNumber = str;
        this.internationalInfo = internationalInfo;
        boolean z = false;
        if (internationalInfo != null && (validatePhoneNumber = internationalInfo.getValidatePhoneNumber()) != null && validatePhoneNumber.invoke(str).booleanValue()) {
            z = true;
        }
        this.isPhoneNumberValid = z;
        if (internationalInfo == null || str == null) {
            str2 = null;
        } else {
            str2 = internationalInfo.getDisplayCountryPhoneCode() + str;
        }
        this.phoneNumberWithCountryCode = str2;
        this.enableSaveButton = z;
    }

    public /* synthetic */ PhoneEditBottomSheetViewState(String str, InternationalInfo internationalInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : internationalInfo);
    }

    public final String getPhoneNumberWithCountryCode() {
        return this.phoneNumberWithCountryCode;
    }

    public final boolean getEnableSaveButton() {
        return this.enableSaveButton;
    }
}
