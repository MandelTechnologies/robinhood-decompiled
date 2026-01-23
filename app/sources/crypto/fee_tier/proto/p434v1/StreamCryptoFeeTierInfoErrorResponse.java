package crypto.fee_tier.proto.p434v1;

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

/* compiled from: StreamCryptoFeeTierInfoErrorResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponse;", "Lcom/squareup/wire/Message;", "", "error_type", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorType;Lokio/ByteString;)V", "getError_type", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoFeeTierInfoErrorResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoFeeTierInfoErrorResponse> ADAPTER;

    @WireField(adapter = "crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final StreamCryptoFeeTierInfoErrorType error_type;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamCryptoFeeTierInfoErrorResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27794newBuilder();
    }

    public final StreamCryptoFeeTierInfoErrorType getError_type() {
        return this.error_type;
    }

    public /* synthetic */ StreamCryptoFeeTierInfoErrorResponse(StreamCryptoFeeTierInfoErrorType streamCryptoFeeTierInfoErrorType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StreamCryptoFeeTierInfoErrorType.ERROR_UNSPECIFIED : streamCryptoFeeTierInfoErrorType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoFeeTierInfoErrorResponse(StreamCryptoFeeTierInfoErrorType error_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.error_type = error_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27794newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoFeeTierInfoErrorResponse)) {
            return false;
        }
        StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponse = (StreamCryptoFeeTierInfoErrorResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoFeeTierInfoErrorResponse.unknownFields()) && this.error_type == streamCryptoFeeTierInfoErrorResponse.error_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.error_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("error_type=" + this.error_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoFeeTierInfoErrorResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamCryptoFeeTierInfoErrorResponse copy$default(StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponse, StreamCryptoFeeTierInfoErrorType streamCryptoFeeTierInfoErrorType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            streamCryptoFeeTierInfoErrorType = streamCryptoFeeTierInfoErrorResponse.error_type;
        }
        if ((i & 2) != 0) {
            byteString = streamCryptoFeeTierInfoErrorResponse.unknownFields();
        }
        return streamCryptoFeeTierInfoErrorResponse.copy(streamCryptoFeeTierInfoErrorType, byteString);
    }

    public final StreamCryptoFeeTierInfoErrorResponse copy(StreamCryptoFeeTierInfoErrorType error_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoFeeTierInfoErrorResponse(error_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoFeeTierInfoErrorResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoFeeTierInfoErrorResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoErrorResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoFeeTierInfoErrorResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getError_type() != StreamCryptoFeeTierInfoErrorType.ERROR_UNSPECIFIED ? size + StreamCryptoFeeTierInfoErrorType.ADAPTER.encodedSizeWithTag(1, value.getError_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoFeeTierInfoErrorResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getError_type() != StreamCryptoFeeTierInfoErrorType.ERROR_UNSPECIFIED) {
                    StreamCryptoFeeTierInfoErrorType.ADAPTER.encodeWithTag(writer, 1, (int) value.getError_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoFeeTierInfoErrorResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getError_type() != StreamCryptoFeeTierInfoErrorType.ERROR_UNSPECIFIED) {
                    StreamCryptoFeeTierInfoErrorType.ADAPTER.encodeWithTag(writer, 1, (int) value.getError_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoFeeTierInfoErrorResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                StreamCryptoFeeTierInfoErrorType streamCryptoFeeTierInfoErrorTypeDecode = StreamCryptoFeeTierInfoErrorType.ERROR_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoFeeTierInfoErrorResponse(streamCryptoFeeTierInfoErrorTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            streamCryptoFeeTierInfoErrorTypeDecode = StreamCryptoFeeTierInfoErrorType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoFeeTierInfoErrorResponse redact(StreamCryptoFeeTierInfoErrorResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamCryptoFeeTierInfoErrorResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
