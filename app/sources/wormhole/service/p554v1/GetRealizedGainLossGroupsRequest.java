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

/* compiled from: GetRealizedGainLossGroupsRequest.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016JV\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequest;", "Lcom/squareup/wire/Message;", "", "group_type", "Lwormhole/service/v1/GroupType;", "account_number", "", "span", "Lwormhole/service/v1/Span;", "asset_classes", "", "Lwormhole/service/v1/AssetClass;", "sort_type", "Lwormhole/service/v1/SortType;", "sort_direction", "Lwormhole/service/v1/SortDirection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lwormhole/service/v1/GroupType;Ljava/lang/String;Lwormhole/service/v1/Span;Ljava/util/List;Lwormhole/service/v1/SortType;Lwormhole/service/v1/SortDirection;Lokio/ByteString;)V", "getGroup_type", "()Lwormhole/service/v1/GroupType;", "getAccount_number", "()Ljava/lang/String;", "getSpan", "()Lwormhole/service/v1/Span;", "getSort_type", "()Lwormhole/service/v1/SortType;", "getSort_direction", "()Lwormhole/service/v1/SortDirection;", "getAsset_classes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedGainLossGroupsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedGainLossGroupsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "wormhole.service.v1.AssetClass#ADAPTER", jsonName = "assetClasses", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<AssetClass> asset_classes;

    @WireField(adapter = "wormhole.service.v1.GroupType#ADAPTER", jsonName = "groupType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GroupType group_type;

    @WireField(adapter = "wormhole.service.v1.SortDirection#ADAPTER", jsonName = "sortDirection", schemaIndex = 5, tag = 6)
    private final SortDirection sort_direction;

    @WireField(adapter = "wormhole.service.v1.SortType#ADAPTER", jsonName = "sortType", schemaIndex = 4, tag = 5)
    private final SortType sort_type;

    @WireField(adapter = "wormhole.service.v1.Span#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Span span;

    public GetRealizedGainLossGroupsRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30053newBuilder();
    }

    public final GroupType getGroup_type() {
        return this.group_type;
    }

    public /* synthetic */ GetRealizedGainLossGroupsRequest(GroupType groupType, String str, Span span, List list, SortType sortType, SortDirection sortDirection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GroupType.GROUP_TYPE_UNSPECIFIED : groupType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Span.SPAN_UNSPECIFIED : span, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : sortType, (i & 32) != 0 ? null : sortDirection, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_number() {
        return this.account_number;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossGroupsRequest(GroupType group_type, String account_number, Span span, List<? extends AssetClass> asset_classes, SortType sortType, SortDirection sortDirection, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(group_type, "group_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.group_type = group_type;
        this.account_number = account_number;
        this.span = span;
        this.sort_type = sortType;
        this.sort_direction = sortDirection;
        this.asset_classes = Internal.immutableCopyOf("asset_classes", asset_classes);
    }

    public final List<AssetClass> getAsset_classes() {
        return this.asset_classes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30053newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedGainLossGroupsRequest)) {
            return false;
        }
        GetRealizedGainLossGroupsRequest getRealizedGainLossGroupsRequest = (GetRealizedGainLossGroupsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedGainLossGroupsRequest.unknownFields()) && this.group_type == getRealizedGainLossGroupsRequest.group_type && Intrinsics.areEqual(this.account_number, getRealizedGainLossGroupsRequest.account_number) && this.span == getRealizedGainLossGroupsRequest.span && Intrinsics.areEqual(this.asset_classes, getRealizedGainLossGroupsRequest.asset_classes) && this.sort_type == getRealizedGainLossGroupsRequest.sort_type && this.sort_direction == getRealizedGainLossGroupsRequest.sort_direction;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.group_type.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.span.hashCode()) * 37) + this.asset_classes.hashCode()) * 37;
        SortType sortType = this.sort_type;
        int iHashCode2 = (iHashCode + (sortType != null ? sortType.hashCode() : 0)) * 37;
        SortDirection sortDirection = this.sort_direction;
        int iHashCode3 = iHashCode2 + (sortDirection != null ? sortDirection.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("group_type=" + this.group_type);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedGainLossGroupsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRealizedGainLossGroupsRequest copy$default(GetRealizedGainLossGroupsRequest getRealizedGainLossGroupsRequest, GroupType groupType, String str, Span span, List list, SortType sortType, SortDirection sortDirection, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            groupType = getRealizedGainLossGroupsRequest.group_type;
        }
        if ((i & 2) != 0) {
            str = getRealizedGainLossGroupsRequest.account_number;
        }
        if ((i & 4) != 0) {
            span = getRealizedGainLossGroupsRequest.span;
        }
        if ((i & 8) != 0) {
            list = getRealizedGainLossGroupsRequest.asset_classes;
        }
        if ((i & 16) != 0) {
            sortType = getRealizedGainLossGroupsRequest.sort_type;
        }
        if ((i & 32) != 0) {
            sortDirection = getRealizedGainLossGroupsRequest.sort_direction;
        }
        if ((i & 64) != 0) {
            byteString = getRealizedGainLossGroupsRequest.unknownFields();
        }
        SortDirection sortDirection2 = sortDirection;
        ByteString byteString2 = byteString;
        SortType sortType2 = sortType;
        Span span2 = span;
        return getRealizedGainLossGroupsRequest.copy(groupType, str, span2, list, sortType2, sortDirection2, byteString2);
    }

    public final GetRealizedGainLossGroupsRequest copy(GroupType group_type, String account_number, Span span, List<? extends AssetClass> asset_classes, SortType sort_type, SortDirection sort_direction, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(group_type, "group_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedGainLossGroupsRequest(group_type, account_number, span, asset_classes, sort_type, sort_direction, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedGainLossGroupsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedGainLossGroupsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.GetRealizedGainLossGroupsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedGainLossGroupsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getGroup_type() != GroupType.GROUP_TYPE_UNSPECIFIED) {
                    size += GroupType.ADAPTER.encodedSizeWithTag(1, value.getGroup_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    size += Span.ADAPTER.encodedSizeWithTag(3, value.getSpan());
                }
                return size + AssetClass.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAsset_classes()) + SortType.ADAPTER.encodedSizeWithTag(5, value.getSort_type()) + SortDirection.ADAPTER.encodedSizeWithTag(6, value.getSort_direction());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedGainLossGroupsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getGroup_type() != GroupType.GROUP_TYPE_UNSPECIFIED) {
                    GroupType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGroup_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpan());
                }
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAsset_classes());
                SortType.ADAPTER.encodeWithTag(writer, 5, (int) value.getSort_type());
                SortDirection.ADAPTER.encodeWithTag(writer, 6, (int) value.getSort_direction());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedGainLossGroupsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SortDirection.ADAPTER.encodeWithTag(writer, 6, (int) value.getSort_direction());
                SortType.ADAPTER.encodeWithTag(writer, 5, (int) value.getSort_type());
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAsset_classes());
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpan());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getGroup_type() != GroupType.GROUP_TYPE_UNSPECIFIED) {
                    GroupType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGroup_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossGroupsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GroupType groupTypeDecode = GroupType.GROUP_TYPE_UNSPECIFIED;
                Span span = Span.SPAN_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                SortType sortTypeDecode = null;
                SortDirection sortDirectionDecode = null;
                String strDecode = "";
                Span spanDecode = span;
                while (true) {
                    GroupType groupType = groupTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        groupTypeDecode = GroupType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        spanDecode = Span.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        AssetClass.ADAPTER.tryDecode(reader, arrayList);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        sortTypeDecode = SortType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        sortDirectionDecode = SortDirection.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new GetRealizedGainLossGroupsRequest(groupType, strDecode, spanDecode, arrayList, sortTypeDecode, sortDirectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossGroupsRequest redact(GetRealizedGainLossGroupsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedGainLossGroupsRequest.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
