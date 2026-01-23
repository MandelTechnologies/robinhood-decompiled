package com.robinhood.shared.phone;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectCountryCodeBottomSheetDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÂ\u0003J?\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDataState;", "", "countryCodes", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "prohibitedCountryCodes", "showCallingCode", "", "isRhcApp", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "getCountryCodes", "()Ljava/util/List;", "getProhibitedCountryCodes", "getShowCallingCode", "()Z", "isLoading", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SelectCountryCodeBottomSheetDataState {
    public static final int $stable = 8;
    private final List<CountryCode> countryCodes;
    private final boolean isRhcApp;
    private final List<CountryCode> prohibitedCountryCodes;
    private final boolean showCallingCode;

    /* renamed from: component4, reason: from getter */
    private final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectCountryCodeBottomSheetDataState copy$default(SelectCountryCodeBottomSheetDataState selectCountryCodeBottomSheetDataState, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectCountryCodeBottomSheetDataState.countryCodes;
        }
        if ((i & 2) != 0) {
            list2 = selectCountryCodeBottomSheetDataState.prohibitedCountryCodes;
        }
        if ((i & 4) != 0) {
            z = selectCountryCodeBottomSheetDataState.showCallingCode;
        }
        if ((i & 8) != 0) {
            z2 = selectCountryCodeBottomSheetDataState.isRhcApp;
        }
        return selectCountryCodeBottomSheetDataState.copy(list, list2, z, z2);
    }

    public final List<CountryCode> component1() {
        return this.countryCodes;
    }

    public final List<CountryCode> component2() {
        return this.prohibitedCountryCodes;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowCallingCode() {
        return this.showCallingCode;
    }

    public final SelectCountryCodeBottomSheetDataState copy(List<? extends CountryCode> countryCodes, List<? extends CountryCode> prohibitedCountryCodes, boolean showCallingCode, boolean isRhcApp) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        return new SelectCountryCodeBottomSheetDataState(countryCodes, prohibitedCountryCodes, showCallingCode, isRhcApp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectCountryCodeBottomSheetDataState)) {
            return false;
        }
        SelectCountryCodeBottomSheetDataState selectCountryCodeBottomSheetDataState = (SelectCountryCodeBottomSheetDataState) other;
        return Intrinsics.areEqual(this.countryCodes, selectCountryCodeBottomSheetDataState.countryCodes) && Intrinsics.areEqual(this.prohibitedCountryCodes, selectCountryCodeBottomSheetDataState.prohibitedCountryCodes) && this.showCallingCode == selectCountryCodeBottomSheetDataState.showCallingCode && this.isRhcApp == selectCountryCodeBottomSheetDataState.isRhcApp;
    }

    public int hashCode() {
        int iHashCode = this.countryCodes.hashCode() * 31;
        List<CountryCode> list = this.prohibitedCountryCodes;
        return ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.showCallingCode)) * 31) + Boolean.hashCode(this.isRhcApp);
    }

    public String toString() {
        return "SelectCountryCodeBottomSheetDataState(countryCodes=" + this.countryCodes + ", prohibitedCountryCodes=" + this.prohibitedCountryCodes + ", showCallingCode=" + this.showCallingCode + ", isRhcApp=" + this.isRhcApp + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectCountryCodeBottomSheetDataState(List<? extends CountryCode> countryCodes, List<? extends CountryCode> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        this.countryCodes = countryCodes;
        this.prohibitedCountryCodes = list;
        this.showCallingCode = z;
        this.isRhcApp = z2;
    }

    public /* synthetic */ SelectCountryCodeBottomSheetDataState(List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2, z, z2);
    }

    public final List<CountryCode> getCountryCodes() {
        return this.countryCodes;
    }

    public final List<CountryCode> getProhibitedCountryCodes() {
        return this.prohibitedCountryCodes;
    }

    public final boolean getShowCallingCode() {
        return this.showCallingCode;
    }

    public final boolean isLoading() {
        return this.isRhcApp && this.prohibitedCountryCodes == null;
    }
}
