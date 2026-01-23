package bonfire.proto.idl.portfolio.p037v1;

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

/* compiled from: GetAccountPositionsV2Request.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JJ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2Request;", "Lcom/squareup/wire/Message;", "", "account_number", "", "instrument_type", "positions_location", "Lbonfire/proto/idl/portfolio/v1/PositionsLocation;", "sort_direction", "Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;", "sort_type", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocation;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getInstrument_type", "getPositions_location", "()Lbonfire/proto/idl/portfolio/v1/PositionsLocation;", "getSort_direction", "()Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;", "getSort_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAccountPositionsV2Request extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountPositionsV2Request> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String instrument_type;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionsLocation#ADAPTER", schemaIndex = 2, tag = 3)
    private final PositionsLocation positions_location;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionsSortDirection#ADAPTER", schemaIndex = 3, tag = 4)
    private final PositionsSortDirection sort_direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String sort_type;

    public GetAccountPositionsV2Request() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9023newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetAccountPositionsV2Request(String str, String str2, PositionsLocation positionsLocation, PositionsSortDirection positionsSortDirection, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : positionsLocation, (i & 8) != 0 ? null : positionsSortDirection, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final PositionsLocation getPositions_location() {
        return this.positions_location;
    }

    public final PositionsSortDirection getSort_direction() {
        return this.sort_direction;
    }

    public final String getSort_type() {
        return this.sort_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionsV2Request(String account_number, String str, PositionsLocation positionsLocation, PositionsSortDirection positionsSortDirection, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.instrument_type = str;
        this.positions_location = positionsLocation;
        this.sort_direction = positionsSortDirection;
        this.sort_type = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9023newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountPositionsV2Request)) {
            return false;
        }
        GetAccountPositionsV2Request getAccountPositionsV2Request = (GetAccountPositionsV2Request) other;
        return Intrinsics.areEqual(unknownFields(), getAccountPositionsV2Request.unknownFields()) && Intrinsics.areEqual(this.account_number, getAccountPositionsV2Request.account_number) && Intrinsics.areEqual(this.instrument_type, getAccountPositionsV2Request.instrument_type) && this.positions_location == getAccountPositionsV2Request.positions_location && this.sort_direction == getAccountPositionsV2Request.sort_direction && Intrinsics.areEqual(this.sort_type, getAccountPositionsV2Request.sort_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        String str = this.instrument_type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        PositionsLocation positionsLocation = this.positions_location;
        int iHashCode3 = (iHashCode2 + (positionsLocation != null ? positionsLocation.hashCode() : 0)) * 37;
        PositionsSortDirection positionsSortDirection = this.sort_direction;
        int iHashCode4 = (iHashCode3 + (positionsSortDirection != null ? positionsSortDirection.hashCode() : 0)) * 37;
        String str2 = this.sort_type;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        String str = this.instrument_type;
        if (str != null) {
            arrayList.add("instrument_type=" + Internal.sanitize(str));
        }
        PositionsLocation positionsLocation = this.positions_location;
        if (positionsLocation != null) {
            arrayList.add("positions_location=" + positionsLocation);
        }
        PositionsSortDirection positionsSortDirection = this.sort_direction;
        if (positionsSortDirection != null) {
            arrayList.add("sort_direction=" + positionsSortDirection);
        }
        String str2 = this.sort_type;
        if (str2 != null) {
            arrayList.add("sort_type=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountPositionsV2Request{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountPositionsV2Request copy$default(GetAccountPositionsV2Request getAccountPositionsV2Request, String str, String str2, PositionsLocation positionsLocation, PositionsSortDirection positionsSortDirection, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountPositionsV2Request.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getAccountPositionsV2Request.instrument_type;
        }
        if ((i & 4) != 0) {
            positionsLocation = getAccountPositionsV2Request.positions_location;
        }
        if ((i & 8) != 0) {
            positionsSortDirection = getAccountPositionsV2Request.sort_direction;
        }
        if ((i & 16) != 0) {
            str3 = getAccountPositionsV2Request.sort_type;
        }
        if ((i & 32) != 0) {
            byteString = getAccountPositionsV2Request.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return getAccountPositionsV2Request.copy(str, str2, positionsLocation, positionsSortDirection, str4, byteString2);
    }

    public final GetAccountPositionsV2Request copy(String account_number, String instrument_type, PositionsLocation positions_location, PositionsSortDirection sort_direction, String sort_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountPositionsV2Request(account_number, instrument_type, positions_location, sort_direction, sort_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountPositionsV2Request.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountPositionsV2Request>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2Request$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountPositionsV2Request value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getInstrument_type()) + PositionsLocation.ADAPTER.encodedSizeWithTag(3, value.getPositions_location()) + PositionsSortDirection.ADAPTER.encodedSizeWithTag(4, value.getSort_direction()) + protoAdapter.encodedSizeWithTag(5, value.getSort_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountPositionsV2Request value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                PositionsLocation.ADAPTER.encodeWithTag(writer, 3, (int) value.getPositions_location());
                PositionsSortDirection.ADAPTER.encodeWithTag(writer, 4, (int) value.getSort_direction());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSort_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountPositionsV2Request value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSort_type());
                PositionsSortDirection.ADAPTER.encodeWithTag(writer, 4, (int) value.getSort_direction());
                PositionsLocation.ADAPTER.encodeWithTag(writer, 3, (int) value.getPositions_location());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInstrument_type());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionsV2Request redact(GetAccountPositionsV2Request value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountPositionsV2Request.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionsV2Request decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                PositionsLocation positionsLocationDecode = null;
                PositionsSortDirection positionsSortDirectionDecode = null;
                String strDecode3 = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetAccountPositionsV2Request(str, strDecode2, positionsLocationDecode, positionsSortDirectionDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                try {
                                    positionsLocationDecode = PositionsLocation.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 4) {
                                try {
                                    positionsSortDirectionDecode = PositionsSortDirection.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else if (iNextTag == 5) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        };
    }
}
