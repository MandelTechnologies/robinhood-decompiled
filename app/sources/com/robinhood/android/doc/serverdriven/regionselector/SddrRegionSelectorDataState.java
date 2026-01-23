package com.robinhood.android.doc.serverdriven.regionselector;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrRegionSelectorDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorDataState;", "", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "options", "", "searchQuery", "", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;Ljava/util/List;Ljava/lang/String;)V", "getSelected", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getOptions", "()Ljava/util/List;", "getSearchQuery", "()Ljava/lang/String;", "isLoading", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SddrRegionSelectorDataState {
    public static final int $stable = 8;
    private final List<CountryCode> options;
    private final String searchQuery;
    private final CountryCode selected;

    public SddrRegionSelectorDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SddrRegionSelectorDataState copy$default(SddrRegionSelectorDataState sddrRegionSelectorDataState, CountryCode countryCode, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            countryCode = sddrRegionSelectorDataState.selected;
        }
        if ((i & 2) != 0) {
            list = sddrRegionSelectorDataState.options;
        }
        if ((i & 4) != 0) {
            str = sddrRegionSelectorDataState.searchQuery;
        }
        return sddrRegionSelectorDataState.copy(countryCode, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CountryCode getSelected() {
        return this.selected;
    }

    public final List<CountryCode> component2() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final SddrRegionSelectorDataState copy(CountryCode selected, List<? extends CountryCode> options, String searchQuery) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new SddrRegionSelectorDataState(selected, options, searchQuery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SddrRegionSelectorDataState)) {
            return false;
        }
        SddrRegionSelectorDataState sddrRegionSelectorDataState = (SddrRegionSelectorDataState) other;
        return Intrinsics.areEqual(this.selected, sddrRegionSelectorDataState.selected) && Intrinsics.areEqual(this.options, sddrRegionSelectorDataState.options) && Intrinsics.areEqual(this.searchQuery, sddrRegionSelectorDataState.searchQuery);
    }

    public int hashCode() {
        CountryCode countryCode = this.selected;
        return ((((countryCode == null ? 0 : countryCode.hashCode()) * 31) + this.options.hashCode()) * 31) + this.searchQuery.hashCode();
    }

    public String toString() {
        return "SddrRegionSelectorDataState(selected=" + this.selected + ", options=" + this.options + ", searchQuery=" + this.searchQuery + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SddrRegionSelectorDataState(CountryCode countryCode, List<? extends CountryCode> options, String searchQuery) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.selected = countryCode;
        this.options = options;
        this.searchQuery = searchQuery;
    }

    public final CountryCode getSelected() {
        return this.selected;
    }

    public /* synthetic */ SddrRegionSelectorDataState(CountryCode countryCode, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : countryCode, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str);
    }

    public final List<CountryCode> getOptions() {
        return this.options;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final boolean isLoading() {
        return this.options.isEmpty();
    }
}
