package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ExperimentsEventData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "Lcom/squareup/wire/Message;", "", "assignments", "", "triggering_data", "Lcom/robinhood/rosetta/eventlogging/TriggeringExperiments;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/TriggeringExperiments;Lokio/ByteString;)V", "getAssignments", "()Ljava/lang/String;", "getTriggering_data", "()Lcom/robinhood/rosetta/eventlogging/TriggeringExperiments;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ExperimentsEventData extends Message {

    @JvmField
    public static final ProtoAdapter<ExperimentsEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String assignments;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TriggeringExperiments#ADAPTER", jsonName = "triggeringData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TriggeringExperiments triggering_data;

    public ExperimentsEventData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24265newBuilder();
    }

    public final String getAssignments() {
        return this.assignments;
    }

    public /* synthetic */ ExperimentsEventData(String str, TriggeringExperiments triggeringExperiments, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : triggeringExperiments, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TriggeringExperiments getTriggering_data() {
        return this.triggering_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsEventData(String assignments, TriggeringExperiments triggeringExperiments, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.assignments = assignments;
        this.triggering_data = triggeringExperiments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24265newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ExperimentsEventData)) {
            return false;
        }
        ExperimentsEventData experimentsEventData = (ExperimentsEventData) other;
        return Intrinsics.areEqual(unknownFields(), experimentsEventData.unknownFields()) && Intrinsics.areEqual(this.assignments, experimentsEventData.assignments) && Intrinsics.areEqual(this.triggering_data, experimentsEventData.triggering_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.assignments.hashCode()) * 37;
        TriggeringExperiments triggeringExperiments = this.triggering_data;
        int iHashCode2 = iHashCode + (triggeringExperiments != null ? triggeringExperiments.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("assignments=" + Internal.sanitize(this.assignments));
        TriggeringExperiments triggeringExperiments = this.triggering_data;
        if (triggeringExperiments != null) {
            arrayList.add("triggering_data=" + triggeringExperiments);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExperimentsEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ExperimentsEventData copy$default(ExperimentsEventData experimentsEventData, String str, TriggeringExperiments triggeringExperiments, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experimentsEventData.assignments;
        }
        if ((i & 2) != 0) {
            triggeringExperiments = experimentsEventData.triggering_data;
        }
        if ((i & 4) != 0) {
            byteString = experimentsEventData.unknownFields();
        }
        return experimentsEventData.copy(str, triggeringExperiments, byteString);
    }

    public final ExperimentsEventData copy(String assignments, TriggeringExperiments triggering_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ExperimentsEventData(assignments, triggering_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ExperimentsEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ExperimentsEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ExperimentsEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ExperimentsEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAssignments(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAssignments());
                }
                return value.getTriggering_data() != null ? size + TriggeringExperiments.ADAPTER.encodedSizeWithTag(2, value.getTriggering_data()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ExperimentsEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAssignments(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAssignments());
                }
                if (value.getTriggering_data() != null) {
                    TriggeringExperiments.ADAPTER.encodeWithTag(writer, 2, (int) value.getTriggering_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ExperimentsEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTriggering_data() != null) {
                    TriggeringExperiments.ADAPTER.encodeWithTag(writer, 2, (int) value.getTriggering_data());
                }
                if (Intrinsics.areEqual(value.getAssignments(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAssignments());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ExperimentsEventData redact(ExperimentsEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TriggeringExperiments triggering_data = value.getTriggering_data();
                return ExperimentsEventData.copy$default(value, null, triggering_data != null ? TriggeringExperiments.ADAPTER.redact(triggering_data) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ExperimentsEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                TriggeringExperiments triggeringExperimentsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ExperimentsEventData(strDecode, triggeringExperimentsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        triggeringExperimentsDecode = TriggeringExperiments.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
