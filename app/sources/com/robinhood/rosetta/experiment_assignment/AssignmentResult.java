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

/* compiled from: AssignmentResult.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResult;", "Lcom/squareup/wire/Message;", "", "assignment_name", "", "variant", "reason", "override_list_names", "within_universe", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getAssignment_name", "()Ljava/lang/String;", "getVariant", "getReason", "getOverride_list_names", "getWithin_universe", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AssignmentResult extends Message {

    @JvmField
    public static final ProtoAdapter<AssignmentResult> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assignmentName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String assignment_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "overrideListNames", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String override_list_names;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String variant;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "withinUniverse", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean within_universe;

    public AssignmentResult() {
        this(null, null, null, null, false, null, 63, null);
    }

    public /* synthetic */ AssignmentResult(String str, String str2, String str3, String str4, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24625newBuilder();
    }

    public final String getAssignment_name() {
        return this.assignment_name;
    }

    public final String getVariant() {
        return this.variant;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getOverride_list_names() {
        return this.override_list_names;
    }

    public final boolean getWithin_universe() {
        return this.within_universe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignmentResult(String assignment_name, String variant, String reason, String override_list_names, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(assignment_name, "assignment_name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(override_list_names, "override_list_names");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.assignment_name = assignment_name;
        this.variant = variant;
        this.reason = reason;
        this.override_list_names = override_list_names;
        this.within_universe = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24625newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssignmentResult)) {
            return false;
        }
        AssignmentResult assignmentResult = (AssignmentResult) other;
        return Intrinsics.areEqual(unknownFields(), assignmentResult.unknownFields()) && Intrinsics.areEqual(this.assignment_name, assignmentResult.assignment_name) && Intrinsics.areEqual(this.variant, assignmentResult.variant) && Intrinsics.areEqual(this.reason, assignmentResult.reason) && Intrinsics.areEqual(this.override_list_names, assignmentResult.override_list_names) && this.within_universe == assignmentResult.within_universe;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.assignment_name.hashCode()) * 37) + this.variant.hashCode()) * 37) + this.reason.hashCode()) * 37) + this.override_list_names.hashCode()) * 37) + Boolean.hashCode(this.within_universe);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("assignment_name=" + Internal.sanitize(this.assignment_name));
        arrayList.add("variant=" + Internal.sanitize(this.variant));
        arrayList.add("reason=" + Internal.sanitize(this.reason));
        arrayList.add("override_list_names=" + Internal.sanitize(this.override_list_names));
        arrayList.add("within_universe=" + this.within_universe);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssignmentResult{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AssignmentResult copy$default(AssignmentResult assignmentResult, String str, String str2, String str3, String str4, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assignmentResult.assignment_name;
        }
        if ((i & 2) != 0) {
            str2 = assignmentResult.variant;
        }
        if ((i & 4) != 0) {
            str3 = assignmentResult.reason;
        }
        if ((i & 8) != 0) {
            str4 = assignmentResult.override_list_names;
        }
        if ((i & 16) != 0) {
            z = assignmentResult.within_universe;
        }
        if ((i & 32) != 0) {
            byteString = assignmentResult.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return assignmentResult.copy(str, str2, str3, str4, z2, byteString2);
    }

    public final AssignmentResult copy(String assignment_name, String variant, String reason, String override_list_names, boolean within_universe, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(assignment_name, "assignment_name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(override_list_names, "override_list_names");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssignmentResult(assignment_name, variant, reason, override_list_names, within_universe, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssignmentResult.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssignmentResult>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentResult$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssignmentResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAssignment_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAssignment_name());
                }
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getVariant());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getReason());
                }
                if (!Intrinsics.areEqual(value.getOverride_list_names(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOverride_list_names());
                }
                return value.getWithin_universe() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getWithin_universe())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssignmentResult value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAssignment_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAssignment_name());
                }
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVariant());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getOverride_list_names(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOverride_list_names());
                }
                if (value.getWithin_universe()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getWithin_universe()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssignmentResult value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getWithin_universe()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getWithin_universe()));
                }
                if (!Intrinsics.areEqual(value.getOverride_list_names(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOverride_list_names());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVariant());
                }
                if (Intrinsics.areEqual(value.getAssignment_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAssignment_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssignmentResult redact(AssignmentResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AssignmentResult.copy$default(value, null, null, null, null, false, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AssignmentResult decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssignmentResult(strDecode, strDecode4, strDecode2, strDecode3, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
