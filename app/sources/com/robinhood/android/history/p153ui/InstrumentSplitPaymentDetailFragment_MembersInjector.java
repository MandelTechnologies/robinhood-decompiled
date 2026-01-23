package com.robinhood.android.history.p153ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentSplitPaymentDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentSplitPaymentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InstrumentSplitPaymentDetailFragment_MembersInjector implements MembersInjector<InstrumentSplitPaymentDetailFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InstrumentSplitPaymentStore> instrumentSplitPaymentStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstrumentSplitPaymentDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AccountProvider> provider2, Provider<InstrumentSplitPaymentStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAccountProvider(InstrumentSplitPaymentDetailFragment instrumentSplitPaymentDetailFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(instrumentSplitPaymentDetailFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectInstrumentSplitPaymentStore(InstrumentSplitPaymentDetailFragment instrumentSplitPaymentDetailFragment, InstrumentSplitPaymentStore instrumentSplitPaymentStore) {
        INSTANCE.injectInstrumentSplitPaymentStore(instrumentSplitPaymentDetailFragment, instrumentSplitPaymentStore);
    }

    public InstrumentSplitPaymentDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<InstrumentSplitPaymentStore> instrumentSplitPaymentStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentSplitPaymentStore, "instrumentSplitPaymentStore");
        this.singletons = singletons;
        this.accountProvider = accountProvider;
        this.instrumentSplitPaymentStore = instrumentSplitPaymentStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstrumentSplitPaymentDetailFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        InstrumentSplitPaymentStore instrumentSplitPaymentStore = this.instrumentSplitPaymentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentSplitPaymentStore, "get(...)");
        companion2.injectInstrumentSplitPaymentStore(instance, instrumentSplitPaymentStore);
    }

    /* compiled from: InstrumentSplitPaymentDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/InstrumentSplitPaymentDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentSplitPaymentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;", "injectAccountProvider", "", "instance", "injectInstrumentSplitPaymentStore", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstrumentSplitPaymentDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AccountProvider> accountProvider, Provider<InstrumentSplitPaymentStore> instrumentSplitPaymentStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(instrumentSplitPaymentStore, "instrumentSplitPaymentStore");
            return new InstrumentSplitPaymentDetailFragment_MembersInjector(singletons, accountProvider, instrumentSplitPaymentStore);
        }

        @JvmStatic
        public final void injectAccountProvider(InstrumentSplitPaymentDetailFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectInstrumentSplitPaymentStore(InstrumentSplitPaymentDetailFragment instance, InstrumentSplitPaymentStore instrumentSplitPaymentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentSplitPaymentStore, "instrumentSplitPaymentStore");
            instance.setInstrumentSplitPaymentStore(instrumentSplitPaymentStore);
        }
    }
}
