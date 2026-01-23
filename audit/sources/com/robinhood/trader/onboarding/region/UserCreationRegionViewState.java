package com.robinhood.trader.onboarding.region;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationRegionDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionViewState;", "", "isLoading", "", "currentRegion", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(ZLcom/robinhood/iso/countrycode/CountryCode;)V", "()Z", "getCurrentRegion", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserCreationRegionViewState {
    public static final int $stable = 8;
    private final CountryCode currentRegion;
    private final boolean isLoading;

    public static /* synthetic */ UserCreationRegionViewState copy$default(UserCreationRegionViewState userCreationRegionViewState, boolean z, CountryCode countryCode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userCreationRegionViewState.isLoading;
        }
        if ((i & 2) != 0) {
            countryCode = userCreationRegionViewState.currentRegion;
        }
        return userCreationRegionViewState.copy(z, countryCode);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final CountryCode getCurrentRegion() {
        return this.currentRegion;
    }

    public final UserCreationRegionViewState copy(boolean isLoading, CountryCode currentRegion) {
        return new UserCreationRegionViewState(isLoading, currentRegion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCreationRegionViewState)) {
            return false;
        }
        UserCreationRegionViewState userCreationRegionViewState = (UserCreationRegionViewState) other;
        return this.isLoading == userCreationRegionViewState.isLoading && Intrinsics.areEqual(this.currentRegion, userCreationRegionViewState.currentRegion);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        CountryCode countryCode = this.currentRegion;
        return iHashCode + (countryCode == null ? 0 : countryCode.hashCode());
    }

    public String toString() {
        return "UserCreationRegionViewState(isLoading=" + this.isLoading + ", currentRegion=" + this.currentRegion + ")";
    }

    public UserCreationRegionViewState(boolean z, CountryCode countryCode) {
        this.isLoading = z;
        this.currentRegion = countryCode;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final CountryCode getCurrentRegion() {
        return this.currentRegion;
    }
}
