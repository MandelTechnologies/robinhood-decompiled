package com.robinhood.shared.store.history;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTransactionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB4\u0012\u001d\u0010\u0003\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R%\u0010\u0003\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryTransactionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "historyTransactionLoaders", "Ljavax/inject/Provider;", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class HistoryTransactionStore_Factory implements Factory<HistoryTransactionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Map<HistoryTransactionType, HistoryTransactionLoader>> historyTransactionLoaders;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final HistoryTransactionStore_Factory create(Provider<Map<HistoryTransactionType, HistoryTransactionLoader>> provider, Provider<StoreBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final HistoryTransactionStore newInstance(Map<HistoryTransactionType, HistoryTransactionLoader> map, StoreBundle storeBundle) {
        return INSTANCE.newInstance(map, storeBundle);
    }

    public HistoryTransactionStore_Factory(Provider<Map<HistoryTransactionType, HistoryTransactionLoader>> historyTransactionLoaders, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(historyTransactionLoaders, "historyTransactionLoaders");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.historyTransactionLoaders = historyTransactionLoaders;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionStore get() {
        Companion companion = INSTANCE;
        Map<HistoryTransactionType, HistoryTransactionLoader> map = this.historyTransactionLoaders.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(map, storeBundle);
    }

    /* compiled from: HistoryTransactionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0007J)\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryTransactionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/store/history/HistoryTransactionStore_Factory;", "historyTransactionLoaders", "Ljavax/inject/Provider;", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "Lkotlin/jvm/JvmSuppressWildcards;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HistoryTransactionStore_Factory create(Provider<Map<HistoryTransactionType, HistoryTransactionLoader>> historyTransactionLoaders, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(historyTransactionLoaders, "historyTransactionLoaders");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HistoryTransactionStore_Factory(historyTransactionLoaders, storeBundle);
        }

        @JvmStatic
        public final HistoryTransactionStore newInstance(Map<HistoryTransactionType, HistoryTransactionLoader> historyTransactionLoaders, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(historyTransactionLoaders, "historyTransactionLoaders");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HistoryTransactionStore(historyTransactionLoaders, storeBundle);
        }
    }
}
