package nimbus.service.p511v1;

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

/* compiled from: GetAssetTransferDetailsResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lnimbus/service/v1/GetAssetTransferDetailsResponse;", "Lcom/squareup/wire/Message;", "", "asset_transfer_record", "Lnimbus/service/v1/AssetTransferRecord;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnimbus/service/v1/AssetTransferRecord;Lokio/ByteString;)V", "getAsset_transfer_record", "()Lnimbus/service/v1/AssetTransferRecord;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetAssetTransferDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAssetTransferDetailsResponse> ADAPTER;

    @WireField(adapter = "nimbus.service.v1.AssetTransferRecord#ADAPTER", jsonName = "assetTransferRecord", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AssetTransferRecord asset_transfer_record;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAssetTransferDetailsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29361newBuilder();
    }

    public final AssetTransferRecord getAsset_transfer_record() {
        return this.asset_transfer_record;
    }

    public /* synthetic */ GetAssetTransferDetailsResponse(AssetTransferRecord assetTransferRecord, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : assetTransferRecord, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAssetTransferDetailsResponse(AssetTransferRecord assetTransferRecord, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_transfer_record = assetTransferRecord;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29361newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAssetTransferDetailsResponse)) {
            return false;
        }
        GetAssetTransferDetailsResponse getAssetTransferDetailsResponse = (GetAssetTransferDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAssetTransferDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.asset_transfer_record, getAssetTransferDetailsResponse.asset_transfer_record);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AssetTransferRecord assetTransferRecord = this.asset_transfer_record;
        int iHashCode2 = iHashCode + (assetTransferRecord != null ? assetTransferRecord.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AssetTransferRecord assetTransferRecord = this.asset_transfer_record;
        if (assetTransferRecord != null) {
            arrayList.add("asset_transfer_record=" + assetTransferRecord);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAssetTransferDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAssetTransferDetailsResponse copy(AssetTransferRecord asset_transfer_record, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAssetTransferDetailsResponse(asset_transfer_record, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAssetTransferDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAssetTransferDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.GetAssetTransferDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAssetTransferDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getAsset_transfer_record() != null ? size + AssetTransferRecord.ADAPTER.encodedSizeWithTag(1, value.getAsset_transfer_record()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAssetTransferDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAsset_transfer_record() != null) {
                    AssetTransferRecord.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_transfer_record());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAssetTransferDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAsset_transfer_record() != null) {
                    AssetTransferRecord.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_transfer_record());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAssetTransferDetailsResponse redact(GetAssetTransferDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AssetTransferRecord asset_transfer_record = value.getAsset_transfer_record();
                return value.copy(asset_transfer_record != null ? AssetTransferRecord.ADAPTER.redact(asset_transfer_record) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAssetTransferDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AssetTransferRecord assetTransferRecordDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAssetTransferDetailsResponse(assetTransferRecordDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        assetTransferRecordDecode = AssetTransferRecord.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
