package com.robinhood.prediction_markets.proto.p361v1.combo;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.prediction_markets.proto.p361v1.combo.ComboLegsDto;
import com.robinhood.prediction_markets.proto.p361v1.combo.CreateComboRFQRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboLeg;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboLegDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CreateComboRFQRequestDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006=>?@ABB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011J8\u00100\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\u0013\u00103\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u00106\u001a\u00020\fH\u0016J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b/\u0010%¨\u0006C"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate;)V", "legs", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboLegDto;", "quantity", "", "combo_instrument", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "desired_quantity", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "(Ljava/util/List;ILcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;)V", "getLegs", "()Ljava/util/List;", "getQuantity", "()I", "getCombo_instrument", "()Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "combo_legs", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;", "getCombo_legs", "()Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;", "combo_instrument_id", "", "getCombo_instrument_id", "()Ljava/lang/String;", "getDesired_quantity", "()Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "contracts", "Lcom/robinhood/idl/IdlDecimal;", "getContracts", "()Lcom/robinhood/idl/IdlDecimal;", "notional_amount_money", "Lcom/robinhood/rosetta/common/MoneyDto;", "getNotional_amount_money", "()Lcom/robinhood/rosetta/common/MoneyDto;", "use_default_quantity", "", "getUse_default_quantity", "()Ljava/lang/Boolean;", "notional_amount", "getNotional_amount", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ComboInstrumentDto", "DesiredQuantityDto", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CreateComboRFQRequestDto implements Dto3<CreateComboRFQRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateComboRFQRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateComboRFQRequestDto, CreateComboRFQRequest>> binaryBase64Serializer$delegate;
    private static final CreateComboRFQRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateComboRFQRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateComboRFQRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<ComboLegDto> getLegs() {
        return this.surrogate.getLegs();
    }

    public final int getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final ComboInstrumentDto getCombo_instrument() {
        if (this.surrogate.getCombo_legs() != null) {
            return new ComboInstrumentDto.ComboLegs(this.surrogate.getCombo_legs());
        }
        if (this.surrogate.getCombo_instrument_id() != null) {
            return new ComboInstrumentDto.ComboInstrumentId(this.surrogate.getCombo_instrument_id());
        }
        return null;
    }

    public final ComboLegsDto getCombo_legs() {
        return this.surrogate.getCombo_legs();
    }

    public final String getCombo_instrument_id() {
        return this.surrogate.getCombo_instrument_id();
    }

    public final DesiredQuantityDto getDesired_quantity() {
        if (this.surrogate.getContracts() != null) {
            return new DesiredQuantityDto.Contracts(this.surrogate.getContracts());
        }
        if (this.surrogate.getNotional_amount_money() != null) {
            return new DesiredQuantityDto.NotionalAmountMoney(this.surrogate.getNotional_amount_money());
        }
        if (this.surrogate.getUse_default_quantity() != null) {
            return new DesiredQuantityDto.UseDefaultQuantity(this.surrogate.getUse_default_quantity().booleanValue());
        }
        if (this.surrogate.getNotional_amount() != null) {
            return new DesiredQuantityDto.NotionalAmount(this.surrogate.getNotional_amount());
        }
        return null;
    }

    public final IdlDecimal getContracts() {
        return this.surrogate.getContracts();
    }

    public final MoneyDto getNotional_amount_money() {
        return this.surrogate.getNotional_amount_money();
    }

    public final Boolean getUse_default_quantity() {
        return this.surrogate.getUse_default_quantity();
    }

    public final IdlDecimal getNotional_amount() {
        return this.surrogate.getNotional_amount();
    }

    public /* synthetic */ CreateComboRFQRequestDto(List list, int i, ComboInstrumentDto comboInstrumentDto, DesiredQuantityDto desiredQuantityDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : comboInstrumentDto, (i2 & 8) != 0 ? null : desiredQuantityDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateComboRFQRequestDto(List<ComboLegDto> legs, int i, ComboInstrumentDto comboInstrumentDto, DesiredQuantityDto desiredQuantityDto) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        ComboInstrumentDto.ComboLegs comboLegs = comboInstrumentDto instanceof ComboInstrumentDto.ComboLegs ? (ComboInstrumentDto.ComboLegs) comboInstrumentDto : null;
        ComboLegsDto value = comboLegs != null ? comboLegs.getValue() : null;
        ComboInstrumentDto.ComboInstrumentId comboInstrumentId = comboInstrumentDto instanceof ComboInstrumentDto.ComboInstrumentId ? (ComboInstrumentDto.ComboInstrumentId) comboInstrumentDto : null;
        String value2 = comboInstrumentId != null ? comboInstrumentId.getValue() : null;
        DesiredQuantityDto.Contracts contracts2 = desiredQuantityDto instanceof DesiredQuantityDto.Contracts ? (DesiredQuantityDto.Contracts) desiredQuantityDto : null;
        IdlDecimal value3 = contracts2 != null ? contracts2.getValue() : null;
        DesiredQuantityDto.NotionalAmountMoney notionalAmountMoney = desiredQuantityDto instanceof DesiredQuantityDto.NotionalAmountMoney ? (DesiredQuantityDto.NotionalAmountMoney) desiredQuantityDto : null;
        MoneyDto value4 = notionalAmountMoney != null ? notionalAmountMoney.getValue() : null;
        DesiredQuantityDto.UseDefaultQuantity useDefaultQuantity = desiredQuantityDto instanceof DesiredQuantityDto.UseDefaultQuantity ? (DesiredQuantityDto.UseDefaultQuantity) desiredQuantityDto : null;
        Boolean boolValueOf = useDefaultQuantity != null ? Boolean.valueOf(useDefaultQuantity.getValue()) : null;
        DesiredQuantityDto.NotionalAmount notionalAmount = desiredQuantityDto instanceof DesiredQuantityDto.NotionalAmount ? (DesiredQuantityDto.NotionalAmount) desiredQuantityDto : null;
        this(new Surrogate(legs, i, value, value2, value3, value4, boolValueOf, notionalAmount != null ? notionalAmount.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateComboRFQRequestDto copy$default(CreateComboRFQRequestDto createComboRFQRequestDto, List list, int i, ComboInstrumentDto comboInstrumentDto, DesiredQuantityDto desiredQuantityDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = createComboRFQRequestDto.surrogate.getLegs();
        }
        if ((i2 & 2) != 0) {
            i = createComboRFQRequestDto.surrogate.getQuantity();
        }
        if ((i2 & 4) != 0) {
            comboInstrumentDto = createComboRFQRequestDto.getCombo_instrument();
        }
        if ((i2 & 8) != 0) {
            desiredQuantityDto = createComboRFQRequestDto.getDesired_quantity();
        }
        return createComboRFQRequestDto.copy(list, i, comboInstrumentDto, desiredQuantityDto);
    }

    public final CreateComboRFQRequestDto copy(List<ComboLegDto> legs, int quantity, ComboInstrumentDto combo_instrument, DesiredQuantityDto desired_quantity) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        ComboInstrumentDto.ComboLegs comboLegs = combo_instrument instanceof ComboInstrumentDto.ComboLegs ? (ComboInstrumentDto.ComboLegs) combo_instrument : null;
        ComboLegsDto value = comboLegs != null ? comboLegs.getValue() : null;
        ComboInstrumentDto.ComboInstrumentId comboInstrumentId = combo_instrument instanceof ComboInstrumentDto.ComboInstrumentId ? (ComboInstrumentDto.ComboInstrumentId) combo_instrument : null;
        String value2 = comboInstrumentId != null ? comboInstrumentId.getValue() : null;
        DesiredQuantityDto.Contracts contracts2 = desired_quantity instanceof DesiredQuantityDto.Contracts ? (DesiredQuantityDto.Contracts) desired_quantity : null;
        IdlDecimal value3 = contracts2 != null ? contracts2.getValue() : null;
        DesiredQuantityDto.NotionalAmountMoney notionalAmountMoney = desired_quantity instanceof DesiredQuantityDto.NotionalAmountMoney ? (DesiredQuantityDto.NotionalAmountMoney) desired_quantity : null;
        MoneyDto value4 = notionalAmountMoney != null ? notionalAmountMoney.getValue() : null;
        DesiredQuantityDto.UseDefaultQuantity useDefaultQuantity = desired_quantity instanceof DesiredQuantityDto.UseDefaultQuantity ? (DesiredQuantityDto.UseDefaultQuantity) desired_quantity : null;
        Boolean boolValueOf = useDefaultQuantity != null ? Boolean.valueOf(useDefaultQuantity.getValue()) : null;
        DesiredQuantityDto.NotionalAmount notionalAmount = desired_quantity instanceof DesiredQuantityDto.NotionalAmount ? (DesiredQuantityDto.NotionalAmount) desired_quantity : null;
        return new CreateComboRFQRequestDto(new Surrogate(legs, quantity, value, value2, value3, value4, boolValueOf, notionalAmount != null ? notionalAmount.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public CreateComboRFQRequest toProto() {
        List<ComboLegDto> legs = this.surrogate.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComboLegDto) it.next()).toProto());
        }
        int quantity = this.surrogate.getQuantity();
        ComboLegsDto combo_legs = this.surrogate.getCombo_legs();
        ComboLegs proto = combo_legs != null ? combo_legs.toProto() : null;
        String combo_instrument_id = this.surrogate.getCombo_instrument_id();
        IdlDecimal contracts2 = this.surrogate.getContracts();
        String stringValue = contracts2 != null ? contracts2.getStringValue() : null;
        MoneyDto notional_amount_money = this.surrogate.getNotional_amount_money();
        Money proto2 = notional_amount_money != null ? notional_amount_money.toProto() : null;
        Boolean use_default_quantity = this.surrogate.getUse_default_quantity();
        IdlDecimal notional_amount = this.surrogate.getNotional_amount();
        return new CreateComboRFQRequest(proto, combo_instrument_id, stringValue, proto2, use_default_quantity, notional_amount != null ? notional_amount.getStringValue() : null, arrayList, quantity, null, 256, null);
    }

    public String toString() {
        return "[CreateComboRFQRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateComboRFQRequestDto) && Intrinsics.areEqual(((CreateComboRFQRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateComboRFQRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002KLB\u0096\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0016\u0010\u0017Bo\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0018\u00106\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\u001a\u00109\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00101J\u001a\u0010<\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0010HÆ\u0003J\u009d\u0001\u0010=\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u0010HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\t\u0010B\u001a\u00020\rHÖ\u0001J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010(R-\u0010\u000e\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010+R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010.R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00102\u0012\u0004\b/\u0010\u001d\u001a\u0004\b0\u00101R-\u0010\u0015\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010+¨\u0006M"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate;", "", "legs", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboLegDto;", "quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "combo_legs", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;", "combo_instrument_id", "", "contracts", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "notional_amount_money", "Lcom/robinhood/rosetta/common/MoneyDto;", "use_default_quantity", "", "notional_amount", "<init>", "(Ljava/util/List;ILcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLegs$annotations", "()V", "getLegs", "()Ljava/util/List;", "getQuantity$annotations", "getQuantity", "()I", "getCombo_legs$annotations", "getCombo_legs", "()Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;", "getCombo_instrument_id$annotations", "getCombo_instrument_id", "()Ljava/lang/String;", "getContracts$annotations", "getContracts", "()Lcom/robinhood/idl/IdlDecimal;", "getNotional_amount_money$annotations", "getNotional_amount_money", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getUse_default_quantity$annotations", "getUse_default_quantity", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotional_amount$annotations", "getNotional_amount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;ILcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;)Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String combo_instrument_id;
        private final ComboLegsDto combo_legs;
        private final IdlDecimal contracts;
        private final List<ComboLegDto> legs;
        private final IdlDecimal notional_amount;
        private final MoneyDto notional_amount_money;
        private final int quantity;
        private final Boolean use_default_quantity;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.combo.CreateComboRFQRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateComboRFQRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null};

        public Surrogate() {
            this((List) null, 0, (ComboLegsDto) null, (String) null, (IdlDecimal) null, (MoneyDto) null, (Boolean) null, (IdlDecimal) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ComboLegDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, int i, ComboLegsDto comboLegsDto, String str, IdlDecimal idlDecimal, MoneyDto moneyDto, Boolean bool, IdlDecimal idlDecimal2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = surrogate.legs;
            }
            if ((i2 & 2) != 0) {
                i = surrogate.quantity;
            }
            if ((i2 & 4) != 0) {
                comboLegsDto = surrogate.combo_legs;
            }
            if ((i2 & 8) != 0) {
                str = surrogate.combo_instrument_id;
            }
            if ((i2 & 16) != 0) {
                idlDecimal = surrogate.contracts;
            }
            if ((i2 & 32) != 0) {
                moneyDto = surrogate.notional_amount_money;
            }
            if ((i2 & 64) != 0) {
                bool = surrogate.use_default_quantity;
            }
            if ((i2 & 128) != 0) {
                idlDecimal2 = surrogate.notional_amount;
            }
            Boolean bool2 = bool;
            IdlDecimal idlDecimal3 = idlDecimal2;
            IdlDecimal idlDecimal4 = idlDecimal;
            MoneyDto moneyDto2 = moneyDto;
            return surrogate.copy(list, i, comboLegsDto, str, idlDecimal4, moneyDto2, bool2, idlDecimal3);
        }

        @SerialName("comboInstrumentId")
        @JsonAnnotations2(names = {"combo_instrument_id"})
        public static /* synthetic */ void getCombo_instrument_id$annotations() {
        }

        @SerialName("comboLegs")
        @JsonAnnotations2(names = {"combo_legs"})
        public static /* synthetic */ void getCombo_legs$annotations() {
        }

        @SerialName("contracts")
        @JsonAnnotations2(names = {"contracts"})
        public static /* synthetic */ void getContracts$annotations() {
        }

        @SerialName("legs")
        @JsonAnnotations2(names = {"legs"})
        public static /* synthetic */ void getLegs$annotations() {
        }

        @SerialName("notionalAmount")
        @JsonAnnotations2(names = {"notional_amount"})
        public static /* synthetic */ void getNotional_amount$annotations() {
        }

        @SerialName("notionalAmountMoney")
        @JsonAnnotations2(names = {"notional_amount_money"})
        public static /* synthetic */ void getNotional_amount_money$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("useDefaultQuantity")
        @JsonAnnotations2(names = {"use_default_quantity"})
        public static /* synthetic */ void getUse_default_quantity$annotations() {
        }

        public final List<ComboLegDto> component1() {
            return this.legs;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final ComboLegsDto getCombo_legs() {
            return this.combo_legs;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCombo_instrument_id() {
            return this.combo_instrument_id;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getContracts() {
            return this.contracts;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getNotional_amount_money() {
            return this.notional_amount_money;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getUse_default_quantity() {
            return this.use_default_quantity;
        }

        /* renamed from: component8, reason: from getter */
        public final IdlDecimal getNotional_amount() {
            return this.notional_amount;
        }

        public final Surrogate copy(List<ComboLegDto> legs, int quantity, ComboLegsDto combo_legs, String combo_instrument_id, IdlDecimal contracts2, MoneyDto notional_amount_money, Boolean use_default_quantity, IdlDecimal notional_amount) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            return new Surrogate(legs, quantity, combo_legs, combo_instrument_id, contracts2, notional_amount_money, use_default_quantity, notional_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.legs, surrogate.legs) && this.quantity == surrogate.quantity && Intrinsics.areEqual(this.combo_legs, surrogate.combo_legs) && Intrinsics.areEqual(this.combo_instrument_id, surrogate.combo_instrument_id) && Intrinsics.areEqual(this.contracts, surrogate.contracts) && Intrinsics.areEqual(this.notional_amount_money, surrogate.notional_amount_money) && Intrinsics.areEqual(this.use_default_quantity, surrogate.use_default_quantity) && Intrinsics.areEqual(this.notional_amount, surrogate.notional_amount);
        }

        public int hashCode() {
            int iHashCode = ((this.legs.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31;
            ComboLegsDto comboLegsDto = this.combo_legs;
            int iHashCode2 = (iHashCode + (comboLegsDto == null ? 0 : comboLegsDto.hashCode())) * 31;
            String str = this.combo_instrument_id;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            IdlDecimal idlDecimal = this.contracts;
            int iHashCode4 = (iHashCode3 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            MoneyDto moneyDto = this.notional_amount_money;
            int iHashCode5 = (iHashCode4 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            Boolean bool = this.use_default_quantity;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.notional_amount;
            return iHashCode6 + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(legs=" + this.legs + ", quantity=" + this.quantity + ", combo_legs=" + this.combo_legs + ", combo_instrument_id=" + this.combo_instrument_id + ", contracts=" + this.contracts + ", notional_amount_money=" + this.notional_amount_money + ", use_default_quantity=" + this.use_default_quantity + ", notional_amount=" + this.notional_amount + ")";
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateComboRFQRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, int i2, ComboLegsDto comboLegsDto, String str, IdlDecimal idlDecimal, MoneyDto moneyDto, Boolean bool, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            this.legs = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.quantity = 0;
            } else {
                this.quantity = i2;
            }
            if ((i & 4) == 0) {
                this.combo_legs = null;
            } else {
                this.combo_legs = comboLegsDto;
            }
            if ((i & 8) == 0) {
                this.combo_instrument_id = null;
            } else {
                this.combo_instrument_id = str;
            }
            if ((i & 16) == 0) {
                this.contracts = null;
            } else {
                this.contracts = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.notional_amount_money = null;
            } else {
                this.notional_amount_money = moneyDto;
            }
            if ((i & 64) == 0) {
                this.use_default_quantity = null;
            } else {
                this.use_default_quantity = bool;
            }
            if ((i & 128) == 0) {
                this.notional_amount = null;
            } else {
                this.notional_amount = idlDecimal2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.legs);
            }
            int i = self.quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            ComboLegsDto comboLegsDto = self.combo_legs;
            if (comboLegsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ComboLegsDto.Serializer.INSTANCE, comboLegsDto);
            }
            String str = self.combo_instrument_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            IdlDecimal idlDecimal = self.contracts;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            MoneyDto moneyDto = self.notional_amount_money;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            Boolean bool = self.use_default_quantity;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, bool);
            }
            IdlDecimal idlDecimal2 = self.notional_amount;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
        }

        public Surrogate(List<ComboLegDto> legs, int i, ComboLegsDto comboLegsDto, String str, IdlDecimal idlDecimal, MoneyDto moneyDto, Boolean bool, IdlDecimal idlDecimal2) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            this.legs = legs;
            this.quantity = i;
            this.combo_legs = comboLegsDto;
            this.combo_instrument_id = str;
            this.contracts = idlDecimal;
            this.notional_amount_money = moneyDto;
            this.use_default_quantity = bool;
            this.notional_amount = idlDecimal2;
        }

        public final List<ComboLegDto> getLegs() {
            return this.legs;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, int r3, com.robinhood.prediction_markets.proto.p361v1.combo.ComboLegsDto r4, java.lang.String r5, com.robinhood.idl.IdlDecimal r6, com.robinhood.rosetta.common.MoneyDto r7, java.lang.Boolean r8, com.robinhood.idl.IdlDecimal r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r11 = r10 & 2
                if (r11 == 0) goto Ld
                r3 = 0
            Ld:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L13
                r4 = r0
            L13:
                r11 = r10 & 8
                if (r11 == 0) goto L18
                r5 = r0
            L18:
                r11 = r10 & 16
                if (r11 == 0) goto L1d
                r6 = r0
            L1d:
                r11 = r10 & 32
                if (r11 == 0) goto L22
                r7 = r0
            L22:
                r11 = r10 & 64
                if (r11 == 0) goto L27
                r8 = r0
            L27:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L35
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3e
            L35:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3e:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.prediction_markets.proto.p361v1.combo.CreateComboRFQRequestDto.Surrogate.<init>(java.util.List, int, com.robinhood.prediction_markets.proto.v1.combo.ComboLegsDto, java.lang.String, com.robinhood.idl.IdlDecimal, com.robinhood.rosetta.common.MoneyDto, java.lang.Boolean, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final ComboLegsDto getCombo_legs() {
            return this.combo_legs;
        }

        public final String getCombo_instrument_id() {
            return this.combo_instrument_id;
        }

        public final IdlDecimal getContracts() {
            return this.contracts;
        }

        public final MoneyDto getNotional_amount_money() {
            return this.notional_amount_money;
        }

        public final Boolean getUse_default_quantity() {
            return this.use_default_quantity;
        }

        public final IdlDecimal getNotional_amount() {
            return this.notional_amount;
        }
    }

    /* compiled from: CreateComboRFQRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateComboRFQRequestDto, CreateComboRFQRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateComboRFQRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateComboRFQRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateComboRFQRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateComboRFQRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateComboRFQRequest> getProtoAdapter() {
            return CreateComboRFQRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateComboRFQRequestDto getZeroValue() {
            return CreateComboRFQRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateComboRFQRequestDto fromProto(CreateComboRFQRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<ComboLeg> legs = proto.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(ComboLegDto.INSTANCE.fromProto((ComboLeg) it.next()));
            }
            int quantity = proto.getQuantity();
            ComboLegs combo_legs = proto.getCombo_legs();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ComboLegsDto comboLegsDtoFromProto = combo_legs != null ? ComboLegsDto.INSTANCE.fromProto(combo_legs) : null;
            String combo_instrument_id = proto.getCombo_instrument_id();
            String contracts2 = proto.getContracts();
            IdlDecimal idlDecimal = contracts2 != null ? new IdlDecimal(contracts2) : null;
            Money notional_amount_money = proto.getNotional_amount_money();
            MoneyDto moneyDtoFromProto = notional_amount_money != null ? MoneyDto.INSTANCE.fromProto(notional_amount_money) : null;
            Boolean use_default_quantity = proto.getUse_default_quantity();
            String notional_amount = proto.getNotional_amount();
            return new CreateComboRFQRequestDto(new Surrogate(arrayList, quantity, comboLegsDtoFromProto, combo_instrument_id, idlDecimal, moneyDtoFromProto, use_default_quantity, notional_amount != null ? new IdlDecimal(notional_amount) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.combo.CreateComboRFQRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateComboRFQRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CreateComboRFQRequestDto(null, 0, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateComboRFQRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ComboLegs", "ComboInstrumentId", "Companion", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto$ComboInstrumentId;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto$ComboLegs;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ComboInstrumentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ComboInstrumentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ComboInstrumentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto$ComboLegs;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "value", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;)V", "getValue", "()Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ComboLegs extends ComboInstrumentDto {
            private final ComboLegsDto value;

            public static /* synthetic */ ComboLegs copy$default(ComboLegs comboLegs, ComboLegsDto comboLegsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    comboLegsDto = comboLegs.value;
                }
                return comboLegs.copy(comboLegsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ComboLegsDto getValue() {
                return this.value;
            }

            public final ComboLegs copy(ComboLegsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ComboLegs(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ComboLegs) && Intrinsics.areEqual(this.value, ((ComboLegs) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ComboLegs(value=" + this.value + ")";
            }

            public final ComboLegsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComboLegs(ComboLegsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto$ComboInstrumentId;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ComboInstrumentId extends ComboInstrumentDto {
            private final String value;

            public static /* synthetic */ ComboInstrumentId copy$default(ComboInstrumentId comboInstrumentId, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = comboInstrumentId.value;
                }
                return comboInstrumentId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final ComboInstrumentId copy(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ComboInstrumentId(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ComboInstrumentId) && Intrinsics.areEqual(this.value, ((ComboInstrumentId) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ComboInstrumentId(value=" + this.value + ")";
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComboInstrumentId(String value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ComboInstrumentDto, CreateComboRFQRequest> {
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
            public ProtoAdapter<CreateComboRFQRequest> getProtoAdapter() {
                return CreateComboRFQRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComboInstrumentDto fromProto(CreateComboRFQRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getCombo_legs() != null) {
                    return new ComboLegs(ComboLegsDto.INSTANCE.fromProto(proto.getCombo_legs()));
                }
                if (proto.getCombo_instrument_id() != null) {
                    return new ComboInstrumentId(proto.getCombo_instrument_id());
                }
                return null;
            }
        }
    }

    /* compiled from: CreateComboRFQRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Contracts", "NotionalAmountMoney", "UseDefaultQuantity", "NotionalAmount", "Companion", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$Contracts;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$NotionalAmount;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$NotionalAmountMoney;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$UseDefaultQuantity;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DesiredQuantityDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DesiredQuantityDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DesiredQuantityDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$Contracts;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "value", "Lcom/robinhood/idl/IdlDecimal;", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "getValue", "()Lcom/robinhood/idl/IdlDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Contracts extends DesiredQuantityDto {
            private final IdlDecimal value;

            public static /* synthetic */ Contracts copy$default(Contracts contracts2, IdlDecimal idlDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    idlDecimal = contracts2.value;
                }
                return contracts2.copy(idlDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final IdlDecimal getValue() {
                return this.value;
            }

            public final Contracts copy(IdlDecimal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Contracts(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Contracts) && Intrinsics.areEqual(this.value, ((Contracts) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Contracts(value=" + this.value + ")";
            }

            public final IdlDecimal getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Contracts(IdlDecimal value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$NotionalAmountMoney;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "value", "Lcom/robinhood/rosetta/common/MoneyDto;", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;)V", "getValue", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotionalAmountMoney extends DesiredQuantityDto {
            private final MoneyDto value;

            public static /* synthetic */ NotionalAmountMoney copy$default(NotionalAmountMoney notionalAmountMoney, MoneyDto moneyDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    moneyDto = notionalAmountMoney.value;
                }
                return notionalAmountMoney.copy(moneyDto);
            }

            /* renamed from: component1, reason: from getter */
            public final MoneyDto getValue() {
                return this.value;
            }

            public final NotionalAmountMoney copy(MoneyDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new NotionalAmountMoney(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotionalAmountMoney) && Intrinsics.areEqual(this.value, ((NotionalAmountMoney) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NotionalAmountMoney(value=" + this.value + ")";
            }

            public final MoneyDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotionalAmountMoney(MoneyDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$UseDefaultQuantity;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UseDefaultQuantity extends DesiredQuantityDto {
            private final boolean value;

            public static /* synthetic */ UseDefaultQuantity copy$default(UseDefaultQuantity useDefaultQuantity, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = useDefaultQuantity.value;
                }
                return useDefaultQuantity.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final UseDefaultQuantity copy(boolean value) {
                return new UseDefaultQuantity(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UseDefaultQuantity) && this.value == ((UseDefaultQuantity) other).value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value);
            }

            public String toString() {
                return "UseDefaultQuantity(value=" + this.value + ")";
            }

            public final boolean getValue() {
                return this.value;
            }

            public UseDefaultQuantity(boolean z) {
                super(null);
                this.value = z;
            }
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$NotionalAmount;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "value", "Lcom/robinhood/idl/IdlDecimal;", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "getValue", "()Lcom/robinhood/idl/IdlDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotionalAmount extends DesiredQuantityDto {
            private final IdlDecimal value;

            public static /* synthetic */ NotionalAmount copy$default(NotionalAmount notionalAmount, IdlDecimal idlDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    idlDecimal = notionalAmount.value;
                }
                return notionalAmount.copy(idlDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final IdlDecimal getValue() {
                return this.value;
            }

            public final NotionalAmount copy(IdlDecimal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new NotionalAmount(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotionalAmount) && Intrinsics.areEqual(this.value, ((NotionalAmount) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NotionalAmount(value=" + this.value + ")";
            }

            public final IdlDecimal getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotionalAmount(IdlDecimal value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateComboRFQRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$DesiredQuantityDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DesiredQuantityDto, CreateComboRFQRequest> {
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
            public ProtoAdapter<CreateComboRFQRequest> getProtoAdapter() {
                return CreateComboRFQRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DesiredQuantityDto fromProto(CreateComboRFQRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getContracts() != null) {
                    return new Contracts(new IdlDecimal(proto.getContracts()));
                }
                if (proto.getNotional_amount_money() != null) {
                    return new NotionalAmountMoney(MoneyDto.INSTANCE.fromProto(proto.getNotional_amount_money()));
                }
                if (proto.getUse_default_quantity() != null) {
                    return new UseDefaultQuantity(proto.getUse_default_quantity().booleanValue());
                }
                if (proto.getNotional_amount() != null) {
                    return new NotionalAmount(new IdlDecimal(proto.getNotional_amount()));
                }
                return null;
            }
        }
    }

    /* compiled from: CreateComboRFQRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateComboRFQRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.CreateComboRFQRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateComboRFQRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateComboRFQRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateComboRFQRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateComboRFQRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.combo.CreateComboRFQRequestDto";
        }
    }
}
