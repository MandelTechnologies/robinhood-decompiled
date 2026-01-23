package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: DeviceSecurityEventData.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JD\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "Lcom/squareup/wire/Message;", "", "security_config", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "security_used", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "account_age", "", "unlock_success", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "security_timeout", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;DLcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;Lokio/ByteString;)V", "getSecurity_config", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "getSecurity_used", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "getAccount_age", "()D", "getUnlock_success", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getSecurity_timeout", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "SecurityType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DeviceSecurityEventData extends Message {

    @JvmField
    public static final ProtoAdapter<DeviceSecurityEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "accountAge", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double account_age;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceSecurityConfig#ADAPTER", jsonName = "securityConfig", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DeviceSecurityConfig security_config;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceSecurityTimeout#ADAPTER", jsonName = "securityTimeout", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final DeviceSecurityTimeout security_timeout;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceSecurityEventData$SecurityType#ADAPTER", jsonName = "securityUsed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SecurityType security_used;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "unlockSuccess", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Boolean unlock_success;

    public DeviceSecurityEventData() {
        this(null, null, 0.0d, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24221newBuilder();
    }

    public final DeviceSecurityConfig getSecurity_config() {
        return this.security_config;
    }

    public final SecurityType getSecurity_used() {
        return this.security_used;
    }

    public /* synthetic */ DeviceSecurityEventData(DeviceSecurityConfig deviceSecurityConfig, SecurityType securityType, double d, Boolean r5, DeviceSecurityTimeout deviceSecurityTimeout, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceSecurityConfig, (i & 2) != 0 ? SecurityType.SECURITY_TYPE_UNSPECIFIED : securityType, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r5, (i & 16) != 0 ? DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED : deviceSecurityTimeout, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getAccount_age() {
        return this.account_age;
    }

    public final Boolean getUnlock_success() {
        return this.unlock_success;
    }

    public final DeviceSecurityTimeout getSecurity_timeout() {
        return this.security_timeout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSecurityEventData(DeviceSecurityConfig deviceSecurityConfig, SecurityType security_used, double d, Boolean unlock_success, DeviceSecurityTimeout security_timeout, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(security_used, "security_used");
        Intrinsics.checkNotNullParameter(unlock_success, "unlock_success");
        Intrinsics.checkNotNullParameter(security_timeout, "security_timeout");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.security_config = deviceSecurityConfig;
        this.security_used = security_used;
        this.account_age = d;
        this.unlock_success = unlock_success;
        this.security_timeout = security_timeout;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24221newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeviceSecurityEventData)) {
            return false;
        }
        DeviceSecurityEventData deviceSecurityEventData = (DeviceSecurityEventData) other;
        return Intrinsics.areEqual(unknownFields(), deviceSecurityEventData.unknownFields()) && Intrinsics.areEqual(this.security_config, deviceSecurityEventData.security_config) && this.security_used == deviceSecurityEventData.security_used && this.account_age == deviceSecurityEventData.account_age && this.unlock_success == deviceSecurityEventData.unlock_success && this.security_timeout == deviceSecurityEventData.security_timeout;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DeviceSecurityConfig deviceSecurityConfig = this.security_config;
        int iHashCode2 = ((((((((iHashCode + (deviceSecurityConfig != null ? deviceSecurityConfig.hashCode() : 0)) * 37) + this.security_used.hashCode()) * 37) + Double.hashCode(this.account_age)) * 37) + this.unlock_success.hashCode()) * 37) + this.security_timeout.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DeviceSecurityConfig deviceSecurityConfig = this.security_config;
        if (deviceSecurityConfig != null) {
            arrayList.add("security_config=" + deviceSecurityConfig);
        }
        arrayList.add("security_used=" + this.security_used);
        arrayList.add("account_age=" + this.account_age);
        arrayList.add("unlock_success=" + this.unlock_success);
        arrayList.add("security_timeout=" + this.security_timeout);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceSecurityEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DeviceSecurityEventData copy$default(DeviceSecurityEventData deviceSecurityEventData, DeviceSecurityConfig deviceSecurityConfig, SecurityType securityType, double d, Boolean r5, DeviceSecurityTimeout deviceSecurityTimeout, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceSecurityConfig = deviceSecurityEventData.security_config;
        }
        if ((i & 2) != 0) {
            securityType = deviceSecurityEventData.security_used;
        }
        if ((i & 4) != 0) {
            d = deviceSecurityEventData.account_age;
        }
        if ((i & 8) != 0) {
            r5 = deviceSecurityEventData.unlock_success;
        }
        if ((i & 16) != 0) {
            deviceSecurityTimeout = deviceSecurityEventData.security_timeout;
        }
        if ((i & 32) != 0) {
            byteString = deviceSecurityEventData.unknownFields();
        }
        ByteString byteString2 = byteString;
        Boolean r7 = r5;
        double d2 = d;
        return deviceSecurityEventData.copy(deviceSecurityConfig, securityType, d2, r7, deviceSecurityTimeout, byteString2);
    }

    public final DeviceSecurityEventData copy(DeviceSecurityConfig security_config, SecurityType security_used, double account_age, Boolean unlock_success, DeviceSecurityTimeout security_timeout, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(security_used, "security_used");
        Intrinsics.checkNotNullParameter(unlock_success, "unlock_success");
        Intrinsics.checkNotNullParameter(security_timeout, "security_timeout");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeviceSecurityEventData(security_config, security_used, account_age, unlock_success, security_timeout, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceSecurityEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeviceSecurityEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeviceSecurityEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSecurity_config() != null) {
                    size += DeviceSecurityConfig.ADAPTER.encodedSizeWithTag(1, value.getSecurity_config());
                }
                if (value.getSecurity_used() != DeviceSecurityEventData.SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    size += DeviceSecurityEventData.SecurityType.ADAPTER.encodedSizeWithTag(2, value.getSecurity_used());
                }
                if (!Double.valueOf(value.getAccount_age()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAccount_age()));
                }
                if (value.getUnlock_success() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(4, value.getUnlock_success());
                }
                return value.getSecurity_timeout() != DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED ? size + DeviceSecurityTimeout.ADAPTER.encodedSizeWithTag(5, value.getSecurity_timeout()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeviceSecurityEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSecurity_config() != null) {
                    DeviceSecurityConfig.ADAPTER.encodeWithTag(writer, 1, (int) value.getSecurity_config());
                }
                if (value.getSecurity_used() != DeviceSecurityEventData.SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    DeviceSecurityEventData.SecurityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getSecurity_used());
                }
                if (!Double.valueOf(value.getAccount_age()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAccount_age()));
                }
                if (value.getUnlock_success() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getUnlock_success());
                }
                if (value.getSecurity_timeout() != DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED) {
                    DeviceSecurityTimeout.ADAPTER.encodeWithTag(writer, 5, (int) value.getSecurity_timeout());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeviceSecurityEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSecurity_timeout() != DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED) {
                    DeviceSecurityTimeout.ADAPTER.encodeWithTag(writer, 5, (int) value.getSecurity_timeout());
                }
                if (value.getUnlock_success() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getUnlock_success());
                }
                if (!Double.valueOf(value.getAccount_age()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAccount_age()));
                }
                if (value.getSecurity_used() != DeviceSecurityEventData.SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    DeviceSecurityEventData.SecurityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getSecurity_used());
                }
                if (value.getSecurity_config() != null) {
                    DeviceSecurityConfig.ADAPTER.encodeWithTag(writer, 1, (int) value.getSecurity_config());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeviceSecurityEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DeviceSecurityEventData.SecurityType securityTypeDecode = DeviceSecurityEventData.SecurityType.SECURITY_TYPE_UNSPECIFIED;
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                DeviceSecurityTimeout deviceSecurityTimeout = DeviceSecurityTimeout.SECURITY_TIMEOUT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                DeviceSecurityConfig deviceSecurityConfigDecode = null;
                DeviceSecurityTimeout deviceSecurityTimeoutDecode = deviceSecurityTimeout;
                Boolean booleanDecode = r2;
                while (true) {
                    DeviceSecurityEventData.SecurityType securityType = securityTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceSecurityEventData(deviceSecurityConfigDecode, securityType, dDoubleValue, booleanDecode, deviceSecurityTimeoutDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            deviceSecurityConfigDecode = DeviceSecurityConfig.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                securityTypeDecode = DeviceSecurityEventData.SecurityType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 4) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 5) {
                            try {
                                deviceSecurityTimeoutDecode = DeviceSecurityTimeout.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeviceSecurityEventData redact(DeviceSecurityEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DeviceSecurityConfig security_config = value.getSecurity_config();
                return DeviceSecurityEventData.copy$default(value, security_config != null ? DeviceSecurityConfig.ADAPTER.redact(security_config) : null, null, 0.0d, null, null, ByteString.EMPTY, 30, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceSecurityEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SECURITY_TYPE_UNSPECIFIED", "NONE", "ROBINHOOD_PIN", "DEVICE_PIN", "TOUCH_ID", "FACE_ID", "BIOMETRIC", "FINGERPRINT", "DEVICE_PASSWORD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SecurityType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SecurityType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SecurityType> ADAPTER;
        public static final SecurityType BIOMETRIC;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SecurityType DEVICE_PASSWORD;
        public static final SecurityType DEVICE_PIN;
        public static final SecurityType FACE_ID;
        public static final SecurityType FINGERPRINT;
        public static final SecurityType NONE;
        public static final SecurityType ROBINHOOD_PIN;
        public static final SecurityType SECURITY_TYPE_UNSPECIFIED;
        public static final SecurityType TOUCH_ID;
        private final int value;

        private static final /* synthetic */ SecurityType[] $values() {
            return new SecurityType[]{SECURITY_TYPE_UNSPECIFIED, NONE, ROBINHOOD_PIN, DEVICE_PIN, TOUCH_ID, FACE_ID, BIOMETRIC, FINGERPRINT, DEVICE_PASSWORD};
        }

        @JvmStatic
        public static final SecurityType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SecurityType> getEntries() {
            return $ENTRIES;
        }

        private SecurityType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SecurityType securityType = new SecurityType("SECURITY_TYPE_UNSPECIFIED", 0, 0);
            SECURITY_TYPE_UNSPECIFIED = securityType;
            NONE = new SecurityType("NONE", 1, 1);
            ROBINHOOD_PIN = new SecurityType("ROBINHOOD_PIN", 2, 2);
            DEVICE_PIN = new SecurityType("DEVICE_PIN", 3, 3);
            TOUCH_ID = new SecurityType("TOUCH_ID", 4, 4);
            FACE_ID = new SecurityType("FACE_ID", 5, 5);
            BIOMETRIC = new SecurityType("BIOMETRIC", 6, 6);
            FINGERPRINT = new SecurityType("FINGERPRINT", 7, 7);
            DEVICE_PASSWORD = new SecurityType("DEVICE_PASSWORD", 8, 8);
            SecurityType[] securityTypeArr$values = $values();
            $VALUES = securityTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(securityTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SecurityType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SecurityType>(orCreateKotlinClass, syntax, securityType) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityEventData$SecurityType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DeviceSecurityEventData.SecurityType fromValue(int value) {
                    return DeviceSecurityEventData.SecurityType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DeviceSecurityEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SecurityType fromValue(int value) {
                switch (value) {
                    case 0:
                        return SecurityType.SECURITY_TYPE_UNSPECIFIED;
                    case 1:
                        return SecurityType.NONE;
                    case 2:
                        return SecurityType.ROBINHOOD_PIN;
                    case 3:
                        return SecurityType.DEVICE_PIN;
                    case 4:
                        return SecurityType.TOUCH_ID;
                    case 5:
                        return SecurityType.FACE_ID;
                    case 6:
                        return SecurityType.BIOMETRIC;
                    case 7:
                        return SecurityType.FINGERPRINT;
                    case 8:
                        return SecurityType.DEVICE_PASSWORD;
                    default:
                        return null;
                }
            }
        }

        public static SecurityType valueOf(String str) {
            return (SecurityType) Enum.valueOf(SecurityType.class, str);
        }

        public static SecurityType[] values() {
            return (SecurityType[]) $VALUES.clone();
        }
    }
}
