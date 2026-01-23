package com.robinhood.android.securitycenter.p251ui.devices;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.models.p320db.TrustedDevice;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JC\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0013HÖ\u0001J\t\u0010*\u001a\u00020\u0017HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010 \u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsViewState;", "", "device", "Lcom/robinhood/models/db/TrustedDevice;", "showLoadingView", "", "deviceRemovalSuccess", "Lcom/robinhood/udf/UiEvent;", "", "deviceRemovalFailure", "", "<init>", "(Lcom/robinhood/models/db/TrustedDevice;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getShowLoadingView", "()Z", "getDeviceRemovalSuccess", "()Lcom/robinhood/udf/UiEvent;", "getDeviceRemovalFailure", "pogRes", "", "getPogRes", "()Ljava/lang/Integer;", "titleText", "", "getTitleText", "()Ljava/lang/String;", "timestampRes", "Lcom/robinhood/utils/resource/StringResource;", "getTimestampRes", "()Lcom/robinhood/utils/resource/StringResource;", "locationText", "getLocationText", "deviceTypeRes", "getDeviceTypeRes", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class DeviceDetailsViewState {
    public static final int $stable = 8;
    private final TrustedDevice device;
    private final UiEvent<Throwable> deviceRemovalFailure;
    private final UiEvent<Unit> deviceRemovalSuccess;
    private final boolean showLoadingView;

    /* compiled from: DeviceDetailsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTrustedDevice.Type.values().length];
            try {
                iArr[ApiTrustedDevice.Type.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTrustedDevice.Type.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTrustedDevice.Type.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DeviceDetailsViewState() {
        this(null, false, null, null, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final TrustedDevice getDevice() {
        return this.device;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceDetailsViewState copy$default(DeviceDetailsViewState deviceDetailsViewState, TrustedDevice trustedDevice, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            trustedDevice = deviceDetailsViewState.device;
        }
        if ((i & 2) != 0) {
            z = deviceDetailsViewState.showLoadingView;
        }
        if ((i & 4) != 0) {
            uiEvent = deviceDetailsViewState.deviceRemovalSuccess;
        }
        if ((i & 8) != 0) {
            uiEvent2 = deviceDetailsViewState.deviceRemovalFailure;
        }
        return deviceDetailsViewState.copy(trustedDevice, z, uiEvent, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final UiEvent<Unit> component3() {
        return this.deviceRemovalSuccess;
    }

    public final UiEvent<Throwable> component4() {
        return this.deviceRemovalFailure;
    }

    public final DeviceDetailsViewState copy(TrustedDevice device, boolean showLoadingView, UiEvent<Unit> deviceRemovalSuccess, UiEvent<Throwable> deviceRemovalFailure) {
        return new DeviceDetailsViewState(device, showLoadingView, deviceRemovalSuccess, deviceRemovalFailure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDetailsViewState)) {
            return false;
        }
        DeviceDetailsViewState deviceDetailsViewState = (DeviceDetailsViewState) other;
        return Intrinsics.areEqual(this.device, deviceDetailsViewState.device) && this.showLoadingView == deviceDetailsViewState.showLoadingView && Intrinsics.areEqual(this.deviceRemovalSuccess, deviceDetailsViewState.deviceRemovalSuccess) && Intrinsics.areEqual(this.deviceRemovalFailure, deviceDetailsViewState.deviceRemovalFailure);
    }

    public int hashCode() {
        TrustedDevice trustedDevice = this.device;
        int iHashCode = (((trustedDevice == null ? 0 : trustedDevice.hashCode()) * 31) + Boolean.hashCode(this.showLoadingView)) * 31;
        UiEvent<Unit> uiEvent = this.deviceRemovalSuccess;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.deviceRemovalFailure;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceDetailsViewState(device=" + this.device + ", showLoadingView=" + this.showLoadingView + ", deviceRemovalSuccess=" + this.deviceRemovalSuccess + ", deviceRemovalFailure=" + this.deviceRemovalFailure + ")";
    }

    public DeviceDetailsViewState(TrustedDevice trustedDevice, boolean z, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2) {
        this.device = trustedDevice;
        this.showLoadingView = z;
        this.deviceRemovalSuccess = uiEvent;
        this.deviceRemovalFailure = uiEvent2;
    }

    public /* synthetic */ DeviceDetailsViewState(TrustedDevice trustedDevice, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : trustedDevice, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final UiEvent<Unit> getDeviceRemovalSuccess() {
        return this.deviceRemovalSuccess;
    }

    public final UiEvent<Throwable> getDeviceRemovalFailure() {
        return this.deviceRemovalFailure;
    }

    public final Integer getPogRes() {
        TrustedDevice trustedDevice = this.device;
        ApiTrustedDevice.Type type2 = trustedDevice != null ? trustedDevice.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return Integer.valueOf(C20690R.drawable.pict_mono_rds_phone);
        }
        if (i == 2 || i == 3) {
            return Integer.valueOf(C20690R.drawable.pict_mono_rds_desktop);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getTitleText() {
        TrustedDevice trustedDevice = this.device;
        if (trustedDevice != null) {
            return trustedDevice.getLabel();
        }
        return null;
    }

    public final StringResource getTimestampRes() {
        TrustedDevice trustedDevice = this.device;
        if (trustedDevice == null) {
            return null;
        }
        if (trustedDevice.isActive()) {
            return StringResource.INSTANCE.invoke(C28186R.string.device_details_state_active_now, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) this.device.getDisplayActiveTimestamp()));
    }

    public final String getLocationText() {
        TrustedDevice trustedDevice = this.device;
        if (trustedDevice != null) {
            return trustedDevice.getLocation();
        }
        return null;
    }

    public final StringResource getDeviceTypeRes() {
        TrustedDevice trustedDevice = this.device;
        if (trustedDevice != null) {
            return StringResource.INSTANCE.invoke(TrustedDeviceTypes.getLabelResId(trustedDevice.getType()), new Object[0]);
        }
        return null;
    }
}
