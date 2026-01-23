package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CashBalanceDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalanceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CashBalance;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/CashBalanceDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/CashBalanceDto$Surrogate;)V", "id", "", "account_id", "cash_amount", "Lcom/robinhood/idl/IdlDecimal;", "currency_code", "Lcom/robinhood/rosetta/common/CurrencyDto;", "net_pending_cash_adjustment", "created_at", "updated_at", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getCash_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getCurrency_code", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getNet_pending_cash_adjustment", "getCreated_at", "getUpdated_at", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CashBalanceDto implements Dto3<CashBalance>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CashBalanceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CashBalanceDto, CashBalance>> binaryBase64Serializer$delegate;
    private static final CashBalanceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CashBalanceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CashBalanceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final IdlDecimal getCash_amount() {
        return this.surrogate.getCash_amount();
    }

    public final CurrencyDto getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public final IdlDecimal getNet_pending_cash_adjustment() {
        return this.surrogate.getNet_pending_cash_adjustment();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public /* synthetic */ CashBalanceDto(String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashBalanceDto(String id, String account_id, IdlDecimal cash_amount, CurrencyDto currency_code, IdlDecimal net_pending_cash_adjustment, String created_at, String updated_at) {
        this(new Surrogate(id, account_id, cash_amount, currency_code, net_pending_cash_adjustment, created_at, updated_at));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(net_pending_cash_adjustment, "net_pending_cash_adjustment");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
    }

    public static /* synthetic */ CashBalanceDto copy$default(CashBalanceDto cashBalanceDto, String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashBalanceDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = cashBalanceDto.surrogate.getAccount_id();
        }
        if ((i & 4) != 0) {
            idlDecimal = cashBalanceDto.surrogate.getCash_amount();
        }
        if ((i & 8) != 0) {
            currencyDto = cashBalanceDto.surrogate.getCurrency_code();
        }
        if ((i & 16) != 0) {
            idlDecimal2 = cashBalanceDto.surrogate.getNet_pending_cash_adjustment();
        }
        if ((i & 32) != 0) {
            str3 = cashBalanceDto.surrogate.getCreated_at();
        }
        if ((i & 64) != 0) {
            str4 = cashBalanceDto.surrogate.getUpdated_at();
        }
        String str5 = str3;
        String str6 = str4;
        IdlDecimal idlDecimal3 = idlDecimal2;
        IdlDecimal idlDecimal4 = idlDecimal;
        return cashBalanceDto.copy(str, str2, idlDecimal4, currencyDto, idlDecimal3, str5, str6);
    }

    public final CashBalanceDto copy(String id, String account_id, IdlDecimal cash_amount, CurrencyDto currency_code, IdlDecimal net_pending_cash_adjustment, String created_at, String updated_at) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(net_pending_cash_adjustment, "net_pending_cash_adjustment");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        return new CashBalanceDto(new Surrogate(id, account_id, cash_amount, currency_code, net_pending_cash_adjustment, created_at, updated_at));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CashBalance toProto() {
        return new CashBalance(this.surrogate.getId(), this.surrogate.getAccount_id(), this.surrogate.getCash_amount().getStringValue(), (Currency) this.surrogate.getCurrency_code().toProto(), this.surrogate.getNet_pending_cash_adjustment().getStringValue(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), null, 128, null);
    }

    public String toString() {
        return "[CashBalanceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CashBalanceDto) && Intrinsics.areEqual(((CashBalanceDto) other).surrogate, this.surrogate);
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
    /* compiled from: CashBalanceDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0018\u0010*\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u0018\u0010,\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003Jm\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R+\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001eR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019¨\u0006?"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalanceDto$Surrogate;", "", "id", "", "account_id", "cash_amount", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "currency_code", "Lcom/robinhood/rosetta/common/CurrencyDto;", "net_pending_cash_adjustment", "created_at", "updated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getAccount_id$annotations", "getAccount_id", "getCash_amount$annotations", "getCash_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getCurrency_code$annotations", "getCurrency_code", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getNet_pending_cash_adjustment$annotations", "getNet_pending_cash_adjustment", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final IdlDecimal cash_amount;
        private final String created_at;
        private final CurrencyDto currency_code;
        private final String id;
        private final IdlDecimal net_pending_cash_adjustment;
        private final String updated_at;

        public Surrogate() {
            this((String) null, (String) null, (IdlDecimal) null, (CurrencyDto) null, (IdlDecimal) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.account_id;
            }
            if ((i & 4) != 0) {
                idlDecimal = surrogate.cash_amount;
            }
            if ((i & 8) != 0) {
                currencyDto = surrogate.currency_code;
            }
            if ((i & 16) != 0) {
                idlDecimal2 = surrogate.net_pending_cash_adjustment;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.created_at;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.updated_at;
            }
            String str5 = str3;
            String str6 = str4;
            IdlDecimal idlDecimal3 = idlDecimal2;
            IdlDecimal idlDecimal4 = idlDecimal;
            return surrogate.copy(str, str2, idlDecimal4, currencyDto, idlDecimal3, str5, str6);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("cashAmount")
        @JsonAnnotations2(names = {"cash_amount"})
        public static /* synthetic */ void getCash_amount$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("currencyCode")
        @JsonAnnotations2(names = {"currency_code"})
        public static /* synthetic */ void getCurrency_code$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("netPendingCashAdjustment")
        @JsonAnnotations2(names = {"net_pending_cash_adjustment"})
        public static /* synthetic */ void getNet_pending_cash_adjustment$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getCash_amount() {
            return this.cash_amount;
        }

        /* renamed from: component4, reason: from getter */
        public final CurrencyDto getCurrency_code() {
            return this.currency_code;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getNet_pending_cash_adjustment() {
            return this.net_pending_cash_adjustment;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final Surrogate copy(String id, String account_id, IdlDecimal cash_amount, CurrencyDto currency_code, IdlDecimal net_pending_cash_adjustment, String created_at, String updated_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(net_pending_cash_adjustment, "net_pending_cash_adjustment");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            return new Surrogate(id, account_id, cash_amount, currency_code, net_pending_cash_adjustment, created_at, updated_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.cash_amount, surrogate.cash_amount) && this.currency_code == surrogate.currency_code && Intrinsics.areEqual(this.net_pending_cash_adjustment, surrogate.net_pending_cash_adjustment) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.cash_amount.hashCode()) * 31) + this.currency_code.hashCode()) * 31) + this.net_pending_cash_adjustment.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", cash_amount=" + this.cash_amount + ", currency_code=" + this.currency_code + ", net_pending_cash_adjustment=" + this.net_pending_cash_adjustment + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
        }

        /* compiled from: CashBalanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalanceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CashBalanceDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CashBalanceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.cash_amount = new IdlDecimal("");
            } else {
                this.cash_amount = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.currency_code = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.currency_code = currencyDto;
            }
            if ((i & 16) == 0) {
                this.net_pending_cash_adjustment = new IdlDecimal("");
            } else {
                this.net_pending_cash_adjustment = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str3;
            }
            if ((i & 64) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            if (!Intrinsics.areEqual(self.cash_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.cash_amount);
            }
            if (self.currency_code != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CurrencyDto.Serializer.INSTANCE, self.currency_code);
            }
            if (!Intrinsics.areEqual(self.net_pending_cash_adjustment, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.net_pending_cash_adjustment);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 5, self.created_at);
            }
            if (Intrinsics.areEqual(self.updated_at, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.updated_at);
        }

        public Surrogate(String id, String account_id, IdlDecimal cash_amount, CurrencyDto currency_code, IdlDecimal net_pending_cash_adjustment, String created_at, String updated_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(net_pending_cash_adjustment, "net_pending_cash_adjustment");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            this.id = id;
            this.account_id = account_id;
            this.cash_amount = cash_amount;
            this.currency_code = currency_code;
            this.net_pending_cash_adjustment = net_pending_cash_adjustment;
            this.created_at = created_at;
            this.updated_at = updated_at;
        }

        public /* synthetic */ Surrogate(String str, String str2, IdlDecimal idlDecimal, CurrencyDto currencyDto, IdlDecimal idlDecimal2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final IdlDecimal getCash_amount() {
            return this.cash_amount;
        }

        public final CurrencyDto getCurrency_code() {
            return this.currency_code;
        }

        public final IdlDecimal getNet_pending_cash_adjustment() {
            return this.net_pending_cash_adjustment;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }
    }

    /* compiled from: CashBalanceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalanceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CashBalanceDto;", "Lcom/robinhood/ceres/v1/CashBalance;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CashBalanceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CashBalanceDto, CashBalance> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CashBalanceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashBalanceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashBalanceDto> getBinaryBase64Serializer() {
            return (KSerializer) CashBalanceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CashBalance> getProtoAdapter() {
            return CashBalance.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashBalanceDto getZeroValue() {
            return CashBalanceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashBalanceDto fromProto(CashBalance proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CashBalanceDto(new Surrogate(proto.getId(), proto.getAccount_id(), new IdlDecimal(proto.getCash_amount()), CurrencyDto.INSTANCE.fromProto(proto.getCurrency_code()), new IdlDecimal(proto.getNet_pending_cash_adjustment()), proto.getCreated_at(), proto.getUpdated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CashBalanceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashBalanceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CashBalanceDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CashBalanceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalanceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CashBalanceDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CashBalanceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CashBalanceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.CashBalance", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CashBalanceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CashBalanceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CashBalanceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CashBalanceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashBalanceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CashBalanceDto";
        }
    }
}
