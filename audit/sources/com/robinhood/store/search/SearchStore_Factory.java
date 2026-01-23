package com.robinhood.store.search;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.search.SearchBonfireApi;
import com.robinhood.api.search.SearchCryptoBonfireApi;
import com.robinhood.models.dao.CurrencyDao;
import com.robinhood.models.dao.CurrencyPairDao;
import com.robinhood.models.dao.InstrumentDao;
import com.robinhood.models.p320db.recentSearch.RecentSearchDao;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/search/SearchStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/search/SearchStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "instrumentDao", "Lcom/robinhood/models/dao/InstrumentDao;", "currencyPairDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "currencyDao", "Lcom/robinhood/models/dao/CurrencyDao;", "recentSearchDao", "Lcom/robinhood/models/db/recentSearch/RecentSearchDao;", "bonfire", "Lcom/robinhood/api/search/SearchBonfireApi;", "searchCryptoBonfireApi", "Lcom/robinhood/api/search/SearchCryptoBonfireApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SearchStore_Factory implements Factory<SearchStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<SearchBonfireApi> bonfire;
    private final Provider<CurrencyDao> currencyDao;
    private final Provider<CurrencyPairDao> currencyPairDao;
    private final Provider<InstrumentDao> instrumentDao;
    private final Provider<RecentSearchDao> recentSearchDao;
    private final Provider<SearchCryptoBonfireApi> searchCryptoBonfireApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final SearchStore_Factory create(Provider<StoreBundle> provider, Provider<InstrumentDao> provider2, Provider<CurrencyPairDao> provider3, Provider<CurrencyDao> provider4, Provider<RecentSearchDao> provider5, Provider<SearchBonfireApi> provider6, Provider<SearchCryptoBonfireApi> provider7, Provider<AuthManager> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final SearchStore newInstance(StoreBundle storeBundle, InstrumentDao instrumentDao, CurrencyPairDao currencyPairDao, CurrencyDao currencyDao, RecentSearchDao recentSearchDao, SearchBonfireApi searchBonfireApi, SearchCryptoBonfireApi searchCryptoBonfireApi, AuthManager authManager) {
        return INSTANCE.newInstance(storeBundle, instrumentDao, currencyPairDao, currencyDao, recentSearchDao, searchBonfireApi, searchCryptoBonfireApi, authManager);
    }

    public SearchStore_Factory(Provider<StoreBundle> storeBundle, Provider<InstrumentDao> instrumentDao, Provider<CurrencyPairDao> currencyPairDao, Provider<CurrencyDao> currencyDao, Provider<RecentSearchDao> recentSearchDao, Provider<SearchBonfireApi> bonfire2, Provider<SearchCryptoBonfireApi> searchCryptoBonfireApi, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(instrumentDao, "instrumentDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(recentSearchDao, "recentSearchDao");
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(searchCryptoBonfireApi, "searchCryptoBonfireApi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.storeBundle = storeBundle;
        this.instrumentDao = instrumentDao;
        this.currencyPairDao = currencyPairDao;
        this.currencyDao = currencyDao;
        this.recentSearchDao = recentSearchDao;
        this.bonfire = bonfire2;
        this.searchCryptoBonfireApi = searchCryptoBonfireApi;
        this.authManager = authManager;
    }

    @Override // javax.inject.Provider
    public SearchStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        InstrumentDao instrumentDao = this.instrumentDao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentDao, "get(...)");
        CurrencyPairDao currencyPairDao = this.currencyPairDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairDao, "get(...)");
        CurrencyDao currencyDao = this.currencyDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyDao, "get(...)");
        RecentSearchDao recentSearchDao = this.recentSearchDao.get();
        Intrinsics.checkNotNullExpressionValue(recentSearchDao, "get(...)");
        SearchBonfireApi searchBonfireApi = this.bonfire.get();
        Intrinsics.checkNotNullExpressionValue(searchBonfireApi, "get(...)");
        SearchCryptoBonfireApi searchCryptoBonfireApi = this.searchCryptoBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(searchCryptoBonfireApi, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        return companion.newInstance(storeBundle, instrumentDao, currencyPairDao, currencyDao, recentSearchDao, searchBonfireApi, searchCryptoBonfireApi, authManager);
    }

    /* compiled from: SearchStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/search/SearchStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/search/SearchStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "instrumentDao", "Lcom/robinhood/models/dao/InstrumentDao;", "currencyPairDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "currencyDao", "Lcom/robinhood/models/dao/CurrencyDao;", "recentSearchDao", "Lcom/robinhood/models/db/recentSearch/RecentSearchDao;", "bonfire", "Lcom/robinhood/api/search/SearchBonfireApi;", "searchCryptoBonfireApi", "Lcom/robinhood/api/search/SearchCryptoBonfireApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "newInstance", "Lcom/robinhood/store/search/SearchStore;", "lib-store-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchStore_Factory create(Provider<StoreBundle> storeBundle, Provider<InstrumentDao> instrumentDao, Provider<CurrencyPairDao> currencyPairDao, Provider<CurrencyDao> currencyDao, Provider<RecentSearchDao> recentSearchDao, Provider<SearchBonfireApi> bonfire2, Provider<SearchCryptoBonfireApi> searchCryptoBonfireApi, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(instrumentDao, "instrumentDao");
            Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(recentSearchDao, "recentSearchDao");
            Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
            Intrinsics.checkNotNullParameter(searchCryptoBonfireApi, "searchCryptoBonfireApi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new SearchStore_Factory(storeBundle, instrumentDao, currencyPairDao, currencyDao, recentSearchDao, bonfire2, searchCryptoBonfireApi, authManager);
        }

        @JvmStatic
        public final SearchStore newInstance(StoreBundle storeBundle, InstrumentDao instrumentDao, CurrencyPairDao currencyPairDao, CurrencyDao currencyDao, RecentSearchDao recentSearchDao, SearchBonfireApi bonfire2, SearchCryptoBonfireApi searchCryptoBonfireApi, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(instrumentDao, "instrumentDao");
            Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(recentSearchDao, "recentSearchDao");
            Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
            Intrinsics.checkNotNullParameter(searchCryptoBonfireApi, "searchCryptoBonfireApi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new SearchStore(storeBundle, instrumentDao, currencyPairDao, currencyDao, recentSearchDao, bonfire2, searchCryptoBonfireApi, authManager);
        }
    }
}
