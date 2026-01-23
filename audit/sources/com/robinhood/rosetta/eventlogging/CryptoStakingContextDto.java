package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarComposable5;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.rosetta.eventlogging.CryptoStakingContextDto;
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

/* compiled from: CryptoStakingContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005./012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0013JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Surrogate;)V", "asset_currency_code", "", "apy", "", "available_to_stake", "available_to_unstake", "staking_balance", "pending_earnings", "lifetime_earnings", "orderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "(Ljava/lang/String;DDDDDDLcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;)V", "getAsset_currency_code", "()Ljava/lang/String;", "getApy", "()D", "getAvailable_to_stake", "getAvailable_to_unstake", "getStaking_balance", "getPending_earnings", "getLifetime_earnings", "getOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OrderContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoStakingContextDto implements Dto3<CryptoStakingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoStakingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoStakingContextDto, CryptoStakingContext>> binaryBase64Serializer$delegate;
    private static final CryptoStakingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoStakingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoStakingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAsset_currency_code() {
        return this.surrogate.getAsset_currency_code();
    }

    public final double getApy() {
        return this.surrogate.getApy();
    }

    public final double getAvailable_to_stake() {
        return this.surrogate.getAvailable_to_stake();
    }

    public final double getAvailable_to_unstake() {
        return this.surrogate.getAvailable_to_unstake();
    }

    public final double getStaking_balance() {
        return this.surrogate.getStaking_balance();
    }

    public final double getPending_earnings() {
        return this.surrogate.getPending_earnings();
    }

    public final double getLifetime_earnings() {
        return this.surrogate.getLifetime_earnings();
    }

    public final OrderContextDto getOrderContext() {
        return this.surrogate.getOrderContext();
    }

    public /* synthetic */ CryptoStakingContextDto(String str, double d, double d2, double d3, double d4, double d5, double d6, OrderContextDto orderContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? 0.0d : d4, (i & 32) != 0 ? 0.0d : d5, (i & 64) == 0 ? d6 : 0.0d, (i & 128) != 0 ? null : orderContextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoStakingContextDto(String asset_currency_code, double d, double d2, double d3, double d4, double d5, double d6, OrderContextDto orderContextDto) {
        this(new Surrogate(asset_currency_code, d, d2, d3, d4, d5, d6, orderContextDto));
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
    }

    public final CryptoStakingContextDto copy(String asset_currency_code, double apy, double available_to_stake, double available_to_unstake, double staking_balance, double pending_earnings, double lifetime_earnings, OrderContextDto orderContext) {
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        return new CryptoStakingContextDto(new Surrogate(asset_currency_code, apy, available_to_stake, available_to_unstake, staking_balance, pending_earnings, lifetime_earnings, orderContext));
    }

    @Override // com.robinhood.idl.Dto
    public CryptoStakingContext toProto() {
        String asset_currency_code = this.surrogate.getAsset_currency_code();
        double apy = this.surrogate.getApy();
        double available_to_stake = this.surrogate.getAvailable_to_stake();
        double available_to_unstake = this.surrogate.getAvailable_to_unstake();
        double staking_balance = this.surrogate.getStaking_balance();
        double pending_earnings = this.surrogate.getPending_earnings();
        double lifetime_earnings = this.surrogate.getLifetime_earnings();
        OrderContextDto orderContext = this.surrogate.getOrderContext();
        return new CryptoStakingContext(asset_currency_code, apy, available_to_stake, available_to_unstake, staking_balance, pending_earnings, lifetime_earnings, orderContext != null ? orderContext.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[CryptoStakingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoStakingContextDto) && Intrinsics.areEqual(((CryptoStakingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoStakingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002ABB³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0018\u0010,\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010-\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010.\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010/\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00100\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00101\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jµ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\r\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0013HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001dR+\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001dR+\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001dR+\u0010\f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001dR+\u0010\r\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*¨\u0006C"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Surrogate;", "", "asset_currency_code", "", "apy", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "available_to_stake", "available_to_unstake", "staking_balance", "pending_earnings", "lifetime_earnings", "orderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "<init>", "(Ljava/lang/String;DDDDDDLcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DDDDDDLcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAsset_currency_code$annotations", "()V", "getAsset_currency_code", "()Ljava/lang/String;", "getApy$annotations", "getApy", "()D", "getAvailable_to_stake$annotations", "getAvailable_to_stake", "getAvailable_to_unstake$annotations", "getAvailable_to_unstake", "getStaking_balance$annotations", "getStaking_balance", "getPending_earnings$annotations", "getPending_earnings", "getLifetime_earnings$annotations", "getLifetime_earnings", "getOrderContext$annotations", "getOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double apy;
        private final String asset_currency_code;
        private final double available_to_stake;
        private final double available_to_unstake;
        private final double lifetime_earnings;
        private final OrderContextDto orderContext;
        private final double pending_earnings;
        private final double staking_balance;

        public Surrogate() {
            this((String) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (OrderContextDto) null, 255, (DefaultConstructorMarker) null);
        }

        @SerialName("apy")
        @JsonAnnotations2(names = {"apy"})
        public static /* synthetic */ void getApy$annotations() {
        }

        @SerialName("assetCurrencyCode")
        @JsonAnnotations2(names = {"asset_currency_code"})
        public static /* synthetic */ void getAsset_currency_code$annotations() {
        }

        @SerialName("availableToStake")
        @JsonAnnotations2(names = {"available_to_stake"})
        public static /* synthetic */ void getAvailable_to_stake$annotations() {
        }

        @SerialName("availableToUnstake")
        @JsonAnnotations2(names = {"available_to_unstake"})
        public static /* synthetic */ void getAvailable_to_unstake$annotations() {
        }

        @SerialName("lifetimeEarnings")
        @JsonAnnotations2(names = {"lifetime_earnings"})
        public static /* synthetic */ void getLifetime_earnings$annotations() {
        }

        @SerialName("orderContext")
        @JsonAnnotations2(names = {"orderContext"})
        public static /* synthetic */ void getOrderContext$annotations() {
        }

        @SerialName("pendingEarnings")
        @JsonAnnotations2(names = {"pending_earnings"})
        public static /* synthetic */ void getPending_earnings$annotations() {
        }

        @SerialName("stakingBalance")
        @JsonAnnotations2(names = {"staking_balance"})
        public static /* synthetic */ void getStaking_balance$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        /* renamed from: component2, reason: from getter */
        public final double getApy() {
            return this.apy;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAvailable_to_stake() {
            return this.available_to_stake;
        }

        /* renamed from: component4, reason: from getter */
        public final double getAvailable_to_unstake() {
            return this.available_to_unstake;
        }

        /* renamed from: component5, reason: from getter */
        public final double getStaking_balance() {
            return this.staking_balance;
        }

        /* renamed from: component6, reason: from getter */
        public final double getPending_earnings() {
            return this.pending_earnings;
        }

        /* renamed from: component7, reason: from getter */
        public final double getLifetime_earnings() {
            return this.lifetime_earnings;
        }

        /* renamed from: component8, reason: from getter */
        public final OrderContextDto getOrderContext() {
            return this.orderContext;
        }

        public final Surrogate copy(String asset_currency_code, double apy, double available_to_stake, double available_to_unstake, double staking_balance, double pending_earnings, double lifetime_earnings, OrderContextDto orderContext) {
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            return new Surrogate(asset_currency_code, apy, available_to_stake, available_to_unstake, staking_balance, pending_earnings, lifetime_earnings, orderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && Double.compare(this.apy, surrogate.apy) == 0 && Double.compare(this.available_to_stake, surrogate.available_to_stake) == 0 && Double.compare(this.available_to_unstake, surrogate.available_to_unstake) == 0 && Double.compare(this.staking_balance, surrogate.staking_balance) == 0 && Double.compare(this.pending_earnings, surrogate.pending_earnings) == 0 && Double.compare(this.lifetime_earnings, surrogate.lifetime_earnings) == 0 && Intrinsics.areEqual(this.orderContext, surrogate.orderContext);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.asset_currency_code.hashCode() * 31) + Double.hashCode(this.apy)) * 31) + Double.hashCode(this.available_to_stake)) * 31) + Double.hashCode(this.available_to_unstake)) * 31) + Double.hashCode(this.staking_balance)) * 31) + Double.hashCode(this.pending_earnings)) * 31) + Double.hashCode(this.lifetime_earnings)) * 31;
            OrderContextDto orderContextDto = this.orderContext;
            return iHashCode + (orderContextDto == null ? 0 : orderContextDto.hashCode());
        }

        public String toString() {
            return "Surrogate(asset_currency_code=" + this.asset_currency_code + ", apy=" + this.apy + ", available_to_stake=" + this.available_to_stake + ", available_to_unstake=" + this.available_to_unstake + ", staking_balance=" + this.staking_balance + ", pending_earnings=" + this.pending_earnings + ", lifetime_earnings=" + this.lifetime_earnings + ", orderContext=" + this.orderContext + ")";
        }

        /* compiled from: CryptoStakingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoStakingContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, double d, double d2, double d3, double d4, double d5, double d6, OrderContextDto orderContextDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.asset_currency_code = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.apy = 0.0d;
            } else {
                this.apy = d;
            }
            if ((i & 4) == 0) {
                this.available_to_stake = 0.0d;
            } else {
                this.available_to_stake = d2;
            }
            if ((i & 8) == 0) {
                this.available_to_unstake = 0.0d;
            } else {
                this.available_to_unstake = d3;
            }
            if ((i & 16) == 0) {
                this.staking_balance = 0.0d;
            } else {
                this.staking_balance = d4;
            }
            if ((i & 32) == 0) {
                this.pending_earnings = 0.0d;
            } else {
                this.pending_earnings = d5;
            }
            if ((i & 64) == 0) {
                this.lifetime_earnings = 0.0d;
            } else {
                this.lifetime_earnings = d6;
            }
            this.orderContext = (i & 128) == 0 ? null : orderContextDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                output.encodeStringElement(serialDesc, 0, self.asset_currency_code);
            }
            if (Double.compare(self.apy, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.apy));
            }
            if (Double.compare(self.available_to_stake, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.available_to_stake));
            }
            if (Double.compare(self.available_to_unstake, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.available_to_unstake));
            }
            if (Double.compare(self.staking_balance, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.staking_balance));
            }
            if (Double.compare(self.pending_earnings, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.pending_earnings));
            }
            if (Double.compare(self.lifetime_earnings, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.lifetime_earnings));
            }
            OrderContextDto orderContextDto = self.orderContext;
            if (orderContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, OrderContextDto.Serializer.INSTANCE, orderContextDto);
            }
        }

        public Surrogate(String asset_currency_code, double d, double d2, double d3, double d4, double d5, double d6, OrderContextDto orderContextDto) {
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            this.asset_currency_code = asset_currency_code;
            this.apy = d;
            this.available_to_stake = d2;
            this.available_to_unstake = d3;
            this.staking_balance = d4;
            this.pending_earnings = d5;
            this.lifetime_earnings = d6;
            this.orderContext = orderContextDto;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public /* synthetic */ Surrogate(String str, double d, double d2, double d3, double d4, double d5, double d6, OrderContextDto orderContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? 0.0d : d4, (i & 32) != 0 ? 0.0d : d5, (i & 64) == 0 ? d6 : 0.0d, (i & 128) != 0 ? null : orderContextDto);
        }

        public final double getApy() {
            return this.apy;
        }

        public final double getAvailable_to_stake() {
            return this.available_to_stake;
        }

        public final double getAvailable_to_unstake() {
            return this.available_to_unstake;
        }

        public final double getStaking_balance() {
            return this.staking_balance;
        }

        public final double getPending_earnings() {
            return this.pending_earnings;
        }

        public final double getLifetime_earnings() {
            return this.lifetime_earnings;
        }

        public final OrderContextDto getOrderContext() {
            return this.orderContext;
        }
    }

    /* compiled from: CryptoStakingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoStakingContextDto, CryptoStakingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoStakingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoStakingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoStakingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoStakingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoStakingContext> getProtoAdapter() {
            return CryptoStakingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoStakingContextDto getZeroValue() {
            return CryptoStakingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoStakingContextDto fromProto(CryptoStakingContext proto) {
            DefaultConstructorMarker defaultConstructorMarker;
            OrderContextDto orderContextDtoFromProto;
            Intrinsics.checkNotNullParameter(proto, "proto");
            String asset_currency_code = proto.getAsset_currency_code();
            double apy = proto.getApy();
            double available_to_stake = proto.getAvailable_to_stake();
            double available_to_unstake = proto.getAvailable_to_unstake();
            double staking_balance = proto.getStaking_balance();
            double pending_earnings = proto.getPending_earnings();
            double lifetime_earnings = proto.getLifetime_earnings();
            CryptoStakingContext.OrderContext orderContext = proto.getOrderContext();
            if (orderContext != null) {
                orderContextDtoFromProto = OrderContextDto.INSTANCE.fromProto(orderContext);
                defaultConstructorMarker = null;
            } else {
                defaultConstructorMarker = null;
                orderContextDtoFromProto = null;
            }
            return new CryptoStakingContextDto(new Surrogate(asset_currency_code, apy, available_to_stake, available_to_unstake, staking_balance, pending_earnings, lifetime_earnings, orderContextDtoFromProto), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoStakingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoStakingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoStakingContextDto(null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoStakingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Surrogate;)V", "input_amount", "", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "", "(DLcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;Ljava/lang/String;)V", "getInput_amount", "()D", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "getOrder_status", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EntryTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderContextDto implements Dto3<CryptoStakingContext.OrderContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OrderContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderContextDto, CryptoStakingContext.OrderContext>> binaryBase64Serializer$delegate;
        private static final OrderContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OrderContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final double getInput_amount() {
            return this.surrogate.getInput_amount();
        }

        public final EntryTypeDto getEntry_type() {
            return this.surrogate.getEntry_type();
        }

        public final String getOrder_status() {
            return this.surrogate.getOrder_status();
        }

        public /* synthetic */ OrderContextDto(double d, EntryTypeDto entryTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? EntryTypeDto.INSTANCE.getZeroValue() : entryTypeDto, (i & 4) != 0 ? "" : str);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OrderContextDto(double d, EntryTypeDto entry_type, String order_status) {
            this(new Surrogate(d, entry_type, order_status));
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(order_status, "order_status");
        }

        public static /* synthetic */ OrderContextDto copy$default(OrderContextDto orderContextDto, double d, EntryTypeDto entryTypeDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = orderContextDto.surrogate.getInput_amount();
            }
            if ((i & 2) != 0) {
                entryTypeDto = orderContextDto.surrogate.getEntry_type();
            }
            if ((i & 4) != 0) {
                str = orderContextDto.surrogate.getOrder_status();
            }
            return orderContextDto.copy(d, entryTypeDto, str);
        }

        public final OrderContextDto copy(double input_amount, EntryTypeDto entry_type, String order_status) {
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(order_status, "order_status");
            return new OrderContextDto(new Surrogate(input_amount, entry_type, order_status));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public CryptoStakingContext.OrderContext toProto() {
            return new CryptoStakingContext.OrderContext(this.surrogate.getInput_amount(), (CryptoStakingContext.OrderContext.EntryType) this.surrogate.getEntry_type().toProto(), this.surrogate.getOrder_status(), null, 8, null);
        }

        public String toString() {
            return "[OrderContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OrderContextDto) && Intrinsics.areEqual(((OrderContextDto) other).surrogate, this.surrogate);
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
        /* compiled from: CryptoStakingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002-.B4\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB7\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u0018\u0010\u001c\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J6\u0010\u001f\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000eHÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Surrogate;", "", "input_amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "", "<init>", "(DLcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInput_amount$annotations", "()V", "getInput_amount", "()D", "getEntry_type$annotations", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "getOrder_status$annotations", "getOrder_status", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final EntryTypeDto entry_type;
            private final double input_amount;
            private final String order_status;

            public Surrogate() {
                this(0.0d, (EntryTypeDto) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, EntryTypeDto entryTypeDto, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = surrogate.input_amount;
                }
                if ((i & 2) != 0) {
                    entryTypeDto = surrogate.entry_type;
                }
                if ((i & 4) != 0) {
                    str = surrogate.order_status;
                }
                return surrogate.copy(d, entryTypeDto, str);
            }

            @SerialName("entryType")
            @JsonAnnotations2(names = {"entry_type"})
            public static /* synthetic */ void getEntry_type$annotations() {
            }

            @SerialName("inputAmount")
            @JsonAnnotations2(names = {"input_amount"})
            public static /* synthetic */ void getInput_amount$annotations() {
            }

            @SerialName("orderStatus")
            @JsonAnnotations2(names = {ComboOrderDetailTopbarComposable5.ORDER_STATUS})
            public static /* synthetic */ void getOrder_status$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final double getInput_amount() {
                return this.input_amount;
            }

            /* renamed from: component2, reason: from getter */
            public final EntryTypeDto getEntry_type() {
                return this.entry_type;
            }

            /* renamed from: component3, reason: from getter */
            public final String getOrder_status() {
                return this.order_status;
            }

            public final Surrogate copy(double input_amount, EntryTypeDto entry_type, String order_status) {
                Intrinsics.checkNotNullParameter(entry_type, "entry_type");
                Intrinsics.checkNotNullParameter(order_status, "order_status");
                return new Surrogate(input_amount, entry_type, order_status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Double.compare(this.input_amount, surrogate.input_amount) == 0 && this.entry_type == surrogate.entry_type && Intrinsics.areEqual(this.order_status, surrogate.order_status);
            }

            public int hashCode() {
                return (((Double.hashCode(this.input_amount) * 31) + this.entry_type.hashCode()) * 31) + this.order_status.hashCode();
            }

            public String toString() {
                return "Surrogate(input_amount=" + this.input_amount + ", entry_type=" + this.entry_type + ", order_status=" + this.order_status + ")";
            }

            /* compiled from: CryptoStakingContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CryptoStakingContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, double d, EntryTypeDto entryTypeDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
                this.input_amount = (i & 1) == 0 ? 0.0d : d;
                if ((i & 2) == 0) {
                    this.entry_type = EntryTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.entry_type = entryTypeDto;
                }
                if ((i & 4) == 0) {
                    this.order_status = "";
                } else {
                    this.order_status = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Double.compare(self.input_amount, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.input_amount));
                }
                if (self.entry_type != EntryTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, EntryTypeDto.Serializer.INSTANCE, self.entry_type);
                }
                if (Intrinsics.areEqual(self.order_status, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.order_status);
            }

            public Surrogate(double d, EntryTypeDto entry_type, String order_status) {
                Intrinsics.checkNotNullParameter(entry_type, "entry_type");
                Intrinsics.checkNotNullParameter(order_status, "order_status");
                this.input_amount = d;
                this.entry_type = entry_type;
                this.order_status = order_status;
            }

            public final double getInput_amount() {
                return this.input_amount;
            }

            public final EntryTypeDto getEntry_type() {
                return this.entry_type;
            }

            public /* synthetic */ Surrogate(double d, EntryTypeDto entryTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? EntryTypeDto.INSTANCE.getZeroValue() : entryTypeDto, (i & 4) != 0 ? "" : str);
            }

            public final String getOrder_status() {
                return this.order_status;
            }
        }

        /* compiled from: CryptoStakingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<OrderContextDto, CryptoStakingContext.OrderContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderContextDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoStakingContext.OrderContext> getProtoAdapter() {
                return CryptoStakingContext.OrderContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderContextDto getZeroValue() {
                return OrderContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderContextDto fromProto(CryptoStakingContext.OrderContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new OrderContextDto(new Surrogate(proto.getInput_amount(), EntryTypeDto.INSTANCE.fromProto(proto.getEntry_type()), proto.getOrder_status()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoStakingContextDto$OrderContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoStakingContextDto.OrderContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OrderContextDto(0.0d, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoStakingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class EntryTypeDto implements Dto2<CryptoStakingContext.OrderContext.EntryType>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EntryTypeDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<EntryTypeDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<EntryTypeDto, CryptoStakingContext.OrderContext.EntryType>> binaryBase64Serializer$delegate;
            public static final EntryTypeDto ENTRY_TYPE_UNSPECIFIED = new ENTRY_TYPE_UNSPECIFIED("ENTRY_TYPE_UNSPECIFIED", 0);
            public static final EntryTypeDto ASSET = new ASSET("ASSET", 1);
            public static final EntryTypeDto QUOTE = new QUOTE("QUOTE", 2);

            private static final /* synthetic */ EntryTypeDto[] $values() {
                return new EntryTypeDto[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
            }

            public /* synthetic */ EntryTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<EntryTypeDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private EntryTypeDto(String str, int i) {
            }

            /* compiled from: CryptoStakingContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoStakingContextDto.OrderContextDto.EntryTypeDto.ENTRY_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ENTRY_TYPE_UNSPECIFIED extends EntryTypeDto {
                ENTRY_TYPE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoStakingContext.OrderContext.EntryType toProto() {
                    return CryptoStakingContext.OrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED;
                }
            }

            static {
                EntryTypeDto[] entryTypeDtoArr$values = $values();
                $VALUES = entryTypeDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(entryTypeDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoStakingContextDto$OrderContextDto$EntryTypeDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoStakingContextDto.OrderContextDto.EntryTypeDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: CryptoStakingContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoStakingContextDto.OrderContextDto.EntryTypeDto.ASSET", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ASSET extends EntryTypeDto {
                ASSET(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoStakingContext.OrderContext.EntryType toProto() {
                    return CryptoStakingContext.OrderContext.EntryType.ASSET;
                }
            }

            /* compiled from: CryptoStakingContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoStakingContextDto.OrderContextDto.EntryTypeDto.QUOTE", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class QUOTE extends EntryTypeDto {
                QUOTE(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoStakingContext.OrderContext.EntryType toProto() {
                    return CryptoStakingContext.OrderContext.EntryType.QUOTE;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: CryptoStakingContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<EntryTypeDto, CryptoStakingContext.OrderContext.EntryType> {

                /* compiled from: CryptoStakingContextDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoStakingContext.OrderContext.EntryType.values().length];
                        try {
                            iArr[CryptoStakingContext.OrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoStakingContext.OrderContext.EntryType.ASSET.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CryptoStakingContext.OrderContext.EntryType.QUOTE.ordinal()] = 3;
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

                public final KSerializer<EntryTypeDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EntryTypeDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EntryTypeDto> getBinaryBase64Serializer() {
                    return (KSerializer) EntryTypeDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CryptoStakingContext.OrderContext.EntryType> getProtoAdapter() {
                    return CryptoStakingContext.OrderContext.EntryType.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EntryTypeDto getZeroValue() {
                    return EntryTypeDto.ENTRY_TYPE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EntryTypeDto fromProto(CryptoStakingContext.OrderContext.EntryType proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return EntryTypeDto.ENTRY_TYPE_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return EntryTypeDto.ASSET;
                    }
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return EntryTypeDto.QUOTE;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CryptoStakingContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$EntryTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<EntryTypeDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<EntryTypeDto, CryptoStakingContext.OrderContext.EntryType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoStakingContext.OrderContext.EntryType", EntryTypeDto.getEntries(), EntryTypeDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public EntryTypeDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (EntryTypeDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, EntryTypeDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static EntryTypeDto valueOf(String str) {
                return (EntryTypeDto) Enum.valueOf(EntryTypeDto.class, str);
            }

            public static EntryTypeDto[] values() {
                return (EntryTypeDto[]) $VALUES.clone();
            }
        }

        /* compiled from: CryptoStakingContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoStakingContext.OrderContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OrderContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CryptoStakingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$OrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CryptoStakingContextDto$OrderContextDto";
            }
        }
    }

    /* compiled from: CryptoStakingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoStakingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoStakingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoStakingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoStakingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoStakingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoStakingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoStakingContextDto";
        }
    }
}
