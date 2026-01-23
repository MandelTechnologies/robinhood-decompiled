package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.DebitCardTransferHistoryStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "debitCardTransferHistoryStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/DebitCardTransferHistoryStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory */
/* loaded from: classes20.dex */
public final class C33794xa7b59881 implements Factory<HistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DebitCardTransferHistoryStore> debitCardTransferHistoryStore;

    @JvmStatic
    public static final C33794xa7b59881 create(Provider<DebitCardTransferHistoryStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideDebitCardTransferHistoryTransactionLoader(DebitCardTransferHistoryStore debitCardTransferHistoryStore) {
        return INSTANCE.provideDebitCardTransferHistoryTransactionLoader(debitCardTransferHistoryStore);
    }

    public C33794xa7b59881(Provider<DebitCardTransferHistoryStore> debitCardTransferHistoryStore) {
        Intrinsics.checkNotNullParameter(debitCardTransferHistoryStore, "debitCardTransferHistoryStore");
        this.debitCardTransferHistoryStore = debitCardTransferHistoryStore;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        DebitCardTransferHistoryStore debitCardTransferHistoryStore = this.debitCardTransferHistoryStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardTransferHistoryStore, "get(...)");
        return companion.provideDebitCardTransferHistoryTransactionLoader(debitCardTransferHistoryStore);
    }

    /* compiled from: DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory;", "debitCardTransferHistoryStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/DebitCardTransferHistoryStore;", "provideDebitCardTransferHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.DebitCardTransferHistoryModule_ProvideDebitCardTransferHistoryTransactionLoaderFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C33794xa7b59881 create(Provider<DebitCardTransferHistoryStore> debitCardTransferHistoryStore) {
            Intrinsics.checkNotNullParameter(debitCardTransferHistoryStore, "debitCardTransferHistoryStore");
            return new C33794xa7b59881(debitCardTransferHistoryStore);
        }

        @JvmStatic
        public final HistoryTransactionLoader provideDebitCardTransferHistoryTransactionLoader(DebitCardTransferHistoryStore debitCardTransferHistoryStore) {
            Intrinsics.checkNotNullParameter(debitCardTransferHistoryStore, "debitCardTransferHistoryStore");
            Object objCheckNotNull = Preconditions.checkNotNull(DebitCardTransferHistoryModule.INSTANCE.provideDebitCardTransferHistoryTransactionLoader(debitCardTransferHistoryStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryTransactionLoader) objCheckNotNull;
        }
    }
}
