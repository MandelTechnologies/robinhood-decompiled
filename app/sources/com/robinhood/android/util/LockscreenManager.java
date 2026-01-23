package com.robinhood.android.util;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.authlock.LockscreenExperiments;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.authlock.prefs.BiometricsChangedPref;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.security.contracts.Lockscreen;
import com.robinhood.android.security.contracts.SetLockscreen;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.DeviceSecurityConfig;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.LockscreenTimeoutPref;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.BiometricChangeLogoutDialogFragmentKey;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import dispatch.core.Launch;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import p479j$.time.Duration;

/* compiled from: LockscreenManager.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BBm\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0006\u00107\u001a\u000203J\b\u00108\u001a\u000203H\u0007J\u0010\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u0002032\u0006\u0010:\u001a\u00020=H\u0007J\u0010\u0010>\u001a\u0002032\u0006\u0010:\u001a\u00020=H\u0002J\u000e\u0010?\u001a\u000203H\u0082@¢\u0006\u0002\u0010@J\u000e\u0010A\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010@R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#R\u000e\u0010$\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/util/LockscreenManager;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "biometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/authlock/pin/PinManager;Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/utils/RhProcessLifecycleOwner;Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/navigation/Navigator;)V", "value", "", "locked", "setLocked", "(Z)V", "processLifecycleStopTime", "", "Ljava/lang/Long;", "isUsingExtendedTimeout", "lockState", "Lkotlinx/coroutines/flow/Flow;", "getLockState", "()Lkotlinx/coroutines/flow/Flow;", "_lockState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "isLocked", "()Z", "isLockSet", "securityConfigUpdateJob", "Lkotlinx/coroutines/Job;", "shouldRetryDeviceSecurityConfigUpdatedRequest", "getShouldRetryDeviceSecurityConfigUpdatedRequest", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "unlock", "lock", "onActivityResumed", "activity", "Landroid/app/Activity;", "handleLockscreenAndBiometricChange", "Lcom/robinhood/android/common/ui/BaseActivity;", "handleLockscreen", "sendDeviceSecurityConfigUpdatedRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoggedOutBiometricChangeKillswitch", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public class LockscreenManager implements ActivityLifecycleListener, RhProcessLifecycleOwner2 {
    private static final long LOGGED_OUT_BIOMETRIC_CHANGED_EXPERIMENT_TIMEOUT = 3000;
    public static final String SECURITY_CONFIG_BIOMETRICS = "biometrics";
    private final SharedFlow2<Boolean> _lockState;
    private final AuthManager authManager;
    private final BiometricAuthManager biometricAuthManager;
    private final BiometricChangeManager biometricChangeManager;
    private final StringPreference biometricsChangedPref;
    private final CoroutineScope coroutineScope;
    private final ExperimentsStore experimentsStore;
    private boolean isUsingExtendedTimeout;
    private boolean locked;
    private final EnumPreference<LockscreenTimeout> lockscreenTimeoutPref;
    private final Navigator navigator;
    private final PinManager pinManager;
    private Long processLifecycleStopTime;
    private final RhProcessLifecycleOwner rhProcessLifecycleOwner;
    private Job securityConfigUpdateJob;
    private final Sheriff sheriff;
    public static final int $stable = 8;

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "sendDeviceSecurityConfigUpdatedRequest")
    /* renamed from: com.robinhood.android.util.LockscreenManager$sendDeviceSecurityConfigUpdatedRequest$1 */
    /* loaded from: classes9.dex */
    static final class C313461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C313461(Continuation<? super C313461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LockscreenManager.this.sendDeviceSecurityConfigUpdatedRequest(this);
        }
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public LockscreenManager(@RootCoroutineScope CoroutineScope coroutineScope, PinManager pinManager, BiometricAuthManager biometricAuthManager, @LockscreenTimeoutPref EnumPreference<LockscreenTimeout> lockscreenTimeoutPref, RhProcessLifecycleOwner rhProcessLifecycleOwner, BiometricChangeManager biometricChangeManager, AuthManager authManager, Sheriff sheriff, @BiometricsChangedPref StringPreference biometricsChangedPref, ExperimentsStore experimentsStore, Navigator navigator) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.coroutineScope = coroutineScope;
        this.pinManager = pinManager;
        this.biometricAuthManager = biometricAuthManager;
        this.lockscreenTimeoutPref = lockscreenTimeoutPref;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.biometricChangeManager = biometricChangeManager;
        this.authManager = authManager;
        this.sheriff = sheriff;
        this.biometricsChangedPref = biometricsChangedPref;
        this.experimentsStore = experimentsStore;
        this.navigator = navigator;
        this._lockState = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        Launch.launchMainImmediate$default(coroutineScope, null, null, new C313381(null), 3, null);
    }

    private final void setLocked(boolean z) {
        this.locked = z;
        Launch.launchMainImmediate$default(this.coroutineScope, null, null, new LockscreenManager2(this, z, null), 3, null);
    }

    public final Flow<Boolean> getLockState() {
        return this._lockState;
    }

    public final boolean isLocked() {
        if (isLockSet()) {
            return this.locked;
        }
        return false;
    }

    private final boolean isLockSet() {
        return this.pinManager.isPinEnabled() || this.biometricAuthManager.isBiometricsAuthEnabled();
    }

    private final boolean getShouldRetryDeviceSecurityConfigUpdatedRequest() {
        if (!this.authManager.isLoggedIn()) {
            return false;
        }
        Job job = this.securityConfigUpdateJob;
        return (job == null || !job.isActive()) && this.biometricsChangedPref.mo23850isSet();
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$1", m3645f = "LockscreenManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$1 */
    static final class C313381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313381(Continuation<? super C313381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager.this.rhProcessLifecycleOwner.register(LockscreenManager.this);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Duration duration;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.isUsingExtendedTimeout) {
            duration = (Duration) RangesKt.coerceAtLeast(((LockscreenTimeout) this.lockscreenTimeoutPref.getValue()).getDuration(), this.rhProcessLifecycleOwner.getExtendedTimeoutDuration());
        } else {
            duration = ((LockscreenTimeout) this.lockscreenTimeoutPref.getValue()).getDuration();
        }
        Long l = this.processLifecycleStopTime;
        if (l == null) {
            setLocked(true);
        } else if (Duration.ofMillis(SystemClock.elapsedRealtime() - l.longValue()).compareTo(duration) >= 0) {
            setLocked(true);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.processLifecycleStopTime = Long.valueOf(SystemClock.elapsedRealtime());
        this.isUsingExtendedTimeout = this.rhProcessLifecycleOwner.isUsingExtendedTimeout();
    }

    public final void unlock() {
        setLocked(false);
    }

    public final void lock() {
        setLocked(true);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof BaseActivity) {
            handleLockscreenAndBiometricChange((BaseActivity) activity);
        }
    }

    public final void handleLockscreenAndBiometricChange(BaseActivity activity) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BiometricChangeManager.BiometricEnrollmentChange biometricChange = this.biometricChangeManager.getBiometricChange();
        if (this.biometricChangeManager.checkIfAllBiometricsAreRemoved()) {
            if (activity.requiresAuthentication()) {
                if (this.securityConfigUpdateJob == null) {
                    this.biometricsChangedPref.set(SECURITY_CONFIG_BIOMETRICS);
                    this.securityConfigUpdateJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313421(null), 3, null);
                }
                AuthManager.DefaultImpls.initiateLogout$default(this.authManager, activity, LogoutType.OTHER, null, false, CollectionsKt.listOf(Navigator.DefaultImpls.createIntentForDialogFragment$default(this.navigator, activity, BiometricChangeLogoutDialogFragmentKey.INSTANCE, null, 4, null)), "lockscreen_biometric_removed", 12, null);
            } else if (!this.biometricsChangedPref.mo23850isSet()) {
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313432(null), 3, null);
            }
            this.biometricChangeManager.deleteSecretKey();
            return;
        }
        if (biometricChange == BiometricChangeManager.BiometricEnrollmentChange.CHANGE_DETECTED) {
            if (activity.requiresAuthentication()) {
                if (this.securityConfigUpdateJob == null) {
                    this.biometricsChangedPref.set(SECURITY_CONFIG_BIOMETRICS);
                    this.securityConfigUpdateJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313443(null), 3, null);
                }
                AuthManager.DefaultImpls.initiateLogout$default(this.authManager, activity, LogoutType.OTHER, null, false, CollectionsKt.listOf(Navigator.DefaultImpls.createIntentForDialogFragment$default(this.navigator, activity, BiometricChangeLogoutDialogFragmentKey.INSTANCE, null, 4, null)), "lockscreen_biometric_change", 12, null);
            } else if (!this.biometricsChangedPref.mo23850isSet()) {
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313454(null), 3, null);
            }
            this.biometricChangeManager.deleteSecretKey();
            return;
        }
        if (biometricChange == BiometricChangeManager.BiometricEnrollmentChange.KEY_NOT_INITIALIZED && activity.requiresAuthentication() && this.biometricChangeManager.canAuthenticate()) {
            this.biometricChangeManager.generateSecretKey();
            handleLockscreen(activity);
        } else {
            handleLockscreen(activity);
        }
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$1", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$1 */
    /* loaded from: classes9.dex */
    static final class C313421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313421(Continuation<? super C313421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager lockscreenManager = LockscreenManager.this;
                this.label = 1;
                if (lockscreenManager.sendDeviceSecurityConfigUpdatedRequest(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$2", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$2 */
    /* loaded from: classes9.dex */
    static final class C313432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313432(Continuation<? super C313432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313432(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager lockscreenManager = LockscreenManager.this;
                this.label = 1;
                obj = lockscreenManager.getLoggedOutBiometricChangeKillswitch(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LockscreenManager.this.biometricsChangedPref.set(LockscreenManager.SECURITY_CONFIG_BIOMETRICS);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$3", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$3 */
    /* loaded from: classes9.dex */
    static final class C313443 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313443(Continuation<? super C313443> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313443(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313443) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager lockscreenManager = LockscreenManager.this;
                this.label = 1;
                if (lockscreenManager.sendDeviceSecurityConfigUpdatedRequest(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$4", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$handleLockscreenAndBiometricChange$4 */
    /* loaded from: classes9.dex */
    static final class C313454 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313454(Continuation<? super C313454> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313454(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313454) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager lockscreenManager = LockscreenManager.this;
                this.label = 1;
                obj = lockscreenManager.getLoggedOutBiometricChangeKillswitch(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LockscreenManager.this.biometricsChangedPref.set(LockscreenManager.SECURITY_CONFIG_BIOMETRICS);
            }
            return Unit.INSTANCE;
        }
    }

    private final void handleLockscreen(BaseActivity activity) {
        if (activity.requiresAuthentication() && activity.shouldPromptForLockscreen()) {
            this.pinManager.synchronizePins();
            if (!isLockSet()) {
                if (getShouldRetryDeviceSecurityConfigUpdatedRequest()) {
                    this.securityConfigUpdateJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313401(null), 3, null);
                }
                Navigator.DefaultImpls.startActivity$default(activity.getNavigator(), activity, new SetLockscreen(SetLockscreen.LockscreenLaunchMode.LAUNCH_BIOMETRICS), null, false, null, null, 60, null);
            } else if (isLocked()) {
                if (getShouldRetryDeviceSecurityConfigUpdatedRequest()) {
                    this.securityConfigUpdateJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313412(null), 3, null);
                }
                Navigator.DefaultImpls.startActivity$default(activity.getNavigator(), activity, new Lockscreen(false, 1, null), null, false, null, null, 60, null);
            }
        }
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$handleLockscreen$1", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$handleLockscreen$1 */
    /* loaded from: classes9.dex */
    static final class C313401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313401(Continuation<? super C313401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager lockscreenManager = LockscreenManager.this;
                this.label = 1;
                if (lockscreenManager.sendDeviceSecurityConfigUpdatedRequest(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$handleLockscreen$2", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$handleLockscreen$2 */
    /* loaded from: classes9.dex */
    static final class C313412 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313412(Continuation<? super C313412> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313412(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LockscreenManager lockscreenManager = LockscreenManager.this;
                this.label = 1;
                if (lockscreenManager.sendDeviceSecurityConfigUpdatedRequest(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendDeviceSecurityConfigUpdatedRequest(Continuation<? super Unit> continuation) throws Throwable {
        C313461 c313461;
        Object objM28550constructorimpl;
        if (continuation instanceof C313461) {
            c313461 = (C313461) continuation;
            int i = c313461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c313461.label = i - Integer.MIN_VALUE;
            } else {
                c313461 = new C313461(continuation);
            }
        }
        Object objDeviceSecurityConfigUpdated = c313461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c313461.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDeviceSecurityConfigUpdated);
                Result.Companion companion = Result.INSTANCE;
                Sheriff sheriff = this.sheriff;
                DeviceSecurityConfig deviceSecurityConfig = new DeviceSecurityConfig(SECURITY_CONFIG_BIOMETRICS);
                c313461.label = 1;
                objDeviceSecurityConfigUpdated = sheriff.deviceSecurityConfigUpdated(deviceSecurityConfig, c313461);
                if (objDeviceSecurityConfigUpdated == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDeviceSecurityConfigUpdated);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((DeviceSecurityConfig) objDeviceSecurityConfigUpdated);
        } catch (Throwable th) {
            Throwables.rethrowIfNotNetworkRelated(th);
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        if (((DeviceSecurityConfig) objM28550constructorimpl) != null) {
            this.biometricsChangedPref.delete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getLoggedOutBiometricChangeKillswitch(Continuation<? super Boolean> continuation) {
        Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return Operators.m22188withTimeoutWithDefaultrnQQ1Ag(Duration3.toDuration(3000L, DurationUnitJvm.MILLISECONDS), boxing.boxBoolean(false), new C313392(null), continuation);
    }

    /* compiled from: LockscreenManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.LockscreenManager$getLoggedOutBiometricChangeKillswitch$2", m3645f = "LockscreenManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.LockscreenManager$getLoggedOutBiometricChangeKillswitch$2 */
    /* loaded from: classes9.dex */
    static final class C313392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C313392(Continuation<? super C313392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LockscreenManager.this.new C313392(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C313392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM22650coGetState0E7RQCE$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExperimentsStore experimentsStore = LockscreenManager.this.experimentsStore;
                LockscreenExperiments lockscreenExperiments = LockscreenExperiments.INSTANCE;
                this.label = 1;
                objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, lockscreenExperiments, false, this, 2, null);
                if (objM22650coGetState0E7RQCE$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22650coGetState0E7RQCE$default = ((Result) obj).getValue();
            }
            return Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default) ? boxing.boxBoolean(false) : objM22650coGetState0E7RQCE$default;
        }
    }
}
