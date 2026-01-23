package com.robinhood.android.store.accountactivityexporter;

import com.robinhood.android.api.accountactivityexporter.AccountActivityExporterApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountActivityExporterStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "accountActivityExporterApi", "Lcom/robinhood/android/api/accountactivityexporter/AccountActivityExporterApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AccountActivityExporterStore_Factory implements Factory<AccountActivityExporterStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountActivityExporterApi> accountActivityExporterApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AccountActivityExporterStore_Factory create(Provider<StoreBundle> provider, Provider<AccountActivityExporterApi> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final AccountActivityExporterStore newInstance(StoreBundle storeBundle, AccountActivityExporterApi accountActivityExporterApi) {
        return INSTANCE.newInstance(storeBundle, accountActivityExporterApi);
    }

    public AccountActivityExporterStore_Factory(Provider<StoreBundle> storeBundle, Provider<AccountActivityExporterApi> accountActivityExporterApi) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountActivityExporterApi, "accountActivityExporterApi");
        this.storeBundle = storeBundle;
        this.accountActivityExporterApi = accountActivityExporterApi;
    }

    @Override // javax.inject.Provider
    public AccountActivityExporterStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AccountActivityExporterApi accountActivityExporterApi = this.accountActivityExporterApi.get();
        Intrinsics.checkNotNullExpressionValue(accountActivityExporterApi, "get(...)");
        return companion.newInstance(storeBundle, accountActivityExporterApi);
    }

    /* compiled from: AccountActivityExporterStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "accountActivityExporterApi", "Lcom/robinhood/android/api/accountactivityexporter/AccountActivityExporterApi;", "newInstance", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "lib-store-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountActivityExporterStore_Factory create(Provider<StoreBundle> storeBundle, Provider<AccountActivityExporterApi> accountActivityExporterApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(accountActivityExporterApi, "accountActivityExporterApi");
            return new AccountActivityExporterStore_Factory(storeBundle, accountActivityExporterApi);
        }

        @JvmStatic
        public final AccountActivityExporterStore newInstance(StoreBundle storeBundle, AccountActivityExporterApi accountActivityExporterApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(accountActivityExporterApi, "accountActivityExporterApi");
            return new AccountActivityExporterStore(storeBundle, accountActivityExporterApi);
        }
    }
}
