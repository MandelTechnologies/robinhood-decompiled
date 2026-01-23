package search_coprocessor.p542v1;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import search_coprocessor.p542v1.SportCarousel;

/* compiled from: SportCarousel.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lsearch_coprocessor/v1/SportCarousel;", "Lcom/squareup/wire/Message;", "", "id", "", "contract_ids", "", "events", "Lsearch_coprocessor/v1/SportCarousel$Event;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getContract_ids", "()Ljava/util/List;", "getEvents", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Event", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class SportCarousel extends Message {

    @JvmField
    public static final ProtoAdapter<SportCarousel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIds", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> contract_ids;

    @WireField(adapter = "search_coprocessor.v1.SportCarousel$Event#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Event> events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    public SportCarousel() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29986newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ SportCarousel(String str, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportCarousel(String id, List<String> contract_ids, List<Event> events, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_ids, "contract_ids");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.contract_ids = Internal.immutableCopyOf("contract_ids", contract_ids);
        this.events = Internal.immutableCopyOf("events", events);
    }

    public final List<String> getContract_ids() {
        return this.contract_ids;
    }

    public final List<Event> getEvents() {
        return this.events;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29986newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SportCarousel)) {
            return false;
        }
        SportCarousel sportCarousel = (SportCarousel) other;
        return Intrinsics.areEqual(unknownFields(), sportCarousel.unknownFields()) && Intrinsics.areEqual(this.id, sportCarousel.id) && Intrinsics.areEqual(this.contract_ids, sportCarousel.contract_ids) && Intrinsics.areEqual(this.events, sportCarousel.events);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.contract_ids.hashCode()) * 37) + this.events.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        if (!this.contract_ids.isEmpty()) {
            arrayList.add("contract_ids=" + Internal.sanitize(this.contract_ids));
        }
        if (!this.events.isEmpty()) {
            arrayList.add("events=" + this.events);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SportCarousel{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportCarousel copy$default(SportCarousel sportCarousel, String str, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportCarousel.id;
        }
        if ((i & 2) != 0) {
            list = sportCarousel.contract_ids;
        }
        if ((i & 4) != 0) {
            list2 = sportCarousel.events;
        }
        if ((i & 8) != 0) {
            byteString = sportCarousel.unknownFields();
        }
        return sportCarousel.copy(str, list, list2, byteString);
    }

    public final SportCarousel copy(String id, List<String> contract_ids, List<Event> events, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_ids, "contract_ids");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SportCarousel(id, contract_ids, events, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SportCarousel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SportCarousel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.SportCarousel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SportCarousel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getContract_ids()) + SportCarousel.Event.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getEvents());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SportCarousel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_ids());
                SportCarousel.Event.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getEvents());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SportCarousel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SportCarousel.Event.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getEvents());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_ids());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SportCarousel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SportCarousel(strDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(SportCarousel.Event.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SportCarousel redact(SportCarousel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SportCarousel.copy$default(value, null, null, Internal.m26823redactElements(value.getEvents(), SportCarousel.Event.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }

    /* compiled from: SportCarousel.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lsearch_coprocessor/v1/SportCarousel$Event;", "Lcom/squareup/wire/Message;", "", "id", "", "contract_id_to_aux_description", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getContract_id_to_aux_description", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Event extends Message {

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIdToAuxDescription", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        private final Map<String, String> contract_id_to_aux_description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        @JvmField
        public static final ProtoAdapter<Event> ADAPTER = new SportCarousel3(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Event.class), Syntax.PROTO_3);

        public Event() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29987newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Event(String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(String id, Map<String, String> contract_id_to_aux_description, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id_to_aux_description, "contract_id_to_aux_description");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.contract_id_to_aux_description = Internal.immutableCopyOf("contract_id_to_aux_description", contract_id_to_aux_description);
        }

        public final Map<String, String> getContract_id_to_aux_description() {
            return this.contract_id_to_aux_description;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29987newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return Intrinsics.areEqual(unknownFields(), event.unknownFields()) && Intrinsics.areEqual(this.id, event.id) && Intrinsics.areEqual(this.contract_id_to_aux_description, event.contract_id_to_aux_description);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.contract_id_to_aux_description.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            if (!this.contract_id_to_aux_description.isEmpty()) {
                arrayList.add("contract_id_to_aux_description=" + this.contract_id_to_aux_description);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Event{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, String str, Map map, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = event.id;
            }
            if ((i & 2) != 0) {
                map = event.contract_id_to_aux_description;
            }
            if ((i & 4) != 0) {
                byteString = event.unknownFields();
            }
            return event.copy(str, map, byteString);
        }

        public final Event copy(String id, Map<String, String> contract_id_to_aux_description, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id_to_aux_description, "contract_id_to_aux_description");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Event(id, contract_id_to_aux_description, unknownFields);
        }
    }
}
