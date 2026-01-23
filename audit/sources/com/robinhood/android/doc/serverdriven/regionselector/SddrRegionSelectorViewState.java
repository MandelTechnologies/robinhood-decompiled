package com.robinhood.android.doc.serverdriven.regionselector;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrRegionSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState;", "", "Loading", "Loaded", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrRegionSelectorViewState {

    /* compiled from: SddrRegionSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState$Loading;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements SddrRegionSelectorViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1454112342;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: SddrRegionSelectorViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState$Loaded;", "Lcom/robinhood/android/doc/serverdriven/regionselector/SddrRegionSelectorViewState;", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "visibleOptions", "", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;Ljava/util/List;)V", "getSelected", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getVisibleOptions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements SddrRegionSelectorViewState {
        public static final int $stable = 8;
        private final CountryCode selected;
        private final List<CountryCode> visibleOptions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, CountryCode countryCode, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = loaded.selected;
            }
            if ((i & 2) != 0) {
                list = loaded.visibleOptions;
            }
            return loaded.copy(countryCode, list);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode getSelected() {
            return this.selected;
        }

        public final List<CountryCode> component2() {
            return this.visibleOptions;
        }

        public final Loaded copy(CountryCode selected, List<? extends CountryCode> visibleOptions) {
            Intrinsics.checkNotNullParameter(visibleOptions, "visibleOptions");
            return new Loaded(selected, visibleOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.selected, loaded.selected) && Intrinsics.areEqual(this.visibleOptions, loaded.visibleOptions);
        }

        public int hashCode() {
            CountryCode countryCode = this.selected;
            return ((countryCode == null ? 0 : countryCode.hashCode()) * 31) + this.visibleOptions.hashCode();
        }

        public String toString() {
            return "Loaded(selected=" + this.selected + ", visibleOptions=" + this.visibleOptions + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(CountryCode countryCode, List<? extends CountryCode> visibleOptions) {
            Intrinsics.checkNotNullParameter(visibleOptions, "visibleOptions");
            this.selected = countryCode;
            this.visibleOptions = visibleOptions;
        }

        public final CountryCode getSelected() {
            return this.selected;
        }

        public final List<CountryCode> getVisibleOptions() {
            return this.visibleOptions;
        }
    }
}
