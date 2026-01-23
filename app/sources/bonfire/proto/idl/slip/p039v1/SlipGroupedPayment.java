package bonfire.proto.idl.slip.p039v1;

import com.robinhood.rosetta.common.Money;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: SlipGroupedPayment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016Jb\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPayment;", "Lcom/squareup/wire/Message;", "", "id", "", "account_number", "record_date", "amount", "Lcom/robinhood/rosetta/common/Money;", "payments", "", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentItem;", "withheld_amount", "net_credit", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_number", "getRecord_date", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getWithheld_amount", "getNet_credit", "getPayments", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SlipGroupedPayment extends Message {

    @JvmField
    public static final ProtoAdapter<SlipGroupedPayment> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "netCredit", schemaIndex = 6, tag = 7)
    private final Money net_credit;

    @WireField(adapter = "bonfire.proto.idl.slip.v1.SlipGroupedPaymentItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<SlipGroupedPaymentItem> payments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String record_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "withheldAmount", schemaIndex = 5, tag = 6)
    private final Money withheld_amount;

    public SlipGroupedPayment() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ SlipGroupedPayment(String str, String str2, String str3, Money money, List list, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : money, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : money2, (i & 64) != 0 ? null : money3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9048newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getRecord_date() {
        return this.record_date;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Money getWithheld_amount() {
        return this.withheld_amount;
    }

    public final Money getNet_credit() {
        return this.net_credit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipGroupedPayment(String id, String account_number, String record_date, Money money, List<SlipGroupedPaymentItem> payments, Money money2, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.record_date = record_date;
        this.amount = money;
        this.withheld_amount = money2;
        this.net_credit = money3;
        this.payments = Internal.immutableCopyOf("payments", payments);
    }

    public final List<SlipGroupedPaymentItem> getPayments() {
        return this.payments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9048newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SlipGroupedPayment)) {
            return false;
        }
        SlipGroupedPayment slipGroupedPayment = (SlipGroupedPayment) other;
        return Intrinsics.areEqual(unknownFields(), slipGroupedPayment.unknownFields()) && Intrinsics.areEqual(this.id, slipGroupedPayment.id) && Intrinsics.areEqual(this.account_number, slipGroupedPayment.account_number) && Intrinsics.areEqual(this.record_date, slipGroupedPayment.record_date) && Intrinsics.areEqual(this.amount, slipGroupedPayment.amount) && Intrinsics.areEqual(this.payments, slipGroupedPayment.payments) && Intrinsics.areEqual(this.withheld_amount, slipGroupedPayment.withheld_amount) && Intrinsics.areEqual(this.net_credit, slipGroupedPayment.net_credit);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.record_date.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.payments.hashCode()) * 37;
        Money money2 = this.withheld_amount;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.net_credit;
        int iHashCode4 = iHashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("record_date=" + Internal.sanitize(this.record_date));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        if (!this.payments.isEmpty()) {
            arrayList.add("payments=" + this.payments);
        }
        Money money2 = this.withheld_amount;
        if (money2 != null) {
            arrayList.add("withheld_amount=" + money2);
        }
        Money money3 = this.net_credit;
        if (money3 != null) {
            arrayList.add("net_credit=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SlipGroupedPayment{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SlipGroupedPayment copy$default(SlipGroupedPayment slipGroupedPayment, String str, String str2, String str3, Money money, List list, Money money2, Money money3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slipGroupedPayment.id;
        }
        if ((i & 2) != 0) {
            str2 = slipGroupedPayment.account_number;
        }
        if ((i & 4) != 0) {
            str3 = slipGroupedPayment.record_date;
        }
        if ((i & 8) != 0) {
            money = slipGroupedPayment.amount;
        }
        if ((i & 16) != 0) {
            list = slipGroupedPayment.payments;
        }
        if ((i & 32) != 0) {
            money2 = slipGroupedPayment.withheld_amount;
        }
        if ((i & 64) != 0) {
            money3 = slipGroupedPayment.net_credit;
        }
        if ((i & 128) != 0) {
            byteString = slipGroupedPayment.unknownFields();
        }
        Money money4 = money3;
        ByteString byteString2 = byteString;
        List list2 = list;
        Money money5 = money2;
        return slipGroupedPayment.copy(str, str2, str3, money, list2, money5, money4, byteString2);
    }

    public final SlipGroupedPayment copy(String id, String account_number, String record_date, Money amount, List<SlipGroupedPaymentItem> payments, Money withheld_amount, Money net_credit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SlipGroupedPayment(id, account_number, record_date, amount, payments, withheld_amount, net_credit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SlipGroupedPayment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SlipGroupedPayment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.slip.v1.SlipGroupedPayment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SlipGroupedPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRecord_date());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getAmount());
                }
                int iEncodedSizeWithTag = size + SlipGroupedPaymentItem.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getPayments());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getWithheld_amount()) + protoAdapter.encodedSizeWithTag(7, value.getNet_credit());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SlipGroupedPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRecord_date());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                SlipGroupedPaymentItem.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getPayments());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getWithheld_amount());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNet_credit());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SlipGroupedPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNet_credit());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getWithheld_amount());
                SlipGroupedPaymentItem.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getPayments());
                if (value.getAmount() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRecord_date());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SlipGroupedPayment decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                arrayList.add(SlipGroupedPaymentItem.ADAPTER.decode(reader));
                                break;
                            case 6:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SlipGroupedPayment(strDecode, strDecode3, strDecode2, moneyDecode, arrayList, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SlipGroupedPayment redact(SlipGroupedPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getPayments(), SlipGroupedPaymentItem.ADAPTER);
                Money withheld_amount = value.getWithheld_amount();
                Money moneyRedact2 = withheld_amount != null ? Money.ADAPTER.redact(withheld_amount) : null;
                Money net_credit = value.getNet_credit();
                return SlipGroupedPayment.copy$default(value, null, null, null, moneyRedact, listM26823redactElements, moneyRedact2, net_credit != null ? Money.ADAPTER.redact(net_credit) : null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
