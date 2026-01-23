package nimbus.service.p511v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nimbus.service.p511v1.AssetTransferFailureReasonDto;
import nimbus.service.p511v1.AssetTransferRecordDto;
import nimbus.service.p511v1.AssetTransferStateDto;
import nimbus.service.p511v1.AssetTransferSubTypeDto;
import nimbus.service.p511v1.AssetTransferTypeDto;
import nimbus.service.p511v1.EquityPositionDto;
import p479j$.time.Instant;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: AssetTransferRecordDto.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004WVXYB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B§\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020\u0014\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u0014\u0012\b\b\u0002\u0010&\u001a\u00020#\u0012\b\b\u0002\u0010'\u001a\u00020\b\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\u0016\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010,\u001a\u00020*¢\u0006\u0004\b\u0006\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102H\u0096\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000206H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000206H\u0016¢\u0006\u0004\b?\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u00101R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0019\u0010\u001c\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0019\u0010\u001d\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198F¢\u0006\u0006\u001a\u0004\bH\u0010GR\u0019\u0010\u001e\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198F¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\"\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010LR\u0011\u0010$\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010%\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010LR\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0011\u0010'\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bP\u00101R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u00101R\u0011\u0010)\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bR\u0010ER\u0011\u0010+\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010,\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bU\u0010T¨\u0006Z"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecordDto;", "Lcom/robinhood/idl/MessageDto;", "Lnimbus/service/v1/AssetTransferRecord;", "Landroid/os/Parcelable;", "Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;", "surrogate", "<init>", "(Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;)V", "", "id", "source_rhs_account_number", "destination_rhs_account_number", "Lnimbus/service/v1/AssetTransferStateDto;", "state", "Lnimbus/service/v1/AssetTransferFailureReasonDto;", "failure_reason", "Lnimbus/service/v1/AssetTransferTypeDto;", "transfer_type", "Lnimbus/service/v1/AssetTransferSubTypeDto;", "transfer_sub_type", "", "is_partial", "Lcom/robinhood/idl/IdlDecimal;", "cash_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "record_date", "initiated_at", "completed_at", "created_at", "updated_at", "", "Lnimbus/service/v1/EquityPositionDto;", "equity_positions", "is_owner_source_account", "Lrosetta/account/BrokerageAccountTypeDto;", "source_brokerage_account_type", "is_owner_destination_account", "destination_brokerage_account_type", "source_rhf_account_number", "destination_rhf_account_number", "acats_match_movement_amount", "Lrosetta/account/ManagementTypeDto;", "source_account_management_type", "destination_account_management_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnimbus/service/v1/AssetTransferStateDto;Lnimbus/service/v1/AssetTransferFailureReasonDto;Lnimbus/service/v1/AssetTransferTypeDto;Lnimbus/service/v1/AssetTransferSubTypeDto;ZLcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;ZLrosetta/account/BrokerageAccountTypeDto;ZLrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lrosetta/account/ManagementTypeDto;Lrosetta/account/ManagementTypeDto;)V", "toProto", "()Lnimbus/service/v1/AssetTransferRecord;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;", "getId", "getState", "()Lnimbus/service/v1/AssetTransferStateDto;", "getCash_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getCompleted_at", "()Lj$/time/Instant;", "getCreated_at", "getUpdated_at", "getEquity_positions", "()Ljava/util/List;", "()Z", "getSource_brokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getDestination_brokerage_account_type", "getSource_rhf_account_number", "getDestination_rhf_account_number", "getAcats_match_movement_amount", "getSource_account_management_type", "()Lrosetta/account/ManagementTypeDto;", "getDestination_account_management_type", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class AssetTransferRecordDto implements Dto3<AssetTransferRecord>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AssetTransferRecordDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetTransferRecordDto, AssetTransferRecord>> binaryBase64Serializer$delegate;
    private static final AssetTransferRecordDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AssetTransferRecordDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetTransferRecordDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final AssetTransferStateDto getState() {
        return this.surrogate.getState();
    }

    public final IdlDecimal getCash_amount() {
        return this.surrogate.getCash_amount();
    }

    public final Instant getCompleted_at() {
        return this.surrogate.getCompleted_at();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final List<EquityPositionDto> getEquity_positions() {
        return this.surrogate.getEquity_positions();
    }

    public final boolean is_owner_source_account() {
        return this.surrogate.getIs_owner_source_account();
    }

    public final BrokerageAccountTypeDto getSource_brokerage_account_type() {
        return this.surrogate.getSource_brokerage_account_type();
    }

    public final boolean is_owner_destination_account() {
        return this.surrogate.getIs_owner_destination_account();
    }

    public final BrokerageAccountTypeDto getDestination_brokerage_account_type() {
        return this.surrogate.getDestination_brokerage_account_type();
    }

    public final String getSource_rhf_account_number() {
        return this.surrogate.getSource_rhf_account_number();
    }

    public final String getDestination_rhf_account_number() {
        return this.surrogate.getDestination_rhf_account_number();
    }

    public final IdlDecimal getAcats_match_movement_amount() {
        return this.surrogate.getAcats_match_movement_amount();
    }

    public final ManagementTypeDto getSource_account_management_type() {
        return this.surrogate.getSource_account_management_type();
    }

    public final ManagementTypeDto getDestination_account_management_type() {
        return this.surrogate.getDestination_account_management_type();
    }

    public /* synthetic */ AssetTransferRecordDto(String str, String str2, String str3, AssetTransferStateDto assetTransferStateDto, AssetTransferFailureReasonDto assetTransferFailureReasonDto, AssetTransferTypeDto assetTransferTypeDto, AssetTransferSubTypeDto assetTransferSubTypeDto, boolean z, IdlDecimal idlDecimal, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List list, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z3, BrokerageAccountTypeDto brokerageAccountTypeDto2, String str4, String str5, IdlDecimal idlDecimal2, ManagementTypeDto managementTypeDto, ManagementTypeDto managementTypeDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AssetTransferStateDto.INSTANCE.getZeroValue() : assetTransferStateDto, (i & 16) != 0 ? AssetTransferFailureReasonDto.INSTANCE.getZeroValue() : assetTransferFailureReasonDto, (i & 32) != 0 ? AssetTransferTypeDto.INSTANCE.getZeroValue() : assetTransferTypeDto, (i & 64) != 0 ? AssetTransferSubTypeDto.INSTANCE.getZeroValue() : assetTransferSubTypeDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal, (i & 512) != 0 ? null : instant, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : instant3, (i & 4096) != 0 ? null : instant4, (i & 8192) != 0 ? null : instant5, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 131072) != 0 ? false : z3, (i & 262144) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto2, (i & 524288) != 0 ? "" : str4, (i & 1048576) != 0 ? "" : str5, (i & 2097152) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4194304) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 8388608) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssetTransferRecordDto(String id, String source_rhs_account_number, String destination_rhs_account_number, AssetTransferStateDto state, AssetTransferFailureReasonDto failure_reason, AssetTransferTypeDto transfer_type, AssetTransferSubTypeDto transfer_sub_type, boolean z, IdlDecimal cash_amount, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List<EquityPositionDto> equity_positions, boolean z2, BrokerageAccountTypeDto source_brokerage_account_type, boolean z3, BrokerageAccountTypeDto destination_brokerage_account_type, String source_rhf_account_number, String destination_rhf_account_number, IdlDecimal acats_match_movement_amount, ManagementTypeDto source_account_management_type, ManagementTypeDto destination_account_management_type) {
        this(new Surrogate(id, source_rhs_account_number, destination_rhs_account_number, state, failure_reason, transfer_type, transfer_sub_type, z, cash_amount, instant, instant2, instant3, instant4, instant5, equity_positions, z2, source_brokerage_account_type, z3, destination_brokerage_account_type, source_rhf_account_number, destination_rhf_account_number, acats_match_movement_amount, source_account_management_type, destination_account_management_type));
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AssetTransferRecord toProto() {
        String id = this.surrogate.getId();
        String source_rhs_account_number = this.surrogate.getSource_rhs_account_number();
        String destination_rhs_account_number = this.surrogate.getDestination_rhs_account_number();
        AssetTransferState assetTransferState = (AssetTransferState) this.surrogate.getState().toProto();
        AssetTransferFailureReason assetTransferFailureReason = (AssetTransferFailureReason) this.surrogate.getFailure_reason().toProto();
        AssetTransferType assetTransferType = (AssetTransferType) this.surrogate.getTransfer_type().toProto();
        AssetTransferSubType assetTransferSubType = (AssetTransferSubType) this.surrogate.getTransfer_sub_type().toProto();
        boolean is_partial = this.surrogate.getIs_partial();
        String stringValue = this.surrogate.getCash_amount().getStringValue();
        Instant record_date = this.surrogate.getRecord_date();
        Instant initiated_at = this.surrogate.getInitiated_at();
        Instant completed_at = this.surrogate.getCompleted_at();
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        List<EquityPositionDto> equity_positions = this.surrogate.getEquity_positions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_positions, 10));
        Iterator<T> it = equity_positions.iterator();
        while (it.hasNext()) {
            arrayList.add(((EquityPositionDto) it.next()).toProto());
        }
        return new AssetTransferRecord(id, source_rhs_account_number, destination_rhs_account_number, assetTransferState, assetTransferFailureReason, assetTransferType, assetTransferSubType, is_partial, stringValue, record_date, initiated_at, completed_at, created_at, updated_at, arrayList, this.surrogate.getIs_owner_source_account(), (BrokerageAccountType) this.surrogate.getSource_brokerage_account_type().toProto(), this.surrogate.getIs_owner_destination_account(), (BrokerageAccountType) this.surrogate.getDestination_brokerage_account_type().toProto(), this.surrogate.getSource_rhf_account_number(), this.surrogate.getDestination_rhf_account_number(), this.surrogate.getAcats_match_movement_amount().getStringValue(), (ManagementType) this.surrogate.getSource_account_management_type().toProto(), (ManagementType) this.surrogate.getDestination_account_management_type().toProto(), null, 16777216, null);
    }

    public String toString() {
        return "[AssetTransferRecordDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AssetTransferRecordDto) && Intrinsics.areEqual(((AssetTransferRecordDto) other).surrogate, this.surrogate);
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
    /* compiled from: AssetTransferRecordDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bP\b\u0083\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u0004\u0086\u0001\u0085\u0001BÙ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017\u0012.\b\u0002\u0010\u0019\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017\u0012.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017\u0012.\b\u0002\u0010\u001c\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u000e\u0012\b\b\u0002\u0010$\u001a\u00020!\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010'\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010*\u001a\u00020(¢\u0006\u0004\b+\u0010,B\u008b\u0002\b\u0010\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010(\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b+\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020-HÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010<R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010B\u0012\u0004\bG\u0010E\u001a\u0004\bF\u0010<R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010B\u0012\u0004\bI\u0010E\u001a\u0004\bH\u0010<R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010J\u0012\u0004\bM\u0010E\u001a\u0004\bK\u0010LR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010N\u0012\u0004\bQ\u0010E\u001a\u0004\bO\u0010PR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010R\u0012\u0004\bU\u0010E\u001a\u0004\bS\u0010TR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010V\u0012\u0004\bY\u0010E\u001a\u0004\bW\u0010XR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Z\u0012\u0004\b\\\u0010E\u001a\u0004\b\u000f\u0010[R/\u0010\u0014\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010]\u0012\u0004\b`\u0010E\u001a\u0004\b^\u0010_RF\u0010\u0018\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010a\u0012\u0004\bd\u0010E\u001a\u0004\bb\u0010cRF\u0010\u0019\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010a\u0012\u0004\bf\u0010E\u001a\u0004\be\u0010cRF\u0010\u001a\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010a\u0012\u0004\bh\u0010E\u001a\u0004\bg\u0010cRF\u0010\u001b\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010a\u0012\u0004\bj\u0010E\u001a\u0004\bi\u0010cRF\u0010\u001c\u001a(\u0018\u00010\u0015j\u0013\u0018\u0001`\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010a\u0012\u0004\bl\u0010E\u001a\u0004\bk\u0010cR&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010m\u0012\u0004\bp\u0010E\u001a\u0004\bn\u0010oR \u0010 \u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010Z\u0012\u0004\bq\u0010E\u001a\u0004\b \u0010[R \u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010r\u0012\u0004\bu\u0010E\u001a\u0004\bs\u0010tR \u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010Z\u0012\u0004\bv\u0010E\u001a\u0004\b#\u0010[R \u0010$\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010r\u0012\u0004\bx\u0010E\u001a\u0004\bw\u0010tR \u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010B\u0012\u0004\bz\u0010E\u001a\u0004\by\u0010<R \u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010B\u0012\u0004\b|\u0010E\u001a\u0004\b{\u0010<R/\u0010'\u001a\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010]\u0012\u0004\b~\u0010E\u001a\u0004\b}\u0010_R#\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\b)\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010E\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R#\u0010*\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\b*\u0010\u007f\u0012\u0005\b\u0084\u0001\u0010E\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001¨\u0006\u0087\u0001"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;", "", "", "id", "source_rhs_account_number", "destination_rhs_account_number", "Lnimbus/service/v1/AssetTransferStateDto;", "state", "Lnimbus/service/v1/AssetTransferFailureReasonDto;", "failure_reason", "Lnimbus/service/v1/AssetTransferTypeDto;", "transfer_type", "Lnimbus/service/v1/AssetTransferSubTypeDto;", "transfer_sub_type", "", "is_partial", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "cash_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "record_date", "initiated_at", "completed_at", "created_at", "updated_at", "", "Lnimbus/service/v1/EquityPositionDto;", "equity_positions", "is_owner_source_account", "Lrosetta/account/BrokerageAccountTypeDto;", "source_brokerage_account_type", "is_owner_destination_account", "destination_brokerage_account_type", "source_rhf_account_number", "destination_rhf_account_number", "acats_match_movement_amount", "Lrosetta/account/ManagementTypeDto;", "source_account_management_type", "destination_account_management_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnimbus/service/v1/AssetTransferStateDto;Lnimbus/service/v1/AssetTransferFailureReasonDto;Lnimbus/service/v1/AssetTransferTypeDto;Lnimbus/service/v1/AssetTransferSubTypeDto;ZLcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;ZLrosetta/account/BrokerageAccountTypeDto;ZLrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lrosetta/account/ManagementTypeDto;Lrosetta/account/ManagementTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnimbus/service/v1/AssetTransferStateDto;Lnimbus/service/v1/AssetTransferFailureReasonDto;Lnimbus/service/v1/AssetTransferTypeDto;Lnimbus/service/v1/AssetTransferSubTypeDto;ZLcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;ZLrosetta/account/BrokerageAccountTypeDto;ZLrosetta/account/BrokerageAccountTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lrosetta/account/ManagementTypeDto;Lrosetta/account/ManagementTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nimbus_v1_externalRelease", "(Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getSource_rhs_account_number", "getSource_rhs_account_number$annotations", "getDestination_rhs_account_number", "getDestination_rhs_account_number$annotations", "Lnimbus/service/v1/AssetTransferStateDto;", "getState", "()Lnimbus/service/v1/AssetTransferStateDto;", "getState$annotations", "Lnimbus/service/v1/AssetTransferFailureReasonDto;", "getFailure_reason", "()Lnimbus/service/v1/AssetTransferFailureReasonDto;", "getFailure_reason$annotations", "Lnimbus/service/v1/AssetTransferTypeDto;", "getTransfer_type", "()Lnimbus/service/v1/AssetTransferTypeDto;", "getTransfer_type$annotations", "Lnimbus/service/v1/AssetTransferSubTypeDto;", "getTransfer_sub_type", "()Lnimbus/service/v1/AssetTransferSubTypeDto;", "getTransfer_sub_type$annotations", "Z", "()Z", "is_partial$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getCash_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getCash_amount$annotations", "Lj$/time/Instant;", "getRecord_date", "()Lj$/time/Instant;", "getRecord_date$annotations", "getInitiated_at", "getInitiated_at$annotations", "getCompleted_at", "getCompleted_at$annotations", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Ljava/util/List;", "getEquity_positions", "()Ljava/util/List;", "getEquity_positions$annotations", "is_owner_source_account$annotations", "Lrosetta/account/BrokerageAccountTypeDto;", "getSource_brokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getSource_brokerage_account_type$annotations", "is_owner_destination_account$annotations", "getDestination_brokerage_account_type", "getDestination_brokerage_account_type$annotations", "getSource_rhf_account_number", "getSource_rhf_account_number$annotations", "getDestination_rhf_account_number", "getDestination_rhf_account_number$annotations", "getAcats_match_movement_amount", "getAcats_match_movement_amount$annotations", "Lrosetta/account/ManagementTypeDto;", "getSource_account_management_type", "()Lrosetta/account/ManagementTypeDto;", "getSource_account_management_type$annotations", "getDestination_account_management_type", "getDestination_account_management_type$annotations", "Companion", "$serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final IdlDecimal acats_match_movement_amount;
        private final IdlDecimal cash_amount;
        private final Instant completed_at;
        private final Instant created_at;
        private final ManagementTypeDto destination_account_management_type;
        private final BrokerageAccountTypeDto destination_brokerage_account_type;
        private final String destination_rhf_account_number;
        private final String destination_rhs_account_number;
        private final List<EquityPositionDto> equity_positions;
        private final AssetTransferFailureReasonDto failure_reason;
        private final String id;
        private final Instant initiated_at;
        private final boolean is_owner_destination_account;
        private final boolean is_owner_source_account;
        private final boolean is_partial;
        private final Instant record_date;
        private final ManagementTypeDto source_account_management_type;
        private final BrokerageAccountTypeDto source_brokerage_account_type;
        private final String source_rhf_account_number;
        private final String source_rhs_account_number;
        private final AssetTransferStateDto state;
        private final AssetTransferSubTypeDto transfer_sub_type;
        private final AssetTransferTypeDto transfer_type;
        private final Instant updated_at;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: nimbus.service.v1.AssetTransferRecordDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetTransferRecordDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (AssetTransferStateDto) null, (AssetTransferFailureReasonDto) null, (AssetTransferTypeDto) null, (AssetTransferSubTypeDto) null, false, (IdlDecimal) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (List) null, false, (BrokerageAccountTypeDto) null, false, (BrokerageAccountTypeDto) null, (String) null, (String) null, (IdlDecimal) null, (ManagementTypeDto) null, (ManagementTypeDto) null, 16777215, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(EquityPositionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.source_rhs_account_number, surrogate.source_rhs_account_number) && Intrinsics.areEqual(this.destination_rhs_account_number, surrogate.destination_rhs_account_number) && this.state == surrogate.state && this.failure_reason == surrogate.failure_reason && this.transfer_type == surrogate.transfer_type && this.transfer_sub_type == surrogate.transfer_sub_type && this.is_partial == surrogate.is_partial && Intrinsics.areEqual(this.cash_amount, surrogate.cash_amount) && Intrinsics.areEqual(this.record_date, surrogate.record_date) && Intrinsics.areEqual(this.initiated_at, surrogate.initiated_at) && Intrinsics.areEqual(this.completed_at, surrogate.completed_at) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.equity_positions, surrogate.equity_positions) && this.is_owner_source_account == surrogate.is_owner_source_account && this.source_brokerage_account_type == surrogate.source_brokerage_account_type && this.is_owner_destination_account == surrogate.is_owner_destination_account && this.destination_brokerage_account_type == surrogate.destination_brokerage_account_type && Intrinsics.areEqual(this.source_rhf_account_number, surrogate.source_rhf_account_number) && Intrinsics.areEqual(this.destination_rhf_account_number, surrogate.destination_rhf_account_number) && Intrinsics.areEqual(this.acats_match_movement_amount, surrogate.acats_match_movement_amount) && this.source_account_management_type == surrogate.source_account_management_type && this.destination_account_management_type == surrogate.destination_account_management_type;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.source_rhs_account_number.hashCode()) * 31) + this.destination_rhs_account_number.hashCode()) * 31) + this.state.hashCode()) * 31) + this.failure_reason.hashCode()) * 31) + this.transfer_type.hashCode()) * 31) + this.transfer_sub_type.hashCode()) * 31) + Boolean.hashCode(this.is_partial)) * 31) + this.cash_amount.hashCode()) * 31;
            Instant instant = this.record_date;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.initiated_at;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.completed_at;
            int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
            Instant instant4 = this.created_at;
            int iHashCode5 = (iHashCode4 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
            Instant instant5 = this.updated_at;
            return ((((((((((((((((((((iHashCode5 + (instant5 != null ? instant5.hashCode() : 0)) * 31) + this.equity_positions.hashCode()) * 31) + Boolean.hashCode(this.is_owner_source_account)) * 31) + this.source_brokerage_account_type.hashCode()) * 31) + Boolean.hashCode(this.is_owner_destination_account)) * 31) + this.destination_brokerage_account_type.hashCode()) * 31) + this.source_rhf_account_number.hashCode()) * 31) + this.destination_rhf_account_number.hashCode()) * 31) + this.acats_match_movement_amount.hashCode()) * 31) + this.source_account_management_type.hashCode()) * 31) + this.destination_account_management_type.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", source_rhs_account_number=" + this.source_rhs_account_number + ", destination_rhs_account_number=" + this.destination_rhs_account_number + ", state=" + this.state + ", failure_reason=" + this.failure_reason + ", transfer_type=" + this.transfer_type + ", transfer_sub_type=" + this.transfer_sub_type + ", is_partial=" + this.is_partial + ", cash_amount=" + this.cash_amount + ", record_date=" + this.record_date + ", initiated_at=" + this.initiated_at + ", completed_at=" + this.completed_at + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", equity_positions=" + this.equity_positions + ", is_owner_source_account=" + this.is_owner_source_account + ", source_brokerage_account_type=" + this.source_brokerage_account_type + ", is_owner_destination_account=" + this.is_owner_destination_account + ", destination_brokerage_account_type=" + this.destination_brokerage_account_type + ", source_rhf_account_number=" + this.source_rhf_account_number + ", destination_rhf_account_number=" + this.destination_rhf_account_number + ", acats_match_movement_amount=" + this.acats_match_movement_amount + ", source_account_management_type=" + this.source_account_management_type + ", destination_account_management_type=" + this.destination_account_management_type + ")";
        }

        /* compiled from: AssetTransferRecordDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecordDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AssetTransferRecordDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, AssetTransferStateDto assetTransferStateDto, AssetTransferFailureReasonDto assetTransferFailureReasonDto, AssetTransferTypeDto assetTransferTypeDto, AssetTransferSubTypeDto assetTransferSubTypeDto, boolean z, IdlDecimal idlDecimal, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List list, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z3, BrokerageAccountTypeDto brokerageAccountTypeDto2, String str4, String str5, IdlDecimal idlDecimal2, ManagementTypeDto managementTypeDto, ManagementTypeDto managementTypeDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.source_rhs_account_number = "";
            } else {
                this.source_rhs_account_number = str2;
            }
            if ((i & 4) == 0) {
                this.destination_rhs_account_number = "";
            } else {
                this.destination_rhs_account_number = str3;
            }
            if ((i & 8) == 0) {
                this.state = AssetTransferStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = assetTransferStateDto;
            }
            if ((i & 16) == 0) {
                this.failure_reason = AssetTransferFailureReasonDto.INSTANCE.getZeroValue();
            } else {
                this.failure_reason = assetTransferFailureReasonDto;
            }
            if ((i & 32) == 0) {
                this.transfer_type = AssetTransferTypeDto.INSTANCE.getZeroValue();
            } else {
                this.transfer_type = assetTransferTypeDto;
            }
            if ((i & 64) == 0) {
                this.transfer_sub_type = AssetTransferSubTypeDto.INSTANCE.getZeroValue();
            } else {
                this.transfer_sub_type = assetTransferSubTypeDto;
            }
            if ((i & 128) == 0) {
                this.is_partial = false;
            } else {
                this.is_partial = z;
            }
            if ((i & 256) == 0) {
                this.cash_amount = new IdlDecimal("");
            } else {
                this.cash_amount = idlDecimal;
            }
            if ((i & 512) == 0) {
                this.record_date = null;
            } else {
                this.record_date = instant;
            }
            if ((i & 1024) == 0) {
                this.initiated_at = null;
            } else {
                this.initiated_at = instant2;
            }
            if ((i & 2048) == 0) {
                this.completed_at = null;
            } else {
                this.completed_at = instant3;
            }
            if ((i & 4096) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant4;
            }
            if ((i & 8192) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant5;
            }
            this.equity_positions = (i & 16384) == 0 ? CollectionsKt.emptyList() : list;
            if ((32768 & i) == 0) {
                this.is_owner_source_account = false;
            } else {
                this.is_owner_source_account = z2;
            }
            this.source_brokerage_account_type = (65536 & i) == 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto;
            if ((131072 & i) == 0) {
                this.is_owner_destination_account = false;
            } else {
                this.is_owner_destination_account = z3;
            }
            this.destination_brokerage_account_type = (262144 & i) == 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto2;
            if ((524288 & i) == 0) {
                this.source_rhf_account_number = "";
            } else {
                this.source_rhf_account_number = str4;
            }
            if ((1048576 & i) == 0) {
                this.destination_rhf_account_number = "";
            } else {
                this.destination_rhf_account_number = str5;
            }
            this.acats_match_movement_amount = (2097152 & i) == 0 ? new IdlDecimal("") : idlDecimal2;
            this.source_account_management_type = (4194304 & i) == 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto;
            this.destination_account_management_type = (i & 8388608) == 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nimbus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.source_rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.source_rhs_account_number);
            }
            if (!Intrinsics.areEqual(self.destination_rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.destination_rhs_account_number);
            }
            if (self.state != AssetTransferStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, AssetTransferStateDto.Serializer.INSTANCE, self.state);
            }
            if (self.failure_reason != AssetTransferFailureReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, AssetTransferFailureReasonDto.Serializer.INSTANCE, self.failure_reason);
            }
            if (self.transfer_type != AssetTransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, AssetTransferTypeDto.Serializer.INSTANCE, self.transfer_type);
            }
            if (self.transfer_sub_type != AssetTransferSubTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, AssetTransferSubTypeDto.Serializer.INSTANCE, self.transfer_sub_type);
            }
            boolean z = self.is_partial;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            if (!Intrinsics.areEqual(self.cash_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.cash_amount);
            }
            Instant instant = self.record_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.initiated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.completed_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, WireInstantSerializer.INSTANCE, instant3);
            }
            Instant instant4 = self.created_at;
            if (instant4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WireInstantSerializer.INSTANCE, instant4);
            }
            Instant instant5 = self.updated_at;
            if (instant5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, WireInstantSerializer.INSTANCE, instant5);
            }
            if (!Intrinsics.areEqual(self.equity_positions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 14, lazyArr[14].getValue(), self.equity_positions);
            }
            boolean z2 = self.is_owner_source_account;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 15, z2);
            }
            BrokerageAccountTypeDto brokerageAccountTypeDto = self.source_brokerage_account_type;
            BrokerageAccountTypeDto.Companion companion = BrokerageAccountTypeDto.INSTANCE;
            if (brokerageAccountTypeDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, BrokerageAccountTypeDto.Serializer.INSTANCE, self.source_brokerage_account_type);
            }
            boolean z3 = self.is_owner_destination_account;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 17, z3);
            }
            if (self.destination_brokerage_account_type != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 18, BrokerageAccountTypeDto.Serializer.INSTANCE, self.destination_brokerage_account_type);
            }
            if (!Intrinsics.areEqual(self.source_rhf_account_number, "")) {
                output.encodeStringElement(serialDesc, 19, self.source_rhf_account_number);
            }
            if (!Intrinsics.areEqual(self.destination_rhf_account_number, "")) {
                output.encodeStringElement(serialDesc, 20, self.destination_rhf_account_number);
            }
            if (!Intrinsics.areEqual(self.acats_match_movement_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 21, IdlDecimalSerializer.INSTANCE, self.acats_match_movement_amount);
            }
            ManagementTypeDto managementTypeDto = self.source_account_management_type;
            ManagementTypeDto.Companion companion2 = ManagementTypeDto.INSTANCE;
            if (managementTypeDto != companion2.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 22, ManagementTypeDto.Serializer.INSTANCE, self.source_account_management_type);
            }
            if (self.destination_account_management_type != companion2.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 23, ManagementTypeDto.Serializer.INSTANCE, self.destination_account_management_type);
            }
        }

        public Surrogate(String id, String source_rhs_account_number, String destination_rhs_account_number, AssetTransferStateDto state, AssetTransferFailureReasonDto failure_reason, AssetTransferTypeDto transfer_type, AssetTransferSubTypeDto transfer_sub_type, boolean z, IdlDecimal cash_amount, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List<EquityPositionDto> equity_positions, boolean z2, BrokerageAccountTypeDto source_brokerage_account_type, boolean z3, BrokerageAccountTypeDto destination_brokerage_account_type, String source_rhf_account_number, String destination_rhf_account_number, IdlDecimal acats_match_movement_amount, ManagementTypeDto source_account_management_type, ManagementTypeDto destination_account_management_type) {
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
            this.equity_positions = equity_positions;
            this.is_owner_source_account = z2;
            this.source_brokerage_account_type = source_brokerage_account_type;
            this.is_owner_destination_account = z3;
            this.destination_brokerage_account_type = destination_brokerage_account_type;
            this.source_rhf_account_number = source_rhf_account_number;
            this.destination_rhf_account_number = destination_rhf_account_number;
            this.acats_match_movement_amount = acats_match_movement_amount;
            this.source_account_management_type = source_account_management_type;
            this.destination_account_management_type = destination_account_management_type;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, AssetTransferStateDto assetTransferStateDto, AssetTransferFailureReasonDto assetTransferFailureReasonDto, AssetTransferTypeDto assetTransferTypeDto, AssetTransferSubTypeDto assetTransferSubTypeDto, boolean z, IdlDecimal idlDecimal, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, List list, boolean z2, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z3, BrokerageAccountTypeDto brokerageAccountTypeDto2, String str4, String str5, IdlDecimal idlDecimal2, ManagementTypeDto managementTypeDto, ManagementTypeDto managementTypeDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AssetTransferStateDto.INSTANCE.getZeroValue() : assetTransferStateDto, (i & 16) != 0 ? AssetTransferFailureReasonDto.INSTANCE.getZeroValue() : assetTransferFailureReasonDto, (i & 32) != 0 ? AssetTransferTypeDto.INSTANCE.getZeroValue() : assetTransferTypeDto, (i & 64) != 0 ? AssetTransferSubTypeDto.INSTANCE.getZeroValue() : assetTransferSubTypeDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal, (i & 512) != 0 ? null : instant, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : instant3, (i & 4096) != 0 ? null : instant4, (i & 8192) != 0 ? null : instant5, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 131072) != 0 ? false : z3, (i & 262144) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto2, (i & 524288) != 0 ? "" : str4, (i & 1048576) != 0 ? "" : str5, (i & 2097152) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4194304) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 8388608) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto2);
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

        public final AssetTransferStateDto getState() {
            return this.state;
        }

        public final AssetTransferFailureReasonDto getFailure_reason() {
            return this.failure_reason;
        }

        public final AssetTransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        public final AssetTransferSubTypeDto getTransfer_sub_type() {
            return this.transfer_sub_type;
        }

        /* renamed from: is_partial, reason: from getter */
        public final boolean getIs_partial() {
            return this.is_partial;
        }

        public final IdlDecimal getCash_amount() {
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

        public final List<EquityPositionDto> getEquity_positions() {
            return this.equity_positions;
        }

        /* renamed from: is_owner_source_account, reason: from getter */
        public final boolean getIs_owner_source_account() {
            return this.is_owner_source_account;
        }

        public final BrokerageAccountTypeDto getSource_brokerage_account_type() {
            return this.source_brokerage_account_type;
        }

        /* renamed from: is_owner_destination_account, reason: from getter */
        public final boolean getIs_owner_destination_account() {
            return this.is_owner_destination_account;
        }

        public final BrokerageAccountTypeDto getDestination_brokerage_account_type() {
            return this.destination_brokerage_account_type;
        }

        public final String getSource_rhf_account_number() {
            return this.source_rhf_account_number;
        }

        public final String getDestination_rhf_account_number() {
            return this.destination_rhf_account_number;
        }

        public final IdlDecimal getAcats_match_movement_amount() {
            return this.acats_match_movement_amount;
        }

        public final ManagementTypeDto getSource_account_management_type() {
            return this.source_account_management_type;
        }

        public final ManagementTypeDto getDestination_account_management_type() {
            return this.destination_account_management_type;
        }
    }

    /* compiled from: AssetTransferRecordDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecordDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnimbus/service/v1/AssetTransferRecordDto;", "Lnimbus/service/v1/AssetTransferRecord;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/AssetTransferRecordDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AssetTransferRecordDto, AssetTransferRecord> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetTransferRecordDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferRecordDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferRecordDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetTransferRecordDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetTransferRecord> getProtoAdapter() {
            return AssetTransferRecord.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferRecordDto getZeroValue() {
            return AssetTransferRecordDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferRecordDto fromProto(AssetTransferRecord proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String source_rhs_account_number = proto.getSource_rhs_account_number();
            String destination_rhs_account_number = proto.getDestination_rhs_account_number();
            AssetTransferStateDto assetTransferStateDtoFromProto = AssetTransferStateDto.INSTANCE.fromProto(proto.getState());
            AssetTransferFailureReasonDto assetTransferFailureReasonDtoFromProto = AssetTransferFailureReasonDto.INSTANCE.fromProto(proto.getFailure_reason());
            AssetTransferTypeDto assetTransferTypeDtoFromProto = AssetTransferTypeDto.INSTANCE.fromProto(proto.getTransfer_type());
            AssetTransferSubTypeDto assetTransferSubTypeDtoFromProto = AssetTransferSubTypeDto.INSTANCE.fromProto(proto.getTransfer_sub_type());
            boolean is_partial = proto.getIs_partial();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getCash_amount());
            Instant record_date = proto.getRecord_date();
            Instant initiated_at = proto.getInitiated_at();
            Instant completed_at = proto.getCompleted_at();
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            List<EquityPosition> equity_positions = proto.getEquity_positions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_positions, 10));
            for (Iterator it = equity_positions.iterator(); it.hasNext(); it = it) {
                arrayList.add(EquityPositionDto.INSTANCE.fromProto((EquityPosition) it.next()));
            }
            boolean is_owner_source_account = proto.getIs_owner_source_account();
            BrokerageAccountTypeDto.Companion companion = BrokerageAccountTypeDto.INSTANCE;
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = companion.fromProto(proto.getSource_brokerage_account_type());
            boolean is_owner_destination_account = proto.getIs_owner_destination_account();
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto2 = companion.fromProto(proto.getDestination_brokerage_account_type());
            String source_rhf_account_number = proto.getSource_rhf_account_number();
            String destination_rhf_account_number = proto.getDestination_rhf_account_number();
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getAcats_match_movement_amount());
            ManagementTypeDto.Companion companion2 = ManagementTypeDto.INSTANCE;
            return new AssetTransferRecordDto(new Surrogate(id, source_rhs_account_number, destination_rhs_account_number, assetTransferStateDtoFromProto, assetTransferFailureReasonDtoFromProto, assetTransferTypeDtoFromProto, assetTransferSubTypeDtoFromProto, is_partial, idlDecimal, record_date, initiated_at, completed_at, created_at, updated_at, arrayList, is_owner_source_account, brokerageAccountTypeDtoFromProto, is_owner_destination_account, brokerageAccountTypeDtoFromProto2, source_rhf_account_number, destination_rhf_account_number, idlDecimal2, companion2.fromProto(proto.getSource_account_management_type()), companion2.fromProto(proto.getDestination_account_management_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.AssetTransferRecordDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetTransferRecordDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AssetTransferRecordDto(null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, 16777215, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetTransferRecordDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecordDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/AssetTransferRecordDto;", "<init>", "()V", "surrogateSerializer", "Lnimbus/service/v1/AssetTransferRecordDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssetTransferRecordDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nimbus.service.v1.AssetTransferRecord", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetTransferRecordDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AssetTransferRecordDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AssetTransferRecordDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AssetTransferRecordDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferRecordDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "nimbus.service.v1.AssetTransferRecordDto";
        }
    }
}
