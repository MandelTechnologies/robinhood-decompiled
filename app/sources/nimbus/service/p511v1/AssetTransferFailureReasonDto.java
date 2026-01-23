package nimbus.service.p511v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssetTransferFailureReasonDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002/0B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u00061"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferFailureReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lnimbus/service/v1/AssetTransferFailureReason;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "FAILURE_REASON_UNSPECIFIED", "FAILURE_REASON_NONE", "FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK", "FAILURE_REASON_SOURCE_ACCOUNT_DISABLED", "FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED", "FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT", "FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT", "FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION", "FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION", "FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", "FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", "FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", "FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", "FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED", "FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED", "FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", "FAILURE_REASON_CASH_HOLD_REJECTED", "FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED", "FAILURE_REASON_CASH_HOLD_FAILED", "FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED", "FAILURE_REASON_CANCELLED_BY_USER", "FAILURE_REASON_CANCELLED_BY_MO_USER", "FAILURE_REASON_OTHER", "FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", "FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION", "FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED", "FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", "FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE", "FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AssetTransferFailureReasonDto implements Dto2<AssetTransferFailureReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferFailureReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AssetTransferFailureReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetTransferFailureReasonDto, AssetTransferFailureReason>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final AssetTransferFailureReasonDto FAILURE_REASON_UNSPECIFIED = new AssetTransferFailureReasonDto("FAILURE_REASON_UNSPECIFIED", 0) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_NONE = new AssetTransferFailureReasonDto("FAILURE_REASON_NONE", 1) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_NONE
        {
            String str = ApiRenderablePlatforms.VERSIONS_NONE;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_NONE;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK = new AssetTransferFailureReasonDto("FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK", 2) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK
        {
            String str = "insufficient_funds_for_acats_clawback";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_SOURCE_ACCOUNT_DISABLED = new AssetTransferFailureReasonDto("FAILURE_REASON_SOURCE_ACCOUNT_DISABLED", 3) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_DISABLED
        {
            String str = "source_account_disabled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_DISABLED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED = new AssetTransferFailureReasonDto("FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED", 4) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED
        {
            String str = "destination_account_disabled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT = new AssetTransferFailureReasonDto("FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT", 5) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT
        {
            String str = "source_account_deficit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT = new AssetTransferFailureReasonDto("FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT", 6) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT
        {
            String str = "destination_account_deficit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION = new AssetTransferFailureReasonDto("FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION", 7) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION
        {
            String str = "source_account_active_restriction";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION = new AssetTransferFailureReasonDto("FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION", 8) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION
        {
            String str = "destination_account_active_restriction";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL = new AssetTransferFailureReasonDto("FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", 9) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL
        {
            String str = "source_account_active_past_due_margin_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL = new AssetTransferFailureReasonDto("FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", 10) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL
        {
            String str = "destination_account_active_past_due_margin_call";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", 11) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED
        {
            String str = "2k_minimum_equity_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", 12) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED
        {
            String str = "maintenance_excess_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED", 13) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED
        {
            String str = "borrowing_limit_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED", 14) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED
        {
            String str = "transfer_limit_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", 15) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED
        {
            String str = "unsettled_positions_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_CASH_HOLD_REJECTED = new AssetTransferFailureReasonDto("FAILURE_REASON_CASH_HOLD_REJECTED", 16) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_CASH_HOLD_REJECTED
        {
            String str = "cash_hold_rejected";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_CASH_HOLD_REJECTED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED = new AssetTransferFailureReasonDto("FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED", 17) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED
        {
            String str = "equity_position_hold_rejected";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_CASH_HOLD_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_CASH_HOLD_FAILED", 18) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_CASH_HOLD_FAILED
        {
            String str = "cash_hold_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_CASH_HOLD_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED", 19) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED
        {
            String str = "equity_position_hold_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_CANCELLED_BY_USER = new AssetTransferFailureReasonDto("FAILURE_REASON_CANCELLED_BY_USER", 20) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_CANCELLED_BY_USER
        {
            String str = "cancelled_by_user";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_CANCELLED_BY_USER;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_CANCELLED_BY_MO_USER = new AssetTransferFailureReasonDto("FAILURE_REASON_CANCELLED_BY_MO_USER", 21) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_CANCELLED_BY_MO_USER
        {
            String str = "cancelled_by_mo_user";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_CANCELLED_BY_MO_USER;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_OTHER = new AssetTransferFailureReasonDto("FAILURE_REASON_OTHER", 22) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_OTHER
        {
            String str = "other";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_OTHER;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE = new AssetTransferFailureReasonDto("FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", 23) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE
        {
            String str = "negative_transfer_market_value";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION = new AssetTransferFailureReasonDto("FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION", 24) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION
        {
            String str = "source_account_open_futures_position";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED = new AssetTransferFailureReasonDto("FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED", 25) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED
        {
            String str = "transfer_count_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED = new AssetTransferFailureReasonDto("FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", 26) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED
        {
            String str = "managed_account_instrument_not_allowed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
        }
    };
    public static final AssetTransferFailureReasonDto FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE = new AssetTransferFailureReasonDto("FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE", 27) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE
        {
            String str = "instrument_not_transferable";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE;
        }
    };

    /* renamed from: FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED */
    public static final AssetTransferFailureReasonDto f7125x2d5e119c = new AssetTransferFailureReasonDto("FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", 28) { // from class: nimbus.service.v1.AssetTransferFailureReasonDto.FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED
        {
            String str = "managed_account_funding_transfer_value_check_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferFailureReason toProto() {
            return AssetTransferFailureReason.f7124x2d5e119c;
        }
    };

    private static final /* synthetic */ AssetTransferFailureReasonDto[] $values() {
        return new AssetTransferFailureReasonDto[]{FAILURE_REASON_UNSPECIFIED, FAILURE_REASON_NONE, FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK, FAILURE_REASON_SOURCE_ACCOUNT_DISABLED, FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED, FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT, FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT, FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION, FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION, FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL, FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL, FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED, FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED, FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED, FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED, FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED, FAILURE_REASON_CASH_HOLD_REJECTED, FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED, FAILURE_REASON_CASH_HOLD_FAILED, FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED, FAILURE_REASON_CANCELLED_BY_USER, FAILURE_REASON_CANCELLED_BY_MO_USER, FAILURE_REASON_OTHER, FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE, FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION, FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED, FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED, FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE, f7125x2d5e119c};
    }

    public /* synthetic */ AssetTransferFailureReasonDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<AssetTransferFailureReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetTransferFailureReasonDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        AssetTransferFailureReasonDto[] assetTransferFailureReasonDtoArr$values = $values();
        $VALUES = assetTransferFailureReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferFailureReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.AssetTransferFailureReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetTransferFailureReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AssetTransferFailureReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferFailureReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnimbus/service/v1/AssetTransferFailureReasonDto;", "Lnimbus/service/v1/AssetTransferFailureReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/AssetTransferFailureReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AssetTransferFailureReasonDto, AssetTransferFailureReason> {

        /* compiled from: AssetTransferFailureReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetTransferFailureReason.values().length];
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_NONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_DISABLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_CASH_HOLD_REJECTED.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_CASH_HOLD_FAILED.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_CANCELLED_BY_USER.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_CANCELLED_BY_MO_USER.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_OTHER.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[AssetTransferFailureReason.FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[AssetTransferFailureReason.f7124x2d5e119c.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetTransferFailureReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferFailureReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferFailureReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetTransferFailureReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetTransferFailureReason> getProtoAdapter() {
            return AssetTransferFailureReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferFailureReasonDto getZeroValue() {
            return AssetTransferFailureReasonDto.FAILURE_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferFailureReasonDto fromProto(AssetTransferFailureReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_UNSPECIFIED;
                case 2:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_NONE;
                case 3:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK;
                case 4:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_DISABLED;
                case 5:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED;
                case 6:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT;
                case 7:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT;
                case 8:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION;
                case 9:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION;
                case 10:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
                case 11:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
                case 12:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
                case 13:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;
                case 14:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED;
                case 15:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED;
                case 16:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
                case 17:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_CASH_HOLD_REJECTED;
                case 18:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED;
                case 19:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_CASH_HOLD_FAILED;
                case 20:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED;
                case 21:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_CANCELLED_BY_USER;
                case 22:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_CANCELLED_BY_MO_USER;
                case 23:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_OTHER;
                case 24:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
                case 25:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION;
                case 26:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED;
                case 27:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
                case 28:
                    return AssetTransferFailureReasonDto.FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE;
                case 29:
                    return AssetTransferFailureReasonDto.f7125x2d5e119c;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetTransferFailureReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferFailureReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/AssetTransferFailureReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<AssetTransferFailureReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AssetTransferFailureReasonDto, AssetTransferFailureReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nimbus.service.v1.AssetTransferFailureReason", AssetTransferFailureReasonDto.getEntries(), AssetTransferFailureReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AssetTransferFailureReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AssetTransferFailureReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetTransferFailureReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AssetTransferFailureReasonDto valueOf(String str) {
        return (AssetTransferFailureReasonDto) Enum.valueOf(AssetTransferFailureReasonDto.class, str);
    }

    public static AssetTransferFailureReasonDto[] values() {
        return (AssetTransferFailureReasonDto[]) $VALUES.clone();
    }
}
