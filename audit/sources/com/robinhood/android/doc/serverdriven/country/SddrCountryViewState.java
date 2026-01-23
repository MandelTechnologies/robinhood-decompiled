package com.robinhood.android.doc.serverdriven.country;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrCountryViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;", "", "Loading", "OldPicker", "NewPicker", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState$Loading;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState$NewPicker;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState$OldPicker;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrCountryViewState {

    /* compiled from: SddrCountryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState$Loading;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements SddrCountryViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1892083784;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: SddrCountryViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState$OldPicker;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;", "title", "", "description", "options", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OldPicker implements SddrCountryViewState {
        public static final int $stable = 8;
        private final String description;
        private final List<CountryCode> options;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OldPicker copy$default(OldPicker oldPicker, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oldPicker.title;
            }
            if ((i & 2) != 0) {
                str2 = oldPicker.description;
            }
            if ((i & 4) != 0) {
                list = oldPicker.options;
            }
            return oldPicker.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<CountryCode> component3() {
            return this.options;
        }

        public final OldPicker copy(String title, String description, List<? extends CountryCode> options) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(options, "options");
            return new OldPicker(title, description, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OldPicker)) {
                return false;
            }
            OldPicker oldPicker = (OldPicker) other;
            return Intrinsics.areEqual(this.title, oldPicker.title) && Intrinsics.areEqual(this.description, oldPicker.description) && Intrinsics.areEqual(this.options, oldPicker.options);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.options.hashCode();
        }

        public String toString() {
            return "OldPicker(title=" + this.title + ", description=" + this.description + ", options=" + this.options + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OldPicker(String title, String description, List<? extends CountryCode> options) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(options, "options");
            this.title = title;
            this.description = description;
            this.options = options;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<CountryCode> getOptions() {
            return this.options;
        }
    }

    /* compiled from: SddrCountryViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState$NewPicker;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;", "title", "", "description", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "options", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getSelected", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NewPicker implements SddrCountryViewState {
        public static final int $stable = 8;
        private final String description;
        private final List<CountryCode> options;
        private final CountryCode selected;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewPicker copy$default(NewPicker newPicker, String str, String str2, CountryCode countryCode, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newPicker.title;
            }
            if ((i & 2) != 0) {
                str2 = newPicker.description;
            }
            if ((i & 4) != 0) {
                countryCode = newPicker.selected;
            }
            if ((i & 8) != 0) {
                list = newPicker.options;
            }
            return newPicker.copy(str, str2, countryCode, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final CountryCode getSelected() {
            return this.selected;
        }

        public final List<CountryCode> component4() {
            return this.options;
        }

        public final NewPicker copy(String title, String description, CountryCode selected, List<? extends CountryCode> options) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(options, "options");
            return new NewPicker(title, description, selected, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewPicker)) {
                return false;
            }
            NewPicker newPicker = (NewPicker) other;
            return Intrinsics.areEqual(this.title, newPicker.title) && Intrinsics.areEqual(this.description, newPicker.description) && Intrinsics.areEqual(this.selected, newPicker.selected) && Intrinsics.areEqual(this.options, newPicker.options);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
            CountryCode countryCode = this.selected;
            return ((iHashCode + (countryCode == null ? 0 : countryCode.hashCode())) * 31) + this.options.hashCode();
        }

        public String toString() {
            return "NewPicker(title=" + this.title + ", description=" + this.description + ", selected=" + this.selected + ", options=" + this.options + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewPicker(String title, String description, CountryCode countryCode, List<? extends CountryCode> options) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(options, "options");
            this.title = title;
            this.description = description;
            this.selected = countryCode;
            this.options = options;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final CountryCode getSelected() {
            return this.selected;
        }

        public final List<CountryCode> getOptions() {
            return this.options;
        }
    }
}
