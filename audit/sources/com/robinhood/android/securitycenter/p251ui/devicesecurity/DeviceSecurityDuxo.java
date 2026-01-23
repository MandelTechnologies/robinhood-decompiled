package com.robinhood.android.securitycenter.p251ui.devicesecurity;

import android.content.Context;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.security.contracts.SetLockscreen;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.prefs.annotation.LockscreenTimeoutPref;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSecurityDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDataState;", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityViewState;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;Lcom/robinhood/android/authlock/pin/PinManager;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "updateTimeoutPref", "lockscreenTimeout", "enableBiometricsAuth", "context", "Landroid/content/Context;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DeviceSecurityDuxo extends BaseDuxo<DeviceSecurityDataState, DeviceSecurityViewState> {
    public static final int $stable = 8;
    private final BiometricAuthManager biometricAuthManager;
    private final EnumPreference<LockscreenTimeout> lockscreenTimeoutPref;
    private final Navigator navigator;
    private final PinManager pinManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSecurityDuxo(Navigator navigator, BiometricAuthManager biometricAuthManager, PinManager pinManager, @LockscreenTimeoutPref EnumPreference<LockscreenTimeout> lockscreenTimeoutPref, DeviceSecurityStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new DeviceSecurityDataState(biometricAuthManager.isBiometricsAuthEnabled(), biometricAuthManager.isBiometricHardwareDetected(), false, (LockscreenTimeout) lockscreenTimeoutPref.getValue(), 4, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.navigator = navigator;
        this.biometricAuthManager = biometricAuthManager;
        this.pinManager = pinManager;
        this.lockscreenTimeoutPref = lockscreenTimeoutPref;
    }

    /* compiled from: DeviceSecurityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityDuxo$onResume$1", m3645f = "DeviceSecurityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityDuxo$onResume$1 */
    static final class C282531 extends ContinuationImpl7 implements Function2<DeviceSecurityDataState, Continuation<? super DeviceSecurityDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282531(Continuation<? super C282531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282531 c282531 = DeviceSecurityDuxo.this.new C282531(continuation);
            c282531.L$0 = obj;
            return c282531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSecurityDataState deviceSecurityDataState, Continuation<? super DeviceSecurityDataState> continuation) {
            return ((C282531) create(deviceSecurityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return DeviceSecurityDataState.copy$default((DeviceSecurityDataState) this.L$0, DeviceSecurityDuxo.this.biometricAuthManager.isBiometricsAuthEnabled(), false, DeviceSecurityDuxo.this.pinManager.isPinEnabled(), null, 10, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        applyMutation(new C282531(null));
    }

    /* compiled from: DeviceSecurityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityDuxo$updateTimeoutPref$1", m3645f = "DeviceSecurityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityDuxo$updateTimeoutPref$1 */
    static final class C282541 extends ContinuationImpl7 implements Function2<DeviceSecurityDataState, Continuation<? super DeviceSecurityDataState>, Object> {
        final /* synthetic */ LockscreenTimeout $lockscreenTimeout;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282541(LockscreenTimeout lockscreenTimeout, Continuation<? super C282541> continuation) {
            super(2, continuation);
            this.$lockscreenTimeout = lockscreenTimeout;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282541 c282541 = new C282541(this.$lockscreenTimeout, continuation);
            c282541.L$0 = obj;
            return c282541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSecurityDataState deviceSecurityDataState, Continuation<? super DeviceSecurityDataState> continuation) {
            return ((C282541) create(deviceSecurityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DeviceSecurityDataState.copy$default((DeviceSecurityDataState) this.L$0, false, false, false, this.$lockscreenTimeout, 7, null);
        }
    }

    public final void updateTimeoutPref(LockscreenTimeout lockscreenTimeout) {
        Intrinsics.checkNotNullParameter(lockscreenTimeout, "lockscreenTimeout");
        this.lockscreenTimeoutPref.setValue(lockscreenTimeout);
        applyMutation(new C282541(lockscreenTimeout, null));
    }

    public final void enableBiometricsAuth(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.biometricAuthManager.tryToEnableBiometricAuthentication(true)) {
            Navigator.DefaultImpls.startActivity$default(this.navigator, context, new SetLockscreen(SetLockscreen.LockscreenLaunchMode.LAUNCH_BIOMETRICS), null, false, null, null, 60, null);
        } else {
            this.biometricAuthManager.disableBiometricAuth();
        }
        applyMutation(new C282521(null));
    }

    /* compiled from: DeviceSecurityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityDuxo$enableBiometricsAuth$1", m3645f = "DeviceSecurityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityDuxo$enableBiometricsAuth$1 */
    static final class C282521 extends ContinuationImpl7 implements Function2<DeviceSecurityDataState, Continuation<? super DeviceSecurityDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282521(Continuation<? super C282521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282521 c282521 = DeviceSecurityDuxo.this.new C282521(continuation);
            c282521.L$0 = obj;
            return c282521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSecurityDataState deviceSecurityDataState, Continuation<? super DeviceSecurityDataState> continuation) {
            return ((C282521) create(deviceSecurityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DeviceSecurityDataState.copy$default((DeviceSecurityDataState) this.L$0, DeviceSecurityDuxo.this.biometricAuthManager.isBiometricsAuthEnabled(), false, false, null, 14, null);
        }
    }
}
