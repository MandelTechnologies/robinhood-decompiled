package crypto.fee_tier.proto.p434v1;

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

/* compiled from: StreamCryptoFeeTierInfoResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponse;", "Lcom/squareup/wire/Message;", "", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "success", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponse;", "error", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2;", "success_v2", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponse;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponse;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2;Lokio/ByteString;)Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponse;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "getSuccess", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "getSuccess$annotations", "()V", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponse;", "getError", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponse;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2;", "getSuccess_v2", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2;", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoFeeTierInfoResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoFeeTierInfoResponse> ADAPTER;

    @WireField(adapter = "crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoErrorResponse#ADAPTER", oneofName = "response", schemaIndex = 1, tag = 2)
    private final StreamCryptoFeeTierInfoErrorResponse error;

    @WireField(adapter = "crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponse#ADAPTER", oneofName = "response", schemaIndex = 0, tag = 1)
    private final StreamCryptoFeeTierInfoSuccessResponse success;

    @WireField(adapter = "crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponseV2#ADAPTER", jsonName = "successV2", oneofName = "response", schemaIndex = 2, tag = 3)
    private final StreamCryptoFeeTierInfoSuccessResponseV2 success_v2;

    public StreamCryptoFeeTierInfoResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27799newBuilder();
    }

    public final StreamCryptoFeeTierInfoSuccessResponse getSuccess() {
        return this.success;
    }

    public final StreamCryptoFeeTierInfoErrorResponse getError() {
        return this.error;
    }

    public final StreamCryptoFeeTierInfoSuccessResponseV2 getSuccess_v2() {
        return this.success_v2;
    }

    public /* synthetic */ StreamCryptoFeeTierInfoResponse(StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponse, StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponse, StreamCryptoFeeTierInfoSuccessResponseV2 streamCryptoFeeTierInfoSuccessResponseV2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : streamCryptoFeeTierInfoSuccessResponse, (i & 2) != 0 ? null : streamCryptoFeeTierInfoErrorResponse, (i & 4) != 0 ? null : streamCryptoFeeTierInfoSuccessResponseV2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoFeeTierInfoResponse(StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponse, StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponse, StreamCryptoFeeTierInfoSuccessResponseV2 streamCryptoFeeTierInfoSuccessResponseV2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.success = streamCryptoFeeTierInfoSuccessResponse;
        this.error = streamCryptoFeeTierInfoErrorResponse;
        this.success_v2 = streamCryptoFeeTierInfoSuccessResponseV2;
        if (Internal.countNonNull(streamCryptoFeeTierInfoSuccessResponse, streamCryptoFeeTierInfoErrorResponse, streamCryptoFeeTierInfoSuccessResponseV2) > 1) {
            throw new IllegalArgumentException("At most one of success, error, success_v2 may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27799newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoFeeTierInfoResponse)) {
            return false;
        }
        StreamCryptoFeeTierInfoResponse streamCryptoFeeTierInfoResponse = (StreamCryptoFeeTierInfoResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoFeeTierInfoResponse.unknownFields()) && Intrinsics.areEqual(this.success, streamCryptoFeeTierInfoResponse.success) && Intrinsics.areEqual(this.error, streamCryptoFeeTierInfoResponse.error) && Intrinsics.areEqual(this.success_v2, streamCryptoFeeTierInfoResponse.success_v2);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponse = this.success;
        int iHashCode2 = (iHashCode + (streamCryptoFeeTierInfoSuccessResponse != null ? streamCryptoFeeTierInfoSuccessResponse.hashCode() : 0)) * 37;
        StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponse = this.error;
        int iHashCode3 = (iHashCode2 + (streamCryptoFeeTierInfoErrorResponse != null ? streamCryptoFeeTierInfoErrorResponse.hashCode() : 0)) * 37;
        StreamCryptoFeeTierInfoSuccessResponseV2 streamCryptoFeeTierInfoSuccessResponseV2 = this.success_v2;
        int iHashCode4 = iHashCode3 + (streamCryptoFeeTierInfoSuccessResponseV2 != null ? streamCryptoFeeTierInfoSuccessResponseV2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponse = this.success;
        if (streamCryptoFeeTierInfoSuccessResponse != null) {
            arrayList.add("success=" + streamCryptoFeeTierInfoSuccessResponse);
        }
        StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponse = this.error;
        if (streamCryptoFeeTierInfoErrorResponse != null) {
            arrayList.add("error=" + streamCryptoFeeTierInfoErrorResponse);
        }
        StreamCryptoFeeTierInfoSuccessResponseV2 streamCryptoFeeTierInfoSuccessResponseV2 = this.success_v2;
        if (streamCryptoFeeTierInfoSuccessResponseV2 != null) {
            arrayList.add("success_v2=" + streamCryptoFeeTierInfoSuccessResponseV2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoFeeTierInfoResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamCryptoFeeTierInfoResponse copy(StreamCryptoFeeTierInfoSuccessResponse success, StreamCryptoFeeTierInfoErrorResponse error, StreamCryptoFeeTierInfoSuccessResponseV2 success_v2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoFeeTierInfoResponse(success, error, success_v2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoFeeTierInfoResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoFeeTierInfoResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoFeeTierInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StreamCryptoFeeTierInfoSuccessResponse.ADAPTER.encodedSizeWithTag(1, value.getSuccess()) + StreamCryptoFeeTierInfoErrorResponse.ADAPTER.encodedSizeWithTag(2, value.getError()) + StreamCryptoFeeTierInfoSuccessResponseV2.ADAPTER.encodedSizeWithTag(3, value.getSuccess_v2());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoFeeTierInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoFeeTierInfoSuccessResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getSuccess());
                StreamCryptoFeeTierInfoErrorResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                StreamCryptoFeeTierInfoSuccessResponseV2.ADAPTER.encodeWithTag(writer, 3, (int) value.getSuccess_v2());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoFeeTierInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamCryptoFeeTierInfoSuccessResponseV2.ADAPTER.encodeWithTag(writer, 3, (int) value.getSuccess_v2());
                StreamCryptoFeeTierInfoErrorResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                StreamCryptoFeeTierInfoSuccessResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getSuccess());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoFeeTierInfoResponse redact(StreamCryptoFeeTierInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoFeeTierInfoSuccessResponse success = value.getSuccess();
                StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponseRedact = success != null ? StreamCryptoFeeTierInfoSuccessResponse.ADAPTER.redact(success) : null;
                StreamCryptoFeeTierInfoErrorResponse error = value.getError();
                StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponseRedact = error != null ? StreamCryptoFeeTierInfoErrorResponse.ADAPTER.redact(error) : null;
                StreamCryptoFeeTierInfoSuccessResponseV2 success_v2 = value.getSuccess_v2();
                return value.copy(streamCryptoFeeTierInfoSuccessResponseRedact, streamCryptoFeeTierInfoErrorResponseRedact, success_v2 != null ? StreamCryptoFeeTierInfoSuccessResponseV2.ADAPTER.redact(success_v2) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoFeeTierInfoResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponseDecode = null;
                StreamCryptoFeeTierInfoErrorResponse streamCryptoFeeTierInfoErrorResponseDecode = null;
                StreamCryptoFeeTierInfoSuccessResponseV2 streamCryptoFeeTierInfoSuccessResponseV2Decode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoFeeTierInfoResponse(streamCryptoFeeTierInfoSuccessResponseDecode, streamCryptoFeeTierInfoErrorResponseDecode, streamCryptoFeeTierInfoSuccessResponseV2Decode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        streamCryptoFeeTierInfoSuccessResponseDecode = StreamCryptoFeeTierInfoSuccessResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        streamCryptoFeeTierInfoErrorResponseDecode = StreamCryptoFeeTierInfoErrorResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        streamCryptoFeeTierInfoSuccessResponseV2Decode = StreamCryptoFeeTierInfoSuccessResponseV2.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
