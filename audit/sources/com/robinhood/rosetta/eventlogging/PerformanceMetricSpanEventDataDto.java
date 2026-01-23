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
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto;
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

/* compiled from: PerformanceMetricSpanEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Surrogate;)V", "metric_id", "", "name", "duration", "", "status", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "context", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "(Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;)V", "getMetric_id", "()Ljava/lang/String;", "getName", "getDuration", "()D", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "StatusDto", "ContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PerformanceMetricSpanEventDataDto implements Dto3<PerformanceMetricSpanEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerformanceMetricSpanEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerformanceMetricSpanEventDataDto, PerformanceMetricSpanEventData>> binaryBase64Serializer$delegate;
    private static final PerformanceMetricSpanEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerformanceMetricSpanEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerformanceMetricSpanEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getMetric_id() {
        return this.surrogate.getMetric_id();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final double getDuration() {
        return this.surrogate.getDuration();
    }

    public final StatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final ContextDto getContext() {
        return this.surrogate.getContext();
    }

    public /* synthetic */ PerformanceMetricSpanEventDataDto(String str, String str2, double d, StatusDto statusDto, ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto, (i & 16) != 0 ? null : contextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceMetricSpanEventDataDto(String metric_id, String name, double d, StatusDto status, ContextDto contextDto) {
        this(new Surrogate(metric_id, name, d, status, contextDto));
        Intrinsics.checkNotNullParameter(metric_id, "metric_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    public static /* synthetic */ PerformanceMetricSpanEventDataDto copy$default(PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, String str, String str2, double d, StatusDto statusDto, ContextDto contextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performanceMetricSpanEventDataDto.surrogate.getMetric_id();
        }
        if ((i & 2) != 0) {
            str2 = performanceMetricSpanEventDataDto.surrogate.getName();
        }
        if ((i & 4) != 0) {
            d = performanceMetricSpanEventDataDto.surrogate.getDuration();
        }
        if ((i & 8) != 0) {
            statusDto = performanceMetricSpanEventDataDto.surrogate.getStatus();
        }
        if ((i & 16) != 0) {
            contextDto = performanceMetricSpanEventDataDto.surrogate.getContext();
        }
        double d2 = d;
        return performanceMetricSpanEventDataDto.copy(str, str2, d2, statusDto, contextDto);
    }

    public final PerformanceMetricSpanEventDataDto copy(String metric_id, String name, double duration, StatusDto status, ContextDto context) {
        Intrinsics.checkNotNullParameter(metric_id, "metric_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PerformanceMetricSpanEventDataDto(new Surrogate(metric_id, name, duration, status, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerformanceMetricSpanEventData toProto() {
        String metric_id = this.surrogate.getMetric_id();
        String name = this.surrogate.getName();
        double duration = this.surrogate.getDuration();
        PerformanceMetricSpanEventData.Status status = (PerformanceMetricSpanEventData.Status) this.surrogate.getStatus().toProto();
        ContextDto context = this.surrogate.getContext();
        return new PerformanceMetricSpanEventData(metric_id, name, duration, status, context != null ? context.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[PerformanceMetricSpanEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerformanceMetricSpanEventDataDto) && Intrinsics.areEqual(((PerformanceMetricSpanEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerformanceMetricSpanEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000278BJ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0018\u0010&\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003JL\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Surrogate;", "", "metric_id", "", "name", "duration", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "status", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "context", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMetric_id$annotations", "()V", "getMetric_id", "()Ljava/lang/String;", "getName$annotations", "getName", "getDuration$annotations", "getDuration", "()D", "getStatus$annotations", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "getContext$annotations", "getContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContextDto context;
        private final double duration;
        private final String metric_id;
        private final String name;
        private final StatusDto status;

        public Surrogate() {
            this((String) null, (String) null, 0.0d, (StatusDto) null, (ContextDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, double d, StatusDto statusDto, ContextDto contextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.metric_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 4) != 0) {
                d = surrogate.duration;
            }
            if ((i & 8) != 0) {
                statusDto = surrogate.status;
            }
            if ((i & 16) != 0) {
                contextDto = surrogate.context;
            }
            double d2 = d;
            return surrogate.copy(str, str2, d2, statusDto, contextDto);
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("metricId")
        @JsonAnnotations2(names = {"metric_id"})
        public static /* synthetic */ void getMetric_id$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getMetric_id() {
            return this.metric_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDuration() {
            return this.duration;
        }

        /* renamed from: component4, reason: from getter */
        public final StatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final ContextDto getContext() {
            return this.context;
        }

        public final Surrogate copy(String metric_id, String name, double duration, StatusDto status, ContextDto context) {
            Intrinsics.checkNotNullParameter(metric_id, "metric_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Surrogate(metric_id, name, duration, status, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.metric_id, surrogate.metric_id) && Intrinsics.areEqual(this.name, surrogate.name) && Double.compare(this.duration, surrogate.duration) == 0 && this.status == surrogate.status && Intrinsics.areEqual(this.context, surrogate.context);
        }

        public int hashCode() {
            int iHashCode = ((((((this.metric_id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.duration)) * 31) + this.status.hashCode()) * 31;
            ContextDto contextDto = this.context;
            return iHashCode + (contextDto == null ? 0 : contextDto.hashCode());
        }

        public String toString() {
            return "Surrogate(metric_id=" + this.metric_id + ", name=" + this.name + ", duration=" + this.duration + ", status=" + this.status + ", context=" + this.context + ")";
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerformanceMetricSpanEventDataDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, double d, StatusDto statusDto, ContextDto contextDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.metric_id = "";
            } else {
                this.metric_id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.duration = 0.0d;
            } else {
                this.duration = d;
            }
            if ((i & 8) == 0) {
                this.status = StatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = statusDto;
            }
            if ((i & 16) == 0) {
                this.context = null;
            } else {
                this.context = contextDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.metric_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.metric_id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (Double.compare(self.duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.duration));
            }
            if (self.status != StatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, StatusDto.Serializer.INSTANCE, self.status);
            }
            ContextDto contextDto = self.context;
            if (contextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ContextDto.Serializer.INSTANCE, contextDto);
            }
        }

        public Surrogate(String metric_id, String name, double d, StatusDto status, ContextDto contextDto) {
            Intrinsics.checkNotNullParameter(metric_id, "metric_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(status, "status");
            this.metric_id = metric_id;
            this.name = name;
            this.duration = d;
            this.status = status;
            this.context = contextDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, double d, StatusDto statusDto, ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto, (i & 16) != 0 ? null : contextDto);
        }

        public final String getMetric_id() {
            return this.metric_id;
        }

        public final String getName() {
            return this.name;
        }

        public final double getDuration() {
            return this.duration;
        }

        public final StatusDto getStatus() {
            return this.status;
        }

        public final ContextDto getContext() {
            return this.context;
        }
    }

    /* compiled from: PerformanceMetricSpanEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PerformanceMetricSpanEventDataDto, PerformanceMetricSpanEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerformanceMetricSpanEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerformanceMetricSpanEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerformanceMetricSpanEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PerformanceMetricSpanEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerformanceMetricSpanEventData> getProtoAdapter() {
            return PerformanceMetricSpanEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerformanceMetricSpanEventDataDto getZeroValue() {
            return PerformanceMetricSpanEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerformanceMetricSpanEventDataDto fromProto(PerformanceMetricSpanEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String metric_id = proto.getMetric_id();
            String name = proto.getName();
            double duration = proto.getDuration();
            StatusDto statusDtoFromProto = StatusDto.INSTANCE.fromProto(proto.getStatus());
            PerformanceMetricSpanEventData.Context context = proto.getContext();
            return new PerformanceMetricSpanEventDataDto(new Surrogate(metric_id, name, duration, statusDtoFromProto, context != null ? ContextDto.INSTANCE.fromProto(context) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceMetricSpanEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerformanceMetricSpanEventDataDto(null, null, 0.0d, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricSpanEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED", "COMPLETED", "FAILED", "ABORTED", "SKIPPED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StatusDto implements Dto2<PerformanceMetricSpanEventData.Status>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StatusDto, PerformanceMetricSpanEventData.Status>> binaryBase64Serializer$delegate;
        public static final StatusDto PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED = new PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED("PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED", 0);
        public static final StatusDto COMPLETED = new COMPLETED("COMPLETED", 1);
        public static final StatusDto FAILED = new FAILED("FAILED", 2);
        public static final StatusDto ABORTED = new ABORTED("ABORTED", 3);
        public static final StatusDto SKIPPED = new SKIPPED("SKIPPED", 4);

        private static final /* synthetic */ StatusDto[] $values() {
            return new StatusDto[]{PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED, COMPLETED, FAILED, ABORTED, SKIPPED};
        }

        public /* synthetic */ StatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto.StatusDto.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED extends StatusDto {
            PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricSpanEventData.Status toProto() {
                return PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
            }
        }

        private StatusDto(String str, int i) {
        }

        static {
            StatusDto[] statusDtoArr$values = $values();
            $VALUES = statusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto$StatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceMetricSpanEventDataDto.StatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto.StatusDto.COMPLETED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends StatusDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricSpanEventData.Status toProto() {
                return PerformanceMetricSpanEventData.Status.COMPLETED;
            }
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto.StatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends StatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricSpanEventData.Status toProto() {
                return PerformanceMetricSpanEventData.Status.FAILED;
            }
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto.StatusDto.ABORTED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ABORTED extends StatusDto {
            ABORTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricSpanEventData.Status toProto() {
                return PerformanceMetricSpanEventData.Status.ABORTED;
            }
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto.StatusDto.SKIPPED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SKIPPED extends StatusDto {
            SKIPPED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricSpanEventData.Status toProto() {
                return PerformanceMetricSpanEventData.Status.SKIPPED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StatusDto, PerformanceMetricSpanEventData.Status> {

            /* compiled from: PerformanceMetricSpanEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceMetricSpanEventData.Status.values().length];
                    try {
                        iArr[PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceMetricSpanEventData.Status.COMPLETED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceMetricSpanEventData.Status.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerformanceMetricSpanEventData.Status.ABORTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerformanceMetricSpanEventData.Status.SKIPPED.ordinal()] = 5;
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

            public final KSerializer<StatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StatusDto> getBinaryBase64Serializer() {
                return (KSerializer) StatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceMetricSpanEventData.Status> getProtoAdapter() {
                return PerformanceMetricSpanEventData.Status.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto getZeroValue() {
                return StatusDto.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto fromProto(PerformanceMetricSpanEventData.Status proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StatusDto.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return StatusDto.COMPLETED;
                }
                if (i == 3) {
                    return StatusDto.FAILED;
                }
                if (i == 4) {
                    return StatusDto.ABORTED;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return StatusDto.SKIPPED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$StatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<StatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StatusDto, PerformanceMetricSpanEventData.Status> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceMetricSpanEventData.Status", StatusDto.getEntries(), StatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PerformanceMetricSpanEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001b\u001c\u001d\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Surrogate;)V", "is_fresh", "", "(Z)V", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContextDto implements Dto3<PerformanceMetricSpanEventData.Context>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContextDto, PerformanceMetricSpanEventData.Context>> binaryBase64Serializer$delegate;
        private static final ContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final boolean is_fresh() {
            return this.surrogate.is_fresh();
        }

        public ContextDto(boolean z) {
            this(new Surrogate(z));
        }

        public /* synthetic */ ContextDto(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public static /* synthetic */ ContextDto copy$default(ContextDto contextDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = contextDto.surrogate.is_fresh();
            }
            return contextDto.copy(z);
        }

        public final ContextDto copy(boolean is_fresh) {
            return new ContextDto(new Surrogate(is_fresh));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public PerformanceMetricSpanEventData.Context toProto() {
            return new PerformanceMetricSpanEventData.Context(this.surrogate.is_fresh(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ContextDto) && Intrinsics.areEqual(((ContextDto) other).surrogate, this.surrogate);
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
        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0002\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Surrogate;", "", "is_fresh", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "is_fresh$annotations", "()V", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean is_fresh;

            public Surrogate() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = surrogate.is_fresh;
                }
                return surrogate.copy(z);
            }

            @SerialName("isFresh")
            @JsonAnnotations2(names = {"is_fresh"})
            public static /* synthetic */ void is_fresh$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIs_fresh() {
                return this.is_fresh;
            }

            public final Surrogate copy(boolean is_fresh) {
                return new Surrogate(is_fresh);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.is_fresh == ((Surrogate) other).is_fresh;
            }

            public int hashCode() {
                return java.lang.Boolean.hashCode(this.is_fresh);
            }

            public String toString() {
                return "Surrogate(is_fresh=" + this.is_fresh + ")";
            }

            /* compiled from: PerformanceMetricSpanEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return PerformanceMetricSpanEventDataDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.is_fresh = false;
                } else {
                    this.is_fresh = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                boolean z = self.is_fresh;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 0, z);
                }
            }

            public Surrogate(boolean z) {
                this.is_fresh = z;
            }

            public /* synthetic */ Surrogate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean is_fresh() {
                return this.is_fresh;
            }
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ContextDto, PerformanceMetricSpanEventData.Context> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContextDto> getBinaryBase64Serializer() {
                return (KSerializer) ContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceMetricSpanEventData.Context> getProtoAdapter() {
                return PerformanceMetricSpanEventData.Context.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContextDto getZeroValue() {
                return ContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContextDto fromProto(PerformanceMetricSpanEventData.Context proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ContextDto(new Surrogate(proto.getIs_fresh()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto$ContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceMetricSpanEventDataDto.ContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ContextDto(false, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricSpanEventData.Context", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: PerformanceMetricSpanEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$ContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto$ContextDto";
            }
        }
    }

    /* compiled from: PerformanceMetricSpanEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PerformanceMetricSpanEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricSpanEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerformanceMetricSpanEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerformanceMetricSpanEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerformanceMetricSpanEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerformanceMetricSpanEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto";
        }
    }
}
