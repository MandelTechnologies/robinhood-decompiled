package com.robinhood.librobinhood.data.store;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryLoaderV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryLoaderV2;", PlaceTypes.STORE, "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory implements Factory<HistoryLoaderV2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SweepStore> store;

    @JvmStatic
    public static final SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory create(Provider<SweepStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryLoaderV2 provideHistoryLoaderCallbacks(SweepStore sweepStore) {
        return INSTANCE.provideHistoryLoaderCallbacks(sweepStore);
    }

    public SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory(Provider<SweepStore> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
    }

    @Override // javax.inject.Provider
    public HistoryLoaderV2 get() {
        Companion companion = INSTANCE;
        SweepStore sweepStore = this.store.get();
        Intrinsics.checkNotNullExpressionValue(sweepStore, "get(...)");
        return companion.provideHistoryLoaderCallbacks(sweepStore);
    }

    /* compiled from: SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory;", PlaceTypes.STORE, "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepStore;", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory create(Provider<SweepStore> store) {
            Intrinsics.checkNotNullParameter(store, "store");
            return new SweepHistoryModule_ProvideHistoryLoaderCallbacksFactory(store);
        }

        @JvmStatic
        public final HistoryLoaderV2 provideHistoryLoaderCallbacks(SweepStore store) {
            Intrinsics.checkNotNullParameter(store, "store");
            Object objCheckNotNull = Preconditions.checkNotNull(SweepHistoryModule.INSTANCE.provideHistoryLoaderCallbacks(store), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryLoaderV2) objCheckNotNull;
        }
    }
}
