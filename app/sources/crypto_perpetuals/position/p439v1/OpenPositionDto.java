package crypto_perpetuals.position.p439v1;

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
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.FXQuoteDto;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.MarginModeDto;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.common.p435v1.Side;
import crypto_perpetuals.common.p435v1.SideDto;
import crypto_perpetuals.currency.p437v1.Currency;
import crypto_perpetuals.currency.p437v1.CurrencyDto;
import crypto_perpetuals.position.p439v1.EstimatedClosingFeesDto;
import crypto_perpetuals.position.p439v1.LiquidationRiskDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: OpenPositionDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b)\b\u0007\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004feghB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÉ\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\b\b\u0002\u0010!\u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\u0010\b\u0002\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-\u0012\b\b\u0002\u0010/\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u00100J\u000f\u00101\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020:H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020:H\u0016¢\u0006\u0004\bC\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bE\u00104R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bF\u00104R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bM\u0010LR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0011\u0010\u0015\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bO\u0010LR\u0011\u0010\u0016\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bP\u0010LR\u0011\u0010\u0017\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0011\u0010\u0018\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bS\u0010LR\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bT\u0010LR\u0011\u0010 \u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bU\u0010LR\u0011\u0010!\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bV\u0010LR\u0011\u0010\"\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bW\u0010LR\u0013\u0010#\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010%\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010'\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010(\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010)\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b`\u0010YR\u0013\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0019\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-8F¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006i"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPositionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/position/v1/OpenPosition;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;)V", "", "id", "contract_id", "Lcrypto_perpetuals/common/v1/SideDto;", "side", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcom/robinhood/idl/IdlDecimal;", "leverage", "quantity", "entry_price", "Lcrypto_perpetuals/common/v1/MoneyDto;", "pnl_settled", "initial_margin", "initial_margin_ratio", "maintenance_margin", "maintenance_margin_ratio", "estimated_liquidation_price", "pnl_realized", "pnl_unrealized", "pnl_percentage", "collateral_reserved", "Lcrypto_perpetuals/currency/v1/CurrencyDto;", "collateral_currency", "total_allocated_margin", "position_size", "mark_price", "pnl", "Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;", "estimated_closing_fees", "Lcrypto_perpetuals/position/v1/LiquidationRiskDto;", "liquidation_risk", "quote_currency", "pnl_unsettled", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "implied_leverage", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/currency/v1/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;Lcrypto_perpetuals/position/v1/LiquidationRiskDto;Lcrypto_perpetuals/currency/v1/CurrencyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcrypto_perpetuals/position/v1/OpenPosition;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;", "getId", "getContract_id", "getSide", "()Lcrypto_perpetuals/common/v1/SideDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getLeverage", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "getEntry_price", "getInitial_margin", "getInitial_margin_ratio", "getMaintenance_margin", "getMaintenance_margin_ratio", "getEstimated_liquidation_price", "getPnl_percentage", "getTotal_allocated_margin", "getPosition_size", "getMark_price", "getPnl", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getEstimated_closing_fees", "()Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;", "getLiquidation_risk", "()Lcrypto_perpetuals/position/v1/LiquidationRiskDto;", "getQuote_currency", "()Lcrypto_perpetuals/currency/v1/CurrencyDto;", "getPnl_unsettled", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class OpenPositionDto implements Dto3<OpenPosition>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OpenPositionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OpenPositionDto, OpenPosition>> binaryBase64Serializer$delegate;
    private static final OpenPositionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OpenPositionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OpenPositionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final IdlDecimal getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final IdlDecimal getEntry_price() {
        return this.surrogate.getEntry_price();
    }

    public final IdlDecimal getInitial_margin() {
        return this.surrogate.getInitial_margin();
    }

    public final IdlDecimal getInitial_margin_ratio() {
        return this.surrogate.getInitial_margin_ratio();
    }

    public final IdlDecimal getMaintenance_margin() {
        return this.surrogate.getMaintenance_margin();
    }

    public final IdlDecimal getMaintenance_margin_ratio() {
        return this.surrogate.getMaintenance_margin_ratio();
    }

    public final IdlDecimal getEstimated_liquidation_price() {
        return this.surrogate.getEstimated_liquidation_price();
    }

    public final IdlDecimal getPnl_percentage() {
        return this.surrogate.getPnl_percentage();
    }

    public final IdlDecimal getTotal_allocated_margin() {
        return this.surrogate.getTotal_allocated_margin();
    }

    public final IdlDecimal getPosition_size() {
        return this.surrogate.getPosition_size();
    }

    public final IdlDecimal getMark_price() {
        return this.surrogate.getMark_price();
    }

    public final MoneyDto getPnl() {
        return this.surrogate.getPnl();
    }

    public final EstimatedClosingFeesDto getEstimated_closing_fees() {
        return this.surrogate.getEstimated_closing_fees();
    }

    public final LiquidationRiskDto getLiquidation_risk() {
        return this.surrogate.getLiquidation_risk();
    }

    public final CurrencyDto getQuote_currency() {
        return this.surrogate.getQuote_currency();
    }

    public final MoneyDto getPnl_unsettled() {
        return this.surrogate.getPnl_unsettled();
    }

    public final FXQuoteDto getFx_quote() {
        return this.surrogate.getFx_quote();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OpenPositionDto(java.lang.String r27, java.lang.String r28, crypto_perpetuals.common.p435v1.SideDto r29, crypto_perpetuals.common.p435v1.MarginModeDto r30, com.robinhood.idl.IdlDecimal r31, com.robinhood.idl.IdlDecimal r32, com.robinhood.idl.IdlDecimal r33, crypto_perpetuals.common.p435v1.MoneyDto r34, com.robinhood.idl.IdlDecimal r35, com.robinhood.idl.IdlDecimal r36, com.robinhood.idl.IdlDecimal r37, com.robinhood.idl.IdlDecimal r38, com.robinhood.idl.IdlDecimal r39, crypto_perpetuals.common.p435v1.MoneyDto r40, crypto_perpetuals.common.p435v1.MoneyDto r41, com.robinhood.idl.IdlDecimal r42, com.robinhood.idl.IdlDecimal r43, crypto_perpetuals.currency.p437v1.CurrencyDto r44, com.robinhood.idl.IdlDecimal r45, com.robinhood.idl.IdlDecimal r46, com.robinhood.idl.IdlDecimal r47, crypto_perpetuals.common.p435v1.MoneyDto r48, crypto_perpetuals.position.p439v1.EstimatedClosingFeesDto r49, crypto_perpetuals.position.p439v1.LiquidationRiskDto r50, crypto_perpetuals.currency.p437v1.CurrencyDto r51, crypto_perpetuals.common.p435v1.MoneyDto r52, crypto_perpetuals.common.p435v1.FXQuoteDto r53, p479j$.time.Instant r54, com.robinhood.idl.IdlDecimal r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.position.p439v1.OpenPositionDto.<init>(java.lang.String, java.lang.String, crypto_perpetuals.common.v1.SideDto, crypto_perpetuals.common.v1.MarginModeDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, crypto_perpetuals.common.v1.MoneyDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.currency.v1.CurrencyDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, crypto_perpetuals.position.v1.EstimatedClosingFeesDto, crypto_perpetuals.position.v1.LiquidationRiskDto, crypto_perpetuals.currency.v1.CurrencyDto, crypto_perpetuals.common.v1.MoneyDto, crypto_perpetuals.common.v1.FXQuoteDto, j$.time.Instant, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenPositionDto(String id, String contract_id, SideDto side, MarginModeDto margin_mode, IdlDecimal leverage, IdlDecimal quantity, IdlDecimal entry_price, MoneyDto moneyDto, IdlDecimal initial_margin, IdlDecimal initial_margin_ratio, IdlDecimal maintenance_margin, IdlDecimal maintenance_margin_ratio, IdlDecimal idlDecimal, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal pnl_percentage, IdlDecimal idlDecimal2, CurrencyDto currencyDto, IdlDecimal total_allocated_margin, IdlDecimal position_size, IdlDecimal mark_price, MoneyDto moneyDto4, EstimatedClosingFeesDto estimatedClosingFeesDto, LiquidationRiskDto liquidation_risk, CurrencyDto currencyDto2, MoneyDto moneyDto5, FXQuoteDto fXQuoteDto, Instant instant, IdlDecimal implied_leverage) {
        this(new Surrogate(id, contract_id, side, margin_mode, leverage, quantity, entry_price, moneyDto, initial_margin, initial_margin_ratio, maintenance_margin, maintenance_margin_ratio, idlDecimal, moneyDto2, moneyDto3, pnl_percentage, idlDecimal2, currencyDto, total_allocated_margin, position_size, mark_price, moneyDto4, estimatedClosingFeesDto, liquidation_risk, currencyDto2, moneyDto5, fXQuoteDto, instant, implied_leverage));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(entry_price, "entry_price");
        Intrinsics.checkNotNullParameter(initial_margin, "initial_margin");
        Intrinsics.checkNotNullParameter(initial_margin_ratio, "initial_margin_ratio");
        Intrinsics.checkNotNullParameter(maintenance_margin, "maintenance_margin");
        Intrinsics.checkNotNullParameter(maintenance_margin_ratio, "maintenance_margin_ratio");
        Intrinsics.checkNotNullParameter(pnl_percentage, "pnl_percentage");
        Intrinsics.checkNotNullParameter(total_allocated_margin, "total_allocated_margin");
        Intrinsics.checkNotNullParameter(position_size, "position_size");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
        Intrinsics.checkNotNullParameter(implied_leverage, "implied_leverage");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OpenPosition toProto() {
        String id = this.surrogate.getId();
        String contract_id = this.surrogate.getContract_id();
        Side side = (Side) this.surrogate.getSide().toProto();
        MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode().toProto();
        String stringValue = this.surrogate.getLeverage().getStringValue();
        String stringValue2 = this.surrogate.getQuantity().getStringValue();
        String stringValue3 = this.surrogate.getEntry_price().getStringValue();
        MoneyDto pnl_settled = this.surrogate.getPnl_settled();
        Money proto = pnl_settled != null ? pnl_settled.toProto() : null;
        String stringValue4 = this.surrogate.getInitial_margin().getStringValue();
        String stringValue5 = this.surrogate.getInitial_margin_ratio().getStringValue();
        String stringValue6 = this.surrogate.getMaintenance_margin().getStringValue();
        String stringValue7 = this.surrogate.getMaintenance_margin_ratio().getStringValue();
        IdlDecimal estimated_liquidation_price = this.surrogate.getEstimated_liquidation_price();
        String stringValue8 = estimated_liquidation_price != null ? estimated_liquidation_price.getStringValue() : null;
        MoneyDto pnl_realized = this.surrogate.getPnl_realized();
        Money proto2 = pnl_realized != null ? pnl_realized.toProto() : null;
        MoneyDto pnl_unrealized = this.surrogate.getPnl_unrealized();
        Money proto3 = pnl_unrealized != null ? pnl_unrealized.toProto() : null;
        String stringValue9 = this.surrogate.getPnl_percentage().getStringValue();
        IdlDecimal collateral_reserved = this.surrogate.getCollateral_reserved();
        String stringValue10 = collateral_reserved != null ? collateral_reserved.getStringValue() : null;
        CurrencyDto collateral_currency = this.surrogate.getCollateral_currency();
        Currency proto4 = collateral_currency != null ? collateral_currency.toProto() : null;
        String stringValue11 = this.surrogate.getTotal_allocated_margin().getStringValue();
        String stringValue12 = this.surrogate.getPosition_size().getStringValue();
        String stringValue13 = this.surrogate.getMark_price().getStringValue();
        MoneyDto pnl = this.surrogate.getPnl();
        Money proto5 = pnl != null ? pnl.toProto() : null;
        EstimatedClosingFeesDto estimated_closing_fees = this.surrogate.getEstimated_closing_fees();
        EstimatedClosingFees proto6 = estimated_closing_fees != null ? estimated_closing_fees.toProto() : null;
        LiquidationRisk liquidationRisk = (LiquidationRisk) this.surrogate.getLiquidation_risk().toProto();
        CurrencyDto quote_currency = this.surrogate.getQuote_currency();
        Currency proto7 = quote_currency != null ? quote_currency.toProto() : null;
        MoneyDto pnl_unsettled = this.surrogate.getPnl_unsettled();
        Money proto8 = pnl_unsettled != null ? pnl_unsettled.toProto() : null;
        FXQuoteDto fx_quote = this.surrogate.getFx_quote();
        return new OpenPosition(id, contract_id, side, marginMode, stringValue, stringValue2, stringValue3, proto, stringValue4, stringValue5, stringValue6, stringValue7, stringValue8, proto2, proto3, stringValue9, stringValue10, proto4, stringValue11, stringValue12, stringValue13, proto5, proto6, liquidationRisk, proto7, proto8, fx_quote != null ? fx_quote.toProto() : null, this.surrogate.getCreated_at(), this.surrogate.getImplied_leverage().getStringValue(), null, 536870912, null);
    }

    public String toString() {
        return "[OpenPositionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OpenPositionDto) && Intrinsics.areEqual(((OpenPositionDto) other).surrogate, this.surrogate);
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
    /* compiled from: OpenPositionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bS\b\u0083\b\u0018\u0000 \u0094\u00012\u00020\u0001:\u0004\u0095\u0001\u0094\u0001B·\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0019\b\u0002\u0010\u001a\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u001f\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012.\b\u0002\u0010,\u001a(\u0018\u00010)j\u0013\u0018\u0001`*¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0+¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0+\u0012\u0017\b\u0002\u0010-\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b.\u0010/B½\u0002\b\u0010\u0012\u0006\u00101\u001a\u000200\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010,\u001a\u0004\u0018\u00010)\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b.\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u000200HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010?R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010F\u0012\u0004\bK\u0010I\u001a\u0004\bJ\u0010?R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010L\u0012\u0004\bO\u0010I\u001a\u0004\bM\u0010NR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010P\u0012\u0004\bS\u0010I\u001a\u0004\bQ\u0010RR/\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010T\u0012\u0004\bW\u0010I\u001a\u0004\bU\u0010VR/\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010T\u0012\u0004\bY\u0010I\u001a\u0004\bX\u0010VR/\u0010\u000f\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010T\u0012\u0004\b[\u0010I\u001a\u0004\bZ\u0010VR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\\\u0012\u0004\b_\u0010I\u001a\u0004\b]\u0010^R/\u0010\u0012\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\ba\u0010I\u001a\u0004\b`\u0010VR/\u0010\u0013\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010T\u0012\u0004\bc\u0010I\u001a\u0004\bb\u0010VR/\u0010\u0014\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010T\u0012\u0004\be\u0010I\u001a\u0004\bd\u0010VR/\u0010\u0015\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010T\u0012\u0004\bg\u0010I\u001a\u0004\bf\u0010VR1\u0010\u0016\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010T\u0012\u0004\bi\u0010I\u001a\u0004\bh\u0010VR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\\\u0012\u0004\bk\u0010I\u001a\u0004\bj\u0010^R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\\\u0012\u0004\bm\u0010I\u001a\u0004\bl\u0010^R/\u0010\u0019\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010T\u0012\u0004\bo\u0010I\u001a\u0004\bn\u0010VR1\u0010\u001a\u001a\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010T\u0012\u0004\bq\u0010I\u001a\u0004\bp\u0010VR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010r\u0012\u0004\bu\u0010I\u001a\u0004\bs\u0010tR/\u0010\u001d\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010T\u0012\u0004\bw\u0010I\u001a\u0004\bv\u0010VR/\u0010\u001e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010T\u0012\u0004\by\u0010I\u001a\u0004\bx\u0010VR/\u0010\u001f\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010T\u0012\u0004\b{\u0010I\u001a\u0004\bz\u0010VR\"\u0010 \u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\\\u0012\u0004\b}\u0010I\u001a\u0004\b|\u0010^R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\"\u0010~\u0012\u0005\b\u0081\u0001\u0010I\u001a\u0005\b\u007f\u0010\u0080\u0001R$\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b$\u0010\u0082\u0001\u0012\u0005\b\u0085\u0001\u0010I\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010%\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b%\u0010r\u0012\u0005\b\u0087\u0001\u0010I\u001a\u0005\b\u0086\u0001\u0010tR$\u0010&\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b&\u0010\\\u0012\u0005\b\u0089\u0001\u0010I\u001a\u0005\b\u0088\u0001\u0010^R&\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010\u008a\u0001\u0012\u0005\b\u008d\u0001\u0010I\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001RJ\u0010,\u001a(\u0018\u00010)j\u0013\u0018\u0001`*¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0+¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0+8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b,\u0010\u008e\u0001\u0012\u0005\b\u0091\u0001\u0010I\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R1\u0010-\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b-\u0010T\u0012\u0005\b\u0093\u0001\u0010I\u001a\u0005\b\u0092\u0001\u0010V¨\u0006\u0096\u0001"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;", "", "", "id", "contract_id", "Lcrypto_perpetuals/common/v1/SideDto;", "side", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "leverage", "quantity", "entry_price", "Lcrypto_perpetuals/common/v1/MoneyDto;", "pnl_settled", "initial_margin", "initial_margin_ratio", "maintenance_margin", "maintenance_margin_ratio", "estimated_liquidation_price", "pnl_realized", "pnl_unrealized", "pnl_percentage", "collateral_reserved", "Lcrypto_perpetuals/currency/v1/CurrencyDto;", "collateral_currency", "total_allocated_margin", "position_size", "mark_price", "pnl", "Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;", "estimated_closing_fees", "Lcrypto_perpetuals/position/v1/LiquidationRiskDto;", "liquidation_risk", "quote_currency", "pnl_unsettled", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "implied_leverage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/currency/v1/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;Lcrypto_perpetuals/position/v1/LiquidationRiskDto;Lcrypto_perpetuals/currency/v1/CurrencyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/currency/v1/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;Lcrypto_perpetuals/position/v1/LiquidationRiskDto;Lcrypto_perpetuals/currency/v1/CurrencyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_position_v1_externalRelease", "(Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getContract_id", "getContract_id$annotations", "Lcrypto_perpetuals/common/v1/SideDto;", "getSide", "()Lcrypto_perpetuals/common/v1/SideDto;", "getSide$annotations", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getLeverage", "()Lcom/robinhood/idl/IdlDecimal;", "getLeverage$annotations", "getQuantity", "getQuantity$annotations", "getEntry_price", "getEntry_price$annotations", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getPnl_settled", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getPnl_settled$annotations", "getInitial_margin", "getInitial_margin$annotations", "getInitial_margin_ratio", "getInitial_margin_ratio$annotations", "getMaintenance_margin", "getMaintenance_margin$annotations", "getMaintenance_margin_ratio", "getMaintenance_margin_ratio$annotations", "getEstimated_liquidation_price", "getEstimated_liquidation_price$annotations", "getPnl_realized", "getPnl_realized$annotations", "getPnl_unrealized", "getPnl_unrealized$annotations", "getPnl_percentage", "getPnl_percentage$annotations", "getCollateral_reserved", "getCollateral_reserved$annotations", "Lcrypto_perpetuals/currency/v1/CurrencyDto;", "getCollateral_currency", "()Lcrypto_perpetuals/currency/v1/CurrencyDto;", "getCollateral_currency$annotations", "getTotal_allocated_margin", "getTotal_allocated_margin$annotations", "getPosition_size", "getPosition_size$annotations", "getMark_price", "getMark_price$annotations", "getPnl", "getPnl$annotations", "Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;", "getEstimated_closing_fees", "()Lcrypto_perpetuals/position/v1/EstimatedClosingFeesDto;", "getEstimated_closing_fees$annotations", "Lcrypto_perpetuals/position/v1/LiquidationRiskDto;", "getLiquidation_risk", "()Lcrypto_perpetuals/position/v1/LiquidationRiskDto;", "getLiquidation_risk$annotations", "getQuote_currency", "getQuote_currency$annotations", "getPnl_unsettled", "getPnl_unsettled$annotations", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getImplied_leverage", "getImplied_leverage$annotations", "Companion", "$serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyDto collateral_currency;
        private final IdlDecimal collateral_reserved;
        private final String contract_id;
        private final Instant created_at;
        private final IdlDecimal entry_price;
        private final EstimatedClosingFeesDto estimated_closing_fees;
        private final IdlDecimal estimated_liquidation_price;
        private final FXQuoteDto fx_quote;
        private final String id;
        private final IdlDecimal implied_leverage;
        private final IdlDecimal initial_margin;
        private final IdlDecimal initial_margin_ratio;
        private final IdlDecimal leverage;
        private final LiquidationRiskDto liquidation_risk;
        private final IdlDecimal maintenance_margin;
        private final IdlDecimal maintenance_margin_ratio;
        private final MarginModeDto margin_mode;
        private final IdlDecimal mark_price;
        private final MoneyDto pnl;
        private final IdlDecimal pnl_percentage;
        private final MoneyDto pnl_realized;
        private final MoneyDto pnl_settled;
        private final MoneyDto pnl_unrealized;
        private final MoneyDto pnl_unsettled;
        private final IdlDecimal position_size;
        private final IdlDecimal quantity;
        private final CurrencyDto quote_currency;
        private final SideDto side;
        private final IdlDecimal total_allocated_margin;

        public Surrogate() {
            this((String) null, (String) null, (SideDto) null, (MarginModeDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (CurrencyDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (EstimatedClosingFeesDto) null, (LiquidationRiskDto) null, (CurrencyDto) null, (MoneyDto) null, (FXQuoteDto) null, (Instant) null, (IdlDecimal) null, 536870911, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.side == surrogate.side && this.margin_mode == surrogate.margin_mode && Intrinsics.areEqual(this.leverage, surrogate.leverage) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.entry_price, surrogate.entry_price) && Intrinsics.areEqual(this.pnl_settled, surrogate.pnl_settled) && Intrinsics.areEqual(this.initial_margin, surrogate.initial_margin) && Intrinsics.areEqual(this.initial_margin_ratio, surrogate.initial_margin_ratio) && Intrinsics.areEqual(this.maintenance_margin, surrogate.maintenance_margin) && Intrinsics.areEqual(this.maintenance_margin_ratio, surrogate.maintenance_margin_ratio) && Intrinsics.areEqual(this.estimated_liquidation_price, surrogate.estimated_liquidation_price) && Intrinsics.areEqual(this.pnl_realized, surrogate.pnl_realized) && Intrinsics.areEqual(this.pnl_unrealized, surrogate.pnl_unrealized) && Intrinsics.areEqual(this.pnl_percentage, surrogate.pnl_percentage) && Intrinsics.areEqual(this.collateral_reserved, surrogate.collateral_reserved) && Intrinsics.areEqual(this.collateral_currency, surrogate.collateral_currency) && Intrinsics.areEqual(this.total_allocated_margin, surrogate.total_allocated_margin) && Intrinsics.areEqual(this.position_size, surrogate.position_size) && Intrinsics.areEqual(this.mark_price, surrogate.mark_price) && Intrinsics.areEqual(this.pnl, surrogate.pnl) && Intrinsics.areEqual(this.estimated_closing_fees, surrogate.estimated_closing_fees) && this.liquidation_risk == surrogate.liquidation_risk && Intrinsics.areEqual(this.quote_currency, surrogate.quote_currency) && Intrinsics.areEqual(this.pnl_unsettled, surrogate.pnl_unsettled) && Intrinsics.areEqual(this.fx_quote, surrogate.fx_quote) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.implied_leverage, surrogate.implied_leverage);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.contract_id.hashCode()) * 31) + this.side.hashCode()) * 31) + this.margin_mode.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.entry_price.hashCode()) * 31;
            MoneyDto moneyDto = this.pnl_settled;
            int iHashCode2 = (((((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.initial_margin.hashCode()) * 31) + this.initial_margin_ratio.hashCode()) * 31) + this.maintenance_margin.hashCode()) * 31) + this.maintenance_margin_ratio.hashCode()) * 31;
            IdlDecimal idlDecimal = this.estimated_liquidation_price;
            int iHashCode3 = (iHashCode2 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            MoneyDto moneyDto2 = this.pnl_realized;
            int iHashCode4 = (iHashCode3 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.pnl_unrealized;
            int iHashCode5 = (((iHashCode4 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31) + this.pnl_percentage.hashCode()) * 31;
            IdlDecimal idlDecimal2 = this.collateral_reserved;
            int iHashCode6 = (iHashCode5 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            CurrencyDto currencyDto = this.collateral_currency;
            int iHashCode7 = (((((((iHashCode6 + (currencyDto == null ? 0 : currencyDto.hashCode())) * 31) + this.total_allocated_margin.hashCode()) * 31) + this.position_size.hashCode()) * 31) + this.mark_price.hashCode()) * 31;
            MoneyDto moneyDto4 = this.pnl;
            int iHashCode8 = (iHashCode7 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            EstimatedClosingFeesDto estimatedClosingFeesDto = this.estimated_closing_fees;
            int iHashCode9 = (((iHashCode8 + (estimatedClosingFeesDto == null ? 0 : estimatedClosingFeesDto.hashCode())) * 31) + this.liquidation_risk.hashCode()) * 31;
            CurrencyDto currencyDto2 = this.quote_currency;
            int iHashCode10 = (iHashCode9 + (currencyDto2 == null ? 0 : currencyDto2.hashCode())) * 31;
            MoneyDto moneyDto5 = this.pnl_unsettled;
            int iHashCode11 = (iHashCode10 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            FXQuoteDto fXQuoteDto = this.fx_quote;
            int iHashCode12 = (iHashCode11 + (fXQuoteDto == null ? 0 : fXQuoteDto.hashCode())) * 31;
            Instant instant = this.created_at;
            return ((iHashCode12 + (instant != null ? instant.hashCode() : 0)) * 31) + this.implied_leverage.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", contract_id=" + this.contract_id + ", side=" + this.side + ", margin_mode=" + this.margin_mode + ", leverage=" + this.leverage + ", quantity=" + this.quantity + ", entry_price=" + this.entry_price + ", pnl_settled=" + this.pnl_settled + ", initial_margin=" + this.initial_margin + ", initial_margin_ratio=" + this.initial_margin_ratio + ", maintenance_margin=" + this.maintenance_margin + ", maintenance_margin_ratio=" + this.maintenance_margin_ratio + ", estimated_liquidation_price=" + this.estimated_liquidation_price + ", pnl_realized=" + this.pnl_realized + ", pnl_unrealized=" + this.pnl_unrealized + ", pnl_percentage=" + this.pnl_percentage + ", collateral_reserved=" + this.collateral_reserved + ", collateral_currency=" + this.collateral_currency + ", total_allocated_margin=" + this.total_allocated_margin + ", position_size=" + this.position_size + ", mark_price=" + this.mark_price + ", pnl=" + this.pnl + ", estimated_closing_fees=" + this.estimated_closing_fees + ", liquidation_risk=" + this.liquidation_risk + ", quote_currency=" + this.quote_currency + ", pnl_unsettled=" + this.pnl_unsettled + ", fx_quote=" + this.fx_quote + ", created_at=" + this.created_at + ", implied_leverage=" + this.implied_leverage + ")";
        }

        /* compiled from: OpenPositionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OpenPositionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, SideDto sideDto, MarginModeDto marginModeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, MoneyDto moneyDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, CurrencyDto currencyDto, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, MoneyDto moneyDto4, EstimatedClosingFeesDto estimatedClosingFeesDto, LiquidationRiskDto liquidationRiskDto, CurrencyDto currencyDto2, MoneyDto moneyDto5, FXQuoteDto fXQuoteDto, Instant instant, IdlDecimal idlDecimal14, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 8) == 0) {
                this.margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_mode = marginModeDto;
            }
            if ((i & 16) == 0) {
                this.leverage = new IdlDecimal("");
            } else {
                this.leverage = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.entry_price = new IdlDecimal("");
            } else {
                this.entry_price = idlDecimal3;
            }
            if ((i & 128) == 0) {
                this.pnl_settled = null;
            } else {
                this.pnl_settled = moneyDto;
            }
            if ((i & 256) == 0) {
                this.initial_margin = new IdlDecimal("");
            } else {
                this.initial_margin = idlDecimal4;
            }
            if ((i & 512) == 0) {
                this.initial_margin_ratio = new IdlDecimal("");
            } else {
                this.initial_margin_ratio = idlDecimal5;
            }
            if ((i & 1024) == 0) {
                this.maintenance_margin = new IdlDecimal("");
            } else {
                this.maintenance_margin = idlDecimal6;
            }
            if ((i & 2048) == 0) {
                this.maintenance_margin_ratio = new IdlDecimal("");
            } else {
                this.maintenance_margin_ratio = idlDecimal7;
            }
            if ((i & 4096) == 0) {
                this.estimated_liquidation_price = null;
            } else {
                this.estimated_liquidation_price = idlDecimal8;
            }
            if ((i & 8192) == 0) {
                this.pnl_realized = null;
            } else {
                this.pnl_realized = moneyDto2;
            }
            if ((i & 16384) == 0) {
                this.pnl_unrealized = null;
            } else {
                this.pnl_unrealized = moneyDto3;
            }
            this.pnl_percentage = (32768 & i) == 0 ? new IdlDecimal("") : idlDecimal9;
            if ((65536 & i) == 0) {
                this.collateral_reserved = null;
            } else {
                this.collateral_reserved = idlDecimal10;
            }
            if ((131072 & i) == 0) {
                this.collateral_currency = null;
            } else {
                this.collateral_currency = currencyDto;
            }
            this.total_allocated_margin = (262144 & i) == 0 ? new IdlDecimal("") : idlDecimal11;
            this.position_size = (524288 & i) == 0 ? new IdlDecimal("") : idlDecimal12;
            this.mark_price = (1048576 & i) == 0 ? new IdlDecimal("") : idlDecimal13;
            if ((2097152 & i) == 0) {
                this.pnl = null;
            } else {
                this.pnl = moneyDto4;
            }
            if ((4194304 & i) == 0) {
                this.estimated_closing_fees = null;
            } else {
                this.estimated_closing_fees = estimatedClosingFeesDto;
            }
            this.liquidation_risk = (8388608 & i) == 0 ? LiquidationRiskDto.INSTANCE.getZeroValue() : liquidationRiskDto;
            if ((16777216 & i) == 0) {
                this.quote_currency = null;
            } else {
                this.quote_currency = currencyDto2;
            }
            if ((33554432 & i) == 0) {
                this.pnl_unsettled = null;
            } else {
                this.pnl_unsettled = moneyDto5;
            }
            if ((67108864 & i) == 0) {
                this.fx_quote = null;
            } else {
                this.fx_quote = fXQuoteDto;
            }
            if ((134217728 & i) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            this.implied_leverage = (i & 268435456) == 0 ? new IdlDecimal("") : idlDecimal14;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_position_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.contract_id);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SideDto.Serializer.INSTANCE, self.side);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            if (!Intrinsics.areEqual(self.leverage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.leverage);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.entry_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.entry_price);
            }
            MoneyDto moneyDto = self.pnl_settled;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.initial_margin, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.initial_margin);
            }
            if (!Intrinsics.areEqual(self.initial_margin_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.initial_margin_ratio);
            }
            if (!Intrinsics.areEqual(self.maintenance_margin, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.maintenance_margin);
            }
            if (!Intrinsics.areEqual(self.maintenance_margin_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, self.maintenance_margin_ratio);
            }
            IdlDecimal idlDecimal = self.estimated_liquidation_price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            MoneyDto moneyDto2 = self.pnl_realized;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.pnl_unrealized;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (!Intrinsics.areEqual(self.pnl_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.pnl_percentage);
            }
            IdlDecimal idlDecimal2 = self.collateral_reserved;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            CurrencyDto currencyDto = self.collateral_currency;
            if (currencyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, CurrencyDto.Serializer.INSTANCE, currencyDto);
            }
            if (!Intrinsics.areEqual(self.total_allocated_margin, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 18, IdlDecimalSerializer.INSTANCE, self.total_allocated_margin);
            }
            if (!Intrinsics.areEqual(self.position_size, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 19, IdlDecimalSerializer.INSTANCE, self.position_size);
            }
            if (!Intrinsics.areEqual(self.mark_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 20, IdlDecimalSerializer.INSTANCE, self.mark_price);
            }
            MoneyDto moneyDto4 = self.pnl;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            EstimatedClosingFeesDto estimatedClosingFeesDto = self.estimated_closing_fees;
            if (estimatedClosingFeesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, EstimatedClosingFeesDto.Serializer.INSTANCE, estimatedClosingFeesDto);
            }
            if (self.liquidation_risk != LiquidationRiskDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 23, LiquidationRiskDto.Serializer.INSTANCE, self.liquidation_risk);
            }
            CurrencyDto currencyDto2 = self.quote_currency;
            if (currencyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, CurrencyDto.Serializer.INSTANCE, currencyDto2);
            }
            MoneyDto moneyDto5 = self.pnl_unsettled;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            FXQuoteDto fXQuoteDto = self.fx_quote;
            if (fXQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, FXQuoteDto.Serializer.INSTANCE, fXQuoteDto);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, WireInstantSerializer.INSTANCE, instant);
            }
            if (Intrinsics.areEqual(self.implied_leverage, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 28, IdlDecimalSerializer.INSTANCE, self.implied_leverage);
        }

        public Surrogate(String id, String contract_id, SideDto side, MarginModeDto margin_mode, IdlDecimal leverage, IdlDecimal quantity, IdlDecimal entry_price, MoneyDto moneyDto, IdlDecimal initial_margin, IdlDecimal initial_margin_ratio, IdlDecimal maintenance_margin, IdlDecimal maintenance_margin_ratio, IdlDecimal idlDecimal, MoneyDto moneyDto2, MoneyDto moneyDto3, IdlDecimal pnl_percentage, IdlDecimal idlDecimal2, CurrencyDto currencyDto, IdlDecimal total_allocated_margin, IdlDecimal position_size, IdlDecimal mark_price, MoneyDto moneyDto4, EstimatedClosingFeesDto estimatedClosingFeesDto, LiquidationRiskDto liquidation_risk, CurrencyDto currencyDto2, MoneyDto moneyDto5, FXQuoteDto fXQuoteDto, Instant instant, IdlDecimal implied_leverage) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(entry_price, "entry_price");
            Intrinsics.checkNotNullParameter(initial_margin, "initial_margin");
            Intrinsics.checkNotNullParameter(initial_margin_ratio, "initial_margin_ratio");
            Intrinsics.checkNotNullParameter(maintenance_margin, "maintenance_margin");
            Intrinsics.checkNotNullParameter(maintenance_margin_ratio, "maintenance_margin_ratio");
            Intrinsics.checkNotNullParameter(pnl_percentage, "pnl_percentage");
            Intrinsics.checkNotNullParameter(total_allocated_margin, "total_allocated_margin");
            Intrinsics.checkNotNullParameter(position_size, "position_size");
            Intrinsics.checkNotNullParameter(mark_price, "mark_price");
            Intrinsics.checkNotNullParameter(liquidation_risk, "liquidation_risk");
            Intrinsics.checkNotNullParameter(implied_leverage, "implied_leverage");
            this.id = id;
            this.contract_id = contract_id;
            this.side = side;
            this.margin_mode = margin_mode;
            this.leverage = leverage;
            this.quantity = quantity;
            this.entry_price = entry_price;
            this.pnl_settled = moneyDto;
            this.initial_margin = initial_margin;
            this.initial_margin_ratio = initial_margin_ratio;
            this.maintenance_margin = maintenance_margin;
            this.maintenance_margin_ratio = maintenance_margin_ratio;
            this.estimated_liquidation_price = idlDecimal;
            this.pnl_realized = moneyDto2;
            this.pnl_unrealized = moneyDto3;
            this.pnl_percentage = pnl_percentage;
            this.collateral_reserved = idlDecimal2;
            this.collateral_currency = currencyDto;
            this.total_allocated_margin = total_allocated_margin;
            this.position_size = position_size;
            this.mark_price = mark_price;
            this.pnl = moneyDto4;
            this.estimated_closing_fees = estimatedClosingFeesDto;
            this.liquidation_risk = liquidation_risk;
            this.quote_currency = currencyDto2;
            this.pnl_unsettled = moneyDto5;
            this.fx_quote = fXQuoteDto;
            this.created_at = instant;
            this.implied_leverage = implied_leverage;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r27, java.lang.String r28, crypto_perpetuals.common.p435v1.SideDto r29, crypto_perpetuals.common.p435v1.MarginModeDto r30, com.robinhood.idl.IdlDecimal r31, com.robinhood.idl.IdlDecimal r32, com.robinhood.idl.IdlDecimal r33, crypto_perpetuals.common.p435v1.MoneyDto r34, com.robinhood.idl.IdlDecimal r35, com.robinhood.idl.IdlDecimal r36, com.robinhood.idl.IdlDecimal r37, com.robinhood.idl.IdlDecimal r38, com.robinhood.idl.IdlDecimal r39, crypto_perpetuals.common.p435v1.MoneyDto r40, crypto_perpetuals.common.p435v1.MoneyDto r41, com.robinhood.idl.IdlDecimal r42, com.robinhood.idl.IdlDecimal r43, crypto_perpetuals.currency.p437v1.CurrencyDto r44, com.robinhood.idl.IdlDecimal r45, com.robinhood.idl.IdlDecimal r46, com.robinhood.idl.IdlDecimal r47, crypto_perpetuals.common.p435v1.MoneyDto r48, crypto_perpetuals.position.p439v1.EstimatedClosingFeesDto r49, crypto_perpetuals.position.p439v1.LiquidationRiskDto r50, crypto_perpetuals.currency.p437v1.CurrencyDto r51, crypto_perpetuals.common.p435v1.MoneyDto r52, crypto_perpetuals.common.p435v1.FXQuoteDto r53, p479j$.time.Instant r54, com.robinhood.idl.IdlDecimal r55, int r56, kotlin.jvm.internal.DefaultConstructorMarker r57) {
            /*
                Method dump skipped, instructions count: 468
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.position.p439v1.OpenPositionDto.Surrogate.<init>(java.lang.String, java.lang.String, crypto_perpetuals.common.v1.SideDto, crypto_perpetuals.common.v1.MarginModeDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, crypto_perpetuals.common.v1.MoneyDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.currency.v1.CurrencyDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, crypto_perpetuals.position.v1.EstimatedClosingFeesDto, crypto_perpetuals.position.v1.LiquidationRiskDto, crypto_perpetuals.currency.v1.CurrencyDto, crypto_perpetuals.common.v1.MoneyDto, crypto_perpetuals.common.v1.FXQuoteDto, j$.time.Instant, com.robinhood.idl.IdlDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getId() {
            return this.id;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final IdlDecimal getLeverage() {
            return this.leverage;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getEntry_price() {
            return this.entry_price;
        }

        public final MoneyDto getPnl_settled() {
            return this.pnl_settled;
        }

        public final IdlDecimal getInitial_margin() {
            return this.initial_margin;
        }

        public final IdlDecimal getInitial_margin_ratio() {
            return this.initial_margin_ratio;
        }

        public final IdlDecimal getMaintenance_margin() {
            return this.maintenance_margin;
        }

        public final IdlDecimal getMaintenance_margin_ratio() {
            return this.maintenance_margin_ratio;
        }

        public final IdlDecimal getEstimated_liquidation_price() {
            return this.estimated_liquidation_price;
        }

        public final MoneyDto getPnl_realized() {
            return this.pnl_realized;
        }

        public final MoneyDto getPnl_unrealized() {
            return this.pnl_unrealized;
        }

        public final IdlDecimal getPnl_percentage() {
            return this.pnl_percentage;
        }

        public final IdlDecimal getCollateral_reserved() {
            return this.collateral_reserved;
        }

        public final CurrencyDto getCollateral_currency() {
            return this.collateral_currency;
        }

        public final IdlDecimal getTotal_allocated_margin() {
            return this.total_allocated_margin;
        }

        public final IdlDecimal getPosition_size() {
            return this.position_size;
        }

        public final IdlDecimal getMark_price() {
            return this.mark_price;
        }

        public final MoneyDto getPnl() {
            return this.pnl;
        }

        public final EstimatedClosingFeesDto getEstimated_closing_fees() {
            return this.estimated_closing_fees;
        }

        public final LiquidationRiskDto getLiquidation_risk() {
            return this.liquidation_risk;
        }

        public final CurrencyDto getQuote_currency() {
            return this.quote_currency;
        }

        public final MoneyDto getPnl_unsettled() {
            return this.pnl_unsettled;
        }

        public final FXQuoteDto getFx_quote() {
            return this.fx_quote;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final IdlDecimal getImplied_leverage() {
            return this.implied_leverage;
        }
    }

    /* compiled from: OpenPositionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPositionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/position/v1/OpenPositionDto;", "Lcrypto_perpetuals/position/v1/OpenPosition;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/position/v1/OpenPositionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OpenPositionDto, OpenPosition> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OpenPositionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OpenPositionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OpenPositionDto> getBinaryBase64Serializer() {
            return (KSerializer) OpenPositionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OpenPosition> getProtoAdapter() {
            return OpenPosition.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OpenPositionDto getZeroValue() {
            return OpenPositionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OpenPositionDto fromProto(OpenPosition proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String contract_id = proto.getContract_id();
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getLeverage());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getQuantity());
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getEntry_price());
            Money pnl_settled = proto.getPnl_settled();
            MoneyDto moneyDtoFromProto = pnl_settled != null ? MoneyDto.INSTANCE.fromProto(pnl_settled) : null;
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getInitial_margin());
            IdlDecimal idlDecimal5 = new IdlDecimal(proto.getInitial_margin_ratio());
            IdlDecimal idlDecimal6 = new IdlDecimal(proto.getMaintenance_margin());
            IdlDecimal idlDecimal7 = new IdlDecimal(proto.getMaintenance_margin_ratio());
            String estimated_liquidation_price = proto.getEstimated_liquidation_price();
            IdlDecimal idlDecimal8 = estimated_liquidation_price != null ? new IdlDecimal(estimated_liquidation_price) : null;
            Money pnl_realized = proto.getPnl_realized();
            MoneyDto moneyDtoFromProto2 = pnl_realized != null ? MoneyDto.INSTANCE.fromProto(pnl_realized) : null;
            Money pnl_unrealized = proto.getPnl_unrealized();
            MoneyDto moneyDto = moneyDtoFromProto;
            MoneyDto moneyDtoFromProto3 = pnl_unrealized != null ? MoneyDto.INSTANCE.fromProto(pnl_unrealized) : null;
            IdlDecimal idlDecimal9 = new IdlDecimal(proto.getPnl_percentage());
            String collateral_reserved = proto.getCollateral_reserved();
            IdlDecimal idlDecimal10 = collateral_reserved != null ? new IdlDecimal(collateral_reserved) : null;
            Currency collateral_currency = proto.getCollateral_currency();
            IdlDecimal idlDecimal11 = idlDecimal10;
            CurrencyDto currencyDtoFromProto = collateral_currency != null ? CurrencyDto.INSTANCE.fromProto(collateral_currency) : null;
            IdlDecimal idlDecimal12 = new IdlDecimal(proto.getTotal_allocated_margin());
            IdlDecimal idlDecimal13 = new IdlDecimal(proto.getPosition_size());
            IdlDecimal idlDecimal14 = new IdlDecimal(proto.getMark_price());
            Money pnl = proto.getPnl();
            MoneyDto moneyDtoFromProto4 = pnl != null ? MoneyDto.INSTANCE.fromProto(pnl) : null;
            EstimatedClosingFees estimated_closing_fees = proto.getEstimated_closing_fees();
            MoneyDto moneyDto2 = moneyDtoFromProto4;
            EstimatedClosingFeesDto estimatedClosingFeesDtoFromProto = estimated_closing_fees != null ? EstimatedClosingFeesDto.INSTANCE.fromProto(estimated_closing_fees) : null;
            LiquidationRiskDto liquidationRiskDtoFromProto = LiquidationRiskDto.INSTANCE.fromProto(proto.getLiquidation_risk());
            Currency quote_currency = proto.getQuote_currency();
            CurrencyDto currencyDtoFromProto2 = quote_currency != null ? CurrencyDto.INSTANCE.fromProto(quote_currency) : null;
            Money pnl_unsettled = proto.getPnl_unsettled();
            CurrencyDto currencyDto = currencyDtoFromProto2;
            MoneyDto moneyDtoFromProto5 = pnl_unsettled != null ? MoneyDto.INSTANCE.fromProto(pnl_unsettled) : null;
            FXQuote fx_quote = proto.getFx_quote();
            return new OpenPositionDto(new Surrogate(id, contract_id, sideDtoFromProto, marginModeDtoFromProto, idlDecimal, idlDecimal2, idlDecimal3, moneyDto, idlDecimal4, idlDecimal5, idlDecimal6, idlDecimal7, idlDecimal8, moneyDtoFromProto2, moneyDtoFromProto3, idlDecimal9, idlDecimal11, currencyDtoFromProto, idlDecimal12, idlDecimal13, idlDecimal14, moneyDto2, estimatedClosingFeesDtoFromProto, liquidationRiskDtoFromProto, currencyDto, moneyDtoFromProto5, fx_quote != null ? FXQuoteDto.INSTANCE.fromProto(fx_quote) : null, proto.getCreated_at(), new IdlDecimal(proto.getImplied_leverage())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.position.v1.OpenPositionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenPositionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OpenPositionDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OpenPositionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPositionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/OpenPositionDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/position/v1/OpenPositionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OpenPositionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.position.v1.OpenPosition", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OpenPositionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OpenPositionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OpenPositionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OpenPositionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/OpenPositionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "crypto_perpetuals.position.v1.OpenPositionDto";
        }
    }
}
