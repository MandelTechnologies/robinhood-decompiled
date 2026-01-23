package com.robinhood.rosetta.cashier;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.RHEntity;
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
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: ReceivedInstantBankTransferDetails.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003JKLB³\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J¹\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u00107R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b<\u0010.R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010)R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b?\u0010)R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b@\u0010)R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\bA\u0010)R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\bB\u0010)R\u001a\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\bC\u0010)R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bH\u0010I¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "direction", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "state", "Lcom/robinhood/rosetta/common/Money;", "amount", "vulnerable_aml_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "relationship_master_id", "", "bank_account_nickname", "bank_account_last_four", "bank_account_routing_number", "rh_account_id", "user_uuid", "reversal_reason", "Lcom/robinhood/rosetta/common/AccountType;", "rh_account_type", "Lcom/robinhood/rosetta/common/RHEntity;", "rh_entity_type", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountType;Lcom/robinhood/rosetta/common/RHEntity;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountType;Lcom/robinhood/rosetta/common/RHEntity;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "Lokio/ByteString;", "getTransfer_id", "()Lokio/ByteString;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "getDirection", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "getState", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getVulnerable_aml_amount", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getRelationship_master_id", "Ljava/lang/String;", "getBank_account_nickname", "getBank_account_last_four", "getBank_account_routing_number", "getRh_account_id", "getUser_uuid", "getReversal_reason", "Lcom/robinhood/rosetta/common/AccountType;", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountType;", "Lcom/robinhood/rosetta/common/RHEntity;", "getRh_entity_type", "()Lcom/robinhood/rosetta/common/RHEntity;", "Companion", "State", "Direction", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ReceivedInstantBankTransferDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ReceivedInstantBankTransferDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String bank_account_last_four;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountNickname", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String bank_account_nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bankAccountRoutingNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String bank_account_routing_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant created_at;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails$Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Direction direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "relationshipMasterId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ByteString relationship_master_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "reversalReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String reversal_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String rh_account_id;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "rhAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final AccountType rh_account_type;

    @WireField(adapter = "com.robinhood.rosetta.common.RHEntity#ADAPTER", jsonName = "rhEntityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final RHEntity rh_entity_type;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final State state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString transfer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String user_uuid;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "vulnerableAmlAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money vulnerable_aml_amount;

    public ReceivedInstantBankTransferDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23978newBuilder();
    }

    public final ByteString getTransfer_id() {
        return this.transfer_id;
    }

    public /* synthetic */ ReceivedInstantBankTransferDetails(ByteString byteString, Direction direction, State state, Money money, Money money2, Instant instant, ByteString byteString2, String str, String str2, String str3, String str4, String str5, String str6, AccountType accountType, RHEntity rHEntity, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? Direction.UNSPECIFIED : direction, (i & 4) != 0 ? State.NEW : state, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2, (i & 32) == 0 ? instant : null, (i & 64) != 0 ? ByteString.EMPTY : byteString2, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) == 0 ? str6 : "", (i & 8192) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 16384) != 0 ? RHEntity.ENTITY_TYPE_UNSPECIFIED : rHEntity, (i & 32768) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final State getState() {
        return this.state;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Money getVulnerable_aml_amount() {
        return this.vulnerable_aml_amount;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final ByteString getRelationship_master_id() {
        return this.relationship_master_id;
    }

    public final String getBank_account_nickname() {
        return this.bank_account_nickname;
    }

    public final String getBank_account_last_four() {
        return this.bank_account_last_four;
    }

    public final String getBank_account_routing_number() {
        return this.bank_account_routing_number;
    }

    public final String getRh_account_id() {
        return this.rh_account_id;
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final String getReversal_reason() {
        return this.reversal_reason;
    }

    public final AccountType getRh_account_type() {
        return this.rh_account_type;
    }

    public final RHEntity getRh_entity_type() {
        return this.rh_entity_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedInstantBankTransferDetails(ByteString transfer_id, Direction direction, State state, Money money, Money money2, Instant instant, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, String rh_account_id, String user_uuid, String reversal_reason, AccountType rh_account_type, RHEntity rh_entity_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_id = transfer_id;
        this.direction = direction;
        this.state = state;
        this.amount = money;
        this.vulnerable_aml_amount = money2;
        this.created_at = instant;
        this.relationship_master_id = relationship_master_id;
        this.bank_account_nickname = bank_account_nickname;
        this.bank_account_last_four = bank_account_last_four;
        this.bank_account_routing_number = bank_account_routing_number;
        this.rh_account_id = rh_account_id;
        this.user_uuid = user_uuid;
        this.reversal_reason = reversal_reason;
        this.rh_account_type = rh_account_type;
        this.rh_entity_type = rh_entity_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23978newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReceivedInstantBankTransferDetails)) {
            return false;
        }
        ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails = (ReceivedInstantBankTransferDetails) other;
        return Intrinsics.areEqual(unknownFields(), receivedInstantBankTransferDetails.unknownFields()) && Intrinsics.areEqual(this.transfer_id, receivedInstantBankTransferDetails.transfer_id) && this.direction == receivedInstantBankTransferDetails.direction && this.state == receivedInstantBankTransferDetails.state && Intrinsics.areEqual(this.amount, receivedInstantBankTransferDetails.amount) && Intrinsics.areEqual(this.vulnerable_aml_amount, receivedInstantBankTransferDetails.vulnerable_aml_amount) && Intrinsics.areEqual(this.created_at, receivedInstantBankTransferDetails.created_at) && Intrinsics.areEqual(this.relationship_master_id, receivedInstantBankTransferDetails.relationship_master_id) && Intrinsics.areEqual(this.bank_account_nickname, receivedInstantBankTransferDetails.bank_account_nickname) && Intrinsics.areEqual(this.bank_account_last_four, receivedInstantBankTransferDetails.bank_account_last_four) && Intrinsics.areEqual(this.bank_account_routing_number, receivedInstantBankTransferDetails.bank_account_routing_number) && Intrinsics.areEqual(this.rh_account_id, receivedInstantBankTransferDetails.rh_account_id) && Intrinsics.areEqual(this.user_uuid, receivedInstantBankTransferDetails.user_uuid) && Intrinsics.areEqual(this.reversal_reason, receivedInstantBankTransferDetails.reversal_reason) && this.rh_account_type == receivedInstantBankTransferDetails.rh_account_type && this.rh_entity_type == receivedInstantBankTransferDetails.rh_entity_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.transfer_id.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.state.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.vulnerable_aml_amount;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode4 = ((((((((((((((((((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37) + this.relationship_master_id.hashCode()) * 37) + this.bank_account_nickname.hashCode()) * 37) + this.bank_account_last_four.hashCode()) * 37) + this.bank_account_routing_number.hashCode()) * 37) + this.rh_account_id.hashCode()) * 37) + this.user_uuid.hashCode()) * 37) + this.reversal_reason.hashCode()) * 37) + this.rh_account_type.hashCode()) * 37) + this.rh_entity_type.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_id=" + this.transfer_id);
        arrayList.add("direction=" + this.direction);
        arrayList.add("state=" + this.state);
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        Money money2 = this.vulnerable_aml_amount;
        if (money2 != null) {
            arrayList.add("vulnerable_aml_amount=" + money2);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        arrayList.add("relationship_master_id=" + this.relationship_master_id);
        arrayList.add("bank_account_nickname=" + Internal.sanitize(this.bank_account_nickname));
        arrayList.add("bank_account_last_four=" + Internal.sanitize(this.bank_account_last_four));
        arrayList.add("bank_account_routing_number=" + Internal.sanitize(this.bank_account_routing_number));
        arrayList.add("rh_account_id=" + Internal.sanitize(this.rh_account_id));
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("reversal_reason=" + Internal.sanitize(this.reversal_reason));
        arrayList.add("rh_account_type=" + this.rh_account_type);
        arrayList.add("rh_entity_type=" + this.rh_entity_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReceivedInstantBankTransferDetails{", "}", 0, null, null, 56, null);
    }

    public final ReceivedInstantBankTransferDetails copy(ByteString transfer_id, Direction direction, State state, Money amount, Money vulnerable_aml_amount, Instant created_at, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, String rh_account_id, String user_uuid, String reversal_reason, AccountType rh_account_type, RHEntity rh_entity_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReceivedInstantBankTransferDetails(transfer_id, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, rh_account_id, user_uuid, reversal_reason, rh_account_type, rh_entity_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReceivedInstantBankTransferDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReceivedInstantBankTransferDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReceivedInstantBankTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString transfer_id = value.getTransfer_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(transfer_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getTransfer_id());
                }
                if (value.getDirection() != ReceivedInstantBankTransferDetails.Direction.UNSPECIFIED) {
                    size += ReceivedInstantBankTransferDetails.Direction.ADAPTER.encodedSizeWithTag(2, value.getDirection());
                }
                if (value.getState() != ReceivedInstantBankTransferDetails.State.NEW) {
                    size += ReceivedInstantBankTransferDetails.State.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getAmount());
                }
                if (value.getVulnerable_aml_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getVulnerable_aml_amount());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getRelationship_master_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.getRelationship_master_id());
                }
                if (!Intrinsics.areEqual(value.getBank_account_nickname(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getBank_account_nickname());
                }
                if (!Intrinsics.areEqual(value.getBank_account_last_four(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getBank_account_last_four());
                }
                if (!Intrinsics.areEqual(value.getBank_account_routing_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getBank_account_routing_number());
                }
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getRh_account_id());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getReversal_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getReversal_reason());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(14, value.getRh_account_type());
                }
                return value.getRh_entity_type() != RHEntity.ENTITY_TYPE_UNSPECIFIED ? size + RHEntity.ADAPTER.encodedSizeWithTag(15, value.getRh_entity_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReceivedInstantBankTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString transfer_id = value.getTransfer_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(transfer_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getTransfer_id());
                }
                if (value.getDirection() != ReceivedInstantBankTransferDetails.Direction.UNSPECIFIED) {
                    ReceivedInstantBankTransferDetails.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getState() != ReceivedInstantBankTransferDetails.State.NEW) {
                    ReceivedInstantBankTransferDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (value.getVulnerable_aml_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getVulnerable_aml_amount());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getRelationship_master_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getRelationship_master_id());
                }
                if (!Intrinsics.areEqual(value.getBank_account_nickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getBank_account_nickname());
                }
                if (!Intrinsics.areEqual(value.getBank_account_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getBank_account_last_four());
                }
                if (!Intrinsics.areEqual(value.getBank_account_routing_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getBank_account_routing_number());
                }
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getRh_account_id());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getReversal_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getReversal_reason());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 14, (int) value.getRh_account_type());
                }
                if (value.getRh_entity_type() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 15, (int) value.getRh_entity_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReceivedInstantBankTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRh_entity_type() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 15, (int) value.getRh_entity_type());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 14, (int) value.getRh_account_type());
                }
                if (!Intrinsics.areEqual(value.getReversal_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getReversal_reason());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getRh_account_id());
                }
                if (!Intrinsics.areEqual(value.getBank_account_routing_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getBank_account_routing_number());
                }
                if (!Intrinsics.areEqual(value.getBank_account_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getBank_account_last_four());
                }
                if (!Intrinsics.areEqual(value.getBank_account_nickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getBank_account_nickname());
                }
                ByteString relationship_master_id = value.getRelationship_master_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(relationship_master_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getRelationship_master_id());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getCreated_at());
                }
                if (value.getVulnerable_aml_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getVulnerable_aml_amount());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (value.getState() != ReceivedInstantBankTransferDetails.State.NEW) {
                    ReceivedInstantBankTransferDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getDirection() != ReceivedInstantBankTransferDetails.Direction.UNSPECIFIED) {
                    ReceivedInstantBankTransferDetails.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (Intrinsics.areEqual(value.getTransfer_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getTransfer_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReceivedInstantBankTransferDetails decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                ReceivedInstantBankTransferDetails.Direction direction;
                ReceivedInstantBankTransferDetails.State state;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString2 = ByteString.EMPTY;
                ReceivedInstantBankTransferDetails.Direction direction2 = ReceivedInstantBankTransferDetails.Direction.UNSPECIFIED;
                ReceivedInstantBankTransferDetails.State state2 = ReceivedInstantBankTransferDetails.State.NEW;
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                RHEntity rHEntity = RHEntity.ENTITY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ByteString byteStringDecode = byteString2;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Instant instantDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                AccountType accountTypeDecode = accountType;
                RHEntity rHEntityDecode = rHEntity;
                ReceivedInstantBankTransferDetails.Direction directionDecode = direction2;
                ReceivedInstantBankTransferDetails.State stateDecode = state2;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 2:
                                byteString = byteStringDecode2;
                                direction = directionDecode;
                                state = stateDecode;
                                try {
                                    directionDecode = ReceivedInstantBankTransferDetails.Direction.ADAPTER.decode(reader);
                                    byteStringDecode2 = byteString;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                stateDecode = state;
                                break;
                            case 3:
                                byteString = byteStringDecode2;
                                direction = directionDecode;
                                state = stateDecode;
                                try {
                                    stateDecode = ReceivedInstantBankTransferDetails.State.ADAPTER.decode(reader);
                                    byteStringDecode2 = byteString;
                                    directionDecode = direction;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                byteString = byteStringDecode2;
                                direction = directionDecode;
                                state = stateDecode;
                                try {
                                    accountTypeDecode = AccountType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                byteStringDecode2 = byteString;
                                directionDecode = direction;
                                stateDecode = state;
                                break;
                            case 15:
                                try {
                                    rHEntityDecode = RHEntity.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    byteString = byteStringDecode2;
                                    direction = directionDecode;
                                    state = stateDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                byteString = byteStringDecode2;
                                direction = directionDecode;
                                state = stateDecode;
                                byteStringDecode2 = byteString;
                                directionDecode = direction;
                                stateDecode = state;
                                break;
                        }
                    } else {
                        return new ReceivedInstantBankTransferDetails(byteStringDecode, directionDecode, stateDecode, moneyDecode, moneyDecode2, instantDecode, byteStringDecode2, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, accountTypeDecode, rHEntityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReceivedInstantBankTransferDetails redact(ReceivedInstantBankTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Money vulnerable_aml_amount = value.getVulnerable_aml_amount();
                Money moneyRedact2 = vulnerable_aml_amount != null ? Money.ADAPTER.redact(vulnerable_aml_amount) : null;
                Instant created_at = value.getCreated_at();
                return value.copy((32711 & 1) != 0 ? value.transfer_id : null, (32711 & 2) != 0 ? value.direction : null, (32711 & 4) != 0 ? value.state : null, (32711 & 8) != 0 ? value.amount : moneyRedact, (32711 & 16) != 0 ? value.vulnerable_aml_amount : moneyRedact2, (32711 & 32) != 0 ? value.created_at : created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, (32711 & 64) != 0 ? value.relationship_master_id : null, (32711 & 128) != 0 ? value.bank_account_nickname : null, (32711 & 256) != 0 ? value.bank_account_last_four : null, (32711 & 512) != 0 ? value.bank_account_routing_number : null, (32711 & 1024) != 0 ? value.rh_account_id : null, (32711 & 2048) != 0 ? value.user_uuid : null, (32711 & 4096) != 0 ? value.reversal_reason : null, (32711 & 8192) != 0 ? value.rh_account_type : null, (32711 & 16384) != 0 ? value.rh_entity_type : null, (32711 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedInstantBankTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NEW", "READY", "PENDING", "COMPLETED", "FAILED", "DISPUTED", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;
        public static final State COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State DISPUTED;
        public static final State FAILED;
        public static final State NEW;
        public static final State PENDING;
        public static final State READY;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{NEW, READY, PENDING, COMPLETED, FAILED, DISPUTED};
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
            final State state = new State("NEW", 0, 0);
            NEW = state;
            READY = new State("READY", 1, 1);
            PENDING = new State("PENDING", 2, 2);
            COMPLETED = new State("COMPLETED", 3, 3);
            FAILED = new State("FAILED", 4, 4);
            DISPUTED = new State("DISPUTED", 5, 5);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ReceivedInstantBankTransferDetails.State fromValue(int value) {
                    return ReceivedInstantBankTransferDetails.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ReceivedInstantBankTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$State;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                if (value == 0) {
                    return State.NEW;
                }
                if (value == 1) {
                    return State.READY;
                }
                if (value == 2) {
                    return State.PENDING;
                }
                if (value == 3) {
                    return State.COMPLETED;
                }
                if (value == 4) {
                    return State.FAILED;
                }
                if (value != 5) {
                    return null;
                }
                return State.DISPUTED;
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
    /* compiled from: ReceivedInstantBankTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "DEPOSIT", "WITHDRAW", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Direction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DEPOSIT;
        public static final Direction UNSPECIFIED;
        public static final Direction WITHDRAW;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{UNSPECIFIED, DEPOSIT, WITHDRAW};
        }

        @JvmStatic
        public static final Direction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Direction direction = new Direction(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = direction;
            DEPOSIT = new Direction("DEPOSIT", 1, 1);
            WITHDRAW = new Direction("WITHDRAW", 2, 2);
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails$Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ReceivedInstantBankTransferDetails.Direction fromValue(int value) {
                    return ReceivedInstantBankTransferDetails.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ReceivedInstantBankTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails$Direction;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Direction fromValue(int value) {
                if (value == 0) {
                    return Direction.UNSPECIFIED;
                }
                if (value == 1) {
                    return Direction.DEPOSIT;
                }
                if (value != 2) {
                    return null;
                }
                return Direction.WITHDRAW;
            }
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }
}
