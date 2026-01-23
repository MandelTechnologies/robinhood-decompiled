package com.robinhood.rosetta.common;

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
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.common.TaskTypeDto;
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

/* compiled from: TrailerEventDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u0010H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010H\u0016J\b\u0010)\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/common/TrailerEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/common/TrailerEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/common/TrailerEventDto$Surrogate;)V", "task", "Lcom/robinhood/rosetta/common/TaskTypeDto;", "partition", "", "process_date", "Lcom/robinhood/rosetta/common/DateDto;", "brokeback_shard", "total_partitions", "", "(Lcom/robinhood/rosetta/common/TaskTypeDto;JLcom/robinhood/rosetta/common/DateDto;JI)V", "getTask", "()Lcom/robinhood/rosetta/common/TaskTypeDto;", "getPartition", "()J", "getProcess_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getBrokeback_shard", "getTotal_partitions", "()I", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TrailerEventDto implements Dto3<TrailerEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TrailerEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TrailerEventDto, TrailerEvent>> binaryBase64Serializer$delegate;
    private static final TrailerEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TrailerEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TrailerEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TaskTypeDto getTask() {
        return this.surrogate.getTask();
    }

    public final long getPartition() {
        return this.surrogate.getPartition();
    }

    public final DateDto getProcess_date() {
        return this.surrogate.getProcess_date();
    }

    public final long getBrokeback_shard() {
        return this.surrogate.getBrokeback_shard();
    }

    public final int getTotal_partitions() {
        return this.surrogate.getTotal_partitions();
    }

    public /* synthetic */ TrailerEventDto(TaskTypeDto taskTypeDto, long j, DateDto dateDto, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TaskTypeDto.INSTANCE.getZeroValue() : taskTypeDto, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? null : dateDto, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrailerEventDto(TaskTypeDto task, long j, DateDto dateDto, long j2, int i) {
        this(new Surrogate(task, j, dateDto, j2, i));
        Intrinsics.checkNotNullParameter(task, "task");
    }

    public static /* synthetic */ TrailerEventDto copy$default(TrailerEventDto trailerEventDto, TaskTypeDto taskTypeDto, long j, DateDto dateDto, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            taskTypeDto = trailerEventDto.surrogate.getTask();
        }
        if ((i2 & 2) != 0) {
            j = trailerEventDto.surrogate.getPartition();
        }
        if ((i2 & 4) != 0) {
            dateDto = trailerEventDto.surrogate.getProcess_date();
        }
        if ((i2 & 8) != 0) {
            j2 = trailerEventDto.surrogate.getBrokeback_shard();
        }
        if ((i2 & 16) != 0) {
            i = trailerEventDto.surrogate.getTotal_partitions();
        }
        DateDto dateDto2 = dateDto;
        return trailerEventDto.copy(taskTypeDto, j, dateDto2, j2, i);
    }

    public final TrailerEventDto copy(TaskTypeDto task, long partition, DateDto process_date, long brokeback_shard, int total_partitions) {
        Intrinsics.checkNotNullParameter(task, "task");
        return new TrailerEventDto(new Surrogate(task, partition, process_date, brokeback_shard, total_partitions));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TrailerEvent toProto() {
        TaskType taskType = (TaskType) this.surrogate.getTask().toProto();
        long partition = this.surrogate.getPartition();
        DateDto process_date = this.surrogate.getProcess_date();
        return new TrailerEvent(taskType, partition, process_date != null ? process_date.toProto() : null, this.surrogate.getBrokeback_shard(), this.surrogate.getTotal_partitions(), null, 32, null);
    }

    public String toString() {
        return "[TrailerEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TrailerEventDto) && Intrinsics.areEqual(((TrailerEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: TrailerEventDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289Bh\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u000f\u0010\u0010BG\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0018\u0010%\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0018\u0010'\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010(\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003Jj\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\rHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001bR+\u0010\f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEventDto$Surrogate;", "", "task", "Lcom/robinhood/rosetta/common/TaskTypeDto;", "partition", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "process_date", "Lcom/robinhood/rosetta/common/DateDto;", "brokeback_shard", "total_partitions", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Lcom/robinhood/rosetta/common/TaskTypeDto;JLcom/robinhood/rosetta/common/DateDto;JI)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/common/TaskTypeDto;JLcom/robinhood/rosetta/common/DateDto;JILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTask$annotations", "()V", "getTask", "()Lcom/robinhood/rosetta/common/TaskTypeDto;", "getPartition$annotations", "getPartition", "()J", "getProcess_date$annotations", "getProcess_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getBrokeback_shard$annotations", "getBrokeback_shard", "getTotal_partitions$annotations", "getTotal_partitions", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_common_externalRelease", "$serializer", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long brokeback_shard;
        private final long partition;
        private final DateDto process_date;
        private final TaskTypeDto task;
        private final int total_partitions;

        public Surrogate() {
            this((TaskTypeDto) null, 0L, (DateDto) null, 0L, 0, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, TaskTypeDto taskTypeDto, long j, DateDto dateDto, long j2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                taskTypeDto = surrogate.task;
            }
            if ((i2 & 2) != 0) {
                j = surrogate.partition;
            }
            if ((i2 & 4) != 0) {
                dateDto = surrogate.process_date;
            }
            if ((i2 & 8) != 0) {
                j2 = surrogate.brokeback_shard;
            }
            if ((i2 & 16) != 0) {
                i = surrogate.total_partitions;
            }
            DateDto dateDto2 = dateDto;
            return surrogate.copy(taskTypeDto, j, dateDto2, j2, i);
        }

        @SerialName("brokebackShard")
        @JsonAnnotations2(names = {"brokeback_shard"})
        public static /* synthetic */ void getBrokeback_shard$annotations() {
        }

        @SerialName("partition")
        @JsonAnnotations2(names = {"partition"})
        public static /* synthetic */ void getPartition$annotations() {
        }

        @SerialName("processDate")
        @JsonAnnotations2(names = {"process_date"})
        public static /* synthetic */ void getProcess_date$annotations() {
        }

        @SerialName("task")
        @JsonAnnotations2(names = {"task"})
        public static /* synthetic */ void getTask$annotations() {
        }

        @SerialName("totalPartitions")
        @JsonAnnotations2(names = {"total_partitions"})
        public static /* synthetic */ void getTotal_partitions$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final TaskTypeDto getTask() {
            return this.task;
        }

        /* renamed from: component2, reason: from getter */
        public final long getPartition() {
            return this.partition;
        }

        /* renamed from: component3, reason: from getter */
        public final DateDto getProcess_date() {
            return this.process_date;
        }

        /* renamed from: component4, reason: from getter */
        public final long getBrokeback_shard() {
            return this.brokeback_shard;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTotal_partitions() {
            return this.total_partitions;
        }

        public final Surrogate copy(TaskTypeDto task, long partition, DateDto process_date, long brokeback_shard, int total_partitions) {
            Intrinsics.checkNotNullParameter(task, "task");
            return new Surrogate(task, partition, process_date, brokeback_shard, total_partitions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.task == surrogate.task && this.partition == surrogate.partition && Intrinsics.areEqual(this.process_date, surrogate.process_date) && this.brokeback_shard == surrogate.brokeback_shard && this.total_partitions == surrogate.total_partitions;
        }

        public int hashCode() {
            int iHashCode = ((this.task.hashCode() * 31) + Long.hashCode(this.partition)) * 31;
            DateDto dateDto = this.process_date;
            return ((((iHashCode + (dateDto == null ? 0 : dateDto.hashCode())) * 31) + Long.hashCode(this.brokeback_shard)) * 31) + Integer.hashCode(this.total_partitions);
        }

        public String toString() {
            return "Surrogate(task=" + this.task + ", partition=" + this.partition + ", process_date=" + this.process_date + ", brokeback_shard=" + this.brokeback_shard + ", total_partitions=" + this.total_partitions + ")";
        }

        /* compiled from: TrailerEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/common/TrailerEventDto$Surrogate;", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TrailerEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TaskTypeDto taskTypeDto, long j, DateDto dateDto, long j2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            this.task = (i & 1) == 0 ? TaskTypeDto.INSTANCE.getZeroValue() : taskTypeDto;
            if ((i & 2) == 0) {
                this.partition = 0L;
            } else {
                this.partition = j;
            }
            if ((i & 4) == 0) {
                this.process_date = null;
            } else {
                this.process_date = dateDto;
            }
            if ((i & 8) == 0) {
                this.brokeback_shard = 0L;
            } else {
                this.brokeback_shard = j2;
            }
            if ((i & 16) == 0) {
                this.total_partitions = 0;
            } else {
                this.total_partitions = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_common_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.task != TaskTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, TaskTypeDto.Serializer.INSTANCE, self.task);
            }
            long j = self.partition;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            DateDto dateDto = self.process_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DateDto.Serializer.INSTANCE, dateDto);
            }
            long j2 = self.brokeback_shard;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            int i = self.total_partitions;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(TaskTypeDto task, long j, DateDto dateDto, long j2, int i) {
            Intrinsics.checkNotNullParameter(task, "task");
            this.task = task;
            this.partition = j;
            this.process_date = dateDto;
            this.brokeback_shard = j2;
            this.total_partitions = i;
        }

        public final TaskTypeDto getTask() {
            return this.task;
        }

        public /* synthetic */ Surrogate(TaskTypeDto taskTypeDto, long j, DateDto dateDto, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? TaskTypeDto.INSTANCE.getZeroValue() : taskTypeDto, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? null : dateDto, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0 : i);
        }

        public final long getPartition() {
            return this.partition;
        }

        public final DateDto getProcess_date() {
            return this.process_date;
        }

        public final long getBrokeback_shard() {
            return this.brokeback_shard;
        }

        public final int getTotal_partitions() {
            return this.total_partitions;
        }
    }

    /* compiled from: TrailerEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/common/TrailerEventDto;", "Lcom/robinhood/rosetta/common/TrailerEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/common/TrailerEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TrailerEventDto, TrailerEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrailerEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailerEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailerEventDto> getBinaryBase64Serializer() {
            return (KSerializer) TrailerEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TrailerEvent> getProtoAdapter() {
            return TrailerEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailerEventDto getZeroValue() {
            return TrailerEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailerEventDto fromProto(TrailerEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TaskTypeDto taskTypeDtoFromProto = TaskTypeDto.INSTANCE.fromProto(proto.getTask());
            long partition = proto.getPartition();
            Date process_date = proto.getProcess_date();
            return new TrailerEventDto(new Surrogate(taskTypeDtoFromProto, partition, process_date != null ? DateDto.INSTANCE.fromProto(process_date) : null, proto.getBrokeback_shard(), proto.getTotal_partitions()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.common.TrailerEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrailerEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TrailerEventDto(null, 0L, null, 0L, 0, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TrailerEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/common/TrailerEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/common/TrailerEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TrailerEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.common.TrailerEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TrailerEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TrailerEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TrailerEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TrailerEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.common.TrailerEventDto";
        }
    }
}
