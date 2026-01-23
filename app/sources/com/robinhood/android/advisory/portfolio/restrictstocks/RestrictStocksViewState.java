package com.robinhood.android.advisory.portfolio.restrictstocks;

import com.robinhood.android.advisory.portfolio.restrictstocks.RestrictStocksViewState3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState$Loaded;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState$Loading;", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RestrictStocksViewState {

    /* compiled from: RestrictStocksViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState$Loading;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RestrictStocksViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1127517203;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RestrictStocksViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003Ja\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010+\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState$Loaded;", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksViewState;", "restrictedAssetsRows", "", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$RestrictedStockRowData;", "managedPortfolioRows", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$ManagedPortfolioRowData;", "searchResultRows", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksRowData$SearchResultRowData;", "restrictStocksDisclosure", "Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDisclosure;", "maxRestrictedAssetsAllowed", "", "canRestrictMoreAssets", "", "searchQuery", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDisclosure;IZLjava/lang/String;)V", "getRestrictedAssetsRows", "()Ljava/util/List;", "getManagedPortfolioRows", "getSearchResultRows", "getRestrictStocksDisclosure", "()Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDisclosure;", "getMaxRestrictedAssetsAllowed", "()I", "getCanRestrictMoreAssets", "()Z", "getSearchQuery", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RestrictStocksViewState {
        public static final int $stable = 8;
        private final boolean canRestrictMoreAssets;
        private final List<RestrictStocksViewState3.ManagedPortfolioRowData> managedPortfolioRows;
        private final int maxRestrictedAssetsAllowed;
        private final RestrictStocksDisclosure restrictStocksDisclosure;
        private final List<RestrictStocksViewState3.RestrictedStockRowData> restrictedAssetsRows;
        private final String searchQuery;
        private final List<RestrictStocksViewState3.SearchResultRowData> searchResultRows;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, List list2, List list3, RestrictStocksDisclosure restrictStocksDisclosure, int i, boolean z, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = loaded.restrictedAssetsRows;
            }
            if ((i2 & 2) != 0) {
                list2 = loaded.managedPortfolioRows;
            }
            if ((i2 & 4) != 0) {
                list3 = loaded.searchResultRows;
            }
            if ((i2 & 8) != 0) {
                restrictStocksDisclosure = loaded.restrictStocksDisclosure;
            }
            if ((i2 & 16) != 0) {
                i = loaded.maxRestrictedAssetsAllowed;
            }
            if ((i2 & 32) != 0) {
                z = loaded.canRestrictMoreAssets;
            }
            if ((i2 & 64) != 0) {
                str = loaded.searchQuery;
            }
            boolean z2 = z;
            String str2 = str;
            int i3 = i;
            List list4 = list3;
            return loaded.copy(list, list2, list4, restrictStocksDisclosure, i3, z2, str2);
        }

        public final List<RestrictStocksViewState3.RestrictedStockRowData> component1() {
            return this.restrictedAssetsRows;
        }

        public final List<RestrictStocksViewState3.ManagedPortfolioRowData> component2() {
            return this.managedPortfolioRows;
        }

        public final List<RestrictStocksViewState3.SearchResultRowData> component3() {
            return this.searchResultRows;
        }

        /* renamed from: component4, reason: from getter */
        public final RestrictStocksDisclosure getRestrictStocksDisclosure() {
            return this.restrictStocksDisclosure;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxRestrictedAssetsAllowed() {
            return this.maxRestrictedAssetsAllowed;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCanRestrictMoreAssets() {
            return this.canRestrictMoreAssets;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public final Loaded copy(List<RestrictStocksViewState3.RestrictedStockRowData> restrictedAssetsRows, List<RestrictStocksViewState3.ManagedPortfolioRowData> managedPortfolioRows, List<RestrictStocksViewState3.SearchResultRowData> searchResultRows, RestrictStocksDisclosure restrictStocksDisclosure, int maxRestrictedAssetsAllowed, boolean canRestrictMoreAssets, String searchQuery) {
            Intrinsics.checkNotNullParameter(restrictedAssetsRows, "restrictedAssetsRows");
            Intrinsics.checkNotNullParameter(managedPortfolioRows, "managedPortfolioRows");
            Intrinsics.checkNotNullParameter(searchResultRows, "searchResultRows");
            Intrinsics.checkNotNullParameter(restrictStocksDisclosure, "restrictStocksDisclosure");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            return new Loaded(restrictedAssetsRows, managedPortfolioRows, searchResultRows, restrictStocksDisclosure, maxRestrictedAssetsAllowed, canRestrictMoreAssets, searchQuery);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.restrictedAssetsRows, loaded.restrictedAssetsRows) && Intrinsics.areEqual(this.managedPortfolioRows, loaded.managedPortfolioRows) && Intrinsics.areEqual(this.searchResultRows, loaded.searchResultRows) && Intrinsics.areEqual(this.restrictStocksDisclosure, loaded.restrictStocksDisclosure) && this.maxRestrictedAssetsAllowed == loaded.maxRestrictedAssetsAllowed && this.canRestrictMoreAssets == loaded.canRestrictMoreAssets && Intrinsics.areEqual(this.searchQuery, loaded.searchQuery);
        }

        public int hashCode() {
            return (((((((((((this.restrictedAssetsRows.hashCode() * 31) + this.managedPortfolioRows.hashCode()) * 31) + this.searchResultRows.hashCode()) * 31) + this.restrictStocksDisclosure.hashCode()) * 31) + Integer.hashCode(this.maxRestrictedAssetsAllowed)) * 31) + Boolean.hashCode(this.canRestrictMoreAssets)) * 31) + this.searchQuery.hashCode();
        }

        public String toString() {
            return "Loaded(restrictedAssetsRows=" + this.restrictedAssetsRows + ", managedPortfolioRows=" + this.managedPortfolioRows + ", searchResultRows=" + this.searchResultRows + ", restrictStocksDisclosure=" + this.restrictStocksDisclosure + ", maxRestrictedAssetsAllowed=" + this.maxRestrictedAssetsAllowed + ", canRestrictMoreAssets=" + this.canRestrictMoreAssets + ", searchQuery=" + this.searchQuery + ")";
        }

        public Loaded(List<RestrictStocksViewState3.RestrictedStockRowData> restrictedAssetsRows, List<RestrictStocksViewState3.ManagedPortfolioRowData> managedPortfolioRows, List<RestrictStocksViewState3.SearchResultRowData> searchResultRows, RestrictStocksDisclosure restrictStocksDisclosure, int i, boolean z, String searchQuery) {
            Intrinsics.checkNotNullParameter(restrictedAssetsRows, "restrictedAssetsRows");
            Intrinsics.checkNotNullParameter(managedPortfolioRows, "managedPortfolioRows");
            Intrinsics.checkNotNullParameter(searchResultRows, "searchResultRows");
            Intrinsics.checkNotNullParameter(restrictStocksDisclosure, "restrictStocksDisclosure");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.restrictedAssetsRows = restrictedAssetsRows;
            this.managedPortfolioRows = managedPortfolioRows;
            this.searchResultRows = searchResultRows;
            this.restrictStocksDisclosure = restrictStocksDisclosure;
            this.maxRestrictedAssetsAllowed = i;
            this.canRestrictMoreAssets = z;
            this.searchQuery = searchQuery;
        }

        public final List<RestrictStocksViewState3.RestrictedStockRowData> getRestrictedAssetsRows() {
            return this.restrictedAssetsRows;
        }

        public final List<RestrictStocksViewState3.ManagedPortfolioRowData> getManagedPortfolioRows() {
            return this.managedPortfolioRows;
        }

        public final List<RestrictStocksViewState3.SearchResultRowData> getSearchResultRows() {
            return this.searchResultRows;
        }

        public final RestrictStocksDisclosure getRestrictStocksDisclosure() {
            return this.restrictStocksDisclosure;
        }

        public final int getMaxRestrictedAssetsAllowed() {
            return this.maxRestrictedAssetsAllowed;
        }

        public final boolean getCanRestrictMoreAssets() {
            return this.canRestrictMoreAssets;
        }

        public final String getSearchQuery() {
            return this.searchQuery;
        }
    }
}
