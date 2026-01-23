package com.robinhood.librobinhood.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.AdrFeeStore;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "adrFeeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory implements Factory<HistoryTransactionLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdrFeeStore> adrFeeStore;

    @JvmStatic
    public static final AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory create(Provider<AdrFeeStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideHistoryTransactionLoader(AdrFeeStore adrFeeStore) {
        return INSTANCE.provideHistoryTransactionLoader(adrFeeStore);
    }

    public AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory(Provider<AdrFeeStore> adrFeeStore) {
        Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
        this.adrFeeStore = adrFeeStore;
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        Companion companion = INSTANCE;
        AdrFeeStore adrFeeStore = this.adrFeeStore.get();
        Intrinsics.checkNotNullExpressionValue(adrFeeStore, "get(...)");
        return companion.provideHistoryTransactionLoader(adrFeeStore);
    }

    /* compiled from: AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/dagger/AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory;", "adrFeeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "provideHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory create(Provider<AdrFeeStore> adrFeeStore) {
            Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
            return new AdrFeeHistoryModule_ProvideHistoryTransactionLoaderFactory(adrFeeStore);
        }

        @JvmStatic
        public final HistoryTransactionLoader provideHistoryTransactionLoader(AdrFeeStore adrFeeStore) {
            Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
            Object objCheckNotNull = Preconditions.checkNotNull(AdrFeeHistoryModule.INSTANCE.provideHistoryTransactionLoader(adrFeeStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryTransactionLoader) objCheckNotNull;
        }
    }
}
