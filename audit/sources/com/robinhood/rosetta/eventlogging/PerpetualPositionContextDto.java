package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.PerpetualPositionContext;
import com.robinhood.rosetta.eventlogging.PerpetualPositionContextDto;
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

/* compiled from: PerpetualPositionContextDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007KLMNOPQB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÑ\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\"JÎ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\tJ\b\u0010>\u001a\u00020\u0002H\u0016J\b\u0010?\u001a\u00020\tH\u0016J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0096\u0002J\b\u0010D\u001a\u00020\u0010H\u0016J\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0010H\u0016J\b\u0010J\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u0010\u0016\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b2\u0010-R\u0011\u0010\u0018\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b4\u0010-R\u0011\u0010\u001a\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u0010-R\u0011\u0010\u001b\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u0010-R\u0011\u0010\u001c\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b7\u0010-R\u0011\u0010\u001d\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b8\u0010-R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010$R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b<\u0010$¨\u0006R"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Surrogate;)V", "position_id", "", "perpetual_contract_id", "side", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "leverage", "", "quantity", "", "entry_price", "position_size", "initial_margin", "initial_margin_ratio", "maintenance_margin", "maintenance_margin_ratio", "unsettled_pnl", "pnl", "pnl_percentage", "estimated_liquidation_price", "total_allocated_margin", "open_position_quote_currency", "liquidation_risk", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "fx_quote", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;IDDDDDDDDDDDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;Ljava/lang/String;)V", "getPosition_id", "()Ljava/lang/String;", "getPerpetual_contract_id", "getSide", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "getLeverage", "()I", "getQuantity", "()D", "getEntry_price", "getPosition_size", "getInitial_margin", "getInitial_margin_ratio", "getMaintenance_margin", "getMaintenance_margin_ratio", "getUnsettled_pnl", "getPnl", "getPnl_percentage", "getEstimated_liquidation_price", "getTotal_allocated_margin", "getOpen_position_quote_currency", "getLiquidation_risk", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "getFx_quote", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "PerpetualPositionSideDto", "MarginModeDto", "LiquidationRiskDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class PerpetualPositionContextDto implements Dto3<PerpetualPositionContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerpetualPositionContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerpetualPositionContextDto, PerpetualPositionContext>> binaryBase64Serializer$delegate;
    private static final PerpetualPositionContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerpetualPositionContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerpetualPositionContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final String getPerpetual_contract_id() {
        return this.surrogate.getPerpetual_contract_id();
    }

    public final PerpetualPositionSideDto getSide() {
        return this.surrogate.getSide();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final int getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final double getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final double getEntry_price() {
        return this.surrogate.getEntry_price();
    }

    public final double getPosition_size() {
        return this.surrogate.getPosition_size();
    }

    public final double getInitial_margin() {
        return this.surrogate.getInitial_margin();
    }

    public final double getInitial_margin_ratio() {
        return this.surrogate.getInitial_margin_ratio();
    }

    public final double getMaintenance_margin() {
        return this.surrogate.getMaintenance_margin();
    }

    public final double getMaintenance_margin_ratio() {
        return this.surrogate.getMaintenance_margin_ratio();
    }

    public final double getUnsettled_pnl() {
        return this.surrogate.getUnsettled_pnl();
    }

    public final double getPnl() {
        return this.surrogate.getPnl();
    }

    public final double getPnl_percentage() {
        return this.surrogate.getPnl_percentage();
    }

    public final double getEstimated_liquidation_price() {
        return this.surrogate.getEstimated_liquidation_price();
    }

    public final double getTotal_allocated_margin() {
        return this.surrogate.getTotal_allocated_margin();
    }

    public final String getOpen_position_quote_currency() {
        return this.surrogate.getOpen_position_quote_currency();
    }

    public final LiquidationRiskDto getLiquidation_risk() {
        return this.surrogate.getLiquidation_risk();
    }

    public final String getFx_quote() {
        return this.surrogate.getFx_quote();
    }

    public /* synthetic */ PerpetualPositionContextDto(String str, String str2, PerpetualPositionSideDto perpetualPositionSideDto, MarginModeDto marginModeDto, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRiskDto liquidationRiskDto, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? PerpetualPositionSideDto.INSTANCE.getZeroValue() : perpetualPositionSideDto, (i2 & 8) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, (i2 & 256) != 0 ? 0.0d : d4, (i2 & 512) != 0 ? 0.0d : d5, (i2 & 1024) != 0 ? 0.0d : d6, (i2 & 2048) != 0 ? 0.0d : d7, (i2 & 4096) != 0 ? 0.0d : d8, (i2 & 8192) != 0 ? 0.0d : d9, (i2 & 16384) != 0 ? 0.0d : d10, (32768 & i2) != 0 ? 0.0d : d11, (65536 & i2) == 0 ? d12 : 0.0d, (131072 & i2) != 0 ? "" : str3, (i2 & 262144) != 0 ? LiquidationRiskDto.INSTANCE.getZeroValue() : liquidationRiskDto, (i2 & 524288) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerpetualPositionContextDto(String position_id, String perpetual_contract_id, PerpetualPositionSideDto side, MarginModeDto margin_mode, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String open_position_quote_currency, LiquidationRiskDto liquidation_risk, String fx_quote) {
        this(new Surrogate(position_id, perpetual_contract_id, side, margin_mode, i, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, open_position_quote_currency, liquidation_risk, fx_quote));
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(open_position_quote_currency, "open_position_quote_currency");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(fx_quote, "fx_quote");
    }

    public static /* synthetic */ PerpetualPositionContextDto copy$default(PerpetualPositionContextDto perpetualPositionContextDto, String str, String str2, PerpetualPositionSideDto perpetualPositionSideDto, MarginModeDto marginModeDto, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRiskDto liquidationRiskDto, String str4, int i2, Object obj) {
        String fx_quote;
        LiquidationRiskDto liquidationRiskDto2;
        String str5;
        PerpetualPositionContextDto perpetualPositionContextDto2;
        String str6;
        String str7;
        PerpetualPositionSideDto perpetualPositionSideDto2;
        MarginModeDto marginModeDto2;
        int i3;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        String position_id = (i2 & 1) != 0 ? perpetualPositionContextDto.surrogate.getPosition_id() : str;
        String perpetual_contract_id = (i2 & 2) != 0 ? perpetualPositionContextDto.surrogate.getPerpetual_contract_id() : str2;
        PerpetualPositionSideDto side = (i2 & 4) != 0 ? perpetualPositionContextDto.surrogate.getSide() : perpetualPositionSideDto;
        MarginModeDto margin_mode = (i2 & 8) != 0 ? perpetualPositionContextDto.surrogate.getMargin_mode() : marginModeDto;
        int leverage = (i2 & 16) != 0 ? perpetualPositionContextDto.surrogate.getLeverage() : i;
        double quantity = (i2 & 32) != 0 ? perpetualPositionContextDto.surrogate.getQuantity() : d;
        double entry_price = (i2 & 64) != 0 ? perpetualPositionContextDto.surrogate.getEntry_price() : d2;
        double position_size = (i2 & 128) != 0 ? perpetualPositionContextDto.surrogate.getPosition_size() : d3;
        double initial_margin = (i2 & 256) != 0 ? perpetualPositionContextDto.surrogate.getInitial_margin() : d4;
        double initial_margin_ratio = (i2 & 512) != 0 ? perpetualPositionContextDto.surrogate.getInitial_margin_ratio() : d5;
        String str8 = position_id;
        double maintenance_margin = (i2 & 1024) != 0 ? perpetualPositionContextDto.surrogate.getMaintenance_margin() : d6;
        double maintenance_margin_ratio = (i2 & 2048) != 0 ? perpetualPositionContextDto.surrogate.getMaintenance_margin_ratio() : d7;
        double unsettled_pnl = (i2 & 4096) != 0 ? perpetualPositionContextDto.surrogate.getUnsettled_pnl() : d8;
        double pnl = (i2 & 8192) != 0 ? perpetualPositionContextDto.surrogate.getPnl() : d9;
        double pnl_percentage = (i2 & 16384) != 0 ? perpetualPositionContextDto.surrogate.getPnl_percentage() : d10;
        double estimated_liquidation_price = (32768 & i2) != 0 ? perpetualPositionContextDto.surrogate.getEstimated_liquidation_price() : d11;
        double total_allocated_margin = (65536 & i2) != 0 ? perpetualPositionContextDto.surrogate.getTotal_allocated_margin() : d12;
        String open_position_quote_currency = (131072 & i2) != 0 ? perpetualPositionContextDto.surrogate.getOpen_position_quote_currency() : str3;
        LiquidationRiskDto liquidation_risk = (i2 & 262144) != 0 ? perpetualPositionContextDto.surrogate.getLiquidation_risk() : liquidationRiskDto;
        if ((i2 & 524288) != 0) {
            liquidationRiskDto2 = liquidation_risk;
            fx_quote = perpetualPositionContextDto.surrogate.getFx_quote();
            str6 = open_position_quote_currency;
            str7 = perpetual_contract_id;
            perpetualPositionSideDto2 = side;
            marginModeDto2 = margin_mode;
            i3 = leverage;
            d13 = quantity;
            d14 = entry_price;
            d15 = position_size;
            d16 = initial_margin;
            d17 = initial_margin_ratio;
            d18 = maintenance_margin;
            d19 = maintenance_margin_ratio;
            d20 = unsettled_pnl;
            d21 = pnl;
            d22 = pnl_percentage;
            d23 = estimated_liquidation_price;
            d24 = total_allocated_margin;
            str5 = str8;
            perpetualPositionContextDto2 = perpetualPositionContextDto;
        } else {
            fx_quote = str4;
            liquidationRiskDto2 = liquidation_risk;
            str5 = str8;
            perpetualPositionContextDto2 = perpetualPositionContextDto;
            str6 = open_position_quote_currency;
            str7 = perpetual_contract_id;
            perpetualPositionSideDto2 = side;
            marginModeDto2 = margin_mode;
            i3 = leverage;
            d13 = quantity;
            d14 = entry_price;
            d15 = position_size;
            d16 = initial_margin;
            d17 = initial_margin_ratio;
            d18 = maintenance_margin;
            d19 = maintenance_margin_ratio;
            d20 = unsettled_pnl;
            d21 = pnl;
            d22 = pnl_percentage;
            d23 = estimated_liquidation_price;
            d24 = total_allocated_margin;
        }
        return perpetualPositionContextDto2.copy(str5, str7, perpetualPositionSideDto2, marginModeDto2, i3, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, str6, liquidationRiskDto2, fx_quote);
    }

    public final PerpetualPositionContextDto copy(String position_id, String perpetual_contract_id, PerpetualPositionSideDto side, MarginModeDto margin_mode, int leverage, double quantity, double entry_price, double position_size, double initial_margin, double initial_margin_ratio, double maintenance_margin, double maintenance_margin_ratio, double unsettled_pnl, double pnl, double pnl_percentage, double estimated_liquidation_price, double total_allocated_margin, String open_position_quote_currency, LiquidationRiskDto liquidation_risk, String fx_quote) {
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(open_position_quote_currency, "open_position_quote_currency");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(fx_quote, "fx_quote");
        return new PerpetualPositionContextDto(new Surrogate(position_id, perpetual_contract_id, side, margin_mode, leverage, quantity, entry_price, position_size, initial_margin, initial_margin_ratio, maintenance_margin, maintenance_margin_ratio, unsettled_pnl, pnl, pnl_percentage, estimated_liquidation_price, total_allocated_margin, open_position_quote_currency, liquidation_risk, fx_quote));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerpetualPositionContext toProto() {
        return new PerpetualPositionContext(this.surrogate.getPosition_id(), this.surrogate.getPerpetual_contract_id(), (PerpetualPositionContext.PerpetualPositionSide) this.surrogate.getSide().toProto(), (PerpetualPositionContext.MarginMode) this.surrogate.getMargin_mode().toProto(), this.surrogate.getLeverage(), this.surrogate.getQuantity(), this.surrogate.getEntry_price(), this.surrogate.getPosition_size(), this.surrogate.getInitial_margin(), this.surrogate.getInitial_margin_ratio(), this.surrogate.getMaintenance_margin(), this.surrogate.getMaintenance_margin_ratio(), this.surrogate.getUnsettled_pnl(), this.surrogate.getPnl(), this.surrogate.getPnl_percentage(), this.surrogate.getEstimated_liquidation_price(), this.surrogate.getTotal_allocated_margin(), this.surrogate.getOpen_position_quote_currency(), (PerpetualPositionContext.LiquidationRisk) this.surrogate.getLiquidation_risk().toProto(), this.surrogate.getFx_quote(), null, 1048576, null);
    }

    public String toString() {
        return "[PerpetualPositionContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerpetualPositionContextDto) && Intrinsics.areEqual(((PerpetualPositionContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 x2\u00020\u0001:\u0002wxB\u0092\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!BÉ\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010%J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\u0018\u0010Y\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010Z\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010[\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010\\\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010]\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010^\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010_\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010`\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010a\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010b\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010c\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010d\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u0010e\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u001eHÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\u0094\u0003\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0015\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0016\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0017\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0018\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0019\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u001a\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u001b\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\nHÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001J%\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u00002\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uH\u0001¢\u0006\u0002\bvR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010'\u001a\u0004\b0\u00101R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010'\u001a\u0004\b3\u00104R+\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010'\u001a\u0004\b6\u00107R+\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010'\u001a\u0004\b9\u00107R+\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010'\u001a\u0004\b;\u00107R+\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010'\u001a\u0004\b=\u00107R+\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010'\u001a\u0004\b?\u00107R+\u0010\u0015\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010'\u001a\u0004\bA\u00107R+\u0010\u0016\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010'\u001a\u0004\bC\u00107R+\u0010\u0017\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010'\u001a\u0004\bE\u00107R+\u0010\u0018\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010'\u001a\u0004\bG\u00107R+\u0010\u0019\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010'\u001a\u0004\bI\u00107R+\u0010\u001a\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010'\u001a\u0004\bK\u00107R+\u0010\u001b\u001a\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010'\u001a\u0004\bM\u00107R\u001c\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010'\u001a\u0004\bO\u0010)R\u001c\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010'\u001a\u0004\bQ\u0010RR\u001c\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010'\u001a\u0004\bT\u0010)¨\u0006y"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Surrogate;", "", "position_id", "", "perpetual_contract_id", "side", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "leverage", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "quantity", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "entry_price", "position_size", "initial_margin", "initial_margin_ratio", "maintenance_margin", "maintenance_margin_ratio", "unsettled_pnl", "pnl", "pnl_percentage", "estimated_liquidation_price", "total_allocated_margin", "open_position_quote_currency", "liquidation_risk", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "fx_quote", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;IDDDDDDDDDDDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;IDDDDDDDDDDDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPosition_id$annotations", "()V", "getPosition_id", "()Ljava/lang/String;", "getPerpetual_contract_id$annotations", "getPerpetual_contract_id", "getSide$annotations", "getSide", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "getMargin_mode$annotations", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "getLeverage$annotations", "getLeverage", "()I", "getQuantity$annotations", "getQuantity", "()D", "getEntry_price$annotations", "getEntry_price", "getPosition_size$annotations", "getPosition_size", "getInitial_margin$annotations", "getInitial_margin", "getInitial_margin_ratio$annotations", "getInitial_margin_ratio", "getMaintenance_margin$annotations", "getMaintenance_margin", "getMaintenance_margin_ratio$annotations", "getMaintenance_margin_ratio", "getUnsettled_pnl$annotations", "getUnsettled_pnl", "getPnl$annotations", "getPnl", "getPnl_percentage$annotations", "getPnl_percentage", "getEstimated_liquidation_price$annotations", "getEstimated_liquidation_price", "getTotal_allocated_margin$annotations", "getTotal_allocated_margin", "getOpen_position_quote_currency$annotations", "getOpen_position_quote_currency", "getLiquidation_risk$annotations", "getLiquidation_risk", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "getFx_quote$annotations", "getFx_quote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double entry_price;
        private final double estimated_liquidation_price;
        private final String fx_quote;
        private final double initial_margin;
        private final double initial_margin_ratio;
        private final int leverage;
        private final LiquidationRiskDto liquidation_risk;
        private final double maintenance_margin;
        private final double maintenance_margin_ratio;
        private final MarginModeDto margin_mode;
        private final String open_position_quote_currency;
        private final String perpetual_contract_id;
        private final double pnl;
        private final double pnl_percentage;
        private final String position_id;
        private final double position_size;
        private final double quantity;
        private final PerpetualPositionSideDto side;
        private final double total_allocated_margin;
        private final double unsettled_pnl;

        public Surrogate() {
            this((String) null, (String) null, (PerpetualPositionSideDto) null, (MarginModeDto) null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (LiquidationRiskDto) null, (String) null, 1048575, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, PerpetualPositionSideDto perpetualPositionSideDto, MarginModeDto marginModeDto, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRiskDto liquidationRiskDto, String str4, int i2, Object obj) {
            String str5;
            double d13;
            double d14;
            double d15;
            double d16;
            double d17;
            double d18;
            double d19;
            String str6;
            MarginModeDto marginModeDto2;
            int i3;
            double d20;
            double d21;
            double d22;
            double d23;
            LiquidationRiskDto liquidationRiskDto2;
            double d24;
            PerpetualPositionSideDto perpetualPositionSideDto2;
            String str7 = (i2 & 1) != 0 ? surrogate.position_id : str;
            String str8 = (i2 & 2) != 0 ? surrogate.perpetual_contract_id : str2;
            PerpetualPositionSideDto perpetualPositionSideDto3 = (i2 & 4) != 0 ? surrogate.side : perpetualPositionSideDto;
            MarginModeDto marginModeDto3 = (i2 & 8) != 0 ? surrogate.margin_mode : marginModeDto;
            int i4 = (i2 & 16) != 0 ? surrogate.leverage : i;
            double d25 = (i2 & 32) != 0 ? surrogate.quantity : d;
            double d26 = (i2 & 64) != 0 ? surrogate.entry_price : d2;
            double d27 = (i2 & 128) != 0 ? surrogate.position_size : d3;
            double d28 = (i2 & 256) != 0 ? surrogate.initial_margin : d4;
            String str9 = str7;
            String str10 = str8;
            double d29 = (i2 & 512) != 0 ? surrogate.initial_margin_ratio : d5;
            double d30 = (i2 & 1024) != 0 ? surrogate.maintenance_margin : d6;
            double d31 = (i2 & 2048) != 0 ? surrogate.maintenance_margin_ratio : d7;
            double d32 = (i2 & 4096) != 0 ? surrogate.unsettled_pnl : d8;
            double d33 = (i2 & 8192) != 0 ? surrogate.pnl : d9;
            double d34 = (i2 & 16384) != 0 ? surrogate.pnl_percentage : d10;
            double d35 = (i2 & 32768) != 0 ? surrogate.estimated_liquidation_price : d11;
            double d36 = (i2 & 65536) != 0 ? surrogate.total_allocated_margin : d12;
            String str11 = (i2 & 131072) != 0 ? surrogate.open_position_quote_currency : str3;
            LiquidationRiskDto liquidationRiskDto3 = (i2 & 262144) != 0 ? surrogate.liquidation_risk : liquidationRiskDto;
            if ((i2 & 524288) != 0) {
                d13 = d36;
                str5 = surrogate.fx_quote;
                d15 = d31;
                d16 = d32;
                d17 = d33;
                d18 = d34;
                d19 = d35;
                str6 = str11;
                d20 = d25;
                d21 = d26;
                d22 = d27;
                d23 = d28;
                liquidationRiskDto2 = liquidationRiskDto3;
                d24 = d29;
                d14 = d30;
                perpetualPositionSideDto2 = perpetualPositionSideDto3;
                marginModeDto2 = marginModeDto3;
                i3 = i4;
            } else {
                str5 = str4;
                d13 = d36;
                d14 = d30;
                d15 = d31;
                d16 = d32;
                d17 = d33;
                d18 = d34;
                d19 = d35;
                str6 = str11;
                marginModeDto2 = marginModeDto3;
                i3 = i4;
                d20 = d25;
                d21 = d26;
                d22 = d27;
                d23 = d28;
                liquidationRiskDto2 = liquidationRiskDto3;
                d24 = d29;
                perpetualPositionSideDto2 = perpetualPositionSideDto3;
            }
            return surrogate.copy(str9, str10, perpetualPositionSideDto2, marginModeDto2, i3, d20, d21, d22, d23, d24, d14, d15, d16, d17, d18, d19, d13, str6, liquidationRiskDto2, str5);
        }

        @SerialName("entryPrice")
        @JsonAnnotations2(names = {"entry_price"})
        public static /* synthetic */ void getEntry_price$annotations() {
        }

        @SerialName("estimatedLiquidationPrice")
        @JsonAnnotations2(names = {"estimated_liquidation_price"})
        public static /* synthetic */ void getEstimated_liquidation_price$annotations() {
        }

        @SerialName("fxQuote")
        @JsonAnnotations2(names = {"fx_quote"})
        public static /* synthetic */ void getFx_quote$annotations() {
        }

        @SerialName("initialMargin")
        @JsonAnnotations2(names = {"initial_margin"})
        public static /* synthetic */ void getInitial_margin$annotations() {
        }

        @SerialName("initialMarginRatio")
        @JsonAnnotations2(names = {"initial_margin_ratio"})
        public static /* synthetic */ void getInitial_margin_ratio$annotations() {
        }

        @SerialName("leverage")
        @JsonAnnotations2(names = {"leverage"})
        public static /* synthetic */ void getLeverage$annotations() {
        }

        @SerialName("liquidationRisk")
        @JsonAnnotations2(names = {"liquidation_risk"})
        public static /* synthetic */ void getLiquidation_risk$annotations() {
        }

        @SerialName("maintenanceMargin")
        @JsonAnnotations2(names = {"maintenance_margin"})
        public static /* synthetic */ void getMaintenance_margin$annotations() {
        }

        @SerialName("maintenanceMarginRatio")
        @JsonAnnotations2(names = {"maintenance_margin_ratio"})
        public static /* synthetic */ void getMaintenance_margin_ratio$annotations() {
        }

        @SerialName("marginMode")
        @JsonAnnotations2(names = {"margin_mode"})
        public static /* synthetic */ void getMargin_mode$annotations() {
        }

        @SerialName("openPositionQuoteCurrency")
        @JsonAnnotations2(names = {"open_position_quote_currency"})
        public static /* synthetic */ void getOpen_position_quote_currency$annotations() {
        }

        @SerialName("perpetualContractId")
        @JsonAnnotations2(names = {"perpetual_contract_id"})
        public static /* synthetic */ void getPerpetual_contract_id$annotations() {
        }

        @SerialName("pnl")
        @JsonAnnotations2(names = {"pnl"})
        public static /* synthetic */ void getPnl$annotations() {
        }

        @SerialName("pnlPercentage")
        @JsonAnnotations2(names = {"pnl_percentage"})
        public static /* synthetic */ void getPnl_percentage$annotations() {
        }

        @SerialName("positionId")
        @JsonAnnotations2(names = {"position_id"})
        public static /* synthetic */ void getPosition_id$annotations() {
        }

        @SerialName("positionSize")
        @JsonAnnotations2(names = {"position_size"})
        public static /* synthetic */ void getPosition_size$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("totalAllocatedMargin")
        @JsonAnnotations2(names = {"total_allocated_margin"})
        public static /* synthetic */ void getTotal_allocated_margin$annotations() {
        }

        @SerialName("unsettledPnl")
        @JsonAnnotations2(names = {"unsettled_pnl"})
        public static /* synthetic */ void getUnsettled_pnl$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPosition_id() {
            return this.position_id;
        }

        /* renamed from: component10, reason: from getter */
        public final double getInitial_margin_ratio() {
            return this.initial_margin_ratio;
        }

        /* renamed from: component11, reason: from getter */
        public final double getMaintenance_margin() {
            return this.maintenance_margin;
        }

        /* renamed from: component12, reason: from getter */
        public final double getMaintenance_margin_ratio() {
            return this.maintenance_margin_ratio;
        }

        /* renamed from: component13, reason: from getter */
        public final double getUnsettled_pnl() {
            return this.unsettled_pnl;
        }

        /* renamed from: component14, reason: from getter */
        public final double getPnl() {
            return this.pnl;
        }

        /* renamed from: component15, reason: from getter */
        public final double getPnl_percentage() {
            return this.pnl_percentage;
        }

        /* renamed from: component16, reason: from getter */
        public final double getEstimated_liquidation_price() {
            return this.estimated_liquidation_price;
        }

        /* renamed from: component17, reason: from getter */
        public final double getTotal_allocated_margin() {
            return this.total_allocated_margin;
        }

        /* renamed from: component18, reason: from getter */
        public final String getOpen_position_quote_currency() {
            return this.open_position_quote_currency;
        }

        /* renamed from: component19, reason: from getter */
        public final LiquidationRiskDto getLiquidation_risk() {
            return this.liquidation_risk;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPerpetual_contract_id() {
            return this.perpetual_contract_id;
        }

        /* renamed from: component20, reason: from getter */
        public final String getFx_quote() {
            return this.fx_quote;
        }

        /* renamed from: component3, reason: from getter */
        public final PerpetualPositionSideDto getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLeverage() {
            return this.leverage;
        }

        /* renamed from: component6, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final double getEntry_price() {
            return this.entry_price;
        }

        /* renamed from: component8, reason: from getter */
        public final double getPosition_size() {
            return this.position_size;
        }

        /* renamed from: component9, reason: from getter */
        public final double getInitial_margin() {
            return this.initial_margin;
        }

        public final Surrogate copy(String position_id, String perpetual_contract_id, PerpetualPositionSideDto side, MarginModeDto margin_mode, int leverage, double quantity, double entry_price, double position_size, double initial_margin, double initial_margin_ratio, double maintenance_margin, double maintenance_margin_ratio, double unsettled_pnl, double pnl, double pnl_percentage, double estimated_liquidation_price, double total_allocated_margin, String open_position_quote_currency, LiquidationRiskDto liquidation_risk, String fx_quote) {
            Intrinsics.checkNotNullParameter(position_id, "position_id");
            Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(open_position_quote_currency, "open_position_quote_currency");
            Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
            Intrinsics.checkNotNullParameter(fx_quote, "fx_quote");
            return new Surrogate(position_id, perpetual_contract_id, side, margin_mode, leverage, quantity, entry_price, position_size, initial_margin, initial_margin_ratio, maintenance_margin, maintenance_margin_ratio, unsettled_pnl, pnl, pnl_percentage, estimated_liquidation_price, total_allocated_margin, open_position_quote_currency, liquidation_risk, fx_quote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.perpetual_contract_id, surrogate.perpetual_contract_id) && this.side == surrogate.side && this.margin_mode == surrogate.margin_mode && this.leverage == surrogate.leverage && Double.compare(this.quantity, surrogate.quantity) == 0 && Double.compare(this.entry_price, surrogate.entry_price) == 0 && Double.compare(this.position_size, surrogate.position_size) == 0 && Double.compare(this.initial_margin, surrogate.initial_margin) == 0 && Double.compare(this.initial_margin_ratio, surrogate.initial_margin_ratio) == 0 && Double.compare(this.maintenance_margin, surrogate.maintenance_margin) == 0 && Double.compare(this.maintenance_margin_ratio, surrogate.maintenance_margin_ratio) == 0 && Double.compare(this.unsettled_pnl, surrogate.unsettled_pnl) == 0 && Double.compare(this.pnl, surrogate.pnl) == 0 && Double.compare(this.pnl_percentage, surrogate.pnl_percentage) == 0 && Double.compare(this.estimated_liquidation_price, surrogate.estimated_liquidation_price) == 0 && Double.compare(this.total_allocated_margin, surrogate.total_allocated_margin) == 0 && Intrinsics.areEqual(this.open_position_quote_currency, surrogate.open_position_quote_currency) && this.liquidation_risk == surrogate.liquidation_risk && Intrinsics.areEqual(this.fx_quote, surrogate.fx_quote);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((this.position_id.hashCode() * 31) + this.perpetual_contract_id.hashCode()) * 31) + this.side.hashCode()) * 31) + this.margin_mode.hashCode()) * 31) + Integer.hashCode(this.leverage)) * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.entry_price)) * 31) + Double.hashCode(this.position_size)) * 31) + Double.hashCode(this.initial_margin)) * 31) + Double.hashCode(this.initial_margin_ratio)) * 31) + Double.hashCode(this.maintenance_margin)) * 31) + Double.hashCode(this.maintenance_margin_ratio)) * 31) + Double.hashCode(this.unsettled_pnl)) * 31) + Double.hashCode(this.pnl)) * 31) + Double.hashCode(this.pnl_percentage)) * 31) + Double.hashCode(this.estimated_liquidation_price)) * 31) + Double.hashCode(this.total_allocated_margin)) * 31) + this.open_position_quote_currency.hashCode()) * 31) + this.liquidation_risk.hashCode()) * 31) + this.fx_quote.hashCode();
        }

        public String toString() {
            return "Surrogate(position_id=" + this.position_id + ", perpetual_contract_id=" + this.perpetual_contract_id + ", side=" + this.side + ", margin_mode=" + this.margin_mode + ", leverage=" + this.leverage + ", quantity=" + this.quantity + ", entry_price=" + this.entry_price + ", position_size=" + this.position_size + ", initial_margin=" + this.initial_margin + ", initial_margin_ratio=" + this.initial_margin_ratio + ", maintenance_margin=" + this.maintenance_margin + ", maintenance_margin_ratio=" + this.maintenance_margin_ratio + ", unsettled_pnl=" + this.unsettled_pnl + ", pnl=" + this.pnl + ", pnl_percentage=" + this.pnl_percentage + ", estimated_liquidation_price=" + this.estimated_liquidation_price + ", total_allocated_margin=" + this.total_allocated_margin + ", open_position_quote_currency=" + this.open_position_quote_currency + ", liquidation_risk=" + this.liquidation_risk + ", fx_quote=" + this.fx_quote + ")";
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerpetualPositionContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, PerpetualPositionSideDto perpetualPositionSideDto, MarginModeDto marginModeDto, int i2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRiskDto liquidationRiskDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.position_id = "";
            } else {
                this.position_id = str;
            }
            if ((i & 2) == 0) {
                this.perpetual_contract_id = "";
            } else {
                this.perpetual_contract_id = str2;
            }
            if ((i & 4) == 0) {
                this.side = PerpetualPositionSideDto.INSTANCE.getZeroValue();
            } else {
                this.side = perpetualPositionSideDto;
            }
            if ((i & 8) == 0) {
                this.margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_mode = marginModeDto;
            }
            if ((i & 16) == 0) {
                this.leverage = 0;
            } else {
                this.leverage = i2;
            }
            if ((i & 32) == 0) {
                this.quantity = 0.0d;
            } else {
                this.quantity = d;
            }
            if ((i & 64) == 0) {
                this.entry_price = 0.0d;
            } else {
                this.entry_price = d2;
            }
            if ((i & 128) == 0) {
                this.position_size = 0.0d;
            } else {
                this.position_size = d3;
            }
            if ((i & 256) == 0) {
                this.initial_margin = 0.0d;
            } else {
                this.initial_margin = d4;
            }
            if ((i & 512) == 0) {
                this.initial_margin_ratio = 0.0d;
            } else {
                this.initial_margin_ratio = d5;
            }
            if ((i & 1024) == 0) {
                this.maintenance_margin = 0.0d;
            } else {
                this.maintenance_margin = d6;
            }
            if ((i & 2048) == 0) {
                this.maintenance_margin_ratio = 0.0d;
            } else {
                this.maintenance_margin_ratio = d7;
            }
            if ((i & 4096) == 0) {
                this.unsettled_pnl = 0.0d;
            } else {
                this.unsettled_pnl = d8;
            }
            if ((i & 8192) == 0) {
                this.pnl = 0.0d;
            } else {
                this.pnl = d9;
            }
            if ((i & 16384) == 0) {
                this.pnl_percentage = 0.0d;
            } else {
                this.pnl_percentage = d10;
            }
            if ((32768 & i) == 0) {
                this.estimated_liquidation_price = 0.0d;
            } else {
                this.estimated_liquidation_price = d11;
            }
            if ((65536 & i) == 0) {
                this.total_allocated_margin = 0.0d;
            } else {
                this.total_allocated_margin = d12;
            }
            if ((131072 & i) == 0) {
                this.open_position_quote_currency = "";
            } else {
                this.open_position_quote_currency = str3;
            }
            this.liquidation_risk = (262144 & i) == 0 ? LiquidationRiskDto.INSTANCE.getZeroValue() : liquidationRiskDto;
            if ((i & 524288) == 0) {
                this.fx_quote = "";
            } else {
                this.fx_quote = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.position_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.position_id);
            }
            if (!Intrinsics.areEqual(self.perpetual_contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.perpetual_contract_id);
            }
            if (self.side != PerpetualPositionSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PerpetualPositionSideDto.Serializer.INSTANCE, self.side);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            int i = self.leverage;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Double.compare(self.quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.quantity));
            }
            if (Double.compare(self.entry_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.entry_price));
            }
            if (Double.compare(self.position_size, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.position_size));
            }
            if (Double.compare(self.initial_margin, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.initial_margin));
            }
            if (Double.compare(self.initial_margin_ratio, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 9, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.initial_margin_ratio));
            }
            if (Double.compare(self.maintenance_margin, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 10, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.maintenance_margin));
            }
            if (Double.compare(self.maintenance_margin_ratio, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 11, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.maintenance_margin_ratio));
            }
            if (Double.compare(self.unsettled_pnl, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 12, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.unsettled_pnl));
            }
            if (Double.compare(self.pnl, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 13, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.pnl));
            }
            if (Double.compare(self.pnl_percentage, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 14, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.pnl_percentage));
            }
            if (Double.compare(self.estimated_liquidation_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 15, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.estimated_liquidation_price));
            }
            if (Double.compare(self.total_allocated_margin, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 16, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_allocated_margin));
            }
            if (!Intrinsics.areEqual(self.open_position_quote_currency, "")) {
                output.encodeStringElement(serialDesc, 17, self.open_position_quote_currency);
            }
            if (self.liquidation_risk != LiquidationRiskDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 18, LiquidationRiskDto.Serializer.INSTANCE, self.liquidation_risk);
            }
            if (Intrinsics.areEqual(self.fx_quote, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 19, self.fx_quote);
        }

        public Surrogate(String position_id, String perpetual_contract_id, PerpetualPositionSideDto side, MarginModeDto margin_mode, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String open_position_quote_currency, LiquidationRiskDto liquidation_risk, String fx_quote) {
            Intrinsics.checkNotNullParameter(position_id, "position_id");
            Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(open_position_quote_currency, "open_position_quote_currency");
            Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
            Intrinsics.checkNotNullParameter(fx_quote, "fx_quote");
            this.position_id = position_id;
            this.perpetual_contract_id = perpetual_contract_id;
            this.side = side;
            this.margin_mode = margin_mode;
            this.leverage = i;
            this.quantity = d;
            this.entry_price = d2;
            this.position_size = d3;
            this.initial_margin = d4;
            this.initial_margin_ratio = d5;
            this.maintenance_margin = d6;
            this.maintenance_margin_ratio = d7;
            this.unsettled_pnl = d8;
            this.pnl = d9;
            this.pnl_percentage = d10;
            this.estimated_liquidation_price = d11;
            this.total_allocated_margin = d12;
            this.open_position_quote_currency = open_position_quote_currency;
            this.liquidation_risk = liquidation_risk;
            this.fx_quote = fx_quote;
        }

        public /* synthetic */ Surrogate(String str, String str2, PerpetualPositionSideDto perpetualPositionSideDto, MarginModeDto marginModeDto, int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, String str3, LiquidationRiskDto liquidationRiskDto, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? PerpetualPositionSideDto.INSTANCE.getZeroValue() : perpetualPositionSideDto, (i2 & 8) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, (i2 & 256) != 0 ? 0.0d : d4, (i2 & 512) != 0 ? 0.0d : d5, (i2 & 1024) != 0 ? 0.0d : d6, (i2 & 2048) != 0 ? 0.0d : d7, (i2 & 4096) != 0 ? 0.0d : d8, (i2 & 8192) != 0 ? 0.0d : d9, (i2 & 16384) != 0 ? 0.0d : d10, (32768 & i2) != 0 ? 0.0d : d11, (65536 & i2) == 0 ? d12 : 0.0d, (131072 & i2) != 0 ? "" : str3, (i2 & 262144) != 0 ? LiquidationRiskDto.INSTANCE.getZeroValue() : liquidationRiskDto, (i2 & 524288) != 0 ? "" : str4);
        }

        public final String getPosition_id() {
            return this.position_id;
        }

        public final String getPerpetual_contract_id() {
            return this.perpetual_contract_id;
        }

        public final PerpetualPositionSideDto getSide() {
            return this.side;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final int getLeverage() {
            return this.leverage;
        }

        public final double getQuantity() {
            return this.quantity;
        }

        public final double getEntry_price() {
            return this.entry_price;
        }

        public final double getPosition_size() {
            return this.position_size;
        }

        public final double getInitial_margin() {
            return this.initial_margin;
        }

        public final double getInitial_margin_ratio() {
            return this.initial_margin_ratio;
        }

        public final double getMaintenance_margin() {
            return this.maintenance_margin;
        }

        public final double getMaintenance_margin_ratio() {
            return this.maintenance_margin_ratio;
        }

        public final double getUnsettled_pnl() {
            return this.unsettled_pnl;
        }

        public final double getPnl() {
            return this.pnl;
        }

        public final double getPnl_percentage() {
            return this.pnl_percentage;
        }

        public final double getEstimated_liquidation_price() {
            return this.estimated_liquidation_price;
        }

        public final double getTotal_allocated_margin() {
            return this.total_allocated_margin;
        }

        public final String getOpen_position_quote_currency() {
            return this.open_position_quote_currency;
        }

        public final LiquidationRiskDto getLiquidation_risk() {
            return this.liquidation_risk;
        }

        public final String getFx_quote() {
            return this.fx_quote;
        }
    }

    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PerpetualPositionContextDto, PerpetualPositionContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerpetualPositionContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualPositionContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualPositionContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PerpetualPositionContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerpetualPositionContext> getProtoAdapter() {
            return PerpetualPositionContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualPositionContextDto getZeroValue() {
            return PerpetualPositionContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualPositionContextDto fromProto(PerpetualPositionContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PerpetualPositionContextDto(new Surrogate(proto.getPosition_id(), proto.getPerpetual_contract_id(), PerpetualPositionSideDto.INSTANCE.fromProto(proto.getSide()), MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode()), proto.getLeverage(), proto.getQuantity(), proto.getEntry_price(), proto.getPosition_size(), proto.getInitial_margin(), proto.getInitial_margin_ratio(), proto.getMaintenance_margin(), proto.getMaintenance_margin_ratio(), proto.getUnsettled_pnl(), proto.getPnl(), proto.getPnl_percentage(), proto.getEstimated_liquidation_price(), proto.getTotal_allocated_margin(), proto.getOpen_position_quote_currency(), LiquidationRiskDto.INSTANCE.fromProto(proto.getLiquidation_risk()), proto.getFx_quote()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualPositionContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerpetualPositionContextDto(null, null, null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_SIDE_UNSPECIFIED", "LONG", "SHORT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PerpetualPositionSideDto implements Dto2<PerpetualPositionContext.PerpetualPositionSide>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerpetualPositionSideDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PerpetualPositionSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PerpetualPositionSideDto, PerpetualPositionContext.PerpetualPositionSide>> binaryBase64Serializer$delegate;
        public static final PerpetualPositionSideDto POSITION_SIDE_UNSPECIFIED = new POSITION_SIDE_UNSPECIFIED("POSITION_SIDE_UNSPECIFIED", 0);
        public static final PerpetualPositionSideDto LONG = new LONG("LONG", 1);
        public static final PerpetualPositionSideDto SHORT = new SHORT("SHORT", 2);

        private static final /* synthetic */ PerpetualPositionSideDto[] $values() {
            return new PerpetualPositionSideDto[]{POSITION_SIDE_UNSPECIFIED, LONG, SHORT};
        }

        public /* synthetic */ PerpetualPositionSideDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PerpetualPositionSideDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PerpetualPositionSideDto(String str, int i) {
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.PerpetualPositionSideDto.POSITION_SIDE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POSITION_SIDE_UNSPECIFIED extends PerpetualPositionSideDto {
            POSITION_SIDE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.PerpetualPositionSide toProto() {
                return PerpetualPositionContext.PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED;
            }
        }

        static {
            PerpetualPositionSideDto[] perpetualPositionSideDtoArr$values = $values();
            $VALUES = perpetualPositionSideDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(perpetualPositionSideDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContextDto$PerpetualPositionSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualPositionContextDto.PerpetualPositionSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.PerpetualPositionSideDto.LONG", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LONG extends PerpetualPositionSideDto {
            LONG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.PerpetualPositionSide toProto() {
                return PerpetualPositionContext.PerpetualPositionSide.LONG;
            }
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.PerpetualPositionSideDto.SHORT", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHORT extends PerpetualPositionSideDto {
            SHORT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.PerpetualPositionSide toProto() {
                return PerpetualPositionContext.PerpetualPositionSide.SHORT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$PerpetualPositionSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PerpetualPositionSideDto, PerpetualPositionContext.PerpetualPositionSide> {

            /* compiled from: PerpetualPositionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualPositionContext.PerpetualPositionSide.values().length];
                    try {
                        iArr[PerpetualPositionContext.PerpetualPositionSide.POSITION_SIDE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualPositionContext.PerpetualPositionSide.LONG.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualPositionContext.PerpetualPositionSide.SHORT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PerpetualPositionSideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PerpetualPositionSideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PerpetualPositionSideDto> getBinaryBase64Serializer() {
                return (KSerializer) PerpetualPositionSideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualPositionContext.PerpetualPositionSide> getProtoAdapter() {
                return PerpetualPositionContext.PerpetualPositionSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PerpetualPositionSideDto getZeroValue() {
                return PerpetualPositionSideDto.POSITION_SIDE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PerpetualPositionSideDto fromProto(PerpetualPositionContext.PerpetualPositionSide proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return PerpetualPositionSideDto.POSITION_SIDE_UNSPECIFIED;
                }
                if (i == 2) {
                    return PerpetualPositionSideDto.LONG;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return PerpetualPositionSideDto.SHORT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$PerpetualPositionSideDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<PerpetualPositionSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PerpetualPositionSideDto, PerpetualPositionContext.PerpetualPositionSide> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualPositionContext.PerpetualPositionSide", PerpetualPositionSideDto.getEntries(), PerpetualPositionSideDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PerpetualPositionSideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PerpetualPositionSideDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PerpetualPositionSideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PerpetualPositionSideDto valueOf(String str) {
            return (PerpetualPositionSideDto) Enum.valueOf(PerpetualPositionSideDto.class, str);
        }

        public static PerpetualPositionSideDto[] values() {
            return (PerpetualPositionSideDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MARGIN_MODE_UNSPECIFIED", "ISOLATED", "CROSS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MarginModeDto implements Dto2<PerpetualPositionContext.MarginMode>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarginModeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MarginModeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MarginModeDto, PerpetualPositionContext.MarginMode>> binaryBase64Serializer$delegate;
        public static final MarginModeDto MARGIN_MODE_UNSPECIFIED = new MARGIN_MODE_UNSPECIFIED("MARGIN_MODE_UNSPECIFIED", 0);
        public static final MarginModeDto ISOLATED = new ISOLATED("ISOLATED", 1);
        public static final MarginModeDto CROSS = new CROSS("CROSS", 2);

        private static final /* synthetic */ MarginModeDto[] $values() {
            return new MarginModeDto[]{MARGIN_MODE_UNSPECIFIED, ISOLATED, CROSS};
        }

        public /* synthetic */ MarginModeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MarginModeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.MarginModeDto.MARGIN_MODE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN_MODE_UNSPECIFIED extends MarginModeDto {
            MARGIN_MODE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.MarginMode toProto() {
                return PerpetualPositionContext.MarginMode.MARGIN_MODE_UNSPECIFIED;
            }
        }

        private MarginModeDto(String str, int i) {
        }

        static {
            MarginModeDto[] marginModeDtoArr$values = $values();
            $VALUES = marginModeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marginModeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContextDto$MarginModeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualPositionContextDto.MarginModeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.MarginModeDto.ISOLATED", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ISOLATED extends MarginModeDto {
            ISOLATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.MarginMode toProto() {
                return PerpetualPositionContext.MarginMode.ISOLATED;
            }
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.MarginModeDto.CROSS", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CROSS extends MarginModeDto {
            CROSS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.MarginMode toProto() {
                return PerpetualPositionContext.MarginMode.CROSS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$MarginMode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MarginModeDto, PerpetualPositionContext.MarginMode> {

            /* compiled from: PerpetualPositionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualPositionContext.MarginMode.values().length];
                    try {
                        iArr[PerpetualPositionContext.MarginMode.MARGIN_MODE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualPositionContext.MarginMode.ISOLATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualPositionContext.MarginMode.CROSS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MarginModeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginModeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginModeDto> getBinaryBase64Serializer() {
                return (KSerializer) MarginModeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualPositionContext.MarginMode> getProtoAdapter() {
                return PerpetualPositionContext.MarginMode.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginModeDto getZeroValue() {
                return MarginModeDto.MARGIN_MODE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginModeDto fromProto(PerpetualPositionContext.MarginMode proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return MarginModeDto.MARGIN_MODE_UNSPECIFIED;
                }
                if (i == 2) {
                    return MarginModeDto.ISOLATED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return MarginModeDto.CROSS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MarginModeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MarginModeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MarginModeDto, PerpetualPositionContext.MarginMode> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualPositionContext.MarginMode", MarginModeDto.getEntries(), MarginModeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MarginModeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MarginModeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MarginModeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MarginModeDto valueOf(String str) {
            return (MarginModeDto) Enum.valueOf(MarginModeDto.class, str);
        }

        public static MarginModeDto[] values() {
            return (MarginModeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LIQUIDATION_RISK_UNSPECIFIED", "NO_RISK", "AT_RISK", "HIGH_RISK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class LiquidationRiskDto implements Dto2<PerpetualPositionContext.LiquidationRisk>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LiquidationRiskDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<LiquidationRiskDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<LiquidationRiskDto, PerpetualPositionContext.LiquidationRisk>> binaryBase64Serializer$delegate;
        public static final LiquidationRiskDto LIQUIDATION_RISK_UNSPECIFIED = new LIQUIDATION_RISK_UNSPECIFIED("LIQUIDATION_RISK_UNSPECIFIED", 0);
        public static final LiquidationRiskDto NO_RISK = new NO_RISK("NO_RISK", 1);
        public static final LiquidationRiskDto AT_RISK = new AT_RISK("AT_RISK", 2);
        public static final LiquidationRiskDto HIGH_RISK = new HIGH_RISK("HIGH_RISK", 3);

        private static final /* synthetic */ LiquidationRiskDto[] $values() {
            return new LiquidationRiskDto[]{LIQUIDATION_RISK_UNSPECIFIED, NO_RISK, AT_RISK, HIGH_RISK};
        }

        public /* synthetic */ LiquidationRiskDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<LiquidationRiskDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private LiquidationRiskDto(String str, int i) {
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.LiquidationRiskDto.LIQUIDATION_RISK_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIQUIDATION_RISK_UNSPECIFIED extends LiquidationRiskDto {
            LIQUIDATION_RISK_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.LiquidationRisk toProto() {
                return PerpetualPositionContext.LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED;
            }
        }

        static {
            LiquidationRiskDto[] liquidationRiskDtoArr$values = $values();
            $VALUES = liquidationRiskDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(liquidationRiskDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualPositionContextDto$LiquidationRiskDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualPositionContextDto.LiquidationRiskDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.LiquidationRiskDto.NO_RISK", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NO_RISK extends LiquidationRiskDto {
            NO_RISK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.LiquidationRisk toProto() {
                return PerpetualPositionContext.LiquidationRisk.NO_RISK;
            }
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.LiquidationRiskDto.AT_RISK", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AT_RISK extends LiquidationRiskDto {
            AT_RISK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.LiquidationRisk toProto() {
                return PerpetualPositionContext.LiquidationRisk.AT_RISK;
            }
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualPositionContextDto.LiquidationRiskDto.HIGH_RISK", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HIGH_RISK extends LiquidationRiskDto {
            HIGH_RISK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualPositionContext.LiquidationRisk toProto() {
                return PerpetualPositionContext.LiquidationRisk.HIGH_RISK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContext$LiquidationRisk;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<LiquidationRiskDto, PerpetualPositionContext.LiquidationRisk> {

            /* compiled from: PerpetualPositionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualPositionContext.LiquidationRisk.values().length];
                    try {
                        iArr[PerpetualPositionContext.LiquidationRisk.LIQUIDATION_RISK_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualPositionContext.LiquidationRisk.NO_RISK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualPositionContext.LiquidationRisk.AT_RISK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerpetualPositionContext.LiquidationRisk.HIGH_RISK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LiquidationRiskDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LiquidationRiskDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LiquidationRiskDto> getBinaryBase64Serializer() {
                return (KSerializer) LiquidationRiskDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualPositionContext.LiquidationRisk> getProtoAdapter() {
                return PerpetualPositionContext.LiquidationRisk.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LiquidationRiskDto getZeroValue() {
                return LiquidationRiskDto.LIQUIDATION_RISK_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LiquidationRiskDto fromProto(PerpetualPositionContext.LiquidationRisk proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return LiquidationRiskDto.LIQUIDATION_RISK_UNSPECIFIED;
                }
                if (i == 2) {
                    return LiquidationRiskDto.NO_RISK;
                }
                if (i == 3) {
                    return LiquidationRiskDto.AT_RISK;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return LiquidationRiskDto.HIGH_RISK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualPositionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$LiquidationRiskDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<LiquidationRiskDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<LiquidationRiskDto, PerpetualPositionContext.LiquidationRisk> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualPositionContext.LiquidationRisk", LiquidationRiskDto.getEntries(), LiquidationRiskDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public LiquidationRiskDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (LiquidationRiskDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, LiquidationRiskDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static LiquidationRiskDto valueOf(String str) {
            return (LiquidationRiskDto) Enum.valueOf(LiquidationRiskDto.class, str);
        }

        public static LiquidationRiskDto[] values() {
            return (LiquidationRiskDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PerpetualPositionContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerpetualPositionContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerpetualPositionContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerpetualPositionContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerpetualPositionContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerpetualPositionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualPositionContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerpetualPositionContextDto";
        }
    }
}
