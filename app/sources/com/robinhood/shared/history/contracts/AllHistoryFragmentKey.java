package com.robinhood.shared.history.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AllHistoryFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:Bg\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003Jk\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006;"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "filterTypes", "", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "transactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "historyStaticFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "useSelectableFiltersFromFilterTypes", "", "preselectedFilter", "fromDeepLink", "showPersistentFiltersWithNoItems", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/robinhood/shared/models/history/shared/TransactionReference;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;ZLcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;ZZ)V", "getFilterTypes", "()Ljava/util/Set;", "getTransactionTypes", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getHistoryStaticFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "getUseSelectableFiltersFromFilterTypes", "()Z", "getPreselectedFilter", "()Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "getFromDeepLink", "getShowPersistentFiltersWithNoItems", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Filter", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class AllHistoryFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<AllHistoryFragmentKey> CREATOR = new Creator();
    private final Set<Filter> filterTypes;
    private final boolean fromDeepLink;
    private final HistoryStaticFilter historyStaticFilter;
    private final Filter preselectedFilter;
    private final boolean showPersistentFiltersWithNoItems;
    private final TransactionReference transactionReference;
    private final Set<HistoryTransactionType> transactionTypes;
    private final boolean useSelectableFiltersFromFilterTypes;

    /* compiled from: AllHistoryFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AllHistoryFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AllHistoryFragmentKey createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet2.add(Filter.valueOf(parcel.readString()));
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(HistoryTransactionType.valueOf(parcel.readString()));
                }
            }
            TransactionReference transactionReference = (TransactionReference) parcel.readParcelable(AllHistoryFragmentKey.class.getClassLoader());
            HistoryStaticFilter historyStaticFilter = (HistoryStaticFilter) parcel.readParcelable(AllHistoryFragmentKey.class.getClassLoader());
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new AllHistoryFragmentKey(linkedHashSet2, linkedHashSet, transactionReference, historyStaticFilter, z2, Filter.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AllHistoryFragmentKey[] newArray(int i) {
            return new AllHistoryFragmentKey[i];
        }
    }

    public static /* synthetic */ AllHistoryFragmentKey copy$default(AllHistoryFragmentKey allHistoryFragmentKey, Set set, Set set2, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, boolean z, Filter filter, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            set = allHistoryFragmentKey.filterTypes;
        }
        if ((i & 2) != 0) {
            set2 = allHistoryFragmentKey.transactionTypes;
        }
        if ((i & 4) != 0) {
            transactionReference = allHistoryFragmentKey.transactionReference;
        }
        if ((i & 8) != 0) {
            historyStaticFilter = allHistoryFragmentKey.historyStaticFilter;
        }
        if ((i & 16) != 0) {
            z = allHistoryFragmentKey.useSelectableFiltersFromFilterTypes;
        }
        if ((i & 32) != 0) {
            filter = allHistoryFragmentKey.preselectedFilter;
        }
        if ((i & 64) != 0) {
            z2 = allHistoryFragmentKey.fromDeepLink;
        }
        if ((i & 128) != 0) {
            z3 = allHistoryFragmentKey.showPersistentFiltersWithNoItems;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        Filter filter2 = filter;
        return allHistoryFragmentKey.copy(set, set2, transactionReference, historyStaticFilter, z6, filter2, z4, z5);
    }

    public final Set<Filter> component1() {
        return this.filterTypes;
    }

    public final Set<HistoryTransactionType> component2() {
        return this.transactionTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    /* renamed from: component4, reason: from getter */
    public final HistoryStaticFilter getHistoryStaticFilter() {
        return this.historyStaticFilter;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseSelectableFiltersFromFilterTypes() {
        return this.useSelectableFiltersFromFilterTypes;
    }

    /* renamed from: component6, reason: from getter */
    public final Filter getPreselectedFilter() {
        return this.preselectedFilter;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowPersistentFiltersWithNoItems() {
        return this.showPersistentFiltersWithNoItems;
    }

    public final AllHistoryFragmentKey copy(Set<? extends Filter> filterTypes, Set<? extends HistoryTransactionType> transactionTypes, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, boolean useSelectableFiltersFromFilterTypes, Filter preselectedFilter, boolean fromDeepLink, boolean showPersistentFiltersWithNoItems) {
        Intrinsics.checkNotNullParameter(filterTypes, "filterTypes");
        Intrinsics.checkNotNullParameter(preselectedFilter, "preselectedFilter");
        return new AllHistoryFragmentKey(filterTypes, transactionTypes, transactionReference, historyStaticFilter, useSelectableFiltersFromFilterTypes, preselectedFilter, fromDeepLink, showPersistentFiltersWithNoItems);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllHistoryFragmentKey)) {
            return false;
        }
        AllHistoryFragmentKey allHistoryFragmentKey = (AllHistoryFragmentKey) other;
        return Intrinsics.areEqual(this.filterTypes, allHistoryFragmentKey.filterTypes) && Intrinsics.areEqual(this.transactionTypes, allHistoryFragmentKey.transactionTypes) && Intrinsics.areEqual(this.transactionReference, allHistoryFragmentKey.transactionReference) && Intrinsics.areEqual(this.historyStaticFilter, allHistoryFragmentKey.historyStaticFilter) && this.useSelectableFiltersFromFilterTypes == allHistoryFragmentKey.useSelectableFiltersFromFilterTypes && this.preselectedFilter == allHistoryFragmentKey.preselectedFilter && this.fromDeepLink == allHistoryFragmentKey.fromDeepLink && this.showPersistentFiltersWithNoItems == allHistoryFragmentKey.showPersistentFiltersWithNoItems;
    }

    public int hashCode() {
        int iHashCode = this.filterTypes.hashCode() * 31;
        Set<HistoryTransactionType> set = this.transactionTypes;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        TransactionReference transactionReference = this.transactionReference;
        int iHashCode3 = (iHashCode2 + (transactionReference == null ? 0 : transactionReference.hashCode())) * 31;
        HistoryStaticFilter historyStaticFilter = this.historyStaticFilter;
        return ((((((((iHashCode3 + (historyStaticFilter != null ? historyStaticFilter.hashCode() : 0)) * 31) + Boolean.hashCode(this.useSelectableFiltersFromFilterTypes)) * 31) + this.preselectedFilter.hashCode()) * 31) + Boolean.hashCode(this.fromDeepLink)) * 31) + Boolean.hashCode(this.showPersistentFiltersWithNoItems);
    }

    public String toString() {
        return "AllHistoryFragmentKey(filterTypes=" + this.filterTypes + ", transactionTypes=" + this.transactionTypes + ", transactionReference=" + this.transactionReference + ", historyStaticFilter=" + this.historyStaticFilter + ", useSelectableFiltersFromFilterTypes=" + this.useSelectableFiltersFromFilterTypes + ", preselectedFilter=" + this.preselectedFilter + ", fromDeepLink=" + this.fromDeepLink + ", showPersistentFiltersWithNoItems=" + this.showPersistentFiltersWithNoItems + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Set<Filter> set = this.filterTypes;
        dest.writeInt(set.size());
        Iterator<Filter> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        Set<HistoryTransactionType> set2 = this.transactionTypes;
        if (set2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set2.size());
            Iterator<HistoryTransactionType> it2 = set2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
        }
        dest.writeParcelable(this.transactionReference, flags);
        dest.writeParcelable(this.historyStaticFilter, flags);
        dest.writeInt(this.useSelectableFiltersFromFilterTypes ? 1 : 0);
        dest.writeString(this.preselectedFilter.name());
        dest.writeInt(this.fromDeepLink ? 1 : 0);
        dest.writeInt(this.showPersistentFiltersWithNoItems ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllHistoryFragmentKey(Set<? extends Filter> filterTypes, Set<? extends HistoryTransactionType> set, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, boolean z, Filter preselectedFilter, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(filterTypes, "filterTypes");
        Intrinsics.checkNotNullParameter(preselectedFilter, "preselectedFilter");
        this.filterTypes = filterTypes;
        this.transactionTypes = set;
        this.transactionReference = transactionReference;
        this.historyStaticFilter = historyStaticFilter;
        this.useSelectableFiltersFromFilterTypes = z;
        this.preselectedFilter = preselectedFilter;
        this.fromDeepLink = z2;
        this.showPersistentFiltersWithNoItems = z3;
    }

    public final Set<Filter> getFilterTypes() {
        return this.filterTypes;
    }

    public final Set<HistoryTransactionType> getTransactionTypes() {
        return this.transactionTypes;
    }

    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    public final HistoryStaticFilter getHistoryStaticFilter() {
        return this.historyStaticFilter;
    }

    public final boolean getUseSelectableFiltersFromFilterTypes() {
        return this.useSelectableFiltersFromFilterTypes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AllHistoryFragmentKey(Set set, Set set2, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, boolean z, Filter filter, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        set2 = (i & 2) != 0 ? null : set2;
        transactionReference = (i & 4) != 0 ? null : transactionReference;
        historyStaticFilter = (i & 8) != 0 ? null : historyStaticFilter;
        z = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            if (set.size() > 1) {
                filter = Filter.ALL;
            } else {
                filter = (Filter) CollectionsKt.first(set);
            }
        }
        this(set, set2, transactionReference, historyStaticFilter, z, filter, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? true : z3);
    }

    public final Filter getPreselectedFilter() {
        return this.preselectedFilter;
    }

    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    public final boolean getShowPersistentFiltersWithNoItems() {
        return this.showPersistentFiltersWithNoItems;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.CURRENT_TAB;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AllHistoryFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "", "<init>", "(Ljava/lang/String;I)V", DisplaySpans.ALL, "DIVIDENDS", "ADR_FEES", "INTEREST", "ORDERS", "EVENT_CONTRACTS", "FUTURES", "OPTION_EVENTS", "TRANSFERS", "CHECK_PAYMENTS", "DEBIT_CARD", "ROUNDUP_REWARDS", "GIFTS", "CRYPTO_TRANSFERS", "CRYPTO_STAKING", "REWARDS", "PERPETUALS_ORDERS", "PERPETUALS_MARGIN_CHANGE", "PERPETUALS_SETTLEMENT", "TOKENIZED_STOCKS_DIVIDENDS", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Filter {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Filter[] $VALUES;
        public static final Filter ALL = new Filter(DisplaySpans.ALL, 0);
        public static final Filter DIVIDENDS = new Filter("DIVIDENDS", 1);
        public static final Filter ADR_FEES = new Filter("ADR_FEES", 2);
        public static final Filter INTEREST = new Filter("INTEREST", 3);
        public static final Filter ORDERS = new Filter("ORDERS", 4);
        public static final Filter EVENT_CONTRACTS = new Filter("EVENT_CONTRACTS", 5);
        public static final Filter FUTURES = new Filter("FUTURES", 6);
        public static final Filter OPTION_EVENTS = new Filter("OPTION_EVENTS", 7);
        public static final Filter TRANSFERS = new Filter("TRANSFERS", 8);
        public static final Filter CHECK_PAYMENTS = new Filter("CHECK_PAYMENTS", 9);
        public static final Filter DEBIT_CARD = new Filter("DEBIT_CARD", 10);
        public static final Filter ROUNDUP_REWARDS = new Filter("ROUNDUP_REWARDS", 11);
        public static final Filter GIFTS = new Filter("GIFTS", 12);
        public static final Filter CRYPTO_TRANSFERS = new Filter("CRYPTO_TRANSFERS", 13);
        public static final Filter CRYPTO_STAKING = new Filter("CRYPTO_STAKING", 14);
        public static final Filter REWARDS = new Filter("REWARDS", 15);
        public static final Filter PERPETUALS_ORDERS = new Filter("PERPETUALS_ORDERS", 16);
        public static final Filter PERPETUALS_MARGIN_CHANGE = new Filter("PERPETUALS_MARGIN_CHANGE", 17);
        public static final Filter PERPETUALS_SETTLEMENT = new Filter("PERPETUALS_SETTLEMENT", 18);
        public static final Filter TOKENIZED_STOCKS_DIVIDENDS = new Filter("TOKENIZED_STOCKS_DIVIDENDS", 19);

        private static final /* synthetic */ Filter[] $values() {
            return new Filter[]{ALL, DIVIDENDS, ADR_FEES, INTEREST, ORDERS, EVENT_CONTRACTS, FUTURES, OPTION_EVENTS, TRANSFERS, CHECK_PAYMENTS, DEBIT_CARD, ROUNDUP_REWARDS, GIFTS, CRYPTO_TRANSFERS, CRYPTO_STAKING, REWARDS, PERPETUALS_ORDERS, PERPETUALS_MARGIN_CHANGE, PERPETUALS_SETTLEMENT, TOKENIZED_STOCKS_DIVIDENDS};
        }

        public static EnumEntries<Filter> getEntries() {
            return $ENTRIES;
        }

        private Filter(String str, int i) {
        }

        static {
            Filter[] filterArr$values = $values();
            $VALUES = filterArr$values;
            $ENTRIES = EnumEntries2.enumEntries(filterArr$values);
        }

        public static Filter valueOf(String str) {
            return (Filter) Enum.valueOf(Filter.class, str);
        }

        public static Filter[] values() {
            return (Filter[]) $VALUES.clone();
        }
    }
}
