package com.robinhood.android.matcha.p177ui.history.detail.request;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.android.store.matcha.MatchaRequestStore;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaRequestDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo;", "matchaRequestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaRequestStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaRequestDetailDuxo_Factory implements Factory<MatchaRequestDetailDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<MatchaRequestStore> matchaRequestStore;
    private final Provider<MatchaTransferStore> matchaTransferStore;
    private final Provider<MatchaPendingTransactionStore> pendingTransactionStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaRequestDetailDuxo_Factory create(Provider<MatchaRequestStore> provider, Provider<MatchaTransferStore> provider2, Provider<MatchaPendingTransactionStore> provider3, Provider<SavedStateHandle> provider4, Provider<DispatcherProvider> provider5, Provider<RxFactory> provider6, Provider<RxGlobalErrorHandler> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final MatchaRequestDetailDuxo newInstance(MatchaRequestStore matchaRequestStore, MatchaTransferStore matchaTransferStore, MatchaPendingTransactionStore matchaPendingTransactionStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(matchaRequestStore, matchaTransferStore, matchaPendingTransactionStore, savedStateHandle);
    }

    public MatchaRequestDetailDuxo_Factory(Provider<MatchaRequestStore> matchaRequestStore, Provider<MatchaTransferStore> matchaTransferStore, Provider<MatchaPendingTransactionStore> pendingTransactionStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(matchaRequestStore, "matchaRequestStore");
        Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
        Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.matchaRequestStore = matchaRequestStore;
        this.matchaTransferStore = matchaTransferStore;
        this.pendingTransactionStore = pendingTransactionStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public MatchaRequestDetailDuxo get() {
        Companion companion = INSTANCE;
        MatchaRequestStore matchaRequestStore = this.matchaRequestStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaRequestStore, "get(...)");
        MatchaTransferStore matchaTransferStore = this.matchaTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferStore, "get(...)");
        MatchaPendingTransactionStore matchaPendingTransactionStore = this.pendingTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaPendingTransactionStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MatchaRequestDetailDuxo matchaRequestDetailDuxoNewInstance = companion.newInstance(matchaRequestStore, matchaTransferStore, matchaPendingTransactionStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(matchaRequestDetailDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(matchaRequestDetailDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(matchaRequestDetailDuxoNewInstance, rxGlobalErrorHandler);
        return matchaRequestDetailDuxoNewInstance;
    }

    /* compiled from: MatchaRequestDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo_Factory;", "matchaRequestStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaRequestStore;", "matchaTransferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "pendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/matcha/ui/history/detail/request/MatchaRequestDetailDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaRequestDetailDuxo_Factory create(Provider<MatchaRequestStore> matchaRequestStore, Provider<MatchaTransferStore> matchaTransferStore, Provider<MatchaPendingTransactionStore> pendingTransactionStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(matchaRequestStore, "matchaRequestStore");
            Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
            Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new MatchaRequestDetailDuxo_Factory(matchaRequestStore, matchaTransferStore, pendingTransactionStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final MatchaRequestDetailDuxo newInstance(MatchaRequestStore matchaRequestStore, MatchaTransferStore matchaTransferStore, MatchaPendingTransactionStore pendingTransactionStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaRequestStore, "matchaRequestStore");
            Intrinsics.checkNotNullParameter(matchaTransferStore, "matchaTransferStore");
            Intrinsics.checkNotNullParameter(pendingTransactionStore, "pendingTransactionStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaRequestDetailDuxo(matchaRequestStore, matchaTransferStore, pendingTransactionStore, savedStateHandle);
        }
    }
}
