package nimbus.service.p511v1;

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
import java.util.List;
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
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: AssetTransferRecord.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b0\u0018\u0000 `2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001`B¯\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\b\b\u0002\u0010 \u001a\u00020\u001d\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010&\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0017¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u00105Jµ\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u00105R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u00105R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b;\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\b\u0010\u0010IR\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bJ\u00105R\"\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010MR\"\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bN\u0010MR\"\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bO\u0010MR\"\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bP\u0010MR\"\u0010\u0018\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bQ\u0010MR\u001a\u0010\u001c\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010H\u001a\u0004\b\u001c\u0010IR\u001a\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010\u001f\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010H\u001a\u0004\b\u001f\u0010IR\u001a\u0010 \u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010R\u001a\u0004\bU\u0010TR\u001a\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\bV\u00105R\u001a\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\bW\u00105R\u001a\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\bX\u00105R\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010&\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010Y\u001a\u0004\b\\\u0010[R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010]\u001a\u0004\b^\u0010_¨\u0006a"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecord;", "Lcom/squareup/wire/Message;", "", "", "id", "source_rhs_account_number", "destination_rhs_account_number", "Lnimbus/service/v1/AssetTransferState;", "state", "Lnimbus/service/v1/AssetTransferFailureReason;", "failure_reason", "Lnimbus/service/v1/AssetTransferType;", "transfer_type", "Lnimbus/service/v1/AssetTransferSubType;", "transfer_sub_type", "", "is_partial", "cash_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "record_date", "initiated_at", "completed_at", "created_at", "updated_at", "", "Lnimbus/service/v1/EquityPosition;", "equity_positions", "is_owner_source_account", "Lrosetta/account/BrokerageAccountType;", "source_brokerage_account_type", "is_owner_destination_account", "destination_brokerage_account_type", "source_rhf_account_number", "destination_rhf_account_number", "acats_match_movement_amount", "Lrosetta/account/ManagementType;", "source_account_management_type", "destination_account_management_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnimbus/service/v1/AssetTransferState;Lnimbus/service/v1/AssetTransferFailureReason;Lnimbus/service/v1/AssetTransferType;Lnimbus/service/v1/AssetTransferSubType;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;ZLrosetta/account/BrokerageAccountType;ZLrosetta/account/BrokerageAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/account/ManagementType;Lrosetta/account/ManagementType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnimbus/service/v1/AssetTransferState;Lnimbus/service/v1/AssetTransferFailureReason;Lnimbus/service/v1/AssetTransferType;Lnimbus/service/v1/AssetTransferSubType;ZLjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;ZLrosetta/account/BrokerageAccountType;ZLrosetta/account/BrokerageAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/account/ManagementType;Lrosetta/account/ManagementType;Lokio/ByteString;)Lnimbus/service/v1/AssetTransferRecord;", "Ljava/lang/String;", "getId", "getSource_rhs_account_number", "getDestination_rhs_account_number", "Lnimbus/service/v1/AssetTransferState;", "getState", "()Lnimbus/service/v1/AssetTransferState;", "Lnimbus/service/v1/AssetTransferFailureReason;", "getFailure_reason", "()Lnimbus/service/v1/AssetTransferFailureReason;", "Lnimbus/service/v1/AssetTransferType;", "getTransfer_type", "()Lnimbus/service/v1/AssetTransferType;", "Lnimbus/service/v1/AssetTransferSubType;", "getTransfer_sub_type", "()Lnimbus/service/v1/AssetTransferSubType;", "Z", "()Z", "getCash_amount", "Lj$/time/Instant;", "getRecord_date", "()Lj$/time/Instant;", "getInitiated_at", "getCompleted_at", "getCreated_at", "getUpdated_at", "Lrosetta/account/BrokerageAccountType;", "getSource_brokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "getDestination_brokerage_account_type", "getSource_rhf_account_number", "getDestination_rhf_account_number", "getAcats_match_movement_amount", "Lrosetta/account/ManagementType;", "getSource_account_management_type", "()Lrosetta/account/ManagementType;", "getDestination_account_management_type", "Ljava/util/List;", "getEquity_positions", "()Ljava/util/List;", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AssetTransferRecord extends Message {

    @JvmField
    public static final ProtoAdapter<AssetTransferRecord> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "acatsMatchMovementAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String acats_match_movement_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cashAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String cash_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "completedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Instant completed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant created_at;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "destinationAccountManagementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final ManagementType destination_account_management_type;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "destinationBrokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final BrokerageAccountType destination_brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "destinationRhfAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String destination_rhf_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "destinationRhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String destination_rhs_account_number;

    @WireField(adapter = "nimbus.service.v1.EquityPosition#ADAPTER", jsonName = "equityPositions", label = WireField.Label.REPEATED, schemaIndex = 14, tag = 15)
    private final List<EquityPosition> equity_positions;

    @WireField(adapter = "nimbus.service.v1.AssetTransferFailureReason#ADAPTER", jsonName = "failureReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AssetTransferFailureReason failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "initiatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant initiated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOwnerDestinationAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final boolean is_owner_destination_account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOwnerSourceAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final boolean is_owner_source_account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPartial", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean is_partial;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Instant record_date;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "sourceAccountManagementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final ManagementType source_account_management_type;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "sourceBrokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final BrokerageAccountType source_brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceRhfAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String source_rhf_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceRhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source_rhs_account_number;

    @WireField(adapter = "nimbus.service.v1.AssetTransferState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AssetTransferState state;

    @WireField(adapter = "nimbus.service.v1.AssetTransferSubType#ADAPTER", jsonName = "transferSubType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final AssetTransferSubType transfer_sub_type;

    @WireField(adapter = "nimbus.service.v1.AssetTransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final AssetTransferType transfer_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final Instant updated_at;

    public AssetTransferRecord() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 33554431, null);
    }

    public /* synthetic */ AssetTransferRecord(String str, String str2, String str3, AssetTransferState assetTransferState, AssetTransferFailureReason assetTransferFailureReason, AssetTransferType assetTransferType, AssetTransferSubType assetTransferSubType, boolean z, String str4, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List list, boolean z2, BrokerageAccountType brokerageAccountType, boolean z3, BrokerageAccountType brokerageAccountType2, String str5, String str6, String str7, ManagementType managementType, ManagementType managementType2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AssetTransferState.STATE_UNSPECIFIED : assetTransferState, (i & 16) != 0 ? AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED : assetTransferFailureReason, (i & 32) != 0 ? AssetTransferType.TYPE_UNSPECIFIED : assetTransferType, (i & 64) != 0 ? AssetTransferSubType.SUBTYPE_UNSPECIFIED : assetTransferSubType, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? null : instant, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : instant3, (i & 4096) != 0 ? null : instant4, (i & 8192) != 0 ? null : instant5, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 131072) != 0 ? false : z3, (i & 262144) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType2, (i & 524288) != 0 ? "" : str5, (i & 1048576) != 0 ? "" : str6, (i & 2097152) == 0 ? str7 : "", (i & 4194304) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 8388608) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType2, (i & 16777216) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29348newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getSource_rhs_account_number() {
        return this.source_rhs_account_number;
    }

    public final String getDestination_rhs_account_number() {
        return this.destination_rhs_account_number;
    }

    public final AssetTransferState getState() {
        return this.state;
    }

    public final AssetTransferFailureReason getFailure_reason() {
        return this.failure_reason;
    }

    public final AssetTransferType getTransfer_type() {
        return this.transfer_type;
    }

    public final AssetTransferSubType getTransfer_sub_type() {
        return this.transfer_sub_type;
    }

    /* renamed from: is_partial, reason: from getter */
    public final boolean getIs_partial() {
        return this.is_partial;
    }

    public final String getCash_amount() {
        return this.cash_amount;
    }

    public final Instant getRecord_date() {
        return this.record_date;
    }

    public final Instant getInitiated_at() {
        return this.initiated_at;
    }

    public final Instant getCompleted_at() {
        return this.completed_at;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: is_owner_source_account, reason: from getter */
    public final boolean getIs_owner_source_account() {
        return this.is_owner_source_account;
    }

    public final BrokerageAccountType getSource_brokerage_account_type() {
        return this.source_brokerage_account_type;
    }

    /* renamed from: is_owner_destination_account, reason: from getter */
    public final boolean getIs_owner_destination_account() {
        return this.is_owner_destination_account;
    }

    public final BrokerageAccountType getDestination_brokerage_account_type() {
        return this.destination_brokerage_account_type;
    }

    public final String getSource_rhf_account_number() {
        return this.source_rhf_account_number;
    }

    public final String getDestination_rhf_account_number() {
        return this.destination_rhf_account_number;
    }

    public final String getAcats_match_movement_amount() {
        return this.acats_match_movement_amount;
    }

    public final ManagementType getSource_account_management_type() {
        return this.source_account_management_type;
    }

    public final ManagementType getDestination_account_management_type() {
        return this.destination_account_management_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetTransferRecord(String id, String source_rhs_account_number, String destination_rhs_account_number, AssetTransferState state, AssetTransferFailureReason failure_reason, AssetTransferType transfer_type, AssetTransferSubType transfer_sub_type, boolean z, String cash_amount, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List<EquityPosition> equity_positions, boolean z2, BrokerageAccountType source_brokerage_account_type, boolean z3, BrokerageAccountType destination_brokerage_account_type, String source_rhf_account_number, String destination_rhf_account_number, String acats_match_movement_amount, ManagementType source_account_management_type, ManagementType destination_account_management_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source_rhs_account_number, "source_rhs_account_number");
        Intrinsics.checkNotNullParameter(destination_rhs_account_number, "destination_rhs_account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_sub_type, "transfer_sub_type");
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
        Intrinsics.checkNotNullParameter(source_brokerage_account_type, "source_brokerage_account_type");
        Intrinsics.checkNotNullParameter(destination_brokerage_account_type, "destination_brokerage_account_type");
        Intrinsics.checkNotNullParameter(source_rhf_account_number, "source_rhf_account_number");
        Intrinsics.checkNotNullParameter(destination_rhf_account_number, "destination_rhf_account_number");
        Intrinsics.checkNotNullParameter(acats_match_movement_amount, "acats_match_movement_amount");
        Intrinsics.checkNotNullParameter(source_account_management_type, "source_account_management_type");
        Intrinsics.checkNotNullParameter(destination_account_management_type, "destination_account_management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.source_rhs_account_number = source_rhs_account_number;
        this.destination_rhs_account_number = destination_rhs_account_number;
        this.state = state;
        this.failure_reason = failure_reason;
        this.transfer_type = transfer_type;
        this.transfer_sub_type = transfer_sub_type;
        this.is_partial = z;
        this.cash_amount = cash_amount;
        this.record_date = instant;
        this.initiated_at = instant2;
        this.completed_at = instant3;
        this.created_at = instant4;
        this.updated_at = instant5;
        this.is_owner_source_account = z2;
        this.source_brokerage_account_type = source_brokerage_account_type;
        this.is_owner_destination_account = z3;
        this.destination_brokerage_account_type = destination_brokerage_account_type;
        this.source_rhf_account_number = source_rhf_account_number;
        this.destination_rhf_account_number = destination_rhf_account_number;
        this.acats_match_movement_amount = acats_match_movement_amount;
        this.source_account_management_type = source_account_management_type;
        this.destination_account_management_type = destination_account_management_type;
        this.equity_positions = Internal.immutableCopyOf("equity_positions", equity_positions);
    }

    public final List<EquityPosition> getEquity_positions() {
        return this.equity_positions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29348newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssetTransferRecord)) {
            return false;
        }
        AssetTransferRecord assetTransferRecord = (AssetTransferRecord) other;
        return Intrinsics.areEqual(unknownFields(), assetTransferRecord.unknownFields()) && Intrinsics.areEqual(this.id, assetTransferRecord.id) && Intrinsics.areEqual(this.source_rhs_account_number, assetTransferRecord.source_rhs_account_number) && Intrinsics.areEqual(this.destination_rhs_account_number, assetTransferRecord.destination_rhs_account_number) && this.state == assetTransferRecord.state && this.failure_reason == assetTransferRecord.failure_reason && this.transfer_type == assetTransferRecord.transfer_type && this.transfer_sub_type == assetTransferRecord.transfer_sub_type && this.is_partial == assetTransferRecord.is_partial && Intrinsics.areEqual(this.cash_amount, assetTransferRecord.cash_amount) && Intrinsics.areEqual(this.record_date, assetTransferRecord.record_date) && Intrinsics.areEqual(this.initiated_at, assetTransferRecord.initiated_at) && Intrinsics.areEqual(this.completed_at, assetTransferRecord.completed_at) && Intrinsics.areEqual(this.created_at, assetTransferRecord.created_at) && Intrinsics.areEqual(this.updated_at, assetTransferRecord.updated_at) && Intrinsics.areEqual(this.equity_positions, assetTransferRecord.equity_positions) && this.is_owner_source_account == assetTransferRecord.is_owner_source_account && this.source_brokerage_account_type == assetTransferRecord.source_brokerage_account_type && this.is_owner_destination_account == assetTransferRecord.is_owner_destination_account && this.destination_brokerage_account_type == assetTransferRecord.destination_brokerage_account_type && Intrinsics.areEqual(this.source_rhf_account_number, assetTransferRecord.source_rhf_account_number) && Intrinsics.areEqual(this.destination_rhf_account_number, assetTransferRecord.destination_rhf_account_number) && Intrinsics.areEqual(this.acats_match_movement_amount, assetTransferRecord.acats_match_movement_amount) && this.source_account_management_type == assetTransferRecord.source_account_management_type && this.destination_account_management_type == assetTransferRecord.destination_account_management_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.source_rhs_account_number.hashCode()) * 37) + this.destination_rhs_account_number.hashCode()) * 37) + this.state.hashCode()) * 37) + this.failure_reason.hashCode()) * 37) + this.transfer_type.hashCode()) * 37) + this.transfer_sub_type.hashCode()) * 37) + Boolean.hashCode(this.is_partial)) * 37) + this.cash_amount.hashCode()) * 37;
        Instant instant = this.record_date;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.initiated_at;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.completed_at;
        int iHashCode4 = (iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.created_at;
        int iHashCode5 = (iHashCode4 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        Instant instant5 = this.updated_at;
        int iHashCode6 = ((((((((((((((((((((iHashCode5 + (instant5 != null ? instant5.hashCode() : 0)) * 37) + this.equity_positions.hashCode()) * 37) + Boolean.hashCode(this.is_owner_source_account)) * 37) + this.source_brokerage_account_type.hashCode()) * 37) + Boolean.hashCode(this.is_owner_destination_account)) * 37) + this.destination_brokerage_account_type.hashCode()) * 37) + this.source_rhf_account_number.hashCode()) * 37) + this.destination_rhf_account_number.hashCode()) * 37) + this.acats_match_movement_amount.hashCode()) * 37) + this.source_account_management_type.hashCode()) * 37) + this.destination_account_management_type.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("source_rhs_account_number=" + Internal.sanitize(this.source_rhs_account_number));
        arrayList.add("destination_rhs_account_number=" + Internal.sanitize(this.destination_rhs_account_number));
        arrayList.add("state=" + this.state);
        arrayList.add("failure_reason=" + this.failure_reason);
        arrayList.add("transfer_type=" + this.transfer_type);
        arrayList.add("transfer_sub_type=" + this.transfer_sub_type);
        arrayList.add("is_partial=" + this.is_partial);
        arrayList.add("cash_amount=" + Internal.sanitize(this.cash_amount));
        Instant instant = this.record_date;
        if (instant != null) {
            arrayList.add("record_date=" + instant);
        }
        Instant instant2 = this.initiated_at;
        if (instant2 != null) {
            arrayList.add("initiated_at=" + instant2);
        }
        Instant instant3 = this.completed_at;
        if (instant3 != null) {
            arrayList.add("completed_at=" + instant3);
        }
        Instant instant4 = this.created_at;
        if (instant4 != null) {
            arrayList.add("created_at=" + instant4);
        }
        Instant instant5 = this.updated_at;
        if (instant5 != null) {
            arrayList.add("updated_at=" + instant5);
        }
        if (!this.equity_positions.isEmpty()) {
            arrayList.add("equity_positions=" + this.equity_positions);
        }
        arrayList.add("is_owner_source_account=" + this.is_owner_source_account);
        arrayList.add("source_brokerage_account_type=" + this.source_brokerage_account_type);
        arrayList.add("is_owner_destination_account=" + this.is_owner_destination_account);
        arrayList.add("destination_brokerage_account_type=" + this.destination_brokerage_account_type);
        arrayList.add("source_rhf_account_number=" + Internal.sanitize(this.source_rhf_account_number));
        arrayList.add("destination_rhf_account_number=" + Internal.sanitize(this.destination_rhf_account_number));
        arrayList.add("acats_match_movement_amount=" + Internal.sanitize(this.acats_match_movement_amount));
        arrayList.add("source_account_management_type=" + this.source_account_management_type);
        arrayList.add("destination_account_management_type=" + this.destination_account_management_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssetTransferRecord{", "}", 0, null, null, 56, null);
    }

    public final AssetTransferRecord copy(String id, String source_rhs_account_number, String destination_rhs_account_number, AssetTransferState state, AssetTransferFailureReason failure_reason, AssetTransferType transfer_type, AssetTransferSubType transfer_sub_type, boolean is_partial, String cash_amount, Instant record_date, Instant initiated_at, Instant completed_at, Instant created_at, Instant updated_at, List<EquityPosition> equity_positions, boolean is_owner_source_account, BrokerageAccountType source_brokerage_account_type, boolean is_owner_destination_account, BrokerageAccountType destination_brokerage_account_type, String source_rhf_account_number, String destination_rhf_account_number, String acats_match_movement_amount, ManagementType source_account_management_type, ManagementType destination_account_management_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source_rhs_account_number, "source_rhs_account_number");
        Intrinsics.checkNotNullParameter(destination_rhs_account_number, "destination_rhs_account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(transfer_sub_type, "transfer_sub_type");
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
        Intrinsics.checkNotNullParameter(source_brokerage_account_type, "source_brokerage_account_type");
        Intrinsics.checkNotNullParameter(destination_brokerage_account_type, "destination_brokerage_account_type");
        Intrinsics.checkNotNullParameter(source_rhf_account_number, "source_rhf_account_number");
        Intrinsics.checkNotNullParameter(destination_rhf_account_number, "destination_rhf_account_number");
        Intrinsics.checkNotNullParameter(acats_match_movement_amount, "acats_match_movement_amount");
        Intrinsics.checkNotNullParameter(source_account_management_type, "source_account_management_type");
        Intrinsics.checkNotNullParameter(destination_account_management_type, "destination_account_management_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssetTransferRecord(id, source_rhs_account_number, destination_rhs_account_number, state, failure_reason, transfer_type, transfer_sub_type, is_partial, cash_amount, record_date, initiated_at, completed_at, created_at, updated_at, equity_positions, is_owner_source_account, source_brokerage_account_type, is_owner_destination_account, destination_brokerage_account_type, source_rhf_account_number, destination_rhf_account_number, acats_match_movement_amount, source_account_management_type, destination_account_management_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetTransferRecord.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssetTransferRecord>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.AssetTransferRecord$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssetTransferRecord value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getSource_rhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource_rhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getDestination_rhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDestination_rhs_account_number());
                }
                if (value.getState() != AssetTransferState.STATE_UNSPECIFIED) {
                    size += AssetTransferState.ADAPTER.encodedSizeWithTag(4, value.getState());
                }
                if (value.getFailure_reason() != AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED) {
                    size += AssetTransferFailureReason.ADAPTER.encodedSizeWithTag(5, value.getFailure_reason());
                }
                if (value.getTransfer_type() != AssetTransferType.TYPE_UNSPECIFIED) {
                    size += AssetTransferType.ADAPTER.encodedSizeWithTag(6, value.getTransfer_type());
                }
                if (value.getTransfer_sub_type() != AssetTransferSubType.SUBTYPE_UNSPECIFIED) {
                    size += AssetTransferSubType.ADAPTER.encodedSizeWithTag(7, value.getTransfer_sub_type());
                }
                if (value.getIs_partial()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_partial()));
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCash_amount());
                }
                if (value.getRecord_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(10, value.getRecord_date());
                }
                if (value.getInitiated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getInitiated_at());
                }
                if (value.getCompleted_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(12, value.getCompleted_at());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(14, value.getUpdated_at());
                }
                int iEncodedSizeWithTag = size + EquityPosition.ADAPTER.asRepeated().encodedSizeWithTag(15, value.getEquity_positions());
                if (value.getIs_owner_source_account()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getIs_owner_source_account()));
                }
                BrokerageAccountType source_brokerage_account_type = value.getSource_brokerage_account_type();
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                if (source_brokerage_account_type != brokerageAccountType) {
                    iEncodedSizeWithTag += BrokerageAccountType.ADAPTER.encodedSizeWithTag(17, value.getSource_brokerage_account_type());
                }
                if (value.getIs_owner_destination_account()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getIs_owner_destination_account()));
                }
                if (value.getDestination_brokerage_account_type() != brokerageAccountType) {
                    iEncodedSizeWithTag += BrokerageAccountType.ADAPTER.encodedSizeWithTag(19, value.getDestination_brokerage_account_type());
                }
                if (!Intrinsics.areEqual(value.getSource_rhf_account_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getSource_rhf_account_number());
                }
                if (!Intrinsics.areEqual(value.getDestination_rhf_account_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getDestination_rhf_account_number());
                }
                if (!Intrinsics.areEqual(value.getAcats_match_movement_amount(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getAcats_match_movement_amount());
                }
                ManagementType source_account_management_type = value.getSource_account_management_type();
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                if (source_account_management_type != managementType) {
                    iEncodedSizeWithTag += ManagementType.ADAPTER.encodedSizeWithTag(23, value.getSource_account_management_type());
                }
                return value.getDestination_account_management_type() != managementType ? iEncodedSizeWithTag + ManagementType.ADAPTER.encodedSizeWithTag(24, value.getDestination_account_management_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssetTransferRecord value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSource_rhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_rhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getDestination_rhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDestination_rhs_account_number());
                }
                if (value.getState() != AssetTransferState.STATE_UNSPECIFIED) {
                    AssetTransferState.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getFailure_reason() != AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED) {
                    AssetTransferFailureReason.ADAPTER.encodeWithTag(writer, 5, (int) value.getFailure_reason());
                }
                if (value.getTransfer_type() != AssetTransferType.TYPE_UNSPECIFIED) {
                    AssetTransferType.ADAPTER.encodeWithTag(writer, 6, (int) value.getTransfer_type());
                }
                if (value.getTransfer_sub_type() != AssetTransferSubType.SUBTYPE_UNSPECIFIED) {
                    AssetTransferSubType.ADAPTER.encodeWithTag(writer, 7, (int) value.getTransfer_sub_type());
                }
                if (value.getIs_partial()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_partial()));
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCash_amount());
                }
                if (value.getRecord_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getRecord_date());
                }
                if (value.getInitiated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getInitiated_at());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getCompleted_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 14, (int) value.getUpdated_at());
                }
                EquityPosition.ADAPTER.asRepeated().encodeWithTag(writer, 15, (int) value.getEquity_positions());
                if (value.getIs_owner_source_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getIs_owner_source_account()));
                }
                BrokerageAccountType source_brokerage_account_type = value.getSource_brokerage_account_type();
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                if (source_brokerage_account_type != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 17, (int) value.getSource_brokerage_account_type());
                }
                if (value.getIs_owner_destination_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getIs_owner_destination_account()));
                }
                if (value.getDestination_brokerage_account_type() != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 19, (int) value.getDestination_brokerage_account_type());
                }
                if (!Intrinsics.areEqual(value.getSource_rhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getSource_rhf_account_number());
                }
                if (!Intrinsics.areEqual(value.getDestination_rhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getDestination_rhf_account_number());
                }
                if (!Intrinsics.areEqual(value.getAcats_match_movement_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getAcats_match_movement_amount());
                }
                ManagementType source_account_management_type = value.getSource_account_management_type();
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                if (source_account_management_type != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 23, (int) value.getSource_account_management_type());
                }
                if (value.getDestination_account_management_type() != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 24, (int) value.getDestination_account_management_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssetTransferRecord value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagementType destination_account_management_type = value.getDestination_account_management_type();
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                if (destination_account_management_type != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 24, (int) value.getDestination_account_management_type());
                }
                if (value.getSource_account_management_type() != managementType) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 23, (int) value.getSource_account_management_type());
                }
                if (!Intrinsics.areEqual(value.getAcats_match_movement_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getAcats_match_movement_amount());
                }
                if (!Intrinsics.areEqual(value.getDestination_rhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getDestination_rhf_account_number());
                }
                if (!Intrinsics.areEqual(value.getSource_rhf_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getSource_rhf_account_number());
                }
                BrokerageAccountType destination_brokerage_account_type = value.getDestination_brokerage_account_type();
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                if (destination_brokerage_account_type != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 19, (int) value.getDestination_brokerage_account_type());
                }
                if (value.getIs_owner_destination_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getIs_owner_destination_account()));
                }
                if (value.getSource_brokerage_account_type() != brokerageAccountType) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 17, (int) value.getSource_brokerage_account_type());
                }
                if (value.getIs_owner_source_account()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getIs_owner_source_account()));
                }
                EquityPosition.ADAPTER.asRepeated().encodeWithTag(writer, 15, (int) value.getEquity_positions());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 14, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getCreated_at());
                }
                if (value.getCompleted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getCompleted_at());
                }
                if (value.getInitiated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getInitiated_at());
                }
                if (value.getRecord_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getRecord_date());
                }
                if (!Intrinsics.areEqual(value.getCash_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCash_amount());
                }
                if (value.getIs_partial()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_partial()));
                }
                if (value.getTransfer_sub_type() != AssetTransferSubType.SUBTYPE_UNSPECIFIED) {
                    AssetTransferSubType.ADAPTER.encodeWithTag(writer, 7, (int) value.getTransfer_sub_type());
                }
                if (value.getTransfer_type() != AssetTransferType.TYPE_UNSPECIFIED) {
                    AssetTransferType.ADAPTER.encodeWithTag(writer, 6, (int) value.getTransfer_type());
                }
                if (value.getFailure_reason() != AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED) {
                    AssetTransferFailureReason.ADAPTER.encodeWithTag(writer, 5, (int) value.getFailure_reason());
                }
                if (value.getState() != AssetTransferState.STATE_UNSPECIFIED) {
                    AssetTransferState.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getDestination_rhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDestination_rhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getSource_rhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_rhs_account_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetTransferRecord decode(ProtoReader reader) throws IOException {
                AssetTransferFailureReason assetTransferFailureReason;
                AssetTransferSubType assetTransferSubType;
                BrokerageAccountType brokerageAccountType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                AssetTransferState assetTransferState = AssetTransferState.STATE_UNSPECIFIED;
                AssetTransferFailureReason assetTransferFailureReason2 = AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED;
                AssetTransferType assetTransferType = AssetTransferType.TYPE_UNSPECIFIED;
                AssetTransferSubType assetTransferSubType2 = AssetTransferSubType.SUBTYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                AssetTransferState assetTransferStateDecode = assetTransferState;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                Instant instantDecode4 = null;
                Instant instantDecode5 = null;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType2;
                ManagementType managementTypeDecode = managementType;
                ManagementType managementTypeDecode2 = managementTypeDecode;
                AssetTransferSubType assetTransferSubTypeDecode = assetTransferSubType2;
                BrokerageAccountType brokerageAccountTypeDecode2 = brokerageAccountTypeDecode;
                AssetTransferType assetTransferTypeDecode = assetTransferType;
                AssetTransferFailureReason assetTransferFailureReasonDecode = assetTransferFailureReason2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssetTransferRecord(strDecode, strDecode2, strDecode3, assetTransferStateDecode, assetTransferFailureReasonDecode, assetTransferTypeDecode, assetTransferSubTypeDecode, zBooleanValue, strDecode4, instantDecode, instantDecode2, instantDecode3, instantDecode4, instantDecode5, arrayList, zBooleanValue2, brokerageAccountTypeDecode2, zBooleanValue3, brokerageAccountTypeDecode, strDecode5, strDecode6, strDecode7, managementTypeDecode, managementTypeDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                assetTransferStateDecode = AssetTransferState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            assetTransferFailureReasonDecode = assetTransferFailureReason;
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 5:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                assetTransferFailureReasonDecode = AssetTransferFailureReason.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 6:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                assetTransferTypeDecode = AssetTransferType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            assetTransferFailureReasonDecode = assetTransferFailureReason;
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 7:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                assetTransferSubTypeDecode = AssetTransferSubType.ADAPTER.decode(reader);
                                assetTransferFailureReasonDecode = assetTransferFailureReason;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 8:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 9:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 11:
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 12:
                            instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 13:
                            instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 14:
                            instantDecode5 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 15:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            arrayList.add(EquityPosition.ADAPTER.decode(reader));
                            assetTransferFailureReasonDecode = assetTransferFailureReason;
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 16:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 17:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                brokerageAccountTypeDecode2 = BrokerageAccountType.ADAPTER.decode(reader);
                                assetTransferFailureReasonDecode = assetTransferFailureReason;
                                assetTransferSubTypeDecode = assetTransferSubType;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 18:
                            zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 19:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            assetTransferFailureReasonDecode = assetTransferFailureReason;
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 20:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 21:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 22:
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 23:
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            try {
                                managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            assetTransferFailureReasonDecode = assetTransferFailureReason;
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                        case 24:
                            try {
                                managementTypeDecode2 = ManagementType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                assetTransferFailureReason = assetTransferFailureReasonDecode;
                                assetTransferSubType = assetTransferSubTypeDecode;
                                brokerageAccountType = brokerageAccountTypeDecode2;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(iNextTag);
                            assetTransferFailureReason = assetTransferFailureReasonDecode;
                            assetTransferSubType = assetTransferSubTypeDecode;
                            brokerageAccountType = brokerageAccountTypeDecode2;
                            assetTransferFailureReasonDecode = assetTransferFailureReason;
                            assetTransferSubTypeDecode = assetTransferSubType;
                            brokerageAccountTypeDecode2 = brokerageAccountType;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetTransferRecord redact(AssetTransferRecord value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant record_date = value.getRecord_date();
                Instant instantRedact = record_date != null ? ProtoAdapter.INSTANT.redact(record_date) : null;
                Instant initiated_at = value.getInitiated_at();
                Instant instantRedact2 = initiated_at != null ? ProtoAdapter.INSTANT.redact(initiated_at) : null;
                Instant completed_at = value.getCompleted_at();
                Instant instantRedact3 = completed_at != null ? ProtoAdapter.INSTANT.redact(completed_at) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact4 = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return value.copy((16744959 & 1) != 0 ? value.id : null, (16744959 & 2) != 0 ? value.source_rhs_account_number : null, (16744959 & 4) != 0 ? value.destination_rhs_account_number : null, (16744959 & 8) != 0 ? value.state : null, (16744959 & 16) != 0 ? value.failure_reason : null, (16744959 & 32) != 0 ? value.transfer_type : null, (16744959 & 64) != 0 ? value.transfer_sub_type : null, (16744959 & 128) != 0 ? value.is_partial : false, (16744959 & 256) != 0 ? value.cash_amount : null, (16744959 & 512) != 0 ? value.record_date : instantRedact, (16744959 & 1024) != 0 ? value.initiated_at : instantRedact2, (16744959 & 2048) != 0 ? value.completed_at : instantRedact3, (16744959 & 4096) != 0 ? value.created_at : instantRedact4, (16744959 & 8192) != 0 ? value.updated_at : updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, (16744959 & 16384) != 0 ? value.equity_positions : Internal.m26823redactElements(value.getEquity_positions(), EquityPosition.ADAPTER), (16744959 & 32768) != 0 ? value.is_owner_source_account : false, (16744959 & 65536) != 0 ? value.source_brokerage_account_type : null, (16744959 & 131072) != 0 ? value.is_owner_destination_account : false, (16744959 & 262144) != 0 ? value.destination_brokerage_account_type : null, (16744959 & 524288) != 0 ? value.source_rhf_account_number : null, (16744959 & 1048576) != 0 ? value.destination_rhf_account_number : null, (16744959 & 2097152) != 0 ? value.acats_match_movement_amount : null, (16744959 & 4194304) != 0 ? value.source_account_management_type : null, (16744959 & 8388608) != 0 ? value.destination_account_management_type : null, (16744959 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
