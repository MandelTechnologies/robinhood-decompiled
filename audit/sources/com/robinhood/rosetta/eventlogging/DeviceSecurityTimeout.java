package com.robinhood.rosetta.eventlogging;

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
/* compiled from: DeviceSecurityTimeout.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SECURITY_TIMEOUT_UNSPECIFIED", "IMMEDIATELY", "FIVE_SECONDS", "ONE_MINUTE", "FIVE_MINUTES", "FIFTEEN_MINUTES", "ONE_HOUR", "FOUR_HOURS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DeviceSecurityTimeout implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceSecurityTimeout[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DeviceSecurityTimeout> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DeviceSecurityTimeout FIFTEEN_MINUTES;
    public static final DeviceSecurityTimeout FIVE_MINUTES;
    public static final DeviceSecurityTimeout FIVE_SECONDS;
    public static final DeviceSecurityTimeout FOUR_HOURS;
    public static final DeviceSecurityTimeout IMMEDIATELY;
    public static final DeviceSecurityTimeout ONE_HOUR;
    public static final DeviceSecurityTimeout ONE_MINUTE;
    public static final DeviceSecurityTimeout SECURITY_TIMEOUT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ DeviceSecurityTimeout[] $values() {
        return new DeviceSecurityTimeout[]{SECURITY_TIMEOUT_UNSPECIFIED, IMMEDIATELY, FIVE_SECONDS, ONE_MINUTE, FIVE_MINUTES, FIFTEEN_MINUTES, ONE_HOUR, FOUR_HOURS};
    }

    @JvmStatic
    public static final DeviceSecurityTimeout fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DeviceSecurityTimeout> getEntries() {
        return $ENTRIES;
    }

    private DeviceSecurityTimeout(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DeviceSecurityTimeout deviceSecurityTimeout = new DeviceSecurityTimeout("SECURITY_TIMEOUT_UNSPECIFIED", 0, 0);
        SECURITY_TIMEOUT_UNSPECIFIED = deviceSecurityTimeout;
        IMMEDIATELY = new DeviceSecurityTimeout("IMMEDIATELY", 1, 1);
        FIVE_SECONDS = new DeviceSecurityTimeout("FIVE_SECONDS", 2, 2);
        ONE_MINUTE = new DeviceSecurityTimeout("ONE_MINUTE", 3, 3);
        FIVE_MINUTES = new DeviceSecurityTimeout("FIVE_MINUTES", 4, 4);
        FIFTEEN_MINUTES = new DeviceSecurityTimeout("FIFTEEN_MINUTES", 5, 5);
        ONE_HOUR = new DeviceSecurityTimeout("ONE_HOUR", 6, 6);
        FOUR_HOURS = new DeviceSecurityTimeout("FOUR_HOURS", 7, 7);
        DeviceSecurityTimeout[] deviceSecurityTimeoutArr$values = $values();
        $VALUES = deviceSecurityTimeoutArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deviceSecurityTimeoutArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceSecurityTimeout.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DeviceSecurityTimeout>(orCreateKotlinClass, syntax, deviceSecurityTimeout) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityTimeout$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DeviceSecurityTimeout fromValue(int value) {
                return DeviceSecurityTimeout.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DeviceSecurityTimeout.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeviceSecurityTimeout fromValue(int value) {
            switch (value) {
                case 0:
                    return DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED;
                case 1:
                    return DeviceSecurityTimeout.IMMEDIATELY;
                case 2:
                    return DeviceSecurityTimeout.FIVE_SECONDS;
                case 3:
                    return DeviceSecurityTimeout.ONE_MINUTE;
                case 4:
                    return DeviceSecurityTimeout.FIVE_MINUTES;
                case 5:
                    return DeviceSecurityTimeout.FIFTEEN_MINUTES;
                case 6:
                    return DeviceSecurityTimeout.ONE_HOUR;
                case 7:
                    return DeviceSecurityTimeout.FOUR_HOURS;
                default:
                    return null;
            }
        }
    }

    public static DeviceSecurityTimeout valueOf(String str) {
        return (DeviceSecurityTimeout) Enum.valueOf(DeviceSecurityTimeout.class, str);
    }

    public static DeviceSecurityTimeout[] values() {
        return (DeviceSecurityTimeout[]) $VALUES.clone();
    }
}
