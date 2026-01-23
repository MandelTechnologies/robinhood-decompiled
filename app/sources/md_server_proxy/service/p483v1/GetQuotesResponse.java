package md_server_proxy.service.p483v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: GetQuotesResponse.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesResponse;", "Lcom/squareup/wire/Message;", "", "status", "Lmd_server_proxy/service/v1/Status;", "error", "Lmd_server_proxy/service/v1/Error;", WebsocketGatewayConstants.DATA_KEY, "", "Lmd_server_proxy/service/v1/QuoteDetail;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmd_server_proxy/service/v1/Status;Lmd_server_proxy/service/v1/Error;Ljava/util/List;Lokio/ByteString;)V", "getStatus", "()Lmd_server_proxy/service/v1/Status;", "getError", "()Lmd_server_proxy/service/v1/Error;", "getData", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetQuotesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetQuotesResponse> ADAPTER;

    @WireField(adapter = "md_server_proxy.service.v1.QuoteDetail#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<QuoteDetail> data;

    @WireField(adapter = "md_server_proxy.service.v1.Error#ADAPTER", schemaIndex = 1, tag = 2)
    private final Error error;

    @WireField(adapter = "md_server_proxy.service.v1.Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Status status;

    public GetQuotesResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28920newBuilder();
    }

    public final Status getStatus() {
        return this.status;
    }

    public /* synthetic */ GetQuotesResponse(Status status, Error error, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Status.STATUS_UNSPECIFIED : status, (i & 2) != 0 ? null : error, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Error getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetQuotesResponse(Status status, Error error, List<QuoteDetail> data, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
        this.error = error;
        this.data = Internal.immutableCopyOf(WebsocketGatewayConstants.DATA_KEY, data);
    }

    public final List<QuoteDetail> getData() {
        return this.data;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28920newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetQuotesResponse)) {
            return false;
        }
        GetQuotesResponse getQuotesResponse = (GetQuotesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getQuotesResponse.unknownFields()) && this.status == getQuotesResponse.status && Intrinsics.areEqual(this.error, getQuotesResponse.error) && Intrinsics.areEqual(this.data, getQuotesResponse.data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        Error error = this.error;
        int iHashCode2 = ((iHashCode + (error != null ? error.hashCode() : 0)) * 37) + this.data.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + this.status);
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        if (!this.data.isEmpty()) {
            arrayList.add("data=" + this.data);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetQuotesResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetQuotesResponse copy$default(GetQuotesResponse getQuotesResponse, Status status, Error error, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            status = getQuotesResponse.status;
        }
        if ((i & 2) != 0) {
            error = getQuotesResponse.error;
        }
        if ((i & 4) != 0) {
            list = getQuotesResponse.data;
        }
        if ((i & 8) != 0) {
            byteString = getQuotesResponse.unknownFields();
        }
        return getQuotesResponse.copy(status, error, list, byteString);
    }

    public final GetQuotesResponse copy(Status status, Error error, List<QuoteDetail> data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetQuotesResponse(status, error, data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetQuotesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetQuotesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.GetQuotesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetQuotesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStatus() != Status.STATUS_UNSPECIFIED) {
                    size += Status.ADAPTER.encodedSizeWithTag(1, value.getStatus());
                }
                return size + Error.ADAPTER.encodedSizeWithTag(2, value.getError()) + QuoteDetail.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getData());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetQuotesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStatus() != Status.STATUS_UNSPECIFIED) {
                    Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
                Error.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                QuoteDetail.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getData());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetQuotesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                QuoteDetail.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getData());
                Error.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                if (value.getStatus() != Status.STATUS_UNSPECIFIED) {
                    Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetQuotesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Status statusDecode = Status.STATUS_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Error errorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetQuotesResponse(statusDecode, errorDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            statusDecode = Status.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        errorDecode = Error.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(QuoteDetail.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetQuotesResponse redact(GetQuotesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Error error = value.getError();
                return GetQuotesResponse.copy$default(value, null, error != null ? Error.ADAPTER.redact(error) : null, Internal.m26823redactElements(value.getData(), QuoteDetail.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
