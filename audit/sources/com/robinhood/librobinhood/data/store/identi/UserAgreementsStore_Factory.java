package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserAgreementsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "isConvertedPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class UserAgreementsStore_Factory implements Factory<UserAgreementsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Identi> identi;
    private final Provider<BooleanPreference> isConvertedPref;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserInfoStore> userInfoStore;

    @JvmStatic
    public static final UserAgreementsStore_Factory create(Provider<BooleanPreference> provider, Provider<UserInfoStore> provider2, Provider<Identi> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final UserAgreementsStore newInstance(BooleanPreference booleanPreference, UserInfoStore userInfoStore, Identi identi2, StoreBundle storeBundle) {
        return INSTANCE.newInstance(booleanPreference, userInfoStore, identi2, storeBundle);
    }

    public UserAgreementsStore_Factory(Provider<BooleanPreference> isConvertedPref, Provider<UserInfoStore> userInfoStore, Provider<Identi> identi2, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
        Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.isConvertedPref = isConvertedPref;
        this.userInfoStore = userInfoStore;
        this.identi = identi2;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public UserAgreementsStore get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.isConvertedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        UserInfoStore userInfoStore = this.userInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(userInfoStore, "get(...)");
        Identi identi2 = this.identi.get();
        Intrinsics.checkNotNullExpressionValue(identi2, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(booleanPreference, userInfoStore, identi2, storeBundle);
    }

    /* compiled from: UserAgreementsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore_Factory;", "isConvertedPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UserAgreementsStore_Factory create(Provider<BooleanPreference> isConvertedPref, Provider<UserInfoStore> userInfoStore, Provider<Identi> identi2, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
            Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new UserAgreementsStore_Factory(isConvertedPref, userInfoStore, identi2, storeBundle);
        }

        @JvmStatic
        public final UserAgreementsStore newInstance(BooleanPreference isConvertedPref, UserInfoStore userInfoStore, Identi identi2, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
            Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
            Intrinsics.checkNotNullParameter(identi2, "identi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new UserAgreementsStore(isConvertedPref, userInfoStore, identi2, storeBundle);
        }
    }
}
