package com.robinhood.shared.login.lockscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import com.robinhood.android.authlock.biometric.BiometricManagerCompat;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.security.contracts.SetLockscreen;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.shared.login.lockscreen.SetPinFragment;
import com.robinhood.shared.security.prompts.ExcludedFromPromptsFetching;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks;
import com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks2;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetLockscreenActivity.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001'B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/SetLockscreenActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/shared/login/lockscreen/SetPinFragment$Callbacks;", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "Lcom/robinhood/shared/security/prompts/ExcludedFromPromptsFetching;", "<init>", "()V", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "getLockscreenManager", "()Lcom/robinhood/android/util/LockscreenManager;", "setLockscreenManager", "(Lcom/robinhood/android/util/LockscreenManager;)V", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "getLockscreenOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "setLockscreenOverlay", "(Lcom/robinhood/scarlet/ScarletOverlay;)V", SetLockscreenActivity.EXTRA_LAUNCH_MODE, "Lcom/robinhood/android/security/contracts/SetLockscreen$LockscreenLaunchMode;", "getLaunchMode", "()Lcom/robinhood/android/security/contracts/SetLockscreen$LockscreenLaunchMode;", "launchMode$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackupAuthenticationSelected", "onAuthenticated", "authenticationType", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationType;", "onAuthenticationFailed", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SetLockscreenActivity extends BaseActivity implements SetPinFragment.Callbacks, AuthenticationCallbacks, ExcludedFromPromptsFetching {
    private static final String EXTRA_LAUNCH_MODE = "launchMode";

    /* renamed from: launchMode$delegate, reason: from kotlin metadata */
    private final Lazy launchMode;
    public LockscreenManager lockscreenManager;

    @LockscreenScarletOverlay
    public ScarletOverlay lockscreenOverlay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SetLockscreenActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SetLockscreen.LockscreenLaunchMode.values().length];
            try {
                iArr[SetLockscreen.LockscreenLaunchMode.LAUNCH_BIOMETRICS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SetLockscreen.LockscreenLaunchMode.LAUNCH_PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks
    public void onAuthenticationFailed(AuthenticationCallbacks2 authenticationType) {
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public SetLockscreenActivity() {
        super(C11048R.layout.parent_fragment_container);
        this.launchMode = Activity.intentExtra(this, EXTRA_LAUNCH_MODE);
    }

    public final LockscreenManager getLockscreenManager() {
        LockscreenManager lockscreenManager = this.lockscreenManager;
        if (lockscreenManager != null) {
            return lockscreenManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenManager");
        return null;
    }

    public final void setLockscreenManager(LockscreenManager lockscreenManager) {
        Intrinsics.checkNotNullParameter(lockscreenManager, "<set-?>");
        this.lockscreenManager = lockscreenManager;
    }

    public final ScarletOverlay getLockscreenOverlay() {
        ScarletOverlay scarletOverlay = this.lockscreenOverlay;
        if (scarletOverlay != null) {
            return scarletOverlay;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockscreenOverlay");
        return null;
    }

    public final void setLockscreenOverlay(ScarletOverlay scarletOverlay) {
        Intrinsics.checkNotNullParameter(scarletOverlay, "<set-?>");
        this.lockscreenOverlay = scarletOverlay;
    }

    private final SetLockscreen.LockscreenLaunchMode getLaunchMode() {
        return (SetLockscreen.LockscreenLaunchMode) this.launchMode.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Fragment fragmentNewInstance;
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(getLockscreenOverlay(), Boolean.FALSE);
        if (savedInstanceState == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[getLaunchMode().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    fragmentNewInstance = SetPinFragment.INSTANCE.newInstance();
                } else {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(getLaunchMode());
                    throw new ExceptionsH();
                }
            } else if (BiometricManagerCompat.INSTANCE.from(this).canAuthenticate() == BiometricManagerCompat.Status.SUCCESS) {
                fragmentNewInstance = BiometricAuthFragment.INSTANCE.newInstance(true);
            } else {
                fragmentNewInstance = SetPinFragment.INSTANCE.newInstance();
            }
            setFragment(C11048R.id.fragment_container, fragmentNewInstance);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        supportActionBar.setDisplayHomeAsUpEnabled(false);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks
    public void onBackupAuthenticationSelected() {
        replaceFragment(SetPinFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.shared.login.lockscreen.SetPinFragment.Callbacks
    public void onAuthenticated() {
        getLockscreenManager().unlock();
        finish();
    }

    @Override // com.robinhood.shared.user.contracts.auth.AuthenticationCallbacks
    public void onAuthenticated(AuthenticationCallbacks2 authenticationType) {
        onAuthenticated();
    }

    /* compiled from: SetLockscreenActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/SetLockscreenActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/security/contracts/SetLockscreen;", "<init>", "()V", "EXTRA_LAUNCH_MODE", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<SetLockscreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, SetLockscreen key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) SetLockscreenActivity.class);
            intent.putExtra(SetLockscreenActivity.EXTRA_LAUNCH_MODE, key.getLaunchMode());
            return intent;
        }
    }
}
