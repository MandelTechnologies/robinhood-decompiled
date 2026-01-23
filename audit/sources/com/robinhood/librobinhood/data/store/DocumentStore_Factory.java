package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.documents.models.DocumentsBrokebackApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.dao.DocumentDao;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: DocumentStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DocumentStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/android/documents/models/DocumentsBrokebackApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/DocumentDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DocumentStore_Factory implements Factory<DocumentStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<AuthTokenManager> authTokenManager;
    private final Provider<DocumentsBrokebackApi> brokeback;
    private final Provider<DocumentDao> dao;
    private final Provider<OkHttpClient> okHttpClient;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final DocumentStore_Factory create(Provider<AppType> provider, Provider<UserStore> provider2, Provider<AccountProvider> provider3, Provider<DocumentsBrokebackApi> provider4, Provider<OkHttpClient> provider5, Provider<AuthTokenManager> provider6, Provider<StoreBundle> provider7, Provider<DocumentDao> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final DocumentStore newInstance(AppType appType, UserStore userStore, AccountProvider accountProvider, DocumentsBrokebackApi documentsBrokebackApi, OkHttpClient okHttpClient, AuthTokenManager authTokenManager, StoreBundle storeBundle, DocumentDao documentDao) {
        return INSTANCE.newInstance(appType, userStore, accountProvider, documentsBrokebackApi, okHttpClient, authTokenManager, storeBundle, documentDao);
    }

    public DocumentStore_Factory(Provider<AppType> appType, Provider<UserStore> userStore, Provider<AccountProvider> accountProvider, Provider<DocumentsBrokebackApi> brokeback, Provider<OkHttpClient> okHttpClient, Provider<AuthTokenManager> authTokenManager, Provider<StoreBundle> storeBundle, Provider<DocumentDao> dao) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.appType = appType;
        this.userStore = userStore;
        this.accountProvider = accountProvider;
        this.brokeback = brokeback;
        this.okHttpClient = okHttpClient;
        this.authTokenManager = authTokenManager;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public DocumentStore get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        DocumentsBrokebackApi documentsBrokebackApi = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(documentsBrokebackApi, "get(...)");
        OkHttpClient okHttpClient = this.okHttpClient.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClient, "get(...)");
        AuthTokenManager authTokenManager = this.authTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(authTokenManager, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        DocumentDao documentDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(documentDao, "get(...)");
        return companion.newInstance(appType, userStore, accountProvider, documentsBrokebackApi, okHttpClient, authTokenManager, storeBundle, documentDao);
    }

    /* compiled from: DocumentStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DocumentStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/DocumentStore_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/android/documents/models/DocumentsBrokebackApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/DocumentDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DocumentStore_Factory create(Provider<AppType> appType, Provider<UserStore> userStore, Provider<AccountProvider> accountProvider, Provider<DocumentsBrokebackApi> brokeback, Provider<OkHttpClient> okHttpClient, Provider<AuthTokenManager> authTokenManager, Provider<StoreBundle> storeBundle, Provider<DocumentDao> dao) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new DocumentStore_Factory(appType, userStore, accountProvider, brokeback, okHttpClient, authTokenManager, storeBundle, dao);
        }

        @JvmStatic
        public final DocumentStore newInstance(AppType appType, UserStore userStore, AccountProvider accountProvider, DocumentsBrokebackApi brokeback, OkHttpClient okHttpClient, AuthTokenManager authTokenManager, StoreBundle storeBundle, DocumentDao dao) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new DocumentStore(appType, userStore, accountProvider, brokeback, okHttpClient, authTokenManager, storeBundle, dao);
        }
    }
}
