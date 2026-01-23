package com.robinhood.android.search.highlights.p249ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import search_coprocessor.p542v1.AssetDto;
import search_coprocessor.p542v1.HighlightItemDto;

/* compiled from: SearchHighlightsRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsBaseRow;", "<init>", "()V", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "SectionTitle", "MarketCards", "ChipCarousel", "QuickLinks", "EarningsRow", "EarningsShowMoreButton", "SportCarousel", "SportHeroCarousel", "MultiContractHeroCarousel", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$ChipCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$EarningsRow;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$EarningsShowMoreButton;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$MarketCards;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$MultiContractHeroCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$QuickLinks;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$SectionTitle;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$SportCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$SportHeroCarousel;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SearchHighlightsRow extends SearchHighlightsRow2 {
    public static final int $stable = 0;

    public /* synthetic */ SearchHighlightsRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract HighlightItemDto getHighlightItem();

    private SearchHighlightsRow() {
        super(null);
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$SectionTitle;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SectionTitle extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ SectionTitle copy$default(SectionTitle sectionTitle, String str, HighlightItemDto highlightItemDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionTitle.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = sectionTitle.highlightItem;
            }
            return sectionTitle.copy(str, highlightItemDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final SectionTitle copy(String id, HighlightItemDto highlightItem) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new SectionTitle(id, highlightItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionTitle)) {
                return false;
            }
            SectionTitle sectionTitle = (SectionTitle) other;
            return Intrinsics.areEqual(this.id, sectionTitle.id) && Intrinsics.areEqual(this.highlightItem, sectionTitle.highlightItem);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.highlightItem.hashCode();
        }

        public String toString() {
            return "SectionTitle(id=" + this.id + ", highlightItem=" + this.highlightItem + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionTitle(String id, HighlightItemDto highlightItem) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$MarketCards;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketCards extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ MarketCards copy$default(MarketCards marketCards, String str, HighlightItemDto highlightItemDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marketCards.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = marketCards.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = marketCards.accountNumber;
            }
            return marketCards.copy(str, highlightItemDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final MarketCards copy(String id, HighlightItemDto highlightItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new MarketCards(id, highlightItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketCards)) {
                return false;
            }
            MarketCards marketCards = (MarketCards) other;
            return Intrinsics.areEqual(this.id, marketCards.id) && Intrinsics.areEqual(this.highlightItem, marketCards.highlightItem) && Intrinsics.areEqual(this.accountNumber, marketCards.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MarketCards(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketCards(String id, HighlightItemDto highlightItem, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$ChipCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChipCarousel extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ ChipCarousel copy$default(ChipCarousel chipCarousel, String str, HighlightItemDto highlightItemDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chipCarousel.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = chipCarousel.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = chipCarousel.accountNumber;
            }
            return chipCarousel.copy(str, highlightItemDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ChipCarousel copy(String id, HighlightItemDto highlightItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new ChipCarousel(id, highlightItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChipCarousel)) {
                return false;
            }
            ChipCarousel chipCarousel = (ChipCarousel) other;
            return Intrinsics.areEqual(this.id, chipCarousel.id) && Intrinsics.areEqual(this.highlightItem, chipCarousel.highlightItem) && Intrinsics.areEqual(this.accountNumber, chipCarousel.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ChipCarousel(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChipCarousel(String id, HighlightItemDto highlightItem, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$QuickLinks;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuickLinks extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ QuickLinks copy$default(QuickLinks quickLinks, String str, HighlightItemDto highlightItemDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quickLinks.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = quickLinks.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = quickLinks.accountNumber;
            }
            return quickLinks.copy(str, highlightItemDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final QuickLinks copy(String id, HighlightItemDto highlightItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new QuickLinks(id, highlightItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickLinks)) {
                return false;
            }
            QuickLinks quickLinks = (QuickLinks) other;
            return Intrinsics.areEqual(this.id, quickLinks.id) && Intrinsics.areEqual(this.highlightItem, quickLinks.highlightItem) && Intrinsics.areEqual(this.accountNumber, quickLinks.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "QuickLinks(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickLinks(String id, HighlightItemDto highlightItem, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$EarningsRow;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "asset", "Lsearch_coprocessor/v1/AssetDto;", "sectionId", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;Lsearch_coprocessor/v1/AssetDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "getAsset", "()Lsearch_coprocessor/v1/AssetDto;", "getSectionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EarningsRow extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final AssetDto asset;
        private final HighlightItemDto highlightItem;
        private final String id;
        private final String sectionId;

        public static /* synthetic */ EarningsRow copy$default(EarningsRow earningsRow, String str, HighlightItemDto highlightItemDto, String str2, AssetDto assetDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = earningsRow.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = earningsRow.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = earningsRow.accountNumber;
            }
            if ((i & 8) != 0) {
                assetDto = earningsRow.asset;
            }
            if ((i & 16) != 0) {
                str3 = earningsRow.sectionId;
            }
            String str4 = str3;
            String str5 = str2;
            return earningsRow.copy(str, highlightItemDto, str5, assetDto, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final AssetDto getAsset() {
            return this.asset;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSectionId() {
            return this.sectionId;
        }

        public final EarningsRow copy(String id, HighlightItemDto highlightItem, String accountNumber, AssetDto asset, String sectionId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            return new EarningsRow(id, highlightItem, accountNumber, asset, sectionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarningsRow)) {
                return false;
            }
            EarningsRow earningsRow = (EarningsRow) other;
            return Intrinsics.areEqual(this.id, earningsRow.id) && Intrinsics.areEqual(this.highlightItem, earningsRow.highlightItem) && Intrinsics.areEqual(this.accountNumber, earningsRow.accountNumber) && Intrinsics.areEqual(this.asset, earningsRow.asset) && Intrinsics.areEqual(this.sectionId, earningsRow.sectionId);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.asset.hashCode()) * 31) + this.sectionId.hashCode();
        }

        public String toString() {
            return "EarningsRow(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ", asset=" + this.asset + ", sectionId=" + this.sectionId + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AssetDto getAsset() {
            return this.asset;
        }

        public final String getSectionId() {
            return this.sectionId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarningsRow(String id, HighlightItemDto highlightItem, String str, AssetDto asset, String sectionId) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
            this.asset = asset;
            this.sectionId = sectionId;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$EarningsShowMoreButton;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "sectionId", "showMore", "", "totalAssetCount", "", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;ZI)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getSectionId", "getShowMore", "()Z", "getTotalAssetCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EarningsShowMoreButton extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final HighlightItemDto highlightItem;
        private final String id;
        private final String sectionId;
        private final boolean showMore;
        private final int totalAssetCount;

        public static /* synthetic */ EarningsShowMoreButton copy$default(EarningsShowMoreButton earningsShowMoreButton, String str, HighlightItemDto highlightItemDto, String str2, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = earningsShowMoreButton.id;
            }
            if ((i2 & 2) != 0) {
                highlightItemDto = earningsShowMoreButton.highlightItem;
            }
            if ((i2 & 4) != 0) {
                str2 = earningsShowMoreButton.sectionId;
            }
            if ((i2 & 8) != 0) {
                z = earningsShowMoreButton.showMore;
            }
            if ((i2 & 16) != 0) {
                i = earningsShowMoreButton.totalAssetCount;
            }
            int i3 = i;
            String str3 = str2;
            return earningsShowMoreButton.copy(str, highlightItemDto, str3, z, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSectionId() {
            return this.sectionId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowMore() {
            return this.showMore;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTotalAssetCount() {
            return this.totalAssetCount;
        }

        public final EarningsShowMoreButton copy(String id, HighlightItemDto highlightItem, String sectionId, boolean showMore, int totalAssetCount) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            return new EarningsShowMoreButton(id, highlightItem, sectionId, showMore, totalAssetCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarningsShowMoreButton)) {
                return false;
            }
            EarningsShowMoreButton earningsShowMoreButton = (EarningsShowMoreButton) other;
            return Intrinsics.areEqual(this.id, earningsShowMoreButton.id) && Intrinsics.areEqual(this.highlightItem, earningsShowMoreButton.highlightItem) && Intrinsics.areEqual(this.sectionId, earningsShowMoreButton.sectionId) && this.showMore == earningsShowMoreButton.showMore && this.totalAssetCount == earningsShowMoreButton.totalAssetCount;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31) + this.sectionId.hashCode()) * 31) + Boolean.hashCode(this.showMore)) * 31) + Integer.hashCode(this.totalAssetCount);
        }

        public String toString() {
            return "EarningsShowMoreButton(id=" + this.id + ", highlightItem=" + this.highlightItem + ", sectionId=" + this.sectionId + ", showMore=" + this.showMore + ", totalAssetCount=" + this.totalAssetCount + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getSectionId() {
            return this.sectionId;
        }

        public final boolean getShowMore() {
            return this.showMore;
        }

        public final int getTotalAssetCount() {
            return this.totalAssetCount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarningsShowMoreButton(String id, HighlightItemDto highlightItem, String sectionId, boolean z, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            Intrinsics.checkNotNullParameter(sectionId, "sectionId");
            this.id = id;
            this.highlightItem = highlightItem;
            this.sectionId = sectionId;
            this.showMore = z;
            this.totalAssetCount = i;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$SportCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SportCarousel extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ SportCarousel copy$default(SportCarousel sportCarousel, String str, HighlightItemDto highlightItemDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sportCarousel.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = sportCarousel.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = sportCarousel.accountNumber;
            }
            return sportCarousel.copy(str, highlightItemDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final SportCarousel copy(String id, HighlightItemDto highlightItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new SportCarousel(id, highlightItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SportCarousel)) {
                return false;
            }
            SportCarousel sportCarousel = (SportCarousel) other;
            return Intrinsics.areEqual(this.id, sportCarousel.id) && Intrinsics.areEqual(this.highlightItem, sportCarousel.highlightItem) && Intrinsics.areEqual(this.accountNumber, sportCarousel.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SportCarousel(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportCarousel(String id, HighlightItemDto highlightItem, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$SportHeroCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SportHeroCarousel extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ SportHeroCarousel copy$default(SportHeroCarousel sportHeroCarousel, String str, HighlightItemDto highlightItemDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sportHeroCarousel.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = sportHeroCarousel.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = sportHeroCarousel.accountNumber;
            }
            return sportHeroCarousel.copy(str, highlightItemDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final SportHeroCarousel copy(String id, HighlightItemDto highlightItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new SportHeroCarousel(id, highlightItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SportHeroCarousel)) {
                return false;
            }
            SportHeroCarousel sportHeroCarousel = (SportHeroCarousel) other;
            return Intrinsics.areEqual(this.id, sportHeroCarousel.id) && Intrinsics.areEqual(this.highlightItem, sportHeroCarousel.highlightItem) && Intrinsics.areEqual(this.accountNumber, sportHeroCarousel.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SportHeroCarousel(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportHeroCarousel(String id, HighlightItemDto highlightItem, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
        }
    }

    /* compiled from: SearchHighlightsRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow$MultiContractHeroCarousel;", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsRow;", "id", "", "highlightItem", "Lsearch_coprocessor/v1/HighlightItemDto;", "accountNumber", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/HighlightItemDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHighlightItem", "()Lsearch_coprocessor/v1/HighlightItemDto;", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultiContractHeroCarousel extends SearchHighlightsRow {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HighlightItemDto highlightItem;
        private final String id;

        public static /* synthetic */ MultiContractHeroCarousel copy$default(MultiContractHeroCarousel multiContractHeroCarousel, String str, HighlightItemDto highlightItemDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = multiContractHeroCarousel.id;
            }
            if ((i & 2) != 0) {
                highlightItemDto = multiContractHeroCarousel.highlightItem;
            }
            if ((i & 4) != 0) {
                str2 = multiContractHeroCarousel.accountNumber;
            }
            return multiContractHeroCarousel.copy(str, highlightItemDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final MultiContractHeroCarousel copy(String id, HighlightItemDto highlightItem, String accountNumber) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            return new MultiContractHeroCarousel(id, highlightItem, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiContractHeroCarousel)) {
                return false;
            }
            MultiContractHeroCarousel multiContractHeroCarousel = (MultiContractHeroCarousel) other;
            return Intrinsics.areEqual(this.id, multiContractHeroCarousel.id) && Intrinsics.areEqual(this.highlightItem, multiContractHeroCarousel.highlightItem) && Intrinsics.areEqual(this.accountNumber, multiContractHeroCarousel.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.highlightItem.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MultiContractHeroCarousel(id=" + this.id + ", highlightItem=" + this.highlightItem + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow2
        public String getId() {
            return this.id;
        }

        @Override // com.robinhood.android.search.highlights.p249ui.SearchHighlightsRow
        public HighlightItemDto getHighlightItem() {
            return this.highlightItem;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiContractHeroCarousel(String id, HighlightItemDto highlightItem, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(highlightItem, "highlightItem");
            this.id = id;
            this.highlightItem = highlightItem;
            this.accountNumber = str;
        }
    }
}
