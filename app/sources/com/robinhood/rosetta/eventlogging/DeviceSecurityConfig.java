package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: DeviceSecurityConfig.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceSecurityConfig;", "Lcom/squareup/wire/Message;", "", "has_robinhood_pin", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "has_device_pin", "has_touch_id", "has_face_id", "has_biometric", "has_fingerprint", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getHas_robinhood_pin", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getHas_device_pin", "getHas_touch_id", "getHas_face_id", "getHas_biometric", "getHas_fingerprint", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DeviceSecurityConfig extends Message {

    @JvmField
    public static final ProtoAdapter<DeviceSecurityConfig> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasBiometric", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Boolean has_biometric;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasDevicePin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Boolean has_device_pin;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasFaceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Boolean has_face_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasFingerprint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Boolean has_fingerprint;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasRobinhoodPin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Boolean has_robinhood_pin;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasTouchId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Boolean has_touch_id;

    public DeviceSecurityConfig() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24220newBuilder();
    }

    public final Boolean getHas_robinhood_pin() {
        return this.has_robinhood_pin;
    }

    public /* synthetic */ DeviceSecurityConfig(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Boolean r5, Boolean r6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r2, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r3, (i & 8) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r4, (i & 16) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r5, (i & 32) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Boolean getHas_device_pin() {
        return this.has_device_pin;
    }

    public final Boolean getHas_touch_id() {
        return this.has_touch_id;
    }

    public final Boolean getHas_face_id() {
        return this.has_face_id;
    }

    public final Boolean getHas_biometric() {
        return this.has_biometric;
    }

    public final Boolean getHas_fingerprint() {
        return this.has_fingerprint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSecurityConfig(Boolean has_robinhood_pin, Boolean has_device_pin, Boolean has_touch_id, Boolean has_face_id, Boolean has_biometric, Boolean has_fingerprint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(has_robinhood_pin, "has_robinhood_pin");
        Intrinsics.checkNotNullParameter(has_device_pin, "has_device_pin");
        Intrinsics.checkNotNullParameter(has_touch_id, "has_touch_id");
        Intrinsics.checkNotNullParameter(has_face_id, "has_face_id");
        Intrinsics.checkNotNullParameter(has_biometric, "has_biometric");
        Intrinsics.checkNotNullParameter(has_fingerprint, "has_fingerprint");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.has_robinhood_pin = has_robinhood_pin;
        this.has_device_pin = has_device_pin;
        this.has_touch_id = has_touch_id;
        this.has_face_id = has_face_id;
        this.has_biometric = has_biometric;
        this.has_fingerprint = has_fingerprint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24220newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeviceSecurityConfig)) {
            return false;
        }
        DeviceSecurityConfig deviceSecurityConfig = (DeviceSecurityConfig) other;
        return Intrinsics.areEqual(unknownFields(), deviceSecurityConfig.unknownFields()) && this.has_robinhood_pin == deviceSecurityConfig.has_robinhood_pin && this.has_device_pin == deviceSecurityConfig.has_device_pin && this.has_touch_id == deviceSecurityConfig.has_touch_id && this.has_face_id == deviceSecurityConfig.has_face_id && this.has_biometric == deviceSecurityConfig.has_biometric && this.has_fingerprint == deviceSecurityConfig.has_fingerprint;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.has_robinhood_pin.hashCode()) * 37) + this.has_device_pin.hashCode()) * 37) + this.has_touch_id.hashCode()) * 37) + this.has_face_id.hashCode()) * 37) + this.has_biometric.hashCode()) * 37) + this.has_fingerprint.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_robinhood_pin=" + this.has_robinhood_pin);
        arrayList.add("has_device_pin=" + this.has_device_pin);
        arrayList.add("has_touch_id=" + this.has_touch_id);
        arrayList.add("has_face_id=" + this.has_face_id);
        arrayList.add("has_biometric=" + this.has_biometric);
        arrayList.add("has_fingerprint=" + this.has_fingerprint);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceSecurityConfig{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DeviceSecurityConfig copy$default(DeviceSecurityConfig deviceSecurityConfig, Boolean r1, Boolean r2, Boolean r3, Boolean r4, Boolean r5, Boolean r6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = deviceSecurityConfig.has_robinhood_pin;
        }
        if ((i & 2) != 0) {
            r2 = deviceSecurityConfig.has_device_pin;
        }
        if ((i & 4) != 0) {
            r3 = deviceSecurityConfig.has_touch_id;
        }
        if ((i & 8) != 0) {
            r4 = deviceSecurityConfig.has_face_id;
        }
        if ((i & 16) != 0) {
            r5 = deviceSecurityConfig.has_biometric;
        }
        if ((i & 32) != 0) {
            r6 = deviceSecurityConfig.has_fingerprint;
        }
        if ((i & 64) != 0) {
            byteString = deviceSecurityConfig.unknownFields();
        }
        Boolean r8 = r6;
        ByteString byteString2 = byteString;
        Boolean r7 = r5;
        Boolean r52 = r3;
        return deviceSecurityConfig.copy(r1, r2, r52, r4, r7, r8, byteString2);
    }

    public final DeviceSecurityConfig copy(Boolean has_robinhood_pin, Boolean has_device_pin, Boolean has_touch_id, Boolean has_face_id, Boolean has_biometric, Boolean has_fingerprint, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(has_robinhood_pin, "has_robinhood_pin");
        Intrinsics.checkNotNullParameter(has_device_pin, "has_device_pin");
        Intrinsics.checkNotNullParameter(has_touch_id, "has_touch_id");
        Intrinsics.checkNotNullParameter(has_face_id, "has_face_id");
        Intrinsics.checkNotNullParameter(has_biometric, "has_biometric");
        Intrinsics.checkNotNullParameter(has_fingerprint, "has_fingerprint");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeviceSecurityConfig(has_robinhood_pin, has_device_pin, has_touch_id, has_face_id, has_biometric, has_fingerprint, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceSecurityConfig.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeviceSecurityConfig>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceSecurityConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeviceSecurityConfig value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Boolean has_robinhood_pin = value.getHas_robinhood_pin();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_robinhood_pin != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(1, value.getHas_robinhood_pin());
                }
                if (value.getHas_device_pin() != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(2, value.getHas_device_pin());
                }
                if (value.getHas_touch_id() != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(3, value.getHas_touch_id());
                }
                if (value.getHas_face_id() != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(4, value.getHas_face_id());
                }
                if (value.getHas_biometric() != r2) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(5, value.getHas_biometric());
                }
                return value.getHas_fingerprint() != r2 ? size + Boolean.ADAPTER.encodedSizeWithTag(6, value.getHas_fingerprint()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeviceSecurityConfig value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Boolean has_robinhood_pin = value.getHas_robinhood_pin();
                Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_robinhood_pin != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getHas_robinhood_pin());
                }
                if (value.getHas_device_pin() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getHas_device_pin());
                }
                if (value.getHas_touch_id() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getHas_touch_id());
                }
                if (value.getHas_face_id() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getHas_face_id());
                }
                if (value.getHas_biometric() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getHas_biometric());
                }
                if (value.getHas_fingerprint() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getHas_fingerprint());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeviceSecurityConfig value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Boolean has_fingerprint = value.getHas_fingerprint();
                Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_fingerprint != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getHas_fingerprint());
                }
                if (value.getHas_biometric() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getHas_biometric());
                }
                if (value.getHas_face_id() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getHas_face_id());
                }
                if (value.getHas_touch_id() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getHas_touch_id());
                }
                if (value.getHas_device_pin() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getHas_device_pin());
                }
                if (value.getHas_robinhood_pin() != r1) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getHas_robinhood_pin());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeviceSecurityConfig decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean r0 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Boolean booleanDecode = r0;
                Boolean booleanDecode2 = booleanDecode;
                Boolean booleanDecode3 = booleanDecode2;
                Boolean booleanDecode4 = booleanDecode3;
                Boolean booleanDecode5 = booleanDecode4;
                Boolean booleanDecode6 = booleanDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                try {
                                    booleanDecode2 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 3:
                                try {
                                    booleanDecode3 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 4:
                                try {
                                    booleanDecode4 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 5:
                                try {
                                    booleanDecode5 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 6:
                                try {
                                    booleanDecode6 = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new DeviceSecurityConfig(booleanDecode, booleanDecode2, booleanDecode3, booleanDecode4, booleanDecode5, booleanDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeviceSecurityConfig redact(DeviceSecurityConfig value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DeviceSecurityConfig.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
