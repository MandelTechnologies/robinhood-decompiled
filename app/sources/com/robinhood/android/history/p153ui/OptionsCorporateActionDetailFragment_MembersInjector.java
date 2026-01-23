package com.robinhood.android.history.p153ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionCorporateActionStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsCorporateActionDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "optionCorporateActionStore", "Lcom/robinhood/librobinhood/data/store/OptionCorporateActionStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionsCorporateActionDetailFragment_MembersInjector implements MembersInjector<OptionsCorporateActionDetailFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionCorporateActionStore> optionCorporateActionStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionsCorporateActionDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AccountProvider> provider2, Provider<OptionCorporateActionStore> provider3, Provider<OptionChainStore> provider4, Provider<OptionInstrumentStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAccountProvider(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(optionsCorporateActionDetailFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectOptionChainStore(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, OptionChainStore optionChainStore) {
        INSTANCE.injectOptionChainStore(optionsCorporateActionDetailFragment, optionChainStore);
    }

    @JvmStatic
    public static final void injectOptionCorporateActionStore(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, OptionCorporateActionStore optionCorporateActionStore) {
        INSTANCE.injectOptionCorporateActionStore(optionsCorporateActionDetailFragment, optionCorporateActionStore);
    }

    @JvmStatic
    public static final void injectOptionInstrumentStore(OptionsCorporateActionDetailFragment optionsCorporateActionDetailFragment, OptionInstrumentStore optionInstrumentStore) {
        INSTANCE.injectOptionInstrumentStore(optionsCorporateActionDetailFragment, optionInstrumentStore);
    }

    public OptionsCorporateActionDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<OptionCorporateActionStore> optionCorporateActionStore, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(optionCorporateActionStore, "optionCorporateActionStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        this.singletons = singletons;
        this.accountProvider = accountProvider;
        this.optionCorporateActionStore = optionCorporateActionStore;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionsCorporateActionDetailFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        OptionCorporateActionStore optionCorporateActionStore = this.optionCorporateActionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionCorporateActionStore, "get(...)");
        companion2.injectOptionCorporateActionStore(instance, optionCorporateActionStore);
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        companion2.injectOptionChainStore(instance, optionChainStore);
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        companion2.injectOptionInstrumentStore(instance, optionInstrumentStore);
    }

    /* compiled from: OptionsCorporateActionDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/OptionsCorporateActionDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "optionCorporateActionStore", "Lcom/robinhood/librobinhood/data/store/OptionCorporateActionStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "injectAccountProvider", "", "instance", "injectOptionCorporateActionStore", "injectOptionChainStore", "injectOptionInstrumentStore", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionsCorporateActionDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<OptionCorporateActionStore> optionCorporateActionStore, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(optionCorporateActionStore, "optionCorporateActionStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            return new OptionsCorporateActionDetailFragment_MembersInjector(singletons, accountProvider, optionCorporateActionStore, optionChainStore, optionInstrumentStore);
        }

        @JvmStatic
        public final void injectAccountProvider(OptionsCorporateActionDetailFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectOptionCorporateActionStore(OptionsCorporateActionDetailFragment instance, OptionCorporateActionStore optionCorporateActionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionCorporateActionStore, "optionCorporateActionStore");
            instance.setOptionCorporateActionStore(optionCorporateActionStore);
        }

        @JvmStatic
        public final void injectOptionChainStore(OptionsCorporateActionDetailFragment instance, OptionChainStore optionChainStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            instance.setOptionChainStore(optionChainStore);
        }

        @JvmStatic
        public final void injectOptionInstrumentStore(OptionsCorporateActionDetailFragment instance, OptionInstrumentStore optionInstrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            instance.setOptionInstrumentStore(optionInstrumentStore);
        }
    }
}
