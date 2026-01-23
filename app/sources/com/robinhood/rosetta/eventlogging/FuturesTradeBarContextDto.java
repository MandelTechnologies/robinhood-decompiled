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
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.ContractTradabilityDto;
import com.robinhood.rosetta.eventlogging.FuturesTradeBarContext;
import com.robinhood.rosetta.eventlogging.FuturesTradeBarContextDto;
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

/* compiled from: FuturesTradeBarContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Surrogate;)V", "trade_button_status", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "buy_button_status", "sell_button_status", "contract_tradability", "Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "(Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;)V", "getTrade_button_status", "()Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "getBuy_button_status", "getSell_button_status", "getContract_tradability", "()Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ButtonStatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class FuturesTradeBarContextDto implements Dto3<FuturesTradeBarContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesTradeBarContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesTradeBarContextDto, FuturesTradeBarContext>> binaryBase64Serializer$delegate;
    private static final FuturesTradeBarContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesTradeBarContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesTradeBarContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ButtonStatusDto getTrade_button_status() {
        return this.surrogate.getTrade_button_status();
    }

    public final ButtonStatusDto getBuy_button_status() {
        return this.surrogate.getBuy_button_status();
    }

    public final ButtonStatusDto getSell_button_status() {
        return this.surrogate.getSell_button_status();
    }

    public final ContractTradabilityDto getContract_tradability() {
        return this.surrogate.getContract_tradability();
    }

    public /* synthetic */ FuturesTradeBarContextDto(ButtonStatusDto buttonStatusDto, ButtonStatusDto buttonStatusDto2, ButtonStatusDto buttonStatusDto3, ContractTradabilityDto contractTradabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto, (i & 2) != 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto2, (i & 4) != 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto3, (i & 8) != 0 ? ContractTradabilityDto.INSTANCE.getZeroValue() : contractTradabilityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesTradeBarContextDto(ButtonStatusDto trade_button_status, ButtonStatusDto buy_button_status, ButtonStatusDto sell_button_status, ContractTradabilityDto contract_tradability) {
        this(new Surrogate(trade_button_status, buy_button_status, sell_button_status, contract_tradability));
        Intrinsics.checkNotNullParameter(trade_button_status, "trade_button_status");
        Intrinsics.checkNotNullParameter(buy_button_status, "buy_button_status");
        Intrinsics.checkNotNullParameter(sell_button_status, "sell_button_status");
        Intrinsics.checkNotNullParameter(contract_tradability, "contract_tradability");
    }

    public static /* synthetic */ FuturesTradeBarContextDto copy$default(FuturesTradeBarContextDto futuresTradeBarContextDto, ButtonStatusDto buttonStatusDto, ButtonStatusDto buttonStatusDto2, ButtonStatusDto buttonStatusDto3, ContractTradabilityDto contractTradabilityDto, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonStatusDto = futuresTradeBarContextDto.surrogate.getTrade_button_status();
        }
        if ((i & 2) != 0) {
            buttonStatusDto2 = futuresTradeBarContextDto.surrogate.getBuy_button_status();
        }
        if ((i & 4) != 0) {
            buttonStatusDto3 = futuresTradeBarContextDto.surrogate.getSell_button_status();
        }
        if ((i & 8) != 0) {
            contractTradabilityDto = futuresTradeBarContextDto.surrogate.getContract_tradability();
        }
        return futuresTradeBarContextDto.copy(buttonStatusDto, buttonStatusDto2, buttonStatusDto3, contractTradabilityDto);
    }

    public final FuturesTradeBarContextDto copy(ButtonStatusDto trade_button_status, ButtonStatusDto buy_button_status, ButtonStatusDto sell_button_status, ContractTradabilityDto contract_tradability) {
        Intrinsics.checkNotNullParameter(trade_button_status, "trade_button_status");
        Intrinsics.checkNotNullParameter(buy_button_status, "buy_button_status");
        Intrinsics.checkNotNullParameter(sell_button_status, "sell_button_status");
        Intrinsics.checkNotNullParameter(contract_tradability, "contract_tradability");
        return new FuturesTradeBarContextDto(new Surrogate(trade_button_status, buy_button_status, sell_button_status, contract_tradability));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesTradeBarContext toProto() {
        return new FuturesTradeBarContext((FuturesTradeBarContext.ButtonStatus) this.surrogate.getTrade_button_status().toProto(), (FuturesTradeBarContext.ButtonStatus) this.surrogate.getBuy_button_status().toProto(), (FuturesTradeBarContext.ButtonStatus) this.surrogate.getSell_button_status().toProto(), (ContractTradability) this.surrogate.getContract_tradability().toProto(), null, 16, null);
    }

    public String toString() {
        return "[FuturesTradeBarContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesTradeBarContextDto) && Intrinsics.areEqual(((FuturesTradeBarContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesTradeBarContextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002-.B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Surrogate;", "", "trade_button_status", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "buy_button_status", "sell_button_status", "contract_tradability", "Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTrade_button_status$annotations", "()V", "getTrade_button_status", "()Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "getBuy_button_status$annotations", "getBuy_button_status", "getSell_button_status$annotations", "getSell_button_status", "getContract_tradability$annotations", "getContract_tradability", "()Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ButtonStatusDto buy_button_status;
        private final ContractTradabilityDto contract_tradability;
        private final ButtonStatusDto sell_button_status;
        private final ButtonStatusDto trade_button_status;

        public Surrogate() {
            this((ButtonStatusDto) null, (ButtonStatusDto) null, (ButtonStatusDto) null, (ContractTradabilityDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ButtonStatusDto buttonStatusDto, ButtonStatusDto buttonStatusDto2, ButtonStatusDto buttonStatusDto3, ContractTradabilityDto contractTradabilityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                buttonStatusDto = surrogate.trade_button_status;
            }
            if ((i & 2) != 0) {
                buttonStatusDto2 = surrogate.buy_button_status;
            }
            if ((i & 4) != 0) {
                buttonStatusDto3 = surrogate.sell_button_status;
            }
            if ((i & 8) != 0) {
                contractTradabilityDto = surrogate.contract_tradability;
            }
            return surrogate.copy(buttonStatusDto, buttonStatusDto2, buttonStatusDto3, contractTradabilityDto);
        }

        @SerialName("buyButtonStatus")
        @JsonAnnotations2(names = {"buy_button_status"})
        public static /* synthetic */ void getBuy_button_status$annotations() {
        }

        @SerialName("contractTradability")
        @JsonAnnotations2(names = {"contract_tradability"})
        public static /* synthetic */ void getContract_tradability$annotations() {
        }

        @SerialName("sellButtonStatus")
        @JsonAnnotations2(names = {"sell_button_status"})
        public static /* synthetic */ void getSell_button_status$annotations() {
        }

        @SerialName("tradeButtonStatus")
        @JsonAnnotations2(names = {"trade_button_status"})
        public static /* synthetic */ void getTrade_button_status$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonStatusDto getTrade_button_status() {
            return this.trade_button_status;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonStatusDto getBuy_button_status() {
            return this.buy_button_status;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonStatusDto getSell_button_status() {
            return this.sell_button_status;
        }

        /* renamed from: component4, reason: from getter */
        public final ContractTradabilityDto getContract_tradability() {
            return this.contract_tradability;
        }

        public final Surrogate copy(ButtonStatusDto trade_button_status, ButtonStatusDto buy_button_status, ButtonStatusDto sell_button_status, ContractTradabilityDto contract_tradability) {
            Intrinsics.checkNotNullParameter(trade_button_status, "trade_button_status");
            Intrinsics.checkNotNullParameter(buy_button_status, "buy_button_status");
            Intrinsics.checkNotNullParameter(sell_button_status, "sell_button_status");
            Intrinsics.checkNotNullParameter(contract_tradability, "contract_tradability");
            return new Surrogate(trade_button_status, buy_button_status, sell_button_status, contract_tradability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.trade_button_status == surrogate.trade_button_status && this.buy_button_status == surrogate.buy_button_status && this.sell_button_status == surrogate.sell_button_status && this.contract_tradability == surrogate.contract_tradability;
        }

        public int hashCode() {
            return (((((this.trade_button_status.hashCode() * 31) + this.buy_button_status.hashCode()) * 31) + this.sell_button_status.hashCode()) * 31) + this.contract_tradability.hashCode();
        }

        public String toString() {
            return "Surrogate(trade_button_status=" + this.trade_button_status + ", buy_button_status=" + this.buy_button_status + ", sell_button_status=" + this.sell_button_status + ", contract_tradability=" + this.contract_tradability + ")";
        }

        /* compiled from: FuturesTradeBarContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesTradeBarContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ButtonStatusDto buttonStatusDto, ButtonStatusDto buttonStatusDto2, ButtonStatusDto buttonStatusDto3, ContractTradabilityDto contractTradabilityDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.trade_button_status = (i & 1) == 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto;
            if ((i & 2) == 0) {
                this.buy_button_status = ButtonStatusDto.INSTANCE.getZeroValue();
            } else {
                this.buy_button_status = buttonStatusDto2;
            }
            if ((i & 4) == 0) {
                this.sell_button_status = ButtonStatusDto.INSTANCE.getZeroValue();
            } else {
                this.sell_button_status = buttonStatusDto3;
            }
            if ((i & 8) == 0) {
                this.contract_tradability = ContractTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.contract_tradability = contractTradabilityDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ButtonStatusDto buttonStatusDto = self.trade_button_status;
            ButtonStatusDto.Companion companion = ButtonStatusDto.INSTANCE;
            if (buttonStatusDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ButtonStatusDto.Serializer.INSTANCE, self.trade_button_status);
            }
            if (self.buy_button_status != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ButtonStatusDto.Serializer.INSTANCE, self.buy_button_status);
            }
            if (self.sell_button_status != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ButtonStatusDto.Serializer.INSTANCE, self.sell_button_status);
            }
            if (self.contract_tradability != ContractTradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ContractTradabilityDto.Serializer.INSTANCE, self.contract_tradability);
            }
        }

        public Surrogate(ButtonStatusDto trade_button_status, ButtonStatusDto buy_button_status, ButtonStatusDto sell_button_status, ContractTradabilityDto contract_tradability) {
            Intrinsics.checkNotNullParameter(trade_button_status, "trade_button_status");
            Intrinsics.checkNotNullParameter(buy_button_status, "buy_button_status");
            Intrinsics.checkNotNullParameter(sell_button_status, "sell_button_status");
            Intrinsics.checkNotNullParameter(contract_tradability, "contract_tradability");
            this.trade_button_status = trade_button_status;
            this.buy_button_status = buy_button_status;
            this.sell_button_status = sell_button_status;
            this.contract_tradability = contract_tradability;
        }

        public final ButtonStatusDto getTrade_button_status() {
            return this.trade_button_status;
        }

        public /* synthetic */ Surrogate(ButtonStatusDto buttonStatusDto, ButtonStatusDto buttonStatusDto2, ButtonStatusDto buttonStatusDto3, ContractTradabilityDto contractTradabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto, (i & 2) != 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto2, (i & 4) != 0 ? ButtonStatusDto.INSTANCE.getZeroValue() : buttonStatusDto3, (i & 8) != 0 ? ContractTradabilityDto.INSTANCE.getZeroValue() : contractTradabilityDto);
        }

        public final ButtonStatusDto getBuy_button_status() {
            return this.buy_button_status;
        }

        public final ButtonStatusDto getSell_button_status() {
            return this.sell_button_status;
        }

        public final ContractTradabilityDto getContract_tradability() {
            return this.contract_tradability;
        }
    }

    /* compiled from: FuturesTradeBarContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FuturesTradeBarContextDto, FuturesTradeBarContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesTradeBarContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesTradeBarContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesTradeBarContextDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesTradeBarContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesTradeBarContext> getProtoAdapter() {
            return FuturesTradeBarContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesTradeBarContextDto getZeroValue() {
            return FuturesTradeBarContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesTradeBarContextDto fromProto(FuturesTradeBarContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ButtonStatusDto.Companion companion = ButtonStatusDto.INSTANCE;
            return new FuturesTradeBarContextDto(new Surrogate(companion.fromProto(proto.getTrade_button_status()), companion.fromProto(proto.getBuy_button_status()), companion.fromProto(proto.getSell_button_status()), ContractTradabilityDto.INSTANCE.fromProto(proto.getContract_tradability())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesTradeBarContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTradeBarContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesTradeBarContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesTradeBarContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON_STATUS_UNSPECIFIED", "ENABLED", "DISABLED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ButtonStatusDto implements Dto2<FuturesTradeBarContext.ButtonStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ButtonStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ButtonStatusDto, FuturesTradeBarContext.ButtonStatus>> binaryBase64Serializer$delegate;
        public static final ButtonStatusDto BUTTON_STATUS_UNSPECIFIED = new BUTTON_STATUS_UNSPECIFIED("BUTTON_STATUS_UNSPECIFIED", 0);
        public static final ButtonStatusDto ENABLED = new ENABLED("ENABLED", 1);
        public static final ButtonStatusDto DISABLED = new DISABLED("DISABLED", 2);

        private static final /* synthetic */ ButtonStatusDto[] $values() {
            return new ButtonStatusDto[]{BUTTON_STATUS_UNSPECIFIED, ENABLED, DISABLED};
        }

        public /* synthetic */ ButtonStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ButtonStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesTradeBarContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto.ButtonStatusDto.BUTTON_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUTTON_STATUS_UNSPECIFIED extends ButtonStatusDto {
            BUTTON_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesTradeBarContext.ButtonStatus toProto() {
                return FuturesTradeBarContext.ButtonStatus.BUTTON_STATUS_UNSPECIFIED;
            }
        }

        private ButtonStatusDto(String str, int i) {
        }

        static {
            ButtonStatusDto[] buttonStatusDtoArr$values = $values();
            $VALUES = buttonStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(buttonStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesTradeBarContextDto$ButtonStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesTradeBarContextDto.ButtonStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesTradeBarContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto.ButtonStatusDto.ENABLED", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENABLED extends ButtonStatusDto {
            ENABLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesTradeBarContext.ButtonStatus toProto() {
                return FuturesTradeBarContext.ButtonStatus.ENABLED;
            }
        }

        /* compiled from: FuturesTradeBarContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto.ButtonStatusDto.DISABLED", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISABLED extends ButtonStatusDto {
            DISABLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesTradeBarContext.ButtonStatus toProto() {
                return FuturesTradeBarContext.ButtonStatus.DISABLED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesTradeBarContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ButtonStatusDto, FuturesTradeBarContext.ButtonStatus> {

            /* compiled from: FuturesTradeBarContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesTradeBarContext.ButtonStatus.values().length];
                    try {
                        iArr[FuturesTradeBarContext.ButtonStatus.BUTTON_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesTradeBarContext.ButtonStatus.ENABLED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesTradeBarContext.ButtonStatus.DISABLED.ordinal()] = 3;
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

            public final KSerializer<ButtonStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ButtonStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ButtonStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) ButtonStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesTradeBarContext.ButtonStatus> getProtoAdapter() {
                return FuturesTradeBarContext.ButtonStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ButtonStatusDto getZeroValue() {
                return ButtonStatusDto.BUTTON_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ButtonStatusDto fromProto(FuturesTradeBarContext.ButtonStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ButtonStatusDto.BUTTON_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return ButtonStatusDto.ENABLED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ButtonStatusDto.DISABLED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesTradeBarContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$ButtonStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ButtonStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ButtonStatusDto, FuturesTradeBarContext.ButtonStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesTradeBarContext.ButtonStatus", ButtonStatusDto.getEntries(), ButtonStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ButtonStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ButtonStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ButtonStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ButtonStatusDto valueOf(String str) {
            return (ButtonStatusDto) Enum.valueOf(ButtonStatusDto.class, str);
        }

        public static ButtonStatusDto[] values() {
            return (ButtonStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FuturesTradeBarContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FuturesTradeBarContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FuturesTradeBarContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesTradeBarContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesTradeBarContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesTradeBarContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesTradeBarContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.FuturesTradeBarContextDto";
        }
    }
}
