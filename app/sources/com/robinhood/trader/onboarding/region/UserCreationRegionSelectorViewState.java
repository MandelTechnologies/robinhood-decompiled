package com.robinhood.trader.onboarding.region;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: UserCreationRegionSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/trader/onboarding/region/UserCreationRegionSelectorViewState;", "", "selectedRegion", "Lcom/robinhood/iso/countrycode/CountryCode;", "filteredRegions", "Lkotlinx/collections/immutable/PersistentList;", "suggestedRegions", "allRegions", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;)V", "getSelectedRegion", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getFilteredRegions", "()Lkotlinx/collections/immutable/PersistentList;", "getSuggestedRegions", "getAllRegions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserCreationRegionSelectorViewState {
    public static final int $stable = 8;
    private final ImmutableList3<CountryCode> allRegions;
    private final ImmutableList3<CountryCode> filteredRegions;
    private final CountryCode selectedRegion;
    private final ImmutableList3<CountryCode> suggestedRegions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserCreationRegionSelectorViewState copy$default(UserCreationRegionSelectorViewState userCreationRegionSelectorViewState, CountryCode countryCode, ImmutableList3 immutableList3, ImmutableList3 immutableList32, ImmutableList3 immutableList33, int i, Object obj) {
        if ((i & 1) != 0) {
            countryCode = userCreationRegionSelectorViewState.selectedRegion;
        }
        if ((i & 2) != 0) {
            immutableList3 = userCreationRegionSelectorViewState.filteredRegions;
        }
        if ((i & 4) != 0) {
            immutableList32 = userCreationRegionSelectorViewState.suggestedRegions;
        }
        if ((i & 8) != 0) {
            immutableList33 = userCreationRegionSelectorViewState.allRegions;
        }
        return userCreationRegionSelectorViewState.copy(countryCode, immutableList3, immutableList32, immutableList33);
    }

    /* renamed from: component1, reason: from getter */
    public final CountryCode getSelectedRegion() {
        return this.selectedRegion;
    }

    public final ImmutableList3<CountryCode> component2() {
        return this.filteredRegions;
    }

    public final ImmutableList3<CountryCode> component3() {
        return this.suggestedRegions;
    }

    public final ImmutableList3<CountryCode> component4() {
        return this.allRegions;
    }

    public final UserCreationRegionSelectorViewState copy(CountryCode selectedRegion, ImmutableList3<? extends CountryCode> filteredRegions, ImmutableList3<? extends CountryCode> suggestedRegions, ImmutableList3<? extends CountryCode> allRegions) {
        Intrinsics.checkNotNullParameter(filteredRegions, "filteredRegions");
        Intrinsics.checkNotNullParameter(suggestedRegions, "suggestedRegions");
        Intrinsics.checkNotNullParameter(allRegions, "allRegions");
        return new UserCreationRegionSelectorViewState(selectedRegion, filteredRegions, suggestedRegions, allRegions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCreationRegionSelectorViewState)) {
            return false;
        }
        UserCreationRegionSelectorViewState userCreationRegionSelectorViewState = (UserCreationRegionSelectorViewState) other;
        return Intrinsics.areEqual(this.selectedRegion, userCreationRegionSelectorViewState.selectedRegion) && Intrinsics.areEqual(this.filteredRegions, userCreationRegionSelectorViewState.filteredRegions) && Intrinsics.areEqual(this.suggestedRegions, userCreationRegionSelectorViewState.suggestedRegions) && Intrinsics.areEqual(this.allRegions, userCreationRegionSelectorViewState.allRegions);
    }

    public int hashCode() {
        CountryCode countryCode = this.selectedRegion;
        return ((((((countryCode == null ? 0 : countryCode.hashCode()) * 31) + this.filteredRegions.hashCode()) * 31) + this.suggestedRegions.hashCode()) * 31) + this.allRegions.hashCode();
    }

    public String toString() {
        return "UserCreationRegionSelectorViewState(selectedRegion=" + this.selectedRegion + ", filteredRegions=" + this.filteredRegions + ", suggestedRegions=" + this.suggestedRegions + ", allRegions=" + this.allRegions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserCreationRegionSelectorViewState(CountryCode countryCode, ImmutableList3<? extends CountryCode> filteredRegions, ImmutableList3<? extends CountryCode> suggestedRegions, ImmutableList3<? extends CountryCode> allRegions) {
        Intrinsics.checkNotNullParameter(filteredRegions, "filteredRegions");
        Intrinsics.checkNotNullParameter(suggestedRegions, "suggestedRegions");
        Intrinsics.checkNotNullParameter(allRegions, "allRegions");
        this.selectedRegion = countryCode;
        this.filteredRegions = filteredRegions;
        this.suggestedRegions = suggestedRegions;
        this.allRegions = allRegions;
    }

    public final CountryCode getSelectedRegion() {
        return this.selectedRegion;
    }

    public final ImmutableList3<CountryCode> getFilteredRegions() {
        return this.filteredRegions;
    }

    public final ImmutableList3<CountryCode> getSuggestedRegions() {
        return this.suggestedRegions;
    }

    public final ImmutableList3<CountryCode> getAllRegions() {
        return this.allRegions;
    }
}
