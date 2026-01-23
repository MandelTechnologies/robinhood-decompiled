package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.WindsorService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.isa.models.isa.p163db.dao.IsaTransferDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaTransferStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaTransferStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/isa/IsaTransferStore;", "windsor", "Ljavax/inject/Provider;", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "isaTransferDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IsaTransferStore_Factory implements Factory<IsaTransferStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IsaTransferDao> isaTransferDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<WindsorService> windsor;

    @JvmStatic
    public static final IsaTransferStore_Factory create(Provider<WindsorService> provider, Provider<IsaTransferDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final IsaTransferStore newInstance(WindsorService windsorService, IsaTransferDao isaTransferDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(windsorService, isaTransferDao, storeBundle);
    }

    public IsaTransferStore_Factory(Provider<WindsorService> windsor2, Provider<IsaTransferDao> isaTransferDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(windsor2, "windsor");
        Intrinsics.checkNotNullParameter(isaTransferDao, "isaTransferDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.windsor = windsor2;
        this.isaTransferDao = isaTransferDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IsaTransferStore get() {
        Companion companion = INSTANCE;
        WindsorService windsorService = this.windsor.get();
        Intrinsics.checkNotNullExpressionValue(windsorService, "get(...)");
        IsaTransferDao isaTransferDao = this.isaTransferDao.get();
        Intrinsics.checkNotNullExpressionValue(isaTransferDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(windsorService, isaTransferDao, storeBundle);
    }

    /* compiled from: IsaTransferStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaTransferStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/isa/IsaTransferStore_Factory;", "windsor", "Ljavax/inject/Provider;", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "isaTransferDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/isa/IsaTransferStore;", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IsaTransferStore_Factory create(Provider<WindsorService> windsor2, Provider<IsaTransferDao> isaTransferDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(windsor2, "windsor");
            Intrinsics.checkNotNullParameter(isaTransferDao, "isaTransferDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IsaTransferStore_Factory(windsor2, isaTransferDao, storeBundle);
        }

        @JvmStatic
        public final IsaTransferStore newInstance(WindsorService windsor2, IsaTransferDao isaTransferDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(windsor2, "windsor");
            Intrinsics.checkNotNullParameter(isaTransferDao, "isaTransferDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IsaTransferStore(windsor2, isaTransferDao, storeBundle);
        }
    }
}
