package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.AccountApplicationDetailsDto;
import com.robinhood.ceres.p284v1.AccountDetailsDto;
import com.robinhood.ceres.p284v1.ActivitySnapshot;
import com.robinhood.ceres.p284v1.ActivitySnapshotDto;
import com.robinhood.ceres.p284v1.BrokebackSyncObjectDetailsDto;
import com.robinhood.ceres.p284v1.CashBalanceDetailsDto;
import com.robinhood.ceres.p284v1.CurrentAggregatePositionDetailsDto;
import com.robinhood.ceres.p284v1.ExecutionDetailsDto;
import com.robinhood.ceres.p284v1.OrderDetailsDto;
import com.robinhood.ceres.p284v1.PositionSelloutRequestDetailsDto;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ActivitySnapshotDto.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006JKLMNOB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011J:\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\tH\u0016J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020CH\u0016J\b\u0010I\u001a\u00020CH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006P"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshot;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Surrogate;)V", "account_id", "", "type", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "object_id", "ordering_id", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;Ljava/lang/String;JLcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;)V", "getAccount_id", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "getObject_id", "getOrdering_id", "()J", "getDetails", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "position_sellout_request_details", "Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;", "getPosition_sellout_request_details", "()Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;", "brokeback_sync_object_details", "Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;", "getBrokeback_sync_object_details", "()Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;", "order_details", "Lcom/robinhood/ceres/v1/OrderDetailsDto;", "getOrder_details", "()Lcom/robinhood/ceres/v1/OrderDetailsDto;", "cash_balance_details", "Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;", "getCash_balance_details", "()Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;", "current_aggregate_position_details", "Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;", "getCurrent_aggregate_position_details", "()Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;", "account_application_details", "Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;", "getAccount_application_details", "()Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;", "execution_details", "Lcom/robinhood/ceres/v1/ExecutionDetailsDto;", "getExecution_details", "()Lcom/robinhood/ceres/v1/ExecutionDetailsDto;", "account_details", "Lcom/robinhood/ceres/v1/AccountDetailsDto;", "getAccount_details", "()Lcom/robinhood/ceres/v1/AccountDetailsDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DetailsDto", "TypeDto", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ActivitySnapshotDto implements Dto3<ActivitySnapshot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActivitySnapshotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActivitySnapshotDto, ActivitySnapshot>> binaryBase64Serializer$delegate;
    private static final ActivitySnapshotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActivitySnapshotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActivitySnapshotDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final TypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getObject_id() {
        return this.surrogate.getObject_id();
    }

    public final long getOrdering_id() {
        return this.surrogate.getOrdering_id();
    }

    public final DetailsDto getDetails() {
        if (this.surrogate.getPosition_sellout_request_details() != null) {
            return new DetailsDto.PositionSelloutRequestDetails(this.surrogate.getPosition_sellout_request_details());
        }
        if (this.surrogate.getBrokeback_sync_object_details() != null) {
            return new DetailsDto.BrokebackSyncObjectDetails(this.surrogate.getBrokeback_sync_object_details());
        }
        if (this.surrogate.getOrder_details() != null) {
            return new DetailsDto.OrderDetails(this.surrogate.getOrder_details());
        }
        if (this.surrogate.getCash_balance_details() != null) {
            return new DetailsDto.CashBalanceDetails(this.surrogate.getCash_balance_details());
        }
        if (this.surrogate.getCurrent_aggregate_position_details() != null) {
            return new DetailsDto.CurrentAggregatePositionDetails(this.surrogate.getCurrent_aggregate_position_details());
        }
        if (this.surrogate.getAccount_application_details() != null) {
            return new DetailsDto.AccountApplicationDetails(this.surrogate.getAccount_application_details());
        }
        if (this.surrogate.getExecution_details() != null) {
            return new DetailsDto.ExecutionDetails(this.surrogate.getExecution_details());
        }
        if (this.surrogate.getAccount_details() != null) {
            return new DetailsDto.AccountDetails(this.surrogate.getAccount_details());
        }
        return null;
    }

    public final PositionSelloutRequestDetailsDto getPosition_sellout_request_details() {
        return this.surrogate.getPosition_sellout_request_details();
    }

    public final BrokebackSyncObjectDetailsDto getBrokeback_sync_object_details() {
        return this.surrogate.getBrokeback_sync_object_details();
    }

    public final OrderDetailsDto getOrder_details() {
        return this.surrogate.getOrder_details();
    }

    public final CashBalanceDetailsDto getCash_balance_details() {
        return this.surrogate.getCash_balance_details();
    }

    public final CurrentAggregatePositionDetailsDto getCurrent_aggregate_position_details() {
        return this.surrogate.getCurrent_aggregate_position_details();
    }

    public final AccountApplicationDetailsDto getAccount_application_details() {
        return this.surrogate.getAccount_application_details();
    }

    public final ExecutionDetailsDto getExecution_details() {
        return this.surrogate.getExecution_details();
    }

    public final AccountDetailsDto getAccount_details() {
        return this.surrogate.getAccount_details();
    }

    public /* synthetic */ ActivitySnapshotDto(String str, TypeDto typeDto, String str2, long j, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySnapshotDto(String account_id, TypeDto type2, String object_id, long j, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        DetailsDto.PositionSelloutRequestDetails positionSelloutRequestDetails = detailsDto instanceof DetailsDto.PositionSelloutRequestDetails ? (DetailsDto.PositionSelloutRequestDetails) detailsDto : null;
        PositionSelloutRequestDetailsDto value = positionSelloutRequestDetails != null ? positionSelloutRequestDetails.getValue() : null;
        DetailsDto.BrokebackSyncObjectDetails brokebackSyncObjectDetails = detailsDto instanceof DetailsDto.BrokebackSyncObjectDetails ? (DetailsDto.BrokebackSyncObjectDetails) detailsDto : null;
        BrokebackSyncObjectDetailsDto value2 = brokebackSyncObjectDetails != null ? brokebackSyncObjectDetails.getValue() : null;
        DetailsDto.OrderDetails orderDetails = detailsDto instanceof DetailsDto.OrderDetails ? (DetailsDto.OrderDetails) detailsDto : null;
        OrderDetailsDto value3 = orderDetails != null ? orderDetails.getValue() : null;
        DetailsDto.CashBalanceDetails cashBalanceDetails = detailsDto instanceof DetailsDto.CashBalanceDetails ? (DetailsDto.CashBalanceDetails) detailsDto : null;
        CashBalanceDetailsDto value4 = cashBalanceDetails != null ? cashBalanceDetails.getValue() : null;
        DetailsDto.CurrentAggregatePositionDetails currentAggregatePositionDetails = detailsDto instanceof DetailsDto.CurrentAggregatePositionDetails ? (DetailsDto.CurrentAggregatePositionDetails) detailsDto : null;
        CurrentAggregatePositionDetailsDto value5 = currentAggregatePositionDetails != null ? currentAggregatePositionDetails.getValue() : null;
        DetailsDto.AccountApplicationDetails accountApplicationDetails = detailsDto instanceof DetailsDto.AccountApplicationDetails ? (DetailsDto.AccountApplicationDetails) detailsDto : null;
        AccountApplicationDetailsDto value6 = accountApplicationDetails != null ? accountApplicationDetails.getValue() : null;
        DetailsDto.ExecutionDetails executionDetails = detailsDto instanceof DetailsDto.ExecutionDetails ? (DetailsDto.ExecutionDetails) detailsDto : null;
        ExecutionDetailsDto value7 = executionDetails != null ? executionDetails.getValue() : null;
        DetailsDto.AccountDetails accountDetails = detailsDto instanceof DetailsDto.AccountDetails ? (DetailsDto.AccountDetails) detailsDto : null;
        this(new Surrogate(account_id, type2, object_id, j, value, value2, value3, value4, value5, value6, value7, accountDetails != null ? accountDetails.getValue() : null));
    }

    public static /* synthetic */ ActivitySnapshotDto copy$default(ActivitySnapshotDto activitySnapshotDto, String str, TypeDto typeDto, String str2, long j, DetailsDto detailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activitySnapshotDto.surrogate.getAccount_id();
        }
        if ((i & 2) != 0) {
            typeDto = activitySnapshotDto.surrogate.getType();
        }
        if ((i & 4) != 0) {
            str2 = activitySnapshotDto.surrogate.getObject_id();
        }
        if ((i & 8) != 0) {
            j = activitySnapshotDto.surrogate.getOrdering_id();
        }
        if ((i & 16) != 0) {
            detailsDto = activitySnapshotDto.getDetails();
        }
        DetailsDto detailsDto2 = detailsDto;
        String str3 = str2;
        return activitySnapshotDto.copy(str, typeDto, str3, j, detailsDto2);
    }

    public final ActivitySnapshotDto copy(String account_id, TypeDto type2, String object_id, long ordering_id, DetailsDto details) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        DetailsDto.PositionSelloutRequestDetails positionSelloutRequestDetails = details instanceof DetailsDto.PositionSelloutRequestDetails ? (DetailsDto.PositionSelloutRequestDetails) details : null;
        PositionSelloutRequestDetailsDto value = positionSelloutRequestDetails != null ? positionSelloutRequestDetails.getValue() : null;
        DetailsDto.BrokebackSyncObjectDetails brokebackSyncObjectDetails = details instanceof DetailsDto.BrokebackSyncObjectDetails ? (DetailsDto.BrokebackSyncObjectDetails) details : null;
        BrokebackSyncObjectDetailsDto value2 = brokebackSyncObjectDetails != null ? brokebackSyncObjectDetails.getValue() : null;
        DetailsDto.OrderDetails orderDetails = details instanceof DetailsDto.OrderDetails ? (DetailsDto.OrderDetails) details : null;
        OrderDetailsDto value3 = orderDetails != null ? orderDetails.getValue() : null;
        DetailsDto.CashBalanceDetails cashBalanceDetails = details instanceof DetailsDto.CashBalanceDetails ? (DetailsDto.CashBalanceDetails) details : null;
        CashBalanceDetailsDto value4 = cashBalanceDetails != null ? cashBalanceDetails.getValue() : null;
        DetailsDto.CurrentAggregatePositionDetails currentAggregatePositionDetails = details instanceof DetailsDto.CurrentAggregatePositionDetails ? (DetailsDto.CurrentAggregatePositionDetails) details : null;
        CurrentAggregatePositionDetailsDto value5 = currentAggregatePositionDetails != null ? currentAggregatePositionDetails.getValue() : null;
        DetailsDto.AccountApplicationDetails accountApplicationDetails = details instanceof DetailsDto.AccountApplicationDetails ? (DetailsDto.AccountApplicationDetails) details : null;
        AccountApplicationDetailsDto value6 = accountApplicationDetails != null ? accountApplicationDetails.getValue() : null;
        DetailsDto.ExecutionDetails executionDetails = details instanceof DetailsDto.ExecutionDetails ? (DetailsDto.ExecutionDetails) details : null;
        ExecutionDetailsDto value7 = executionDetails != null ? executionDetails.getValue() : null;
        DetailsDto.AccountDetails accountDetails = details instanceof DetailsDto.AccountDetails ? (DetailsDto.AccountDetails) details : null;
        return new ActivitySnapshotDto(new Surrogate(account_id, type2, object_id, ordering_id, value, value2, value3, value4, value5, value6, value7, accountDetails != null ? accountDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ActivitySnapshot toProto() {
        String account_id = this.surrogate.getAccount_id();
        ActivitySnapshot.Type type2 = (ActivitySnapshot.Type) this.surrogate.getType().toProto();
        String object_id = this.surrogate.getObject_id();
        long ordering_id = this.surrogate.getOrdering_id();
        PositionSelloutRequestDetailsDto position_sellout_request_details = this.surrogate.getPosition_sellout_request_details();
        PositionSelloutRequestDetails proto = position_sellout_request_details != null ? position_sellout_request_details.toProto() : null;
        BrokebackSyncObjectDetailsDto brokeback_sync_object_details = this.surrogate.getBrokeback_sync_object_details();
        BrokebackSyncObjectDetails proto2 = brokeback_sync_object_details != null ? brokeback_sync_object_details.toProto() : null;
        OrderDetailsDto order_details = this.surrogate.getOrder_details();
        OrderDetails proto3 = order_details != null ? order_details.toProto() : null;
        CashBalanceDetailsDto cash_balance_details = this.surrogate.getCash_balance_details();
        CashBalanceDetails proto4 = cash_balance_details != null ? cash_balance_details.toProto() : null;
        CurrentAggregatePositionDetailsDto current_aggregate_position_details = this.surrogate.getCurrent_aggregate_position_details();
        CurrentAggregatePositionDetails proto5 = current_aggregate_position_details != null ? current_aggregate_position_details.toProto() : null;
        AccountApplicationDetailsDto account_application_details = this.surrogate.getAccount_application_details();
        AccountApplicationDetails proto6 = account_application_details != null ? account_application_details.toProto() : null;
        ExecutionDetailsDto execution_details = this.surrogate.getExecution_details();
        ExecutionDetails proto7 = execution_details != null ? execution_details.toProto() : null;
        AccountDetailsDto account_details = this.surrogate.getAccount_details();
        return new ActivitySnapshot(account_id, type2, object_id, ordering_id, proto, proto2, proto3, proto4, proto5, proto6, proto7, account_details != null ? account_details.toProto() : null, null, 4096, null);
    }

    public String toString() {
        return "[ActivitySnapshotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActivitySnapshotDto) && Intrinsics.areEqual(((ActivitySnapshotDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 b2\u00020\u0001:\u0002abB\u009e\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dB\u0091\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001c\u0010\"J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0018\u0010J\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001bHÆ\u0003J \u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u001fHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001J%\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0001¢\u0006\u0002\b`R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010$\u001a\u0004\b(\u0010)R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010$\u001a\u0004\b+\u0010&R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010$\u001a\u0004\b-\u0010.R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010$\u001a\u0004\b0\u00101R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010$\u001a\u0004\b3\u00104R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010$\u001a\u0004\b6\u00107R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010$\u001a\u0004\b9\u0010:R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010$\u001a\u0004\b<\u0010=R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010$\u001a\u0004\b?\u0010@R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010$\u001a\u0004\bB\u0010CR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010$\u001a\u0004\bE\u0010F¨\u0006c"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Surrogate;", "", "account_id", "", "type", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "object_id", "ordering_id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "position_sellout_request_details", "Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;", "brokeback_sync_object_details", "Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;", "order_details", "Lcom/robinhood/ceres/v1/OrderDetailsDto;", "cash_balance_details", "Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;", "current_aggregate_position_details", "Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;", "account_application_details", "Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;", "execution_details", "Lcom/robinhood/ceres/v1/ExecutionDetailsDto;", "account_details", "Lcom/robinhood/ceres/v1/AccountDetailsDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;Ljava/lang/String;JLcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;Lcom/robinhood/ceres/v1/OrderDetailsDto;Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;Lcom/robinhood/ceres/v1/ExecutionDetailsDto;Lcom/robinhood/ceres/v1/AccountDetailsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;Ljava/lang/String;JLcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;Lcom/robinhood/ceres/v1/OrderDetailsDto;Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;Lcom/robinhood/ceres/v1/ExecutionDetailsDto;Lcom/robinhood/ceres/v1/AccountDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getType$annotations", "getType", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "getObject_id$annotations", "getObject_id", "getOrdering_id$annotations", "getOrdering_id", "()J", "getPosition_sellout_request_details$annotations", "getPosition_sellout_request_details", "()Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;", "getBrokeback_sync_object_details$annotations", "getBrokeback_sync_object_details", "()Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;", "getOrder_details$annotations", "getOrder_details", "()Lcom/robinhood/ceres/v1/OrderDetailsDto;", "getCash_balance_details$annotations", "getCash_balance_details", "()Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;", "getCurrent_aggregate_position_details$annotations", "getCurrent_aggregate_position_details", "()Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;", "getAccount_application_details$annotations", "getAccount_application_details", "()Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;", "getExecution_details$annotations", "getExecution_details", "()Lcom/robinhood/ceres/v1/ExecutionDetailsDto;", "getAccount_details$annotations", "getAccount_details", "()Lcom/robinhood/ceres/v1/AccountDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountApplicationDetailsDto account_application_details;
        private final AccountDetailsDto account_details;
        private final String account_id;
        private final BrokebackSyncObjectDetailsDto brokeback_sync_object_details;
        private final CashBalanceDetailsDto cash_balance_details;
        private final CurrentAggregatePositionDetailsDto current_aggregate_position_details;
        private final ExecutionDetailsDto execution_details;
        private final String object_id;
        private final OrderDetailsDto order_details;
        private final long ordering_id;
        private final PositionSelloutRequestDetailsDto position_sellout_request_details;
        private final TypeDto type;

        public Surrogate() {
            this((String) null, (TypeDto) null, (String) null, 0L, (PositionSelloutRequestDetailsDto) null, (BrokebackSyncObjectDetailsDto) null, (OrderDetailsDto) null, (CashBalanceDetailsDto) null, (CurrentAggregatePositionDetailsDto) null, (AccountApplicationDetailsDto) null, (ExecutionDetailsDto) null, (AccountDetailsDto) null, 4095, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, TypeDto typeDto, String str2, long j, PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto, BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto, OrderDetailsDto orderDetailsDto, CashBalanceDetailsDto cashBalanceDetailsDto, CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto, AccountApplicationDetailsDto accountApplicationDetailsDto, ExecutionDetailsDto executionDetailsDto, AccountDetailsDto accountDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_id;
            }
            return surrogate.copy(str, (i & 2) != 0 ? surrogate.type : typeDto, (i & 4) != 0 ? surrogate.object_id : str2, (i & 8) != 0 ? surrogate.ordering_id : j, (i & 16) != 0 ? surrogate.position_sellout_request_details : positionSelloutRequestDetailsDto, (i & 32) != 0 ? surrogate.brokeback_sync_object_details : brokebackSyncObjectDetailsDto, (i & 64) != 0 ? surrogate.order_details : orderDetailsDto, (i & 128) != 0 ? surrogate.cash_balance_details : cashBalanceDetailsDto, (i & 256) != 0 ? surrogate.current_aggregate_position_details : currentAggregatePositionDetailsDto, (i & 512) != 0 ? surrogate.account_application_details : accountApplicationDetailsDto, (i & 1024) != 0 ? surrogate.execution_details : executionDetailsDto, (i & 2048) != 0 ? surrogate.account_details : accountDetailsDto);
        }

        @SerialName("accountApplicationDetails")
        @JsonAnnotations2(names = {"account_application_details"})
        public static /* synthetic */ void getAccount_application_details$annotations() {
        }

        @SerialName("accountDetails")
        @JsonAnnotations2(names = {"account_details"})
        public static /* synthetic */ void getAccount_details$annotations() {
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("brokebackSyncObjectDetails")
        @JsonAnnotations2(names = {"brokeback_sync_object_details"})
        public static /* synthetic */ void getBrokeback_sync_object_details$annotations() {
        }

        @SerialName("cashBalanceDetails")
        @JsonAnnotations2(names = {"cash_balance_details"})
        public static /* synthetic */ void getCash_balance_details$annotations() {
        }

        @SerialName("currentAggregatePositionDetails")
        @JsonAnnotations2(names = {"current_aggregate_position_details"})
        public static /* synthetic */ void getCurrent_aggregate_position_details$annotations() {
        }

        @SerialName("executionDetails")
        @JsonAnnotations2(names = {"execution_details"})
        public static /* synthetic */ void getExecution_details$annotations() {
        }

        @SerialName("objectId")
        @JsonAnnotations2(names = {"object_id"})
        public static /* synthetic */ void getObject_id$annotations() {
        }

        @SerialName("orderDetails")
        @JsonAnnotations2(names = {"order_details"})
        public static /* synthetic */ void getOrder_details$annotations() {
        }

        @SerialName("orderingId")
        @JsonAnnotations2(names = {"ordering_id"})
        public static /* synthetic */ void getOrdering_id$annotations() {
        }

        @SerialName("positionSelloutRequestDetails")
        @JsonAnnotations2(names = {"position_sellout_request_details"})
        public static /* synthetic */ void getPosition_sellout_request_details$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final AccountApplicationDetailsDto getAccount_application_details() {
            return this.account_application_details;
        }

        /* renamed from: component11, reason: from getter */
        public final ExecutionDetailsDto getExecution_details() {
            return this.execution_details;
        }

        /* renamed from: component12, reason: from getter */
        public final AccountDetailsDto getAccount_details() {
            return this.account_details;
        }

        /* renamed from: component2, reason: from getter */
        public final TypeDto getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getObject_id() {
            return this.object_id;
        }

        /* renamed from: component4, reason: from getter */
        public final long getOrdering_id() {
            return this.ordering_id;
        }

        /* renamed from: component5, reason: from getter */
        public final PositionSelloutRequestDetailsDto getPosition_sellout_request_details() {
            return this.position_sellout_request_details;
        }

        /* renamed from: component6, reason: from getter */
        public final BrokebackSyncObjectDetailsDto getBrokeback_sync_object_details() {
            return this.brokeback_sync_object_details;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderDetailsDto getOrder_details() {
            return this.order_details;
        }

        /* renamed from: component8, reason: from getter */
        public final CashBalanceDetailsDto getCash_balance_details() {
            return this.cash_balance_details;
        }

        /* renamed from: component9, reason: from getter */
        public final CurrentAggregatePositionDetailsDto getCurrent_aggregate_position_details() {
            return this.current_aggregate_position_details;
        }

        public final Surrogate copy(String account_id, TypeDto type2, String object_id, long ordering_id, PositionSelloutRequestDetailsDto position_sellout_request_details, BrokebackSyncObjectDetailsDto brokeback_sync_object_details, OrderDetailsDto order_details, CashBalanceDetailsDto cash_balance_details, CurrentAggregatePositionDetailsDto current_aggregate_position_details, AccountApplicationDetailsDto account_application_details, ExecutionDetailsDto execution_details, AccountDetailsDto account_details) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(object_id, "object_id");
            return new Surrogate(account_id, type2, object_id, ordering_id, position_sellout_request_details, brokeback_sync_object_details, order_details, cash_balance_details, current_aggregate_position_details, account_application_details, execution_details, account_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.type == surrogate.type && Intrinsics.areEqual(this.object_id, surrogate.object_id) && this.ordering_id == surrogate.ordering_id && Intrinsics.areEqual(this.position_sellout_request_details, surrogate.position_sellout_request_details) && Intrinsics.areEqual(this.brokeback_sync_object_details, surrogate.brokeback_sync_object_details) && Intrinsics.areEqual(this.order_details, surrogate.order_details) && Intrinsics.areEqual(this.cash_balance_details, surrogate.cash_balance_details) && Intrinsics.areEqual(this.current_aggregate_position_details, surrogate.current_aggregate_position_details) && Intrinsics.areEqual(this.account_application_details, surrogate.account_application_details) && Intrinsics.areEqual(this.execution_details, surrogate.execution_details) && Intrinsics.areEqual(this.account_details, surrogate.account_details);
        }

        public int hashCode() {
            int iHashCode = ((((((this.account_id.hashCode() * 31) + this.type.hashCode()) * 31) + this.object_id.hashCode()) * 31) + Long.hashCode(this.ordering_id)) * 31;
            PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto = this.position_sellout_request_details;
            int iHashCode2 = (iHashCode + (positionSelloutRequestDetailsDto == null ? 0 : positionSelloutRequestDetailsDto.hashCode())) * 31;
            BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto = this.brokeback_sync_object_details;
            int iHashCode3 = (iHashCode2 + (brokebackSyncObjectDetailsDto == null ? 0 : brokebackSyncObjectDetailsDto.hashCode())) * 31;
            OrderDetailsDto orderDetailsDto = this.order_details;
            int iHashCode4 = (iHashCode3 + (orderDetailsDto == null ? 0 : orderDetailsDto.hashCode())) * 31;
            CashBalanceDetailsDto cashBalanceDetailsDto = this.cash_balance_details;
            int iHashCode5 = (iHashCode4 + (cashBalanceDetailsDto == null ? 0 : cashBalanceDetailsDto.hashCode())) * 31;
            CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto = this.current_aggregate_position_details;
            int iHashCode6 = (iHashCode5 + (currentAggregatePositionDetailsDto == null ? 0 : currentAggregatePositionDetailsDto.hashCode())) * 31;
            AccountApplicationDetailsDto accountApplicationDetailsDto = this.account_application_details;
            int iHashCode7 = (iHashCode6 + (accountApplicationDetailsDto == null ? 0 : accountApplicationDetailsDto.hashCode())) * 31;
            ExecutionDetailsDto executionDetailsDto = this.execution_details;
            int iHashCode8 = (iHashCode7 + (executionDetailsDto == null ? 0 : executionDetailsDto.hashCode())) * 31;
            AccountDetailsDto accountDetailsDto = this.account_details;
            return iHashCode8 + (accountDetailsDto != null ? accountDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", type=" + this.type + ", object_id=" + this.object_id + ", ordering_id=" + this.ordering_id + ", position_sellout_request_details=" + this.position_sellout_request_details + ", brokeback_sync_object_details=" + this.brokeback_sync_object_details + ", order_details=" + this.order_details + ", cash_balance_details=" + this.cash_balance_details + ", current_aggregate_position_details=" + this.current_aggregate_position_details + ", account_application_details=" + this.account_application_details + ", execution_details=" + this.execution_details + ", account_details=" + this.account_details + ")";
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActivitySnapshotDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TypeDto typeDto, String str2, long j, PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto, BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto, OrderDetailsDto orderDetailsDto, CashBalanceDetailsDto cashBalanceDetailsDto, CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto, AccountApplicationDetailsDto accountApplicationDetailsDto, ExecutionDetailsDto executionDetailsDto, AccountDetailsDto accountDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = typeDto;
            }
            if ((i & 4) == 0) {
                this.object_id = "";
            } else {
                this.object_id = str2;
            }
            if ((i & 8) == 0) {
                this.ordering_id = 0L;
            } else {
                this.ordering_id = j;
            }
            if ((i & 16) == 0) {
                this.position_sellout_request_details = null;
            } else {
                this.position_sellout_request_details = positionSelloutRequestDetailsDto;
            }
            if ((i & 32) == 0) {
                this.brokeback_sync_object_details = null;
            } else {
                this.brokeback_sync_object_details = brokebackSyncObjectDetailsDto;
            }
            if ((i & 64) == 0) {
                this.order_details = null;
            } else {
                this.order_details = orderDetailsDto;
            }
            if ((i & 128) == 0) {
                this.cash_balance_details = null;
            } else {
                this.cash_balance_details = cashBalanceDetailsDto;
            }
            if ((i & 256) == 0) {
                this.current_aggregate_position_details = null;
            } else {
                this.current_aggregate_position_details = currentAggregatePositionDetailsDto;
            }
            if ((i & 512) == 0) {
                this.account_application_details = null;
            } else {
                this.account_application_details = accountApplicationDetailsDto;
            }
            if ((i & 1024) == 0) {
                this.execution_details = null;
            } else {
                this.execution_details = executionDetailsDto;
            }
            if ((i & 2048) == 0) {
                this.account_details = null;
            } else {
                this.account_details = accountDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.object_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.object_id);
            }
            long j = self.ordering_id;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto = self.position_sellout_request_details;
            if (positionSelloutRequestDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PositionSelloutRequestDetailsDto.Serializer.INSTANCE, positionSelloutRequestDetailsDto);
            }
            BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto = self.brokeback_sync_object_details;
            if (brokebackSyncObjectDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BrokebackSyncObjectDetailsDto.Serializer.INSTANCE, brokebackSyncObjectDetailsDto);
            }
            OrderDetailsDto orderDetailsDto = self.order_details;
            if (orderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, OrderDetailsDto.Serializer.INSTANCE, orderDetailsDto);
            }
            CashBalanceDetailsDto cashBalanceDetailsDto = self.cash_balance_details;
            if (cashBalanceDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, CashBalanceDetailsDto.Serializer.INSTANCE, cashBalanceDetailsDto);
            }
            CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto = self.current_aggregate_position_details;
            if (currentAggregatePositionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, CurrentAggregatePositionDetailsDto.Serializer.INSTANCE, currentAggregatePositionDetailsDto);
            }
            AccountApplicationDetailsDto accountApplicationDetailsDto = self.account_application_details;
            if (accountApplicationDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, AccountApplicationDetailsDto.Serializer.INSTANCE, accountApplicationDetailsDto);
            }
            ExecutionDetailsDto executionDetailsDto = self.execution_details;
            if (executionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ExecutionDetailsDto.Serializer.INSTANCE, executionDetailsDto);
            }
            AccountDetailsDto accountDetailsDto = self.account_details;
            if (accountDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, AccountDetailsDto.Serializer.INSTANCE, accountDetailsDto);
            }
        }

        public Surrogate(String account_id, TypeDto type2, String object_id, long j, PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto, BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto, OrderDetailsDto orderDetailsDto, CashBalanceDetailsDto cashBalanceDetailsDto, CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto, AccountApplicationDetailsDto accountApplicationDetailsDto, ExecutionDetailsDto executionDetailsDto, AccountDetailsDto accountDetailsDto) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(object_id, "object_id");
            this.account_id = account_id;
            this.type = type2;
            this.object_id = object_id;
            this.ordering_id = j;
            this.position_sellout_request_details = positionSelloutRequestDetailsDto;
            this.brokeback_sync_object_details = brokebackSyncObjectDetailsDto;
            this.order_details = orderDetailsDto;
            this.cash_balance_details = cashBalanceDetailsDto;
            this.current_aggregate_position_details = currentAggregatePositionDetailsDto;
            this.account_application_details = accountApplicationDetailsDto;
            this.execution_details = executionDetailsDto;
            this.account_details = accountDetailsDto;
        }

        public /* synthetic */ Surrogate(String str, TypeDto typeDto, String str2, long j, PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto, BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto, OrderDetailsDto orderDetailsDto, CashBalanceDetailsDto cashBalanceDetailsDto, CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto, AccountApplicationDetailsDto accountApplicationDetailsDto, ExecutionDetailsDto executionDetailsDto, AccountDetailsDto accountDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : positionSelloutRequestDetailsDto, (i & 32) != 0 ? null : brokebackSyncObjectDetailsDto, (i & 64) != 0 ? null : orderDetailsDto, (i & 128) != 0 ? null : cashBalanceDetailsDto, (i & 256) != 0 ? null : currentAggregatePositionDetailsDto, (i & 512) != 0 ? null : accountApplicationDetailsDto, (i & 1024) != 0 ? null : executionDetailsDto, (i & 2048) != 0 ? null : accountDetailsDto);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final String getObject_id() {
            return this.object_id;
        }

        public final long getOrdering_id() {
            return this.ordering_id;
        }

        public final PositionSelloutRequestDetailsDto getPosition_sellout_request_details() {
            return this.position_sellout_request_details;
        }

        public final BrokebackSyncObjectDetailsDto getBrokeback_sync_object_details() {
            return this.brokeback_sync_object_details;
        }

        public final OrderDetailsDto getOrder_details() {
            return this.order_details;
        }

        public final CashBalanceDetailsDto getCash_balance_details() {
            return this.cash_balance_details;
        }

        public final CurrentAggregatePositionDetailsDto getCurrent_aggregate_position_details() {
            return this.current_aggregate_position_details;
        }

        public final AccountApplicationDetailsDto getAccount_application_details() {
            return this.account_application_details;
        }

        public final ExecutionDetailsDto getExecution_details() {
            return this.execution_details;
        }

        public final AccountDetailsDto getAccount_details() {
            return this.account_details;
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActivitySnapshotDto, ActivitySnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActivitySnapshotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotDto> getBinaryBase64Serializer() {
            return (KSerializer) ActivitySnapshotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActivitySnapshot> getProtoAdapter() {
            return ActivitySnapshot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotDto getZeroValue() {
            return ActivitySnapshotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotDto fromProto(ActivitySnapshot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            TypeDto typeDtoFromProto = TypeDto.INSTANCE.fromProto(proto.getType());
            String object_id = proto.getObject_id();
            long ordering_id = proto.getOrdering_id();
            PositionSelloutRequestDetails position_sellout_request_details = proto.getPosition_sellout_request_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDtoFromProto = position_sellout_request_details != null ? PositionSelloutRequestDetailsDto.INSTANCE.fromProto(position_sellout_request_details) : null;
            BrokebackSyncObjectDetails brokeback_sync_object_details = proto.getBrokeback_sync_object_details();
            BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDtoFromProto = brokeback_sync_object_details != null ? BrokebackSyncObjectDetailsDto.INSTANCE.fromProto(brokeback_sync_object_details) : null;
            OrderDetails order_details = proto.getOrder_details();
            OrderDetailsDto orderDetailsDtoFromProto = order_details != null ? OrderDetailsDto.INSTANCE.fromProto(order_details) : null;
            CashBalanceDetails cash_balance_details = proto.getCash_balance_details();
            CashBalanceDetailsDto cashBalanceDetailsDtoFromProto = cash_balance_details != null ? CashBalanceDetailsDto.INSTANCE.fromProto(cash_balance_details) : null;
            CurrentAggregatePositionDetails current_aggregate_position_details = proto.getCurrent_aggregate_position_details();
            CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDtoFromProto = current_aggregate_position_details != null ? CurrentAggregatePositionDetailsDto.INSTANCE.fromProto(current_aggregate_position_details) : null;
            AccountApplicationDetails account_application_details = proto.getAccount_application_details();
            AccountApplicationDetailsDto accountApplicationDetailsDtoFromProto = account_application_details != null ? AccountApplicationDetailsDto.INSTANCE.fromProto(account_application_details) : null;
            ExecutionDetails execution_details = proto.getExecution_details();
            ExecutionDetailsDto executionDetailsDtoFromProto = execution_details != null ? ExecutionDetailsDto.INSTANCE.fromProto(execution_details) : null;
            AccountDetails account_details = proto.getAccount_details();
            return new ActivitySnapshotDto(new Surrogate(account_id, typeDtoFromProto, object_id, ordering_id, positionSelloutRequestDetailsDtoFromProto, brokebackSyncObjectDetailsDtoFromProto, orderDetailsDtoFromProto, cashBalanceDetailsDtoFromProto, currentAggregatePositionDetailsDtoFromProto, accountApplicationDetailsDtoFromProto, executionDetailsDtoFromProto, account_details != null ? AccountDetailsDto.INSTANCE.fromProto(account_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ActivitySnapshotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivitySnapshotDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ActivitySnapshotDto(null, null, null, 0L, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PositionSelloutRequestDetails", "BrokebackSyncObjectDetails", "OrderDetails", "CashBalanceDetails", "CurrentAggregatePositionDetails", "AccountApplicationDetails", "ExecutionDetails", "AccountDetails", "Companion", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$AccountApplicationDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$AccountDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$BrokebackSyncObjectDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$CashBalanceDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$CurrentAggregatePositionDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$ExecutionDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$OrderDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$PositionSelloutRequestDetails;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$PositionSelloutRequestDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/PositionSelloutRequestDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PositionSelloutRequestDetails extends DetailsDto {
            private final PositionSelloutRequestDetailsDto value;

            public static /* synthetic */ PositionSelloutRequestDetails copy$default(PositionSelloutRequestDetails positionSelloutRequestDetails, PositionSelloutRequestDetailsDto positionSelloutRequestDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    positionSelloutRequestDetailsDto = positionSelloutRequestDetails.value;
                }
                return positionSelloutRequestDetails.copy(positionSelloutRequestDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final PositionSelloutRequestDetailsDto getValue() {
                return this.value;
            }

            public final PositionSelloutRequestDetails copy(PositionSelloutRequestDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new PositionSelloutRequestDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PositionSelloutRequestDetails) && Intrinsics.areEqual(this.value, ((PositionSelloutRequestDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PositionSelloutRequestDetails(value=" + this.value + ")";
            }

            public final PositionSelloutRequestDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PositionSelloutRequestDetails(PositionSelloutRequestDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$BrokebackSyncObjectDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BrokebackSyncObjectDetails extends DetailsDto {
            private final BrokebackSyncObjectDetailsDto value;

            public static /* synthetic */ BrokebackSyncObjectDetails copy$default(BrokebackSyncObjectDetails brokebackSyncObjectDetails, BrokebackSyncObjectDetailsDto brokebackSyncObjectDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    brokebackSyncObjectDetailsDto = brokebackSyncObjectDetails.value;
                }
                return brokebackSyncObjectDetails.copy(brokebackSyncObjectDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final BrokebackSyncObjectDetailsDto getValue() {
                return this.value;
            }

            public final BrokebackSyncObjectDetails copy(BrokebackSyncObjectDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new BrokebackSyncObjectDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BrokebackSyncObjectDetails) && Intrinsics.areEqual(this.value, ((BrokebackSyncObjectDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BrokebackSyncObjectDetails(value=" + this.value + ")";
            }

            public final BrokebackSyncObjectDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BrokebackSyncObjectDetails(BrokebackSyncObjectDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$OrderDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/OrderDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/OrderDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/OrderDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderDetails extends DetailsDto {
            private final OrderDetailsDto value;

            public static /* synthetic */ OrderDetails copy$default(OrderDetails orderDetails, OrderDetailsDto orderDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderDetailsDto = orderDetails.value;
                }
                return orderDetails.copy(orderDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderDetailsDto getValue() {
                return this.value;
            }

            public final OrderDetails copy(OrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new OrderDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderDetails) && Intrinsics.areEqual(this.value, ((OrderDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OrderDetails(value=" + this.value + ")";
            }

            public final OrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderDetails(OrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$CashBalanceDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/CashBalanceDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CashBalanceDetails extends DetailsDto {
            private final CashBalanceDetailsDto value;

            public static /* synthetic */ CashBalanceDetails copy$default(CashBalanceDetails cashBalanceDetails, CashBalanceDetailsDto cashBalanceDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    cashBalanceDetailsDto = cashBalanceDetails.value;
                }
                return cashBalanceDetails.copy(cashBalanceDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CashBalanceDetailsDto getValue() {
                return this.value;
            }

            public final CashBalanceDetails copy(CashBalanceDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CashBalanceDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CashBalanceDetails) && Intrinsics.areEqual(this.value, ((CashBalanceDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CashBalanceDetails(value=" + this.value + ")";
            }

            public final CashBalanceDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashBalanceDetails(CashBalanceDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$CurrentAggregatePositionDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CurrentAggregatePositionDetails extends DetailsDto {
            private final CurrentAggregatePositionDetailsDto value;

            public static /* synthetic */ CurrentAggregatePositionDetails copy$default(CurrentAggregatePositionDetails currentAggregatePositionDetails, CurrentAggregatePositionDetailsDto currentAggregatePositionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    currentAggregatePositionDetailsDto = currentAggregatePositionDetails.value;
                }
                return currentAggregatePositionDetails.copy(currentAggregatePositionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CurrentAggregatePositionDetailsDto getValue() {
                return this.value;
            }

            public final CurrentAggregatePositionDetails copy(CurrentAggregatePositionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CurrentAggregatePositionDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CurrentAggregatePositionDetails) && Intrinsics.areEqual(this.value, ((CurrentAggregatePositionDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CurrentAggregatePositionDetails(value=" + this.value + ")";
            }

            public final CurrentAggregatePositionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CurrentAggregatePositionDetails(CurrentAggregatePositionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$AccountApplicationDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/AccountApplicationDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountApplicationDetails extends DetailsDto {
            private final AccountApplicationDetailsDto value;

            public static /* synthetic */ AccountApplicationDetails copy$default(AccountApplicationDetails accountApplicationDetails, AccountApplicationDetailsDto accountApplicationDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    accountApplicationDetailsDto = accountApplicationDetails.value;
                }
                return accountApplicationDetails.copy(accountApplicationDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final AccountApplicationDetailsDto getValue() {
                return this.value;
            }

            public final AccountApplicationDetails copy(AccountApplicationDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AccountApplicationDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountApplicationDetails) && Intrinsics.areEqual(this.value, ((AccountApplicationDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AccountApplicationDetails(value=" + this.value + ")";
            }

            public final AccountApplicationDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountApplicationDetails(AccountApplicationDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$ExecutionDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ExecutionDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ExecutionDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ExecutionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ExecutionDetails extends DetailsDto {
            private final ExecutionDetailsDto value;

            public static /* synthetic */ ExecutionDetails copy$default(ExecutionDetails executionDetails, ExecutionDetailsDto executionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    executionDetailsDto = executionDetails.value;
                }
                return executionDetails.copy(executionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ExecutionDetailsDto getValue() {
                return this.value;
            }

            public final ExecutionDetails copy(ExecutionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ExecutionDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExecutionDetails) && Intrinsics.areEqual(this.value, ((ExecutionDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ExecutionDetails(value=" + this.value + ")";
            }

            public final ExecutionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExecutionDetails(ExecutionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$AccountDetails;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/AccountDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/AccountDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/AccountDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountDetails extends DetailsDto {
            private final AccountDetailsDto value;

            public static /* synthetic */ AccountDetails copy$default(AccountDetails accountDetails, AccountDetailsDto accountDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    accountDetailsDto = accountDetails.value;
                }
                return accountDetails.copy(accountDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final AccountDetailsDto getValue() {
                return this.value;
            }

            public final AccountDetails copy(AccountDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AccountDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountDetails) && Intrinsics.areEqual(this.value, ((AccountDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AccountDetails(value=" + this.value + ")";
            }

            public final AccountDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountDetails(AccountDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$DetailsDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshot;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DetailsDto, ActivitySnapshot> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ActivitySnapshot> getProtoAdapter() {
                return ActivitySnapshot.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(ActivitySnapshot proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPosition_sellout_request_details() != null) {
                    return new PositionSelloutRequestDetails(PositionSelloutRequestDetailsDto.INSTANCE.fromProto(proto.getPosition_sellout_request_details()));
                }
                if (proto.getBrokeback_sync_object_details() != null) {
                    return new BrokebackSyncObjectDetails(BrokebackSyncObjectDetailsDto.INSTANCE.fromProto(proto.getBrokeback_sync_object_details()));
                }
                if (proto.getOrder_details() != null) {
                    return new OrderDetails(OrderDetailsDto.INSTANCE.fromProto(proto.getOrder_details()));
                }
                if (proto.getCash_balance_details() != null) {
                    return new CashBalanceDetails(CashBalanceDetailsDto.INSTANCE.fromProto(proto.getCash_balance_details()));
                }
                if (proto.getCurrent_aggregate_position_details() != null) {
                    return new CurrentAggregatePositionDetails(CurrentAggregatePositionDetailsDto.INSTANCE.fromProto(proto.getCurrent_aggregate_position_details()));
                }
                if (proto.getAccount_application_details() != null) {
                    return new AccountApplicationDetails(AccountApplicationDetailsDto.INSTANCE.fromProto(proto.getAccount_application_details()));
                }
                if (proto.getExecution_details() != null) {
                    return new ExecutionDetails(ExecutionDetailsDto.INSTANCE.fromProto(proto.getExecution_details()));
                }
                if (proto.getAccount_details() != null) {
                    return new AccountDetails(AccountDetailsDto.INSTANCE.fromProto(proto.getAccount_details()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "POSITION_SELLOUT_REQUEST_DETAILS", "BROKEBACK_SYNC_OBJECT_DETAILS", "ORDER_DETAILS", "CASH_BALANCE_DETAILS", "CURRENT_AGGREGATE_POSITION_DETAILS", "ACCOUNT_APPLICATION_DETAILS", "EXECUTION_DETAILS", "ACCOUNT_DETAILS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<ActivitySnapshot.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, ActivitySnapshot.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final TypeDto POSITION_SELLOUT_REQUEST_DETAILS = new POSITION_SELLOUT_REQUEST_DETAILS("POSITION_SELLOUT_REQUEST_DETAILS", 1);
        public static final TypeDto BROKEBACK_SYNC_OBJECT_DETAILS = new BROKEBACK_SYNC_OBJECT_DETAILS("BROKEBACK_SYNC_OBJECT_DETAILS", 2);
        public static final TypeDto ORDER_DETAILS = new ORDER_DETAILS("ORDER_DETAILS", 3);
        public static final TypeDto CASH_BALANCE_DETAILS = new CASH_BALANCE_DETAILS("CASH_BALANCE_DETAILS", 4);
        public static final TypeDto CURRENT_AGGREGATE_POSITION_DETAILS = new CURRENT_AGGREGATE_POSITION_DETAILS("CURRENT_AGGREGATE_POSITION_DETAILS", 5);
        public static final TypeDto ACCOUNT_APPLICATION_DETAILS = new ACCOUNT_APPLICATION_DETAILS("ACCOUNT_APPLICATION_DETAILS", 6);
        public static final TypeDto EXECUTION_DETAILS = new EXECUTION_DETAILS("EXECUTION_DETAILS", 7);
        public static final TypeDto ACCOUNT_DETAILS = new ACCOUNT_DETAILS("ACCOUNT_DETAILS", 8);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{TYPE_UNSPECIFIED, POSITION_SELLOUT_REQUEST_DETAILS, BROKEBACK_SYNC_OBJECT_DETAILS, ORDER_DETAILS, CASH_BALANCE_DETAILS, CURRENT_AGGREGATE_POSITION_DETAILS, ACCOUNT_APPLICATION_DETAILS, EXECUTION_DETAILS, ACCOUNT_DETAILS};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.TYPE_UNSPECIFIED", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends TypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.TYPE_UNSPECIFIED;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ActivitySnapshotDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ActivitySnapshotDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.POSITION_SELLOUT_REQUEST_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POSITION_SELLOUT_REQUEST_DETAILS extends TypeDto {
            POSITION_SELLOUT_REQUEST_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.POSITION_SELLOUT_REQUEST_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.BROKEBACK_SYNC_OBJECT_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BROKEBACK_SYNC_OBJECT_DETAILS extends TypeDto {
            BROKEBACK_SYNC_OBJECT_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.BROKEBACK_SYNC_OBJECT_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.ORDER_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_DETAILS extends TypeDto {
            ORDER_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ORDER_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.CASH_BALANCE_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASH_BALANCE_DETAILS extends TypeDto {
            CASH_BALANCE_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CASH_BALANCE_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.CURRENT_AGGREGATE_POSITION_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENT_AGGREGATE_POSITION_DETAILS extends TypeDto {
            CURRENT_AGGREGATE_POSITION_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.CURRENT_AGGREGATE_POSITION_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.ACCOUNT_APPLICATION_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_APPLICATION_DETAILS extends TypeDto {
            ACCOUNT_APPLICATION_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ACCOUNT_APPLICATION_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.EXECUTION_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXECUTION_DETAILS extends TypeDto {
            EXECUTION_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.EXECUTION_DETAILS;
            }
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/ceres/v1/ActivitySnapshotDto.TypeDto.ACCOUNT_DETAILS", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "toProto", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_DETAILS extends TypeDto {
            ACCOUNT_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ActivitySnapshot.Type toProto() {
                return ActivitySnapshot.Type.ACCOUNT_DETAILS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, ActivitySnapshot.Type> {

            /* compiled from: ActivitySnapshotDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ActivitySnapshot.Type.values().length];
                    try {
                        iArr[ActivitySnapshot.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.POSITION_SELLOUT_REQUEST_DETAILS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.BROKEBACK_SYNC_OBJECT_DETAILS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ORDER_DETAILS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CASH_BALANCE_DETAILS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.CURRENT_AGGREGATE_POSITION_DETAILS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ACCOUNT_APPLICATION_DETAILS.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.EXECUTION_DETAILS.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ActivitySnapshot.Type.ACCOUNT_DETAILS.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ActivitySnapshot.Type> getProtoAdapter() {
                return ActivitySnapshot.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(ActivitySnapshot.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TypeDto.TYPE_UNSPECIFIED;
                    case 2:
                        return TypeDto.POSITION_SELLOUT_REQUEST_DETAILS;
                    case 3:
                        return TypeDto.BROKEBACK_SYNC_OBJECT_DETAILS;
                    case 4:
                        return TypeDto.ORDER_DETAILS;
                    case 5:
                        return TypeDto.CASH_BALANCE_DETAILS;
                    case 6:
                        return TypeDto.CURRENT_AGGREGATE_POSITION_DETAILS;
                    case 7:
                        return TypeDto.ACCOUNT_APPLICATION_DETAILS;
                    case 8:
                        return TypeDto.EXECUTION_DETAILS;
                    case 9:
                        return TypeDto.ACCOUNT_DETAILS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ActivitySnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, ActivitySnapshot.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.service.ActivitySnapshot.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ActivitySnapshotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.ActivitySnapshot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActivitySnapshotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActivitySnapshotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActivitySnapshotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActivitySnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.ActivitySnapshotDto";
        }
    }
}
