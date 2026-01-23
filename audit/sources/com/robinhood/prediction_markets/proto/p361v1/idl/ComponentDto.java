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
import com.robinhood.prediction_markets.proto.p361v1.idl.SectionComponentDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.SectionDividerComponentDto;
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

/* compiled from: ComponentDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\tH\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\tH\u0016J\b\u0010+\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/Component;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Surrogate;)V", "rank", "", "component", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "(ILcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;)V", "getRank", "()I", "getComponent", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "section_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;", "getSection_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;", "event_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "getEvent_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "section_divider_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;", "getSection_divider_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ComponentDto", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ComponentDto implements Dto3<Component>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ComponentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ComponentDto, Component>> binaryBase64Serializer$delegate;
    private static final ComponentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ComponentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ComponentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getRank() {
        return this.surrogate.getRank();
    }

    public final AbstractC50662ComponentDto getComponent() {
        if (this.surrogate.getSection_component() != null) {
            return new AbstractC50662ComponentDto.SectionComponent(this.surrogate.getSection_component());
        }
        if (this.surrogate.getEvent_component() != null) {
            return new AbstractC50662ComponentDto.EventComponent(this.surrogate.getEvent_component());
        }
        if (this.surrogate.getSection_divider_component() != null) {
            return new AbstractC50662ComponentDto.SectionDividerComponent(this.surrogate.getSection_divider_component());
        }
        return null;
    }

    public final SectionComponentDto getSection_component() {
        return this.surrogate.getSection_component();
    }

    public final EventComponentDto getEvent_component() {
        return this.surrogate.getEvent_component();
    }

    public final SectionDividerComponentDto getSection_divider_component() {
        return this.surrogate.getSection_divider_component();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ComponentDto(int i, AbstractC50662ComponentDto abstractC50662ComponentDto) {
        AbstractC50662ComponentDto.SectionComponent sectionComponent = abstractC50662ComponentDto instanceof AbstractC50662ComponentDto.SectionComponent ? (AbstractC50662ComponentDto.SectionComponent) abstractC50662ComponentDto : null;
        SectionComponentDto value = sectionComponent != null ? sectionComponent.getValue() : null;
        AbstractC50662ComponentDto.EventComponent eventComponent = abstractC50662ComponentDto instanceof AbstractC50662ComponentDto.EventComponent ? (AbstractC50662ComponentDto.EventComponent) abstractC50662ComponentDto : null;
        EventComponentDto value2 = eventComponent != null ? eventComponent.getValue() : null;
        AbstractC50662ComponentDto.SectionDividerComponent sectionDividerComponent = abstractC50662ComponentDto instanceof AbstractC50662ComponentDto.SectionDividerComponent ? (AbstractC50662ComponentDto.SectionDividerComponent) abstractC50662ComponentDto : null;
        this(new Surrogate(i, value, value2, sectionDividerComponent != null ? sectionDividerComponent.getValue() : null));
    }

    public /* synthetic */ ComponentDto(int i, AbstractC50662ComponentDto abstractC50662ComponentDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : abstractC50662ComponentDto);
    }

    public static /* synthetic */ ComponentDto copy$default(ComponentDto componentDto, int i, AbstractC50662ComponentDto abstractC50662ComponentDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = componentDto.surrogate.getRank();
        }
        if ((i2 & 2) != 0) {
            abstractC50662ComponentDto = componentDto.getComponent();
        }
        return componentDto.copy(i, abstractC50662ComponentDto);
    }

    public final ComponentDto copy(int rank, AbstractC50662ComponentDto component) {
        AbstractC50662ComponentDto.SectionComponent sectionComponent = component instanceof AbstractC50662ComponentDto.SectionComponent ? (AbstractC50662ComponentDto.SectionComponent) component : null;
        SectionComponentDto value = sectionComponent != null ? sectionComponent.getValue() : null;
        AbstractC50662ComponentDto.EventComponent eventComponent = component instanceof AbstractC50662ComponentDto.EventComponent ? (AbstractC50662ComponentDto.EventComponent) component : null;
        EventComponentDto value2 = eventComponent != null ? eventComponent.getValue() : null;
        AbstractC50662ComponentDto.SectionDividerComponent sectionDividerComponent = component instanceof AbstractC50662ComponentDto.SectionDividerComponent ? (AbstractC50662ComponentDto.SectionDividerComponent) component : null;
        return new ComponentDto(new Surrogate(rank, value, value2, sectionDividerComponent != null ? sectionDividerComponent.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public Component toProto() {
        int rank = this.surrogate.getRank();
        SectionComponentDto section_component = this.surrogate.getSection_component();
        SectionComponent proto = section_component != null ? section_component.toProto() : null;
        EventComponentDto event_component = this.surrogate.getEvent_component();
        EventComponent proto2 = event_component != null ? event_component.toProto() : null;
        SectionDividerComponentDto section_divider_component = this.surrogate.getSection_divider_component();
        return new Component(rank, proto, proto2, section_divider_component != null ? section_divider_component.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[com.robinhood.prediction_markets.proto.v1.idl.ComponentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ComponentDto) && Intrinsics.areEqual(((ComponentDto) other).surrogate, this.surrogate);
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
    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234BD\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010 \u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003JF\u0010$\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Surrogate;", "", "rank", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "section_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;", "event_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "section_divider_component", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;", "<init>", "(ILcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRank$annotations", "()V", "getRank", "()I", "getSection_component$annotations", "getSection_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;", "getEvent_component$annotations", "getEvent_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "getSection_divider_component$annotations", "getSection_divider_component", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EventComponentDto event_component;
        private final int rank;
        private final SectionComponentDto section_component;
        private final SectionDividerComponentDto section_divider_component;

        public Surrogate() {
            this(0, (SectionComponentDto) null, (EventComponentDto) null, (SectionDividerComponentDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, SectionComponentDto sectionComponentDto, EventComponentDto eventComponentDto, SectionDividerComponentDto sectionDividerComponentDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = surrogate.rank;
            }
            if ((i2 & 2) != 0) {
                sectionComponentDto = surrogate.section_component;
            }
            if ((i2 & 4) != 0) {
                eventComponentDto = surrogate.event_component;
            }
            if ((i2 & 8) != 0) {
                sectionDividerComponentDto = surrogate.section_divider_component;
            }
            return surrogate.copy(i, sectionComponentDto, eventComponentDto, sectionDividerComponentDto);
        }

        @SerialName("eventComponent")
        @JsonAnnotations2(names = {"event_component"})
        public static /* synthetic */ void getEvent_component$annotations() {
        }

        @SerialName("rank")
        @JsonAnnotations2(names = {"rank"})
        public static /* synthetic */ void getRank$annotations() {
        }

        @SerialName("sectionComponent")
        @JsonAnnotations2(names = {"section_component"})
        public static /* synthetic */ void getSection_component$annotations() {
        }

        @SerialName("sectionDividerComponent")
        @JsonAnnotations2(names = {"section_divider_component"})
        public static /* synthetic */ void getSection_divider_component$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component2, reason: from getter */
        public final SectionComponentDto getSection_component() {
            return this.section_component;
        }

        /* renamed from: component3, reason: from getter */
        public final EventComponentDto getEvent_component() {
            return this.event_component;
        }

        /* renamed from: component4, reason: from getter */
        public final SectionDividerComponentDto getSection_divider_component() {
            return this.section_divider_component;
        }

        public final Surrogate copy(int rank, SectionComponentDto section_component, EventComponentDto event_component, SectionDividerComponentDto section_divider_component) {
            return new Surrogate(rank, section_component, event_component, section_divider_component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.rank == surrogate.rank && Intrinsics.areEqual(this.section_component, surrogate.section_component) && Intrinsics.areEqual(this.event_component, surrogate.event_component) && Intrinsics.areEqual(this.section_divider_component, surrogate.section_divider_component);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.rank) * 31;
            SectionComponentDto sectionComponentDto = this.section_component;
            int iHashCode2 = (iHashCode + (sectionComponentDto == null ? 0 : sectionComponentDto.hashCode())) * 31;
            EventComponentDto eventComponentDto = this.event_component;
            int iHashCode3 = (iHashCode2 + (eventComponentDto == null ? 0 : eventComponentDto.hashCode())) * 31;
            SectionDividerComponentDto sectionDividerComponentDto = this.section_divider_component;
            return iHashCode3 + (sectionDividerComponentDto != null ? sectionDividerComponentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(rank=" + this.rank + ", section_component=" + this.section_component + ", event_component=" + this.event_component + ", section_divider_component=" + this.section_divider_component + ")";
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ComponentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, SectionComponentDto sectionComponentDto, EventComponentDto eventComponentDto, SectionDividerComponentDto sectionDividerComponentDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.rank = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.section_component = null;
            } else {
                this.section_component = sectionComponentDto;
            }
            if ((i & 4) == 0) {
                this.event_component = null;
            } else {
                this.event_component = eventComponentDto;
            }
            if ((i & 8) == 0) {
                this.section_divider_component = null;
            } else {
                this.section_divider_component = sectionDividerComponentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.rank;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            SectionComponentDto sectionComponentDto = self.section_component;
            if (sectionComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SectionComponentDto.Serializer.INSTANCE, sectionComponentDto);
            }
            EventComponentDto eventComponentDto = self.event_component;
            if (eventComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EventComponentDto.Serializer.INSTANCE, eventComponentDto);
            }
            SectionDividerComponentDto sectionDividerComponentDto = self.section_divider_component;
            if (sectionDividerComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SectionDividerComponentDto.Serializer.INSTANCE, sectionDividerComponentDto);
            }
        }

        public Surrogate(int i, SectionComponentDto sectionComponentDto, EventComponentDto eventComponentDto, SectionDividerComponentDto sectionDividerComponentDto) {
            this.rank = i;
            this.section_component = sectionComponentDto;
            this.event_component = eventComponentDto;
            this.section_divider_component = sectionDividerComponentDto;
        }

        public /* synthetic */ Surrogate(int i, SectionComponentDto sectionComponentDto, EventComponentDto eventComponentDto, SectionDividerComponentDto sectionDividerComponentDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : sectionComponentDto, (i2 & 4) != 0 ? null : eventComponentDto, (i2 & 8) != 0 ? null : sectionDividerComponentDto);
        }

        public final int getRank() {
            return this.rank;
        }

        public final SectionComponentDto getSection_component() {
            return this.section_component;
        }

        public final EventComponentDto getEvent_component() {
            return this.event_component;
        }

        public final SectionDividerComponentDto getSection_divider_component() {
            return this.section_divider_component;
        }
    }

    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/Component;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ComponentDto, Component> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ComponentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ComponentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ComponentDto> getBinaryBase64Serializer() {
            return (KSerializer) ComponentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Component> getProtoAdapter() {
            return Component.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ComponentDto getZeroValue() {
            return ComponentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ComponentDto fromProto(Component proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int rank = proto.getRank();
            SectionComponent section_component = proto.getSection_component();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SectionComponentDto sectionComponentDtoFromProto = section_component != null ? SectionComponentDto.INSTANCE.fromProto(section_component) : null;
            EventComponent event_component = proto.getEvent_component();
            EventComponentDto eventComponentDtoFromProto = event_component != null ? EventComponentDto.INSTANCE.fromProto(event_component) : null;
            SectionDividerComponent section_divider_component = proto.getSection_divider_component();
            return new ComponentDto(new Surrogate(rank, sectionComponentDtoFromProto, eventComponentDtoFromProto, section_divider_component != null ? SectionDividerComponentDto.INSTANCE.fromProto(section_divider_component) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ComponentDto(0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SectionComponent", "EventComponent", "SectionDividerComponent", "Companion", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$EventComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$SectionComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$SectionDividerComponent;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.ComponentDto$ComponentDto, reason: collision with other inner class name */
    public static abstract class AbstractC50662ComponentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AbstractC50662ComponentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC50662ComponentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$SectionComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "value", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;)V", "getValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionComponentDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.ComponentDto$ComponentDto$SectionComponent, reason: from toString */
        public static final /* data */ class SectionComponent extends AbstractC50662ComponentDto {
            private final SectionComponentDto value;

            public static /* synthetic */ SectionComponent copy$default(SectionComponent sectionComponent, SectionComponentDto sectionComponentDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    sectionComponentDto = sectionComponent.value;
                }
                return sectionComponent.copy(sectionComponentDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SectionComponentDto getValue() {
                return this.value;
            }

            public final SectionComponent copy(SectionComponentDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SectionComponent(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SectionComponent) && Intrinsics.areEqual(this.value, ((SectionComponent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SectionComponent(value=" + this.value + ")";
            }

            public final SectionComponentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionComponent(SectionComponentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$EventComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "value", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;)V", "getValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponentDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.ComponentDto$ComponentDto$EventComponent, reason: from toString */
        public static final /* data */ class EventComponent extends AbstractC50662ComponentDto {
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

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$SectionDividerComponent;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "value", "Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;)V", "getValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SectionDividerComponentDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.ComponentDto$ComponentDto$SectionDividerComponent, reason: from toString */
        public static final /* data */ class SectionDividerComponent extends AbstractC50662ComponentDto {
            private final SectionDividerComponentDto value;

            public static /* synthetic */ SectionDividerComponent copy$default(SectionDividerComponent sectionDividerComponent, SectionDividerComponentDto sectionDividerComponentDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    sectionDividerComponentDto = sectionDividerComponent.value;
                }
                return sectionDividerComponent.copy(sectionDividerComponentDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SectionDividerComponentDto getValue() {
                return this.value;
            }

            public final SectionDividerComponent copy(SectionDividerComponentDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SectionDividerComponent(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SectionDividerComponent) && Intrinsics.areEqual(this.value, ((SectionDividerComponent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SectionDividerComponent(value=" + this.value + ")";
            }

            public final SectionDividerComponentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionDividerComponent(SectionDividerComponentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$ComponentDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/Component;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.prediction_markets.proto.v1.idl.ComponentDto$ComponentDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto4.Creator<AbstractC50662ComponentDto, Component> {
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
            public ProtoAdapter<Component> getProtoAdapter() {
                return Component.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AbstractC50662ComponentDto fromProto(Component proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSection_component() != null) {
                    return new SectionComponent(SectionComponentDto.INSTANCE.fromProto(proto.getSection_component()));
                }
                if (proto.getEvent_component() != null) {
                    return new EventComponent(EventComponentDto.INSTANCE.fromProto(proto.getEvent_component()));
                }
                if (proto.getSection_divider_component() != null) {
                    return new SectionDividerComponent(SectionDividerComponentDto.INSTANCE.fromProto(proto.getSection_divider_component()));
                }
                return null;
            }
        }
    }

    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.Component", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ComponentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ComponentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ComponentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.ComponentDto";
        }
    }
}
