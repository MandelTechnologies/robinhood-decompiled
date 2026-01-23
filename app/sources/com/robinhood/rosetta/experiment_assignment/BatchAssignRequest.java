package com.robinhood.rosetta.experiment_assignment;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: BatchAssignRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J,\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/BatchAssignRequest;", "Lcom/squareup/wire/Message;", "", "entity_ids", "", "", "assignment_parameter", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;Lokio/ByteString;)V", "getAssignment_parameter", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "getEntity_ids", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BatchAssignRequest extends Message {

    @JvmField
    public static final ProtoAdapter<BatchAssignRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentParameter#ADAPTER", jsonName = "assignmentParameter", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AssignmentParameter assignment_parameter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> entity_ids;

    public BatchAssignRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24627newBuilder();
    }

    public /* synthetic */ BatchAssignRequest(List list, AssignmentParameter assignmentParameter, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : assignmentParameter, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AssignmentParameter getAssignment_parameter() {
        return this.assignment_parameter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchAssignRequest(List<String> entity_ids, AssignmentParameter assignmentParameter, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entity_ids, "entity_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.assignment_parameter = assignmentParameter;
        this.entity_ids = Internal.immutableCopyOf("entity_ids", entity_ids);
    }

    public final List<String> getEntity_ids() {
        return this.entity_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24627newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BatchAssignRequest)) {
            return false;
        }
        BatchAssignRequest batchAssignRequest = (BatchAssignRequest) other;
        return Intrinsics.areEqual(unknownFields(), batchAssignRequest.unknownFields()) && Intrinsics.areEqual(this.entity_ids, batchAssignRequest.entity_ids) && Intrinsics.areEqual(this.assignment_parameter, batchAssignRequest.assignment_parameter);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.entity_ids.hashCode()) * 37;
        AssignmentParameter assignmentParameter = this.assignment_parameter;
        int iHashCode2 = iHashCode + (assignmentParameter != null ? assignmentParameter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.entity_ids.isEmpty()) {
            arrayList.add("entity_ids=" + Internal.sanitize(this.entity_ids));
        }
        AssignmentParameter assignmentParameter = this.assignment_parameter;
        if (assignmentParameter != null) {
            arrayList.add("assignment_parameter=" + assignmentParameter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchAssignRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchAssignRequest copy$default(BatchAssignRequest batchAssignRequest, List list, AssignmentParameter assignmentParameter, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchAssignRequest.entity_ids;
        }
        if ((i & 2) != 0) {
            assignmentParameter = batchAssignRequest.assignment_parameter;
        }
        if ((i & 4) != 0) {
            byteString = batchAssignRequest.unknownFields();
        }
        return batchAssignRequest.copy(list, assignmentParameter, byteString);
    }

    public final BatchAssignRequest copy(List<String> entity_ids, AssignmentParameter assignment_parameter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entity_ids, "entity_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BatchAssignRequest(entity_ids, assignment_parameter, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BatchAssignRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BatchAssignRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.BatchAssignRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BatchAssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getEntity_ids());
                return value.getAssignment_parameter() != null ? size + AssignmentParameter.ADAPTER.encodedSizeWithTag(2, value.getAssignment_parameter()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BatchAssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getEntity_ids());
                if (value.getAssignment_parameter() != null) {
                    AssignmentParameter.ADAPTER.encodeWithTag(writer, 2, (int) value.getAssignment_parameter());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BatchAssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAssignment_parameter() != null) {
                    AssignmentParameter.ADAPTER.encodeWithTag(writer, 2, (int) value.getAssignment_parameter());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getEntity_ids());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BatchAssignRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                AssignmentParameter assignmentParameterDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BatchAssignRequest(arrayList, assignmentParameterDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 2) {
                        assignmentParameterDecode = AssignmentParameter.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BatchAssignRequest redact(BatchAssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AssignmentParameter assignment_parameter = value.getAssignment_parameter();
                return BatchAssignRequest.copy$default(value, null, assignment_parameter != null ? AssignmentParameter.ADAPTER.redact(assignment_parameter) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
