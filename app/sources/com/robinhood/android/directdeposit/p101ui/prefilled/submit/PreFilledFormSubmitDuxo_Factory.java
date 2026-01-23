package com.robinhood.android.directdeposit.p101ui.prefilled.submit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormSubmitDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo;", "minervaAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PreFilledFormSubmitDuxo_Factory implements Factory<PreFilledFormSubmitDuxo> {
    private final Provider<AccountRoutingDetailsStore> accountRoutingDetailsStore;
    private final Provider<RhyBonfireApi> bonfireApi;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PreFilledFormSubmitDuxo_Factory create(Provider<MinervaAccountStore> provider, Provider<RhyBonfireApi> provider2, Provider<UserStore> provider3, Provider<AccountRoutingDetailsStore> provider4, Provider<SavedStateHandle> provider5, Provider<DispatcherProvider> provider6, Provider<RxFactory> provider7, Provider<RxGlobalErrorHandler> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final PreFilledFormSubmitDuxo newInstance(MinervaAccountStore minervaAccountStore, RhyBonfireApi rhyBonfireApi, UserStore userStore, AccountRoutingDetailsStore accountRoutingDetailsStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(minervaAccountStore, rhyBonfireApi, userStore, accountRoutingDetailsStore, savedStateHandle);
    }

    public PreFilledFormSubmitDuxo_Factory(Provider<MinervaAccountStore> minervaAccountStore, Provider<RhyBonfireApi> bonfireApi, Provider<UserStore> userStore, Provider<AccountRoutingDetailsStore> accountRoutingDetailsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.minervaAccountStore = minervaAccountStore;
        this.bonfireApi = bonfireApi;
        this.userStore = userStore;
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public PreFilledFormSubmitDuxo get() {
        Companion companion = INSTANCE;
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        RhyBonfireApi rhyBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyBonfireApi, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AccountRoutingDetailsStore accountRoutingDetailsStore = this.accountRoutingDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(accountRoutingDetailsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        PreFilledFormSubmitDuxo preFilledFormSubmitDuxoNewInstance = companion.newInstance(minervaAccountStore, rhyBonfireApi, userStore, accountRoutingDetailsStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(preFilledFormSubmitDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(preFilledFormSubmitDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(preFilledFormSubmitDuxoNewInstance, rxGlobalErrorHandler);
        return preFilledFormSubmitDuxoNewInstance;
    }

    /* compiled from: PreFilledFormSubmitDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo_Factory;", "minervaAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PreFilledFormSubmitDuxo_Factory create(Provider<MinervaAccountStore> minervaAccountStore, Provider<RhyBonfireApi> bonfireApi, Provider<UserStore> userStore, Provider<AccountRoutingDetailsStore> accountRoutingDetailsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new PreFilledFormSubmitDuxo_Factory(minervaAccountStore, bonfireApi, userStore, accountRoutingDetailsStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final PreFilledFormSubmitDuxo newInstance(MinervaAccountStore minervaAccountStore, RhyBonfireApi bonfireApi, UserStore userStore, AccountRoutingDetailsStore accountRoutingDetailsStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PreFilledFormSubmitDuxo(minervaAccountStore, bonfireApi, userStore, accountRoutingDetailsStore, savedStateHandle);
        }
    }
}
