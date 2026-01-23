package com.robinhood.android.lib.store.margin;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.BrokebackMarginApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallRecommendedActionsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginCallRecommendedActionsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/store/margin/MarginCallRecommendedActionsStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginCallRecommendedActionsStore_Factory implements Factory<MarginCallRecommendedActionsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BrokebackMarginApi> brokebackMarginApi;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MarginCallRecommendedActionsStore_Factory create(Provider<AccountProvider> provider, Provider<BrokebackMarginApi> provider2, Provider<InstrumentStore> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final MarginCallRecommendedActionsStore newInstance(AccountProvider accountProvider, BrokebackMarginApi brokebackMarginApi, InstrumentStore instrumentStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(accountProvider, brokebackMarginApi, instrumentStore, storeBundle);
    }

    public MarginCallRecommendedActionsStore_Factory(Provider<AccountProvider> accountProvider, Provider<BrokebackMarginApi> brokebackMarginApi, Provider<InstrumentStore> instrumentStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.brokebackMarginApi = brokebackMarginApi;
        this.instrumentStore = instrumentStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public MarginCallRecommendedActionsStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        BrokebackMarginApi brokebackMarginApi = this.brokebackMarginApi.get();
        Intrinsics.checkNotNullExpressionValue(brokebackMarginApi, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(accountProvider, brokebackMarginApi, instrumentStore, storeBundle);
    }

    /* compiled from: MarginCallRecommendedActionsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginCallRecommendedActionsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/store/margin/MarginCallRecommendedActionsStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/lib/store/margin/MarginCallRecommendedActionsStore;", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginCallRecommendedActionsStore_Factory create(Provider<AccountProvider> accountProvider, Provider<BrokebackMarginApi> brokebackMarginApi, Provider<InstrumentStore> instrumentStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MarginCallRecommendedActionsStore_Factory(accountProvider, brokebackMarginApi, instrumentStore, storeBundle);
        }

        @JvmStatic
        public final MarginCallRecommendedActionsStore newInstance(AccountProvider accountProvider, BrokebackMarginApi brokebackMarginApi, InstrumentStore instrumentStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MarginCallRecommendedActionsStore(accountProvider, brokebackMarginApi, instrumentStore, storeBundle);
        }
    }
}
