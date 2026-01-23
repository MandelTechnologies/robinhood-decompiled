package com.robinhood.android.mcduckling;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyWaitlistStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashManagementAccessManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0090\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashManagementAccessManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "minervaAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "rhyWaitlistStore", "Lcom/robinhood/librobinhood/data/store/RhyWaitlistStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "productMarketingStore", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlin/jvm/JvmSuppressWildcards;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CashManagementAccessManager_Factory implements Factory<CashManagementAccessManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<ContentStore<ProductMarketingContent>> productMarketingStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhyTabStateStore> rhyTabStateStore;
    private final Provider<RhyWaitlistStore> rhyWaitlistStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<BaseSortingHatStore> sortingHatStore;

    @JvmStatic
    public static final CashManagementAccessManager_Factory create(Provider<MinervaAccountStore> provider, Provider<RhyAccountStore> provider2, Provider<RhyTabStateStore> provider3, Provider<RhyWaitlistStore> provider4, Provider<BaseSortingHatStore> provider5, Provider<ContentStore<ProductMarketingContent>> provider6, Provider<RxFactory> provider7, Provider<ExperimentsStore> provider8, Provider<CreditCardStore> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final CashManagementAccessManager newInstance(MinervaAccountStore minervaAccountStore, RhyAccountStore rhyAccountStore, RhyTabStateStore rhyTabStateStore, RhyWaitlistStore rhyWaitlistStore, BaseSortingHatStore baseSortingHatStore, ContentStore<ProductMarketingContent> contentStore, RxFactory rxFactory, ExperimentsStore experimentsStore, CreditCardStore creditCardStore) {
        return INSTANCE.newInstance(minervaAccountStore, rhyAccountStore, rhyTabStateStore, rhyWaitlistStore, baseSortingHatStore, contentStore, rxFactory, experimentsStore, creditCardStore);
    }

    public CashManagementAccessManager_Factory(Provider<MinervaAccountStore> minervaAccountStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyTabStateStore> rhyTabStateStore, Provider<RhyWaitlistStore> rhyWaitlistStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<ContentStore<ProductMarketingContent>> productMarketingStore, Provider<RxFactory> rxFactory, Provider<ExperimentsStore> experimentsStore, Provider<CreditCardStore> creditCardStore) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(rhyWaitlistStore, "rhyWaitlistStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(productMarketingStore, "productMarketingStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        this.minervaAccountStore = minervaAccountStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyTabStateStore = rhyTabStateStore;
        this.rhyWaitlistStore = rhyWaitlistStore;
        this.sortingHatStore = sortingHatStore;
        this.productMarketingStore = productMarketingStore;
        this.rxFactory = rxFactory;
        this.experimentsStore = experimentsStore;
        this.creditCardStore = creditCardStore;
    }

    @Override // javax.inject.Provider
    public CashManagementAccessManager get() {
        Companion companion = INSTANCE;
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RhyTabStateStore rhyTabStateStore = this.rhyTabStateStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyTabStateStore, "get(...)");
        RhyWaitlistStore rhyWaitlistStore = this.rhyWaitlistStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyWaitlistStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        ContentStore<ProductMarketingContent> contentStore = this.productMarketingStore.get();
        Intrinsics.checkNotNullExpressionValue(contentStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        return companion.newInstance(minervaAccountStore, rhyAccountStore, rhyTabStateStore, rhyWaitlistStore, baseSortingHatStore, contentStore, rxFactory, experimentsStore, creditCardStore);
    }

    /* compiled from: CashManagementAccessManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0091\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0017\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007J[\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashManagementAccessManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/mcduckling/CashManagementAccessManager_Factory;", "minervaAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "rhyWaitlistStore", "Lcom/robinhood/librobinhood/data/store/RhyWaitlistStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "productMarketingStore", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlin/jvm/JvmSuppressWildcards;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "newInstance", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CashManagementAccessManager_Factory create(Provider<MinervaAccountStore> minervaAccountStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyTabStateStore> rhyTabStateStore, Provider<RhyWaitlistStore> rhyWaitlistStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<ContentStore<ProductMarketingContent>> productMarketingStore, Provider<RxFactory> rxFactory, Provider<ExperimentsStore> experimentsStore, Provider<CreditCardStore> creditCardStore) {
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
            Intrinsics.checkNotNullParameter(rhyWaitlistStore, "rhyWaitlistStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(productMarketingStore, "productMarketingStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            return new CashManagementAccessManager_Factory(minervaAccountStore, rhyAccountStore, rhyTabStateStore, rhyWaitlistStore, sortingHatStore, productMarketingStore, rxFactory, experimentsStore, creditCardStore);
        }

        @JvmStatic
        public final CashManagementAccessManager newInstance(MinervaAccountStore minervaAccountStore, RhyAccountStore rhyAccountStore, RhyTabStateStore rhyTabStateStore, RhyWaitlistStore rhyWaitlistStore, BaseSortingHatStore sortingHatStore, ContentStore<ProductMarketingContent> productMarketingStore, RxFactory rxFactory, ExperimentsStore experimentsStore, CreditCardStore creditCardStore) {
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
            Intrinsics.checkNotNullParameter(rhyWaitlistStore, "rhyWaitlistStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(productMarketingStore, "productMarketingStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            return new CashManagementAccessManager(minervaAccountStore, rhyAccountStore, rhyTabStateStore, rhyWaitlistStore, sortingHatStore, productMarketingStore, rxFactory, experimentsStore, creditCardStore);
        }
    }
}
