package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.p280bw.BackupWithholdingApi;
import com.robinhood.models.p320db.bonfire.WithholdingAmountDao;
import com.robinhood.models.p320db.bonfire.WithholdingStatusDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderBackupWithholdingStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/bw/BackupWithholdingApi;", "withholdingAmountDao", "Lcom/robinhood/models/db/bonfire/WithholdingAmountDao;", "withholdingStatusDao", "Lcom/robinhood/models/db/bonfire/WithholdingStatusDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-backup-withholding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TraderBackupWithholdingStore_Factory implements Factory<TraderBackupWithholdingStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BackupWithholdingApi> bonfireApi;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<WithholdingAmountDao> withholdingAmountDao;
    private final Provider<WithholdingStatusDao> withholdingStatusDao;

    @JvmStatic
    public static final TraderBackupWithholdingStore_Factory create(Provider<BackupWithholdingApi> provider, Provider<WithholdingAmountDao> provider2, Provider<WithholdingStatusDao> provider3, Provider<ExperimentsStore> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final TraderBackupWithholdingStore newInstance(BackupWithholdingApi backupWithholdingApi, WithholdingAmountDao withholdingAmountDao, WithholdingStatusDao withholdingStatusDao, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(backupWithholdingApi, withholdingAmountDao, withholdingStatusDao, experimentsStore, storeBundle);
    }

    public TraderBackupWithholdingStore_Factory(Provider<BackupWithholdingApi> bonfireApi, Provider<WithholdingAmountDao> withholdingAmountDao, Provider<WithholdingStatusDao> withholdingStatusDao, Provider<ExperimentsStore> experimentsStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(withholdingAmountDao, "withholdingAmountDao");
        Intrinsics.checkNotNullParameter(withholdingStatusDao, "withholdingStatusDao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.withholdingAmountDao = withholdingAmountDao;
        this.withholdingStatusDao = withholdingStatusDao;
        this.experimentsStore = experimentsStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public TraderBackupWithholdingStore get() {
        Companion companion = INSTANCE;
        BackupWithholdingApi backupWithholdingApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingApi, "get(...)");
        WithholdingAmountDao withholdingAmountDao = this.withholdingAmountDao.get();
        Intrinsics.checkNotNullExpressionValue(withholdingAmountDao, "get(...)");
        WithholdingStatusDao withholdingStatusDao = this.withholdingStatusDao.get();
        Intrinsics.checkNotNullExpressionValue(withholdingStatusDao, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(backupWithholdingApi, withholdingAmountDao, withholdingStatusDao, experimentsStore, storeBundle);
    }

    /* compiled from: TraderBackupWithholdingStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore_Factory;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/bw/BackupWithholdingApi;", "withholdingAmountDao", "Lcom/robinhood/models/db/bonfire/WithholdingAmountDao;", "withholdingStatusDao", "Lcom/robinhood/models/db/bonfire/WithholdingStatusDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore;", "lib-store-backup-withholding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderBackupWithholdingStore_Factory create(Provider<BackupWithholdingApi> bonfireApi, Provider<WithholdingAmountDao> withholdingAmountDao, Provider<WithholdingStatusDao> withholdingStatusDao, Provider<ExperimentsStore> experimentsStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(withholdingAmountDao, "withholdingAmountDao");
            Intrinsics.checkNotNullParameter(withholdingStatusDao, "withholdingStatusDao");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TraderBackupWithholdingStore_Factory(bonfireApi, withholdingAmountDao, withholdingStatusDao, experimentsStore, storeBundle);
        }

        @JvmStatic
        public final TraderBackupWithholdingStore newInstance(BackupWithholdingApi bonfireApi, WithholdingAmountDao withholdingAmountDao, WithholdingStatusDao withholdingStatusDao, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(withholdingAmountDao, "withholdingAmountDao");
            Intrinsics.checkNotNullParameter(withholdingStatusDao, "withholdingStatusDao");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new TraderBackupWithholdingStore(bonfireApi, withholdingAmountDao, withholdingStatusDao, experimentsStore, storeBundle);
        }
    }
}
