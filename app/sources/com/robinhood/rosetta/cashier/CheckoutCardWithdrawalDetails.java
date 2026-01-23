package com.robinhood.rosetta.cashier;

import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetails;
import com.robinhood.rosetta.common.Money;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: CheckoutCardWithdrawalDetails.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000223Be\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJk\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001fR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b+\u0010\u001fR\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "state", "Lcom/robinhood/rosetta/common/Money;", "card_amount", "user_amount", "", "card_number_last_four", "card_nickname", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "completed_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "brokerage_accounting_details", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "Lcom/robinhood/rosetta/common/Money;", "getCard_amount", "()Lcom/robinhood/rosetta/common/Money;", "getUser_amount", "Ljava/lang/String;", "getCard_number_last_four", "getCard_nickname", "Lj$/time/Instant;", "getCompleted_at", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "Companion", "CheckoutCardWithdrawalState", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CheckoutCardWithdrawalDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CheckoutCardWithdrawalDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.BrokerageAccountingDetails#ADAPTER", jsonName = "brokerageAccountingDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 11)
    private final BrokerageAccountingDetails brokerage_accounting_details;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "cardAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money card_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String card_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNumberLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String card_number_last_four;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "completedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant completed_at;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CheckoutCardWithdrawalState state;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "userAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money user_amount;

    public CheckoutCardWithdrawalDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23968newBuilder();
    }

    public final CheckoutCardWithdrawalState getState() {
        return this.state;
    }

    public /* synthetic */ CheckoutCardWithdrawalDetails(CheckoutCardWithdrawalState checkoutCardWithdrawalState, Money money, Money money2, String str, String str2, Instant instant, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED : checkoutCardWithdrawalState, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : brokerageAccountingDetails, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getCard_amount() {
        return this.card_amount;
    }

    public final Money getUser_amount() {
        return this.user_amount;
    }

    public final String getCard_number_last_four() {
        return this.card_number_last_four;
    }

    public final String getCard_nickname() {
        return this.card_nickname;
    }

    public final Instant getCompleted_at() {
        return this.completed_at;
    }

    public final BrokerageAccountingDetails getBrokerage_accounting_details() {
        return this.brokerage_accounting_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardWithdrawalDetails(CheckoutCardWithdrawalState state, Money money, Money money2, String card_number_last_four, String card_nickname, Instant instant, BrokerageAccountingDetails brokerageAccountingDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.card_amount = money;
        this.user_amount = money2;
        this.card_number_last_four = card_number_last_four;
        this.card_nickname = card_nickname;
        this.completed_at = instant;
        this.brokerage_accounting_details = brokerageAccountingDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23968newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CheckoutCardWithdrawalDetails)) {
            return false;
        }
        CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails = (CheckoutCardWithdrawalDetails) other;
        return Intrinsics.areEqual(unknownFields(), checkoutCardWithdrawalDetails.unknownFields()) && this.state == checkoutCardWithdrawalDetails.state && Intrinsics.areEqual(this.card_amount, checkoutCardWithdrawalDetails.card_amount) && Intrinsics.areEqual(this.user_amount, checkoutCardWithdrawalDetails.user_amount) && Intrinsics.areEqual(this.card_number_last_four, checkoutCardWithdrawalDetails.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, checkoutCardWithdrawalDetails.card_nickname) && Intrinsics.areEqual(this.completed_at, checkoutCardWithdrawalDetails.completed_at) && Intrinsics.areEqual(this.brokerage_accounting_details, checkoutCardWithdrawalDetails.brokerage_accounting_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37;
        Money money = this.card_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.user_amount;
        int iHashCode3 = (((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.card_number_last_four.hashCode()) * 37) + this.card_nickname.hashCode()) * 37;
        Instant instant = this.completed_at;
        int iHashCode4 = (iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        int iHashCode5 = iHashCode4 + (brokerageAccountingDetails != null ? brokerageAccountingDetails.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        Money money = this.card_amount;
        if (money != null) {
            arrayList.add("card_amount=" + money);
        }
        Money money2 = this.user_amount;
        if (money2 != null) {
            arrayList.add("user_amount=" + money2);
        }
        arrayList.add("card_number_last_four=" + Internal.sanitize(this.card_number_last_four));
        arrayList.add("card_nickname=" + Internal.sanitize(this.card_nickname));
        Instant instant = this.completed_at;
        if (instant != null) {
            arrayList.add("completed_at=" + instant);
        }
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        if (brokerageAccountingDetails != null) {
            arrayList.add("brokerage_accounting_details=" + brokerageAccountingDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutCardWithdrawalDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CheckoutCardWithdrawalDetails copy$default(CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails, CheckoutCardWithdrawalState checkoutCardWithdrawalState, Money money, Money money2, String str, String str2, Instant instant, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardWithdrawalState = checkoutCardWithdrawalDetails.state;
        }
        if ((i & 2) != 0) {
            money = checkoutCardWithdrawalDetails.card_amount;
        }
        if ((i & 4) != 0) {
            money2 = checkoutCardWithdrawalDetails.user_amount;
        }
        if ((i & 8) != 0) {
            str = checkoutCardWithdrawalDetails.card_number_last_four;
        }
        if ((i & 16) != 0) {
            str2 = checkoutCardWithdrawalDetails.card_nickname;
        }
        if ((i & 32) != 0) {
            instant = checkoutCardWithdrawalDetails.completed_at;
        }
        if ((i & 64) != 0) {
            brokerageAccountingDetails = checkoutCardWithdrawalDetails.brokerage_accounting_details;
        }
        if ((i & 128) != 0) {
            byteString = checkoutCardWithdrawalDetails.unknownFields();
        }
        BrokerageAccountingDetails brokerageAccountingDetails2 = brokerageAccountingDetails;
        ByteString byteString2 = byteString;
        String str3 = str2;
        Instant instant2 = instant;
        return checkoutCardWithdrawalDetails.copy(checkoutCardWithdrawalState, money, money2, str, str3, instant2, brokerageAccountingDetails2, byteString2);
    }

    public final CheckoutCardWithdrawalDetails copy(CheckoutCardWithdrawalState state, Money card_amount, Money user_amount, String card_number_last_four, String card_nickname, Instant completed_at, BrokerageAccountingDetails brokerage_accounting_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CheckoutCardWithdrawalDetails(state, card_amount, user_amount, card_number_last_four, card_nickname, completed_at, brokerage_accounting_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardWithdrawalDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CheckoutCardWithdrawalDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckoutCardWithdrawalDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED) {
                    size += CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                if (value.getCard_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getCard_amount());
                }
                if (value.getUser_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getUser_amount());
                }
                if (!Intrinsics.areEqual(value.getCard_number_last_four(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCard_number_last_four());
                }
                if (!Intrinsics.areEqual(value.getCard_nickname(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCard_nickname());
                }
                if (value.getCompleted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getCompleted_at());
                }
                return value.getBrokerage_accounting_details() != null ? size + BrokerageAccountingDetails.ADAPTER.encodedSizeWithTag(11, value.getBrokerage_accounting_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckoutCardWithdrawalDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED) {
                    CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (value.getCard_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getCard_amount());
                }
                if (value.getUser_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getUser_amount());
                }
                if (!Intrinsics.areEqual(value.getCard_number_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCard_number_last_four());
                }
                if (!Intrinsics.areEqual(value.getCard_nickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCard_nickname());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCompleted_at());
                }
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckoutCardWithdrawalDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCompleted_at());
                }
                if (!Intrinsics.areEqual(value.getCard_nickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCard_nickname());
                }
                if (!Intrinsics.areEqual(value.getCard_number_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCard_number_last_four());
                }
                if (value.getUser_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getUser_amount());
                }
                if (value.getCard_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getCard_amount());
                }
                if (value.getState() != CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED) {
                    CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardWithdrawalDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState checkoutCardWithdrawalState = CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Instant instantDecode = null;
                BrokerageAccountingDetails brokerageAccountingDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState checkoutCardWithdrawalStateDecode = checkoutCardWithdrawalState;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CheckoutCardWithdrawalDetails(checkoutCardWithdrawalStateDecode, moneyDecode2, moneyDecode, strDecode, strDecode2, instantDecode, brokerageAccountingDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 11) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    checkoutCardWithdrawalStateDecode = CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        brokerageAccountingDetailsDecode = BrokerageAccountingDetails.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardWithdrawalDetails redact(CheckoutCardWithdrawalDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money card_amount = value.getCard_amount();
                Money moneyRedact = card_amount != null ? Money.ADAPTER.redact(card_amount) : null;
                Money user_amount = value.getUser_amount();
                Money moneyRedact2 = user_amount != null ? Money.ADAPTER.redact(user_amount) : null;
                Instant completed_at = value.getCompleted_at();
                Instant instantRedact = completed_at != null ? ProtoAdapter.INSTANT.redact(completed_at) : null;
                BrokerageAccountingDetails brokerage_accounting_details = value.getBrokerage_accounting_details();
                return CheckoutCardWithdrawalDetails.copy$default(value, null, moneyRedact, moneyRedact2, null, null, instantRedact, brokerage_accounting_details != null ? BrokerageAccountingDetails.ADAPTER.redact(brokerage_accounting_details) : null, ByteString.EMPTY, 25, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardWithdrawalDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED", "NEW", "COMPLETED", "REJECTED", "CASH_HELD", "CARD_AMOUNT_SET", "PENDING_PAYOUT", "PAID_OUT", "PENDING_ERROR", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckoutCardWithdrawalState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardWithdrawalState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckoutCardWithdrawalState> ADAPTER;
        public static final CheckoutCardWithdrawalState CARD_AMOUNT_SET;
        public static final CheckoutCardWithdrawalState CASH_HELD;
        public static final CheckoutCardWithdrawalState CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED;
        public static final CheckoutCardWithdrawalState COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckoutCardWithdrawalState NEW;
        public static final CheckoutCardWithdrawalState PAID_OUT;
        public static final CheckoutCardWithdrawalState PENDING_ERROR;
        public static final CheckoutCardWithdrawalState PENDING_PAYOUT;
        public static final CheckoutCardWithdrawalState REJECTED;
        private final int value;

        private static final /* synthetic */ CheckoutCardWithdrawalState[] $values() {
            return new CheckoutCardWithdrawalState[]{CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED, NEW, COMPLETED, REJECTED, CASH_HELD, CARD_AMOUNT_SET, PENDING_PAYOUT, PAID_OUT, PENDING_ERROR};
        }

        @JvmStatic
        public static final CheckoutCardWithdrawalState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckoutCardWithdrawalState> getEntries() {
            return $ENTRIES;
        }

        private CheckoutCardWithdrawalState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckoutCardWithdrawalState checkoutCardWithdrawalState = new CheckoutCardWithdrawalState("CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED", 0, 0);
            CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED = checkoutCardWithdrawalState;
            NEW = new CheckoutCardWithdrawalState("NEW", 1, 1);
            COMPLETED = new CheckoutCardWithdrawalState("COMPLETED", 2, 2);
            REJECTED = new CheckoutCardWithdrawalState("REJECTED", 3, 3);
            CASH_HELD = new CheckoutCardWithdrawalState("CASH_HELD", 4, 4);
            CARD_AMOUNT_SET = new CheckoutCardWithdrawalState("CARD_AMOUNT_SET", 5, 5);
            PENDING_PAYOUT = new CheckoutCardWithdrawalState("PENDING_PAYOUT", 6, 6);
            PAID_OUT = new CheckoutCardWithdrawalState("PAID_OUT", 7, 7);
            PENDING_ERROR = new CheckoutCardWithdrawalState("PENDING_ERROR", 8, 8);
            CheckoutCardWithdrawalState[] checkoutCardWithdrawalStateArr$values = $values();
            $VALUES = checkoutCardWithdrawalStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardWithdrawalStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardWithdrawalState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckoutCardWithdrawalState>(orCreateKotlinClass, syntax, checkoutCardWithdrawalState) { // from class: com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState fromValue(int value) {
                    return CheckoutCardWithdrawalDetails.CheckoutCardWithdrawalState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CheckoutCardWithdrawalDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails$CheckoutCardWithdrawalState;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckoutCardWithdrawalState fromValue(int value) {
                switch (value) {
                    case 0:
                        return CheckoutCardWithdrawalState.CHECKOUT_CARD_WITHDRAWAL_STATE_UNSPECIFIED;
                    case 1:
                        return CheckoutCardWithdrawalState.NEW;
                    case 2:
                        return CheckoutCardWithdrawalState.COMPLETED;
                    case 3:
                        return CheckoutCardWithdrawalState.REJECTED;
                    case 4:
                        return CheckoutCardWithdrawalState.CASH_HELD;
                    case 5:
                        return CheckoutCardWithdrawalState.CARD_AMOUNT_SET;
                    case 6:
                        return CheckoutCardWithdrawalState.PENDING_PAYOUT;
                    case 7:
                        return CheckoutCardWithdrawalState.PAID_OUT;
                    case 8:
                        return CheckoutCardWithdrawalState.PENDING_ERROR;
                    default:
                        return null;
                }
            }
        }

        public static CheckoutCardWithdrawalState valueOf(String str) {
            return (CheckoutCardWithdrawalState) Enum.valueOf(CheckoutCardWithdrawalState.class, str);
        }

        public static CheckoutCardWithdrawalState[] values() {
            return (CheckoutCardWithdrawalState[]) $VALUES.clone();
        }
    }
}
