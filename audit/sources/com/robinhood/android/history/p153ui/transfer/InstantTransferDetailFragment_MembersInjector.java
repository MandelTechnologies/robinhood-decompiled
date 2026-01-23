package com.robinhood.android.history.p153ui.transfer;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantTransferDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InstantTransferDetailFragment_MembersInjector implements MembersInjector<InstantTransferDetailFragment> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<Markwon> markwon;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstantTransferDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<Markwon> provider2, Provider<AchRelationshipStore> provider3, Provider<DebitCardInstrumentStore> provider4, Provider<PaymentTransferStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAchRelationshipStore(InstantTransferDetailFragment instantTransferDetailFragment, AchRelationshipStore achRelationshipStore) {
        INSTANCE.injectAchRelationshipStore(instantTransferDetailFragment, achRelationshipStore);
    }

    @JvmStatic
    public static final void injectDebitCardInstrumentStore(InstantTransferDetailFragment instantTransferDetailFragment, DebitCardInstrumentStore debitCardInstrumentStore) {
        INSTANCE.injectDebitCardInstrumentStore(instantTransferDetailFragment, debitCardInstrumentStore);
    }

    @JvmStatic
    public static final void injectMarkwon(InstantTransferDetailFragment instantTransferDetailFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(instantTransferDetailFragment, markwon);
    }

    @JvmStatic
    public static final void injectPaymentTransferStore(InstantTransferDetailFragment instantTransferDetailFragment, PaymentTransferStore paymentTransferStore) {
        INSTANCE.injectPaymentTransferStore(instantTransferDetailFragment, paymentTransferStore);
    }

    public InstantTransferDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<AchRelationshipStore> achRelationshipStore, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<PaymentTransferStore> paymentTransferStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        this.singletons = singletons;
        this.markwon = markwon;
        this.achRelationshipStore = achRelationshipStore;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.paymentTransferStore = paymentTransferStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstantTransferDetailFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        companion2.injectAchRelationshipStore(instance, achRelationshipStore);
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        companion2.injectDebitCardInstrumentStore(instance, debitCardInstrumentStore);
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        companion2.injectPaymentTransferStore(instance, paymentTransferStore);
    }

    /* compiled from: InstantTransferDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "injectMarkwon", "", "instance", "injectAchRelationshipStore", "injectDebitCardInstrumentStore", "injectPaymentTransferStore", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstantTransferDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<AchRelationshipStore> achRelationshipStore, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<PaymentTransferStore> paymentTransferStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            return new InstantTransferDetailFragment_MembersInjector(singletons, markwon, achRelationshipStore, debitCardInstrumentStore, paymentTransferStore);
        }

        @JvmStatic
        public final void injectMarkwon(InstantTransferDetailFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectAchRelationshipStore(InstantTransferDetailFragment instance, AchRelationshipStore achRelationshipStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            instance.setAchRelationshipStore(achRelationshipStore);
        }

        @JvmStatic
        public final void injectDebitCardInstrumentStore(InstantTransferDetailFragment instance, DebitCardInstrumentStore debitCardInstrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            instance.setDebitCardInstrumentStore(debitCardInstrumentStore);
        }

        @JvmStatic
        public final void injectPaymentTransferStore(InstantTransferDetailFragment instance, PaymentTransferStore paymentTransferStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            instance.setPaymentTransferStore(paymentTransferStore);
        }
    }
}
