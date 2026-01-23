package com.robinhood.baffi.proto.p282v1.publicservice;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: DeviceAttestStatusResponse.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponse;", "Lcom/squareup/wire/Message;", "", "registered", "", "nonce_base64", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Lokio/ByteString;)V", "getRegistered", "()Z", "getNonce_base64", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DeviceAttestStatusResponse extends Message {

    @JvmField
    public static final ProtoAdapter<DeviceAttestStatusResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nonceBase64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String nonce_base64;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean registered;

    public DeviceAttestStatusResponse() {
        this(false, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20227newBuilder();
    }

    public final boolean getRegistered() {
        return this.registered;
    }

    public final String getNonce_base64() {
        return this.nonce_base64;
    }

    public /* synthetic */ DeviceAttestStatusResponse(boolean z, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAttestStatusResponse(boolean z, String nonce_base64, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(nonce_base64, "nonce_base64");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.registered = z;
        this.nonce_base64 = nonce_base64;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20227newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeviceAttestStatusResponse)) {
            return false;
        }
        DeviceAttestStatusResponse deviceAttestStatusResponse = (DeviceAttestStatusResponse) other;
        return Intrinsics.areEqual(unknownFields(), deviceAttestStatusResponse.unknownFields()) && this.registered == deviceAttestStatusResponse.registered && Intrinsics.areEqual(this.nonce_base64, deviceAttestStatusResponse.nonce_base64);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.registered)) * 37) + this.nonce_base64.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("registered=" + this.registered);
        arrayList.add("nonce_base64=" + Internal.sanitize(this.nonce_base64));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceAttestStatusResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DeviceAttestStatusResponse copy$default(DeviceAttestStatusResponse deviceAttestStatusResponse, boolean z, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceAttestStatusResponse.registered;
        }
        if ((i & 2) != 0) {
            str = deviceAttestStatusResponse.nonce_base64;
        }
        if ((i & 4) != 0) {
            byteString = deviceAttestStatusResponse.unknownFields();
        }
        return deviceAttestStatusResponse.copy(z, str, byteString);
    }

    public final DeviceAttestStatusResponse copy(boolean registered, String nonce_base64, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(nonce_base64, "nonce_base64");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeviceAttestStatusResponse(registered, nonce_base64, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceAttestStatusResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeviceAttestStatusResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.baffi.proto.v1.publicservice.DeviceAttestStatusResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeviceAttestStatusResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRegistered()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getRegistered()));
                }
                return !Intrinsics.areEqual(value.getNonce_base64(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNonce_base64()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeviceAttestStatusResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRegistered()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getRegistered()));
                }
                if (!Intrinsics.areEqual(value.getNonce_base64(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNonce_base64());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeviceAttestStatusResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNonce_base64(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNonce_base64());
                }
                if (value.getRegistered()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getRegistered()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeviceAttestStatusResponse redact(DeviceAttestStatusResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DeviceAttestStatusResponse.copy$default(value, false, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeviceAttestStatusResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DeviceAttestStatusResponse(zBooleanValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
