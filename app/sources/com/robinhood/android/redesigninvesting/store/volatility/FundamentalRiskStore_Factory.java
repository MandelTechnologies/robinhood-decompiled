package com.robinhood.android.redesigninvesting.store.volatility;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesigninvesting.api.highlights.volatility.HighlightsMarketdataApi;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRiskDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FundamentalRiskStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/redesigninvesting/api/highlights/volatility/HighlightsMarketdataApi;", "dao", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/db/FundamentalRiskDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-volatility_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FundamentalRiskStore_Factory implements Factory<FundamentalRiskStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<HighlightsMarketdataApi> api;
    private final Provider<FundamentalRiskDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final FundamentalRiskStore_Factory create(Provider<HighlightsMarketdataApi> provider, Provider<FundamentalRiskDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final FundamentalRiskStore newInstance(HighlightsMarketdataApi highlightsMarketdataApi, FundamentalRiskDao fundamentalRiskDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(highlightsMarketdataApi, fundamentalRiskDao, storeBundle);
    }

    public FundamentalRiskStore_Factory(Provider<HighlightsMarketdataApi> api, Provider<FundamentalRiskDao> dao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FundamentalRiskStore get() {
        Companion companion = INSTANCE;
        HighlightsMarketdataApi highlightsMarketdataApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(highlightsMarketdataApi, "get(...)");
        FundamentalRiskDao fundamentalRiskDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalRiskDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(highlightsMarketdataApi, fundamentalRiskDao, storeBundle);
    }

    /* compiled from: FundamentalRiskStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/redesigninvesting/api/highlights/volatility/HighlightsMarketdataApi;", "dao", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/db/FundamentalRiskDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "lib-store-volatility_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FundamentalRiskStore_Factory create(Provider<HighlightsMarketdataApi> api, Provider<FundamentalRiskDao> dao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FundamentalRiskStore_Factory(api, dao, storeBundle);
        }

        @JvmStatic
        public final FundamentalRiskStore newInstance(HighlightsMarketdataApi api, FundamentalRiskDao dao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FundamentalRiskStore(api, dao, storeBundle);
        }
    }
}
