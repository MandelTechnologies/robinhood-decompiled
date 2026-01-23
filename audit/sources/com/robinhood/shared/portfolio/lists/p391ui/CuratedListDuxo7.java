package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "ScreenerItem", "CuratedItem", "WatchlistItem", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$CuratedItem;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$ScreenerItem;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$WatchlistItem;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.UiCuratedListItem, reason: use source file name */
/* loaded from: classes6.dex */
public interface CuratedListDuxo7 {
    UUID getId();

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$ScreenerItem;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;)V", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UiCuratedListItem$ScreenerItem, reason: from toString */
    public static final /* data */ class ScreenerItem implements CuratedListDuxo7 {
        public static final int $stable = 8;
        private final Screener screener;

        public static /* synthetic */ ScreenerItem copy$default(ScreenerItem screenerItem, Screener screener, int i, Object obj) {
            if ((i & 1) != 0) {
                screener = screenerItem.screener;
            }
            return screenerItem.copy(screener);
        }

        /* renamed from: component1, reason: from getter */
        public final Screener getScreener() {
            return this.screener;
        }

        public final ScreenerItem copy(Screener screener) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            return new ScreenerItem(screener);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScreenerItem) && Intrinsics.areEqual(this.screener, ((ScreenerItem) other).screener);
        }

        public int hashCode() {
            return this.screener.hashCode();
        }

        public String toString() {
            return "ScreenerItem(screener=" + this.screener + ")";
        }

        public ScreenerItem(Screener screener) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            this.screener = screener;
        }

        public final Screener getScreener() {
            return this.screener;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7
        public UUID getId() {
            return StringsKt.toUuid(this.screener.getId());
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$CuratedItem;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "<init>", "(Lcom/robinhood/models/db/CuratedList;)V", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UiCuratedListItem$CuratedItem, reason: from toString */
    public static final /* data */ class CuratedItem implements CuratedListDuxo7 {
        public static final int $stable = 8;
        private final CuratedList curatedList;

        public static /* synthetic */ CuratedItem copy$default(CuratedItem curatedItem, CuratedList curatedList, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedList = curatedItem.curatedList;
            }
            return curatedItem.copy(curatedList);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedList getCuratedList() {
            return this.curatedList;
        }

        public final CuratedItem copy(CuratedList curatedList) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            return new CuratedItem(curatedList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CuratedItem) && Intrinsics.areEqual(this.curatedList, ((CuratedItem) other).curatedList);
        }

        public int hashCode() {
            return this.curatedList.hashCode();
        }

        public String toString() {
            return "CuratedItem(curatedList=" + this.curatedList + ")";
        }

        public CuratedItem(CuratedList curatedList) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            this.curatedList = curatedList;
        }

        public final CuratedList getCuratedList() {
            return this.curatedList;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7
        public UUID getId() {
            return this.curatedList.getId();
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$WatchlistItem;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/models/db/CuratedList;", "expanded", "", "watchlistItems", "", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "shouldShowListRows", "<init>", "(Lcom/robinhood/models/db/CuratedList;ZLjava/util/List;Z)V", "getWatchlist", "()Lcom/robinhood/models/db/CuratedList;", "getExpanded", "()Z", "getWatchlistItems", "()Ljava/util/List;", "getShouldShowListRows", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UiCuratedListItem$WatchlistItem, reason: from toString */
    public static final /* data */ class WatchlistItem implements CuratedListDuxo7 {
        public static final int $stable = 8;
        private final boolean expanded;
        private final boolean shouldShowListRows;
        private final CuratedList watchlist;
        private final List<WatchlistItemRow> watchlistItems;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WatchlistItem copy$default(WatchlistItem watchlistItem, CuratedList curatedList, boolean z, List list, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedList = watchlistItem.watchlist;
            }
            if ((i & 2) != 0) {
                z = watchlistItem.expanded;
            }
            if ((i & 4) != 0) {
                list = watchlistItem.watchlistItems;
            }
            if ((i & 8) != 0) {
                z2 = watchlistItem.shouldShowListRows;
            }
            return watchlistItem.copy(curatedList, z, list, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedList getWatchlist() {
            return this.watchlist;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getExpanded() {
            return this.expanded;
        }

        public final List<WatchlistItemRow> component3() {
            return this.watchlistItems;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldShowListRows() {
            return this.shouldShowListRows;
        }

        public final WatchlistItem copy(CuratedList watchlist, boolean expanded, List<? extends WatchlistItemRow> watchlistItems, boolean shouldShowListRows) {
            Intrinsics.checkNotNullParameter(watchlist, "watchlist");
            Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
            return new WatchlistItem(watchlist, expanded, watchlistItems, shouldShowListRows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WatchlistItem)) {
                return false;
            }
            WatchlistItem watchlistItem = (WatchlistItem) other;
            return Intrinsics.areEqual(this.watchlist, watchlistItem.watchlist) && this.expanded == watchlistItem.expanded && Intrinsics.areEqual(this.watchlistItems, watchlistItem.watchlistItems) && this.shouldShowListRows == watchlistItem.shouldShowListRows;
        }

        public int hashCode() {
            return (((((this.watchlist.hashCode() * 31) + Boolean.hashCode(this.expanded)) * 31) + this.watchlistItems.hashCode()) * 31) + Boolean.hashCode(this.shouldShowListRows);
        }

        public String toString() {
            return "WatchlistItem(watchlist=" + this.watchlist + ", expanded=" + this.expanded + ", watchlistItems=" + this.watchlistItems + ", shouldShowListRows=" + this.shouldShowListRows + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WatchlistItem(CuratedList watchlist, boolean z, List<? extends WatchlistItemRow> watchlistItems, boolean z2) {
            Intrinsics.checkNotNullParameter(watchlist, "watchlist");
            Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
            this.watchlist = watchlist;
            this.expanded = z;
            this.watchlistItems = watchlistItems;
            this.shouldShowListRows = z2;
        }

        public /* synthetic */ WatchlistItem(CuratedList curatedList, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(curatedList, z, list, (i & 8) != 0 ? true : z2);
        }

        public final CuratedList getWatchlist() {
            return this.watchlist;
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final List<WatchlistItemRow> getWatchlistItems() {
            return this.watchlistItems;
        }

        public final boolean getShouldShowListRows() {
            return this.shouldShowListRows;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7
        public UUID getId() {
            return this.watchlist.getId();
        }
    }
}
