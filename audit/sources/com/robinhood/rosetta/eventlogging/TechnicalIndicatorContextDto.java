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
import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext;
import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContextDto;
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

/* compiled from: TechnicalIndicatorContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005 !\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Surrogate;)V", "type", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "indicator_configuration", "", "(Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "getIndicator_configuration", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "IndicatorTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TechnicalIndicatorContextDto implements Dto3<TechnicalIndicatorContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TechnicalIndicatorContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TechnicalIndicatorContextDto, TechnicalIndicatorContext>> binaryBase64Serializer$delegate;
    private static final TechnicalIndicatorContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TechnicalIndicatorContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TechnicalIndicatorContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IndicatorTypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getIndicator_configuration() {
        return this.surrogate.getIndicator_configuration();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TechnicalIndicatorContextDto(IndicatorTypeDto type2, String indicator_configuration) {
        this(new Surrogate(type2, indicator_configuration));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(indicator_configuration, "indicator_configuration");
    }

    public /* synthetic */ TechnicalIndicatorContextDto(IndicatorTypeDto indicatorTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IndicatorTypeDto.INSTANCE.getZeroValue() : indicatorTypeDto, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ TechnicalIndicatorContextDto copy$default(TechnicalIndicatorContextDto technicalIndicatorContextDto, IndicatorTypeDto indicatorTypeDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            indicatorTypeDto = technicalIndicatorContextDto.surrogate.getType();
        }
        if ((i & 2) != 0) {
            str = technicalIndicatorContextDto.surrogate.getIndicator_configuration();
        }
        return technicalIndicatorContextDto.copy(indicatorTypeDto, str);
    }

    public final TechnicalIndicatorContextDto copy(IndicatorTypeDto type2, String indicator_configuration) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(indicator_configuration, "indicator_configuration");
        return new TechnicalIndicatorContextDto(new Surrogate(type2, indicator_configuration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TechnicalIndicatorContext toProto() {
        return new TechnicalIndicatorContext((TechnicalIndicatorContext.IndicatorType) this.surrogate.getType().toProto(), this.surrogate.getIndicator_configuration(), null, 4, null);
    }

    public String toString() {
        return "[TechnicalIndicatorContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TechnicalIndicatorContextDto) && Intrinsics.areEqual(((TechnicalIndicatorContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: TechnicalIndicatorContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Surrogate;", "", "type", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "indicator_configuration", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "getIndicator_configuration$annotations", "getIndicator_configuration", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String indicator_configuration;
        private final IndicatorTypeDto type;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((IndicatorTypeDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, IndicatorTypeDto indicatorTypeDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                indicatorTypeDto = surrogate.type;
            }
            if ((i & 2) != 0) {
                str = surrogate.indicator_configuration;
            }
            return surrogate.copy(indicatorTypeDto, str);
        }

        @SerialName("indicatorConfiguration")
        @JsonAnnotations2(names = {"indicator_configuration"})
        public static /* synthetic */ void getIndicator_configuration$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final IndicatorTypeDto getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIndicator_configuration() {
            return this.indicator_configuration;
        }

        public final Surrogate copy(IndicatorTypeDto type2, String indicator_configuration) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(indicator_configuration, "indicator_configuration");
            return new Surrogate(type2, indicator_configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.indicator_configuration, surrogate.indicator_configuration);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.indicator_configuration.hashCode();
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", indicator_configuration=" + this.indicator_configuration + ")";
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TechnicalIndicatorContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IndicatorTypeDto indicatorTypeDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? IndicatorTypeDto.INSTANCE.getZeroValue() : indicatorTypeDto;
            if ((i & 2) == 0) {
                this.indicator_configuration = "";
            } else {
                this.indicator_configuration = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != IndicatorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, IndicatorTypeDto.Serializer.INSTANCE, self.type);
            }
            if (Intrinsics.areEqual(self.indicator_configuration, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.indicator_configuration);
        }

        public Surrogate(IndicatorTypeDto type2, String indicator_configuration) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(indicator_configuration, "indicator_configuration");
            this.type = type2;
            this.indicator_configuration = indicator_configuration;
        }

        public final IndicatorTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(IndicatorTypeDto indicatorTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? IndicatorTypeDto.INSTANCE.getZeroValue() : indicatorTypeDto, (i & 2) != 0 ? "" : str);
        }

        public final String getIndicator_configuration() {
            return this.indicator_configuration;
        }
    }

    /* compiled from: TechnicalIndicatorContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TechnicalIndicatorContextDto, TechnicalIndicatorContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TechnicalIndicatorContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TechnicalIndicatorContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TechnicalIndicatorContextDto> getBinaryBase64Serializer() {
            return (KSerializer) TechnicalIndicatorContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TechnicalIndicatorContext> getProtoAdapter() {
            return TechnicalIndicatorContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TechnicalIndicatorContextDto getZeroValue() {
            return TechnicalIndicatorContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TechnicalIndicatorContextDto fromProto(TechnicalIndicatorContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TechnicalIndicatorContextDto(new Surrogate(IndicatorTypeDto.INSTANCE.fromProto(proto.getType()), proto.getIndicator_configuration()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TechnicalIndicatorContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TechnicalIndicatorContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TechnicalIndicatorContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TechnicalIndicatorContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INDICATOR_TYPE_UNSPECIFIED", "MACD", "SMA", "RSI", "EMA", "BOLLINGER_BANDS", "VWAP", "DEPTH_CHART", "ORDER_BOOK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IndicatorTypeDto implements Dto2<TechnicalIndicatorContext.IndicatorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IndicatorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<IndicatorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IndicatorTypeDto, TechnicalIndicatorContext.IndicatorType>> binaryBase64Serializer$delegate;
        public static final IndicatorTypeDto INDICATOR_TYPE_UNSPECIFIED = new INDICATOR_TYPE_UNSPECIFIED("INDICATOR_TYPE_UNSPECIFIED", 0);
        public static final IndicatorTypeDto MACD = new MACD("MACD", 1);
        public static final IndicatorTypeDto SMA = new SMA("SMA", 2);
        public static final IndicatorTypeDto RSI = new RSI("RSI", 3);
        public static final IndicatorTypeDto EMA = new EMA("EMA", 4);
        public static final IndicatorTypeDto BOLLINGER_BANDS = new BOLLINGER_BANDS("BOLLINGER_BANDS", 5);
        public static final IndicatorTypeDto VWAP = new VWAP("VWAP", 6);
        public static final IndicatorTypeDto DEPTH_CHART = new DEPTH_CHART("DEPTH_CHART", 7);
        public static final IndicatorTypeDto ORDER_BOOK = new ORDER_BOOK("ORDER_BOOK", 8);

        private static final /* synthetic */ IndicatorTypeDto[] $values() {
            return new IndicatorTypeDto[]{INDICATOR_TYPE_UNSPECIFIED, MACD, SMA, RSI, EMA, BOLLINGER_BANDS, VWAP, DEPTH_CHART, ORDER_BOOK};
        }

        public /* synthetic */ IndicatorTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<IndicatorTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private IndicatorTypeDto(String str, int i) {
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.INDICATOR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDICATOR_TYPE_UNSPECIFIED extends IndicatorTypeDto {
            INDICATOR_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED;
            }
        }

        static {
            IndicatorTypeDto[] indicatorTypeDtoArr$values = $values();
            $VALUES = indicatorTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(indicatorTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TechnicalIndicatorContextDto$IndicatorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TechnicalIndicatorContextDto.IndicatorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.MACD", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MACD extends IndicatorTypeDto {
            MACD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.MACD;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.SMA", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMA extends IndicatorTypeDto {
            SMA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.SMA;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.RSI", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RSI extends IndicatorTypeDto {
            RSI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.RSI;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.EMA", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMA extends IndicatorTypeDto {
            EMA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.EMA;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.BOLLINGER_BANDS", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BOLLINGER_BANDS extends IndicatorTypeDto {
            BOLLINGER_BANDS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.BOLLINGER_BANDS;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.VWAP", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VWAP extends IndicatorTypeDto {
            VWAP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.VWAP;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.DEPTH_CHART", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPTH_CHART extends IndicatorTypeDto {
            DEPTH_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.DEPTH_CHART;
            }
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto.IndicatorTypeDto.ORDER_BOOK", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_BOOK extends IndicatorTypeDto {
            ORDER_BOOK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TechnicalIndicatorContext.IndicatorType toProto() {
                return TechnicalIndicatorContext.IndicatorType.ORDER_BOOK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<IndicatorTypeDto, TechnicalIndicatorContext.IndicatorType> {

            /* compiled from: TechnicalIndicatorContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TechnicalIndicatorContext.IndicatorType.values().length];
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.MACD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.SMA.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.RSI.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.EMA.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.BOLLINGER_BANDS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.VWAP.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.DEPTH_CHART.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[TechnicalIndicatorContext.IndicatorType.ORDER_BOOK.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IndicatorTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IndicatorTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IndicatorTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) IndicatorTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TechnicalIndicatorContext.IndicatorType> getProtoAdapter() {
                return TechnicalIndicatorContext.IndicatorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IndicatorTypeDto getZeroValue() {
                return IndicatorTypeDto.INDICATOR_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IndicatorTypeDto fromProto(TechnicalIndicatorContext.IndicatorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return IndicatorTypeDto.INDICATOR_TYPE_UNSPECIFIED;
                    case 2:
                        return IndicatorTypeDto.MACD;
                    case 3:
                        return IndicatorTypeDto.SMA;
                    case 4:
                        return IndicatorTypeDto.RSI;
                    case 5:
                        return IndicatorTypeDto.EMA;
                    case 6:
                        return IndicatorTypeDto.BOLLINGER_BANDS;
                    case 7:
                        return IndicatorTypeDto.VWAP;
                    case 8:
                        return IndicatorTypeDto.DEPTH_CHART;
                    case 9:
                        return IndicatorTypeDto.ORDER_BOOK;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TechnicalIndicatorContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$IndicatorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<IndicatorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<IndicatorTypeDto, TechnicalIndicatorContext.IndicatorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.TechnicalIndicatorContext.IndicatorType", IndicatorTypeDto.getEntries(), IndicatorTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public IndicatorTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (IndicatorTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IndicatorTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static IndicatorTypeDto valueOf(String str) {
            return (IndicatorTypeDto) Enum.valueOf(IndicatorTypeDto.class, str);
        }

        public static IndicatorTypeDto[] values() {
            return (IndicatorTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TechnicalIndicatorContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TechnicalIndicatorContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TechnicalIndicatorContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TechnicalIndicatorContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TechnicalIndicatorContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TechnicalIndicatorContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: TechnicalIndicatorContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TechnicalIndicatorContextDto";
        }
    }
}
