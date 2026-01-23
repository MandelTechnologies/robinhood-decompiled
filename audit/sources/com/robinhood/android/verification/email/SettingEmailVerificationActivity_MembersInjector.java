package com.robinhood.android.verification.email;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingEmailVerificationActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SettingEmailVerificationActivity_MembersInjector implements MembersInjector<SettingEmailVerificationActivity> {
    private final Provider<ScreenProtectManager> screenProtectManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SettingEmailVerificationActivity> create(Provider<BaseActivitySingletons> provider, Provider<UserStore> provider2, Provider<ScreenProtectManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectScreenProtectManager(SettingEmailVerificationActivity settingEmailVerificationActivity, ScreenProtectManager screenProtectManager) {
        INSTANCE.injectScreenProtectManager(settingEmailVerificationActivity, screenProtectManager);
    }

    @JvmStatic
    public static final void injectUserStore(SettingEmailVerificationActivity settingEmailVerificationActivity, UserStore userStore) {
        INSTANCE.injectUserStore(settingEmailVerificationActivity, userStore);
    }

    public SettingEmailVerificationActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<UserStore> userStore, Provider<ScreenProtectManager> screenProtectManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
        this.singletons = singletons;
        this.userStore = userStore;
        this.screenProtectManager = screenProtectManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SettingEmailVerificationActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion2.injectUserStore(instance, userStore);
        ScreenProtectManager screenProtectManager = this.screenProtectManager.get();
        Intrinsics.checkNotNullExpressionValue(screenProtectManager, "get(...)");
        companion2.injectScreenProtectManager(instance, screenProtectManager);
    }

    /* compiled from: SettingEmailVerificationActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/verification/email/SettingEmailVerificationActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "injectUserStore", "", "instance", "injectScreenProtectManager", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SettingEmailVerificationActivity> create(Provider<BaseActivitySingletons> singletons, Provider<UserStore> userStore, Provider<ScreenProtectManager> screenProtectManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            return new SettingEmailVerificationActivity_MembersInjector(singletons, userStore, screenProtectManager);
        }

        @JvmStatic
        public final void injectUserStore(SettingEmailVerificationActivity instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }

        @JvmStatic
        public final void injectScreenProtectManager(SettingEmailVerificationActivity instance, ScreenProtectManager screenProtectManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            instance.setScreenProtectManager(screenProtectManager);
        }
    }
}
