package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.eventlogging.CatpayFundingSource;
import com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto;
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

/* compiled from: CatpayFundingSourceDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Surrogate;)V", "currency_type", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "currency_code", "", "available_balance", "Lcom/robinhood/idl/IdlDecimal;", "remaining_daily_limit_in_asset_currency", "remaining_daily_limit_in_quote_currency", "(Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "getCurrency_type", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "getCurrency_code", "()Ljava/lang/String;", "getAvailable_balance", "()Lcom/robinhood/idl/IdlDecimal;", "getRemaining_daily_limit_in_asset_currency", "getRemaining_daily_limit_in_quote_currency", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CurrencyTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayFundingSourceDto implements Dto3<CatpayFundingSource>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayFundingSourceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayFundingSourceDto, CatpayFundingSource>> binaryBase64Serializer$delegate;
    private static final CatpayFundingSourceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayFundingSourceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayFundingSourceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CurrencyTypeDto getCurrency_type() {
        return this.surrogate.getCurrency_type();
    }

    public final String getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public final IdlDecimal getAvailable_balance() {
        return this.surrogate.getAvailable_balance();
    }

    public final IdlDecimal getRemaining_daily_limit_in_asset_currency() {
        return this.surrogate.getRemaining_daily_limit_in_asset_currency();
    }

    public final IdlDecimal getRemaining_daily_limit_in_quote_currency() {
        return this.surrogate.getRemaining_daily_limit_in_quote_currency();
    }

    public /* synthetic */ CatpayFundingSourceDto(CurrencyTypeDto currencyTypeDto, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatpayFundingSourceDto(CurrencyTypeDto currency_type, String currency_code, IdlDecimal available_balance, IdlDecimal remaining_daily_limit_in_asset_currency, IdlDecimal remaining_daily_limit_in_quote_currency) {
        this(new Surrogate(currency_type, currency_code, available_balance, remaining_daily_limit_in_asset_currency, remaining_daily_limit_in_quote_currency));
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(available_balance, "available_balance");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_asset_currency, "remaining_daily_limit_in_asset_currency");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_quote_currency, "remaining_daily_limit_in_quote_currency");
    }

    public static /* synthetic */ CatpayFundingSourceDto copy$default(CatpayFundingSourceDto catpayFundingSourceDto, CurrencyTypeDto currencyTypeDto, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyTypeDto = catpayFundingSourceDto.surrogate.getCurrency_type();
        }
        if ((i & 2) != 0) {
            str = catpayFundingSourceDto.surrogate.getCurrency_code();
        }
        if ((i & 4) != 0) {
            idlDecimal = catpayFundingSourceDto.surrogate.getAvailable_balance();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = catpayFundingSourceDto.surrogate.getRemaining_daily_limit_in_asset_currency();
        }
        if ((i & 16) != 0) {
            idlDecimal3 = catpayFundingSourceDto.surrogate.getRemaining_daily_limit_in_quote_currency();
        }
        IdlDecimal idlDecimal4 = idlDecimal3;
        IdlDecimal idlDecimal5 = idlDecimal;
        return catpayFundingSourceDto.copy(currencyTypeDto, str, idlDecimal5, idlDecimal2, idlDecimal4);
    }

    public final CatpayFundingSourceDto copy(CurrencyTypeDto currency_type, String currency_code, IdlDecimal available_balance, IdlDecimal remaining_daily_limit_in_asset_currency, IdlDecimal remaining_daily_limit_in_quote_currency) {
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(available_balance, "available_balance");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_asset_currency, "remaining_daily_limit_in_asset_currency");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_quote_currency, "remaining_daily_limit_in_quote_currency");
        return new CatpayFundingSourceDto(new Surrogate(currency_type, currency_code, available_balance, remaining_daily_limit_in_asset_currency, remaining_daily_limit_in_quote_currency));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CatpayFundingSource toProto() {
        return new CatpayFundingSource((CatpayFundingSource.CurrencyType) this.surrogate.getCurrency_type().toProto(), this.surrogate.getCurrency_code(), this.surrogate.getAvailable_balance().getStringValue(), this.surrogate.getRemaining_daily_limit_in_asset_currency().getStringValue(), this.surrogate.getRemaining_daily_limit_in_quote_currency().getStringValue(), null, 32, null);
    }

    public String toString() {
        return "[CatpayFundingSourceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayFundingSourceDto) && Intrinsics.areEqual(((CatpayFundingSourceDto) other).surrogate, this.surrogate);
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
    /* compiled from: CatpayFundingSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256Bf\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0018\u0010$\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010%\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010&\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003Jh\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0010HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001dR+\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u001d¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Surrogate;", "", "currency_type", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "currency_code", "", "available_balance", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "remaining_daily_limit_in_asset_currency", "remaining_daily_limit_in_quote_currency", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCurrency_type$annotations", "()V", "getCurrency_type", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "getCurrency_code$annotations", "getCurrency_code", "()Ljava/lang/String;", "getAvailable_balance$annotations", "getAvailable_balance", "()Lcom/robinhood/idl/IdlDecimal;", "getRemaining_daily_limit_in_asset_currency$annotations", "getRemaining_daily_limit_in_asset_currency", "getRemaining_daily_limit_in_quote_currency$annotations", "getRemaining_daily_limit_in_quote_currency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal available_balance;
        private final String currency_code;
        private final CurrencyTypeDto currency_type;
        private final IdlDecimal remaining_daily_limit_in_asset_currency;
        private final IdlDecimal remaining_daily_limit_in_quote_currency;

        public Surrogate() {
            this((CurrencyTypeDto) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CurrencyTypeDto currencyTypeDto, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, Object obj) {
            if ((i & 1) != 0) {
                currencyTypeDto = surrogate.currency_type;
            }
            if ((i & 2) != 0) {
                str = surrogate.currency_code;
            }
            if ((i & 4) != 0) {
                idlDecimal = surrogate.available_balance;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.remaining_daily_limit_in_asset_currency;
            }
            if ((i & 16) != 0) {
                idlDecimal3 = surrogate.remaining_daily_limit_in_quote_currency;
            }
            IdlDecimal idlDecimal4 = idlDecimal3;
            IdlDecimal idlDecimal5 = idlDecimal;
            return surrogate.copy(currencyTypeDto, str, idlDecimal5, idlDecimal2, idlDecimal4);
        }

        @SerialName("availableBalance")
        @JsonAnnotations2(names = {"available_balance"})
        public static /* synthetic */ void getAvailable_balance$annotations() {
        }

        @SerialName("currencyCode")
        @JsonAnnotations2(names = {"currency_code"})
        public static /* synthetic */ void getCurrency_code$annotations() {
        }

        @SerialName("currencyType")
        @JsonAnnotations2(names = {"currency_type"})
        public static /* synthetic */ void getCurrency_type$annotations() {
        }

        @SerialName("remainingDailyLimitInAssetCurrency")
        @JsonAnnotations2(names = {"remaining_daily_limit_in_asset_currency"})
        public static /* synthetic */ void getRemaining_daily_limit_in_asset_currency$annotations() {
        }

        @SerialName("remainingDailyLimitInQuoteCurrency")
        @JsonAnnotations2(names = {"remaining_daily_limit_in_quote_currency"})
        public static /* synthetic */ void getRemaining_daily_limit_in_quote_currency$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CurrencyTypeDto getCurrency_type() {
            return this.currency_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrency_code() {
            return this.currency_code;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getAvailable_balance() {
            return this.available_balance;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getRemaining_daily_limit_in_asset_currency() {
            return this.remaining_daily_limit_in_asset_currency;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getRemaining_daily_limit_in_quote_currency() {
            return this.remaining_daily_limit_in_quote_currency;
        }

        public final Surrogate copy(CurrencyTypeDto currency_type, String currency_code, IdlDecimal available_balance, IdlDecimal remaining_daily_limit_in_asset_currency, IdlDecimal remaining_daily_limit_in_quote_currency) {
            Intrinsics.checkNotNullParameter(currency_type, "currency_type");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(available_balance, "available_balance");
            Intrinsics.checkNotNullParameter(remaining_daily_limit_in_asset_currency, "remaining_daily_limit_in_asset_currency");
            Intrinsics.checkNotNullParameter(remaining_daily_limit_in_quote_currency, "remaining_daily_limit_in_quote_currency");
            return new Surrogate(currency_type, currency_code, available_balance, remaining_daily_limit_in_asset_currency, remaining_daily_limit_in_quote_currency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.currency_type == surrogate.currency_type && Intrinsics.areEqual(this.currency_code, surrogate.currency_code) && Intrinsics.areEqual(this.available_balance, surrogate.available_balance) && Intrinsics.areEqual(this.remaining_daily_limit_in_asset_currency, surrogate.remaining_daily_limit_in_asset_currency) && Intrinsics.areEqual(this.remaining_daily_limit_in_quote_currency, surrogate.remaining_daily_limit_in_quote_currency);
        }

        public int hashCode() {
            return (((((((this.currency_type.hashCode() * 31) + this.currency_code.hashCode()) * 31) + this.available_balance.hashCode()) * 31) + this.remaining_daily_limit_in_asset_currency.hashCode()) * 31) + this.remaining_daily_limit_in_quote_currency.hashCode();
        }

        public String toString() {
            return "Surrogate(currency_type=" + this.currency_type + ", currency_code=" + this.currency_code + ", available_balance=" + this.available_balance + ", remaining_daily_limit_in_asset_currency=" + this.remaining_daily_limit_in_asset_currency + ", remaining_daily_limit_in_quote_currency=" + this.remaining_daily_limit_in_quote_currency + ")";
        }

        /* compiled from: CatpayFundingSourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayFundingSourceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CurrencyTypeDto currencyTypeDto, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_type = (i & 1) == 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto;
            if ((i & 2) == 0) {
                this.currency_code = "";
            } else {
                this.currency_code = str;
            }
            if ((i & 4) == 0) {
                this.available_balance = new IdlDecimal("");
            } else {
                this.available_balance = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.remaining_daily_limit_in_asset_currency = new IdlDecimal("");
            } else {
                this.remaining_daily_limit_in_asset_currency = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.remaining_daily_limit_in_quote_currency = new IdlDecimal("");
            } else {
                this.remaining_daily_limit_in_quote_currency = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.currency_type != CurrencyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CurrencyTypeDto.Serializer.INSTANCE, self.currency_type);
            }
            if (!Intrinsics.areEqual(self.currency_code, "")) {
                output.encodeStringElement(serialDesc, 1, self.currency_code);
            }
            if (!Intrinsics.areEqual(self.available_balance, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.available_balance);
            }
            if (!Intrinsics.areEqual(self.remaining_daily_limit_in_asset_currency, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.remaining_daily_limit_in_asset_currency);
            }
            if (Intrinsics.areEqual(self.remaining_daily_limit_in_quote_currency, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.remaining_daily_limit_in_quote_currency);
        }

        public Surrogate(CurrencyTypeDto currency_type, String currency_code, IdlDecimal available_balance, IdlDecimal remaining_daily_limit_in_asset_currency, IdlDecimal remaining_daily_limit_in_quote_currency) {
            Intrinsics.checkNotNullParameter(currency_type, "currency_type");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(available_balance, "available_balance");
            Intrinsics.checkNotNullParameter(remaining_daily_limit_in_asset_currency, "remaining_daily_limit_in_asset_currency");
            Intrinsics.checkNotNullParameter(remaining_daily_limit_in_quote_currency, "remaining_daily_limit_in_quote_currency");
            this.currency_type = currency_type;
            this.currency_code = currency_code;
            this.available_balance = available_balance;
            this.remaining_daily_limit_in_asset_currency = remaining_daily_limit_in_asset_currency;
            this.remaining_daily_limit_in_quote_currency = remaining_daily_limit_in_quote_currency;
        }

        public final CurrencyTypeDto getCurrency_type() {
            return this.currency_type;
        }

        public /* synthetic */ Surrogate(CurrencyTypeDto currencyTypeDto, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3);
        }

        public final String getCurrency_code() {
            return this.currency_code;
        }

        public final IdlDecimal getAvailable_balance() {
            return this.available_balance;
        }

        public final IdlDecimal getRemaining_daily_limit_in_asset_currency() {
            return this.remaining_daily_limit_in_asset_currency;
        }

        public final IdlDecimal getRemaining_daily_limit_in_quote_currency() {
            return this.remaining_daily_limit_in_quote_currency;
        }
    }

    /* compiled from: CatpayFundingSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CatpayFundingSourceDto, CatpayFundingSource> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayFundingSourceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayFundingSourceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayFundingSourceDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayFundingSourceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CatpayFundingSource> getProtoAdapter() {
            return CatpayFundingSource.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayFundingSourceDto getZeroValue() {
            return CatpayFundingSourceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayFundingSourceDto fromProto(CatpayFundingSource proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CatpayFundingSourceDto(new Surrogate(CurrencyTypeDto.INSTANCE.fromProto(proto.getCurrency_type()), proto.getCurrency_code(), new IdlDecimal(proto.getAvailable_balance()), new IdlDecimal(proto.getRemaining_daily_limit_in_asset_currency()), new IdlDecimal(proto.getRemaining_daily_limit_in_quote_currency())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayFundingSourceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayFundingSourceDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayFundingSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENCY_TYPE_UNSPECIFIED", "FIAT", "CRYPTO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurrencyTypeDto implements Dto2<CatpayFundingSource.CurrencyType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CurrencyTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyTypeDto, CatpayFundingSource.CurrencyType>> binaryBase64Serializer$delegate;
        public static final CurrencyTypeDto CURRENCY_TYPE_UNSPECIFIED = new CURRENCY_TYPE_UNSPECIFIED("CURRENCY_TYPE_UNSPECIFIED", 0);
        public static final CurrencyTypeDto FIAT = new FIAT("FIAT", 1);
        public static final CurrencyTypeDto CRYPTO = new CRYPTO("CRYPTO", 2);

        private static final /* synthetic */ CurrencyTypeDto[] $values() {
            return new CurrencyTypeDto[]{CURRENCY_TYPE_UNSPECIFIED, FIAT, CRYPTO};
        }

        public /* synthetic */ CurrencyTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CurrencyTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CatpayFundingSourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayFundingSourceDto.CurrencyTypeDto.CURRENCY_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_TYPE_UNSPECIFIED extends CurrencyTypeDto {
            CURRENCY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayFundingSource.CurrencyType toProto() {
                return CatpayFundingSource.CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
            }
        }

        private CurrencyTypeDto(String str, int i) {
        }

        static {
            CurrencyTypeDto[] currencyTypeDtoArr$values = $values();
            $VALUES = currencyTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto$CurrencyTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayFundingSourceDto.CurrencyTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CatpayFundingSourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayFundingSourceDto.CurrencyTypeDto.FIAT", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIAT extends CurrencyTypeDto {
            FIAT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayFundingSource.CurrencyType toProto() {
                return CatpayFundingSource.CurrencyType.FIAT;
            }
        }

        /* compiled from: CatpayFundingSourceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayFundingSourceDto.CurrencyTypeDto.CRYPTO", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO extends CurrencyTypeDto {
            CRYPTO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayFundingSource.CurrencyType toProto() {
                return CatpayFundingSource.CurrencyType.CRYPTO;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CatpayFundingSourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CurrencyTypeDto, CatpayFundingSource.CurrencyType> {

            /* compiled from: CatpayFundingSourceDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CatpayFundingSource.CurrencyType.values().length];
                    try {
                        iArr[CatpayFundingSource.CurrencyType.CURRENCY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CatpayFundingSource.CurrencyType.FIAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CatpayFundingSource.CurrencyType.CRYPTO.ordinal()] = 3;
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

            public final KSerializer<CurrencyTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayFundingSource.CurrencyType> getProtoAdapter() {
                return CatpayFundingSource.CurrencyType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyTypeDto getZeroValue() {
                return CurrencyTypeDto.CURRENCY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyTypeDto fromProto(CatpayFundingSource.CurrencyType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CurrencyTypeDto.CURRENCY_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CurrencyTypeDto.FIAT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return CurrencyTypeDto.CRYPTO;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayFundingSourceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$CurrencyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CurrencyTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CurrencyTypeDto, CatpayFundingSource.CurrencyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CatpayFundingSource.CurrencyType", CurrencyTypeDto.getEntries(), CurrencyTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CurrencyTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CurrencyTypeDto valueOf(String str) {
            return (CurrencyTypeDto) Enum.valueOf(CurrencyTypeDto.class, str);
        }

        public static CurrencyTypeDto[] values() {
            return (CurrencyTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CatpayFundingSourceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayFundingSourceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayFundingSource", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayFundingSourceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayFundingSourceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayFundingSourceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CatpayFundingSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSourceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayFundingSourceDto";
        }
    }
}
