package bonfire.proto.idl.equities.p034v1;

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
import p479j$.time.Instant;

/* compiled from: AggregatedBorrowCharge.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0081\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u0087\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010!R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\"\u0010\u0011\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b1\u0010)R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowCharge;", "Lcom/squareup/wire/Message;", "", "", "id", "account_number", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "billing_end_date", "billing_start_date", "Lbonfire/proto/idl/equities/v1/StatusChoices;", "status", "Lcom/robinhood/rosetta/common/Money;", "total_charge_amount", "", "Lbonfire/proto/idl/equities/v1/BorrowCharge;", "charges", "charge_date", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/equities/v1/StatusChoices;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/equities/v1/StatusChoices;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lj$/time/Instant;Lokio/ByteString;)Lbonfire/proto/idl/equities/v1/AggregatedBorrowCharge;", "Ljava/lang/String;", "getId", "getAccount_number", "Lj$/time/Instant;", "getBilling_end_date", "()Lj$/time/Instant;", "getBilling_start_date", "Lbonfire/proto/idl/equities/v1/StatusChoices;", "getStatus", "()Lbonfire/proto/idl/equities/v1/StatusChoices;", "Lcom/robinhood/rosetta/common/Money;", "getTotal_charge_amount", "()Lcom/robinhood/rosetta/common/Money;", "getCharge_date", "Ljava/util/List;", "getCharges", "()Ljava/util/List;", "Companion", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AggregatedBorrowCharge extends Message {

    @JvmField
    public static final ProtoAdapter<AggregatedBorrowCharge> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "billingEndDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant billing_end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "billingStartDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant billing_start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "chargeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant charge_date;

    @WireField(adapter = "bonfire.proto.idl.equities.v1.BorrowCharge#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<BorrowCharge> charges;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "bonfire.proto.idl.equities.v1.StatusChoices#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final StatusChoices status;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalChargeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money total_charge_amount;

    public AggregatedBorrowCharge() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ AggregatedBorrowCharge(String str, String str2, Instant instant, Instant instant2, StatusChoices statusChoices, Money money, List list, Instant instant3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? StatusChoices.STATUS_CHOICES_UNSPECIFIED : statusChoices, (i & 32) != 0 ? null : money, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : instant3, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8961newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Instant getBilling_end_date() {
        return this.billing_end_date;
    }

    public final Instant getBilling_start_date() {
        return this.billing_start_date;
    }

    public final StatusChoices getStatus() {
        return this.status;
    }

    public final Money getTotal_charge_amount() {
        return this.total_charge_amount;
    }

    public final Instant getCharge_date() {
        return this.charge_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedBorrowCharge(String id, String account_number, Instant instant, Instant instant2, StatusChoices status, Money money, List<BorrowCharge> charges, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(charges, "charges");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.billing_end_date = instant;
        this.billing_start_date = instant2;
        this.status = status;
        this.total_charge_amount = money;
        this.charge_date = instant3;
        this.charges = Internal.immutableCopyOf("charges", charges);
    }

    public final List<BorrowCharge> getCharges() {
        return this.charges;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8961newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AggregatedBorrowCharge)) {
            return false;
        }
        AggregatedBorrowCharge aggregatedBorrowCharge = (AggregatedBorrowCharge) other;
        return Intrinsics.areEqual(unknownFields(), aggregatedBorrowCharge.unknownFields()) && Intrinsics.areEqual(this.id, aggregatedBorrowCharge.id) && Intrinsics.areEqual(this.account_number, aggregatedBorrowCharge.account_number) && Intrinsics.areEqual(this.billing_end_date, aggregatedBorrowCharge.billing_end_date) && Intrinsics.areEqual(this.billing_start_date, aggregatedBorrowCharge.billing_start_date) && this.status == aggregatedBorrowCharge.status && Intrinsics.areEqual(this.total_charge_amount, aggregatedBorrowCharge.total_charge_amount) && Intrinsics.areEqual(this.charges, aggregatedBorrowCharge.charges) && Intrinsics.areEqual(this.charge_date, aggregatedBorrowCharge.charge_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        Instant instant = this.billing_end_date;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.billing_start_date;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.status.hashCode()) * 37;
        Money money = this.total_charge_amount;
        int iHashCode4 = (((iHashCode3 + (money != null ? money.hashCode() : 0)) * 37) + this.charges.hashCode()) * 37;
        Instant instant3 = this.charge_date;
        int iHashCode5 = iHashCode4 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        Instant instant = this.billing_end_date;
        if (instant != null) {
            arrayList.add("billing_end_date=" + instant);
        }
        Instant instant2 = this.billing_start_date;
        if (instant2 != null) {
            arrayList.add("billing_start_date=" + instant2);
        }
        arrayList.add("status=" + this.status);
        Money money = this.total_charge_amount;
        if (money != null) {
            arrayList.add("total_charge_amount=" + money);
        }
        if (!this.charges.isEmpty()) {
            arrayList.add("charges=" + this.charges);
        }
        Instant instant3 = this.charge_date;
        if (instant3 != null) {
            arrayList.add("charge_date=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AggregatedBorrowCharge{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AggregatedBorrowCharge copy$default(AggregatedBorrowCharge aggregatedBorrowCharge, String str, String str2, Instant instant, Instant instant2, StatusChoices statusChoices, Money money, List list, Instant instant3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aggregatedBorrowCharge.id;
        }
        if ((i & 2) != 0) {
            str2 = aggregatedBorrowCharge.account_number;
        }
        if ((i & 4) != 0) {
            instant = aggregatedBorrowCharge.billing_end_date;
        }
        if ((i & 8) != 0) {
            instant2 = aggregatedBorrowCharge.billing_start_date;
        }
        if ((i & 16) != 0) {
            statusChoices = aggregatedBorrowCharge.status;
        }
        if ((i & 32) != 0) {
            money = aggregatedBorrowCharge.total_charge_amount;
        }
        if ((i & 64) != 0) {
            list = aggregatedBorrowCharge.charges;
        }
        if ((i & 128) != 0) {
            instant3 = aggregatedBorrowCharge.charge_date;
        }
        if ((i & 256) != 0) {
            byteString = aggregatedBorrowCharge.unknownFields();
        }
        Instant instant4 = instant3;
        ByteString byteString2 = byteString;
        Money money2 = money;
        List list2 = list;
        StatusChoices statusChoices2 = statusChoices;
        Instant instant5 = instant;
        return aggregatedBorrowCharge.copy(str, str2, instant5, instant2, statusChoices2, money2, list2, instant4, byteString2);
    }

    public final AggregatedBorrowCharge copy(String id, String account_number, Instant billing_end_date, Instant billing_start_date, StatusChoices status, Money total_charge_amount, List<BorrowCharge> charges, Instant charge_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(charges, "charges");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AggregatedBorrowCharge(id, account_number, billing_end_date, billing_start_date, status, total_charge_amount, charges, charge_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AggregatedBorrowCharge.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AggregatedBorrowCharge>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.equities.v1.AggregatedBorrowCharge$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AggregatedBorrowCharge value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getBilling_end_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getBilling_end_date());
                }
                if (value.getBilling_start_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getBilling_start_date());
                }
                if (value.getStatus() != StatusChoices.STATUS_CHOICES_UNSPECIFIED) {
                    size += StatusChoices.ADAPTER.encodedSizeWithTag(5, value.getStatus());
                }
                if (value.getTotal_charge_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getTotal_charge_amount());
                }
                int iEncodedSizeWithTag = size + BorrowCharge.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getCharges());
                return value.getCharge_date() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getCharge_date()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AggregatedBorrowCharge value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getBilling_end_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getBilling_end_date());
                }
                if (value.getBilling_start_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getBilling_start_date());
                }
                if (value.getStatus() != StatusChoices.STATUS_CHOICES_UNSPECIFIED) {
                    StatusChoices.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (value.getTotal_charge_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTotal_charge_amount());
                }
                BorrowCharge.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getCharges());
                if (value.getCharge_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCharge_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AggregatedBorrowCharge value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCharge_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCharge_date());
                }
                BorrowCharge.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getCharges());
                if (value.getTotal_charge_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTotal_charge_amount());
                }
                if (value.getStatus() != StatusChoices.STATUS_CHOICES_UNSPECIFIED) {
                    StatusChoices.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (value.getBilling_start_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getBilling_start_date());
                }
                if (value.getBilling_end_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getBilling_end_date());
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
            public AggregatedBorrowCharge decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                StatusChoices statusChoices = StatusChoices.STATUS_CHOICES_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Money moneyDecode = null;
                Instant instantDecode3 = null;
                StatusChoices statusChoicesDecode = statusChoices;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                try {
                                    statusChoicesDecode = StatusChoices.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                arrayList.add(BorrowCharge.ADAPTER.decode(reader));
                                break;
                            case 8:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AggregatedBorrowCharge(strDecode2, strDecode, instantDecode, instantDecode2, statusChoicesDecode, moneyDecode, arrayList, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AggregatedBorrowCharge redact(AggregatedBorrowCharge value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant billing_end_date = value.getBilling_end_date();
                Instant instantRedact = billing_end_date != null ? ProtoAdapter.INSTANT.redact(billing_end_date) : null;
                Instant billing_start_date = value.getBilling_start_date();
                Instant instantRedact2 = billing_start_date != null ? ProtoAdapter.INSTANT.redact(billing_start_date) : null;
                Money total_charge_amount = value.getTotal_charge_amount();
                Money moneyRedact = total_charge_amount != null ? Money.ADAPTER.redact(total_charge_amount) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getCharges(), BorrowCharge.ADAPTER);
                Instant charge_date = value.getCharge_date();
                return AggregatedBorrowCharge.copy$default(value, null, null, instantRedact, instantRedact2, null, moneyRedact, listM26823redactElements, charge_date != null ? ProtoAdapter.INSTANT.redact(charge_date) : null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
