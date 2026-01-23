package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMessagingStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "viewCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "versionPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptoMessagingStore_Factory implements Factory<CryptoMessagingStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<CryptoBonfireApi> cryptoBonfireApi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<StringToLongMapPreference> versionPref;
    private final Provider<StringToLongMapPreference> viewCountPref;

    @JvmStatic
    public static final CryptoMessagingStore_Factory create(Provider<StoreBundle> provider, Provider<AppType> provider2, Provider<CryptoBonfireApi> provider3, Provider<StringToLongMapPreference> provider4, Provider<StringToLongMapPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoMessagingStore newInstance(StoreBundle storeBundle, AppType appType, CryptoBonfireApi cryptoBonfireApi, StringToLongMapPreference stringToLongMapPreference, StringToLongMapPreference stringToLongMapPreference2) {
        return INSTANCE.newInstance(storeBundle, appType, cryptoBonfireApi, stringToLongMapPreference, stringToLongMapPreference2);
    }

    public CryptoMessagingStore_Factory(Provider<StoreBundle> storeBundle, Provider<AppType> appType, Provider<CryptoBonfireApi> cryptoBonfireApi, Provider<StringToLongMapPreference> viewCountPref, Provider<StringToLongMapPreference> versionPref) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(viewCountPref, "viewCountPref");
        Intrinsics.checkNotNullParameter(versionPref, "versionPref");
        this.storeBundle = storeBundle;
        this.appType = appType;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.viewCountPref = viewCountPref;
        this.versionPref = versionPref;
    }

    @Override // javax.inject.Provider
    public CryptoMessagingStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoBonfireApi cryptoBonfireApi = this.cryptoBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(cryptoBonfireApi, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.viewCountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference2 = this.versionPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference2, "get(...)");
        return companion.newInstance(storeBundle, appType, cryptoBonfireApi, stringToLongMapPreference, stringToLongMapPreference2);
    }

    /* compiled from: CryptoMessagingStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "viewCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "versionPref", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoMessagingStore_Factory create(Provider<StoreBundle> storeBundle, Provider<AppType> appType, Provider<CryptoBonfireApi> cryptoBonfireApi, Provider<StringToLongMapPreference> viewCountPref, Provider<StringToLongMapPreference> versionPref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
            Intrinsics.checkNotNullParameter(viewCountPref, "viewCountPref");
            Intrinsics.checkNotNullParameter(versionPref, "versionPref");
            return new CryptoMessagingStore_Factory(storeBundle, appType, cryptoBonfireApi, viewCountPref, versionPref);
        }

        @JvmStatic
        public final CryptoMessagingStore newInstance(StoreBundle storeBundle, AppType appType, CryptoBonfireApi cryptoBonfireApi, StringToLongMapPreference viewCountPref, StringToLongMapPreference versionPref) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
            Intrinsics.checkNotNullParameter(viewCountPref, "viewCountPref");
            Intrinsics.checkNotNullParameter(versionPref, "versionPref");
            return new CryptoMessagingStore(storeBundle, appType, cryptoBonfireApi, viewCountPref, versionPref);
        }
    }
}
