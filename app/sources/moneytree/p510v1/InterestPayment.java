package moneytree.p510v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: InterestPayment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Bu\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ{\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010$\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010&R \u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010!\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b0\u0010\u001e¨\u00062"}, m3636d2 = {"Lmoneytree/v1/InterestPayment;", "Lcom/squareup/wire/Message;", "", "", "payment_id", "description", "Lcom/robinhood/rosetta/common/Money;", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "fee_amount", "fee_ratio_applied", "payment_reason", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lmoneytree/v1/InterestPayment;", "Ljava/lang/String;", "getPayment_id", "getDescription", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getFee_amount", "getFee_amount$annotations", "()V", "getFee_ratio_applied", "getFee_ratio_applied$annotations", "getPayment_reason", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class InterestPayment extends Message {

    @JvmField
    public static final ProtoAdapter<InterestPayment> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "feeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money fee_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatioApplied", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String fee_ratio_applied;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "paymentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String payment_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "paymentReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String payment_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant updated_at;

    public InterestPayment() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ InterestPayment(String str, String str2, Money money, Instant instant, Instant instant2, Money money2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : money2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29334newBuilder();
    }

    public final String getPayment_id() {
        return this.payment_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final Money getFee_amount() {
        return this.fee_amount;
    }

    public final String getFee_ratio_applied() {
        return this.fee_ratio_applied;
    }

    public final String getPayment_reason() {
        return this.payment_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestPayment(String payment_id, String description, Money money, Instant instant, Instant instant2, Money money2, String fee_ratio_applied, String payment_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(payment_id, "payment_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fee_ratio_applied, "fee_ratio_applied");
        Intrinsics.checkNotNullParameter(payment_reason, "payment_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.payment_id = payment_id;
        this.description = description;
        this.amount = money;
        this.created_at = instant;
        this.updated_at = instant2;
        this.fee_amount = money2;
        this.fee_ratio_applied = fee_ratio_applied;
        this.payment_reason = payment_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29334newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InterestPayment)) {
            return false;
        }
        InterestPayment interestPayment = (InterestPayment) other;
        return Intrinsics.areEqual(unknownFields(), interestPayment.unknownFields()) && Intrinsics.areEqual(this.payment_id, interestPayment.payment_id) && Intrinsics.areEqual(this.description, interestPayment.description) && Intrinsics.areEqual(this.amount, interestPayment.amount) && Intrinsics.areEqual(this.created_at, interestPayment.created_at) && Intrinsics.areEqual(this.updated_at, interestPayment.updated_at) && Intrinsics.areEqual(this.fee_amount, interestPayment.fee_amount) && Intrinsics.areEqual(this.fee_ratio_applied, interestPayment.fee_ratio_applied) && Intrinsics.areEqual(this.payment_reason, interestPayment.payment_reason);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.payment_id.hashCode()) * 37) + this.description.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Money money2 = this.fee_amount;
        int iHashCode5 = ((((iHashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.fee_ratio_applied.hashCode()) * 37) + this.payment_reason.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("payment_id=" + Internal.sanitize(this.payment_id));
        arrayList.add("description=" + Internal.sanitize(this.description));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        Money money2 = this.fee_amount;
        if (money2 != null) {
            arrayList.add("fee_amount=" + money2);
        }
        arrayList.add("fee_ratio_applied=" + Internal.sanitize(this.fee_ratio_applied));
        arrayList.add("payment_reason=" + Internal.sanitize(this.payment_reason));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InterestPayment{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InterestPayment copy$default(InterestPayment interestPayment, String str, String str2, Money money, Instant instant, Instant instant2, Money money2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestPayment.payment_id;
        }
        if ((i & 2) != 0) {
            str2 = interestPayment.description;
        }
        if ((i & 4) != 0) {
            money = interestPayment.amount;
        }
        if ((i & 8) != 0) {
            instant = interestPayment.created_at;
        }
        if ((i & 16) != 0) {
            instant2 = interestPayment.updated_at;
        }
        if ((i & 32) != 0) {
            money2 = interestPayment.fee_amount;
        }
        if ((i & 64) != 0) {
            str3 = interestPayment.fee_ratio_applied;
        }
        if ((i & 128) != 0) {
            str4 = interestPayment.payment_reason;
        }
        if ((i & 256) != 0) {
            byteString = interestPayment.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        Money money3 = money2;
        String str6 = str3;
        Instant instant3 = instant2;
        Money money4 = money;
        return interestPayment.copy(str, str2, money4, instant, instant3, money3, str6, str5, byteString2);
    }

    public final InterestPayment copy(String payment_id, String description, Money amount, Instant created_at, Instant updated_at, Money fee_amount, String fee_ratio_applied, String payment_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(payment_id, "payment_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fee_ratio_applied, "fee_ratio_applied");
        Intrinsics.checkNotNullParameter(payment_reason, "payment_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InterestPayment(payment_id, description, amount, created_at, updated_at, fee_amount, fee_ratio_applied, payment_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InterestPayment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InterestPayment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.InterestPayment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InterestPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPayment_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPayment_id());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getUpdated_at());
                }
                if (value.getFee_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getFee_amount());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio_applied(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getFee_ratio_applied());
                }
                return !Intrinsics.areEqual(value.getPayment_reason(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPayment_reason()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InterestPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPayment_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayment_id());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getFee_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getFee_amount());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio_applied(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getFee_ratio_applied());
                }
                if (!Intrinsics.areEqual(value.getPayment_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPayment_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InterestPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPayment_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPayment_reason());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio_applied(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getFee_ratio_applied());
                }
                if (value.getFee_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getFee_amount());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getPayment_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPayment_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InterestPayment redact(InterestPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Money fee_amount = value.getFee_amount();
                return InterestPayment.copy$default(value, null, null, moneyRedact, instantRedact, instantRedact2, fee_amount != null ? Money.ADAPTER.redact(fee_amount) : null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InterestPayment decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Money moneyDecode2 = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InterestPayment(strDecode, strDecode4, moneyDecode, instantDecode, instantDecode2, moneyDecode2, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
