package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractStateDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractTradabilityDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CountEventContractsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate;)V", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "discoverable", "", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Ljava/lang/Boolean;)V", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "getDiscoverable", "()Ljava/lang/Boolean;", "copy", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Ljava/lang/Boolean;)Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class CountEventContractsRequestDto implements Dto3<CountEventContractsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CountEventContractsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CountEventContractsRequestDto, CountEventContractsRequest>> binaryBase64Serializer$delegate;
    private static final CountEventContractsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CountEventContractsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CountEventContractsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EventContractTradabilityDto getTradability() {
        return this.surrogate.getTradability();
    }

    public final EventContractStateDto getState() {
        return this.surrogate.getState();
    }

    public final Boolean getDiscoverable() {
        return this.surrogate.getDiscoverable();
    }

    public /* synthetic */ CountEventContractsRequestDto(EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eventContractTradabilityDto, (i & 2) != 0 ? null : eventContractStateDto, (i & 4) != 0 ? null : bool);
    }

    public CountEventContractsRequestDto(EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool) {
        this(new Surrogate(eventContractTradabilityDto, eventContractStateDto, bool));
    }

    public static /* synthetic */ CountEventContractsRequestDto copy$default(CountEventContractsRequestDto countEventContractsRequestDto, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContractTradabilityDto = countEventContractsRequestDto.surrogate.getTradability();
        }
        if ((i & 2) != 0) {
            eventContractStateDto = countEventContractsRequestDto.surrogate.getState();
        }
        if ((i & 4) != 0) {
            bool = countEventContractsRequestDto.surrogate.getDiscoverable();
        }
        return countEventContractsRequestDto.copy(eventContractTradabilityDto, eventContractStateDto, bool);
    }

    public final CountEventContractsRequestDto copy(EventContractTradabilityDto tradability, EventContractStateDto state, Boolean discoverable) {
        return new CountEventContractsRequestDto(new Surrogate(tradability, state, discoverable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CountEventContractsRequest toProto() {
        EventContractTradabilityDto tradability = this.surrogate.getTradability();
        EventContractTradability eventContractTradability = tradability != null ? (EventContractTradability) tradability.toProto() : null;
        EventContractStateDto state = this.surrogate.getState();
        return new CountEventContractsRequest(eventContractTradability, state != null ? (EventContractState) state.toProto() : null, this.surrogate.getDiscoverable(), null, 8, null);
    }

    public String toString() {
        return "[CountEventContractsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CountEventContractsRequestDto) && Intrinsics.areEqual(((CountEventContractsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CountEventContractsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate;", "", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "discoverable", "", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTradability$annotations", "()V", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "getState$annotations", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "getDiscoverable$annotations", "getDiscoverable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Ljava/lang/Boolean;)Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean discoverable;
        private final EventContractStateDto state;
        private final EventContractTradabilityDto tradability;

        public Surrogate() {
            this((EventContractTradabilityDto) null, (EventContractStateDto) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                eventContractTradabilityDto = surrogate.tradability;
            }
            if ((i & 2) != 0) {
                eventContractStateDto = surrogate.state;
            }
            if ((i & 4) != 0) {
                bool = surrogate.discoverable;
            }
            return surrogate.copy(eventContractTradabilityDto, eventContractStateDto, bool);
        }

        @SerialName("discoverable")
        @JsonAnnotations2(names = {"discoverable"})
        public static /* synthetic */ void getDiscoverable$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        /* renamed from: component2, reason: from getter */
        public final EventContractStateDto getState() {
            return this.state;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getDiscoverable() {
            return this.discoverable;
        }

        public final Surrogate copy(EventContractTradabilityDto tradability, EventContractStateDto state, Boolean discoverable) {
            return new Surrogate(tradability, state, discoverable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.tradability == surrogate.tradability && this.state == surrogate.state && Intrinsics.areEqual(this.discoverable, surrogate.discoverable);
        }

        public int hashCode() {
            EventContractTradabilityDto eventContractTradabilityDto = this.tradability;
            int iHashCode = (eventContractTradabilityDto == null ? 0 : eventContractTradabilityDto.hashCode()) * 31;
            EventContractStateDto eventContractStateDto = this.state;
            int iHashCode2 = (iHashCode + (eventContractStateDto == null ? 0 : eventContractStateDto.hashCode())) * 31;
            Boolean bool = this.discoverable;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(tradability=" + this.tradability + ", state=" + this.state + ", discoverable=" + this.discoverable + ")";
        }

        /* compiled from: CountEventContractsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CountEventContractsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tradability = null;
            } else {
                this.tradability = eventContractTradabilityDto;
            }
            if ((i & 2) == 0) {
                this.state = null;
            } else {
                this.state = eventContractStateDto;
            }
            if ((i & 4) == 0) {
                this.discoverable = null;
            } else {
                this.discoverable = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EventContractTradabilityDto eventContractTradabilityDto = self.tradability;
            if (eventContractTradabilityDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EventContractTradabilityDto.Serializer.INSTANCE, eventContractTradabilityDto);
            }
            EventContractStateDto eventContractStateDto = self.state;
            if (eventContractStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, EventContractStateDto.Serializer.INSTANCE, eventContractStateDto);
            }
            Boolean bool = self.discoverable;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool) {
            this.tradability = eventContractTradabilityDto;
            this.state = eventContractStateDto;
            this.discoverable = bool;
        }

        public /* synthetic */ Surrogate(EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eventContractTradabilityDto, (i & 2) != 0 ? null : eventContractStateDto, (i & 4) != 0 ? null : bool);
        }

        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        public final EventContractStateDto getState() {
            return this.state;
        }

        public final Boolean getDiscoverable() {
            return this.discoverable;
        }
    }

    /* compiled from: CountEventContractsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CountEventContractsRequestDto, CountEventContractsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CountEventContractsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CountEventContractsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CountEventContractsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CountEventContractsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CountEventContractsRequest> getProtoAdapter() {
            return CountEventContractsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CountEventContractsRequestDto getZeroValue() {
            return CountEventContractsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CountEventContractsRequestDto fromProto(CountEventContractsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EventContractTradability tradability = proto.getTradability();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EventContractTradabilityDto eventContractTradabilityDtoFromProto = tradability != null ? EventContractTradabilityDto.INSTANCE.fromProto(tradability) : null;
            EventContractState state = proto.getState();
            return new CountEventContractsRequestDto(new Surrogate(eventContractTradabilityDtoFromProto, state != null ? EventContractStateDto.INSTANCE.fromProto(state) : null, proto.getDiscoverable()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.CountEventContractsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CountEventContractsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CountEventContractsRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CountEventContractsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CountEventContractsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.CountEventContractsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CountEventContractsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CountEventContractsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CountEventContractsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CountEventContractsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.CountEventContractsRequestDto";
        }
    }
}
