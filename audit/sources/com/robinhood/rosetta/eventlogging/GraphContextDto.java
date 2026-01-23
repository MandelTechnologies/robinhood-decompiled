package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.GraphContext;
import com.robinhood.rosetta.eventlogging.GraphContextDto;
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

/* compiled from: GraphContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006!\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/GraphContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Surrogate;)V", "graph_type", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "interval", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "(Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;)V", "getGraph_type", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "getInterval", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "GraphTypeDto", "IntervalDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class GraphContextDto implements Dto3<GraphContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GraphContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GraphContextDto, GraphContext>> binaryBase64Serializer$delegate;
    private static final GraphContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GraphContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GraphContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final GraphTypeDto getGraph_type() {
        return this.surrogate.getGraph_type();
    }

    public final IntervalDto getInterval() {
        return this.surrogate.getInterval();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphContextDto(GraphTypeDto graph_type, IntervalDto interval) {
        this(new Surrogate(graph_type, interval));
        Intrinsics.checkNotNullParameter(graph_type, "graph_type");
        Intrinsics.checkNotNullParameter(interval, "interval");
    }

    public /* synthetic */ GraphContextDto(GraphTypeDto graphTypeDto, IntervalDto intervalDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GraphTypeDto.INSTANCE.getZeroValue() : graphTypeDto, (i & 2) != 0 ? IntervalDto.INSTANCE.getZeroValue() : intervalDto);
    }

    public static /* synthetic */ GraphContextDto copy$default(GraphContextDto graphContextDto, GraphTypeDto graphTypeDto, IntervalDto intervalDto, int i, Object obj) {
        if ((i & 1) != 0) {
            graphTypeDto = graphContextDto.surrogate.getGraph_type();
        }
        if ((i & 2) != 0) {
            intervalDto = graphContextDto.surrogate.getInterval();
        }
        return graphContextDto.copy(graphTypeDto, intervalDto);
    }

    public final GraphContextDto copy(GraphTypeDto graph_type, IntervalDto interval) {
        Intrinsics.checkNotNullParameter(graph_type, "graph_type");
        Intrinsics.checkNotNullParameter(interval, "interval");
        return new GraphContextDto(new Surrogate(graph_type, interval));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GraphContext toProto() {
        return new GraphContext((GraphContext.GraphType) this.surrogate.getGraph_type().toProto(), (GraphContext.Interval) this.surrogate.getInterval().toProto(), null, 4, null);
    }

    public String toString() {
        return "[GraphContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GraphContextDto) && Intrinsics.areEqual(((GraphContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: GraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Surrogate;", "", "graph_type", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "interval", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getGraph_type$annotations", "()V", "getGraph_type", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "getInterval$annotations", "getInterval", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GraphTypeDto graph_type;
        private final IntervalDto interval;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((GraphTypeDto) null, (IntervalDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, GraphTypeDto graphTypeDto, IntervalDto intervalDto, int i, Object obj) {
            if ((i & 1) != 0) {
                graphTypeDto = surrogate.graph_type;
            }
            if ((i & 2) != 0) {
                intervalDto = surrogate.interval;
            }
            return surrogate.copy(graphTypeDto, intervalDto);
        }

        @SerialName("graphType")
        @JsonAnnotations2(names = {"graph_type"})
        public static /* synthetic */ void getGraph_type$annotations() {
        }

        @SerialName("interval")
        @JsonAnnotations2(names = {"interval"})
        public static /* synthetic */ void getInterval$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final GraphTypeDto getGraph_type() {
            return this.graph_type;
        }

        /* renamed from: component2, reason: from getter */
        public final IntervalDto getInterval() {
            return this.interval;
        }

        public final Surrogate copy(GraphTypeDto graph_type, IntervalDto interval) {
            Intrinsics.checkNotNullParameter(graph_type, "graph_type");
            Intrinsics.checkNotNullParameter(interval, "interval");
            return new Surrogate(graph_type, interval);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.graph_type == surrogate.graph_type && this.interval == surrogate.interval;
        }

        public int hashCode() {
            return (this.graph_type.hashCode() * 31) + this.interval.hashCode();
        }

        public String toString() {
            return "Surrogate(graph_type=" + this.graph_type + ", interval=" + this.interval + ")";
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GraphContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GraphTypeDto graphTypeDto, IntervalDto intervalDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.graph_type = (i & 1) == 0 ? GraphTypeDto.INSTANCE.getZeroValue() : graphTypeDto;
            if ((i & 2) == 0) {
                this.interval = IntervalDto.INSTANCE.getZeroValue();
            } else {
                this.interval = intervalDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.graph_type != GraphTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, GraphTypeDto.Serializer.INSTANCE, self.graph_type);
            }
            if (self.interval != IntervalDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, IntervalDto.Serializer.INSTANCE, self.interval);
            }
        }

        public Surrogate(GraphTypeDto graph_type, IntervalDto interval) {
            Intrinsics.checkNotNullParameter(graph_type, "graph_type");
            Intrinsics.checkNotNullParameter(interval, "interval");
            this.graph_type = graph_type;
            this.interval = interval;
        }

        public final GraphTypeDto getGraph_type() {
            return this.graph_type;
        }

        public /* synthetic */ Surrogate(GraphTypeDto graphTypeDto, IntervalDto intervalDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? GraphTypeDto.INSTANCE.getZeroValue() : graphTypeDto, (i & 2) != 0 ? IntervalDto.INSTANCE.getZeroValue() : intervalDto);
        }

        public final IntervalDto getInterval() {
            return this.interval;
        }
    }

    /* compiled from: GraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto;", "Lcom/robinhood/rosetta/eventlogging/GraphContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GraphContextDto, GraphContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GraphContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GraphContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GraphContextDto> getBinaryBase64Serializer() {
            return (KSerializer) GraphContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GraphContext> getProtoAdapter() {
            return GraphContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GraphContextDto getZeroValue() {
            return GraphContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GraphContextDto fromProto(GraphContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GraphContextDto(new Surrogate(GraphTypeDto.INSTANCE.fromProto(proto.getGraph_type()), IntervalDto.INSTANCE.fromProto(proto.getInterval())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.GraphContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GraphContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LINE", "CANDLESTICK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class GraphTypeDto implements Dto2<GraphContext.GraphType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<GraphTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<GraphTypeDto, GraphContext.GraphType>> binaryBase64Serializer$delegate;
        public static final GraphTypeDto LINE = new LINE("LINE", 0);
        public static final GraphTypeDto CANDLESTICK = new CANDLESTICK("CANDLESTICK", 1);

        private static final /* synthetic */ GraphTypeDto[] $values() {
            return new GraphTypeDto[]{LINE, CANDLESTICK};
        }

        public /* synthetic */ GraphTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<GraphTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.GraphTypeDto.LINE", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINE extends GraphTypeDto {
            LINE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.GraphType toProto() {
                return GraphContext.GraphType.LINE;
            }
        }

        private GraphTypeDto(String str, int i) {
        }

        static {
            GraphTypeDto[] graphTypeDtoArr$values = $values();
            $VALUES = graphTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.GraphContextDto$GraphTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GraphContextDto.GraphTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.GraphTypeDto.CANDLESTICK", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANDLESTICK extends GraphTypeDto {
            CANDLESTICK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.GraphType toProto() {
                return GraphContext.GraphType.CANDLESTICK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<GraphTypeDto, GraphContext.GraphType> {

            /* compiled from: GraphContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GraphContext.GraphType.values().length];
                    try {
                        iArr[GraphContext.GraphType.LINE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GraphContext.GraphType.CANDLESTICK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GraphTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GraphTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GraphTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) GraphTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GraphContext.GraphType> getProtoAdapter() {
                return GraphContext.GraphType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GraphTypeDto getZeroValue() {
                return GraphTypeDto.LINE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GraphTypeDto fromProto(GraphContext.GraphType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return GraphTypeDto.LINE;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return GraphTypeDto.CANDLESTICK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$GraphTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<GraphTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<GraphTypeDto, GraphContext.GraphType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.GraphContext.GraphType", GraphTypeDto.getEntries(), GraphTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public GraphTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (GraphTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, GraphTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static GraphTypeDto valueOf(String str) {
            return (GraphTypeDto) Enum.valueOf(GraphTypeDto.class, str);
        }

        public static GraphTypeDto[] values() {
            return (GraphTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "HOUR", "DAY", "WEEK", "MONTH", "THREE_MONTHS", "YEAR", "FIVE_YEARS", DisplaySpans.ALL, "YEAR_TO_DATE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class IntervalDto implements Dto2<GraphContext.Interval>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IntervalDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<IntervalDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<IntervalDto, GraphContext.Interval>> binaryBase64Serializer$delegate;
        public static final IntervalDto HOUR = new HOUR("HOUR", 0);
        public static final IntervalDto DAY = new DAY("DAY", 1);
        public static final IntervalDto WEEK = new WEEK("WEEK", 2);
        public static final IntervalDto MONTH = new MONTH("MONTH", 3);
        public static final IntervalDto THREE_MONTHS = new THREE_MONTHS("THREE_MONTHS", 4);
        public static final IntervalDto YEAR = new YEAR("YEAR", 5);
        public static final IntervalDto FIVE_YEARS = new FIVE_YEARS("FIVE_YEARS", 6);
        public static final IntervalDto ALL = new ALL(DisplaySpans.ALL, 7);
        public static final IntervalDto YEAR_TO_DATE = new YEAR_TO_DATE("YEAR_TO_DATE", 8);

        private static final /* synthetic */ IntervalDto[] $values() {
            return new IntervalDto[]{HOUR, DAY, WEEK, MONTH, THREE_MONTHS, YEAR, FIVE_YEARS, ALL, YEAR_TO_DATE};
        }

        public /* synthetic */ IntervalDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<IntervalDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.HOUR", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HOUR extends IntervalDto {
            HOUR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.HOUR;
            }
        }

        private IntervalDto(String str, int i) {
        }

        static {
            IntervalDto[] intervalDtoArr$values = $values();
            $VALUES = intervalDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(intervalDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.GraphContextDto$IntervalDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GraphContextDto.IntervalDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.DAY", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY extends IntervalDto {
            DAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.DAY;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.WEEK", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEEK extends IntervalDto {
            WEEK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.WEEK;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.MONTH", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MONTH extends IntervalDto {
            MONTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.MONTH;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.THREE_MONTHS", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class THREE_MONTHS extends IntervalDto {
            THREE_MONTHS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.THREE_MONTHS;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.YEAR", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class YEAR extends IntervalDto {
            YEAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.YEAR;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.FIVE_YEARS", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIVE_YEARS extends IntervalDto {
            FIVE_YEARS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.FIVE_YEARS;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.ALL", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALL extends IntervalDto {
            ALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.ALL;
            }
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/GraphContextDto.IntervalDto.YEAR_TO_DATE", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class YEAR_TO_DATE extends IntervalDto {
            YEAR_TO_DATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GraphContext.Interval toProto() {
                return GraphContext.Interval.YEAR_TO_DATE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<IntervalDto, GraphContext.Interval> {

            /* compiled from: GraphContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GraphContext.Interval.values().length];
                    try {
                        iArr[GraphContext.Interval.HOUR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GraphContext.Interval.DAY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GraphContext.Interval.WEEK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[GraphContext.Interval.MONTH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[GraphContext.Interval.THREE_MONTHS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[GraphContext.Interval.YEAR.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[GraphContext.Interval.FIVE_YEARS.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[GraphContext.Interval.ALL.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[GraphContext.Interval.YEAR_TO_DATE.ordinal()] = 9;
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

            public final KSerializer<IntervalDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IntervalDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<IntervalDto> getBinaryBase64Serializer() {
                return (KSerializer) IntervalDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GraphContext.Interval> getProtoAdapter() {
                return GraphContext.Interval.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IntervalDto getZeroValue() {
                return IntervalDto.HOUR;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public IntervalDto fromProto(GraphContext.Interval proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return IntervalDto.HOUR;
                    case 2:
                        return IntervalDto.DAY;
                    case 3:
                        return IntervalDto.WEEK;
                    case 4:
                        return IntervalDto.MONTH;
                    case 5:
                        return IntervalDto.THREE_MONTHS;
                    case 6:
                        return IntervalDto.YEAR;
                    case 7:
                        return IntervalDto.FIVE_YEARS;
                    case 8:
                        return IntervalDto.ALL;
                    case 9:
                        return IntervalDto.YEAR_TO_DATE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GraphContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$IntervalDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<IntervalDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<IntervalDto, GraphContext.Interval> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.GraphContext.Interval", IntervalDto.getEntries(), IntervalDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public IntervalDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (IntervalDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, IntervalDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static IntervalDto valueOf(String str) {
            return (IntervalDto) Enum.valueOf(IntervalDto.class, str);
        }

        public static IntervalDto[] values() {
            return (IntervalDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GraphContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/GraphContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<GraphContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.GraphContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GraphContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GraphContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GraphContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GraphContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.GraphContextDto";
        }
    }
}
