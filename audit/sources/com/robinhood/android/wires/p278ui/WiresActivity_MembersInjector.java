package com.robinhood.android.wires.p278ui;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WiresActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/wires/ui/WiresActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WiresActivity_MembersInjector implements MembersInjector<WiresActivity> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TransferWireAccountStore> transferWireAccountStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<WiresActivity> create(Provider<BaseActivitySingletons> provider, Provider<ExperimentsStore> provider2, Provider<TransferWireAccountStore> provider3, Provider<AccountProvider> provider4, Provider<TransfersBonfireApi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAccountProvider(WiresActivity wiresActivity, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(wiresActivity, accountProvider);
    }

    @JvmStatic
    public static final void injectExperimentsStore(WiresActivity wiresActivity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(wiresActivity, experimentsStore);
    }

    @JvmStatic
    public static final void injectTransferWireAccountStore(WiresActivity wiresActivity, TransferWireAccountStore transferWireAccountStore) {
        INSTANCE.injectTransferWireAccountStore(wiresActivity, transferWireAccountStore);
    }

    @JvmStatic
    public static final void injectTransfersBonfireApi(WiresActivity wiresActivity, TransfersBonfireApi transfersBonfireApi) {
        INSTANCE.injectTransfersBonfireApi(wiresActivity, transfersBonfireApi);
    }

    public WiresActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<TransferWireAccountStore> transferWireAccountStore, Provider<AccountProvider> accountProvider, Provider<TransfersBonfireApi> transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        this.singletons = singletons;
        this.experimentsStore = experimentsStore;
        this.transferWireAccountStore = transferWireAccountStore;
        this.accountProvider = accountProvider;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WiresActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        TransferWireAccountStore transferWireAccountStore = this.transferWireAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferWireAccountStore, "get(...)");
        companion2.injectTransferWireAccountStore(instance, transferWireAccountStore);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        companion2.injectTransfersBonfireApi(instance, transfersBonfireApi);
    }

    /* compiled from: WiresActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/wires/ui/WiresActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "injectExperimentsStore", "", "instance", "injectTransferWireAccountStore", "injectAccountProvider", "injectTransfersBonfireApi", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<WiresActivity> create(Provider<BaseActivitySingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<TransferWireAccountStore> transferWireAccountStore, Provider<AccountProvider> accountProvider, Provider<TransfersBonfireApi> transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            return new WiresActivity_MembersInjector(singletons, experimentsStore, transferWireAccountStore, accountProvider, transfersBonfireApi);
        }

        @JvmStatic
        public final void injectExperimentsStore(WiresActivity instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectTransferWireAccountStore(WiresActivity instance, TransferWireAccountStore transferWireAccountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
            instance.setTransferWireAccountStore(transferWireAccountStore);
        }

        @JvmStatic
        public final void injectAccountProvider(WiresActivity instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectTransfersBonfireApi(WiresActivity instance, TransfersBonfireApi transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            instance.setTransfersBonfireApi(transfersBonfireApi);
        }
    }
}
