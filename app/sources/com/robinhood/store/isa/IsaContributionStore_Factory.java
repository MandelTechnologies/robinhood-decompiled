package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.WindsorService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.isa.models.isa.p163db.dao.IsaContributionDao;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaContributionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/isa/IsaContributionStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "contributionDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaContributionDao;", "windsorService", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IsaContributionStore_Factory implements Factory<IsaContributionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<IsaContributionDao> contributionDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<WindsorService> windsorService;

    @JvmStatic
    public static final IsaContributionStore_Factory create(Provider<AccountProvider> provider, Provider<IsaContributionDao> provider2, Provider<WindsorService> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final IsaContributionStore newInstance(AccountProvider accountProvider, IsaContributionDao isaContributionDao, WindsorService windsorService, StoreBundle storeBundle) {
        return INSTANCE.newInstance(accountProvider, isaContributionDao, windsorService, storeBundle);
    }

    public IsaContributionStore_Factory(Provider<AccountProvider> accountProvider, Provider<IsaContributionDao> contributionDao, Provider<WindsorService> windsorService, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(contributionDao, "contributionDao");
        Intrinsics.checkNotNullParameter(windsorService, "windsorService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.contributionDao = contributionDao;
        this.windsorService = windsorService;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IsaContributionStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        IsaContributionDao isaContributionDao = this.contributionDao.get();
        Intrinsics.checkNotNullExpressionValue(isaContributionDao, "get(...)");
        WindsorService windsorService = this.windsorService.get();
        Intrinsics.checkNotNullExpressionValue(windsorService, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(accountProvider, isaContributionDao, windsorService, storeBundle);
    }

    /* compiled from: IsaContributionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaContributionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/isa/IsaContributionStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "contributionDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaContributionDao;", "windsorService", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/isa/IsaContributionStore;", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IsaContributionStore_Factory create(Provider<AccountProvider> accountProvider, Provider<IsaContributionDao> contributionDao, Provider<WindsorService> windsorService, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(contributionDao, "contributionDao");
            Intrinsics.checkNotNullParameter(windsorService, "windsorService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IsaContributionStore_Factory(accountProvider, contributionDao, windsorService, storeBundle);
        }

        @JvmStatic
        public final IsaContributionStore newInstance(AccountProvider accountProvider, IsaContributionDao contributionDao, WindsorService windsorService, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(contributionDao, "contributionDao");
            Intrinsics.checkNotNullParameter(windsorService, "windsorService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IsaContributionStore(accountProvider, contributionDao, windsorService, storeBundle);
        }
    }
}
