package com.robinhood.android.tradingtrends.p264ui.details.table;

import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsTableViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState;", "", "instrumentId", "", "table", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState;)V", "getInstrumentId", "()Ljava/lang/String;", "getTable", "()Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TradingTrendsTableState", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TradingTrendsTableViewState {
    public static final int $stable = 8;
    private final String instrumentId;
    private final TradingTrendsTableState table;

    /* JADX WARN: Multi-variable type inference failed */
    public TradingTrendsTableViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TradingTrendsTableViewState copy$default(TradingTrendsTableViewState tradingTrendsTableViewState, String str, TradingTrendsTableState tradingTrendsTableState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingTrendsTableViewState.instrumentId;
        }
        if ((i & 2) != 0) {
            tradingTrendsTableState = tradingTrendsTableViewState.table;
        }
        return tradingTrendsTableViewState.copy(str, tradingTrendsTableState);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final TradingTrendsTableState getTable() {
        return this.table;
    }

    public final TradingTrendsTableViewState copy(String instrumentId, TradingTrendsTableState table) {
        Intrinsics.checkNotNullParameter(table, "table");
        return new TradingTrendsTableViewState(instrumentId, table);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingTrendsTableViewState)) {
            return false;
        }
        TradingTrendsTableViewState tradingTrendsTableViewState = (TradingTrendsTableViewState) other;
        return Intrinsics.areEqual(this.instrumentId, tradingTrendsTableViewState.instrumentId) && Intrinsics.areEqual(this.table, tradingTrendsTableViewState.table);
    }

    public int hashCode() {
        String str = this.instrumentId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.table.hashCode();
    }

    public String toString() {
        return "TradingTrendsTableViewState(instrumentId=" + this.instrumentId + ", table=" + this.table + ")";
    }

    public TradingTrendsTableViewState(String str, TradingTrendsTableState table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.instrumentId = str;
        this.table = table;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public /* synthetic */ TradingTrendsTableViewState(String str, TradingTrendsTableState tradingTrendsTableState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? TradingTrendsTableState.Loading.INSTANCE : tradingTrendsTableState);
    }

    public final TradingTrendsTableState getTable() {
        return this.table;
    }

    /* compiled from: TradingTrendsTableViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState;", "", "Loading", "Loaded", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState$Loaded;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState$Loading;", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TradingTrendsTableState {

        /* compiled from: TradingTrendsTableViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState$Loading;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements TradingTrendsTableState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -2096059468;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: TradingTrendsTableViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState$Loaded;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState$TradingTrendsTableState;", "selectedType", "", "sortKey", "sortDirection", "availableSortKeys", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "genericTableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/generic/table/GenericTableData;)V", "getSelectedType", "()Ljava/lang/String;", "getSortKey", "getSortDirection", "getAvailableSortKeys", "()Ljava/util/List;", "getDisclosure", "getGenericTableData", "()Lcom/robinhood/android/generic/table/GenericTableData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements TradingTrendsTableState {
            public static final int $stable = 8;
            private final List<String> availableSortKeys;
            private final String disclosure;
            private final GenericTableData<TradingTrendsGenericCell> genericTableData;
            private final String selectedType;
            private final String sortDirection;
            private final String sortKey;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, String str3, List list, String str4, GenericTableData genericTableData, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loaded.selectedType;
                }
                if ((i & 2) != 0) {
                    str2 = loaded.sortKey;
                }
                if ((i & 4) != 0) {
                    str3 = loaded.sortDirection;
                }
                if ((i & 8) != 0) {
                    list = loaded.availableSortKeys;
                }
                if ((i & 16) != 0) {
                    str4 = loaded.disclosure;
                }
                if ((i & 32) != 0) {
                    genericTableData = loaded.genericTableData;
                }
                String str5 = str4;
                GenericTableData genericTableData2 = genericTableData;
                return loaded.copy(str, str2, str3, list, str5, genericTableData2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSelectedType() {
                return this.selectedType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSortKey() {
                return this.sortKey;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSortDirection() {
                return this.sortDirection;
            }

            public final List<String> component4() {
                return this.availableSortKeys;
            }

            /* renamed from: component5, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            public final GenericTableData<TradingTrendsGenericCell> component6() {
                return this.genericTableData;
            }

            public final Loaded copy(String selectedType, String sortKey, String sortDirection, List<String> availableSortKeys, String disclosure, GenericTableData<TradingTrendsGenericCell> genericTableData) {
                Intrinsics.checkNotNullParameter(selectedType, "selectedType");
                Intrinsics.checkNotNullParameter(availableSortKeys, "availableSortKeys");
                return new Loaded(selectedType, sortKey, sortDirection, availableSortKeys, disclosure, genericTableData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.selectedType, loaded.selectedType) && Intrinsics.areEqual(this.sortKey, loaded.sortKey) && Intrinsics.areEqual(this.sortDirection, loaded.sortDirection) && Intrinsics.areEqual(this.availableSortKeys, loaded.availableSortKeys) && Intrinsics.areEqual(this.disclosure, loaded.disclosure) && Intrinsics.areEqual(this.genericTableData, loaded.genericTableData);
            }

            public int hashCode() {
                int iHashCode = this.selectedType.hashCode() * 31;
                String str = this.sortKey;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.sortDirection;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.availableSortKeys.hashCode()) * 31;
                String str3 = this.disclosure;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                GenericTableData<TradingTrendsGenericCell> genericTableData = this.genericTableData;
                return iHashCode4 + (genericTableData != null ? genericTableData.hashCode() : 0);
            }

            public String toString() {
                return "Loaded(selectedType=" + this.selectedType + ", sortKey=" + this.sortKey + ", sortDirection=" + this.sortDirection + ", availableSortKeys=" + this.availableSortKeys + ", disclosure=" + this.disclosure + ", genericTableData=" + this.genericTableData + ")";
            }

            public Loaded(String selectedType, String str, String str2, List<String> availableSortKeys, String str3, GenericTableData<TradingTrendsGenericCell> genericTableData) {
                Intrinsics.checkNotNullParameter(selectedType, "selectedType");
                Intrinsics.checkNotNullParameter(availableSortKeys, "availableSortKeys");
                this.selectedType = selectedType;
                this.sortKey = str;
                this.sortDirection = str2;
                this.availableSortKeys = availableSortKeys;
                this.disclosure = str3;
                this.genericTableData = genericTableData;
            }

            public final String getSelectedType() {
                return this.selectedType;
            }

            public final String getSortKey() {
                return this.sortKey;
            }

            public final String getSortDirection() {
                return this.sortDirection;
            }

            public final List<String> getAvailableSortKeys() {
                return this.availableSortKeys;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }

            public final GenericTableData<TradingTrendsGenericCell> getGenericTableData() {
                return this.genericTableData;
            }
        }
    }
}
