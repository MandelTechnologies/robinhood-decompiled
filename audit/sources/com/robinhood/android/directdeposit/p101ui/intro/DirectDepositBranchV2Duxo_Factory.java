package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositBranchV2Duxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Duxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Duxo;", "accountRoutingDetailsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DirectDepositBranchV2Duxo_Factory implements Factory<DirectDepositBranchV2Duxo> {
    private final Provider<AccountRoutingDetailsStore> accountRoutingDetailsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<DirectDepositBranchV2StateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DirectDepositBranchV2Duxo_Factory create(Provider<AccountRoutingDetailsStore> provider, Provider<MinervaAccountStore> provider2, Provider<UserStore> provider3, Provider<DirectDepositBranchV2StateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final DirectDepositBranchV2Duxo newInstance(AccountRoutingDetailsStore accountRoutingDetailsStore, MinervaAccountStore minervaAccountStore, UserStore userStore, DirectDepositBranchV2StateProvider directDepositBranchV2StateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountRoutingDetailsStore, minervaAccountStore, userStore, directDepositBranchV2StateProvider, duxoBundle);
    }

    public DirectDepositBranchV2Duxo_Factory(Provider<AccountRoutingDetailsStore> accountRoutingDetailsStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<UserStore> userStore, Provider<DirectDepositBranchV2StateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.minervaAccountStore = minervaAccountStore;
        this.userStore = userStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DirectDepositBranchV2Duxo get() {
        Companion companion = INSTANCE;
        AccountRoutingDetailsStore accountRoutingDetailsStore = this.accountRoutingDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(accountRoutingDetailsStore, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        DirectDepositBranchV2StateProvider directDepositBranchV2StateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(directDepositBranchV2StateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountRoutingDetailsStore, minervaAccountStore, userStore, directDepositBranchV2StateProvider, duxoBundle);
    }

    /* compiled from: DirectDepositBranchV2Duxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Duxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Duxo_Factory;", "accountRoutingDetailsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Duxo;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DirectDepositBranchV2Duxo_Factory create(Provider<AccountRoutingDetailsStore> accountRoutingDetailsStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<UserStore> userStore, Provider<DirectDepositBranchV2StateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DirectDepositBranchV2Duxo_Factory(accountRoutingDetailsStore, minervaAccountStore, userStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final DirectDepositBranchV2Duxo newInstance(AccountRoutingDetailsStore accountRoutingDetailsStore, MinervaAccountStore minervaAccountStore, UserStore userStore, DirectDepositBranchV2StateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DirectDepositBranchV2Duxo(accountRoutingDetailsStore, minervaAccountStore, userStore, stateProvider, duxoBundle);
        }
    }
}
