package com.robinhood.android.futures.history.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.futures.FuturesCashSettlementStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesCashSettlementHistoryTransactionLoader_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader;", "cashSettlementStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/FuturesCashSettlementStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesCashSettlementHistoryTransactionLoader_Factory implements Factory<FuturesCashSettlementHistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FuturesCashSettlementStore> cashSettlementStore;
    private final Provider<FuturesContractStore> futuresContractStore;

    @JvmStatic
    public static final FuturesCashSettlementHistoryTransactionLoader_Factory create(Provider<FuturesCashSettlementStore> provider, Provider<FuturesContractStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final FuturesCashSettlementHistoryTransactionLoader newInstance(FuturesCashSettlementStore futuresCashSettlementStore, FuturesContractStore futuresContractStore) {
        return INSTANCE.newInstance(futuresCashSettlementStore, futuresContractStore);
    }

    public FuturesCashSettlementHistoryTransactionLoader_Factory(Provider<FuturesCashSettlementStore> cashSettlementStore, Provider<FuturesContractStore> futuresContractStore) {
        Intrinsics.checkNotNullParameter(cashSettlementStore, "cashSettlementStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        this.cashSettlementStore = cashSettlementStore;
        this.futuresContractStore = futuresContractStore;
    }

    @Override // javax.inject.Provider
    public FuturesCashSettlementHistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        FuturesCashSettlementStore futuresCashSettlementStore = this.cashSettlementStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresCashSettlementStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        return companion.newInstance(futuresCashSettlementStore, futuresContractStore);
    }

    /* compiled from: FuturesCashSettlementHistoryTransactionLoader_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader_Factory;", "cashSettlementStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/FuturesCashSettlementStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "newInstance", "Lcom/robinhood/android/futures/history/provisions/FuturesCashSettlementHistoryTransactionLoader;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesCashSettlementHistoryTransactionLoader_Factory create(Provider<FuturesCashSettlementStore> cashSettlementStore, Provider<FuturesContractStore> futuresContractStore) {
            Intrinsics.checkNotNullParameter(cashSettlementStore, "cashSettlementStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            return new FuturesCashSettlementHistoryTransactionLoader_Factory(cashSettlementStore, futuresContractStore);
        }

        @JvmStatic
        public final FuturesCashSettlementHistoryTransactionLoader newInstance(FuturesCashSettlementStore cashSettlementStore, FuturesContractStore futuresContractStore) {
            Intrinsics.checkNotNullParameter(cashSettlementStore, "cashSettlementStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            return new FuturesCashSettlementHistoryTransactionLoader(cashSettlementStore, futuresContractStore);
        }
    }
}
