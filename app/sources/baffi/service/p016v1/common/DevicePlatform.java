package baffi.service.p016v1.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DevicePlatform.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbaffi/service/v1/common/DevicePlatform;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEVICE_PLATFORM_UNSPECIFIED", "PLATFORM_IOS", "PLATFORM_ANDROID", "PLATFORM_WEB", "Companion", "baffi.service.v1.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DevicePlatform implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DevicePlatform[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DevicePlatform> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DevicePlatform DEVICE_PLATFORM_UNSPECIFIED;
    public static final DevicePlatform PLATFORM_ANDROID;
    public static final DevicePlatform PLATFORM_IOS;
    public static final DevicePlatform PLATFORM_WEB;
    private final int value;

    private static final /* synthetic */ DevicePlatform[] $values() {
        return new DevicePlatform[]{DEVICE_PLATFORM_UNSPECIFIED, PLATFORM_IOS, PLATFORM_ANDROID, PLATFORM_WEB};
    }

    @JvmStatic
    public static final DevicePlatform fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DevicePlatform> getEntries() {
        return $ENTRIES;
    }

    private DevicePlatform(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DevicePlatform devicePlatform = new DevicePlatform("DEVICE_PLATFORM_UNSPECIFIED", 0, 0);
        DEVICE_PLATFORM_UNSPECIFIED = devicePlatform;
        PLATFORM_IOS = new DevicePlatform("PLATFORM_IOS", 1, 1);
        PLATFORM_ANDROID = new DevicePlatform("PLATFORM_ANDROID", 2, 2);
        PLATFORM_WEB = new DevicePlatform("PLATFORM_WEB", 3, 3);
        DevicePlatform[] devicePlatformArr$values = $values();
        $VALUES = devicePlatformArr$values;
        $ENTRIES = EnumEntries2.enumEntries(devicePlatformArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DevicePlatform.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DevicePlatform>(orCreateKotlinClass, syntax, devicePlatform) { // from class: baffi.service.v1.common.DevicePlatform$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DevicePlatform fromValue(int value) {
                return DevicePlatform.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DevicePlatform.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbaffi/service/v1/common/DevicePlatform$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbaffi/service/v1/common/DevicePlatform;", "fromValue", "value", "", "baffi.service.v1.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DevicePlatform fromValue(int value) {
            if (value == 0) {
                return DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED;
            }
            if (value == 1) {
                return DevicePlatform.PLATFORM_IOS;
            }
            if (value == 2) {
                return DevicePlatform.PLATFORM_ANDROID;
            }
            if (value != 3) {
                return null;
            }
            return DevicePlatform.PLATFORM_WEB;
        }
    }

    public static DevicePlatform valueOf(String str) {
        return (DevicePlatform) Enum.valueOf(DevicePlatform.class, str);
    }

    public static DevicePlatform[] values() {
        return (DevicePlatform[]) $VALUES.clone();
    }
}
