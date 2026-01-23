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

/* compiled from: FundamentalDetail.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lmd_server_proxy/service/v1/FundamentalDetail;", "Lcom/squareup/wire/Message;", "", "status", "Lmd_server_proxy/service/v1/Status;", "error", "Lmd_server_proxy/service/v1/Error;", WebsocketGatewayConstants.DATA_KEY, "Lmd_server_proxy/service/v1/Fundamental;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmd_server_proxy/service/v1/Status;Lmd_server_proxy/service/v1/Error;Lmd_server_proxy/service/v1/Fundamental;Lokio/ByteString;)V", "getStatus", "()Lmd_server_proxy/service/v1/Status;", "getError", "()Lmd_server_proxy/service/v1/Error;", "getData", "()Lmd_server_proxy/service/v1/Fundamental;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class FundamentalDetail extends Message {

    @JvmField
    public static final ProtoAdapter<FundamentalDetail> ADAPTER;

    @WireField(adapter = "md_server_proxy.service.v1.Fundamental#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Fundamental data;

    @WireField(adapter = "md_server_proxy.service.v1.Error#ADAPTER", schemaIndex = 1, tag = 2)
    private final Error error;

    @WireField(adapter = "md_server_proxy.service.v1.Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Status status;

    public FundamentalDetail() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28914newBuilder();
    }

    public final Status getStatus() {
        return this.status;
    }

    public /* synthetic */ FundamentalDetail(Status status, Error error, Fundamental fundamental, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Status.STATUS_UNSPECIFIED : status, (i & 2) != 0 ? null : error, (i & 4) != 0 ? null : fundamental, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Error getError() {
        return this.error;
    }

    public final Fundamental getData() {
        return this.data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundamentalDetail(Status status, Error error, Fundamental fundamental, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
        this.error = error;
        this.data = fundamental;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28914newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FundamentalDetail)) {
            return false;
        }
        FundamentalDetail fundamentalDetail = (FundamentalDetail) other;
        return Intrinsics.areEqual(unknownFields(), fundamentalDetail.unknownFields()) && this.status == fundamentalDetail.status && Intrinsics.areEqual(this.error, fundamentalDetail.error) && Intrinsics.areEqual(this.data, fundamentalDetail.data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        Error error = this.error;
        int iHashCode2 = (iHashCode + (error != null ? error.hashCode() : 0)) * 37;
        Fundamental fundamental = this.data;
        int iHashCode3 = iHashCode2 + (fundamental != null ? fundamental.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + this.status);
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        Fundamental fundamental = this.data;
        if (fundamental != null) {
            arrayList.add("data=" + fundamental);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FundamentalDetail{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FundamentalDetail copy$default(FundamentalDetail fundamentalDetail, Status status, Error error, Fundamental fundamental, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            status = fundamentalDetail.status;
        }
        if ((i & 2) != 0) {
            error = fundamentalDetail.error;
        }
        if ((i & 4) != 0) {
            fundamental = fundamentalDetail.data;
        }
        if ((i & 8) != 0) {
            byteString = fundamentalDetail.unknownFields();
        }
        return fundamentalDetail.copy(status, error, fundamental, byteString);
    }

    public final FundamentalDetail copy(Status status, Error error, Fundamental data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FundamentalDetail(status, error, data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FundamentalDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FundamentalDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.FundamentalDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FundamentalDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStatus() != Status.STATUS_UNSPECIFIED) {
                    size += Status.ADAPTER.encodedSizeWithTag(1, value.getStatus());
                }
                int iEncodedSizeWithTag = size + Error.ADAPTER.encodedSizeWithTag(2, value.getError());
                return value.getData() != null ? iEncodedSizeWithTag + Fundamental.ADAPTER.encodedSizeWithTag(3, value.getData()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FundamentalDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStatus() != Status.STATUS_UNSPECIFIED) {
                    Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
                Error.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                if (value.getData() != null) {
                    Fundamental.ADAPTER.encodeWithTag(writer, 3, (int) value.getData());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FundamentalDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getData() != null) {
                    Fundamental.ADAPTER.encodeWithTag(writer, 3, (int) value.getData());
                }
                Error.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                if (value.getStatus() != Status.STATUS_UNSPECIFIED) {
                    Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FundamentalDetail decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Status statusDecode = Status.STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Error errorDecode = null;
                Fundamental fundamentalDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FundamentalDetail(statusDecode, errorDecode, fundamentalDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                        fundamentalDecode = Fundamental.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FundamentalDetail redact(FundamentalDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Error error = value.getError();
                Error errorRedact = error != null ? Error.ADAPTER.redact(error) : null;
                Fundamental data = value.getData();
                return FundamentalDetail.copy$default(value, null, errorRedact, data != null ? Fundamental.ADAPTER.redact(data) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
