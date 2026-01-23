package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringBrokebackApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.recurring.models.dao.DripSettingsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DripSettingsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripSettingsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/android/api/recurring/retrofit/RecurringBrokebackApi;", "hasShownDripHistoryUpsellPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/DripSettingsDao;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DripSettingsStore_Factory implements Factory<DripSettingsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<RecurringBrokebackApi> brokeback;
    private final Provider<DripSettingsDao> dao;
    private final Provider<StringToBooleanMapPreference> hasShownDripHistoryUpsellPref;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final DripSettingsStore_Factory create(Provider<AccountProvider> provider, Provider<RecurringBrokebackApi> provider2, Provider<StringToBooleanMapPreference> provider3, Provider<StoreBundle> provider4, Provider<DripSettingsDao> provider5, Provider<AccountAccessStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final DripSettingsStore newInstance(AccountProvider accountProvider, RecurringBrokebackApi recurringBrokebackApi, StringToBooleanMapPreference stringToBooleanMapPreference, StoreBundle storeBundle, DripSettingsDao dripSettingsDao, AccountAccessStore accountAccessStore) {
        return INSTANCE.newInstance(accountProvider, recurringBrokebackApi, stringToBooleanMapPreference, storeBundle, dripSettingsDao, accountAccessStore);
    }

    public DripSettingsStore_Factory(Provider<AccountProvider> accountProvider, Provider<RecurringBrokebackApi> brokeback, Provider<StringToBooleanMapPreference> hasShownDripHistoryUpsellPref, Provider<StoreBundle> storeBundle, Provider<DripSettingsDao> dao, Provider<AccountAccessStore> accountAccessStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(hasShownDripHistoryUpsellPref, "hasShownDripHistoryUpsellPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        this.accountProvider = accountProvider;
        this.brokeback = brokeback;
        this.hasShownDripHistoryUpsellPref = hasShownDripHistoryUpsellPref;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.accountAccessStore = accountAccessStore;
    }

    @Override // javax.inject.Provider
    public DripSettingsStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RecurringBrokebackApi recurringBrokebackApi = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(recurringBrokebackApi, "get(...)");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.hasShownDripHistoryUpsellPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        DripSettingsDao dripSettingsDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(dripSettingsDao, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        return companion.newInstance(accountProvider, recurringBrokebackApi, stringToBooleanMapPreference, storeBundle, dripSettingsDao, accountAccessStore);
    }

    /* compiled from: DripSettingsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DripSettingsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/DripSettingsStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokeback", "Lcom/robinhood/android/api/recurring/retrofit/RecurringBrokebackApi;", "hasShownDripHistoryUpsellPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/DripSettingsDao;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DripSettingsStore_Factory create(Provider<AccountProvider> accountProvider, Provider<RecurringBrokebackApi> brokeback, Provider<StringToBooleanMapPreference> hasShownDripHistoryUpsellPref, Provider<StoreBundle> storeBundle, Provider<DripSettingsDao> dao, Provider<AccountAccessStore> accountAccessStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(hasShownDripHistoryUpsellPref, "hasShownDripHistoryUpsellPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            return new DripSettingsStore_Factory(accountProvider, brokeback, hasShownDripHistoryUpsellPref, storeBundle, dao, accountAccessStore);
        }

        @JvmStatic
        public final DripSettingsStore newInstance(AccountProvider accountProvider, RecurringBrokebackApi brokeback, StringToBooleanMapPreference hasShownDripHistoryUpsellPref, StoreBundle storeBundle, DripSettingsDao dao, AccountAccessStore accountAccessStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(hasShownDripHistoryUpsellPref, "hasShownDripHistoryUpsellPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            return new DripSettingsStore(accountProvider, brokeback, hasShownDripHistoryUpsellPref, storeBundle, dao, accountAccessStore);
        }
    }
}
