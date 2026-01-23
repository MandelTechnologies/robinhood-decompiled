package bonfire.proto.idl.acats.p027v1;

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

/* compiled from: GetAcatsTransferHubBottomSheetResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponse;", "Lcom/squareup/wire/Message;", "", "bottom_sheet_details", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;Lokio/ByteString;)V", "getBottom_sheet_details", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAcatsTransferHubBottomSheetResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAcatsTransferHubBottomSheetResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetDetails#ADAPTER", jsonName = "bottomSheetDetails", schemaIndex = 0, tag = 1)
    private final AcatsTransferHubBottomSheetDetails bottom_sheet_details;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAcatsTransferHubBottomSheetResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8704newBuilder();
    }

    public final AcatsTransferHubBottomSheetDetails getBottom_sheet_details() {
        return this.bottom_sheet_details;
    }

    public /* synthetic */ GetAcatsTransferHubBottomSheetResponse(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsTransferHubBottomSheetDetails, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAcatsTransferHubBottomSheetResponse(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bottom_sheet_details = acatsTransferHubBottomSheetDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8704newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAcatsTransferHubBottomSheetResponse)) {
            return false;
        }
        GetAcatsTransferHubBottomSheetResponse getAcatsTransferHubBottomSheetResponse = (GetAcatsTransferHubBottomSheetResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAcatsTransferHubBottomSheetResponse.unknownFields()) && Intrinsics.areEqual(this.bottom_sheet_details, getAcatsTransferHubBottomSheetResponse.bottom_sheet_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails = this.bottom_sheet_details;
        int iHashCode2 = iHashCode + (acatsTransferHubBottomSheetDetails != null ? acatsTransferHubBottomSheetDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails = this.bottom_sheet_details;
        if (acatsTransferHubBottomSheetDetails != null) {
            arrayList.add("bottom_sheet_details=" + acatsTransferHubBottomSheetDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAcatsTransferHubBottomSheetResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAcatsTransferHubBottomSheetResponse copy(AcatsTransferHubBottomSheetDetails bottom_sheet_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAcatsTransferHubBottomSheetResponse(bottom_sheet_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAcatsTransferHubBottomSheetResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAcatsTransferHubBottomSheetResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.acats.v1.GetAcatsTransferHubBottomSheetResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAcatsTransferHubBottomSheetResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + AcatsTransferHubBottomSheetDetails.ADAPTER.encodedSizeWithTag(1, value.getBottom_sheet_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAcatsTransferHubBottomSheetResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AcatsTransferHubBottomSheetDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBottom_sheet_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAcatsTransferHubBottomSheetResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AcatsTransferHubBottomSheetDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getBottom_sheet_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAcatsTransferHubBottomSheetResponse redact(GetAcatsTransferHubBottomSheetResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AcatsTransferHubBottomSheetDetails bottom_sheet_details = value.getBottom_sheet_details();
                return value.copy(bottom_sheet_details != null ? AcatsTransferHubBottomSheetDetails.ADAPTER.redact(bottom_sheet_details) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAcatsTransferHubBottomSheetResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAcatsTransferHubBottomSheetResponse(acatsTransferHubBottomSheetDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        acatsTransferHubBottomSheetDetailsDecode = AcatsTransferHubBottomSheetDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
