package com.robinhood.android.p273ui.login.app;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.p273ui.BaseLogoutActivity;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.auth.Logout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogoutActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/LogoutActivity;", "Lcom/robinhood/android/ui/BaseLogoutActivity;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "Companion", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LogoutActivity extends Hammer_LogoutActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public AuthManager authManager;
    public Navigator navigator;

    public LogoutActivity() {
        super(null);
    }

    @Override // com.robinhood.android.p273ui.BaseLogoutActivity
    public AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseLogoutActivity
    public void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    @Override // com.robinhood.android.p273ui.BaseLogoutActivity
    public Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseLogoutActivity
    public void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* compiled from: LogoutActivity.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/LogoutActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/ui/login/app/LogoutActivity;", "Lcom/robinhood/shared/user/contracts/auth/Logout;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<LogoutActivity, Logout> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Logout getExtras(LogoutActivity logoutActivity) {
            return (Logout) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, logoutActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Logout logout) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, logout);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Logout key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return BaseLogoutActivity.INSTANCE.getIntent(context, LogoutActivity.class, key);
        }
    }
}
