package com.robinhood.android.investmentstracker.viewmodels;

import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerSwitcherViewModel.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u0000H\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JI\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "performanceData", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherPerformanceData;", "allocationsData", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherAllocationsData;", "canShowToggle", "", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "id", "", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherPerformanceData;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherAllocationsData;ZLcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Ljava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getPerformanceData", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherPerformanceData;", "getAllocationsData", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherAllocationsData;", "getCanShowToggle", "()Z", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getId", "()Ljava/lang/String;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerSwitcherViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final InvestmentsTrackerSwitcherAllocationsData allocationsData;
    private final boolean canShowToggle;
    private final String id;
    private final InvestmentsTrackerSwitcherPerformanceData performanceData;
    private final SecurityFilter securityFilter;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerSwitcherViewModel copy$default(InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel, InvestmentsTrackerSwitcherPerformanceData investmentsTrackerSwitcherPerformanceData, InvestmentsTrackerSwitcherAllocationsData investmentsTrackerSwitcherAllocationsData, boolean z, InvestmentsTrackerComponentType investmentsTrackerComponentType, String str, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerSwitcherPerformanceData = investmentsTrackerSwitcherViewModel.performanceData;
        }
        if ((i & 2) != 0) {
            investmentsTrackerSwitcherAllocationsData = investmentsTrackerSwitcherViewModel.allocationsData;
        }
        if ((i & 4) != 0) {
            z = investmentsTrackerSwitcherViewModel.canShowToggle;
        }
        if ((i & 8) != 0) {
            investmentsTrackerComponentType = investmentsTrackerSwitcherViewModel.type;
        }
        if ((i & 16) != 0) {
            str = investmentsTrackerSwitcherViewModel.id;
        }
        if ((i & 32) != 0) {
            securityFilter = investmentsTrackerSwitcherViewModel.securityFilter;
        }
        String str2 = str;
        SecurityFilter securityFilter2 = securityFilter;
        return investmentsTrackerSwitcherViewModel.copy(investmentsTrackerSwitcherPerformanceData, investmentsTrackerSwitcherAllocationsData, z, investmentsTrackerComponentType, str2, securityFilter2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerSwitcherPerformanceData getPerformanceData() {
        return this.performanceData;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentsTrackerSwitcherAllocationsData getAllocationsData() {
        return this.allocationsData;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanShowToggle() {
        return this.canShowToggle;
    }

    /* renamed from: component4, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerSwitcherViewModel copy(InvestmentsTrackerSwitcherPerformanceData performanceData, InvestmentsTrackerSwitcherAllocationsData allocationsData, boolean canShowToggle, InvestmentsTrackerComponentType type2, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerSwitcherViewModel(performanceData, allocationsData, canShowToggle, type2, id, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerSwitcherViewModel)) {
            return false;
        }
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel = (InvestmentsTrackerSwitcherViewModel) other;
        return Intrinsics.areEqual(this.performanceData, investmentsTrackerSwitcherViewModel.performanceData) && Intrinsics.areEqual(this.allocationsData, investmentsTrackerSwitcherViewModel.allocationsData) && this.canShowToggle == investmentsTrackerSwitcherViewModel.canShowToggle && this.type == investmentsTrackerSwitcherViewModel.type && Intrinsics.areEqual(this.id, investmentsTrackerSwitcherViewModel.id) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerSwitcherViewModel.securityFilter);
    }

    public int hashCode() {
        InvestmentsTrackerSwitcherPerformanceData investmentsTrackerSwitcherPerformanceData = this.performanceData;
        int iHashCode = (investmentsTrackerSwitcherPerformanceData == null ? 0 : investmentsTrackerSwitcherPerformanceData.hashCode()) * 31;
        InvestmentsTrackerSwitcherAllocationsData investmentsTrackerSwitcherAllocationsData = this.allocationsData;
        return ((((((((iHashCode + (investmentsTrackerSwitcherAllocationsData != null ? investmentsTrackerSwitcherAllocationsData.hashCode() : 0)) * 31) + Boolean.hashCode(this.canShowToggle)) * 31) + this.type.hashCode()) * 31) + this.id.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerSwitcherViewModel(performanceData=" + this.performanceData + ", allocationsData=" + this.allocationsData + ", canShowToggle=" + this.canShowToggle + ", type=" + this.type + ", id=" + this.id + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerSwitcherViewModel(InvestmentsTrackerSwitcherPerformanceData investmentsTrackerSwitcherPerformanceData, InvestmentsTrackerSwitcherAllocationsData investmentsTrackerSwitcherAllocationsData, boolean z, InvestmentsTrackerComponentType type2, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.performanceData = investmentsTrackerSwitcherPerformanceData;
        this.allocationsData = investmentsTrackerSwitcherAllocationsData;
        this.canShowToggle = z;
        this.type = type2;
        this.id = id;
        this.securityFilter = securityFilter;
    }

    public final InvestmentsTrackerSwitcherPerformanceData getPerformanceData() {
        return this.performanceData;
    }

    public final InvestmentsTrackerSwitcherAllocationsData getAllocationsData() {
        return this.allocationsData;
    }

    public final boolean getCanShowToggle() {
        return this.canShowToggle;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public String getId() {
        return this.id;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerSwitcherViewModel copyForView() {
        return copy$default(this, null, null, false, null, null, null, 63, null);
    }
}
