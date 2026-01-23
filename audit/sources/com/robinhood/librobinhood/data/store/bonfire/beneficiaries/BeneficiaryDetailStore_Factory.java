package com.robinhood.librobinhood.data.store.bonfire.beneficiaries;

import com.robinhood.android.beneficiaries.api.BeneficiariesApi;
import com.robinhood.android.beneficiaries.models.dao.BeneficiaryDetailDao;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryDetailStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "beneficiariesApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "dao", "Lcom/robinhood/android/beneficiaries/models/dao/BeneficiaryDetailDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BeneficiaryDetailStore_Factory implements Factory<BeneficiaryDetailStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BeneficiariesApi> beneficiariesApi;
    private final Provider<BeneficiaryDetailDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final BeneficiaryDetailStore_Factory create(Provider<BeneficiariesApi> provider, Provider<BeneficiaryDetailDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final BeneficiaryDetailStore newInstance(BeneficiariesApi beneficiariesApi, BeneficiaryDetailDao beneficiaryDetailDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(beneficiariesApi, beneficiaryDetailDao, storeBundle);
    }

    public BeneficiaryDetailStore_Factory(Provider<BeneficiariesApi> beneficiariesApi, Provider<BeneficiaryDetailDao> dao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.beneficiariesApi = beneficiariesApi;
        this.dao = dao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public BeneficiaryDetailStore get() {
        Companion companion = INSTANCE;
        BeneficiariesApi beneficiariesApi = this.beneficiariesApi.get();
        Intrinsics.checkNotNullExpressionValue(beneficiariesApi, "get(...)");
        BeneficiaryDetailDao beneficiaryDetailDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(beneficiaryDetailDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(beneficiariesApi, beneficiaryDetailDao, storeBundle);
    }

    /* compiled from: BeneficiaryDetailStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore_Factory;", "beneficiariesApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/beneficiaries/api/BeneficiariesApi;", "dao", "Lcom/robinhood/android/beneficiaries/models/dao/BeneficiaryDetailDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BeneficiaryDetailStore_Factory create(Provider<BeneficiariesApi> beneficiariesApi, Provider<BeneficiaryDetailDao> dao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new BeneficiaryDetailStore_Factory(beneficiariesApi, dao, storeBundle);
        }

        @JvmStatic
        public final BeneficiaryDetailStore newInstance(BeneficiariesApi beneficiariesApi, BeneficiaryDetailDao dao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(beneficiariesApi, "beneficiariesApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new BeneficiaryDetailStore(beneficiariesApi, dao, storeBundle);
        }
    }
}
