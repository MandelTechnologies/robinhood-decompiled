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

/* compiled from: DiagnosticAssignRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/DiagnosticAssignRequest;", "Lcom/squareup/wire/Message;", "", "entity_id", "", "user_agent", "assignment_parameter", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;Lokio/ByteString;)V", "getEntity_id", "()Ljava/lang/String;", "getUser_agent", "getAssignment_parameter", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class DiagnosticAssignRequest extends Message {

    @JvmField
    public static final ProtoAdapter<DiagnosticAssignRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentParameter#ADAPTER", jsonName = "assignmentParameter", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AssignmentParameter assignment_parameter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_agent;

    public DiagnosticAssignRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ DiagnosticAssignRequest(String str, String str2, AssignmentParameter assignmentParameter, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : assignmentParameter, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24630newBuilder();
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public final AssignmentParameter getAssignment_parameter() {
        return this.assignment_parameter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticAssignRequest(String entity_id, String user_agent, AssignmentParameter assignmentParameter, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entity_id = entity_id;
        this.user_agent = user_agent;
        this.assignment_parameter = assignmentParameter;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24630newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DiagnosticAssignRequest)) {
            return false;
        }
        DiagnosticAssignRequest diagnosticAssignRequest = (DiagnosticAssignRequest) other;
        return Intrinsics.areEqual(unknownFields(), diagnosticAssignRequest.unknownFields()) && Intrinsics.areEqual(this.entity_id, diagnosticAssignRequest.entity_id) && Intrinsics.areEqual(this.user_agent, diagnosticAssignRequest.user_agent) && Intrinsics.areEqual(this.assignment_parameter, diagnosticAssignRequest.assignment_parameter);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.entity_id.hashCode()) * 37) + this.user_agent.hashCode()) * 37;
        AssignmentParameter assignmentParameter = this.assignment_parameter;
        int iHashCode2 = iHashCode + (assignmentParameter != null ? assignmentParameter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        arrayList.add("user_agent=" + Internal.sanitize(this.user_agent));
        AssignmentParameter assignmentParameter = this.assignment_parameter;
        if (assignmentParameter != null) {
            arrayList.add("assignment_parameter=" + assignmentParameter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DiagnosticAssignRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DiagnosticAssignRequest copy$default(DiagnosticAssignRequest diagnosticAssignRequest, String str, String str2, AssignmentParameter assignmentParameter, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diagnosticAssignRequest.entity_id;
        }
        if ((i & 2) != 0) {
            str2 = diagnosticAssignRequest.user_agent;
        }
        if ((i & 4) != 0) {
            assignmentParameter = diagnosticAssignRequest.assignment_parameter;
        }
        if ((i & 8) != 0) {
            byteString = diagnosticAssignRequest.unknownFields();
        }
        return diagnosticAssignRequest.copy(str, str2, assignmentParameter, byteString);
    }

    public final DiagnosticAssignRequest copy(String entity_id, String user_agent, AssignmentParameter assignment_parameter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DiagnosticAssignRequest(entity_id, user_agent, assignment_parameter, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DiagnosticAssignRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DiagnosticAssignRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.DiagnosticAssignRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DiagnosticAssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_agent());
                }
                return value.getAssignment_parameter() != null ? size + AssignmentParameter.ADAPTER.encodedSizeWithTag(3, value.getAssignment_parameter()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DiagnosticAssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntity_id());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_agent());
                }
                if (value.getAssignment_parameter() != null) {
                    AssignmentParameter.ADAPTER.encodeWithTag(writer, 3, (int) value.getAssignment_parameter());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DiagnosticAssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAssignment_parameter() != null) {
                    AssignmentParameter.ADAPTER.encodeWithTag(writer, 3, (int) value.getAssignment_parameter());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_agent());
                }
                if (Intrinsics.areEqual(value.getEntity_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntity_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DiagnosticAssignRequest redact(DiagnosticAssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AssignmentParameter assignment_parameter = value.getAssignment_parameter();
                return DiagnosticAssignRequest.copy$default(value, null, null, assignment_parameter != null ? AssignmentParameter.ADAPTER.redact(assignment_parameter) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DiagnosticAssignRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AssignmentParameter assignmentParameterDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DiagnosticAssignRequest(strDecode, strDecode2, assignmentParameterDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        assignmentParameterDecode = AssignmentParameter.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
