package com.robinhood.android.acatsin.enablemargin;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInEnableMarginDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDataState;", "", "completedInitialLoad", "", "multiAccountMarginEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "inHoodMonth2025Promo", "<init>", "(ZLbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;Z)V", "getCompletedInitialLoad", "()Z", "getMultiAccountMarginEligibility", "()Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "getInHoodMonth2025Promo", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInEnableMarginDataState {
    public static final int $stable = 8;
    private final boolean completedInitialLoad;
    private final boolean inHoodMonth2025Promo;
    private final GetMultiAccountEligibilityResponseDto multiAccountMarginEligibility;

    public AcatsInEnableMarginDataState() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ AcatsInEnableMarginDataState copy$default(AcatsInEnableMarginDataState acatsInEnableMarginDataState, boolean z, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = acatsInEnableMarginDataState.completedInitialLoad;
        }
        if ((i & 2) != 0) {
            getMultiAccountEligibilityResponseDto = acatsInEnableMarginDataState.multiAccountMarginEligibility;
        }
        if ((i & 4) != 0) {
            z2 = acatsInEnableMarginDataState.inHoodMonth2025Promo;
        }
        return acatsInEnableMarginDataState.copy(z, getMultiAccountEligibilityResponseDto, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCompletedInitialLoad() {
        return this.completedInitialLoad;
    }

    /* renamed from: component2, reason: from getter */
    public final GetMultiAccountEligibilityResponseDto getMultiAccountMarginEligibility() {
        return this.multiAccountMarginEligibility;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInHoodMonth2025Promo() {
        return this.inHoodMonth2025Promo;
    }

    public final AcatsInEnableMarginDataState copy(boolean completedInitialLoad, GetMultiAccountEligibilityResponseDto multiAccountMarginEligibility, boolean inHoodMonth2025Promo) {
        return new AcatsInEnableMarginDataState(completedInitialLoad, multiAccountMarginEligibility, inHoodMonth2025Promo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInEnableMarginDataState)) {
            return false;
        }
        AcatsInEnableMarginDataState acatsInEnableMarginDataState = (AcatsInEnableMarginDataState) other;
        return this.completedInitialLoad == acatsInEnableMarginDataState.completedInitialLoad && Intrinsics.areEqual(this.multiAccountMarginEligibility, acatsInEnableMarginDataState.multiAccountMarginEligibility) && this.inHoodMonth2025Promo == acatsInEnableMarginDataState.inHoodMonth2025Promo;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.completedInitialLoad) * 31;
        GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto = this.multiAccountMarginEligibility;
        return ((iHashCode + (getMultiAccountEligibilityResponseDto == null ? 0 : getMultiAccountEligibilityResponseDto.hashCode())) * 31) + Boolean.hashCode(this.inHoodMonth2025Promo);
    }

    public String toString() {
        return "AcatsInEnableMarginDataState(completedInitialLoad=" + this.completedInitialLoad + ", multiAccountMarginEligibility=" + this.multiAccountMarginEligibility + ", inHoodMonth2025Promo=" + this.inHoodMonth2025Promo + ")";
    }

    public AcatsInEnableMarginDataState(boolean z, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, boolean z2) {
        this.completedInitialLoad = z;
        this.multiAccountMarginEligibility = getMultiAccountEligibilityResponseDto;
        this.inHoodMonth2025Promo = z2;
    }

    public /* synthetic */ AcatsInEnableMarginDataState(boolean z, GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : getMultiAccountEligibilityResponseDto, (i & 4) != 0 ? false : z2);
    }

    public final boolean getCompletedInitialLoad() {
        return this.completedInitialLoad;
    }

    public final GetMultiAccountEligibilityResponseDto getMultiAccountMarginEligibility() {
        return this.multiAccountMarginEligibility;
    }

    public final boolean getInHoodMonth2025Promo() {
        return this.inHoodMonth2025Promo;
    }
}
