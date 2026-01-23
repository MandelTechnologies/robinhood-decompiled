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

/* compiled from: GetCryptoFeeTierInfoResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoResponse;", "Lcom/squareup/wire/Message;", "", "success", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoSuccessResponse;", "error", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoErrorResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoSuccessResponse;Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoErrorResponse;Lokio/ByteString;)V", "getSuccess", "()Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoSuccessResponse;", "getError", "()Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoErrorResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetCryptoFeeTierInfoResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoFeeTierInfoResponse> ADAPTER;

    @WireField(adapter = "crypto.fee_tier.proto.v1.GetCryptoFeeTierInfoErrorResponse#ADAPTER", oneofName = "response", schemaIndex = 1, tag = 2)
    private final GetCryptoFeeTierInfoErrorResponse error;

    @WireField(adapter = "crypto.fee_tier.proto.v1.GetCryptoFeeTierInfoSuccessResponse#ADAPTER", oneofName = "response", schemaIndex = 0, tag = 1)
    private final GetCryptoFeeTierInfoSuccessResponse success;

    public GetCryptoFeeTierInfoResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27785newBuilder();
    }

    public final GetCryptoFeeTierInfoSuccessResponse getSuccess() {
        return this.success;
    }

    public final GetCryptoFeeTierInfoErrorResponse getError() {
        return this.error;
    }

    public /* synthetic */ GetCryptoFeeTierInfoResponse(GetCryptoFeeTierInfoSuccessResponse getCryptoFeeTierInfoSuccessResponse, GetCryptoFeeTierInfoErrorResponse getCryptoFeeTierInfoErrorResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getCryptoFeeTierInfoSuccessResponse, (i & 2) != 0 ? null : getCryptoFeeTierInfoErrorResponse, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoFeeTierInfoResponse(GetCryptoFeeTierInfoSuccessResponse getCryptoFeeTierInfoSuccessResponse, GetCryptoFeeTierInfoErrorResponse getCryptoFeeTierInfoErrorResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.success = getCryptoFeeTierInfoSuccessResponse;
        this.error = getCryptoFeeTierInfoErrorResponse;
        if (Internal.countNonNull(getCryptoFeeTierInfoSuccessResponse, getCryptoFeeTierInfoErrorResponse) > 1) {
            throw new IllegalArgumentException("At most one of success, error may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27785newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoFeeTierInfoResponse)) {
            return false;
        }
        GetCryptoFeeTierInfoResponse getCryptoFeeTierInfoResponse = (GetCryptoFeeTierInfoResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoFeeTierInfoResponse.unknownFields()) && Intrinsics.areEqual(this.success, getCryptoFeeTierInfoResponse.success) && Intrinsics.areEqual(this.error, getCryptoFeeTierInfoResponse.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GetCryptoFeeTierInfoSuccessResponse getCryptoFeeTierInfoSuccessResponse = this.success;
        int iHashCode2 = (iHashCode + (getCryptoFeeTierInfoSuccessResponse != null ? getCryptoFeeTierInfoSuccessResponse.hashCode() : 0)) * 37;
        GetCryptoFeeTierInfoErrorResponse getCryptoFeeTierInfoErrorResponse = this.error;
        int iHashCode3 = iHashCode2 + (getCryptoFeeTierInfoErrorResponse != null ? getCryptoFeeTierInfoErrorResponse.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GetCryptoFeeTierInfoSuccessResponse getCryptoFeeTierInfoSuccessResponse = this.success;
        if (getCryptoFeeTierInfoSuccessResponse != null) {
            arrayList.add("success=" + getCryptoFeeTierInfoSuccessResponse);
        }
        GetCryptoFeeTierInfoErrorResponse getCryptoFeeTierInfoErrorResponse = this.error;
        if (getCryptoFeeTierInfoErrorResponse != null) {
            arrayList.add("error=" + getCryptoFeeTierInfoErrorResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoFeeTierInfoResponse{", "}", 0, null, null, 56, null);
    }

    public final GetCryptoFeeTierInfoResponse copy(GetCryptoFeeTierInfoSuccessResponse success, GetCryptoFeeTierInfoErrorResponse error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoFeeTierInfoResponse(success, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoFeeTierInfoResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoFeeTierInfoResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.GetCryptoFeeTierInfoResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoFeeTierInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + GetCryptoFeeTierInfoSuccessResponse.ADAPTER.encodedSizeWithTag(1, value.getSuccess()) + GetCryptoFeeTierInfoErrorResponse.ADAPTER.encodedSizeWithTag(2, value.getError());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoFeeTierInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetCryptoFeeTierInfoSuccessResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getSuccess());
                GetCryptoFeeTierInfoErrorResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoFeeTierInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetCryptoFeeTierInfoErrorResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                GetCryptoFeeTierInfoSuccessResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getSuccess());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoFeeTierInfoResponse redact(GetCryptoFeeTierInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetCryptoFeeTierInfoSuccessResponse success = value.getSuccess();
                GetCryptoFeeTierInfoSuccessResponse getCryptoFeeTierInfoSuccessResponseRedact = success != null ? GetCryptoFeeTierInfoSuccessResponse.ADAPTER.redact(success) : null;
                GetCryptoFeeTierInfoErrorResponse error = value.getError();
                return value.copy(getCryptoFeeTierInfoSuccessResponseRedact, error != null ? GetCryptoFeeTierInfoErrorResponse.ADAPTER.redact(error) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoFeeTierInfoResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GetCryptoFeeTierInfoSuccessResponse getCryptoFeeTierInfoSuccessResponseDecode = null;
                GetCryptoFeeTierInfoErrorResponse getCryptoFeeTierInfoErrorResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoFeeTierInfoResponse(getCryptoFeeTierInfoSuccessResponseDecode, getCryptoFeeTierInfoErrorResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        getCryptoFeeTierInfoSuccessResponseDecode = GetCryptoFeeTierInfoSuccessResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        getCryptoFeeTierInfoErrorResponseDecode = GetCryptoFeeTierInfoErrorResponse.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
