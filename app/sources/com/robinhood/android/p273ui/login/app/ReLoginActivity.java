package com.robinhood.android.p273ui.login.app;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.p273ui.BaseReLoginActivity;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.shared.user.contracts.auth.ReLogin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReLoginActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/ReLoginActivity;", "Lcom/robinhood/android/ui/BaseReLoginActivity;", "<init>", "()V", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "getUserUuidPref", "()Lcom/robinhood/prefs/StringPreference;", "setUserUuidPref", "(Lcom/robinhood/prefs/StringPreference;)V", "Companion", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ReLoginActivity extends BaseReLoginActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @UserUuidPref
    public StringPreference userUuidPref;

    @Override // com.robinhood.android.p273ui.BaseReLoginActivity
    public StringPreference getUserUuidPref() {
        StringPreference stringPreference = this.userUuidPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userUuidPref");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseReLoginActivity
    public void setUserUuidPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.userUuidPref = stringPreference;
    }

    /* compiled from: ReLoginActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/ReLoginActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/user/contracts/auth/ReLogin;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<ReLogin> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ReLogin key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) ReLoginActivity.class);
            intent.putExtra(BaseReLoginActivity.EXTRA_RE_LOGIN_USERNAME, key.getUsername());
            intent.putExtra(BaseReLoginActivity.EXTRA_RE_LOGIN_UUID, key.getCurrentUserId());
            intent.putExtra(BaseReLoginActivity.EXTRA_RE_LOGIN_ROUTE_TO_SIGNUP, key.getRouteToSignup());
            intent.putExtra(BaseReLoginActivity.EXTRA_RE_LOGIN_POST_LOGOUT_INTENTS, key.getPostLogoutIntents());
            return intent;
        }
    }
}
