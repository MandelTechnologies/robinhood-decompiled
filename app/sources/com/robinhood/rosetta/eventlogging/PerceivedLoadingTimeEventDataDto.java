package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.ScreenDto;
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

/* compiled from: PerceivedLoadingTimeEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Surrogate;)V", "loading_duration", "", "total_duration", "screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "has_loading_at_exit", "", "number_of_unique_elements", "", "number_of_unique_elements_at_exit", "(JJLcom/robinhood/rosetta/eventlogging/ScreenDto;ZII)V", "getLoading_duration", "()J", "getTotal_duration", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getHas_loading_at_exit", "()Z", "getNumber_of_unique_elements", "()I", "getNumber_of_unique_elements_at_exit", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class PerceivedLoadingTimeEventDataDto implements Dto3<PerceivedLoadingTimeEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerceivedLoadingTimeEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerceivedLoadingTimeEventDataDto, PerceivedLoadingTimeEventData>> binaryBase64Serializer$delegate;
    private static final PerceivedLoadingTimeEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerceivedLoadingTimeEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerceivedLoadingTimeEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final long getLoading_duration() {
        return this.surrogate.getLoading_duration();
    }

    public final long getTotal_duration() {
        return this.surrogate.getTotal_duration();
    }

    public final ScreenDto getScreen() {
        return this.surrogate.getScreen();
    }

    public final boolean getHas_loading_at_exit() {
        return this.surrogate.getHas_loading_at_exit();
    }

    public final int getNumber_of_unique_elements() {
        return this.surrogate.getNumber_of_unique_elements();
    }

    public final int getNumber_of_unique_elements_at_exit() {
        return this.surrogate.getNumber_of_unique_elements_at_exit();
    }

    public /* synthetic */ PerceivedLoadingTimeEventDataDto(long j, long j2, ScreenDto screenDto, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? null : screenDto, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }

    public PerceivedLoadingTimeEventDataDto(long j, long j2, ScreenDto screenDto, boolean z, int i, int i2) {
        this(new Surrogate(j, j2, screenDto, z, i, i2));
    }

    public static /* synthetic */ PerceivedLoadingTimeEventDataDto copy$default(PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, long j, long j2, ScreenDto screenDto, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = perceivedLoadingTimeEventDataDto.surrogate.getLoading_duration();
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = perceivedLoadingTimeEventDataDto.surrogate.getTotal_duration();
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            screenDto = perceivedLoadingTimeEventDataDto.surrogate.getScreen();
        }
        ScreenDto screenDto2 = screenDto;
        if ((i3 & 8) != 0) {
            z = perceivedLoadingTimeEventDataDto.surrogate.getHas_loading_at_exit();
        }
        return perceivedLoadingTimeEventDataDto.copy(j3, j4, screenDto2, z, (i3 & 16) != 0 ? perceivedLoadingTimeEventDataDto.surrogate.getNumber_of_unique_elements() : i, (i3 & 32) != 0 ? perceivedLoadingTimeEventDataDto.surrogate.getNumber_of_unique_elements_at_exit() : i2);
    }

    public final PerceivedLoadingTimeEventDataDto copy(long loading_duration, long total_duration, ScreenDto screen, boolean has_loading_at_exit, int number_of_unique_elements, int number_of_unique_elements_at_exit) {
        return new PerceivedLoadingTimeEventDataDto(new Surrogate(loading_duration, total_duration, screen, has_loading_at_exit, number_of_unique_elements, number_of_unique_elements_at_exit));
    }

    @Override // com.robinhood.idl.Dto
    public PerceivedLoadingTimeEventData toProto() {
        long loading_duration = this.surrogate.getLoading_duration();
        long total_duration = this.surrogate.getTotal_duration();
        ScreenDto screen = this.surrogate.getScreen();
        return new PerceivedLoadingTimeEventData(loading_duration, total_duration, screen != null ? screen.toProto() : null, this.surrogate.getHas_loading_at_exit(), this.surrogate.getNumber_of_unique_elements(), this.surrogate.getNumber_of_unique_elements_at_exit(), null, 64, null);
    }

    public String toString() {
        return "[PerceivedLoadingTimeEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerceivedLoadingTimeEventDataDto) && Intrinsics.areEqual(((PerceivedLoadingTimeEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerceivedLoadingTimeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002;<B\u0081\u0001\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011BM\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\u0018\u0010'\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010(\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u0018\u0010+\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010,\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000eHÆ\u0003J\u0083\u0001\u0010-\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\rHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R+\u0010\f\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R+\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010$¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Surrogate;", "", "loading_duration", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "total_duration", "screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "has_loading_at_exit", "", "number_of_unique_elements", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "number_of_unique_elements_at_exit", "<init>", "(JJLcom/robinhood/rosetta/eventlogging/ScreenDto;ZII)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJLcom/robinhood/rosetta/eventlogging/ScreenDto;ZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLoading_duration$annotations", "()V", "getLoading_duration", "()J", "getTotal_duration$annotations", "getTotal_duration", "getScreen$annotations", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getHas_loading_at_exit$annotations", "getHas_loading_at_exit", "()Z", "getNumber_of_unique_elements$annotations", "getNumber_of_unique_elements", "()I", "getNumber_of_unique_elements_at_exit$annotations", "getNumber_of_unique_elements_at_exit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean has_loading_at_exit;
        private final long loading_duration;
        private final int number_of_unique_elements;
        private final int number_of_unique_elements_at_exit;
        private final ScreenDto screen;
        private final long total_duration;

        public Surrogate() {
            this(0L, 0L, (ScreenDto) null, false, 0, 0, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, long j, long j2, ScreenDto screenDto, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = surrogate.loading_duration;
            }
            long j3 = j;
            if ((i3 & 2) != 0) {
                j2 = surrogate.total_duration;
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                screenDto = surrogate.screen;
            }
            ScreenDto screenDto2 = screenDto;
            if ((i3 & 8) != 0) {
                z = surrogate.has_loading_at_exit;
            }
            return surrogate.copy(j3, j4, screenDto2, z, (i3 & 16) != 0 ? surrogate.number_of_unique_elements : i, (i3 & 32) != 0 ? surrogate.number_of_unique_elements_at_exit : i2);
        }

        @SerialName("hasLoadingAtExit")
        @JsonAnnotations2(names = {"has_loading_at_exit"})
        public static /* synthetic */ void getHas_loading_at_exit$annotations() {
        }

        @SerialName("loadingDuration")
        @JsonAnnotations2(names = {"loading_duration"})
        public static /* synthetic */ void getLoading_duration$annotations() {
        }

        @SerialName("numberOfUniqueElements")
        @JsonAnnotations2(names = {"number_of_unique_elements"})
        public static /* synthetic */ void getNumber_of_unique_elements$annotations() {
        }

        @SerialName("numberOfUniqueElementsAtExit")
        @JsonAnnotations2(names = {"number_of_unique_elements_at_exit"})
        public static /* synthetic */ void getNumber_of_unique_elements_at_exit$annotations() {
        }

        @SerialName("screen")
        @JsonAnnotations2(names = {"screen"})
        public static /* synthetic */ void getScreen$annotations() {
        }

        @SerialName("totalDuration")
        @JsonAnnotations2(names = {"total_duration"})
        public static /* synthetic */ void getTotal_duration$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final long getLoading_duration() {
            return this.loading_duration;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTotal_duration() {
            return this.total_duration;
        }

        /* renamed from: component3, reason: from getter */
        public final ScreenDto getScreen() {
            return this.screen;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHas_loading_at_exit() {
            return this.has_loading_at_exit;
        }

        /* renamed from: component5, reason: from getter */
        public final int getNumber_of_unique_elements() {
            return this.number_of_unique_elements;
        }

        /* renamed from: component6, reason: from getter */
        public final int getNumber_of_unique_elements_at_exit() {
            return this.number_of_unique_elements_at_exit;
        }

        public final Surrogate copy(long loading_duration, long total_duration, ScreenDto screen, boolean has_loading_at_exit, int number_of_unique_elements, int number_of_unique_elements_at_exit) {
            return new Surrogate(loading_duration, total_duration, screen, has_loading_at_exit, number_of_unique_elements, number_of_unique_elements_at_exit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.loading_duration == surrogate.loading_duration && this.total_duration == surrogate.total_duration && Intrinsics.areEqual(this.screen, surrogate.screen) && this.has_loading_at_exit == surrogate.has_loading_at_exit && this.number_of_unique_elements == surrogate.number_of_unique_elements && this.number_of_unique_elements_at_exit == surrogate.number_of_unique_elements_at_exit;
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.loading_duration) * 31) + Long.hashCode(this.total_duration)) * 31;
            ScreenDto screenDto = this.screen;
            return ((((((iHashCode + (screenDto == null ? 0 : screenDto.hashCode())) * 31) + java.lang.Boolean.hashCode(this.has_loading_at_exit)) * 31) + Integer.hashCode(this.number_of_unique_elements)) * 31) + Integer.hashCode(this.number_of_unique_elements_at_exit);
        }

        public String toString() {
            return "Surrogate(loading_duration=" + this.loading_duration + ", total_duration=" + this.total_duration + ", screen=" + this.screen + ", has_loading_at_exit=" + this.has_loading_at_exit + ", number_of_unique_elements=" + this.number_of_unique_elements + ", number_of_unique_elements_at_exit=" + this.number_of_unique_elements_at_exit + ")";
        }

        /* compiled from: PerceivedLoadingTimeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerceivedLoadingTimeEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, long j, long j2, ScreenDto screenDto, boolean z, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.loading_duration = 0L;
            } else {
                this.loading_duration = j;
            }
            if ((i & 2) == 0) {
                this.total_duration = 0L;
            } else {
                this.total_duration = j2;
            }
            if ((i & 4) == 0) {
                this.screen = null;
            } else {
                this.screen = screenDto;
            }
            if ((i & 8) == 0) {
                this.has_loading_at_exit = false;
            } else {
                this.has_loading_at_exit = z;
            }
            if ((i & 16) == 0) {
                this.number_of_unique_elements = 0;
            } else {
                this.number_of_unique_elements = i2;
            }
            if ((i & 32) == 0) {
                this.number_of_unique_elements_at_exit = 0;
            } else {
                this.number_of_unique_elements_at_exit = i3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            long j = self.loading_duration;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.total_duration;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            ScreenDto screenDto = self.screen;
            if (screenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ScreenDto.Serializer.INSTANCE, screenDto);
            }
            boolean z = self.has_loading_at_exit;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            int i = self.number_of_unique_elements;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.number_of_unique_elements_at_exit;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
        }

        public Surrogate(long j, long j2, ScreenDto screenDto, boolean z, int i, int i2) {
            this.loading_duration = j;
            this.total_duration = j2;
            this.screen = screenDto;
            this.has_loading_at_exit = z;
            this.number_of_unique_elements = i;
            this.number_of_unique_elements_at_exit = i2;
        }

        public /* synthetic */ Surrogate(long j, long j2, ScreenDto screenDto, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? null : screenDto, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
        }

        public final long getLoading_duration() {
            return this.loading_duration;
        }

        public final long getTotal_duration() {
            return this.total_duration;
        }

        public final ScreenDto getScreen() {
            return this.screen;
        }

        public final boolean getHas_loading_at_exit() {
            return this.has_loading_at_exit;
        }

        public final int getNumber_of_unique_elements() {
            return this.number_of_unique_elements;
        }

        public final int getNumber_of_unique_elements_at_exit() {
            return this.number_of_unique_elements_at_exit;
        }
    }

    /* compiled from: PerceivedLoadingTimeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PerceivedLoadingTimeEventDataDto, PerceivedLoadingTimeEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerceivedLoadingTimeEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerceivedLoadingTimeEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerceivedLoadingTimeEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PerceivedLoadingTimeEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerceivedLoadingTimeEventData> getProtoAdapter() {
            return PerceivedLoadingTimeEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerceivedLoadingTimeEventDataDto getZeroValue() {
            return PerceivedLoadingTimeEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerceivedLoadingTimeEventDataDto fromProto(PerceivedLoadingTimeEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            long loading_duration = proto.getLoading_duration();
            long total_duration = proto.getTotal_duration();
            Screen screen = proto.getScreen();
            return new PerceivedLoadingTimeEventDataDto(new Surrogate(loading_duration, total_duration, screen != null ? ScreenDto.INSTANCE.fromProto(screen) : null, proto.getHas_loading_at_exit(), proto.getNumber_of_unique_elements(), proto.getNumber_of_unique_elements_at_exit()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerceivedLoadingTimeEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerceivedLoadingTimeEventDataDto(0L, 0L, null, false, 0, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PerceivedLoadingTimeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PerceivedLoadingTimeEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerceivedLoadingTimeEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerceivedLoadingTimeEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerceivedLoadingTimeEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerceivedLoadingTimeEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerceivedLoadingTimeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventDataDto";
        }
    }
}
