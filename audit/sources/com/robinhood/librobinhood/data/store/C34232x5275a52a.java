package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bff.PaymentIntentStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "paymentIntentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory */
/* loaded from: classes13.dex */
public final class C34232x5275a52a implements Factory<HistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PaymentIntentStore> paymentIntentStore;

    @JvmStatic
    public static final C34232x5275a52a create(Provider<PaymentIntentStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideI18nWireHistoryTransactionLoader(PaymentIntentStore paymentIntentStore) {
        return INSTANCE.provideI18nWireHistoryTransactionLoader(paymentIntentStore);
    }

    public C34232x5275a52a(Provider<PaymentIntentStore> paymentIntentStore) {
        Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
        this.paymentIntentStore = paymentIntentStore;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        PaymentIntentStore paymentIntentStore = this.paymentIntentStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentIntentStore, "get(...)");
        return companion.provideI18nWireHistoryTransactionLoader(paymentIntentStore);
    }

    /* compiled from: PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory;", "paymentIntentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "provideI18nWireHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.PaymentIntentHistoryModule_ProvideI18nWireHistoryTransactionLoaderFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C34232x5275a52a create(Provider<PaymentIntentStore> paymentIntentStore) {
            Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
            return new C34232x5275a52a(paymentIntentStore);
        }

        @JvmStatic
        public final HistoryTransactionLoader provideI18nWireHistoryTransactionLoader(PaymentIntentStore paymentIntentStore) {
            Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
            Object objCheckNotNull = Preconditions.checkNotNull(PaymentIntentHistoryModule.INSTANCE.provideI18nWireHistoryTransactionLoader(paymentIntentStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryTransactionLoader) objCheckNotNull;
        }
    }
}
