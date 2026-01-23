package bff_money_movement.service.p019v1;

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

/* compiled from: GetTransferValidationResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferValidationResponse;", "Lcom/squareup/wire/Message;", "", "is_success", "", "error_details", "Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLbff_money_movement/service/v1/TransferValidationErrorDetails;Lokio/ByteString;)V", "()Z", "getError_details", "()Lbff_money_movement/service/v1/TransferValidationErrorDetails;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetTransferValidationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTransferValidationResponse> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.TransferValidationErrorDetails#ADAPTER", jsonName = "errorDetails", schemaIndex = 1, tag = 2)
    private final TransferValidationErrorDetails error_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSuccess", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_success;

    public GetTransferValidationResponse() {
        this(false, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8438newBuilder();
    }

    /* renamed from: is_success, reason: from getter */
    public final boolean getIs_success() {
        return this.is_success;
    }

    public final TransferValidationErrorDetails getError_details() {
        return this.error_details;
    }

    public /* synthetic */ GetTransferValidationResponse(boolean z, TransferValidationErrorDetails transferValidationErrorDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : transferValidationErrorDetails, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransferValidationResponse(boolean z, TransferValidationErrorDetails transferValidationErrorDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_success = z;
        this.error_details = transferValidationErrorDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8438newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTransferValidationResponse)) {
            return false;
        }
        GetTransferValidationResponse getTransferValidationResponse = (GetTransferValidationResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTransferValidationResponse.unknownFields()) && this.is_success == getTransferValidationResponse.is_success && Intrinsics.areEqual(this.error_details, getTransferValidationResponse.error_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_success)) * 37;
        TransferValidationErrorDetails transferValidationErrorDetails = this.error_details;
        int iHashCode2 = iHashCode + (transferValidationErrorDetails != null ? transferValidationErrorDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_success=" + this.is_success);
        TransferValidationErrorDetails transferValidationErrorDetails = this.error_details;
        if (transferValidationErrorDetails != null) {
            arrayList.add("error_details=" + transferValidationErrorDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTransferValidationResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTransferValidationResponse copy$default(GetTransferValidationResponse getTransferValidationResponse, boolean z, TransferValidationErrorDetails transferValidationErrorDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getTransferValidationResponse.is_success;
        }
        if ((i & 2) != 0) {
            transferValidationErrorDetails = getTransferValidationResponse.error_details;
        }
        if ((i & 4) != 0) {
            byteString = getTransferValidationResponse.unknownFields();
        }
        return getTransferValidationResponse.copy(z, transferValidationErrorDetails, byteString);
    }

    public final GetTransferValidationResponse copy(boolean is_success, TransferValidationErrorDetails error_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTransferValidationResponse(is_success, error_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTransferValidationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTransferValidationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetTransferValidationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTransferValidationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_success()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_success()));
                }
                return size + TransferValidationErrorDetails.ADAPTER.encodedSizeWithTag(2, value.getError_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTransferValidationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_success()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_success()));
                }
                TransferValidationErrorDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTransferValidationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TransferValidationErrorDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_details());
                if (value.getIs_success()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_success()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferValidationResponse redact(GetTransferValidationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TransferValidationErrorDetails error_details = value.getError_details();
                return GetTransferValidationResponse.copy$default(value, false, error_details != null ? TransferValidationErrorDetails.ADAPTER.redact(error_details) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTransferValidationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                TransferValidationErrorDetails transferValidationErrorDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTransferValidationResponse(zBooleanValue, transferValidationErrorDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        transferValidationErrorDetailsDecode = TransferValidationErrorDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
