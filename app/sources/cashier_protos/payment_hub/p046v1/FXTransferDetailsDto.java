package cashier_protos.payment_hub.p046v1;

import android.os.Parcel;
import android.os.Parcelable;
import cashier_protos.payment_hub.p046v1.FXTransferStateDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: FXTransferDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bw\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u0010-R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010-¨\u00069"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcashier_protos/payment_hub/v1/FXTransferDetails;", "Landroid/os/Parcelable;", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;)V", "Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "state", "", "fx_trade_time", "expected_settlement_date", "Lcom/robinhood/idl/IdlDecimal;", "base_amount", "Lcom/robinhood/rosetta/common/CurrencyDto;", "base_currency", "target_amount", "target_currency", "target_fx_rate", "target_fx_rate_id", "actual_target_amount", "actual_target_fx_rate", "(Lcashier_protos/payment_hub/v1/FXTransferStateDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcashier_protos/payment_hub/v1/FXTransferDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;", "getBase_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getBase_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getTarget_amount", "getTarget_currency", "getTarget_fx_rate", "getActual_target_amount", "getActual_target_fx_rate", "Companion", "Surrogate", "Serializer", "MultibindingModule", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FXTransferDetailsDto implements Dto3<FXTransferDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FXTransferDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FXTransferDetailsDto, FXTransferDetails>> binaryBase64Serializer$delegate;
    private static final FXTransferDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FXTransferDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FXTransferDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getBase_amount() {
        return this.surrogate.getBase_amount();
    }

    public final CurrencyDto getBase_currency() {
        return this.surrogate.getBase_currency();
    }

    public final IdlDecimal getTarget_amount() {
        return this.surrogate.getTarget_amount();
    }

    public final CurrencyDto getTarget_currency() {
        return this.surrogate.getTarget_currency();
    }

    public final IdlDecimal getTarget_fx_rate() {
        return this.surrogate.getTarget_fx_rate();
    }

    public final IdlDecimal getActual_target_amount() {
        return this.surrogate.getActual_target_amount();
    }

    public final IdlDecimal getActual_target_fx_rate() {
        return this.surrogate.getActual_target_fx_rate();
    }

    public /* synthetic */ FXTransferDetailsDto(FXTransferStateDto fXTransferStateDto, String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, CurrencyDto currencyDto2, IdlDecimal idlDecimal3, String str3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FXTransferStateDto.INSTANCE.getZeroValue() : fXTransferStateDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto2, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FXTransferDetailsDto(FXTransferStateDto state, String fx_trade_time, String expected_settlement_date, IdlDecimal base_amount, CurrencyDto base_currency, IdlDecimal target_amount, CurrencyDto target_currency, IdlDecimal target_fx_rate, String target_fx_rate_id, IdlDecimal actual_target_amount, IdlDecimal actual_target_fx_rate) {
        this(new Surrogate(state, fx_trade_time, expected_settlement_date, base_amount, base_currency, target_amount, target_currency, target_fx_rate, target_fx_rate_id, actual_target_amount, actual_target_fx_rate));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fx_trade_time, "fx_trade_time");
        Intrinsics.checkNotNullParameter(expected_settlement_date, "expected_settlement_date");
        Intrinsics.checkNotNullParameter(base_amount, "base_amount");
        Intrinsics.checkNotNullParameter(base_currency, "base_currency");
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        Intrinsics.checkNotNullParameter(actual_target_amount, "actual_target_amount");
        Intrinsics.checkNotNullParameter(actual_target_fx_rate, "actual_target_fx_rate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FXTransferDetails toProto() {
        return new FXTransferDetails((FXTransferState) this.surrogate.getState().toProto(), this.surrogate.getFx_trade_time(), this.surrogate.getExpected_settlement_date(), this.surrogate.getBase_amount().getStringValue(), (Currency) this.surrogate.getBase_currency().toProto(), this.surrogate.getTarget_amount().getStringValue(), (Currency) this.surrogate.getTarget_currency().toProto(), this.surrogate.getTarget_fx_rate().getStringValue(), this.surrogate.getTarget_fx_rate_id(), this.surrogate.getActual_target_amount().getStringValue(), this.surrogate.getActual_target_fx_rate().getStringValue(), null, 2048, null);
    }

    public String toString() {
        return "[FXTransferDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FXTransferDetailsDto) && Intrinsics.areEqual(((FXTransferDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: FXTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b#\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJBÀ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010%R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010%R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u00100\u001a\u0004\b7\u00108R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b=\u00100\u001a\u0004\b;\u0010<R/\u0010\u000e\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b?\u00100\u001a\u0004\b>\u00108R \u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\bA\u00100\u001a\u0004\b@\u0010<R/\u0010\u0010\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00106\u0012\u0004\bC\u00100\u001a\u0004\bB\u00108R \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00101\u0012\u0004\bE\u00100\u001a\u0004\bD\u0010%R/\u0010\u0012\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00106\u0012\u0004\bG\u00100\u001a\u0004\bF\u00108R/\u0010\u0013\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00106\u0012\u0004\bI\u00100\u001a\u0004\bH\u00108¨\u0006L"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;", "", "Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "state", "", "fx_trade_time", "expected_settlement_date", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "base_amount", "Lcom/robinhood/rosetta/common/CurrencyDto;", "base_currency", "target_amount", "target_currency", "target_fx_rate", "target_fx_rate_id", "actual_target_amount", "actual_target_fx_rate", "<init>", "(Lcashier_protos/payment_hub/v1/FXTransferStateDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcashier_protos/payment_hub/v1/FXTransferStateDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cashier_protos_payment_hub_v1_externalRelease", "(Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "getState", "()Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "getState$annotations", "()V", "Ljava/lang/String;", "getFx_trade_time", "getFx_trade_time$annotations", "getExpected_settlement_date", "getExpected_settlement_date$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getBase_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getBase_amount$annotations", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getBase_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getBase_currency$annotations", "getTarget_amount", "getTarget_amount$annotations", "getTarget_currency", "getTarget_currency$annotations", "getTarget_fx_rate", "getTarget_fx_rate$annotations", "getTarget_fx_rate_id", "getTarget_fx_rate_id$annotations", "getActual_target_amount", "getActual_target_amount$annotations", "getActual_target_fx_rate", "getActual_target_fx_rate$annotations", "Companion", "$serializer", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal actual_target_amount;
        private final IdlDecimal actual_target_fx_rate;
        private final IdlDecimal base_amount;
        private final CurrencyDto base_currency;
        private final String expected_settlement_date;
        private final String fx_trade_time;
        private final FXTransferStateDto state;
        private final IdlDecimal target_amount;
        private final CurrencyDto target_currency;
        private final IdlDecimal target_fx_rate;
        private final String target_fx_rate_id;

        public Surrogate() {
            this((FXTransferStateDto) null, (String) null, (String) null, (IdlDecimal) null, (CurrencyDto) null, (IdlDecimal) null, (CurrencyDto) null, (IdlDecimal) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && Intrinsics.areEqual(this.fx_trade_time, surrogate.fx_trade_time) && Intrinsics.areEqual(this.expected_settlement_date, surrogate.expected_settlement_date) && Intrinsics.areEqual(this.base_amount, surrogate.base_amount) && this.base_currency == surrogate.base_currency && Intrinsics.areEqual(this.target_amount, surrogate.target_amount) && this.target_currency == surrogate.target_currency && Intrinsics.areEqual(this.target_fx_rate, surrogate.target_fx_rate) && Intrinsics.areEqual(this.target_fx_rate_id, surrogate.target_fx_rate_id) && Intrinsics.areEqual(this.actual_target_amount, surrogate.actual_target_amount) && Intrinsics.areEqual(this.actual_target_fx_rate, surrogate.actual_target_fx_rate);
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.fx_trade_time.hashCode()) * 31) + this.expected_settlement_date.hashCode()) * 31) + this.base_amount.hashCode()) * 31) + this.base_currency.hashCode()) * 31) + this.target_amount.hashCode()) * 31) + this.target_currency.hashCode()) * 31) + this.target_fx_rate.hashCode()) * 31) + this.target_fx_rate_id.hashCode()) * 31) + this.actual_target_amount.hashCode()) * 31) + this.actual_target_fx_rate.hashCode();
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", fx_trade_time=" + this.fx_trade_time + ", expected_settlement_date=" + this.expected_settlement_date + ", base_amount=" + this.base_amount + ", base_currency=" + this.base_currency + ", target_amount=" + this.target_amount + ", target_currency=" + this.target_currency + ", target_fx_rate=" + this.target_fx_rate + ", target_fx_rate_id=" + this.target_fx_rate_id + ", actual_target_amount=" + this.actual_target_amount + ", actual_target_fx_rate=" + this.actual_target_fx_rate + ")";
        }

        /* compiled from: FXTransferDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FXTransferDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FXTransferStateDto fXTransferStateDto, String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, CurrencyDto currencyDto2, IdlDecimal idlDecimal3, String str3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? FXTransferStateDto.INSTANCE.getZeroValue() : fXTransferStateDto;
            if ((i & 2) == 0) {
                this.fx_trade_time = "";
            } else {
                this.fx_trade_time = str;
            }
            if ((i & 4) == 0) {
                this.expected_settlement_date = "";
            } else {
                this.expected_settlement_date = str2;
            }
            if ((i & 8) == 0) {
                this.base_amount = new IdlDecimal("");
            } else {
                this.base_amount = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.base_currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.base_currency = currencyDto;
            }
            if ((i & 32) == 0) {
                this.target_amount = new IdlDecimal("");
            } else {
                this.target_amount = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.target_currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.target_currency = currencyDto2;
            }
            if ((i & 128) == 0) {
                this.target_fx_rate = new IdlDecimal("");
            } else {
                this.target_fx_rate = idlDecimal3;
            }
            if ((i & 256) == 0) {
                this.target_fx_rate_id = "";
            } else {
                this.target_fx_rate_id = str3;
            }
            if ((i & 512) == 0) {
                this.actual_target_amount = new IdlDecimal("");
            } else {
                this.actual_target_amount = idlDecimal4;
            }
            if ((i & 1024) == 0) {
                this.actual_target_fx_rate = new IdlDecimal("");
            } else {
                this.actual_target_fx_rate = idlDecimal5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cashier_protos_payment_hub_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != FXTransferStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FXTransferStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.fx_trade_time, "")) {
                output.encodeStringElement(serialDesc, 1, self.fx_trade_time);
            }
            if (!Intrinsics.areEqual(self.expected_settlement_date, "")) {
                output.encodeStringElement(serialDesc, 2, self.expected_settlement_date);
            }
            if (!Intrinsics.areEqual(self.base_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.base_amount);
            }
            CurrencyDto currencyDto = self.base_currency;
            CurrencyDto.Companion companion = CurrencyDto.INSTANCE;
            if (currencyDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, CurrencyDto.Serializer.INSTANCE, self.base_currency);
            }
            if (!Intrinsics.areEqual(self.target_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.target_amount);
            }
            if (self.target_currency != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, CurrencyDto.Serializer.INSTANCE, self.target_currency);
            }
            if (!Intrinsics.areEqual(self.target_fx_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.target_fx_rate);
            }
            if (!Intrinsics.areEqual(self.target_fx_rate_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.target_fx_rate_id);
            }
            if (!Intrinsics.areEqual(self.actual_target_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.actual_target_amount);
            }
            if (Intrinsics.areEqual(self.actual_target_fx_rate, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.actual_target_fx_rate);
        }

        public Surrogate(FXTransferStateDto state, String fx_trade_time, String expected_settlement_date, IdlDecimal base_amount, CurrencyDto base_currency, IdlDecimal target_amount, CurrencyDto target_currency, IdlDecimal target_fx_rate, String target_fx_rate_id, IdlDecimal actual_target_amount, IdlDecimal actual_target_fx_rate) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(fx_trade_time, "fx_trade_time");
            Intrinsics.checkNotNullParameter(expected_settlement_date, "expected_settlement_date");
            Intrinsics.checkNotNullParameter(base_amount, "base_amount");
            Intrinsics.checkNotNullParameter(base_currency, "base_currency");
            Intrinsics.checkNotNullParameter(target_amount, "target_amount");
            Intrinsics.checkNotNullParameter(target_currency, "target_currency");
            Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
            Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
            Intrinsics.checkNotNullParameter(actual_target_amount, "actual_target_amount");
            Intrinsics.checkNotNullParameter(actual_target_fx_rate, "actual_target_fx_rate");
            this.state = state;
            this.fx_trade_time = fx_trade_time;
            this.expected_settlement_date = expected_settlement_date;
            this.base_amount = base_amount;
            this.base_currency = base_currency;
            this.target_amount = target_amount;
            this.target_currency = target_currency;
            this.target_fx_rate = target_fx_rate;
            this.target_fx_rate_id = target_fx_rate_id;
            this.actual_target_amount = actual_target_amount;
            this.actual_target_fx_rate = actual_target_fx_rate;
        }

        public final FXTransferStateDto getState() {
            return this.state;
        }

        public /* synthetic */ Surrogate(FXTransferStateDto fXTransferStateDto, String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, CurrencyDto currencyDto2, IdlDecimal idlDecimal3, String str3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FXTransferStateDto.INSTANCE.getZeroValue() : fXTransferStateDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto2, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal5);
        }

        public final String getFx_trade_time() {
            return this.fx_trade_time;
        }

        public final String getExpected_settlement_date() {
            return this.expected_settlement_date;
        }

        public final IdlDecimal getBase_amount() {
            return this.base_amount;
        }

        public final CurrencyDto getBase_currency() {
            return this.base_currency;
        }

        public final IdlDecimal getTarget_amount() {
            return this.target_amount;
        }

        public final CurrencyDto getTarget_currency() {
            return this.target_currency;
        }

        public final IdlDecimal getTarget_fx_rate() {
            return this.target_fx_rate;
        }

        public final String getTarget_fx_rate_id() {
            return this.target_fx_rate_id;
        }

        public final IdlDecimal getActual_target_amount() {
            return this.actual_target_amount;
        }

        public final IdlDecimal getActual_target_fx_rate() {
            return this.actual_target_fx_rate;
        }
    }

    /* compiled from: FXTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "Lcashier_protos/payment_hub/v1/FXTransferDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FXTransferDetailsDto, FXTransferDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FXTransferDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXTransferDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXTransferDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) FXTransferDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FXTransferDetails> getProtoAdapter() {
            return FXTransferDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXTransferDetailsDto getZeroValue() {
            return FXTransferDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXTransferDetailsDto fromProto(FXTransferDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FXTransferStateDto fXTransferStateDtoFromProto = FXTransferStateDto.INSTANCE.fromProto(proto.getState());
            String fx_trade_time = proto.getFx_trade_time();
            String expected_settlement_date = proto.getExpected_settlement_date();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getBase_amount());
            CurrencyDto.Companion companion = CurrencyDto.INSTANCE;
            return new FXTransferDetailsDto(new Surrogate(fXTransferStateDtoFromProto, fx_trade_time, expected_settlement_date, idlDecimal, companion.fromProto(proto.getBase_currency()), new IdlDecimal(proto.getTarget_amount()), companion.fromProto(proto.getTarget_currency()), new IdlDecimal(proto.getTarget_fx_rate()), proto.getTarget_fx_rate_id(), new IdlDecimal(proto.getActual_target_amount()), new IdlDecimal(proto.getActual_target_fx_rate())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cashier_protos.payment_hub.v1.FXTransferDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FXTransferDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FXTransferDetailsDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FXTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<FXTransferDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cashier_protos.payment_hub.v1.FXTransferDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FXTransferDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FXTransferDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FXTransferDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FXTransferDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "cashier_protos.payment_hub.v1.FXTransferDetailsDto";
        }
    }
}
