package com.robinhood.android.rothconversion;

import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RothConversionInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "", "Loaded", "Loading", "Error", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Error;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Loaded;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Loading;", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RothConversionInfoViewState {

    /* compiled from: RothConversionInfoViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Loaded;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "pages", "", "Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel$Page;", "navigationEvent", "Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;)V", "getPages", "()Ljava/util/List;", "getNavigationEvent", "()Lcom/robinhood/android/rothconversion/RothConversionInfoEvent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RothConversionInfoViewState {
        public static final int $stable = 8;
        private final RothConversionInfoEvent navigationEvent;
        private final List<RothConversionInfoViewModel.Page> pages;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, RothConversionInfoEvent rothConversionInfoEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.pages;
            }
            if ((i & 2) != 0) {
                rothConversionInfoEvent = loaded.navigationEvent;
            }
            return loaded.copy(list, rothConversionInfoEvent);
        }

        public final List<RothConversionInfoViewModel.Page> component1() {
            return this.pages;
        }

        /* renamed from: component2, reason: from getter */
        public final RothConversionInfoEvent getNavigationEvent() {
            return this.navigationEvent;
        }

        public final Loaded copy(List<RothConversionInfoViewModel.Page> pages, RothConversionInfoEvent navigationEvent) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
            return new Loaded(pages, navigationEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.pages, loaded.pages) && Intrinsics.areEqual(this.navigationEvent, loaded.navigationEvent);
        }

        public int hashCode() {
            return (this.pages.hashCode() * 31) + this.navigationEvent.hashCode();
        }

        public String toString() {
            return "Loaded(pages=" + this.pages + ", navigationEvent=" + this.navigationEvent + ")";
        }

        public Loaded(List<RothConversionInfoViewModel.Page> pages, RothConversionInfoEvent navigationEvent) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
            this.pages = pages;
            this.navigationEvent = navigationEvent;
        }

        public final List<RothConversionInfoViewModel.Page> getPages() {
            return this.pages;
        }

        public final RothConversionInfoEvent getNavigationEvent() {
            return this.navigationEvent;
        }
    }

    /* compiled from: RothConversionInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Loading;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "<init>", "()V", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RothConversionInfoViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RothConversionInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Error;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "<init>", "()V", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements RothConversionInfoViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }
}
