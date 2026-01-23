package com.robinhood.android.p273ui.login.app;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.p273ui.BaseReLoginActivity_MembersInjector;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReLoginActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/ReLoginActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/login/app/ReLoginActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ReLoginActivity_MembersInjector implements MembersInjector<ReLoginActivity> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<StringPreference> userUuidPref;

    @JvmStatic
    public static final MembersInjector<ReLoginActivity> create(Provider<BaseActivitySingletons> provider, Provider<AuthManager> provider2, Provider<StringPreference> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @UserUuidPref
    @JvmStatic
    public static final void injectUserUuidPref(ReLoginActivity reLoginActivity, StringPreference stringPreference) {
        INSTANCE.injectUserUuidPref(reLoginActivity, stringPreference);
    }

    public ReLoginActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<AuthManager> authManager, Provider<StringPreference> userUuidPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        this.singletons = singletons;
        this.authManager = authManager;
        this.userUuidPref = userUuidPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReLoginActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        BaseReLoginActivity_MembersInjector.Companion companion2 = BaseReLoginActivity_MembersInjector.INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
        Companion companion3 = INSTANCE;
        StringPreference stringPreference = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion3.injectUserUuidPref(instance, stringPreference);
    }

    /* compiled from: ReLoginActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/ReLoginActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/login/app/ReLoginActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "injectUserUuidPref", "", "instance", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ReLoginActivity> create(Provider<BaseActivitySingletons> singletons, Provider<AuthManager> authManager, Provider<StringPreference> userUuidPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            return new ReLoginActivity_MembersInjector(singletons, authManager, userUuidPref);
        }

        @UserUuidPref
        @JvmStatic
        public final void injectUserUuidPref(ReLoginActivity instance, StringPreference userUuidPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            instance.setUserUuidPref(userUuidPref);
        }
    }
}
