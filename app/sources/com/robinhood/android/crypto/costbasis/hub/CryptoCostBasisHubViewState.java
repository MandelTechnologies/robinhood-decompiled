package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisHubViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubViewState;", "", "soldIn2025Section", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;", "missingDetailsSection", "confirmedSection", "<init>", "(Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;)V", "getSoldIn2025Section", "()Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubSectionViewState;", "getMissingDetailsSection", "getConfirmedSection", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisHubViewState {
    public static final int $stable = StringResource.$stable;
    private final CryptoCostBasisHubSectionViewState confirmedSection;
    private final CryptoCostBasisHubSectionViewState missingDetailsSection;
    private final CryptoCostBasisHubSectionViewState soldIn2025Section;

    public static /* synthetic */ CryptoCostBasisHubViewState copy$default(CryptoCostBasisHubViewState cryptoCostBasisHubViewState, CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState, CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState2, CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState3, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoCostBasisHubSectionViewState = cryptoCostBasisHubViewState.soldIn2025Section;
        }
        if ((i & 2) != 0) {
            cryptoCostBasisHubSectionViewState2 = cryptoCostBasisHubViewState.missingDetailsSection;
        }
        if ((i & 4) != 0) {
            cryptoCostBasisHubSectionViewState3 = cryptoCostBasisHubViewState.confirmedSection;
        }
        return cryptoCostBasisHubViewState.copy(cryptoCostBasisHubSectionViewState, cryptoCostBasisHubSectionViewState2, cryptoCostBasisHubSectionViewState3);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoCostBasisHubSectionViewState getSoldIn2025Section() {
        return this.soldIn2025Section;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoCostBasisHubSectionViewState getMissingDetailsSection() {
        return this.missingDetailsSection;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoCostBasisHubSectionViewState getConfirmedSection() {
        return this.confirmedSection;
    }

    public final CryptoCostBasisHubViewState copy(CryptoCostBasisHubSectionViewState soldIn2025Section, CryptoCostBasisHubSectionViewState missingDetailsSection, CryptoCostBasisHubSectionViewState confirmedSection) {
        Intrinsics.checkNotNullParameter(soldIn2025Section, "soldIn2025Section");
        Intrinsics.checkNotNullParameter(missingDetailsSection, "missingDetailsSection");
        Intrinsics.checkNotNullParameter(confirmedSection, "confirmedSection");
        return new CryptoCostBasisHubViewState(soldIn2025Section, missingDetailsSection, confirmedSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisHubViewState)) {
            return false;
        }
        CryptoCostBasisHubViewState cryptoCostBasisHubViewState = (CryptoCostBasisHubViewState) other;
        return Intrinsics.areEqual(this.soldIn2025Section, cryptoCostBasisHubViewState.soldIn2025Section) && Intrinsics.areEqual(this.missingDetailsSection, cryptoCostBasisHubViewState.missingDetailsSection) && Intrinsics.areEqual(this.confirmedSection, cryptoCostBasisHubViewState.confirmedSection);
    }

    public int hashCode() {
        return (((this.soldIn2025Section.hashCode() * 31) + this.missingDetailsSection.hashCode()) * 31) + this.confirmedSection.hashCode();
    }

    public String toString() {
        return "CryptoCostBasisHubViewState(soldIn2025Section=" + this.soldIn2025Section + ", missingDetailsSection=" + this.missingDetailsSection + ", confirmedSection=" + this.confirmedSection + ")";
    }

    public CryptoCostBasisHubViewState(CryptoCostBasisHubSectionViewState soldIn2025Section, CryptoCostBasisHubSectionViewState missingDetailsSection, CryptoCostBasisHubSectionViewState confirmedSection) {
        Intrinsics.checkNotNullParameter(soldIn2025Section, "soldIn2025Section");
        Intrinsics.checkNotNullParameter(missingDetailsSection, "missingDetailsSection");
        Intrinsics.checkNotNullParameter(confirmedSection, "confirmedSection");
        this.soldIn2025Section = soldIn2025Section;
        this.missingDetailsSection = missingDetailsSection;
        this.confirmedSection = confirmedSection;
    }

    public final CryptoCostBasisHubSectionViewState getSoldIn2025Section() {
        return this.soldIn2025Section;
    }

    public final CryptoCostBasisHubSectionViewState getMissingDetailsSection() {
        return this.missingDetailsSection;
    }

    public final CryptoCostBasisHubSectionViewState getConfirmedSection() {
        return this.confirmedSection;
    }
}
