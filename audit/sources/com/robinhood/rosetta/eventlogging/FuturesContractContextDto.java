package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.ContractTradabilityDto;
import com.robinhood.rosetta.eventlogging.MoneyDto;
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

/* compiled from: FuturesContractContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Surrogate;)V", "contract_id", "", AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT, "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "contract_tradibility", "Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;)V", "getContract_id", "()Ljava/lang/String;", "getMargin_requirement", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getContract_tradibility", "()Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class FuturesContractContextDto implements Dto3<FuturesContractContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesContractContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesContractContextDto, FuturesContractContext>> binaryBase64Serializer$delegate;
    private static final FuturesContractContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesContractContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesContractContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final MoneyDto getMargin_requirement() {
        return this.surrogate.getMargin_requirement();
    }

    public final ContractTradabilityDto getContract_tradibility() {
        return this.surrogate.getContract_tradibility();
    }

    public /* synthetic */ FuturesContractContextDto(String str, MoneyDto moneyDto, ContractTradabilityDto contractTradabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? ContractTradabilityDto.INSTANCE.getZeroValue() : contractTradabilityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesContractContextDto(String contract_id, MoneyDto moneyDto, ContractTradabilityDto contract_tradibility) {
        this(new Surrogate(contract_id, moneyDto, contract_tradibility));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(contract_tradibility, "contract_tradibility");
    }

    public static /* synthetic */ FuturesContractContextDto copy$default(FuturesContractContextDto futuresContractContextDto, String str, MoneyDto moneyDto, ContractTradabilityDto contractTradabilityDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresContractContextDto.surrogate.getContract_id();
        }
        if ((i & 2) != 0) {
            moneyDto = futuresContractContextDto.surrogate.getMargin_requirement();
        }
        if ((i & 4) != 0) {
            contractTradabilityDto = futuresContractContextDto.surrogate.getContract_tradibility();
        }
        return futuresContractContextDto.copy(str, moneyDto, contractTradabilityDto);
    }

    public final FuturesContractContextDto copy(String contract_id, MoneyDto margin_requirement, ContractTradabilityDto contract_tradibility) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(contract_tradibility, "contract_tradibility");
        return new FuturesContractContextDto(new Surrogate(contract_id, margin_requirement, contract_tradibility));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesContractContext toProto() {
        String contract_id = this.surrogate.getContract_id();
        MoneyDto margin_requirement = this.surrogate.getMargin_requirement();
        return new FuturesContractContext(contract_id, margin_requirement != null ? margin_requirement.toProto() : null, (ContractTradability) this.surrogate.getContract_tradibility().toProto(), null, 8, null);
    }

    public String toString() {
        return "[FuturesContractContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesContractContextDto) && Intrinsics.areEqual(((FuturesContractContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesContractContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Surrogate;", "", "contract_id", "", AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT, "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "contract_tradibility", "Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getMargin_requirement$annotations", "getMargin_requirement", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getContract_tradibility$annotations", "getContract_tradibility", "()Lcom/robinhood/rosetta/eventlogging/ContractTradabilityDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final ContractTradabilityDto contract_tradibility;
        private final MoneyDto margin_requirement;

        public Surrogate() {
            this((String) null, (MoneyDto) null, (ContractTradabilityDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MoneyDto moneyDto, ContractTradabilityDto contractTradabilityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_id;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.margin_requirement;
            }
            if ((i & 4) != 0) {
                contractTradabilityDto = surrogate.contract_tradibility;
            }
            return surrogate.copy(str, moneyDto, contractTradabilityDto);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractTradibility")
        @JsonAnnotations2(names = {"contract_tradibility"})
        public static /* synthetic */ void getContract_tradibility$annotations() {
        }

        @SerialName("marginRequirement")
        @JsonAnnotations2(names = {AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT})
        public static /* synthetic */ void getMargin_requirement$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getMargin_requirement() {
            return this.margin_requirement;
        }

        /* renamed from: component3, reason: from getter */
        public final ContractTradabilityDto getContract_tradibility() {
            return this.contract_tradibility;
        }

        public final Surrogate copy(String contract_id, MoneyDto margin_requirement, ContractTradabilityDto contract_tradibility) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(contract_tradibility, "contract_tradibility");
            return new Surrogate(contract_id, margin_requirement, contract_tradibility);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.margin_requirement, surrogate.margin_requirement) && this.contract_tradibility == surrogate.contract_tradibility;
        }

        public int hashCode() {
            int iHashCode = this.contract_id.hashCode() * 31;
            MoneyDto moneyDto = this.margin_requirement;
            return ((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.contract_tradibility.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", margin_requirement=" + this.margin_requirement + ", contract_tradibility=" + this.contract_tradibility + ")";
        }

        /* compiled from: FuturesContractContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesContractContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, ContractTradabilityDto contractTradabilityDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.contract_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.margin_requirement = null;
            } else {
                this.margin_requirement = moneyDto;
            }
            if ((i & 4) == 0) {
                this.contract_tradibility = ContractTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.contract_tradibility = contractTradabilityDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            MoneyDto moneyDto = self.margin_requirement;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.contract_tradibility != ContractTradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ContractTradabilityDto.Serializer.INSTANCE, self.contract_tradibility);
            }
        }

        public Surrogate(String contract_id, MoneyDto moneyDto, ContractTradabilityDto contract_tradibility) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(contract_tradibility, "contract_tradibility");
            this.contract_id = contract_id;
            this.margin_requirement = moneyDto;
            this.contract_tradibility = contract_tradibility;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, ContractTradabilityDto contractTradabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? ContractTradabilityDto.INSTANCE.getZeroValue() : contractTradabilityDto);
        }

        public final MoneyDto getMargin_requirement() {
            return this.margin_requirement;
        }

        public final ContractTradabilityDto getContract_tradibility() {
            return this.contract_tradibility;
        }
    }

    /* compiled from: FuturesContractContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesContractContextDto, FuturesContractContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesContractContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesContractContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesContractContextDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesContractContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesContractContext> getProtoAdapter() {
            return FuturesContractContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesContractContextDto getZeroValue() {
            return FuturesContractContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesContractContextDto fromProto(FuturesContractContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_id = proto.getContract_id();
            Money margin_requirement = proto.getMargin_requirement();
            return new FuturesContractContextDto(new Surrogate(contract_id, margin_requirement != null ? MoneyDto.INSTANCE.fromProto(margin_requirement) : null, ContractTradabilityDto.INSTANCE.fromProto(proto.getContract_tradibility())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesContractContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesContractContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesContractContextDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesContractContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FuturesContractContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FuturesContractContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesContractContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesContractContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesContractContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesContractContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesContractContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.FuturesContractContextDto";
        }
    }
}
