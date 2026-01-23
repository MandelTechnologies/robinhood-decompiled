package com.robinhood.store.achrelationship;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.retrofit.Ach;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrodepositsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/MicrodepositsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/achrelationship/MicrodepositsStore;", "hasQueuedDepositPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "ach", "Lcom/robinhood/api/retrofit/Ach;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MicrodepositsStore_Factory implements Factory<MicrodepositsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Ach> ach;
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<Cashier> cashier;
    private final Provider<StringPreference> defaultAchRelationshipPref;
    private final Provider<BooleanPreference> hasQueuedDepositPref;
    private final Provider<StringToLongMapPreference> paymentMethodLastUsagesPref;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final MicrodepositsStore_Factory create(Provider<BooleanPreference> provider, Provider<StringPreference> provider2, Provider<StringToLongMapPreference> provider3, Provider<Ach> provider4, Provider<Cashier> provider5, Provider<AccountProvider> provider6, Provider<AchRelationshipStore> provider7, Provider<UserStore> provider8, Provider<StoreBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final MicrodepositsStore newInstance(BooleanPreference booleanPreference, StringPreference stringPreference, StringToLongMapPreference stringToLongMapPreference, Ach ach, Cashier cashier, AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, UserStore userStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(booleanPreference, stringPreference, stringToLongMapPreference, ach, cashier, accountProvider, achRelationshipStore, userStore, storeBundle);
    }

    public MicrodepositsStore_Factory(Provider<BooleanPreference> hasQueuedDepositPref, Provider<StringPreference> defaultAchRelationshipPref, Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<Ach> ach, Provider<Cashier> cashier, Provider<AccountProvider> accountProvider, Provider<AchRelationshipStore> achRelationshipStore, Provider<UserStore> userStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(ach, "ach");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.hasQueuedDepositPref = hasQueuedDepositPref;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.ach = ach;
        this.cashier = cashier;
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.userStore = userStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public MicrodepositsStore get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.hasQueuedDepositPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringPreference stringPreference = this.defaultAchRelationshipPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        Ach ach = this.ach.get();
        Intrinsics.checkNotNullExpressionValue(ach, "get(...)");
        Cashier cashier = this.cashier.get();
        Intrinsics.checkNotNullExpressionValue(cashier, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(booleanPreference, stringPreference, stringToLongMapPreference, ach, cashier, accountProvider, achRelationshipStore, userStore, storeBundle);
    }

    /* compiled from: MicrodepositsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/MicrodepositsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/achrelationship/MicrodepositsStore_Factory;", "hasQueuedDepositPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "ach", "Lcom/robinhood/api/retrofit/Ach;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/achrelationship/MicrodepositsStore;", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MicrodepositsStore_Factory create(Provider<BooleanPreference> hasQueuedDepositPref, Provider<StringPreference> defaultAchRelationshipPref, Provider<StringToLongMapPreference> paymentMethodLastUsagesPref, Provider<Ach> ach, Provider<Cashier> cashier, Provider<AccountProvider> accountProvider, Provider<AchRelationshipStore> achRelationshipStore, Provider<UserStore> userStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
            Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(ach, "ach");
            Intrinsics.checkNotNullParameter(cashier, "cashier");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MicrodepositsStore_Factory(hasQueuedDepositPref, defaultAchRelationshipPref, paymentMethodLastUsagesPref, ach, cashier, accountProvider, achRelationshipStore, userStore, storeBundle);
        }

        @JvmStatic
        public final MicrodepositsStore newInstance(BooleanPreference hasQueuedDepositPref, StringPreference defaultAchRelationshipPref, StringToLongMapPreference paymentMethodLastUsagesPref, Ach ach, Cashier cashier, AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, UserStore userStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
            Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            Intrinsics.checkNotNullParameter(ach, "ach");
            Intrinsics.checkNotNullParameter(cashier, "cashier");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new MicrodepositsStore(hasQueuedDepositPref, defaultAchRelationshipPref, paymentMethodLastUsagesPref, ach, cashier, accountProvider, achRelationshipStore, userStore, storeBundle);
        }
    }
}
