package com.robinhood.librobinhood.util;

import android.content.SharedPreferences;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersistentCacheManager_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/util/PersistentCacheManager_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", SharedPreferencesModule.USER_PREFS_NAME, "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-store-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PersistentCacheManager_MembersInjector implements MembersInjector<PersistentCacheManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BonfireApi> bonfireApi;
    private final Provider<Identi> identi;
    private final Provider<ReferralApi> referralApi;
    private final Provider<RxFactory> rxFactory;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<SharedPreferences> userPrefs;

    @JvmStatic
    public static final MembersInjector<PersistentCacheManager> create(Provider<SharedPreferences> provider, Provider<BonfireApi> provider2, Provider<TransfersBonfireApi> provider3, Provider<Identi> provider4, Provider<ReferralApi> provider5, Provider<RxFactory> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectBonfireApi(PersistentCacheManager persistentCacheManager, BonfireApi bonfireApi) {
        INSTANCE.injectBonfireApi(persistentCacheManager, bonfireApi);
    }

    @JvmStatic
    public static final void injectIdenti(PersistentCacheManager persistentCacheManager, Identi identi2) {
        INSTANCE.injectIdenti(persistentCacheManager, identi2);
    }

    @JvmStatic
    public static final void injectReferralApi(PersistentCacheManager persistentCacheManager, ReferralApi referralApi) {
        INSTANCE.injectReferralApi(persistentCacheManager, referralApi);
    }

    @JvmStatic
    public static final void injectRxFactory(PersistentCacheManager persistentCacheManager, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(persistentCacheManager, rxFactory);
    }

    @JvmStatic
    public static final void injectTransfersBonfireApi(PersistentCacheManager persistentCacheManager, TransfersBonfireApi transfersBonfireApi) {
        INSTANCE.injectTransfersBonfireApi(persistentCacheManager, transfersBonfireApi);
    }

    @JvmStatic
    @UserPrefs
    public static final void injectUserPrefs(PersistentCacheManager persistentCacheManager, SharedPreferences sharedPreferences) {
        INSTANCE.injectUserPrefs(persistentCacheManager, sharedPreferences);
    }

    public PersistentCacheManager_MembersInjector(Provider<SharedPreferences> userPrefs, Provider<BonfireApi> bonfireApi, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<Identi> identi2, Provider<ReferralApi> referralApi, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(referralApi, "referralApi");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.userPrefs = userPrefs;
        this.bonfireApi = bonfireApi;
        this.transfersBonfireApi = transfersBonfireApi;
        this.identi = identi2;
        this.referralApi = referralApi;
        this.rxFactory = rxFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PersistentCacheManager instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        companion.injectUserPrefs(instance, sharedPreferences);
        BonfireApi bonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(bonfireApi, "get(...)");
        companion.injectBonfireApi(instance, bonfireApi);
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        companion.injectTransfersBonfireApi(instance, transfersBonfireApi);
        Identi identi2 = this.identi.get();
        Intrinsics.checkNotNullExpressionValue(identi2, "get(...)");
        companion.injectIdenti(instance, identi2);
        ReferralApi referralApi = this.referralApi.get();
        Intrinsics.checkNotNullExpressionValue(referralApi, "get(...)");
        companion.injectReferralApi(instance, referralApi);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion.injectRxFactory(instance, rxFactory);
    }

    /* compiled from: PersistentCacheManager_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/util/PersistentCacheManager_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", SharedPreferencesModule.USER_PREFS_NAME, "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "injectUserPrefs", "", "instance", "injectBonfireApi", "injectTransfersBonfireApi", "injectIdenti", "injectReferralApi", "injectRxFactory", "lib-store-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PersistentCacheManager> create(Provider<SharedPreferences> userPrefs, Provider<BonfireApi> bonfireApi, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<Identi> identi2, Provider<ReferralApi> referralApi, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new PersistentCacheManager_MembersInjector(userPrefs, bonfireApi, transfersBonfireApi, identi2, referralApi, rxFactory);
        }

        @JvmStatic
        @UserPrefs
        public final void injectUserPrefs(PersistentCacheManager instance, SharedPreferences userPrefs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            instance.setUserPrefs(userPrefs);
        }

        @JvmStatic
        public final void injectBonfireApi(PersistentCacheManager instance, BonfireApi bonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            instance.setBonfireApi(bonfireApi);
        }

        @JvmStatic
        public final void injectTransfersBonfireApi(PersistentCacheManager instance, TransfersBonfireApi transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            instance.setTransfersBonfireApi(transfersBonfireApi);
        }

        @JvmStatic
        public final void injectIdenti(PersistentCacheManager instance, Identi identi2) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(identi2, "identi");
            instance.setIdenti(identi2);
        }

        @JvmStatic
        public final void injectReferralApi(PersistentCacheManager instance, ReferralApi referralApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            instance.setReferralApi(referralApi);
        }

        @JvmStatic
        public final void injectRxFactory(PersistentCacheManager instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }
    }
}
