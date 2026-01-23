package com.robinhood.android.common.recurring.bottomsheet;

import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringCryptoDisclosureBottomSheetFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringCryptoDisclosureBottomSheetFragment_MembersInjector implements MembersInjector<RecurringCryptoDisclosureBottomSheetFragment> {
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<Markwon> markwon;
    private final Provider<Navigator> navigator;
    private final Provider<RxFactory> rxFactory;
    private final Provider<BaseDialogSingletons> singletons;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RecurringCryptoDisclosureBottomSheetFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<CryptoExperimentsStore> provider3, Provider<StaticContentStore> provider4, Provider<RxFactory> provider5, Provider<Markwon> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectCryptoExperimentsStore(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, CryptoExperimentsStore cryptoExperimentsStore) {
        INSTANCE.injectCryptoExperimentsStore(recurringCryptoDisclosureBottomSheetFragment, cryptoExperimentsStore);
    }

    @JvmStatic
    public static final void injectMarkwon(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(recurringCryptoDisclosureBottomSheetFragment, markwon);
    }

    @JvmStatic
    public static final void injectRxFactory(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(recurringCryptoDisclosureBottomSheetFragment, rxFactory);
    }

    @JvmStatic
    public static final void injectStaticContentStore(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, StaticContentStore staticContentStore) {
        INSTANCE.injectStaticContentStore(recurringCryptoDisclosureBottomSheetFragment, staticContentStore);
    }

    public RecurringCryptoDisclosureBottomSheetFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StaticContentStore> staticContentStore, Provider<RxFactory> rxFactory, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.singletons = singletons;
        this.navigator = navigator;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.staticContentStore = staticContentStore;
        this.rxFactory = rxFactory;
        this.markwon = markwon;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringCryptoDisclosureBottomSheetFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        BaseBottomSheetDialogFragment_MembersInjector.Companion companion2 = BaseBottomSheetDialogFragment_MembersInjector.INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        Companion companion3 = INSTANCE;
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        companion3.injectCryptoExperimentsStore(instance, cryptoExperimentsStore);
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        companion3.injectStaticContentStore(instance, staticContentStore);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion3.injectRxFactory(instance, rxFactory);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion3.injectMarkwon(instance, markwon);
    }

    /* compiled from: RecurringCryptoDisclosureBottomSheetFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "markwon", "Lio/noties/markwon/Markwon;", "injectCryptoExperimentsStore", "", "instance", "injectStaticContentStore", "injectRxFactory", "injectMarkwon", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RecurringCryptoDisclosureBottomSheetFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StaticContentStore> staticContentStore, Provider<RxFactory> rxFactory, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new RecurringCryptoDisclosureBottomSheetFragment_MembersInjector(singletons, navigator, cryptoExperimentsStore, staticContentStore, rxFactory, markwon);
        }

        @JvmStatic
        public final void injectCryptoExperimentsStore(RecurringCryptoDisclosureBottomSheetFragment instance, CryptoExperimentsStore cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            instance.setCryptoExperimentsStore(cryptoExperimentsStore);
        }

        @JvmStatic
        public final void injectStaticContentStore(RecurringCryptoDisclosureBottomSheetFragment instance, StaticContentStore staticContentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            instance.setStaticContentStore(staticContentStore);
        }

        @JvmStatic
        public final void injectRxFactory(RecurringCryptoDisclosureBottomSheetFragment instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }

        @JvmStatic
        public final void injectMarkwon(RecurringCryptoDisclosureBottomSheetFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }
    }
}
