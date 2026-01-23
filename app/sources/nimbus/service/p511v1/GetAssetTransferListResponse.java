package nimbus.service.p511v1;

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

/* compiled from: GetAssetTransferListResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lnimbus/service/v1/GetAssetTransferListResponse;", "Lcom/squareup/wire/Message;", "", "asset_transfer_record", "", "Lnimbus/service/v1/AssetTransferRecord;", "previous_cursor", "", "next_cursor", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPrevious_cursor", "()Ljava/lang/String;", "getNext_cursor", "getAsset_transfer_record", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetAssetTransferListResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAssetTransferListResponse> ADAPTER;

    @WireField(adapter = "nimbus.service.v1.AssetTransferRecord#ADAPTER", jsonName = "assetTransferRecord", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AssetTransferRecord> asset_transfer_record;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextCursor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String next_cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousCursor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String previous_cursor;

    public GetAssetTransferListResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29363newBuilder();
    }

    public /* synthetic */ GetAssetTransferListResponse(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPrevious_cursor() {
        return this.previous_cursor;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAssetTransferListResponse(List<AssetTransferRecord> asset_transfer_record, String previous_cursor, String next_cursor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_transfer_record, "asset_transfer_record");
        Intrinsics.checkNotNullParameter(previous_cursor, "previous_cursor");
        Intrinsics.checkNotNullParameter(next_cursor, "next_cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.previous_cursor = previous_cursor;
        this.next_cursor = next_cursor;
        this.asset_transfer_record = Internal.immutableCopyOf("asset_transfer_record", asset_transfer_record);
    }

    public final List<AssetTransferRecord> getAsset_transfer_record() {
        return this.asset_transfer_record;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29363newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAssetTransferListResponse)) {
            return false;
        }
        GetAssetTransferListResponse getAssetTransferListResponse = (GetAssetTransferListResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAssetTransferListResponse.unknownFields()) && Intrinsics.areEqual(this.asset_transfer_record, getAssetTransferListResponse.asset_transfer_record) && Intrinsics.areEqual(this.previous_cursor, getAssetTransferListResponse.previous_cursor) && Intrinsics.areEqual(this.next_cursor, getAssetTransferListResponse.next_cursor);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.asset_transfer_record.hashCode()) * 37) + this.previous_cursor.hashCode()) * 37) + this.next_cursor.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.asset_transfer_record.isEmpty()) {
            arrayList.add("asset_transfer_record=" + this.asset_transfer_record);
        }
        arrayList.add("previous_cursor=" + Internal.sanitize(this.previous_cursor));
        arrayList.add("next_cursor=" + Internal.sanitize(this.next_cursor));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAssetTransferListResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAssetTransferListResponse copy$default(GetAssetTransferListResponse getAssetTransferListResponse, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getAssetTransferListResponse.asset_transfer_record;
        }
        if ((i & 2) != 0) {
            str = getAssetTransferListResponse.previous_cursor;
        }
        if ((i & 4) != 0) {
            str2 = getAssetTransferListResponse.next_cursor;
        }
        if ((i & 8) != 0) {
            byteString = getAssetTransferListResponse.unknownFields();
        }
        return getAssetTransferListResponse.copy(list, str, str2, byteString);
    }

    public final GetAssetTransferListResponse copy(List<AssetTransferRecord> asset_transfer_record, String previous_cursor, String next_cursor, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_transfer_record, "asset_transfer_record");
        Intrinsics.checkNotNullParameter(previous_cursor, "previous_cursor");
        Intrinsics.checkNotNullParameter(next_cursor, "next_cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAssetTransferListResponse(asset_transfer_record, previous_cursor, next_cursor, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAssetTransferListResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAssetTransferListResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.GetAssetTransferListResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAssetTransferListResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + AssetTransferRecord.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getAsset_transfer_record());
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrevious_cursor());
                }
                return !Intrinsics.areEqual(value.getNext_cursor(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNext_cursor()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAssetTransferListResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AssetTransferRecord.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAsset_transfer_record());
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrevious_cursor());
                }
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext_cursor());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAssetTransferListResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext_cursor());
                }
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrevious_cursor());
                }
                AssetTransferRecord.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAsset_transfer_record());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAssetTransferListResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAssetTransferListResponse(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(AssetTransferRecord.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAssetTransferListResponse redact(GetAssetTransferListResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAssetTransferListResponse.copy$default(value, Internal.m26823redactElements(value.getAsset_transfer_record(), AssetTransferRecord.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
