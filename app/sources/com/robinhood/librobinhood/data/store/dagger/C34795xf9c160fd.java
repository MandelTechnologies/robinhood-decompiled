package com.robinhood.librobinhood.data.store.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.shared.history.HistoryLoaderV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "cryptoTransfersStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.dagger.CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory */
/* loaded from: classes13.dex */
public final class C34795xf9c160fd implements Factory<HistoryLoaderV2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;

    @JvmStatic
    public static final C34795xf9c160fd create(Provider<CryptoTransfersStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryLoaderV2 provideCryptoTransfersHistoryLoaderCallbacks(CryptoTransfersStore cryptoTransfersStore) {
        return INSTANCE.provideCryptoTransfersHistoryLoaderCallbacks(cryptoTransfersStore);
    }

    public C34795xf9c160fd(Provider<CryptoTransfersStore> cryptoTransfersStore) {
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    @Override // javax.inject.Provider
    public HistoryLoaderV2 get() {
        Companion companion = INSTANCE;
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        return companion.provideCryptoTransfersHistoryLoaderCallbacks(cryptoTransfersStore);
    }

    /* compiled from: CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/dagger/CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory;", "cryptoTransfersStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "provideCryptoTransfersHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.dagger.CryptoHistoryModule_ProvideCryptoTransfersHistoryLoaderCallbacksFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C34795xf9c160fd create(Provider<CryptoTransfersStore> cryptoTransfersStore) {
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            return new C34795xf9c160fd(cryptoTransfersStore);
        }

        @JvmStatic
        public final HistoryLoaderV2 provideCryptoTransfersHistoryLoaderCallbacks(CryptoTransfersStore cryptoTransfersStore) {
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Object objCheckNotNull = Preconditions.checkNotNull(CryptoHistoryModule.INSTANCE.provideCryptoTransfersHistoryLoaderCallbacks(cryptoTransfersStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryLoaderV2) objCheckNotNull;
        }
    }
}
