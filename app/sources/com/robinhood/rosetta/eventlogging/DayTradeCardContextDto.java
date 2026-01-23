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
import com.robinhood.rosetta.eventlogging.DayTradeCardContext;
import com.robinhood.rosetta.eventlogging.DayTradeCardContextDto;
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

/* compiled from: DayTradeCardContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001d\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Surrogate;)V", "state", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "(Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;)V", "getState", "()Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DayTradCardStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DayTradeCardContextDto implements Dto3<DayTradeCardContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DayTradeCardContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DayTradeCardContextDto, DayTradeCardContext>> binaryBase64Serializer$delegate;
    private static final DayTradeCardContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DayTradeCardContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DayTradeCardContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DayTradCardStateDto getState() {
        return this.surrogate.getState();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DayTradeCardContextDto(DayTradCardStateDto state) {
        this(new Surrogate(state));
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public /* synthetic */ DayTradeCardContextDto(DayTradCardStateDto dayTradCardStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DayTradCardStateDto.INSTANCE.getZeroValue() : dayTradCardStateDto);
    }

    public static /* synthetic */ DayTradeCardContextDto copy$default(DayTradeCardContextDto dayTradeCardContextDto, DayTradCardStateDto dayTradCardStateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            dayTradCardStateDto = dayTradeCardContextDto.surrogate.getState();
        }
        return dayTradeCardContextDto.copy(dayTradCardStateDto);
    }

    public final DayTradeCardContextDto copy(DayTradCardStateDto state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new DayTradeCardContextDto(new Surrogate(state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DayTradeCardContext toProto() {
        return new DayTradeCardContext((DayTradeCardContext.DayTradCardState) this.surrogate.getState().toProto(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[DayTradeCardContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DayTradeCardContextDto) && Intrinsics.areEqual(((DayTradeCardContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: DayTradeCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Surrogate;", "", "state", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getState$annotations", "()V", "getState", "()Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DayTradCardStateDto state;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((DayTradCardStateDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DayTradCardStateDto dayTradCardStateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                dayTradCardStateDto = surrogate.state;
            }
            return surrogate.copy(dayTradCardStateDto);
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DayTradCardStateDto getState() {
            return this.state;
        }

        public final Surrogate copy(DayTradCardStateDto state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Surrogate(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.state == ((Surrogate) other).state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ")";
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DayTradeCardContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DayTradCardStateDto dayTradCardStateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.state = DayTradCardStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = dayTradCardStateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != DayTradCardStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DayTradCardStateDto.Serializer.INSTANCE, self.state);
            }
        }

        public Surrogate(DayTradCardStateDto state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final DayTradCardStateDto getState() {
            return this.state;
        }

        public /* synthetic */ Surrogate(DayTradCardStateDto dayTradCardStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DayTradCardStateDto.INSTANCE.getZeroValue() : dayTradCardStateDto);
        }
    }

    /* compiled from: DayTradeCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DayTradeCardContextDto, DayTradeCardContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DayTradeCardContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DayTradeCardContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DayTradeCardContextDto> getBinaryBase64Serializer() {
            return (KSerializer) DayTradeCardContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DayTradeCardContext> getProtoAdapter() {
            return DayTradeCardContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DayTradeCardContextDto getZeroValue() {
            return DayTradeCardContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DayTradeCardContextDto fromProto(DayTradeCardContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DayTradeCardContextDto(new Surrogate(DayTradCardStateDto.INSTANCE.fromProto(proto.getState())), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DayTradeCardContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DayTradeCardContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DayTradeCardContextDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayTradeCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "BELOW_25K", "ABOVE_25K", "PRELIMINARY_EM_CALL", "FINALIZED_EM_CALL", "DAY_TRADE_CALL_ACTIVE", "DAY_TRADE_CALL_PAST_DUE", "DAY_TRADE_CALL_MET", "PRELIM_PCO_DTEM", "PCO_DTEM", "PCO_DTDT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DayTradCardStateDto implements Dto2<DayTradeCardContext.DayTradCardState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DayTradCardStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DayTradCardStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DayTradCardStateDto, DayTradeCardContext.DayTradCardState>> binaryBase64Serializer$delegate;
        public static final DayTradCardStateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final DayTradCardStateDto BELOW_25K = new BELOW_25K("BELOW_25K", 1);
        public static final DayTradCardStateDto ABOVE_25K = new ABOVE_25K("ABOVE_25K", 2);
        public static final DayTradCardStateDto PRELIMINARY_EM_CALL = new PRELIMINARY_EM_CALL("PRELIMINARY_EM_CALL", 3);
        public static final DayTradCardStateDto FINALIZED_EM_CALL = new FINALIZED_EM_CALL("FINALIZED_EM_CALL", 4);
        public static final DayTradCardStateDto DAY_TRADE_CALL_ACTIVE = new DAY_TRADE_CALL_ACTIVE("DAY_TRADE_CALL_ACTIVE", 5);
        public static final DayTradCardStateDto DAY_TRADE_CALL_PAST_DUE = new DAY_TRADE_CALL_PAST_DUE("DAY_TRADE_CALL_PAST_DUE", 6);
        public static final DayTradCardStateDto DAY_TRADE_CALL_MET = new DAY_TRADE_CALL_MET("DAY_TRADE_CALL_MET", 7);
        public static final DayTradCardStateDto PRELIM_PCO_DTEM = new PRELIM_PCO_DTEM("PRELIM_PCO_DTEM", 8);
        public static final DayTradCardStateDto PCO_DTEM = new PCO_DTEM("PCO_DTEM", 9);
        public static final DayTradCardStateDto PCO_DTDT = new PCO_DTDT("PCO_DTDT", 10);

        private static final /* synthetic */ DayTradCardStateDto[] $values() {
            return new DayTradCardStateDto[]{STATE_UNSPECIFIED, BELOW_25K, ABOVE_25K, PRELIMINARY_EM_CALL, FINALIZED_EM_CALL, DAY_TRADE_CALL_ACTIVE, DAY_TRADE_CALL_PAST_DUE, DAY_TRADE_CALL_MET, PRELIM_PCO_DTEM, PCO_DTEM, PCO_DTDT};
        }

        public /* synthetic */ DayTradCardStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DayTradCardStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DayTradCardStateDto(String str, int i) {
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends DayTradCardStateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.STATE_UNSPECIFIED;
            }
        }

        static {
            DayTradCardStateDto[] dayTradCardStateDtoArr$values = $values();
            $VALUES = dayTradCardStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dayTradCardStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DayTradeCardContextDto$DayTradCardStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DayTradeCardContextDto.DayTradCardStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.BELOW_25K", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BELOW_25K extends DayTradCardStateDto {
            BELOW_25K(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.BELOW_25K;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.ABOVE_25K", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ABOVE_25K extends DayTradCardStateDto {
            ABOVE_25K(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.ABOVE_25K;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.PRELIMINARY_EM_CALL", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRELIMINARY_EM_CALL extends DayTradCardStateDto {
            PRELIMINARY_EM_CALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.PRELIMINARY_EM_CALL;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.FINALIZED_EM_CALL", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FINALIZED_EM_CALL extends DayTradCardStateDto {
            FINALIZED_EM_CALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.FINALIZED_EM_CALL;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.DAY_TRADE_CALL_ACTIVE", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_TRADE_CALL_ACTIVE extends DayTradCardStateDto {
            DAY_TRADE_CALL_ACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.DAY_TRADE_CALL_ACTIVE;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.DAY_TRADE_CALL_PAST_DUE", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_TRADE_CALL_PAST_DUE extends DayTradCardStateDto {
            DAY_TRADE_CALL_PAST_DUE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.DAY_TRADE_CALL_PAST_DUE;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.DAY_TRADE_CALL_MET", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_TRADE_CALL_MET extends DayTradCardStateDto {
            DAY_TRADE_CALL_MET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.DAY_TRADE_CALL_MET;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.PRELIM_PCO_DTEM", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRELIM_PCO_DTEM extends DayTradCardStateDto {
            PRELIM_PCO_DTEM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.PRELIM_PCO_DTEM;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.PCO_DTEM", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PCO_DTEM extends DayTradCardStateDto {
            PCO_DTEM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.PCO_DTEM;
            }
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DayTradeCardContextDto.DayTradCardStateDto.PCO_DTDT", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PCO_DTDT extends DayTradCardStateDto {
            PCO_DTDT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DayTradeCardContext.DayTradCardState toProto() {
                return DayTradeCardContext.DayTradCardState.PCO_DTDT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContext$DayTradCardState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DayTradCardStateDto, DayTradeCardContext.DayTradCardState> {

            /* compiled from: DayTradeCardContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DayTradeCardContext.DayTradCardState.values().length];
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.BELOW_25K.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.ABOVE_25K.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.PRELIMINARY_EM_CALL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.FINALIZED_EM_CALL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.DAY_TRADE_CALL_ACTIVE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.DAY_TRADE_CALL_PAST_DUE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.DAY_TRADE_CALL_MET.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.PRELIM_PCO_DTEM.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.PCO_DTEM.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[DayTradeCardContext.DayTradCardState.PCO_DTDT.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DayTradCardStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DayTradCardStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DayTradCardStateDto> getBinaryBase64Serializer() {
                return (KSerializer) DayTradCardStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DayTradeCardContext.DayTradCardState> getProtoAdapter() {
                return DayTradeCardContext.DayTradCardState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DayTradCardStateDto getZeroValue() {
                return DayTradCardStateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DayTradCardStateDto fromProto(DayTradeCardContext.DayTradCardState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return DayTradCardStateDto.STATE_UNSPECIFIED;
                    case 2:
                        return DayTradCardStateDto.BELOW_25K;
                    case 3:
                        return DayTradCardStateDto.ABOVE_25K;
                    case 4:
                        return DayTradCardStateDto.PRELIMINARY_EM_CALL;
                    case 5:
                        return DayTradCardStateDto.FINALIZED_EM_CALL;
                    case 6:
                        return DayTradCardStateDto.DAY_TRADE_CALL_ACTIVE;
                    case 7:
                        return DayTradCardStateDto.DAY_TRADE_CALL_PAST_DUE;
                    case 8:
                        return DayTradCardStateDto.DAY_TRADE_CALL_MET;
                    case 9:
                        return DayTradCardStateDto.PRELIM_PCO_DTEM;
                    case 10:
                        return DayTradCardStateDto.PCO_DTEM;
                    case 11:
                        return DayTradCardStateDto.PCO_DTDT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DayTradeCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$DayTradCardStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DayTradCardStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DayTradCardStateDto, DayTradeCardContext.DayTradCardState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DayTradeCardContext.DayTradCardState", DayTradCardStateDto.getEntries(), DayTradCardStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DayTradCardStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DayTradCardStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DayTradCardStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DayTradCardStateDto valueOf(String str) {
            return (DayTradCardStateDto) Enum.valueOf(DayTradCardStateDto.class, str);
        }

        public static DayTradCardStateDto[] values() {
            return (DayTradCardStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DayTradeCardContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DayTradeCardContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DayTradeCardContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DayTradeCardContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DayTradeCardContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DayTradeCardContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DayTradeCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DayTradeCardContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DayTradeCardContextDto";
        }
    }
}
