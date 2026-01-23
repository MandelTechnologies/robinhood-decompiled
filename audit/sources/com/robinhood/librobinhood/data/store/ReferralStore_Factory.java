package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.models.dao.ReferralDao;
import com.robinhood.referral.api.ContactsApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ReferralStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "referralApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/referral/ReferralApi;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ReferralDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ReferralStore_Factory implements Factory<ReferralStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ContactsApi> contactsApi;
    private final Provider<ReferralDao> dao;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<ReferralApi> referralApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final ReferralStore_Factory create(Provider<ReferralApi> provider, Provider<ContactsApi> provider2, Provider<ExperimentsStore> provider3, Provider<StoreBundle> provider4, Provider<ReferralDao> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final ReferralStore newInstance(ReferralApi referralApi, ContactsApi contactsApi, ExperimentsStore experimentsStore, StoreBundle storeBundle, ReferralDao referralDao) {
        return INSTANCE.newInstance(referralApi, contactsApi, experimentsStore, storeBundle, referralDao);
    }

    public ReferralStore_Factory(Provider<ReferralApi> referralApi, Provider<ContactsApi> contactsApi, Provider<ExperimentsStore> experimentsStore, Provider<StoreBundle> storeBundle, Provider<ReferralDao> dao) {
        Intrinsics.checkNotNullParameter(referralApi, "referralApi");
        Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.referralApi = referralApi;
        this.contactsApi = contactsApi;
        this.experimentsStore = experimentsStore;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public ReferralStore get() {
        Companion companion = INSTANCE;
        ReferralApi referralApi = this.referralApi.get();
        Intrinsics.checkNotNullExpressionValue(referralApi, "get(...)");
        ContactsApi contactsApi = this.contactsApi.get();
        Intrinsics.checkNotNullExpressionValue(contactsApi, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        ReferralDao referralDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(referralDao, "get(...)");
        return companion.newInstance(referralApi, contactsApi, experimentsStore, storeBundle, referralDao);
    }

    /* compiled from: ReferralStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ReferralStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/ReferralStore_Factory;", "referralApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/referral/ReferralApi;", "contactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ReferralDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "lib-store-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ReferralStore_Factory create(Provider<ReferralApi> referralApi, Provider<ContactsApi> contactsApi, Provider<ExperimentsStore> experimentsStore, Provider<StoreBundle> storeBundle, Provider<ReferralDao> dao) {
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new ReferralStore_Factory(referralApi, contactsApi, experimentsStore, storeBundle, dao);
        }

        @JvmStatic
        public final ReferralStore newInstance(ReferralApi referralApi, ContactsApi contactsApi, ExperimentsStore experimentsStore, StoreBundle storeBundle, ReferralDao dao) {
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            Intrinsics.checkNotNullParameter(contactsApi, "contactsApi");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new ReferralStore(referralApi, contactsApi, experimentsStore, storeBundle, dao);
        }
    }
}
