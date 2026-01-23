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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AssignRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignRequest;", "Lcom/squareup/wire/Message;", "", "entity_id", "", "assignment_parameter", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;Lokio/ByteString;)V", "getEntity_id", "()Ljava/lang/String;", "getAssignment_parameter", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AssignRequest extends Message {

    @JvmField
    public static final ProtoAdapter<AssignRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentParameter#ADAPTER", jsonName = "assignmentParameter", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AssignmentParameter assignment_parameter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String entity_id;

    public AssignRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24617newBuilder();
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public /* synthetic */ AssignRequest(String str, AssignmentParameter assignmentParameter, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : assignmentParameter, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AssignmentParameter getAssignment_parameter() {
        return this.assignment_parameter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignRequest(String entity_id, AssignmentParameter assignmentParameter, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entity_id = entity_id;
        this.assignment_parameter = assignmentParameter;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24617newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssignRequest)) {
            return false;
        }
        AssignRequest assignRequest = (AssignRequest) other;
        return Intrinsics.areEqual(unknownFields(), assignRequest.unknownFields()) && Intrinsics.areEqual(this.entity_id, assignRequest.entity_id) && Intrinsics.areEqual(this.assignment_parameter, assignRequest.assignment_parameter);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.entity_id.hashCode()) * 37;
        AssignmentParameter assignmentParameter = this.assignment_parameter;
        int iHashCode2 = iHashCode + (assignmentParameter != null ? assignmentParameter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        AssignmentParameter assignmentParameter = this.assignment_parameter;
        if (assignmentParameter != null) {
            arrayList.add("assignment_parameter=" + assignmentParameter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssignRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AssignRequest copy$default(AssignRequest assignRequest, String str, AssignmentParameter assignmentParameter, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assignRequest.entity_id;
        }
        if ((i & 2) != 0) {
            assignmentParameter = assignRequest.assignment_parameter;
        }
        if ((i & 4) != 0) {
            byteString = assignRequest.unknownFields();
        }
        return assignRequest.copy(str, assignmentParameter, byteString);
    }

    public final AssignRequest copy(String entity_id, AssignmentParameter assignment_parameter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssignRequest(entity_id, assignment_parameter, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssignRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssignRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.AssignRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEntity_id());
                }
                return value.getAssignment_parameter() != null ? size + AssignmentParameter.ADAPTER.encodedSizeWithTag(2, value.getAssignment_parameter()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntity_id());
                }
                if (value.getAssignment_parameter() != null) {
                    AssignmentParameter.ADAPTER.encodeWithTag(writer, 2, (int) value.getAssignment_parameter());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAssignment_parameter() != null) {
                    AssignmentParameter.ADAPTER.encodeWithTag(writer, 2, (int) value.getAssignment_parameter());
                }
                if (Intrinsics.areEqual(value.getEntity_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntity_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssignRequest redact(AssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AssignmentParameter assignment_parameter = value.getAssignment_parameter();
                return AssignRequest.copy$default(value, null, assignment_parameter != null ? AssignmentParameter.ADAPTER.redact(assignment_parameter) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AssignRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AssignmentParameter assignmentParameterDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssignRequest(strDecode, assignmentParameterDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        assignmentParameterDecode = AssignmentParameter.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
