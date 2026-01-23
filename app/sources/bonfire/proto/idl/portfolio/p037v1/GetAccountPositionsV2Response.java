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
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetAccountPositionsV2Response.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u008f\u0001\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0093\u0001\u0010.\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010/R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2Response;", "Lcom/squareup/wire/Message;", "", "header", "", "", Footer.f10637type, "results", "", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2;", "instrument_type", "account_number", "positions_location", "Lbonfire/proto/idl/portfolio/v1/PositionsLocation;", "sort_type", "sort_direction", "Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;", "options_asset_home_header_tag", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocation;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;Ljava/lang/Integer;Lokio/ByteString;)V", "getInstrument_type", "()Ljava/lang/String;", "getAccount_number", "getPositions_location", "()Lbonfire/proto/idl/portfolio/v1/PositionsLocation;", "getSort_type", "getSort_direction", "()Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;", "getOptions_asset_home_header_tag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeader", "()Ljava/util/Map;", "getFooter", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocation;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirection;Ljava/lang/Integer;Lokio/ByteString;)Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2Response;", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAccountPositionsV2Response extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountPositionsV2Response> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Map<String, ?> footer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Map<String, ?> header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 8, tag = 9)
    private final Integer options_asset_home_header_tag;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionsLocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final PositionsLocation positions_location;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionListItemV2#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PositionListItemV2> results;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionsSortDirection#ADAPTER", schemaIndex = 7, tag = 8)
    private final PositionsSortDirection sort_direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String sort_type;

    public GetAccountPositionsV2Response() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9025newBuilder();
    }

    public /* synthetic */ GetAccountPositionsV2Response(Map map, Map map2, List list, String str, String str2, PositionsLocation positionsLocation, String str3, PositionsSortDirection positionsSortDirection, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? PositionsLocation.PositionsLocation_UNSPECIFIED : positionsLocation, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : positionsSortDirection, (i & 256) != 0 ? null : num, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final PositionsLocation getPositions_location() {
        return this.positions_location;
    }

    public final String getSort_type() {
        return this.sort_type;
    }

    public final PositionsSortDirection getSort_direction() {
        return this.sort_direction;
    }

    public final Integer getOptions_asset_home_header_tag() {
        return this.options_asset_home_header_tag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionsV2Response(Map<String, ?> map, Map<String, ?> map2, List<PositionListItemV2> results, String instrument_type, String account_number, PositionsLocation positions_location, String str, PositionsSortDirection positionsSortDirection, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(positions_location, "positions_location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_type = instrument_type;
        this.account_number = account_number;
        this.positions_location = positions_location;
        this.sort_type = str;
        this.sort_direction = positionsSortDirection;
        this.options_asset_home_header_tag = num;
        this.header = (Map) Internal.immutableCopyOfStruct("header", map);
        this.footer = (Map) Internal.immutableCopyOfStruct(Footer.f10637type, map2);
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final Map<String, ?> getHeader() {
        return this.header;
    }

    public final Map<String, ?> getFooter() {
        return this.footer;
    }

    public final List<PositionListItemV2> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9025newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountPositionsV2Response)) {
            return false;
        }
        GetAccountPositionsV2Response getAccountPositionsV2Response = (GetAccountPositionsV2Response) other;
        return Intrinsics.areEqual(unknownFields(), getAccountPositionsV2Response.unknownFields()) && Intrinsics.areEqual(this.header, getAccountPositionsV2Response.header) && Intrinsics.areEqual(this.footer, getAccountPositionsV2Response.footer) && Intrinsics.areEqual(this.results, getAccountPositionsV2Response.results) && Intrinsics.areEqual(this.instrument_type, getAccountPositionsV2Response.instrument_type) && Intrinsics.areEqual(this.account_number, getAccountPositionsV2Response.account_number) && this.positions_location == getAccountPositionsV2Response.positions_location && Intrinsics.areEqual(this.sort_type, getAccountPositionsV2Response.sort_type) && this.sort_direction == getAccountPositionsV2Response.sort_direction && Intrinsics.areEqual(this.options_asset_home_header_tag, getAccountPositionsV2Response.options_asset_home_header_tag);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Map<String, ?> map = this.header;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 37;
        Map<String, ?> map2 = this.footer;
        int iHashCode3 = (((((((((iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 37) + this.results.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.positions_location.hashCode()) * 37;
        String str = this.sort_type;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        PositionsSortDirection positionsSortDirection = this.sort_direction;
        int iHashCode5 = (iHashCode4 + (positionsSortDirection != null ? positionsSortDirection.hashCode() : 0)) * 37;
        Integer num = this.options_asset_home_header_tag;
        int iHashCode6 = iHashCode5 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> map = this.header;
        if (map != null) {
            arrayList.add("header=" + map);
        }
        Map<String, ?> map2 = this.footer;
        if (map2 != null) {
            arrayList.add("footer=" + map2);
        }
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        arrayList.add("instrument_type=" + Internal.sanitize(this.instrument_type));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("positions_location=" + this.positions_location);
        String str = this.sort_type;
        if (str != null) {
            arrayList.add("sort_type=" + Internal.sanitize(str));
        }
        PositionsSortDirection positionsSortDirection = this.sort_direction;
        if (positionsSortDirection != null) {
            arrayList.add("sort_direction=" + positionsSortDirection);
        }
        Integer num = this.options_asset_home_header_tag;
        if (num != null) {
            arrayList.add("options_asset_home_header_tag=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountPositionsV2Response{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountPositionsV2Response copy$default(GetAccountPositionsV2Response getAccountPositionsV2Response, Map map, Map map2, List list, String str, String str2, PositionsLocation positionsLocation, String str3, PositionsSortDirection positionsSortDirection, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            map = getAccountPositionsV2Response.header;
        }
        if ((i & 2) != 0) {
            map2 = getAccountPositionsV2Response.footer;
        }
        if ((i & 4) != 0) {
            list = getAccountPositionsV2Response.results;
        }
        if ((i & 8) != 0) {
            str = getAccountPositionsV2Response.instrument_type;
        }
        if ((i & 16) != 0) {
            str2 = getAccountPositionsV2Response.account_number;
        }
        if ((i & 32) != 0) {
            positionsLocation = getAccountPositionsV2Response.positions_location;
        }
        if ((i & 64) != 0) {
            str3 = getAccountPositionsV2Response.sort_type;
        }
        if ((i & 128) != 0) {
            positionsSortDirection = getAccountPositionsV2Response.sort_direction;
        }
        if ((i & 256) != 0) {
            num = getAccountPositionsV2Response.options_asset_home_header_tag;
        }
        if ((i & 512) != 0) {
            byteString = getAccountPositionsV2Response.unknownFields();
        }
        Integer num2 = num;
        ByteString byteString2 = byteString;
        String str4 = str3;
        PositionsSortDirection positionsSortDirection2 = positionsSortDirection;
        String str5 = str2;
        PositionsLocation positionsLocation2 = positionsLocation;
        return getAccountPositionsV2Response.copy(map, map2, list, str, str5, positionsLocation2, str4, positionsSortDirection2, num2, byteString2);
    }

    public final GetAccountPositionsV2Response copy(Map<String, ?> header, Map<String, ?> footer, List<PositionListItemV2> results, String instrument_type, String account_number, PositionsLocation positions_location, String sort_type, PositionsSortDirection sort_direction, Integer options_asset_home_header_tag, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(positions_location, "positions_location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountPositionsV2Response(header, footer, results, instrument_type, account_number, positions_location, sort_type, sort_direction, options_asset_home_header_tag, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountPositionsV2Response.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountPositionsV2Response>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionsV2Response$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountPositionsV2Response value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHeader() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, value.getHeader());
                }
                if (value.getFooter() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(2, value.getFooter());
                }
                int iEncodedSizeWithTag = size + PositionListItemV2.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getResults());
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAccount_number());
                }
                if (value.getPositions_location() != PositionsLocation.PositionsLocation_UNSPECIFIED) {
                    iEncodedSizeWithTag += PositionsLocation.ADAPTER.encodedSizeWithTag(6, value.getPositions_location());
                }
                return iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getSort_type()) + PositionsSortDirection.ADAPTER.encodedSizeWithTag(8, value.getSort_direction()) + ProtoAdapter.INT32.encodedSizeWithTag(9, value.getOptions_asset_home_header_tag());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountPositionsV2Response value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHeader() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (value.getFooter() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getFooter());
                }
                PositionListItemV2.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                if (value.getPositions_location() != PositionsLocation.PositionsLocation_UNSPECIFIED) {
                    PositionsLocation.ADAPTER.encodeWithTag(writer, 6, (int) value.getPositions_location());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSort_type());
                PositionsSortDirection.ADAPTER.encodeWithTag(writer, 8, (int) value.getSort_direction());
                ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) value.getOptions_asset_home_header_tag());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountPositionsV2Response value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) value.getOptions_asset_home_header_tag());
                PositionsSortDirection.ADAPTER.encodeWithTag(writer, 8, (int) value.getSort_direction());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getSort_type());
                if (value.getPositions_location() != PositionsLocation.PositionsLocation_UNSPECIFIED) {
                    PositionsLocation.ADAPTER.encodeWithTag(writer, 6, (int) value.getPositions_location());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                PositionListItemV2.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                if (value.getFooter() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getFooter());
                }
                if (value.getHeader() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getHeader());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionsV2Response decode(ProtoReader reader) throws IOException {
                PositionsLocation positionsLocation;
                Map<String, ?> map;
                Map<String, ?> map2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                PositionsLocation positionsLocation2 = PositionsLocation.PositionsLocation_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Map<String, ?> mapDecode = null;
                String strDecode = null;
                PositionsSortDirection positionsSortDirectionDecode = null;
                Integer numDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                PositionsLocation positionsLocationDecode = positionsLocation2;
                Map<String, ?> mapDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                mapDecode2 = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 2:
                                mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 3:
                                positionsLocation = positionsLocationDecode;
                                map = mapDecode2;
                                map2 = mapDecode;
                                arrayList.add(PositionListItemV2.ADAPTER.decode(reader));
                                mapDecode = map2;
                                positionsLocationDecode = positionsLocation;
                                mapDecode2 = map;
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                positionsLocation = positionsLocationDecode;
                                map = mapDecode2;
                                try {
                                    positionsLocationDecode = PositionsLocation.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    map2 = mapDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                mapDecode2 = map;
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                try {
                                    positionsSortDirectionDecode = PositionsSortDirection.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    positionsLocation = positionsLocationDecode;
                                    map = mapDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 9:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                positionsLocation = positionsLocationDecode;
                                map = mapDecode2;
                                map2 = mapDecode;
                                mapDecode = map2;
                                positionsLocationDecode = positionsLocation;
                                mapDecode2 = map;
                                break;
                        }
                    } else {
                        return new GetAccountPositionsV2Response(mapDecode2, mapDecode, arrayList, strDecode2, strDecode3, positionsLocationDecode, strDecode, positionsSortDirectionDecode, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionsV2Response redact(GetAccountPositionsV2Response value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Map<String, ?> header = value.getHeader();
                Map<String, ?> mapRedact = header != null ? ProtoAdapter.STRUCT_MAP.redact(header) : null;
                Map<String, ?> footer = value.getFooter();
                return GetAccountPositionsV2Response.copy$default(value, mapRedact, footer != null ? ProtoAdapter.STRUCT_MAP.redact(footer) : null, Internal.m26823redactElements(value.getResults(), PositionListItemV2.ADAPTER), null, null, null, null, null, null, ByteString.EMPTY, 504, null);
            }
        };
    }
}
