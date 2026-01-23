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
import com.robinhood.rosetta.eventlogging.ContextDto;
import com.robinhood.rosetta.eventlogging.ListSortDto;
import com.robinhood.rosetta.eventlogging.ListsContextDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import com.robinhood.rosetta.eventlogging.UserInteractionEventDataDto;
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
import rosetta.option.OptionType;
import rosetta.option.OptionTypeDto;
import rosetta.option.StrategyName;
import rosetta.option.StrategyNameDto;
import rosetta.order.Side;
import rosetta.order.SideDto;

/* compiled from: PerformanceMetricEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b01234567B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0014JD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020)H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Surrogate;)V", "id", "", "name", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "duration", "", "context", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "status", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;)V", "getId", "()Ljava/lang/String;", "getName", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "getDuration", "()D", "getContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "getSource", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "NameDto", "StatusDto", "ContextDto", "SourceDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PerformanceMetricEventDataDto implements Dto3<PerformanceMetricEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerformanceMetricEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerformanceMetricEventDataDto, PerformanceMetricEventData>> binaryBase64Serializer$delegate;
    private static final PerformanceMetricEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerformanceMetricEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerformanceMetricEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final NameDto getName() {
        return this.surrogate.getName();
    }

    public final double getDuration() {
        return this.surrogate.getDuration();
    }

    public final ContextDto getContext() {
        return this.surrogate.getContext();
    }

    public final StatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final SourceDto getSource() {
        return this.surrogate.getSource();
    }

    public /* synthetic */ PerformanceMetricEventDataDto(String str, NameDto nameDto, double d, ContextDto contextDto, StatusDto statusDto, SourceDto sourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? NameDto.INSTANCE.getZeroValue() : nameDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : contextDto, (i & 16) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto, (i & 32) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceMetricEventDataDto(String id, NameDto name, double d, ContextDto contextDto, StatusDto status, SourceDto source) {
        this(new Surrogate(id, name, d, contextDto, status, source));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ PerformanceMetricEventDataDto copy$default(PerformanceMetricEventDataDto performanceMetricEventDataDto, String str, NameDto nameDto, double d, ContextDto contextDto, StatusDto statusDto, SourceDto sourceDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performanceMetricEventDataDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            nameDto = performanceMetricEventDataDto.surrogate.getName();
        }
        if ((i & 4) != 0) {
            d = performanceMetricEventDataDto.surrogate.getDuration();
        }
        if ((i & 8) != 0) {
            contextDto = performanceMetricEventDataDto.surrogate.getContext();
        }
        if ((i & 16) != 0) {
            statusDto = performanceMetricEventDataDto.surrogate.getStatus();
        }
        if ((i & 32) != 0) {
            sourceDto = performanceMetricEventDataDto.surrogate.getSource();
        }
        SourceDto sourceDto2 = sourceDto;
        ContextDto contextDto2 = contextDto;
        double d2 = d;
        return performanceMetricEventDataDto.copy(str, nameDto, d2, contextDto2, statusDto, sourceDto2);
    }

    public final PerformanceMetricEventDataDto copy(String id, NameDto name, double duration, ContextDto context, StatusDto status, SourceDto source) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        return new PerformanceMetricEventDataDto(new Surrogate(id, name, duration, context, status, source));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerformanceMetricEventData toProto() {
        String id = this.surrogate.getId();
        PerformanceMetricEventData.Name name = (PerformanceMetricEventData.Name) this.surrogate.getName().toProto();
        double duration = this.surrogate.getDuration();
        ContextDto context = this.surrogate.getContext();
        return new PerformanceMetricEventData(id, name, duration, context != null ? context.toProto() : null, (PerformanceMetricEventData.Status) this.surrogate.getStatus().toProto(), (PerformanceMetricEventData.Source) this.surrogate.getSource().toProto(), null, 64, null);
    }

    public String toString() {
        return "[PerformanceMetricEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerformanceMetricEventDataDto) && Intrinsics.areEqual(((PerformanceMetricEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002?@BT\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012BU\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0018\u0010-\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003JV\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0014HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*¨\u0006A"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Surrogate;", "", "id", "", "name", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "duration", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "context", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "status", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getName$annotations", "getName", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "getDuration$annotations", "getDuration", "()D", "getContext$annotations", "getContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "getStatus$annotations", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "getSource$annotations", "getSource", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContextDto context;
        private final double duration;
        private final String id;
        private final NameDto name;
        private final SourceDto source;
        private final StatusDto status;

        public Surrogate() {
            this((String) null, (NameDto) null, 0.0d, (ContextDto) null, (StatusDto) null, (SourceDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, NameDto nameDto, double d, ContextDto contextDto, StatusDto statusDto, SourceDto sourceDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                nameDto = surrogate.name;
            }
            if ((i & 4) != 0) {
                d = surrogate.duration;
            }
            if ((i & 8) != 0) {
                contextDto = surrogate.context;
            }
            if ((i & 16) != 0) {
                statusDto = surrogate.status;
            }
            if ((i & 32) != 0) {
                sourceDto = surrogate.source;
            }
            SourceDto sourceDto2 = sourceDto;
            ContextDto contextDto2 = contextDto;
            double d2 = d;
            return surrogate.copy(str, nameDto, d2, contextDto2, statusDto, sourceDto2);
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final NameDto getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDuration() {
            return this.duration;
        }

        /* renamed from: component4, reason: from getter */
        public final ContextDto getContext() {
            return this.context;
        }

        /* renamed from: component5, reason: from getter */
        public final StatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final SourceDto getSource() {
            return this.source;
        }

        public final Surrogate copy(String id, NameDto name, double duration, ContextDto context, StatusDto status, SourceDto source) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(id, name, duration, context, status, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.name == surrogate.name && Double.compare(this.duration, surrogate.duration) == 0 && Intrinsics.areEqual(this.context, surrogate.context) && this.status == surrogate.status && this.source == surrogate.source;
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.duration)) * 31;
            ContextDto contextDto = this.context;
            return ((((iHashCode + (contextDto == null ? 0 : contextDto.hashCode())) * 31) + this.status.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", duration=" + this.duration + ", context=" + this.context + ", status=" + this.status + ", source=" + this.source + ")";
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerformanceMetricEventDataDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, NameDto nameDto, double d, ContextDto contextDto, StatusDto statusDto, SourceDto sourceDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.name = NameDto.INSTANCE.getZeroValue();
            } else {
                this.name = nameDto;
            }
            if ((i & 4) == 0) {
                this.duration = 0.0d;
            } else {
                this.duration = d;
            }
            if ((i & 8) == 0) {
                this.context = null;
            } else {
                this.context = contextDto;
            }
            if ((i & 16) == 0) {
                this.status = StatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = statusDto;
            }
            if ((i & 32) == 0) {
                this.source = SourceDto.INSTANCE.getZeroValue();
            } else {
                this.source = sourceDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.name != NameDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, NameDto.Serializer.INSTANCE, self.name);
            }
            if (Double.compare(self.duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.duration));
            }
            ContextDto contextDto = self.context;
            if (contextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ContextDto.Serializer.INSTANCE, contextDto);
            }
            if (self.status != StatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, StatusDto.Serializer.INSTANCE, self.status);
            }
            if (self.source != SourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SourceDto.Serializer.INSTANCE, self.source);
            }
        }

        public Surrogate(String id, NameDto name, double d, ContextDto contextDto, StatusDto status, SourceDto source) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(source, "source");
            this.id = id;
            this.name = name;
            this.duration = d;
            this.context = contextDto;
            this.status = status;
            this.source = source;
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Surrogate(String str, NameDto nameDto, double d, ContextDto contextDto, StatusDto statusDto, SourceDto sourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? NameDto.INSTANCE.getZeroValue() : nameDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : contextDto, (i & 16) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto, (i & 32) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto);
        }

        public final NameDto getName() {
            return this.name;
        }

        public final double getDuration() {
            return this.duration;
        }

        public final ContextDto getContext() {
            return this.context;
        }

        public final StatusDto getStatus() {
            return this.status;
        }

        public final SourceDto getSource() {
            return this.source;
        }
    }

    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PerformanceMetricEventDataDto, PerformanceMetricEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerformanceMetricEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerformanceMetricEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerformanceMetricEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PerformanceMetricEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerformanceMetricEventData> getProtoAdapter() {
            return PerformanceMetricEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerformanceMetricEventDataDto getZeroValue() {
            return PerformanceMetricEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerformanceMetricEventDataDto fromProto(PerformanceMetricEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            NameDto nameDtoFromProto = NameDto.INSTANCE.fromProto(proto.getName());
            double duration = proto.getDuration();
            PerformanceMetricEventData.Context context = proto.getContext();
            return new PerformanceMetricEventDataDto(new Surrogate(id, nameDtoFromProto, duration, context != null ? ContextDto.INSTANCE.fromProto(context) : null, StatusDto.INSTANCE.fromProto(proto.getStatus()), SourceDto.INSTANCE.fromProto(proto.getSource())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerformanceMetricEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerformanceMetricEventDataDto(null, null, 0.0d, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b3\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002>?B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020<H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL_AUTH", "HOME", "STOCK_DETAIL", "OPTIONS_CHAIN", "OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE", "OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE", "OPTIONS_CHAIN_DIFFERENT_SIDE", "OPTIONS_CHAIN_SELECT_CONTRACT", "OPTIONS_ORDER_REVIEW", "LOCAL_AUTHENTICATION", "BROWSE_NEWSFEED", "OPTIONS_ORDER_SUBMIT", "OPTION_PROFIT_AND_LOSS_CHART", "OPTION_SHOPPING_CART", "OPTION_ORDER", "MESSAGE", "MESSAGE_THREAD", "OPTIONS_WATCHLIST_HUB", "OPTIONS_WATCHLIST_HUB_SORT", "OPTIONS_STRATEGY_CHAIN", "OPTIONS_STRATEGY_CHAIN_NEAR_FILTER", "OPTIONS_STRATEGY_CHAIN_FAR_FILTER", "OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER", "OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER", "OPTIONS_SIMULATED_RETURNS", "APP_LAUNCH", "HOME_SETUP_POST_LAUNCH", "HOME_INSTRUMENT_ROW_TRADE_BAR", "TRADE_BUTTON_EXPANSION", "TRADE_OPTIONS_STRATEGY_BUILDER", "OPTIONS_CONTRACT_DATE_CONTRACTS", "OPTIONS_CONTRACT_BUY_BUTTON", "BUY_OPTION_TRADE_DETAILS", "REVIEW_OPTION_SWIPE_TO_SUBMIT", "SWIPE_TO_SUBMIT_OPTION_CONFIRMATION", "ACTION_COMPLETION", "SCREEN_LOAD", "STREAM_LOAD", "COMPONENT_LOAD", "BUY_EQUITY_TRADE_FLOW", "REVIEW_EQUITY_SWIPE_TO_SUBMIT", "SWIPE_TO_SUBMIT_EQUITY_CONFIRM", "TRANSFER_DEEPLINK_HANDLER", "MICROGRAM_LOAD", "GOLD_LEGACY_FLOW", "GOLD_UNIFIED_FLOW", "OPTIONS_SIDE_BY_SIDE_CHAIN", "MOBILE_ADVANCED_CHARTS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NameDto implements Dto2<PerformanceMetricEventData.Name>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NameDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NameDto, PerformanceMetricEventData.Name>> binaryBase64Serializer$delegate;
        public static final NameDto LOCAL_AUTH = new LOCAL_AUTH("LOCAL_AUTH", 0);
        public static final NameDto HOME = new HOME("HOME", 1);
        public static final NameDto STOCK_DETAIL = new STOCK_DETAIL("STOCK_DETAIL", 2);
        public static final NameDto OPTIONS_CHAIN = new OPTIONS_CHAIN("OPTIONS_CHAIN", 3);
        public static final NameDto OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE = new OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE("OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE", 4);
        public static final NameDto OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE = new OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE("OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE", 5);
        public static final NameDto OPTIONS_CHAIN_DIFFERENT_SIDE = new OPTIONS_CHAIN_DIFFERENT_SIDE("OPTIONS_CHAIN_DIFFERENT_SIDE", 6);
        public static final NameDto OPTIONS_CHAIN_SELECT_CONTRACT = new OPTIONS_CHAIN_SELECT_CONTRACT("OPTIONS_CHAIN_SELECT_CONTRACT", 7);
        public static final NameDto OPTIONS_ORDER_REVIEW = new OPTIONS_ORDER_REVIEW("OPTIONS_ORDER_REVIEW", 8);
        public static final NameDto LOCAL_AUTHENTICATION = new LOCAL_AUTHENTICATION("LOCAL_AUTHENTICATION", 9);
        public static final NameDto BROWSE_NEWSFEED = new BROWSE_NEWSFEED("BROWSE_NEWSFEED", 10);
        public static final NameDto OPTIONS_ORDER_SUBMIT = new OPTIONS_ORDER_SUBMIT("OPTIONS_ORDER_SUBMIT", 11);
        public static final NameDto OPTION_PROFIT_AND_LOSS_CHART = new OPTION_PROFIT_AND_LOSS_CHART("OPTION_PROFIT_AND_LOSS_CHART", 12);
        public static final NameDto OPTION_SHOPPING_CART = new OPTION_SHOPPING_CART("OPTION_SHOPPING_CART", 13);
        public static final NameDto OPTION_ORDER = new OPTION_ORDER("OPTION_ORDER", 14);
        public static final NameDto MESSAGE = new MESSAGE("MESSAGE", 15);
        public static final NameDto MESSAGE_THREAD = new MESSAGE_THREAD("MESSAGE_THREAD", 16);
        public static final NameDto OPTIONS_WATCHLIST_HUB = new OPTIONS_WATCHLIST_HUB("OPTIONS_WATCHLIST_HUB", 17);
        public static final NameDto OPTIONS_WATCHLIST_HUB_SORT = new OPTIONS_WATCHLIST_HUB_SORT("OPTIONS_WATCHLIST_HUB_SORT", 18);
        public static final NameDto OPTIONS_STRATEGY_CHAIN = new OPTIONS_STRATEGY_CHAIN("OPTIONS_STRATEGY_CHAIN", 19);
        public static final NameDto OPTIONS_STRATEGY_CHAIN_NEAR_FILTER = new OPTIONS_STRATEGY_CHAIN_NEAR_FILTER("OPTIONS_STRATEGY_CHAIN_NEAR_FILTER", 20);
        public static final NameDto OPTIONS_STRATEGY_CHAIN_FAR_FILTER = new OPTIONS_STRATEGY_CHAIN_FAR_FILTER("OPTIONS_STRATEGY_CHAIN_FAR_FILTER", 21);
        public static final NameDto OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER = new OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER("OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER", 22);
        public static final NameDto OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER = new OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER("OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER", 23);
        public static final NameDto OPTIONS_SIMULATED_RETURNS = new OPTIONS_SIMULATED_RETURNS("OPTIONS_SIMULATED_RETURNS", 24);
        public static final NameDto APP_LAUNCH = new APP_LAUNCH("APP_LAUNCH", 25);
        public static final NameDto HOME_SETUP_POST_LAUNCH = new HOME_SETUP_POST_LAUNCH("HOME_SETUP_POST_LAUNCH", 26);
        public static final NameDto HOME_INSTRUMENT_ROW_TRADE_BAR = new HOME_INSTRUMENT_ROW_TRADE_BAR("HOME_INSTRUMENT_ROW_TRADE_BAR", 27);
        public static final NameDto TRADE_BUTTON_EXPANSION = new TRADE_BUTTON_EXPANSION("TRADE_BUTTON_EXPANSION", 28);
        public static final NameDto TRADE_OPTIONS_STRATEGY_BUILDER = new TRADE_OPTIONS_STRATEGY_BUILDER("TRADE_OPTIONS_STRATEGY_BUILDER", 29);
        public static final NameDto OPTIONS_CONTRACT_DATE_CONTRACTS = new OPTIONS_CONTRACT_DATE_CONTRACTS("OPTIONS_CONTRACT_DATE_CONTRACTS", 30);
        public static final NameDto OPTIONS_CONTRACT_BUY_BUTTON = new OPTIONS_CONTRACT_BUY_BUTTON("OPTIONS_CONTRACT_BUY_BUTTON", 31);
        public static final NameDto BUY_OPTION_TRADE_DETAILS = new BUY_OPTION_TRADE_DETAILS("BUY_OPTION_TRADE_DETAILS", 32);
        public static final NameDto REVIEW_OPTION_SWIPE_TO_SUBMIT = new REVIEW_OPTION_SWIPE_TO_SUBMIT("REVIEW_OPTION_SWIPE_TO_SUBMIT", 33);
        public static final NameDto SWIPE_TO_SUBMIT_OPTION_CONFIRMATION = new SWIPE_TO_SUBMIT_OPTION_CONFIRMATION("SWIPE_TO_SUBMIT_OPTION_CONFIRMATION", 34);
        public static final NameDto ACTION_COMPLETION = new ACTION_COMPLETION("ACTION_COMPLETION", 35);
        public static final NameDto SCREEN_LOAD = new SCREEN_LOAD("SCREEN_LOAD", 36);
        public static final NameDto STREAM_LOAD = new STREAM_LOAD("STREAM_LOAD", 37);
        public static final NameDto COMPONENT_LOAD = new COMPONENT_LOAD("COMPONENT_LOAD", 38);
        public static final NameDto BUY_EQUITY_TRADE_FLOW = new BUY_EQUITY_TRADE_FLOW("BUY_EQUITY_TRADE_FLOW", 39);
        public static final NameDto REVIEW_EQUITY_SWIPE_TO_SUBMIT = new REVIEW_EQUITY_SWIPE_TO_SUBMIT("REVIEW_EQUITY_SWIPE_TO_SUBMIT", 40);
        public static final NameDto SWIPE_TO_SUBMIT_EQUITY_CONFIRM = new SWIPE_TO_SUBMIT_EQUITY_CONFIRM("SWIPE_TO_SUBMIT_EQUITY_CONFIRM", 41);
        public static final NameDto TRANSFER_DEEPLINK_HANDLER = new TRANSFER_DEEPLINK_HANDLER("TRANSFER_DEEPLINK_HANDLER", 42);
        public static final NameDto MICROGRAM_LOAD = new MICROGRAM_LOAD("MICROGRAM_LOAD", 43);
        public static final NameDto GOLD_LEGACY_FLOW = new GOLD_LEGACY_FLOW("GOLD_LEGACY_FLOW", 44);
        public static final NameDto GOLD_UNIFIED_FLOW = new GOLD_UNIFIED_FLOW("GOLD_UNIFIED_FLOW", 45);
        public static final NameDto OPTIONS_SIDE_BY_SIDE_CHAIN = new OPTIONS_SIDE_BY_SIDE_CHAIN("OPTIONS_SIDE_BY_SIDE_CHAIN", 46);
        public static final NameDto MOBILE_ADVANCED_CHARTS = new MOBILE_ADVANCED_CHARTS("MOBILE_ADVANCED_CHARTS", 47);

        private static final /* synthetic */ NameDto[] $values() {
            return new NameDto[]{LOCAL_AUTH, HOME, STOCK_DETAIL, OPTIONS_CHAIN, OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE, OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE, OPTIONS_CHAIN_DIFFERENT_SIDE, OPTIONS_CHAIN_SELECT_CONTRACT, OPTIONS_ORDER_REVIEW, LOCAL_AUTHENTICATION, BROWSE_NEWSFEED, OPTIONS_ORDER_SUBMIT, OPTION_PROFIT_AND_LOSS_CHART, OPTION_SHOPPING_CART, OPTION_ORDER, MESSAGE, MESSAGE_THREAD, OPTIONS_WATCHLIST_HUB, OPTIONS_WATCHLIST_HUB_SORT, OPTIONS_STRATEGY_CHAIN, OPTIONS_STRATEGY_CHAIN_NEAR_FILTER, OPTIONS_STRATEGY_CHAIN_FAR_FILTER, OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER, OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER, OPTIONS_SIMULATED_RETURNS, APP_LAUNCH, HOME_SETUP_POST_LAUNCH, HOME_INSTRUMENT_ROW_TRADE_BAR, TRADE_BUTTON_EXPANSION, TRADE_OPTIONS_STRATEGY_BUILDER, OPTIONS_CONTRACT_DATE_CONTRACTS, OPTIONS_CONTRACT_BUY_BUTTON, BUY_OPTION_TRADE_DETAILS, REVIEW_OPTION_SWIPE_TO_SUBMIT, SWIPE_TO_SUBMIT_OPTION_CONFIRMATION, ACTION_COMPLETION, SCREEN_LOAD, STREAM_LOAD, COMPONENT_LOAD, BUY_EQUITY_TRADE_FLOW, REVIEW_EQUITY_SWIPE_TO_SUBMIT, SWIPE_TO_SUBMIT_EQUITY_CONFIRM, TRANSFER_DEEPLINK_HANDLER, MICROGRAM_LOAD, GOLD_LEGACY_FLOW, GOLD_UNIFIED_FLOW, OPTIONS_SIDE_BY_SIDE_CHAIN, MOBILE_ADVANCED_CHARTS};
        }

        public /* synthetic */ NameDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NameDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.LOCAL_AUTH", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOCAL_AUTH extends NameDto {
            LOCAL_AUTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.LOCAL_AUTH;
            }
        }

        private NameDto(String str, int i) {
        }

        static {
            NameDto[] nameDtoArr$values = $values();
            $VALUES = nameDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nameDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$NameDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceMetricEventDataDto.NameDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.HOME", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOME extends NameDto {
            HOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.HOME;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.STOCK_DETAIL", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOCK_DETAIL extends NameDto {
            STOCK_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.STOCK_DETAIL;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CHAIN", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CHAIN extends NameDto {
            OPTIONS_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CHAIN;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE extends NameDto {
            OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE extends NameDto {
            OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CHAIN_DIFFERENT_SIDE", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CHAIN_DIFFERENT_SIDE extends NameDto {
            OPTIONS_CHAIN_DIFFERENT_SIDE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_SIDE;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CHAIN_SELECT_CONTRACT", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CHAIN_SELECT_CONTRACT extends NameDto {
            OPTIONS_CHAIN_SELECT_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CHAIN_SELECT_CONTRACT;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_ORDER_REVIEW", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_ORDER_REVIEW extends NameDto {
            OPTIONS_ORDER_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_ORDER_REVIEW;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.LOCAL_AUTHENTICATION", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOCAL_AUTHENTICATION extends NameDto {
            LOCAL_AUTHENTICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.LOCAL_AUTHENTICATION;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.BROWSE_NEWSFEED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BROWSE_NEWSFEED extends NameDto {
            BROWSE_NEWSFEED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.BROWSE_NEWSFEED;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_ORDER_SUBMIT", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_ORDER_SUBMIT extends NameDto {
            OPTIONS_ORDER_SUBMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_ORDER_SUBMIT;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTION_PROFIT_AND_LOSS_CHART", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_PROFIT_AND_LOSS_CHART extends NameDto {
            OPTION_PROFIT_AND_LOSS_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTION_PROFIT_AND_LOSS_CHART;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTION_SHOPPING_CART", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_SHOPPING_CART extends NameDto {
            OPTION_SHOPPING_CART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTION_SHOPPING_CART;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTION_ORDER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_ORDER extends NameDto {
            OPTION_ORDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTION_ORDER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.MESSAGE", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MESSAGE extends NameDto {
            MESSAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.MESSAGE;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.MESSAGE_THREAD", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MESSAGE_THREAD extends NameDto {
            MESSAGE_THREAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.MESSAGE_THREAD;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_WATCHLIST_HUB", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_WATCHLIST_HUB extends NameDto {
            OPTIONS_WATCHLIST_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_WATCHLIST_HUB_SORT", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_WATCHLIST_HUB_SORT extends NameDto {
            OPTIONS_WATCHLIST_HUB_SORT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB_SORT;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_STRATEGY_CHAIN", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_STRATEGY_CHAIN extends NameDto {
            OPTIONS_STRATEGY_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_STRATEGY_CHAIN_NEAR_FILTER extends NameDto {
            OPTIONS_STRATEGY_CHAIN_NEAR_FILTER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_STRATEGY_CHAIN_FAR_FILTER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_STRATEGY_CHAIN_FAR_FILTER extends NameDto {
            OPTIONS_STRATEGY_CHAIN_FAR_FILTER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_FAR_FILTER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER extends NameDto {
            OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER extends NameDto {
            OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_SIMULATED_RETURNS", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_SIMULATED_RETURNS extends NameDto {
            OPTIONS_SIMULATED_RETURNS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_SIMULATED_RETURNS;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.APP_LAUNCH", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_LAUNCH extends NameDto {
            APP_LAUNCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.APP_LAUNCH;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.HOME_SETUP_POST_LAUNCH", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOME_SETUP_POST_LAUNCH extends NameDto {
            HOME_SETUP_POST_LAUNCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.HOME_SETUP_POST_LAUNCH;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.HOME_INSTRUMENT_ROW_TRADE_BAR", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOME_INSTRUMENT_ROW_TRADE_BAR extends NameDto {
            HOME_INSTRUMENT_ROW_TRADE_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.HOME_INSTRUMENT_ROW_TRADE_BAR;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.TRADE_BUTTON_EXPANSION", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRADE_BUTTON_EXPANSION extends NameDto {
            TRADE_BUTTON_EXPANSION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.TRADE_BUTTON_EXPANSION;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.TRADE_OPTIONS_STRATEGY_BUILDER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRADE_OPTIONS_STRATEGY_BUILDER extends NameDto {
            TRADE_OPTIONS_STRATEGY_BUILDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.TRADE_OPTIONS_STRATEGY_BUILDER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CONTRACT_DATE_CONTRACTS", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CONTRACT_DATE_CONTRACTS extends NameDto {
            OPTIONS_CONTRACT_DATE_CONTRACTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CONTRACT_DATE_CONTRACTS;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_CONTRACT_BUY_BUTTON", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS_CONTRACT_BUY_BUTTON extends NameDto {
            OPTIONS_CONTRACT_BUY_BUTTON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_CONTRACT_BUY_BUTTON;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.BUY_OPTION_TRADE_DETAILS", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY_OPTION_TRADE_DETAILS extends NameDto {
            BUY_OPTION_TRADE_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.BUY_OPTION_TRADE_DETAILS;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.REVIEW_OPTION_SWIPE_TO_SUBMIT", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW_OPTION_SWIPE_TO_SUBMIT extends NameDto {
            REVIEW_OPTION_SWIPE_TO_SUBMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWIPE_TO_SUBMIT_OPTION_CONFIRMATION extends NameDto {
            SWIPE_TO_SUBMIT_OPTION_CONFIRMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.ACTION_COMPLETION", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTION_COMPLETION extends NameDto {
            ACTION_COMPLETION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.ACTION_COMPLETION;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.SCREEN_LOAD", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCREEN_LOAD extends NameDto {
            SCREEN_LOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.SCREEN_LOAD;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.STREAM_LOAD", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STREAM_LOAD extends NameDto {
            STREAM_LOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.STREAM_LOAD;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.COMPONENT_LOAD", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPONENT_LOAD extends NameDto {
            COMPONENT_LOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.COMPONENT_LOAD;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.BUY_EQUITY_TRADE_FLOW", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY_EQUITY_TRADE_FLOW extends NameDto {
            BUY_EQUITY_TRADE_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.BUY_EQUITY_TRADE_FLOW;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.REVIEW_EQUITY_SWIPE_TO_SUBMIT", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW_EQUITY_SWIPE_TO_SUBMIT extends NameDto {
            REVIEW_EQUITY_SWIPE_TO_SUBMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.REVIEW_EQUITY_SWIPE_TO_SUBMIT;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.SWIPE_TO_SUBMIT_EQUITY_CONFIRM", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SWIPE_TO_SUBMIT_EQUITY_CONFIRM extends NameDto {
            SWIPE_TO_SUBMIT_EQUITY_CONFIRM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_EQUITY_CONFIRM;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.TRANSFER_DEEPLINK_HANDLER", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_DEEPLINK_HANDLER extends NameDto {
            TRANSFER_DEEPLINK_HANDLER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.TRANSFER_DEEPLINK_HANDLER;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.MICROGRAM_LOAD", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MICROGRAM_LOAD extends NameDto {
            MICROGRAM_LOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.MICROGRAM_LOAD;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.GOLD_LEGACY_FLOW", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class GOLD_LEGACY_FLOW extends NameDto {
            GOLD_LEGACY_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.GOLD_LEGACY_FLOW;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.GOLD_UNIFIED_FLOW", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class GOLD_UNIFIED_FLOW extends NameDto {
            GOLD_UNIFIED_FLOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.GOLD_UNIFIED_FLOW;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.OPTIONS_SIDE_BY_SIDE_CHAIN", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class OPTIONS_SIDE_BY_SIDE_CHAIN extends NameDto {
            OPTIONS_SIDE_BY_SIDE_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.OPTIONS_SIDE_BY_SIDE_CHAIN;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.NameDto.MOBILE_ADVANCED_CHARTS", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class MOBILE_ADVANCED_CHARTS extends NameDto {
            MOBILE_ADVANCED_CHARTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Name toProto() {
                return PerformanceMetricEventData.Name.MOBILE_ADVANCED_CHARTS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NameDto, PerformanceMetricEventData.Name> {

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceMetricEventData.Name.values().length];
                    try {
                        iArr[PerformanceMetricEventData.Name.LOCAL_AUTH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.HOME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.STOCK_DETAIL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CHAIN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_SIDE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CHAIN_SELECT_CONTRACT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_ORDER_REVIEW.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.LOCAL_AUTHENTICATION.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.BROWSE_NEWSFEED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_ORDER_SUBMIT.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTION_PROFIT_AND_LOSS_CHART.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTION_SHOPPING_CART.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTION_ORDER.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.MESSAGE.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.MESSAGE_THREAD.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB_SORT.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_FAR_FILTER.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_SIMULATED_RETURNS.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.APP_LAUNCH.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.HOME_SETUP_POST_LAUNCH.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.HOME_INSTRUMENT_ROW_TRADE_BAR.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.TRADE_BUTTON_EXPANSION.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.TRADE_OPTIONS_STRATEGY_BUILDER.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CONTRACT_DATE_CONTRACTS.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_CONTRACT_BUY_BUTTON.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.BUY_OPTION_TRADE_DETAILS.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.ACTION_COMPLETION.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.SCREEN_LOAD.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.STREAM_LOAD.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.COMPONENT_LOAD.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.BUY_EQUITY_TRADE_FLOW.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.REVIEW_EQUITY_SWIPE_TO_SUBMIT.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_EQUITY_CONFIRM.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.TRANSFER_DEEPLINK_HANDLER.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.MICROGRAM_LOAD.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.GOLD_LEGACY_FLOW.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.GOLD_UNIFIED_FLOW.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.OPTIONS_SIDE_BY_SIDE_CHAIN.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Name.MOBILE_ADVANCED_CHARTS.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NameDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NameDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NameDto> getBinaryBase64Serializer() {
                return (KSerializer) NameDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceMetricEventData.Name> getProtoAdapter() {
                return PerformanceMetricEventData.Name.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NameDto getZeroValue() {
                return NameDto.LOCAL_AUTH;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NameDto fromProto(PerformanceMetricEventData.Name proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return NameDto.LOCAL_AUTH;
                    case 2:
                        return NameDto.HOME;
                    case 3:
                        return NameDto.STOCK_DETAIL;
                    case 4:
                        return NameDto.OPTIONS_CHAIN;
                    case 5:
                        return NameDto.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE;
                    case 6:
                        return NameDto.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE;
                    case 7:
                        return NameDto.OPTIONS_CHAIN_DIFFERENT_SIDE;
                    case 8:
                        return NameDto.OPTIONS_CHAIN_SELECT_CONTRACT;
                    case 9:
                        return NameDto.OPTIONS_ORDER_REVIEW;
                    case 10:
                        return NameDto.LOCAL_AUTHENTICATION;
                    case 11:
                        return NameDto.BROWSE_NEWSFEED;
                    case 12:
                        return NameDto.OPTIONS_ORDER_SUBMIT;
                    case 13:
                        return NameDto.OPTION_PROFIT_AND_LOSS_CHART;
                    case 14:
                        return NameDto.OPTION_SHOPPING_CART;
                    case 15:
                        return NameDto.OPTION_ORDER;
                    case 16:
                        return NameDto.MESSAGE;
                    case 17:
                        return NameDto.MESSAGE_THREAD;
                    case 18:
                        return NameDto.OPTIONS_WATCHLIST_HUB;
                    case 19:
                        return NameDto.OPTIONS_WATCHLIST_HUB_SORT;
                    case 20:
                        return NameDto.OPTIONS_STRATEGY_CHAIN;
                    case 21:
                        return NameDto.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER;
                    case 22:
                        return NameDto.OPTIONS_STRATEGY_CHAIN_FAR_FILTER;
                    case 23:
                        return NameDto.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER;
                    case 24:
                        return NameDto.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER;
                    case 25:
                        return NameDto.OPTIONS_SIMULATED_RETURNS;
                    case 26:
                        return NameDto.APP_LAUNCH;
                    case 27:
                        return NameDto.HOME_SETUP_POST_LAUNCH;
                    case 28:
                        return NameDto.HOME_INSTRUMENT_ROW_TRADE_BAR;
                    case 29:
                        return NameDto.TRADE_BUTTON_EXPANSION;
                    case 30:
                        return NameDto.TRADE_OPTIONS_STRATEGY_BUILDER;
                    case 31:
                        return NameDto.OPTIONS_CONTRACT_DATE_CONTRACTS;
                    case 32:
                        return NameDto.OPTIONS_CONTRACT_BUY_BUTTON;
                    case 33:
                        return NameDto.BUY_OPTION_TRADE_DETAILS;
                    case 34:
                        return NameDto.REVIEW_OPTION_SWIPE_TO_SUBMIT;
                    case 35:
                        return NameDto.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION;
                    case 36:
                        return NameDto.ACTION_COMPLETION;
                    case 37:
                        return NameDto.SCREEN_LOAD;
                    case 38:
                        return NameDto.STREAM_LOAD;
                    case 39:
                        return NameDto.COMPONENT_LOAD;
                    case 40:
                        return NameDto.BUY_EQUITY_TRADE_FLOW;
                    case 41:
                        return NameDto.REVIEW_EQUITY_SWIPE_TO_SUBMIT;
                    case 42:
                        return NameDto.SWIPE_TO_SUBMIT_EQUITY_CONFIRM;
                    case 43:
                        return NameDto.TRANSFER_DEEPLINK_HANDLER;
                    case 44:
                        return NameDto.MICROGRAM_LOAD;
                    case 45:
                        return NameDto.GOLD_LEGACY_FLOW;
                    case 46:
                        return NameDto.GOLD_UNIFIED_FLOW;
                    case 47:
                        return NameDto.OPTIONS_SIDE_BY_SIDE_CHAIN;
                    case 48:
                        return NameDto.MOBILE_ADVANCED_CHARTS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$NameDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<NameDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NameDto, PerformanceMetricEventData.Name> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Name", NameDto.getEntries(), NameDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NameDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NameDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NameDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NameDto valueOf(String str) {
            return (NameDto) Enum.valueOf(NameDto.class, str);
        }

        public static NameDto[] values() {
            return (NameDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PERFORMANCE_METRIC_STATUS_UNSPECIFIED", "COMPLETED", "FAILED", "ABORTED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StatusDto implements Dto2<PerformanceMetricEventData.Status>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StatusDto, PerformanceMetricEventData.Status>> binaryBase64Serializer$delegate;
        public static final StatusDto PERFORMANCE_METRIC_STATUS_UNSPECIFIED = new PERFORMANCE_METRIC_STATUS_UNSPECIFIED("PERFORMANCE_METRIC_STATUS_UNSPECIFIED", 0);
        public static final StatusDto COMPLETED = new COMPLETED("COMPLETED", 1);
        public static final StatusDto FAILED = new FAILED("FAILED", 2);
        public static final StatusDto ABORTED = new ABORTED("ABORTED", 3);

        private static final /* synthetic */ StatusDto[] $values() {
            return new StatusDto[]{PERFORMANCE_METRIC_STATUS_UNSPECIFIED, COMPLETED, FAILED, ABORTED};
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

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.StatusDto.PERFORMANCE_METRIC_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERFORMANCE_METRIC_STATUS_UNSPECIFIED extends StatusDto {
            PERFORMANCE_METRIC_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Status toProto() {
                return PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$StatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceMetricEventDataDto.StatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.StatusDto.COMPLETED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends StatusDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Status toProto() {
                return PerformanceMetricEventData.Status.COMPLETED;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.StatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends StatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Status toProto() {
                return PerformanceMetricEventData.Status.FAILED;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.StatusDto.ABORTED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ABORTED extends StatusDto {
            ABORTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Status toProto() {
                return PerformanceMetricEventData.Status.ABORTED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StatusDto, PerformanceMetricEventData.Status> {

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceMetricEventData.Status.values().length];
                    try {
                        iArr[PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Status.COMPLETED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Status.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Status.ABORTED.ordinal()] = 4;
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
            public ProtoAdapter<PerformanceMetricEventData.Status> getProtoAdapter() {
                return PerformanceMetricEventData.Status.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto getZeroValue() {
                return StatusDto.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto fromProto(PerformanceMetricEventData.Status proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return StatusDto.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return StatusDto.COMPLETED;
                }
                if (i == 3) {
                    return StatusDto.FAILED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return StatusDto.ABORTED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$StatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<StatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StatusDto, PerformanceMetricEventData.Status> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Status", StatusDto.getEntries(), StatusDto.INSTANCE.getZeroValue());

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

    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n@ABCDEFGHIB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0006\u0010\u001cJ\u0084\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u000204H\u0016J\u0013\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000209H\u0016J\b\u0010?\u001a\u000209H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006J"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Surrogate;)V", "from_cold_start", "", "requires_local_auth", "symbol", "options", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "lists_context", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "list_sort", "Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "action", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "screen_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "stream_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "component_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "microgram_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "(ZZZLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;Lcom/robinhood/rosetta/eventlogging/ListsContextDto;Lcom/robinhood/rosetta/eventlogging/ListSortDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;)V", "getFrom_cold_start", "()Z", "getRequires_local_auth", "getSymbol", "getOptions", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "getLists_context", "()Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "getList_sort", "()Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "getScreen_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "getStream_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "getComponent_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "getMicrogram_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OptionsDto", "ActionDto", "ScreenLoadDto", "StreamLoadDto", "ComponentLoadDto", "MicrogramLoadDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContextDto implements Dto3<PerformanceMetricEventData.Context>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContextDto, PerformanceMetricEventData.Context>> binaryBase64Serializer$delegate;
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

        public final boolean getFrom_cold_start() {
            return this.surrogate.getFrom_cold_start();
        }

        public final boolean getRequires_local_auth() {
            return this.surrogate.getRequires_local_auth();
        }

        public final boolean getSymbol() {
            return this.surrogate.getSymbol();
        }

        public final OptionsDto getOptions() {
            return this.surrogate.getOptions();
        }

        public final ListsContextDto getLists_context() {
            return this.surrogate.getLists_context();
        }

        public final ListSortDto getList_sort() {
            return this.surrogate.getList_sort();
        }

        public final ActionDto getAction() {
            return this.surrogate.getAction();
        }

        public final ScreenLoadDto getScreen_load() {
            return this.surrogate.getScreen_load();
        }

        public final StreamLoadDto getStream_load() {
            return this.surrogate.getStream_load();
        }

        public final ComponentLoadDto getComponent_load() {
            return this.surrogate.getComponent_load();
        }

        public final MicrogramLoadDto getMicrogram_load() {
            return this.surrogate.getMicrogram_load();
        }

        public /* synthetic */ ContextDto(boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : optionsDto, (i & 16) != 0 ? null : listsContextDto, (i & 32) != 0 ? null : listSortDto, (i & 64) != 0 ? null : actionDto, (i & 128) != 0 ? null : screenLoadDto, (i & 256) != 0 ? null : streamLoadDto, (i & 512) != 0 ? null : componentLoadDto, (i & 1024) != 0 ? null : microgramLoadDto);
        }

        public ContextDto(boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto) {
            this(new Surrogate(z, z2, z3, optionsDto, listsContextDto, listSortDto, actionDto, screenLoadDto, streamLoadDto, componentLoadDto, microgramLoadDto));
        }

        public static /* synthetic */ ContextDto copy$default(ContextDto contextDto, boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto, int i, Object obj) {
            if ((i & 1) != 0) {
                z = contextDto.surrogate.getFrom_cold_start();
            }
            if ((i & 2) != 0) {
                z2 = contextDto.surrogate.getRequires_local_auth();
            }
            if ((i & 4) != 0) {
                z3 = contextDto.surrogate.getSymbol();
            }
            if ((i & 8) != 0) {
                optionsDto = contextDto.surrogate.getOptions();
            }
            if ((i & 16) != 0) {
                listsContextDto = contextDto.surrogate.getLists_context();
            }
            if ((i & 32) != 0) {
                listSortDto = contextDto.surrogate.getList_sort();
            }
            if ((i & 64) != 0) {
                actionDto = contextDto.surrogate.getAction();
            }
            if ((i & 128) != 0) {
                screenLoadDto = contextDto.surrogate.getScreen_load();
            }
            if ((i & 256) != 0) {
                streamLoadDto = contextDto.surrogate.getStream_load();
            }
            if ((i & 512) != 0) {
                componentLoadDto = contextDto.surrogate.getComponent_load();
            }
            if ((i & 1024) != 0) {
                microgramLoadDto = contextDto.surrogate.getMicrogram_load();
            }
            ComponentLoadDto componentLoadDto2 = componentLoadDto;
            MicrogramLoadDto microgramLoadDto2 = microgramLoadDto;
            ScreenLoadDto screenLoadDto2 = screenLoadDto;
            StreamLoadDto streamLoadDto2 = streamLoadDto;
            ListSortDto listSortDto2 = listSortDto;
            ActionDto actionDto2 = actionDto;
            ListsContextDto listsContextDto2 = listsContextDto;
            boolean z4 = z3;
            return contextDto.copy(z, z2, z4, optionsDto, listsContextDto2, listSortDto2, actionDto2, screenLoadDto2, streamLoadDto2, componentLoadDto2, microgramLoadDto2);
        }

        public final ContextDto copy(boolean from_cold_start, boolean requires_local_auth, boolean symbol, OptionsDto options, ListsContextDto lists_context, ListSortDto list_sort, ActionDto action, ScreenLoadDto screen_load, StreamLoadDto stream_load, ComponentLoadDto component_load, MicrogramLoadDto microgram_load) {
            return new ContextDto(new Surrogate(from_cold_start, requires_local_auth, symbol, options, lists_context, list_sort, action, screen_load, stream_load, component_load, microgram_load));
        }

        @Override // com.robinhood.idl.Dto
        public PerformanceMetricEventData.Context toProto() {
            boolean from_cold_start = this.surrogate.getFrom_cold_start();
            boolean requires_local_auth = this.surrogate.getRequires_local_auth();
            boolean symbol = this.surrogate.getSymbol();
            OptionsDto options = this.surrogate.getOptions();
            PerformanceMetricEventData.Context.Options proto = options != null ? options.toProto() : null;
            ListsContextDto lists_context = this.surrogate.getLists_context();
            ListsContext proto2 = lists_context != null ? lists_context.toProto() : null;
            ListSortDto list_sort = this.surrogate.getList_sort();
            ListSort proto3 = list_sort != null ? list_sort.toProto() : null;
            ActionDto action = this.surrogate.getAction();
            PerformanceMetricEventData.Context.Action proto4 = action != null ? action.toProto() : null;
            ScreenLoadDto screen_load = this.surrogate.getScreen_load();
            PerformanceMetricEventData.Context.ScreenLoad proto5 = screen_load != null ? screen_load.toProto() : null;
            StreamLoadDto stream_load = this.surrogate.getStream_load();
            PerformanceMetricEventData.Context.StreamLoad proto6 = stream_load != null ? stream_load.toProto() : null;
            ComponentLoadDto component_load = this.surrogate.getComponent_load();
            PerformanceMetricEventData.Context.ComponentLoad proto7 = component_load != null ? component_load.toProto() : null;
            MicrogramLoadDto microgram_load = this.surrogate.getMicrogram_load();
            return new PerformanceMetricEventData.Context(from_cold_start, requires_local_auth, symbol, proto, proto2, proto3, proto4, proto5, proto6, proto7, microgram_load != null ? microgram_load.toProto() : null, null, 2048, null);
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
        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0016\u0010\u001cJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0087\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0019HÖ\u0001J\t\u0010L\u001a\u00020MHÖ\u0001J%\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0001¢\u0006\u0002\bUR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010'R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010-R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001e\u001a\u0004\b2\u00103R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001e\u001a\u0004\b8\u00109R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010<¨\u0006X"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Surrogate;", "", "from_cold_start", "", "requires_local_auth", "symbol", "options", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "lists_context", "Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "list_sort", "Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "action", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "screen_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "stream_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "component_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "microgram_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "<init>", "(ZZZLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;Lcom/robinhood/rosetta/eventlogging/ListsContextDto;Lcom/robinhood/rosetta/eventlogging/ListSortDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;Lcom/robinhood/rosetta/eventlogging/ListsContextDto;Lcom/robinhood/rosetta/eventlogging/ListSortDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFrom_cold_start$annotations", "()V", "getFrom_cold_start", "()Z", "getRequires_local_auth$annotations", "getRequires_local_auth", "getSymbol$annotations", "getSymbol", "getOptions$annotations", "getOptions", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "getLists_context$annotations", "getLists_context", "()Lcom/robinhood/rosetta/eventlogging/ListsContextDto;", "getList_sort$annotations", "getList_sort", "()Lcom/robinhood/rosetta/eventlogging/ListSortDto;", "getAction$annotations", "getAction", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "getScreen_load$annotations", "getScreen_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "getStream_load$annotations", "getStream_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "getComponent_load$annotations", "getComponent_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "getMicrogram_load$annotations", "getMicrogram_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ActionDto action;
            private final ComponentLoadDto component_load;
            private final boolean from_cold_start;
            private final ListSortDto list_sort;
            private final ListsContextDto lists_context;
            private final MicrogramLoadDto microgram_load;
            private final OptionsDto options;
            private final boolean requires_local_auth;
            private final ScreenLoadDto screen_load;
            private final StreamLoadDto stream_load;
            private final boolean symbol;

            public Surrogate() {
                this(false, false, false, (OptionsDto) null, (ListsContextDto) null, (ListSortDto) null, (ActionDto) null, (ScreenLoadDto) null, (StreamLoadDto) null, (ComponentLoadDto) null, (MicrogramLoadDto) null, 2047, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = surrogate.from_cold_start;
                }
                if ((i & 2) != 0) {
                    z2 = surrogate.requires_local_auth;
                }
                if ((i & 4) != 0) {
                    z3 = surrogate.symbol;
                }
                if ((i & 8) != 0) {
                    optionsDto = surrogate.options;
                }
                if ((i & 16) != 0) {
                    listsContextDto = surrogate.lists_context;
                }
                if ((i & 32) != 0) {
                    listSortDto = surrogate.list_sort;
                }
                if ((i & 64) != 0) {
                    actionDto = surrogate.action;
                }
                if ((i & 128) != 0) {
                    screenLoadDto = surrogate.screen_load;
                }
                if ((i & 256) != 0) {
                    streamLoadDto = surrogate.stream_load;
                }
                if ((i & 512) != 0) {
                    componentLoadDto = surrogate.component_load;
                }
                if ((i & 1024) != 0) {
                    microgramLoadDto = surrogate.microgram_load;
                }
                ComponentLoadDto componentLoadDto2 = componentLoadDto;
                MicrogramLoadDto microgramLoadDto2 = microgramLoadDto;
                ScreenLoadDto screenLoadDto2 = screenLoadDto;
                StreamLoadDto streamLoadDto2 = streamLoadDto;
                ListSortDto listSortDto2 = listSortDto;
                ActionDto actionDto2 = actionDto;
                ListsContextDto listsContextDto2 = listsContextDto;
                boolean z4 = z3;
                return surrogate.copy(z, z2, z4, optionsDto, listsContextDto2, listSortDto2, actionDto2, screenLoadDto2, streamLoadDto2, componentLoadDto2, microgramLoadDto2);
            }

            @SerialName("action")
            @JsonAnnotations2(names = {"action"})
            public static /* synthetic */ void getAction$annotations() {
            }

            @SerialName("componentLoad")
            @JsonAnnotations2(names = {"component_load"})
            public static /* synthetic */ void getComponent_load$annotations() {
            }

            @SerialName("fromColdStart")
            @JsonAnnotations2(names = {"from_cold_start"})
            public static /* synthetic */ void getFrom_cold_start$annotations() {
            }

            @SerialName("listSort")
            @JsonAnnotations2(names = {"list_sort"})
            public static /* synthetic */ void getList_sort$annotations() {
            }

            @SerialName("listsContext")
            @JsonAnnotations2(names = {"lists_context"})
            public static /* synthetic */ void getLists_context$annotations() {
            }

            @SerialName("microgramLoad")
            @JsonAnnotations2(names = {"microgram_load"})
            public static /* synthetic */ void getMicrogram_load$annotations() {
            }

            @SerialName("options")
            @JsonAnnotations2(names = {"options"})
            public static /* synthetic */ void getOptions$annotations() {
            }

            @SerialName("requiresLocalAuth")
            @JsonAnnotations2(names = {"requires_local_auth"})
            public static /* synthetic */ void getRequires_local_auth$annotations() {
            }

            @SerialName("screenLoad")
            @JsonAnnotations2(names = {"screen_load"})
            public static /* synthetic */ void getScreen_load$annotations() {
            }

            @SerialName("streamLoad")
            @JsonAnnotations2(names = {"stream_load"})
            public static /* synthetic */ void getStream_load$annotations() {
            }

            @SerialName("symbol")
            @JsonAnnotations2(names = {"symbol"})
            public static /* synthetic */ void getSymbol$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getFrom_cold_start() {
                return this.from_cold_start;
            }

            /* renamed from: component10, reason: from getter */
            public final ComponentLoadDto getComponent_load() {
                return this.component_load;
            }

            /* renamed from: component11, reason: from getter */
            public final MicrogramLoadDto getMicrogram_load() {
                return this.microgram_load;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getRequires_local_auth() {
                return this.requires_local_auth;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getSymbol() {
                return this.symbol;
            }

            /* renamed from: component4, reason: from getter */
            public final OptionsDto getOptions() {
                return this.options;
            }

            /* renamed from: component5, reason: from getter */
            public final ListsContextDto getLists_context() {
                return this.lists_context;
            }

            /* renamed from: component6, reason: from getter */
            public final ListSortDto getList_sort() {
                return this.list_sort;
            }

            /* renamed from: component7, reason: from getter */
            public final ActionDto getAction() {
                return this.action;
            }

            /* renamed from: component8, reason: from getter */
            public final ScreenLoadDto getScreen_load() {
                return this.screen_load;
            }

            /* renamed from: component9, reason: from getter */
            public final StreamLoadDto getStream_load() {
                return this.stream_load;
            }

            public final Surrogate copy(boolean from_cold_start, boolean requires_local_auth, boolean symbol, OptionsDto options, ListsContextDto lists_context, ListSortDto list_sort, ActionDto action, ScreenLoadDto screen_load, StreamLoadDto stream_load, ComponentLoadDto component_load, MicrogramLoadDto microgram_load) {
                return new Surrogate(from_cold_start, requires_local_auth, symbol, options, lists_context, list_sort, action, screen_load, stream_load, component_load, microgram_load);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.from_cold_start == surrogate.from_cold_start && this.requires_local_auth == surrogate.requires_local_auth && this.symbol == surrogate.symbol && Intrinsics.areEqual(this.options, surrogate.options) && Intrinsics.areEqual(this.lists_context, surrogate.lists_context) && Intrinsics.areEqual(this.list_sort, surrogate.list_sort) && Intrinsics.areEqual(this.action, surrogate.action) && Intrinsics.areEqual(this.screen_load, surrogate.screen_load) && Intrinsics.areEqual(this.stream_load, surrogate.stream_load) && Intrinsics.areEqual(this.component_load, surrogate.component_load) && Intrinsics.areEqual(this.microgram_load, surrogate.microgram_load);
            }

            public int hashCode() {
                int iHashCode = ((((java.lang.Boolean.hashCode(this.from_cold_start) * 31) + java.lang.Boolean.hashCode(this.requires_local_auth)) * 31) + java.lang.Boolean.hashCode(this.symbol)) * 31;
                OptionsDto optionsDto = this.options;
                int iHashCode2 = (iHashCode + (optionsDto == null ? 0 : optionsDto.hashCode())) * 31;
                ListsContextDto listsContextDto = this.lists_context;
                int iHashCode3 = (iHashCode2 + (listsContextDto == null ? 0 : listsContextDto.hashCode())) * 31;
                ListSortDto listSortDto = this.list_sort;
                int iHashCode4 = (iHashCode3 + (listSortDto == null ? 0 : listSortDto.hashCode())) * 31;
                ActionDto actionDto = this.action;
                int iHashCode5 = (iHashCode4 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
                ScreenLoadDto screenLoadDto = this.screen_load;
                int iHashCode6 = (iHashCode5 + (screenLoadDto == null ? 0 : screenLoadDto.hashCode())) * 31;
                StreamLoadDto streamLoadDto = this.stream_load;
                int iHashCode7 = (iHashCode6 + (streamLoadDto == null ? 0 : streamLoadDto.hashCode())) * 31;
                ComponentLoadDto componentLoadDto = this.component_load;
                int iHashCode8 = (iHashCode7 + (componentLoadDto == null ? 0 : componentLoadDto.hashCode())) * 31;
                MicrogramLoadDto microgramLoadDto = this.microgram_load;
                return iHashCode8 + (microgramLoadDto != null ? microgramLoadDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(from_cold_start=" + this.from_cold_start + ", requires_local_auth=" + this.requires_local_auth + ", symbol=" + this.symbol + ", options=" + this.options + ", lists_context=" + this.lists_context + ", list_sort=" + this.list_sort + ", action=" + this.action + ", screen_load=" + this.screen_load + ", stream_load=" + this.stream_load + ", component_load=" + this.component_load + ", microgram_load=" + this.microgram_load + ")";
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return PerformanceMetricEventDataDto$ContextDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.from_cold_start = false;
                } else {
                    this.from_cold_start = z;
                }
                if ((i & 2) == 0) {
                    this.requires_local_auth = false;
                } else {
                    this.requires_local_auth = z2;
                }
                if ((i & 4) == 0) {
                    this.symbol = false;
                } else {
                    this.symbol = z3;
                }
                if ((i & 8) == 0) {
                    this.options = null;
                } else {
                    this.options = optionsDto;
                }
                if ((i & 16) == 0) {
                    this.lists_context = null;
                } else {
                    this.lists_context = listsContextDto;
                }
                if ((i & 32) == 0) {
                    this.list_sort = null;
                } else {
                    this.list_sort = listSortDto;
                }
                if ((i & 64) == 0) {
                    this.action = null;
                } else {
                    this.action = actionDto;
                }
                if ((i & 128) == 0) {
                    this.screen_load = null;
                } else {
                    this.screen_load = screenLoadDto;
                }
                if ((i & 256) == 0) {
                    this.stream_load = null;
                } else {
                    this.stream_load = streamLoadDto;
                }
                if ((i & 512) == 0) {
                    this.component_load = null;
                } else {
                    this.component_load = componentLoadDto;
                }
                if ((i & 1024) == 0) {
                    this.microgram_load = null;
                } else {
                    this.microgram_load = microgramLoadDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                boolean z = self.from_cold_start;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 0, z);
                }
                boolean z2 = self.requires_local_auth;
                if (z2) {
                    output.encodeBooleanElement(serialDesc, 1, z2);
                }
                boolean z3 = self.symbol;
                if (z3) {
                    output.encodeBooleanElement(serialDesc, 2, z3);
                }
                OptionsDto optionsDto = self.options;
                if (optionsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, OptionsDto.Serializer.INSTANCE, optionsDto);
                }
                ListsContextDto listsContextDto = self.lists_context;
                if (listsContextDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, ListsContextDto.Serializer.INSTANCE, listsContextDto);
                }
                ListSortDto listSortDto = self.list_sort;
                if (listSortDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, ListSortDto.Serializer.INSTANCE, listSortDto);
                }
                ActionDto actionDto = self.action;
                if (actionDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, ActionDto.Serializer.INSTANCE, actionDto);
                }
                ScreenLoadDto screenLoadDto = self.screen_load;
                if (screenLoadDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, ScreenLoadDto.Serializer.INSTANCE, screenLoadDto);
                }
                StreamLoadDto streamLoadDto = self.stream_load;
                if (streamLoadDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, StreamLoadDto.Serializer.INSTANCE, streamLoadDto);
                }
                ComponentLoadDto componentLoadDto = self.component_load;
                if (componentLoadDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 9, ComponentLoadDto.Serializer.INSTANCE, componentLoadDto);
                }
                MicrogramLoadDto microgramLoadDto = self.microgram_load;
                if (microgramLoadDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, MicrogramLoadDto.Serializer.INSTANCE, microgramLoadDto);
                }
            }

            public Surrogate(boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto) {
                this.from_cold_start = z;
                this.requires_local_auth = z2;
                this.symbol = z3;
                this.options = optionsDto;
                this.lists_context = listsContextDto;
                this.list_sort = listSortDto;
                this.action = actionDto;
                this.screen_load = screenLoadDto;
                this.stream_load = streamLoadDto;
                this.component_load = componentLoadDto;
                this.microgram_load = microgramLoadDto;
            }

            public /* synthetic */ Surrogate(boolean z, boolean z2, boolean z3, OptionsDto optionsDto, ListsContextDto listsContextDto, ListSortDto listSortDto, ActionDto actionDto, ScreenLoadDto screenLoadDto, StreamLoadDto streamLoadDto, ComponentLoadDto componentLoadDto, MicrogramLoadDto microgramLoadDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : optionsDto, (i & 16) != 0 ? null : listsContextDto, (i & 32) != 0 ? null : listSortDto, (i & 64) != 0 ? null : actionDto, (i & 128) != 0 ? null : screenLoadDto, (i & 256) != 0 ? null : streamLoadDto, (i & 512) != 0 ? null : componentLoadDto, (i & 1024) != 0 ? null : microgramLoadDto);
            }

            public final boolean getFrom_cold_start() {
                return this.from_cold_start;
            }

            public final boolean getRequires_local_auth() {
                return this.requires_local_auth;
            }

            public final boolean getSymbol() {
                return this.symbol;
            }

            public final OptionsDto getOptions() {
                return this.options;
            }

            public final ListsContextDto getLists_context() {
                return this.lists_context;
            }

            public final ListSortDto getList_sort() {
                return this.list_sort;
            }

            public final ActionDto getAction() {
                return this.action;
            }

            public final ScreenLoadDto getScreen_load() {
                return this.screen_load;
            }

            public final StreamLoadDto getStream_load() {
                return this.stream_load;
            }

            public final ComponentLoadDto getComponent_load() {
                return this.component_load;
            }

            public final MicrogramLoadDto getMicrogram_load() {
                return this.microgram_load;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ContextDto, PerformanceMetricEventData.Context> {
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
            public ProtoAdapter<PerformanceMetricEventData.Context> getProtoAdapter() {
                return PerformanceMetricEventData.Context.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContextDto getZeroValue() {
                return ContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContextDto fromProto(PerformanceMetricEventData.Context proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                boolean from_cold_start = proto.getFrom_cold_start();
                boolean requires_local_auth = proto.getRequires_local_auth();
                boolean symbol = proto.getSymbol();
                PerformanceMetricEventData.Context.Options options = proto.getOptions();
                DefaultConstructorMarker defaultConstructorMarker = null;
                OptionsDto optionsDtoFromProto = options != null ? OptionsDto.INSTANCE.fromProto(options) : null;
                ListsContext lists_context = proto.getLists_context();
                ListsContextDto listsContextDtoFromProto = lists_context != null ? ListsContextDto.INSTANCE.fromProto(lists_context) : null;
                ListSort list_sort = proto.getList_sort();
                ListSortDto listSortDtoFromProto = list_sort != null ? ListSortDto.INSTANCE.fromProto(list_sort) : null;
                PerformanceMetricEventData.Context.Action action = proto.getAction();
                ActionDto actionDtoFromProto = action != null ? ActionDto.INSTANCE.fromProto(action) : null;
                PerformanceMetricEventData.Context.ScreenLoad screen_load = proto.getScreen_load();
                ScreenLoadDto screenLoadDtoFromProto = screen_load != null ? ScreenLoadDto.INSTANCE.fromProto(screen_load) : null;
                PerformanceMetricEventData.Context.StreamLoad stream_load = proto.getStream_load();
                StreamLoadDto streamLoadDtoFromProto = stream_load != null ? StreamLoadDto.INSTANCE.fromProto(stream_load) : null;
                PerformanceMetricEventData.Context.ComponentLoad component_load = proto.getComponent_load();
                ComponentLoadDto componentLoadDtoFromProto = component_load != null ? ComponentLoadDto.INSTANCE.fromProto(component_load) : null;
                PerformanceMetricEventData.Context.MicrogramLoad microgram_load = proto.getMicrogram_load();
                return new ContextDto(new Surrogate(from_cold_start, requires_local_auth, symbol, optionsDtoFromProto, listsContextDtoFromProto, listSortDtoFromProto, actionDtoFromProto, screenLoadDtoFromProto, streamLoadDtoFromProto, componentLoadDtoFromProto, microgram_load != null ? MicrogramLoadDto.INSTANCE.fromProto(microgram_load) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceMetricEventDataDto.ContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ContextDto(false, false, false, null, null, null, null, null, null, null, null, 2047, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0013JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u000fH\u0016J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Options;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Surrogate;)V", "option_type", "Lrosetta/option/OptionTypeDto;", "order_side", "Lrosetta/order/SideDto;", "has_contract_selections", "", "chain_id", "", "chain_symbol", "strategy", "Lrosetta/option/StrategyNameDto;", "(Lrosetta/option/OptionTypeDto;Lrosetta/order/SideDto;ZLjava/lang/String;Ljava/lang/String;Lrosetta/option/StrategyNameDto;)V", "getOption_type", "()Lrosetta/option/OptionTypeDto;", "getOrder_side", "()Lrosetta/order/SideDto;", "getHas_contract_selections", "()Z", "getChain_id", "()Ljava/lang/String;", "getChain_symbol", "getStrategy", "()Lrosetta/option/StrategyNameDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class OptionsDto implements Dto3<PerformanceMetricEventData.Context.Options>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<OptionsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<OptionsDto, PerformanceMetricEventData.Context.Options>> binaryBase64Serializer$delegate;
            private static final OptionsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ OptionsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private OptionsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final OptionTypeDto getOption_type() {
                return this.surrogate.getOption_type();
            }

            public final SideDto getOrder_side() {
                return this.surrogate.getOrder_side();
            }

            public final boolean getHas_contract_selections() {
                return this.surrogate.getHas_contract_selections();
            }

            public final String getChain_id() {
                return this.surrogate.getChain_id();
            }

            public final String getChain_symbol() {
                return this.surrogate.getChain_symbol();
            }

            public final StrategyNameDto getStrategy() {
                return this.surrogate.getStrategy();
            }

            public /* synthetic */ OptionsDto(OptionTypeDto optionTypeDto, SideDto sideDto, boolean z, String str, String str2, StrategyNameDto strategyNameDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? OptionTypeDto.INSTANCE.getZeroValue() : optionTypeDto, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? StrategyNameDto.INSTANCE.getZeroValue() : strategyNameDto);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public OptionsDto(OptionTypeDto option_type, SideDto order_side, boolean z, String chain_id, String chain_symbol, StrategyNameDto strategy) {
                this(new Surrogate(option_type, order_side, z, chain_id, chain_symbol, strategy));
                Intrinsics.checkNotNullParameter(option_type, "option_type");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(chain_id, "chain_id");
                Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
                Intrinsics.checkNotNullParameter(strategy, "strategy");
            }

            public static /* synthetic */ OptionsDto copy$default(OptionsDto optionsDto, OptionTypeDto optionTypeDto, SideDto sideDto, boolean z, String str, String str2, StrategyNameDto strategyNameDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    optionTypeDto = optionsDto.surrogate.getOption_type();
                }
                if ((i & 2) != 0) {
                    sideDto = optionsDto.surrogate.getOrder_side();
                }
                if ((i & 4) != 0) {
                    z = optionsDto.surrogate.getHas_contract_selections();
                }
                if ((i & 8) != 0) {
                    str = optionsDto.surrogate.getChain_id();
                }
                if ((i & 16) != 0) {
                    str2 = optionsDto.surrogate.getChain_symbol();
                }
                if ((i & 32) != 0) {
                    strategyNameDto = optionsDto.surrogate.getStrategy();
                }
                String str3 = str2;
                StrategyNameDto strategyNameDto2 = strategyNameDto;
                return optionsDto.copy(optionTypeDto, sideDto, z, str, str3, strategyNameDto2);
            }

            public final OptionsDto copy(OptionTypeDto option_type, SideDto order_side, boolean has_contract_selections, String chain_id, String chain_symbol, StrategyNameDto strategy) {
                Intrinsics.checkNotNullParameter(option_type, "option_type");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(chain_id, "chain_id");
                Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                return new OptionsDto(new Surrogate(option_type, order_side, has_contract_selections, chain_id, chain_symbol, strategy));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Context.Options toProto() {
                return new PerformanceMetricEventData.Context.Options((OptionType) this.surrogate.getOption_type().toProto(), (Side) this.surrogate.getOrder_side().toProto(), this.surrogate.getHas_contract_selections(), this.surrogate.getChain_id(), this.surrogate.getChain_symbol(), (StrategyName) this.surrogate.getStrategy().toProto(), null, 64, null);
            }

            public String toString() {
                return "[OptionsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof OptionsDto) && Intrinsics.areEqual(((OptionsDto) other).surrogate, this.surrogate);
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
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003JE\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0010HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010 R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010%¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Surrogate;", "", "option_type", "Lrosetta/option/OptionTypeDto;", "order_side", "Lrosetta/order/SideDto;", "has_contract_selections", "", "chain_id", "", "chain_symbol", "strategy", "Lrosetta/option/StrategyNameDto;", "<init>", "(Lrosetta/option/OptionTypeDto;Lrosetta/order/SideDto;ZLjava/lang/String;Ljava/lang/String;Lrosetta/option/StrategyNameDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILrosetta/option/OptionTypeDto;Lrosetta/order/SideDto;ZLjava/lang/String;Ljava/lang/String;Lrosetta/option/StrategyNameDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOption_type$annotations", "()V", "getOption_type", "()Lrosetta/option/OptionTypeDto;", "getOrder_side$annotations", "getOrder_side", "()Lrosetta/order/SideDto;", "getHas_contract_selections$annotations", "getHas_contract_selections", "()Z", "getChain_id$annotations", "getChain_id", "()Ljava/lang/String;", "getChain_symbol$annotations", "getChain_symbol", "getStrategy$annotations", "getStrategy", "()Lrosetta/option/StrategyNameDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String chain_id;
                private final String chain_symbol;
                private final boolean has_contract_selections;
                private final OptionTypeDto option_type;
                private final SideDto order_side;
                private final StrategyNameDto strategy;

                public Surrogate() {
                    this((OptionTypeDto) null, (SideDto) null, false, (String) null, (String) null, (StrategyNameDto) null, 63, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, OptionTypeDto optionTypeDto, SideDto sideDto, boolean z, String str, String str2, StrategyNameDto strategyNameDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        optionTypeDto = surrogate.option_type;
                    }
                    if ((i & 2) != 0) {
                        sideDto = surrogate.order_side;
                    }
                    if ((i & 4) != 0) {
                        z = surrogate.has_contract_selections;
                    }
                    if ((i & 8) != 0) {
                        str = surrogate.chain_id;
                    }
                    if ((i & 16) != 0) {
                        str2 = surrogate.chain_symbol;
                    }
                    if ((i & 32) != 0) {
                        strategyNameDto = surrogate.strategy;
                    }
                    String str3 = str2;
                    StrategyNameDto strategyNameDto2 = strategyNameDto;
                    return surrogate.copy(optionTypeDto, sideDto, z, str, str3, strategyNameDto2);
                }

                @SerialName("chainId")
                @JsonAnnotations2(names = {"chain_id"})
                public static /* synthetic */ void getChain_id$annotations() {
                }

                @SerialName("chainSymbol")
                @JsonAnnotations2(names = {"chain_symbol"})
                public static /* synthetic */ void getChain_symbol$annotations() {
                }

                @SerialName("hasContractSelections")
                @JsonAnnotations2(names = {"has_contract_selections"})
                public static /* synthetic */ void getHas_contract_selections$annotations() {
                }

                @SerialName("optionType")
                @JsonAnnotations2(names = {"option_type"})
                public static /* synthetic */ void getOption_type$annotations() {
                }

                @SerialName("orderSide")
                @JsonAnnotations2(names = {"order_side"})
                public static /* synthetic */ void getOrder_side$annotations() {
                }

                @SerialName("strategy")
                @JsonAnnotations2(names = {"strategy"})
                public static /* synthetic */ void getStrategy$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final OptionTypeDto getOption_type() {
                    return this.option_type;
                }

                /* renamed from: component2, reason: from getter */
                public final SideDto getOrder_side() {
                    return this.order_side;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getHas_contract_selections() {
                    return this.has_contract_selections;
                }

                /* renamed from: component4, reason: from getter */
                public final String getChain_id() {
                    return this.chain_id;
                }

                /* renamed from: component5, reason: from getter */
                public final String getChain_symbol() {
                    return this.chain_symbol;
                }

                /* renamed from: component6, reason: from getter */
                public final StrategyNameDto getStrategy() {
                    return this.strategy;
                }

                public final Surrogate copy(OptionTypeDto option_type, SideDto order_side, boolean has_contract_selections, String chain_id, String chain_symbol, StrategyNameDto strategy) {
                    Intrinsics.checkNotNullParameter(option_type, "option_type");
                    Intrinsics.checkNotNullParameter(order_side, "order_side");
                    Intrinsics.checkNotNullParameter(chain_id, "chain_id");
                    Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
                    Intrinsics.checkNotNullParameter(strategy, "strategy");
                    return new Surrogate(option_type, order_side, has_contract_selections, chain_id, chain_symbol, strategy);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return this.option_type == surrogate.option_type && this.order_side == surrogate.order_side && this.has_contract_selections == surrogate.has_contract_selections && Intrinsics.areEqual(this.chain_id, surrogate.chain_id) && Intrinsics.areEqual(this.chain_symbol, surrogate.chain_symbol) && this.strategy == surrogate.strategy;
                }

                public int hashCode() {
                    return (((((((((this.option_type.hashCode() * 31) + this.order_side.hashCode()) * 31) + java.lang.Boolean.hashCode(this.has_contract_selections)) * 31) + this.chain_id.hashCode()) * 31) + this.chain_symbol.hashCode()) * 31) + this.strategy.hashCode();
                }

                public String toString() {
                    return "Surrogate(option_type=" + this.option_type + ", order_side=" + this.order_side + ", has_contract_selections=" + this.has_contract_selections + ", chain_id=" + this.chain_id + ", chain_symbol=" + this.chain_symbol + ", strategy=" + this.strategy + ")";
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36886x112103f2.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, OptionTypeDto optionTypeDto, SideDto sideDto, boolean z, String str, String str2, StrategyNameDto strategyNameDto, SerializationConstructorMarker serializationConstructorMarker) {
                    this.option_type = (i & 1) == 0 ? OptionTypeDto.INSTANCE.getZeroValue() : optionTypeDto;
                    if ((i & 2) == 0) {
                        this.order_side = SideDto.INSTANCE.getZeroValue();
                    } else {
                        this.order_side = sideDto;
                    }
                    if ((i & 4) == 0) {
                        this.has_contract_selections = false;
                    } else {
                        this.has_contract_selections = z;
                    }
                    if ((i & 8) == 0) {
                        this.chain_id = "";
                    } else {
                        this.chain_id = str;
                    }
                    if ((i & 16) == 0) {
                        this.chain_symbol = "";
                    } else {
                        this.chain_symbol = str2;
                    }
                    if ((i & 32) == 0) {
                        this.strategy = StrategyNameDto.INSTANCE.getZeroValue();
                    } else {
                        this.strategy = strategyNameDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (self.option_type != OptionTypeDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 0, OptionTypeDto.Serializer.INSTANCE, self.option_type);
                    }
                    if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.order_side);
                    }
                    boolean z = self.has_contract_selections;
                    if (z) {
                        output.encodeBooleanElement(serialDesc, 2, z);
                    }
                    if (!Intrinsics.areEqual(self.chain_id, "")) {
                        output.encodeStringElement(serialDesc, 3, self.chain_id);
                    }
                    if (!Intrinsics.areEqual(self.chain_symbol, "")) {
                        output.encodeStringElement(serialDesc, 4, self.chain_symbol);
                    }
                    if (self.strategy != StrategyNameDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 5, StrategyNameDto.Serializer.INSTANCE, self.strategy);
                    }
                }

                public Surrogate(OptionTypeDto option_type, SideDto order_side, boolean z, String chain_id, String chain_symbol, StrategyNameDto strategy) {
                    Intrinsics.checkNotNullParameter(option_type, "option_type");
                    Intrinsics.checkNotNullParameter(order_side, "order_side");
                    Intrinsics.checkNotNullParameter(chain_id, "chain_id");
                    Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
                    Intrinsics.checkNotNullParameter(strategy, "strategy");
                    this.option_type = option_type;
                    this.order_side = order_side;
                    this.has_contract_selections = z;
                    this.chain_id = chain_id;
                    this.chain_symbol = chain_symbol;
                    this.strategy = strategy;
                }

                public final OptionTypeDto getOption_type() {
                    return this.option_type;
                }

                public /* synthetic */ Surrogate(OptionTypeDto optionTypeDto, SideDto sideDto, boolean z, String str, String str2, StrategyNameDto strategyNameDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? OptionTypeDto.INSTANCE.getZeroValue() : optionTypeDto, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? StrategyNameDto.INSTANCE.getZeroValue() : strategyNameDto);
                }

                public final SideDto getOrder_side() {
                    return this.order_side;
                }

                public final boolean getHas_contract_selections() {
                    return this.has_contract_selections;
                }

                public final String getChain_id() {
                    return this.chain_id;
                }

                public final String getChain_symbol() {
                    return this.chain_symbol;
                }

                public final StrategyNameDto getStrategy() {
                    return this.strategy;
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Options;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<OptionsDto, PerformanceMetricEventData.Context.Options> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<OptionsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OptionsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<OptionsDto> getBinaryBase64Serializer() {
                    return (KSerializer) OptionsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PerformanceMetricEventData.Context.Options> getProtoAdapter() {
                    return PerformanceMetricEventData.Context.Options.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OptionsDto getZeroValue() {
                    return OptionsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public OptionsDto fromProto(PerformanceMetricEventData.Context.Options proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new OptionsDto(new Surrogate(OptionTypeDto.INSTANCE.fromProto(proto.getOption_type()), SideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getHas_contract_selections(), proto.getChain_id(), proto.getChain_symbol(), StrategyNameDto.INSTANCE.fromProto(proto.getStrategy())), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$OptionsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceMetricEventDataDto.ContextDto.OptionsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new OptionsDto(null, null, false, null, null, null, 63, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<OptionsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.Options", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, OptionsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public OptionsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new OptionsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$OptionsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$OptionsDto";
                }
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001d\u001e\u001f B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Action;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Surrogate;)V", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;)V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ActionDto implements Dto3<PerformanceMetricEventData.Context.Action>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ActionDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ActionDto, PerformanceMetricEventData.Context.Action>> binaryBase64Serializer$delegate;
            private static final ActionDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ActionDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final UserInteractionEventDataDto getEvent() {
                return this.surrogate.getEvent();
            }

            public ActionDto(UserInteractionEventDataDto userInteractionEventDataDto) {
                this(new Surrogate(userInteractionEventDataDto));
            }

            public /* synthetic */ ActionDto(UserInteractionEventDataDto userInteractionEventDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : userInteractionEventDataDto);
            }

            public static /* synthetic */ ActionDto copy$default(ActionDto actionDto, UserInteractionEventDataDto userInteractionEventDataDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    userInteractionEventDataDto = actionDto.surrogate.getEvent();
                }
                return actionDto.copy(userInteractionEventDataDto);
            }

            public final ActionDto copy(UserInteractionEventDataDto event) {
                return new ActionDto(new Surrogate(event));
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Context.Action toProto() {
                UserInteractionEventDataDto event = this.surrogate.getEvent();
                return new PerformanceMetricEventData.Context.Action(event != null ? event.toProto() : null, null, 2, null);
            }

            public String toString() {
                return "[ActionDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ActionDto) && Intrinsics.areEqual(((ActionDto) other).surrogate, this.surrogate);
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
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Surrogate;", "", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent$annotations", "()V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final UserInteractionEventDataDto event;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((UserInteractionEventDataDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UserInteractionEventDataDto userInteractionEventDataDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        userInteractionEventDataDto = surrogate.event;
                    }
                    return surrogate.copy(userInteractionEventDataDto);
                }

                @SerialName("event")
                @JsonAnnotations2(names = {"event"})
                public static /* synthetic */ void getEvent$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final UserInteractionEventDataDto getEvent() {
                    return this.event;
                }

                public final Surrogate copy(UserInteractionEventDataDto event) {
                    return new Surrogate(event);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.event, ((Surrogate) other).event);
                }

                public int hashCode() {
                    UserInteractionEventDataDto userInteractionEventDataDto = this.event;
                    if (userInteractionEventDataDto == null) {
                        return 0;
                    }
                    return userInteractionEventDataDto.hashCode();
                }

                public String toString() {
                    return "Surrogate(event=" + this.event + ")";
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36879x897efba4.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, UserInteractionEventDataDto userInteractionEventDataDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.event = null;
                    } else {
                        this.event = userInteractionEventDataDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    UserInteractionEventDataDto userInteractionEventDataDto = self.event;
                    if (userInteractionEventDataDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, UserInteractionEventDataDto.Serializer.INSTANCE, userInteractionEventDataDto);
                    }
                }

                public Surrogate(UserInteractionEventDataDto userInteractionEventDataDto) {
                    this.event = userInteractionEventDataDto;
                }

                public /* synthetic */ Surrogate(UserInteractionEventDataDto userInteractionEventDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : userInteractionEventDataDto);
                }

                public final UserInteractionEventDataDto getEvent() {
                    return this.event;
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Action;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<ActionDto, PerformanceMetricEventData.Context.Action> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ActionDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ActionDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ActionDto> getBinaryBase64Serializer() {
                    return (KSerializer) ActionDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PerformanceMetricEventData.Context.Action> getProtoAdapter() {
                    return PerformanceMetricEventData.Context.Action.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ActionDto getZeroValue() {
                    return ActionDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ActionDto fromProto(PerformanceMetricEventData.Context.Action proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    UserInteractionEventData event = proto.getEvent();
                    return new ActionDto(new Surrogate(event != null ? UserInteractionEventDataDto.INSTANCE.fromProto(event) : null), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$ActionDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceMetricEventDataDto.ContextDto.ActionDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<ActionDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.Action", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ActionDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ActionDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$ActionDto";
                }
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ScreenLoad;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Surrogate;)V", "screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "context", "Lcom/robinhood/rosetta/eventlogging/ContextDto;", "(Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcom/robinhood/rosetta/eventlogging/ContextDto;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ContextDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ScreenLoadDto implements Dto3<PerformanceMetricEventData.Context.ScreenLoad>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ScreenLoadDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ScreenLoadDto, PerformanceMetricEventData.Context.ScreenLoad>> binaryBase64Serializer$delegate;
            private static final ScreenLoadDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ScreenLoadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ScreenLoadDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final ScreenDto getScreen() {
                return this.surrogate.getScreen();
            }

            public final com.robinhood.rosetta.eventlogging.ContextDto getContext() {
                return this.surrogate.getContext();
            }

            public ScreenLoadDto(ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto) {
                this(new Surrogate(screenDto, contextDto));
            }

            public /* synthetic */ ScreenLoadDto(ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : screenDto, (i & 2) != 0 ? null : contextDto);
            }

            public static /* synthetic */ ScreenLoadDto copy$default(ScreenLoadDto screenLoadDto, ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    screenDto = screenLoadDto.surrogate.getScreen();
                }
                if ((i & 2) != 0) {
                    contextDto = screenLoadDto.surrogate.getContext();
                }
                return screenLoadDto.copy(screenDto, contextDto);
            }

            public final ScreenLoadDto copy(ScreenDto screen, com.robinhood.rosetta.eventlogging.ContextDto context) {
                return new ScreenLoadDto(new Surrogate(screen, context));
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Context.ScreenLoad toProto() {
                ScreenDto screen = this.surrogate.getScreen();
                Screen proto = screen != null ? screen.toProto() : null;
                com.robinhood.rosetta.eventlogging.ContextDto context = this.surrogate.getContext();
                return new PerformanceMetricEventData.Context.ScreenLoad(proto, context != null ? context.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[ScreenLoadDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ScreenLoadDto) && Intrinsics.areEqual(((ScreenLoadDto) other).surrogate, this.surrogate);
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
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Surrogate;", "", "screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "context", "Lcom/robinhood/rosetta/eventlogging/ContextDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcom/robinhood/rosetta/eventlogging/ContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ScreenDto;Lcom/robinhood/rosetta/eventlogging/ContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getScreen$annotations", "()V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getContext$annotations", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ContextDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final com.robinhood.rosetta.eventlogging.ContextDto context;
                private final ScreenDto screen;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((ScreenDto) null, (com.robinhood.rosetta.eventlogging.ContextDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        screenDto = surrogate.screen;
                    }
                    if ((i & 2) != 0) {
                        contextDto = surrogate.context;
                    }
                    return surrogate.copy(screenDto, contextDto);
                }

                @SerialName("context")
                @JsonAnnotations2(names = {"context"})
                public static /* synthetic */ void getContext$annotations() {
                }

                @SerialName("screen")
                @JsonAnnotations2(names = {"screen"})
                public static /* synthetic */ void getScreen$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final ScreenDto getScreen() {
                    return this.screen;
                }

                /* renamed from: component2, reason: from getter */
                public final com.robinhood.rosetta.eventlogging.ContextDto getContext() {
                    return this.context;
                }

                public final Surrogate copy(ScreenDto screen, com.robinhood.rosetta.eventlogging.ContextDto context) {
                    return new Surrogate(screen, context);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.screen, surrogate.screen) && Intrinsics.areEqual(this.context, surrogate.context);
                }

                public int hashCode() {
                    ScreenDto screenDto = this.screen;
                    int iHashCode = (screenDto == null ? 0 : screenDto.hashCode()) * 31;
                    com.robinhood.rosetta.eventlogging.ContextDto contextDto = this.context;
                    return iHashCode + (contextDto != null ? contextDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(screen=" + this.screen + ", context=" + this.context + ")";
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36888xbcddef68.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.screen = null;
                    } else {
                        this.screen = screenDto;
                    }
                    if ((i & 2) == 0) {
                        this.context = null;
                    } else {
                        this.context = contextDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    ScreenDto screenDto = self.screen;
                    if (screenDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, ScreenDto.Serializer.INSTANCE, screenDto);
                    }
                    com.robinhood.rosetta.eventlogging.ContextDto contextDto = self.context;
                    if (contextDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, ContextDto.Serializer.INSTANCE, contextDto);
                    }
                }

                public Surrogate(ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto) {
                    this.screen = screenDto;
                    this.context = contextDto;
                }

                public /* synthetic */ Surrogate(ScreenDto screenDto, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : screenDto, (i & 2) != 0 ? null : contextDto);
                }

                public final ScreenDto getScreen() {
                    return this.screen;
                }

                public final com.robinhood.rosetta.eventlogging.ContextDto getContext() {
                    return this.context;
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ScreenLoad;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<ScreenLoadDto, PerformanceMetricEventData.Context.ScreenLoad> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ScreenLoadDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ScreenLoadDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ScreenLoadDto> getBinaryBase64Serializer() {
                    return (KSerializer) ScreenLoadDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PerformanceMetricEventData.Context.ScreenLoad> getProtoAdapter() {
                    return PerformanceMetricEventData.Context.ScreenLoad.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ScreenLoadDto getZeroValue() {
                    return ScreenLoadDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ScreenLoadDto fromProto(PerformanceMetricEventData.Context.ScreenLoad proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    Screen screen = proto.getScreen();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    ScreenDto screenDtoFromProto = screen != null ? ScreenDto.INSTANCE.fromProto(screen) : null;
                    Context context = proto.getContext();
                    return new ScreenLoadDto(new Surrogate(screenDtoFromProto, context != null ? com.robinhood.rosetta.eventlogging.ContextDto.INSTANCE.fromProto(context) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceMetricEventDataDto.ContextDto.ScreenLoadDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ScreenLoadDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<ScreenLoadDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.ScreenLoad", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ScreenLoadDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ScreenLoadDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ScreenLoadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$ScreenLoadDto";
                }
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$StreamLoad;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Surrogate;)V", "name", "", "context", "Lcom/robinhood/rosetta/eventlogging/ContextDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ContextDto;)V", "getName", "()Ljava/lang/String;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ContextDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class StreamLoadDto implements Dto3<PerformanceMetricEventData.Context.StreamLoad>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<StreamLoadDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<StreamLoadDto, PerformanceMetricEventData.Context.StreamLoad>> binaryBase64Serializer$delegate;
            private static final StreamLoadDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ StreamLoadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private StreamLoadDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getName() {
                return this.surrogate.getName();
            }

            public final com.robinhood.rosetta.eventlogging.ContextDto getContext() {
                return this.surrogate.getContext();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public StreamLoadDto(String name, com.robinhood.rosetta.eventlogging.ContextDto contextDto) {
                this(new Surrogate(name, contextDto));
                Intrinsics.checkNotNullParameter(name, "name");
            }

            public /* synthetic */ StreamLoadDto(String str, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : contextDto);
            }

            public static /* synthetic */ StreamLoadDto copy$default(StreamLoadDto streamLoadDto, String str, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = streamLoadDto.surrogate.getName();
                }
                if ((i & 2) != 0) {
                    contextDto = streamLoadDto.surrogate.getContext();
                }
                return streamLoadDto.copy(str, contextDto);
            }

            public final StreamLoadDto copy(String name, com.robinhood.rosetta.eventlogging.ContextDto context) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new StreamLoadDto(new Surrogate(name, context));
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Context.StreamLoad toProto() {
                String name = this.surrogate.getName();
                com.robinhood.rosetta.eventlogging.ContextDto context = this.surrogate.getContext();
                return new PerformanceMetricEventData.Context.StreamLoad(name, context != null ? context.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[StreamLoadDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof StreamLoadDto) && Intrinsics.areEqual(((StreamLoadDto) other).surrogate, this.surrogate);
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
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Surrogate;", "", "name", "", "context", "Lcom/robinhood/rosetta/eventlogging/ContextDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getContext$annotations", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ContextDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final com.robinhood.rosetta.eventlogging.ContextDto context;
                private final String name;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((String) null, (com.robinhood.rosetta.eventlogging.ContextDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = surrogate.name;
                    }
                    if ((i & 2) != 0) {
                        contextDto = surrogate.context;
                    }
                    return surrogate.copy(str, contextDto);
                }

                @SerialName("context")
                @JsonAnnotations2(names = {"context"})
                public static /* synthetic */ void getContext$annotations() {
                }

                @SerialName("name")
                @JsonAnnotations2(names = {"name"})
                public static /* synthetic */ void getName$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component2, reason: from getter */
                public final com.robinhood.rosetta.eventlogging.ContextDto getContext() {
                    return this.context;
                }

                public final Surrogate copy(String name, com.robinhood.rosetta.eventlogging.ContextDto context) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    return new Surrogate(name, context);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.context, surrogate.context);
                }

                public int hashCode() {
                    int iHashCode = this.name.hashCode() * 31;
                    com.robinhood.rosetta.eventlogging.ContextDto contextDto = this.context;
                    return iHashCode + (contextDto == null ? 0 : contextDto.hashCode());
                }

                public String toString() {
                    return "Surrogate(name=" + this.name + ", context=" + this.context + ")";
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36890x77aa28d4.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, com.robinhood.rosetta.eventlogging.ContextDto contextDto, SerializationConstructorMarker serializationConstructorMarker) {
                    this.name = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.context = null;
                    } else {
                        this.context = contextDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.name, "")) {
                        output.encodeStringElement(serialDesc, 0, self.name);
                    }
                    com.robinhood.rosetta.eventlogging.ContextDto contextDto = self.context;
                    if (contextDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, ContextDto.Serializer.INSTANCE, contextDto);
                    }
                }

                public Surrogate(String name, com.robinhood.rosetta.eventlogging.ContextDto contextDto) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    this.name = name;
                    this.context = contextDto;
                }

                public final String getName() {
                    return this.name;
                }

                public /* synthetic */ Surrogate(String str, com.robinhood.rosetta.eventlogging.ContextDto contextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : contextDto);
                }

                public final com.robinhood.rosetta.eventlogging.ContextDto getContext() {
                    return this.context;
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$StreamLoad;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<StreamLoadDto, PerformanceMetricEventData.Context.StreamLoad> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<StreamLoadDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StreamLoadDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StreamLoadDto> getBinaryBase64Serializer() {
                    return (KSerializer) StreamLoadDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PerformanceMetricEventData.Context.StreamLoad> getProtoAdapter() {
                    return PerformanceMetricEventData.Context.StreamLoad.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StreamLoadDto getZeroValue() {
                    return StreamLoadDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StreamLoadDto fromProto(PerformanceMetricEventData.Context.StreamLoad proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String name = proto.getName();
                    Context context = proto.getContext();
                    return new StreamLoadDto(new Surrogate(name, context != null ? com.robinhood.rosetta.eventlogging.ContextDto.INSTANCE.fromProto(context) : null), (DefaultConstructorMarker) null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceMetricEventDataDto.ContextDto.StreamLoadDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new StreamLoadDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<StreamLoadDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.StreamLoad", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, StreamLoadDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public StreamLoadDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new StreamLoadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$StreamLoadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$StreamLoadDto";
                }
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001d\u001e\u001f B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ComponentLoad;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Surrogate;)V", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;)V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ComponentLoadDto implements Dto3<PerformanceMetricEventData.Context.ComponentLoad>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ComponentLoadDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ComponentLoadDto, PerformanceMetricEventData.Context.ComponentLoad>> binaryBase64Serializer$delegate;
            private static final ComponentLoadDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ComponentLoadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ComponentLoadDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final UserInteractionEventDataDto getEvent() {
                return this.surrogate.getEvent();
            }

            public ComponentLoadDto(UserInteractionEventDataDto userInteractionEventDataDto) {
                this(new Surrogate(userInteractionEventDataDto));
            }

            public /* synthetic */ ComponentLoadDto(UserInteractionEventDataDto userInteractionEventDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : userInteractionEventDataDto);
            }

            public static /* synthetic */ ComponentLoadDto copy$default(ComponentLoadDto componentLoadDto, UserInteractionEventDataDto userInteractionEventDataDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    userInteractionEventDataDto = componentLoadDto.surrogate.getEvent();
                }
                return componentLoadDto.copy(userInteractionEventDataDto);
            }

            public final ComponentLoadDto copy(UserInteractionEventDataDto event) {
                return new ComponentLoadDto(new Surrogate(event));
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Context.ComponentLoad toProto() {
                UserInteractionEventDataDto event = this.surrogate.getEvent();
                return new PerformanceMetricEventData.Context.ComponentLoad(event != null ? event.toProto() : null, null, 2, null);
            }

            public String toString() {
                return "[ComponentLoadDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ComponentLoadDto) && Intrinsics.areEqual(((ComponentLoadDto) other).surrogate, this.surrogate);
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
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Surrogate;", "", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent$annotations", "()V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final UserInteractionEventDataDto event;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((UserInteractionEventDataDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UserInteractionEventDataDto userInteractionEventDataDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        userInteractionEventDataDto = surrogate.event;
                    }
                    return surrogate.copy(userInteractionEventDataDto);
                }

                @SerialName("event")
                @JsonAnnotations2(names = {"event"})
                public static /* synthetic */ void getEvent$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final UserInteractionEventDataDto getEvent() {
                    return this.event;
                }

                public final Surrogate copy(UserInteractionEventDataDto event) {
                    return new Surrogate(event);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.event, ((Surrogate) other).event);
                }

                public int hashCode() {
                    UserInteractionEventDataDto userInteractionEventDataDto = this.event;
                    if (userInteractionEventDataDto == null) {
                        return 0;
                    }
                    return userInteractionEventDataDto.hashCode();
                }

                public String toString() {
                    return "Surrogate(event=" + this.event + ")";
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36881x8fbf8a6d.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, UserInteractionEventDataDto userInteractionEventDataDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.event = null;
                    } else {
                        this.event = userInteractionEventDataDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    UserInteractionEventDataDto userInteractionEventDataDto = self.event;
                    if (userInteractionEventDataDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, UserInteractionEventDataDto.Serializer.INSTANCE, userInteractionEventDataDto);
                    }
                }

                public Surrogate(UserInteractionEventDataDto userInteractionEventDataDto) {
                    this.event = userInteractionEventDataDto;
                }

                public /* synthetic */ Surrogate(UserInteractionEventDataDto userInteractionEventDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : userInteractionEventDataDto);
                }

                public final UserInteractionEventDataDto getEvent() {
                    return this.event;
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ComponentLoad;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<ComponentLoadDto, PerformanceMetricEventData.Context.ComponentLoad> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ComponentLoadDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ComponentLoadDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ComponentLoadDto> getBinaryBase64Serializer() {
                    return (KSerializer) ComponentLoadDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PerformanceMetricEventData.Context.ComponentLoad> getProtoAdapter() {
                    return PerformanceMetricEventData.Context.ComponentLoad.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ComponentLoadDto getZeroValue() {
                    return ComponentLoadDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ComponentLoadDto fromProto(PerformanceMetricEventData.Context.ComponentLoad proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    UserInteractionEventData event = proto.getEvent();
                    return new ComponentLoadDto(new Surrogate(event != null ? UserInteractionEventDataDto.INSTANCE.fromProto(event) : null), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceMetricEventDataDto.ContextDto.ComponentLoadDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ComponentLoadDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<ComponentLoadDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.ComponentLoad", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ComponentLoadDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ComponentLoadDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ComponentLoadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$ComponentLoadDto";
                }
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Surrogate;)V", "app_id", "", "microgram_app_version", "load_source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;)V", "getApp_id", "()Ljava/lang/String;", "getMicrogram_app_version", "getLoad_source", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "LoadSourceDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class MicrogramLoadDto implements Dto3<PerformanceMetricEventData.Context.MicrogramLoad>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<MicrogramLoadDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<MicrogramLoadDto, PerformanceMetricEventData.Context.MicrogramLoad>> binaryBase64Serializer$delegate;
            private static final MicrogramLoadDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ MicrogramLoadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private MicrogramLoadDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getApp_id() {
                return this.surrogate.getApp_id();
            }

            public final String getMicrogram_app_version() {
                return this.surrogate.getMicrogram_app_version();
            }

            public final LoadSourceDto getLoad_source() {
                return this.surrogate.getLoad_source();
            }

            public /* synthetic */ MicrogramLoadDto(String str, String str2, LoadSourceDto loadSourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? LoadSourceDto.INSTANCE.getZeroValue() : loadSourceDto);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public MicrogramLoadDto(String app_id, String microgram_app_version, LoadSourceDto load_source) {
                this(new Surrogate(app_id, microgram_app_version, load_source));
                Intrinsics.checkNotNullParameter(app_id, "app_id");
                Intrinsics.checkNotNullParameter(microgram_app_version, "microgram_app_version");
                Intrinsics.checkNotNullParameter(load_source, "load_source");
            }

            public static /* synthetic */ MicrogramLoadDto copy$default(MicrogramLoadDto microgramLoadDto, String str, String str2, LoadSourceDto loadSourceDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = microgramLoadDto.surrogate.getApp_id();
                }
                if ((i & 2) != 0) {
                    str2 = microgramLoadDto.surrogate.getMicrogram_app_version();
                }
                if ((i & 4) != 0) {
                    loadSourceDto = microgramLoadDto.surrogate.getLoad_source();
                }
                return microgramLoadDto.copy(str, str2, loadSourceDto);
            }

            public final MicrogramLoadDto copy(String app_id, String microgram_app_version, LoadSourceDto load_source) {
                Intrinsics.checkNotNullParameter(app_id, "app_id");
                Intrinsics.checkNotNullParameter(microgram_app_version, "microgram_app_version");
                Intrinsics.checkNotNullParameter(load_source, "load_source");
                return new MicrogramLoadDto(new Surrogate(app_id, microgram_app_version, load_source));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Context.MicrogramLoad toProto() {
                return new PerformanceMetricEventData.Context.MicrogramLoad(this.surrogate.getApp_id(), this.surrogate.getMicrogram_app_version(), (PerformanceMetricEventData.Context.MicrogramLoad.LoadSource) this.surrogate.getLoad_source().toProto(), null, 8, null);
            }

            public String toString() {
                return "[MicrogramLoadDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof MicrogramLoadDto) && Intrinsics.areEqual(((MicrogramLoadDto) other).surrogate, this.surrogate);
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
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Surrogate;", "", "app_id", "", "microgram_app_version", "load_source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApp_id$annotations", "()V", "getApp_id", "()Ljava/lang/String;", "getMicrogram_app_version$annotations", "getMicrogram_app_version", "getLoad_source$annotations", "getLoad_source", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String app_id;
                private final LoadSourceDto load_source;
                private final String microgram_app_version;

                public Surrogate() {
                    this((String) null, (String) null, (LoadSourceDto) null, 7, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, LoadSourceDto loadSourceDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = surrogate.app_id;
                    }
                    if ((i & 2) != 0) {
                        str2 = surrogate.microgram_app_version;
                    }
                    if ((i & 4) != 0) {
                        loadSourceDto = surrogate.load_source;
                    }
                    return surrogate.copy(str, str2, loadSourceDto);
                }

                @SerialName("appId")
                @JsonAnnotations2(names = {"app_id"})
                public static /* synthetic */ void getApp_id$annotations() {
                }

                @SerialName("loadSource")
                @JsonAnnotations2(names = {"load_source"})
                public static /* synthetic */ void getLoad_source$annotations() {
                }

                @SerialName("microgramAppVersion")
                @JsonAnnotations2(names = {"microgram_app_version"})
                public static /* synthetic */ void getMicrogram_app_version$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final String getApp_id() {
                    return this.app_id;
                }

                /* renamed from: component2, reason: from getter */
                public final String getMicrogram_app_version() {
                    return this.microgram_app_version;
                }

                /* renamed from: component3, reason: from getter */
                public final LoadSourceDto getLoad_source() {
                    return this.load_source;
                }

                public final Surrogate copy(String app_id, String microgram_app_version, LoadSourceDto load_source) {
                    Intrinsics.checkNotNullParameter(app_id, "app_id");
                    Intrinsics.checkNotNullParameter(microgram_app_version, "microgram_app_version");
                    Intrinsics.checkNotNullParameter(load_source, "load_source");
                    return new Surrogate(app_id, microgram_app_version, load_source);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.app_id, surrogate.app_id) && Intrinsics.areEqual(this.microgram_app_version, surrogate.microgram_app_version) && this.load_source == surrogate.load_source;
                }

                public int hashCode() {
                    return (((this.app_id.hashCode() * 31) + this.microgram_app_version.hashCode()) * 31) + this.load_source.hashCode();
                }

                public String toString() {
                    return "Surrogate(app_id=" + this.app_id + ", microgram_app_version=" + this.microgram_app_version + ", load_source=" + this.load_source + ")";
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36884x8f463d0f.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, String str2, LoadSourceDto loadSourceDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.app_id = "";
                    } else {
                        this.app_id = str;
                    }
                    if ((i & 2) == 0) {
                        this.microgram_app_version = "";
                    } else {
                        this.microgram_app_version = str2;
                    }
                    if ((i & 4) == 0) {
                        this.load_source = LoadSourceDto.INSTANCE.getZeroValue();
                    } else {
                        this.load_source = loadSourceDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.app_id, "")) {
                        output.encodeStringElement(serialDesc, 0, self.app_id);
                    }
                    if (!Intrinsics.areEqual(self.microgram_app_version, "")) {
                        output.encodeStringElement(serialDesc, 1, self.microgram_app_version);
                    }
                    if (self.load_source != LoadSourceDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 2, LoadSourceDto.Serializer.INSTANCE, self.load_source);
                    }
                }

                public Surrogate(String app_id, String microgram_app_version, LoadSourceDto load_source) {
                    Intrinsics.checkNotNullParameter(app_id, "app_id");
                    Intrinsics.checkNotNullParameter(microgram_app_version, "microgram_app_version");
                    Intrinsics.checkNotNullParameter(load_source, "load_source");
                    this.app_id = app_id;
                    this.microgram_app_version = microgram_app_version;
                    this.load_source = load_source;
                }

                public /* synthetic */ Surrogate(String str, String str2, LoadSourceDto loadSourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? LoadSourceDto.INSTANCE.getZeroValue() : loadSourceDto);
                }

                public final String getApp_id() {
                    return this.app_id;
                }

                public final String getMicrogram_app_version() {
                    return this.microgram_app_version;
                }

                public final LoadSourceDto getLoad_source() {
                    return this.load_source;
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<MicrogramLoadDto, PerformanceMetricEventData.Context.MicrogramLoad> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<MicrogramLoadDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<MicrogramLoadDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<MicrogramLoadDto> getBinaryBase64Serializer() {
                    return (KSerializer) MicrogramLoadDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<PerformanceMetricEventData.Context.MicrogramLoad> getProtoAdapter() {
                    return PerformanceMetricEventData.Context.MicrogramLoad.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public MicrogramLoadDto getZeroValue() {
                    return MicrogramLoadDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public MicrogramLoadDto fromProto(PerformanceMetricEventData.Context.MicrogramLoad proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new MicrogramLoadDto(new Surrogate(proto.getApp_id(), proto.getMicrogram_app_version(), LoadSourceDto.INSTANCE.fromProto(proto.getLoad_source())), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceMetricEventDataDto.ContextDto.MicrogramLoadDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new MicrogramLoadDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LOAD_SOURCE_UNSPECIFIED", "REMOTE", "CACHED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class LoadSourceDto implements Dto2<PerformanceMetricEventData.Context.MicrogramLoad.LoadSource>, Parcelable {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ LoadSourceDto[] $VALUES;

                @JvmField
                public static final Parcelable.Creator<LoadSourceDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<LoadSourceDto, PerformanceMetricEventData.Context.MicrogramLoad.LoadSource>> binaryBase64Serializer$delegate;
                public static final LoadSourceDto LOAD_SOURCE_UNSPECIFIED = new LOAD_SOURCE_UNSPECIFIED("LOAD_SOURCE_UNSPECIFIED", 0);
                public static final LoadSourceDto REMOTE = new REMOTE("REMOTE", 1);
                public static final LoadSourceDto CACHED = new CACHED("CACHED", 2);

                private static final /* synthetic */ LoadSourceDto[] $values() {
                    return new LoadSourceDto[]{LOAD_SOURCE_UNSPECIFIED, REMOTE, CACHED};
                }

                public /* synthetic */ LoadSourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i);
                }

                public static EnumEntries<LoadSourceDto> getEntries() {
                    return $ENTRIES;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private LoadSourceDto(String str, int i) {
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.ContextDto.MicrogramLoadDto.LoadSourceDto.LOAD_SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class LOAD_SOURCE_UNSPECIFIED extends LoadSourceDto {
                    LOAD_SOURCE_UNSPECIFIED(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public PerformanceMetricEventData.Context.MicrogramLoad.LoadSource toProto() {
                        return PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.LOAD_SOURCE_UNSPECIFIED;
                    }
                }

                static {
                    LoadSourceDto[] loadSourceDtoArr$values = $values();
                    $VALUES = loadSourceDtoArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(loadSourceDtoArr$values);
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerformanceMetricEventDataDto.ContextDto.MicrogramLoadDto.LoadSourceDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.ContextDto.MicrogramLoadDto.LoadSourceDto.REMOTE", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class REMOTE extends LoadSourceDto {
                    REMOTE(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public PerformanceMetricEventData.Context.MicrogramLoad.LoadSource toProto() {
                        return PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.REMOTE;
                    }
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.ContextDto.MicrogramLoadDto.LoadSourceDto.CACHED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                static final class CACHED extends LoadSourceDto {
                    CACHED(String str, int i) {
                        super(str, i, null);
                    }

                    @Override // com.robinhood.idl.Dto
                    public PerformanceMetricEventData.Context.MicrogramLoad.LoadSource toProto() {
                        return PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.CACHED;
                    }
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto2.Creator<LoadSourceDto, PerformanceMetricEventData.Context.MicrogramLoad.LoadSource> {

                    /* compiled from: PerformanceMetricEventDataDto.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* loaded from: classes26.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.values().length];
                            try {
                                iArr[PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.LOAD_SOURCE_UNSPECIFIED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.REMOTE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.CACHED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<LoadSourceDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<LoadSourceDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<LoadSourceDto> getBinaryBase64Serializer() {
                        return (KSerializer) LoadSourceDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<PerformanceMetricEventData.Context.MicrogramLoad.LoadSource> getProtoAdapter() {
                        return PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public LoadSourceDto getZeroValue() {
                        return LoadSourceDto.LOAD_SOURCE_UNSPECIFIED;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public LoadSourceDto fromProto(PerformanceMetricEventData.Context.MicrogramLoad.LoadSource proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                        if (i == 1) {
                            return LoadSourceDto.LOAD_SOURCE_UNSPECIFIED;
                        }
                        if (i == 2) {
                            return LoadSourceDto.REMOTE;
                        }
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return LoadSourceDto.CACHED;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: PerformanceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$LoadSourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public static final class Serializer implements KSerializer<LoadSourceDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private final /* synthetic */ EnumDtoSerializer<LoadSourceDto, PerformanceMetricEventData.Context.MicrogramLoad.LoadSource> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.MicrogramLoad.LoadSource", LoadSourceDto.getEntries(), LoadSourceDto.INSTANCE.getZeroValue());

                    @Override // kotlinx.serialization.KSerializer2
                    public LoadSourceDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return (LoadSourceDto) this.$$delegate_0.deserialize(decoder);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return this.$$delegate_0.getDescriptor();
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, LoadSourceDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.$$delegate_0.serialize(encoder, (Enum) value);
                    }

                    private Serializer() {
                    }
                }

                public static LoadSourceDto valueOf(String str) {
                    return (LoadSourceDto) Enum.valueOf(LoadSourceDto.class, str);
                }

                public static LoadSourceDto[] values() {
                    return (LoadSourceDto[]) $VALUES.clone();
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<MicrogramLoadDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context.MicrogramLoad", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, MicrogramLoadDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public MicrogramLoadDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new MicrogramLoadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto$MicrogramLoadDto";
                }
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Context", kSerializerSerializer.getDescriptor());
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

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$ContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$ContextDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_UNSPECIFIED", "SOURCE_HOME", "SOURCE_SEARCH", "SOURCE_STOCK_DETAIL", "SOURCE_DEEPLINK", "SOURCE_PUSH_NOTIFICATION", "SOURCE_OPTION_CHAIN", "SOURCE_OPTION_ORDER_FORM", "SOURCE_OPTION_WATCHLIST_HUB", "SOURCE_OPTION_STRATEGY_CHAIN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceDto implements Dto2<PerformanceMetricEventData.Source>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceDto, PerformanceMetricEventData.Source>> binaryBase64Serializer$delegate;
        public static final SourceDto SOURCE_UNSPECIFIED = new SOURCE_UNSPECIFIED("SOURCE_UNSPECIFIED", 0);
        public static final SourceDto SOURCE_HOME = new SOURCE_HOME("SOURCE_HOME", 1);
        public static final SourceDto SOURCE_SEARCH = new SOURCE_SEARCH("SOURCE_SEARCH", 2);
        public static final SourceDto SOURCE_STOCK_DETAIL = new SOURCE_STOCK_DETAIL("SOURCE_STOCK_DETAIL", 3);
        public static final SourceDto SOURCE_DEEPLINK = new SOURCE_DEEPLINK("SOURCE_DEEPLINK", 4);
        public static final SourceDto SOURCE_PUSH_NOTIFICATION = new SOURCE_PUSH_NOTIFICATION("SOURCE_PUSH_NOTIFICATION", 5);
        public static final SourceDto SOURCE_OPTION_CHAIN = new SOURCE_OPTION_CHAIN("SOURCE_OPTION_CHAIN", 6);
        public static final SourceDto SOURCE_OPTION_ORDER_FORM = new SOURCE_OPTION_ORDER_FORM("SOURCE_OPTION_ORDER_FORM", 7);
        public static final SourceDto SOURCE_OPTION_WATCHLIST_HUB = new SOURCE_OPTION_WATCHLIST_HUB("SOURCE_OPTION_WATCHLIST_HUB", 8);
        public static final SourceDto SOURCE_OPTION_STRATEGY_CHAIN = new SOURCE_OPTION_STRATEGY_CHAIN("SOURCE_OPTION_STRATEGY_CHAIN", 9);

        private static final /* synthetic */ SourceDto[] $values() {
            return new SourceDto[]{SOURCE_UNSPECIFIED, SOURCE_HOME, SOURCE_SEARCH, SOURCE_STOCK_DETAIL, SOURCE_DEEPLINK, SOURCE_PUSH_NOTIFICATION, SOURCE_OPTION_CHAIN, SOURCE_OPTION_ORDER_FORM, SOURCE_OPTION_WATCHLIST_HUB, SOURCE_OPTION_STRATEGY_CHAIN};
        }

        public /* synthetic */ SourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_UNSPECIFIED extends SourceDto {
            SOURCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
            }
        }

        private SourceDto(String str, int i) {
        }

        static {
            SourceDto[] sourceDtoArr$values = $values();
            $VALUES = sourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto$SourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceMetricEventDataDto.SourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_HOME", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_HOME extends SourceDto {
            SOURCE_HOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_HOME;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_SEARCH", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_SEARCH extends SourceDto {
            SOURCE_SEARCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_SEARCH;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_STOCK_DETAIL", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_STOCK_DETAIL extends SourceDto {
            SOURCE_STOCK_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_DEEPLINK extends SourceDto {
            SOURCE_DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_DEEPLINK;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_PUSH_NOTIFICATION", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_PUSH_NOTIFICATION extends SourceDto {
            SOURCE_PUSH_NOTIFICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_PUSH_NOTIFICATION;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_OPTION_CHAIN", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_OPTION_CHAIN extends SourceDto {
            SOURCE_OPTION_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_OPTION_CHAIN;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_OPTION_ORDER_FORM", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_OPTION_ORDER_FORM extends SourceDto {
            SOURCE_OPTION_ORDER_FORM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_OPTION_ORDER_FORM;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_OPTION_WATCHLIST_HUB", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_OPTION_WATCHLIST_HUB extends SourceDto {
            SOURCE_OPTION_WATCHLIST_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_OPTION_WATCHLIST_HUB;
            }
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto.SourceDto.SOURCE_OPTION_STRATEGY_CHAIN", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_OPTION_STRATEGY_CHAIN extends SourceDto {
            SOURCE_OPTION_STRATEGY_CHAIN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerformanceMetricEventData.Source toProto() {
                return PerformanceMetricEventData.Source.SOURCE_OPTION_STRATEGY_CHAIN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceDto, PerformanceMetricEventData.Source> {

            /* compiled from: PerformanceMetricEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerformanceMetricEventData.Source.values().length];
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_HOME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_SEARCH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_DEEPLINK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_PUSH_NOTIFICATION.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_OPTION_CHAIN.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_OPTION_ORDER_FORM.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_OPTION_WATCHLIST_HUB.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[PerformanceMetricEventData.Source.SOURCE_OPTION_STRATEGY_CHAIN.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceDto> getBinaryBase64Serializer() {
                return (KSerializer) SourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerformanceMetricEventData.Source> getProtoAdapter() {
                return PerformanceMetricEventData.Source.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto getZeroValue() {
                return SourceDto.SOURCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceDto fromProto(PerformanceMetricEventData.Source proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SourceDto.SOURCE_UNSPECIFIED;
                    case 2:
                        return SourceDto.SOURCE_HOME;
                    case 3:
                        return SourceDto.SOURCE_SEARCH;
                    case 4:
                        return SourceDto.SOURCE_STOCK_DETAIL;
                    case 5:
                        return SourceDto.SOURCE_DEEPLINK;
                    case 6:
                        return SourceDto.SOURCE_PUSH_NOTIFICATION;
                    case 7:
                        return SourceDto.SOURCE_OPTION_CHAIN;
                    case 8:
                        return SourceDto.SOURCE_OPTION_ORDER_FORM;
                    case 9:
                        return SourceDto.SOURCE_OPTION_WATCHLIST_HUB;
                    case 10:
                        return SourceDto.SOURCE_OPTION_STRATEGY_CHAIN;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerformanceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$SourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceDto, PerformanceMetricEventData.Source> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData.Source", SourceDto.getEntries(), SourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PerformanceMetricEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerformanceMetricEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerformanceMetricEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerformanceMetricEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerformanceMetricEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerformanceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto";
        }
    }
}
