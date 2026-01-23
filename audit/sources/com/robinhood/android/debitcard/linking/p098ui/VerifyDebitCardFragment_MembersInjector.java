package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyDebitCardFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class VerifyDebitCardFragment_MembersInjector implements MembersInjector<VerifyDebitCardFragment> {
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<VerifyDebitCardFragment> create(Provider<BaseFragmentSingletons> provider, Provider<DebitCardInstrumentStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectDebitCardInstrumentStore(VerifyDebitCardFragment verifyDebitCardFragment, DebitCardInstrumentStore debitCardInstrumentStore) {
        INSTANCE.injectDebitCardInstrumentStore(verifyDebitCardFragment, debitCardInstrumentStore);
    }

    public VerifyDebitCardFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<DebitCardInstrumentStore> debitCardInstrumentStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        this.singletons = singletons;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VerifyDebitCardFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        companion2.injectDebitCardInstrumentStore(instance, debitCardInstrumentStore);
    }

    /* compiled from: VerifyDebitCardFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "injectDebitCardInstrumentStore", "", "instance", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<VerifyDebitCardFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<DebitCardInstrumentStore> debitCardInstrumentStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            return new VerifyDebitCardFragment_MembersInjector(singletons, debitCardInstrumentStore);
        }

        @JvmStatic
        public final void injectDebitCardInstrumentStore(VerifyDebitCardFragment instance, DebitCardInstrumentStore debitCardInstrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            instance.setDebitCardInstrumentStore(debitCardInstrumentStore);
        }
    }
}
