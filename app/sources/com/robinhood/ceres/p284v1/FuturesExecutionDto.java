package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: FuturesExecutionDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>?@AB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B¡\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u001bJ\u009e\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\tJ\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\tH\u0016J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000207H\u0016J\b\u0010=\u001a\u000207H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001d¨\u0006B"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesExecution;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesExecutionDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesExecutionDto$Surrogate;)V", "id", "", "contract_id", "price_per_contract", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "event_time", "realized_pnl", "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_pnl_without_fees", "total_fee", "total_commission", "total_gold_savings", "account_id", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "side", "Lrosetta/mainst/SideDto;", "rhs_account_number", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getContract_id", "getPrice_per_contract", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "getEvent_time", "getRealized_pnl", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_pnl_without_fees", "getTotal_fee", "getTotal_commission", "getTotal_gold_savings", "getAccount_id", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getSide", "()Lrosetta/mainst/SideDto;", "getRhs_account_number", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesExecutionDto implements Dto3<FuturesExecution>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesExecutionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesExecutionDto, FuturesExecution>> binaryBase64Serializer$delegate;
    private static final FuturesExecutionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesExecutionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesExecutionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final IdlDecimal getPrice_per_contract() {
        return this.surrogate.getPrice_per_contract();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final String getEvent_time() {
        return this.surrogate.getEvent_time();
    }

    public final MoneyDto getRealized_pnl() {
        return this.surrogate.getRealized_pnl();
    }

    public final MoneyDto getRealized_pnl_without_fees() {
        return this.surrogate.getRealized_pnl_without_fees();
    }

    public final MoneyDto getTotal_fee() {
        return this.surrogate.getTotal_fee();
    }

    public final MoneyDto getTotal_commission() {
        return this.surrogate.getTotal_commission();
    }

    public final MoneyDto getTotal_gold_savings() {
        return this.surrogate.getTotal_gold_savings();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public /* synthetic */ FuturesExecutionDto(String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, String str4, FuturesContractTypeDto futuresContractTypeDto, SideDto sideDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? null : moneyDto4, (i & 512) != 0 ? null : moneyDto5, (i & 1024) == 0 ? str4 : "", (i & 2048) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i & 4096) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8192) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesExecutionDto(String id, String contract_id, IdlDecimal price_per_contract, IdlDecimal quantity, String event_time, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, String account_id, FuturesContractTypeDto contract_type, SideDto side, String str) {
        this(new Surrogate(id, contract_id, price_per_contract, quantity, event_time, moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto5, account_id, contract_type, side, str));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(side, "side");
    }

    public final FuturesExecutionDto copy(String id, String contract_id, IdlDecimal price_per_contract, IdlDecimal quantity, String event_time, MoneyDto realized_pnl, MoneyDto realized_pnl_without_fees, MoneyDto total_fee, MoneyDto total_commission, MoneyDto total_gold_savings, String account_id, FuturesContractTypeDto contract_type, SideDto side, String rhs_account_number) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(side, "side");
        return new FuturesExecutionDto(new Surrogate(id, contract_id, price_per_contract, quantity, event_time, realized_pnl, realized_pnl_without_fees, total_fee, total_commission, total_gold_savings, account_id, contract_type, side, rhs_account_number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesExecution toProto() {
        String id = this.surrogate.getId();
        String contract_id = this.surrogate.getContract_id();
        String stringValue = this.surrogate.getPrice_per_contract().getStringValue();
        String stringValue2 = this.surrogate.getQuantity().getStringValue();
        String event_time = this.surrogate.getEvent_time();
        MoneyDto realized_pnl = this.surrogate.getRealized_pnl();
        Money proto = realized_pnl != null ? realized_pnl.toProto() : null;
        MoneyDto realized_pnl_without_fees = this.surrogate.getRealized_pnl_without_fees();
        Money proto2 = realized_pnl_without_fees != null ? realized_pnl_without_fees.toProto() : null;
        MoneyDto total_fee = this.surrogate.getTotal_fee();
        Money proto3 = total_fee != null ? total_fee.toProto() : null;
        MoneyDto total_commission = this.surrogate.getTotal_commission();
        Money proto4 = total_commission != null ? total_commission.toProto() : null;
        MoneyDto total_gold_savings = this.surrogate.getTotal_gold_savings();
        return new FuturesExecution(id, contract_id, stringValue, stringValue2, event_time, proto, proto2, proto3, proto4, total_gold_savings != null ? total_gold_savings.toProto() : null, this.surrogate.getAccount_id(), (FuturesContractType) this.surrogate.getContract_type().toProto(), (Side) this.surrogate.getSide().toProto(), this.surrogate.getRhs_account_number(), null, 16384, null);
    }

    public String toString() {
        return "[FuturesExecutionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesExecutionDto) && Intrinsics.areEqual(((FuturesExecutionDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ^2\u00020\u0001:\u0002]^B½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019B§\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0018\u0010\u001eJ\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u0018\u0010C\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010D\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0014HÆ\u0003J\t\u0010M\u001a\u00020\u0016HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¿\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u001bHÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001J%\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0001¢\u0006\u0002\b\\R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010 \u001a\u0004\b&\u0010'R+\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010 \u001a\u0004\b)\u0010'R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010 \u001a\u0004\b-\u0010.R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010 \u001a\u0004\b0\u0010.R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010 \u001a\u0004\b2\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010 \u001a\u0004\b4\u0010.R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010 \u001a\u0004\b6\u0010.R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010 \u001a\u0004\b8\u0010\"R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010 \u001a\u0004\b:\u0010;R\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010 \u001a\u0004\b=\u0010>R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010 \u001a\u0004\b@\u0010\"¨\u0006_"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecutionDto$Surrogate;", "", "id", "", "contract_id", "price_per_contract", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "event_time", "realized_pnl", "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_pnl_without_fees", "total_fee", "total_commission", "total_gold_savings", "account_id", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "side", "Lrosetta/mainst/SideDto;", "rhs_account_number", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getContract_id$annotations", "getContract_id", "getPrice_per_contract$annotations", "getPrice_per_contract", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "getQuantity", "getEvent_time$annotations", "getEvent_time", "getRealized_pnl$annotations", "getRealized_pnl", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_pnl_without_fees$annotations", "getRealized_pnl_without_fees", "getTotal_fee$annotations", "getTotal_fee", "getTotal_commission$annotations", "getTotal_commission", "getTotal_gold_savings$annotations", "getTotal_gold_savings", "getAccount_id$annotations", "getAccount_id", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getRhs_account_number$annotations", "getRhs_account_number", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String contract_id;
        private final FuturesContractTypeDto contract_type;
        private final String event_time;
        private final String id;
        private final IdlDecimal price_per_contract;
        private final IdlDecimal quantity;
        private final MoneyDto realized_pnl;
        private final MoneyDto realized_pnl_without_fees;
        private final String rhs_account_number;
        private final SideDto side;
        private final MoneyDto total_commission;
        private final MoneyDto total_fee;
        private final MoneyDto total_gold_savings;

        public Surrogate() {
            this((String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, (FuturesContractTypeDto) null, (SideDto) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("eventTime")
        @JsonAnnotations2(names = {"event_time"})
        public static /* synthetic */ void getEvent_time$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("pricePerContract")
        @JsonAnnotations2(names = {"price_per_contract"})
        public static /* synthetic */ void getPrice_per_contract$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("realizedPnl")
        @JsonAnnotations2(names = {"realized_pnl"})
        public static /* synthetic */ void getRealized_pnl$annotations() {
        }

        @SerialName("realizedPnlWithoutFees")
        @JsonAnnotations2(names = {"realized_pnl_without_fees"})
        public static /* synthetic */ void getRealized_pnl_without_fees$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("totalCommission")
        @JsonAnnotations2(names = {"total_commission"})
        public static /* synthetic */ void getTotal_commission$annotations() {
        }

        @SerialName("totalFee")
        @JsonAnnotations2(names = {"total_fee"})
        public static /* synthetic */ void getTotal_fee$annotations() {
        }

        @SerialName("totalGoldSavings")
        @JsonAnnotations2(names = {"total_gold_savings"})
        public static /* synthetic */ void getTotal_gold_savings$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component12, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component13, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component14, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getPrice_per_contract() {
            return this.price_per_contract;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEvent_time() {
            return this.event_time;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getRealized_pnl() {
            return this.realized_pnl;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getRealized_pnl_without_fees() {
            return this.realized_pnl_without_fees;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        /* renamed from: component9, reason: from getter */
        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        public final Surrogate copy(String id, String contract_id, IdlDecimal price_per_contract, IdlDecimal quantity, String event_time, MoneyDto realized_pnl, MoneyDto realized_pnl_without_fees, MoneyDto total_fee, MoneyDto total_commission, MoneyDto total_gold_savings, String account_id, FuturesContractTypeDto contract_type, SideDto side, String rhs_account_number) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(event_time, "event_time");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(side, "side");
            return new Surrogate(id, contract_id, price_per_contract, quantity, event_time, realized_pnl, realized_pnl_without_fees, total_fee, total_commission, total_gold_savings, account_id, contract_type, side, rhs_account_number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.price_per_contract, surrogate.price_per_contract) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.event_time, surrogate.event_time) && Intrinsics.areEqual(this.realized_pnl, surrogate.realized_pnl) && Intrinsics.areEqual(this.realized_pnl_without_fees, surrogate.realized_pnl_without_fees) && Intrinsics.areEqual(this.total_fee, surrogate.total_fee) && Intrinsics.areEqual(this.total_commission, surrogate.total_commission) && Intrinsics.areEqual(this.total_gold_savings, surrogate.total_gold_savings) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.contract_type == surrogate.contract_type && this.side == surrogate.side && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.contract_id.hashCode()) * 31) + this.price_per_contract.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.event_time.hashCode()) * 31;
            MoneyDto moneyDto = this.realized_pnl;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.realized_pnl_without_fees;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.total_fee;
            int iHashCode4 = (iHashCode3 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.total_commission;
            int iHashCode5 = (iHashCode4 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.total_gold_savings;
            int iHashCode6 = (((((((iHashCode5 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31) + this.account_id.hashCode()) * 31) + this.contract_type.hashCode()) * 31) + this.side.hashCode()) * 31;
            String str = this.rhs_account_number;
            return iHashCode6 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", contract_id=" + this.contract_id + ", price_per_contract=" + this.price_per_contract + ", quantity=" + this.quantity + ", event_time=" + this.event_time + ", realized_pnl=" + this.realized_pnl + ", realized_pnl_without_fees=" + this.realized_pnl_without_fees + ", total_fee=" + this.total_fee + ", total_commission=" + this.total_commission + ", total_gold_savings=" + this.total_gold_savings + ", account_id=" + this.account_id + ", contract_type=" + this.contract_type + ", side=" + this.side + ", rhs_account_number=" + this.rhs_account_number + ")";
        }

        /* compiled from: FuturesExecutionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecutionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesExecutionDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesExecutionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, String str4, FuturesContractTypeDto futuresContractTypeDto, SideDto sideDto, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str2;
            }
            if ((i & 4) == 0) {
                this.price_per_contract = new IdlDecimal("");
            } else {
                this.price_per_contract = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.event_time = "";
            } else {
                this.event_time = str3;
            }
            if ((i & 32) == 0) {
                this.realized_pnl = null;
            } else {
                this.realized_pnl = moneyDto;
            }
            if ((i & 64) == 0) {
                this.realized_pnl_without_fees = null;
            } else {
                this.realized_pnl_without_fees = moneyDto2;
            }
            if ((i & 128) == 0) {
                this.total_fee = null;
            } else {
                this.total_fee = moneyDto3;
            }
            if ((i & 256) == 0) {
                this.total_commission = null;
            } else {
                this.total_commission = moneyDto4;
            }
            if ((i & 512) == 0) {
                this.total_gold_savings = null;
            } else {
                this.total_gold_savings = moneyDto5;
            }
            if ((i & 1024) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str4;
            }
            if ((i & 2048) == 0) {
                this.contract_type = FuturesContractTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            this.side = (i & 4096) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            if ((i & 8192) == 0) {
                this.rhs_account_number = null;
            } else {
                this.rhs_account_number = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.contract_id);
            }
            if (!Intrinsics.areEqual(self.price_per_contract, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.price_per_contract);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.event_time, "")) {
                output.encodeStringElement(serialDesc, 4, self.event_time);
            }
            MoneyDto moneyDto = self.realized_pnl;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.realized_pnl_without_fees;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.total_fee;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.total_commission;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.total_gold_savings;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.account_id);
            }
            if (self.contract_type != FuturesContractTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, FuturesContractTypeDto.Serializer.INSTANCE, self.contract_type);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, SideDto.Serializer.INSTANCE, self.side);
            }
            String str = self.rhs_account_number;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String id, String contract_id, IdlDecimal price_per_contract, IdlDecimal quantity, String event_time, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, String account_id, FuturesContractTypeDto contract_type, SideDto side, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(event_time, "event_time");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(side, "side");
            this.id = id;
            this.contract_id = contract_id;
            this.price_per_contract = price_per_contract;
            this.quantity = quantity;
            this.event_time = event_time;
            this.realized_pnl = moneyDto;
            this.realized_pnl_without_fees = moneyDto2;
            this.total_fee = moneyDto3;
            this.total_commission = moneyDto4;
            this.total_gold_savings = moneyDto5;
            this.account_id = account_id;
            this.contract_type = contract_type;
            this.side = side;
            this.rhs_account_number = str;
        }

        public /* synthetic */ Surrogate(String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str3, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, String str4, FuturesContractTypeDto futuresContractTypeDto, SideDto sideDto, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? null : moneyDto4, (i & 512) != 0 ? null : moneyDto5, (i & 1024) == 0 ? str4 : "", (i & 2048) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i & 4096) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8192) != 0 ? null : str5);
        }

        public final String getId() {
            return this.id;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final IdlDecimal getPrice_per_contract() {
            return this.price_per_contract;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final String getEvent_time() {
            return this.event_time;
        }

        public final MoneyDto getRealized_pnl() {
            return this.realized_pnl;
        }

        public final MoneyDto getRealized_pnl_without_fees() {
            return this.realized_pnl_without_fees;
        }

        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }
    }

    /* compiled from: FuturesExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecutionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "Lcom/robinhood/ceres/v1/FuturesExecution;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesExecutionDto, FuturesExecution> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesExecutionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesExecutionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesExecutionDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesExecutionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesExecution> getProtoAdapter() {
            return FuturesExecution.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesExecutionDto getZeroValue() {
            return FuturesExecutionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesExecutionDto fromProto(FuturesExecution proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String contract_id = proto.getContract_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getPrice_per_contract());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getQuantity());
            String event_time = proto.getEvent_time();
            Money realized_pnl = proto.getRealized_pnl();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = realized_pnl != null ? MoneyDto.INSTANCE.fromProto(realized_pnl) : null;
            Money realized_pnl_without_fees = proto.getRealized_pnl_without_fees();
            MoneyDto moneyDtoFromProto2 = realized_pnl_without_fees != null ? MoneyDto.INSTANCE.fromProto(realized_pnl_without_fees) : null;
            Money total_fee = proto.getTotal_fee();
            MoneyDto moneyDtoFromProto3 = total_fee != null ? MoneyDto.INSTANCE.fromProto(total_fee) : null;
            Money total_commission = proto.getTotal_commission();
            MoneyDto moneyDtoFromProto4 = total_commission != null ? MoneyDto.INSTANCE.fromProto(total_commission) : null;
            Money total_gold_savings = proto.getTotal_gold_savings();
            return new FuturesExecutionDto(new Surrogate(id, contract_id, idlDecimal, idlDecimal2, event_time, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, moneyDtoFromProto4, total_gold_savings != null ? MoneyDto.INSTANCE.fromProto(total_gold_savings) : null, proto.getAccount_id(), FuturesContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), SideDto.INSTANCE.fromProto(proto.getSide()), proto.getRhs_account_number()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesExecutionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesExecutionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesExecutionDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesExecutionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecutionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesExecutionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesExecutionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesExecution", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesExecutionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesExecutionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesExecutionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecutionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesExecutionDto";
        }
    }
}
