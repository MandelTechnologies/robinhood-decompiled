package com.robinhood.shared.phone;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectCountryCodeBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState;", "", "Loading", "Loaded", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState$Loaded;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState$Loading;", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface SelectCountryCodeBottomSheetViewState {

    /* compiled from: SelectCountryCodeBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState$Loading;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements SelectCountryCodeBottomSheetViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 718416889;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: SelectCountryCodeBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState$Loaded;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState;", "countryCodes", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "prohibitedCountryCodes", "showCallingCode", "", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "getCountryCodes", "()Ljava/util/List;", "getProhibitedCountryCodes", "getShowCallingCode", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements SelectCountryCodeBottomSheetViewState {
        public static final int $stable = 8;
        private final List<CountryCode> countryCodes;
        private final List<CountryCode> prohibitedCountryCodes;
        private final boolean showCallingCode;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, List list2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.countryCodes;
            }
            if ((i & 2) != 0) {
                list2 = loaded.prohibitedCountryCodes;
            }
            if ((i & 4) != 0) {
                z = loaded.showCallingCode;
            }
            return loaded.copy(list, list2, z);
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

        public final Loaded copy(List<? extends CountryCode> countryCodes, List<? extends CountryCode> prohibitedCountryCodes, boolean showCallingCode) {
            Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
            Intrinsics.checkNotNullParameter(prohibitedCountryCodes, "prohibitedCountryCodes");
            return new Loaded(countryCodes, prohibitedCountryCodes, showCallingCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.countryCodes, loaded.countryCodes) && Intrinsics.areEqual(this.prohibitedCountryCodes, loaded.prohibitedCountryCodes) && this.showCallingCode == loaded.showCallingCode;
        }

        public int hashCode() {
            return (((this.countryCodes.hashCode() * 31) + this.prohibitedCountryCodes.hashCode()) * 31) + Boolean.hashCode(this.showCallingCode);
        }

        public String toString() {
            return "Loaded(countryCodes=" + this.countryCodes + ", prohibitedCountryCodes=" + this.prohibitedCountryCodes + ", showCallingCode=" + this.showCallingCode + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(List<? extends CountryCode> countryCodes, List<? extends CountryCode> prohibitedCountryCodes, boolean z) {
            Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
            Intrinsics.checkNotNullParameter(prohibitedCountryCodes, "prohibitedCountryCodes");
            this.countryCodes = countryCodes;
            this.prohibitedCountryCodes = prohibitedCountryCodes;
            this.showCallingCode = z;
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
    }
}
