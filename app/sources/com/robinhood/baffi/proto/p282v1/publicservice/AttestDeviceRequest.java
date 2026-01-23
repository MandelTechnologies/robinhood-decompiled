package com.robinhood.baffi.proto.p282v1.publicservice;

import baffi.service.p016v1.common.DevicePlatform;
import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AttestDeviceRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequest;", "Lcom/squareup/wire/Message;", "", "device_platform", "Lbaffi/service/v1/common/DevicePlatform;", "attestation_object", "", "attestation_chain", "", "play_integrity_token", "mobile_sdk_device_id", "device_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbaffi/service/v1/common/DevicePlatform;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDevice_platform", "()Lbaffi/service/v1/common/DevicePlatform;", "getAttestation_object", "()Ljava/lang/String;", "getPlay_integrity_token", "getMobile_sdk_device_id", "getDevice_token", "getAttestation_chain", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AttestDeviceRequest extends Message {

    @JvmField
    public static final ProtoAdapter<AttestDeviceRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "attestationChain", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> attestation_chain;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "attestationObject", schemaIndex = 1, tag = 2)
    private final String attestation_object;

    @WireField(adapter = "baffi.service.v1.common.DevicePlatform#ADAPTER", jsonName = "devicePlatform", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final DevicePlatform device_platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceToken", schemaIndex = 5, tag = 6)
    private final String device_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mobileSdkDeviceId", schemaIndex = 4, tag = 5)
    private final String mobile_sdk_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "playIntegrityToken", schemaIndex = 3, tag = 4)
    private final String play_integrity_token;

    public AttestDeviceRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20222newBuilder();
    }

    public final DevicePlatform getDevice_platform() {
        return this.device_platform;
    }

    public /* synthetic */ AttestDeviceRequest(DevicePlatform devicePlatform, String str, List list, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED : devicePlatform, (i & 2) != 0 ? null : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAttestation_object() {
        return this.attestation_object;
    }

    public final String getPlay_integrity_token() {
        return this.play_integrity_token;
    }

    public final String getMobile_sdk_device_id() {
        return this.mobile_sdk_device_id;
    }

    public final String getDevice_token() {
        return this.device_token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestDeviceRequest(DevicePlatform device_platform, String str, List<String> attestation_chain, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(device_platform, "device_platform");
        Intrinsics.checkNotNullParameter(attestation_chain, "attestation_chain");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.device_platform = device_platform;
        this.attestation_object = str;
        this.play_integrity_token = str2;
        this.mobile_sdk_device_id = str3;
        this.device_token = str4;
        this.attestation_chain = Internal.immutableCopyOf("attestation_chain", attestation_chain);
    }

    public final List<String> getAttestation_chain() {
        return this.attestation_chain;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20222newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AttestDeviceRequest)) {
            return false;
        }
        AttestDeviceRequest attestDeviceRequest = (AttestDeviceRequest) other;
        return Intrinsics.areEqual(unknownFields(), attestDeviceRequest.unknownFields()) && this.device_platform == attestDeviceRequest.device_platform && Intrinsics.areEqual(this.attestation_object, attestDeviceRequest.attestation_object) && Intrinsics.areEqual(this.attestation_chain, attestDeviceRequest.attestation_chain) && Intrinsics.areEqual(this.play_integrity_token, attestDeviceRequest.play_integrity_token) && Intrinsics.areEqual(this.mobile_sdk_device_id, attestDeviceRequest.mobile_sdk_device_id) && Intrinsics.areEqual(this.device_token, attestDeviceRequest.device_token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.device_platform.hashCode()) * 37;
        String str = this.attestation_object;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.attestation_chain.hashCode()) * 37;
        String str2 = this.play_integrity_token;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.mobile_sdk_device_id;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.device_token;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("device_platform=" + this.device_platform);
        String str = this.attestation_object;
        if (str != null) {
            arrayList.add("attestation_object=" + Internal.sanitize(str));
        }
        if (!this.attestation_chain.isEmpty()) {
            arrayList.add("attestation_chain=" + Internal.sanitize(this.attestation_chain));
        }
        String str2 = this.play_integrity_token;
        if (str2 != null) {
            arrayList.add("play_integrity_token=" + Internal.sanitize(str2));
        }
        String str3 = this.mobile_sdk_device_id;
        if (str3 != null) {
            arrayList.add("mobile_sdk_device_id=" + Internal.sanitize(str3));
        }
        String str4 = this.device_token;
        if (str4 != null) {
            arrayList.add("device_token=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AttestDeviceRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AttestDeviceRequest copy$default(AttestDeviceRequest attestDeviceRequest, DevicePlatform devicePlatform, String str, List list, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            devicePlatform = attestDeviceRequest.device_platform;
        }
        if ((i & 2) != 0) {
            str = attestDeviceRequest.attestation_object;
        }
        if ((i & 4) != 0) {
            list = attestDeviceRequest.attestation_chain;
        }
        if ((i & 8) != 0) {
            str2 = attestDeviceRequest.play_integrity_token;
        }
        if ((i & 16) != 0) {
            str3 = attestDeviceRequest.mobile_sdk_device_id;
        }
        if ((i & 32) != 0) {
            str4 = attestDeviceRequest.device_token;
        }
        if ((i & 64) != 0) {
            byteString = attestDeviceRequest.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        List list2 = list;
        return attestDeviceRequest.copy(devicePlatform, str, list2, str2, str6, str5, byteString2);
    }

    public final AttestDeviceRequest copy(DevicePlatform device_platform, String attestation_object, List<String> attestation_chain, String play_integrity_token, String mobile_sdk_device_id, String device_token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(device_platform, "device_platform");
        Intrinsics.checkNotNullParameter(attestation_chain, "attestation_chain");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AttestDeviceRequest(device_platform, attestation_object, attestation_chain, play_integrity_token, mobile_sdk_device_id, device_token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AttestDeviceRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AttestDeviceRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.baffi.proto.v1.publicservice.AttestDeviceRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AttestDeviceRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDevice_platform() != DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED) {
                    size += DevicePlatform.ADAPTER.encodedSizeWithTag(1, value.getDevice_platform());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getAttestation_object()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getAttestation_chain()) + protoAdapter.encodedSizeWithTag(4, value.getPlay_integrity_token()) + protoAdapter.encodedSizeWithTag(5, value.getMobile_sdk_device_id()) + protoAdapter.encodedSizeWithTag(6, value.getDevice_token());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AttestDeviceRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDevice_platform() != DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED) {
                    DevicePlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getDevice_platform());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAttestation_object());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getAttestation_chain());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getPlay_integrity_token());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getMobile_sdk_device_id());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDevice_token());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AttestDeviceRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDevice_token());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getMobile_sdk_device_id());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getPlay_integrity_token());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getAttestation_chain());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAttestation_object());
                if (value.getDevice_platform() != DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED) {
                    DevicePlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getDevice_platform());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AttestDeviceRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DevicePlatform devicePlatformDecode = DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                while (true) {
                    DevicePlatform devicePlatform = devicePlatformDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        devicePlatformDecode = DevicePlatform.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    arrayList.add(ProtoAdapter.STRING.decode(reader));
                                    break;
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new AttestDeviceRequest(devicePlatform, strDecode, arrayList, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AttestDeviceRequest redact(AttestDeviceRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AttestDeviceRequest.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
