package com.robinhood.android.securitycenter.p251ui.devicesecurity;

import com.robinhood.prefs.LockscreenTimeout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSecurityViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0012JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityViewState;", "", "isBiometricsAuthEnabled", "", "isBiometricSettingsVisible", "showTimeout", "timeout", "Lcom/robinhood/prefs/LockscreenTimeout;", "isPinEnabled", "pinRowSecondaryTextRes", "", "<init>", "(ZZZLcom/robinhood/prefs/LockscreenTimeout;ZLjava/lang/Integer;)V", "()Z", "getShowTimeout", "getTimeout", "()Lcom/robinhood/prefs/LockscreenTimeout;", "getPinRowSecondaryTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZLcom/robinhood/prefs/LockscreenTimeout;ZLjava/lang/Integer;)Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityViewState;", "equals", "other", "hashCode", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeviceSecurityViewState {
    public static final int $stable = 0;
    private final boolean isBiometricSettingsVisible;
    private final boolean isBiometricsAuthEnabled;
    private final boolean isPinEnabled;
    private final Integer pinRowSecondaryTextRes;
    private final boolean showTimeout;
    private final LockscreenTimeout timeout;

    public static /* synthetic */ DeviceSecurityViewState copy$default(DeviceSecurityViewState deviceSecurityViewState, boolean z, boolean z2, boolean z3, LockscreenTimeout lockscreenTimeout, boolean z4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceSecurityViewState.isBiometricsAuthEnabled;
        }
        if ((i & 2) != 0) {
            z2 = deviceSecurityViewState.isBiometricSettingsVisible;
        }
        if ((i & 4) != 0) {
            z3 = deviceSecurityViewState.showTimeout;
        }
        if ((i & 8) != 0) {
            lockscreenTimeout = deviceSecurityViewState.timeout;
        }
        if ((i & 16) != 0) {
            z4 = deviceSecurityViewState.isPinEnabled;
        }
        if ((i & 32) != 0) {
            num = deviceSecurityViewState.pinRowSecondaryTextRes;
        }
        boolean z5 = z4;
        Integer num2 = num;
        return deviceSecurityViewState.copy(z, z2, z3, lockscreenTimeout, z5, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBiometricsAuthEnabled() {
        return this.isBiometricsAuthEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBiometricSettingsVisible() {
        return this.isBiometricSettingsVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowTimeout() {
        return this.showTimeout;
    }

    /* renamed from: component4, reason: from getter */
    public final LockscreenTimeout getTimeout() {
        return this.timeout;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPinEnabled() {
        return this.isPinEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getPinRowSecondaryTextRes() {
        return this.pinRowSecondaryTextRes;
    }

    public final DeviceSecurityViewState copy(boolean isBiometricsAuthEnabled, boolean isBiometricSettingsVisible, boolean showTimeout, LockscreenTimeout timeout, boolean isPinEnabled, Integer pinRowSecondaryTextRes) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        return new DeviceSecurityViewState(isBiometricsAuthEnabled, isBiometricSettingsVisible, showTimeout, timeout, isPinEnabled, pinRowSecondaryTextRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceSecurityViewState)) {
            return false;
        }
        DeviceSecurityViewState deviceSecurityViewState = (DeviceSecurityViewState) other;
        return this.isBiometricsAuthEnabled == deviceSecurityViewState.isBiometricsAuthEnabled && this.isBiometricSettingsVisible == deviceSecurityViewState.isBiometricSettingsVisible && this.showTimeout == deviceSecurityViewState.showTimeout && this.timeout == deviceSecurityViewState.timeout && this.isPinEnabled == deviceSecurityViewState.isPinEnabled && Intrinsics.areEqual(this.pinRowSecondaryTextRes, deviceSecurityViewState.pinRowSecondaryTextRes);
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.isBiometricsAuthEnabled) * 31) + Boolean.hashCode(this.isBiometricSettingsVisible)) * 31) + Boolean.hashCode(this.showTimeout)) * 31) + this.timeout.hashCode()) * 31) + Boolean.hashCode(this.isPinEnabled)) * 31;
        Integer num = this.pinRowSecondaryTextRes;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "DeviceSecurityViewState(isBiometricsAuthEnabled=" + this.isBiometricsAuthEnabled + ", isBiometricSettingsVisible=" + this.isBiometricSettingsVisible + ", showTimeout=" + this.showTimeout + ", timeout=" + this.timeout + ", isPinEnabled=" + this.isPinEnabled + ", pinRowSecondaryTextRes=" + this.pinRowSecondaryTextRes + ")";
    }

    public DeviceSecurityViewState(boolean z, boolean z2, boolean z3, LockscreenTimeout timeout, boolean z4, Integer num) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.isBiometricsAuthEnabled = z;
        this.isBiometricSettingsVisible = z2;
        this.showTimeout = z3;
        this.timeout = timeout;
        this.isPinEnabled = z4;
        this.pinRowSecondaryTextRes = num;
    }

    public final boolean isBiometricsAuthEnabled() {
        return this.isBiometricsAuthEnabled;
    }

    public final boolean isBiometricSettingsVisible() {
        return this.isBiometricSettingsVisible;
    }

    public final boolean getShowTimeout() {
        return this.showTimeout;
    }

    public final LockscreenTimeout getTimeout() {
        return this.timeout;
    }

    public final boolean isPinEnabled() {
        return this.isPinEnabled;
    }

    public final Integer getPinRowSecondaryTextRes() {
        return this.pinRowSecondaryTextRes;
    }
}
