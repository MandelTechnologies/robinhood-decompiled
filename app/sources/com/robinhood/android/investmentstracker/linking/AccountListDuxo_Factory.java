package com.robinhood.android.investmentstracker.linking;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.achrelationship.IavStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo;", "packageName", "Ljavax/inject/Provider;", "", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AccountListDuxo_Factory implements Factory<AccountListDuxo> {
    private final Provider<IavStore> achRelationshipStore;
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> iavStore;
    private final Provider<String> packageName;
    private final Provider<PlaidConnectApi> plaidConnectApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountListDuxo_Factory create(Provider<String> provider, Provider<BffMoneyMovementService> provider2, Provider<PlaidConnectApi> provider3, Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> provider4, Provider<IavStore> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final AccountListDuxo newInstance(String str, BffMoneyMovementService bffMoneyMovementService, PlaidConnectApi plaidConnectApi, com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore, IavStore iavStore2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(str, bffMoneyMovementService, plaidConnectApi, iavStore, iavStore2, duxoBundle);
    }

    public AccountListDuxo_Factory(Provider<String> packageName, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<PlaidConnectApi> plaidConnectApi, Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> iavStore, Provider<IavStore> achRelationshipStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(iavStore, "iavStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.packageName = packageName;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.plaidConnectApi = plaidConnectApi;
        this.iavStore = iavStore;
        this.achRelationshipStore = achRelationshipStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AccountListDuxo get() {
        Companion companion = INSTANCE;
        String str = this.packageName.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        PlaidConnectApi plaidConnectApi = this.plaidConnectApi.get();
        Intrinsics.checkNotNullExpressionValue(plaidConnectApi, "get(...)");
        com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore = this.iavStore.get();
        Intrinsics.checkNotNullExpressionValue(iavStore, "get(...)");
        IavStore iavStore2 = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(iavStore2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(str, bffMoneyMovementService, plaidConnectApi, iavStore, iavStore2, duxoBundle);
    }

    /* compiled from: AccountListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo_Factory;", "packageName", "Ljavax/inject/Provider;", "", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/investmentstracker/linking/AccountListDuxo;", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountListDuxo_Factory create(Provider<String> packageName, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<PlaidConnectApi> plaidConnectApi, Provider<com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore> iavStore, Provider<IavStore> achRelationshipStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(iavStore, "iavStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountListDuxo_Factory(packageName, bffMoneyMovementService, plaidConnectApi, iavStore, achRelationshipStore, duxoBundle);
        }

        @JvmStatic
        public final AccountListDuxo newInstance(String packageName, BffMoneyMovementService bffMoneyMovementService, PlaidConnectApi plaidConnectApi, com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore, IavStore achRelationshipStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
            Intrinsics.checkNotNullParameter(iavStore, "iavStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountListDuxo(packageName, bffMoneyMovementService, plaidConnectApi, iavStore, achRelationshipStore, duxoBundle);
        }
    }
}
