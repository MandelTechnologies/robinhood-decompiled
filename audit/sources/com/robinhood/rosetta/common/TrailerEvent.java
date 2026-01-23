package com.robinhood.rosetta.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: TrailerEvent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/common/TrailerEvent;", "Lcom/squareup/wire/Message;", "", "task", "Lcom/robinhood/rosetta/common/TaskType;", "partition", "", "process_date", "Lcom/robinhood/rosetta/common/Date;", "brokeback_shard", "total_partitions", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/TaskType;JLcom/robinhood/rosetta/common/Date;JILokio/ByteString;)V", "getTask", "()Lcom/robinhood/rosetta/common/TaskType;", "getPartition", "()J", "getProcess_date", "()Lcom/robinhood/rosetta/common/Date;", "getBrokeback_shard", "getTotal_partitions", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TrailerEvent extends Message {

    @JvmField
    public static final ProtoAdapter<TrailerEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "brokebackShard", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long brokeback_shard;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long partition;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "processDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Date process_date;

    @WireField(adapter = "com.robinhood.rosetta.common.TaskType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaskType task;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalPartitions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int total_partitions;

    public TrailerEvent() {
        this(null, 0L, null, 0L, 0, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23990newBuilder();
    }

    public final TaskType getTask() {
        return this.task;
    }

    public /* synthetic */ TrailerEvent(TaskType taskType, long j, Date date, long j2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TaskType.TASK_TYPE_UNSPECIFIED : taskType, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? null : date, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final long getPartition() {
        return this.partition;
    }

    public final Date getProcess_date() {
        return this.process_date;
    }

    public final long getBrokeback_shard() {
        return this.brokeback_shard;
    }

    public final int getTotal_partitions() {
        return this.total_partitions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailerEvent(TaskType task, long j, Date date, long j2, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.task = task;
        this.partition = j;
        this.process_date = date;
        this.brokeback_shard = j2;
        this.total_partitions = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23990newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrailerEvent)) {
            return false;
        }
        TrailerEvent trailerEvent = (TrailerEvent) other;
        return Intrinsics.areEqual(unknownFields(), trailerEvent.unknownFields()) && this.task == trailerEvent.task && this.partition == trailerEvent.partition && Intrinsics.areEqual(this.process_date, trailerEvent.process_date) && this.brokeback_shard == trailerEvent.brokeback_shard && this.total_partitions == trailerEvent.total_partitions;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.task.hashCode()) * 37) + Long.hashCode(this.partition)) * 37;
        Date date = this.process_date;
        int iHashCode2 = ((((iHashCode + (date != null ? date.hashCode() : 0)) * 37) + Long.hashCode(this.brokeback_shard)) * 37) + Integer.hashCode(this.total_partitions);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("task=" + this.task);
        arrayList.add("partition=" + this.partition);
        Date date = this.process_date;
        if (date != null) {
            arrayList.add("process_date=" + date);
        }
        arrayList.add("brokeback_shard=" + this.brokeback_shard);
        arrayList.add("total_partitions=" + this.total_partitions);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrailerEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TrailerEvent copy$default(TrailerEvent trailerEvent, TaskType taskType, long j, Date date, long j2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            taskType = trailerEvent.task;
        }
        if ((i2 & 2) != 0) {
            j = trailerEvent.partition;
        }
        if ((i2 & 4) != 0) {
            date = trailerEvent.process_date;
        }
        if ((i2 & 8) != 0) {
            j2 = trailerEvent.brokeback_shard;
        }
        if ((i2 & 16) != 0) {
            i = trailerEvent.total_partitions;
        }
        if ((i2 & 32) != 0) {
            byteString = trailerEvent.unknownFields();
        }
        Date date2 = date;
        return trailerEvent.copy(taskType, j, date2, j2, i, byteString);
    }

    public final TrailerEvent copy(TaskType task, long partition, Date process_date, long brokeback_shard, int total_partitions, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrailerEvent(task, partition, process_date, brokeback_shard, total_partitions, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrailerEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrailerEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.common.TrailerEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrailerEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTask() != TaskType.TASK_TYPE_UNSPECIFIED) {
                    size += TaskType.ADAPTER.encodedSizeWithTag(1, value.getTask());
                }
                if (value.getPartition() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getPartition()));
                }
                if (value.getProcess_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(3, value.getProcess_date());
                }
                if (value.getBrokeback_shard() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getBrokeback_shard()));
                }
                return value.getTotal_partitions() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTotal_partitions())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrailerEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTask() != TaskType.TASK_TYPE_UNSPECIFIED) {
                    TaskType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTask());
                }
                if (value.getPartition() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getPartition()));
                }
                if (value.getProcess_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getProcess_date());
                }
                if (value.getBrokeback_shard() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getBrokeback_shard()));
                }
                if (value.getTotal_partitions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_partitions()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrailerEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_partitions() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTotal_partitions()));
                }
                if (value.getBrokeback_shard() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getBrokeback_shard()));
                }
                if (value.getProcess_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 3, (int) value.getProcess_date());
                }
                if (value.getPartition() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getPartition()));
                }
                if (value.getTask() != TaskType.TASK_TYPE_UNSPECIFIED) {
                    TaskType.ADAPTER.encodeWithTag(writer, 1, (int) value.getTask());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TrailerEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaskType taskType = TaskType.TASK_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                long jLongValue = 0;
                int iIntValue = 0;
                TaskType taskTypeDecode = taskType;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TrailerEvent(taskTypeDecode, jLongValue2, dateDecode, jLongValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            taskTypeDecode = TaskType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 3) {
                        dateDecode = Date.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 5) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailerEvent redact(TrailerEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date process_date = value.getProcess_date();
                return TrailerEvent.copy$default(value, null, 0L, process_date != null ? Date.ADAPTER.redact(process_date) : null, 0L, 0, ByteString.EMPTY, 27, null);
            }
        };
    }
}
