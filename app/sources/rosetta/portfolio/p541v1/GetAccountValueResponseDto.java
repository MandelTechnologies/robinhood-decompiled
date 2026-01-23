package rosetta.portfolio.p541v1;

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
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetAccountValueResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EDFGB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0089\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020-H\u0016¢\u0006\u0004\b6\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010'R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b=\u0010:R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b?\u0010:R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bA\u0010:R\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bC\u0010:¨\u0006H"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/portfolio/v1/GetAccountValueResponse;", "Landroid/os/Parcelable;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;)V", "", "url", "account", "start_date", "Lcom/robinhood/idl/IdlDecimal;", "market_value", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "extended_hours_market_value", "extended_hours_equity", "extended_hours_portfolio_equity", "last_core_market_value", "last_core_equity", "last_core_portfolio_equity", "excess_margin", "excess_maintenance", "excess_margin_with_uncleared_deposits", "excess_maintenance_with_uncleared_deposits", "equity_previous_close", "portfolio_equity_previous_close", "adjusted_equity_previous_close", "adjusted_portfolio_equity_previous_close", "withdrawable_amount", "unwithdrawable_deposits", "unwithdrawable_grants", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "last_core_market_value_absolute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lrosetta/portfolio/v1/GetAccountValueResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;", "getAccount", "getMarket_value", "()Lcom/robinhood/idl/IdlDecimal;", "getEquity", "getExtended_hours_market_value", "getExtended_hours_equity", "getExcess_margin", "getExcess_maintenance_with_uncleared_deposits", "getAdjusted_equity_previous_close", "getWithdrawable_amount", "getUnwithdrawable_deposits", "getUnwithdrawable_grants", "Companion", "Surrogate", "Serializer", "MultibindingModule", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class GetAccountValueResponseDto implements Dto3<GetAccountValueResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountValueResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountValueResponseDto, GetAccountValueResponse>> binaryBase64Serializer$delegate;
    private static final GetAccountValueResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountValueResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountValueResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount() {
        return this.surrogate.getAccount();
    }

    public final IdlDecimal getMarket_value() {
        return this.surrogate.getMarket_value();
    }

    public final IdlDecimal getEquity() {
        return this.surrogate.getEquity();
    }

    public final IdlDecimal getExtended_hours_market_value() {
        return this.surrogate.getExtended_hours_market_value();
    }

    public final IdlDecimal getExtended_hours_equity() {
        return this.surrogate.getExtended_hours_equity();
    }

    public final IdlDecimal getExcess_margin() {
        return this.surrogate.getExcess_margin();
    }

    public final IdlDecimal getExcess_maintenance_with_uncleared_deposits() {
        return this.surrogate.getExcess_maintenance_with_uncleared_deposits();
    }

    public final IdlDecimal getAdjusted_equity_previous_close() {
        return this.surrogate.getAdjusted_equity_previous_close();
    }

    public final IdlDecimal getWithdrawable_amount() {
        return this.surrogate.getWithdrawable_amount();
    }

    public final IdlDecimal getUnwithdrawable_deposits() {
        return this.surrogate.getUnwithdrawable_deposits();
    }

    public final IdlDecimal getUnwithdrawable_grants() {
        return this.surrogate.getUnwithdrawable_grants();
    }

    public /* synthetic */ GetAccountValueResponseDto(String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, IdlDecimal idlDecimal16, IdlDecimal idlDecimal17, IdlDecimal idlDecimal18, IdlDecimal idlDecimal19, CurrencyDto currencyDto, IdlDecimal idlDecimal20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        IdlDecimal idlDecimal21;
        IdlDecimal idlDecimal22;
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? null : str3;
        IdlDecimal idlDecimal23 = (i & 8) != 0 ? new IdlDecimal("") : idlDecimal;
        IdlDecimal idlDecimal24 = (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2;
        IdlDecimal idlDecimal25 = (i & 32) != 0 ? null : idlDecimal3;
        IdlDecimal idlDecimal26 = (i & 64) != 0 ? null : idlDecimal4;
        IdlDecimal idlDecimal27 = (i & 128) != 0 ? null : idlDecimal5;
        IdlDecimal idlDecimal28 = (i & 256) != 0 ? new IdlDecimal("") : idlDecimal6;
        IdlDecimal idlDecimal29 = (i & 512) != 0 ? new IdlDecimal("") : idlDecimal7;
        IdlDecimal idlDecimal30 = (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal8;
        IdlDecimal idlDecimal31 = (i & 2048) != 0 ? null : idlDecimal9;
        IdlDecimal idlDecimal32 = (i & 4096) != 0 ? null : idlDecimal10;
        IdlDecimal idlDecimal33 = (i & 8192) != 0 ? null : idlDecimal11;
        String str7 = str4;
        IdlDecimal idlDecimal34 = (i & 16384) != 0 ? null : idlDecimal12;
        IdlDecimal idlDecimal35 = (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal13;
        IdlDecimal idlDecimal36 = (i & 65536) != 0 ? new IdlDecimal("") : idlDecimal14;
        IdlDecimal idlDecimal37 = (i & 131072) != 0 ? new IdlDecimal("") : idlDecimal15;
        IdlDecimal idlDecimal38 = (i & 262144) != 0 ? new IdlDecimal("") : idlDecimal16;
        IdlDecimal idlDecimal39 = (i & 524288) != 0 ? new IdlDecimal("") : idlDecimal17;
        IdlDecimal idlDecimal40 = (i & 1048576) != 0 ? new IdlDecimal("") : idlDecimal18;
        IdlDecimal idlDecimal41 = (i & 2097152) != 0 ? new IdlDecimal("") : idlDecimal19;
        CurrencyDto zeroValue2 = (i & 4194304) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto;
        if ((i & 8388608) != 0) {
            idlDecimal22 = idlDecimal41;
            idlDecimal21 = new IdlDecimal("");
        } else {
            idlDecimal21 = idlDecimal20;
            idlDecimal22 = idlDecimal41;
        }
        this(str7, str5, str6, idlDecimal23, idlDecimal24, idlDecimal25, idlDecimal26, idlDecimal27, idlDecimal28, idlDecimal29, idlDecimal30, idlDecimal31, idlDecimal32, idlDecimal33, idlDecimal34, idlDecimal35, idlDecimal36, idlDecimal37, idlDecimal38, idlDecimal39, idlDecimal40, idlDecimal22, zeroValue2, idlDecimal21);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAccountValueResponseDto(String url, String account, String str, IdlDecimal market_value, IdlDecimal equity, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal last_core_market_value, IdlDecimal last_core_equity, IdlDecimal last_core_portfolio_equity, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal equity_previous_close, IdlDecimal portfolio_equity_previous_close, IdlDecimal adjusted_equity_previous_close, IdlDecimal adjusted_portfolio_equity_previous_close, IdlDecimal withdrawable_amount, IdlDecimal unwithdrawable_deposits, IdlDecimal unwithdrawable_grants, CurrencyDto display_currency, IdlDecimal last_core_market_value_absolute) {
        this(new Surrogate(url, account, str, market_value, equity, idlDecimal, idlDecimal2, idlDecimal3, last_core_market_value, last_core_equity, last_core_portfolio_equity, idlDecimal4, idlDecimal5, idlDecimal6, idlDecimal7, equity_previous_close, portfolio_equity_previous_close, adjusted_equity_previous_close, adjusted_portfolio_equity_previous_close, withdrawable_amount, unwithdrawable_deposits, unwithdrawable_grants, display_currency, last_core_market_value_absolute));
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(market_value, "market_value");
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(last_core_market_value, "last_core_market_value");
        Intrinsics.checkNotNullParameter(last_core_equity, "last_core_equity");
        Intrinsics.checkNotNullParameter(last_core_portfolio_equity, "last_core_portfolio_equity");
        Intrinsics.checkNotNullParameter(equity_previous_close, "equity_previous_close");
        Intrinsics.checkNotNullParameter(portfolio_equity_previous_close, "portfolio_equity_previous_close");
        Intrinsics.checkNotNullParameter(adjusted_equity_previous_close, "adjusted_equity_previous_close");
        Intrinsics.checkNotNullParameter(adjusted_portfolio_equity_previous_close, "adjusted_portfolio_equity_previous_close");
        Intrinsics.checkNotNullParameter(withdrawable_amount, "withdrawable_amount");
        Intrinsics.checkNotNullParameter(unwithdrawable_deposits, "unwithdrawable_deposits");
        Intrinsics.checkNotNullParameter(unwithdrawable_grants, "unwithdrawable_grants");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(last_core_market_value_absolute, "last_core_market_value_absolute");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAccountValueResponse toProto() {
        String url = this.surrogate.getUrl();
        String account = this.surrogate.getAccount();
        String start_date = this.surrogate.getStart_date();
        String stringValue = this.surrogate.getMarket_value().getStringValue();
        String stringValue2 = this.surrogate.getEquity().getStringValue();
        IdlDecimal extended_hours_market_value = this.surrogate.getExtended_hours_market_value();
        String stringValue3 = extended_hours_market_value != null ? extended_hours_market_value.getStringValue() : null;
        IdlDecimal extended_hours_equity = this.surrogate.getExtended_hours_equity();
        String stringValue4 = extended_hours_equity != null ? extended_hours_equity.getStringValue() : null;
        IdlDecimal extended_hours_portfolio_equity = this.surrogate.getExtended_hours_portfolio_equity();
        String stringValue5 = extended_hours_portfolio_equity != null ? extended_hours_portfolio_equity.getStringValue() : null;
        String stringValue6 = this.surrogate.getLast_core_market_value().getStringValue();
        String stringValue7 = this.surrogate.getLast_core_equity().getStringValue();
        String stringValue8 = this.surrogate.getLast_core_portfolio_equity().getStringValue();
        IdlDecimal excess_margin = this.surrogate.getExcess_margin();
        String stringValue9 = excess_margin != null ? excess_margin.getStringValue() : null;
        IdlDecimal excess_maintenance = this.surrogate.getExcess_maintenance();
        String stringValue10 = excess_maintenance != null ? excess_maintenance.getStringValue() : null;
        IdlDecimal excess_margin_with_uncleared_deposits = this.surrogate.getExcess_margin_with_uncleared_deposits();
        String stringValue11 = excess_margin_with_uncleared_deposits != null ? excess_margin_with_uncleared_deposits.getStringValue() : null;
        IdlDecimal excess_maintenance_with_uncleared_deposits = this.surrogate.getExcess_maintenance_with_uncleared_deposits();
        return new GetAccountValueResponse(url, account, start_date, stringValue, stringValue2, stringValue3, stringValue4, stringValue5, stringValue6, stringValue7, stringValue8, stringValue9, stringValue10, stringValue11, excess_maintenance_with_uncleared_deposits != null ? excess_maintenance_with_uncleared_deposits.getStringValue() : null, this.surrogate.getEquity_previous_close().getStringValue(), this.surrogate.getPortfolio_equity_previous_close().getStringValue(), this.surrogate.getAdjusted_equity_previous_close().getStringValue(), this.surrogate.getAdjusted_portfolio_equity_previous_close().getStringValue(), this.surrogate.getWithdrawable_amount().getStringValue(), this.surrogate.getUnwithdrawable_deposits().getStringValue(), this.surrogate.getUnwithdrawable_grants().getStringValue(), (Currency) this.surrogate.getDisplay_currency().toProto(), this.surrogate.getLast_core_market_value_absolute().getStringValue(), null, 16777216, null);
    }

    public String toString() {
        return "[GetAccountValueResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountValueResponseDto) && Intrinsics.areEqual(((GetAccountValueResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountValueResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b;\b\u0083\b\u0018\u0000 n2\u00020\u0001:\u0002onB³\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\u0017\b\u0002\u0010\u001f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b \u0010!B\u008b\u0002\b\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010&J'\u0010/\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00101R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u00101R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b?\u0010;\u001a\u0004\b>\u00101R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bC\u0010;\u001a\u0004\bA\u0010BR/\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010BR1\u0010\f\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010BR1\u0010\r\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bI\u0010;\u001a\u0004\bH\u0010BR1\u0010\u000e\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010BR/\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010BR/\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010BR/\u0010\u0011\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bQ\u0010;\u001a\u0004\bP\u0010BR1\u0010\u0012\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010@\u0012\u0004\bS\u0010;\u001a\u0004\bR\u0010BR1\u0010\u0013\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010@\u0012\u0004\bU\u0010;\u001a\u0004\bT\u0010BR1\u0010\u0014\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010@\u0012\u0004\bW\u0010;\u001a\u0004\bV\u0010BR1\u0010\u0015\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010@\u0012\u0004\bY\u0010;\u001a\u0004\bX\u0010BR/\u0010\u0016\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010@\u0012\u0004\b[\u0010;\u001a\u0004\bZ\u0010BR/\u0010\u0017\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010@\u0012\u0004\b]\u0010;\u001a\u0004\b\\\u0010BR/\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010@\u0012\u0004\b_\u0010;\u001a\u0004\b^\u0010BR/\u0010\u0019\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010@\u0012\u0004\ba\u0010;\u001a\u0004\b`\u0010BR/\u0010\u001a\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010@\u0012\u0004\bc\u0010;\u001a\u0004\bb\u0010BR/\u0010\u001b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010@\u0012\u0004\be\u0010;\u001a\u0004\bd\u0010BR/\u0010\u001c\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010@\u0012\u0004\bg\u0010;\u001a\u0004\bf\u0010BR \u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010h\u0012\u0004\bk\u0010;\u001a\u0004\bi\u0010jR/\u0010\u001f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010@\u0012\u0004\bm\u0010;\u001a\u0004\bl\u0010B¨\u0006p"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;", "", "", "url", "account", "start_date", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "market_value", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "extended_hours_market_value", "extended_hours_equity", "extended_hours_portfolio_equity", "last_core_market_value", "last_core_equity", "last_core_portfolio_equity", "excess_margin", "excess_maintenance", "excess_margin_with_uncleared_deposits", "excess_maintenance_with_uncleared_deposits", "equity_previous_close", "portfolio_equity_previous_close", "adjusted_equity_previous_close", "adjusted_portfolio_equity_previous_close", "withdrawable_amount", "unwithdrawable_deposits", "unwithdrawable_grants", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "last_core_market_value_absolute", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$portfolio_v1_externalRelease", "(Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "getAccount", "getAccount$annotations", "getStart_date", "getStart_date$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMarket_value", "()Lcom/robinhood/idl/IdlDecimal;", "getMarket_value$annotations", "getEquity", "getEquity$annotations", "getExtended_hours_market_value", "getExtended_hours_market_value$annotations", "getExtended_hours_equity", "getExtended_hours_equity$annotations", "getExtended_hours_portfolio_equity", "getExtended_hours_portfolio_equity$annotations", "getLast_core_market_value", "getLast_core_market_value$annotations", "getLast_core_equity", "getLast_core_equity$annotations", "getLast_core_portfolio_equity", "getLast_core_portfolio_equity$annotations", "getExcess_margin", "getExcess_margin$annotations", "getExcess_maintenance", "getExcess_maintenance$annotations", "getExcess_margin_with_uncleared_deposits", "getExcess_margin_with_uncleared_deposits$annotations", "getExcess_maintenance_with_uncleared_deposits", "getExcess_maintenance_with_uncleared_deposits$annotations", "getEquity_previous_close", "getEquity_previous_close$annotations", "getPortfolio_equity_previous_close", "getPortfolio_equity_previous_close$annotations", "getAdjusted_equity_previous_close", "getAdjusted_equity_previous_close$annotations", "getAdjusted_portfolio_equity_previous_close", "getAdjusted_portfolio_equity_previous_close$annotations", "getWithdrawable_amount", "getWithdrawable_amount$annotations", "getUnwithdrawable_deposits", "getUnwithdrawable_deposits$annotations", "getUnwithdrawable_grants", "getUnwithdrawable_grants$annotations", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getDisplay_currency$annotations", "getLast_core_market_value_absolute", "getLast_core_market_value_absolute$annotations", "Companion", "$serializer", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account;
        private final IdlDecimal adjusted_equity_previous_close;
        private final IdlDecimal adjusted_portfolio_equity_previous_close;
        private final CurrencyDto display_currency;
        private final IdlDecimal equity;
        private final IdlDecimal equity_previous_close;
        private final IdlDecimal excess_maintenance;
        private final IdlDecimal excess_maintenance_with_uncleared_deposits;
        private final IdlDecimal excess_margin;
        private final IdlDecimal excess_margin_with_uncleared_deposits;
        private final IdlDecimal extended_hours_equity;
        private final IdlDecimal extended_hours_market_value;
        private final IdlDecimal extended_hours_portfolio_equity;
        private final IdlDecimal last_core_equity;
        private final IdlDecimal last_core_market_value;
        private final IdlDecimal last_core_market_value_absolute;
        private final IdlDecimal last_core_portfolio_equity;
        private final IdlDecimal market_value;
        private final IdlDecimal portfolio_equity_previous_close;
        private final String start_date;
        private final IdlDecimal unwithdrawable_deposits;
        private final IdlDecimal unwithdrawable_grants;
        private final String url;
        private final IdlDecimal withdrawable_amount;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (CurrencyDto) null, (IdlDecimal) null, 16777215, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.account, surrogate.account) && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.market_value, surrogate.market_value) && Intrinsics.areEqual(this.equity, surrogate.equity) && Intrinsics.areEqual(this.extended_hours_market_value, surrogate.extended_hours_market_value) && Intrinsics.areEqual(this.extended_hours_equity, surrogate.extended_hours_equity) && Intrinsics.areEqual(this.extended_hours_portfolio_equity, surrogate.extended_hours_portfolio_equity) && Intrinsics.areEqual(this.last_core_market_value, surrogate.last_core_market_value) && Intrinsics.areEqual(this.last_core_equity, surrogate.last_core_equity) && Intrinsics.areEqual(this.last_core_portfolio_equity, surrogate.last_core_portfolio_equity) && Intrinsics.areEqual(this.excess_margin, surrogate.excess_margin) && Intrinsics.areEqual(this.excess_maintenance, surrogate.excess_maintenance) && Intrinsics.areEqual(this.excess_margin_with_uncleared_deposits, surrogate.excess_margin_with_uncleared_deposits) && Intrinsics.areEqual(this.excess_maintenance_with_uncleared_deposits, surrogate.excess_maintenance_with_uncleared_deposits) && Intrinsics.areEqual(this.equity_previous_close, surrogate.equity_previous_close) && Intrinsics.areEqual(this.portfolio_equity_previous_close, surrogate.portfolio_equity_previous_close) && Intrinsics.areEqual(this.adjusted_equity_previous_close, surrogate.adjusted_equity_previous_close) && Intrinsics.areEqual(this.adjusted_portfolio_equity_previous_close, surrogate.adjusted_portfolio_equity_previous_close) && Intrinsics.areEqual(this.withdrawable_amount, surrogate.withdrawable_amount) && Intrinsics.areEqual(this.unwithdrawable_deposits, surrogate.unwithdrawable_deposits) && Intrinsics.areEqual(this.unwithdrawable_grants, surrogate.unwithdrawable_grants) && this.display_currency == surrogate.display_currency && Intrinsics.areEqual(this.last_core_market_value_absolute, surrogate.last_core_market_value_absolute);
        }

        public int hashCode() {
            int iHashCode = ((this.url.hashCode() * 31) + this.account.hashCode()) * 31;
            String str = this.start_date;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.market_value.hashCode()) * 31) + this.equity.hashCode()) * 31;
            IdlDecimal idlDecimal = this.extended_hours_market_value;
            int iHashCode3 = (iHashCode2 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.extended_hours_equity;
            int iHashCode4 = (iHashCode3 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.extended_hours_portfolio_equity;
            int iHashCode5 = (((((((iHashCode4 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31) + this.last_core_market_value.hashCode()) * 31) + this.last_core_equity.hashCode()) * 31) + this.last_core_portfolio_equity.hashCode()) * 31;
            IdlDecimal idlDecimal4 = this.excess_margin;
            int iHashCode6 = (iHashCode5 + (idlDecimal4 == null ? 0 : idlDecimal4.hashCode())) * 31;
            IdlDecimal idlDecimal5 = this.excess_maintenance;
            int iHashCode7 = (iHashCode6 + (idlDecimal5 == null ? 0 : idlDecimal5.hashCode())) * 31;
            IdlDecimal idlDecimal6 = this.excess_margin_with_uncleared_deposits;
            int iHashCode8 = (iHashCode7 + (idlDecimal6 == null ? 0 : idlDecimal6.hashCode())) * 31;
            IdlDecimal idlDecimal7 = this.excess_maintenance_with_uncleared_deposits;
            return ((((((((((((((((((iHashCode8 + (idlDecimal7 != null ? idlDecimal7.hashCode() : 0)) * 31) + this.equity_previous_close.hashCode()) * 31) + this.portfolio_equity_previous_close.hashCode()) * 31) + this.adjusted_equity_previous_close.hashCode()) * 31) + this.adjusted_portfolio_equity_previous_close.hashCode()) * 31) + this.withdrawable_amount.hashCode()) * 31) + this.unwithdrawable_deposits.hashCode()) * 31) + this.unwithdrawable_grants.hashCode()) * 31) + this.display_currency.hashCode()) * 31) + this.last_core_market_value_absolute.hashCode();
        }

        public String toString() {
            return "Surrogate(url=" + this.url + ", account=" + this.account + ", start_date=" + this.start_date + ", market_value=" + this.market_value + ", equity=" + this.equity + ", extended_hours_market_value=" + this.extended_hours_market_value + ", extended_hours_equity=" + this.extended_hours_equity + ", extended_hours_portfolio_equity=" + this.extended_hours_portfolio_equity + ", last_core_market_value=" + this.last_core_market_value + ", last_core_equity=" + this.last_core_equity + ", last_core_portfolio_equity=" + this.last_core_portfolio_equity + ", excess_margin=" + this.excess_margin + ", excess_maintenance=" + this.excess_maintenance + ", excess_margin_with_uncleared_deposits=" + this.excess_margin_with_uncleared_deposits + ", excess_maintenance_with_uncleared_deposits=" + this.excess_maintenance_with_uncleared_deposits + ", equity_previous_close=" + this.equity_previous_close + ", portfolio_equity_previous_close=" + this.portfolio_equity_previous_close + ", adjusted_equity_previous_close=" + this.adjusted_equity_previous_close + ", adjusted_portfolio_equity_previous_close=" + this.adjusted_portfolio_equity_previous_close + ", withdrawable_amount=" + this.withdrawable_amount + ", unwithdrawable_deposits=" + this.unwithdrawable_deposits + ", unwithdrawable_grants=" + this.unwithdrawable_grants + ", display_currency=" + this.display_currency + ", last_core_market_value_absolute=" + this.last_core_market_value_absolute + ")";
        }

        /* compiled from: GetAccountValueResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountValueResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, IdlDecimal idlDecimal16, IdlDecimal idlDecimal17, IdlDecimal idlDecimal18, IdlDecimal idlDecimal19, CurrencyDto currencyDto, IdlDecimal idlDecimal20, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.url = "";
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.account = "";
            } else {
                this.account = str2;
            }
            if ((i & 4) == 0) {
                this.start_date = null;
            } else {
                this.start_date = str3;
            }
            if ((i & 8) == 0) {
                this.market_value = new IdlDecimal("");
            } else {
                this.market_value = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.equity = new IdlDecimal("");
            } else {
                this.equity = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.extended_hours_market_value = null;
            } else {
                this.extended_hours_market_value = idlDecimal3;
            }
            if ((i & 64) == 0) {
                this.extended_hours_equity = null;
            } else {
                this.extended_hours_equity = idlDecimal4;
            }
            if ((i & 128) == 0) {
                this.extended_hours_portfolio_equity = null;
            } else {
                this.extended_hours_portfolio_equity = idlDecimal5;
            }
            if ((i & 256) == 0) {
                this.last_core_market_value = new IdlDecimal("");
            } else {
                this.last_core_market_value = idlDecimal6;
            }
            if ((i & 512) == 0) {
                this.last_core_equity = new IdlDecimal("");
            } else {
                this.last_core_equity = idlDecimal7;
            }
            if ((i & 1024) == 0) {
                this.last_core_portfolio_equity = new IdlDecimal("");
            } else {
                this.last_core_portfolio_equity = idlDecimal8;
            }
            if ((i & 2048) == 0) {
                this.excess_margin = null;
            } else {
                this.excess_margin = idlDecimal9;
            }
            if ((i & 4096) == 0) {
                this.excess_maintenance = null;
            } else {
                this.excess_maintenance = idlDecimal10;
            }
            if ((i & 8192) == 0) {
                this.excess_margin_with_uncleared_deposits = null;
            } else {
                this.excess_margin_with_uncleared_deposits = idlDecimal11;
            }
            if ((i & 16384) == 0) {
                this.excess_maintenance_with_uncleared_deposits = null;
            } else {
                this.excess_maintenance_with_uncleared_deposits = idlDecimal12;
            }
            this.equity_previous_close = (32768 & i) == 0 ? new IdlDecimal("") : idlDecimal13;
            this.portfolio_equity_previous_close = (65536 & i) == 0 ? new IdlDecimal("") : idlDecimal14;
            this.adjusted_equity_previous_close = (131072 & i) == 0 ? new IdlDecimal("") : idlDecimal15;
            this.adjusted_portfolio_equity_previous_close = (262144 & i) == 0 ? new IdlDecimal("") : idlDecimal16;
            this.withdrawable_amount = (524288 & i) == 0 ? new IdlDecimal("") : idlDecimal17;
            this.unwithdrawable_deposits = (1048576 & i) == 0 ? new IdlDecimal("") : idlDecimal18;
            this.unwithdrawable_grants = (2097152 & i) == 0 ? new IdlDecimal("") : idlDecimal19;
            this.display_currency = (4194304 & i) == 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto;
            this.last_core_market_value_absolute = (i & 8388608) == 0 ? new IdlDecimal("") : idlDecimal20;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 0, self.url);
            }
            if (!Intrinsics.areEqual(self.account, "")) {
                output.encodeStringElement(serialDesc, 1, self.account);
            }
            String str = self.start_date;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.market_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.market_value);
            }
            if (!Intrinsics.areEqual(self.equity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.equity);
            }
            IdlDecimal idlDecimal = self.extended_hours_market_value;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.extended_hours_equity;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.extended_hours_portfolio_equity;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            if (!Intrinsics.areEqual(self.last_core_market_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.last_core_market_value);
            }
            if (!Intrinsics.areEqual(self.last_core_equity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.last_core_equity);
            }
            if (!Intrinsics.areEqual(self.last_core_portfolio_equity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.last_core_portfolio_equity);
            }
            IdlDecimal idlDecimal4 = self.excess_margin;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
            IdlDecimal idlDecimal5 = self.excess_maintenance;
            if (idlDecimal5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, idlDecimal5);
            }
            IdlDecimal idlDecimal6 = self.excess_margin_with_uncleared_deposits;
            if (idlDecimal6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, idlDecimal6);
            }
            IdlDecimal idlDecimal7 = self.excess_maintenance_with_uncleared_deposits;
            if (idlDecimal7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, IdlDecimalSerializer.INSTANCE, idlDecimal7);
            }
            if (!Intrinsics.areEqual(self.equity_previous_close, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.equity_previous_close);
            }
            if (!Intrinsics.areEqual(self.portfolio_equity_previous_close, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 16, IdlDecimalSerializer.INSTANCE, self.portfolio_equity_previous_close);
            }
            if (!Intrinsics.areEqual(self.adjusted_equity_previous_close, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 17, IdlDecimalSerializer.INSTANCE, self.adjusted_equity_previous_close);
            }
            if (!Intrinsics.areEqual(self.adjusted_portfolio_equity_previous_close, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 18, IdlDecimalSerializer.INSTANCE, self.adjusted_portfolio_equity_previous_close);
            }
            if (!Intrinsics.areEqual(self.withdrawable_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 19, IdlDecimalSerializer.INSTANCE, self.withdrawable_amount);
            }
            if (!Intrinsics.areEqual(self.unwithdrawable_deposits, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 20, IdlDecimalSerializer.INSTANCE, self.unwithdrawable_deposits);
            }
            if (!Intrinsics.areEqual(self.unwithdrawable_grants, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 21, IdlDecimalSerializer.INSTANCE, self.unwithdrawable_grants);
            }
            if (self.display_currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 22, CurrencyDto.Serializer.INSTANCE, self.display_currency);
            }
            if (Intrinsics.areEqual(self.last_core_market_value_absolute, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 23, IdlDecimalSerializer.INSTANCE, self.last_core_market_value_absolute);
        }

        public Surrogate(String url, String account, String str, IdlDecimal market_value, IdlDecimal equity, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal last_core_market_value, IdlDecimal last_core_equity, IdlDecimal last_core_portfolio_equity, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal equity_previous_close, IdlDecimal portfolio_equity_previous_close, IdlDecimal adjusted_equity_previous_close, IdlDecimal adjusted_portfolio_equity_previous_close, IdlDecimal withdrawable_amount, IdlDecimal unwithdrawable_deposits, IdlDecimal unwithdrawable_grants, CurrencyDto display_currency, IdlDecimal last_core_market_value_absolute) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(market_value, "market_value");
            Intrinsics.checkNotNullParameter(equity, "equity");
            Intrinsics.checkNotNullParameter(last_core_market_value, "last_core_market_value");
            Intrinsics.checkNotNullParameter(last_core_equity, "last_core_equity");
            Intrinsics.checkNotNullParameter(last_core_portfolio_equity, "last_core_portfolio_equity");
            Intrinsics.checkNotNullParameter(equity_previous_close, "equity_previous_close");
            Intrinsics.checkNotNullParameter(portfolio_equity_previous_close, "portfolio_equity_previous_close");
            Intrinsics.checkNotNullParameter(adjusted_equity_previous_close, "adjusted_equity_previous_close");
            Intrinsics.checkNotNullParameter(adjusted_portfolio_equity_previous_close, "adjusted_portfolio_equity_previous_close");
            Intrinsics.checkNotNullParameter(withdrawable_amount, "withdrawable_amount");
            Intrinsics.checkNotNullParameter(unwithdrawable_deposits, "unwithdrawable_deposits");
            Intrinsics.checkNotNullParameter(unwithdrawable_grants, "unwithdrawable_grants");
            Intrinsics.checkNotNullParameter(display_currency, "display_currency");
            Intrinsics.checkNotNullParameter(last_core_market_value_absolute, "last_core_market_value_absolute");
            this.url = url;
            this.account = account;
            this.start_date = str;
            this.market_value = market_value;
            this.equity = equity;
            this.extended_hours_market_value = idlDecimal;
            this.extended_hours_equity = idlDecimal2;
            this.extended_hours_portfolio_equity = idlDecimal3;
            this.last_core_market_value = last_core_market_value;
            this.last_core_equity = last_core_equity;
            this.last_core_portfolio_equity = last_core_portfolio_equity;
            this.excess_margin = idlDecimal4;
            this.excess_maintenance = idlDecimal5;
            this.excess_margin_with_uncleared_deposits = idlDecimal6;
            this.excess_maintenance_with_uncleared_deposits = idlDecimal7;
            this.equity_previous_close = equity_previous_close;
            this.portfolio_equity_previous_close = portfolio_equity_previous_close;
            this.adjusted_equity_previous_close = adjusted_equity_previous_close;
            this.adjusted_portfolio_equity_previous_close = adjusted_portfolio_equity_previous_close;
            this.withdrawable_amount = withdrawable_amount;
            this.unwithdrawable_deposits = unwithdrawable_deposits;
            this.unwithdrawable_grants = unwithdrawable_grants;
            this.display_currency = display_currency;
            this.last_core_market_value_absolute = last_core_market_value_absolute;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, IdlDecimal idlDecimal16, IdlDecimal idlDecimal17, IdlDecimal idlDecimal18, IdlDecimal idlDecimal19, CurrencyDto currencyDto, IdlDecimal idlDecimal20, int i, DefaultConstructorMarker defaultConstructorMarker) {
            IdlDecimal idlDecimal21;
            IdlDecimal idlDecimal22;
            String str4 = (i & 1) != 0 ? "" : str;
            String str5 = (i & 2) != 0 ? "" : str2;
            String str6 = (i & 4) != 0 ? null : str3;
            IdlDecimal idlDecimal23 = (i & 8) != 0 ? new IdlDecimal("") : idlDecimal;
            IdlDecimal idlDecimal24 = (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2;
            IdlDecimal idlDecimal25 = (i & 32) != 0 ? null : idlDecimal3;
            IdlDecimal idlDecimal26 = (i & 64) != 0 ? null : idlDecimal4;
            IdlDecimal idlDecimal27 = (i & 128) != 0 ? null : idlDecimal5;
            IdlDecimal idlDecimal28 = (i & 256) != 0 ? new IdlDecimal("") : idlDecimal6;
            IdlDecimal idlDecimal29 = (i & 512) != 0 ? new IdlDecimal("") : idlDecimal7;
            IdlDecimal idlDecimal30 = (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal8;
            IdlDecimal idlDecimal31 = (i & 2048) != 0 ? null : idlDecimal9;
            IdlDecimal idlDecimal32 = (i & 4096) != 0 ? null : idlDecimal10;
            IdlDecimal idlDecimal33 = (i & 8192) != 0 ? null : idlDecimal11;
            String str7 = str4;
            IdlDecimal idlDecimal34 = (i & 16384) != 0 ? null : idlDecimal12;
            IdlDecimal idlDecimal35 = (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal13;
            IdlDecimal idlDecimal36 = (i & 65536) != 0 ? new IdlDecimal("") : idlDecimal14;
            IdlDecimal idlDecimal37 = (i & 131072) != 0 ? new IdlDecimal("") : idlDecimal15;
            IdlDecimal idlDecimal38 = (i & 262144) != 0 ? new IdlDecimal("") : idlDecimal16;
            IdlDecimal idlDecimal39 = (i & 524288) != 0 ? new IdlDecimal("") : idlDecimal17;
            IdlDecimal idlDecimal40 = (i & 1048576) != 0 ? new IdlDecimal("") : idlDecimal18;
            IdlDecimal idlDecimal41 = (i & 2097152) != 0 ? new IdlDecimal("") : idlDecimal19;
            CurrencyDto zeroValue = (i & 4194304) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto;
            if ((i & 8388608) != 0) {
                idlDecimal22 = idlDecimal41;
                idlDecimal21 = new IdlDecimal("");
            } else {
                idlDecimal21 = idlDecimal20;
                idlDecimal22 = idlDecimal41;
            }
            this(str7, str5, str6, idlDecimal23, idlDecimal24, idlDecimal25, idlDecimal26, idlDecimal27, idlDecimal28, idlDecimal29, idlDecimal30, idlDecimal31, idlDecimal32, idlDecimal33, idlDecimal34, idlDecimal35, idlDecimal36, idlDecimal37, idlDecimal38, idlDecimal39, idlDecimal40, idlDecimal22, zeroValue, idlDecimal21);
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getStart_date() {
            return this.start_date;
        }

        public final IdlDecimal getMarket_value() {
            return this.market_value;
        }

        public final IdlDecimal getEquity() {
            return this.equity;
        }

        public final IdlDecimal getExtended_hours_market_value() {
            return this.extended_hours_market_value;
        }

        public final IdlDecimal getExtended_hours_equity() {
            return this.extended_hours_equity;
        }

        public final IdlDecimal getExtended_hours_portfolio_equity() {
            return this.extended_hours_portfolio_equity;
        }

        public final IdlDecimal getLast_core_market_value() {
            return this.last_core_market_value;
        }

        public final IdlDecimal getLast_core_equity() {
            return this.last_core_equity;
        }

        public final IdlDecimal getLast_core_portfolio_equity() {
            return this.last_core_portfolio_equity;
        }

        public final IdlDecimal getExcess_margin() {
            return this.excess_margin;
        }

        public final IdlDecimal getExcess_maintenance() {
            return this.excess_maintenance;
        }

        public final IdlDecimal getExcess_margin_with_uncleared_deposits() {
            return this.excess_margin_with_uncleared_deposits;
        }

        public final IdlDecimal getExcess_maintenance_with_uncleared_deposits() {
            return this.excess_maintenance_with_uncleared_deposits;
        }

        public final IdlDecimal getEquity_previous_close() {
            return this.equity_previous_close;
        }

        public final IdlDecimal getPortfolio_equity_previous_close() {
            return this.portfolio_equity_previous_close;
        }

        public final IdlDecimal getAdjusted_equity_previous_close() {
            return this.adjusted_equity_previous_close;
        }

        public final IdlDecimal getAdjusted_portfolio_equity_previous_close() {
            return this.adjusted_portfolio_equity_previous_close;
        }

        public final IdlDecimal getWithdrawable_amount() {
            return this.withdrawable_amount;
        }

        public final IdlDecimal getUnwithdrawable_deposits() {
            return this.unwithdrawable_deposits;
        }

        public final IdlDecimal getUnwithdrawable_grants() {
            return this.unwithdrawable_grants;
        }

        public final CurrencyDto getDisplay_currency() {
            return this.display_currency;
        }

        public final IdlDecimal getLast_core_market_value_absolute() {
            return this.last_core_market_value_absolute;
        }
    }

    /* compiled from: GetAccountValueResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "Lrosetta/portfolio/v1/GetAccountValueResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountValueResponseDto, GetAccountValueResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountValueResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountValueResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountValueResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountValueResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountValueResponse> getProtoAdapter() {
            return GetAccountValueResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountValueResponseDto getZeroValue() {
            return GetAccountValueResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountValueResponseDto fromProto(GetAccountValueResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String url = proto.getUrl();
            String account = proto.getAccount();
            String start_date = proto.getStart_date();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getMarket_value());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getEquity());
            String extended_hours_market_value = proto.getExtended_hours_market_value();
            IdlDecimal idlDecimal3 = extended_hours_market_value != null ? new IdlDecimal(extended_hours_market_value) : null;
            String extended_hours_equity = proto.getExtended_hours_equity();
            IdlDecimal idlDecimal4 = extended_hours_equity != null ? new IdlDecimal(extended_hours_equity) : null;
            String extended_hours_portfolio_equity = proto.getExtended_hours_portfolio_equity();
            IdlDecimal idlDecimal5 = extended_hours_portfolio_equity != null ? new IdlDecimal(extended_hours_portfolio_equity) : null;
            IdlDecimal idlDecimal6 = new IdlDecimal(proto.getLast_core_market_value());
            IdlDecimal idlDecimal7 = new IdlDecimal(proto.getLast_core_equity());
            IdlDecimal idlDecimal8 = new IdlDecimal(proto.getLast_core_portfolio_equity());
            String excess_margin = proto.getExcess_margin();
            IdlDecimal idlDecimal9 = excess_margin != null ? new IdlDecimal(excess_margin) : null;
            String excess_maintenance = proto.getExcess_maintenance();
            IdlDecimal idlDecimal10 = excess_maintenance != null ? new IdlDecimal(excess_maintenance) : null;
            String excess_margin_with_uncleared_deposits = proto.getExcess_margin_with_uncleared_deposits();
            IdlDecimal idlDecimal11 = excess_margin_with_uncleared_deposits != null ? new IdlDecimal(excess_margin_with_uncleared_deposits) : null;
            String excess_maintenance_with_uncleared_deposits = proto.getExcess_maintenance_with_uncleared_deposits();
            return new GetAccountValueResponseDto(new Surrogate(url, account, start_date, idlDecimal, idlDecimal2, idlDecimal3, idlDecimal4, idlDecimal5, idlDecimal6, idlDecimal7, idlDecimal8, idlDecimal9, idlDecimal10, idlDecimal11, excess_maintenance_with_uncleared_deposits != null ? new IdlDecimal(excess_maintenance_with_uncleared_deposits) : null, new IdlDecimal(proto.getEquity_previous_close()), new IdlDecimal(proto.getPortfolio_equity_previous_close()), new IdlDecimal(proto.getAdjusted_equity_previous_close()), new IdlDecimal(proto.getAdjusted_portfolio_equity_previous_close()), new IdlDecimal(proto.getWithdrawable_amount()), new IdlDecimal(proto.getUnwithdrawable_deposits()), new IdlDecimal(proto.getUnwithdrawable_grants()), CurrencyDto.INSTANCE.fromProto(proto.getDisplay_currency()), new IdlDecimal(proto.getLast_core_market_value_absolute())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.portfolio.v1.GetAccountValueResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountValueResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAccountValueResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountValueResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/portfolio/v1/GetAccountValueResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountValueResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.portfolio.v1.GetAccountValueResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountValueResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountValueResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountValueResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAccountValueResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "rosetta.portfolio.v1.GetAccountValueResponseDto";
        }
    }
}
