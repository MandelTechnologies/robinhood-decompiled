package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.dao.TrustedDeviceDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedDeviceStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;", "brokeback", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Brokeback;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TrustedDeviceDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-trusted-device_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TrustedDeviceStore_Factory implements Factory<TrustedDeviceStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Brokeback> brokeback;
    private final Provider<TrustedDeviceDao> dao;
    private final Provider<Sheriff> sheriff;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final TrustedDeviceStore_Factory create(Provider<Brokeback> provider, Provider<Sheriff> provider2, Provider<StoreBundle> provider3, Provider<TrustedDeviceDao> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final TrustedDeviceStore newInstance(Brokeback brokeback, Sheriff sheriff, StoreBundle storeBundle, TrustedDeviceDao trustedDeviceDao) {
        return INSTANCE.newInstance(brokeback, sheriff, storeBundle, trustedDeviceDao);
    }

    public TrustedDeviceStore_Factory(Provider<Brokeback> brokeback, Provider<Sheriff> sheriff, Provider<StoreBundle> storeBundle, Provider<TrustedDeviceDao> dao) {
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.sheriff = sheriff;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public TrustedDeviceStore get() {
        Companion companion = INSTANCE;
        Brokeback brokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(brokeback, "get(...)");
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        TrustedDeviceDao trustedDeviceDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceDao, "get(...)");
        return companion.newInstance(brokeback, sheriff, storeBundle, trustedDeviceDao);
    }

    /* compiled from: TrustedDeviceStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore_Factory;", "brokeback", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Brokeback;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/TrustedDeviceDao;", "newInstance", "Lcom/robinhood/shared/security/store/trusteddevice/TrustedDeviceStore;", "lib-store-trusted-device_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TrustedDeviceStore_Factory create(Provider<Brokeback> brokeback, Provider<Sheriff> sheriff, Provider<StoreBundle> storeBundle, Provider<TrustedDeviceDao> dao) {
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new TrustedDeviceStore_Factory(brokeback, sheriff, storeBundle, dao);
        }

        @JvmStatic
        public final TrustedDeviceStore newInstance(Brokeback brokeback, Sheriff sheriff, StoreBundle storeBundle, TrustedDeviceDao dao) {
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new TrustedDeviceStore(brokeback, sheriff, storeBundle, dao);
        }
    }
}
