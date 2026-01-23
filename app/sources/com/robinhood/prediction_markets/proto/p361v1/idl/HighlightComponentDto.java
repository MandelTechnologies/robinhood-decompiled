package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventComponentDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ReserveHighlightComponentDto;
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

/* compiled from: HighlightComponentDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Surrogate;)V", "rank", "", "component", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;", "(ILcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;)V", "getRank", "()I", "getComponent", "()Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;", "event_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "getEvent_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "reserve_highlight_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "getReserve_highlight_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ComponentDto", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class HighlightComponentDto implements Dto3<HighlightComponent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HighlightComponentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HighlightComponentDto, HighlightComponent>> binaryBase64Serializer$delegate;
    private static final HighlightComponentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HighlightComponentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HighlightComponentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getRank() {
        return this.surrogate.getRank();
    }

    public final ComponentDto getComponent() {
        if (this.surrogate.getEvent_component() != null) {
            return new ComponentDto.EventComponent(this.surrogate.getEvent_component());
        }
        if (this.surrogate.getReserve_highlight_component() != null) {
            return new ComponentDto.ReserveHighlightComponent(this.surrogate.getReserve_highlight_component());
        }
        return null;
    }

    public final EventComponentDto getEvent_component() {
        return this.surrogate.getEvent_component();
    }

    public final ReserveHighlightComponentDto getReserve_highlight_component() {
        return this.surrogate.getReserve_highlight_component();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HighlightComponentDto(int i, ComponentDto componentDto) {
        ComponentDto.EventComponent eventComponent = componentDto instanceof ComponentDto.EventComponent ? (ComponentDto.EventComponent) componentDto : null;
        EventComponentDto value = eventComponent != null ? eventComponent.getValue() : null;
        ComponentDto.ReserveHighlightComponent reserveHighlightComponent = componentDto instanceof ComponentDto.ReserveHighlightComponent ? (ComponentDto.ReserveHighlightComponent) componentDto : null;
        this(new Surrogate(i, value, reserveHighlightComponent != null ? reserveHighlightComponent.getValue() : null));
    }

    public /* synthetic */ HighlightComponentDto(int i, ComponentDto componentDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : componentDto);
    }

    public static /* synthetic */ HighlightComponentDto copy$default(HighlightComponentDto highlightComponentDto, int i, ComponentDto componentDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = highlightComponentDto.surrogate.getRank();
        }
        if ((i2 & 2) != 0) {
            componentDto = highlightComponentDto.getComponent();
        }
        return highlightComponentDto.copy(i, componentDto);
    }

    public final HighlightComponentDto copy(int rank, ComponentDto component) {
        ComponentDto.EventComponent eventComponent = component instanceof ComponentDto.EventComponent ? (ComponentDto.EventComponent) component : null;
        EventComponentDto value = eventComponent != null ? eventComponent.getValue() : null;
        ComponentDto.ReserveHighlightComponent reserveHighlightComponent = component instanceof ComponentDto.ReserveHighlightComponent ? (ComponentDto.ReserveHighlightComponent) component : null;
        return new HighlightComponentDto(new Surrogate(rank, value, reserveHighlightComponent != null ? reserveHighlightComponent.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public HighlightComponent toProto() {
        int rank = this.surrogate.getRank();
        EventComponentDto event_component = this.surrogate.getEvent_component();
        EventComponent proto = event_component != null ? event_component.toProto() : null;
        ReserveHighlightComponentDto reserve_highlight_component = this.surrogate.getReserve_highlight_component();
        return new HighlightComponent(rank, proto, reserve_highlight_component != null ? reserve_highlight_component.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[HighlightComponentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HighlightComponentDto) && Intrinsics.areEqual(((HighlightComponentDto) other).surrogate, this.surrogate);
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
    /* compiled from: HighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002-.B8\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB7\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\u0018\u0010\u001b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J:\u0010\u001e\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Surrogate;", "", "rank", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "event_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "reserve_highlight_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "<init>", "(ILcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRank$annotations", "()V", "getRank", "()I", "getEvent_component$annotations", "getEvent_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "getReserve_highlight_component$annotations", "getReserve_highlight_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EventComponentDto event_component;
        private final int rank;
        private final ReserveHighlightComponentDto reserve_highlight_component;

        public Surrogate() {
            this(0, (EventComponentDto) null, (ReserveHighlightComponentDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, EventComponentDto eventComponentDto, ReserveHighlightComponentDto reserveHighlightComponentDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = surrogate.rank;
            }
            if ((i2 & 2) != 0) {
                eventComponentDto = surrogate.event_component;
            }
            if ((i2 & 4) != 0) {
                reserveHighlightComponentDto = surrogate.reserve_highlight_component;
            }
            return surrogate.copy(i, eventComponentDto, reserveHighlightComponentDto);
        }

        @SerialName("eventComponent")
        @JsonAnnotations2(names = {"event_component"})
        public static /* synthetic */ void getEvent_component$annotations() {
        }

        @SerialName("rank")
        @JsonAnnotations2(names = {"rank"})
        public static /* synthetic */ void getRank$annotations() {
        }

        @SerialName("reserveHighlightComponent")
        @JsonAnnotations2(names = {"reserve_highlight_component"})
        public static /* synthetic */ void getReserve_highlight_component$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component2, reason: from getter */
        public final EventComponentDto getEvent_component() {
            return this.event_component;
        }

        /* renamed from: component3, reason: from getter */
        public final ReserveHighlightComponentDto getReserve_highlight_component() {
            return this.reserve_highlight_component;
        }

        public final Surrogate copy(int rank, EventComponentDto event_component, ReserveHighlightComponentDto reserve_highlight_component) {
            return new Surrogate(rank, event_component, reserve_highlight_component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.rank == surrogate.rank && Intrinsics.areEqual(this.event_component, surrogate.event_component) && Intrinsics.areEqual(this.reserve_highlight_component, surrogate.reserve_highlight_component);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.rank) * 31;
            EventComponentDto eventComponentDto = this.event_component;
            int iHashCode2 = (iHashCode + (eventComponentDto == null ? 0 : eventComponentDto.hashCode())) * 31;
            ReserveHighlightComponentDto reserveHighlightComponentDto = this.reserve_highlight_component;
            return iHashCode2 + (reserveHighlightComponentDto != null ? reserveHighlightComponentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(rank=" + this.rank + ", event_component=" + this.event_component + ", reserve_highlight_component=" + this.reserve_highlight_component + ")";
        }

        /* compiled from: HighlightComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HighlightComponentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, EventComponentDto eventComponentDto, ReserveHighlightComponentDto reserveHighlightComponentDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.rank = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.event_component = null;
            } else {
                this.event_component = eventComponentDto;
            }
            if ((i & 4) == 0) {
                this.reserve_highlight_component = null;
            } else {
                this.reserve_highlight_component = reserveHighlightComponentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.rank;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            EventComponentDto eventComponentDto = self.event_component;
            if (eventComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, EventComponentDto.Serializer.INSTANCE, eventComponentDto);
            }
            ReserveHighlightComponentDto reserveHighlightComponentDto = self.reserve_highlight_component;
            if (reserveHighlightComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ReserveHighlightComponentDto.Serializer.INSTANCE, reserveHighlightComponentDto);
            }
        }

        public Surrogate(int i, EventComponentDto eventComponentDto, ReserveHighlightComponentDto reserveHighlightComponentDto) {
            this.rank = i;
            this.event_component = eventComponentDto;
            this.reserve_highlight_component = reserveHighlightComponentDto;
        }

        public /* synthetic */ Surrogate(int i, EventComponentDto eventComponentDto, ReserveHighlightComponentDto reserveHighlightComponentDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : eventComponentDto, (i2 & 4) != 0 ? null : reserveHighlightComponentDto);
        }

        public final int getRank() {
            return this.rank;
        }

        public final EventComponentDto getEvent_component() {
            return this.event_component;
        }

        public final ReserveHighlightComponentDto getReserve_highlight_component() {
            return this.reserve_highlight_component;
        }
    }

    /* compiled from: HighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HighlightComponentDto, HighlightComponent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HighlightComponentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightComponentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightComponentDto> getBinaryBase64Serializer() {
            return (KSerializer) HighlightComponentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HighlightComponent> getProtoAdapter() {
            return HighlightComponent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightComponentDto getZeroValue() {
            return HighlightComponentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightComponentDto fromProto(HighlightComponent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int rank = proto.getRank();
            EventComponent event_component = proto.getEvent_component();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EventComponentDto eventComponentDtoFromProto = event_component != null ? EventComponentDto.INSTANCE.fromProto(event_component) : null;
            ReserveHighlightComponent reserve_highlight_component = proto.getReserve_highlight_component();
            return new HighlightComponentDto(new Surrogate(rank, eventComponentDtoFromProto, reserve_highlight_component != null ? ReserveHighlightComponentDto.INSTANCE.fromProto(reserve_highlight_component) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.HighlightComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighlightComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new HighlightComponentDto(0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EventComponent", "ReserveHighlightComponent", "Companion", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto$EventComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto$ReserveHighlightComponent;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ComponentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ComponentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ComponentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: HighlightComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto$EventComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;", "value", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;)V", "getValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EventComponent extends ComponentDto {
            private final EventComponentDto value;

            public static /* synthetic */ EventComponent copy$default(EventComponent eventComponent, EventComponentDto eventComponentDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    eventComponentDto = eventComponent.value;
                }
                return eventComponent.copy(eventComponentDto);
            }

            /* renamed from: component1, reason: from getter */
            public final EventComponentDto getValue() {
                return this.value;
            }

            public final EventComponent copy(EventComponentDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new EventComponent(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EventComponent) && Intrinsics.areEqual(this.value, ((EventComponent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EventComponent(value=" + this.value + ")";
            }

            public final EventComponentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventComponent(EventComponentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto$ReserveHighlightComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;", "value", "Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;)V", "getValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ReserveHighlightComponentDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReserveHighlightComponent extends ComponentDto {
            private final ReserveHighlightComponentDto value;

            public static /* synthetic */ ReserveHighlightComponent copy$default(ReserveHighlightComponent reserveHighlightComponent, ReserveHighlightComponentDto reserveHighlightComponentDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    reserveHighlightComponentDto = reserveHighlightComponent.value;
                }
                return reserveHighlightComponent.copy(reserveHighlightComponentDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ReserveHighlightComponentDto getValue() {
                return this.value;
            }

            public final ReserveHighlightComponent copy(ReserveHighlightComponentDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ReserveHighlightComponent(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReserveHighlightComponent) && Intrinsics.areEqual(this.value, ((ReserveHighlightComponent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ReserveHighlightComponent(value=" + this.value + ")";
            }

            public final ReserveHighlightComponentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReserveHighlightComponent(ReserveHighlightComponentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$ComponentDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ComponentDto, HighlightComponent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HighlightComponent> getProtoAdapter() {
                return HighlightComponent.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComponentDto fromProto(HighlightComponent proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEvent_component() != null) {
                    return new EventComponent(EventComponentDto.INSTANCE.fromProto(proto.getEvent_component()));
                }
                if (proto.getReserve_highlight_component() != null) {
                    return new ReserveHighlightComponent(ReserveHighlightComponentDto.INSTANCE.fromProto(proto.getReserve_highlight_component()));
                }
                return null;
            }
        }
    }

    /* compiled from: HighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HighlightComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.HighlightComponent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HighlightComponentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HighlightComponentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HighlightComponentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: HighlightComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/HighlightComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.HighlightComponentDto";
        }
    }
}
