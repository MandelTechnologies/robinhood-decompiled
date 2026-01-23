package com.robinhood.rosetta.cashier;

import com.robinhood.rosetta.cashier.ACHRelationshipDetails;
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

/* compiled from: ACHRelationshipDetails.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005BCDEFB\u0095\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u009b\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010&R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010:R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b?\u0010&R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b@\u0010&R\u001a\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\bA\u0010&¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "Lcom/squareup/wire/Message;", "", "", "routing_number", "hmac_bank_account_number", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "bank_account_type", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "state", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "verification_method", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/rosetta/common/Money;", "current_balance", "available_balance", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "source_type", "bank_account_holder_name", "bank_name", "bank_account_number_last_four", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "Ljava/lang/String;", "getRouting_number", "getHmac_bank_account_number", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "getBank_account_type", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "getState", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "getVerification_method", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/common/Money;", "getCurrent_balance", "()Lcom/robinhood/rosetta/common/Money;", "getAvailable_balance", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "getSource_type", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "getBank_account_holder_name", "getBank_name", "getBank_account_number_last_four", "Companion", "State", "VerificationMethod", "AccountType", "SourceType", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ACHRelationshipDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ACHRelationshipDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "availableBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money available_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountHolderName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String bank_account_holder_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountNumberLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String bank_account_number_last_four;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHRelationshipDetails$AccountType#ADAPTER", jsonName = "bankAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountType bank_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String bank_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant created_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "currentBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money current_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hmacBankAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String hmac_bank_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routingNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String routing_number;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHRelationshipDetails$SourceType#ADAPTER", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final SourceType source_type;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHRelationshipDetails$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final State state;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHRelationshipDetails$VerificationMethod#ADAPTER", jsonName = "verificationMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final VerificationMethod verification_method;

    public ACHRelationshipDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ ACHRelationshipDetails(String str, String str2, AccountType accountType, State state, VerificationMethod verificationMethod, Instant instant, Money money, Money money2, SourceType sourceType, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 8) != 0 ? State.STATE_UNSPECIFIED : state, (i & 16) != 0 ? VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED : verificationMethod, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : money, (i & 128) == 0 ? money2 : null, (i & 256) != 0 ? SourceType.SOURCE_TYPE_UNSPECIFIED : sourceType, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) == 0 ? str5 : "", (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23955newBuilder();
    }

    public final String getRouting_number() {
        return this.routing_number;
    }

    public final String getHmac_bank_account_number() {
        return this.hmac_bank_account_number;
    }

    public final AccountType getBank_account_type() {
        return this.bank_account_type;
    }

    public final State getState() {
        return this.state;
    }

    public final VerificationMethod getVerification_method() {
        return this.verification_method;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Money getCurrent_balance() {
        return this.current_balance;
    }

    public final Money getAvailable_balance() {
        return this.available_balance;
    }

    public final SourceType getSource_type() {
        return this.source_type;
    }

    public final String getBank_account_holder_name() {
        return this.bank_account_holder_name;
    }

    public final String getBank_name() {
        return this.bank_name;
    }

    public final String getBank_account_number_last_four() {
        return this.bank_account_number_last_four;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACHRelationshipDetails(String routing_number, String hmac_bank_account_number, AccountType bank_account_type, State state, VerificationMethod verification_method, Instant instant, Money money, Money money2, SourceType source_type, String bank_account_holder_name, String bank_name, String bank_account_number_last_four, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(verification_method, "verification_method");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(bank_account_holder_name, "bank_account_holder_name");
        Intrinsics.checkNotNullParameter(bank_name, "bank_name");
        Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.routing_number = routing_number;
        this.hmac_bank_account_number = hmac_bank_account_number;
        this.bank_account_type = bank_account_type;
        this.state = state;
        this.verification_method = verification_method;
        this.created_at = instant;
        this.current_balance = money;
        this.available_balance = money2;
        this.source_type = source_type;
        this.bank_account_holder_name = bank_account_holder_name;
        this.bank_name = bank_name;
        this.bank_account_number_last_four = bank_account_number_last_four;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23955newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ACHRelationshipDetails)) {
            return false;
        }
        ACHRelationshipDetails aCHRelationshipDetails = (ACHRelationshipDetails) other;
        return Intrinsics.areEqual(unknownFields(), aCHRelationshipDetails.unknownFields()) && Intrinsics.areEqual(this.routing_number, aCHRelationshipDetails.routing_number) && Intrinsics.areEqual(this.hmac_bank_account_number, aCHRelationshipDetails.hmac_bank_account_number) && this.bank_account_type == aCHRelationshipDetails.bank_account_type && this.state == aCHRelationshipDetails.state && this.verification_method == aCHRelationshipDetails.verification_method && Intrinsics.areEqual(this.created_at, aCHRelationshipDetails.created_at) && Intrinsics.areEqual(this.current_balance, aCHRelationshipDetails.current_balance) && Intrinsics.areEqual(this.available_balance, aCHRelationshipDetails.available_balance) && this.source_type == aCHRelationshipDetails.source_type && Intrinsics.areEqual(this.bank_account_holder_name, aCHRelationshipDetails.bank_account_holder_name) && Intrinsics.areEqual(this.bank_name, aCHRelationshipDetails.bank_name) && Intrinsics.areEqual(this.bank_account_number_last_four, aCHRelationshipDetails.bank_account_number_last_four);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.routing_number.hashCode()) * 37) + this.hmac_bank_account_number.hashCode()) * 37) + this.bank_account_type.hashCode()) * 37) + this.state.hashCode()) * 37) + this.verification_method.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Money money = this.current_balance;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.available_balance;
        int iHashCode4 = ((((((((iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.source_type.hashCode()) * 37) + this.bank_account_holder_name.hashCode()) * 37) + this.bank_name.hashCode()) * 37) + this.bank_account_number_last_four.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("routing_number=" + Internal.sanitize(this.routing_number));
        arrayList.add("hmac_bank_account_number=" + Internal.sanitize(this.hmac_bank_account_number));
        arrayList.add("bank_account_type=" + this.bank_account_type);
        arrayList.add("state=" + this.state);
        arrayList.add("verification_method=" + this.verification_method);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Money money = this.current_balance;
        if (money != null) {
            arrayList.add("current_balance=" + money);
        }
        Money money2 = this.available_balance;
        if (money2 != null) {
            arrayList.add("available_balance=" + money2);
        }
        arrayList.add("source_type=" + this.source_type);
        arrayList.add("bank_account_holder_name=" + Internal.sanitize(this.bank_account_holder_name));
        arrayList.add("bank_name=" + Internal.sanitize(this.bank_name));
        arrayList.add("bank_account_number_last_four=" + Internal.sanitize(this.bank_account_number_last_four));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ACHRelationshipDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ACHRelationshipDetails copy$default(ACHRelationshipDetails aCHRelationshipDetails, String str, String str2, AccountType accountType, State state, VerificationMethod verificationMethod, Instant instant, Money money, Money money2, SourceType sourceType, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aCHRelationshipDetails.routing_number;
        }
        return aCHRelationshipDetails.copy(str, (i & 2) != 0 ? aCHRelationshipDetails.hmac_bank_account_number : str2, (i & 4) != 0 ? aCHRelationshipDetails.bank_account_type : accountType, (i & 8) != 0 ? aCHRelationshipDetails.state : state, (i & 16) != 0 ? aCHRelationshipDetails.verification_method : verificationMethod, (i & 32) != 0 ? aCHRelationshipDetails.created_at : instant, (i & 64) != 0 ? aCHRelationshipDetails.current_balance : money, (i & 128) != 0 ? aCHRelationshipDetails.available_balance : money2, (i & 256) != 0 ? aCHRelationshipDetails.source_type : sourceType, (i & 512) != 0 ? aCHRelationshipDetails.bank_account_holder_name : str3, (i & 1024) != 0 ? aCHRelationshipDetails.bank_name : str4, (i & 2048) != 0 ? aCHRelationshipDetails.bank_account_number_last_four : str5, (i & 4096) != 0 ? aCHRelationshipDetails.unknownFields() : byteString);
    }

    public final ACHRelationshipDetails copy(String routing_number, String hmac_bank_account_number, AccountType bank_account_type, State state, VerificationMethod verification_method, Instant created_at, Money current_balance, Money available_balance, SourceType source_type, String bank_account_holder_name, String bank_name, String bank_account_number_last_four, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(hmac_bank_account_number, "hmac_bank_account_number");
        Intrinsics.checkNotNullParameter(bank_account_type, "bank_account_type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(verification_method, "verification_method");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(bank_account_holder_name, "bank_account_holder_name");
        Intrinsics.checkNotNullParameter(bank_name, "bank_name");
        Intrinsics.checkNotNullParameter(bank_account_number_last_four, "bank_account_number_last_four");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ACHRelationshipDetails(routing_number, hmac_bank_account_number, bank_account_type, state, verification_method, created_at, current_balance, available_balance, source_type, bank_account_holder_name, bank_name, bank_account_number_last_four, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ACHRelationshipDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ACHRelationshipDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ACHRelationshipDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRouting_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRouting_number());
                }
                if (!Intrinsics.areEqual(value.getHmac_bank_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHmac_bank_account_number());
                }
                if (value.getBank_account_type() != ACHRelationshipDetails.AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += ACHRelationshipDetails.AccountType.ADAPTER.encodedSizeWithTag(3, value.getBank_account_type());
                }
                if (value.getState() != ACHRelationshipDetails.State.STATE_UNSPECIFIED) {
                    size += ACHRelationshipDetails.State.ADAPTER.encodedSizeWithTag(4, value.getState());
                }
                if (value.getVerification_method() != ACHRelationshipDetails.VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED) {
                    size += ACHRelationshipDetails.VerificationMethod.ADAPTER.encodedSizeWithTag(5, value.getVerification_method());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getCreated_at());
                }
                if (value.getCurrent_balance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getCurrent_balance());
                }
                if (value.getAvailable_balance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(8, value.getAvailable_balance());
                }
                if (value.getSource_type() != ACHRelationshipDetails.SourceType.SOURCE_TYPE_UNSPECIFIED) {
                    size += ACHRelationshipDetails.SourceType.ADAPTER.encodedSizeWithTag(9, value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getBank_account_holder_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getBank_account_holder_name());
                }
                if (!Intrinsics.areEqual(value.getBank_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getBank_name());
                }
                return !Intrinsics.areEqual(value.getBank_account_number_last_four(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(12, value.getBank_account_number_last_four()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ACHRelationshipDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRouting_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRouting_number());
                }
                if (!Intrinsics.areEqual(value.getHmac_bank_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHmac_bank_account_number());
                }
                if (value.getBank_account_type() != ACHRelationshipDetails.AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    ACHRelationshipDetails.AccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getBank_account_type());
                }
                if (value.getState() != ACHRelationshipDetails.State.STATE_UNSPECIFIED) {
                    ACHRelationshipDetails.State.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getVerification_method() != ACHRelationshipDetails.VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED) {
                    ACHRelationshipDetails.VerificationMethod.ADAPTER.encodeWithTag(writer, 5, (int) value.getVerification_method());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (value.getCurrent_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getCurrent_balance());
                }
                if (value.getAvailable_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getAvailable_balance());
                }
                if (value.getSource_type() != ACHRelationshipDetails.SourceType.SOURCE_TYPE_UNSPECIFIED) {
                    ACHRelationshipDetails.SourceType.ADAPTER.encodeWithTag(writer, 9, (int) value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getBank_account_holder_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getBank_account_holder_name());
                }
                if (!Intrinsics.areEqual(value.getBank_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getBank_name());
                }
                if (!Intrinsics.areEqual(value.getBank_account_number_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getBank_account_number_last_four());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ACHRelationshipDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getBank_account_number_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getBank_account_number_last_four());
                }
                if (!Intrinsics.areEqual(value.getBank_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getBank_name());
                }
                if (!Intrinsics.areEqual(value.getBank_account_holder_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getBank_account_holder_name());
                }
                if (value.getSource_type() != ACHRelationshipDetails.SourceType.SOURCE_TYPE_UNSPECIFIED) {
                    ACHRelationshipDetails.SourceType.ADAPTER.encodeWithTag(writer, 9, (int) value.getSource_type());
                }
                if (value.getAvailable_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getAvailable_balance());
                }
                if (value.getCurrent_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getCurrent_balance());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (value.getVerification_method() != ACHRelationshipDetails.VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED) {
                    ACHRelationshipDetails.VerificationMethod.ADAPTER.encodeWithTag(writer, 5, (int) value.getVerification_method());
                }
                if (value.getState() != ACHRelationshipDetails.State.STATE_UNSPECIFIED) {
                    ACHRelationshipDetails.State.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getBank_account_type() != ACHRelationshipDetails.AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    ACHRelationshipDetails.AccountType.ADAPTER.encodeWithTag(writer, 3, (int) value.getBank_account_type());
                }
                if (!Intrinsics.areEqual(value.getHmac_bank_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHmac_bank_account_number());
                }
                if (Intrinsics.areEqual(value.getRouting_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRouting_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ACHRelationshipDetails decode(ProtoReader reader) throws IOException {
                ACHRelationshipDetails.State state;
                ACHRelationshipDetails.SourceType sourceType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ACHRelationshipDetails.AccountType accountType = ACHRelationshipDetails.AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                ACHRelationshipDetails.State state2 = ACHRelationshipDetails.State.STATE_UNSPECIFIED;
                ACHRelationshipDetails.VerificationMethod verificationMethod = ACHRelationshipDetails.VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED;
                ACHRelationshipDetails.SourceType sourceType2 = ACHRelationshipDetails.SourceType.SOURCE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ACHRelationshipDetails.AccountType accountTypeDecode = accountType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Instant instantDecode = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                ACHRelationshipDetails.SourceType sourceTypeDecode = sourceType2;
                String strDecode5 = strDecode4;
                ACHRelationshipDetails.VerificationMethod verificationMethodDecode = verificationMethod;
                ACHRelationshipDetails.State stateDecode = state2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                state = stateDecode;
                                sourceType = sourceTypeDecode;
                                str = strDecode5;
                                try {
                                    accountTypeDecode = ACHRelationshipDetails.AccountType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                stateDecode = state;
                                strDecode5 = str;
                                sourceTypeDecode = sourceType;
                                break;
                            case 4:
                                state = stateDecode;
                                sourceType = sourceTypeDecode;
                                str = strDecode5;
                                try {
                                    stateDecode = ACHRelationshipDetails.State.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode5 = str;
                                sourceTypeDecode = sourceType;
                                break;
                            case 5:
                                state = stateDecode;
                                sourceType = sourceTypeDecode;
                                str = strDecode5;
                                try {
                                    verificationMethodDecode = ACHRelationshipDetails.VerificationMethod.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                stateDecode = state;
                                strDecode5 = str;
                                sourceTypeDecode = sourceType;
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 9:
                                try {
                                    sourceTypeDecode = ACHRelationshipDetails.SourceType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    state = stateDecode;
                                    sourceType = sourceTypeDecode;
                                    str = strDecode5;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                state = stateDecode;
                                sourceType = sourceTypeDecode;
                                str = strDecode5;
                                stateDecode = state;
                                strDecode5 = str;
                                sourceTypeDecode = sourceType;
                                break;
                        }
                    } else {
                        return new ACHRelationshipDetails(strDecode5, strDecode, accountTypeDecode, stateDecode, verificationMethodDecode, instantDecode, moneyDecode, moneyDecode2, sourceTypeDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ACHRelationshipDetails redact(ACHRelationshipDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Money current_balance = value.getCurrent_balance();
                Money moneyRedact = current_balance != null ? Money.ADAPTER.redact(current_balance) : null;
                Money available_balance = value.getAvailable_balance();
                return ACHRelationshipDetails.copy$default(value, null, null, null, null, null, instantRedact, moneyRedact, available_balance != null ? Money.ADAPTER.redact(available_balance) : null, null, null, null, null, ByteString.EMPTY, 3871, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "PENDING", "VERIFIED", "UNLINKED", "NEEDS_APPROVAL", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State NEEDS_APPROVAL;
        public static final State PENDING;
        public static final State STATE_UNSPECIFIED;
        public static final State UNLINKED;
        public static final State VERIFIED;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_UNSPECIFIED, PENDING, VERIFIED, UNLINKED, NEEDS_APPROVAL};
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
            final State state = new State("STATE_UNSPECIFIED", 0, 0);
            STATE_UNSPECIFIED = state;
            PENDING = new State("PENDING", 1, 1);
            VERIFIED = new State("VERIFIED", 2, 2);
            UNLINKED = new State("UNLINKED", 3, 3);
            NEEDS_APPROVAL = new State("NEEDS_APPROVAL", 4, 4);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetails$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHRelationshipDetails.State fromValue(int value) {
                    return ACHRelationshipDetails.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHRelationshipDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$State;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                if (value == 0) {
                    return State.STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return State.PENDING;
                }
                if (value == 2) {
                    return State.VERIFIED;
                }
                if (value == 3) {
                    return State.UNLINKED;
                }
                if (value != 4) {
                    return null;
                }
                return State.NEEDS_APPROVAL;
            }
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VERIFICATION_METHOD_UNSPECIFIED", "MICRODEPOSITS", "IAV", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VerificationMethod implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VerificationMethod[] $VALUES;

        @JvmField
        public static final ProtoAdapter<VerificationMethod> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final VerificationMethod IAV;
        public static final VerificationMethod MICRODEPOSITS;
        public static final VerificationMethod VERIFICATION_METHOD_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ VerificationMethod[] $values() {
            return new VerificationMethod[]{VERIFICATION_METHOD_UNSPECIFIED, MICRODEPOSITS, IAV};
        }

        @JvmStatic
        public static final VerificationMethod fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<VerificationMethod> getEntries() {
            return $ENTRIES;
        }

        private VerificationMethod(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final VerificationMethod verificationMethod = new VerificationMethod("VERIFICATION_METHOD_UNSPECIFIED", 0, 0);
            VERIFICATION_METHOD_UNSPECIFIED = verificationMethod;
            MICRODEPOSITS = new VerificationMethod("MICRODEPOSITS", 1, 1);
            IAV = new VerificationMethod("IAV", 2, 2);
            VerificationMethod[] verificationMethodArr$values = $values();
            $VALUES = verificationMethodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(verificationMethodArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(VerificationMethod.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<VerificationMethod>(orCreateKotlinClass, syntax, verificationMethod) { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetails$VerificationMethod$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHRelationshipDetails.VerificationMethod fromValue(int value) {
                    return ACHRelationshipDetails.VerificationMethod.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHRelationshipDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$VerificationMethod;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final VerificationMethod fromValue(int value) {
                if (value == 0) {
                    return VerificationMethod.VERIFICATION_METHOD_UNSPECIFIED;
                }
                if (value == 1) {
                    return VerificationMethod.MICRODEPOSITS;
                }
                if (value != 2) {
                    return null;
                }
                return VerificationMethod.IAV;
            }
        }

        public static VerificationMethod valueOf(String str) {
            return (VerificationMethod) Enum.valueOf(VerificationMethod.class, str);
        }

        public static VerificationMethod[] values() {
            return (VerificationMethod[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "CHECKING", "SAVINGS", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountType[] $VALUES;
        public static final AccountType ACCOUNT_TYPE_UNSPECIFIED;

        @JvmField
        public static final ProtoAdapter<AccountType> ADAPTER;
        public static final AccountType CHECKING;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccountType SAVINGS;
        private final int value;

        private static final /* synthetic */ AccountType[] $values() {
            return new AccountType[]{ACCOUNT_TYPE_UNSPECIFIED, CHECKING, SAVINGS};
        }

        @JvmStatic
        public static final AccountType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AccountType> getEntries() {
            return $ENTRIES;
        }

        private AccountType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AccountType accountType = new AccountType("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
            ACCOUNT_TYPE_UNSPECIFIED = accountType;
            CHECKING = new AccountType("CHECKING", 1, 1);
            SAVINGS = new AccountType("SAVINGS", 2, 2);
            AccountType[] accountTypeArr$values = $values();
            $VALUES = accountTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accountTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AccountType>(orCreateKotlinClass, syntax, accountType) { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetails$AccountType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHRelationshipDetails.AccountType fromValue(int value) {
                    return ACHRelationshipDetails.AccountType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHRelationshipDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$AccountType;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AccountType fromValue(int value) {
                if (value == 0) {
                    return AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AccountType.CHECKING;
                }
                if (value != 2) {
                    return null;
                }
                return AccountType.SAVINGS;
            }
        }

        public static AccountType valueOf(String str) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }

        public static AccountType[] values() {
            return (AccountType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHRelationshipDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_TYPE_UNSPECIFIED", "CUSTOMER_INITIATED", "CATPAY", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SourceType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SourceType> ADAPTER;
        public static final SourceType CATPAY;
        public static final SourceType CUSTOMER_INITIATED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SourceType SOURCE_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ SourceType[] $values() {
            return new SourceType[]{SOURCE_TYPE_UNSPECIFIED, CUSTOMER_INITIATED, CATPAY};
        }

        @JvmStatic
        public static final SourceType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SourceType> getEntries() {
            return $ENTRIES;
        }

        private SourceType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SourceType sourceType = new SourceType("SOURCE_TYPE_UNSPECIFIED", 0, 0);
            SOURCE_TYPE_UNSPECIFIED = sourceType;
            CUSTOMER_INITIATED = new SourceType("CUSTOMER_INITIATED", 1, 1);
            CATPAY = new SourceType("CATPAY", 2, 2);
            SourceType[] sourceTypeArr$values = $values();
            $VALUES = sourceTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SourceType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SourceType>(orCreateKotlinClass, syntax, sourceType) { // from class: com.robinhood.rosetta.cashier.ACHRelationshipDetails$SourceType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHRelationshipDetails.SourceType fromValue(int value) {
                    return ACHRelationshipDetails.SourceType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHRelationshipDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails$SourceType;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SourceType fromValue(int value) {
                if (value == 0) {
                    return SourceType.SOURCE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return SourceType.CUSTOMER_INITIATED;
                }
                if (value != 2) {
                    return null;
                }
                return SourceType.CATPAY;
            }
        }

        public static SourceType valueOf(String str) {
            return (SourceType) Enum.valueOf(SourceType.class, str);
        }

        public static SourceType[] values() {
            return (SourceType[]) $VALUES.clone();
        }
    }
}
