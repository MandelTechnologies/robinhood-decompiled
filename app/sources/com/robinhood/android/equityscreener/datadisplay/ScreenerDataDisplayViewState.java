package com.robinhood.android.equityscreener.datadisplay;

import com.robinhood.equityscreener.models.api.ColumnInformation;
import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerDataDisplayViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState;", "", "Finished", "Loading", "Loaded", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Finished;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Loaded;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Loading;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ScreenerDataDisplayViewState {

    /* compiled from: ScreenerDataDisplayViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Finished;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Finished implements ScreenerDataDisplayViewState {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();

        private Finished() {
        }
    }

    /* compiled from: ScreenerDataDisplayViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Loading;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements ScreenerDataDisplayViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: ScreenerDataDisplayViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState$Loaded;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayViewState;", "localScreener", "Lcom/robinhood/equityscreener/models/db/Screener;", "visibleIndicators", "", "Lcom/robinhood/equityscreener/models/api/ColumnInformation;", "unselectedIndicators", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;Ljava/util/List;Ljava/util/List;)V", "getLocalScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getVisibleIndicators", "()Ljava/util/List;", "getUnselectedIndicators", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ScreenerDataDisplayViewState {
        public static final int $stable = 8;
        private final Screener localScreener;
        private final List<ColumnInformation> unselectedIndicators;
        private final List<ColumnInformation> visibleIndicators;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, Screener screener, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                screener = loaded.localScreener;
            }
            if ((i & 2) != 0) {
                list = loaded.visibleIndicators;
            }
            if ((i & 4) != 0) {
                list2 = loaded.unselectedIndicators;
            }
            return loaded.copy(screener, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final Screener getLocalScreener() {
            return this.localScreener;
        }

        public final List<ColumnInformation> component2() {
            return this.visibleIndicators;
        }

        public final List<ColumnInformation> component3() {
            return this.unselectedIndicators;
        }

        public final Loaded copy(Screener localScreener, List<ColumnInformation> visibleIndicators, List<ColumnInformation> unselectedIndicators) {
            Intrinsics.checkNotNullParameter(visibleIndicators, "visibleIndicators");
            Intrinsics.checkNotNullParameter(unselectedIndicators, "unselectedIndicators");
            return new Loaded(localScreener, visibleIndicators, unselectedIndicators);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.localScreener, loaded.localScreener) && Intrinsics.areEqual(this.visibleIndicators, loaded.visibleIndicators) && Intrinsics.areEqual(this.unselectedIndicators, loaded.unselectedIndicators);
        }

        public int hashCode() {
            Screener screener = this.localScreener;
            return ((((screener == null ? 0 : screener.hashCode()) * 31) + this.visibleIndicators.hashCode()) * 31) + this.unselectedIndicators.hashCode();
        }

        public String toString() {
            return "Loaded(localScreener=" + this.localScreener + ", visibleIndicators=" + this.visibleIndicators + ", unselectedIndicators=" + this.unselectedIndicators + ")";
        }

        public Loaded(Screener screener, List<ColumnInformation> visibleIndicators, List<ColumnInformation> unselectedIndicators) {
            Intrinsics.checkNotNullParameter(visibleIndicators, "visibleIndicators");
            Intrinsics.checkNotNullParameter(unselectedIndicators, "unselectedIndicators");
            this.localScreener = screener;
            this.visibleIndicators = visibleIndicators;
            this.unselectedIndicators = unselectedIndicators;
        }

        public final Screener getLocalScreener() {
            return this.localScreener;
        }

        public final List<ColumnInformation> getVisibleIndicators() {
            return this.visibleIndicators;
        }

        public final List<ColumnInformation> getUnselectedIndicators() {
            return this.unselectedIndicators;
        }
    }
}
