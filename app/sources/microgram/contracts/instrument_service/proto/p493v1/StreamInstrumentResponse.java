package microgram.contracts.instrument_service.proto.p493v1;

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
import rosetta.instrument.IPOAccessStatus;
import rosetta.instrument.IssuerType;

/* compiled from: StreamInstrumentResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J<\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponse;", "Lcom/squareup/wire/Message;", "", "issuer_type", "Lrosetta/instrument/IssuerType;", "ipo_access_status", "Lrosetta/instrument/IPOAccessStatus;", "instrument_id", "", "symbol", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/instrument/IssuerType;Lrosetta/instrument/IPOAccessStatus;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getIssuer_type", "()Lrosetta/instrument/IssuerType;", "getIpo_access_status", "()Lrosetta/instrument/IPOAccessStatus;", "getInstrument_id", "()Ljava/lang/String;", "getSymbol", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamInstrumentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamInstrumentResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "rosetta.instrument.IPOAccessStatus#ADAPTER", jsonName = "ipoAccessStatus", schemaIndex = 1, tag = 2)
    private final IPOAccessStatus ipo_access_status;

    @WireField(adapter = "rosetta.instrument.IssuerType#ADAPTER", jsonName = "issuerType", schemaIndex = 0, tag = 1)
    private final IssuerType issuer_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    public StreamInstrumentResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ StreamInstrumentResponse(IssuerType issuerType, IPOAccessStatus iPOAccessStatus, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : issuerType, (i & 2) != 0 ? null : iPOAccessStatus, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29119newBuilder();
    }

    public final IssuerType getIssuer_type() {
        return this.issuer_type;
    }

    public final IPOAccessStatus getIpo_access_status() {
        return this.ipo_access_status;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamInstrumentResponse(IssuerType issuerType, IPOAccessStatus iPOAccessStatus, String instrument_id, String symbol, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.issuer_type = issuerType;
        this.ipo_access_status = iPOAccessStatus;
        this.instrument_id = instrument_id;
        this.symbol = symbol;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29119newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamInstrumentResponse)) {
            return false;
        }
        StreamInstrumentResponse streamInstrumentResponse = (StreamInstrumentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamInstrumentResponse.unknownFields()) && this.issuer_type == streamInstrumentResponse.issuer_type && this.ipo_access_status == streamInstrumentResponse.ipo_access_status && Intrinsics.areEqual(this.instrument_id, streamInstrumentResponse.instrument_id) && Intrinsics.areEqual(this.symbol, streamInstrumentResponse.symbol);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IssuerType issuerType = this.issuer_type;
        int iHashCode2 = (iHashCode + (issuerType != null ? issuerType.hashCode() : 0)) * 37;
        IPOAccessStatus iPOAccessStatus = this.ipo_access_status;
        int iHashCode3 = ((((iHashCode2 + (iPOAccessStatus != null ? iPOAccessStatus.hashCode() : 0)) * 37) + this.instrument_id.hashCode()) * 37) + this.symbol.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IssuerType issuerType = this.issuer_type;
        if (issuerType != null) {
            arrayList.add("issuer_type=" + issuerType);
        }
        IPOAccessStatus iPOAccessStatus = this.ipo_access_status;
        if (iPOAccessStatus != null) {
            arrayList.add("ipo_access_status=" + iPOAccessStatus);
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamInstrumentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamInstrumentResponse copy$default(StreamInstrumentResponse streamInstrumentResponse, IssuerType issuerType, IPOAccessStatus iPOAccessStatus, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            issuerType = streamInstrumentResponse.issuer_type;
        }
        if ((i & 2) != 0) {
            iPOAccessStatus = streamInstrumentResponse.ipo_access_status;
        }
        if ((i & 4) != 0) {
            str = streamInstrumentResponse.instrument_id;
        }
        if ((i & 8) != 0) {
            str2 = streamInstrumentResponse.symbol;
        }
        if ((i & 16) != 0) {
            byteString = streamInstrumentResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str;
        return streamInstrumentResponse.copy(issuerType, iPOAccessStatus, str3, str2, byteString2);
    }

    public final StreamInstrumentResponse copy(IssuerType issuer_type, IPOAccessStatus ipo_access_status, String instrument_id, String symbol, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamInstrumentResponse(issuer_type, ipo_access_status, instrument_id, symbol, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamInstrumentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamInstrumentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.instrument_service.proto.v1.StreamInstrumentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamInstrumentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + IssuerType.ADAPTER.encodedSizeWithTag(1, value.getIssuer_type()) + IPOAccessStatus.ADAPTER.encodedSizeWithTag(2, value.getIpo_access_status());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                return !Intrinsics.areEqual(value.getSymbol(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamInstrumentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                IssuerType.ADAPTER.encodeWithTag(writer, 1, (int) value.getIssuer_type());
                IPOAccessStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getIpo_access_status());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamInstrumentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                IPOAccessStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getIpo_access_status());
                IssuerType.ADAPTER.encodeWithTag(writer, 1, (int) value.getIssuer_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamInstrumentResponse redact(StreamInstrumentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamInstrumentResponse.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamInstrumentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IPOAccessStatus iPOAccessStatusDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                IssuerType issuerTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamInstrumentResponse(issuerTypeDecode, iPOAccessStatusDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            issuerTypeDecode = IssuerType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            iPOAccessStatusDecode = IPOAccessStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
