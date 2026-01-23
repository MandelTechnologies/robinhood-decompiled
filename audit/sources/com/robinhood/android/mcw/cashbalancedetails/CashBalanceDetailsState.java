package com.robinhood.android.mcw.cashbalancedetails;

import com.robinhood.android.common.history.p082ui.section.HistorySectionState;
import com.robinhood.android.lib.store.mcw.data.CashBalancesDetailsPageData;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CashBalanceDetailsState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState;", "", "<init>", "()V", "Data", "View", "Companion", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CashBalanceDetailsState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_HISTORY_ITEMS = 3;

    /* compiled from: CashBalanceDetailsState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$Data;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;)V", "getData", "()Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = CashBalancesDetailsPageData.$stable;
        private final CashBalancesDetailsPageData data;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Data copy$default(Data data, CashBalancesDetailsPageData cashBalancesDetailsPageData, int i, Object obj) {
            if ((i & 1) != 0) {
                cashBalancesDetailsPageData = data.data;
            }
            return data.copy(cashBalancesDetailsPageData);
        }

        /* renamed from: component1, reason: from getter */
        public final CashBalancesDetailsPageData getData() {
            return this.data;
        }

        public final Data copy(CashBalancesDetailsPageData data) {
            return new Data(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.areEqual(this.data, ((Data) other).data);
        }

        public int hashCode() {
            CashBalancesDetailsPageData cashBalancesDetailsPageData = this.data;
            if (cashBalancesDetailsPageData == null) {
                return 0;
            }
            return cashBalancesDetailsPageData.hashCode();
        }

        public String toString() {
            return "Data(data=" + this.data + ")";
        }

        public Data(CashBalancesDetailsPageData cashBalancesDetailsPageData) {
            this.data = cashBalancesDetailsPageData;
        }

        public /* synthetic */ Data(CashBalancesDetailsPageData cashBalancesDetailsPageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cashBalancesDetailsPageData);
        }

        public final CashBalancesDetailsPageData getData() {
            return this.data;
        }
    }

    /* compiled from: CashBalanceDetailsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View;", "", "Loading", "Loaded", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View$Loaded;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View$Loading;", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface View {

        /* compiled from: CashBalanceDetailsState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View$Loading;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements View {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -347464739;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: CashBalanceDetailsState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View$Loaded;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "historyState", "Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "historyFooterKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;Lcom/robinhood/android/common/history/ui/section/HistorySectionState;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getData", "()Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "getHistoryState", "()Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "getHistoryFooterKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements View {
            public static final int $stable = 8;
            private final CashBalancesDetailsPageData data;
            private final FragmentKey historyFooterKey;
            private final HistorySectionState historyState;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, CashBalancesDetailsPageData cashBalancesDetailsPageData, HistorySectionState historySection6, FragmentKey fragmentKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    cashBalancesDetailsPageData = loaded.data;
                }
                if ((i & 2) != 0) {
                    historySection6 = loaded.historyState;
                }
                if ((i & 4) != 0) {
                    fragmentKey = loaded.historyFooterKey;
                }
                return loaded.copy(cashBalancesDetailsPageData, historySection6, fragmentKey);
            }

            /* renamed from: component1, reason: from getter */
            public final CashBalancesDetailsPageData getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final HistorySectionState getHistoryState() {
                return this.historyState;
            }

            /* renamed from: component3, reason: from getter */
            public final FragmentKey getHistoryFooterKey() {
                return this.historyFooterKey;
            }

            public final Loaded copy(CashBalancesDetailsPageData data, HistorySectionState historyState, FragmentKey historyFooterKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(historyState, "historyState");
                Intrinsics.checkNotNullParameter(historyFooterKey, "historyFooterKey");
                return new Loaded(data, historyState, historyFooterKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.data, loaded.data) && Intrinsics.areEqual(this.historyState, loaded.historyState) && Intrinsics.areEqual(this.historyFooterKey, loaded.historyFooterKey);
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + this.historyState.hashCode()) * 31) + this.historyFooterKey.hashCode();
            }

            public String toString() {
                return "Loaded(data=" + this.data + ", historyState=" + this.historyState + ", historyFooterKey=" + this.historyFooterKey + ")";
            }

            public Loaded(CashBalancesDetailsPageData data, HistorySectionState historyState, FragmentKey historyFooterKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(historyState, "historyState");
                Intrinsics.checkNotNullParameter(historyFooterKey, "historyFooterKey");
                this.data = data;
                this.historyState = historyState;
                this.historyFooterKey = historyFooterKey;
            }

            public final CashBalancesDetailsPageData getData() {
                return this.data;
            }

            public final HistorySectionState getHistoryState() {
                return this.historyState;
            }

            public final FragmentKey getHistoryFooterKey() {
                return this.historyFooterKey;
            }
        }
    }

    /* compiled from: CashBalanceDetailsState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$Data;", "Lcom/robinhood/android/mcw/cashbalancedetails/CashBalanceDetailsState$View;", "<init>", "()V", "MAX_HISTORY_ITEMS", "", "reduce", "dataState", "feature-mcw-cash-balance-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<Data, View> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.android.udf.StateProvider
        public View reduce(Data dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getData() == null) {
                return View.Loading.INSTANCE;
            }
            ImmutableSet3 immutableSet3PersistentSetOf = extensions2.persistentSetOf(HistoryTransactionType.I18N_WIRE, HistoryTransactionType.SG_BANK_TRANSFER, HistoryTransactionType.FX_ORDER, HistoryTransactionType.SWEEP, HistoryTransactionType.UK_BANK_TRANSFER);
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z = false;
            FragmentTab fragmentTab = null;
            return new View.Loaded(dataState.getData(), new HistorySectionState(null, immutableSet3PersistentSetOf, null, null, null, 3, true, 29, defaultConstructorMarker), new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.TRANSFERS, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, fragmentTab, 61, defaultConstructorMarker));
        }
    }
}
