package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountCenterStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.store.achrelationship.IavStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo;", "bffMoneyMovementService", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "onboardingSeen", "Lcom/robinhood/prefs/BooleanPreference;", "upsellCardClosed", "accountCenterStore", "Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "packageName", "", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestmentsTrackerDuxo_Factory implements Factory<InvestmentsTrackerDuxo> {
    private final Provider<AccountCenterStore> accountCenterStore;
    private final Provider<IntPreference> accountTabCurrencyPref;
    private final Provider<IavStore> achRelationshipStore;
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> iavStore;
    private final Provider<BooleanPreference> onboardingSeen;
    private final Provider<String> packageName;
    private final Provider<PlaidConnectApi> plaidConnectApi;
    private final Provider<BooleanPreference> upsellCardClosed;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestmentsTrackerDuxo_Factory create(Provider<BffMoneyMovementService> provider, Provider<IntPreference> provider2, Provider<BooleanPreference> provider3, Provider<BooleanPreference> provider4, Provider<AccountCenterStore> provider5, Provider<DuxoBundle> provider6, Provider<String> provider7, Provider<PlaidConnectApi> provider8, Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> provider9, Provider<IavStore> provider10, Provider<ExperimentsStore> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final InvestmentsTrackerDuxo newInstance(BffMoneyMovementService bffMoneyMovementService, IntPreference intPreference, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, AccountCenterStore accountCenterStore, DuxoBundle duxoBundle, String str, PlaidConnectApi plaidConnectApi, com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore, IavStore iavStore2, ExperimentsStore experimentsStore) {
        return INSTANCE.newInstance(bffMoneyMovementService, intPreference, booleanPreference, booleanPreference2, accountCenterStore, duxoBundle, str, plaidConnectApi, iavStore, iavStore2, experimentsStore);
    }

    public InvestmentsTrackerDuxo_Factory(Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<IntPreference> accountTabCurrencyPref, Provider<BooleanPreference> onboardingSeen, Provider<BooleanPreference> upsellCardClosed, Provider<AccountCenterStore> accountCenterStore, Provider<DuxoBundle> duxoBundle, Provider<String> packageName, Provider<PlaidConnectApi> plaidConnectApi, Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> iavStore, Provider<IavStore> achRelationshipStore, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
        Intrinsics.checkNotNullParameter(onboardingSeen, "onboardingSeen");
        Intrinsics.checkNotNullParameter(upsellCardClosed, "upsellCardClosed");
        Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(iavStore, "iavStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.accountTabCurrencyPref = accountTabCurrencyPref;
        this.onboardingSeen = onboardingSeen;
        this.upsellCardClosed = upsellCardClosed;
        this.accountCenterStore = accountCenterStore;
        this.duxoBundle = duxoBundle;
        this.packageName = packageName;
        this.plaidConnectApi = plaidConnectApi;
        this.iavStore = iavStore;
        this.achRelationshipStore = achRelationshipStore;
        this.experimentsStore = experimentsStore;
    }

    @Override // javax.inject.Provider
    public InvestmentsTrackerDuxo get() {
        Companion companion = INSTANCE;
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        IntPreference intPreference = this.accountTabCurrencyPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        BooleanPreference booleanPreference = this.onboardingSeen.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.upsellCardClosed.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        AccountCenterStore accountCenterStore = this.accountCenterStore.get();
        Intrinsics.checkNotNullExpressionValue(accountCenterStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        String str = this.packageName.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        PlaidConnectApi plaidConnectApi = this.plaidConnectApi.get();
        Intrinsics.checkNotNullExpressionValue(plaidConnectApi, "get(...)");
        com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore = this.iavStore.get();
        Intrinsics.checkNotNullExpressionValue(iavStore, "get(...)");
        IavStore iavStore2 = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(iavStore2, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return companion.newInstance(bffMoneyMovementService, intPreference, booleanPreference, booleanPreference2, accountCenterStore, duxoBundle, str, plaidConnectApi, iavStore, iavStore2, experimentsStore);
    }

    /* compiled from: InvestmentsTrackerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007H\u0007J`\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo_Factory;", "bffMoneyMovementService", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "onboardingSeen", "Lcom/robinhood/prefs/BooleanPreference;", "upsellCardClosed", "accountCenterStore", "Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "packageName", "", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "newInstance", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo;", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentsTrackerDuxo_Factory create(Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<IntPreference> accountTabCurrencyPref, Provider<BooleanPreference> onboardingSeen, Provider<BooleanPreference> upsellCardClosed, Provider<AccountCenterStore> accountCenterStore, Provider<DuxoBundle> duxoBundle, Provider<String> packageName, Provider<PlaidConnectApi> plaidConnectApi, Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> iavStore, Provider<IavStore> achRelationshipStore, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
            Intrinsics.checkNotNullParameter(onboardingSeen, "onboardingSeen");
            Intrinsics.checkNotNullParameter(upsellCardClosed, "upsellCardClosed");
            Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(iavStore, "iavStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new InvestmentsTrackerDuxo_Factory(bffMoneyMovementService, accountTabCurrencyPref, onboardingSeen, upsellCardClosed, accountCenterStore, duxoBundle, packageName, plaidConnectApi, iavStore, achRelationshipStore, experimentsStore);
        }

        @JvmStatic
        public final InvestmentsTrackerDuxo newInstance(BffMoneyMovementService bffMoneyMovementService, IntPreference accountTabCurrencyPref, BooleanPreference onboardingSeen, BooleanPreference upsellCardClosed, AccountCenterStore accountCenterStore, DuxoBundle duxoBundle, String packageName, PlaidConnectApi plaidConnectApi, com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore, IavStore achRelationshipStore, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
            Intrinsics.checkNotNullParameter(onboardingSeen, "onboardingSeen");
            Intrinsics.checkNotNullParameter(upsellCardClosed, "upsellCardClosed");
            Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(iavStore, "iavStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new InvestmentsTrackerDuxo(bffMoneyMovementService, accountTabCurrencyPref, onboardingSeen, upsellCardClosed, accountCenterStore, duxoBundle, packageName, plaidConnectApi, iavStore, achRelationshipStore, experimentsStore);
        }
    }
}
