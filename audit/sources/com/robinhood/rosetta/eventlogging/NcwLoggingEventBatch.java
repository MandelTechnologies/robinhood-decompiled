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

/* compiled from: NcwLoggingEventBatch.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventBatch;", "Lcom/squareup/wire/Message;", "", "events", "", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEvent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getEvents", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NcwLoggingEventBatch extends Message {

    @JvmField
    public static final ProtoAdapter<NcwLoggingEventBatch> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwLoggingEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final java.util.List<NcwLoggingEvent> events;

    /* JADX WARN: Multi-variable type inference failed */
    public NcwLoggingEventBatch() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24396newBuilder();
    }

    public /* synthetic */ NcwLoggingEventBatch(java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcwLoggingEventBatch(java.util.List<NcwLoggingEvent> events, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.events = Internal.immutableCopyOf("events", events);
    }

    public final java.util.List<NcwLoggingEvent> getEvents() {
        return this.events;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24396newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NcwLoggingEventBatch)) {
            return false;
        }
        NcwLoggingEventBatch ncwLoggingEventBatch = (NcwLoggingEventBatch) other;
        return Intrinsics.areEqual(unknownFields(), ncwLoggingEventBatch.unknownFields()) && Intrinsics.areEqual(this.events, ncwLoggingEventBatch.events);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.events.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.events.isEmpty()) {
            arrayList.add("events=" + this.events);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NcwLoggingEventBatch{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NcwLoggingEventBatch copy$default(NcwLoggingEventBatch ncwLoggingEventBatch, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ncwLoggingEventBatch.events;
        }
        if ((i & 2) != 0) {
            byteString = ncwLoggingEventBatch.unknownFields();
        }
        return ncwLoggingEventBatch.copy(list, byteString);
    }

    public final NcwLoggingEventBatch copy(java.util.List<NcwLoggingEvent> events, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NcwLoggingEventBatch(events, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwLoggingEventBatch.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NcwLoggingEventBatch>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NcwLoggingEventBatch$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NcwLoggingEventBatch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + NcwLoggingEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getEvents());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NcwLoggingEventBatch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                NcwLoggingEvent.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getEvents());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NcwLoggingEventBatch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                NcwLoggingEvent.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getEvents());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NcwLoggingEventBatch decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NcwLoggingEventBatch(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(NcwLoggingEvent.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NcwLoggingEventBatch redact(NcwLoggingEventBatch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getEvents(), NcwLoggingEvent.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
