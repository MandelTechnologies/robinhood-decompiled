package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesActivityTransCodeDto;
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
import com.robinhood.rosetta.i18n.Affiliate;
import com.robinhood.rosetta.i18n.AffiliateDto;
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

/* compiled from: FuturesActivityDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@ABCB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B«\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u001cJ¨\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\tJ\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u00020\tH\u0016J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000209H\u0016J\b\u0010?\u001a\u000209H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u0006D"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesActivity;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesActivityDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesActivityDto$Surrogate;)V", "activity_date", "", "affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "contract_id", "trans_code", "Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "quantity", "Lcom/robinhood/idl/IdlDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/common/MoneyDto;", "commission", "exchange_fee", "nfa_fee", "amount", "running_balance", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "symbol", "symbol_description", "(Ljava/lang/String;Lcom/robinhood/rosetta/i18n/AffiliateDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "getActivity_date", "()Ljava/lang/String;", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getContract_id", "getTrans_code", "()Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCommission", "getExchange_fee", "getNfa_fee", "getAmount", "getRunning_balance", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getSymbol", "getSymbol_description", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesActivityDto implements Dto3<FuturesActivity>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesActivityDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesActivityDto, FuturesActivity>> binaryBase64Serializer$delegate;
    private static final FuturesActivityDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesActivityDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesActivityDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getActivity_date() {
        return this.surrogate.getActivity_date();
    }

    public final AffiliateDto getAffiliate() {
        return this.surrogate.getAffiliate();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final FuturesActivityTransCodeDto getTrans_code() {
        return this.surrogate.getTrans_code();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final MoneyDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final MoneyDto getCommission() {
        return this.surrogate.getCommission();
    }

    public final MoneyDto getExchange_fee() {
        return this.surrogate.getExchange_fee();
    }

    public final MoneyDto getNfa_fee() {
        return this.surrogate.getNfa_fee();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final MoneyDto getRunning_balance() {
        return this.surrogate.getRunning_balance();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getSymbol_description() {
        return this.surrogate.getSymbol_description();
    }

    public /* synthetic */ FuturesActivityDto(String str, AffiliateDto affiliateDto, String str2, FuturesActivityTransCodeDto futuresActivityTransCodeDto, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, FuturesContractTypeDto futuresContractTypeDto, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? FuturesActivityTransCodeDto.INSTANCE.getZeroValue() : futuresActivityTransCodeDto, (i & 16) != 0 ? null : idlDecimal, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? null : moneyDto4, (i & 512) != 0 ? null : moneyDto5, (i & 1024) != 0 ? null : moneyDto6, (i & 2048) != 0 ? null : futuresContractTypeDto, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesActivityDto(String activity_date, AffiliateDto affiliate, String str, FuturesActivityTransCodeDto trans_code, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, FuturesContractTypeDto futuresContractTypeDto, String str2, String str3) {
        this(new Surrogate(activity_date, affiliate, str, trans_code, idlDecimal, moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto5, moneyDto6, futuresContractTypeDto, str2, str3));
        Intrinsics.checkNotNullParameter(activity_date, "activity_date");
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(trans_code, "trans_code");
    }

    public final FuturesActivityDto copy(String activity_date, AffiliateDto affiliate, String contract_id, FuturesActivityTransCodeDto trans_code, IdlDecimal quantity, MoneyDto price, MoneyDto commission, MoneyDto exchange_fee, MoneyDto nfa_fee, MoneyDto amount, MoneyDto running_balance, FuturesContractTypeDto contract_type, String symbol, String symbol_description) {
        Intrinsics.checkNotNullParameter(activity_date, "activity_date");
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(trans_code, "trans_code");
        return new FuturesActivityDto(new Surrogate(activity_date, affiliate, contract_id, trans_code, quantity, price, commission, exchange_fee, nfa_fee, amount, running_balance, contract_type, symbol, symbol_description));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesActivity toProto() {
        String activity_date = this.surrogate.getActivity_date();
        Affiliate affiliate = (Affiliate) this.surrogate.getAffiliate().toProto();
        String contract_id = this.surrogate.getContract_id();
        FuturesActivityTransCode futuresActivityTransCode = (FuturesActivityTransCode) this.surrogate.getTrans_code().toProto();
        IdlDecimal quantity = this.surrogate.getQuantity();
        String stringValue = quantity != null ? quantity.getStringValue() : null;
        MoneyDto price = this.surrogate.getPrice();
        Money proto = price != null ? price.toProto() : null;
        MoneyDto commission = this.surrogate.getCommission();
        Money proto2 = commission != null ? commission.toProto() : null;
        MoneyDto exchange_fee = this.surrogate.getExchange_fee();
        Money proto3 = exchange_fee != null ? exchange_fee.toProto() : null;
        MoneyDto nfa_fee = this.surrogate.getNfa_fee();
        Money proto4 = nfa_fee != null ? nfa_fee.toProto() : null;
        MoneyDto amount = this.surrogate.getAmount();
        Money proto5 = amount != null ? amount.toProto() : null;
        MoneyDto running_balance = this.surrogate.getRunning_balance();
        Money proto6 = running_balance != null ? running_balance.toProto() : null;
        FuturesContractTypeDto contract_type = this.surrogate.getContract_type();
        return new FuturesActivity(activity_date, affiliate, contract_id, futuresActivityTransCode, stringValue, proto, proto2, proto3, proto4, proto5, proto6, contract_type != null ? (FuturesContractType) contract_type.toProto() : null, this.surrogate.getSymbol(), this.surrogate.getSymbol_description(), null, 16384, null);
    }

    public String toString() {
        return "[FuturesActivityDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesActivityDto) && Intrinsics.areEqual(((FuturesActivityDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesActivityDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 `2\u00020\u0001:\u0002_`B¸\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aB§\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010\u001fJ\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u001a\u0010G\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u001cHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001J%\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0001¢\u0006\u0002\b^R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010!\u001a\u0004\b*\u0010+R-\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010!\u001a\u0004\b-\u0010.R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010!\u001a\u0004\b0\u00101R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010!\u001a\u0004\b3\u00101R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010!\u001a\u0004\b5\u00101R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010!\u001a\u0004\b7\u00101R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010!\u001a\u0004\b9\u00101R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010!\u001a\u0004\b;\u00101R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010!\u001a\u0004\b=\u0010>R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010!\u001a\u0004\b@\u0010#R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010!\u001a\u0004\bB\u0010#¨\u0006a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityDto$Surrogate;", "", "activity_date", "", "affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "contract_id", "trans_code", "Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/common/MoneyDto;", "commission", "exchange_fee", "nfa_fee", "amount", "running_balance", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "symbol", "symbol_description", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/i18n/AffiliateDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/i18n/AffiliateDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActivity_date$annotations", "()V", "getActivity_date", "()Ljava/lang/String;", "getAffiliate$annotations", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getContract_id$annotations", "getContract_id", "getTrans_code$annotations", "getTrans_code", "()Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "getQuantity$annotations", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice$annotations", "getPrice", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCommission$annotations", "getCommission", "getExchange_fee$annotations", "getExchange_fee", "getNfa_fee$annotations", "getNfa_fee", "getAmount$annotations", "getAmount", "getRunning_balance$annotations", "getRunning_balance", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getSymbol$annotations", "getSymbol", "getSymbol_description$annotations", "getSymbol_description", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String activity_date;
        private final AffiliateDto affiliate;
        private final MoneyDto amount;
        private final MoneyDto commission;
        private final String contract_id;
        private final FuturesContractTypeDto contract_type;
        private final MoneyDto exchange_fee;
        private final MoneyDto nfa_fee;
        private final MoneyDto price;
        private final IdlDecimal quantity;
        private final MoneyDto running_balance;
        private final String symbol;
        private final String symbol_description;
        private final FuturesActivityTransCodeDto trans_code;

        public Surrogate() {
            this((String) null, (AffiliateDto) null, (String) null, (FuturesActivityTransCodeDto) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (FuturesContractTypeDto) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("activityDate")
        @JsonAnnotations2(names = {"activity_date"})
        public static /* synthetic */ void getActivity_date$annotations() {
        }

        @SerialName("affiliate")
        @JsonAnnotations2(names = {"affiliate"})
        public static /* synthetic */ void getAffiliate$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("commission")
        @JsonAnnotations2(names = {"commission"})
        public static /* synthetic */ void getCommission$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("exchangeFee")
        @JsonAnnotations2(names = {"exchange_fee"})
        public static /* synthetic */ void getExchange_fee$annotations() {
        }

        @SerialName("nfaFee")
        @JsonAnnotations2(names = {"nfa_fee"})
        public static /* synthetic */ void getNfa_fee$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("runningBalance")
        @JsonAnnotations2(names = {"running_balance"})
        public static /* synthetic */ void getRunning_balance$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("symbolDescription")
        @JsonAnnotations2(names = {"symbol_description"})
        public static /* synthetic */ void getSymbol_description$annotations() {
        }

        @SerialName("transCode")
        @JsonAnnotations2(names = {"trans_code"})
        public static /* synthetic */ void getTrans_code$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getActivity_date() {
            return this.activity_date;
        }

        /* renamed from: component10, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component11, reason: from getter */
        public final MoneyDto getRunning_balance() {
            return this.running_balance;
        }

        /* renamed from: component12, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component14, reason: from getter */
        public final String getSymbol_description() {
            return this.symbol_description;
        }

        /* renamed from: component2, reason: from getter */
        public final AffiliateDto getAffiliate() {
            return this.affiliate;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component4, reason: from getter */
        public final FuturesActivityTransCodeDto getTrans_code() {
            return this.trans_code;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getPrice() {
            return this.price;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getCommission() {
            return this.commission;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getExchange_fee() {
            return this.exchange_fee;
        }

        /* renamed from: component9, reason: from getter */
        public final MoneyDto getNfa_fee() {
            return this.nfa_fee;
        }

        public final Surrogate copy(String activity_date, AffiliateDto affiliate, String contract_id, FuturesActivityTransCodeDto trans_code, IdlDecimal quantity, MoneyDto price, MoneyDto commission, MoneyDto exchange_fee, MoneyDto nfa_fee, MoneyDto amount, MoneyDto running_balance, FuturesContractTypeDto contract_type, String symbol, String symbol_description) {
            Intrinsics.checkNotNullParameter(activity_date, "activity_date");
            Intrinsics.checkNotNullParameter(affiliate, "affiliate");
            Intrinsics.checkNotNullParameter(trans_code, "trans_code");
            return new Surrogate(activity_date, affiliate, contract_id, trans_code, quantity, price, commission, exchange_fee, nfa_fee, amount, running_balance, contract_type, symbol, symbol_description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.activity_date, surrogate.activity_date) && this.affiliate == surrogate.affiliate && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.trans_code == surrogate.trans_code && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.commission, surrogate.commission) && Intrinsics.areEqual(this.exchange_fee, surrogate.exchange_fee) && Intrinsics.areEqual(this.nfa_fee, surrogate.nfa_fee) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.running_balance, surrogate.running_balance) && this.contract_type == surrogate.contract_type && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.symbol_description, surrogate.symbol_description);
        }

        public int hashCode() {
            int iHashCode = ((this.activity_date.hashCode() * 31) + this.affiliate.hashCode()) * 31;
            String str = this.contract_id;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.trans_code.hashCode()) * 31;
            IdlDecimal idlDecimal = this.quantity;
            int iHashCode3 = (iHashCode2 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            MoneyDto moneyDto = this.price;
            int iHashCode4 = (iHashCode3 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.commission;
            int iHashCode5 = (iHashCode4 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.exchange_fee;
            int iHashCode6 = (iHashCode5 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.nfa_fee;
            int iHashCode7 = (iHashCode6 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.amount;
            int iHashCode8 = (iHashCode7 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            MoneyDto moneyDto6 = this.running_balance;
            int iHashCode9 = (iHashCode8 + (moneyDto6 == null ? 0 : moneyDto6.hashCode())) * 31;
            FuturesContractTypeDto futuresContractTypeDto = this.contract_type;
            int iHashCode10 = (iHashCode9 + (futuresContractTypeDto == null ? 0 : futuresContractTypeDto.hashCode())) * 31;
            String str2 = this.symbol;
            int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol_description;
            return iHashCode11 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(activity_date=" + this.activity_date + ", affiliate=" + this.affiliate + ", contract_id=" + this.contract_id + ", trans_code=" + this.trans_code + ", quantity=" + this.quantity + ", price=" + this.price + ", commission=" + this.commission + ", exchange_fee=" + this.exchange_fee + ", nfa_fee=" + this.nfa_fee + ", amount=" + this.amount + ", running_balance=" + this.running_balance + ", contract_type=" + this.contract_type + ", symbol=" + this.symbol + ", symbol_description=" + this.symbol_description + ")";
        }

        /* compiled from: FuturesActivityDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesActivityDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesActivityDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, AffiliateDto affiliateDto, String str2, FuturesActivityTransCodeDto futuresActivityTransCodeDto, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, FuturesContractTypeDto futuresContractTypeDto, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.activity_date = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.affiliate = AffiliateDto.INSTANCE.getZeroValue();
            } else {
                this.affiliate = affiliateDto;
            }
            if ((i & 4) == 0) {
                this.contract_id = null;
            } else {
                this.contract_id = str2;
            }
            if ((i & 8) == 0) {
                this.trans_code = FuturesActivityTransCodeDto.INSTANCE.getZeroValue();
            } else {
                this.trans_code = futuresActivityTransCodeDto;
            }
            if ((i & 16) == 0) {
                this.quantity = null;
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.price = null;
            } else {
                this.price = moneyDto;
            }
            if ((i & 64) == 0) {
                this.commission = null;
            } else {
                this.commission = moneyDto2;
            }
            if ((i & 128) == 0) {
                this.exchange_fee = null;
            } else {
                this.exchange_fee = moneyDto3;
            }
            if ((i & 256) == 0) {
                this.nfa_fee = null;
            } else {
                this.nfa_fee = moneyDto4;
            }
            if ((i & 512) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto5;
            }
            if ((i & 1024) == 0) {
                this.running_balance = null;
            } else {
                this.running_balance = moneyDto6;
            }
            if ((i & 2048) == 0) {
                this.contract_type = null;
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            if ((i & 4096) == 0) {
                this.symbol = null;
            } else {
                this.symbol = str3;
            }
            if ((i & 8192) == 0) {
                this.symbol_description = null;
            } else {
                this.symbol_description = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.activity_date, "")) {
                output.encodeStringElement(serialDesc, 0, self.activity_date);
            }
            if (self.affiliate != AffiliateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AffiliateDto.Serializer.INSTANCE, self.affiliate);
            }
            String str = self.contract_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (self.trans_code != FuturesActivityTransCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, FuturesActivityTransCodeDto.Serializer.INSTANCE, self.trans_code);
            }
            IdlDecimal idlDecimal = self.quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            MoneyDto moneyDto = self.price;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.commission;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.exchange_fee;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.nfa_fee;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.amount;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            MoneyDto moneyDto6 = self.running_balance;
            if (moneyDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, MoneyDto.Serializer.INSTANCE, moneyDto6);
            }
            FuturesContractTypeDto futuresContractTypeDto = self.contract_type;
            if (futuresContractTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, FuturesContractTypeDto.Serializer.INSTANCE, futuresContractTypeDto);
            }
            String str2 = self.symbol;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.symbol_description;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(String activity_date, AffiliateDto affiliate, String str, FuturesActivityTransCodeDto trans_code, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, FuturesContractTypeDto futuresContractTypeDto, String str2, String str3) {
            Intrinsics.checkNotNullParameter(activity_date, "activity_date");
            Intrinsics.checkNotNullParameter(affiliate, "affiliate");
            Intrinsics.checkNotNullParameter(trans_code, "trans_code");
            this.activity_date = activity_date;
            this.affiliate = affiliate;
            this.contract_id = str;
            this.trans_code = trans_code;
            this.quantity = idlDecimal;
            this.price = moneyDto;
            this.commission = moneyDto2;
            this.exchange_fee = moneyDto3;
            this.nfa_fee = moneyDto4;
            this.amount = moneyDto5;
            this.running_balance = moneyDto6;
            this.contract_type = futuresContractTypeDto;
            this.symbol = str2;
            this.symbol_description = str3;
        }

        public final String getActivity_date() {
            return this.activity_date;
        }

        public /* synthetic */ Surrogate(String str, AffiliateDto affiliateDto, String str2, FuturesActivityTransCodeDto futuresActivityTransCodeDto, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, FuturesContractTypeDto futuresContractTypeDto, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? FuturesActivityTransCodeDto.INSTANCE.getZeroValue() : futuresActivityTransCodeDto, (i & 16) != 0 ? null : idlDecimal, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? null : moneyDto4, (i & 512) != 0 ? null : moneyDto5, (i & 1024) != 0 ? null : moneyDto6, (i & 2048) != 0 ? null : futuresContractTypeDto, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : str4);
        }

        public final AffiliateDto getAffiliate() {
            return this.affiliate;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final FuturesActivityTransCodeDto getTrans_code() {
            return this.trans_code;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final MoneyDto getPrice() {
            return this.price;
        }

        public final MoneyDto getCommission() {
            return this.commission;
        }

        public final MoneyDto getExchange_fee() {
            return this.exchange_fee;
        }

        public final MoneyDto getNfa_fee() {
            return this.nfa_fee;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final MoneyDto getRunning_balance() {
            return this.running_balance;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getSymbol_description() {
            return this.symbol_description;
        }
    }

    /* compiled from: FuturesActivityDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesActivityDto;", "Lcom/robinhood/ceres/v1/FuturesActivity;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesActivityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesActivityDto, FuturesActivity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesActivityDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesActivityDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesActivityDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesActivityDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesActivity> getProtoAdapter() {
            return FuturesActivity.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesActivityDto getZeroValue() {
            return FuturesActivityDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesActivityDto fromProto(FuturesActivity proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String activity_date = proto.getActivity_date();
            AffiliateDto affiliateDtoFromProto = AffiliateDto.INSTANCE.fromProto(proto.getAffiliate());
            String contract_id = proto.getContract_id();
            FuturesActivityTransCodeDto futuresActivityTransCodeDtoFromProto = FuturesActivityTransCodeDto.INSTANCE.fromProto(proto.getTrans_code());
            String quantity = proto.getQuantity();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = quantity != null ? new IdlDecimal(quantity) : null;
            Money price = proto.getPrice();
            MoneyDto moneyDtoFromProto = price != null ? MoneyDto.INSTANCE.fromProto(price) : null;
            Money commission = proto.getCommission();
            MoneyDto moneyDtoFromProto2 = commission != null ? MoneyDto.INSTANCE.fromProto(commission) : null;
            Money exchange_fee = proto.getExchange_fee();
            MoneyDto moneyDtoFromProto3 = exchange_fee != null ? MoneyDto.INSTANCE.fromProto(exchange_fee) : null;
            Money nfa_fee = proto.getNfa_fee();
            MoneyDto moneyDtoFromProto4 = nfa_fee != null ? MoneyDto.INSTANCE.fromProto(nfa_fee) : null;
            Money amount = proto.getAmount();
            MoneyDto moneyDtoFromProto5 = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Money running_balance = proto.getRunning_balance();
            MoneyDto moneyDtoFromProto6 = running_balance != null ? MoneyDto.INSTANCE.fromProto(running_balance) : null;
            FuturesContractType contract_type = proto.getContract_type();
            return new FuturesActivityDto(new Surrogate(activity_date, affiliateDtoFromProto, contract_id, futuresActivityTransCodeDtoFromProto, idlDecimal, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, moneyDtoFromProto4, moneyDtoFromProto5, moneyDtoFromProto6, contract_type != null ? FuturesContractTypeDto.INSTANCE.fromProto(contract_type) : null, proto.getSymbol(), proto.getSymbol_description()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesActivityDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesActivityDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesActivityDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesActivityDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesActivityDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesActivityDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesActivityDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesActivity", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesActivityDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesActivityDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesActivityDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesActivityDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesActivityDto";
        }
    }
}
