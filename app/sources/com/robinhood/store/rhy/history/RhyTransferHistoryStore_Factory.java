package com.robinhood.store.rhy.history;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTransferHistoryStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore;", "debitCardInstrumentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "rhyTransferIraInfoStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RhyTransferHistoryStore_Factory implements Factory<RhyTransferHistoryStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<PaymentInstrumentStore> paymentInstrumentStore;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<RhyTransferIraInfoStore> rhyTransferIraInfoStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TransferAccountStore> transferAccountStore;

    @JvmStatic
    public static final RhyTransferHistoryStore_Factory create(Provider<DebitCardInstrumentStore> provider, Provider<AchRelationshipStore> provider2, Provider<RhyTransferIraInfoStore> provider3, Provider<TransferAccountStore> provider4, Provider<PaymentTransferStore> provider5, Provider<PaymentInstrumentStore> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final RhyTransferHistoryStore newInstance(DebitCardInstrumentStore debitCardInstrumentStore, AchRelationshipStore achRelationshipStore, RhyTransferIraInfoStore rhyTransferIraInfoStore, TransferAccountStore transferAccountStore, PaymentTransferStore paymentTransferStore, PaymentInstrumentStore paymentInstrumentStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(debitCardInstrumentStore, achRelationshipStore, rhyTransferIraInfoStore, transferAccountStore, paymentTransferStore, paymentInstrumentStore, storeBundle);
    }

    public RhyTransferHistoryStore_Factory(Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<RhyTransferIraInfoStore> rhyTransferIraInfoStore, Provider<TransferAccountStore> transferAccountStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<PaymentInstrumentStore> paymentInstrumentStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.achRelationshipStore = achRelationshipStore;
        this.rhyTransferIraInfoStore = rhyTransferIraInfoStore;
        this.transferAccountStore = transferAccountStore;
        this.paymentTransferStore = paymentTransferStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public RhyTransferHistoryStore get() {
        Companion companion = INSTANCE;
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        RhyTransferIraInfoStore rhyTransferIraInfoStore = this.rhyTransferIraInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyTransferIraInfoStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        PaymentInstrumentStore paymentInstrumentStore = this.paymentInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(debitCardInstrumentStore, achRelationshipStore, rhyTransferIraInfoStore, transferAccountStore, paymentTransferStore, paymentInstrumentStore, storeBundle);
    }

    /* compiled from: RhyTransferHistoryStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore_Factory;", "debitCardInstrumentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "rhyTransferIraInfoStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTransferIraInfoStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/rhy/history/RhyTransferHistoryStore;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyTransferHistoryStore_Factory create(Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<RhyTransferIraInfoStore> rhyTransferIraInfoStore, Provider<TransferAccountStore> transferAccountStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<PaymentInstrumentStore> paymentInstrumentStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhyTransferHistoryStore_Factory(debitCardInstrumentStore, achRelationshipStore, rhyTransferIraInfoStore, transferAccountStore, paymentTransferStore, paymentInstrumentStore, storeBundle);
        }

        @JvmStatic
        public final RhyTransferHistoryStore newInstance(DebitCardInstrumentStore debitCardInstrumentStore, AchRelationshipStore achRelationshipStore, RhyTransferIraInfoStore rhyTransferIraInfoStore, TransferAccountStore transferAccountStore, PaymentTransferStore paymentTransferStore, PaymentInstrumentStore paymentInstrumentStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(rhyTransferIraInfoStore, "rhyTransferIraInfoStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhyTransferHistoryStore(debitCardInstrumentStore, achRelationshipStore, rhyTransferIraInfoStore, transferAccountStore, paymentTransferStore, paymentInstrumentStore, storeBundle);
        }
    }
}
