package com.robinhood.copilot.proto.p286v1;

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
import p479j$.time.Instant;

/* compiled from: ClearCryptoDigestCacheResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/ClearCryptoDigestCacheResponse;", "Lcom/squareup/wire/Message;", "", "", "message", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "is_successful", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;ZLokio/ByteString;)Lcom/robinhood/copilot/proto/v1/ClearCryptoDigestCacheResponse;", "Ljava/lang/String;", "getMessage", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Z", "()Z", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ClearCryptoDigestCacheResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ClearCryptoDigestCacheResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSuccessful", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_successful;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClearCryptoDigestCacheResponse() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22075newBuilder();
    }

    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ ClearCryptoDigestCacheResponse(String str, Instant instant, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: is_successful, reason: from getter */
    public final boolean getIs_successful() {
        return this.is_successful;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearCryptoDigestCacheResponse(String message, Instant instant, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.message = message;
        this.timestamp = instant;
        this.is_successful = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22075newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClearCryptoDigestCacheResponse)) {
            return false;
        }
        ClearCryptoDigestCacheResponse clearCryptoDigestCacheResponse = (ClearCryptoDigestCacheResponse) other;
        return Intrinsics.areEqual(unknownFields(), clearCryptoDigestCacheResponse.unknownFields()) && Intrinsics.areEqual(this.message, clearCryptoDigestCacheResponse.message) && Intrinsics.areEqual(this.timestamp, clearCryptoDigestCacheResponse.timestamp) && this.is_successful == clearCryptoDigestCacheResponse.is_successful;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.message.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_successful);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("message=" + Internal.sanitize(this.message));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("is_successful=" + this.is_successful);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClearCryptoDigestCacheResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClearCryptoDigestCacheResponse copy$default(ClearCryptoDigestCacheResponse clearCryptoDigestCacheResponse, String str, Instant instant, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clearCryptoDigestCacheResponse.message;
        }
        if ((i & 2) != 0) {
            instant = clearCryptoDigestCacheResponse.timestamp;
        }
        if ((i & 4) != 0) {
            z = clearCryptoDigestCacheResponse.is_successful;
        }
        if ((i & 8) != 0) {
            byteString = clearCryptoDigestCacheResponse.unknownFields();
        }
        return clearCryptoDigestCacheResponse.copy(str, instant, z, byteString);
    }

    public final ClearCryptoDigestCacheResponse copy(String message, Instant timestamp, boolean is_successful, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClearCryptoDigestCacheResponse(message, timestamp, is_successful, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClearCryptoDigestCacheResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClearCryptoDigestCacheResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.ClearCryptoDigestCacheResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClearCryptoDigestCacheResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                return value.getIs_successful() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_successful())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClearCryptoDigestCacheResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getIs_successful()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_successful()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClearCryptoDigestCacheResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_successful()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_successful()));
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (Intrinsics.areEqual(value.getMessage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClearCryptoDigestCacheResponse redact(ClearCryptoDigestCacheResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClearCryptoDigestCacheResponse.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, false, ByteString.EMPTY, 5, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClearCryptoDigestCacheResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ClearCryptoDigestCacheResponse(strDecode, instantDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
