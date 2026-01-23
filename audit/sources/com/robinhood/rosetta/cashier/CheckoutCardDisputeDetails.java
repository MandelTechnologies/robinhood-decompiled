package com.robinhood.rosetta.cashier;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeDetails;
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

/* compiled from: CheckoutCardDisputeDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\tH\u0016JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;", "Lcom/squareup/wire/Message;", "", "state", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "card_amount", "Lcom/robinhood/rosetta/common/Money;", "user_amount", "card_number_last_four", "", "card_nickname", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lokio/ByteString;)V", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "getCard_amount", "()Lcom/robinhood/rosetta/common/Money;", "getUser_amount", "getCard_number_last_four", "()Ljava/lang/String;", "getCard_nickname", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CheckoutCardDisputeState", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CheckoutCardDisputeDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CheckoutCardDisputeDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.BrokerageAccountingDetails#ADAPTER", jsonName = "brokerageAccountingDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 11)
    private final BrokerageAccountingDetails brokerage_accounting_details;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "cardAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money card_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String card_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardNumberLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String card_number_last_four;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardDisputeDetails$CheckoutCardDisputeState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CheckoutCardDisputeState state;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "userAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money user_amount;

    public CheckoutCardDisputeDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23963newBuilder();
    }

    public final CheckoutCardDisputeState getState() {
        return this.state;
    }

    public /* synthetic */ CheckoutCardDisputeDetails(CheckoutCardDisputeState checkoutCardDisputeState, Money money, Money money2, String str, String str2, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED : checkoutCardDisputeState, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : brokerageAccountingDetails, (i & 64) != 0 ? ByteString.EMPTY : byteString);
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

    public final BrokerageAccountingDetails getBrokerage_accounting_details() {
        return this.brokerage_accounting_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardDisputeDetails(CheckoutCardDisputeState state, Money money, Money money2, String card_number_last_four, String card_nickname, BrokerageAccountingDetails brokerageAccountingDetails, ByteString unknownFields) {
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
        this.brokerage_accounting_details = brokerageAccountingDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23963newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CheckoutCardDisputeDetails)) {
            return false;
        }
        CheckoutCardDisputeDetails checkoutCardDisputeDetails = (CheckoutCardDisputeDetails) other;
        return Intrinsics.areEqual(unknownFields(), checkoutCardDisputeDetails.unknownFields()) && this.state == checkoutCardDisputeDetails.state && Intrinsics.areEqual(this.card_amount, checkoutCardDisputeDetails.card_amount) && Intrinsics.areEqual(this.user_amount, checkoutCardDisputeDetails.user_amount) && Intrinsics.areEqual(this.card_number_last_four, checkoutCardDisputeDetails.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, checkoutCardDisputeDetails.card_nickname) && Intrinsics.areEqual(this.brokerage_accounting_details, checkoutCardDisputeDetails.brokerage_accounting_details);
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
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        int iHashCode4 = iHashCode3 + (brokerageAccountingDetails != null ? brokerageAccountingDetails.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
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
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        if (brokerageAccountingDetails != null) {
            arrayList.add("brokerage_accounting_details=" + brokerageAccountingDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutCardDisputeDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CheckoutCardDisputeDetails copy$default(CheckoutCardDisputeDetails checkoutCardDisputeDetails, CheckoutCardDisputeState checkoutCardDisputeState, Money money, Money money2, String str, String str2, BrokerageAccountingDetails brokerageAccountingDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardDisputeState = checkoutCardDisputeDetails.state;
        }
        if ((i & 2) != 0) {
            money = checkoutCardDisputeDetails.card_amount;
        }
        if ((i & 4) != 0) {
            money2 = checkoutCardDisputeDetails.user_amount;
        }
        if ((i & 8) != 0) {
            str = checkoutCardDisputeDetails.card_number_last_four;
        }
        if ((i & 16) != 0) {
            str2 = checkoutCardDisputeDetails.card_nickname;
        }
        if ((i & 32) != 0) {
            brokerageAccountingDetails = checkoutCardDisputeDetails.brokerage_accounting_details;
        }
        if ((i & 64) != 0) {
            byteString = checkoutCardDisputeDetails.unknownFields();
        }
        BrokerageAccountingDetails brokerageAccountingDetails2 = brokerageAccountingDetails;
        ByteString byteString2 = byteString;
        String str3 = str2;
        Money money3 = money2;
        return checkoutCardDisputeDetails.copy(checkoutCardDisputeState, money, money3, str, str3, brokerageAccountingDetails2, byteString2);
    }

    public final CheckoutCardDisputeDetails copy(CheckoutCardDisputeState state, Money card_amount, Money user_amount, String card_number_last_four, String card_nickname, BrokerageAccountingDetails brokerage_accounting_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CheckoutCardDisputeDetails(state, card_amount, user_amount, card_number_last_four, card_nickname, brokerage_accounting_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardDisputeDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CheckoutCardDisputeDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckoutCardDisputeDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != CheckoutCardDisputeDetails.CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED) {
                    size += CheckoutCardDisputeDetails.CheckoutCardDisputeState.ADAPTER.encodedSizeWithTag(1, value.getState());
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
                return value.getBrokerage_accounting_details() != null ? size + BrokerageAccountingDetails.ADAPTER.encodedSizeWithTag(11, value.getBrokerage_accounting_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckoutCardDisputeDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != CheckoutCardDisputeDetails.CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED) {
                    CheckoutCardDisputeDetails.CheckoutCardDisputeState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
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
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckoutCardDisputeDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
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
                if (value.getState() != CheckoutCardDisputeDetails.CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED) {
                    CheckoutCardDisputeDetails.CheckoutCardDisputeState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardDisputeDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CheckoutCardDisputeDetails.CheckoutCardDisputeState checkoutCardDisputeState = CheckoutCardDisputeDetails.CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                BrokerageAccountingDetails brokerageAccountingDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                CheckoutCardDisputeDetails.CheckoutCardDisputeState checkoutCardDisputeStateDecode = checkoutCardDisputeState;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CheckoutCardDisputeDetails(checkoutCardDisputeStateDecode, moneyDecode2, moneyDecode, strDecode, strDecode2, brokerageAccountingDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            checkoutCardDisputeStateDecode = CheckoutCardDisputeDetails.CheckoutCardDisputeState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 11) {
                        brokerageAccountingDetailsDecode = BrokerageAccountingDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckoutCardDisputeDetails redact(CheckoutCardDisputeDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money card_amount = value.getCard_amount();
                Money moneyRedact = card_amount != null ? Money.ADAPTER.redact(card_amount) : null;
                Money user_amount = value.getUser_amount();
                Money moneyRedact2 = user_amount != null ? Money.ADAPTER.redact(user_amount) : null;
                BrokerageAccountingDetails brokerage_accounting_details = value.getBrokerage_accounting_details();
                return CheckoutCardDisputeDetails.copy$default(value, null, moneyRedact, moneyRedact2, null, null, brokerage_accounting_details != null ? BrokerageAccountingDetails.ADAPTER.redact(brokerage_accounting_details) : null, ByteString.EMPTY, 25, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardDisputeDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED", "RECEIVED", "RESOLVED", "CANCELED", "EXPIRED", "WON", "LOST", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckoutCardDisputeState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardDisputeState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckoutCardDisputeState> ADAPTER;
        public static final CheckoutCardDisputeState CANCELED;
        public static final CheckoutCardDisputeState CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckoutCardDisputeState EXPIRED;
        public static final CheckoutCardDisputeState LOST;
        public static final CheckoutCardDisputeState RECEIVED;
        public static final CheckoutCardDisputeState RESOLVED;
        public static final CheckoutCardDisputeState WON;
        private final int value;

        private static final /* synthetic */ CheckoutCardDisputeState[] $values() {
            return new CheckoutCardDisputeState[]{CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED, RECEIVED, RESOLVED, CANCELED, EXPIRED, WON, LOST};
        }

        @JvmStatic
        public static final CheckoutCardDisputeState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckoutCardDisputeState> getEntries() {
            return $ENTRIES;
        }

        private CheckoutCardDisputeState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckoutCardDisputeState checkoutCardDisputeState = new CheckoutCardDisputeState("CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED", 0, 0);
            CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED = checkoutCardDisputeState;
            RECEIVED = new CheckoutCardDisputeState("RECEIVED", 1, 1);
            RESOLVED = new CheckoutCardDisputeState("RESOLVED", 2, 2);
            CANCELED = new CheckoutCardDisputeState("CANCELED", 3, 3);
            EXPIRED = new CheckoutCardDisputeState("EXPIRED", 4, 4);
            WON = new CheckoutCardDisputeState("WON", 5, 5);
            LOST = new CheckoutCardDisputeState("LOST", 6, 6);
            CheckoutCardDisputeState[] checkoutCardDisputeStateArr$values = $values();
            $VALUES = checkoutCardDisputeStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardDisputeStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckoutCardDisputeState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckoutCardDisputeState>(orCreateKotlinClass, syntax, checkoutCardDisputeState) { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeDetails$CheckoutCardDisputeState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CheckoutCardDisputeDetails.CheckoutCardDisputeState fromValue(int value) {
                    return CheckoutCardDisputeDetails.CheckoutCardDisputeState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CheckoutCardDisputeDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails$CheckoutCardDisputeState;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckoutCardDisputeState fromValue(int value) {
                switch (value) {
                    case 0:
                        return CheckoutCardDisputeState.CHECKOUT_CARD_DISPUTE_STATE_UNSPECIFIED;
                    case 1:
                        return CheckoutCardDisputeState.RECEIVED;
                    case 2:
                        return CheckoutCardDisputeState.RESOLVED;
                    case 3:
                        return CheckoutCardDisputeState.CANCELED;
                    case 4:
                        return CheckoutCardDisputeState.EXPIRED;
                    case 5:
                        return CheckoutCardDisputeState.WON;
                    case 6:
                        return CheckoutCardDisputeState.LOST;
                    default:
                        return null;
                }
            }
        }

        public static CheckoutCardDisputeState valueOf(String str) {
            return (CheckoutCardDisputeState) Enum.valueOf(CheckoutCardDisputeState.class, str);
        }

        public static CheckoutCardDisputeState[] values() {
            return (CheckoutCardDisputeState[]) $VALUES.clone();
        }
    }
}
