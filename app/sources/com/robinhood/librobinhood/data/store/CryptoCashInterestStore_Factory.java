package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.dao.CryptoCashInterestDao;
import com.robinhood.models.crypto.dao.CryptoCashInterestPaymentDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import moneytree.p510v1.InterestService;
import moneytree.p510v1.MembershipService;

/* compiled from: CryptoCashInterestStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "membershipService", "Ljavax/inject/Provider;", "Lmoneytree/v1/MembershipService;", "interestService", "Lmoneytree/v1/InterestService;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoCashInterestDao;", "interestPaymentDao", "Lcom/robinhood/models/crypto/dao/CryptoCashInterestPaymentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoCashInterestStore_Factory implements Factory<CryptoCashInterestStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoCashInterestDao> dao;
    private final Provider<CryptoCashInterestPaymentDao> interestPaymentDao;
    private final Provider<InterestService> interestService;
    private final Provider<MembershipService> membershipService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoCashInterestStore_Factory create(Provider<MembershipService> provider, Provider<InterestService> provider2, Provider<CryptoCashInterestDao> provider3, Provider<CryptoCashInterestPaymentDao> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoCashInterestStore newInstance(MembershipService membershipService, InterestService interestService, CryptoCashInterestDao cryptoCashInterestDao, CryptoCashInterestPaymentDao cryptoCashInterestPaymentDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(membershipService, interestService, cryptoCashInterestDao, cryptoCashInterestPaymentDao, storeBundle);
    }

    public CryptoCashInterestStore_Factory(Provider<MembershipService> membershipService, Provider<InterestService> interestService, Provider<CryptoCashInterestDao> dao, Provider<CryptoCashInterestPaymentDao> interestPaymentDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(membershipService, "membershipService");
        Intrinsics.checkNotNullParameter(interestService, "interestService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(interestPaymentDao, "interestPaymentDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.membershipService = membershipService;
        this.interestService = interestService;
        this.dao = dao;
        this.interestPaymentDao = interestPaymentDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoCashInterestStore get() {
        Companion companion = INSTANCE;
        MembershipService membershipService = this.membershipService.get();
        Intrinsics.checkNotNullExpressionValue(membershipService, "get(...)");
        InterestService interestService = this.interestService.get();
        Intrinsics.checkNotNullExpressionValue(interestService, "get(...)");
        CryptoCashInterestDao cryptoCashInterestDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCashInterestDao, "get(...)");
        CryptoCashInterestPaymentDao cryptoCashInterestPaymentDao = this.interestPaymentDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCashInterestPaymentDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(membershipService, interestService, cryptoCashInterestDao, cryptoCashInterestPaymentDao, storeBundle);
    }

    /* compiled from: CryptoCashInterestStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore_Factory;", "membershipService", "Ljavax/inject/Provider;", "Lmoneytree/v1/MembershipService;", "interestService", "Lmoneytree/v1/InterestService;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoCashInterestDao;", "interestPaymentDao", "Lcom/robinhood/models/crypto/dao/CryptoCashInterestPaymentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoCashInterestStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoCashInterestStore_Factory create(Provider<MembershipService> membershipService, Provider<InterestService> interestService, Provider<CryptoCashInterestDao> dao, Provider<CryptoCashInterestPaymentDao> interestPaymentDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(membershipService, "membershipService");
            Intrinsics.checkNotNullParameter(interestService, "interestService");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(interestPaymentDao, "interestPaymentDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoCashInterestStore_Factory(membershipService, interestService, dao, interestPaymentDao, storeBundle);
        }

        @JvmStatic
        public final CryptoCashInterestStore newInstance(MembershipService membershipService, InterestService interestService, CryptoCashInterestDao dao, CryptoCashInterestPaymentDao interestPaymentDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(membershipService, "membershipService");
            Intrinsics.checkNotNullParameter(interestService, "interestService");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(interestPaymentDao, "interestPaymentDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoCashInterestStore(membershipService, interestService, dao, interestPaymentDao, storeBundle);
        }
    }
}
