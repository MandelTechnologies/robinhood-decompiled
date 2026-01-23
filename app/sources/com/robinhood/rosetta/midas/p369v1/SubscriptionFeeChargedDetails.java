package com.robinhood.rosetta.midas.p369v1;

import com.robinhood.rosetta.common.Date;
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
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: SubscriptionFeeChargedDetails.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0097\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u009d\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b4\u00103R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b5\u00103R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u0010#R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b8\u0010#R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "subscription_id", "subscription_fee_id", "Lcom/robinhood/rosetta/common/Date;", InquiryField.DateField.TYPE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lcom/robinhood/rosetta/common/Money;", "amount", "credit", "carry_forward_credit", "", "state", "reference_id", "Lrosetta/midas/v1/SubscriptionFeePaymentType;", "payment_type", "unknownFields", "<init>", "(Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/Date;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/Date;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentType;Lokio/ByteString;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "Lokio/ByteString;", "getSubscription_id", "()Lokio/ByteString;", "getSubscription_fee_id", "Lcom/robinhood/rosetta/common/Date;", "getDate", "()Lcom/robinhood/rosetta/common/Date;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getCredit", "getCarry_forward_credit", "Ljava/lang/String;", "getState", "getReference_id", "Lrosetta/midas/v1/SubscriptionFeePaymentType;", "getPayment_type", "()Lrosetta/midas/v1/SubscriptionFeePaymentType;", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SubscriptionFeeChargedDetails extends Message {

    @JvmField
    public static final ProtoAdapter<SubscriptionFeeChargedDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "carryForwardCredit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money carry_forward_credit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money credit;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Date date;

    @WireField(adapter = "rosetta.midas.v1.SubscriptionFeePaymentType#ADAPTER", jsonName = "paymentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final SubscriptionFeePaymentType payment_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "referenceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String reference_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "subscriptionFeeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ByteString subscription_fee_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "subscriptionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString subscription_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant updated_at;

    public SubscriptionFeeChargedDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24721newBuilder();
    }

    public final ByteString getSubscription_id() {
        return this.subscription_id;
    }

    public /* synthetic */ SubscriptionFeeChargedDetails(ByteString byteString, ByteString byteString2, Date date, Instant instant, Instant instant2, Money money, Money money2, Money money3, String str, String str2, SubscriptionFeePaymentType subscriptionFeePaymentType, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : money3, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? "" : str2, (i & 1024) != 0 ? SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED : subscriptionFeePaymentType, (i & 2048) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final ByteString getSubscription_fee_id() {
        return this.subscription_fee_id;
    }

    public final Date getDate() {
        return this.date;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Money getCredit() {
        return this.credit;
    }

    public final Money getCarry_forward_credit() {
        return this.carry_forward_credit;
    }

    public final String getState() {
        return this.state;
    }

    public final String getReference_id() {
        return this.reference_id;
    }

    public final SubscriptionFeePaymentType getPayment_type() {
        return this.payment_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeeChargedDetails(ByteString subscription_id, ByteString subscription_fee_id, Date date, Instant instant, Instant instant2, Money money, Money money2, Money money3, String state, String reference_id, SubscriptionFeePaymentType payment_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.subscription_id = subscription_id;
        this.subscription_fee_id = subscription_fee_id;
        this.date = date;
        this.created_at = instant;
        this.updated_at = instant2;
        this.amount = money;
        this.credit = money2;
        this.carry_forward_credit = money3;
        this.state = state;
        this.reference_id = reference_id;
        this.payment_type = payment_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24721newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscriptionFeeChargedDetails)) {
            return false;
        }
        SubscriptionFeeChargedDetails subscriptionFeeChargedDetails = (SubscriptionFeeChargedDetails) other;
        return Intrinsics.areEqual(unknownFields(), subscriptionFeeChargedDetails.unknownFields()) && Intrinsics.areEqual(this.subscription_id, subscriptionFeeChargedDetails.subscription_id) && Intrinsics.areEqual(this.subscription_fee_id, subscriptionFeeChargedDetails.subscription_fee_id) && Intrinsics.areEqual(this.date, subscriptionFeeChargedDetails.date) && Intrinsics.areEqual(this.created_at, subscriptionFeeChargedDetails.created_at) && Intrinsics.areEqual(this.updated_at, subscriptionFeeChargedDetails.updated_at) && Intrinsics.areEqual(this.amount, subscriptionFeeChargedDetails.amount) && Intrinsics.areEqual(this.credit, subscriptionFeeChargedDetails.credit) && Intrinsics.areEqual(this.carry_forward_credit, subscriptionFeeChargedDetails.carry_forward_credit) && Intrinsics.areEqual(this.state, subscriptionFeeChargedDetails.state) && Intrinsics.areEqual(this.reference_id, subscriptionFeeChargedDetails.reference_id) && this.payment_type == subscriptionFeeChargedDetails.payment_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.subscription_id.hashCode()) * 37) + this.subscription_fee_id.hashCode()) * 37;
        Date date = this.date;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int iHashCode5 = (iHashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.credit;
        int iHashCode6 = (iHashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.carry_forward_credit;
        int iHashCode7 = ((((((iHashCode6 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.reference_id.hashCode()) * 37) + this.payment_type.hashCode();
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("subscription_id=" + this.subscription_id);
        arrayList.add("subscription_fee_id=" + this.subscription_fee_id);
        Date date = this.date;
        if (date != null) {
            arrayList.add("date=" + date);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        Money money2 = this.credit;
        if (money2 != null) {
            arrayList.add("credit=" + money2);
        }
        Money money3 = this.carry_forward_credit;
        if (money3 != null) {
            arrayList.add("carry_forward_credit=" + money3);
        }
        arrayList.add("state=" + Internal.sanitize(this.state));
        arrayList.add("reference_id=" + Internal.sanitize(this.reference_id));
        arrayList.add("payment_type=" + this.payment_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscriptionFeeChargedDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubscriptionFeeChargedDetails copy$default(SubscriptionFeeChargedDetails subscriptionFeeChargedDetails, ByteString byteString, ByteString byteString2, Date date, Instant instant, Instant instant2, Money money, Money money2, Money money3, String str, String str2, SubscriptionFeePaymentType subscriptionFeePaymentType, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionFeeChargedDetails.subscription_id;
        }
        if ((i & 2) != 0) {
            byteString2 = subscriptionFeeChargedDetails.subscription_fee_id;
        }
        if ((i & 4) != 0) {
            date = subscriptionFeeChargedDetails.date;
        }
        if ((i & 8) != 0) {
            instant = subscriptionFeeChargedDetails.created_at;
        }
        if ((i & 16) != 0) {
            instant2 = subscriptionFeeChargedDetails.updated_at;
        }
        if ((i & 32) != 0) {
            money = subscriptionFeeChargedDetails.amount;
        }
        if ((i & 64) != 0) {
            money2 = subscriptionFeeChargedDetails.credit;
        }
        if ((i & 128) != 0) {
            money3 = subscriptionFeeChargedDetails.carry_forward_credit;
        }
        if ((i & 256) != 0) {
            str = subscriptionFeeChargedDetails.state;
        }
        if ((i & 512) != 0) {
            str2 = subscriptionFeeChargedDetails.reference_id;
        }
        if ((i & 1024) != 0) {
            subscriptionFeePaymentType = subscriptionFeeChargedDetails.payment_type;
        }
        if ((i & 2048) != 0) {
            byteString3 = subscriptionFeeChargedDetails.unknownFields();
        }
        SubscriptionFeePaymentType subscriptionFeePaymentType2 = subscriptionFeePaymentType;
        ByteString byteString4 = byteString3;
        String str3 = str;
        String str4 = str2;
        Money money4 = money2;
        Money money5 = money3;
        Instant instant3 = instant2;
        Money money6 = money;
        return subscriptionFeeChargedDetails.copy(byteString, byteString2, date, instant, instant3, money6, money4, money5, str3, str4, subscriptionFeePaymentType2, byteString4);
    }

    public final SubscriptionFeeChargedDetails copy(ByteString subscription_id, ByteString subscription_fee_id, Date date, Instant created_at, Instant updated_at, Money amount, Money credit, Money carry_forward_credit, String state, String reference_id, SubscriptionFeePaymentType payment_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubscriptionFeeChargedDetails(subscription_id, subscription_fee_id, date, created_at, updated_at, amount, credit, carry_forward_credit, state, reference_id, payment_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionFeeChargedDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubscriptionFeeChargedDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeChargedDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubscriptionFeeChargedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString subscription_id = value.getSubscription_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(subscription_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSubscription_id());
                }
                if (!Intrinsics.areEqual(value.getSubscription_fee_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getSubscription_fee_id());
                }
                if (value.getDate() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(3, value.getDate());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getUpdated_at());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getAmount());
                }
                if (value.getCredit() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getCredit());
                }
                if (value.getCarry_forward_credit() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(8, value.getCarry_forward_credit());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getState());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getReference_id());
                }
                return value.getPayment_type() != SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED ? size + SubscriptionFeePaymentType.ADAPTER.encodedSizeWithTag(11, value.getPayment_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubscriptionFeeChargedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString subscription_id = value.getSubscription_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(subscription_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSubscription_id());
                }
                if (!Intrinsics.areEqual(value.getSubscription_fee_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getSubscription_fee_id());
                }
                if (value.getDate() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getDate());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getAmount());
                }
                if (value.getCredit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getCredit());
                }
                if (value.getCarry_forward_credit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getCarry_forward_credit());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getReference_id());
                }
                if (value.getPayment_type() != SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED) {
                    SubscriptionFeePaymentType.ADAPTER.encodeWithTag(writer, 11, (int) value.getPayment_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubscriptionFeeChargedDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPayment_type() != SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED) {
                    SubscriptionFeePaymentType.ADAPTER.encodeWithTag(writer, 11, (int) value.getPayment_type());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getReference_id());
                }
                if (!Intrinsics.areEqual(value.getState(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getState());
                }
                if (value.getCarry_forward_credit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getCarry_forward_credit());
                }
                if (value.getCredit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getCredit());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getAmount());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getDate() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getDate());
                }
                ByteString subscription_fee_id = value.getSubscription_fee_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(subscription_fee_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getSubscription_fee_id());
                }
                if (Intrinsics.areEqual(value.getSubscription_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSubscription_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeeChargedDetails decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                ByteString byteString2;
                SubscriptionFeePaymentType subscriptionFeePaymentType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString3 = ByteString.EMPTY;
                SubscriptionFeePaymentType subscriptionFeePaymentType2 = SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                ByteString byteStringDecode = byteString3;
                SubscriptionFeePaymentType subscriptionFeePaymentTypeDecode = subscriptionFeePaymentType2;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 2:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 3:
                                dateDecode = Date.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                try {
                                    subscriptionFeePaymentTypeDecode = SubscriptionFeePaymentType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    byteString = byteStringDecode2;
                                    byteString2 = byteStringDecode;
                                    subscriptionFeePaymentType = subscriptionFeePaymentTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode;
                                subscriptionFeePaymentType = subscriptionFeePaymentTypeDecode;
                                break;
                        }
                        byteStringDecode2 = byteString;
                        byteStringDecode = byteString2;
                        subscriptionFeePaymentTypeDecode = subscriptionFeePaymentType;
                    } else {
                        return new SubscriptionFeeChargedDetails(byteStringDecode2, byteStringDecode, dateDecode, instantDecode, instantDecode2, moneyDecode, moneyDecode2, moneyDecode3, strDecode, strDecode2, subscriptionFeePaymentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubscriptionFeeChargedDetails redact(SubscriptionFeeChargedDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date date = value.getDate();
                Date dateRedact = date != null ? Date.ADAPTER.redact(date) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Money credit = value.getCredit();
                Money moneyRedact2 = credit != null ? Money.ADAPTER.redact(credit) : null;
                Money carry_forward_credit = value.getCarry_forward_credit();
                return SubscriptionFeeChargedDetails.copy$default(value, null, null, dateRedact, instantRedact, instantRedact2, moneyRedact, moneyRedact2, carry_forward_credit != null ? Money.ADAPTER.redact(carry_forward_credit) : null, null, null, null, ByteString.EMPTY, 1795, null);
            }
        };
    }
}
