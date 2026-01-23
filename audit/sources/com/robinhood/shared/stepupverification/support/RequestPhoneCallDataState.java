package com.robinhood.shared.stepupverification.support;

import android.telephony.PhoneNumberUtils;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestPhoneCallDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDataState;", "", "isLoading", "", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "bottomSheetInternationalInfo", "phoneNumber", "", "<init>", "(ZLcom/robinhood/android/common/util/InternationalInfo;Lcom/robinhood/android/common/util/InternationalInfo;Ljava/lang/String;)V", "()Z", "getInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "getBottomSheetInternationalInfo", "getPhoneNumber", "()Ljava/lang/String;", "formattedPhoneNumber", "getFormattedPhoneNumber", "primaryCtaEnabled", "getPrimaryCtaEnabled", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RequestPhoneCallDataState {
    public static final int $stable = InternationalInfo.$stable;
    private final InternationalInfo bottomSheetInternationalInfo;
    private final InternationalInfo internationalInfo;
    private final boolean isLoading;
    private final String phoneNumber;

    public static /* synthetic */ RequestPhoneCallDataState copy$default(RequestPhoneCallDataState requestPhoneCallDataState, boolean z, InternationalInfo internationalInfo, InternationalInfo internationalInfo2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = requestPhoneCallDataState.isLoading;
        }
        if ((i & 2) != 0) {
            internationalInfo = requestPhoneCallDataState.internationalInfo;
        }
        if ((i & 4) != 0) {
            internationalInfo2 = requestPhoneCallDataState.bottomSheetInternationalInfo;
        }
        if ((i & 8) != 0) {
            str = requestPhoneCallDataState.phoneNumber;
        }
        return requestPhoneCallDataState.copy(z, internationalInfo, internationalInfo2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final InternationalInfo getInternationalInfo() {
        return this.internationalInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final InternationalInfo getBottomSheetInternationalInfo() {
        return this.bottomSheetInternationalInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final RequestPhoneCallDataState copy(boolean isLoading, InternationalInfo internationalInfo, InternationalInfo bottomSheetInternationalInfo, String phoneNumber) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(bottomSheetInternationalInfo, "bottomSheetInternationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new RequestPhoneCallDataState(isLoading, internationalInfo, bottomSheetInternationalInfo, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPhoneCallDataState)) {
            return false;
        }
        RequestPhoneCallDataState requestPhoneCallDataState = (RequestPhoneCallDataState) other;
        return this.isLoading == requestPhoneCallDataState.isLoading && Intrinsics.areEqual(this.internationalInfo, requestPhoneCallDataState.internationalInfo) && Intrinsics.areEqual(this.bottomSheetInternationalInfo, requestPhoneCallDataState.bottomSheetInternationalInfo) && Intrinsics.areEqual(this.phoneNumber, requestPhoneCallDataState.phoneNumber);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + this.internationalInfo.hashCode()) * 31) + this.bottomSheetInternationalInfo.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "RequestPhoneCallDataState(isLoading=" + this.isLoading + ", internationalInfo=" + this.internationalInfo + ", bottomSheetInternationalInfo=" + this.bottomSheetInternationalInfo + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public RequestPhoneCallDataState(boolean z, InternationalInfo internationalInfo, InternationalInfo bottomSheetInternationalInfo, String phoneNumber) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(bottomSheetInternationalInfo, "bottomSheetInternationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.isLoading = z;
        this.internationalInfo = internationalInfo;
        this.bottomSheetInternationalInfo = bottomSheetInternationalInfo;
        this.phoneNumber = phoneNumber;
    }

    public /* synthetic */ RequestPhoneCallDataState(boolean z, InternationalInfo internationalInfo, InternationalInfo internationalInfo2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, internationalInfo, internationalInfo2, str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final InternationalInfo getInternationalInfo() {
        return this.internationalInfo;
    }

    public final InternationalInfo getBottomSheetInternationalInfo() {
        return this.bottomSheetInternationalInfo;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getFormattedPhoneNumber() {
        String number = PhoneNumberUtils.formatNumber(this.phoneNumber, this.internationalInfo.getCountryCode().getIso3166CountryCode());
        if (number != null) {
            String str = this.internationalInfo.getDisplayCountryPhoneCode() + PlaceholderUtils.XXShortPlaceholderText + number;
            return str != null ? str : "";
        }
        return "";
    }

    public final boolean getPrimaryCtaEnabled() {
        return this.internationalInfo.getValidatePhoneNumber().invoke(this.phoneNumber).booleanValue();
    }
}
