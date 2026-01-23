package bff_money_movement.service.p019v1;

import com.robinhood.rosetta.common.Currency;
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

/* compiled from: GetNonOriginatedTransferInfoRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequest;", "Lcom/squareup/wire/Message;", "", "transfer_type", "Lbff_money_movement/service/v1/NonOriginatedTransferType;", "currency", "Lcom/robinhood/rosetta/common/Currency;", "robinhood_account", "Lbff_money_movement/service/v1/RobinhoodAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/NonOriginatedTransferType;Lcom/robinhood/rosetta/common/Currency;Lbff_money_movement/service/v1/RobinhoodAccount;Lokio/ByteString;)V", "getTransfer_type", "()Lbff_money_movement/service/v1/NonOriginatedTransferType;", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getRobinhood_account", "()Lbff_money_movement/service/v1/RobinhoodAccount;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetNonOriginatedTransferInfoRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetNonOriginatedTransferInfoRequest> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Currency currency;

    @WireField(adapter = "bff_money_movement.service.v1.RobinhoodAccount#ADAPTER", jsonName = "robinhoodAccount", schemaIndex = 2, tag = 3)
    private final RobinhoodAccount robinhood_account;

    @WireField(adapter = "bff_money_movement.service.v1.NonOriginatedTransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final NonOriginatedTransferType transfer_type;

    public GetNonOriginatedTransferInfoRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8422newBuilder();
    }

    public final NonOriginatedTransferType getTransfer_type() {
        return this.transfer_type;
    }

    public /* synthetic */ GetNonOriginatedTransferInfoRequest(NonOriginatedTransferType nonOriginatedTransferType, Currency currency, RobinhoodAccount robinhoodAccount, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED : nonOriginatedTransferType, (i & 2) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 4) != 0 ? null : robinhoodAccount, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final RobinhoodAccount getRobinhood_account() {
        return this.robinhood_account;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNonOriginatedTransferInfoRequest(NonOriginatedTransferType transfer_type, Currency currency, RobinhoodAccount robinhoodAccount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_type = transfer_type;
        this.currency = currency;
        this.robinhood_account = robinhoodAccount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8422newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNonOriginatedTransferInfoRequest)) {
            return false;
        }
        GetNonOriginatedTransferInfoRequest getNonOriginatedTransferInfoRequest = (GetNonOriginatedTransferInfoRequest) other;
        return Intrinsics.areEqual(unknownFields(), getNonOriginatedTransferInfoRequest.unknownFields()) && this.transfer_type == getNonOriginatedTransferInfoRequest.transfer_type && this.currency == getNonOriginatedTransferInfoRequest.currency && Intrinsics.areEqual(this.robinhood_account, getNonOriginatedTransferInfoRequest.robinhood_account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.transfer_type.hashCode()) * 37) + this.currency.hashCode()) * 37;
        RobinhoodAccount robinhoodAccount = this.robinhood_account;
        int iHashCode2 = iHashCode + (robinhoodAccount != null ? robinhoodAccount.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_type=" + this.transfer_type);
        arrayList.add("currency=" + this.currency);
        RobinhoodAccount robinhoodAccount = this.robinhood_account;
        if (robinhoodAccount != null) {
            arrayList.add("robinhood_account=" + robinhoodAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNonOriginatedTransferInfoRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetNonOriginatedTransferInfoRequest copy$default(GetNonOriginatedTransferInfoRequest getNonOriginatedTransferInfoRequest, NonOriginatedTransferType nonOriginatedTransferType, Currency currency, RobinhoodAccount robinhoodAccount, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            nonOriginatedTransferType = getNonOriginatedTransferInfoRequest.transfer_type;
        }
        if ((i & 2) != 0) {
            currency = getNonOriginatedTransferInfoRequest.currency;
        }
        if ((i & 4) != 0) {
            robinhoodAccount = getNonOriginatedTransferInfoRequest.robinhood_account;
        }
        if ((i & 8) != 0) {
            byteString = getNonOriginatedTransferInfoRequest.unknownFields();
        }
        return getNonOriginatedTransferInfoRequest.copy(nonOriginatedTransferType, currency, robinhoodAccount, byteString);
    }

    public final GetNonOriginatedTransferInfoRequest copy(NonOriginatedTransferType transfer_type, Currency currency, RobinhoodAccount robinhood_account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNonOriginatedTransferInfoRequest(transfer_type, currency, robinhood_account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNonOriginatedTransferInfoRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNonOriginatedTransferInfoRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetNonOriginatedTransferInfoRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNonOriginatedTransferInfoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer_type() != NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    size += NonOriginatedTransferType.ADAPTER.encodedSizeWithTag(1, value.getTransfer_type());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(2, value.getCurrency());
                }
                return size + RobinhoodAccount.ADAPTER.encodedSizeWithTag(3, value.getRobinhood_account());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNonOriginatedTransferInfoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer_type() != NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    NonOriginatedTransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency());
                }
                RobinhoodAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getRobinhood_account());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNonOriginatedTransferInfoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RobinhoodAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getRobinhood_account());
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency());
                }
                if (value.getTransfer_type() != NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    NonOriginatedTransferType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetNonOriginatedTransferInfoRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NonOriginatedTransferType nonOriginatedTransferTypeDecode = NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED;
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                RobinhoodAccount robinhoodAccountDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNonOriginatedTransferInfoRequest(nonOriginatedTransferTypeDecode, currencyDecode, robinhoodAccountDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            nonOriginatedTransferTypeDecode = NonOriginatedTransferType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            currencyDecode = Currency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        robinhoodAccountDecode = RobinhoodAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNonOriginatedTransferInfoRequest redact(GetNonOriginatedTransferInfoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RobinhoodAccount robinhood_account = value.getRobinhood_account();
                return GetNonOriginatedTransferInfoRequest.copy$default(value, null, null, robinhood_account != null ? RobinhoodAccount.ADAPTER.redact(robinhood_account) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
