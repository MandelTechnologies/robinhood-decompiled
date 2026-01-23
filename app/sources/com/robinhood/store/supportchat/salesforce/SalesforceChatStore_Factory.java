package com.robinhood.store.supportchat.salesforce;

import android.content.Context;
import com.robinhood.android.api.supportchat.SalesforceChatTokenManager;
import com.robinhood.android.api.supportchat.SalesforceChatTokenRefresher;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.chat.common.InFlightMessageStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SalesforceChatStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "coreClientFactory", "Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;", "tokenRefresher", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenRefresher;", "tokenManager", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "inFlightMessageStore", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "appContext", "Landroid/content/Context;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SalesforceChatStore_Factory implements Factory<SalesforceChatStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> appContext;
    private final Provider<AuthManager> authManager;
    private final Provider<BitmapStore> bitmapStore;
    private final Provider<SalesforceCoreClientFactory> coreClientFactory;
    private final Provider<InFlightMessageStore> inFlightMessageStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<SalesforceChatTokenManager> tokenManager;
    private final Provider<SalesforceChatTokenRefresher> tokenRefresher;

    @JvmStatic
    public static final SalesforceChatStore_Factory create(Provider<StoreBundle> provider, Provider<SalesforceCoreClientFactory> provider2, Provider<SalesforceChatTokenRefresher> provider3, Provider<SalesforceChatTokenManager> provider4, Provider<AuthManager> provider5, Provider<InFlightMessageStore> provider6, Provider<BitmapStore> provider7, Provider<Context> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final SalesforceChatStore newInstance(StoreBundle storeBundle, SalesforceCoreClientFactory salesforceCoreClientFactory, SalesforceChatTokenRefresher salesforceChatTokenRefresher, SalesforceChatTokenManager salesforceChatTokenManager, AuthManager authManager, InFlightMessageStore inFlightMessageStore, BitmapStore bitmapStore, Context context) {
        return INSTANCE.newInstance(storeBundle, salesforceCoreClientFactory, salesforceChatTokenRefresher, salesforceChatTokenManager, authManager, inFlightMessageStore, bitmapStore, context);
    }

    public SalesforceChatStore_Factory(Provider<StoreBundle> storeBundle, Provider<SalesforceCoreClientFactory> coreClientFactory, Provider<SalesforceChatTokenRefresher> tokenRefresher, Provider<SalesforceChatTokenManager> tokenManager, Provider<AuthManager> authManager, Provider<InFlightMessageStore> inFlightMessageStore, Provider<BitmapStore> bitmapStore, Provider<Context> appContext) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(coreClientFactory, "coreClientFactory");
        Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
        Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.storeBundle = storeBundle;
        this.coreClientFactory = coreClientFactory;
        this.tokenRefresher = tokenRefresher;
        this.tokenManager = tokenManager;
        this.authManager = authManager;
        this.inFlightMessageStore = inFlightMessageStore;
        this.bitmapStore = bitmapStore;
        this.appContext = appContext;
    }

    @Override // javax.inject.Provider
    public SalesforceChatStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        SalesforceCoreClientFactory salesforceCoreClientFactory = this.coreClientFactory.get();
        Intrinsics.checkNotNullExpressionValue(salesforceCoreClientFactory, "get(...)");
        SalesforceChatTokenRefresher salesforceChatTokenRefresher = this.tokenRefresher.get();
        Intrinsics.checkNotNullExpressionValue(salesforceChatTokenRefresher, "get(...)");
        SalesforceChatTokenManager salesforceChatTokenManager = this.tokenManager.get();
        Intrinsics.checkNotNullExpressionValue(salesforceChatTokenManager, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore.get();
        Intrinsics.checkNotNullExpressionValue(inFlightMessageStore, "get(...)");
        BitmapStore bitmapStore = this.bitmapStore.get();
        Intrinsics.checkNotNullExpressionValue(bitmapStore, "get(...)");
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        return companion.newInstance(storeBundle, salesforceCoreClientFactory, salesforceChatTokenRefresher, salesforceChatTokenManager, authManager, inFlightMessageStore, bitmapStore, context);
    }

    /* compiled from: SalesforceChatStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "coreClientFactory", "Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;", "tokenRefresher", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenRefresher;", "tokenManager", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "inFlightMessageStore", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "appContext", "Landroid/content/Context;", "newInstance", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SalesforceChatStore_Factory create(Provider<StoreBundle> storeBundle, Provider<SalesforceCoreClientFactory> coreClientFactory, Provider<SalesforceChatTokenRefresher> tokenRefresher, Provider<SalesforceChatTokenManager> tokenManager, Provider<AuthManager> authManager, Provider<InFlightMessageStore> inFlightMessageStore, Provider<BitmapStore> bitmapStore, Provider<Context> appContext) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(coreClientFactory, "coreClientFactory");
            Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
            Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return new SalesforceChatStore_Factory(storeBundle, coreClientFactory, tokenRefresher, tokenManager, authManager, inFlightMessageStore, bitmapStore, appContext);
        }

        @JvmStatic
        public final SalesforceChatStore newInstance(StoreBundle storeBundle, SalesforceCoreClientFactory coreClientFactory, SalesforceChatTokenRefresher tokenRefresher, SalesforceChatTokenManager tokenManager, AuthManager authManager, InFlightMessageStore inFlightMessageStore, BitmapStore bitmapStore, Context appContext) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(coreClientFactory, "coreClientFactory");
            Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
            Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
            Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            return new SalesforceChatStore(storeBundle, coreClientFactory, tokenRefresher, tokenManager, authManager, inFlightMessageStore, bitmapStore, appContext);
        }
    }
}
