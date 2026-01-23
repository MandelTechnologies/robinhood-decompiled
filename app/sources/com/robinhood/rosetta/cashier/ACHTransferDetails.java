package com.robinhood.rosetta.cashier;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.rosetta.cashier.ACHTransferDetails;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.Date;
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
import p479j$.time.Instant;
import rosetta.cashier.TransferEvent;

/* compiled from: ACHTransferDetails.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b?\u0018\u0000 n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005nopqrB»\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010+\u001a\u00020\u0003¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0017¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u000100H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u00108JÁ\u0002\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010#\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010+\u001a\u00020\u0003¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bG\u0010FR\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bK\u0010=R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u00108R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bN\u00108R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bO\u00108R\"\u0010\u0014\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bP\u0010JR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bT\u0010FR\u001a\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bU\u00108R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\bW\u0010XR\"\u0010\u001b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bY\u0010JR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b]\u0010=R\u001a\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010^\u001a\u0004\b_\u0010`R\u001c\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010D\u001a\u0004\ba\u0010FR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010Q\u001a\u0004\bb\u0010SR\u001a\u0010#\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010L\u001a\u0004\bc\u00108R\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010d\u001a\u0004\be\u0010fR\u001a\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010*\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010Q\u001a\u0004\bm\u0010S¨\u0006s"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "direction", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "state", "Lcom/robinhood/rosetta/common/Money;", "amount", "vulnerable_aml_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "relationship_master_id", "", "bank_account_nickname", "bank_account_last_four", "bank_account_routing_number", "expected_ach_landing_datetime", "Lcom/robinhood/rosetta/common/Date;", "expected_ach_landing_date", "reversal_fee", "reversal_reason", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "return_reason", "fees_reversed_at", "", "scheduled", "investment_schedule_id", "Lcom/robinhood/rosetta/common/AccountType;", "rh_account_type", "instant_used", "submitted_date", "partner_bank", "Lcom/robinhood/rosetta/common/RHEntity;", "rh_entity_type", "Lrosetta/cashier/TransferEvent$SourceType;", "source_type", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "purpose", "settlement_date", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntity;Lrosetta/cashier/TransferEvent$SourceType;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Lokio/ByteString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;Lj$/time/Instant;ZLokio/ByteString;Lcom/robinhood/rosetta/common/AccountType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lcom/robinhood/rosetta/common/RHEntity;Lrosetta/cashier/TransferEvent$SourceType;Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "Lokio/ByteString;", "getTransfer_id", "()Lokio/ByteString;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "getDirection", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "getState", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "Lcom/robinhood/rosetta/common/Money;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getVulnerable_aml_amount", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getRelationship_master_id", "Ljava/lang/String;", "getBank_account_nickname", "getBank_account_last_four", "getBank_account_routing_number", "getExpected_ach_landing_datetime", "Lcom/robinhood/rosetta/common/Date;", "getExpected_ach_landing_date", "()Lcom/robinhood/rosetta/common/Date;", "getReversal_fee", "getReversal_reason", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "getReturn_reason", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "getFees_reversed_at", "Z", "getScheduled", "()Z", "getInvestment_schedule_id", "Lcom/robinhood/rosetta/common/AccountType;", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountType;", "getInstant_used", "getSubmitted_date", "getPartner_bank", "Lcom/robinhood/rosetta/common/RHEntity;", "getRh_entity_type", "()Lcom/robinhood/rosetta/common/RHEntity;", "Lrosetta/cashier/TransferEvent$SourceType;", "getSource_type", "()Lrosetta/cashier/TransferEvent$SourceType;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "getPurpose", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "getSettlement_date", "Companion", "State", "Direction", "ReturnReason", "Purpose", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ACHTransferDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ACHTransferDetails> ADAPTER;
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

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHTransferDetails$Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Direction direction;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "expectedAchLandingDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Date expected_ach_landing_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expectedAchLandingDatetime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant expected_ach_landing_datetime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "feesReversedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Instant fees_reversed_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "instantUsed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final Money instant_used;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "investmentScheduleId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final ByteString investment_schedule_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "partnerBank", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String partner_bank;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHTransferDetails$Purpose#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final Purpose purpose;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "relationshipMasterId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ByteString relationship_master_id;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHTransferDetails$ReturnReason#ADAPTER", jsonName = "returnReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final ReturnReason return_reason;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "reversalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Money reversal_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "reversalReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String reversal_reason;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "rhAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final AccountType rh_account_type;

    @WireField(adapter = "com.robinhood.rosetta.common.RHEntity#ADAPTER", jsonName = "rhEntityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final RHEntity rh_entity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final boolean scheduled;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "settlementDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final Date settlement_date;

    @WireField(adapter = "rosetta.cashier.TransferEvent$SourceType#ADAPTER", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final TransferEvent source_type;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHTransferDetails$State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final State state;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "submittedDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final Date submitted_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString transfer_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "vulnerableAmlAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money vulnerable_aml_amount;

    public ACHTransferDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 134217727, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23957newBuilder();
    }

    public final ByteString getTransfer_id() {
        return this.transfer_id;
    }

    public /* synthetic */ ACHTransferDetails(ByteString byteString, Direction direction, State state, Money money, Money money2, Instant instant, ByteString byteString2, String str, String str2, String str3, Instant instant2, Date date, Money money3, String str4, ReturnReason returnReason, Instant instant3, boolean z, ByteString byteString3, AccountType accountType, Money money4, Date date2, String str5, RHEntity rHEntity, TransferEvent transferEvent, Purpose purpose, Date date3, ByteString byteString4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 4) != 0 ? State.STATE_UNSPECIFIED : state, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? ByteString.EMPTY : byteString2, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : date, (i & 4096) != 0 ? null : money3, (i & 8192) != 0 ? "" : str4, (i & 16384) != 0 ? ReturnReason.RETURN_REASON_UNSPECIFIED : returnReason, (i & 32768) != 0 ? null : instant3, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? ByteString.EMPTY : byteString3, (i & 262144) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 524288) != 0 ? null : money4, (i & 1048576) != 0 ? null : date2, (i & 2097152) == 0 ? str5 : "", (i & 4194304) != 0 ? RHEntity.ENTITY_TYPE_UNSPECIFIED : rHEntity, (i & 8388608) != 0 ? TransferEvent.SOURCE_TYPE_UNSPECIFIED : transferEvent, (i & 16777216) != 0 ? Purpose.PURPOSE_UNSPECIFIED : purpose, (i & 33554432) != 0 ? null : date3, (i & 67108864) != 0 ? ByteString.EMPTY : byteString4);
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

    public final Instant getExpected_ach_landing_datetime() {
        return this.expected_ach_landing_datetime;
    }

    public final Date getExpected_ach_landing_date() {
        return this.expected_ach_landing_date;
    }

    public final Money getReversal_fee() {
        return this.reversal_fee;
    }

    public final String getReversal_reason() {
        return this.reversal_reason;
    }

    public final ReturnReason getReturn_reason() {
        return this.return_reason;
    }

    public final Instant getFees_reversed_at() {
        return this.fees_reversed_at;
    }

    public final boolean getScheduled() {
        return this.scheduled;
    }

    public final ByteString getInvestment_schedule_id() {
        return this.investment_schedule_id;
    }

    public final AccountType getRh_account_type() {
        return this.rh_account_type;
    }

    public final Money getInstant_used() {
        return this.instant_used;
    }

    public final Date getSubmitted_date() {
        return this.submitted_date;
    }

    public final String getPartner_bank() {
        return this.partner_bank;
    }

    public final RHEntity getRh_entity_type() {
        return this.rh_entity_type;
    }

    public final TransferEvent getSource_type() {
        return this.source_type;
    }

    public final Purpose getPurpose() {
        return this.purpose;
    }

    public final Date getSettlement_date() {
        return this.settlement_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACHTransferDetails(ByteString transfer_id, Direction direction, State state, Money money, Money money2, Instant instant, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, Instant instant2, Date date, Money money3, String reversal_reason, ReturnReason return_reason, Instant instant3, boolean z, ByteString investment_schedule_id, AccountType rh_account_type, Money money4, Date date2, String partner_bank, RHEntity rh_entity_type, TransferEvent source_type, Purpose purpose, Date date3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(return_reason, "return_reason");
        Intrinsics.checkNotNullParameter(investment_schedule_id, "investment_schedule_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(partner_bank, "partner_bank");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
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
        this.expected_ach_landing_datetime = instant2;
        this.expected_ach_landing_date = date;
        this.reversal_fee = money3;
        this.reversal_reason = reversal_reason;
        this.return_reason = return_reason;
        this.fees_reversed_at = instant3;
        this.scheduled = z;
        this.investment_schedule_id = investment_schedule_id;
        this.rh_account_type = rh_account_type;
        this.instant_used = money4;
        this.submitted_date = date2;
        this.partner_bank = partner_bank;
        this.rh_entity_type = rh_entity_type;
        this.source_type = source_type;
        this.purpose = purpose;
        this.settlement_date = date3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23957newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ACHTransferDetails)) {
            return false;
        }
        ACHTransferDetails aCHTransferDetails = (ACHTransferDetails) other;
        return Intrinsics.areEqual(unknownFields(), aCHTransferDetails.unknownFields()) && Intrinsics.areEqual(this.transfer_id, aCHTransferDetails.transfer_id) && this.direction == aCHTransferDetails.direction && this.state == aCHTransferDetails.state && Intrinsics.areEqual(this.amount, aCHTransferDetails.amount) && Intrinsics.areEqual(this.vulnerable_aml_amount, aCHTransferDetails.vulnerable_aml_amount) && Intrinsics.areEqual(this.created_at, aCHTransferDetails.created_at) && Intrinsics.areEqual(this.relationship_master_id, aCHTransferDetails.relationship_master_id) && Intrinsics.areEqual(this.bank_account_nickname, aCHTransferDetails.bank_account_nickname) && Intrinsics.areEqual(this.bank_account_last_four, aCHTransferDetails.bank_account_last_four) && Intrinsics.areEqual(this.bank_account_routing_number, aCHTransferDetails.bank_account_routing_number) && Intrinsics.areEqual(this.expected_ach_landing_datetime, aCHTransferDetails.expected_ach_landing_datetime) && Intrinsics.areEqual(this.expected_ach_landing_date, aCHTransferDetails.expected_ach_landing_date) && Intrinsics.areEqual(this.reversal_fee, aCHTransferDetails.reversal_fee) && Intrinsics.areEqual(this.reversal_reason, aCHTransferDetails.reversal_reason) && this.return_reason == aCHTransferDetails.return_reason && Intrinsics.areEqual(this.fees_reversed_at, aCHTransferDetails.fees_reversed_at) && this.scheduled == aCHTransferDetails.scheduled && Intrinsics.areEqual(this.investment_schedule_id, aCHTransferDetails.investment_schedule_id) && this.rh_account_type == aCHTransferDetails.rh_account_type && Intrinsics.areEqual(this.instant_used, aCHTransferDetails.instant_used) && Intrinsics.areEqual(this.submitted_date, aCHTransferDetails.submitted_date) && Intrinsics.areEqual(this.partner_bank, aCHTransferDetails.partner_bank) && this.rh_entity_type == aCHTransferDetails.rh_entity_type && this.source_type == aCHTransferDetails.source_type && this.purpose == aCHTransferDetails.purpose && Intrinsics.areEqual(this.settlement_date, aCHTransferDetails.settlement_date);
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
        int iHashCode4 = (((((((((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37) + this.relationship_master_id.hashCode()) * 37) + this.bank_account_nickname.hashCode()) * 37) + this.bank_account_last_four.hashCode()) * 37) + this.bank_account_routing_number.hashCode()) * 37;
        Instant instant2 = this.expected_ach_landing_datetime;
        int iHashCode5 = (iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Date date = this.expected_ach_landing_date;
        int iHashCode6 = (iHashCode5 + (date != null ? date.hashCode() : 0)) * 37;
        Money money3 = this.reversal_fee;
        int iHashCode7 = (((((iHashCode6 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.reversal_reason.hashCode()) * 37) + this.return_reason.hashCode()) * 37;
        Instant instant3 = this.fees_reversed_at;
        int iHashCode8 = (((((((iHashCode7 + (instant3 != null ? instant3.hashCode() : 0)) * 37) + Boolean.hashCode(this.scheduled)) * 37) + this.investment_schedule_id.hashCode()) * 37) + this.rh_account_type.hashCode()) * 37;
        Money money4 = this.instant_used;
        int iHashCode9 = (iHashCode8 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Date date2 = this.submitted_date;
        int iHashCode10 = (((((((((iHashCode9 + (date2 != null ? date2.hashCode() : 0)) * 37) + this.partner_bank.hashCode()) * 37) + this.rh_entity_type.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.purpose.hashCode()) * 37;
        Date date3 = this.settlement_date;
        int iHashCode11 = iHashCode10 + (date3 != null ? date3.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
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
        Instant instant2 = this.expected_ach_landing_datetime;
        if (instant2 != null) {
            arrayList.add("expected_ach_landing_datetime=" + instant2);
        }
        Date date = this.expected_ach_landing_date;
        if (date != null) {
            arrayList.add("expected_ach_landing_date=" + date);
        }
        Money money3 = this.reversal_fee;
        if (money3 != null) {
            arrayList.add("reversal_fee=" + money3);
        }
        arrayList.add("reversal_reason=" + Internal.sanitize(this.reversal_reason));
        arrayList.add("return_reason=" + this.return_reason);
        Instant instant3 = this.fees_reversed_at;
        if (instant3 != null) {
            arrayList.add("fees_reversed_at=" + instant3);
        }
        arrayList.add("scheduled=" + this.scheduled);
        arrayList.add("investment_schedule_id=" + this.investment_schedule_id);
        arrayList.add("rh_account_type=" + this.rh_account_type);
        Money money4 = this.instant_used;
        if (money4 != null) {
            arrayList.add("instant_used=" + money4);
        }
        Date date2 = this.submitted_date;
        if (date2 != null) {
            arrayList.add("submitted_date=" + date2);
        }
        arrayList.add("partner_bank=" + Internal.sanitize(this.partner_bank));
        arrayList.add("rh_entity_type=" + this.rh_entity_type);
        arrayList.add("source_type=" + this.source_type);
        arrayList.add("purpose=" + this.purpose);
        Date date3 = this.settlement_date;
        if (date3 != null) {
            arrayList.add("settlement_date=" + date3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ACHTransferDetails{", "}", 0, null, null, 56, null);
    }

    public final ACHTransferDetails copy(ByteString transfer_id, Direction direction, State state, Money amount, Money vulnerable_aml_amount, Instant created_at, ByteString relationship_master_id, String bank_account_nickname, String bank_account_last_four, String bank_account_routing_number, Instant expected_ach_landing_datetime, Date expected_ach_landing_date, Money reversal_fee, String reversal_reason, ReturnReason return_reason, Instant fees_reversed_at, boolean scheduled, ByteString investment_schedule_id, AccountType rh_account_type, Money instant_used, Date submitted_date, String partner_bank, RHEntity rh_entity_type, TransferEvent source_type, Purpose purpose, Date settlement_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship_master_id, "relationship_master_id");
        Intrinsics.checkNotNullParameter(bank_account_nickname, "bank_account_nickname");
        Intrinsics.checkNotNullParameter(bank_account_last_four, "bank_account_last_four");
        Intrinsics.checkNotNullParameter(bank_account_routing_number, "bank_account_routing_number");
        Intrinsics.checkNotNullParameter(reversal_reason, "reversal_reason");
        Intrinsics.checkNotNullParameter(return_reason, "return_reason");
        Intrinsics.checkNotNullParameter(investment_schedule_id, "investment_schedule_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(partner_bank, "partner_bank");
        Intrinsics.checkNotNullParameter(rh_entity_type, "rh_entity_type");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ACHTransferDetails(transfer_id, direction, state, amount, vulnerable_aml_amount, created_at, relationship_master_id, bank_account_nickname, bank_account_last_four, bank_account_routing_number, expected_ach_landing_datetime, expected_ach_landing_date, reversal_fee, reversal_reason, return_reason, fees_reversed_at, scheduled, investment_schedule_id, rh_account_type, instant_used, submitted_date, partner_bank, rh_entity_type, source_type, purpose, settlement_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ACHTransferDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ACHTransferDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.ACHTransferDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ACHTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString transfer_id = value.getTransfer_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(transfer_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getTransfer_id());
                }
                if (value.getDirection() != ACHTransferDetails.Direction.DIRECTION_UNSPECIFIED) {
                    size += ACHTransferDetails.Direction.ADAPTER.encodedSizeWithTag(2, value.getDirection());
                }
                if (value.getState() != ACHTransferDetails.State.STATE_UNSPECIFIED) {
                    size += ACHTransferDetails.State.ADAPTER.encodedSizeWithTag(3, value.getState());
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
                if (value.getExpected_ach_landing_datetime() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getExpected_ach_landing_datetime());
                }
                if (value.getExpected_ach_landing_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(12, value.getExpected_ach_landing_date());
                }
                if (value.getReversal_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(13, value.getReversal_fee());
                }
                if (!Intrinsics.areEqual(value.getReversal_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getReversal_reason());
                }
                if (value.getReturn_reason() != ACHTransferDetails.ReturnReason.RETURN_REASON_UNSPECIFIED) {
                    size += ACHTransferDetails.ReturnReason.ADAPTER.encodedSizeWithTag(15, value.getReturn_reason());
                }
                if (value.getFees_reversed_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(16, value.getFees_reversed_at());
                }
                if (value.getScheduled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getScheduled()));
                }
                if (!Intrinsics.areEqual(value.getInvestment_schedule_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(18, value.getInvestment_schedule_id());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(19, value.getRh_account_type());
                }
                if (value.getInstant_used() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(20, value.getInstant_used());
                }
                if (value.getSubmitted_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(21, value.getSubmitted_date());
                }
                if (!Intrinsics.areEqual(value.getPartner_bank(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getPartner_bank());
                }
                if (value.getRh_entity_type() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    size += RHEntity.ADAPTER.encodedSizeWithTag(23, value.getRh_entity_type());
                }
                if (value.getSource_type() != TransferEvent.SOURCE_TYPE_UNSPECIFIED) {
                    size += TransferEvent.ADAPTER.encodedSizeWithTag(24, value.getSource_type());
                }
                if (value.getPurpose() != ACHTransferDetails.Purpose.PURPOSE_UNSPECIFIED) {
                    size += ACHTransferDetails.Purpose.ADAPTER.encodedSizeWithTag(25, value.getPurpose());
                }
                return value.getSettlement_date() != null ? size + Date.ADAPTER.encodedSizeWithTag(26, value.getSettlement_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ACHTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString transfer_id = value.getTransfer_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(transfer_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getTransfer_id());
                }
                if (value.getDirection() != ACHTransferDetails.Direction.DIRECTION_UNSPECIFIED) {
                    ACHTransferDetails.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (value.getState() != ACHTransferDetails.State.STATE_UNSPECIFIED) {
                    ACHTransferDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
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
                if (value.getExpected_ach_landing_datetime() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getExpected_ach_landing_datetime());
                }
                if (value.getExpected_ach_landing_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 12, (int) value.getExpected_ach_landing_date());
                }
                if (value.getReversal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getReversal_fee());
                }
                if (!Intrinsics.areEqual(value.getReversal_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getReversal_reason());
                }
                if (value.getReturn_reason() != ACHTransferDetails.ReturnReason.RETURN_REASON_UNSPECIFIED) {
                    ACHTransferDetails.ReturnReason.ADAPTER.encodeWithTag(writer, 15, (int) value.getReturn_reason());
                }
                if (value.getFees_reversed_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 16, (int) value.getFees_reversed_at());
                }
                if (value.getScheduled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getScheduled()));
                }
                if (!Intrinsics.areEqual(value.getInvestment_schedule_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 18, (int) value.getInvestment_schedule_id());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 19, (int) value.getRh_account_type());
                }
                if (value.getInstant_used() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 20, (int) value.getInstant_used());
                }
                if (value.getSubmitted_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 21, (int) value.getSubmitted_date());
                }
                if (!Intrinsics.areEqual(value.getPartner_bank(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getPartner_bank());
                }
                if (value.getRh_entity_type() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 23, (int) value.getRh_entity_type());
                }
                if (value.getSource_type() != TransferEvent.SOURCE_TYPE_UNSPECIFIED) {
                    TransferEvent.ADAPTER.encodeWithTag(writer, 24, (int) value.getSource_type());
                }
                if (value.getPurpose() != ACHTransferDetails.Purpose.PURPOSE_UNSPECIFIED) {
                    ACHTransferDetails.Purpose.ADAPTER.encodeWithTag(writer, 25, (int) value.getPurpose());
                }
                if (value.getSettlement_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 26, (int) value.getSettlement_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ACHTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSettlement_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 26, (int) value.getSettlement_date());
                }
                if (value.getPurpose() != ACHTransferDetails.Purpose.PURPOSE_UNSPECIFIED) {
                    ACHTransferDetails.Purpose.ADAPTER.encodeWithTag(writer, 25, (int) value.getPurpose());
                }
                if (value.getSource_type() != TransferEvent.SOURCE_TYPE_UNSPECIFIED) {
                    TransferEvent.ADAPTER.encodeWithTag(writer, 24, (int) value.getSource_type());
                }
                if (value.getRh_entity_type() != RHEntity.ENTITY_TYPE_UNSPECIFIED) {
                    RHEntity.ADAPTER.encodeWithTag(writer, 23, (int) value.getRh_entity_type());
                }
                if (!Intrinsics.areEqual(value.getPartner_bank(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getPartner_bank());
                }
                if (value.getSubmitted_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 21, (int) value.getSubmitted_date());
                }
                if (value.getInstant_used() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 20, (int) value.getInstant_used());
                }
                if (value.getRh_account_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 19, (int) value.getRh_account_type());
                }
                ByteString investment_schedule_id = value.getInvestment_schedule_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(investment_schedule_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 18, (int) value.getInvestment_schedule_id());
                }
                if (value.getScheduled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getScheduled()));
                }
                if (value.getFees_reversed_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 16, (int) value.getFees_reversed_at());
                }
                if (value.getReturn_reason() != ACHTransferDetails.ReturnReason.RETURN_REASON_UNSPECIFIED) {
                    ACHTransferDetails.ReturnReason.ADAPTER.encodeWithTag(writer, 15, (int) value.getReturn_reason());
                }
                if (!Intrinsics.areEqual(value.getReversal_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getReversal_reason());
                }
                if (value.getReversal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getReversal_fee());
                }
                if (value.getExpected_ach_landing_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 12, (int) value.getExpected_ach_landing_date());
                }
                if (value.getExpected_ach_landing_datetime() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getExpected_ach_landing_datetime());
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
                if (!Intrinsics.areEqual(value.getRelationship_master_id(), byteString)) {
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
                if (value.getState() != ACHTransferDetails.State.STATE_UNSPECIFIED) {
                    ACHTransferDetails.State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getDirection() != ACHTransferDetails.Direction.DIRECTION_UNSPECIFIED) {
                    ACHTransferDetails.Direction.ADAPTER.encodeWithTag(writer, 2, (int) value.getDirection());
                }
                if (Intrinsics.areEqual(value.getTransfer_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getTransfer_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ACHTransferDetails decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                ByteString byteString2;
                ACHTransferDetails.Direction direction;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString3 = ByteString.EMPTY;
                ACHTransferDetails.Direction direction2 = ACHTransferDetails.Direction.DIRECTION_UNSPECIFIED;
                ACHTransferDetails.State state = ACHTransferDetails.State.STATE_UNSPECIFIED;
                ACHTransferDetails.ReturnReason returnReason = ACHTransferDetails.ReturnReason.RETURN_REASON_UNSPECIFIED;
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                RHEntity rHEntity = RHEntity.ENTITY_TYPE_UNSPECIFIED;
                TransferEvent transferEvent = TransferEvent.SOURCE_TYPE_UNSPECIFIED;
                ACHTransferDetails.Purpose purpose = ACHTransferDetails.Purpose.PURPOSE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ByteString byteStringDecode = byteString3;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Date dateDecode = null;
                Money moneyDecode3 = null;
                Instant instantDecode3 = null;
                Money moneyDecode4 = null;
                Date dateDecode2 = null;
                Date dateDecode3 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                boolean zBooleanValue = false;
                RHEntity rHEntityDecode = rHEntity;
                TransferEvent transferEventDecode = transferEvent;
                ACHTransferDetails.Purpose purposeDecode = purpose;
                ACHTransferDetails.State stateDecode = state;
                ACHTransferDetails.ReturnReason returnReasonDecode = returnReason;
                AccountType accountTypeDecode = accountType;
                ByteString byteStringDecode2 = byteStringDecode;
                ByteString byteStringDecode3 = byteStringDecode2;
                ACHTransferDetails.Direction directionDecode = direction2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 2:
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                try {
                                    directionDecode = ACHTransferDetails.Direction.ADAPTER.decode(reader);
                                    byteStringDecode2 = byteString;
                                    byteStringDecode3 = byteString2;
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                try {
                                    stateDecode = ACHTransferDetails.State.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 7:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 12:
                                dateDecode = Date.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 14:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                try {
                                    returnReasonDecode = ACHTransferDetails.ReturnReason.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 16:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 17:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 18:
                                byteStringDecode3 = ProtoAdapter.BYTES.decode(reader);
                                continue;
                            case 19:
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                try {
                                    accountTypeDecode = AccountType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 20:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                continue;
                            case 21:
                                dateDecode2 = Date.ADAPTER.decode(reader);
                                continue;
                            case 22:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 23:
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                try {
                                    rHEntityDecode = RHEntity.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 24:
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                try {
                                    transferEventDecode = TransferEvent.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            case 25:
                                try {
                                    purposeDecode = ACHTransferDetails.Purpose.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    byteString = byteStringDecode2;
                                    byteString2 = byteStringDecode3;
                                    direction = directionDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                    break;
                                }
                            case 26:
                                dateDecode3 = Date.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                byteString = byteStringDecode2;
                                byteString2 = byteStringDecode3;
                                direction = directionDecode;
                                break;
                        }
                        byteStringDecode2 = byteString;
                        byteStringDecode3 = byteString2;
                        directionDecode = direction;
                    } else {
                        return new ACHTransferDetails(byteStringDecode, directionDecode, stateDecode, moneyDecode, moneyDecode2, instantDecode, byteStringDecode2, strDecode, strDecode2, strDecode3, instantDecode2, dateDecode, moneyDecode3, strDecode4, returnReasonDecode, instantDecode3, zBooleanValue, byteStringDecode3, accountTypeDecode, moneyDecode4, dateDecode2, strDecode5, rHEntityDecode, transferEventDecode, purposeDecode, dateDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ACHTransferDetails redact(ACHTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Money vulnerable_aml_amount = value.getVulnerable_aml_amount();
                Money moneyRedact2 = vulnerable_aml_amount != null ? Money.ADAPTER.redact(vulnerable_aml_amount) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant expected_ach_landing_datetime = value.getExpected_ach_landing_datetime();
                Instant instantRedact2 = expected_ach_landing_datetime != null ? ProtoAdapter.INSTANT.redact(expected_ach_landing_datetime) : null;
                Date expected_ach_landing_date = value.getExpected_ach_landing_date();
                Date dateRedact = expected_ach_landing_date != null ? Date.ADAPTER.redact(expected_ach_landing_date) : null;
                Money reversal_fee = value.getReversal_fee();
                Money moneyRedact3 = reversal_fee != null ? Money.ADAPTER.redact(reversal_fee) : null;
                Instant fees_reversed_at = value.getFees_reversed_at();
                Instant instantRedact3 = fees_reversed_at != null ? ProtoAdapter.INSTANT.redact(fees_reversed_at) : null;
                Money instant_used = value.getInstant_used();
                Money moneyRedact4 = instant_used != null ? Money.ADAPTER.redact(instant_used) : null;
                Date submitted_date = value.getSubmitted_date();
                Date dateRedact2 = submitted_date != null ? Date.ADAPTER.redact(submitted_date) : null;
                Date settlement_date = value.getSettlement_date();
                return value.copy((31941575 & 1) != 0 ? value.transfer_id : null, (31941575 & 2) != 0 ? value.direction : null, (31941575 & 4) != 0 ? value.state : null, (31941575 & 8) != 0 ? value.amount : moneyRedact, (31941575 & 16) != 0 ? value.vulnerable_aml_amount : moneyRedact2, (31941575 & 32) != 0 ? value.created_at : instantRedact, (31941575 & 64) != 0 ? value.relationship_master_id : null, (31941575 & 128) != 0 ? value.bank_account_nickname : null, (31941575 & 256) != 0 ? value.bank_account_last_four : null, (31941575 & 512) != 0 ? value.bank_account_routing_number : null, (31941575 & 1024) != 0 ? value.expected_ach_landing_datetime : instantRedact2, (31941575 & 2048) != 0 ? value.expected_ach_landing_date : dateRedact, (31941575 & 4096) != 0 ? value.reversal_fee : moneyRedact3, (31941575 & 8192) != 0 ? value.reversal_reason : null, (31941575 & 16384) != 0 ? value.return_reason : null, (31941575 & 32768) != 0 ? value.fees_reversed_at : instantRedact3, (31941575 & 65536) != 0 ? value.scheduled : false, (31941575 & 131072) != 0 ? value.investment_schedule_id : null, (31941575 & 262144) != 0 ? value.rh_account_type : null, (31941575 & 524288) != 0 ? value.instant_used : moneyRedact4, (31941575 & 1048576) != 0 ? value.submitted_date : dateRedact2, (31941575 & 2097152) != 0 ? value.partner_bank : null, (31941575 & 4194304) != 0 ? value.rh_entity_type : null, (31941575 & 8388608) != 0 ? value.source_type : null, (31941575 & 16777216) != 0 ? value.purpose : null, (31941575 & 33554432) != 0 ? value.settlement_date : settlement_date != null ? Date.ADAPTER.redact(settlement_date) : null, (31941575 & 67108864) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "NEW", "REQUESTED", "NEEDS_APPROVAL", "APPROVED", "REJECTED", "CANCELLED", "FAILED", "SUBMITTED", "REVERSED", "COMPLETED", "PENDING_CANCEL", "REVIEWING_BALANCE", "ABORTED", "QUEUED", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ABORTED;

        @JvmField
        public static final ProtoAdapter<State> ADAPTER;
        public static final State APPROVED;
        public static final State CANCELLED;
        public static final State COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State FAILED;
        public static final State NEEDS_APPROVAL;
        public static final State NEW;
        public static final State PENDING_CANCEL;
        public static final State QUEUED;
        public static final State REJECTED;
        public static final State REQUESTED;
        public static final State REVERSED;
        public static final State REVIEWING_BALANCE;
        public static final State STATE_UNSPECIFIED;
        public static final State SUBMITTED;
        private final int value;

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_UNSPECIFIED, NEW, REQUESTED, NEEDS_APPROVAL, APPROVED, REJECTED, CANCELLED, FAILED, SUBMITTED, REVERSED, COMPLETED, PENDING_CANCEL, REVIEWING_BALANCE, ABORTED, QUEUED};
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
            NEW = new State("NEW", 1, 1);
            REQUESTED = new State("REQUESTED", 2, 2);
            NEEDS_APPROVAL = new State("NEEDS_APPROVAL", 3, 3);
            APPROVED = new State("APPROVED", 4, 4);
            REJECTED = new State("REJECTED", 5, 5);
            CANCELLED = new State("CANCELLED", 6, 6);
            FAILED = new State("FAILED", 7, 7);
            SUBMITTED = new State("SUBMITTED", 8, 8);
            REVERSED = new State("REVERSED", 9, 9);
            COMPLETED = new State("COMPLETED", 10, 10);
            PENDING_CANCEL = new State("PENDING_CANCEL", 11, 11);
            REVIEWING_BALANCE = new State("REVIEWING_BALANCE", 12, 12);
            ABORTED = new State("ABORTED", 13, 13);
            QUEUED = new State("QUEUED", 14, 14);
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: com.robinhood.rosetta.cashier.ACHTransferDetails$State$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHTransferDetails.State fromValue(int value) {
                    return ACHTransferDetails.State.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$State;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return State.NEW;
                    case 2:
                        return State.REQUESTED;
                    case 3:
                        return State.NEEDS_APPROVAL;
                    case 4:
                        return State.APPROVED;
                    case 5:
                        return State.REJECTED;
                    case 6:
                        return State.CANCELLED;
                    case 7:
                        return State.FAILED;
                    case 8:
                        return State.SUBMITTED;
                    case 9:
                        return State.REVERSED;
                    case 10:
                        return State.COMPLETED;
                    case 11:
                        return State.PENDING_CANCEL;
                    case 12:
                        return State.REVIEWING_BALANCE;
                    case 13:
                        return State.ABORTED;
                    case 14:
                        return State.QUEUED;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_UNSPECIFIED", "DEPOSIT", "WITHDRAW", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Direction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DEPOSIT;
        public static final Direction DIRECTION_UNSPECIFIED;
        public static final Direction WITHDRAW;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{DIRECTION_UNSPECIFIED, DEPOSIT, WITHDRAW};
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
            DEPOSIT = new Direction("DEPOSIT", 1, 1);
            WITHDRAW = new Direction("WITHDRAW", 2, 2);
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: com.robinhood.rosetta.cashier.ACHTransferDetails$Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHTransferDetails.Direction fromValue(int value) {
                    return ACHTransferDetails.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Direction;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RETURN_REASON_UNSPECIFIED", "INSUFFICIENT_FUNDS", "ACCOUNT_CLOSED", "NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT", "INVALID_ACCOUNT_NUMBER", "RETURN_REQUESTED_BY_CUSTOMER_BANK", "AUTHORIZATION_REVOKED_BY_CUSTOMER", "PAYMENT_STOPPED", "UNCOLLECTED_FUNDS", "CUSTOMER_ADVISES_NOT_AUTHORIZED", "BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION", "RDFI_CANNOT_ACCEPT_TRANSFERS", "BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED", "ACCOUNT_FROZEN", "NON_TRANSACTION_ACCOUNT", "CREDIT_ENTRY_REFUSED_BY_RECEIVER", "DUPLICATE_ENTRY", "CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED", "INVALID_TRANSACTION_CODE", "CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReturnReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReturnReason[] $VALUES;
        public static final ReturnReason ACCOUNT_CLOSED;
        public static final ReturnReason ACCOUNT_FROZEN;

        @JvmField
        public static final ProtoAdapter<ReturnReason> ADAPTER;
        public static final ReturnReason AUTHORIZATION_REVOKED_BY_CUSTOMER;
        public static final ReturnReason BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED;
        public static final ReturnReason BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION;
        public static final ReturnReason CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED;
        public static final ReturnReason CREDIT_ENTRY_REFUSED_BY_RECEIVER;

        /* renamed from: CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS */
        public static final ReturnReason f5958xcde576cc;
        public static final ReturnReason CUSTOMER_ADVISES_NOT_AUTHORIZED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ReturnReason DUPLICATE_ENTRY;
        public static final ReturnReason INSUFFICIENT_FUNDS;
        public static final ReturnReason INVALID_ACCOUNT_NUMBER;
        public static final ReturnReason INVALID_TRANSACTION_CODE;
        public static final ReturnReason NON_TRANSACTION_ACCOUNT;
        public static final ReturnReason NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT;
        public static final ReturnReason PAYMENT_STOPPED;
        public static final ReturnReason RDFI_CANNOT_ACCEPT_TRANSFERS;
        public static final ReturnReason RETURN_REASON_UNSPECIFIED;
        public static final ReturnReason RETURN_REQUESTED_BY_CUSTOMER_BANK;
        public static final ReturnReason UNCOLLECTED_FUNDS;
        private final int value;

        private static final /* synthetic */ ReturnReason[] $values() {
            return new ReturnReason[]{RETURN_REASON_UNSPECIFIED, INSUFFICIENT_FUNDS, ACCOUNT_CLOSED, NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT, INVALID_ACCOUNT_NUMBER, RETURN_REQUESTED_BY_CUSTOMER_BANK, AUTHORIZATION_REVOKED_BY_CUSTOMER, PAYMENT_STOPPED, UNCOLLECTED_FUNDS, CUSTOMER_ADVISES_NOT_AUTHORIZED, BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION, RDFI_CANNOT_ACCEPT_TRANSFERS, BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED, ACCOUNT_FROZEN, NON_TRANSACTION_ACCOUNT, CREDIT_ENTRY_REFUSED_BY_RECEIVER, DUPLICATE_ENTRY, CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED, INVALID_TRANSACTION_CODE, f5958xcde576cc};
        }

        @JvmStatic
        public static final ReturnReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ReturnReason> getEntries() {
            return $ENTRIES;
        }

        private ReturnReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ReturnReason returnReason = new ReturnReason("RETURN_REASON_UNSPECIFIED", 0, 0);
            RETURN_REASON_UNSPECIFIED = returnReason;
            INSUFFICIENT_FUNDS = new ReturnReason("INSUFFICIENT_FUNDS", 1, 1);
            ACCOUNT_CLOSED = new ReturnReason("ACCOUNT_CLOSED", 2, 2);
            NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT = new ReturnReason("NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT", 3, 3);
            INVALID_ACCOUNT_NUMBER = new ReturnReason("INVALID_ACCOUNT_NUMBER", 4, 4);
            RETURN_REQUESTED_BY_CUSTOMER_BANK = new ReturnReason("RETURN_REQUESTED_BY_CUSTOMER_BANK", 5, 5);
            AUTHORIZATION_REVOKED_BY_CUSTOMER = new ReturnReason("AUTHORIZATION_REVOKED_BY_CUSTOMER", 6, 6);
            PAYMENT_STOPPED = new ReturnReason("PAYMENT_STOPPED", 7, 7);
            UNCOLLECTED_FUNDS = new ReturnReason("UNCOLLECTED_FUNDS", 8, 8);
            CUSTOMER_ADVISES_NOT_AUTHORIZED = new ReturnReason("CUSTOMER_ADVISES_NOT_AUTHORIZED", 9, 9);
            BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION = new ReturnReason("BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION", 10, 10);
            RDFI_CANNOT_ACCEPT_TRANSFERS = new ReturnReason("RDFI_CANNOT_ACCEPT_TRANSFERS", 11, 11);
            BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED = new ReturnReason("BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED", 12, 12);
            ACCOUNT_FROZEN = new ReturnReason("ACCOUNT_FROZEN", 13, 13);
            NON_TRANSACTION_ACCOUNT = new ReturnReason("NON_TRANSACTION_ACCOUNT", 14, 14);
            CREDIT_ENTRY_REFUSED_BY_RECEIVER = new ReturnReason("CREDIT_ENTRY_REFUSED_BY_RECEIVER", 15, 15);
            DUPLICATE_ENTRY = new ReturnReason("DUPLICATE_ENTRY", 16, 16);
            CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED = new ReturnReason("CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED", 17, 17);
            INVALID_TRANSACTION_CODE = new ReturnReason("INVALID_TRANSACTION_CODE", 18, 18);
            f5958xcde576cc = new ReturnReason("CUSTOMER_ADVISES_ENTRY_NOT_IN_ACCORDANCE_WITH_AUTHORIZATION_TERMS", 19, 19);
            ReturnReason[] returnReasonArr$values = $values();
            $VALUES = returnReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(returnReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReturnReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ReturnReason>(orCreateKotlinClass, syntax, returnReason) { // from class: com.robinhood.rosetta.cashier.ACHTransferDetails$ReturnReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHTransferDetails.ReturnReason fromValue(int value) {
                    return ACHTransferDetails.ReturnReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$ReturnReason;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ReturnReason fromValue(int value) {
                switch (value) {
                    case 0:
                        return ReturnReason.RETURN_REASON_UNSPECIFIED;
                    case 1:
                        return ReturnReason.INSUFFICIENT_FUNDS;
                    case 2:
                        return ReturnReason.ACCOUNT_CLOSED;
                    case 3:
                        return ReturnReason.NO_ACCOUNT_OR_UNABLE_TO_LOCATE_ACCOUNT;
                    case 4:
                        return ReturnReason.INVALID_ACCOUNT_NUMBER;
                    case 5:
                        return ReturnReason.RETURN_REQUESTED_BY_CUSTOMER_BANK;
                    case 6:
                        return ReturnReason.AUTHORIZATION_REVOKED_BY_CUSTOMER;
                    case 7:
                        return ReturnReason.PAYMENT_STOPPED;
                    case 8:
                        return ReturnReason.UNCOLLECTED_FUNDS;
                    case 9:
                        return ReturnReason.CUSTOMER_ADVISES_NOT_AUTHORIZED;
                    case 10:
                        return ReturnReason.BRANCH_SOLD_TO_ANOTHER_FINANCIAL_INSTITUTION;
                    case 11:
                        return ReturnReason.RDFI_CANNOT_ACCEPT_TRANSFERS;
                    case 12:
                        return ReturnReason.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED;
                    case 13:
                        return ReturnReason.ACCOUNT_FROZEN;
                    case 14:
                        return ReturnReason.NON_TRANSACTION_ACCOUNT;
                    case 15:
                        return ReturnReason.CREDIT_ENTRY_REFUSED_BY_RECEIVER;
                    case 16:
                        return ReturnReason.DUPLICATE_ENTRY;
                    case 17:
                        return ReturnReason.CORPORATE_CUSTOMER_ADVISES_NOT_AUTHORIZED;
                    case 18:
                        return ReturnReason.INVALID_TRANSACTION_CODE;
                    case 19:
                        return ReturnReason.f5958xcde576cc;
                    default:
                        return null;
                }
            }
        }

        public static ReturnReason valueOf(String str) {
            return (ReturnReason) Enum.valueOf(ReturnReason.class, str);
        }

        public static ReturnReason[] values() {
            return (ReturnReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ACHTransferDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PURPOSE_UNSPECIFIED", "MICRODEPOSIT", "PULLBACK", "REGULAR", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Purpose implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Purpose[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Purpose> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Purpose MICRODEPOSIT;
        public static final Purpose PULLBACK;
        public static final Purpose PURPOSE_UNSPECIFIED;
        public static final Purpose REGULAR;
        private final int value;

        private static final /* synthetic */ Purpose[] $values() {
            return new Purpose[]{PURPOSE_UNSPECIFIED, MICRODEPOSIT, PULLBACK, REGULAR};
        }

        @JvmStatic
        public static final Purpose fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Purpose> getEntries() {
            return $ENTRIES;
        }

        private Purpose(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Purpose purpose = new Purpose("PURPOSE_UNSPECIFIED", 0, 0);
            PURPOSE_UNSPECIFIED = purpose;
            MICRODEPOSIT = new Purpose("MICRODEPOSIT", 1, 1);
            PULLBACK = new Purpose("PULLBACK", 2, 2);
            REGULAR = new Purpose("REGULAR", 3, 3);
            Purpose[] purposeArr$values = $values();
            $VALUES = purposeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(purposeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Purpose.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Purpose>(orCreateKotlinClass, syntax, purpose) { // from class: com.robinhood.rosetta.cashier.ACHTransferDetails$Purpose$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ACHTransferDetails.Purpose fromValue(int value) {
                    return ACHTransferDetails.Purpose.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ACHTransferDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails$Purpose;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Purpose fromValue(int value) {
                if (value == 0) {
                    return Purpose.PURPOSE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Purpose.MICRODEPOSIT;
                }
                if (value == 2) {
                    return Purpose.PULLBACK;
                }
                if (value != 3) {
                    return null;
                }
                return Purpose.REGULAR;
            }
        }

        public static Purpose valueOf(String str) {
            return (Purpose) Enum.valueOf(Purpose.class, str);
        }

        public static Purpose[] values() {
            return (Purpose[]) $VALUES.clone();
        }
    }
}
