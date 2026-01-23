package com.robinhood.android.verification.phone;

import com.robinhood.android.common.util.InternationalInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: PhoneUpdateDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0014\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0015J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;", "", "isLoading", "", "selectedInternationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "phoneNumberTypedText", "", "<init>", "(ZLcom/robinhood/android/common/util/InternationalInfo;Ljava/lang/String;)V", "()Z", "getSelectedInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "getPhoneNumberTypedText$feature_verification_externalDebug", "()Ljava/lang/String;", "isValidPhoneNumber", "trimmedPhoneNumber", "getTrimmedPhoneNumber", "component1", "component2", "component3", "component3$feature_verification_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PhoneUpdateDataState {
    public static final int $stable = InternationalInfo.$stable;
    private final boolean isLoading;
    private final String phoneNumberTypedText;
    private final InternationalInfo selectedInternationalInfo;

    public PhoneUpdateDataState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ PhoneUpdateDataState copy$default(PhoneUpdateDataState phoneUpdateDataState, boolean z, InternationalInfo internationalInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = phoneUpdateDataState.isLoading;
        }
        if ((i & 2) != 0) {
            internationalInfo = phoneUpdateDataState.selectedInternationalInfo;
        }
        if ((i & 4) != 0) {
            str = phoneUpdateDataState.phoneNumberTypedText;
        }
        return phoneUpdateDataState.copy(z, internationalInfo, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final InternationalInfo getSelectedInternationalInfo() {
        return this.selectedInternationalInfo;
    }

    /* renamed from: component3$feature_verification_externalDebug, reason: from getter */
    public final String getPhoneNumberTypedText() {
        return this.phoneNumberTypedText;
    }

    public final PhoneUpdateDataState copy(boolean isLoading, InternationalInfo selectedInternationalInfo, String phoneNumberTypedText) {
        Intrinsics.checkNotNullParameter(selectedInternationalInfo, "selectedInternationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumberTypedText, "phoneNumberTypedText");
        return new PhoneUpdateDataState(isLoading, selectedInternationalInfo, phoneNumberTypedText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneUpdateDataState)) {
            return false;
        }
        PhoneUpdateDataState phoneUpdateDataState = (PhoneUpdateDataState) other;
        return this.isLoading == phoneUpdateDataState.isLoading && Intrinsics.areEqual(this.selectedInternationalInfo, phoneUpdateDataState.selectedInternationalInfo) && Intrinsics.areEqual(this.phoneNumberTypedText, phoneUpdateDataState.phoneNumberTypedText);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.selectedInternationalInfo.hashCode()) * 31) + this.phoneNumberTypedText.hashCode();
    }

    public String toString() {
        return "PhoneUpdateDataState(isLoading=" + this.isLoading + ", selectedInternationalInfo=" + this.selectedInternationalInfo + ", phoneNumberTypedText=" + this.phoneNumberTypedText + ")";
    }

    public PhoneUpdateDataState(boolean z, InternationalInfo selectedInternationalInfo, String phoneNumberTypedText) {
        Intrinsics.checkNotNullParameter(selectedInternationalInfo, "selectedInternationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumberTypedText, "phoneNumberTypedText");
        this.isLoading = z;
        this.selectedInternationalInfo = selectedInternationalInfo;
        this.phoneNumberTypedText = phoneNumberTypedText;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ PhoneUpdateDataState(boolean z, InternationalInfo internationalInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? (InternationalInfo) CollectionsKt.first((List) InternationalInfo.INSTANCE.getSortedInternationalInfos()) : internationalInfo, (i & 4) != 0 ? "" : str);
    }

    public final InternationalInfo getSelectedInternationalInfo() {
        return this.selectedInternationalInfo;
    }

    public final String getPhoneNumberTypedText$feature_verification_externalDebug() {
        return this.phoneNumberTypedText;
    }

    public final boolean isValidPhoneNumber() {
        return this.selectedInternationalInfo.getValidatePhoneNumber().invoke(this.phoneNumberTypedText).booleanValue();
    }

    public final String getTrimmedPhoneNumber() {
        return new Regex("[^0-9]").replace(this.selectedInternationalInfo.getDisplayCountryPhoneCode() + this.phoneNumberTypedText, "");
    }
}
