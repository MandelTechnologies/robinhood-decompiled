package com.robinhood.shared.login.passwordreset;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasswordResetDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/login/passwordreset/PasswordResetStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PasswordResetDuxo_Factory implements Factory<PasswordResetDuxo> {
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<PasswordResetStateProvider> stateProvider;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PasswordResetDuxo_Factory create(Provider<AppType> provider, Provider<UserStore> provider2, Provider<AuthManager> provider3, Provider<SuvWorkflowManager> provider4, Provider<DuxoBundle> provider5, Provider<PasswordResetStateProvider> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PasswordResetDuxo newInstance(AppType appType, UserStore userStore, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle, PasswordResetStateProvider passwordResetStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(appType, userStore, authManager, suvWorkflowManager, duxoBundle, passwordResetStateProvider, savedStateHandle);
    }

    public PasswordResetDuxo_Factory(Provider<AppType> appType, Provider<UserStore> userStore, Provider<AuthManager> authManager, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<DuxoBundle> duxoBundle, Provider<PasswordResetStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.appType = appType;
        this.userStore = userStore;
        this.authManager = authManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public PasswordResetDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        PasswordResetStateProvider passwordResetStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(passwordResetStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(appType, userStore, authManager, suvWorkflowManager, duxoBundle, passwordResetStateProvider, savedStateHandle);
    }

    /* compiled from: PasswordResetDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/login/passwordreset/PasswordResetStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PasswordResetDuxo_Factory create(Provider<AppType> appType, Provider<UserStore> userStore, Provider<AuthManager> authManager, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<DuxoBundle> duxoBundle, Provider<PasswordResetStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PasswordResetDuxo_Factory(appType, userStore, authManager, suvWorkflowManager, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final PasswordResetDuxo newInstance(AppType appType, UserStore userStore, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle, PasswordResetStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PasswordResetDuxo(appType, userStore, authManager, suvWorkflowManager, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
