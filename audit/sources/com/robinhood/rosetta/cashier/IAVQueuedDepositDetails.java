package com.robinhood.rosetta.cashier;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.cashier.IAVQueuedDepositDetails;
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
import java.util.List;
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

/* compiled from: IAVQueuedDepositDetails.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003,-.Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;", "Lcom/squareup/wire/Message;", "", "user_uuid", "", "bank_account_type", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "bank_routing_number", "hmac_bank_account_number", "account_owner_names", "", "balance_available", "Lcom/robinhood/rosetta/common/Money;", "balance_current", "amount", "state", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;Lokio/ByteString;)V", "getUser_uuid", "()Ljava/lang/String;", "getBank_account_type", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "getBank_routing_number", "getHmac_bank_account_number", "getBalance_available", "()Lcom/robinhood/rosetta/common/Money;", "getBalance_current", "getAmount", "getState", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "getAccount_owner_names", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "BankAccountType", "State", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class IAVQueuedDepositDetails extends Message {

    @JvmField
    public static final ProtoAdapter<IAVQueuedDepositDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountOwnerNames", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> account_owner_names;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "balanceAvailable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money balance_available;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "balanceCurrent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money balance_current;

    @WireField(adapter = "com.robinhood.rosetta.cashier.IAVQueuedDepositDetails$BankAccountType#ADAPTER", jsonName = "bankAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BankAccountType bank_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankRoutingNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bank_routing_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hmacBankAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String hmac_bank_account_number;

    @WireField(adapter = "com.robinhood.rosetta.cashier.IAVQueuedDepositDetails$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final State state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_uuid;

    public IAVQueuedDepositDetails() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ IAVQueuedDepositDetails(String str, BankAccountType bankAccountType, String str2, String str3, List list, Money money, Money money2, Money money3, State state, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED : bankAccountType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : money3, (i & 256) != 0 ? State.TYPE_UNSPECIFIED : state, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23969newBuilder();
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final BankAccountType getBank_account_type() {
        return this.bank_account_type;
    }

    public final String getBank_routing_number() {
        return this.bank_routing_number;
    }

    public final String getHmac_bank_account_number() {
        return this.hmac_bank_account_number;
    }

    public final Money getBalance_available() {
        return this.balance_available;
    }

    public final Money getBalance_current() {
        return this.balance_current;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final State getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAVQueuedDepositDetails(String user_uuid, BankAccountType bank_account_type, String bank_routing_number, String hmac_bank_account_number, List<String> account_owner_names, Money money, Money money2, Money money3, State state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(bank_routing_number, "bank_routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(account_owner_names, "account_owner_names");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_uuid = user_uuid;
        this.bank_account_type = bank_account_type;
        this.bank_routing_number = bank_routing_number;
        this.hmac_bank_account_number = hmac_bank_account_number;
        this.balance_available = money;
        this.balance_current = money2;
        this.amount = money3;
        this.state = state;
        this.account_owner_names = Internal.immutableCopyOf("account_owner_names", account_owner_names);
    }

    public final List<String> getAccount_owner_names() {
        return this.account_owner_names;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23969newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IAVQueuedDepositDetails)) {
            return false;
        }
        IAVQueuedDepositDetails iAVQueuedDepositDetails = (IAVQueuedDepositDetails) other;
        return Intrinsics.areEqual(unknownFields(), iAVQueuedDepositDetails.unknownFields()) && Intrinsics.areEqual(this.user_uuid, iAVQueuedDepositDetails.user_uuid) && this.bank_account_type == iAVQueuedDepositDetails.bank_account_type && Intrinsics.areEqual(this.bank_routing_number, iAVQueuedDepositDetails.bank_routing_number) && Intrinsics.areEqual(this.hmac_bank_account_number, iAVQueuedDepositDetails.hmac_bank_account_number) && Intrinsics.areEqual(this.account_owner_names, iAVQueuedDepositDetails.account_owner_names) && Intrinsics.areEqual(this.balance_available, iAVQueuedDepositDetails.balance_available) && Intrinsics.areEqual(this.balance_current, iAVQueuedDepositDetails.balance_current) && Intrinsics.areEqual(this.amount, iAVQueuedDepositDetails.amount) && this.state == iAVQueuedDepositDetails.state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.user_uuid.hashCode()) * 37) + this.bank_account_type.hashCode()) * 37) + this.bank_routing_number.hashCode()) * 37) + this.hmac_bank_account_number.hashCode()) * 37) + this.account_owner_names.hashCode()) * 37;
        Money money = this.balance_available;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.balance_current;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.amount;
        int iHashCode4 = ((iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.state.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("bank_account_type=" + this.bank_account_type);
        arrayList.add("bank_routing_number=" + Internal.sanitize(this.bank_routing_number));
        arrayList.add("hmac_bank_account_number=" + Internal.sanitize(this.hmac_bank_account_number));
        if (!this.account_owner_names.isEmpty()) {
            arrayList.add("account_owner_names=" + Internal.sanitize(this.account_owner_names));
        }
        Money money = this.balance_available;
        if (money != null) {
            arrayList.add("balance_available=" + money);
        }
        Money money2 = this.balance_current;
        if (money2 != null) {
            arrayList.add("balance_current=" + money2);
        }
        Money money3 = this.amount;
        if (money3 != null) {
            arrayList.add("amount=" + money3);
        }
        arrayList.add("state=" + this.state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IAVQueuedDepositDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IAVQueuedDepositDetails copy$default(IAVQueuedDepositDetails iAVQueuedDepositDetails, String str, BankAccountType bankAccountType, String str2, String str3, List list, Money money, Money money2, Money money3, State state, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iAVQueuedDepositDetails.user_uuid;
        }
        if ((i & 2) != 0) {
            bankAccountType = iAVQueuedDepositDetails.bank_account_type;
        }
        if ((i & 4) != 0) {
            str2 = iAVQueuedDepositDetails.bank_routing_number;
        }
        if ((i & 8) != 0) {
            str3 = iAVQueuedDepositDetails.hmac_bank_account_number;
        }
        if ((i & 16) != 0) {
            list = iAVQueuedDepositDetails.account_owner_names;
        }
        if ((i & 32) != 0) {
            money = iAVQueuedDepositDetails.balance_available;
        }
        if ((i & 64) != 0) {
            money2 = iAVQueuedDepositDetails.balance_current;
        }
        if ((i & 128) != 0) {
            money3 = iAVQueuedDepositDetails.amount;
        }
        if ((i & 256) != 0) {
            state = iAVQueuedDepositDetails.state;
        }
        if ((i & 512) != 0) {
            byteString = iAVQueuedDepositDetails.unknownFields();
        }
        State state2 = state;
        ByteString byteString2 = byteString;
        Money money4 = money2;
        Money money5 = money3;
        List list2 = list;
        Money money6 = money;
        return iAVQueuedDepositDetails.copy(str, bankAccountType, str2, str3, list2, money6, money4, money5, state2, byteString2);
    }

    public final IAVQueuedDepositDetails copy(String user_uuid, BankAccountType bank_account_type, String bank_routing_number, String hmac_bank_account_number, List<String> account_owner_names, Money balance_available, Money balance_current, Money amount, State state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(bank_routing_number, "bank_routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(account_owner_names, "account_owner_names");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IAVQueuedDepositDetails(user_uuid, bank_account_type, bank_routing_number, hmac_bank_account_number, account_owner_names, balance_available, balance_current, amount, state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IAVQueuedDepositDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IAVQueuedDepositDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IAVQueuedDepositDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_uuid());
                }
                if (value.getBank_account_type() != IAVQueuedDepositDetails.BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += IAVQueuedDepositDetails.BankAccountType.ADAPTER.encodedSizeWithTag(2, value.getBank_account_type());
                }
                if (!Intrinsics.areEqual(value.getBank_routing_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBank_routing_number());
                }
                if (!Intrinsics.areEqual(value.getHmac_bank_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getHmac_bank_account_number());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.getAccount_owner_names());
                if (value.getBalance_available() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(6, value.getBalance_available());
                }
                if (value.getBalance_current() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(7, value.getBalance_current());
                }
                if (value.getAmount() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(8, value.getAmount());
                }
                return value.getState() != IAVQueuedDepositDetails.State.TYPE_UNSPECIFIED ? iEncodedSizeWithTag + IAVQueuedDepositDetails.State.ADAPTER.encodedSizeWithTag(9, value.getState()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IAVQueuedDepositDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
                }
                if (value.getBank_account_type() != IAVQueuedDepositDetails.BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED) {
                    IAVQueuedDepositDetails.BankAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBank_account_type());
                }
                if (!Intrinsics.areEqual(value.getBank_routing_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBank_routing_number());
                }
                if (!Intrinsics.areEqual(value.getHmac_bank_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getHmac_bank_account_number());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, (int) value.getAccount_owner_names());
                if (value.getBalance_available() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getBalance_available());
                }
                if (value.getBalance_current() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getBalance_current());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getAmount());
                }
                if (value.getState() != IAVQueuedDepositDetails.State.TYPE_UNSPECIFIED) {
                    IAVQueuedDepositDetails.State.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IAVQueuedDepositDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getState() != IAVQueuedDepositDetails.State.TYPE_UNSPECIFIED) {
                    IAVQueuedDepositDetails.State.ADAPTER.encodeWithTag(writer, 9, (int) value.getState());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getAmount());
                }
                if (value.getBalance_current() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getBalance_current());
                }
                if (value.getBalance_available() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getBalance_available());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAccount_owner_names());
                if (!Intrinsics.areEqual(value.getHmac_bank_account_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getHmac_bank_account_number());
                }
                if (!Intrinsics.areEqual(value.getBank_routing_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getBank_routing_number());
                }
                if (value.getBank_account_type() != IAVQueuedDepositDetails.BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED) {
                    IAVQueuedDepositDetails.BankAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBank_account_type());
                }
                if (Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUser_uuid());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IAVQueuedDepositDetails decode(ProtoReader reader) throws IOException {
                String str;
                String strDecode;
                ArrayList arrayList;
                IAVQueuedDepositDetails.State state;
                Intrinsics.checkNotNullParameter(reader, "reader");
                IAVQueuedDepositDetails.BankAccountType bankAccountType = IAVQueuedDepositDetails.BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                IAVQueuedDepositDetails.State state2 = IAVQueuedDepositDetails.State.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String str2 = "";
                String strDecode2 = str2;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                IAVQueuedDepositDetails.State stateDecode = state2;
                String strDecode3 = strDecode2;
                IAVQueuedDepositDetails.BankAccountType bankAccountTypeDecode = bankAccountType;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = str2;
                                arrayList = arrayList2;
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                str = strDecode3;
                                strDecode = str2;
                                try {
                                    bankAccountTypeDecode = IAVQueuedDepositDetails.BankAccountType.ADAPTER.decode(reader);
                                    arrayList = arrayList2;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    state = stateDecode;
                                    arrayList = arrayList2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode3 = str;
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                arrayList = arrayList2;
                                break;
                            case 4:
                                strDecode = str2;
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                arrayList = arrayList2;
                                break;
                            case 5:
                                str = strDecode3;
                                strDecode = str2;
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                state = stateDecode;
                                arrayList = arrayList2;
                                stateDecode = state;
                                strDecode3 = str;
                                break;
                            case 6:
                                strDecode = str2;
                                moneyDecode = Money.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                                break;
                            case 7:
                                strDecode = str2;
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                                break;
                            case 8:
                                strDecode = str2;
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                                break;
                            case 9:
                                try {
                                    stateDecode = IAVQueuedDepositDetails.State.ADAPTER.decode(reader);
                                    strDecode = str2;
                                    arrayList = arrayList2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    str = strDecode3;
                                    strDecode = str2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                state = stateDecode;
                                str = strDecode3;
                                strDecode = str2;
                                arrayList = arrayList2;
                                stateDecode = state;
                                strDecode3 = str;
                                break;
                        }
                        arrayList2 = arrayList;
                        str2 = strDecode;
                    } else {
                        return new IAVQueuedDepositDetails(strDecode3, bankAccountTypeDecode, str2, strDecode2, arrayList2, moneyDecode, moneyDecode2, moneyDecode3, stateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IAVQueuedDepositDetails redact(IAVQueuedDepositDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money balance_available = value.getBalance_available();
                Money moneyRedact = balance_available != null ? Money.ADAPTER.redact(balance_available) : null;
                Money balance_current = value.getBalance_current();
                Money moneyRedact2 = balance_current != null ? Money.ADAPTER.redact(balance_current) : null;
                Money amount = value.getAmount();
                return IAVQueuedDepositDetails.copy$default(value, null, null, null, null, null, moneyRedact, moneyRedact2, amount != null ? Money.ADAPTER.redact(amount) : null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IAVQueuedDepositDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BANK_ACCOUNT_TYPE_UNSPECIFIED", "CHECKING", "SAVINGS", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BankAccountType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BankAccountType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<BankAccountType> ADAPTER;
        public static final BankAccountType BANK_ACCOUNT_TYPE_UNSPECIFIED;
        public static final BankAccountType CHECKING;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final BankAccountType SAVINGS;
        private final int value;

        private static final /* synthetic */ BankAccountType[] $values() {
            return new BankAccountType[]{BANK_ACCOUNT_TYPE_UNSPECIFIED, CHECKING, SAVINGS};
        }

        @JvmStatic
        public static final BankAccountType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<BankAccountType> getEntries() {
            return $ENTRIES;
        }

        private BankAccountType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final BankAccountType bankAccountType = new BankAccountType("BANK_ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
            BANK_ACCOUNT_TYPE_UNSPECIFIED = bankAccountType;
            CHECKING = new BankAccountType("CHECKING", 1, 1);
            SAVINGS = new BankAccountType("SAVINGS", 2, 2);
            BankAccountType[] bankAccountTypeArr$values = $values();
            $VALUES = bankAccountTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(bankAccountTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BankAccountType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<BankAccountType>(orCreateKotlinClass, syntax, bankAccountType) { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetails$BankAccountType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public IAVQueuedDepositDetails.BankAccountType fromValue(int value) {
                    return IAVQueuedDepositDetails.BankAccountType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: IAVQueuedDepositDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$BankAccountType;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final BankAccountType fromValue(int value) {
                if (value == 0) {
                    return BankAccountType.BANK_ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return BankAccountType.CHECKING;
                }
                if (value != 2) {
                    return null;
                }
                return BankAccountType.SAVINGS;
            }
        }

        public static BankAccountType valueOf(String str) {
            return (BankAccountType) Enum.valueOf(BankAccountType.class, str);
        }

        public static BankAccountType[] values() {
            return (BankAccountType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IAVQueuedDepositDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "CREATED", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;
        public static final State CREATED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{TYPE_UNSPECIFIED, CREATED};
        }

        @JvmStatic
        public static final State fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final State state = new State("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = state;
            CREATED = new State("CREATED", 1, 1);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: com.robinhood.rosetta.cashier.IAVQueuedDepositDetails$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public IAVQueuedDepositDetails.State fromValue(int value) {
                    return IAVQueuedDepositDetails.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: IAVQueuedDepositDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails$State;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                if (value == 0) {
                    return State.TYPE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return State.CREATED;
            }
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }
}
