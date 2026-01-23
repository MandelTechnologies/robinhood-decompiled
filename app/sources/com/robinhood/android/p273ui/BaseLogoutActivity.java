package com.robinhood.android.p273ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import androidx.view.EdgeToEdge;
import androidx.view.SystemBarStyle;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.view.LoadingView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.p370rx.delay.MinTimeInFlightTransformer;
import com.robinhood.shared.login.lib.C39090R;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.Logout;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.Consumers;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* compiled from: BaseLogoutActivity.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u0000 02\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0015J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0015J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0016H\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0016H\u0002J\u001a\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u0016H\u0002J\b\u0010.\u001a\u00020\u001fH\u0017R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/ui/BaseLogoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "basePostLogoutIntents", "", "Landroid/content/Intent;", "getBasePostLogoutIntents", "()Ljava/util/List;", "<set-?>", "", "hasMadeLogoutCall", "getHasMadeLogoutCall", "()Z", "setHasMadeLogoutCall", "(Z)V", "hasMadeLogoutCall$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initEdgeToEdge", "onResume", "setRequestedOrientation", "requestedOrientation", "", "setTheme", "isDay", "setLoadingViewColor", "onFinishLogout", "username", "", "routeToSignUp", "onBackPressed", "LogoutActivityException", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseLogoutActivity extends Hammer_BaseLogoutActivity {

    /* renamed from: hasMadeLogoutCall$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasMadeLogoutCall;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseLogoutActivity.class, "hasMadeLogoutCall", "getHasMadeLogoutCall()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public abstract AuthManager getAuthManager();

    public abstract Navigator getNavigator();

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
    }

    public abstract void setAuthManager(AuthManager authManager);

    public abstract void setNavigator(Navigator navigator);

    public BaseLogoutActivity() {
        super(C39090R.layout.activity_logout, null);
        this.hasMadeLogoutCall = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
    }

    protected List<Intent> getBasePostLogoutIntents() {
        return CollectionsKt.listOf(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, WelcomeIntentKey.INSTANCE, null, false, 12, null));
    }

    private final boolean getHasMadeLogoutCall() {
        return ((Boolean) this.hasMadeLogoutCall.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setHasMadeLogoutCall(boolean z) {
        this.hasMadeLogoutCall.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    protected void onCreate(Bundle savedInstanceState) {
        CrashReporter.INSTANCE.log("BaseLogoutActivity created");
        Companion companion = INSTANCE;
        setTheme(((Logout) companion.getExtras((Activity) this)).getIsDay());
        setRequestedOrientation(1);
        super.onCreate(savedInstanceState);
        initEdgeToEdge();
        setLoadingViewColor(((Logout) companion.getExtras((Activity) this)).getIsDay());
    }

    private final void initEdgeToEdge() {
        SystemBarStyle systemBarStyleDark;
        if (((Logout) INSTANCE.getExtras((Activity) this)).getIsDay()) {
            systemBarStyleDark = SystemBarStyle.INSTANCE.light(0, 0);
        } else {
            systemBarStyleDark = SystemBarStyle.INSTANCE.dark(0);
        }
        EdgeToEdge.enable(this, systemBarStyleDark, systemBarStyleDark);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @SuppressLint({"CheckResult"})
    protected void onResume() {
        super.onResume();
        if (getHasMadeLogoutCall()) {
            Timber.INSTANCE.mo3356i("Already made logout call", new Object[0]);
            return;
        }
        setHasMadeLogoutCall(true);
        CrashReporter.Companion companion = CrashReporter.INSTANCE;
        CrashReporter.DefaultImpls.reportNonFatal$default(companion, new LogoutActivityException("Ready to make logout call."), false, null, 4, null);
        Timber.INSTANCE.mo3356i("Making logout call.", new Object[0]);
        Completable completableCompose = getAuthManager().logout(((Logout) INSTANCE.getExtras((Activity) this)).getType()).compose(new MinTimeInFlightTransformer(1000L));
        Intrinsics.checkNotNullExpressionValue(completableCompose, "compose(...)");
        CompletablesAndroid.observeOnMainThread(completableCompose).subscribe(new Action() { // from class: com.robinhood.android.ui.BaseLogoutActivity.onResume.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseLogoutActivity baseLogoutActivity = BaseLogoutActivity.this;
                Companion companion2 = BaseLogoutActivity.INSTANCE;
                baseLogoutActivity.onFinishLogout(((Logout) companion2.getExtras((Activity) baseLogoutActivity)).getUsername(), ((Logout) companion2.getExtras((Activity) BaseLogoutActivity.this)).getRouteToSignup());
            }
        }, Consumers.onError());
        companion.log("Made logout call.");
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                super.setRequestedOrientation(requestedOrientation);
            } catch (IllegalStateException unused) {
            }
        } else {
            super.setRequestedOrientation(requestedOrientation);
        }
    }

    private final void setTheme(boolean isDay) {
        if (isDay) {
            setTheme(C39090R.style.Theme_RobinhoodLegacy_Logout_Day);
            getWindow().setBackgroundDrawable(new ColorDrawable(getColor(C20690R.color.mobius_white)));
        } else {
            setTheme(C39090R.style.Theme_RobinhoodLegacy_Logout_Night);
            getWindow().setBackgroundDrawable(new ColorDrawable(getColor(C20690R.color.mobius_black)));
        }
    }

    private final void setLoadingViewColor(boolean isDay) {
        int i;
        LoadingView loadingView = (LoadingView) findViewById(C39090R.id.loading_view);
        if (isDay) {
            i = C20690R.color.mobius_black;
        } else {
            i = C20690R.color.robinhood_neon;
        }
        loadingView.setColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishLogout(String username, boolean routeToSignUp) {
        CrashReporter.Companion companion = CrashReporter.INSTANCE;
        companion.log("Logout request completed, ready to navigate to post logout activities");
        List<Intent> postLogoutIntents = ((Logout) INSTANCE.getExtras((Activity) this)).getPostLogoutIntents();
        List mutableList = CollectionsKt.toMutableList((Collection) getBasePostLogoutIntents());
        if (routeToSignUp) {
            mutableList.add(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new UserCreation(null, null, null, null, null, false, 63, null), null, false, 12, null));
        } else if (username != null) {
            Navigator navigator = getNavigator();
            if (StringsKt.isBlank(username)) {
                username = null;
            }
            mutableList.add(Navigator.DefaultImpls.createIntent$default(navigator, this, new Login(username, null, false, 6, null), null, false, 12, null));
        } else {
            List<Intent> list = postLogoutIntents;
            if (!list.isEmpty()) {
                mutableList.addAll(list);
            }
        }
        companion.log("Starting post logout activities");
        startActivities((Intent[]) mutableList.toArray(new Intent[0]));
        overridePendingTransition(0, 0);
        finish();
        CrashReporter.DefaultImpls.reportNonFatal$default(companion, new LogoutActivityException("BaseLogoutActivity scheduled to finish"), false, null, 4, null);
    }

    /* compiled from: BaseLogoutActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/ui/BaseLogoutActivity$LogoutActivityException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LogoutActivityException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoutActivityException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: BaseLogoutActivity.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0003¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/ui/BaseLogoutActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/ui/BaseLogoutActivity;", "Lcom/robinhood/shared/user/contracts/auth/Logout;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "activityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "key", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<BaseLogoutActivity, Logout> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Logout getExtras(BaseLogoutActivity baseLogoutActivity) {
            return (Logout) ActivityCompanion3.DefaultImpls.getExtras(this, baseLogoutActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Logout logout) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, logout);
        }

        public final Intent getIntent(Context context, Class<? extends Activity> activityClass, Logout key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(activityClass, "activityClass");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, activityClass).putExtra("ActivityCompanion_Extras", key);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            intentPutExtra.setFlags(872415232);
            return intentPutExtra;
        }
    }
}
