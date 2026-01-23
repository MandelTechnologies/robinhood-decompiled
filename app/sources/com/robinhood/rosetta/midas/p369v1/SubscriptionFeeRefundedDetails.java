package com.robinhood.rosetta.midas.p369v1;

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
import rosetta.midas.p538v1.SubscriptionFeePaymentType;

/* compiled from: SubscriptionFeeRefundedDetails.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJg\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u001eR\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b-\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "subscription_fee_id", "subscription_fee_refund_id", "", "compliance_user_major_oak_email", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/rosetta/common/Money;", "amount", "state", "Lrosetta/midas/v1/SubscriptionFeePaymentType;", "payment_type", "unknownFields", "<init>", "(Lokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentType;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "Lokio/ByteString;", "getSubscription_fee_id", "()Lokio/ByteString;", "getSubscription_fee_refund_id", "Ljava/lang/String;", "getCompliance_user_major_oak_email", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getState", "Lrosetta/midas/v1/SubscriptionFeePaymentType;", "getPayment_type", "()Lrosetta/midas/v1/SubscriptionFeePaymentType;", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SubscriptionFeeRefundedDetails extends Message {

    @JvmField
    public static final ProtoAdapter<SubscriptionFeeRefundedDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "complianceUserMajorOakEmail", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String compliance_user_major_oak_email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "rosetta.midas.v1.SubscriptionFeePaymentType#ADAPTER", jsonName = "paymentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final SubscriptionFeePaymentType payment_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "subscriptionFeeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString subscription_fee_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "subscriptionFeeRefundId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ByteString subscription_fee_refund_id;

    public SubscriptionFeeRefundedDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24722newBuilder();
    }

    public final ByteString getSubscription_fee_id() {
        return this.subscription_fee_id;
    }

    public /* synthetic */ SubscriptionFeeRefundedDetails(ByteString byteString, ByteString byteString2, String str, Instant instant, Money money, String str2, SubscriptionFeePaymentType subscriptionFeePaymentType, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : money, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED : subscriptionFeePaymentType, (i & 128) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final ByteString getSubscription_fee_refund_id() {
        return this.subscription_fee_refund_id;
    }

    public final String getCompliance_user_major_oak_email() {
        return this.compliance_user_major_oak_email;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getState() {
        return this.state;
    }

    public final SubscriptionFeePaymentType getPayment_type() {
        return this.payment_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeeRefundedDetails(ByteString subscription_fee_id, ByteString subscription_fee_refund_id, String compliance_user_major_oak_email, Instant instant, Money money, String state, SubscriptionFeePaymentType payment_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(subscription_fee_refund_id, "subscription_fee_refund_id");
        Intrinsics.checkNotNullParameter(compliance_user_major_oak_email, "compliance_user_major_oak_email");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.subscription_fee_id = subscription_fee_id;
        this.subscription_fee_refund_id = subscription_fee_refund_id;
        this.compliance_user_major_oak_email = compliance_user_major_oak_email;
        this.created_at = instant;
        this.amount = money;
        this.state = state;
        this.payment_type = payment_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24722newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriptionFeeRefundedDetails)) {
            return false;
        }
        SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails = (SubscriptionFeeRefundedDetails) other;
        return Intrinsics.areEqual(unknownFields(), subscriptionFeeRefundedDetails.unknownFields()) && Intrinsics.areEqual(this.subscription_fee_id, subscriptionFeeRefundedDetails.subscription_fee_id) && Intrinsics.areEqual(this.subscription_fee_refund_id, subscriptionFeeRefundedDetails.subscription_fee_refund_id) && Intrinsics.areEqual(this.compliance_user_major_oak_email, subscriptionFeeRefundedDetails.compliance_user_major_oak_email) && Intrinsics.areEqual(this.created_at, subscriptionFeeRefundedDetails.created_at) && Intrinsics.areEqual(this.amount, subscriptionFeeRefundedDetails.amount) && Intrinsics.areEqual(this.state, subscriptionFeeRefundedDetails.state) && this.payment_type == subscriptionFeeRefundedDetails.payment_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.subscription_fee_id.hashCode()) * 37) + this.subscription_fee_refund_id.hashCode()) * 37) + this.compliance_user_major_oak_email.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Money money = this.amount;
        int iHashCode3 = ((((iHashCode2 + (money != null ? money.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.payment_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("subscription_fee_id=" + this.subscription_fee_id);
        arrayList.add("subscription_fee_refund_id=" + this.subscription_fee_refund_id);
        arrayList.add("compliance_user_major_oak_email=" + Internal.sanitize(this.compliance_user_major_oak_email));
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("state=" + Internal.sanitize(this.state));
        arrayList.add("payment_type=" + this.payment_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscriptionFeeRefundedDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubscriptionFeeRefundedDetails copy$default(SubscriptionFeeRefundedDetails subscriptionFeeRefundedDetails, ByteString byteString, ByteString byteString2, String str, Instant instant, Money money, String str2, SubscriptionFeePaymentType subscriptionFeePaymentType, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionFeeRefundedDetails.subscription_fee_id;
        }
        if ((i & 2) != 0) {
            byteString2 = subscriptionFeeRefundedDetails.subscription_fee_refund_id;
        }
        if ((i & 4) != 0) {
            str = subscriptionFeeRefundedDetails.compliance_user_major_oak_email;
        }
        if ((i & 8) != 0) {
            instant = subscriptionFeeRefundedDetails.created_at;
        }
        if ((i & 16) != 0) {
            money = subscriptionFeeRefundedDetails.amount;
        }
        if ((i & 32) != 0) {
            str2 = subscriptionFeeRefundedDetails.state;
        }
        if ((i & 64) != 0) {
            subscriptionFeePaymentType = subscriptionFeeRefundedDetails.payment_type;
        }
        if ((i & 128) != 0) {
            byteString3 = subscriptionFeeRefundedDetails.unknownFields();
        }
        SubscriptionFeePaymentType subscriptionFeePaymentType2 = subscriptionFeePaymentType;
        ByteString byteString4 = byteString3;
        Money money2 = money;
        String str3 = str2;
        return subscriptionFeeRefundedDetails.copy(byteString, byteString2, str, instant, money2, str3, subscriptionFeePaymentType2, byteString4);
    }

    public final SubscriptionFeeRefundedDetails copy(ByteString subscription_fee_id, ByteString subscription_fee_refund_id, String compliance_user_major_oak_email, Instant created_at, Money amount, String state, SubscriptionFeePaymentType payment_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(subscription_fee_refund_id, "subscription_fee_refund_id");
        Intrinsics.checkNotNullParameter(compliance_user_major_oak_email, "compliance_user_major_oak_email");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubscriptionFeeRefundedDetails(subscription_fee_id, subscription_fee_refund_id, compliance_user_major_oak_email, created_at, amount, state, payment_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionFeeRefundedDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubscriptionFeeRefundedDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeRefundedDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubscriptionFeeRefundedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString subscription_fee_id = value.getSubscription_fee_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(subscription_fee_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSubscription_fee_id());
                }
                if (!Intrinsics.areEqual(value.getSubscription_fee_refund_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getSubscription_fee_refund_id());
                }
                if (!Intrinsics.areEqual(value.getCompliance_user_major_oak_email(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCompliance_user_major_oak_email());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getState());
                }
                return value.getPayment_type() != SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED ? size + SubscriptionFeePaymentType.ADAPTER.encodedSizeWithTag(7, value.getPayment_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubscriptionFeeRefundedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString subscription_fee_id = value.getSubscription_fee_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(subscription_fee_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSubscription_fee_id());
                }
                if (!Intrinsics.areEqual(value.getSubscription_fee_refund_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getSubscription_fee_refund_id());
                }
                if (!Intrinsics.areEqual(value.getCompliance_user_major_oak_email(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCompliance_user_major_oak_email());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getState());
                }
                if (value.getPayment_type() != SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED) {
                    SubscriptionFeePaymentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getPayment_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubscriptionFeeRefundedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPayment_type() != SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED) {
                    SubscriptionFeePaymentType.ADAPTER.encodeWithTag(writer, 7, (int) value.getPayment_type());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getState());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getCompliance_user_major_oak_email(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCompliance_user_major_oak_email());
                }
                ByteString subscription_fee_refund_id = value.getSubscription_fee_refund_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(subscription_fee_refund_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getSubscription_fee_refund_id());
                }
                if (Intrinsics.areEqual(value.getSubscription_fee_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSubscription_fee_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeeRefundedDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString = ByteString.EMPTY;
                SubscriptionFeePaymentType subscriptionFeePaymentType = SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                Money moneyDecode = null;
                ByteString byteStringDecode = byteString;
                SubscriptionFeePaymentType subscriptionFeePaymentTypeDecode = subscriptionFeePaymentType;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 2:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    subscriptionFeePaymentTypeDecode = SubscriptionFeePaymentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new SubscriptionFeeRefundedDetails(byteStringDecode2, byteStringDecode, strDecode, instantDecode, moneyDecode, strDecode2, subscriptionFeePaymentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeeRefundedDetails redact(SubscriptionFeeRefundedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Money amount = value.getAmount();
                return SubscriptionFeeRefundedDetails.copy$default(value, null, null, null, instantRedact, amount != null ? Money.ADAPTER.redact(amount) : null, null, null, ByteString.EMPTY, 103, null);
            }
        };
    }
}
