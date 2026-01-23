package com.robinhood.rosetta.cashier;

import com.robinhood.rosetta.cashier.ReceivedACHTransferDetails;
import com.robinhood.rosetta.common.Date;
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

/* compiled from: ReceivedACHTransferDetails.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b.\u0018\u0000 U2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003UVWBó\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0017¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.Jù\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u0010¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u00106R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u00109R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010.R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b<\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b@\u0010?R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bA\u0010.R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bE\u0010?R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\b\u0014\u0010GR\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bK\u0010GR\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bL\u0010.R\u001a\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010:\u001a\u0004\bM\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\bN\u0010?R\"\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010O\u001a\u0004\bP\u0010QR\"\u0010\u001e\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bR\u0010QR\u001a\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\bS\u0010.R\u001a\u0010 \u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\bT\u0010.¨\u0006X"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "direction", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "state", "Lcom/robinhood/rosetta/common/Money;", "amount", "", "originator_name", "description", "Lcom/robinhood/rosetta/common/Date;", "received_date", "effective_date", "receiver_rh_account_type", "Lokio/ByteString;", "dd_relationship_id", "grant_date", "", "is_redirected", "", "number_of_days_since_rhy_migration", "has_noc", "rejected_reason", "name_at_originator", "returned_date", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "settled_at", "created_at", "receiving_account_id", "originating_account_id", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/Date;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lokio/ByteString;Lcom/robinhood/rosetta/common/Date;ZJZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "getDirection", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "getState", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "Ljava/lang/String;", "getOriginator_name", "getDescription", "Lcom/robinhood/rosetta/common/Date;", "getReceived_date", "()Lcom/robinhood/rosetta/common/Date;", "getEffective_date", "getReceiver_rh_account_type", "Lokio/ByteString;", "getDd_relationship_id", "()Lokio/ByteString;", "getGrant_date", "Z", "()Z", "J", "getNumber_of_days_since_rhy_migration", "()J", "getHas_noc", "getRejected_reason", "getName_at_originator", "getReturned_date", "Lj$/time/Instant;", "getSettled_at", "()Lj$/time/Instant;", "getCreated_at", "getReceiving_account_id", "getOriginating_account_id", "Companion", "Direction", "State", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ReceivedACHTransferDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ReceivedACHTransferDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "ddRelationshipId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final ByteString dd_relationship_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String description;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ReceivedACHTransferDetails$Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final Direction direction;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "effectiveDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final Date effective_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "grantDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final Date grant_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasNoc", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final boolean has_noc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRedirected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final boolean is_redirected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nameAtOriginator", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 16)
    private final String name_at_originator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "numberOfDaysSinceRhyMigration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 13)
    private final long number_of_days_since_rhy_migration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "originatingAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String originating_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "originatorName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String originator_name;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "receivedDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final Date received_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "receiverRhAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final String receiver_rh_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "receivingAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final String receiving_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rejectedReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 15)
    private final String rejected_reason;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "returnedDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final Date returned_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "settledAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final Instant settled_at;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ReceivedACHTransferDetails$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final State state;

    public ReceivedACHTransferDetails() {
        this(null, null, null, null, null, null, null, null, null, null, false, 0L, false, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23977newBuilder();
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public /* synthetic */ ReceivedACHTransferDetails(Direction direction, State state, Money money, String str, String str2, Date date, Date date2, String str3, ByteString byteString, Date date3, boolean z, long j, boolean z2, String str4, String str5, Date date4, Instant instant, Instant instant2, String str6, String str7, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 2) != 0 ? State.STATE_UNSPECIFIED : state, (i & 4) != 0 ? null : money, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : date, (i & 64) != 0 ? null : date2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? ByteString.EMPTY : byteString, (i & 512) != 0 ? null : date3, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? 0L : j, (i & 4096) == 0 ? z2 : false, (i & 8192) != 0 ? "" : str4, (i & 16384) != 0 ? "" : str5, (i & 32768) != 0 ? null : date4, (i & 65536) != 0 ? null : instant, (i & 131072) != 0 ? null : instant2, (i & 262144) != 0 ? "" : str6, (i & 524288) == 0 ? str7 : "", (i & 1048576) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final State getState() {
        return this.state;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getOriginator_name() {
        return this.originator_name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Date getReceived_date() {
        return this.received_date;
    }

    public final Date getEffective_date() {
        return this.effective_date;
    }

    public final String getReceiver_rh_account_type() {
        return this.receiver_rh_account_type;
    }

    public final ByteString getDd_relationship_id() {
        return this.dd_relationship_id;
    }

    public final Date getGrant_date() {
        return this.grant_date;
    }

    /* renamed from: is_redirected, reason: from getter */
    public final boolean getIs_redirected() {
        return this.is_redirected;
    }

    public final long getNumber_of_days_since_rhy_migration() {
        return this.number_of_days_since_rhy_migration;
    }

    public final boolean getHas_noc() {
        return this.has_noc;
    }

    public final String getRejected_reason() {
        return this.rejected_reason;
    }

    public final String getName_at_originator() {
        return this.name_at_originator;
    }

    public final Date getReturned_date() {
        return this.returned_date;
    }

    public final Instant getSettled_at() {
        return this.settled_at;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final String getReceiving_account_id() {
        return this.receiving_account_id;
    }

    public final String getOriginating_account_id() {
        return this.originating_account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedACHTransferDetails(Direction direction, State state, Money money, String originator_name, String description, Date date, Date date2, String receiver_rh_account_type, ByteString dd_relationship_id, Date date3, boolean z, long j, boolean z2, String rejected_reason, String name_at_originator, Date date4, Instant instant, Instant instant2, String receiving_account_id, String originating_account_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(originator_name, "originator_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(receiver_rh_account_type, "receiver_rh_account_type");
        Intrinsics.checkNotNullParameter(dd_relationship_id, "dd_relationship_id");
        Intrinsics.checkNotNullParameter(rejected_reason, "rejected_reason");
        Intrinsics.checkNotNullParameter(name_at_originator, "name_at_originator");
        Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
        Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.direction = direction;
        this.state = state;
        this.amount = money;
        this.originator_name = originator_name;
        this.description = description;
        this.received_date = date;
        this.effective_date = date2;
        this.receiver_rh_account_type = receiver_rh_account_type;
        this.dd_relationship_id = dd_relationship_id;
        this.grant_date = date3;
        this.is_redirected = z;
        this.number_of_days_since_rhy_migration = j;
        this.has_noc = z2;
        this.rejected_reason = rejected_reason;
        this.name_at_originator = name_at_originator;
        this.returned_date = date4;
        this.settled_at = instant;
        this.created_at = instant2;
        this.receiving_account_id = receiving_account_id;
        this.originating_account_id = originating_account_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23977newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReceivedACHTransferDetails)) {
            return false;
        }
        ReceivedACHTransferDetails receivedACHTransferDetails = (ReceivedACHTransferDetails) other;
        return Intrinsics.areEqual(unknownFields(), receivedACHTransferDetails.unknownFields()) && this.direction == receivedACHTransferDetails.direction && this.state == receivedACHTransferDetails.state && Intrinsics.areEqual(this.amount, receivedACHTransferDetails.amount) && Intrinsics.areEqual(this.originator_name, receivedACHTransferDetails.originator_name) && Intrinsics.areEqual(this.description, receivedACHTransferDetails.description) && Intrinsics.areEqual(this.received_date, receivedACHTransferDetails.received_date) && Intrinsics.areEqual(this.effective_date, receivedACHTransferDetails.effective_date) && Intrinsics.areEqual(this.receiver_rh_account_type, receivedACHTransferDetails.receiver_rh_account_type) && Intrinsics.areEqual(this.dd_relationship_id, receivedACHTransferDetails.dd_relationship_id) && Intrinsics.areEqual(this.grant_date, receivedACHTransferDetails.grant_date) && this.is_redirected == receivedACHTransferDetails.is_redirected && this.number_of_days_since_rhy_migration == receivedACHTransferDetails.number_of_days_since_rhy_migration && this.has_noc == receivedACHTransferDetails.has_noc && Intrinsics.areEqual(this.rejected_reason, receivedACHTransferDetails.rejected_reason) && Intrinsics.areEqual(this.name_at_originator, receivedACHTransferDetails.name_at_originator) && Intrinsics.areEqual(this.returned_date, receivedACHTransferDetails.returned_date) && Intrinsics.areEqual(this.settled_at, receivedACHTransferDetails.settled_at) && Intrinsics.areEqual(this.created_at, receivedACHTransferDetails.created_at) && Intrinsics.areEqual(this.receiving_account_id, receivedACHTransferDetails.receiving_account_id) && Intrinsics.areEqual(this.originating_account_id, receivedACHTransferDetails.originating_account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.direction.hashCode()) * 37) + this.state.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.originator_name.hashCode()) * 37) + this.description.hashCode()) * 37;
        Date date = this.received_date;
        int iHashCode3 = (iHashCode2 + (date != null ? date.hashCode() : 0)) * 37;
        Date date2 = this.effective_date;
        int iHashCode4 = (((((iHashCode3 + (date2 != null ? date2.hashCode() : 0)) * 37) + this.receiver_rh_account_type.hashCode()) * 37) + this.dd_relationship_id.hashCode()) * 37;
        Date date3 = this.grant_date;
        int iHashCode5 = (((((((((((iHashCode4 + (date3 != null ? date3.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_redirected)) * 37) + Long.hashCode(this.number_of_days_since_rhy_migration)) * 37) + Boolean.hashCode(this.has_noc)) * 37) + this.rejected_reason.hashCode()) * 37) + this.name_at_originator.hashCode()) * 37;
        Date date4 = this.returned_date;
        int iHashCode6 = (iHashCode5 + (date4 != null ? date4.hashCode() : 0)) * 37;
        Instant instant = this.settled_at;
        int iHashCode7 = (iHashCode6 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.created_at;
        int iHashCode8 = ((((iHashCode7 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.receiving_account_id.hashCode()) * 37) + this.originating_account_id.hashCode();
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("direction=" + this.direction);
        arrayList.add("state=" + this.state);
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("originator_name=" + Internal.sanitize(this.originator_name));
        arrayList.add("description=" + Internal.sanitize(this.description));
        Date date = this.received_date;
        if (date != null) {
            arrayList.add("received_date=" + date);
        }
        Date date2 = this.effective_date;
        if (date2 != null) {
            arrayList.add("effective_date=" + date2);
        }
        arrayList.add("receiver_rh_account_type=" + Internal.sanitize(this.receiver_rh_account_type));
        arrayList.add("dd_relationship_id=" + this.dd_relationship_id);
        Date date3 = this.grant_date;
        if (date3 != null) {
            arrayList.add("grant_date=" + date3);
        }
        arrayList.add("is_redirected=" + this.is_redirected);
        arrayList.add("number_of_days_since_rhy_migration=" + this.number_of_days_since_rhy_migration);
        arrayList.add("has_noc=" + this.has_noc);
        arrayList.add("rejected_reason=" + Internal.sanitize(this.rejected_reason));
        arrayList.add("name_at_originator=" + Internal.sanitize(this.name_at_originator));
        Date date4 = this.returned_date;
        if (date4 != null) {
            arrayList.add("returned_date=" + date4);
        }
        Instant instant = this.settled_at;
        if (instant != null) {
            arrayList.add("settled_at=" + instant);
        }
        Instant instant2 = this.created_at;
        if (instant2 != null) {
            arrayList.add("created_at=" + instant2);
        }
        arrayList.add("receiving_account_id=" + Internal.sanitize(this.receiving_account_id));
        arrayList.add("originating_account_id=" + Internal.sanitize(this.originating_account_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReceivedACHTransferDetails{", "}", 0, null, null, 56, null);
    }

    public final ReceivedACHTransferDetails copy(Direction direction, State state, Money amount, String originator_name, String description, Date received_date, Date effective_date, String receiver_rh_account_type, ByteString dd_relationship_id, Date grant_date, boolean is_redirected, long number_of_days_since_rhy_migration, boolean has_noc, String rejected_reason, String name_at_originator, Date returned_date, Instant settled_at, Instant created_at, String receiving_account_id, String originating_account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(originator_name, "originator_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(receiver_rh_account_type, "receiver_rh_account_type");
        Intrinsics.checkNotNullParameter(dd_relationship_id, "dd_relationship_id");
        Intrinsics.checkNotNullParameter(rejected_reason, "rejected_reason");
        Intrinsics.checkNotNullParameter(name_at_originator, "name_at_originator");
        Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
        Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReceivedACHTransferDetails(direction, state, amount, originator_name, description, received_date, effective_date, receiver_rh_account_type, dd_relationship_id, grant_date, is_redirected, number_of_days_since_rhy_migration, has_noc, rejected_reason, name_at_originator, returned_date, settled_at, created_at, receiving_account_id, originating_account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReceivedACHTransferDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReceivedACHTransferDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.ReceivedACHTransferDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReceivedACHTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDirection() != ReceivedACHTransferDetails.Direction.DIRECTION_UNSPECIFIED) {
                    size += ReceivedACHTransferDetails.Direction.ADAPTER.encodedSizeWithTag(2, value.getDirection());
                }
                if (value.getState() != ReceivedACHTransferDetails.State.STATE_UNSPECIFIED) {
                    size += ReceivedACHTransferDetails.State.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getOriginator_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOriginator_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDescription());
                }
                if (value.getReceived_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(7, value.getReceived_date());
                }
                if (value.getEffective_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(8, value.getEffective_date());
                }
                if (!Intrinsics.areEqual(value.getReceiver_rh_account_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getReceiver_rh_account_type());
                }
                if (!Intrinsics.areEqual(value.getDd_relationship_id(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(10, value.getDd_relationship_id());
                }
                if (value.getGrant_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(11, value.getGrant_date());
                }
                if (value.getIs_redirected()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getIs_redirected()));
                }
                if (value.getNumber_of_days_since_rhy_migration() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(13, Long.valueOf(value.getNumber_of_days_since_rhy_migration()));
                }
                if (value.getHas_noc()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.getHas_noc()));
                }
                if (!Intrinsics.areEqual(value.getRejected_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getRejected_reason());
                }
                if (!Intrinsics.areEqual(value.getName_at_originator(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getName_at_originator());
                }
                if (value.getReturned_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(17, value.getReturned_date());
                }
                if (value.getSettled_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(18, value.getSettled_at());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(19, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getReceiving_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getReceiving_account_id());
                }
                return !Intrinsics.areEqual(value.getOriginating_account_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(21, value.getOriginating_account_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReceivedACHTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDirection() != ReceivedACHTransferDetails.Direction.DIRECTION_UNSPECIFIED) {
                    ReceivedACHTransferDetails.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getState() != ReceivedACHTransferDetails.State.STATE_UNSPECIFIED) {
                    ReceivedACHTransferDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getOriginator_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOriginator_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDescription());
                }
                if (value.getReceived_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 7, (int) value.getReceived_date());
                }
                if (value.getEffective_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 8, (int) value.getEffective_date());
                }
                if (!Intrinsics.areEqual(value.getReceiver_rh_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getReceiver_rh_account_type());
                }
                if (!Intrinsics.areEqual(value.getDd_relationship_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 10, (int) value.getDd_relationship_id());
                }
                if (value.getGrant_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 11, (int) value.getGrant_date());
                }
                if (value.getIs_redirected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getIs_redirected()));
                }
                if (value.getNumber_of_days_since_rhy_migration() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 13, (int) Long.valueOf(value.getNumber_of_days_since_rhy_migration()));
                }
                if (value.getHas_noc()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 14, (int) Boolean.valueOf(value.getHas_noc()));
                }
                if (!Intrinsics.areEqual(value.getRejected_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getRejected_reason());
                }
                if (!Intrinsics.areEqual(value.getName_at_originator(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getName_at_originator());
                }
                if (value.getReturned_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 17, (int) value.getReturned_date());
                }
                if (value.getSettled_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 18, (int) value.getSettled_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getReceiving_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getReceiving_account_id());
                }
                if (!Intrinsics.areEqual(value.getOriginating_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getOriginating_account_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReceivedACHTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOriginating_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getOriginating_account_id());
                }
                if (!Intrinsics.areEqual(value.getReceiving_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getReceiving_account_id());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getCreated_at());
                }
                if (value.getSettled_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 18, (int) value.getSettled_at());
                }
                if (value.getReturned_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 17, (int) value.getReturned_date());
                }
                if (!Intrinsics.areEqual(value.getName_at_originator(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getName_at_originator());
                }
                if (!Intrinsics.areEqual(value.getRejected_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getRejected_reason());
                }
                if (value.getHas_noc()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 14, (int) Boolean.valueOf(value.getHas_noc()));
                }
                if (value.getNumber_of_days_since_rhy_migration() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 13, (int) Long.valueOf(value.getNumber_of_days_since_rhy_migration()));
                }
                if (value.getIs_redirected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getIs_redirected()));
                }
                if (value.getGrant_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 11, (int) value.getGrant_date());
                }
                if (!Intrinsics.areEqual(value.getDd_relationship_id(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 10, (int) value.getDd_relationship_id());
                }
                if (!Intrinsics.areEqual(value.getReceiver_rh_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getReceiver_rh_account_type());
                }
                if (value.getEffective_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 8, (int) value.getEffective_date());
                }
                if (value.getReceived_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 7, (int) value.getReceived_date());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getOriginator_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOriginator_name());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (value.getState() != ReceivedACHTransferDetails.State.STATE_UNSPECIFIED) {
                    ReceivedACHTransferDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getDirection() != ReceivedACHTransferDetails.Direction.DIRECTION_UNSPECIFIED) {
                    ReceivedACHTransferDetails.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReceivedACHTransferDetails decode(ProtoReader reader) throws IOException {
                ReceivedACHTransferDetails.State state;
                ByteString byteString;
                Money money;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ReceivedACHTransferDetails.Direction direction = ReceivedACHTransferDetails.Direction.DIRECTION_UNSPECIFIED;
                ReceivedACHTransferDetails.State state2 = ReceivedACHTransferDetails.State.STATE_UNSPECIFIED;
                ByteString byteString2 = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                ReceivedACHTransferDetails.Direction directionDecode = direction;
                Date dateDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                long jLongValue = 0;
                ByteString byteStringDecode = byteString2;
                Money moneyDecode = null;
                Date dateDecode2 = null;
                Date dateDecode3 = null;
                Date dateDecode4 = null;
                ReceivedACHTransferDetails.State stateDecode = state2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 2:
                                state = stateDecode;
                                byteString = byteStringDecode;
                                money = moneyDecode;
                                try {
                                    directionDecode = ReceivedACHTransferDetails.Direction.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                try {
                                    stateDecode = ReceivedACHTransferDetails.State.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    state = stateDecode;
                                    byteString = byteStringDecode;
                                    money = moneyDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                dateDecode2 = Date.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                dateDecode3 = Date.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 11:
                                dateDecode4 = Date.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 13:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                continue;
                            case 14:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 15:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 17:
                                dateDecode = Date.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 19:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 20:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 21:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                state = stateDecode;
                                byteString = byteStringDecode;
                                money = moneyDecode;
                                break;
                        }
                        stateDecode = state;
                        byteStringDecode = byteString;
                        moneyDecode = money;
                    } else {
                        return new ReceivedACHTransferDetails(directionDecode, stateDecode, moneyDecode, strDecode, strDecode2, dateDecode2, dateDecode3, strDecode3, byteStringDecode, dateDecode4, zBooleanValue, jLongValue, zBooleanValue2, strDecode4, strDecode5, dateDecode, instantDecode, instantDecode2, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReceivedACHTransferDetails redact(ReceivedACHTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Date received_date = value.getReceived_date();
                Date dateRedact = received_date != null ? Date.ADAPTER.redact(received_date) : null;
                Date effective_date = value.getEffective_date();
                Date dateRedact2 = effective_date != null ? Date.ADAPTER.redact(effective_date) : null;
                Date grant_date = value.getGrant_date();
                Date dateRedact3 = grant_date != null ? Date.ADAPTER.redact(grant_date) : null;
                Date returned_date = value.getReturned_date();
                Date dateRedact4 = returned_date != null ? Date.ADAPTER.redact(returned_date) : null;
                Instant settled_at = value.getSettled_at();
                Instant instantRedact = settled_at != null ? ProtoAdapter.INSTANT.redact(settled_at) : null;
                Instant created_at = value.getCreated_at();
                return value.copy((818587 & 1) != 0 ? value.direction : null, (818587 & 2) != 0 ? value.state : null, (818587 & 4) != 0 ? value.amount : moneyRedact, (818587 & 8) != 0 ? value.originator_name : null, (818587 & 16) != 0 ? value.description : null, (818587 & 32) != 0 ? value.received_date : dateRedact, (818587 & 64) != 0 ? value.effective_date : dateRedact2, (818587 & 128) != 0 ? value.receiver_rh_account_type : null, (818587 & 256) != 0 ? value.dd_relationship_id : null, (818587 & 512) != 0 ? value.grant_date : dateRedact3, (818587 & 1024) != 0 ? value.is_redirected : false, (818587 & 2048) != 0 ? value.number_of_days_since_rhy_migration : 0L, (818587 & 4096) != 0 ? value.has_noc : false, (818587 & 8192) != 0 ? value.rejected_reason : null, (818587 & 16384) != 0 ? value.name_at_originator : null, (818587 & 32768) != 0 ? value.returned_date : dateRedact4, (818587 & 65536) != 0 ? value.settled_at : instantRedact, (818587 & 131072) != 0 ? value.created_at : created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, (818587 & 262144) != 0 ? value.receiving_account_id : null, (818587 & 524288) != 0 ? value.originating_account_id : null, (818587 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedACHTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_UNSPECIFIED", "CREDIT", "DEBIT", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Direction> ADAPTER;
        public static final Direction CREDIT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DEBIT;
        public static final Direction DIRECTION_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{DIRECTION_UNSPECIFIED, CREDIT, DEBIT};
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
            final Direction direction = new Direction("DIRECTION_UNSPECIFIED", 0, 0);
            DIRECTION_UNSPECIFIED = direction;
            CREDIT = new Direction("CREDIT", 1, 1);
            DEBIT = new Direction("DEBIT", 2, 2);
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: com.robinhood.rosetta.cashier.ReceivedACHTransferDetails$Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ReceivedACHTransferDetails.Direction fromValue(int value) {
                    return ReceivedACHTransferDetails.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ReceivedACHTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$Direction;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Direction fromValue(int value) {
                if (value == 0) {
                    return Direction.DIRECTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return Direction.CREDIT;
                }
                if (value != 2) {
                    return null;
                }
                return Direction.DEBIT;
            }
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReceivedACHTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "RECEIVED", "REJECTED", "GRANTED", "SETTLED", "RETURNED", "REVERSED", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State GRANTED;
        public static final State RECEIVED;
        public static final State REJECTED;
        public static final State RETURNED;
        public static final State REVERSED;
        public static final State SETTLED;
        public static final State STATE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_UNSPECIFIED, RECEIVED, REJECTED, GRANTED, SETTLED, RETURNED, REVERSED};
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
            RECEIVED = new State("RECEIVED", 1, 1);
            REJECTED = new State("REJECTED", 2, 2);
            GRANTED = new State("GRANTED", 3, 3);
            SETTLED = new State("SETTLED", 4, 4);
            RETURNED = new State("RETURNED", 5, 5);
            REVERSED = new State("REVERSED", 6, 6);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: com.robinhood.rosetta.cashier.ReceivedACHTransferDetails$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ReceivedACHTransferDetails.State fromValue(int value) {
                    return ReceivedACHTransferDetails.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ReceivedACHTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails$State;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final State fromValue(int value) {
                switch (value) {
                    case 0:
                        return State.STATE_UNSPECIFIED;
                    case 1:
                        return State.RECEIVED;
                    case 2:
                        return State.REJECTED;
                    case 3:
                        return State.GRANTED;
                    case 4:
                        return State.SETTLED;
                    case 5:
                        return State.RETURNED;
                    case 6:
                        return State.REVERSED;
                    default:
                        return null;
                }
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
