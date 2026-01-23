package com.robinhood.librobinhood.util;

import android.content.SharedPreferences;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.util.PersistentCacheManager_MembersInjector;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistentCacheManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/util/PersistentCacheManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PersistentCacheManager_Factory implements Factory<PersistentCacheManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BonfireApi> bonfireApi;
    private final Provider<Identi> identi;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ReferralApi> referralApi;
    private final Provider<RxFactory> rxFactory;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<SharedPreferences> userPrefs;

    @JvmStatic
    public static final PersistentCacheManager_Factory create(Provider<LazyMoshi> provider, Provider<SharedPreferences> provider2, Provider<BonfireApi> provider3, Provider<TransfersBonfireApi> provider4, Provider<Identi> provider5, Provider<ReferralApi> provider6, Provider<RxFactory> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PersistentCacheManager newInstance(LazyMoshi lazyMoshi) {
        return INSTANCE.newInstance(lazyMoshi);
    }

    public PersistentCacheManager_Factory(Provider<LazyMoshi> moshi, Provider<SharedPreferences> userPrefs, Provider<BonfireApi> bonfireApi, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<Identi> identi2, Provider<ReferralApi> referralApi, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(referralApi, "referralApi");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.moshi = moshi;
        this.userPrefs = userPrefs;
        this.bonfireApi = bonfireApi;
        this.transfersBonfireApi = transfersBonfireApi;
        this.identi = identi2;
        this.referralApi = referralApi;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public PersistentCacheManager get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        PersistentCacheManager persistentCacheManagerNewInstance = companion.newInstance(lazyMoshi);
        PersistentCacheManager_MembersInjector.Companion companion2 = PersistentCacheManager_MembersInjector.INSTANCE;
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        companion2.injectUserPrefs(persistentCacheManagerNewInstance, sharedPreferences);
        BonfireApi bonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(bonfireApi, "get(...)");
        companion2.injectBonfireApi(persistentCacheManagerNewInstance, bonfireApi);
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        companion2.injectTransfersBonfireApi(persistentCacheManagerNewInstance, transfersBonfireApi);
        Identi identi2 = this.identi.get();
        Intrinsics.checkNotNullExpressionValue(identi2, "get(...)");
        companion2.injectIdenti(persistentCacheManagerNewInstance, identi2);
        ReferralApi referralApi = this.referralApi.get();
        Intrinsics.checkNotNullExpressionValue(referralApi, "get(...)");
        companion2.injectReferralApi(persistentCacheManagerNewInstance, referralApi);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(persistentCacheManagerNewInstance, rxFactory);
        return persistentCacheManagerNewInstance;
    }

    /* compiled from: PersistentCacheManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/util/PersistentCacheManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/util/PersistentCacheManager_Factory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "lib-store-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PersistentCacheManager_Factory create(Provider<LazyMoshi> moshi, Provider<SharedPreferences> userPrefs, Provider<BonfireApi> bonfireApi, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<Identi> identi2, Provider<ReferralApi> referralApi, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new PersistentCacheManager_Factory(moshi, userPrefs, bonfireApi, transfersBonfireApi, identi2, referralApi, rxFactory);
        }

        @JvmStatic
        public final PersistentCacheManager newInstance(LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new PersistentCacheManager(moshi);
        }
    }
}
