package com.robinhood.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore;
import com.robinhood.store.base.BackupWithholdingStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreModule_ProvideBackupWithholdingStoreFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/StoreModule_ProvideBackupWithholdingStoreFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/base/BackupWithholdingStore;", "traderBackupWithholdingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StoreModule_ProvideBackupWithholdingStoreFactory implements Factory<BackupWithholdingStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<TraderBackupWithholdingStore> traderBackupWithholdingStore;

    @JvmStatic
    public static final StoreModule_ProvideBackupWithholdingStoreFactory create(Provider<TraderBackupWithholdingStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final BackupWithholdingStore provideBackupWithholdingStore(TraderBackupWithholdingStore traderBackupWithholdingStore) {
        return INSTANCE.provideBackupWithholdingStore(traderBackupWithholdingStore);
    }

    public StoreModule_ProvideBackupWithholdingStoreFactory(Provider<TraderBackupWithholdingStore> traderBackupWithholdingStore) {
        Intrinsics.checkNotNullParameter(traderBackupWithholdingStore, "traderBackupWithholdingStore");
        this.traderBackupWithholdingStore = traderBackupWithholdingStore;
    }

    @Override // javax.inject.Provider
    public BackupWithholdingStore get() {
        Companion companion = INSTANCE;
        TraderBackupWithholdingStore traderBackupWithholdingStore = this.traderBackupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(traderBackupWithholdingStore, "get(...)");
        return companion.provideBackupWithholdingStore(traderBackupWithholdingStore);
    }

    /* compiled from: StoreModule_ProvideBackupWithholdingStoreFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/StoreModule_ProvideBackupWithholdingStoreFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/StoreModule_ProvideBackupWithholdingStoreFactory;", "traderBackupWithholdingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore;", "provideBackupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StoreModule_ProvideBackupWithholdingStoreFactory create(Provider<TraderBackupWithholdingStore> traderBackupWithholdingStore) {
            Intrinsics.checkNotNullParameter(traderBackupWithholdingStore, "traderBackupWithholdingStore");
            return new StoreModule_ProvideBackupWithholdingStoreFactory(traderBackupWithholdingStore);
        }

        @JvmStatic
        public final BackupWithholdingStore provideBackupWithholdingStore(TraderBackupWithholdingStore traderBackupWithholdingStore) {
            Intrinsics.checkNotNullParameter(traderBackupWithholdingStore, "traderBackupWithholdingStore");
            Object objCheckNotNull = Preconditions.checkNotNull(StoreModule.INSTANCE.provideBackupWithholdingStore(traderBackupWithholdingStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (BackupWithholdingStore) objCheckNotNull;
        }
    }
}
