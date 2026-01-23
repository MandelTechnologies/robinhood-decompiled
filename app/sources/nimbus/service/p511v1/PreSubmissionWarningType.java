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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PreSubmissionWarningType.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010;\u001a\u00020\u0002H\u0017J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020CH\u0016J¬\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006F"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionWarningType;", "Lcom/squareup/wire/Message;", "", "pdt_25k_limit", "Lnimbus/service/v1/Pdt25kLimit;", "acats_clawback", "Lnimbus/service/v1/AcatsClawback;", "two_k_minimum_equity_check_failed", "Lnimbus/service/v1/TwoKMinimumEquityCheckFailed;", "maintenance_excess_check_failed", "Lnimbus/service/v1/MaintenanceExcessCheckFailed;", "borrowing_limit_check_failed", "Lnimbus/service/v1/BorrowingLimitCheckFailed;", "transfer_limit_check_failed", "Lnimbus/service/v1/TransferLimitCheckFailed;", "unsettled_positions_check_failed", "Lnimbus/service/v1/UnsettledPositionsCheckFailed;", "negative_transfer_market_value", "Lnimbus/service/v1/NegativeTransferMarketValue;", "gold_boost_details", "Lnimbus/service/v1/GoldBoost;", "instant_check_failed", "Lnimbus/service/v1/InstantCheckFailed;", "transfer_count_check_failed", "Lnimbus/service/v1/TransferCountCheckFailed;", "empty_transfer", "Lnimbus/service/v1/EmptyTransfer;", "managed_account_funding_transfer_value_check_failed", "Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailed;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnimbus/service/v1/Pdt25kLimit;Lnimbus/service/v1/AcatsClawback;Lnimbus/service/v1/TwoKMinimumEquityCheckFailed;Lnimbus/service/v1/MaintenanceExcessCheckFailed;Lnimbus/service/v1/BorrowingLimitCheckFailed;Lnimbus/service/v1/TransferLimitCheckFailed;Lnimbus/service/v1/UnsettledPositionsCheckFailed;Lnimbus/service/v1/NegativeTransferMarketValue;Lnimbus/service/v1/GoldBoost;Lnimbus/service/v1/InstantCheckFailed;Lnimbus/service/v1/TransferCountCheckFailed;Lnimbus/service/v1/EmptyTransfer;Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailed;Lokio/ByteString;)V", "getPdt_25k_limit", "()Lnimbus/service/v1/Pdt25kLimit;", "getAcats_clawback", "()Lnimbus/service/v1/AcatsClawback;", "getTwo_k_minimum_equity_check_failed", "()Lnimbus/service/v1/TwoKMinimumEquityCheckFailed;", "getMaintenance_excess_check_failed", "()Lnimbus/service/v1/MaintenanceExcessCheckFailed;", "getBorrowing_limit_check_failed", "()Lnimbus/service/v1/BorrowingLimitCheckFailed;", "getTransfer_limit_check_failed", "()Lnimbus/service/v1/TransferLimitCheckFailed;", "getUnsettled_positions_check_failed", "()Lnimbus/service/v1/UnsettledPositionsCheckFailed;", "getNegative_transfer_market_value", "()Lnimbus/service/v1/NegativeTransferMarketValue;", "getGold_boost_details", "()Lnimbus/service/v1/GoldBoost;", "getInstant_check_failed", "()Lnimbus/service/v1/InstantCheckFailed;", "getTransfer_count_check_failed", "()Lnimbus/service/v1/TransferCountCheckFailed;", "getEmpty_transfer", "()Lnimbus/service/v1/EmptyTransfer;", "getManaged_account_funding_transfer_value_check_failed", "()Lnimbus/service/v1/ManagedAccountFundingTransferValueCheckFailed;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PreSubmissionWarningType extends Message {

    @JvmField
    public static final ProtoAdapter<PreSubmissionWarningType> ADAPTER;

    @WireField(adapter = "nimbus.service.v1.AcatsClawback#ADAPTER", jsonName = "acatsClawback", oneofName = "warning_type", schemaIndex = 1, tag = 2)
    private final AcatsClawback acats_clawback;

    @WireField(adapter = "nimbus.service.v1.BorrowingLimitCheckFailed#ADAPTER", jsonName = "borrowingLimitCheckFailed", oneofName = "warning_type", schemaIndex = 4, tag = 5)
    private final BorrowingLimitCheckFailed borrowing_limit_check_failed;

    @WireField(adapter = "nimbus.service.v1.EmptyTransfer#ADAPTER", jsonName = "emptyTransfer", oneofName = "warning_type", schemaIndex = 11, tag = 12)
    private final EmptyTransfer empty_transfer;

    @WireField(adapter = "nimbus.service.v1.GoldBoost#ADAPTER", jsonName = "goldBoostDetails", oneofName = "warning_type", schemaIndex = 8, tag = 9)
    private final GoldBoost gold_boost_details;

    @WireField(adapter = "nimbus.service.v1.InstantCheckFailed#ADAPTER", jsonName = "instantCheckFailed", oneofName = "warning_type", schemaIndex = 9, tag = 10)
    private final InstantCheckFailed instant_check_failed;

    @WireField(adapter = "nimbus.service.v1.MaintenanceExcessCheckFailed#ADAPTER", jsonName = "maintenanceExcessCheckFailed", oneofName = "warning_type", schemaIndex = 3, tag = 4)
    private final MaintenanceExcessCheckFailed maintenance_excess_check_failed;

    @WireField(adapter = "nimbus.service.v1.ManagedAccountFundingTransferValueCheckFailed#ADAPTER", jsonName = "managedAccountFundingTransferValueCheckFailed", oneofName = "warning_type", schemaIndex = 12, tag = 13)
    private final ManagedAccountFundingTransferValueCheckFailed managed_account_funding_transfer_value_check_failed;

    @WireField(adapter = "nimbus.service.v1.NegativeTransferMarketValue#ADAPTER", jsonName = "negativeTransferMarketValue", oneofName = "warning_type", schemaIndex = 7, tag = 8)
    private final NegativeTransferMarketValue negative_transfer_market_value;

    @WireField(adapter = "nimbus.service.v1.Pdt25kLimit#ADAPTER", jsonName = "pdt25kLimit", oneofName = "warning_type", schemaIndex = 0, tag = 1)
    private final Pdt25kLimit pdt_25k_limit;

    @WireField(adapter = "nimbus.service.v1.TransferCountCheckFailed#ADAPTER", jsonName = "transferCountCheckFailed", oneofName = "warning_type", schemaIndex = 10, tag = 11)
    private final TransferCountCheckFailed transfer_count_check_failed;

    @WireField(adapter = "nimbus.service.v1.TransferLimitCheckFailed#ADAPTER", jsonName = "transferLimitCheckFailed", oneofName = "warning_type", schemaIndex = 5, tag = 6)
    private final TransferLimitCheckFailed transfer_limit_check_failed;

    @WireField(adapter = "nimbus.service.v1.TwoKMinimumEquityCheckFailed#ADAPTER", jsonName = "twoKMinimumEquityCheckFailed", oneofName = "warning_type", schemaIndex = 2, tag = 3)
    private final TwoKMinimumEquityCheckFailed two_k_minimum_equity_check_failed;

    @WireField(adapter = "nimbus.service.v1.UnsettledPositionsCheckFailed#ADAPTER", jsonName = "unsettledPositionsCheckFailed", oneofName = "warning_type", schemaIndex = 6, tag = 7)
    private final UnsettledPositionsCheckFailed unsettled_positions_check_failed;

    public PreSubmissionWarningType() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29379newBuilder();
    }

    public final Pdt25kLimit getPdt_25k_limit() {
        return this.pdt_25k_limit;
    }

    public final AcatsClawback getAcats_clawback() {
        return this.acats_clawback;
    }

    public final TwoKMinimumEquityCheckFailed getTwo_k_minimum_equity_check_failed() {
        return this.two_k_minimum_equity_check_failed;
    }

    public final MaintenanceExcessCheckFailed getMaintenance_excess_check_failed() {
        return this.maintenance_excess_check_failed;
    }

    public final BorrowingLimitCheckFailed getBorrowing_limit_check_failed() {
        return this.borrowing_limit_check_failed;
    }

    public final TransferLimitCheckFailed getTransfer_limit_check_failed() {
        return this.transfer_limit_check_failed;
    }

    public final UnsettledPositionsCheckFailed getUnsettled_positions_check_failed() {
        return this.unsettled_positions_check_failed;
    }

    public final NegativeTransferMarketValue getNegative_transfer_market_value() {
        return this.negative_transfer_market_value;
    }

    public final GoldBoost getGold_boost_details() {
        return this.gold_boost_details;
    }

    public final InstantCheckFailed getInstant_check_failed() {
        return this.instant_check_failed;
    }

    public final TransferCountCheckFailed getTransfer_count_check_failed() {
        return this.transfer_count_check_failed;
    }

    public final EmptyTransfer getEmpty_transfer() {
        return this.empty_transfer;
    }

    public final ManagedAccountFundingTransferValueCheckFailed getManaged_account_funding_transfer_value_check_failed() {
        return this.managed_account_funding_transfer_value_check_failed;
    }

    public /* synthetic */ PreSubmissionWarningType(Pdt25kLimit pdt25kLimit, AcatsClawback acatsClawback, TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailed, MaintenanceExcessCheckFailed maintenanceExcessCheckFailed, BorrowingLimitCheckFailed borrowingLimitCheckFailed, TransferLimitCheckFailed transferLimitCheckFailed, UnsettledPositionsCheckFailed unsettledPositionsCheckFailed, NegativeTransferMarketValue negativeTransferMarketValue, GoldBoost goldBoost, InstantCheckFailed instantCheckFailed, TransferCountCheckFailed transferCountCheckFailed, EmptyTransfer emptyTransfer, ManagedAccountFundingTransferValueCheckFailed managedAccountFundingTransferValueCheckFailed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pdt25kLimit, (i & 2) != 0 ? null : acatsClawback, (i & 4) != 0 ? null : twoKMinimumEquityCheckFailed, (i & 8) != 0 ? null : maintenanceExcessCheckFailed, (i & 16) != 0 ? null : borrowingLimitCheckFailed, (i & 32) != 0 ? null : transferLimitCheckFailed, (i & 64) != 0 ? null : unsettledPositionsCheckFailed, (i & 128) != 0 ? null : negativeTransferMarketValue, (i & 256) != 0 ? null : goldBoost, (i & 512) != 0 ? null : instantCheckFailed, (i & 1024) != 0 ? null : transferCountCheckFailed, (i & 2048) != 0 ? null : emptyTransfer, (i & 4096) == 0 ? managedAccountFundingTransferValueCheckFailed : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSubmissionWarningType(Pdt25kLimit pdt25kLimit, AcatsClawback acatsClawback, TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailed, MaintenanceExcessCheckFailed maintenanceExcessCheckFailed, BorrowingLimitCheckFailed borrowingLimitCheckFailed, TransferLimitCheckFailed transferLimitCheckFailed, UnsettledPositionsCheckFailed unsettledPositionsCheckFailed, NegativeTransferMarketValue negativeTransferMarketValue, GoldBoost goldBoost, InstantCheckFailed instantCheckFailed, TransferCountCheckFailed transferCountCheckFailed, EmptyTransfer emptyTransfer, ManagedAccountFundingTransferValueCheckFailed managedAccountFundingTransferValueCheckFailed, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.pdt_25k_limit = pdt25kLimit;
        this.acats_clawback = acatsClawback;
        this.two_k_minimum_equity_check_failed = twoKMinimumEquityCheckFailed;
        this.maintenance_excess_check_failed = maintenanceExcessCheckFailed;
        this.borrowing_limit_check_failed = borrowingLimitCheckFailed;
        this.transfer_limit_check_failed = transferLimitCheckFailed;
        this.unsettled_positions_check_failed = unsettledPositionsCheckFailed;
        this.negative_transfer_market_value = negativeTransferMarketValue;
        this.gold_boost_details = goldBoost;
        this.instant_check_failed = instantCheckFailed;
        this.transfer_count_check_failed = transferCountCheckFailed;
        this.empty_transfer = emptyTransfer;
        this.managed_account_funding_transfer_value_check_failed = managedAccountFundingTransferValueCheckFailed;
        if (Internal.countNonNull(pdt25kLimit, acatsClawback, twoKMinimumEquityCheckFailed, maintenanceExcessCheckFailed, borrowingLimitCheckFailed, transferLimitCheckFailed, unsettledPositionsCheckFailed, negativeTransferMarketValue, goldBoost, instantCheckFailed, transferCountCheckFailed, emptyTransfer, managedAccountFundingTransferValueCheckFailed) > 1) {
            throw new IllegalArgumentException("At most one of pdt_25k_limit, acats_clawback, two_k_minimum_equity_check_failed, maintenance_excess_check_failed, borrowing_limit_check_failed, transfer_limit_check_failed, unsettled_positions_check_failed, negative_transfer_market_value, gold_boost_details, instant_check_failed, transfer_count_check_failed, empty_transfer, managed_account_funding_transfer_value_check_failed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29379newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PreSubmissionWarningType)) {
            return false;
        }
        PreSubmissionWarningType preSubmissionWarningType = (PreSubmissionWarningType) other;
        return Intrinsics.areEqual(unknownFields(), preSubmissionWarningType.unknownFields()) && Intrinsics.areEqual(this.pdt_25k_limit, preSubmissionWarningType.pdt_25k_limit) && Intrinsics.areEqual(this.acats_clawback, preSubmissionWarningType.acats_clawback) && Intrinsics.areEqual(this.two_k_minimum_equity_check_failed, preSubmissionWarningType.two_k_minimum_equity_check_failed) && Intrinsics.areEqual(this.maintenance_excess_check_failed, preSubmissionWarningType.maintenance_excess_check_failed) && Intrinsics.areEqual(this.borrowing_limit_check_failed, preSubmissionWarningType.borrowing_limit_check_failed) && Intrinsics.areEqual(this.transfer_limit_check_failed, preSubmissionWarningType.transfer_limit_check_failed) && Intrinsics.areEqual(this.unsettled_positions_check_failed, preSubmissionWarningType.unsettled_positions_check_failed) && Intrinsics.areEqual(this.negative_transfer_market_value, preSubmissionWarningType.negative_transfer_market_value) && Intrinsics.areEqual(this.gold_boost_details, preSubmissionWarningType.gold_boost_details) && Intrinsics.areEqual(this.instant_check_failed, preSubmissionWarningType.instant_check_failed) && Intrinsics.areEqual(this.transfer_count_check_failed, preSubmissionWarningType.transfer_count_check_failed) && Intrinsics.areEqual(this.empty_transfer, preSubmissionWarningType.empty_transfer) && Intrinsics.areEqual(this.managed_account_funding_transfer_value_check_failed, preSubmissionWarningType.managed_account_funding_transfer_value_check_failed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Pdt25kLimit pdt25kLimit = this.pdt_25k_limit;
        int iHashCode2 = (iHashCode + (pdt25kLimit != null ? pdt25kLimit.hashCode() : 0)) * 37;
        AcatsClawback acatsClawback = this.acats_clawback;
        int iHashCode3 = (iHashCode2 + (acatsClawback != null ? acatsClawback.hashCode() : 0)) * 37;
        TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailed = this.two_k_minimum_equity_check_failed;
        int iHashCode4 = (iHashCode3 + (twoKMinimumEquityCheckFailed != null ? twoKMinimumEquityCheckFailed.hashCode() : 0)) * 37;
        MaintenanceExcessCheckFailed maintenanceExcessCheckFailed = this.maintenance_excess_check_failed;
        int iHashCode5 = (iHashCode4 + (maintenanceExcessCheckFailed != null ? maintenanceExcessCheckFailed.hashCode() : 0)) * 37;
        BorrowingLimitCheckFailed borrowingLimitCheckFailed = this.borrowing_limit_check_failed;
        int iHashCode6 = (iHashCode5 + (borrowingLimitCheckFailed != null ? borrowingLimitCheckFailed.hashCode() : 0)) * 37;
        TransferLimitCheckFailed transferLimitCheckFailed = this.transfer_limit_check_failed;
        int iHashCode7 = (iHashCode6 + (transferLimitCheckFailed != null ? transferLimitCheckFailed.hashCode() : 0)) * 37;
        UnsettledPositionsCheckFailed unsettledPositionsCheckFailed = this.unsettled_positions_check_failed;
        int iHashCode8 = (iHashCode7 + (unsettledPositionsCheckFailed != null ? unsettledPositionsCheckFailed.hashCode() : 0)) * 37;
        NegativeTransferMarketValue negativeTransferMarketValue = this.negative_transfer_market_value;
        int iHashCode9 = (iHashCode8 + (negativeTransferMarketValue != null ? negativeTransferMarketValue.hashCode() : 0)) * 37;
        GoldBoost goldBoost = this.gold_boost_details;
        int iHashCode10 = (iHashCode9 + (goldBoost != null ? goldBoost.hashCode() : 0)) * 37;
        InstantCheckFailed instantCheckFailed = this.instant_check_failed;
        int iHashCode11 = (iHashCode10 + (instantCheckFailed != null ? instantCheckFailed.hashCode() : 0)) * 37;
        TransferCountCheckFailed transferCountCheckFailed = this.transfer_count_check_failed;
        int iHashCode12 = (iHashCode11 + (transferCountCheckFailed != null ? transferCountCheckFailed.hashCode() : 0)) * 37;
        EmptyTransfer emptyTransfer = this.empty_transfer;
        int iHashCode13 = (iHashCode12 + (emptyTransfer != null ? emptyTransfer.hashCode() : 0)) * 37;
        ManagedAccountFundingTransferValueCheckFailed managedAccountFundingTransferValueCheckFailed = this.managed_account_funding_transfer_value_check_failed;
        int iHashCode14 = iHashCode13 + (managedAccountFundingTransferValueCheckFailed != null ? managedAccountFundingTransferValueCheckFailed.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Pdt25kLimit pdt25kLimit = this.pdt_25k_limit;
        if (pdt25kLimit != null) {
            arrayList.add("pdt_25k_limit=" + pdt25kLimit);
        }
        AcatsClawback acatsClawback = this.acats_clawback;
        if (acatsClawback != null) {
            arrayList.add("acats_clawback=" + acatsClawback);
        }
        TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailed = this.two_k_minimum_equity_check_failed;
        if (twoKMinimumEquityCheckFailed != null) {
            arrayList.add("two_k_minimum_equity_check_failed=" + twoKMinimumEquityCheckFailed);
        }
        MaintenanceExcessCheckFailed maintenanceExcessCheckFailed = this.maintenance_excess_check_failed;
        if (maintenanceExcessCheckFailed != null) {
            arrayList.add("maintenance_excess_check_failed=" + maintenanceExcessCheckFailed);
        }
        BorrowingLimitCheckFailed borrowingLimitCheckFailed = this.borrowing_limit_check_failed;
        if (borrowingLimitCheckFailed != null) {
            arrayList.add("borrowing_limit_check_failed=" + borrowingLimitCheckFailed);
        }
        TransferLimitCheckFailed transferLimitCheckFailed = this.transfer_limit_check_failed;
        if (transferLimitCheckFailed != null) {
            arrayList.add("transfer_limit_check_failed=" + transferLimitCheckFailed);
        }
        UnsettledPositionsCheckFailed unsettledPositionsCheckFailed = this.unsettled_positions_check_failed;
        if (unsettledPositionsCheckFailed != null) {
            arrayList.add("unsettled_positions_check_failed=" + unsettledPositionsCheckFailed);
        }
        NegativeTransferMarketValue negativeTransferMarketValue = this.negative_transfer_market_value;
        if (negativeTransferMarketValue != null) {
            arrayList.add("negative_transfer_market_value=" + negativeTransferMarketValue);
        }
        GoldBoost goldBoost = this.gold_boost_details;
        if (goldBoost != null) {
            arrayList.add("gold_boost_details=" + goldBoost);
        }
        InstantCheckFailed instantCheckFailed = this.instant_check_failed;
        if (instantCheckFailed != null) {
            arrayList.add("instant_check_failed=" + instantCheckFailed);
        }
        TransferCountCheckFailed transferCountCheckFailed = this.transfer_count_check_failed;
        if (transferCountCheckFailed != null) {
            arrayList.add("transfer_count_check_failed=" + transferCountCheckFailed);
        }
        EmptyTransfer emptyTransfer = this.empty_transfer;
        if (emptyTransfer != null) {
            arrayList.add("empty_transfer=" + emptyTransfer);
        }
        ManagedAccountFundingTransferValueCheckFailed managedAccountFundingTransferValueCheckFailed = this.managed_account_funding_transfer_value_check_failed;
        if (managedAccountFundingTransferValueCheckFailed != null) {
            arrayList.add("managed_account_funding_transfer_value_check_failed=" + managedAccountFundingTransferValueCheckFailed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreSubmissionWarningType{", "}", 0, null, null, 56, null);
    }

    public final PreSubmissionWarningType copy(Pdt25kLimit pdt_25k_limit, AcatsClawback acats_clawback, TwoKMinimumEquityCheckFailed two_k_minimum_equity_check_failed, MaintenanceExcessCheckFailed maintenance_excess_check_failed, BorrowingLimitCheckFailed borrowing_limit_check_failed, TransferLimitCheckFailed transfer_limit_check_failed, UnsettledPositionsCheckFailed unsettled_positions_check_failed, NegativeTransferMarketValue negative_transfer_market_value, GoldBoost gold_boost_details, InstantCheckFailed instant_check_failed, TransferCountCheckFailed transfer_count_check_failed, EmptyTransfer empty_transfer, ManagedAccountFundingTransferValueCheckFailed managed_account_funding_transfer_value_check_failed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PreSubmissionWarningType(pdt_25k_limit, acats_clawback, two_k_minimum_equity_check_failed, maintenance_excess_check_failed, borrowing_limit_check_failed, transfer_limit_check_failed, unsettled_positions_check_failed, negative_transfer_market_value, gold_boost_details, instant_check_failed, transfer_count_check_failed, empty_transfer, managed_account_funding_transfer_value_check_failed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreSubmissionWarningType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PreSubmissionWarningType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.PreSubmissionWarningType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PreSubmissionWarningType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Pdt25kLimit.ADAPTER.encodedSizeWithTag(1, value.getPdt_25k_limit()) + AcatsClawback.ADAPTER.encodedSizeWithTag(2, value.getAcats_clawback()) + TwoKMinimumEquityCheckFailed.ADAPTER.encodedSizeWithTag(3, value.getTwo_k_minimum_equity_check_failed()) + MaintenanceExcessCheckFailed.ADAPTER.encodedSizeWithTag(4, value.getMaintenance_excess_check_failed()) + BorrowingLimitCheckFailed.ADAPTER.encodedSizeWithTag(5, value.getBorrowing_limit_check_failed()) + TransferLimitCheckFailed.ADAPTER.encodedSizeWithTag(6, value.getTransfer_limit_check_failed()) + UnsettledPositionsCheckFailed.ADAPTER.encodedSizeWithTag(7, value.getUnsettled_positions_check_failed()) + NegativeTransferMarketValue.ADAPTER.encodedSizeWithTag(8, value.getNegative_transfer_market_value()) + GoldBoost.ADAPTER.encodedSizeWithTag(9, value.getGold_boost_details()) + InstantCheckFailed.ADAPTER.encodedSizeWithTag(10, value.getInstant_check_failed()) + TransferCountCheckFailed.ADAPTER.encodedSizeWithTag(11, value.getTransfer_count_check_failed()) + EmptyTransfer.ADAPTER.encodedSizeWithTag(12, value.getEmpty_transfer()) + ManagedAccountFundingTransferValueCheckFailed.ADAPTER.encodedSizeWithTag(13, value.getManaged_account_funding_transfer_value_check_failed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PreSubmissionWarningType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Pdt25kLimit.ADAPTER.encodeWithTag(writer, 1, (int) value.getPdt_25k_limit());
                AcatsClawback.ADAPTER.encodeWithTag(writer, 2, (int) value.getAcats_clawback());
                TwoKMinimumEquityCheckFailed.ADAPTER.encodeWithTag(writer, 3, (int) value.getTwo_k_minimum_equity_check_failed());
                MaintenanceExcessCheckFailed.ADAPTER.encodeWithTag(writer, 4, (int) value.getMaintenance_excess_check_failed());
                BorrowingLimitCheckFailed.ADAPTER.encodeWithTag(writer, 5, (int) value.getBorrowing_limit_check_failed());
                TransferLimitCheckFailed.ADAPTER.encodeWithTag(writer, 6, (int) value.getTransfer_limit_check_failed());
                UnsettledPositionsCheckFailed.ADAPTER.encodeWithTag(writer, 7, (int) value.getUnsettled_positions_check_failed());
                NegativeTransferMarketValue.ADAPTER.encodeWithTag(writer, 8, (int) value.getNegative_transfer_market_value());
                GoldBoost.ADAPTER.encodeWithTag(writer, 9, (int) value.getGold_boost_details());
                InstantCheckFailed.ADAPTER.encodeWithTag(writer, 10, (int) value.getInstant_check_failed());
                TransferCountCheckFailed.ADAPTER.encodeWithTag(writer, 11, (int) value.getTransfer_count_check_failed());
                EmptyTransfer.ADAPTER.encodeWithTag(writer, 12, (int) value.getEmpty_transfer());
                ManagedAccountFundingTransferValueCheckFailed.ADAPTER.encodeWithTag(writer, 13, (int) value.getManaged_account_funding_transfer_value_check_failed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PreSubmissionWarningType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagedAccountFundingTransferValueCheckFailed.ADAPTER.encodeWithTag(writer, 13, (int) value.getManaged_account_funding_transfer_value_check_failed());
                EmptyTransfer.ADAPTER.encodeWithTag(writer, 12, (int) value.getEmpty_transfer());
                TransferCountCheckFailed.ADAPTER.encodeWithTag(writer, 11, (int) value.getTransfer_count_check_failed());
                InstantCheckFailed.ADAPTER.encodeWithTag(writer, 10, (int) value.getInstant_check_failed());
                GoldBoost.ADAPTER.encodeWithTag(writer, 9, (int) value.getGold_boost_details());
                NegativeTransferMarketValue.ADAPTER.encodeWithTag(writer, 8, (int) value.getNegative_transfer_market_value());
                UnsettledPositionsCheckFailed.ADAPTER.encodeWithTag(writer, 7, (int) value.getUnsettled_positions_check_failed());
                TransferLimitCheckFailed.ADAPTER.encodeWithTag(writer, 6, (int) value.getTransfer_limit_check_failed());
                BorrowingLimitCheckFailed.ADAPTER.encodeWithTag(writer, 5, (int) value.getBorrowing_limit_check_failed());
                MaintenanceExcessCheckFailed.ADAPTER.encodeWithTag(writer, 4, (int) value.getMaintenance_excess_check_failed());
                TwoKMinimumEquityCheckFailed.ADAPTER.encodeWithTag(writer, 3, (int) value.getTwo_k_minimum_equity_check_failed());
                AcatsClawback.ADAPTER.encodeWithTag(writer, 2, (int) value.getAcats_clawback());
                Pdt25kLimit.ADAPTER.encodeWithTag(writer, 1, (int) value.getPdt_25k_limit());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionWarningType redact(PreSubmissionWarningType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Pdt25kLimit pdt_25k_limit = value.getPdt_25k_limit();
                Pdt25kLimit pdt25kLimitRedact = pdt_25k_limit != null ? Pdt25kLimit.ADAPTER.redact(pdt_25k_limit) : null;
                AcatsClawback acats_clawback = value.getAcats_clawback();
                AcatsClawback acatsClawbackRedact = acats_clawback != null ? AcatsClawback.ADAPTER.redact(acats_clawback) : null;
                TwoKMinimumEquityCheckFailed two_k_minimum_equity_check_failed = value.getTwo_k_minimum_equity_check_failed();
                TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailedRedact = two_k_minimum_equity_check_failed != null ? TwoKMinimumEquityCheckFailed.ADAPTER.redact(two_k_minimum_equity_check_failed) : null;
                MaintenanceExcessCheckFailed maintenance_excess_check_failed = value.getMaintenance_excess_check_failed();
                MaintenanceExcessCheckFailed maintenanceExcessCheckFailedRedact = maintenance_excess_check_failed != null ? MaintenanceExcessCheckFailed.ADAPTER.redact(maintenance_excess_check_failed) : null;
                BorrowingLimitCheckFailed borrowing_limit_check_failed = value.getBorrowing_limit_check_failed();
                BorrowingLimitCheckFailed borrowingLimitCheckFailedRedact = borrowing_limit_check_failed != null ? BorrowingLimitCheckFailed.ADAPTER.redact(borrowing_limit_check_failed) : null;
                TransferLimitCheckFailed transfer_limit_check_failed = value.getTransfer_limit_check_failed();
                TransferLimitCheckFailed transferLimitCheckFailedRedact = transfer_limit_check_failed != null ? TransferLimitCheckFailed.ADAPTER.redact(transfer_limit_check_failed) : null;
                UnsettledPositionsCheckFailed unsettled_positions_check_failed = value.getUnsettled_positions_check_failed();
                UnsettledPositionsCheckFailed unsettledPositionsCheckFailedRedact = unsettled_positions_check_failed != null ? UnsettledPositionsCheckFailed.ADAPTER.redact(unsettled_positions_check_failed) : null;
                NegativeTransferMarketValue negative_transfer_market_value = value.getNegative_transfer_market_value();
                NegativeTransferMarketValue negativeTransferMarketValueRedact = negative_transfer_market_value != null ? NegativeTransferMarketValue.ADAPTER.redact(negative_transfer_market_value) : null;
                GoldBoost gold_boost_details = value.getGold_boost_details();
                GoldBoost goldBoostRedact = gold_boost_details != null ? GoldBoost.ADAPTER.redact(gold_boost_details) : null;
                InstantCheckFailed instant_check_failed = value.getInstant_check_failed();
                InstantCheckFailed instantCheckFailedRedact = instant_check_failed != null ? InstantCheckFailed.ADAPTER.redact(instant_check_failed) : null;
                TransferCountCheckFailed transfer_count_check_failed = value.getTransfer_count_check_failed();
                TransferCountCheckFailed transferCountCheckFailedRedact = transfer_count_check_failed != null ? TransferCountCheckFailed.ADAPTER.redact(transfer_count_check_failed) : null;
                EmptyTransfer empty_transfer = value.getEmpty_transfer();
                EmptyTransfer emptyTransferRedact = empty_transfer != null ? EmptyTransfer.ADAPTER.redact(empty_transfer) : null;
                ManagedAccountFundingTransferValueCheckFailed managed_account_funding_transfer_value_check_failed = value.getManaged_account_funding_transfer_value_check_failed();
                return value.copy(pdt25kLimitRedact, acatsClawbackRedact, twoKMinimumEquityCheckFailedRedact, maintenanceExcessCheckFailedRedact, borrowingLimitCheckFailedRedact, transferLimitCheckFailedRedact, unsettledPositionsCheckFailedRedact, negativeTransferMarketValueRedact, goldBoostRedact, instantCheckFailedRedact, transferCountCheckFailedRedact, emptyTransferRedact, managed_account_funding_transfer_value_check_failed != null ? ManagedAccountFundingTransferValueCheckFailed.ADAPTER.redact(managed_account_funding_transfer_value_check_failed) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreSubmissionWarningType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AcatsClawback acatsClawbackDecode = null;
                TwoKMinimumEquityCheckFailed twoKMinimumEquityCheckFailedDecode = null;
                MaintenanceExcessCheckFailed maintenanceExcessCheckFailedDecode = null;
                BorrowingLimitCheckFailed borrowingLimitCheckFailedDecode = null;
                TransferLimitCheckFailed transferLimitCheckFailedDecode = null;
                UnsettledPositionsCheckFailed unsettledPositionsCheckFailedDecode = null;
                NegativeTransferMarketValue negativeTransferMarketValueDecode = null;
                GoldBoost goldBoostDecode = null;
                InstantCheckFailed instantCheckFailedDecode = null;
                TransferCountCheckFailed transferCountCheckFailedDecode = null;
                EmptyTransfer emptyTransferDecode = null;
                ManagedAccountFundingTransferValueCheckFailed managedAccountFundingTransferValueCheckFailedDecode = null;
                Pdt25kLimit pdt25kLimitDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    AcatsClawback acatsClawback = acatsClawbackDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                pdt25kLimitDecode = Pdt25kLimit.ADAPTER.decode(reader);
                                break;
                            case 2:
                                acatsClawbackDecode = AcatsClawback.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                twoKMinimumEquityCheckFailedDecode = TwoKMinimumEquityCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 4:
                                maintenanceExcessCheckFailedDecode = MaintenanceExcessCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 5:
                                borrowingLimitCheckFailedDecode = BorrowingLimitCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 6:
                                transferLimitCheckFailedDecode = TransferLimitCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 7:
                                unsettledPositionsCheckFailedDecode = UnsettledPositionsCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 8:
                                negativeTransferMarketValueDecode = NegativeTransferMarketValue.ADAPTER.decode(reader);
                                break;
                            case 9:
                                goldBoostDecode = GoldBoost.ADAPTER.decode(reader);
                                break;
                            case 10:
                                instantCheckFailedDecode = InstantCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 11:
                                transferCountCheckFailedDecode = TransferCountCheckFailed.ADAPTER.decode(reader);
                                break;
                            case 12:
                                emptyTransferDecode = EmptyTransfer.ADAPTER.decode(reader);
                                break;
                            case 13:
                                managedAccountFundingTransferValueCheckFailedDecode = ManagedAccountFundingTransferValueCheckFailed.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        acatsClawbackDecode = acatsClawback;
                    } else {
                        return new PreSubmissionWarningType(pdt25kLimitDecode, acatsClawback, twoKMinimumEquityCheckFailedDecode, maintenanceExcessCheckFailedDecode, borrowingLimitCheckFailedDecode, transferLimitCheckFailedDecode, unsettledPositionsCheckFailedDecode, negativeTransferMarketValueDecode, goldBoostDecode, instantCheckFailedDecode, transferCountCheckFailedDecode, emptyTransferDecode, managedAccountFundingTransferValueCheckFailedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
