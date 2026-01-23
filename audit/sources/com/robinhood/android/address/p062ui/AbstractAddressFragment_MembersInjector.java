package com.robinhood.android.address.p062ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbstractAddressFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AbstractAddressFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/address/ui/AbstractAddressFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AbstractAddressFragment_MembersInjector implements MembersInjector<AbstractAddressFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AddressStore> addressStore;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ProfileInfoStore> profileInfoStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<UserInfoStore> userInfoStore;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final MembersInjector<AbstractAddressFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<UserStore> provider3, Provider<AddressStore> provider4, Provider<UserInfoStore> provider5, Provider<ProfileInfoStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAddressStore(AbstractAddressFragment abstractAddressFragment, AddressStore addressStore) {
        INSTANCE.injectAddressStore(abstractAddressFragment, addressStore);
    }

    @JvmStatic
    public static final void injectAnalytics(AbstractAddressFragment abstractAddressFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(abstractAddressFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectProfileInfoStore(AbstractAddressFragment abstractAddressFragment, ProfileInfoStore profileInfoStore) {
        INSTANCE.injectProfileInfoStore(abstractAddressFragment, profileInfoStore);
    }

    @JvmStatic
    public static final void injectUserInfoStore(AbstractAddressFragment abstractAddressFragment, UserInfoStore userInfoStore) {
        INSTANCE.injectUserInfoStore(abstractAddressFragment, userInfoStore);
    }

    @JvmStatic
    public static final void injectUserStore(AbstractAddressFragment abstractAddressFragment, UserStore userStore) {
        INSTANCE.injectUserStore(abstractAddressFragment, userStore);
    }

    public AbstractAddressFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<UserStore> userStore, Provider<AddressStore> addressStore, Provider<UserInfoStore> userInfoStore, Provider<ProfileInfoStore> profileInfoStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        this.singletons = singletons;
        this.analytics = analytics;
        this.userStore = userStore;
        this.addressStore = addressStore;
        this.userInfoStore = userInfoStore;
        this.profileInfoStore = profileInfoStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AbstractAddressFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion2.injectUserStore(instance, userStore);
        AddressStore addressStore = this.addressStore.get();
        Intrinsics.checkNotNullExpressionValue(addressStore, "get(...)");
        companion2.injectAddressStore(instance, addressStore);
        UserInfoStore userInfoStore = this.userInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(userInfoStore, "get(...)");
        companion2.injectUserInfoStore(instance, userInfoStore);
        ProfileInfoStore profileInfoStore = this.profileInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        companion2.injectProfileInfoStore(instance, profileInfoStore);
    }

    /* compiled from: AbstractAddressFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AbstractAddressFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/address/ui/AbstractAddressFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "injectAnalytics", "", "instance", "injectUserStore", "injectAddressStore", "injectUserInfoStore", "injectProfileInfoStore", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<AbstractAddressFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<UserStore> userStore, Provider<AddressStore> addressStore, Provider<UserInfoStore> userInfoStore, Provider<ProfileInfoStore> profileInfoStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(addressStore, "addressStore");
            Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            return new AbstractAddressFragment_MembersInjector(singletons, analytics, userStore, addressStore, userInfoStore, profileInfoStore);
        }

        @JvmStatic
        public final void injectAnalytics(AbstractAddressFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectUserStore(AbstractAddressFragment instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }

        @JvmStatic
        public final void injectAddressStore(AbstractAddressFragment instance, AddressStore addressStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(addressStore, "addressStore");
            instance.setAddressStore(addressStore);
        }

        @JvmStatic
        public final void injectUserInfoStore(AbstractAddressFragment instance, UserInfoStore userInfoStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
            instance.setUserInfoStore(userInfoStore);
        }

        @JvmStatic
        public final void injectProfileInfoStore(AbstractAddressFragment instance, ProfileInfoStore profileInfoStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            instance.setProfileInfoStore(profileInfoStore);
        }
    }
}
