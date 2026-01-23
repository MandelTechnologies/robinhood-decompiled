package com.robinhood.android.securitycenter.p251ui.devicesecurity;

import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.prefs.LockscreenTimeout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSecurityDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDataState;", "", "isBiometricsAuthEnabled", "", "isBiometricHardwareDetected", "isPinEnabled", "timeout", "Lcom/robinhood/prefs/LockscreenTimeout;", "<init>", "(ZZZLcom/robinhood/prefs/LockscreenTimeout;)V", "()Z", "getTimeout", "()Lcom/robinhood/prefs/LockscreenTimeout;", "showTimeout", "getShowTimeout", "pinRowSecondaryTextRes", "", "getPinRowSecondaryTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeviceSecurityDataState {
    public static final int $stable = 0;
    private final boolean isBiometricHardwareDetected;
    private final boolean isBiometricsAuthEnabled;
    private final boolean isPinEnabled;
    private final Integer pinRowSecondaryTextRes;
    private final LockscreenTimeout timeout;

    public DeviceSecurityDataState() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ DeviceSecurityDataState copy$default(DeviceSecurityDataState deviceSecurityDataState, boolean z, boolean z2, boolean z3, LockscreenTimeout lockscreenTimeout, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceSecurityDataState.isBiometricsAuthEnabled;
        }
        if ((i & 2) != 0) {
            z2 = deviceSecurityDataState.isBiometricHardwareDetected;
        }
        if ((i & 4) != 0) {
            z3 = deviceSecurityDataState.isPinEnabled;
        }
        if ((i & 8) != 0) {
            lockscreenTimeout = deviceSecurityDataState.timeout;
        }
        return deviceSecurityDataState.copy(z, z2, z3, lockscreenTimeout);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBiometricsAuthEnabled() {
        return this.isBiometricsAuthEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBiometricHardwareDetected() {
        return this.isBiometricHardwareDetected;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPinEnabled() {
        return this.isPinEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final LockscreenTimeout getTimeout() {
        return this.timeout;
    }

    public final DeviceSecurityDataState copy(boolean isBiometricsAuthEnabled, boolean isBiometricHardwareDetected, boolean isPinEnabled, LockscreenTimeout timeout) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        return new DeviceSecurityDataState(isBiometricsAuthEnabled, isBiometricHardwareDetected, isPinEnabled, timeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceSecurityDataState)) {
            return false;
        }
        DeviceSecurityDataState deviceSecurityDataState = (DeviceSecurityDataState) other;
        return this.isBiometricsAuthEnabled == deviceSecurityDataState.isBiometricsAuthEnabled && this.isBiometricHardwareDetected == deviceSecurityDataState.isBiometricHardwareDetected && this.isPinEnabled == deviceSecurityDataState.isPinEnabled && this.timeout == deviceSecurityDataState.timeout;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isBiometricsAuthEnabled) * 31) + Boolean.hashCode(this.isBiometricHardwareDetected)) * 31) + Boolean.hashCode(this.isPinEnabled)) * 31) + this.timeout.hashCode();
    }

    public String toString() {
        return "DeviceSecurityDataState(isBiometricsAuthEnabled=" + this.isBiometricsAuthEnabled + ", isBiometricHardwareDetected=" + this.isBiometricHardwareDetected + ", isPinEnabled=" + this.isPinEnabled + ", timeout=" + this.timeout + ")";
    }

    public DeviceSecurityDataState(boolean z, boolean z2, boolean z3, LockscreenTimeout timeout) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.isBiometricsAuthEnabled = z;
        this.isBiometricHardwareDetected = z2;
        this.isPinEnabled = z3;
        this.timeout = timeout;
        this.pinRowSecondaryTextRes = z ? Integer.valueOf(C28186R.string.device_security_pin_as_backup_for_biometric_summary) : null;
    }

    public final boolean isBiometricsAuthEnabled() {
        return this.isBiometricsAuthEnabled;
    }

    public final boolean isBiometricHardwareDetected() {
        return this.isBiometricHardwareDetected;
    }

    public final boolean isPinEnabled() {
        return this.isPinEnabled;
    }

    public /* synthetic */ DeviceSecurityDataState(boolean z, boolean z2, boolean z3, LockscreenTimeout lockscreenTimeout, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? LockscreenTimeout.IMMEDIATELY : lockscreenTimeout);
    }

    public final LockscreenTimeout getTimeout() {
        return this.timeout;
    }

    public final boolean getShowTimeout() {
        return this.isBiometricsAuthEnabled || this.isPinEnabled;
    }

    public final Integer getPinRowSecondaryTextRes() {
        return this.pinRowSecondaryTextRes;
    }
}
