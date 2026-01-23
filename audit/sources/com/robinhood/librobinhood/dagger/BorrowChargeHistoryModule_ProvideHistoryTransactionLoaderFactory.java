package com.robinhood.librobinhood.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.BorrowChargeStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "module", "Lcom/robinhood/librobinhood/dagger/BorrowChargeHistoryModule;", "borrowChargeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;", "<init>", "(Lcom/robinhood/librobinhood/dagger/BorrowChargeHistoryModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory implements Factory<HistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BorrowChargeStore> borrowChargeStore;
    private final BorrowChargeHistoryModule module;

    @JvmStatic
    public static final BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory create(BorrowChargeHistoryModule borrowChargeHistoryModule, Provider<BorrowChargeStore> provider) {
        return INSTANCE.create(borrowChargeHistoryModule, provider);
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideHistoryTransactionLoader(BorrowChargeHistoryModule borrowChargeHistoryModule, BorrowChargeStore borrowChargeStore) {
        return INSTANCE.provideHistoryTransactionLoader(borrowChargeHistoryModule, borrowChargeStore);
    }

    public BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory(BorrowChargeHistoryModule module, Provider<BorrowChargeStore> borrowChargeStore) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
        this.module = module;
        this.borrowChargeStore = borrowChargeStore;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        BorrowChargeHistoryModule borrowChargeHistoryModule = this.module;
        BorrowChargeStore borrowChargeStore = this.borrowChargeStore.get();
        Intrinsics.checkNotNullExpressionValue(borrowChargeStore, "get(...)");
        return companion.provideHistoryTransactionLoader(borrowChargeHistoryModule, borrowChargeStore);
    }

    /* compiled from: BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/dagger/BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory;", "module", "Lcom/robinhood/librobinhood/dagger/BorrowChargeHistoryModule;", "borrowChargeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory create(BorrowChargeHistoryModule module, Provider<BorrowChargeStore> borrowChargeStore) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
            return new BorrowChargeHistoryModule_ProvideHistoryTransactionLoaderFactory(module, borrowChargeStore);
        }

        @JvmStatic
        public final HistoryTransactionLoader provideHistoryTransactionLoader(BorrowChargeHistoryModule module, BorrowChargeStore borrowChargeStore) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideHistoryTransactionLoader(borrowChargeStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryTransactionLoader) objCheckNotNull;
        }
    }
}
