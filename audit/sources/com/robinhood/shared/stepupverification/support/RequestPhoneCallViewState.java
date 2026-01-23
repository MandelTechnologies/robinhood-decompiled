package com.robinhood.shared.stepupverification.support;

import com.robinhood.android.common.util.InternationalInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestPhoneCallViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallViewState;", "", "isLoading", "", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "phoneNumber", "", "bottomSheetInternationalInfo", "primaryCtaEnabled", "<init>", "(ZLcom/robinhood/android/common/util/InternationalInfo;Ljava/lang/String;Lcom/robinhood/android/common/util/InternationalInfo;Z)V", "()Z", "getInternationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "getPhoneNumber", "()Ljava/lang/String;", "getBottomSheetInternationalInfo", "getPrimaryCtaEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RequestPhoneCallViewState {
    public static final int $stable = InternationalInfo.$stable;
    private final InternationalInfo bottomSheetInternationalInfo;
    private final InternationalInfo internationalInfo;
    private final boolean isLoading;
    private final String phoneNumber;
    private final boolean primaryCtaEnabled;

    public static /* synthetic */ RequestPhoneCallViewState copy$default(RequestPhoneCallViewState requestPhoneCallViewState, boolean z, InternationalInfo internationalInfo, String str, InternationalInfo internationalInfo2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = requestPhoneCallViewState.isLoading;
        }
        if ((i & 2) != 0) {
            internationalInfo = requestPhoneCallViewState.internationalInfo;
        }
        if ((i & 4) != 0) {
            str = requestPhoneCallViewState.phoneNumber;
        }
        if ((i & 8) != 0) {
            internationalInfo2 = requestPhoneCallViewState.bottomSheetInternationalInfo;
        }
        if ((i & 16) != 0) {
            z2 = requestPhoneCallViewState.primaryCtaEnabled;
        }
        boolean z3 = z2;
        String str2 = str;
        return requestPhoneCallViewState.copy(z, internationalInfo, str2, internationalInfo2, z3);
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
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final InternationalInfo getBottomSheetInternationalInfo() {
        return this.bottomSheetInternationalInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPrimaryCtaEnabled() {
        return this.primaryCtaEnabled;
    }

    public final RequestPhoneCallViewState copy(boolean isLoading, InternationalInfo internationalInfo, String phoneNumber, InternationalInfo bottomSheetInternationalInfo, boolean primaryCtaEnabled) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(bottomSheetInternationalInfo, "bottomSheetInternationalInfo");
        return new RequestPhoneCallViewState(isLoading, internationalInfo, phoneNumber, bottomSheetInternationalInfo, primaryCtaEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPhoneCallViewState)) {
            return false;
        }
        RequestPhoneCallViewState requestPhoneCallViewState = (RequestPhoneCallViewState) other;
        return this.isLoading == requestPhoneCallViewState.isLoading && Intrinsics.areEqual(this.internationalInfo, requestPhoneCallViewState.internationalInfo) && Intrinsics.areEqual(this.phoneNumber, requestPhoneCallViewState.phoneNumber) && Intrinsics.areEqual(this.bottomSheetInternationalInfo, requestPhoneCallViewState.bottomSheetInternationalInfo) && this.primaryCtaEnabled == requestPhoneCallViewState.primaryCtaEnabled;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + this.internationalInfo.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.bottomSheetInternationalInfo.hashCode()) * 31) + Boolean.hashCode(this.primaryCtaEnabled);
    }

    public String toString() {
        return "RequestPhoneCallViewState(isLoading=" + this.isLoading + ", internationalInfo=" + this.internationalInfo + ", phoneNumber=" + this.phoneNumber + ", bottomSheetInternationalInfo=" + this.bottomSheetInternationalInfo + ", primaryCtaEnabled=" + this.primaryCtaEnabled + ")";
    }

    public RequestPhoneCallViewState(boolean z, InternationalInfo internationalInfo, String phoneNumber, InternationalInfo bottomSheetInternationalInfo, boolean z2) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(bottomSheetInternationalInfo, "bottomSheetInternationalInfo");
        this.isLoading = z;
        this.internationalInfo = internationalInfo;
        this.phoneNumber = phoneNumber;
        this.bottomSheetInternationalInfo = bottomSheetInternationalInfo;
        this.primaryCtaEnabled = z2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final InternationalInfo getInternationalInfo() {
        return this.internationalInfo;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final InternationalInfo getBottomSheetInternationalInfo() {
        return this.bottomSheetInternationalInfo;
    }

    public final boolean getPrimaryCtaEnabled() {
        return this.primaryCtaEnabled;
    }
}
