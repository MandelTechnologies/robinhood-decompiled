package com.robinhood.android.crypto.costbasis.hub;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisHubDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;", "", "section2025Sold", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;", "sectionMissingDetails", "sectionConfirmed", "<init>", "(Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;)V", "getSection2025Sold", "()Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionDataState;", "getSectionMissingDetails", "getSectionConfirmed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisHubDataState {
    public static final int $stable = 8;
    private final CryptoCostBasisHubSectionDataState section2025Sold;
    private final CryptoCostBasisHubSectionDataState sectionConfirmed;
    private final CryptoCostBasisHubSectionDataState sectionMissingDetails;

    public static /* synthetic */ CryptoCostBasisHubDataState copy$default(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, CryptoCostBasisHubSectionDataState cryptoCostBasisHubDataState4, CryptoCostBasisHubSectionDataState cryptoCostBasisHubDataState42, CryptoCostBasisHubSectionDataState cryptoCostBasisHubDataState43, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCostBasisHubDataState4 = cryptoCostBasisHubDataState.section2025Sold;
        }
        if ((i & 2) != 0) {
            cryptoCostBasisHubDataState42 = cryptoCostBasisHubDataState.sectionMissingDetails;
        }
        if ((i & 4) != 0) {
            cryptoCostBasisHubDataState43 = cryptoCostBasisHubDataState.sectionConfirmed;
        }
        return cryptoCostBasisHubDataState.copy(cryptoCostBasisHubDataState4, cryptoCostBasisHubDataState42, cryptoCostBasisHubDataState43);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoCostBasisHubSectionDataState getSection2025Sold() {
        return this.section2025Sold;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoCostBasisHubSectionDataState getSectionMissingDetails() {
        return this.sectionMissingDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoCostBasisHubSectionDataState getSectionConfirmed() {
        return this.sectionConfirmed;
    }

    public final CryptoCostBasisHubDataState copy(CryptoCostBasisHubSectionDataState section2025Sold, CryptoCostBasisHubSectionDataState sectionMissingDetails, CryptoCostBasisHubSectionDataState sectionConfirmed) {
        Intrinsics.checkNotNullParameter(section2025Sold, "section2025Sold");
        Intrinsics.checkNotNullParameter(sectionMissingDetails, "sectionMissingDetails");
        Intrinsics.checkNotNullParameter(sectionConfirmed, "sectionConfirmed");
        return new CryptoCostBasisHubDataState(section2025Sold, sectionMissingDetails, sectionConfirmed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisHubDataState)) {
            return false;
        }
        CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) other;
        return Intrinsics.areEqual(this.section2025Sold, cryptoCostBasisHubDataState.section2025Sold) && Intrinsics.areEqual(this.sectionMissingDetails, cryptoCostBasisHubDataState.sectionMissingDetails) && Intrinsics.areEqual(this.sectionConfirmed, cryptoCostBasisHubDataState.sectionConfirmed);
    }

    public int hashCode() {
        return (((this.section2025Sold.hashCode() * 31) + this.sectionMissingDetails.hashCode()) * 31) + this.sectionConfirmed.hashCode();
    }

    public String toString() {
        return "CryptoCostBasisHubDataState(section2025Sold=" + this.section2025Sold + ", sectionMissingDetails=" + this.sectionMissingDetails + ", sectionConfirmed=" + this.sectionConfirmed + ")";
    }

    public CryptoCostBasisHubDataState(CryptoCostBasisHubSectionDataState section2025Sold, CryptoCostBasisHubSectionDataState sectionMissingDetails, CryptoCostBasisHubSectionDataState sectionConfirmed) {
        Intrinsics.checkNotNullParameter(section2025Sold, "section2025Sold");
        Intrinsics.checkNotNullParameter(sectionMissingDetails, "sectionMissingDetails");
        Intrinsics.checkNotNullParameter(sectionConfirmed, "sectionConfirmed");
        this.section2025Sold = section2025Sold;
        this.sectionMissingDetails = sectionMissingDetails;
        this.sectionConfirmed = sectionConfirmed;
    }

    public final CryptoCostBasisHubSectionDataState getSection2025Sold() {
        return this.section2025Sold;
    }

    public final CryptoCostBasisHubSectionDataState getSectionMissingDetails() {
        return this.sectionMissingDetails;
    }

    public final CryptoCostBasisHubSectionDataState getSectionConfirmed() {
        return this.sectionConfirmed;
    }
}
