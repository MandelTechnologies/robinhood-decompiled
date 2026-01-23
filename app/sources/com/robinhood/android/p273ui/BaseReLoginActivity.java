package com.robinhood.android.p273ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseReLoginActivity.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u001aH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u001a8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/ui/BaseReLoginActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "getUserUuidPref", "()Lcom/robinhood/prefs/StringPreference;", "setUserUuidPref", "(Lcom/robinhood/prefs/StringPreference;)V", "currentUserId", "", "getCurrentUserId", "()Ljava/lang/String;", "currentUserId$delegate", "Lkotlin/Lazy;", "username", "getUsername", "username$delegate", "routeToSignup", "", "getRouteToSignup", "()Z", "routeToSignup$delegate", "postLogoutParcelables", "", "Landroid/os/Parcelable;", "getPostLogoutParcelables", "()[Landroid/os/Parcelable;", "postLogoutParcelables$delegate", "postLogoutIntents", "", "Landroid/content/Intent;", "getPostLogoutIntents", "()Ljava/util/List;", "reLoginIntents", "getReLoginIntents", "()[Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requiresAuthentication", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseReLoginActivity extends BaseActivity {
    public static final String EXTRA_RE_LOGIN_POST_LOGOUT_INTENTS = "reLoginPostLogoutIntents";
    public static final String EXTRA_RE_LOGIN_ROUTE_TO_SIGNUP = "reLoginRouteToSignup";
    public static final String EXTRA_RE_LOGIN_USERNAME = "reLoginUsername";
    public static final String EXTRA_RE_LOGIN_UUID = "reLoginUuid";
    public AuthManager authManager;
    public static final int $stable = 8;

    /* renamed from: currentUserId$delegate, reason: from kotlin metadata */
    private final Lazy currentUserId = Activity.intentExtra(this, EXTRA_RE_LOGIN_UUID);

    /* renamed from: username$delegate, reason: from kotlin metadata */
    private final Lazy username = Activity.intentExtra(this, EXTRA_RE_LOGIN_USERNAME, "");

    /* renamed from: routeToSignup$delegate, reason: from kotlin metadata */
    private final Lazy routeToSignup = Activity.intentExtra(this, EXTRA_RE_LOGIN_ROUTE_TO_SIGNUP, Boolean.FALSE);

    /* renamed from: postLogoutParcelables$delegate, reason: from kotlin metadata */
    private final Lazy postLogoutParcelables = Activity.intentExtra(this, EXTRA_RE_LOGIN_POST_LOGOUT_INTENTS, new Parcelable[0]);

    public abstract StringPreference getUserUuidPref();

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public abstract void setUserUuidPref(StringPreference stringPreference);

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    protected final String getCurrentUserId() {
        return (String) this.currentUserId.getValue();
    }

    protected final String getUsername() {
        return (String) this.username.getValue();
    }

    protected final boolean getRouteToSignup() {
        return ((Boolean) this.routeToSignup.getValue()).booleanValue();
    }

    protected final Parcelable[] getPostLogoutParcelables() {
        return (Parcelable[]) this.postLogoutParcelables.getValue();
    }

    protected final List<Intent> getPostLogoutIntents() {
        Parcelable[] postLogoutParcelables = getPostLogoutParcelables();
        ArrayList arrayList = new ArrayList(postLogoutParcelables.length);
        for (Parcelable parcelable : postLogoutParcelables) {
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type android.content.Intent");
            arrayList.add((Intent) parcelable);
        }
        return arrayList;
    }

    public Intent[] getReLoginIntents() {
        IntentKey login;
        Intent[] intentArr = {Navigator.DefaultImpls.createIntent$default(getNavigator(), this, WelcomeIntentKey.INSTANCE, null, false, 12, null)};
        if (!getPostLogoutIntents().isEmpty()) {
            return (Intent[]) ArraysKt.plus((Object[]) intentArr, (Collection) getPostLogoutIntents());
        }
        Navigator navigator = getNavigator();
        if (getRouteToSignup()) {
            login = new UserCreation(null, null, null, null, null, false, 63, null);
        } else {
            login = new Login(getUsername(), null, false, 6, null);
        }
        return (Intent[]) ArraysKt.plus(intentArr, Navigator.DefaultImpls.createIntent$default(navigator, this, login, null, false, 12, null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getAuthManager().isLoggedIn()) {
            if (getCurrentUserId() != null && Intrinsics.areEqual(getCurrentUserId(), getUserUuidPref().get())) {
                getAuthManager().initiateLogout(this, LogoutType.USER_INITIATED, (getUsername().length() != 0 || getPostLogoutIntents().isEmpty()) ? getUsername() : null, getRouteToSignup(), getPostLogoutIntents(), "relogin");
            }
        } else {
            startActivities(getReLoginIntents());
        }
        finish();
    }
}
