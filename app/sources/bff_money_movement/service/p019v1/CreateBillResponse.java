package bff_money_movement.service.p019v1;

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

/* compiled from: CreateBillResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbff_money_movement/service/v1/CreateBillResponse;", "Lcom/squareup/wire/Message;", "", "bill_id", "", "bill_state", "Lbff_money_movement/service/v1/BillState;", "error_reason", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/BillState;Ljava/lang/String;Lokio/ByteString;)V", "getBill_id", "()Ljava/lang/String;", "getBill_state", "()Lbff_money_movement/service/v1/BillState;", "getError_reason", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CreateBillResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateBillResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String bill_id;

    @WireField(adapter = "bff_money_movement.service.v1.BillState#ADAPTER", jsonName = "billState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BillState bill_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String error_reason;

    public CreateBillResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ CreateBillResponse(String str, BillState billState, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BillState.BILL_STATE_UNSPECIFIED : billState, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8399newBuilder();
    }

    public final String getBill_id() {
        return this.bill_id;
    }

    public final BillState getBill_state() {
        return this.bill_state;
    }

    public final String getError_reason() {
        return this.error_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBillResponse(String bill_id, BillState bill_state, String error_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bill_id, "bill_id");
        Intrinsics.checkNotNullParameter(bill_state, "bill_state");
        Intrinsics.checkNotNullParameter(error_reason, "error_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bill_id = bill_id;
        this.bill_state = bill_state;
        this.error_reason = error_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8399newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateBillResponse)) {
            return false;
        }
        CreateBillResponse createBillResponse = (CreateBillResponse) other;
        return Intrinsics.areEqual(unknownFields(), createBillResponse.unknownFields()) && Intrinsics.areEqual(this.bill_id, createBillResponse.bill_id) && this.bill_state == createBillResponse.bill_state && Intrinsics.areEqual(this.error_reason, createBillResponse.error_reason);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.bill_id.hashCode()) * 37) + this.bill_state.hashCode()) * 37) + this.error_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bill_id=" + Internal.sanitize(this.bill_id));
        arrayList.add("bill_state=" + this.bill_state);
        arrayList.add("error_reason=" + Internal.sanitize(this.error_reason));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateBillResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateBillResponse copy$default(CreateBillResponse createBillResponse, String str, BillState billState, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createBillResponse.bill_id;
        }
        if ((i & 2) != 0) {
            billState = createBillResponse.bill_state;
        }
        if ((i & 4) != 0) {
            str2 = createBillResponse.error_reason;
        }
        if ((i & 8) != 0) {
            byteString = createBillResponse.unknownFields();
        }
        return createBillResponse.copy(str, billState, str2, byteString);
    }

    public final CreateBillResponse copy(String bill_id, BillState bill_state, String error_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bill_id, "bill_id");
        Intrinsics.checkNotNullParameter(bill_state, "bill_state");
        Intrinsics.checkNotNullParameter(error_reason, "error_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateBillResponse(bill_id, bill_state, error_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateBillResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateBillResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.CreateBillResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateBillResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBill_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBill_id());
                }
                if (value.getBill_state() != BillState.BILL_STATE_UNSPECIFIED) {
                    size += BillState.ADAPTER.encodedSizeWithTag(2, value.getBill_state());
                }
                return !Intrinsics.areEqual(value.getError_reason(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError_reason()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateBillResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBill_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBill_id());
                }
                if (value.getBill_state() != BillState.BILL_STATE_UNSPECIFIED) {
                    BillState.ADAPTER.encodeWithTag(writer, 2, (int) value.getBill_state());
                }
                if (!Intrinsics.areEqual(value.getError_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateBillResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_reason());
                }
                if (value.getBill_state() != BillState.BILL_STATE_UNSPECIFIED) {
                    BillState.ADAPTER.encodeWithTag(writer, 2, (int) value.getBill_state());
                }
                if (Intrinsics.areEqual(value.getBill_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBill_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateBillResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BillState billStateDecode = BillState.BILL_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateBillResponse(strDecode, billStateDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            billStateDecode = BillState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateBillResponse redact(CreateBillResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateBillResponse.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
