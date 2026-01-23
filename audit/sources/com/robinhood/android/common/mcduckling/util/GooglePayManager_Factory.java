package com.robinhood.android.common.mcduckling.util;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/util/GooglePayManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GooglePayManager_Factory implements Factory<GooglePayManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AddressStore> addressStore;
    private final Provider<Application> application;
    private final Provider<Minerva> minerva;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<ProfileInfoStore> profileInfoStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final GooglePayManager_Factory create(Provider<Application> provider, Provider<Minerva> provider2, Provider<PaymentCardStore> provider3, Provider<ProfileInfoStore> provider4, Provider<AddressStore> provider5, Provider<UserStore> provider6, Provider<RxFactory> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final GooglePayManager newInstance(Application application, Minerva minerva, PaymentCardStore paymentCardStore, ProfileInfoStore profileInfoStore, AddressStore addressStore, UserStore userStore, RxFactory rxFactory) {
        return INSTANCE.newInstance(application, minerva, paymentCardStore, profileInfoStore, addressStore, userStore, rxFactory);
    }

    public GooglePayManager_Factory(Provider<Application> application, Provider<Minerva> minerva, Provider<PaymentCardStore> paymentCardStore, Provider<ProfileInfoStore> profileInfoStore, Provider<AddressStore> addressStore, Provider<UserStore> userStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.application = application;
        this.minerva = minerva;
        this.paymentCardStore = paymentCardStore;
        this.profileInfoStore = profileInfoStore;
        this.addressStore = addressStore;
        this.userStore = userStore;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public GooglePayManager get() {
        Companion companion = INSTANCE;
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Minerva minerva = this.minerva.get();
        Intrinsics.checkNotNullExpressionValue(minerva, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        AddressStore addressStore = this.addressStore.get();
        Intrinsics.checkNotNullExpressionValue(addressStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(application, minerva, paymentCardStore, profileInfoStore, addressStore, userStore, rxFactory);
    }

    /* compiled from: GooglePayManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/util/GooglePayManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager_Factory;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GooglePayManager_Factory create(Provider<Application> application, Provider<Minerva> minerva, Provider<PaymentCardStore> paymentCardStore, Provider<ProfileInfoStore> profileInfoStore, Provider<AddressStore> addressStore, Provider<UserStore> userStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(addressStore, "addressStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new GooglePayManager_Factory(application, minerva, paymentCardStore, profileInfoStore, addressStore, userStore, rxFactory);
        }

        @JvmStatic
        public final GooglePayManager newInstance(Application application, Minerva minerva, PaymentCardStore paymentCardStore, ProfileInfoStore profileInfoStore, AddressStore addressStore, UserStore userStore, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(addressStore, "addressStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new GooglePayManager(application, minerva, paymentCardStore, profileInfoStore, addressStore, userStore, rxFactory);
        }
    }
}
