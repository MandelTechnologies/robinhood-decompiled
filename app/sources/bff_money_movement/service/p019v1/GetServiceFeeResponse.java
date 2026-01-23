package bff_money_movement.service.p019v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: GetServiceFeeResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeResponse;", "Lcom/squareup/wire/Message;", "", "transfer_fee", "Lcom/robinhood/rosetta/common/Money;", AnalyticsStrings.PUSH_NOTIF_EVENT_RECEIVED, "tax_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getTransfer_fee", "()Lcom/robinhood/rosetta/common/Money;", "getReceived", "getTax_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetServiceFeeResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetServiceFeeResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
    private final Money received;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "taxAmount", schemaIndex = 2, tag = 3)
    private final Money tax_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "transferFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money transfer_fee;

    public GetServiceFeeResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8430newBuilder();
    }

    public final Money getTransfer_fee() {
        return this.transfer_fee;
    }

    public final Money getReceived() {
        return this.received;
    }

    public final Money getTax_amount() {
        return this.tax_amount;
    }

    public /* synthetic */ GetServiceFeeResponse(Money money, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetServiceFeeResponse(Money money, Money money2, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_fee = money;
        this.received = money2;
        this.tax_amount = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8430newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetServiceFeeResponse)) {
            return false;
        }
        GetServiceFeeResponse getServiceFeeResponse = (GetServiceFeeResponse) other;
        return Intrinsics.areEqual(unknownFields(), getServiceFeeResponse.unknownFields()) && Intrinsics.areEqual(this.transfer_fee, getServiceFeeResponse.transfer_fee) && Intrinsics.areEqual(this.received, getServiceFeeResponse.received) && Intrinsics.areEqual(this.tax_amount, getServiceFeeResponse.tax_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.transfer_fee;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.received;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.tax_amount;
        int iHashCode4 = iHashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.transfer_fee;
        if (money != null) {
            arrayList.add("transfer_fee=" + money);
        }
        Money money2 = this.received;
        if (money2 != null) {
            arrayList.add("received=" + money2);
        }
        Money money3 = this.tax_amount;
        if (money3 != null) {
            arrayList.add("tax_amount=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetServiceFeeResponse{", "}", 0, null, null, 56, null);
    }

    public final GetServiceFeeResponse copy(Money transfer_fee, Money received, Money tax_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetServiceFeeResponse(transfer_fee, received, tax_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetServiceFeeResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetServiceFeeResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetServiceFeeResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetServiceFeeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTransfer_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTransfer_fee());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(2, value.getReceived()) + protoAdapter.encodedSizeWithTag(3, value.getTax_amount());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetServiceFeeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTransfer_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTransfer_fee());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getReceived());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTax_amount());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetServiceFeeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTax_amount());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getReceived());
                if (value.getTransfer_fee() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getTransfer_fee());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetServiceFeeResponse redact(GetServiceFeeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money transfer_fee = value.getTransfer_fee();
                Money moneyRedact = transfer_fee != null ? Money.ADAPTER.redact(transfer_fee) : null;
                Money received = value.getReceived();
                Money moneyRedact2 = received != null ? Money.ADAPTER.redact(received) : null;
                Money tax_amount = value.getTax_amount();
                return value.copy(moneyRedact, moneyRedact2, tax_amount != null ? Money.ADAPTER.redact(tax_amount) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetServiceFeeResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetServiceFeeResponse(moneyDecode, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
