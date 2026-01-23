package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.utils.Supplier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceParamNotAvailableFactoryImpl.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0010\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\rR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\rR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "", "apiVersion", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "hardwareIdSupplier", "<init>", "(ILcom/stripe/android/stripe3ds2/utils/Supplier;)V", "(Lcom/stripe/android/stripe3ds2/utils/Supplier;)V", "", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Ljava/util/Map;", "I", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "getMarketOrRegionRestrictionParams$3ds2sdk_release", "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations", "()V", "marketOrRegionRestrictionParams", "getPlatformVersionParams$3ds2sdk_release", "getPlatformVersionParams$3ds2sdk_release$annotations", "platformVersionParams", "getPermissionParams$3ds2sdk_release", "getPermissionParams$3ds2sdk_release$annotations", "permissionParams", "Reason", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class DeviceParamNotAvailableFactoryImpl implements DeviceParamNotAvailableFactory {
    private final int apiVersion;
    private final Supplier<HardwareId> hardwareIdSupplier;

    public DeviceParamNotAvailableFactoryImpl(int i, Supplier<HardwareId> hardwareIdSupplier) {
        Intrinsics.checkNotNullParameter(hardwareIdSupplier, "hardwareIdSupplier");
        this.apiVersion = i;
        this.hardwareIdSupplier = hardwareIdSupplier;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceParamNotAvailableFactoryImpl(Supplier<HardwareId> hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        Intrinsics.checkNotNullParameter(hardwareIdSupplier, "hardwareIdSupplier");
    }

    @Override // com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory
    public Map<String, String> create() {
        return MapsKt.plus(MapsKt.plus(getMarketOrRegionRestrictionParams$3ds2sdk_release(), getPlatformVersionParams$3ds2sdk_release()), getPermissionParams$3ds2sdk_release());
    }

    public final Map<String, String> getMarketOrRegionRestrictionParams$3ds2sdk_release() {
        HashMap map = new HashMap();
        List listListOf = CollectionsKt.listOf((Object[]) new DeviceParam[]{DeviceParam.PARAM_PLATFORM, DeviceParam.PARAM_DEVICE_MODEL, DeviceParam.PARAM_OS_NAME, DeviceParam.PARAM_OS_VERSION, DeviceParam.PARAM_LOCALE, DeviceParam.PARAM_TIME_ZONE, DeviceParam.PARAM_HARDWARE_ID, DeviceParam.PARAM_SCREEN_RESOLUTION});
        for (DeviceParam deviceParam : DeviceParam.getEntries()) {
            if (!listListOf.contains(deviceParam)) {
                map.put(deviceParam.getCode(), Reason.MARKET_OR_REGION_RESTRICTION.toString());
            }
        }
        return map;
    }

    public final Map<String, String> getPlatformVersionParams$3ds2sdk_release() {
        HashMap map = new HashMap();
        if (this.apiVersion < 26) {
            String code = DeviceParam.PARAM_TELE_IMEI_SV.getCode();
            Reason reason = Reason.PLATFORM_VERSION;
            map.put(code, reason.toString());
            map.put(DeviceParam.PARAM_BUILD_SERIAL.getCode(), reason.toString());
            map.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.getCode(), reason.toString());
        }
        if (this.apiVersion < 23) {
            String code2 = DeviceParam.PARAM_TELE_PHONE_COUNT.getCode();
            Reason reason2 = Reason.PLATFORM_VERSION;
            map.put(code2, reason2.toString());
            map.put(DeviceParam.PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_BUILD_VERSION_PREVIEW_SDK_INT.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_BUILD_VERSION_SDK_INT.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_BUILD_VERSION_SECURITY_PATCH.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.getCode(), reason2.toString());
            map.put(DeviceParam.PARAM_SYSTEM_VIBRATE_WHEN_RINGING.getCode(), reason2.toString());
        }
        if (this.apiVersion > 23) {
            map.put(DeviceParam.PARAM_SECURE_SYS_PROP_SETTING_VERSION.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 22) {
            map.put(DeviceParam.PARAM_TELE_IS_VOICE_CAPABLE.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        return map;
    }

    public final Map<String, String> getPermissionParams$3ds2sdk_release() {
        HashMap map = new HashMap();
        String code = DeviceParam.PARAM_WIFI_MAC.getCode();
        Reason reason = Reason.PERMISSION;
        map.put(code, reason.toString());
        map.put(DeviceParam.PARAM_WIFI_BSSID.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_SSID.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_NETWORK_ID.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_P2P_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_TDLS_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_LATITUDE.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_LONGITUDE.getCode(), reason.toString());
        if (!this.hardwareIdSupplier.get().isPresent()) {
            map.put(DeviceParam.PARAM_HARDWARE_ID.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        map.put(DeviceParam.PARAM_DEVICE_NAME.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_BLUETOOTH_ADDRESS.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_BLUETOOTH_BONDED_DEVICE.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_BLUETOOTH_IS_ENABLED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_DEVICE_ID.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_SUBSCRIBER_ID.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_IMEI_SV.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_GROUP_IDENTIFIER_L1.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_SIM_SERIAL_NUMBER.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_VOICE_MAIL_ALPHA_TAG.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_VOICE_MAIL_NUMBER.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_BUILD_SERIAL.getCode(), reason.toString());
        map.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.getCode(), reason.toString());
        return map;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceParamNotAvailableFactoryImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MARKET_OR_REGION_RESTRICTION", "PLATFORM_VERSION", "PERMISSION", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        private final String code;
        public static final Reason MARKET_OR_REGION_RESTRICTION = new Reason("MARKET_OR_REGION_RESTRICTION", 0, "RE01");
        public static final Reason PLATFORM_VERSION = new Reason("PLATFORM_VERSION", 1, "RE02");
        public static final Reason PERMISSION = new Reason("PERMISSION", 2, "RE03");

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{MARKET_OR_REGION_RESTRICTION, PLATFORM_VERSION, PERMISSION};
        }

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        private Reason(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reasonArr$values);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }
}
