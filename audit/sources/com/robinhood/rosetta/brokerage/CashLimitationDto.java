package com.robinhood.rosetta.brokerage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: CashLimitationDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0006\u0010\u000fJC\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/brokerage/CashLimitation;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;)V", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount_held_from_buying_power", "amount_held_from_withdrawable_cash", "amount_held_from_portfolio_cash", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "automatic_release_datetime", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;)V", "copy", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;)Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "toProto", "()Lcom/robinhood/rosetta/brokerage/CashLimitation;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;", "getAmount_held_from_buying_power", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount_held_from_withdrawable_cash", "getAmount_held_from_portfolio_cash", "getAutomatic_release_datetime", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CashLimitationDto implements Dto3<CashLimitation>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CashLimitationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CashLimitationDto, CashLimitation>> binaryBase64Serializer$delegate;
    private static final CashLimitationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CashLimitationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CashLimitationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getAmount_held_from_buying_power() {
        return this.surrogate.getAmount_held_from_buying_power();
    }

    public final MoneyDto getAmount_held_from_withdrawable_cash() {
        return this.surrogate.getAmount_held_from_withdrawable_cash();
    }

    public final MoneyDto getAmount_held_from_portfolio_cash() {
        return this.surrogate.getAmount_held_from_portfolio_cash();
    }

    public final Instant getAutomatic_release_datetime() {
        return this.surrogate.getAutomatic_release_datetime();
    }

    public /* synthetic */ CashLimitationDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : instant);
    }

    public CashLimitationDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant) {
        this(new Surrogate(moneyDto, moneyDto2, moneyDto3, instant));
    }

    public static /* synthetic */ CashLimitationDto copy$default(CashLimitationDto cashLimitationDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = cashLimitationDto.surrogate.getAmount_held_from_buying_power();
        }
        if ((i & 2) != 0) {
            moneyDto2 = cashLimitationDto.surrogate.getAmount_held_from_withdrawable_cash();
        }
        if ((i & 4) != 0) {
            moneyDto3 = cashLimitationDto.surrogate.getAmount_held_from_portfolio_cash();
        }
        if ((i & 8) != 0) {
            instant = cashLimitationDto.surrogate.getAutomatic_release_datetime();
        }
        return cashLimitationDto.copy(moneyDto, moneyDto2, moneyDto3, instant);
    }

    public final CashLimitationDto copy(MoneyDto amount_held_from_buying_power, MoneyDto amount_held_from_withdrawable_cash, MoneyDto amount_held_from_portfolio_cash, Instant automatic_release_datetime) {
        return new CashLimitationDto(new Surrogate(amount_held_from_buying_power, amount_held_from_withdrawable_cash, amount_held_from_portfolio_cash, automatic_release_datetime));
    }

    @Override // com.robinhood.idl.Dto
    public CashLimitation toProto() {
        MoneyDto amount_held_from_buying_power = this.surrogate.getAmount_held_from_buying_power();
        Money proto = amount_held_from_buying_power != null ? amount_held_from_buying_power.toProto() : null;
        MoneyDto amount_held_from_withdrawable_cash = this.surrogate.getAmount_held_from_withdrawable_cash();
        Money proto2 = amount_held_from_withdrawable_cash != null ? amount_held_from_withdrawable_cash.toProto() : null;
        MoneyDto amount_held_from_portfolio_cash = this.surrogate.getAmount_held_from_portfolio_cash();
        return new CashLimitation(proto, proto2, amount_held_from_portfolio_cash != null ? amount_held_from_portfolio_cash.toProto() : null, this.surrogate.getAutomatic_release_datetime(), null, 16, null);
    }

    public String toString() {
        return "[CashLimitationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CashLimitationDto) && Intrinsics.areEqual(((CashLimitationDto) other).surrogate, this.surrogate);
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
    /* compiled from: CashLimitationDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\f\u0010\rBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ6\u0010 \u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b \u0010!Jd\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001dRF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010!¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;", "", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount_held_from_buying_power", "amount_held_from_withdrawable_cash", "amount_held_from_portfolio_cash", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "automatic_release_datetime", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_brokerage_externalRelease", "(Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component2", "component3", "component4", "()Lj$/time/Instant;", "copy", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;)Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount_held_from_buying_power", "getAmount_held_from_buying_power$annotations", "()V", "getAmount_held_from_withdrawable_cash", "getAmount_held_from_withdrawable_cash$annotations", "getAmount_held_from_portfolio_cash", "getAmount_held_from_portfolio_cash$annotations", "Lj$/time/Instant;", "getAutomatic_release_datetime", "getAutomatic_release_datetime$annotations", "Companion", "$serializer", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount_held_from_buying_power;
        private final MoneyDto amount_held_from_portfolio_cash;
        private final MoneyDto amount_held_from_withdrawable_cash;
        private final Instant automatic_release_datetime;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (Instant) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.amount_held_from_buying_power;
            }
            if ((i & 2) != 0) {
                moneyDto2 = surrogate.amount_held_from_withdrawable_cash;
            }
            if ((i & 4) != 0) {
                moneyDto3 = surrogate.amount_held_from_portfolio_cash;
            }
            if ((i & 8) != 0) {
                instant = surrogate.automatic_release_datetime;
            }
            return surrogate.copy(moneyDto, moneyDto2, moneyDto3, instant);
        }

        @SerialName("amountHeldFromBuyingPower")
        @JsonAnnotations2(names = {"amount_held_from_buying_power"})
        public static /* synthetic */ void getAmount_held_from_buying_power$annotations() {
        }

        @SerialName("amountHeldFromPortfolioCash")
        @JsonAnnotations2(names = {"amount_held_from_portfolio_cash"})
        public static /* synthetic */ void getAmount_held_from_portfolio_cash$annotations() {
        }

        @SerialName("amountHeldFromWithdrawableCash")
        @JsonAnnotations2(names = {"amount_held_from_withdrawable_cash"})
        public static /* synthetic */ void getAmount_held_from_withdrawable_cash$annotations() {
        }

        @SerialName("automaticReleaseDatetime")
        @JsonAnnotations2(names = {"automatic_release_datetime"})
        public static /* synthetic */ void getAutomatic_release_datetime$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getAmount_held_from_buying_power() {
            return this.amount_held_from_buying_power;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getAmount_held_from_withdrawable_cash() {
            return this.amount_held_from_withdrawable_cash;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getAmount_held_from_portfolio_cash() {
            return this.amount_held_from_portfolio_cash;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getAutomatic_release_datetime() {
            return this.automatic_release_datetime;
        }

        public final Surrogate copy(MoneyDto amount_held_from_buying_power, MoneyDto amount_held_from_withdrawable_cash, MoneyDto amount_held_from_portfolio_cash, Instant automatic_release_datetime) {
            return new Surrogate(amount_held_from_buying_power, amount_held_from_withdrawable_cash, amount_held_from_portfolio_cash, automatic_release_datetime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.amount_held_from_buying_power, surrogate.amount_held_from_buying_power) && Intrinsics.areEqual(this.amount_held_from_withdrawable_cash, surrogate.amount_held_from_withdrawable_cash) && Intrinsics.areEqual(this.amount_held_from_portfolio_cash, surrogate.amount_held_from_portfolio_cash) && Intrinsics.areEqual(this.automatic_release_datetime, surrogate.automatic_release_datetime);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.amount_held_from_buying_power;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.amount_held_from_withdrawable_cash;
            int iHashCode2 = (iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.amount_held_from_portfolio_cash;
            int iHashCode3 = (iHashCode2 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            Instant instant = this.automatic_release_datetime;
            return iHashCode3 + (instant != null ? instant.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(amount_held_from_buying_power=" + this.amount_held_from_buying_power + ", amount_held_from_withdrawable_cash=" + this.amount_held_from_withdrawable_cash + ", amount_held_from_portfolio_cash=" + this.amount_held_from_portfolio_cash + ", automatic_release_datetime=" + this.automatic_release_datetime + ")";
        }

        /* compiled from: CashLimitationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CashLimitationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.amount_held_from_buying_power = null;
            } else {
                this.amount_held_from_buying_power = moneyDto;
            }
            if ((i & 2) == 0) {
                this.amount_held_from_withdrawable_cash = null;
            } else {
                this.amount_held_from_withdrawable_cash = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.amount_held_from_portfolio_cash = null;
            } else {
                this.amount_held_from_portfolio_cash = moneyDto3;
            }
            if ((i & 8) == 0) {
                this.automatic_release_datetime = null;
            } else {
                this.automatic_release_datetime = instant;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_brokerage_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.amount_held_from_buying_power;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.amount_held_from_withdrawable_cash;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.amount_held_from_portfolio_cash;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            Instant instant = self.automatic_release_datetime;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant) {
            this.amount_held_from_buying_power = moneyDto;
            this.amount_held_from_withdrawable_cash = moneyDto2;
            this.amount_held_from_portfolio_cash = moneyDto3;
            this.automatic_release_datetime = instant;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : instant);
        }

        public final MoneyDto getAmount_held_from_buying_power() {
            return this.amount_held_from_buying_power;
        }

        public final MoneyDto getAmount_held_from_withdrawable_cash() {
            return this.amount_held_from_withdrawable_cash;
        }

        public final MoneyDto getAmount_held_from_portfolio_cash() {
            return this.amount_held_from_portfolio_cash;
        }

        public final Instant getAutomatic_release_datetime() {
            return this.automatic_release_datetime;
        }
    }

    /* compiled from: CashLimitationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "Lcom/robinhood/rosetta/brokerage/CashLimitation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CashLimitationDto, CashLimitation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CashLimitationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashLimitationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashLimitationDto> getBinaryBase64Serializer() {
            return (KSerializer) CashLimitationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CashLimitation> getProtoAdapter() {
            return CashLimitation.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashLimitationDto getZeroValue() {
            return CashLimitationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashLimitationDto fromProto(CashLimitation proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money amount_held_from_buying_power = proto.getAmount_held_from_buying_power();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount_held_from_buying_power != null ? MoneyDto.INSTANCE.fromProto(amount_held_from_buying_power) : null;
            Money amount_held_from_withdrawable_cash = proto.getAmount_held_from_withdrawable_cash();
            MoneyDto moneyDtoFromProto2 = amount_held_from_withdrawable_cash != null ? MoneyDto.INSTANCE.fromProto(amount_held_from_withdrawable_cash) : null;
            Money amount_held_from_portfolio_cash = proto.getAmount_held_from_portfolio_cash();
            return new CashLimitationDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, amount_held_from_portfolio_cash != null ? MoneyDto.INSTANCE.fromProto(amount_held_from_portfolio_cash) : null, proto.getAutomatic_release_datetime()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.brokerage.CashLimitationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashLimitationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CashLimitationDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CashLimitationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/brokerage/CashLimitationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CashLimitationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.brokerage.CashLimitation", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CashLimitationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CashLimitationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CashLimitationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CashLimitationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashLimitationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.brokerage.CashLimitationDto";
        }
    }
}
