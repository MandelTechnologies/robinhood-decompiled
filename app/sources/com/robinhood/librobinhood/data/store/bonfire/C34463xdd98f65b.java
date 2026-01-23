package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryLoaderV2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "acatsReimbursementStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory */
/* loaded from: classes20.dex */
public final class C34463xdd98f65b implements Factory<HistoryLoaderV2> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AcatsReimbursementStore> acatsReimbursementStore;

    @JvmStatic
    public static final C34463xdd98f65b create(Provider<AcatsReimbursementStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HistoryLoaderV2 provideHistoryLoaderCallbacks(AcatsReimbursementStore acatsReimbursementStore) {
        return INSTANCE.provideHistoryLoaderCallbacks(acatsReimbursementStore);
    }

    public C34463xdd98f65b(Provider<AcatsReimbursementStore> acatsReimbursementStore) {
        Intrinsics.checkNotNullParameter(acatsReimbursementStore, "acatsReimbursementStore");
        this.acatsReimbursementStore = acatsReimbursementStore;
    }

    @Override // javax.inject.Provider
    public HistoryLoaderV2 get() {
        Companion companion = INSTANCE;
        AcatsReimbursementStore acatsReimbursementStore = this.acatsReimbursementStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsReimbursementStore, "get(...)");
        return companion.provideHistoryLoaderCallbacks(acatsReimbursementStore);
    }

    /* compiled from: AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory;", "acatsReimbursementStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore;", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementHistoryModule_ProvideHistoryLoaderCallbacksFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C34463xdd98f65b create(Provider<AcatsReimbursementStore> acatsReimbursementStore) {
            Intrinsics.checkNotNullParameter(acatsReimbursementStore, "acatsReimbursementStore");
            return new C34463xdd98f65b(acatsReimbursementStore);
        }

        @JvmStatic
        public final HistoryLoaderV2 provideHistoryLoaderCallbacks(AcatsReimbursementStore acatsReimbursementStore) {
            Intrinsics.checkNotNullParameter(acatsReimbursementStore, "acatsReimbursementStore");
            Object objCheckNotNull = Preconditions.checkNotNull(AcatsReimbursementHistoryModule.INSTANCE.provideHistoryLoaderCallbacks(acatsReimbursementStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HistoryLoaderV2) objCheckNotNull;
        }
    }
}
