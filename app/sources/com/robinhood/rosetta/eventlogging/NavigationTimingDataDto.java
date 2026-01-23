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
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.NavigationTimingData;
import com.robinhood.rosetta.eventlogging.NavigationTimingDataDto;
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

/* compiled from: NavigationTimingDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006%&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Surrogate;)V", "duration_type", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "navigation_type", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "duration_ms", "", "(Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;D)V", "getDuration_type", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "getNavigation_type", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "getDuration_ms", "()D", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DurationTypeDto", "NavigationTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NavigationTimingDataDto implements Dto3<NavigationTimingData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NavigationTimingDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NavigationTimingDataDto, NavigationTimingData>> binaryBase64Serializer$delegate;
    private static final NavigationTimingDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NavigationTimingDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NavigationTimingDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DurationTypeDto getDuration_type() {
        return this.surrogate.getDuration_type();
    }

    public final NavigationTypeDto getNavigation_type() {
        return this.surrogate.getNavigation_type();
    }

    public final double getDuration_ms() {
        return this.surrogate.getDuration_ms();
    }

    public /* synthetic */ NavigationTimingDataDto(DurationTypeDto durationTypeDto, NavigationTypeDto navigationTypeDto, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DurationTypeDto.INSTANCE.getZeroValue() : durationTypeDto, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto, (i & 4) != 0 ? 0.0d : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationTimingDataDto(DurationTypeDto duration_type, NavigationTypeDto navigation_type, double d) {
        this(new Surrogate(duration_type, navigation_type, d));
        Intrinsics.checkNotNullParameter(duration_type, "duration_type");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
    }

    public static /* synthetic */ NavigationTimingDataDto copy$default(NavigationTimingDataDto navigationTimingDataDto, DurationTypeDto durationTypeDto, NavigationTypeDto navigationTypeDto, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            durationTypeDto = navigationTimingDataDto.surrogate.getDuration_type();
        }
        if ((i & 2) != 0) {
            navigationTypeDto = navigationTimingDataDto.surrogate.getNavigation_type();
        }
        if ((i & 4) != 0) {
            d = navigationTimingDataDto.surrogate.getDuration_ms();
        }
        return navigationTimingDataDto.copy(durationTypeDto, navigationTypeDto, d);
    }

    public final NavigationTimingDataDto copy(DurationTypeDto duration_type, NavigationTypeDto navigation_type, double duration_ms) {
        Intrinsics.checkNotNullParameter(duration_type, "duration_type");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        return new NavigationTimingDataDto(new Surrogate(duration_type, navigation_type, duration_ms));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NavigationTimingData toProto() {
        return new NavigationTimingData((NavigationTimingData.DurationType) this.surrogate.getDuration_type().toProto(), (NavigationTimingData.NavigationType) this.surrogate.getNavigation_type().toProto(), this.surrogate.getDuration_ms(), null, 8, null);
    }

    public String toString() {
        return "[NavigationTimingDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NavigationTimingDataDto) && Intrinsics.areEqual(((NavigationTimingDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: NavigationTimingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./B4\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\u000b\u0010\fB7\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\u001e\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000eHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Surrogate;", "", "duration_type", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "navigation_type", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "duration_ms", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDuration_type$annotations", "()V", "getDuration_type", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "getNavigation_type$annotations", "getNavigation_type", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "getDuration_ms$annotations", "getDuration_ms", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double duration_ms;
        private final DurationTypeDto duration_type;
        private final NavigationTypeDto navigation_type;

        public Surrogate() {
            this((DurationTypeDto) null, (NavigationTypeDto) null, 0.0d, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DurationTypeDto durationTypeDto, NavigationTypeDto navigationTypeDto, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                durationTypeDto = surrogate.duration_type;
            }
            if ((i & 2) != 0) {
                navigationTypeDto = surrogate.navigation_type;
            }
            if ((i & 4) != 0) {
                d = surrogate.duration_ms;
            }
            return surrogate.copy(durationTypeDto, navigationTypeDto, d);
        }

        @SerialName("durationMs")
        @JsonAnnotations2(names = {"duration_ms"})
        public static /* synthetic */ void getDuration_ms$annotations() {
        }

        @SerialName("durationType")
        @JsonAnnotations2(names = {"duration_type"})
        public static /* synthetic */ void getDuration_type$annotations() {
        }

        @SerialName("navigationType")
        @JsonAnnotations2(names = {"navigation_type"})
        public static /* synthetic */ void getNavigation_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DurationTypeDto getDuration_type() {
            return this.duration_type;
        }

        /* renamed from: component2, reason: from getter */
        public final NavigationTypeDto getNavigation_type() {
            return this.navigation_type;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDuration_ms() {
            return this.duration_ms;
        }

        public final Surrogate copy(DurationTypeDto duration_type, NavigationTypeDto navigation_type, double duration_ms) {
            Intrinsics.checkNotNullParameter(duration_type, "duration_type");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            return new Surrogate(duration_type, navigation_type, duration_ms);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.duration_type == surrogate.duration_type && this.navigation_type == surrogate.navigation_type && Double.compare(this.duration_ms, surrogate.duration_ms) == 0;
        }

        public int hashCode() {
            return (((this.duration_type.hashCode() * 31) + this.navigation_type.hashCode()) * 31) + Double.hashCode(this.duration_ms);
        }

        public String toString() {
            return "Surrogate(duration_type=" + this.duration_type + ", navigation_type=" + this.navigation_type + ", duration_ms=" + this.duration_ms + ")";
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NavigationTimingDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DurationTypeDto durationTypeDto, NavigationTypeDto navigationTypeDto, double d, SerializationConstructorMarker serializationConstructorMarker) {
            this.duration_type = (i & 1) == 0 ? DurationTypeDto.INSTANCE.getZeroValue() : durationTypeDto;
            if ((i & 2) == 0) {
                this.navigation_type = NavigationTypeDto.INSTANCE.getZeroValue();
            } else {
                this.navigation_type = navigationTypeDto;
            }
            if ((i & 4) == 0) {
                this.duration_ms = 0.0d;
            } else {
                this.duration_ms = d;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.duration_type != DurationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DurationTypeDto.Serializer.INSTANCE, self.duration_type);
            }
            if (self.navigation_type != NavigationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, NavigationTypeDto.Serializer.INSTANCE, self.navigation_type);
            }
            if (Double.compare(self.duration_ms, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.duration_ms));
            }
        }

        public Surrogate(DurationTypeDto duration_type, NavigationTypeDto navigation_type, double d) {
            Intrinsics.checkNotNullParameter(duration_type, "duration_type");
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            this.duration_type = duration_type;
            this.navigation_type = navigation_type;
            this.duration_ms = d;
        }

        public final DurationTypeDto getDuration_type() {
            return this.duration_type;
        }

        public /* synthetic */ Surrogate(DurationTypeDto durationTypeDto, NavigationTypeDto navigationTypeDto, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DurationTypeDto.INSTANCE.getZeroValue() : durationTypeDto, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto, (i & 4) != 0 ? 0.0d : d);
        }

        public final NavigationTypeDto getNavigation_type() {
            return this.navigation_type;
        }

        public final double getDuration_ms() {
            return this.duration_ms;
        }
    }

    /* compiled from: NavigationTimingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NavigationTimingDataDto, NavigationTimingData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NavigationTimingDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationTimingDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationTimingDataDto> getBinaryBase64Serializer() {
            return (KSerializer) NavigationTimingDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NavigationTimingData> getProtoAdapter() {
            return NavigationTimingData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationTimingDataDto getZeroValue() {
            return NavigationTimingDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationTimingDataDto fromProto(NavigationTimingData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NavigationTimingDataDto(new Surrogate(DurationTypeDto.INSTANCE.fromProto(proto.getDuration_type()), NavigationTypeDto.INSTANCE.fromProto(proto.getNavigation_type()), proto.getDuration_ms()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NavigationTimingDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationTimingDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NavigationTimingDataDto(null, null, 0.0d, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationTimingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DURATION_TYPE_UNSPECIFIED", "TOTAL_PAGE_LOAD_TIME", "REQUEST_RESPONSE_TIME", "PAGE_RENDER_TIME", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DurationTypeDto implements Dto2<NavigationTimingData.DurationType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DurationTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DurationTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DurationTypeDto, NavigationTimingData.DurationType>> binaryBase64Serializer$delegate;
        public static final DurationTypeDto DURATION_TYPE_UNSPECIFIED = new DURATION_TYPE_UNSPECIFIED("DURATION_TYPE_UNSPECIFIED", 0);
        public static final DurationTypeDto TOTAL_PAGE_LOAD_TIME = new TOTAL_PAGE_LOAD_TIME("TOTAL_PAGE_LOAD_TIME", 1);
        public static final DurationTypeDto REQUEST_RESPONSE_TIME = new REQUEST_RESPONSE_TIME("REQUEST_RESPONSE_TIME", 2);
        public static final DurationTypeDto PAGE_RENDER_TIME = new PAGE_RENDER_TIME("PAGE_RENDER_TIME", 3);

        private static final /* synthetic */ DurationTypeDto[] $values() {
            return new DurationTypeDto[]{DURATION_TYPE_UNSPECIFIED, TOTAL_PAGE_LOAD_TIME, REQUEST_RESPONSE_TIME, PAGE_RENDER_TIME};
        }

        public /* synthetic */ DurationTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DurationTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.DurationTypeDto.DURATION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DURATION_TYPE_UNSPECIFIED extends DurationTypeDto {
            DURATION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.DurationType toProto() {
                return NavigationTimingData.DurationType.DURATION_TYPE_UNSPECIFIED;
            }
        }

        private DurationTypeDto(String str, int i) {
        }

        static {
            DurationTypeDto[] durationTypeDtoArr$values = $values();
            $VALUES = durationTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(durationTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NavigationTimingDataDto$DurationTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationTimingDataDto.DurationTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.DurationTypeDto.TOTAL_PAGE_LOAD_TIME", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOTAL_PAGE_LOAD_TIME extends DurationTypeDto {
            TOTAL_PAGE_LOAD_TIME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.DurationType toProto() {
                return NavigationTimingData.DurationType.TOTAL_PAGE_LOAD_TIME;
            }
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.DurationTypeDto.REQUEST_RESPONSE_TIME", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REQUEST_RESPONSE_TIME extends DurationTypeDto {
            REQUEST_RESPONSE_TIME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.DurationType toProto() {
                return NavigationTimingData.DurationType.REQUEST_RESPONSE_TIME;
            }
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.DurationTypeDto.PAGE_RENDER_TIME", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAGE_RENDER_TIME extends DurationTypeDto {
            PAGE_RENDER_TIME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.DurationType toProto() {
                return NavigationTimingData.DurationType.PAGE_RENDER_TIME;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$DurationType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DurationTypeDto, NavigationTimingData.DurationType> {

            /* compiled from: NavigationTimingDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NavigationTimingData.DurationType.values().length];
                    try {
                        iArr[NavigationTimingData.DurationType.DURATION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NavigationTimingData.DurationType.TOTAL_PAGE_LOAD_TIME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NavigationTimingData.DurationType.REQUEST_RESPONSE_TIME.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NavigationTimingData.DurationType.PAGE_RENDER_TIME.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DurationTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DurationTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DurationTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) DurationTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NavigationTimingData.DurationType> getProtoAdapter() {
                return NavigationTimingData.DurationType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DurationTypeDto getZeroValue() {
                return DurationTypeDto.DURATION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DurationTypeDto fromProto(NavigationTimingData.DurationType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DurationTypeDto.DURATION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DurationTypeDto.TOTAL_PAGE_LOAD_TIME;
                }
                if (i == 3) {
                    return DurationTypeDto.REQUEST_RESPONSE_TIME;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return DurationTypeDto.PAGE_RENDER_TIME;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$DurationTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DurationTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DurationTypeDto, NavigationTimingData.DurationType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NavigationTimingData.DurationType", DurationTypeDto.getEntries(), DurationTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DurationTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DurationTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DurationTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DurationTypeDto valueOf(String str) {
            return (DurationTypeDto) Enum.valueOf(DurationTypeDto.class, str);
        }

        public static DurationTypeDto[] values() {
            return (DurationTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationTimingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NAVIGATION_TYPE_UNSPECIFIED", "NAVIGATE", "RELOAD", "BACK_FORWARD", "PRERENDER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NavigationTypeDto implements Dto2<NavigationTimingData.NavigationType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NavigationTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NavigationTypeDto, NavigationTimingData.NavigationType>> binaryBase64Serializer$delegate;
        public static final NavigationTypeDto NAVIGATION_TYPE_UNSPECIFIED = new NAVIGATION_TYPE_UNSPECIFIED("NAVIGATION_TYPE_UNSPECIFIED", 0);
        public static final NavigationTypeDto NAVIGATE = new NAVIGATE("NAVIGATE", 1);
        public static final NavigationTypeDto RELOAD = new RELOAD("RELOAD", 2);
        public static final NavigationTypeDto BACK_FORWARD = new BACK_FORWARD("BACK_FORWARD", 3);
        public static final NavigationTypeDto PRERENDER = new PRERENDER("PRERENDER", 4);

        private static final /* synthetic */ NavigationTypeDto[] $values() {
            return new NavigationTypeDto[]{NAVIGATION_TYPE_UNSPECIFIED, NAVIGATE, RELOAD, BACK_FORWARD, PRERENDER};
        }

        public /* synthetic */ NavigationTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NavigationTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.NavigationTypeDto.NAVIGATION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NAVIGATION_TYPE_UNSPECIFIED extends NavigationTypeDto {
            NAVIGATION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.NavigationType toProto() {
                return NavigationTimingData.NavigationType.NAVIGATION_TYPE_UNSPECIFIED;
            }
        }

        private NavigationTypeDto(String str, int i) {
        }

        static {
            NavigationTypeDto[] navigationTypeDtoArr$values = $values();
            $VALUES = navigationTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navigationTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NavigationTimingDataDto$NavigationTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationTimingDataDto.NavigationTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.NavigationTypeDto.NAVIGATE", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NAVIGATE extends NavigationTypeDto {
            NAVIGATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.NavigationType toProto() {
                return NavigationTimingData.NavigationType.NAVIGATE;
            }
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.NavigationTypeDto.RELOAD", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RELOAD extends NavigationTypeDto {
            RELOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.NavigationType toProto() {
                return NavigationTimingData.NavigationType.RELOAD;
            }
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.NavigationTypeDto.BACK_FORWARD", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BACK_FORWARD extends NavigationTypeDto {
            BACK_FORWARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.NavigationType toProto() {
                return NavigationTimingData.NavigationType.BACK_FORWARD;
            }
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NavigationTimingDataDto.NavigationTypeDto.PRERENDER", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRERENDER extends NavigationTypeDto {
            PRERENDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NavigationTimingData.NavigationType toProto() {
                return NavigationTimingData.NavigationType.PRERENDER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData$NavigationType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NavigationTypeDto, NavigationTimingData.NavigationType> {

            /* compiled from: NavigationTimingDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NavigationTimingData.NavigationType.values().length];
                    try {
                        iArr[NavigationTimingData.NavigationType.NAVIGATION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NavigationTimingData.NavigationType.NAVIGATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NavigationTimingData.NavigationType.RELOAD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NavigationTimingData.NavigationType.BACK_FORWARD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NavigationTimingData.NavigationType.PRERENDER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NavigationTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NavigationTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NavigationTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) NavigationTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NavigationTimingData.NavigationType> getProtoAdapter() {
                return NavigationTimingData.NavigationType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NavigationTypeDto getZeroValue() {
                return NavigationTypeDto.NAVIGATION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NavigationTypeDto fromProto(NavigationTimingData.NavigationType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return NavigationTypeDto.NAVIGATION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return NavigationTypeDto.NAVIGATE;
                }
                if (i == 3) {
                    return NavigationTypeDto.RELOAD;
                }
                if (i == 4) {
                    return NavigationTypeDto.BACK_FORWARD;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return NavigationTypeDto.PRERENDER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NavigationTimingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$NavigationTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<NavigationTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NavigationTypeDto, NavigationTimingData.NavigationType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NavigationTimingData.NavigationType", NavigationTypeDto.getEntries(), NavigationTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NavigationTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NavigationTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NavigationTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NavigationTypeDto valueOf(String str) {
            return (NavigationTypeDto) Enum.valueOf(NavigationTypeDto.class, str);
        }

        public static NavigationTypeDto[] values() {
            return (NavigationTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NavigationTimingDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NavigationTimingDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NavigationTimingData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NavigationTimingDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NavigationTimingDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NavigationTimingDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NavigationTimingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NavigationTimingDataDto";
        }
    }
}
