package com.robinhood.rosetta.cashier;

import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.cashier.CheckoutCardDepositDetails;
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

/* compiled from: CheckoutCardDepositDetails.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u0089\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u008f\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b-\u0010!R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\"\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b1\u00100R\"\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "state", "Lcom/robinhood/rosetta/common/Money;", "card_amount", "user_amount", "", "card_number_last_four", "card_nickname", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "pending_id_check_at", "pending_account_approval_at", "completed_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "brokerage_accounting_details", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "Lcom/robinhood/rosetta/common/Money;", "getCard_amount", "()Lcom/robinhood/rosetta/common/Money;", "getUser_amount", "Ljava/lang/String;", "getCard_number_last_four", "getCard_nickname", "Lj$/time/Instant;", "getPending_id_check_at", "()Lj$/time/Instant;", "getPending_account_approval_at", "getCompleted_at", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "Companion", "CheckoutCardDepositState", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CheckoutCardDepositDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CheckoutCardDepositDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.BrokerageAccountingDetails#ADAPTER", jsonName = "brokerageAccountingDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 11)
    private final BrokerageAccountingDetails brokerage_accounting_details;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "cardAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money card_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String card_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNumberLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String card_number_last_four;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "completedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant completed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "pendingAccountApprovalAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant pending_account_approval_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "pendingIdCheckAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant pending_id_check_at;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardDepositDetails$CheckoutCardDepositState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CheckoutCardDepositState state;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "userAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money user_amount;

    public CheckoutCardDepositDetails() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23962newBuilder();
    }

    public final CheckoutCardDepositState getState() {
        return this.state;
    }

    public /* synthetic */ CheckoutCardDepositDetails(CheckoutCardDepositState checkoutCardDepositState, Money money, Money money2, String str, String str2, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED : checkoutCardDepositState, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? null : instant3, (i & 256) != 0 ? null : brokerageAccountingDetails, (i & 512) != 0 ? ByteString.EMPTY : byteString);
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

    public final Instant getPending_id_check_at() {
        return this.pending_id_check_at;
    }

    public final Instant getPending_account_approval_at() {
        return this.pending_account_approval_at;
    }

    public final Instant getCompleted_at() {
        return this.completed_at;
    }

    public final BrokerageAccountingDetails getBrokerage_accounting_details() {
        return this.brokerage_accounting_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardDepositDetails(CheckoutCardDepositState state, Money money, Money money2, String card_number_last_four, String card_nickname, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetails brokerageAccountingDetails, ByteString unknownFields) {
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
        this.pending_id_check_at = instant;
        this.pending_account_approval_at = instant2;
        this.completed_at = instant3;
        this.brokerage_accounting_details = brokerageAccountingDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23962newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CheckoutCardDepositDetails)) {
            return false;
        }
        CheckoutCardDepositDetails checkoutCardDepositDetails = (CheckoutCardDepositDetails) other;
        return Intrinsics.areEqual(unknownFields(), checkoutCardDepositDetails.unknownFields()) && this.state == checkoutCardDepositDetails.state && Intrinsics.areEqual(this.card_amount, checkoutCardDepositDetails.card_amount) && Intrinsics.areEqual(this.user_amount, checkoutCardDepositDetails.user_amount) && Intrinsics.areEqual(this.card_number_last_four, checkoutCardDepositDetails.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, checkoutCardDepositDetails.card_nickname) && Intrinsics.areEqual(this.pending_id_check_at, checkoutCardDepositDetails.pending_id_check_at) && Intrinsics.areEqual(this.pending_account_approval_at, checkoutCardDepositDetails.pending_account_approval_at) && Intrinsics.areEqual(this.completed_at, checkoutCardDepositDetails.completed_at) && Intrinsics.areEqual(this.brokerage_accounting_details, checkoutCardDepositDetails.brokerage_accounting_details);
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
        Instant instant = this.pending_id_check_at;
        int iHashCode4 = (iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.pending_account_approval_at;
        int iHashCode5 = (iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.completed_at;
        int iHashCode6 = (iHashCode5 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        int iHashCode7 = iHashCode6 + (brokerageAccountingDetails != null ? brokerageAccountingDetails.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
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
        Instant instant = this.pending_id_check_at;
        if (instant != null) {
            arrayList.add("pending_id_check_at=" + instant);
        }
        Instant instant2 = this.pending_account_approval_at;
        if (instant2 != null) {
            arrayList.add("pending_account_approval_at=" + instant2);
        }
        Instant instant3 = this.completed_at;
        if (instant3 != null) {
            arrayList.add("completed_at=" + instant3);
        }
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        if (brokerageAccountingDetails != null) {
            arrayList.add("brokerage_accounting_details=" + brokerageAccountingDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutCardDepositDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CheckoutCardDepositDetails copy$default(CheckoutCardDepositDetails checkoutCardDepositDetails, CheckoutCardDepositState checkoutCardDepositState, Money money, Money money2, String str, String str2, Instant instant, Instant instant2, Instant instant3, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardDepositState = checkoutCardDepositDetails.state;
        }
        if ((i & 2) != 0) {
            money = checkoutCardDepositDetails.card_amount;
        }
        if ((i & 4) != 0) {
            money2 = checkoutCardDepositDetails.user_amount;
        }
        if ((i & 8) != 0) {
            str = checkoutCardDepositDetails.card_number_last_four;
        }
        if ((i & 16) != 0) {
            str2 = checkoutCardDepositDetails.card_nickname;
        }
        if ((i & 32) != 0) {
            instant = checkoutCardDepositDetails.pending_id_check_at;
        }
        if ((i & 64) != 0) {
            instant2 = checkoutCardDepositDetails.pending_account_approval_at;
        }
        if ((i & 128) != 0) {
            instant3 = checkoutCardDepositDetails.completed_at;
        }
        if ((i & 256) != 0) {
            brokerageAccountingDetails = checkoutCardDepositDetails.brokerage_accounting_details;
        }
        if ((i & 512) != 0) {
            byteString = checkoutCardDepositDetails.unknownFields();
        }
        BrokerageAccountingDetails brokerageAccountingDetails2 = brokerageAccountingDetails;
        ByteString byteString2 = byteString;
        Instant instant4 = instant2;
        Instant instant5 = instant3;
        String str3 = str2;
        Instant instant6 = instant;
        return checkoutCardDepositDetails.copy(checkoutCardDepositState, money, money2, str, str3, instant6, instant4, instant5, brokerageAccountingDetails2, byteString2);
    }

    public final CheckoutCardDepositDetails copy(CheckoutCardDepositState state, Money card_amount, Money user_amount, String card_number_last_four, String card_nickname, Instant pending_id_check_at, Instant pending_account_approval_at, Instant completed_at, BrokerageAccountingDetails brokerage_accounting_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CheckoutCardDepositDetails(state, card_amount, user_amount, card_number_last_four, card_nickname, pending_id_check_at, pending_account_approval_at, completed_at, brokerage_accounting_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardDepositDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CheckoutCardDepositDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.CheckoutCardDepositDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckoutCardDepositDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != CheckoutCardDepositDetails.CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED) {
                    size += CheckoutCardDepositDetails.CheckoutCardDepositState.ADAPTER.encodedSizeWithTag(1, value.getState());
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
                if (value.getPending_id_check_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getPending_id_check_at());
                }
                if (value.getPending_account_approval_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getPending_account_approval_at());
                }
                if (value.getCompleted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getCompleted_at());
                }
                return value.getBrokerage_accounting_details() != null ? size + BrokerageAccountingDetails.ADAPTER.encodedSizeWithTag(11, value.getBrokerage_accounting_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckoutCardDepositDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != CheckoutCardDepositDetails.CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED) {
                    CheckoutCardDepositDetails.CheckoutCardDepositState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
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
                if (value.getPending_id_check_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getPending_id_check_at());
                }
                if (value.getPending_account_approval_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getPending_account_approval_at());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCompleted_at());
                }
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckoutCardDepositDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCompleted_at());
                }
                if (value.getPending_account_approval_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getPending_account_approval_at());
                }
                if (value.getPending_id_check_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getPending_id_check_at());
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
                if (value.getState() != CheckoutCardDepositDetails.CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED) {
                    CheckoutCardDepositDetails.CheckoutCardDepositState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardDepositDetails decode(ProtoReader reader) throws IOException {
                CheckoutCardDepositDetails.CheckoutCardDepositState checkoutCardDepositState;
                Money money;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CheckoutCardDepositDetails.CheckoutCardDepositState checkoutCardDepositState2 = CheckoutCardDepositDetails.CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                BrokerageAccountingDetails brokerageAccountingDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                CheckoutCardDepositDetails.CheckoutCardDepositState checkoutCardDepositStateDecode = checkoutCardDepositState2;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CheckoutCardDepositDetails(checkoutCardDepositStateDecode, moneyDecode2, moneyDecode, strDecode, strDecode2, instantDecode, instantDecode2, instantDecode3, brokerageAccountingDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 11) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    checkoutCardDepositStateDecode = CheckoutCardDepositDetails.CheckoutCardDepositState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    checkoutCardDepositState = checkoutCardDepositStateDecode;
                                    money = moneyDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 7:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 8:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                checkoutCardDepositState = checkoutCardDepositStateDecode;
                                money = moneyDecode2;
                                break;
                        }
                        moneyDecode2 = money;
                        checkoutCardDepositStateDecode = checkoutCardDepositState;
                    } else {
                        brokerageAccountingDetailsDecode = BrokerageAccountingDetails.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardDepositDetails redact(CheckoutCardDepositDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money card_amount = value.getCard_amount();
                Money moneyRedact = card_amount != null ? Money.ADAPTER.redact(card_amount) : null;
                Money user_amount = value.getUser_amount();
                Money moneyRedact2 = user_amount != null ? Money.ADAPTER.redact(user_amount) : null;
                Instant pending_id_check_at = value.getPending_id_check_at();
                Instant instantRedact = pending_id_check_at != null ? ProtoAdapter.INSTANT.redact(pending_id_check_at) : null;
                Instant pending_account_approval_at = value.getPending_account_approval_at();
                Instant instantRedact2 = pending_account_approval_at != null ? ProtoAdapter.INSTANT.redact(pending_account_approval_at) : null;
                Instant completed_at = value.getCompleted_at();
                Instant instantRedact3 = completed_at != null ? ProtoAdapter.INSTANT.redact(completed_at) : null;
                BrokerageAccountingDetails brokerage_accounting_details = value.getBrokerage_accounting_details();
                return CheckoutCardDepositDetails.copy$default(value, null, moneyRedact, moneyRedact2, null, null, instantRedact, instantRedact2, instantRedact3, brokerage_accounting_details != null ? BrokerageAccountingDetails.ADAPTER.redact(brokerage_accounting_details) : null, ByteString.EMPTY, 25, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardDepositDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED", "NEW", "COMPLETED", "REJECTED", "CANCELED", "AUTHORIZE_PENDING_SCA", "AUTHORIZED", "PENDING_CAPTURE", "CAPTURED", "PENDING_ID_CHECK", "PENDING_ACCOUNT_APPROVAL", "PENDING_ERROR", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckoutCardDepositState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardDepositState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckoutCardDepositState> ADAPTER;
        public static final CheckoutCardDepositState AUTHORIZED;
        public static final CheckoutCardDepositState AUTHORIZE_PENDING_SCA;
        public static final CheckoutCardDepositState CANCELED;
        public static final CheckoutCardDepositState CAPTURED;
        public static final CheckoutCardDepositState CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED;
        public static final CheckoutCardDepositState COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckoutCardDepositState NEW;
        public static final CheckoutCardDepositState PENDING_ACCOUNT_APPROVAL;
        public static final CheckoutCardDepositState PENDING_CAPTURE;
        public static final CheckoutCardDepositState PENDING_ERROR;
        public static final CheckoutCardDepositState PENDING_ID_CHECK;
        public static final CheckoutCardDepositState REJECTED;
        private final int value;

        private static final /* synthetic */ CheckoutCardDepositState[] $values() {
            return new CheckoutCardDepositState[]{CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED, NEW, COMPLETED, REJECTED, CANCELED, AUTHORIZE_PENDING_SCA, AUTHORIZED, PENDING_CAPTURE, CAPTURED, PENDING_ID_CHECK, PENDING_ACCOUNT_APPROVAL, PENDING_ERROR};
        }

        @JvmStatic
        public static final CheckoutCardDepositState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckoutCardDepositState> getEntries() {
            return $ENTRIES;
        }

        private CheckoutCardDepositState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckoutCardDepositState checkoutCardDepositState = new CheckoutCardDepositState("CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED", 0, 0);
            CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED = checkoutCardDepositState;
            NEW = new CheckoutCardDepositState("NEW", 1, 1);
            COMPLETED = new CheckoutCardDepositState("COMPLETED", 2, 2);
            REJECTED = new CheckoutCardDepositState("REJECTED", 3, 3);
            CANCELED = new CheckoutCardDepositState("CANCELED", 4, 4);
            AUTHORIZE_PENDING_SCA = new CheckoutCardDepositState("AUTHORIZE_PENDING_SCA", 5, 5);
            AUTHORIZED = new CheckoutCardDepositState("AUTHORIZED", 6, 6);
            PENDING_CAPTURE = new CheckoutCardDepositState("PENDING_CAPTURE", 7, 7);
            CAPTURED = new CheckoutCardDepositState("CAPTURED", 8, 8);
            PENDING_ID_CHECK = new CheckoutCardDepositState("PENDING_ID_CHECK", 9, 9);
            PENDING_ACCOUNT_APPROVAL = new CheckoutCardDepositState("PENDING_ACCOUNT_APPROVAL", 10, 10);
            PENDING_ERROR = new CheckoutCardDepositState("PENDING_ERROR", 11, 11);
            CheckoutCardDepositState[] checkoutCardDepositStateArr$values = $values();
            $VALUES = checkoutCardDepositStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardDepositStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardDepositState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckoutCardDepositState>(orCreateKotlinClass, syntax, checkoutCardDepositState) { // from class: com.robinhood.rosetta.cashier.CheckoutCardDepositDetails$CheckoutCardDepositState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CheckoutCardDepositDetails.CheckoutCardDepositState fromValue(int value) {
                    return CheckoutCardDepositDetails.CheckoutCardDepositState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CheckoutCardDepositDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails$CheckoutCardDepositState;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckoutCardDepositState fromValue(int value) {
                switch (value) {
                    case 0:
                        return CheckoutCardDepositState.CHECKOUT_CARD_DEPOSIT_STATE_UNSPECIFIED;
                    case 1:
                        return CheckoutCardDepositState.NEW;
                    case 2:
                        return CheckoutCardDepositState.COMPLETED;
                    case 3:
                        return CheckoutCardDepositState.REJECTED;
                    case 4:
                        return CheckoutCardDepositState.CANCELED;
                    case 5:
                        return CheckoutCardDepositState.AUTHORIZE_PENDING_SCA;
                    case 6:
                        return CheckoutCardDepositState.AUTHORIZED;
                    case 7:
                        return CheckoutCardDepositState.PENDING_CAPTURE;
                    case 8:
                        return CheckoutCardDepositState.CAPTURED;
                    case 9:
                        return CheckoutCardDepositState.PENDING_ID_CHECK;
                    case 10:
                        return CheckoutCardDepositState.PENDING_ACCOUNT_APPROVAL;
                    case 11:
                        return CheckoutCardDepositState.PENDING_ERROR;
                    default:
                        return null;
                }
            }
        }

        public static CheckoutCardDepositState valueOf(String str) {
            return (CheckoutCardDepositState) Enum.valueOf(CheckoutCardDepositState.class, str);
        }

        public static CheckoutCardDepositState[] values() {
            return (CheckoutCardDepositState[]) $VALUES.clone();
        }
    }
}
