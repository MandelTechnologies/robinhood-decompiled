package com.robinhood.android.lists.p173ui.userlist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListUserListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo;", "eligibleItemsFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CuratedListUserListDuxo_Factory implements Factory<CuratedListUserListDuxo> {
    private final Provider<BuySellStore> buySellStore;
    private final Provider<CryptoHistoricalStore> cryptoHistoricalStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<CuratedListEligibleItemsFetcher> eligibleItemsFetcher;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CuratedListUserListDuxo_Factory create(Provider<CuratedListEligibleItemsFetcher> provider, Provider<CuratedListStore> provider2, Provider<CuratedListItemsStore> provider3, Provider<CuratedListItemViewModeStore> provider4, Provider<CryptoQuoteStore> provider5, Provider<CryptoHistoricalStore> provider6, Provider<ExperimentsStore> provider7, Provider<BuySellStore> provider8, Provider<RegionGateProvider> provider9, Provider<SavedStateHandle> provider10, Provider<DispatcherProvider> provider11, Provider<RxFactory> provider12, Provider<RxGlobalErrorHandler> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final CuratedListUserListDuxo newInstance(CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, ExperimentsStore experimentsStore, BuySellStore buySellStore, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(curatedListEligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, experimentsStore, buySellStore, regionGateProvider, savedStateHandle);
    }

    public CuratedListUserListDuxo_Factory(Provider<CuratedListEligibleItemsFetcher> eligibleItemsFetcher, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<ExperimentsStore> experimentsStore, Provider<BuySellStore> buySellStore, Provider<RegionGateProvider> regionGateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(eligibleItemsFetcher, "eligibleItemsFetcher");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.eligibleItemsFetcher = eligibleItemsFetcher;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.experimentsStore = experimentsStore;
        this.buySellStore = buySellStore;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public CuratedListUserListDuxo get() {
        Companion companion = INSTANCE;
        CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher = this.eligibleItemsFetcher.get();
        Intrinsics.checkNotNullExpressionValue(curatedListEligibleItemsFetcher, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemViewModeStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CuratedListUserListDuxo curatedListUserListDuxoNewInstance = companion.newInstance(curatedListEligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, experimentsStore, buySellStore, regionGateProvider, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(curatedListUserListDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(curatedListUserListDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(curatedListUserListDuxoNewInstance, rxGlobalErrorHandler);
        return curatedListUserListDuxoNewInstance;
    }

    /* compiled from: CuratedListUserListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007JX\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo_Factory;", "eligibleItemsFetcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CuratedListUserListDuxo_Factory create(Provider<CuratedListEligibleItemsFetcher> eligibleItemsFetcher, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<ExperimentsStore> experimentsStore, Provider<BuySellStore> buySellStore, Provider<RegionGateProvider> regionGateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(eligibleItemsFetcher, "eligibleItemsFetcher");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new CuratedListUserListDuxo_Factory(eligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, experimentsStore, buySellStore, regionGateProvider, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final CuratedListUserListDuxo newInstance(CuratedListEligibleItemsFetcher eligibleItemsFetcher, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, ExperimentsStore experimentsStore, BuySellStore buySellStore, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(eligibleItemsFetcher, "eligibleItemsFetcher");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CuratedListUserListDuxo(eligibleItemsFetcher, curatedListStore, curatedListItemsStore, curatedListItemViewModeStore, cryptoQuoteStore, cryptoHistoricalStore, experimentsStore, buySellStore, regionGateProvider, savedStateHandle);
        }
    }
}
