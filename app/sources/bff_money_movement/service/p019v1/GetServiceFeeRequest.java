package bff_money_movement.service.p019v1;

import cashier_protos.payment_intents.p047v1.Direction;
import cashier_protos.payment_intents.p047v1.FXTransferCreationDetails;
import cashier_protos.payment_intents.p047v1.Purpose;
import com.robinhood.rosetta.common.Currency;
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

/* compiled from: GetServiceFeeRequest.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JF\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequest;", "Lcom/squareup/wire/Message;", "", "amount", "", "currency", "Lcom/robinhood/rosetta/common/Currency;", "direction", "Lcashier_protos/payment_intents/v1/Direction;", "purpose", "Lcashier_protos/payment_intents/v1/Purpose;", "fx_transfer_creation_details", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Lcashier_protos/payment_intents/v1/Direction;Lcashier_protos/payment_intents/v1/Purpose;Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;Lokio/ByteString;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getDirection", "()Lcashier_protos/payment_intents/v1/Direction;", "getPurpose", "()Lcashier_protos/payment_intents/v1/Purpose;", "getFx_transfer_creation_details", "()Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetServiceFeeRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetServiceFeeRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Currency currency;

    @WireField(adapter = "cashier_protos.payment_intents.v1.Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Direction direction;

    @WireField(adapter = "cashier_protos.payment_intents.v1.FXTransferCreationDetails#ADAPTER", jsonName = "fxTransferCreationDetails", oneofName = "transfer_details", schemaIndex = 4, tag = 5)
    private final FXTransferCreationDetails fx_transfer_creation_details;

    @WireField(adapter = "cashier_protos.payment_intents.v1.Purpose#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Purpose purpose;

    public GetServiceFeeRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8429newBuilder();
    }

    public final String getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public /* synthetic */ GetServiceFeeRequest(String str, Currency currency, Direction direction, Purpose purpose, FXTransferCreationDetails fXTransferCreationDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 4) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 8) != 0 ? Purpose.PURPOSE_UNSPECIFIED : purpose, (i & 16) != 0 ? null : fXTransferCreationDetails, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final Purpose getPurpose() {
        return this.purpose;
    }

    public final FXTransferCreationDetails getFx_transfer_creation_details() {
        return this.fx_transfer_creation_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetServiceFeeRequest(String str, Currency currency, Direction direction, Purpose purpose, FXTransferCreationDetails fXTransferCreationDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.amount = str;
        this.currency = currency;
        this.direction = direction;
        this.purpose = purpose;
        this.fx_transfer_creation_details = fXTransferCreationDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8429newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetServiceFeeRequest)) {
            return false;
        }
        GetServiceFeeRequest getServiceFeeRequest = (GetServiceFeeRequest) other;
        return Intrinsics.areEqual(unknownFields(), getServiceFeeRequest.unknownFields()) && Intrinsics.areEqual(this.amount, getServiceFeeRequest.amount) && this.currency == getServiceFeeRequest.currency && this.direction == getServiceFeeRequest.direction && this.purpose == getServiceFeeRequest.purpose && Intrinsics.areEqual(this.fx_transfer_creation_details, getServiceFeeRequest.fx_transfer_creation_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.amount;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.currency.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.purpose.hashCode()) * 37;
        FXTransferCreationDetails fXTransferCreationDetails = this.fx_transfer_creation_details;
        int iHashCode3 = iHashCode2 + (fXTransferCreationDetails != null ? fXTransferCreationDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.amount;
        if (str != null) {
            arrayList.add("amount=" + Internal.sanitize(str));
        }
        arrayList.add("currency=" + this.currency);
        arrayList.add("direction=" + this.direction);
        arrayList.add("purpose=" + this.purpose);
        FXTransferCreationDetails fXTransferCreationDetails = this.fx_transfer_creation_details;
        if (fXTransferCreationDetails != null) {
            arrayList.add("fx_transfer_creation_details=" + fXTransferCreationDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetServiceFeeRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetServiceFeeRequest copy$default(GetServiceFeeRequest getServiceFeeRequest, String str, Currency currency, Direction direction, Purpose purpose, FXTransferCreationDetails fXTransferCreationDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getServiceFeeRequest.amount;
        }
        if ((i & 2) != 0) {
            currency = getServiceFeeRequest.currency;
        }
        if ((i & 4) != 0) {
            direction = getServiceFeeRequest.direction;
        }
        if ((i & 8) != 0) {
            purpose = getServiceFeeRequest.purpose;
        }
        if ((i & 16) != 0) {
            fXTransferCreationDetails = getServiceFeeRequest.fx_transfer_creation_details;
        }
        if ((i & 32) != 0) {
            byteString = getServiceFeeRequest.unknownFields();
        }
        FXTransferCreationDetails fXTransferCreationDetails2 = fXTransferCreationDetails;
        ByteString byteString2 = byteString;
        return getServiceFeeRequest.copy(str, currency, direction, purpose, fXTransferCreationDetails2, byteString2);
    }

    public final GetServiceFeeRequest copy(String amount, Currency currency, Direction direction, Purpose purpose, FXTransferCreationDetails fx_transfer_creation_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetServiceFeeRequest(amount, currency, direction, purpose, fx_transfer_creation_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetServiceFeeRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetServiceFeeRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetServiceFeeRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetServiceFeeRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAmount());
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(2, value.getCurrency());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    size += Direction.ADAPTER.encodedSizeWithTag(3, value.getDirection());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    size += Purpose.ADAPTER.encodedSizeWithTag(4, value.getPurpose());
                }
                return size + FXTransferCreationDetails.ADAPTER.encodedSizeWithTag(5, value.getFx_transfer_creation_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetServiceFeeRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 3, (int) value.getDirection());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    Purpose.ADAPTER.encodeWithTag(writer, 4, (int) value.getPurpose());
                }
                FXTransferCreationDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getFx_transfer_creation_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetServiceFeeRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FXTransferCreationDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getFx_transfer_creation_details());
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    Purpose.ADAPTER.encodeWithTag(writer, 4, (int) value.getPurpose());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 3, (int) value.getDirection());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetServiceFeeRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                Direction direction = Direction.DIRECTION_UNSPECIFIED;
                Purpose purpose = Purpose.PURPOSE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                FXTransferCreationDetails fXTransferCreationDetailsDecode = null;
                Purpose purposeDecode = purpose;
                Direction directionDecode = direction;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetServiceFeeRequest(strDecode, currency, directionDecode, purposeDecode, fXTransferCreationDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                directionDecode = Direction.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                purposeDecode = Purpose.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 5) {
                            fXTransferCreationDetailsDecode = FXTransferCreationDetails.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetServiceFeeRequest redact(GetServiceFeeRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FXTransferCreationDetails fx_transfer_creation_details = value.getFx_transfer_creation_details();
                return GetServiceFeeRequest.copy$default(value, null, null, null, null, fx_transfer_creation_details != null ? FXTransferCreationDetails.ADAPTER.redact(fx_transfer_creation_details) : null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
