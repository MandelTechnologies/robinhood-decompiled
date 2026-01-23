package com.robinhood.android.matcha.p177ui.history.pending;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
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

/* compiled from: MatchaPendingTransactionsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo;", "matchaPendingTransactionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "transferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaPendingTransactionsDuxo_Factory implements Factory<MatchaPendingTransactionsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaTransferStore> transferStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaPendingTransactionsDuxo_Factory create(Provider<MatchaPendingTransactionStore> provider, Provider<MatchaTransferStore> provider2, Provider<SavedStateHandle> provider3, Provider<DispatcherProvider> provider4, Provider<RxFactory> provider5, Provider<RxGlobalErrorHandler> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MatchaPendingTransactionsDuxo newInstance(MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore matchaTransferStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(matchaPendingTransactionStore, matchaTransferStore, savedStateHandle);
    }

    public MatchaPendingTransactionsDuxo_Factory(Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore, Provider<MatchaTransferStore> transferStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
        Intrinsics.checkNotNullParameter(transferStore, "transferStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.matchaPendingTransactionStore = matchaPendingTransactionStore;
        this.transferStore = transferStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public MatchaPendingTransactionsDuxo get() {
        Companion companion = INSTANCE;
        MatchaPendingTransactionStore matchaPendingTransactionStore = this.matchaPendingTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaPendingTransactionStore, "get(...)");
        MatchaTransferStore matchaTransferStore = this.transferStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxoNewInstance = companion.newInstance(matchaPendingTransactionStore, matchaTransferStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(matchaPendingTransactionsDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(matchaPendingTransactionsDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(matchaPendingTransactionsDuxoNewInstance, rxGlobalErrorHandler);
        return matchaPendingTransactionsDuxoNewInstance;
    }

    /* compiled from: MatchaPendingTransactionsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo_Factory;", "matchaPendingTransactionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "transferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaPendingTransactionsDuxo_Factory create(Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore, Provider<MatchaTransferStore> transferStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
            Intrinsics.checkNotNullParameter(transferStore, "transferStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new MatchaPendingTransactionsDuxo_Factory(matchaPendingTransactionStore, transferStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final MatchaPendingTransactionsDuxo newInstance(MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTransferStore transferStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
            Intrinsics.checkNotNullParameter(transferStore, "transferStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MatchaPendingTransactionsDuxo(matchaPendingTransactionStore, transferStore, savedStateHandle);
        }
    }
}
