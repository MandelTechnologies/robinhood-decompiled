package microgram.contracts.money_movement.transfer_validation.proto.p501v1;

import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: ValidateRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/ValidateRequest;", "Lcom/squareup/wire/Message;", "", "transfer", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;", "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;Lcom/robinhood/rosetta/i18n/Locality;Lokio/ByteString;)V", "getTransfer", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/Transfer;", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.money_movement.transfer_validation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ValidateRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateRequest> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Locality locality;

    @WireField(adapter = "microgram.contracts.money_movement.transfer_validation.proto.v1.Transfer#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Transfer transfer;

    public ValidateRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29206newBuilder();
    }

    public final Transfer getTransfer() {
        return this.transfer;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public /* synthetic */ ValidateRequest(Transfer transfer, Locality locality, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transfer, (i & 2) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateRequest(Transfer transfer, Locality locality, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer = transfer;
        this.locality = locality;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29206newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateRequest)) {
            return false;
        }
        ValidateRequest validateRequest = (ValidateRequest) other;
        return Intrinsics.areEqual(unknownFields(), validateRequest.unknownFields()) && Intrinsics.areEqual(this.transfer, validateRequest.transfer) && this.locality == validateRequest.locality;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Transfer transfer = this.transfer;
        int iHashCode2 = ((iHashCode + (transfer != null ? transfer.hashCode() : 0)) * 37) + this.locality.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Transfer transfer = this.transfer;
        if (transfer != null) {
            arrayList.add("transfer=" + transfer);
        }
        arrayList.add("locality=" + this.locality);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateRequest copy$default(ValidateRequest validateRequest, Transfer transfer, Locality locality, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transfer = validateRequest.transfer;
        }
        if ((i & 2) != 0) {
            locality = validateRequest.locality;
        }
        if ((i & 4) != 0) {
            byteString = validateRequest.unknownFields();
        }
        return validateRequest.copy(transfer, locality, byteString);
    }

    public final ValidateRequest copy(Transfer transfer, Locality locality, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateRequest(transfer, locality, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.transfer_validation.proto.v1.ValidateRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer() != null) {
                    size += Transfer.ADAPTER.encodedSizeWithTag(1, value.getTransfer());
                }
                return value.getLocality() != Locality.LOCALITY_UNSPECIFIED ? size + Locality.ADAPTER.encodedSizeWithTag(2, value.getLocality()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer() != null) {
                    Transfer.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocality());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocality());
                }
                if (value.getTransfer() != null) {
                    Transfer.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Locality localityDecode = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Transfer transferDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateRequest(transferDecode, localityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        transferDecode = Transfer.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            localityDecode = Locality.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateRequest redact(ValidateRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Transfer transfer = value.getTransfer();
                return ValidateRequest.copy$default(value, transfer != null ? Transfer.ADAPTER.redact(transfer) : null, null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
