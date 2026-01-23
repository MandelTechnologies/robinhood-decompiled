package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentDto;
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

/* compiled from: ComponentDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005 !\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Component;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ComponentDto$Surrogate;)V", "component_type", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "identifier", "", "(Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;Ljava/lang/String;)V", "getComponent_type", "()Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "getIdentifier", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ComponentTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
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

    public final ComponentTypeDto getComponent_type() {
        return this.surrogate.getComponent_type();
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComponentDto(ComponentTypeDto component_type, String identifier) {
        this(new Surrogate(component_type, identifier));
        Intrinsics.checkNotNullParameter(component_type, "component_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    public /* synthetic */ ComponentDto(ComponentTypeDto componentTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ComponentTypeDto.INSTANCE.getZeroValue() : componentTypeDto, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ ComponentDto copy$default(ComponentDto componentDto, ComponentTypeDto componentTypeDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            componentTypeDto = componentDto.surrogate.getComponent_type();
        }
        if ((i & 2) != 0) {
            str = componentDto.surrogate.getIdentifier();
        }
        return componentDto.copy(componentTypeDto, str);
    }

    public final ComponentDto copy(ComponentTypeDto component_type, String identifier) {
        Intrinsics.checkNotNullParameter(component_type, "component_type");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new ComponentDto(new Surrogate(component_type, identifier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Component toProto() {
        return new Component((Component.ComponentType) this.surrogate.getComponent_type().toProto(), this.surrogate.getIdentifier(), null, 4, null);
    }

    public String toString() {
        return "[ComponentDto]:" + toProto();
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
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$Surrogate;", "", "component_type", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "identifier", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getComponent_type$annotations", "()V", "getComponent_type", "()Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "getIdentifier$annotations", "getIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ComponentTypeDto component_type;
        private final String identifier;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ComponentTypeDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ComponentTypeDto componentTypeDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                componentTypeDto = surrogate.component_type;
            }
            if ((i & 2) != 0) {
                str = surrogate.identifier;
            }
            return surrogate.copy(componentTypeDto, str);
        }

        @SerialName("componentType")
        @JsonAnnotations2(names = {"component_type"})
        public static /* synthetic */ void getComponent_type$annotations() {
        }

        @SerialName("identifier")
        @JsonAnnotations2(names = {"identifier"})
        public static /* synthetic */ void getIdentifier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ComponentTypeDto getComponent_type() {
            return this.component_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Surrogate copy(ComponentTypeDto component_type, String identifier) {
            Intrinsics.checkNotNullParameter(component_type, "component_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new Surrogate(component_type, identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.component_type == surrogate.component_type && Intrinsics.areEqual(this.identifier, surrogate.identifier);
        }

        public int hashCode() {
            return (this.component_type.hashCode() * 31) + this.identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(component_type=" + this.component_type + ", identifier=" + this.identifier + ")";
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ComponentDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ComponentTypeDto componentTypeDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.component_type = (i & 1) == 0 ? ComponentTypeDto.INSTANCE.getZeroValue() : componentTypeDto;
            if ((i & 2) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.component_type != ComponentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ComponentTypeDto.Serializer.INSTANCE, self.component_type);
            }
            if (Intrinsics.areEqual(self.identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.identifier);
        }

        public Surrogate(ComponentTypeDto component_type, String identifier) {
            Intrinsics.checkNotNullParameter(component_type, "component_type");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.component_type = component_type;
            this.identifier = identifier;
        }

        public final ComponentTypeDto getComponent_type() {
            return this.component_type;
        }

        public /* synthetic */ Surrogate(ComponentTypeDto componentTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ComponentTypeDto.INSTANCE.getZeroValue() : componentTypeDto, (i & 2) != 0 ? "" : str);
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "Lcom/robinhood/rosetta/eventlogging/Component;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            return new ComponentDto(new Surrogate(ComponentTypeDto.INSTANCE.fromProto(proto.getComponent_type()), proto.getIdentifier()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ComponentDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0003\bÌ\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 ×\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0004×\u0002Ø\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010Ð\u0002\u001a\u00030Ñ\u00022\b\u0010Ò\u0002\u001a\u00030Ó\u00022\b\u0010Ô\u0002\u001a\u00030Õ\u0002H\u0016J\n\u0010Ö\u0002\u001a\u00030Õ\u0002H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002¨\u0006Ù\u0002"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "COMPONENT_TYPE_UNSPECIFIED", "LOADING_PLACEHOLDER", "MAP", "QR_CODE", "INLINE_DEFINITION", "PUSH_NOTIFICATION", "MENU_ITEM", "EDUCATION_TOUR_TOOLTIP", "NEW_PRODUCT_CARD", "BALANCE_SECTION", "SHORTCUTS_FIRST_TIME_POPUP", "ACCOUNT_SWITCHER", "ACCOUNT_SWITCHER_BOTTOM_SHEET", "HOLDING_ROW", "PRICE_CHART", "RECURRING_ROW", "EXPLORE_ROW", "NOTIFICATION_CARD", "NOTIFICATION_CARD_STACK", "NOTIFICATION_COMPLETION_CARD", "SIDEBAR", "LIST_ROW", "LIST_HEADER", "SECTION_HEADER", "TOGGLE", "CARD", "SUCCESS_TOAST", "INFO_TAG", "FX_CONVERSION_TOOLTIP", "HERO_CARD", "TEXT_VIEW", "SEGMENTED_CONTROL", "TRADING_TRENDS_CHART", "SEGMENT", "TABLE", "HOLDING_SECTION", "SLIDER", "SCRUB_BAR", "STICKY_BOTTOM_SHEET", "LIVE_ACTIVITY", "BADGE", "STAKING_SECTION", "ADVANCED_ALERT_SETTINGS", "PRICE_ALERT_EDITOR", "ALERT_SETTING_ROW", "ALERT_SETTING_TOGGLE", "PRICE_ALERT_TYPE_SELECTOR", "CANCEL_ERROR_ALERT", "ERROR_ALERT", "ALERT", "ERROR_LOADING", "CANCEL_CONFIRMATION_ALERT", "ENABLE_PUSH_NOTIFICATIONS_ALERT", "CX_PHONE_UNAVAILABLE_ALERT", "CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET", "CX_CHAT_STATUS_BANNER", "CX_CHATBOT_BANNER", "UPDATE_EMPLOYER_INFO_ALERT", "DD_MANUAL_SETUP_ALERT", "EARLY_PAY_ENABLE_CONFIRMATION_ALERT", "EARLY_PAY_DISABLE_CONFIRMATION_ALERT", "EARLY_PAY_TOGGLE_LIMIT_ALERT", "ALERT_SHEET", "CX_CALL_STATUS_BANNER", "CONTACT_SIGNIN_BANNER", "INFO_BANNER", "HERO_BANNER", "STATUS_BANNER", "VERIFY_DEBIT_CARD_BANNER", "UPDATE_INVESTOR_PROFILE_BANNER", "ACCOUNT_CENTER_UPSELL_BANNER", "ADD_TO_LIST_BOTTOM_SHEET", "FEEDBACK_BOTTOM_SHEET", "DATE_PICKER_BOTTOM_SHEET", "BOTTOM_SHEET", "PASSKEY_ENROLLMENT_BOTTOM_SHEET", "KEYCHAIN_LOGIN_BOTTOM_SHEET", "GOLD_UPSELL_HOOK_DIALOG", "DONE_BUTTON", "CONTINUE_BUTTON", "BUTTON", "SKIP_BUTTON", "FILTERS_BUTTON", "ASSET_TICKER_BUTTON", "LINK_BUTTON", "BACK_BUTTON", "REVIEW_BUTTON", "RADIO_BUTTON", "DATE_RANGE_BUTTON", "CLOSE_BUTTON", "CANCEL_BUTTON", "DELETE_BUTTON", "NOT_YET_BUTTON", "HELP_BUTTON", "RECURRING_INVESTMENTS_BUTTON", "ASSET_CARD", "REDEMPTION_CARD", "RECOMMENDATIONS_BROWSE_CARD", "CRYPTO_NOTIFICATION_CARD", "SCREENER_PRESET_CARD", "BREAKING_NEWS_BANNER", "LIST_CHIP_GRID", "LIST_CAROUSEL", "CAROUSEL", "CHIP_GRID", "LIST_CHIP", "CHIP", "RECURRING_SUMMARY_DIALOG", "CALENDAR_DATE_PICKER", "SEARCH_RESULT_ROW", "ASSET_ROW", "ROW", "HISTORY_ROW", "RECENT_SEARCH_ROW", "L2E_ONBOARDING", "TEXT_FIELD", "SEARCH_BAR", "ERROR_TOAST", "HIDE_CX_CALL_STATUS_BANNER_TOAST", "ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST", "CX_CALL_ASSIGNED_TOAST", "MICROPHONE_PERMISSION_DIALOG", "PERMISSION_SETTINGS_DIALOG", "PROCESSING_ERROR_TOAST", "PERMISSION_ERROR_TOAST", "VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET", "CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET", "UPDATE_LIST_TOAST", "DD_SWITCHER_ENTRY_POINT", "SAFETY_LABEL_INFO_TAG", "TOOLTIP", "PERFORMANCE_SECTION", "STATS_SECTION", "GRAPH_SECTION", "POSITION_SECTION", "RESEARCH_REPORT_SECTION", "EARNINGS_SECTION", "PEOPLE_ALSO_VIEW_SECTION", "TRADE_BAR", "ETP_COMPOSITION_SECTION", "ABOUT_SECTION", "ANALYST_RATINGS_SECTION", "RELATED_LISTS_SECTION", "SHAREHOLDER_QA_SECTION", "HISTORY_SECTION", "ADVANCED_CHART", "UPCOMING_ACTIVITY_SECTION", "TAB", "NEWS_ROW", "HERO_NEWS_ROW", "VIDEO_ROW", "HERO_VIDEO_ROW", "FEATURE_CARD", "FEATURE_DISCOVERY_WIDGET", "MARKET_UPDATES", "MARKET_INDICATOR", "DIRECT_DEPOSIT_OPTION_ROW", "SETUP_DIRECT_DEPOSIT_ROW", "DEPOSIT_ROW", "WITHDRAW_ROW", "RECURRING_DEPOSITS_ROW", "PAY_BY_CHECK_ROW", "TRANSFER_ROW", "DROPDOWN_OPTION", "RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG", "PAYCHECK_SECTION", "DEBIT_CARD_KYC_BANNER", "ACH_TRANSFER_OPTION_CARD", "CRYPTO_TRANSFERS_ROW", "WIRE_TRANSFER_ROW", "WIRE_UPSELL", "TRANSFER_REWARD_PILL", "EARLY_PAY_TOGGLE", "EARLY_PAY_FAQ_ROW", "LIST_HERO", "LIST_ASSET_ROW", "LIST_CONTACTS", "LIST_VIDEO", "OPTION_INSTRUMENT_ROW", "OPTION_UNTRADABLE_INFO_BAR", "OPTION_NO_MARKETDATA_MESSAGE", "OPTION_PNL_CHART", "OPTION_CHAIN_STOCK_CHART", "OPTION_PENDING_ORDER_ROW", "OPTION_WATCHLIST_ITEM_ROW", "OPTION_ORDER_FORM_TYPE_SELECTOR", "OPTION_ORDER_FORM_TYPE_GEAR", "OPTION_ORDER_CONFIGURATION_SWITCH", "OPTION_ORDER_CONFIGURATION_ROW", "OPTION_UNTRADABLE_DIALOG", "OPTION_PCO_DIALOG", "OPTION_EXPIRATION_DIALOG", "OPTION_WATCHLIST_WELCOME_SHEET", "OPTION_PENDING_ORDER_DIALOG", "NO_POSITIONS_AVAILABLE_BOTTOM_SHEET", "STRATEGY_INTRO_CARD", "STRATEGY_SUMMARY_CARD", "OPTION_ORDER_MARKETABILITY_BANNER", "OPTION_ORDER_MARKETABILITY_TAG", "ROLLING_CASH_ACCOUNT_BOTTOM_SHEET", "STRATEGY_BUILDER_CARD", "OPTION_STRATEGY_CHAIN_BOTTOM_SHEET", "STRATEGY_ROW", "OPTION_SIMULATED_RETURNS_SLIDER", "OPTION_SIMULATED_RETURNS_CHART", "OPTION_ORDER_BID_ASK_BAR", "INDEX_OPTION_PCO_DIALOG", "OPTION_INSTRUMENT_PILL", "OPTION_DISPLAY_MODE_CARD", "RECURRING_FREQUENCY_ROW", "RECURRING_PAYMENT_METHOD_ROW", "RECURRING_HUB_ROW", "RECURRING_START_DATE_ROW", "RECURRING_AMOUNT_ROW", "REWARD_CLAIM_CERTIFICATE", "MERCHANT_REWARD_CAROUSEL", "MERCHANT_REWARD_OFFER_DETAIL", "MERCHANT_REWARD_STATE_EXPLANATION", "MERCHANT_REWARD_OFFER_CARD", "POST_REWARD_CLAIM_UPSELL_DIALOG", "ORDER_KIND_ROW", "ADD_ACCOUNT", "ORDER_TYPE_PICKER", "ACCOUNT_PCO_DIALOG", "INVESTMENT_BASKET_TOGGLE", "INVESTMENT_ADDED_TOAST", "BASKET_FULL_TOAST", "PERFORMANCE_CHART", "PERFORMANCE_CHART_SETTINGS", "SPAN_SELECTOR", "DAY_TRADE_COUNTER_ROW", "DAY_TRADE_COUNTER_GRAPHIC", "LEARNING_LESSON_CARD", "LEARNING_LESSON_ROW", "LEARNING_SECTION", "LEARNING_ENTRY_POINT", "LEARNING_MATCHING_EXERCISE", "LEARNING_MATCHING_EXERCISE_ENTITY", "LEARNING_MATCHING_EXERCISE_BUCKET", "LEARNING_FEEDBACK", "LEARNING_INTERSTITIAL", "LEARNING_QUIZ_CONTINUE_HINT", "EDUCATION_TOUR_CARD", "TRANSFER_DETAILS_ROW", "RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG", "RHY_CAROUSEL", "RHY_HOME_CARD", "RHY_HOME_STATUS_BANNER", "HOME_ATM_FINDER", "RHY_DD_UPSELL_POST_TRANSFER", "BACKUP_COVERAGE_TOGGLE", "FLAT_CASHBACK_BOTTOM_SHEET", "RHY_REFERRAL_CASH_OFFER_CARD", "RHY_WAITLIST_UPSELL_CARD", "RHY_WAITLIST_WAITING_CARD", "RHY_WAITLIST_CAT", "RHY_MIGRATION_BOTTOM_SHEET", "RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET", "RHY_TURBOTAX_OFFER_BUTTON_RHY", "RHY_TURBOTAX_OFFER_BUTTON_NON_RHY", "REFERRAL_BANNER", "ACCOUNT_CENTER_REFERRAL_ENTRY_POINT", "SWEEP_DISABLE_DIALOG", "SWEEP_PAUSED_DIALOG", "VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET", "CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG", "SWEPT_CASH_BALANCE_EXPLANATION_DIALOG", "CASH_SWEEP_ALREADY_ENABLED_DIALOG", "CASH_SWEEP_SECTION", "SLIP_SETTING_CARD", "LINK_DEBIT_CARD_BANNER", "SHAREHOLDER_LIST_SECTION", "MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET", "MARGIN_REQUIREMENT_SECTION", "IRA_TAX_WITHHOLDING_BOTTOM_SHEET", "ACCOUNT_SELECTOR", "BIOMETRIC_AUTH_BUTTON", "PORTFOLIO_TABLE_COLUMN_HEADING", "ASSET_DISPLAY_VALUE_DIALOG", "BUYING_POWER_ROW", "PORTFOLIO_CHART", "GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET", "GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET", "ASSET_SELECTOR", "PNL_CHART", "PNL_SETTINGS", "PNL_DETAIL_BOTTOM_SHEET", "REALIZED_GAIN_LOSS_SECTION", "FUTURES_TRADE_BAR", "FUTURES_LIST_SORT_BOTTOM_SHEET", "LADDER_NUX", "CASH_BALANCES_HOME_SECTION", "CORTEX_DIGEST_SECTION", "PILL", "EDUCATION_ROW", "NEWS_SECTION", "PENDING_ORDER_ROW", "PENDING_ORDER_SECTION", "TOKENIZED_STOCK_HOLDING_ROW", "TOKENIZED_STOCK_HOLDING_SECTION", "PERPETUALS_HOLDING_SECTION", "OPEN_POSITION_SUMMARY", "OPEN_POSITIONS_SECTION", "PENDING_ORDERS_SECTION", "EXPLORE_SECTION", "PNL_SECTION", "OPTION_PROFIT_AND_LOSS_CARD", "OPTION_PROFIT_AND_LOSS_SLIDER", "COMPANY_FINANCIALS_CHART", "CORTEX_DIGEST_UPSELL_SECTION", "COMPANY_FINANCIALS_SECTION", "WATCHLIST_ROW", "RETURNS_CHART", "SELECT_MENU", "OPTIONS_STATUS_SECTION", "FX_SWITCHER", "PROXY_VOTE_SECTION", "EVENT_CONTRACT_TRADE_OVERLAY_DIALOG", "OPTION_L3_ENTRYPOINT_TAG", "CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET", "DASHBOARD_PILL", "FEED_POST_ROW", "ACTIVITY_ITEM_ROW", "CONCIERGE_PLUS_UPSELL_BANNER", "RECURRING_INVESTMENTS_EQUITY_NUX", "EVENT_CONTRACT_COMBO_LEG", "EVENT_CONTRACT_STRIKE_PICKER", "INTEREST_SECTION", "CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ComponentTypeDto implements Dto2<Component.ComponentType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ComponentTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ComponentTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ComponentTypeDto, Component.ComponentType>> binaryBase64Serializer$delegate;
        public static final ComponentTypeDto COMPONENT_TYPE_UNSPECIFIED = new COMPONENT_TYPE_UNSPECIFIED("COMPONENT_TYPE_UNSPECIFIED", 0);
        public static final ComponentTypeDto LOADING_PLACEHOLDER = new LOADING_PLACEHOLDER("LOADING_PLACEHOLDER", 1);
        public static final ComponentTypeDto MAP = new MAP("MAP", 2);
        public static final ComponentTypeDto QR_CODE = new QR_CODE("QR_CODE", 3);
        public static final ComponentTypeDto INLINE_DEFINITION = new INLINE_DEFINITION("INLINE_DEFINITION", 4);
        public static final ComponentTypeDto PUSH_NOTIFICATION = new PUSH_NOTIFICATION("PUSH_NOTIFICATION", 5);
        public static final ComponentTypeDto MENU_ITEM = new MENU_ITEM("MENU_ITEM", 6);
        public static final ComponentTypeDto EDUCATION_TOUR_TOOLTIP = new EDUCATION_TOUR_TOOLTIP("EDUCATION_TOUR_TOOLTIP", 7);
        public static final ComponentTypeDto NEW_PRODUCT_CARD = new NEW_PRODUCT_CARD("NEW_PRODUCT_CARD", 8);
        public static final ComponentTypeDto BALANCE_SECTION = new BALANCE_SECTION("BALANCE_SECTION", 9);
        public static final ComponentTypeDto SHORTCUTS_FIRST_TIME_POPUP = new SHORTCUTS_FIRST_TIME_POPUP("SHORTCUTS_FIRST_TIME_POPUP", 10);
        public static final ComponentTypeDto ACCOUNT_SWITCHER = new ACCOUNT_SWITCHER("ACCOUNT_SWITCHER", 11);
        public static final ComponentTypeDto ACCOUNT_SWITCHER_BOTTOM_SHEET = new ACCOUNT_SWITCHER_BOTTOM_SHEET("ACCOUNT_SWITCHER_BOTTOM_SHEET", 12);
        public static final ComponentTypeDto HOLDING_ROW = new HOLDING_ROW("HOLDING_ROW", 13);
        public static final ComponentTypeDto PRICE_CHART = new PRICE_CHART("PRICE_CHART", 14);
        public static final ComponentTypeDto RECURRING_ROW = new RECURRING_ROW("RECURRING_ROW", 15);
        public static final ComponentTypeDto EXPLORE_ROW = new EXPLORE_ROW("EXPLORE_ROW", 16);
        public static final ComponentTypeDto NOTIFICATION_CARD = new NOTIFICATION_CARD("NOTIFICATION_CARD", 17);
        public static final ComponentTypeDto NOTIFICATION_CARD_STACK = new NOTIFICATION_CARD_STACK("NOTIFICATION_CARD_STACK", 18);
        public static final ComponentTypeDto NOTIFICATION_COMPLETION_CARD = new NOTIFICATION_COMPLETION_CARD("NOTIFICATION_COMPLETION_CARD", 19);
        public static final ComponentTypeDto SIDEBAR = new SIDEBAR("SIDEBAR", 20);
        public static final ComponentTypeDto LIST_ROW = new LIST_ROW("LIST_ROW", 21);
        public static final ComponentTypeDto LIST_HEADER = new LIST_HEADER("LIST_HEADER", 22);
        public static final ComponentTypeDto SECTION_HEADER = new SECTION_HEADER("SECTION_HEADER", 23);
        public static final ComponentTypeDto TOGGLE = new TOGGLE("TOGGLE", 24);
        public static final ComponentTypeDto CARD = new CARD("CARD", 25);
        public static final ComponentTypeDto SUCCESS_TOAST = new SUCCESS_TOAST("SUCCESS_TOAST", 26);
        public static final ComponentTypeDto INFO_TAG = new INFO_TAG("INFO_TAG", 27);
        public static final ComponentTypeDto FX_CONVERSION_TOOLTIP = new FX_CONVERSION_TOOLTIP("FX_CONVERSION_TOOLTIP", 28);
        public static final ComponentTypeDto HERO_CARD = new HERO_CARD("HERO_CARD", 29);
        public static final ComponentTypeDto TEXT_VIEW = new TEXT_VIEW("TEXT_VIEW", 30);
        public static final ComponentTypeDto SEGMENTED_CONTROL = new SEGMENTED_CONTROL("SEGMENTED_CONTROL", 31);
        public static final ComponentTypeDto TRADING_TRENDS_CHART = new TRADING_TRENDS_CHART("TRADING_TRENDS_CHART", 32);
        public static final ComponentTypeDto SEGMENT = new SEGMENT("SEGMENT", 33);
        public static final ComponentTypeDto TABLE = new TABLE("TABLE", 34);
        public static final ComponentTypeDto HOLDING_SECTION = new HOLDING_SECTION("HOLDING_SECTION", 35);
        public static final ComponentTypeDto SLIDER = new SLIDER("SLIDER", 36);
        public static final ComponentTypeDto SCRUB_BAR = new SCRUB_BAR("SCRUB_BAR", 37);
        public static final ComponentTypeDto STICKY_BOTTOM_SHEET = new STICKY_BOTTOM_SHEET("STICKY_BOTTOM_SHEET", 38);
        public static final ComponentTypeDto LIVE_ACTIVITY = new LIVE_ACTIVITY("LIVE_ACTIVITY", 39);
        public static final ComponentTypeDto BADGE = new BADGE("BADGE", 40);
        public static final ComponentTypeDto STAKING_SECTION = new STAKING_SECTION("STAKING_SECTION", 41);
        public static final ComponentTypeDto ADVANCED_ALERT_SETTINGS = new ADVANCED_ALERT_SETTINGS("ADVANCED_ALERT_SETTINGS", 42);
        public static final ComponentTypeDto PRICE_ALERT_EDITOR = new PRICE_ALERT_EDITOR("PRICE_ALERT_EDITOR", 43);
        public static final ComponentTypeDto ALERT_SETTING_ROW = new ALERT_SETTING_ROW("ALERT_SETTING_ROW", 44);
        public static final ComponentTypeDto ALERT_SETTING_TOGGLE = new ALERT_SETTING_TOGGLE("ALERT_SETTING_TOGGLE", 45);
        public static final ComponentTypeDto PRICE_ALERT_TYPE_SELECTOR = new PRICE_ALERT_TYPE_SELECTOR("PRICE_ALERT_TYPE_SELECTOR", 46);
        public static final ComponentTypeDto CANCEL_ERROR_ALERT = new CANCEL_ERROR_ALERT("CANCEL_ERROR_ALERT", 47);
        public static final ComponentTypeDto ERROR_ALERT = new ERROR_ALERT("ERROR_ALERT", 48);
        public static final ComponentTypeDto ALERT = new ALERT("ALERT", 49);
        public static final ComponentTypeDto ERROR_LOADING = new ERROR_LOADING("ERROR_LOADING", 50);
        public static final ComponentTypeDto CANCEL_CONFIRMATION_ALERT = new CANCEL_CONFIRMATION_ALERT("CANCEL_CONFIRMATION_ALERT", 51);
        public static final ComponentTypeDto ENABLE_PUSH_NOTIFICATIONS_ALERT = new ENABLE_PUSH_NOTIFICATIONS_ALERT("ENABLE_PUSH_NOTIFICATIONS_ALERT", 52);
        public static final ComponentTypeDto CX_PHONE_UNAVAILABLE_ALERT = new CX_PHONE_UNAVAILABLE_ALERT("CX_PHONE_UNAVAILABLE_ALERT", 53);
        public static final ComponentTypeDto CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET = new CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET("CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET", 54);
        public static final ComponentTypeDto CX_CHAT_STATUS_BANNER = new CX_CHAT_STATUS_BANNER("CX_CHAT_STATUS_BANNER", 55);
        public static final ComponentTypeDto CX_CHATBOT_BANNER = new CX_CHATBOT_BANNER("CX_CHATBOT_BANNER", 56);
        public static final ComponentTypeDto UPDATE_EMPLOYER_INFO_ALERT = new UPDATE_EMPLOYER_INFO_ALERT("UPDATE_EMPLOYER_INFO_ALERT", 57);
        public static final ComponentTypeDto DD_MANUAL_SETUP_ALERT = new DD_MANUAL_SETUP_ALERT("DD_MANUAL_SETUP_ALERT", 58);
        public static final ComponentTypeDto EARLY_PAY_ENABLE_CONFIRMATION_ALERT = new EARLY_PAY_ENABLE_CONFIRMATION_ALERT("EARLY_PAY_ENABLE_CONFIRMATION_ALERT", 59);
        public static final ComponentTypeDto EARLY_PAY_DISABLE_CONFIRMATION_ALERT = new EARLY_PAY_DISABLE_CONFIRMATION_ALERT("EARLY_PAY_DISABLE_CONFIRMATION_ALERT", 60);
        public static final ComponentTypeDto EARLY_PAY_TOGGLE_LIMIT_ALERT = new EARLY_PAY_TOGGLE_LIMIT_ALERT("EARLY_PAY_TOGGLE_LIMIT_ALERT", 61);
        public static final ComponentTypeDto ALERT_SHEET = new ALERT_SHEET("ALERT_SHEET", 62);
        public static final ComponentTypeDto CX_CALL_STATUS_BANNER = new CX_CALL_STATUS_BANNER("CX_CALL_STATUS_BANNER", 63);
        public static final ComponentTypeDto CONTACT_SIGNIN_BANNER = new CONTACT_SIGNIN_BANNER("CONTACT_SIGNIN_BANNER", 64);
        public static final ComponentTypeDto INFO_BANNER = new INFO_BANNER("INFO_BANNER", 65);
        public static final ComponentTypeDto HERO_BANNER = new HERO_BANNER("HERO_BANNER", 66);
        public static final ComponentTypeDto STATUS_BANNER = new STATUS_BANNER("STATUS_BANNER", 67);
        public static final ComponentTypeDto VERIFY_DEBIT_CARD_BANNER = new VERIFY_DEBIT_CARD_BANNER("VERIFY_DEBIT_CARD_BANNER", 68);
        public static final ComponentTypeDto UPDATE_INVESTOR_PROFILE_BANNER = new UPDATE_INVESTOR_PROFILE_BANNER("UPDATE_INVESTOR_PROFILE_BANNER", 69);
        public static final ComponentTypeDto ACCOUNT_CENTER_UPSELL_BANNER = new ACCOUNT_CENTER_UPSELL_BANNER("ACCOUNT_CENTER_UPSELL_BANNER", 70);
        public static final ComponentTypeDto ADD_TO_LIST_BOTTOM_SHEET = new ADD_TO_LIST_BOTTOM_SHEET("ADD_TO_LIST_BOTTOM_SHEET", 71);
        public static final ComponentTypeDto FEEDBACK_BOTTOM_SHEET = new FEEDBACK_BOTTOM_SHEET("FEEDBACK_BOTTOM_SHEET", 72);
        public static final ComponentTypeDto DATE_PICKER_BOTTOM_SHEET = new DATE_PICKER_BOTTOM_SHEET("DATE_PICKER_BOTTOM_SHEET", 73);
        public static final ComponentTypeDto BOTTOM_SHEET = new BOTTOM_SHEET("BOTTOM_SHEET", 74);
        public static final ComponentTypeDto PASSKEY_ENROLLMENT_BOTTOM_SHEET = new PASSKEY_ENROLLMENT_BOTTOM_SHEET("PASSKEY_ENROLLMENT_BOTTOM_SHEET", 75);
        public static final ComponentTypeDto KEYCHAIN_LOGIN_BOTTOM_SHEET = new KEYCHAIN_LOGIN_BOTTOM_SHEET("KEYCHAIN_LOGIN_BOTTOM_SHEET", 76);
        public static final ComponentTypeDto GOLD_UPSELL_HOOK_DIALOG = new GOLD_UPSELL_HOOK_DIALOG("GOLD_UPSELL_HOOK_DIALOG", 77);
        public static final ComponentTypeDto DONE_BUTTON = new DONE_BUTTON("DONE_BUTTON", 78);
        public static final ComponentTypeDto CONTINUE_BUTTON = new CONTINUE_BUTTON("CONTINUE_BUTTON", 79);
        public static final ComponentTypeDto BUTTON = new BUTTON("BUTTON", 80);
        public static final ComponentTypeDto SKIP_BUTTON = new SKIP_BUTTON("SKIP_BUTTON", 81);
        public static final ComponentTypeDto FILTERS_BUTTON = new FILTERS_BUTTON("FILTERS_BUTTON", 82);
        public static final ComponentTypeDto ASSET_TICKER_BUTTON = new ASSET_TICKER_BUTTON("ASSET_TICKER_BUTTON", 83);
        public static final ComponentTypeDto LINK_BUTTON = new LINK_BUTTON("LINK_BUTTON", 84);
        public static final ComponentTypeDto BACK_BUTTON = new BACK_BUTTON("BACK_BUTTON", 85);
        public static final ComponentTypeDto REVIEW_BUTTON = new REVIEW_BUTTON("REVIEW_BUTTON", 86);
        public static final ComponentTypeDto RADIO_BUTTON = new RADIO_BUTTON("RADIO_BUTTON", 87);
        public static final ComponentTypeDto DATE_RANGE_BUTTON = new DATE_RANGE_BUTTON("DATE_RANGE_BUTTON", 88);
        public static final ComponentTypeDto CLOSE_BUTTON = new CLOSE_BUTTON("CLOSE_BUTTON", 89);
        public static final ComponentTypeDto CANCEL_BUTTON = new CANCEL_BUTTON("CANCEL_BUTTON", 90);
        public static final ComponentTypeDto DELETE_BUTTON = new DELETE_BUTTON("DELETE_BUTTON", 91);
        public static final ComponentTypeDto NOT_YET_BUTTON = new NOT_YET_BUTTON("NOT_YET_BUTTON", 92);
        public static final ComponentTypeDto HELP_BUTTON = new HELP_BUTTON("HELP_BUTTON", 93);
        public static final ComponentTypeDto RECURRING_INVESTMENTS_BUTTON = new RECURRING_INVESTMENTS_BUTTON("RECURRING_INVESTMENTS_BUTTON", 94);
        public static final ComponentTypeDto ASSET_CARD = new ASSET_CARD("ASSET_CARD", 95);
        public static final ComponentTypeDto REDEMPTION_CARD = new REDEMPTION_CARD("REDEMPTION_CARD", 96);
        public static final ComponentTypeDto RECOMMENDATIONS_BROWSE_CARD = new RECOMMENDATIONS_BROWSE_CARD("RECOMMENDATIONS_BROWSE_CARD", 97);
        public static final ComponentTypeDto CRYPTO_NOTIFICATION_CARD = new CRYPTO_NOTIFICATION_CARD("CRYPTO_NOTIFICATION_CARD", 98);
        public static final ComponentTypeDto SCREENER_PRESET_CARD = new SCREENER_PRESET_CARD("SCREENER_PRESET_CARD", 99);
        public static final ComponentTypeDto BREAKING_NEWS_BANNER = new BREAKING_NEWS_BANNER("BREAKING_NEWS_BANNER", 100);
        public static final ComponentTypeDto LIST_CHIP_GRID = new LIST_CHIP_GRID("LIST_CHIP_GRID", 101);
        public static final ComponentTypeDto LIST_CAROUSEL = new LIST_CAROUSEL("LIST_CAROUSEL", 102);
        public static final ComponentTypeDto CAROUSEL = new CAROUSEL("CAROUSEL", 103);
        public static final ComponentTypeDto CHIP_GRID = new CHIP_GRID("CHIP_GRID", 104);
        public static final ComponentTypeDto LIST_CHIP = new LIST_CHIP("LIST_CHIP", 105);
        public static final ComponentTypeDto CHIP = new CHIP("CHIP", 106);
        public static final ComponentTypeDto RECURRING_SUMMARY_DIALOG = new RECURRING_SUMMARY_DIALOG("RECURRING_SUMMARY_DIALOG", 107);
        public static final ComponentTypeDto CALENDAR_DATE_PICKER = new CALENDAR_DATE_PICKER("CALENDAR_DATE_PICKER", 108);
        public static final ComponentTypeDto SEARCH_RESULT_ROW = new SEARCH_RESULT_ROW("SEARCH_RESULT_ROW", 109);
        public static final ComponentTypeDto ASSET_ROW = new ASSET_ROW("ASSET_ROW", 110);
        public static final ComponentTypeDto ROW = new ROW("ROW", 111);
        public static final ComponentTypeDto HISTORY_ROW = new HISTORY_ROW("HISTORY_ROW", 112);
        public static final ComponentTypeDto RECENT_SEARCH_ROW = new RECENT_SEARCH_ROW("RECENT_SEARCH_ROW", 113);
        public static final ComponentTypeDto L2E_ONBOARDING = new L2E_ONBOARDING("L2E_ONBOARDING", 114);
        public static final ComponentTypeDto TEXT_FIELD = new TEXT_FIELD("TEXT_FIELD", 115);
        public static final ComponentTypeDto SEARCH_BAR = new SEARCH_BAR("SEARCH_BAR", 116);
        public static final ComponentTypeDto ERROR_TOAST = new ERROR_TOAST("ERROR_TOAST", 117);
        public static final ComponentTypeDto HIDE_CX_CALL_STATUS_BANNER_TOAST = new HIDE_CX_CALL_STATUS_BANNER_TOAST("HIDE_CX_CALL_STATUS_BANNER_TOAST", 118);
        public static final ComponentTypeDto ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST = new ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST("ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST", 119);
        public static final ComponentTypeDto CX_CALL_ASSIGNED_TOAST = new CX_CALL_ASSIGNED_TOAST("CX_CALL_ASSIGNED_TOAST", 120);
        public static final ComponentTypeDto MICROPHONE_PERMISSION_DIALOG = new MICROPHONE_PERMISSION_DIALOG("MICROPHONE_PERMISSION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
        public static final ComponentTypeDto PERMISSION_SETTINGS_DIALOG = new PERMISSION_SETTINGS_DIALOG("PERMISSION_SETTINGS_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        public static final ComponentTypeDto PROCESSING_ERROR_TOAST = new PROCESSING_ERROR_TOAST("PROCESSING_ERROR_TOAST", 123);
        public static final ComponentTypeDto PERMISSION_ERROR_TOAST = new PERMISSION_ERROR_TOAST("PERMISSION_ERROR_TOAST", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        public static final ComponentTypeDto VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET = new VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET("VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET", 125);
        public static final ComponentTypeDto CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET = new CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET("CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        public static final ComponentTypeDto UPDATE_LIST_TOAST = new UPDATE_LIST_TOAST("UPDATE_LIST_TOAST", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
        public static final ComponentTypeDto DD_SWITCHER_ENTRY_POINT = new DD_SWITCHER_ENTRY_POINT("DD_SWITCHER_ENTRY_POINT", 128);
        public static final ComponentTypeDto SAFETY_LABEL_INFO_TAG = new SAFETY_LABEL_INFO_TAG("SAFETY_LABEL_INFO_TAG", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        public static final ComponentTypeDto TOOLTIP = new TOOLTIP("TOOLTIP", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        public static final ComponentTypeDto PERFORMANCE_SECTION = new PERFORMANCE_SECTION("PERFORMANCE_SECTION", 131);
        public static final ComponentTypeDto STATS_SECTION = new STATS_SECTION("STATS_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        public static final ComponentTypeDto GRAPH_SECTION = new GRAPH_SECTION("GRAPH_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
        public static final ComponentTypeDto POSITION_SECTION = new POSITION_SECTION("POSITION_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
        public static final ComponentTypeDto RESEARCH_REPORT_SECTION = new RESEARCH_REPORT_SECTION("RESEARCH_REPORT_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
        public static final ComponentTypeDto EARNINGS_SECTION = new EARNINGS_SECTION("EARNINGS_SECTION", 136);
        public static final ComponentTypeDto PEOPLE_ALSO_VIEW_SECTION = new PEOPLE_ALSO_VIEW_SECTION("PEOPLE_ALSO_VIEW_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
        public static final ComponentTypeDto TRADE_BAR = new TRADE_BAR("TRADE_BAR", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
        public static final ComponentTypeDto ETP_COMPOSITION_SECTION = new ETP_COMPOSITION_SECTION("ETP_COMPOSITION_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
        public static final ComponentTypeDto ABOUT_SECTION = new ABOUT_SECTION("ABOUT_SECTION", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
        public static final ComponentTypeDto ANALYST_RATINGS_SECTION = new ANALYST_RATINGS_SECTION("ANALYST_RATINGS_SECTION", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
        public static final ComponentTypeDto RELATED_LISTS_SECTION = new RELATED_LISTS_SECTION("RELATED_LISTS_SECTION", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
        public static final ComponentTypeDto SHAREHOLDER_QA_SECTION = new SHAREHOLDER_QA_SECTION("SHAREHOLDER_QA_SECTION", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
        public static final ComponentTypeDto HISTORY_SECTION = new HISTORY_SECTION("HISTORY_SECTION", 144);
        public static final ComponentTypeDto ADVANCED_CHART = new ADVANCED_CHART("ADVANCED_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
        public static final ComponentTypeDto UPCOMING_ACTIVITY_SECTION = new UPCOMING_ACTIVITY_SECTION("UPCOMING_ACTIVITY_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
        public static final ComponentTypeDto TAB = new TAB("TAB", 147);
        public static final ComponentTypeDto NEWS_ROW = new NEWS_ROW("NEWS_ROW", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
        public static final ComponentTypeDto HERO_NEWS_ROW = new HERO_NEWS_ROW("HERO_NEWS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
        public static final ComponentTypeDto VIDEO_ROW = new VIDEO_ROW("VIDEO_ROW", 150);
        public static final ComponentTypeDto HERO_VIDEO_ROW = new HERO_VIDEO_ROW("HERO_VIDEO_ROW", 151);
        public static final ComponentTypeDto FEATURE_CARD = new FEATURE_CARD("FEATURE_CARD", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        public static final ComponentTypeDto FEATURE_DISCOVERY_WIDGET = new FEATURE_DISCOVERY_WIDGET("FEATURE_DISCOVERY_WIDGET", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
        public static final ComponentTypeDto MARKET_UPDATES = new MARKET_UPDATES("MARKET_UPDATES", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
        public static final ComponentTypeDto MARKET_INDICATOR = new MARKET_INDICATOR("MARKET_INDICATOR", 155);
        public static final ComponentTypeDto DIRECT_DEPOSIT_OPTION_ROW = new DIRECT_DEPOSIT_OPTION_ROW("DIRECT_DEPOSIT_OPTION_ROW", 156);
        public static final ComponentTypeDto SETUP_DIRECT_DEPOSIT_ROW = new SETUP_DIRECT_DEPOSIT_ROW("SETUP_DIRECT_DEPOSIT_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
        public static final ComponentTypeDto DEPOSIT_ROW = new DEPOSIT_ROW("DEPOSIT_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        public static final ComponentTypeDto WITHDRAW_ROW = new WITHDRAW_ROW("WITHDRAW_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
        public static final ComponentTypeDto RECURRING_DEPOSITS_ROW = new RECURRING_DEPOSITS_ROW("RECURRING_DEPOSITS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        public static final ComponentTypeDto PAY_BY_CHECK_ROW = new PAY_BY_CHECK_ROW("PAY_BY_CHECK_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
        public static final ComponentTypeDto TRANSFER_ROW = new TRANSFER_ROW("TRANSFER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
        public static final ComponentTypeDto DROPDOWN_OPTION = new DROPDOWN_OPTION("DROPDOWN_OPTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
        public static final ComponentTypeDto RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG = new RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG("RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
        public static final ComponentTypeDto PAYCHECK_SECTION = new PAYCHECK_SECTION("PAYCHECK_SECTION", 165);
        public static final ComponentTypeDto DEBIT_CARD_KYC_BANNER = new DEBIT_CARD_KYC_BANNER("DEBIT_CARD_KYC_BANNER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
        public static final ComponentTypeDto ACH_TRANSFER_OPTION_CARD = new ACH_TRANSFER_OPTION_CARD("ACH_TRANSFER_OPTION_CARD", 167);
        public static final ComponentTypeDto CRYPTO_TRANSFERS_ROW = new CRYPTO_TRANSFERS_ROW("CRYPTO_TRANSFERS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        public static final ComponentTypeDto WIRE_TRANSFER_ROW = new WIRE_TRANSFER_ROW("WIRE_TRANSFER_ROW", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
        public static final ComponentTypeDto WIRE_UPSELL = new WIRE_UPSELL("WIRE_UPSELL", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
        public static final ComponentTypeDto TRANSFER_REWARD_PILL = new TRANSFER_REWARD_PILL("TRANSFER_REWARD_PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
        public static final ComponentTypeDto EARLY_PAY_TOGGLE = new EARLY_PAY_TOGGLE("EARLY_PAY_TOGGLE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto EARLY_PAY_FAQ_ROW = new EARLY_PAY_FAQ_ROW("EARLY_PAY_FAQ_ROW", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto LIST_HERO = new LIST_HERO("LIST_HERO", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
        public static final ComponentTypeDto LIST_ASSET_ROW = new LIST_ASSET_ROW("LIST_ASSET_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto LIST_CONTACTS = new LIST_CONTACTS("LIST_CONTACTS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto LIST_VIDEO = new LIST_VIDEO("LIST_VIDEO", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto OPTION_INSTRUMENT_ROW = new OPTION_INSTRUMENT_ROW("OPTION_INSTRUMENT_ROW", EnumC7081g.f2773x8d9721ad);
        public static final ComponentTypeDto OPTION_UNTRADABLE_INFO_BAR = new OPTION_UNTRADABLE_INFO_BAR("OPTION_UNTRADABLE_INFO_BAR", EnumC7081g.f2780x600b66fe);
        public static final ComponentTypeDto OPTION_NO_MARKETDATA_MESSAGE = new OPTION_NO_MARKETDATA_MESSAGE("OPTION_NO_MARKETDATA_MESSAGE", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
        public static final ComponentTypeDto OPTION_PNL_CHART = new OPTION_PNL_CHART("OPTION_PNL_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
        public static final ComponentTypeDto OPTION_CHAIN_STOCK_CHART = new OPTION_CHAIN_STOCK_CHART("OPTION_CHAIN_STOCK_CHART", 182);
        public static final ComponentTypeDto OPTION_PENDING_ORDER_ROW = new OPTION_PENDING_ORDER_ROW("OPTION_PENDING_ORDER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
        public static final ComponentTypeDto OPTION_WATCHLIST_ITEM_ROW = new OPTION_WATCHLIST_ITEM_ROW("OPTION_WATCHLIST_ITEM_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
        public static final ComponentTypeDto OPTION_ORDER_FORM_TYPE_SELECTOR = new OPTION_ORDER_FORM_TYPE_SELECTOR("OPTION_ORDER_FORM_TYPE_SELECTOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
        public static final ComponentTypeDto OPTION_ORDER_FORM_TYPE_GEAR = new OPTION_ORDER_FORM_TYPE_GEAR("OPTION_ORDER_FORM_TYPE_GEAR", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
        public static final ComponentTypeDto OPTION_ORDER_CONFIGURATION_SWITCH = new OPTION_ORDER_CONFIGURATION_SWITCH("OPTION_ORDER_CONFIGURATION_SWITCH", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
        public static final ComponentTypeDto OPTION_ORDER_CONFIGURATION_ROW = new OPTION_ORDER_CONFIGURATION_ROW("OPTION_ORDER_CONFIGURATION_ROW", 188);
        public static final ComponentTypeDto OPTION_UNTRADABLE_DIALOG = new OPTION_UNTRADABLE_DIALOG("OPTION_UNTRADABLE_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
        public static final ComponentTypeDto OPTION_PCO_DIALOG = new OPTION_PCO_DIALOG("OPTION_PCO_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
        public static final ComponentTypeDto OPTION_EXPIRATION_DIALOG = new OPTION_EXPIRATION_DIALOG("OPTION_EXPIRATION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
        public static final ComponentTypeDto OPTION_WATCHLIST_WELCOME_SHEET = new OPTION_WATCHLIST_WELCOME_SHEET("OPTION_WATCHLIST_WELCOME_SHEET", 192);
        public static final ComponentTypeDto OPTION_PENDING_ORDER_DIALOG = new OPTION_PENDING_ORDER_DIALOG("OPTION_PENDING_ORDER_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
        public static final ComponentTypeDto NO_POSITIONS_AVAILABLE_BOTTOM_SHEET = new NO_POSITIONS_AVAILABLE_BOTTOM_SHEET("NO_POSITIONS_AVAILABLE_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
        public static final ComponentTypeDto STRATEGY_INTRO_CARD = new STRATEGY_INTRO_CARD("STRATEGY_INTRO_CARD", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
        public static final ComponentTypeDto STRATEGY_SUMMARY_CARD = new STRATEGY_SUMMARY_CARD("STRATEGY_SUMMARY_CARD", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        public static final ComponentTypeDto OPTION_ORDER_MARKETABILITY_BANNER = new OPTION_ORDER_MARKETABILITY_BANNER("OPTION_ORDER_MARKETABILITY_BANNER", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
        public static final ComponentTypeDto OPTION_ORDER_MARKETABILITY_TAG = new OPTION_ORDER_MARKETABILITY_TAG("OPTION_ORDER_MARKETABILITY_TAG", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
        public static final ComponentTypeDto ROLLING_CASH_ACCOUNT_BOTTOM_SHEET = new ROLLING_CASH_ACCOUNT_BOTTOM_SHEET("ROLLING_CASH_ACCOUNT_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
        public static final ComponentTypeDto STRATEGY_BUILDER_CARD = new STRATEGY_BUILDER_CARD("STRATEGY_BUILDER_CARD", 200);
        public static final ComponentTypeDto OPTION_STRATEGY_CHAIN_BOTTOM_SHEET = new OPTION_STRATEGY_CHAIN_BOTTOM_SHEET("OPTION_STRATEGY_CHAIN_BOTTOM_SHEET", 201);
        public static final ComponentTypeDto STRATEGY_ROW = new STRATEGY_ROW("STRATEGY_ROW", 202);
        public static final ComponentTypeDto OPTION_SIMULATED_RETURNS_SLIDER = new OPTION_SIMULATED_RETURNS_SLIDER("OPTION_SIMULATED_RETURNS_SLIDER", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
        public static final ComponentTypeDto OPTION_SIMULATED_RETURNS_CHART = new OPTION_SIMULATED_RETURNS_CHART("OPTION_SIMULATED_RETURNS_CHART", 204);
        public static final ComponentTypeDto OPTION_ORDER_BID_ASK_BAR = new OPTION_ORDER_BID_ASK_BAR("OPTION_ORDER_BID_ASK_BAR", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
        public static final ComponentTypeDto INDEX_OPTION_PCO_DIALOG = new INDEX_OPTION_PCO_DIALOG("INDEX_OPTION_PCO_DIALOG", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
        public static final ComponentTypeDto OPTION_INSTRUMENT_PILL = new OPTION_INSTRUMENT_PILL("OPTION_INSTRUMENT_PILL", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
        public static final ComponentTypeDto OPTION_DISPLAY_MODE_CARD = new OPTION_DISPLAY_MODE_CARD("OPTION_DISPLAY_MODE_CARD", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
        public static final ComponentTypeDto RECURRING_FREQUENCY_ROW = new RECURRING_FREQUENCY_ROW("RECURRING_FREQUENCY_ROW", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
        public static final ComponentTypeDto RECURRING_PAYMENT_METHOD_ROW = new RECURRING_PAYMENT_METHOD_ROW("RECURRING_PAYMENT_METHOD_ROW", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        public static final ComponentTypeDto RECURRING_HUB_ROW = new RECURRING_HUB_ROW("RECURRING_HUB_ROW", 211);
        public static final ComponentTypeDto RECURRING_START_DATE_ROW = new RECURRING_START_DATE_ROW("RECURRING_START_DATE_ROW", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
        public static final ComponentTypeDto RECURRING_AMOUNT_ROW = new RECURRING_AMOUNT_ROW("RECURRING_AMOUNT_ROW", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
        public static final ComponentTypeDto REWARD_CLAIM_CERTIFICATE = new REWARD_CLAIM_CERTIFICATE("REWARD_CLAIM_CERTIFICATE", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
        public static final ComponentTypeDto MERCHANT_REWARD_CAROUSEL = new MERCHANT_REWARD_CAROUSEL("MERCHANT_REWARD_CAROUSEL", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
        public static final ComponentTypeDto MERCHANT_REWARD_OFFER_DETAIL = new MERCHANT_REWARD_OFFER_DETAIL("MERCHANT_REWARD_OFFER_DETAIL", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        public static final ComponentTypeDto MERCHANT_REWARD_STATE_EXPLANATION = new MERCHANT_REWARD_STATE_EXPLANATION("MERCHANT_REWARD_STATE_EXPLANATION", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
        public static final ComponentTypeDto MERCHANT_REWARD_OFFER_CARD = new MERCHANT_REWARD_OFFER_CARD("MERCHANT_REWARD_OFFER_CARD", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
        public static final ComponentTypeDto POST_REWARD_CLAIM_UPSELL_DIALOG = new POST_REWARD_CLAIM_UPSELL_DIALOG("POST_REWARD_CLAIM_UPSELL_DIALOG", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
        public static final ComponentTypeDto ORDER_KIND_ROW = new ORDER_KIND_ROW("ORDER_KIND_ROW", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        public static final ComponentTypeDto ADD_ACCOUNT = new ADD_ACCOUNT("ADD_ACCOUNT", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
        public static final ComponentTypeDto ORDER_TYPE_PICKER = new ORDER_TYPE_PICKER("ORDER_TYPE_PICKER", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
        public static final ComponentTypeDto ACCOUNT_PCO_DIALOG = new ACCOUNT_PCO_DIALOG("ACCOUNT_PCO_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
        public static final ComponentTypeDto INVESTMENT_BASKET_TOGGLE = new INVESTMENT_BASKET_TOGGLE("INVESTMENT_BASKET_TOGGLE", 224);
        public static final ComponentTypeDto INVESTMENT_ADDED_TOAST = new INVESTMENT_ADDED_TOAST("INVESTMENT_ADDED_TOAST", 225);
        public static final ComponentTypeDto BASKET_FULL_TOAST = new BASKET_FULL_TOAST("BASKET_FULL_TOAST", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
        public static final ComponentTypeDto PERFORMANCE_CHART = new PERFORMANCE_CHART("PERFORMANCE_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
        public static final ComponentTypeDto PERFORMANCE_CHART_SETTINGS = new PERFORMANCE_CHART_SETTINGS("PERFORMANCE_CHART_SETTINGS", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
        public static final ComponentTypeDto SPAN_SELECTOR = new SPAN_SELECTOR("SPAN_SELECTOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
        public static final ComponentTypeDto DAY_TRADE_COUNTER_ROW = new DAY_TRADE_COUNTER_ROW("DAY_TRADE_COUNTER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
        public static final ComponentTypeDto DAY_TRADE_COUNTER_GRAPHIC = new DAY_TRADE_COUNTER_GRAPHIC("DAY_TRADE_COUNTER_GRAPHIC", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
        public static final ComponentTypeDto LEARNING_LESSON_CARD = new LEARNING_LESSON_CARD("LEARNING_LESSON_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
        public static final ComponentTypeDto LEARNING_LESSON_ROW = new LEARNING_LESSON_ROW("LEARNING_LESSON_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
        public static final ComponentTypeDto LEARNING_SECTION = new LEARNING_SECTION("LEARNING_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
        public static final ComponentTypeDto LEARNING_ENTRY_POINT = new LEARNING_ENTRY_POINT("LEARNING_ENTRY_POINT", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        public static final ComponentTypeDto LEARNING_MATCHING_EXERCISE = new LEARNING_MATCHING_EXERCISE("LEARNING_MATCHING_EXERCISE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
        public static final ComponentTypeDto LEARNING_MATCHING_EXERCISE_ENTITY = new LEARNING_MATCHING_EXERCISE_ENTITY("LEARNING_MATCHING_EXERCISE_ENTITY", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
        public static final ComponentTypeDto LEARNING_MATCHING_EXERCISE_BUCKET = new LEARNING_MATCHING_EXERCISE_BUCKET("LEARNING_MATCHING_EXERCISE_BUCKET", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
        public static final ComponentTypeDto LEARNING_FEEDBACK = new LEARNING_FEEDBACK("LEARNING_FEEDBACK", 239);
        public static final ComponentTypeDto LEARNING_INTERSTITIAL = new LEARNING_INTERSTITIAL("LEARNING_INTERSTITIAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        public static final ComponentTypeDto LEARNING_QUIZ_CONTINUE_HINT = new LEARNING_QUIZ_CONTINUE_HINT("LEARNING_QUIZ_CONTINUE_HINT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
        public static final ComponentTypeDto EDUCATION_TOUR_CARD = new EDUCATION_TOUR_CARD("EDUCATION_TOUR_CARD", EnumC7081g.f2778x3356acf6);
        public static final ComponentTypeDto TRANSFER_DETAILS_ROW = new TRANSFER_DETAILS_ROW("TRANSFER_DETAILS_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
        public static final ComponentTypeDto RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG = new RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG("RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
        public static final ComponentTypeDto RHY_CAROUSEL = new RHY_CAROUSEL("RHY_CAROUSEL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
        public static final ComponentTypeDto RHY_HOME_CARD = new RHY_HOME_CARD("RHY_HOME_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        public static final ComponentTypeDto RHY_HOME_STATUS_BANNER = new RHY_HOME_STATUS_BANNER("RHY_HOME_STATUS_BANNER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
        public static final ComponentTypeDto HOME_ATM_FINDER = new HOME_ATM_FINDER("HOME_ATM_FINDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        public static final ComponentTypeDto RHY_DD_UPSELL_POST_TRANSFER = new RHY_DD_UPSELL_POST_TRANSFER("RHY_DD_UPSELL_POST_TRANSFER", EnumC7081g.f2779x59907a3d);
        public static final ComponentTypeDto BACKUP_COVERAGE_TOGGLE = new BACKUP_COVERAGE_TOGGLE("BACKUP_COVERAGE_TOGGLE", 250);
        public static final ComponentTypeDto FLAT_CASHBACK_BOTTOM_SHEET = new FLAT_CASHBACK_BOTTOM_SHEET("FLAT_CASHBACK_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
        public static final ComponentTypeDto RHY_REFERRAL_CASH_OFFER_CARD = new RHY_REFERRAL_CASH_OFFER_CARD("RHY_REFERRAL_CASH_OFFER_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        public static final ComponentTypeDto RHY_WAITLIST_UPSELL_CARD = new RHY_WAITLIST_UPSELL_CARD("RHY_WAITLIST_UPSELL_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
        public static final ComponentTypeDto RHY_WAITLIST_WAITING_CARD = new RHY_WAITLIST_WAITING_CARD("RHY_WAITLIST_WAITING_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        public static final ComponentTypeDto RHY_WAITLIST_CAT = new RHY_WAITLIST_CAT("RHY_WAITLIST_CAT", 255);
        public static final ComponentTypeDto RHY_MIGRATION_BOTTOM_SHEET = new RHY_MIGRATION_BOTTOM_SHEET("RHY_MIGRATION_BOTTOM_SHEET", 256);
        public static final ComponentTypeDto RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET = new RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET("RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
        public static final ComponentTypeDto RHY_TURBOTAX_OFFER_BUTTON_RHY = new RHY_TURBOTAX_OFFER_BUTTON_RHY("RHY_TURBOTAX_OFFER_BUTTON_RHY", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE);
        public static final ComponentTypeDto RHY_TURBOTAX_OFFER_BUTTON_NON_RHY = new RHY_TURBOTAX_OFFER_BUTTON_NON_RHY("RHY_TURBOTAX_OFFER_BUTTON_NON_RHY", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
        public static final ComponentTypeDto REFERRAL_BANNER = new REFERRAL_BANNER("REFERRAL_BANNER", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        public static final ComponentTypeDto ACCOUNT_CENTER_REFERRAL_ENTRY_POINT = new ACCOUNT_CENTER_REFERRAL_ENTRY_POINT("ACCOUNT_CENTER_REFERRAL_ENTRY_POINT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
        public static final ComponentTypeDto SWEEP_DISABLE_DIALOG = new SWEEP_DISABLE_DIALOG("SWEEP_DISABLE_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        public static final ComponentTypeDto SWEEP_PAUSED_DIALOG = new SWEEP_PAUSED_DIALOG("SWEEP_PAUSED_DIALOG", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
        public static final ComponentTypeDto VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET = new VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET("VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
        public static final ComponentTypeDto CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG = new CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG("CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE);
        public static final ComponentTypeDto SWEPT_CASH_BALANCE_EXPLANATION_DIALOG = new SWEPT_CASH_BALANCE_EXPLANATION_DIALOG("SWEPT_CASH_BALANCE_EXPLANATION_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
        public static final ComponentTypeDto CASH_SWEEP_ALREADY_ENABLED_DIALOG = new CASH_SWEEP_ALREADY_ENABLED_DIALOG("CASH_SWEEP_ALREADY_ENABLED_DIALOG", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
        public static final ComponentTypeDto CASH_SWEEP_SECTION = new CASH_SWEEP_SECTION("CASH_SWEEP_SECTION", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
        public static final ComponentTypeDto SLIP_SETTING_CARD = new SLIP_SETTING_CARD("SLIP_SETTING_CARD", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);
        public static final ComponentTypeDto LINK_DEBIT_CARD_BANNER = new LINK_DEBIT_CARD_BANNER("LINK_DEBIT_CARD_BANNER", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
        public static final ComponentTypeDto SHAREHOLDER_LIST_SECTION = new SHAREHOLDER_LIST_SECTION("SHAREHOLDER_LIST_SECTION", 271);
        public static final ComponentTypeDto MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET = new MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET("MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
        public static final ComponentTypeDto MARGIN_REQUIREMENT_SECTION = new MARGIN_REQUIREMENT_SECTION("MARGIN_REQUIREMENT_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
        public static final ComponentTypeDto IRA_TAX_WITHHOLDING_BOTTOM_SHEET = new IRA_TAX_WITHHOLDING_BOTTOM_SHEET("IRA_TAX_WITHHOLDING_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
        public static final ComponentTypeDto ACCOUNT_SELECTOR = new ACCOUNT_SELECTOR("ACCOUNT_SELECTOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
        public static final ComponentTypeDto BIOMETRIC_AUTH_BUTTON = new BIOMETRIC_AUTH_BUTTON("BIOMETRIC_AUTH_BUTTON", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
        public static final ComponentTypeDto PORTFOLIO_TABLE_COLUMN_HEADING = new PORTFOLIO_TABLE_COLUMN_HEADING("PORTFOLIO_TABLE_COLUMN_HEADING", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
        public static final ComponentTypeDto ASSET_DISPLAY_VALUE_DIALOG = new ASSET_DISPLAY_VALUE_DIALOG("ASSET_DISPLAY_VALUE_DIALOG", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
        public static final ComponentTypeDto BUYING_POWER_ROW = new BUYING_POWER_ROW("BUYING_POWER_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
        public static final ComponentTypeDto PORTFOLIO_CHART = new PORTFOLIO_CHART("PORTFOLIO_CHART", 280);
        public static final ComponentTypeDto GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET = new GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET("GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
        public static final ComponentTypeDto GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET = new GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET("GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto ASSET_SELECTOR = new ASSET_SELECTOR("ASSET_SELECTOR", 283);
        public static final ComponentTypeDto PNL_CHART = new PNL_CHART("PNL_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto PNL_SETTINGS = new PNL_SETTINGS("PNL_SETTINGS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
        public static final ComponentTypeDto PNL_DETAIL_BOTTOM_SHEET = new PNL_DETAIL_BOTTOM_SHEET("PNL_DETAIL_BOTTOM_SHEET", EnumC7081g.f2777x89a9e432);
        public static final ComponentTypeDto REALIZED_GAIN_LOSS_SECTION = new REALIZED_GAIN_LOSS_SECTION("REALIZED_GAIN_LOSS_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
        public static final ComponentTypeDto FUTURES_TRADE_BAR = new FUTURES_TRADE_BAR("FUTURES_TRADE_BAR", 288);
        public static final ComponentTypeDto FUTURES_LIST_SORT_BOTTOM_SHEET = new FUTURES_LIST_SORT_BOTTOM_SHEET("FUTURES_LIST_SORT_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
        public static final ComponentTypeDto LADDER_NUX = new LADDER_NUX("LADDER_NUX", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
        public static final ComponentTypeDto CASH_BALANCES_HOME_SECTION = new CASH_BALANCES_HOME_SECTION("CASH_BALANCES_HOME_SECTION", EnumC7081g.f2776x87e624cb);
        public static final ComponentTypeDto CORTEX_DIGEST_SECTION = new CORTEX_DIGEST_SECTION("CORTEX_DIGEST_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
        public static final ComponentTypeDto PILL = new PILL("PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
        public static final ComponentTypeDto EDUCATION_ROW = new EDUCATION_ROW("EDUCATION_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
        public static final ComponentTypeDto NEWS_SECTION = new NEWS_SECTION("NEWS_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto PENDING_ORDER_ROW = new PENDING_ORDER_ROW("PENDING_ORDER_ROW", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE);
        public static final ComponentTypeDto PENDING_ORDER_SECTION = new PENDING_ORDER_SECTION("PENDING_ORDER_SECTION", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
        public static final ComponentTypeDto TOKENIZED_STOCK_HOLDING_ROW = new TOKENIZED_STOCK_HOLDING_ROW("TOKENIZED_STOCK_HOLDING_ROW", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
        public static final ComponentTypeDto TOKENIZED_STOCK_HOLDING_SECTION = new TOKENIZED_STOCK_HOLDING_SECTION("TOKENIZED_STOCK_HOLDING_SECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);
        public static final ComponentTypeDto PERPETUALS_HOLDING_SECTION = new PERPETUALS_HOLDING_SECTION("PERPETUALS_HOLDING_SECTION", 300);
        public static final ComponentTypeDto OPEN_POSITION_SUMMARY = new OPEN_POSITION_SUMMARY("OPEN_POSITION_SUMMARY", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
        public static final ComponentTypeDto OPEN_POSITIONS_SECTION = new OPEN_POSITIONS_SECTION("OPEN_POSITIONS_SECTION", 302);
        public static final ComponentTypeDto PENDING_ORDERS_SECTION = new PENDING_ORDERS_SECTION("PENDING_ORDERS_SECTION", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto EXPLORE_SECTION = new EXPLORE_SECTION("EXPLORE_SECTION", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
        public static final ComponentTypeDto PNL_SECTION = new PNL_SECTION("PNL_SECTION", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto OPTION_PROFIT_AND_LOSS_CARD = new OPTION_PROFIT_AND_LOSS_CARD("OPTION_PROFIT_AND_LOSS_CARD", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
        public static final ComponentTypeDto OPTION_PROFIT_AND_LOSS_SLIDER = new OPTION_PROFIT_AND_LOSS_SLIDER("OPTION_PROFIT_AND_LOSS_SLIDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto COMPANY_FINANCIALS_CHART = new COMPANY_FINANCIALS_CHART("COMPANY_FINANCIALS_CHART", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
        public static final ComponentTypeDto CORTEX_DIGEST_UPSELL_SECTION = new CORTEX_DIGEST_UPSELL_SECTION("CORTEX_DIGEST_UPSELL_SECTION", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto COMPANY_FINANCIALS_SECTION = new COMPANY_FINANCIALS_SECTION("COMPANY_FINANCIALS_SECTION", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE);
        public static final ComponentTypeDto WATCHLIST_ROW = new WATCHLIST_ROW("WATCHLIST_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE);
        public static final ComponentTypeDto RETURNS_CHART = new RETURNS_CHART("RETURNS_CHART", EnumC7081g.f2774x74902ae0);
        public static final ComponentTypeDto SELECT_MENU = new SELECT_MENU("SELECT_MENU", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
        public static final ComponentTypeDto OPTIONS_STATUS_SECTION = new OPTIONS_STATUS_SECTION("OPTIONS_STATUS_SECTION", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
        public static final ComponentTypeDto FX_SWITCHER = new FX_SWITCHER("FX_SWITCHER", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE);
        public static final ComponentTypeDto PROXY_VOTE_SECTION = new PROXY_VOTE_SECTION("PROXY_VOTE_SECTION", 316);
        public static final ComponentTypeDto EVENT_CONTRACT_TRADE_OVERLAY_DIALOG = new EVENT_CONTRACT_TRADE_OVERLAY_DIALOG("EVENT_CONTRACT_TRADE_OVERLAY_DIALOG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
        public static final ComponentTypeDto OPTION_L3_ENTRYPOINT_TAG = new OPTION_L3_ENTRYPOINT_TAG("OPTION_L3_ENTRYPOINT_TAG", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
        public static final ComponentTypeDto CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET = new CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET("CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET", EnumC7081g.f2781x2ba65ba3);
        public static final ComponentTypeDto DASHBOARD_PILL = new DASHBOARD_PILL("DASHBOARD_PILL", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
        public static final ComponentTypeDto FEED_POST_ROW = new FEED_POST_ROW("FEED_POST_ROW", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE);
        public static final ComponentTypeDto ACTIVITY_ITEM_ROW = new ACTIVITY_ITEM_ROW("ACTIVITY_ITEM_ROW", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
        public static final ComponentTypeDto CONCIERGE_PLUS_UPSELL_BANNER = new CONCIERGE_PLUS_UPSELL_BANNER("CONCIERGE_PLUS_UPSELL_BANNER", EnumC7081g.f2775xbcb7e6f3);
        public static final ComponentTypeDto RECURRING_INVESTMENTS_EQUITY_NUX = new RECURRING_INVESTMENTS_EQUITY_NUX("RECURRING_INVESTMENTS_EQUITY_NUX", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
        public static final ComponentTypeDto EVENT_CONTRACT_COMBO_LEG = new EVENT_CONTRACT_COMBO_LEG("EVENT_CONTRACT_COMBO_LEG", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE);
        public static final ComponentTypeDto EVENT_CONTRACT_STRIKE_PICKER = new EVENT_CONTRACT_STRIKE_PICKER("EVENT_CONTRACT_STRIKE_PICKER", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
        public static final ComponentTypeDto INTEREST_SECTION = new INTEREST_SECTION("INTEREST_SECTION", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE);
        public static final ComponentTypeDto CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET = new CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET("CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);

        private static final /* synthetic */ ComponentTypeDto[] $values() {
            return new ComponentTypeDto[]{COMPONENT_TYPE_UNSPECIFIED, LOADING_PLACEHOLDER, MAP, QR_CODE, INLINE_DEFINITION, PUSH_NOTIFICATION, MENU_ITEM, EDUCATION_TOUR_TOOLTIP, NEW_PRODUCT_CARD, BALANCE_SECTION, SHORTCUTS_FIRST_TIME_POPUP, ACCOUNT_SWITCHER, ACCOUNT_SWITCHER_BOTTOM_SHEET, HOLDING_ROW, PRICE_CHART, RECURRING_ROW, EXPLORE_ROW, NOTIFICATION_CARD, NOTIFICATION_CARD_STACK, NOTIFICATION_COMPLETION_CARD, SIDEBAR, LIST_ROW, LIST_HEADER, SECTION_HEADER, TOGGLE, CARD, SUCCESS_TOAST, INFO_TAG, FX_CONVERSION_TOOLTIP, HERO_CARD, TEXT_VIEW, SEGMENTED_CONTROL, TRADING_TRENDS_CHART, SEGMENT, TABLE, HOLDING_SECTION, SLIDER, SCRUB_BAR, STICKY_BOTTOM_SHEET, LIVE_ACTIVITY, BADGE, STAKING_SECTION, ADVANCED_ALERT_SETTINGS, PRICE_ALERT_EDITOR, ALERT_SETTING_ROW, ALERT_SETTING_TOGGLE, PRICE_ALERT_TYPE_SELECTOR, CANCEL_ERROR_ALERT, ERROR_ALERT, ALERT, ERROR_LOADING, CANCEL_CONFIRMATION_ALERT, ENABLE_PUSH_NOTIFICATIONS_ALERT, CX_PHONE_UNAVAILABLE_ALERT, CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET, CX_CHAT_STATUS_BANNER, CX_CHATBOT_BANNER, UPDATE_EMPLOYER_INFO_ALERT, DD_MANUAL_SETUP_ALERT, EARLY_PAY_ENABLE_CONFIRMATION_ALERT, EARLY_PAY_DISABLE_CONFIRMATION_ALERT, EARLY_PAY_TOGGLE_LIMIT_ALERT, ALERT_SHEET, CX_CALL_STATUS_BANNER, CONTACT_SIGNIN_BANNER, INFO_BANNER, HERO_BANNER, STATUS_BANNER, VERIFY_DEBIT_CARD_BANNER, UPDATE_INVESTOR_PROFILE_BANNER, ACCOUNT_CENTER_UPSELL_BANNER, ADD_TO_LIST_BOTTOM_SHEET, FEEDBACK_BOTTOM_SHEET, DATE_PICKER_BOTTOM_SHEET, BOTTOM_SHEET, PASSKEY_ENROLLMENT_BOTTOM_SHEET, KEYCHAIN_LOGIN_BOTTOM_SHEET, GOLD_UPSELL_HOOK_DIALOG, DONE_BUTTON, CONTINUE_BUTTON, BUTTON, SKIP_BUTTON, FILTERS_BUTTON, ASSET_TICKER_BUTTON, LINK_BUTTON, BACK_BUTTON, REVIEW_BUTTON, RADIO_BUTTON, DATE_RANGE_BUTTON, CLOSE_BUTTON, CANCEL_BUTTON, DELETE_BUTTON, NOT_YET_BUTTON, HELP_BUTTON, RECURRING_INVESTMENTS_BUTTON, ASSET_CARD, REDEMPTION_CARD, RECOMMENDATIONS_BROWSE_CARD, CRYPTO_NOTIFICATION_CARD, SCREENER_PRESET_CARD, BREAKING_NEWS_BANNER, LIST_CHIP_GRID, LIST_CAROUSEL, CAROUSEL, CHIP_GRID, LIST_CHIP, CHIP, RECURRING_SUMMARY_DIALOG, CALENDAR_DATE_PICKER, SEARCH_RESULT_ROW, ASSET_ROW, ROW, HISTORY_ROW, RECENT_SEARCH_ROW, L2E_ONBOARDING, TEXT_FIELD, SEARCH_BAR, ERROR_TOAST, HIDE_CX_CALL_STATUS_BANNER_TOAST, ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST, CX_CALL_ASSIGNED_TOAST, MICROPHONE_PERMISSION_DIALOG, PERMISSION_SETTINGS_DIALOG, PROCESSING_ERROR_TOAST, PERMISSION_ERROR_TOAST, VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET, CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET, UPDATE_LIST_TOAST, DD_SWITCHER_ENTRY_POINT, SAFETY_LABEL_INFO_TAG, TOOLTIP, PERFORMANCE_SECTION, STATS_SECTION, GRAPH_SECTION, POSITION_SECTION, RESEARCH_REPORT_SECTION, EARNINGS_SECTION, PEOPLE_ALSO_VIEW_SECTION, TRADE_BAR, ETP_COMPOSITION_SECTION, ABOUT_SECTION, ANALYST_RATINGS_SECTION, RELATED_LISTS_SECTION, SHAREHOLDER_QA_SECTION, HISTORY_SECTION, ADVANCED_CHART, UPCOMING_ACTIVITY_SECTION, TAB, NEWS_ROW, HERO_NEWS_ROW, VIDEO_ROW, HERO_VIDEO_ROW, FEATURE_CARD, FEATURE_DISCOVERY_WIDGET, MARKET_UPDATES, MARKET_INDICATOR, DIRECT_DEPOSIT_OPTION_ROW, SETUP_DIRECT_DEPOSIT_ROW, DEPOSIT_ROW, WITHDRAW_ROW, RECURRING_DEPOSITS_ROW, PAY_BY_CHECK_ROW, TRANSFER_ROW, DROPDOWN_OPTION, RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG, PAYCHECK_SECTION, DEBIT_CARD_KYC_BANNER, ACH_TRANSFER_OPTION_CARD, CRYPTO_TRANSFERS_ROW, WIRE_TRANSFER_ROW, WIRE_UPSELL, TRANSFER_REWARD_PILL, EARLY_PAY_TOGGLE, EARLY_PAY_FAQ_ROW, LIST_HERO, LIST_ASSET_ROW, LIST_CONTACTS, LIST_VIDEO, OPTION_INSTRUMENT_ROW, OPTION_UNTRADABLE_INFO_BAR, OPTION_NO_MARKETDATA_MESSAGE, OPTION_PNL_CHART, OPTION_CHAIN_STOCK_CHART, OPTION_PENDING_ORDER_ROW, OPTION_WATCHLIST_ITEM_ROW, OPTION_ORDER_FORM_TYPE_SELECTOR, OPTION_ORDER_FORM_TYPE_GEAR, OPTION_ORDER_CONFIGURATION_SWITCH, OPTION_ORDER_CONFIGURATION_ROW, OPTION_UNTRADABLE_DIALOG, OPTION_PCO_DIALOG, OPTION_EXPIRATION_DIALOG, OPTION_WATCHLIST_WELCOME_SHEET, OPTION_PENDING_ORDER_DIALOG, NO_POSITIONS_AVAILABLE_BOTTOM_SHEET, STRATEGY_INTRO_CARD, STRATEGY_SUMMARY_CARD, OPTION_ORDER_MARKETABILITY_BANNER, OPTION_ORDER_MARKETABILITY_TAG, ROLLING_CASH_ACCOUNT_BOTTOM_SHEET, STRATEGY_BUILDER_CARD, OPTION_STRATEGY_CHAIN_BOTTOM_SHEET, STRATEGY_ROW, OPTION_SIMULATED_RETURNS_SLIDER, OPTION_SIMULATED_RETURNS_CHART, OPTION_ORDER_BID_ASK_BAR, INDEX_OPTION_PCO_DIALOG, OPTION_INSTRUMENT_PILL, OPTION_DISPLAY_MODE_CARD, RECURRING_FREQUENCY_ROW, RECURRING_PAYMENT_METHOD_ROW, RECURRING_HUB_ROW, RECURRING_START_DATE_ROW, RECURRING_AMOUNT_ROW, REWARD_CLAIM_CERTIFICATE, MERCHANT_REWARD_CAROUSEL, MERCHANT_REWARD_OFFER_DETAIL, MERCHANT_REWARD_STATE_EXPLANATION, MERCHANT_REWARD_OFFER_CARD, POST_REWARD_CLAIM_UPSELL_DIALOG, ORDER_KIND_ROW, ADD_ACCOUNT, ORDER_TYPE_PICKER, ACCOUNT_PCO_DIALOG, INVESTMENT_BASKET_TOGGLE, INVESTMENT_ADDED_TOAST, BASKET_FULL_TOAST, PERFORMANCE_CHART, PERFORMANCE_CHART_SETTINGS, SPAN_SELECTOR, DAY_TRADE_COUNTER_ROW, DAY_TRADE_COUNTER_GRAPHIC, LEARNING_LESSON_CARD, LEARNING_LESSON_ROW, LEARNING_SECTION, LEARNING_ENTRY_POINT, LEARNING_MATCHING_EXERCISE, LEARNING_MATCHING_EXERCISE_ENTITY, LEARNING_MATCHING_EXERCISE_BUCKET, LEARNING_FEEDBACK, LEARNING_INTERSTITIAL, LEARNING_QUIZ_CONTINUE_HINT, EDUCATION_TOUR_CARD, TRANSFER_DETAILS_ROW, RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG, RHY_CAROUSEL, RHY_HOME_CARD, RHY_HOME_STATUS_BANNER, HOME_ATM_FINDER, RHY_DD_UPSELL_POST_TRANSFER, BACKUP_COVERAGE_TOGGLE, FLAT_CASHBACK_BOTTOM_SHEET, RHY_REFERRAL_CASH_OFFER_CARD, RHY_WAITLIST_UPSELL_CARD, RHY_WAITLIST_WAITING_CARD, RHY_WAITLIST_CAT, RHY_MIGRATION_BOTTOM_SHEET, RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET, RHY_TURBOTAX_OFFER_BUTTON_RHY, RHY_TURBOTAX_OFFER_BUTTON_NON_RHY, REFERRAL_BANNER, ACCOUNT_CENTER_REFERRAL_ENTRY_POINT, SWEEP_DISABLE_DIALOG, SWEEP_PAUSED_DIALOG, VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET, CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG, SWEPT_CASH_BALANCE_EXPLANATION_DIALOG, CASH_SWEEP_ALREADY_ENABLED_DIALOG, CASH_SWEEP_SECTION, SLIP_SETTING_CARD, LINK_DEBIT_CARD_BANNER, SHAREHOLDER_LIST_SECTION, MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET, MARGIN_REQUIREMENT_SECTION, IRA_TAX_WITHHOLDING_BOTTOM_SHEET, ACCOUNT_SELECTOR, BIOMETRIC_AUTH_BUTTON, PORTFOLIO_TABLE_COLUMN_HEADING, ASSET_DISPLAY_VALUE_DIALOG, BUYING_POWER_ROW, PORTFOLIO_CHART, GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET, GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET, ASSET_SELECTOR, PNL_CHART, PNL_SETTINGS, PNL_DETAIL_BOTTOM_SHEET, REALIZED_GAIN_LOSS_SECTION, FUTURES_TRADE_BAR, FUTURES_LIST_SORT_BOTTOM_SHEET, LADDER_NUX, CASH_BALANCES_HOME_SECTION, CORTEX_DIGEST_SECTION, PILL, EDUCATION_ROW, NEWS_SECTION, PENDING_ORDER_ROW, PENDING_ORDER_SECTION, TOKENIZED_STOCK_HOLDING_ROW, TOKENIZED_STOCK_HOLDING_SECTION, PERPETUALS_HOLDING_SECTION, OPEN_POSITION_SUMMARY, OPEN_POSITIONS_SECTION, PENDING_ORDERS_SECTION, EXPLORE_SECTION, PNL_SECTION, OPTION_PROFIT_AND_LOSS_CARD, OPTION_PROFIT_AND_LOSS_SLIDER, COMPANY_FINANCIALS_CHART, CORTEX_DIGEST_UPSELL_SECTION, COMPANY_FINANCIALS_SECTION, WATCHLIST_ROW, RETURNS_CHART, SELECT_MENU, OPTIONS_STATUS_SECTION, FX_SWITCHER, PROXY_VOTE_SECTION, EVENT_CONTRACT_TRADE_OVERLAY_DIALOG, OPTION_L3_ENTRYPOINT_TAG, CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET, DASHBOARD_PILL, FEED_POST_ROW, ACTIVITY_ITEM_ROW, CONCIERGE_PLUS_UPSELL_BANNER, RECURRING_INVESTMENTS_EQUITY_NUX, EVENT_CONTRACT_COMBO_LEG, EVENT_CONTRACT_STRIKE_PICKER, INTEREST_SECTION, CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET};
        }

        public /* synthetic */ ComponentTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ComponentTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.COMPONENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPONENT_TYPE_UNSPECIFIED extends ComponentTypeDto {
            COMPONENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
            }
        }

        private ComponentTypeDto(String str, int i) {
        }

        static {
            ComponentTypeDto[] componentTypeDtoArr$values = $values();
            $VALUES = componentTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(componentTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ComponentDto$ComponentTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComponentDto.ComponentTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LOADING_PLACEHOLDER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOADING_PLACEHOLDER extends ComponentTypeDto {
            LOADING_PLACEHOLDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LOADING_PLACEHOLDER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MAP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAP extends ComponentTypeDto {
            MAP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MAP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.QR_CODE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QR_CODE extends ComponentTypeDto {
            QR_CODE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.QR_CODE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INLINE_DEFINITION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INLINE_DEFINITION extends ComponentTypeDto {
            INLINE_DEFINITION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INLINE_DEFINITION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PUSH_NOTIFICATION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION extends ComponentTypeDto {
            PUSH_NOTIFICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PUSH_NOTIFICATION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MENU_ITEM", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MENU_ITEM extends ComponentTypeDto {
            MENU_ITEM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MENU_ITEM;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EDUCATION_TOUR_TOOLTIP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EDUCATION_TOUR_TOOLTIP extends ComponentTypeDto {
            EDUCATION_TOUR_TOOLTIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EDUCATION_TOUR_TOOLTIP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NEW_PRODUCT_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW_PRODUCT_CARD extends ComponentTypeDto {
            NEW_PRODUCT_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NEW_PRODUCT_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BALANCE_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BALANCE_SECTION extends ComponentTypeDto {
            BALANCE_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BALANCE_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SHORTCUTS_FIRST_TIME_POPUP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHORTCUTS_FIRST_TIME_POPUP extends ComponentTypeDto {
            SHORTCUTS_FIRST_TIME_POPUP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SHORTCUTS_FIRST_TIME_POPUP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACCOUNT_SWITCHER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_SWITCHER extends ComponentTypeDto {
            ACCOUNT_SWITCHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACCOUNT_SWITCHER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACCOUNT_SWITCHER_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_SWITCHER_BOTTOM_SHEET extends ComponentTypeDto {
            ACCOUNT_SWITCHER_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACCOUNT_SWITCHER_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HOLDING_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOLDING_ROW extends ComponentTypeDto {
            HOLDING_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HOLDING_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PRICE_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRICE_CHART extends ComponentTypeDto {
            PRICE_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PRICE_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_ROW extends ComponentTypeDto {
            RECURRING_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EXPLORE_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPLORE_ROW extends ComponentTypeDto {
            EXPLORE_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EXPLORE_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NOTIFICATION_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOTIFICATION_CARD extends ComponentTypeDto {
            NOTIFICATION_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NOTIFICATION_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NOTIFICATION_CARD_STACK", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOTIFICATION_CARD_STACK extends ComponentTypeDto {
            NOTIFICATION_CARD_STACK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NOTIFICATION_CARD_STACK;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NOTIFICATION_COMPLETION_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOTIFICATION_COMPLETION_CARD extends ComponentTypeDto {
            NOTIFICATION_COMPLETION_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NOTIFICATION_COMPLETION_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SIDEBAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIDEBAR extends ComponentTypeDto {
            SIDEBAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SIDEBAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_ROW extends ComponentTypeDto {
            LIST_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_HEADER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_HEADER extends ComponentTypeDto {
            LIST_HEADER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_HEADER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SECTION_HEADER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SECTION_HEADER extends ComponentTypeDto {
            SECTION_HEADER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SECTION_HEADER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TOGGLE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOGGLE extends ComponentTypeDto {
            TOGGLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TOGGLE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CARD extends ComponentTypeDto {
            CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SUCCESS_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCESS_TOAST extends ComponentTypeDto {
            SUCCESS_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SUCCESS_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INFO_TAG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO_TAG extends ComponentTypeDto {
            INFO_TAG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INFO_TAG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FX_CONVERSION_TOOLTIP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FX_CONVERSION_TOOLTIP extends ComponentTypeDto {
            FX_CONVERSION_TOOLTIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FX_CONVERSION_TOOLTIP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HERO_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HERO_CARD extends ComponentTypeDto {
            HERO_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HERO_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TEXT_VIEW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TEXT_VIEW extends ComponentTypeDto {
            TEXT_VIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TEXT_VIEW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SEGMENTED_CONTROL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SEGMENTED_CONTROL extends ComponentTypeDto {
            SEGMENTED_CONTROL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SEGMENTED_CONTROL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TRADING_TRENDS_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRADING_TRENDS_CHART extends ComponentTypeDto {
            TRADING_TRENDS_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TRADING_TRENDS_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SEGMENT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SEGMENT extends ComponentTypeDto {
            SEGMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SEGMENT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TABLE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TABLE extends ComponentTypeDto {
            TABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TABLE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HOLDING_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOLDING_SECTION extends ComponentTypeDto {
            HOLDING_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HOLDING_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SLIDER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class SLIDER extends ComponentTypeDto {
            SLIDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SLIDER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SCRUB_BAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class SCRUB_BAR extends ComponentTypeDto {
            SCRUB_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SCRUB_BAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STICKY_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class STICKY_BOTTOM_SHEET extends ComponentTypeDto {
            STICKY_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STICKY_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIVE_ACTIVITY", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class LIVE_ACTIVITY extends ComponentTypeDto {
            LIVE_ACTIVITY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIVE_ACTIVITY;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BADGE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class BADGE extends ComponentTypeDto {
            BADGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BADGE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STAKING_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class STAKING_SECTION extends ComponentTypeDto {
            STAKING_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STAKING_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ADVANCED_ALERT_SETTINGS", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ADVANCED_ALERT_SETTINGS extends ComponentTypeDto {
            ADVANCED_ALERT_SETTINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ADVANCED_ALERT_SETTINGS;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PRICE_ALERT_EDITOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRICE_ALERT_EDITOR extends ComponentTypeDto {
            PRICE_ALERT_EDITOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PRICE_ALERT_EDITOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ALERT_SETTING_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALERT_SETTING_ROW extends ComponentTypeDto {
            ALERT_SETTING_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ALERT_SETTING_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ALERT_SETTING_TOGGLE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALERT_SETTING_TOGGLE extends ComponentTypeDto {
            ALERT_SETTING_TOGGLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ALERT_SETTING_TOGGLE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PRICE_ALERT_TYPE_SELECTOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRICE_ALERT_TYPE_SELECTOR extends ComponentTypeDto {
            PRICE_ALERT_TYPE_SELECTOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PRICE_ALERT_TYPE_SELECTOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CANCEL_ERROR_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCEL_ERROR_ALERT extends ComponentTypeDto {
            CANCEL_ERROR_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CANCEL_ERROR_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ERROR_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_ALERT extends ComponentTypeDto {
            ERROR_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ERROR_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALERT extends ComponentTypeDto {
            ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ERROR_LOADING", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_LOADING extends ComponentTypeDto {
            ERROR_LOADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ERROR_LOADING;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CANCEL_CONFIRMATION_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCEL_CONFIRMATION_ALERT extends ComponentTypeDto {
            CANCEL_CONFIRMATION_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CANCEL_CONFIRMATION_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ENABLE_PUSH_NOTIFICATIONS_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENABLE_PUSH_NOTIFICATIONS_ALERT extends ComponentTypeDto {
            ENABLE_PUSH_NOTIFICATIONS_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ENABLE_PUSH_NOTIFICATIONS_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_PHONE_UNAVAILABLE_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_PHONE_UNAVAILABLE_ALERT extends ComponentTypeDto {
            CX_PHONE_UNAVAILABLE_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_PHONE_UNAVAILABLE_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET extends ComponentTypeDto {
            CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_CHAT_STATUS_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_CHAT_STATUS_BANNER extends ComponentTypeDto {
            CX_CHAT_STATUS_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_CHAT_STATUS_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_CHATBOT_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_CHATBOT_BANNER extends ComponentTypeDto {
            CX_CHATBOT_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_CHATBOT_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.UPDATE_EMPLOYER_INFO_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPDATE_EMPLOYER_INFO_ALERT extends ComponentTypeDto {
            UPDATE_EMPLOYER_INFO_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.UPDATE_EMPLOYER_INFO_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DD_MANUAL_SETUP_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DD_MANUAL_SETUP_ALERT extends ComponentTypeDto {
            DD_MANUAL_SETUP_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DD_MANUAL_SETUP_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EARLY_PAY_ENABLE_CONFIRMATION_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARLY_PAY_ENABLE_CONFIRMATION_ALERT extends ComponentTypeDto {
            EARLY_PAY_ENABLE_CONFIRMATION_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EARLY_PAY_ENABLE_CONFIRMATION_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EARLY_PAY_DISABLE_CONFIRMATION_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARLY_PAY_DISABLE_CONFIRMATION_ALERT extends ComponentTypeDto {
            EARLY_PAY_DISABLE_CONFIRMATION_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EARLY_PAY_DISABLE_CONFIRMATION_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EARLY_PAY_TOGGLE_LIMIT_ALERT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARLY_PAY_TOGGLE_LIMIT_ALERT extends ComponentTypeDto {
            EARLY_PAY_TOGGLE_LIMIT_ALERT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EARLY_PAY_TOGGLE_LIMIT_ALERT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ALERT_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALERT_SHEET extends ComponentTypeDto {
            ALERT_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ALERT_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_CALL_STATUS_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_CALL_STATUS_BANNER extends ComponentTypeDto {
            CX_CALL_STATUS_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_CALL_STATUS_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CONTACT_SIGNIN_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTACT_SIGNIN_BANNER extends ComponentTypeDto {
            CONTACT_SIGNIN_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CONTACT_SIGNIN_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INFO_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO_BANNER extends ComponentTypeDto {
            INFO_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INFO_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HERO_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HERO_BANNER extends ComponentTypeDto {
            HERO_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HERO_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STATUS_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_BANNER extends ComponentTypeDto {
            STATUS_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STATUS_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.VERIFY_DEBIT_CARD_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VERIFY_DEBIT_CARD_BANNER extends ComponentTypeDto {
            VERIFY_DEBIT_CARD_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.VERIFY_DEBIT_CARD_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.UPDATE_INVESTOR_PROFILE_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPDATE_INVESTOR_PROFILE_BANNER extends ComponentTypeDto {
            UPDATE_INVESTOR_PROFILE_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.UPDATE_INVESTOR_PROFILE_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACCOUNT_CENTER_UPSELL_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_CENTER_UPSELL_BANNER extends ComponentTypeDto {
            ACCOUNT_CENTER_UPSELL_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACCOUNT_CENTER_UPSELL_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ADD_TO_LIST_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ADD_TO_LIST_BOTTOM_SHEET extends ComponentTypeDto {
            ADD_TO_LIST_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ADD_TO_LIST_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FEEDBACK_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FEEDBACK_BOTTOM_SHEET extends ComponentTypeDto {
            FEEDBACK_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FEEDBACK_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DATE_PICKER_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DATE_PICKER_BOTTOM_SHEET extends ComponentTypeDto {
            DATE_PICKER_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DATE_PICKER_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BOTTOM_SHEET extends ComponentTypeDto {
            BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PASSKEY_ENROLLMENT_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PASSKEY_ENROLLMENT_BOTTOM_SHEET extends ComponentTypeDto {
            PASSKEY_ENROLLMENT_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PASSKEY_ENROLLMENT_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.KEYCHAIN_LOGIN_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class KEYCHAIN_LOGIN_BOTTOM_SHEET extends ComponentTypeDto {
            KEYCHAIN_LOGIN_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.KEYCHAIN_LOGIN_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.GOLD_UPSELL_HOOK_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_UPSELL_HOOK_DIALOG extends ComponentTypeDto {
            GOLD_UPSELL_HOOK_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.GOLD_UPSELL_HOOK_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DONE_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DONE_BUTTON extends ComponentTypeDto {
            DONE_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DONE_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CONTINUE_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTINUE_BUTTON extends ComponentTypeDto {
            CONTINUE_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CONTINUE_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUTTON extends ComponentTypeDto {
            BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SKIP_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SKIP_BUTTON extends ComponentTypeDto {
            SKIP_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SKIP_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FILTERS_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FILTERS_BUTTON extends ComponentTypeDto {
            FILTERS_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FILTERS_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ASSET_TICKER_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_TICKER_BUTTON extends ComponentTypeDto {
            ASSET_TICKER_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ASSET_TICKER_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LINK_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINK_BUTTON extends ComponentTypeDto {
            LINK_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LINK_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BACK_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BACK_BUTTON extends ComponentTypeDto {
            BACK_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BACK_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.REVIEW_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW_BUTTON extends ComponentTypeDto {
            REVIEW_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.REVIEW_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RADIO_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RADIO_BUTTON extends ComponentTypeDto {
            RADIO_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RADIO_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DATE_RANGE_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DATE_RANGE_BUTTON extends ComponentTypeDto {
            DATE_RANGE_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DATE_RANGE_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CLOSE_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLOSE_BUTTON extends ComponentTypeDto {
            CLOSE_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CLOSE_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CANCEL_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCEL_BUTTON extends ComponentTypeDto {
            CANCEL_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CANCEL_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DELETE_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DELETE_BUTTON extends ComponentTypeDto {
            DELETE_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DELETE_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NOT_YET_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOT_YET_BUTTON extends ComponentTypeDto {
            NOT_YET_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NOT_YET_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HELP_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HELP_BUTTON extends ComponentTypeDto {
            HELP_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HELP_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_INVESTMENTS_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_INVESTMENTS_BUTTON extends ComponentTypeDto {
            RECURRING_INVESTMENTS_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_INVESTMENTS_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ASSET_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_CARD extends ComponentTypeDto {
            ASSET_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ASSET_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.REDEMPTION_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REDEMPTION_CARD extends ComponentTypeDto {
            REDEMPTION_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.REDEMPTION_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECOMMENDATIONS_BROWSE_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECOMMENDATIONS_BROWSE_CARD extends ComponentTypeDto {
            RECOMMENDATIONS_BROWSE_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECOMMENDATIONS_BROWSE_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CRYPTO_NOTIFICATION_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_NOTIFICATION_CARD extends ComponentTypeDto {
            CRYPTO_NOTIFICATION_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CRYPTO_NOTIFICATION_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SCREENER_PRESET_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCREENER_PRESET_CARD extends ComponentTypeDto {
            SCREENER_PRESET_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SCREENER_PRESET_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BREAKING_NEWS_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class BREAKING_NEWS_BANNER extends ComponentTypeDto {
            BREAKING_NEWS_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BREAKING_NEWS_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_CHIP_GRID", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_CHIP_GRID extends ComponentTypeDto {
            LIST_CHIP_GRID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_CHIP_GRID;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_CAROUSEL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_CAROUSEL extends ComponentTypeDto {
            LIST_CAROUSEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_CAROUSEL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CAROUSEL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CAROUSEL extends ComponentTypeDto {
            CAROUSEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CAROUSEL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CHIP_GRID", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHIP_GRID extends ComponentTypeDto {
            CHIP_GRID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CHIP_GRID;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_CHIP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_CHIP extends ComponentTypeDto {
            LIST_CHIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_CHIP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CHIP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHIP extends ComponentTypeDto {
            CHIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CHIP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_SUMMARY_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_SUMMARY_DIALOG extends ComponentTypeDto {
            RECURRING_SUMMARY_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_SUMMARY_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CALENDAR_DATE_PICKER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CALENDAR_DATE_PICKER extends ComponentTypeDto {
            CALENDAR_DATE_PICKER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CALENDAR_DATE_PICKER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SEARCH_RESULT_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SEARCH_RESULT_ROW extends ComponentTypeDto {
            SEARCH_RESULT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SEARCH_RESULT_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ASSET_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_ROW extends ComponentTypeDto {
            ASSET_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ASSET_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROW extends ComponentTypeDto {
            ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HISTORY_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HISTORY_ROW extends ComponentTypeDto {
            HISTORY_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HISTORY_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECENT_SEARCH_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECENT_SEARCH_ROW extends ComponentTypeDto {
            RECENT_SEARCH_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECENT_SEARCH_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.L2E_ONBOARDING", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class L2E_ONBOARDING extends ComponentTypeDto {
            L2E_ONBOARDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.L2E_ONBOARDING;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TEXT_FIELD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TEXT_FIELD extends ComponentTypeDto {
            TEXT_FIELD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TEXT_FIELD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SEARCH_BAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SEARCH_BAR extends ComponentTypeDto {
            SEARCH_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SEARCH_BAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ERROR_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_TOAST extends ComponentTypeDto {
            ERROR_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ERROR_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HIDE_CX_CALL_STATUS_BANNER_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HIDE_CX_CALL_STATUS_BANNER_TOAST extends ComponentTypeDto {
            HIDE_CX_CALL_STATUS_BANNER_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HIDE_CX_CALL_STATUS_BANNER_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST extends ComponentTypeDto {
            ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_CALL_ASSIGNED_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_CALL_ASSIGNED_TOAST extends ComponentTypeDto {
            CX_CALL_ASSIGNED_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_CALL_ASSIGNED_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MICROPHONE_PERMISSION_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MICROPHONE_PERMISSION_DIALOG extends ComponentTypeDto {
            MICROPHONE_PERMISSION_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MICROPHONE_PERMISSION_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PERMISSION_SETTINGS_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERMISSION_SETTINGS_DIALOG extends ComponentTypeDto {
            PERMISSION_SETTINGS_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PERMISSION_SETTINGS_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PROCESSING_ERROR_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROCESSING_ERROR_TOAST extends ComponentTypeDto {
            PROCESSING_ERROR_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PROCESSING_ERROR_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PERMISSION_ERROR_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERMISSION_ERROR_TOAST extends ComponentTypeDto {
            PERMISSION_ERROR_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PERMISSION_ERROR_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET extends ComponentTypeDto {
            VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET extends ComponentTypeDto {
            CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.UPDATE_LIST_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPDATE_LIST_TOAST extends ComponentTypeDto {
            UPDATE_LIST_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.UPDATE_LIST_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DD_SWITCHER_ENTRY_POINT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DD_SWITCHER_ENTRY_POINT extends ComponentTypeDto {
            DD_SWITCHER_ENTRY_POINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DD_SWITCHER_ENTRY_POINT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SAFETY_LABEL_INFO_TAG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SAFETY_LABEL_INFO_TAG extends ComponentTypeDto {
            SAFETY_LABEL_INFO_TAG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SAFETY_LABEL_INFO_TAG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TOOLTIP", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLTIP extends ComponentTypeDto {
            TOOLTIP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TOOLTIP;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PERFORMANCE_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERFORMANCE_SECTION extends ComponentTypeDto {
            PERFORMANCE_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PERFORMANCE_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STATS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATS_SECTION extends ComponentTypeDto {
            STATS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STATS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.GRAPH_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPH_SECTION extends ComponentTypeDto {
            GRAPH_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.GRAPH_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.POSITION_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POSITION_SECTION extends ComponentTypeDto {
            POSITION_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.POSITION_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RESEARCH_REPORT_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESEARCH_REPORT_SECTION extends ComponentTypeDto {
            RESEARCH_REPORT_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RESEARCH_REPORT_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EARNINGS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARNINGS_SECTION extends ComponentTypeDto {
            EARNINGS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EARNINGS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PEOPLE_ALSO_VIEW_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PEOPLE_ALSO_VIEW_SECTION extends ComponentTypeDto {
            PEOPLE_ALSO_VIEW_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TRADE_BAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRADE_BAR extends ComponentTypeDto {
            TRADE_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TRADE_BAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ETP_COMPOSITION_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ETP_COMPOSITION_SECTION extends ComponentTypeDto {
            ETP_COMPOSITION_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ETP_COMPOSITION_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ABOUT_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ABOUT_SECTION extends ComponentTypeDto {
            ABOUT_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ABOUT_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ANALYST_RATINGS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ANALYST_RATINGS_SECTION extends ComponentTypeDto {
            ANALYST_RATINGS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ANALYST_RATINGS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RELATED_LISTS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RELATED_LISTS_SECTION extends ComponentTypeDto {
            RELATED_LISTS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RELATED_LISTS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SHAREHOLDER_QA_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHAREHOLDER_QA_SECTION extends ComponentTypeDto {
            SHAREHOLDER_QA_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SHAREHOLDER_QA_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HISTORY_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HISTORY_SECTION extends ComponentTypeDto {
            HISTORY_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HISTORY_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ADVANCED_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ADVANCED_CHART extends ComponentTypeDto {
            ADVANCED_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ADVANCED_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.UPCOMING_ACTIVITY_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPCOMING_ACTIVITY_SECTION extends ComponentTypeDto {
            UPCOMING_ACTIVITY_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.UPCOMING_ACTIVITY_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TAB", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TAB extends ComponentTypeDto {
            TAB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TAB;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NEWS_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEWS_ROW extends ComponentTypeDto {
            NEWS_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NEWS_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HERO_NEWS_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HERO_NEWS_ROW extends ComponentTypeDto {
            HERO_NEWS_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HERO_NEWS_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.VIDEO_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VIDEO_ROW extends ComponentTypeDto {
            VIDEO_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.VIDEO_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HERO_VIDEO_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HERO_VIDEO_ROW extends ComponentTypeDto {
            HERO_VIDEO_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HERO_VIDEO_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FEATURE_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FEATURE_CARD extends ComponentTypeDto {
            FEATURE_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FEATURE_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FEATURE_DISCOVERY_WIDGET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FEATURE_DISCOVERY_WIDGET extends ComponentTypeDto {
            FEATURE_DISCOVERY_WIDGET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FEATURE_DISCOVERY_WIDGET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MARKET_UPDATES", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_UPDATES extends ComponentTypeDto {
            MARKET_UPDATES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MARKET_UPDATES;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MARKET_INDICATOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET_INDICATOR extends ComponentTypeDto {
            MARKET_INDICATOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MARKET_INDICATOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DIRECT_DEPOSIT_OPTION_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECT_DEPOSIT_OPTION_ROW extends ComponentTypeDto {
            DIRECT_DEPOSIT_OPTION_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DIRECT_DEPOSIT_OPTION_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SETUP_DIRECT_DEPOSIT_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SETUP_DIRECT_DEPOSIT_ROW extends ComponentTypeDto {
            SETUP_DIRECT_DEPOSIT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SETUP_DIRECT_DEPOSIT_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DEPOSIT_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT_ROW extends ComponentTypeDto {
            DEPOSIT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DEPOSIT_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.WITHDRAW_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAW_ROW extends ComponentTypeDto {
            WITHDRAW_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.WITHDRAW_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_DEPOSITS_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_DEPOSITS_ROW extends ComponentTypeDto {
            RECURRING_DEPOSITS_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_DEPOSITS_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PAY_BY_CHECK_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAY_BY_CHECK_ROW extends ComponentTypeDto {
            PAY_BY_CHECK_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PAY_BY_CHECK_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TRANSFER_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_ROW extends ComponentTypeDto {
            TRANSFER_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TRANSFER_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DROPDOWN_OPTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DROPDOWN_OPTION extends ComponentTypeDto {
            DROPDOWN_OPTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DROPDOWN_OPTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG extends ComponentTypeDto {
            RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PAYCHECK_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAYCHECK_SECTION extends ComponentTypeDto {
            PAYCHECK_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PAYCHECK_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DEBIT_CARD_KYC_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEBIT_CARD_KYC_BANNER extends ComponentTypeDto {
            DEBIT_CARD_KYC_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DEBIT_CARD_KYC_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACH_TRANSFER_OPTION_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACH_TRANSFER_OPTION_CARD extends ComponentTypeDto {
            ACH_TRANSFER_OPTION_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACH_TRANSFER_OPTION_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CRYPTO_TRANSFERS_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_TRANSFERS_ROW extends ComponentTypeDto {
            CRYPTO_TRANSFERS_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CRYPTO_TRANSFERS_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.WIRE_TRANSFER_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WIRE_TRANSFER_ROW extends ComponentTypeDto {
            WIRE_TRANSFER_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.WIRE_TRANSFER_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.WIRE_UPSELL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WIRE_UPSELL extends ComponentTypeDto {
            WIRE_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.WIRE_UPSELL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TRANSFER_REWARD_PILL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_REWARD_PILL extends ComponentTypeDto {
            TRANSFER_REWARD_PILL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TRANSFER_REWARD_PILL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EARLY_PAY_TOGGLE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARLY_PAY_TOGGLE extends ComponentTypeDto {
            EARLY_PAY_TOGGLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EARLY_PAY_TOGGLE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EARLY_PAY_FAQ_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARLY_PAY_FAQ_ROW extends ComponentTypeDto {
            EARLY_PAY_FAQ_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EARLY_PAY_FAQ_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_HERO", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_HERO extends ComponentTypeDto {
            LIST_HERO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_HERO;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_ASSET_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_ASSET_ROW extends ComponentTypeDto {
            LIST_ASSET_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_ASSET_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_CONTACTS", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_CONTACTS extends ComponentTypeDto {
            LIST_CONTACTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_CONTACTS;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LIST_VIDEO", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIST_VIDEO extends ComponentTypeDto {
            LIST_VIDEO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LIST_VIDEO;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_INSTRUMENT_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_INSTRUMENT_ROW extends ComponentTypeDto {
            OPTION_INSTRUMENT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_INSTRUMENT_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_UNTRADABLE_INFO_BAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_UNTRADABLE_INFO_BAR extends ComponentTypeDto {
            OPTION_UNTRADABLE_INFO_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_UNTRADABLE_INFO_BAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_NO_MARKETDATA_MESSAGE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_NO_MARKETDATA_MESSAGE extends ComponentTypeDto {
            OPTION_NO_MARKETDATA_MESSAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_NO_MARKETDATA_MESSAGE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_PNL_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_PNL_CHART extends ComponentTypeDto {
            OPTION_PNL_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_PNL_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_CHAIN_STOCK_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_CHAIN_STOCK_CHART extends ComponentTypeDto {
            OPTION_CHAIN_STOCK_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_CHAIN_STOCK_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_PENDING_ORDER_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_PENDING_ORDER_ROW extends ComponentTypeDto {
            OPTION_PENDING_ORDER_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_PENDING_ORDER_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_WATCHLIST_ITEM_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_WATCHLIST_ITEM_ROW extends ComponentTypeDto {
            OPTION_WATCHLIST_ITEM_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_WATCHLIST_ITEM_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_FORM_TYPE_SELECTOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_FORM_TYPE_SELECTOR extends ComponentTypeDto {
            OPTION_ORDER_FORM_TYPE_SELECTOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_FORM_TYPE_SELECTOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_FORM_TYPE_GEAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_FORM_TYPE_GEAR extends ComponentTypeDto {
            OPTION_ORDER_FORM_TYPE_GEAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_FORM_TYPE_GEAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_CONFIGURATION_SWITCH", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_CONFIGURATION_SWITCH extends ComponentTypeDto {
            OPTION_ORDER_CONFIGURATION_SWITCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_CONFIGURATION_SWITCH;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_CONFIGURATION_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_CONFIGURATION_ROW extends ComponentTypeDto {
            OPTION_ORDER_CONFIGURATION_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_CONFIGURATION_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_UNTRADABLE_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_UNTRADABLE_DIALOG extends ComponentTypeDto {
            OPTION_UNTRADABLE_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_UNTRADABLE_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_PCO_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_PCO_DIALOG extends ComponentTypeDto {
            OPTION_PCO_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_PCO_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_EXPIRATION_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_EXPIRATION_DIALOG extends ComponentTypeDto {
            OPTION_EXPIRATION_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_EXPIRATION_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_WATCHLIST_WELCOME_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_WATCHLIST_WELCOME_SHEET extends ComponentTypeDto {
            OPTION_WATCHLIST_WELCOME_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_WATCHLIST_WELCOME_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_PENDING_ORDER_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_PENDING_ORDER_DIALOG extends ComponentTypeDto {
            OPTION_PENDING_ORDER_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_PENDING_ORDER_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NO_POSITIONS_AVAILABLE_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NO_POSITIONS_AVAILABLE_BOTTOM_SHEET extends ComponentTypeDto {
            NO_POSITIONS_AVAILABLE_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NO_POSITIONS_AVAILABLE_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STRATEGY_INTRO_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STRATEGY_INTRO_CARD extends ComponentTypeDto {
            STRATEGY_INTRO_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STRATEGY_INTRO_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STRATEGY_SUMMARY_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STRATEGY_SUMMARY_CARD extends ComponentTypeDto {
            STRATEGY_SUMMARY_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STRATEGY_SUMMARY_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_MARKETABILITY_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_MARKETABILITY_BANNER extends ComponentTypeDto {
            OPTION_ORDER_MARKETABILITY_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_MARKETABILITY_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_MARKETABILITY_TAG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_MARKETABILITY_TAG extends ComponentTypeDto {
            OPTION_ORDER_MARKETABILITY_TAG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_MARKETABILITY_TAG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ROLLING_CASH_ACCOUNT_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROLLING_CASH_ACCOUNT_BOTTOM_SHEET extends ComponentTypeDto {
            ROLLING_CASH_ACCOUNT_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ROLLING_CASH_ACCOUNT_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STRATEGY_BUILDER_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STRATEGY_BUILDER_CARD extends ComponentTypeDto {
            STRATEGY_BUILDER_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STRATEGY_BUILDER_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_STRATEGY_CHAIN_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_STRATEGY_CHAIN_BOTTOM_SHEET extends ComponentTypeDto {
            OPTION_STRATEGY_CHAIN_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_STRATEGY_CHAIN_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.STRATEGY_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STRATEGY_ROW extends ComponentTypeDto {
            STRATEGY_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.STRATEGY_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_SIMULATED_RETURNS_SLIDER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_SIMULATED_RETURNS_SLIDER extends ComponentTypeDto {
            OPTION_SIMULATED_RETURNS_SLIDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_SIMULATED_RETURNS_SLIDER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_SIMULATED_RETURNS_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_SIMULATED_RETURNS_CHART extends ComponentTypeDto {
            OPTION_SIMULATED_RETURNS_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_SIMULATED_RETURNS_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_ORDER_BID_ASK_BAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER_BID_ASK_BAR extends ComponentTypeDto {
            OPTION_ORDER_BID_ASK_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_ORDER_BID_ASK_BAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INDEX_OPTION_PCO_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDEX_OPTION_PCO_DIALOG extends ComponentTypeDto {
            INDEX_OPTION_PCO_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INDEX_OPTION_PCO_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_INSTRUMENT_PILL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTION_INSTRUMENT_PILL extends ComponentTypeDto {
            OPTION_INSTRUMENT_PILL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_INSTRUMENT_PILL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_DISPLAY_MODE_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTION_DISPLAY_MODE_CARD extends ComponentTypeDto {
            OPTION_DISPLAY_MODE_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_DISPLAY_MODE_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_FREQUENCY_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_FREQUENCY_ROW extends ComponentTypeDto {
            RECURRING_FREQUENCY_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_FREQUENCY_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_PAYMENT_METHOD_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_PAYMENT_METHOD_ROW extends ComponentTypeDto {
            RECURRING_PAYMENT_METHOD_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_PAYMENT_METHOD_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_HUB_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_HUB_ROW extends ComponentTypeDto {
            RECURRING_HUB_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_HUB_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_START_DATE_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_START_DATE_ROW extends ComponentTypeDto {
            RECURRING_START_DATE_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_START_DATE_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_AMOUNT_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_AMOUNT_ROW extends ComponentTypeDto {
            RECURRING_AMOUNT_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_AMOUNT_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.REWARD_CLAIM_CERTIFICATE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REWARD_CLAIM_CERTIFICATE extends ComponentTypeDto {
            REWARD_CLAIM_CERTIFICATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.REWARD_CLAIM_CERTIFICATE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MERCHANT_REWARD_CAROUSEL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MERCHANT_REWARD_CAROUSEL extends ComponentTypeDto {
            MERCHANT_REWARD_CAROUSEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MERCHANT_REWARD_CAROUSEL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MERCHANT_REWARD_OFFER_DETAIL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MERCHANT_REWARD_OFFER_DETAIL extends ComponentTypeDto {
            MERCHANT_REWARD_OFFER_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MERCHANT_REWARD_OFFER_DETAIL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MERCHANT_REWARD_STATE_EXPLANATION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MERCHANT_REWARD_STATE_EXPLANATION extends ComponentTypeDto {
            MERCHANT_REWARD_STATE_EXPLANATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MERCHANT_REWARD_STATE_EXPLANATION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MERCHANT_REWARD_OFFER_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MERCHANT_REWARD_OFFER_CARD extends ComponentTypeDto {
            MERCHANT_REWARD_OFFER_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MERCHANT_REWARD_OFFER_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.POST_REWARD_CLAIM_UPSELL_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST_REWARD_CLAIM_UPSELL_DIALOG extends ComponentTypeDto {
            POST_REWARD_CLAIM_UPSELL_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.POST_REWARD_CLAIM_UPSELL_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ORDER_KIND_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_KIND_ROW extends ComponentTypeDto {
            ORDER_KIND_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ORDER_KIND_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ADD_ACCOUNT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ADD_ACCOUNT extends ComponentTypeDto {
            ADD_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ADD_ACCOUNT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ORDER_TYPE_PICKER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_TYPE_PICKER extends ComponentTypeDto {
            ORDER_TYPE_PICKER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ORDER_TYPE_PICKER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACCOUNT_PCO_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_PCO_DIALOG extends ComponentTypeDto {
            ACCOUNT_PCO_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACCOUNT_PCO_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INVESTMENT_BASKET_TOGGLE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVESTMENT_BASKET_TOGGLE extends ComponentTypeDto {
            INVESTMENT_BASKET_TOGGLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INVESTMENT_BASKET_TOGGLE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INVESTMENT_ADDED_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVESTMENT_ADDED_TOAST extends ComponentTypeDto {
            INVESTMENT_ADDED_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INVESTMENT_ADDED_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BASKET_FULL_TOAST", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BASKET_FULL_TOAST extends ComponentTypeDto {
            BASKET_FULL_TOAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BASKET_FULL_TOAST;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PERFORMANCE_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERFORMANCE_CHART extends ComponentTypeDto {
            PERFORMANCE_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PERFORMANCE_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PERFORMANCE_CHART_SETTINGS", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERFORMANCE_CHART_SETTINGS extends ComponentTypeDto {
            PERFORMANCE_CHART_SETTINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PERFORMANCE_CHART_SETTINGS;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SPAN_SELECTOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPAN_SELECTOR extends ComponentTypeDto {
            SPAN_SELECTOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SPAN_SELECTOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DAY_TRADE_COUNTER_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_TRADE_COUNTER_ROW extends ComponentTypeDto {
            DAY_TRADE_COUNTER_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DAY_TRADE_COUNTER_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DAY_TRADE_COUNTER_GRAPHIC", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_TRADE_COUNTER_GRAPHIC extends ComponentTypeDto {
            DAY_TRADE_COUNTER_GRAPHIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DAY_TRADE_COUNTER_GRAPHIC;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_LESSON_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_LESSON_CARD extends ComponentTypeDto {
            LEARNING_LESSON_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_LESSON_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_LESSON_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_LESSON_ROW extends ComponentTypeDto {
            LEARNING_LESSON_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_LESSON_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_SECTION extends ComponentTypeDto {
            LEARNING_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_ENTRY_POINT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_ENTRY_POINT extends ComponentTypeDto {
            LEARNING_ENTRY_POINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_ENTRY_POINT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_MATCHING_EXERCISE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_MATCHING_EXERCISE extends ComponentTypeDto {
            LEARNING_MATCHING_EXERCISE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_MATCHING_EXERCISE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_MATCHING_EXERCISE_ENTITY", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_MATCHING_EXERCISE_ENTITY extends ComponentTypeDto {
            LEARNING_MATCHING_EXERCISE_ENTITY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_MATCHING_EXERCISE_ENTITY;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_MATCHING_EXERCISE_BUCKET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_MATCHING_EXERCISE_BUCKET extends ComponentTypeDto {
            LEARNING_MATCHING_EXERCISE_BUCKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_MATCHING_EXERCISE_BUCKET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_FEEDBACK", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_FEEDBACK extends ComponentTypeDto {
            LEARNING_FEEDBACK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_FEEDBACK;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_INTERSTITIAL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_INTERSTITIAL extends ComponentTypeDto {
            LEARNING_INTERSTITIAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_INTERSTITIAL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LEARNING_QUIZ_CONTINUE_HINT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LEARNING_QUIZ_CONTINUE_HINT extends ComponentTypeDto {
            LEARNING_QUIZ_CONTINUE_HINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LEARNING_QUIZ_CONTINUE_HINT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EDUCATION_TOUR_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EDUCATION_TOUR_CARD extends ComponentTypeDto {
            EDUCATION_TOUR_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EDUCATION_TOUR_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TRANSFER_DETAILS_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_DETAILS_ROW extends ComponentTypeDto {
            TRANSFER_DETAILS_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TRANSFER_DETAILS_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG extends ComponentTypeDto {
            RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_CAROUSEL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_CAROUSEL extends ComponentTypeDto {
            RHY_CAROUSEL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_CAROUSEL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_HOME_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_HOME_CARD extends ComponentTypeDto {
            RHY_HOME_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_HOME_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_HOME_STATUS_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_HOME_STATUS_BANNER extends ComponentTypeDto {
            RHY_HOME_STATUS_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_HOME_STATUS_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.HOME_ATM_FINDER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOME_ATM_FINDER extends ComponentTypeDto {
            HOME_ATM_FINDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.HOME_ATM_FINDER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_DD_UPSELL_POST_TRANSFER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_DD_UPSELL_POST_TRANSFER extends ComponentTypeDto {
            RHY_DD_UPSELL_POST_TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_DD_UPSELL_POST_TRANSFER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BACKUP_COVERAGE_TOGGLE", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BACKUP_COVERAGE_TOGGLE extends ComponentTypeDto {
            BACKUP_COVERAGE_TOGGLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BACKUP_COVERAGE_TOGGLE;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FLAT_CASHBACK_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FLAT_CASHBACK_BOTTOM_SHEET extends ComponentTypeDto {
            FLAT_CASHBACK_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FLAT_CASHBACK_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_REFERRAL_CASH_OFFER_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_REFERRAL_CASH_OFFER_CARD extends ComponentTypeDto {
            RHY_REFERRAL_CASH_OFFER_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_REFERRAL_CASH_OFFER_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_WAITLIST_UPSELL_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_WAITLIST_UPSELL_CARD extends ComponentTypeDto {
            RHY_WAITLIST_UPSELL_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_WAITLIST_UPSELL_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_WAITLIST_WAITING_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_WAITLIST_WAITING_CARD extends ComponentTypeDto {
            RHY_WAITLIST_WAITING_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_WAITLIST_WAITING_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_WAITLIST_CAT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_WAITLIST_CAT extends ComponentTypeDto {
            RHY_WAITLIST_CAT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_WAITLIST_CAT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_MIGRATION_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_MIGRATION_BOTTOM_SHEET extends ComponentTypeDto {
            RHY_MIGRATION_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_MIGRATION_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET extends ComponentTypeDto {
            RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_TURBOTAX_OFFER_BUTTON_RHY", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_TURBOTAX_OFFER_BUTTON_RHY extends ComponentTypeDto {
            RHY_TURBOTAX_OFFER_BUTTON_RHY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_TURBOTAX_OFFER_BUTTON_RHY;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RHY_TURBOTAX_OFFER_BUTTON_NON_RHY", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_TURBOTAX_OFFER_BUTTON_NON_RHY extends ComponentTypeDto {
            RHY_TURBOTAX_OFFER_BUTTON_NON_RHY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RHY_TURBOTAX_OFFER_BUTTON_NON_RHY;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.REFERRAL_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REFERRAL_BANNER extends ComponentTypeDto {
            REFERRAL_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.REFERRAL_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACCOUNT_CENTER_REFERRAL_ENTRY_POINT", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_CENTER_REFERRAL_ENTRY_POINT extends ComponentTypeDto {
            ACCOUNT_CENTER_REFERRAL_ENTRY_POINT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACCOUNT_CENTER_REFERRAL_ENTRY_POINT;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SWEEP_DISABLE_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWEEP_DISABLE_DIALOG extends ComponentTypeDto {
            SWEEP_DISABLE_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SWEEP_DISABLE_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SWEEP_PAUSED_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWEEP_PAUSED_DIALOG extends ComponentTypeDto {
            SWEEP_PAUSED_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SWEEP_PAUSED_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET extends ComponentTypeDto {
            VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG extends ComponentTypeDto {
            CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SWEPT_CASH_BALANCE_EXPLANATION_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWEPT_CASH_BALANCE_EXPLANATION_DIALOG extends ComponentTypeDto {
            SWEPT_CASH_BALANCE_EXPLANATION_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SWEPT_CASH_BALANCE_EXPLANATION_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CASH_SWEEP_ALREADY_ENABLED_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASH_SWEEP_ALREADY_ENABLED_DIALOG extends ComponentTypeDto {
            CASH_SWEEP_ALREADY_ENABLED_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CASH_SWEEP_ALREADY_ENABLED_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CASH_SWEEP_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASH_SWEEP_SECTION extends ComponentTypeDto {
            CASH_SWEEP_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CASH_SWEEP_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SLIP_SETTING_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SLIP_SETTING_CARD extends ComponentTypeDto {
            SLIP_SETTING_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SLIP_SETTING_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LINK_DEBIT_CARD_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINK_DEBIT_CARD_BANNER extends ComponentTypeDto {
            LINK_DEBIT_CARD_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LINK_DEBIT_CARD_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SHAREHOLDER_LIST_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHAREHOLDER_LIST_SECTION extends ComponentTypeDto {
            SHAREHOLDER_LIST_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SHAREHOLDER_LIST_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET extends ComponentTypeDto {
            MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.MARGIN_REQUIREMENT_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN_REQUIREMENT_SECTION extends ComponentTypeDto {
            MARGIN_REQUIREMENT_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.MARGIN_REQUIREMENT_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.IRA_TAX_WITHHOLDING_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IRA_TAX_WITHHOLDING_BOTTOM_SHEET extends ComponentTypeDto {
            IRA_TAX_WITHHOLDING_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.IRA_TAX_WITHHOLDING_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACCOUNT_SELECTOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_SELECTOR extends ComponentTypeDto {
            ACCOUNT_SELECTOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACCOUNT_SELECTOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BIOMETRIC_AUTH_BUTTON", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BIOMETRIC_AUTH_BUTTON extends ComponentTypeDto {
            BIOMETRIC_AUTH_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BIOMETRIC_AUTH_BUTTON;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PORTFOLIO_TABLE_COLUMN_HEADING", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PORTFOLIO_TABLE_COLUMN_HEADING extends ComponentTypeDto {
            PORTFOLIO_TABLE_COLUMN_HEADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PORTFOLIO_TABLE_COLUMN_HEADING;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ASSET_DISPLAY_VALUE_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_DISPLAY_VALUE_DIALOG extends ComponentTypeDto {
            ASSET_DISPLAY_VALUE_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ASSET_DISPLAY_VALUE_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.BUYING_POWER_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUYING_POWER_ROW extends ComponentTypeDto {
            BUYING_POWER_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.BUYING_POWER_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PORTFOLIO_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PORTFOLIO_CHART extends ComponentTypeDto {
            PORTFOLIO_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PORTFOLIO_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET extends ComponentTypeDto {
            GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET extends ComponentTypeDto {
            GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ASSET_SELECTOR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET_SELECTOR extends ComponentTypeDto {
            ASSET_SELECTOR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ASSET_SELECTOR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PNL_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PNL_CHART extends ComponentTypeDto {
            PNL_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PNL_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PNL_SETTINGS", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PNL_SETTINGS extends ComponentTypeDto {
            PNL_SETTINGS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PNL_SETTINGS;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PNL_DETAIL_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PNL_DETAIL_BOTTOM_SHEET extends ComponentTypeDto {
            PNL_DETAIL_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PNL_DETAIL_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.REALIZED_GAIN_LOSS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REALIZED_GAIN_LOSS_SECTION extends ComponentTypeDto {
            REALIZED_GAIN_LOSS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.REALIZED_GAIN_LOSS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FUTURES_TRADE_BAR", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FUTURES_TRADE_BAR extends ComponentTypeDto {
            FUTURES_TRADE_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FUTURES_TRADE_BAR;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FUTURES_LIST_SORT_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FUTURES_LIST_SORT_BOTTOM_SHEET extends ComponentTypeDto {
            FUTURES_LIST_SORT_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FUTURES_LIST_SORT_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.LADDER_NUX", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class LADDER_NUX extends ComponentTypeDto {
            LADDER_NUX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.LADDER_NUX;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CASH_BALANCES_HOME_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CASH_BALANCES_HOME_SECTION extends ComponentTypeDto {
            CASH_BALANCES_HOME_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CASH_BALANCES_HOME_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CORTEX_DIGEST_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CORTEX_DIGEST_SECTION extends ComponentTypeDto {
            CORTEX_DIGEST_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CORTEX_DIGEST_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PILL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PILL extends ComponentTypeDto {
            PILL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PILL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EDUCATION_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EDUCATION_ROW extends ComponentTypeDto {
            EDUCATION_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EDUCATION_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.NEWS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class NEWS_SECTION extends ComponentTypeDto {
            NEWS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.NEWS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PENDING_ORDER_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PENDING_ORDER_ROW extends ComponentTypeDto {
            PENDING_ORDER_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PENDING_ORDER_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PENDING_ORDER_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PENDING_ORDER_SECTION extends ComponentTypeDto {
            PENDING_ORDER_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PENDING_ORDER_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TOKENIZED_STOCK_HOLDING_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class TOKENIZED_STOCK_HOLDING_ROW extends ComponentTypeDto {
            TOKENIZED_STOCK_HOLDING_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TOKENIZED_STOCK_HOLDING_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.TOKENIZED_STOCK_HOLDING_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class TOKENIZED_STOCK_HOLDING_SECTION extends ComponentTypeDto {
            TOKENIZED_STOCK_HOLDING_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.TOKENIZED_STOCK_HOLDING_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PERPETUALS_HOLDING_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PERPETUALS_HOLDING_SECTION extends ComponentTypeDto {
            PERPETUALS_HOLDING_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PERPETUALS_HOLDING_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPEN_POSITION_SUMMARY", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPEN_POSITION_SUMMARY extends ComponentTypeDto {
            OPEN_POSITION_SUMMARY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPEN_POSITION_SUMMARY;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPEN_POSITIONS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPEN_POSITIONS_SECTION extends ComponentTypeDto {
            OPEN_POSITIONS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPEN_POSITIONS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PENDING_ORDERS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PENDING_ORDERS_SECTION extends ComponentTypeDto {
            PENDING_ORDERS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PENDING_ORDERS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EXPLORE_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EXPLORE_SECTION extends ComponentTypeDto {
            EXPLORE_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EXPLORE_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PNL_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PNL_SECTION extends ComponentTypeDto {
            PNL_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PNL_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_PROFIT_AND_LOSS_CARD", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTION_PROFIT_AND_LOSS_CARD extends ComponentTypeDto {
            OPTION_PROFIT_AND_LOSS_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_PROFIT_AND_LOSS_CARD;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_PROFIT_AND_LOSS_SLIDER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTION_PROFIT_AND_LOSS_SLIDER extends ComponentTypeDto {
            OPTION_PROFIT_AND_LOSS_SLIDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_PROFIT_AND_LOSS_SLIDER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.COMPANY_FINANCIALS_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class COMPANY_FINANCIALS_CHART extends ComponentTypeDto {
            COMPANY_FINANCIALS_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.COMPANY_FINANCIALS_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CORTEX_DIGEST_UPSELL_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CORTEX_DIGEST_UPSELL_SECTION extends ComponentTypeDto {
            CORTEX_DIGEST_UPSELL_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CORTEX_DIGEST_UPSELL_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.COMPANY_FINANCIALS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class COMPANY_FINANCIALS_SECTION extends ComponentTypeDto {
            COMPANY_FINANCIALS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.COMPANY_FINANCIALS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.WATCHLIST_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class WATCHLIST_ROW extends ComponentTypeDto {
            WATCHLIST_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.WATCHLIST_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RETURNS_CHART", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class RETURNS_CHART extends ComponentTypeDto {
            RETURNS_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RETURNS_CHART;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.SELECT_MENU", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class SELECT_MENU extends ComponentTypeDto {
            SELECT_MENU(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.SELECT_MENU;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTIONS_STATUS_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTIONS_STATUS_SECTION extends ComponentTypeDto {
            OPTIONS_STATUS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTIONS_STATUS_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FX_SWITCHER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FX_SWITCHER extends ComponentTypeDto {
            FX_SWITCHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FX_SWITCHER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.PROXY_VOTE_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class PROXY_VOTE_SECTION extends ComponentTypeDto {
            PROXY_VOTE_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.PROXY_VOTE_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EVENT_CONTRACT_TRADE_OVERLAY_DIALOG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EVENT_CONTRACT_TRADE_OVERLAY_DIALOG extends ComponentTypeDto {
            EVENT_CONTRACT_TRADE_OVERLAY_DIALOG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EVENT_CONTRACT_TRADE_OVERLAY_DIALOG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.OPTION_L3_ENTRYPOINT_TAG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTION_L3_ENTRYPOINT_TAG extends ComponentTypeDto {
            OPTION_L3_ENTRYPOINT_TAG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.OPTION_L3_ENTRYPOINT_TAG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET extends ComponentTypeDto {
            CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.DASHBOARD_PILL", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class DASHBOARD_PILL extends ComponentTypeDto {
            DASHBOARD_PILL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.DASHBOARD_PILL;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.FEED_POST_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class FEED_POST_ROW extends ComponentTypeDto {
            FEED_POST_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.FEED_POST_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.ACTIVITY_ITEM_ROW", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class ACTIVITY_ITEM_ROW extends ComponentTypeDto {
            ACTIVITY_ITEM_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.ACTIVITY_ITEM_ROW;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CONCIERGE_PLUS_UPSELL_BANNER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CONCIERGE_PLUS_UPSELL_BANNER extends ComponentTypeDto {
            CONCIERGE_PLUS_UPSELL_BANNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CONCIERGE_PLUS_UPSELL_BANNER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.RECURRING_INVESTMENTS_EQUITY_NUX", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class RECURRING_INVESTMENTS_EQUITY_NUX extends ComponentTypeDto {
            RECURRING_INVESTMENTS_EQUITY_NUX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.RECURRING_INVESTMENTS_EQUITY_NUX;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EVENT_CONTRACT_COMBO_LEG", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EVENT_CONTRACT_COMBO_LEG extends ComponentTypeDto {
            EVENT_CONTRACT_COMBO_LEG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EVENT_CONTRACT_COMBO_LEG;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.EVENT_CONTRACT_STRIKE_PICKER", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class EVENT_CONTRACT_STRIKE_PICKER extends ComponentTypeDto {
            EVENT_CONTRACT_STRIKE_PICKER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.EVENT_CONTRACT_STRIKE_PICKER;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.INTEREST_SECTION", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class INTEREST_SECTION extends ComponentTypeDto {
            INTEREST_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.INTEREST_SECTION;
            }
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ComponentDto.ComponentTypeDto.CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET extends ComponentTypeDto {
            CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Component.ComponentType toProto() {
                return Component.ComponentType.CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ComponentTypeDto, Component.ComponentType> {

            /* compiled from: ComponentDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Component.ComponentType.values().length];
                    try {
                        iArr[Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Component.ComponentType.LOADING_PLACEHOLDER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Component.ComponentType.MAP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Component.ComponentType.QR_CODE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Component.ComponentType.INLINE_DEFINITION.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Component.ComponentType.PUSH_NOTIFICATION.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Component.ComponentType.MENU_ITEM.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[Component.ComponentType.EDUCATION_TOUR_TOOLTIP.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[Component.ComponentType.NEW_PRODUCT_CARD.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[Component.ComponentType.BALANCE_SECTION.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[Component.ComponentType.SHORTCUTS_FIRST_TIME_POPUP.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[Component.ComponentType.ACCOUNT_SWITCHER.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[Component.ComponentType.ACCOUNT_SWITCHER_BOTTOM_SHEET.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[Component.ComponentType.HOLDING_ROW.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[Component.ComponentType.PRICE_CHART.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_ROW.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[Component.ComponentType.EXPLORE_ROW.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[Component.ComponentType.NOTIFICATION_CARD.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[Component.ComponentType.NOTIFICATION_CARD_STACK.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[Component.ComponentType.NOTIFICATION_COMPLETION_CARD.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[Component.ComponentType.SIDEBAR.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_ROW.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_HEADER.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[Component.ComponentType.SECTION_HEADER.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[Component.ComponentType.TOGGLE.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[Component.ComponentType.CARD.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[Component.ComponentType.SUCCESS_TOAST.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[Component.ComponentType.INFO_TAG.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[Component.ComponentType.FX_CONVERSION_TOOLTIP.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[Component.ComponentType.HERO_CARD.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[Component.ComponentType.TEXT_VIEW.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[Component.ComponentType.SEGMENTED_CONTROL.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[Component.ComponentType.TRADING_TRENDS_CHART.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[Component.ComponentType.SEGMENT.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[Component.ComponentType.TABLE.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[Component.ComponentType.HOLDING_SECTION.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[Component.ComponentType.SLIDER.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[Component.ComponentType.SCRUB_BAR.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[Component.ComponentType.STICKY_BOTTOM_SHEET.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[Component.ComponentType.LIVE_ACTIVITY.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[Component.ComponentType.BADGE.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[Component.ComponentType.STAKING_SECTION.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[Component.ComponentType.ADVANCED_ALERT_SETTINGS.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[Component.ComponentType.PRICE_ALERT_EDITOR.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[Component.ComponentType.ALERT_SETTING_ROW.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[Component.ComponentType.ALERT_SETTING_TOGGLE.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[Component.ComponentType.PRICE_ALERT_TYPE_SELECTOR.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[Component.ComponentType.CANCEL_ERROR_ALERT.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr[Component.ComponentType.ERROR_ALERT.ordinal()] = 49;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr[Component.ComponentType.ALERT.ordinal()] = 50;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr[Component.ComponentType.ERROR_LOADING.ordinal()] = 51;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr[Component.ComponentType.CANCEL_CONFIRMATION_ALERT.ordinal()] = 52;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr[Component.ComponentType.ENABLE_PUSH_NOTIFICATIONS_ALERT.ordinal()] = 53;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_PHONE_UNAVAILABLE_ALERT.ordinal()] = 54;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET.ordinal()] = 55;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_CHAT_STATUS_BANNER.ordinal()] = 56;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_CHATBOT_BANNER.ordinal()] = 57;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr[Component.ComponentType.UPDATE_EMPLOYER_INFO_ALERT.ordinal()] = 58;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr[Component.ComponentType.DD_MANUAL_SETUP_ALERT.ordinal()] = 59;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr[Component.ComponentType.EARLY_PAY_ENABLE_CONFIRMATION_ALERT.ordinal()] = 60;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr[Component.ComponentType.EARLY_PAY_DISABLE_CONFIRMATION_ALERT.ordinal()] = 61;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr[Component.ComponentType.EARLY_PAY_TOGGLE_LIMIT_ALERT.ordinal()] = 62;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr[Component.ComponentType.ALERT_SHEET.ordinal()] = 63;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_CALL_STATUS_BANNER.ordinal()] = 64;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr[Component.ComponentType.CONTACT_SIGNIN_BANNER.ordinal()] = 65;
                    } catch (NoSuchFieldError unused65) {
                    }
                    try {
                        iArr[Component.ComponentType.INFO_BANNER.ordinal()] = 66;
                    } catch (NoSuchFieldError unused66) {
                    }
                    try {
                        iArr[Component.ComponentType.HERO_BANNER.ordinal()] = 67;
                    } catch (NoSuchFieldError unused67) {
                    }
                    try {
                        iArr[Component.ComponentType.STATUS_BANNER.ordinal()] = 68;
                    } catch (NoSuchFieldError unused68) {
                    }
                    try {
                        iArr[Component.ComponentType.VERIFY_DEBIT_CARD_BANNER.ordinal()] = 69;
                    } catch (NoSuchFieldError unused69) {
                    }
                    try {
                        iArr[Component.ComponentType.UPDATE_INVESTOR_PROFILE_BANNER.ordinal()] = 70;
                    } catch (NoSuchFieldError unused70) {
                    }
                    try {
                        iArr[Component.ComponentType.ACCOUNT_CENTER_UPSELL_BANNER.ordinal()] = 71;
                    } catch (NoSuchFieldError unused71) {
                    }
                    try {
                        iArr[Component.ComponentType.ADD_TO_LIST_BOTTOM_SHEET.ordinal()] = 72;
                    } catch (NoSuchFieldError unused72) {
                    }
                    try {
                        iArr[Component.ComponentType.FEEDBACK_BOTTOM_SHEET.ordinal()] = 73;
                    } catch (NoSuchFieldError unused73) {
                    }
                    try {
                        iArr[Component.ComponentType.DATE_PICKER_BOTTOM_SHEET.ordinal()] = 74;
                    } catch (NoSuchFieldError unused74) {
                    }
                    try {
                        iArr[Component.ComponentType.BOTTOM_SHEET.ordinal()] = 75;
                    } catch (NoSuchFieldError unused75) {
                    }
                    try {
                        iArr[Component.ComponentType.PASSKEY_ENROLLMENT_BOTTOM_SHEET.ordinal()] = 76;
                    } catch (NoSuchFieldError unused76) {
                    }
                    try {
                        iArr[Component.ComponentType.KEYCHAIN_LOGIN_BOTTOM_SHEET.ordinal()] = 77;
                    } catch (NoSuchFieldError unused77) {
                    }
                    try {
                        iArr[Component.ComponentType.GOLD_UPSELL_HOOK_DIALOG.ordinal()] = 78;
                    } catch (NoSuchFieldError unused78) {
                    }
                    try {
                        iArr[Component.ComponentType.DONE_BUTTON.ordinal()] = 79;
                    } catch (NoSuchFieldError unused79) {
                    }
                    try {
                        iArr[Component.ComponentType.CONTINUE_BUTTON.ordinal()] = 80;
                    } catch (NoSuchFieldError unused80) {
                    }
                    try {
                        iArr[Component.ComponentType.BUTTON.ordinal()] = 81;
                    } catch (NoSuchFieldError unused81) {
                    }
                    try {
                        iArr[Component.ComponentType.SKIP_BUTTON.ordinal()] = 82;
                    } catch (NoSuchFieldError unused82) {
                    }
                    try {
                        iArr[Component.ComponentType.FILTERS_BUTTON.ordinal()] = 83;
                    } catch (NoSuchFieldError unused83) {
                    }
                    try {
                        iArr[Component.ComponentType.ASSET_TICKER_BUTTON.ordinal()] = 84;
                    } catch (NoSuchFieldError unused84) {
                    }
                    try {
                        iArr[Component.ComponentType.LINK_BUTTON.ordinal()] = 85;
                    } catch (NoSuchFieldError unused85) {
                    }
                    try {
                        iArr[Component.ComponentType.BACK_BUTTON.ordinal()] = 86;
                    } catch (NoSuchFieldError unused86) {
                    }
                    try {
                        iArr[Component.ComponentType.REVIEW_BUTTON.ordinal()] = 87;
                    } catch (NoSuchFieldError unused87) {
                    }
                    try {
                        iArr[Component.ComponentType.RADIO_BUTTON.ordinal()] = 88;
                    } catch (NoSuchFieldError unused88) {
                    }
                    try {
                        iArr[Component.ComponentType.DATE_RANGE_BUTTON.ordinal()] = 89;
                    } catch (NoSuchFieldError unused89) {
                    }
                    try {
                        iArr[Component.ComponentType.CLOSE_BUTTON.ordinal()] = 90;
                    } catch (NoSuchFieldError unused90) {
                    }
                    try {
                        iArr[Component.ComponentType.CANCEL_BUTTON.ordinal()] = 91;
                    } catch (NoSuchFieldError unused91) {
                    }
                    try {
                        iArr[Component.ComponentType.DELETE_BUTTON.ordinal()] = 92;
                    } catch (NoSuchFieldError unused92) {
                    }
                    try {
                        iArr[Component.ComponentType.NOT_YET_BUTTON.ordinal()] = 93;
                    } catch (NoSuchFieldError unused93) {
                    }
                    try {
                        iArr[Component.ComponentType.HELP_BUTTON.ordinal()] = 94;
                    } catch (NoSuchFieldError unused94) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_INVESTMENTS_BUTTON.ordinal()] = 95;
                    } catch (NoSuchFieldError unused95) {
                    }
                    try {
                        iArr[Component.ComponentType.ASSET_CARD.ordinal()] = 96;
                    } catch (NoSuchFieldError unused96) {
                    }
                    try {
                        iArr[Component.ComponentType.REDEMPTION_CARD.ordinal()] = 97;
                    } catch (NoSuchFieldError unused97) {
                    }
                    try {
                        iArr[Component.ComponentType.RECOMMENDATIONS_BROWSE_CARD.ordinal()] = 98;
                    } catch (NoSuchFieldError unused98) {
                    }
                    try {
                        iArr[Component.ComponentType.CRYPTO_NOTIFICATION_CARD.ordinal()] = 99;
                    } catch (NoSuchFieldError unused99) {
                    }
                    try {
                        iArr[Component.ComponentType.SCREENER_PRESET_CARD.ordinal()] = 100;
                    } catch (NoSuchFieldError unused100) {
                    }
                    try {
                        iArr[Component.ComponentType.BREAKING_NEWS_BANNER.ordinal()] = 101;
                    } catch (NoSuchFieldError unused101) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_CHIP_GRID.ordinal()] = 102;
                    } catch (NoSuchFieldError unused102) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_CAROUSEL.ordinal()] = 103;
                    } catch (NoSuchFieldError unused103) {
                    }
                    try {
                        iArr[Component.ComponentType.CAROUSEL.ordinal()] = 104;
                    } catch (NoSuchFieldError unused104) {
                    }
                    try {
                        iArr[Component.ComponentType.CHIP_GRID.ordinal()] = 105;
                    } catch (NoSuchFieldError unused105) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_CHIP.ordinal()] = 106;
                    } catch (NoSuchFieldError unused106) {
                    }
                    try {
                        iArr[Component.ComponentType.CHIP.ordinal()] = 107;
                    } catch (NoSuchFieldError unused107) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_SUMMARY_DIALOG.ordinal()] = 108;
                    } catch (NoSuchFieldError unused108) {
                    }
                    try {
                        iArr[Component.ComponentType.CALENDAR_DATE_PICKER.ordinal()] = 109;
                    } catch (NoSuchFieldError unused109) {
                    }
                    try {
                        iArr[Component.ComponentType.SEARCH_RESULT_ROW.ordinal()] = 110;
                    } catch (NoSuchFieldError unused110) {
                    }
                    try {
                        iArr[Component.ComponentType.ASSET_ROW.ordinal()] = 111;
                    } catch (NoSuchFieldError unused111) {
                    }
                    try {
                        iArr[Component.ComponentType.ROW.ordinal()] = 112;
                    } catch (NoSuchFieldError unused112) {
                    }
                    try {
                        iArr[Component.ComponentType.HISTORY_ROW.ordinal()] = 113;
                    } catch (NoSuchFieldError unused113) {
                    }
                    try {
                        iArr[Component.ComponentType.RECENT_SEARCH_ROW.ordinal()] = 114;
                    } catch (NoSuchFieldError unused114) {
                    }
                    try {
                        iArr[Component.ComponentType.L2E_ONBOARDING.ordinal()] = 115;
                    } catch (NoSuchFieldError unused115) {
                    }
                    try {
                        iArr[Component.ComponentType.TEXT_FIELD.ordinal()] = 116;
                    } catch (NoSuchFieldError unused116) {
                    }
                    try {
                        iArr[Component.ComponentType.SEARCH_BAR.ordinal()] = 117;
                    } catch (NoSuchFieldError unused117) {
                    }
                    try {
                        iArr[Component.ComponentType.ERROR_TOAST.ordinal()] = 118;
                    } catch (NoSuchFieldError unused118) {
                    }
                    try {
                        iArr[Component.ComponentType.HIDE_CX_CALL_STATUS_BANNER_TOAST.ordinal()] = 119;
                    } catch (NoSuchFieldError unused119) {
                    }
                    try {
                        iArr[Component.ComponentType.ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST.ordinal()] = 120;
                    } catch (NoSuchFieldError unused120) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_CALL_ASSIGNED_TOAST.ordinal()] = 121;
                    } catch (NoSuchFieldError unused121) {
                    }
                    try {
                        iArr[Component.ComponentType.MICROPHONE_PERMISSION_DIALOG.ordinal()] = 122;
                    } catch (NoSuchFieldError unused122) {
                    }
                    try {
                        iArr[Component.ComponentType.PERMISSION_SETTINGS_DIALOG.ordinal()] = 123;
                    } catch (NoSuchFieldError unused123) {
                    }
                    try {
                        iArr[Component.ComponentType.PROCESSING_ERROR_TOAST.ordinal()] = 124;
                    } catch (NoSuchFieldError unused124) {
                    }
                    try {
                        iArr[Component.ComponentType.PERMISSION_ERROR_TOAST.ordinal()] = 125;
                    } catch (NoSuchFieldError unused125) {
                    }
                    try {
                        iArr[Component.ComponentType.VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET.ordinal()] = 126;
                    } catch (NoSuchFieldError unused126) {
                    }
                    try {
                        iArr[Component.ComponentType.CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET.ordinal()] = 127;
                    } catch (NoSuchFieldError unused127) {
                    }
                    try {
                        iArr[Component.ComponentType.UPDATE_LIST_TOAST.ordinal()] = 128;
                    } catch (NoSuchFieldError unused128) {
                    }
                    try {
                        iArr[Component.ComponentType.DD_SWITCHER_ENTRY_POINT.ordinal()] = 129;
                    } catch (NoSuchFieldError unused129) {
                    }
                    try {
                        iArr[Component.ComponentType.SAFETY_LABEL_INFO_TAG.ordinal()] = 130;
                    } catch (NoSuchFieldError unused130) {
                    }
                    try {
                        iArr[Component.ComponentType.TOOLTIP.ordinal()] = 131;
                    } catch (NoSuchFieldError unused131) {
                    }
                    try {
                        iArr[Component.ComponentType.PERFORMANCE_SECTION.ordinal()] = 132;
                    } catch (NoSuchFieldError unused132) {
                    }
                    try {
                        iArr[Component.ComponentType.STATS_SECTION.ordinal()] = 133;
                    } catch (NoSuchFieldError unused133) {
                    }
                    try {
                        iArr[Component.ComponentType.GRAPH_SECTION.ordinal()] = 134;
                    } catch (NoSuchFieldError unused134) {
                    }
                    try {
                        iArr[Component.ComponentType.POSITION_SECTION.ordinal()] = 135;
                    } catch (NoSuchFieldError unused135) {
                    }
                    try {
                        iArr[Component.ComponentType.RESEARCH_REPORT_SECTION.ordinal()] = 136;
                    } catch (NoSuchFieldError unused136) {
                    }
                    try {
                        iArr[Component.ComponentType.EARNINGS_SECTION.ordinal()] = 137;
                    } catch (NoSuchFieldError unused137) {
                    }
                    try {
                        iArr[Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION.ordinal()] = 138;
                    } catch (NoSuchFieldError unused138) {
                    }
                    try {
                        iArr[Component.ComponentType.TRADE_BAR.ordinal()] = 139;
                    } catch (NoSuchFieldError unused139) {
                    }
                    try {
                        iArr[Component.ComponentType.ETP_COMPOSITION_SECTION.ordinal()] = 140;
                    } catch (NoSuchFieldError unused140) {
                    }
                    try {
                        iArr[Component.ComponentType.ABOUT_SECTION.ordinal()] = 141;
                    } catch (NoSuchFieldError unused141) {
                    }
                    try {
                        iArr[Component.ComponentType.ANALYST_RATINGS_SECTION.ordinal()] = 142;
                    } catch (NoSuchFieldError unused142) {
                    }
                    try {
                        iArr[Component.ComponentType.RELATED_LISTS_SECTION.ordinal()] = 143;
                    } catch (NoSuchFieldError unused143) {
                    }
                    try {
                        iArr[Component.ComponentType.SHAREHOLDER_QA_SECTION.ordinal()] = 144;
                    } catch (NoSuchFieldError unused144) {
                    }
                    try {
                        iArr[Component.ComponentType.HISTORY_SECTION.ordinal()] = 145;
                    } catch (NoSuchFieldError unused145) {
                    }
                    try {
                        iArr[Component.ComponentType.ADVANCED_CHART.ordinal()] = 146;
                    } catch (NoSuchFieldError unused146) {
                    }
                    try {
                        iArr[Component.ComponentType.UPCOMING_ACTIVITY_SECTION.ordinal()] = 147;
                    } catch (NoSuchFieldError unused147) {
                    }
                    try {
                        iArr[Component.ComponentType.TAB.ordinal()] = 148;
                    } catch (NoSuchFieldError unused148) {
                    }
                    try {
                        iArr[Component.ComponentType.NEWS_ROW.ordinal()] = 149;
                    } catch (NoSuchFieldError unused149) {
                    }
                    try {
                        iArr[Component.ComponentType.HERO_NEWS_ROW.ordinal()] = 150;
                    } catch (NoSuchFieldError unused150) {
                    }
                    try {
                        iArr[Component.ComponentType.VIDEO_ROW.ordinal()] = 151;
                    } catch (NoSuchFieldError unused151) {
                    }
                    try {
                        iArr[Component.ComponentType.HERO_VIDEO_ROW.ordinal()] = 152;
                    } catch (NoSuchFieldError unused152) {
                    }
                    try {
                        iArr[Component.ComponentType.FEATURE_CARD.ordinal()] = 153;
                    } catch (NoSuchFieldError unused153) {
                    }
                    try {
                        iArr[Component.ComponentType.FEATURE_DISCOVERY_WIDGET.ordinal()] = 154;
                    } catch (NoSuchFieldError unused154) {
                    }
                    try {
                        iArr[Component.ComponentType.MARKET_UPDATES.ordinal()] = 155;
                    } catch (NoSuchFieldError unused155) {
                    }
                    try {
                        iArr[Component.ComponentType.MARKET_INDICATOR.ordinal()] = 156;
                    } catch (NoSuchFieldError unused156) {
                    }
                    try {
                        iArr[Component.ComponentType.DIRECT_DEPOSIT_OPTION_ROW.ordinal()] = 157;
                    } catch (NoSuchFieldError unused157) {
                    }
                    try {
                        iArr[Component.ComponentType.SETUP_DIRECT_DEPOSIT_ROW.ordinal()] = 158;
                    } catch (NoSuchFieldError unused158) {
                    }
                    try {
                        iArr[Component.ComponentType.DEPOSIT_ROW.ordinal()] = 159;
                    } catch (NoSuchFieldError unused159) {
                    }
                    try {
                        iArr[Component.ComponentType.WITHDRAW_ROW.ordinal()] = 160;
                    } catch (NoSuchFieldError unused160) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_DEPOSITS_ROW.ordinal()] = 161;
                    } catch (NoSuchFieldError unused161) {
                    }
                    try {
                        iArr[Component.ComponentType.PAY_BY_CHECK_ROW.ordinal()] = 162;
                    } catch (NoSuchFieldError unused162) {
                    }
                    try {
                        iArr[Component.ComponentType.TRANSFER_ROW.ordinal()] = 163;
                    } catch (NoSuchFieldError unused163) {
                    }
                    try {
                        iArr[Component.ComponentType.DROPDOWN_OPTION.ordinal()] = 164;
                    } catch (NoSuchFieldError unused164) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG.ordinal()] = 165;
                    } catch (NoSuchFieldError unused165) {
                    }
                    try {
                        iArr[Component.ComponentType.PAYCHECK_SECTION.ordinal()] = 166;
                    } catch (NoSuchFieldError unused166) {
                    }
                    try {
                        iArr[Component.ComponentType.DEBIT_CARD_KYC_BANNER.ordinal()] = 167;
                    } catch (NoSuchFieldError unused167) {
                    }
                    try {
                        iArr[Component.ComponentType.ACH_TRANSFER_OPTION_CARD.ordinal()] = 168;
                    } catch (NoSuchFieldError unused168) {
                    }
                    try {
                        iArr[Component.ComponentType.CRYPTO_TRANSFERS_ROW.ordinal()] = 169;
                    } catch (NoSuchFieldError unused169) {
                    }
                    try {
                        iArr[Component.ComponentType.WIRE_TRANSFER_ROW.ordinal()] = 170;
                    } catch (NoSuchFieldError unused170) {
                    }
                    try {
                        iArr[Component.ComponentType.WIRE_UPSELL.ordinal()] = 171;
                    } catch (NoSuchFieldError unused171) {
                    }
                    try {
                        iArr[Component.ComponentType.TRANSFER_REWARD_PILL.ordinal()] = 172;
                    } catch (NoSuchFieldError unused172) {
                    }
                    try {
                        iArr[Component.ComponentType.EARLY_PAY_TOGGLE.ordinal()] = 173;
                    } catch (NoSuchFieldError unused173) {
                    }
                    try {
                        iArr[Component.ComponentType.EARLY_PAY_FAQ_ROW.ordinal()] = 174;
                    } catch (NoSuchFieldError unused174) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_HERO.ordinal()] = 175;
                    } catch (NoSuchFieldError unused175) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_ASSET_ROW.ordinal()] = 176;
                    } catch (NoSuchFieldError unused176) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_CONTACTS.ordinal()] = 177;
                    } catch (NoSuchFieldError unused177) {
                    }
                    try {
                        iArr[Component.ComponentType.LIST_VIDEO.ordinal()] = 178;
                    } catch (NoSuchFieldError unused178) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_INSTRUMENT_ROW.ordinal()] = 179;
                    } catch (NoSuchFieldError unused179) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_UNTRADABLE_INFO_BAR.ordinal()] = 180;
                    } catch (NoSuchFieldError unused180) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_NO_MARKETDATA_MESSAGE.ordinal()] = 181;
                    } catch (NoSuchFieldError unused181) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_PNL_CHART.ordinal()] = 182;
                    } catch (NoSuchFieldError unused182) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_CHAIN_STOCK_CHART.ordinal()] = 183;
                    } catch (NoSuchFieldError unused183) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_PENDING_ORDER_ROW.ordinal()] = 184;
                    } catch (NoSuchFieldError unused184) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_WATCHLIST_ITEM_ROW.ordinal()] = 185;
                    } catch (NoSuchFieldError unused185) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_FORM_TYPE_SELECTOR.ordinal()] = 186;
                    } catch (NoSuchFieldError unused186) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_FORM_TYPE_GEAR.ordinal()] = 187;
                    } catch (NoSuchFieldError unused187) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_CONFIGURATION_SWITCH.ordinal()] = 188;
                    } catch (NoSuchFieldError unused188) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_CONFIGURATION_ROW.ordinal()] = 189;
                    } catch (NoSuchFieldError unused189) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_UNTRADABLE_DIALOG.ordinal()] = 190;
                    } catch (NoSuchFieldError unused190) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_PCO_DIALOG.ordinal()] = 191;
                    } catch (NoSuchFieldError unused191) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_EXPIRATION_DIALOG.ordinal()] = 192;
                    } catch (NoSuchFieldError unused192) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_WATCHLIST_WELCOME_SHEET.ordinal()] = 193;
                    } catch (NoSuchFieldError unused193) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_PENDING_ORDER_DIALOG.ordinal()] = 194;
                    } catch (NoSuchFieldError unused194) {
                    }
                    try {
                        iArr[Component.ComponentType.NO_POSITIONS_AVAILABLE_BOTTOM_SHEET.ordinal()] = 195;
                    } catch (NoSuchFieldError unused195) {
                    }
                    try {
                        iArr[Component.ComponentType.STRATEGY_INTRO_CARD.ordinal()] = 196;
                    } catch (NoSuchFieldError unused196) {
                    }
                    try {
                        iArr[Component.ComponentType.STRATEGY_SUMMARY_CARD.ordinal()] = 197;
                    } catch (NoSuchFieldError unused197) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_MARKETABILITY_BANNER.ordinal()] = 198;
                    } catch (NoSuchFieldError unused198) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_MARKETABILITY_TAG.ordinal()] = 199;
                    } catch (NoSuchFieldError unused199) {
                    }
                    try {
                        iArr[Component.ComponentType.ROLLING_CASH_ACCOUNT_BOTTOM_SHEET.ordinal()] = 200;
                    } catch (NoSuchFieldError unused200) {
                    }
                    try {
                        iArr[Component.ComponentType.STRATEGY_BUILDER_CARD.ordinal()] = 201;
                    } catch (NoSuchFieldError unused201) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_STRATEGY_CHAIN_BOTTOM_SHEET.ordinal()] = 202;
                    } catch (NoSuchFieldError unused202) {
                    }
                    try {
                        iArr[Component.ComponentType.STRATEGY_ROW.ordinal()] = 203;
                    } catch (NoSuchFieldError unused203) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_SIMULATED_RETURNS_SLIDER.ordinal()] = 204;
                    } catch (NoSuchFieldError unused204) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_SIMULATED_RETURNS_CHART.ordinal()] = 205;
                    } catch (NoSuchFieldError unused205) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_ORDER_BID_ASK_BAR.ordinal()] = 206;
                    } catch (NoSuchFieldError unused206) {
                    }
                    try {
                        iArr[Component.ComponentType.INDEX_OPTION_PCO_DIALOG.ordinal()] = 207;
                    } catch (NoSuchFieldError unused207) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_INSTRUMENT_PILL.ordinal()] = 208;
                    } catch (NoSuchFieldError unused208) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_DISPLAY_MODE_CARD.ordinal()] = 209;
                    } catch (NoSuchFieldError unused209) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_FREQUENCY_ROW.ordinal()] = 210;
                    } catch (NoSuchFieldError unused210) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_PAYMENT_METHOD_ROW.ordinal()] = 211;
                    } catch (NoSuchFieldError unused211) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_HUB_ROW.ordinal()] = 212;
                    } catch (NoSuchFieldError unused212) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_START_DATE_ROW.ordinal()] = 213;
                    } catch (NoSuchFieldError unused213) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_AMOUNT_ROW.ordinal()] = 214;
                    } catch (NoSuchFieldError unused214) {
                    }
                    try {
                        iArr[Component.ComponentType.REWARD_CLAIM_CERTIFICATE.ordinal()] = 215;
                    } catch (NoSuchFieldError unused215) {
                    }
                    try {
                        iArr[Component.ComponentType.MERCHANT_REWARD_CAROUSEL.ordinal()] = 216;
                    } catch (NoSuchFieldError unused216) {
                    }
                    try {
                        iArr[Component.ComponentType.MERCHANT_REWARD_OFFER_DETAIL.ordinal()] = 217;
                    } catch (NoSuchFieldError unused217) {
                    }
                    try {
                        iArr[Component.ComponentType.MERCHANT_REWARD_STATE_EXPLANATION.ordinal()] = 218;
                    } catch (NoSuchFieldError unused218) {
                    }
                    try {
                        iArr[Component.ComponentType.MERCHANT_REWARD_OFFER_CARD.ordinal()] = 219;
                    } catch (NoSuchFieldError unused219) {
                    }
                    try {
                        iArr[Component.ComponentType.POST_REWARD_CLAIM_UPSELL_DIALOG.ordinal()] = 220;
                    } catch (NoSuchFieldError unused220) {
                    }
                    try {
                        iArr[Component.ComponentType.ORDER_KIND_ROW.ordinal()] = 221;
                    } catch (NoSuchFieldError unused221) {
                    }
                    try {
                        iArr[Component.ComponentType.ADD_ACCOUNT.ordinal()] = 222;
                    } catch (NoSuchFieldError unused222) {
                    }
                    try {
                        iArr[Component.ComponentType.ORDER_TYPE_PICKER.ordinal()] = 223;
                    } catch (NoSuchFieldError unused223) {
                    }
                    try {
                        iArr[Component.ComponentType.ACCOUNT_PCO_DIALOG.ordinal()] = 224;
                    } catch (NoSuchFieldError unused224) {
                    }
                    try {
                        iArr[Component.ComponentType.INVESTMENT_BASKET_TOGGLE.ordinal()] = 225;
                    } catch (NoSuchFieldError unused225) {
                    }
                    try {
                        iArr[Component.ComponentType.INVESTMENT_ADDED_TOAST.ordinal()] = 226;
                    } catch (NoSuchFieldError unused226) {
                    }
                    try {
                        iArr[Component.ComponentType.BASKET_FULL_TOAST.ordinal()] = 227;
                    } catch (NoSuchFieldError unused227) {
                    }
                    try {
                        iArr[Component.ComponentType.PERFORMANCE_CHART.ordinal()] = 228;
                    } catch (NoSuchFieldError unused228) {
                    }
                    try {
                        iArr[Component.ComponentType.PERFORMANCE_CHART_SETTINGS.ordinal()] = 229;
                    } catch (NoSuchFieldError unused229) {
                    }
                    try {
                        iArr[Component.ComponentType.SPAN_SELECTOR.ordinal()] = 230;
                    } catch (NoSuchFieldError unused230) {
                    }
                    try {
                        iArr[Component.ComponentType.DAY_TRADE_COUNTER_ROW.ordinal()] = 231;
                    } catch (NoSuchFieldError unused231) {
                    }
                    try {
                        iArr[Component.ComponentType.DAY_TRADE_COUNTER_GRAPHIC.ordinal()] = 232;
                    } catch (NoSuchFieldError unused232) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_LESSON_CARD.ordinal()] = 233;
                    } catch (NoSuchFieldError unused233) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_LESSON_ROW.ordinal()] = 234;
                    } catch (NoSuchFieldError unused234) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_SECTION.ordinal()] = 235;
                    } catch (NoSuchFieldError unused235) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_ENTRY_POINT.ordinal()] = 236;
                    } catch (NoSuchFieldError unused236) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_MATCHING_EXERCISE.ordinal()] = 237;
                    } catch (NoSuchFieldError unused237) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_MATCHING_EXERCISE_ENTITY.ordinal()] = 238;
                    } catch (NoSuchFieldError unused238) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_MATCHING_EXERCISE_BUCKET.ordinal()] = 239;
                    } catch (NoSuchFieldError unused239) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_FEEDBACK.ordinal()] = 240;
                    } catch (NoSuchFieldError unused240) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_INTERSTITIAL.ordinal()] = 241;
                    } catch (NoSuchFieldError unused241) {
                    }
                    try {
                        iArr[Component.ComponentType.LEARNING_QUIZ_CONTINUE_HINT.ordinal()] = 242;
                    } catch (NoSuchFieldError unused242) {
                    }
                    try {
                        iArr[Component.ComponentType.EDUCATION_TOUR_CARD.ordinal()] = 243;
                    } catch (NoSuchFieldError unused243) {
                    }
                    try {
                        iArr[Component.ComponentType.TRANSFER_DETAILS_ROW.ordinal()] = 244;
                    } catch (NoSuchFieldError unused244) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG.ordinal()] = 245;
                    } catch (NoSuchFieldError unused245) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_CAROUSEL.ordinal()] = 246;
                    } catch (NoSuchFieldError unused246) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_HOME_CARD.ordinal()] = 247;
                    } catch (NoSuchFieldError unused247) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_HOME_STATUS_BANNER.ordinal()] = 248;
                    } catch (NoSuchFieldError unused248) {
                    }
                    try {
                        iArr[Component.ComponentType.HOME_ATM_FINDER.ordinal()] = 249;
                    } catch (NoSuchFieldError unused249) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_DD_UPSELL_POST_TRANSFER.ordinal()] = 250;
                    } catch (NoSuchFieldError unused250) {
                    }
                    try {
                        iArr[Component.ComponentType.BACKUP_COVERAGE_TOGGLE.ordinal()] = 251;
                    } catch (NoSuchFieldError unused251) {
                    }
                    try {
                        iArr[Component.ComponentType.FLAT_CASHBACK_BOTTOM_SHEET.ordinal()] = 252;
                    } catch (NoSuchFieldError unused252) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_REFERRAL_CASH_OFFER_CARD.ordinal()] = 253;
                    } catch (NoSuchFieldError unused253) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_WAITLIST_UPSELL_CARD.ordinal()] = 254;
                    } catch (NoSuchFieldError unused254) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_WAITLIST_WAITING_CARD.ordinal()] = 255;
                    } catch (NoSuchFieldError unused255) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_WAITLIST_CAT.ordinal()] = 256;
                    } catch (NoSuchFieldError unused256) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_MIGRATION_BOTTOM_SHEET.ordinal()] = 257;
                    } catch (NoSuchFieldError unused257) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET.ordinal()] = 258;
                    } catch (NoSuchFieldError unused258) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_TURBOTAX_OFFER_BUTTON_RHY.ordinal()] = 259;
                    } catch (NoSuchFieldError unused259) {
                    }
                    try {
                        iArr[Component.ComponentType.RHY_TURBOTAX_OFFER_BUTTON_NON_RHY.ordinal()] = 260;
                    } catch (NoSuchFieldError unused260) {
                    }
                    try {
                        iArr[Component.ComponentType.REFERRAL_BANNER.ordinal()] = 261;
                    } catch (NoSuchFieldError unused261) {
                    }
                    try {
                        iArr[Component.ComponentType.ACCOUNT_CENTER_REFERRAL_ENTRY_POINT.ordinal()] = 262;
                    } catch (NoSuchFieldError unused262) {
                    }
                    try {
                        iArr[Component.ComponentType.SWEEP_DISABLE_DIALOG.ordinal()] = 263;
                    } catch (NoSuchFieldError unused263) {
                    }
                    try {
                        iArr[Component.ComponentType.SWEEP_PAUSED_DIALOG.ordinal()] = 264;
                    } catch (NoSuchFieldError unused264) {
                    }
                    try {
                        iArr[Component.ComponentType.VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET.ordinal()] = 265;
                    } catch (NoSuchFieldError unused265) {
                    }
                    try {
                        iArr[Component.ComponentType.CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG.ordinal()] = 266;
                    } catch (NoSuchFieldError unused266) {
                    }
                    try {
                        iArr[Component.ComponentType.SWEPT_CASH_BALANCE_EXPLANATION_DIALOG.ordinal()] = 267;
                    } catch (NoSuchFieldError unused267) {
                    }
                    try {
                        iArr[Component.ComponentType.CASH_SWEEP_ALREADY_ENABLED_DIALOG.ordinal()] = 268;
                    } catch (NoSuchFieldError unused268) {
                    }
                    try {
                        iArr[Component.ComponentType.CASH_SWEEP_SECTION.ordinal()] = 269;
                    } catch (NoSuchFieldError unused269) {
                    }
                    try {
                        iArr[Component.ComponentType.SLIP_SETTING_CARD.ordinal()] = 270;
                    } catch (NoSuchFieldError unused270) {
                    }
                    try {
                        iArr[Component.ComponentType.LINK_DEBIT_CARD_BANNER.ordinal()] = 271;
                    } catch (NoSuchFieldError unused271) {
                    }
                    try {
                        iArr[Component.ComponentType.SHAREHOLDER_LIST_SECTION.ordinal()] = 272;
                    } catch (NoSuchFieldError unused272) {
                    }
                    try {
                        iArr[Component.ComponentType.MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET.ordinal()] = 273;
                    } catch (NoSuchFieldError unused273) {
                    }
                    try {
                        iArr[Component.ComponentType.MARGIN_REQUIREMENT_SECTION.ordinal()] = 274;
                    } catch (NoSuchFieldError unused274) {
                    }
                    try {
                        iArr[Component.ComponentType.IRA_TAX_WITHHOLDING_BOTTOM_SHEET.ordinal()] = 275;
                    } catch (NoSuchFieldError unused275) {
                    }
                    try {
                        iArr[Component.ComponentType.ACCOUNT_SELECTOR.ordinal()] = 276;
                    } catch (NoSuchFieldError unused276) {
                    }
                    try {
                        iArr[Component.ComponentType.BIOMETRIC_AUTH_BUTTON.ordinal()] = 277;
                    } catch (NoSuchFieldError unused277) {
                    }
                    try {
                        iArr[Component.ComponentType.PORTFOLIO_TABLE_COLUMN_HEADING.ordinal()] = 278;
                    } catch (NoSuchFieldError unused278) {
                    }
                    try {
                        iArr[Component.ComponentType.ASSET_DISPLAY_VALUE_DIALOG.ordinal()] = 279;
                    } catch (NoSuchFieldError unused279) {
                    }
                    try {
                        iArr[Component.ComponentType.BUYING_POWER_ROW.ordinal()] = 280;
                    } catch (NoSuchFieldError unused280) {
                    }
                    try {
                        iArr[Component.ComponentType.PORTFOLIO_CHART.ordinal()] = 281;
                    } catch (NoSuchFieldError unused281) {
                    }
                    try {
                        iArr[Component.ComponentType.GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET.ordinal()] = 282;
                    } catch (NoSuchFieldError unused282) {
                    }
                    try {
                        iArr[Component.ComponentType.GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET.ordinal()] = 283;
                    } catch (NoSuchFieldError unused283) {
                    }
                    try {
                        iArr[Component.ComponentType.ASSET_SELECTOR.ordinal()] = 284;
                    } catch (NoSuchFieldError unused284) {
                    }
                    try {
                        iArr[Component.ComponentType.PNL_CHART.ordinal()] = 285;
                    } catch (NoSuchFieldError unused285) {
                    }
                    try {
                        iArr[Component.ComponentType.PNL_SETTINGS.ordinal()] = 286;
                    } catch (NoSuchFieldError unused286) {
                    }
                    try {
                        iArr[Component.ComponentType.PNL_DETAIL_BOTTOM_SHEET.ordinal()] = 287;
                    } catch (NoSuchFieldError unused287) {
                    }
                    try {
                        iArr[Component.ComponentType.REALIZED_GAIN_LOSS_SECTION.ordinal()] = 288;
                    } catch (NoSuchFieldError unused288) {
                    }
                    try {
                        iArr[Component.ComponentType.FUTURES_TRADE_BAR.ordinal()] = 289;
                    } catch (NoSuchFieldError unused289) {
                    }
                    try {
                        iArr[Component.ComponentType.FUTURES_LIST_SORT_BOTTOM_SHEET.ordinal()] = 290;
                    } catch (NoSuchFieldError unused290) {
                    }
                    try {
                        iArr[Component.ComponentType.LADDER_NUX.ordinal()] = 291;
                    } catch (NoSuchFieldError unused291) {
                    }
                    try {
                        iArr[Component.ComponentType.CASH_BALANCES_HOME_SECTION.ordinal()] = 292;
                    } catch (NoSuchFieldError unused292) {
                    }
                    try {
                        iArr[Component.ComponentType.CORTEX_DIGEST_SECTION.ordinal()] = 293;
                    } catch (NoSuchFieldError unused293) {
                    }
                    try {
                        iArr[Component.ComponentType.PILL.ordinal()] = 294;
                    } catch (NoSuchFieldError unused294) {
                    }
                    try {
                        iArr[Component.ComponentType.EDUCATION_ROW.ordinal()] = 295;
                    } catch (NoSuchFieldError unused295) {
                    }
                    try {
                        iArr[Component.ComponentType.NEWS_SECTION.ordinal()] = 296;
                    } catch (NoSuchFieldError unused296) {
                    }
                    try {
                        iArr[Component.ComponentType.PENDING_ORDER_ROW.ordinal()] = 297;
                    } catch (NoSuchFieldError unused297) {
                    }
                    try {
                        iArr[Component.ComponentType.PENDING_ORDER_SECTION.ordinal()] = 298;
                    } catch (NoSuchFieldError unused298) {
                    }
                    try {
                        iArr[Component.ComponentType.TOKENIZED_STOCK_HOLDING_ROW.ordinal()] = 299;
                    } catch (NoSuchFieldError unused299) {
                    }
                    try {
                        iArr[Component.ComponentType.TOKENIZED_STOCK_HOLDING_SECTION.ordinal()] = 300;
                    } catch (NoSuchFieldError unused300) {
                    }
                    try {
                        iArr[Component.ComponentType.PERPETUALS_HOLDING_SECTION.ordinal()] = 301;
                    } catch (NoSuchFieldError unused301) {
                    }
                    try {
                        iArr[Component.ComponentType.OPEN_POSITION_SUMMARY.ordinal()] = 302;
                    } catch (NoSuchFieldError unused302) {
                    }
                    try {
                        iArr[Component.ComponentType.OPEN_POSITIONS_SECTION.ordinal()] = 303;
                    } catch (NoSuchFieldError unused303) {
                    }
                    try {
                        iArr[Component.ComponentType.PENDING_ORDERS_SECTION.ordinal()] = 304;
                    } catch (NoSuchFieldError unused304) {
                    }
                    try {
                        iArr[Component.ComponentType.EXPLORE_SECTION.ordinal()] = 305;
                    } catch (NoSuchFieldError unused305) {
                    }
                    try {
                        iArr[Component.ComponentType.PNL_SECTION.ordinal()] = 306;
                    } catch (NoSuchFieldError unused306) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_PROFIT_AND_LOSS_CARD.ordinal()] = 307;
                    } catch (NoSuchFieldError unused307) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_PROFIT_AND_LOSS_SLIDER.ordinal()] = 308;
                    } catch (NoSuchFieldError unused308) {
                    }
                    try {
                        iArr[Component.ComponentType.COMPANY_FINANCIALS_CHART.ordinal()] = 309;
                    } catch (NoSuchFieldError unused309) {
                    }
                    try {
                        iArr[Component.ComponentType.CORTEX_DIGEST_UPSELL_SECTION.ordinal()] = 310;
                    } catch (NoSuchFieldError unused310) {
                    }
                    try {
                        iArr[Component.ComponentType.COMPANY_FINANCIALS_SECTION.ordinal()] = 311;
                    } catch (NoSuchFieldError unused311) {
                    }
                    try {
                        iArr[Component.ComponentType.WATCHLIST_ROW.ordinal()] = 312;
                    } catch (NoSuchFieldError unused312) {
                    }
                    try {
                        iArr[Component.ComponentType.RETURNS_CHART.ordinal()] = 313;
                    } catch (NoSuchFieldError unused313) {
                    }
                    try {
                        iArr[Component.ComponentType.SELECT_MENU.ordinal()] = 314;
                    } catch (NoSuchFieldError unused314) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTIONS_STATUS_SECTION.ordinal()] = 315;
                    } catch (NoSuchFieldError unused315) {
                    }
                    try {
                        iArr[Component.ComponentType.FX_SWITCHER.ordinal()] = 316;
                    } catch (NoSuchFieldError unused316) {
                    }
                    try {
                        iArr[Component.ComponentType.PROXY_VOTE_SECTION.ordinal()] = 317;
                    } catch (NoSuchFieldError unused317) {
                    }
                    try {
                        iArr[Component.ComponentType.EVENT_CONTRACT_TRADE_OVERLAY_DIALOG.ordinal()] = 318;
                    } catch (NoSuchFieldError unused318) {
                    }
                    try {
                        iArr[Component.ComponentType.OPTION_L3_ENTRYPOINT_TAG.ordinal()] = 319;
                    } catch (NoSuchFieldError unused319) {
                    }
                    try {
                        iArr[Component.ComponentType.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET.ordinal()] = 320;
                    } catch (NoSuchFieldError unused320) {
                    }
                    try {
                        iArr[Component.ComponentType.DASHBOARD_PILL.ordinal()] = 321;
                    } catch (NoSuchFieldError unused321) {
                    }
                    try {
                        iArr[Component.ComponentType.FEED_POST_ROW.ordinal()] = 322;
                    } catch (NoSuchFieldError unused322) {
                    }
                    try {
                        iArr[Component.ComponentType.ACTIVITY_ITEM_ROW.ordinal()] = 323;
                    } catch (NoSuchFieldError unused323) {
                    }
                    try {
                        iArr[Component.ComponentType.CONCIERGE_PLUS_UPSELL_BANNER.ordinal()] = 324;
                    } catch (NoSuchFieldError unused324) {
                    }
                    try {
                        iArr[Component.ComponentType.RECURRING_INVESTMENTS_EQUITY_NUX.ordinal()] = 325;
                    } catch (NoSuchFieldError unused325) {
                    }
                    try {
                        iArr[Component.ComponentType.EVENT_CONTRACT_COMBO_LEG.ordinal()] = 326;
                    } catch (NoSuchFieldError unused326) {
                    }
                    try {
                        iArr[Component.ComponentType.EVENT_CONTRACT_STRIKE_PICKER.ordinal()] = 327;
                    } catch (NoSuchFieldError unused327) {
                    }
                    try {
                        iArr[Component.ComponentType.INTEREST_SECTION.ordinal()] = 328;
                    } catch (NoSuchFieldError unused328) {
                    }
                    try {
                        iArr[Component.ComponentType.CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET.ordinal()] = 329;
                    } catch (NoSuchFieldError unused329) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ComponentTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ComponentTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ComponentTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ComponentTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Component.ComponentType> getProtoAdapter() {
                return Component.ComponentType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComponentTypeDto getZeroValue() {
                return ComponentTypeDto.COMPONENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ComponentTypeDto fromProto(Component.ComponentType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ComponentTypeDto.COMPONENT_TYPE_UNSPECIFIED;
                    case 2:
                        return ComponentTypeDto.LOADING_PLACEHOLDER;
                    case 3:
                        return ComponentTypeDto.MAP;
                    case 4:
                        return ComponentTypeDto.QR_CODE;
                    case 5:
                        return ComponentTypeDto.INLINE_DEFINITION;
                    case 6:
                        return ComponentTypeDto.PUSH_NOTIFICATION;
                    case 7:
                        return ComponentTypeDto.MENU_ITEM;
                    case 8:
                        return ComponentTypeDto.EDUCATION_TOUR_TOOLTIP;
                    case 9:
                        return ComponentTypeDto.NEW_PRODUCT_CARD;
                    case 10:
                        return ComponentTypeDto.BALANCE_SECTION;
                    case 11:
                        return ComponentTypeDto.SHORTCUTS_FIRST_TIME_POPUP;
                    case 12:
                        return ComponentTypeDto.ACCOUNT_SWITCHER;
                    case 13:
                        return ComponentTypeDto.ACCOUNT_SWITCHER_BOTTOM_SHEET;
                    case 14:
                        return ComponentTypeDto.HOLDING_ROW;
                    case 15:
                        return ComponentTypeDto.PRICE_CHART;
                    case 16:
                        return ComponentTypeDto.RECURRING_ROW;
                    case 17:
                        return ComponentTypeDto.EXPLORE_ROW;
                    case 18:
                        return ComponentTypeDto.NOTIFICATION_CARD;
                    case 19:
                        return ComponentTypeDto.NOTIFICATION_CARD_STACK;
                    case 20:
                        return ComponentTypeDto.NOTIFICATION_COMPLETION_CARD;
                    case 21:
                        return ComponentTypeDto.SIDEBAR;
                    case 22:
                        return ComponentTypeDto.LIST_ROW;
                    case 23:
                        return ComponentTypeDto.LIST_HEADER;
                    case 24:
                        return ComponentTypeDto.SECTION_HEADER;
                    case 25:
                        return ComponentTypeDto.TOGGLE;
                    case 26:
                        return ComponentTypeDto.CARD;
                    case 27:
                        return ComponentTypeDto.SUCCESS_TOAST;
                    case 28:
                        return ComponentTypeDto.INFO_TAG;
                    case 29:
                        return ComponentTypeDto.FX_CONVERSION_TOOLTIP;
                    case 30:
                        return ComponentTypeDto.HERO_CARD;
                    case 31:
                        return ComponentTypeDto.TEXT_VIEW;
                    case 32:
                        return ComponentTypeDto.SEGMENTED_CONTROL;
                    case 33:
                        return ComponentTypeDto.TRADING_TRENDS_CHART;
                    case 34:
                        return ComponentTypeDto.SEGMENT;
                    case 35:
                        return ComponentTypeDto.TABLE;
                    case 36:
                        return ComponentTypeDto.HOLDING_SECTION;
                    case 37:
                        return ComponentTypeDto.SLIDER;
                    case 38:
                        return ComponentTypeDto.SCRUB_BAR;
                    case 39:
                        return ComponentTypeDto.STICKY_BOTTOM_SHEET;
                    case 40:
                        return ComponentTypeDto.LIVE_ACTIVITY;
                    case 41:
                        return ComponentTypeDto.BADGE;
                    case 42:
                        return ComponentTypeDto.STAKING_SECTION;
                    case 43:
                        return ComponentTypeDto.ADVANCED_ALERT_SETTINGS;
                    case 44:
                        return ComponentTypeDto.PRICE_ALERT_EDITOR;
                    case 45:
                        return ComponentTypeDto.ALERT_SETTING_ROW;
                    case 46:
                        return ComponentTypeDto.ALERT_SETTING_TOGGLE;
                    case 47:
                        return ComponentTypeDto.PRICE_ALERT_TYPE_SELECTOR;
                    case 48:
                        return ComponentTypeDto.CANCEL_ERROR_ALERT;
                    case 49:
                        return ComponentTypeDto.ERROR_ALERT;
                    case 50:
                        return ComponentTypeDto.ALERT;
                    case 51:
                        return ComponentTypeDto.ERROR_LOADING;
                    case 52:
                        return ComponentTypeDto.CANCEL_CONFIRMATION_ALERT;
                    case 53:
                        return ComponentTypeDto.ENABLE_PUSH_NOTIFICATIONS_ALERT;
                    case 54:
                        return ComponentTypeDto.CX_PHONE_UNAVAILABLE_ALERT;
                    case 55:
                        return ComponentTypeDto.CX_CHAT_MESSAGE_FAILURE_BOTTOM_SHEET;
                    case 56:
                        return ComponentTypeDto.CX_CHAT_STATUS_BANNER;
                    case 57:
                        return ComponentTypeDto.CX_CHATBOT_BANNER;
                    case 58:
                        return ComponentTypeDto.UPDATE_EMPLOYER_INFO_ALERT;
                    case 59:
                        return ComponentTypeDto.DD_MANUAL_SETUP_ALERT;
                    case 60:
                        return ComponentTypeDto.EARLY_PAY_ENABLE_CONFIRMATION_ALERT;
                    case 61:
                        return ComponentTypeDto.EARLY_PAY_DISABLE_CONFIRMATION_ALERT;
                    case 62:
                        return ComponentTypeDto.EARLY_PAY_TOGGLE_LIMIT_ALERT;
                    case 63:
                        return ComponentTypeDto.ALERT_SHEET;
                    case 64:
                        return ComponentTypeDto.CX_CALL_STATUS_BANNER;
                    case 65:
                        return ComponentTypeDto.CONTACT_SIGNIN_BANNER;
                    case 66:
                        return ComponentTypeDto.INFO_BANNER;
                    case 67:
                        return ComponentTypeDto.HERO_BANNER;
                    case SDK_ASSET_ICON_HOME_VALUE:
                        return ComponentTypeDto.STATUS_BANNER;
                    case 69:
                        return ComponentTypeDto.VERIFY_DEBIT_CARD_BANNER;
                    case 70:
                        return ComponentTypeDto.UPDATE_INVESTOR_PROFILE_BANNER;
                    case SDK_ASSET_ICON_GUIDE_VALUE:
                        return ComponentTypeDto.ACCOUNT_CENTER_UPSELL_BANNER;
                    case SDK_ASSET_ICON_GLOBE_VALUE:
                        return ComponentTypeDto.ADD_TO_LIST_BOTTOM_SHEET;
                    case 73:
                        return ComponentTypeDto.FEEDBACK_BOTTOM_SHEET;
                    case 74:
                        return ComponentTypeDto.DATE_PICKER_BOTTOM_SHEET;
                    case 75:
                        return ComponentTypeDto.BOTTOM_SHEET;
                    case 76:
                        return ComponentTypeDto.PASSKEY_ENROLLMENT_BOTTOM_SHEET;
                    case 77:
                        return ComponentTypeDto.KEYCHAIN_LOGIN_BOTTOM_SHEET;
                    case 78:
                        return ComponentTypeDto.GOLD_UPSELL_HOOK_DIALOG;
                    case 79:
                        return ComponentTypeDto.DONE_BUTTON;
                    case 80:
                        return ComponentTypeDto.CONTINUE_BUTTON;
                    case 81:
                        return ComponentTypeDto.BUTTON;
                    case 82:
                        return ComponentTypeDto.SKIP_BUTTON;
                    case 83:
                        return ComponentTypeDto.FILTERS_BUTTON;
                    case 84:
                        return ComponentTypeDto.ASSET_TICKER_BUTTON;
                    case 85:
                        return ComponentTypeDto.LINK_BUTTON;
                    case 86:
                        return ComponentTypeDto.BACK_BUTTON;
                    case 87:
                        return ComponentTypeDto.REVIEW_BUTTON;
                    case 88:
                        return ComponentTypeDto.RADIO_BUTTON;
                    case 89:
                        return ComponentTypeDto.DATE_RANGE_BUTTON;
                    case 90:
                        return ComponentTypeDto.CLOSE_BUTTON;
                    case 91:
                        return ComponentTypeDto.CANCEL_BUTTON;
                    case 92:
                        return ComponentTypeDto.DELETE_BUTTON;
                    case 93:
                        return ComponentTypeDto.NOT_YET_BUTTON;
                    case 94:
                        return ComponentTypeDto.HELP_BUTTON;
                    case 95:
                        return ComponentTypeDto.RECURRING_INVESTMENTS_BUTTON;
                    case 96:
                        return ComponentTypeDto.ASSET_CARD;
                    case 97:
                        return ComponentTypeDto.REDEMPTION_CARD;
                    case 98:
                        return ComponentTypeDto.RECOMMENDATIONS_BROWSE_CARD;
                    case 99:
                        return ComponentTypeDto.CRYPTO_NOTIFICATION_CARD;
                    case 100:
                        return ComponentTypeDto.SCREENER_PRESET_CARD;
                    case 101:
                        return ComponentTypeDto.BREAKING_NEWS_BANNER;
                    case 102:
                        return ComponentTypeDto.LIST_CHIP_GRID;
                    case 103:
                        return ComponentTypeDto.LIST_CAROUSEL;
                    case 104:
                        return ComponentTypeDto.CAROUSEL;
                    case 105:
                        return ComponentTypeDto.CHIP_GRID;
                    case 106:
                        return ComponentTypeDto.LIST_CHIP;
                    case 107:
                        return ComponentTypeDto.CHIP;
                    case 108:
                        return ComponentTypeDto.RECURRING_SUMMARY_DIALOG;
                    case 109:
                        return ComponentTypeDto.CALENDAR_DATE_PICKER;
                    case 110:
                        return ComponentTypeDto.SEARCH_RESULT_ROW;
                    case 111:
                        return ComponentTypeDto.ASSET_ROW;
                    case 112:
                        return ComponentTypeDto.ROW;
                    case 113:
                        return ComponentTypeDto.HISTORY_ROW;
                    case 114:
                        return ComponentTypeDto.RECENT_SEARCH_ROW;
                    case 115:
                        return ComponentTypeDto.L2E_ONBOARDING;
                    case 116:
                        return ComponentTypeDto.TEXT_FIELD;
                    case 117:
                        return ComponentTypeDto.SEARCH_BAR;
                    case 118:
                        return ComponentTypeDto.ERROR_TOAST;
                    case 119:
                        return ComponentTypeDto.HIDE_CX_CALL_STATUS_BANNER_TOAST;
                    case 120:
                        return ComponentTypeDto.ERROR_HIDING_CX_CALL_STATUS_BANNER_TOAST;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                        return ComponentTypeDto.CX_CALL_ASSIGNED_TOAST;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return ComponentTypeDto.MICROPHONE_PERMISSION_DIALOG;
                    case 123:
                        return ComponentTypeDto.PERMISSION_SETTINGS_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return ComponentTypeDto.PROCESSING_ERROR_TOAST;
                    case 125:
                        return ComponentTypeDto.PERMISSION_ERROR_TOAST;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return ComponentTypeDto.VOICE_ENROLLMENT_INTRO_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                        return ComponentTypeDto.CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET;
                    case 128:
                        return ComponentTypeDto.UPDATE_LIST_TOAST;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return ComponentTypeDto.DD_SWITCHER_ENTRY_POINT;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return ComponentTypeDto.SAFETY_LABEL_INFO_TAG;
                    case 131:
                        return ComponentTypeDto.TOOLTIP;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return ComponentTypeDto.PERFORMANCE_SECTION;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return ComponentTypeDto.STATS_SECTION;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return ComponentTypeDto.GRAPH_SECTION;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return ComponentTypeDto.POSITION_SECTION;
                    case 136:
                        return ComponentTypeDto.RESEARCH_REPORT_SECTION;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return ComponentTypeDto.EARNINGS_SECTION;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return ComponentTypeDto.PEOPLE_ALSO_VIEW_SECTION;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return ComponentTypeDto.TRADE_BAR;
                    case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                        return ComponentTypeDto.ETP_COMPOSITION_SECTION;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        return ComponentTypeDto.ABOUT_SECTION;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        return ComponentTypeDto.ANALYST_RATINGS_SECTION;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        return ComponentTypeDto.RELATED_LISTS_SECTION;
                    case 144:
                        return ComponentTypeDto.SHAREHOLDER_QA_SECTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return ComponentTypeDto.HISTORY_SECTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return ComponentTypeDto.ADVANCED_CHART;
                    case 147:
                        return ComponentTypeDto.UPCOMING_ACTIVITY_SECTION;
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        return ComponentTypeDto.TAB;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                        return ComponentTypeDto.NEWS_ROW;
                    case 150:
                        return ComponentTypeDto.HERO_NEWS_ROW;
                    case 151:
                        return ComponentTypeDto.VIDEO_ROW;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return ComponentTypeDto.HERO_VIDEO_ROW;
                    case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                        return ComponentTypeDto.FEATURE_CARD;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        return ComponentTypeDto.FEATURE_DISCOVERY_WIDGET;
                    case 155:
                        return ComponentTypeDto.MARKET_UPDATES;
                    case 156:
                        return ComponentTypeDto.MARKET_INDICATOR;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        return ComponentTypeDto.DIRECT_DEPOSIT_OPTION_ROW;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        return ComponentTypeDto.SETUP_DIRECT_DEPOSIT_ROW;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        return ComponentTypeDto.DEPOSIT_ROW;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        return ComponentTypeDto.WITHDRAW_ROW;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        return ComponentTypeDto.RECURRING_DEPOSITS_ROW;
                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                        return ComponentTypeDto.PAY_BY_CHECK_ROW;
                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        return ComponentTypeDto.TRANSFER_ROW;
                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                        return ComponentTypeDto.DROPDOWN_OPTION;
                    case 165:
                        return ComponentTypeDto.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        return ComponentTypeDto.PAYCHECK_SECTION;
                    case 167:
                        return ComponentTypeDto.DEBIT_CARD_KYC_BANNER;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                        return ComponentTypeDto.ACH_TRANSFER_OPTION_CARD;
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                        return ComponentTypeDto.CRYPTO_TRANSFERS_ROW;
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        return ComponentTypeDto.WIRE_TRANSFER_ROW;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return ComponentTypeDto.WIRE_UPSELL;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.TRANSFER_REWARD_PILL;
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.EARLY_PAY_TOGGLE;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return ComponentTypeDto.EARLY_PAY_FAQ_ROW;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.LIST_HERO;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.LIST_ASSET_ROW;
                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.LIST_CONTACTS;
                    case f2773x8d9721ad:
                        return ComponentTypeDto.LIST_VIDEO;
                    case f2780x600b66fe:
                        return ComponentTypeDto.OPTION_INSTRUMENT_ROW;
                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                        return ComponentTypeDto.OPTION_UNTRADABLE_INFO_BAR;
                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                        return ComponentTypeDto.OPTION_NO_MARKETDATA_MESSAGE;
                    case 182:
                        return ComponentTypeDto.OPTION_PNL_CHART;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        return ComponentTypeDto.OPTION_CHAIN_STOCK_CHART;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                        return ComponentTypeDto.OPTION_PENDING_ORDER_ROW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                        return ComponentTypeDto.OPTION_WATCHLIST_ITEM_ROW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        return ComponentTypeDto.OPTION_ORDER_FORM_TYPE_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        return ComponentTypeDto.OPTION_ORDER_FORM_TYPE_GEAR;
                    case 188:
                        return ComponentTypeDto.OPTION_ORDER_CONFIGURATION_SWITCH;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                        return ComponentTypeDto.OPTION_ORDER_CONFIGURATION_ROW;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                        return ComponentTypeDto.OPTION_UNTRADABLE_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                        return ComponentTypeDto.OPTION_PCO_DIALOG;
                    case 192:
                        return ComponentTypeDto.OPTION_EXPIRATION_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                        return ComponentTypeDto.OPTION_WATCHLIST_WELCOME_SHEET;
                    case SDK_ASSET_ICON_EXTERNAL_VALUE:
                        return ComponentTypeDto.OPTION_PENDING_ORDER_DIALOG;
                    case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                        return ComponentTypeDto.NO_POSITIONS_AVAILABLE_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                        return ComponentTypeDto.STRATEGY_INTRO_CARD;
                    case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                        return ComponentTypeDto.STRATEGY_SUMMARY_CARD;
                    case SDK_ASSET_ICON_ARROW_UP_VALUE:
                        return ComponentTypeDto.OPTION_ORDER_MARKETABILITY_BANNER;
                    case SDK_ASSET_ICON_CANCEL_VALUE:
                        return ComponentTypeDto.OPTION_ORDER_MARKETABILITY_TAG;
                    case 200:
                        return ComponentTypeDto.ROLLING_CASH_ACCOUNT_BOTTOM_SHEET;
                    case 201:
                        return ComponentTypeDto.STRATEGY_BUILDER_CARD;
                    case 202:
                        return ComponentTypeDto.OPTION_STRATEGY_CHAIN_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        return ComponentTypeDto.STRATEGY_ROW;
                    case 204:
                        return ComponentTypeDto.OPTION_SIMULATED_RETURNS_SLIDER;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        return ComponentTypeDto.OPTION_SIMULATED_RETURNS_CHART;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        return ComponentTypeDto.OPTION_ORDER_BID_ASK_BAR;
                    case SDK_ASSET_ICON_COMMENT_VALUE:
                        return ComponentTypeDto.INDEX_OPTION_PCO_DIALOG;
                    case SDK_ASSET_ICON_INCOME_VALUE:
                        return ComponentTypeDto.OPTION_INSTRUMENT_PILL;
                    case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                        return ComponentTypeDto.OPTION_DISPLAY_MODE_CARD;
                    case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                        return ComponentTypeDto.RECURRING_FREQUENCY_ROW;
                    case 211:
                        return ComponentTypeDto.RECURRING_PAYMENT_METHOD_ROW;
                    case SDK_ASSET_ICON_OVERRIDE_VALUE:
                        return ComponentTypeDto.RECURRING_HUB_ROW;
                    case SDK_ASSET_ICON_PAUSE_VALUE:
                        return ComponentTypeDto.RECURRING_START_DATE_ROW;
                    case SDK_ASSET_ICON_PIN_VALUE:
                        return ComponentTypeDto.RECURRING_AMOUNT_ROW;
                    case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        return ComponentTypeDto.REWARD_CLAIM_CERTIFICATE;
                    case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                        return ComponentTypeDto.MERCHANT_REWARD_CAROUSEL;
                    case SDK_ASSET_ICON_PROGRESS_VALUE:
                        return ComponentTypeDto.MERCHANT_REWARD_OFFER_DETAIL;
                    case SDK_ASSET_ICON_QUESTION_VALUE:
                        return ComponentTypeDto.MERCHANT_REWARD_STATE_EXPLANATION;
                    case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                        return ComponentTypeDto.MERCHANT_REWARD_OFFER_CARD;
                    case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                        return ComponentTypeDto.POST_REWARD_CLAIM_UPSELL_DIALOG;
                    case SDK_ASSET_ICON_SUBMIT_VALUE:
                        return ComponentTypeDto.ORDER_KIND_ROW;
                    case SDK_ASSET_ICON_SUBTRACT_VALUE:
                        return ComponentTypeDto.ADD_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                        return ComponentTypeDto.ORDER_TYPE_PICKER;
                    case 224:
                        return ComponentTypeDto.ACCOUNT_PCO_DIALOG;
                    case 225:
                        return ComponentTypeDto.INVESTMENT_BASKET_TOGGLE;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                        return ComponentTypeDto.INVESTMENT_ADDED_TOAST;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                        return ComponentTypeDto.BASKET_FULL_TOAST;
                    case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                        return ComponentTypeDto.PERFORMANCE_CHART;
                    case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                        return ComponentTypeDto.PERFORMANCE_CHART_SETTINGS;
                    case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                        return ComponentTypeDto.SPAN_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                        return ComponentTypeDto.DAY_TRADE_COUNTER_ROW;
                    case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                        return ComponentTypeDto.DAY_TRADE_COUNTER_GRAPHIC;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                        return ComponentTypeDto.LEARNING_LESSON_CARD;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                        return ComponentTypeDto.LEARNING_LESSON_ROW;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                        return ComponentTypeDto.LEARNING_SECTION;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                        return ComponentTypeDto.LEARNING_ENTRY_POINT;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                        return ComponentTypeDto.LEARNING_MATCHING_EXERCISE;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                        return ComponentTypeDto.LEARNING_MATCHING_EXERCISE_ENTITY;
                    case 239:
                        return ComponentTypeDto.LEARNING_MATCHING_EXERCISE_BUCKET;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                        return ComponentTypeDto.LEARNING_FEEDBACK;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                        return ComponentTypeDto.LEARNING_INTERSTITIAL;
                    case f2778x3356acf6:
                        return ComponentTypeDto.LEARNING_QUIZ_CONTINUE_HINT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                        return ComponentTypeDto.EDUCATION_TOUR_CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                        return ComponentTypeDto.TRANSFER_DETAILS_ROW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                        return ComponentTypeDto.RECURRING_DEPOSIT_SKIP_CONFIRMATION_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                        return ComponentTypeDto.RHY_CAROUSEL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                        return ComponentTypeDto.RHY_HOME_CARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                        return ComponentTypeDto.RHY_HOME_STATUS_BANNER;
                    case f2779x59907a3d:
                        return ComponentTypeDto.HOME_ATM_FINDER;
                    case 250:
                        return ComponentTypeDto.RHY_DD_UPSELL_POST_TRANSFER;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                        return ComponentTypeDto.BACKUP_COVERAGE_TOGGLE;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                        return ComponentTypeDto.FLAT_CASHBACK_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                        return ComponentTypeDto.RHY_REFERRAL_CASH_OFFER_CARD;
                    case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                        return ComponentTypeDto.RHY_WAITLIST_UPSELL_CARD;
                    case 255:
                        return ComponentTypeDto.RHY_WAITLIST_WAITING_CARD;
                    case 256:
                        return ComponentTypeDto.RHY_WAITLIST_CAT;
                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        return ComponentTypeDto.RHY_MIGRATION_BOTTOM_SHEET;
                    case SDK_ASSET_HEADER_BOLT_VALUE:
                        return ComponentTypeDto.RHY_MIGRATION_ZERO_FUNDING_BOTTOM_SHEET;
                    case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        return ComponentTypeDto.RHY_TURBOTAX_OFFER_BUTTON_RHY;
                    case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                        return ComponentTypeDto.RHY_TURBOTAX_OFFER_BUTTON_NON_RHY;
                    case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                        return ComponentTypeDto.REFERRAL_BANNER;
                    case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                        return ComponentTypeDto.ACCOUNT_CENTER_REFERRAL_ENTRY_POINT;
                    case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                        return ComponentTypeDto.SWEEP_DISABLE_DIALOG;
                    case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                        return ComponentTypeDto.SWEEP_PAUSED_DIALOG;
                    case SDK_ASSET_HEADER_SHIELD_VALUE:
                        return ComponentTypeDto.VARIABLE_APY_DISCLOSURE_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                        return ComponentTypeDto.CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG;
                    case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                        return ComponentTypeDto.SWEPT_CASH_BALANCE_EXPLANATION_DIALOG;
                    case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                        return ComponentTypeDto.CASH_SWEEP_ALREADY_ENABLED_DIALOG;
                    case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                        return ComponentTypeDto.CASH_SWEEP_SECTION;
                    case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                        return ComponentTypeDto.SLIP_SETTING_CARD;
                    case 271:
                        return ComponentTypeDto.LINK_DEBIT_CARD_BANNER;
                    case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                        return ComponentTypeDto.SHAREHOLDER_LIST_SECTION;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                        return ComponentTypeDto.MARGIN_INTEREST_RATE_COMPARISON_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                        return ComponentTypeDto.MARGIN_REQUIREMENT_SECTION;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                        return ComponentTypeDto.IRA_TAX_WITHHOLDING_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                        return ComponentTypeDto.ACCOUNT_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                        return ComponentTypeDto.BIOMETRIC_AUTH_BUTTON;
                    case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                        return ComponentTypeDto.PORTFOLIO_TABLE_COLUMN_HEADING;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                        return ComponentTypeDto.ASSET_DISPLAY_VALUE_DIALOG;
                    case 280:
                        return ComponentTypeDto.BUYING_POWER_ROW;
                    case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                        return ComponentTypeDto.PORTFOLIO_CHART;
                    case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.GOLD_DEPOSIT_BONUS_PENDING_BONUS_BOTTOM_SHEET;
                    case 283:
                        return ComponentTypeDto.GOLD_DEPOSIT_BONUS_DEFICIT_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.ASSET_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                        return ComponentTypeDto.PNL_CHART;
                    case f2777x89a9e432:
                        return ComponentTypeDto.PNL_SETTINGS;
                    case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                        return ComponentTypeDto.PNL_DETAIL_BOTTOM_SHEET;
                    case 288:
                        return ComponentTypeDto.REALIZED_GAIN_LOSS_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                        return ComponentTypeDto.FUTURES_TRADE_BAR;
                    case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                        return ComponentTypeDto.FUTURES_LIST_SORT_BOTTOM_SHEET;
                    case f2776x87e624cb:
                        return ComponentTypeDto.LADDER_NUX;
                    case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                        return ComponentTypeDto.CASH_BALANCES_HOME_SECTION;
                    case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                        return ComponentTypeDto.CORTEX_DIGEST_SECTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                        return ComponentTypeDto.PILL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.EDUCATION_ROW;
                    case SDK_ASSET_LOADING_INDICATOR_VALUE:
                        return ComponentTypeDto.NEWS_SECTION;
                    case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                        return ComponentTypeDto.PENDING_ORDER_ROW;
                    case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                        return ComponentTypeDto.PENDING_ORDER_SECTION;
                    case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                        return ComponentTypeDto.TOKENIZED_STOCK_HOLDING_ROW;
                    case 300:
                        return ComponentTypeDto.TOKENIZED_STOCK_HOLDING_SECTION;
                    case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                        return ComponentTypeDto.PERPETUALS_HOLDING_SECTION;
                    case 302:
                        return ComponentTypeDto.OPEN_POSITION_SUMMARY;
                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.OPEN_POSITIONS_SECTION;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                        return ComponentTypeDto.PENDING_ORDERS_SECTION;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.EXPLORE_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                        return ComponentTypeDto.PNL_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.OPTION_PROFIT_AND_LOSS_CARD;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                        return ComponentTypeDto.OPTION_PROFIT_AND_LOSS_SLIDER;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.COMPANY_FINANCIALS_CHART;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                        return ComponentTypeDto.CORTEX_DIGEST_UPSELL_SECTION;
                    case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                        return ComponentTypeDto.COMPANY_FINANCIALS_SECTION;
                    case f2774x74902ae0:
                        return ComponentTypeDto.WATCHLIST_ROW;
                    case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                        return ComponentTypeDto.RETURNS_CHART;
                    case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                        return ComponentTypeDto.SELECT_MENU;
                    case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                        return ComponentTypeDto.OPTIONS_STATUS_SECTION;
                    case 316:
                        return ComponentTypeDto.FX_SWITCHER;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                        return ComponentTypeDto.PROXY_VOTE_SECTION;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.EVENT_CONTRACT_TRADE_OVERLAY_DIALOG;
                    case f2781x2ba65ba3:
                        return ComponentTypeDto.OPTION_L3_ENTRYPOINT_TAG;
                    case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                        return ComponentTypeDto.CREDIT_APPLICATION_GOLD_BASIC_DOWNSELL_BOTTOM_SHEET;
                    case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                        return ComponentTypeDto.DASHBOARD_PILL;
                    case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                        return ComponentTypeDto.FEED_POST_ROW;
                    case f2775xbcb7e6f3:
                        return ComponentTypeDto.ACTIVITY_ITEM_ROW;
                    case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                        return ComponentTypeDto.CONCIERGE_PLUS_UPSELL_BANNER;
                    case SDK_ASSET_ICON_REPORT_VALUE:
                        return ComponentTypeDto.RECURRING_INVESTMENTS_EQUITY_NUX;
                    case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                        return ComponentTypeDto.EVENT_CONTRACT_COMBO_LEG;
                    case SDK_ASSET_ICON_UPLOAD_VALUE:
                        return ComponentTypeDto.EVENT_CONTRACT_STRIKE_PICKER;
                    case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                        return ComponentTypeDto.INTEREST_SECTION;
                    case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                        return ComponentTypeDto.CREDIT_APPLICATION_INCOME_CONFIRMATION_BOTTOM_SHEET;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$ComponentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ComponentTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ComponentTypeDto, Component.ComponentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.Component.ComponentType", ComponentTypeDto.getEntries(), ComponentTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ComponentTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ComponentTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ComponentTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ComponentTypeDto valueOf(String str) {
            return (ComponentTypeDto) Enum.valueOf(ComponentTypeDto.class, str);
        }

        public static ComponentTypeDto[] values() {
            return (ComponentTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Component", kSerializerSerializer.getDescriptor());
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
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ComponentDto";
        }
    }
}
