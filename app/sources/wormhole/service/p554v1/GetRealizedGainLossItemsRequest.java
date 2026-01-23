package wormhole.service.p554v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetRealizedGainLossItemsRequest.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "span", "Lwormhole/service/v1/Span;", "asset_classes", "", "Lwormhole/service/v1/AssetClass;", "sort_type", "Lwormhole/service/v1/SortType;", "sort_direction", "Lwormhole/service/v1/SortDirection;", "symbol", "next_cursor", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/Span;Ljava/util/List;Lwormhole/service/v1/SortType;Lwormhole/service/v1/SortDirection;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getSpan", "()Lwormhole/service/v1/Span;", "getSort_type", "()Lwormhole/service/v1/SortType;", "getSort_direction", "()Lwormhole/service/v1/SortDirection;", "getSymbol", "getNext_cursor", "getAsset_classes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedGainLossItemsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedGainLossItemsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "wormhole.service.v1.AssetClass#ADAPTER", jsonName = "assetClasses", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AssetClass> asset_classes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextCursor", schemaIndex = 6, tag = 7)
    private final String next_cursor;

    @WireField(adapter = "wormhole.service.v1.SortDirection#ADAPTER", jsonName = "sortDirection", schemaIndex = 4, tag = 5)
    private final SortDirection sort_direction;

    @WireField(adapter = "wormhole.service.v1.SortType#ADAPTER", jsonName = "sortType", schemaIndex = 3, tag = 4)
    private final SortType sort_type;

    @WireField(adapter = "wormhole.service.v1.Span#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Span span;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String symbol;

    public GetRealizedGainLossItemsRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30060newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetRealizedGainLossItemsRequest(String str, Span span, List list, SortType sortType, SortDirection sortDirection, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Span.SPAN_UNSPECIFIED : span, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : sortType, (i & 16) != 0 ? null : sortDirection, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Span getSpan() {
        return this.span;
    }

    public final SortType getSort_type() {
        return this.sort_type;
    }

    public final SortDirection getSort_direction() {
        return this.sort_direction;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossItemsRequest(String account_number, Span span, List<? extends AssetClass> asset_classes, SortType sortType, SortDirection sortDirection, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.span = span;
        this.sort_type = sortType;
        this.sort_direction = sortDirection;
        this.symbol = str;
        this.next_cursor = str2;
        this.asset_classes = Internal.immutableCopyOf("asset_classes", asset_classes);
    }

    public final List<AssetClass> getAsset_classes() {
        return this.asset_classes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30060newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedGainLossItemsRequest)) {
            return false;
        }
        GetRealizedGainLossItemsRequest getRealizedGainLossItemsRequest = (GetRealizedGainLossItemsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedGainLossItemsRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getRealizedGainLossItemsRequest.account_number) && this.span == getRealizedGainLossItemsRequest.span && Intrinsics.areEqual(this.asset_classes, getRealizedGainLossItemsRequest.asset_classes) && this.sort_type == getRealizedGainLossItemsRequest.sort_type && this.sort_direction == getRealizedGainLossItemsRequest.sort_direction && Intrinsics.areEqual(this.symbol, getRealizedGainLossItemsRequest.symbol) && Intrinsics.areEqual(this.next_cursor, getRealizedGainLossItemsRequest.next_cursor);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.span.hashCode()) * 37) + this.asset_classes.hashCode()) * 37;
        SortType sortType = this.sort_type;
        int iHashCode2 = (iHashCode + (sortType != null ? sortType.hashCode() : 0)) * 37;
        SortDirection sortDirection = this.sort_direction;
        int iHashCode3 = (iHashCode2 + (sortDirection != null ? sortDirection.hashCode() : 0)) * 37;
        String str = this.symbol;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.next_cursor;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("span=" + this.span);
        if (!this.asset_classes.isEmpty()) {
            arrayList.add("asset_classes=" + this.asset_classes);
        }
        SortType sortType = this.sort_type;
        if (sortType != null) {
            arrayList.add("sort_type=" + sortType);
        }
        SortDirection sortDirection = this.sort_direction;
        if (sortDirection != null) {
            arrayList.add("sort_direction=" + sortDirection);
        }
        String str = this.symbol;
        if (str != null) {
            arrayList.add("symbol=" + Internal.sanitize(str));
        }
        String str2 = this.next_cursor;
        if (str2 != null) {
            arrayList.add("next_cursor=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedGainLossItemsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRealizedGainLossItemsRequest copy$default(GetRealizedGainLossItemsRequest getRealizedGainLossItemsRequest, String str, Span span, List list, SortType sortType, SortDirection sortDirection, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRealizedGainLossItemsRequest.account_number;
        }
        if ((i & 2) != 0) {
            span = getRealizedGainLossItemsRequest.span;
        }
        if ((i & 4) != 0) {
            list = getRealizedGainLossItemsRequest.asset_classes;
        }
        if ((i & 8) != 0) {
            sortType = getRealizedGainLossItemsRequest.sort_type;
        }
        if ((i & 16) != 0) {
            sortDirection = getRealizedGainLossItemsRequest.sort_direction;
        }
        if ((i & 32) != 0) {
            str2 = getRealizedGainLossItemsRequest.symbol;
        }
        if ((i & 64) != 0) {
            str3 = getRealizedGainLossItemsRequest.next_cursor;
        }
        if ((i & 128) != 0) {
            byteString = getRealizedGainLossItemsRequest.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        SortDirection sortDirection2 = sortDirection;
        String str5 = str2;
        return getRealizedGainLossItemsRequest.copy(str, span, list, sortType, sortDirection2, str5, str4, byteString2);
    }

    public final GetRealizedGainLossItemsRequest copy(String account_number, Span span, List<? extends AssetClass> asset_classes, SortType sort_type, SortDirection sort_direction, String symbol, String next_cursor, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedGainLossItemsRequest(account_number, span, asset_classes, sort_type, sort_direction, symbol, next_cursor, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedGainLossItemsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedGainLossItemsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.GetRealizedGainLossItemsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedGainLossItemsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    size += Span.ADAPTER.encodedSizeWithTag(2, value.getSpan());
                }
                int iEncodedSizeWithTag = size + AssetClass.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAsset_classes()) + SortType.ADAPTER.encodedSizeWithTag(4, value.getSort_type()) + SortDirection.ADAPTER.encodedSizeWithTag(5, value.getSort_direction());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getSymbol()) + protoAdapter.encodedSizeWithTag(7, value.getNext_cursor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedGainLossItemsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 2, (int) value.getSpan());
                }
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAsset_classes());
                SortType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSort_type());
                SortDirection.ADAPTER.encodeWithTag(writer, 5, (int) value.getSort_direction());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSymbol());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNext_cursor());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedGainLossItemsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNext_cursor());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSymbol());
                SortDirection.ADAPTER.encodeWithTag(writer, 5, (int) value.getSort_direction());
                SortType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSort_type());
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAsset_classes());
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 2, (int) value.getSpan());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Span spanDecode = Span.SPAN_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                SortType sortTypeDecode = null;
                SortDirection sortDirectionDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    Span span = spanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        spanDecode = Span.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        AssetClass.ADAPTER.tryDecode(reader, arrayList);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        sortTypeDecode = SortType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        sortDirectionDecode = SortDirection.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 6:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new GetRealizedGainLossItemsRequest(strDecode3, span, arrayList, sortTypeDecode, sortDirectionDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemsRequest redact(GetRealizedGainLossItemsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedGainLossItemsRequest.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }
}
