package bonfire.proto.idl.windsor.p041v1;

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
import windsor.transactions.p552v1.IsaCashTransferDetail;

/* compiled from: GetTransferDetailResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponse;", "Lcom/squareup/wire/Message;", "", "Lbonfire/proto/idl/windsor/v1/Transfer;", "transfer", "Lwindsor/transactions/v1/IsaCashTransferDetail;", "isa_cash_transfer_details", "Lokio/ByteString;", "unknownFields", "<init>", "(Lbonfire/proto/idl/windsor/v1/Transfer;Lwindsor/transactions/v1/IsaCashTransferDetail;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lbonfire/proto/idl/windsor/v1/Transfer;Lwindsor/transactions/v1/IsaCashTransferDetail;Lokio/ByteString;)Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponse;", "Lbonfire/proto/idl/windsor/v1/Transfer;", "getTransfer", "()Lbonfire/proto/idl/windsor/v1/Transfer;", "Lwindsor/transactions/v1/IsaCashTransferDetail;", "getIsa_cash_transfer_details", "()Lwindsor/transactions/v1/IsaCashTransferDetail;", "getIsa_cash_transfer_details$annotations", "()V", "Companion", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetTransferDetailResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTransferDetailResponse> ADAPTER;

    @WireField(adapter = "windsor.transactions.v1.IsaCashTransferDetail#ADAPTER", jsonName = "isaCashTransferDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IsaCashTransferDetail isa_cash_transfer_details;

    @WireField(adapter = "bonfire.proto.idl.windsor.v1.Transfer#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Transfer transfer;

    public GetTransferDetailResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9060newBuilder();
    }

    public final Transfer getTransfer() {
        return this.transfer;
    }

    public final IsaCashTransferDetail getIsa_cash_transfer_details() {
        return this.isa_cash_transfer_details;
    }

    public /* synthetic */ GetTransferDetailResponse(Transfer transfer, IsaCashTransferDetail isaCashTransferDetail, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transfer, (i & 2) != 0 ? null : isaCashTransferDetail, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransferDetailResponse(Transfer transfer, IsaCashTransferDetail isaCashTransferDetail, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer = transfer;
        this.isa_cash_transfer_details = isaCashTransferDetail;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9060newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTransferDetailResponse)) {
            return false;
        }
        GetTransferDetailResponse getTransferDetailResponse = (GetTransferDetailResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTransferDetailResponse.unknownFields()) && Intrinsics.areEqual(this.transfer, getTransferDetailResponse.transfer) && Intrinsics.areEqual(this.isa_cash_transfer_details, getTransferDetailResponse.isa_cash_transfer_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Transfer transfer = this.transfer;
        int iHashCode2 = (iHashCode + (transfer != null ? transfer.hashCode() : 0)) * 37;
        IsaCashTransferDetail isaCashTransferDetail = this.isa_cash_transfer_details;
        int iHashCode3 = iHashCode2 + (isaCashTransferDetail != null ? isaCashTransferDetail.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Transfer transfer = this.transfer;
        if (transfer != null) {
            arrayList.add("transfer=" + transfer);
        }
        IsaCashTransferDetail isaCashTransferDetail = this.isa_cash_transfer_details;
        if (isaCashTransferDetail != null) {
            arrayList.add("isa_cash_transfer_details=" + isaCashTransferDetail);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTransferDetailResponse{", "}", 0, null, null, 56, null);
    }

    public final GetTransferDetailResponse copy(Transfer transfer, IsaCashTransferDetail isa_cash_transfer_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTransferDetailResponse(transfer, isa_cash_transfer_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTransferDetailResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTransferDetailResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.windsor.v1.GetTransferDetailResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTransferDetailResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer() != null) {
                    size += Transfer.ADAPTER.encodedSizeWithTag(1, value.getTransfer());
                }
                return value.getIsa_cash_transfer_details() != null ? size + IsaCashTransferDetail.ADAPTER.encodedSizeWithTag(2, value.getIsa_cash_transfer_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTransferDetailResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer() != null) {
                    Transfer.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer());
                }
                if (value.getIsa_cash_transfer_details() != null) {
                    IsaCashTransferDetail.ADAPTER.encodeWithTag(writer, 2, (int) value.getIsa_cash_transfer_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTransferDetailResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIsa_cash_transfer_details() != null) {
                    IsaCashTransferDetail.ADAPTER.encodeWithTag(writer, 2, (int) value.getIsa_cash_transfer_details());
                }
                if (value.getTransfer() != null) {
                    Transfer.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferDetailResponse redact(GetTransferDetailResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Transfer transfer = value.getTransfer();
                Transfer transferRedact = transfer != null ? Transfer.ADAPTER.redact(transfer) : null;
                IsaCashTransferDetail isa_cash_transfer_details = value.getIsa_cash_transfer_details();
                return value.copy(transferRedact, isa_cash_transfer_details != null ? IsaCashTransferDetail.ADAPTER.redact(isa_cash_transfer_details) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferDetailResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Transfer transferDecode = null;
                IsaCashTransferDetail isaCashTransferDetailDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTransferDetailResponse(transferDecode, isaCashTransferDetailDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        transferDecode = Transfer.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        isaCashTransferDetailDecode = IsaCashTransferDetail.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
