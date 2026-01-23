package bff_money_movement.service.p019v1;

import com.robinhood.rosetta.common.AccountType;
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
import rosetta.payment_hub.p540v1.service.TransferType;

/* compiled from: PaymentRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentRequest;", "Lcom/squareup/wire/Message;", "", "transfer_type", "Lrosetta/payment_hub/v1/service/TransferType;", "instrument_id", "", "instrument_type", "Lcom/robinhood/rosetta/common/AccountType;", "is_3ds_required", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/payment_hub/v1/service/TransferType;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountType;ZLokio/ByteString;)V", "getTransfer_type", "()Lrosetta/payment_hub/v1/service/TransferType;", "getInstrument_id", "()Ljava/lang/String;", "getInstrument_type", "()Lcom/robinhood/rosetta/common/AccountType;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PaymentRequest extends Message {

    @JvmField
    public static final ProtoAdapter<PaymentRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "is3dsRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_3ds_required;

    @WireField(adapter = "rosetta.payment_hub.v1.service.TransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TransferType transfer_type;

    public PaymentRequest() {
        this(null, null, null, false, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8499newBuilder();
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public /* synthetic */ PaymentRequest(TransferType transferType, String str, AccountType accountType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TransferType.TRANSFER_TYPE__UNSPECIFIED : transferType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final AccountType getInstrument_type() {
        return this.instrument_type;
    }

    /* renamed from: is_3ds_required, reason: from getter */
    public final boolean getIs_3ds_required() {
        return this.is_3ds_required;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRequest(TransferType transfer_type, String instrument_id, AccountType instrument_type, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_type = transfer_type;
        this.instrument_id = instrument_id;
        this.instrument_type = instrument_type;
        this.is_3ds_required = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8499newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PaymentRequest)) {
            return false;
        }
        PaymentRequest paymentRequest = (PaymentRequest) other;
        return Intrinsics.areEqual(unknownFields(), paymentRequest.unknownFields()) && this.transfer_type == paymentRequest.transfer_type && Intrinsics.areEqual(this.instrument_id, paymentRequest.instrument_id) && this.instrument_type == paymentRequest.instrument_type && this.is_3ds_required == paymentRequest.is_3ds_required;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.transfer_type.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + Boolean.hashCode(this.is_3ds_required);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_type=" + this.transfer_type);
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("is_3ds_required=" + this.is_3ds_required);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PaymentRequest copy$default(PaymentRequest paymentRequest, TransferType transferType, String str, AccountType accountType, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            transferType = paymentRequest.transfer_type;
        }
        if ((i & 2) != 0) {
            str = paymentRequest.instrument_id;
        }
        if ((i & 4) != 0) {
            accountType = paymentRequest.instrument_type;
        }
        if ((i & 8) != 0) {
            z = paymentRequest.is_3ds_required;
        }
        if ((i & 16) != 0) {
            byteString = paymentRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        AccountType accountType2 = accountType;
        return paymentRequest.copy(transferType, str, accountType2, z, byteString2);
    }

    public final PaymentRequest copy(TransferType transfer_type, String instrument_id, AccountType instrument_type, boolean is_3ds_required, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PaymentRequest(transfer_type, instrument_id, instrument_type, is_3ds_required, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PaymentRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PaymentRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.PaymentRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    size += TransferType.ADAPTER.encodedSizeWithTag(1, value.getTransfer_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (value.getInstrument_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(3, value.getInstrument_type());
                }
                return value.getIs_3ds_required() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_3ds_required())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getInstrument_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                if (value.getIs_3ds_required()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_3ds_required()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_3ds_required()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_3ds_required()));
                }
                if (value.getInstrument_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getTransfer_type() != TransferType.TRANSFER_TYPE__UNSPECIFIED) {
                    TransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TransferType transferTypeDecode = TransferType.TRANSFER_TYPE__UNSPECIFIED;
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                AccountType accountTypeDecode = accountType;
                while (true) {
                    TransferType transferType = transferTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PaymentRequest(transferType, strDecode, accountTypeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                transferTypeDecode = TransferType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                accountTypeDecode = AccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentRequest redact(PaymentRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PaymentRequest.copy$default(value, null, null, null, false, ByteString.EMPTY, 15, null);
            }
        };
    }
}
