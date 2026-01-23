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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import search_coprocessor.p542v1.PredictionEventsList;

/* compiled from: PredictionEventsList.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J6\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lsearch_coprocessor/v1/PredictionEventsList;", "Lcom/squareup/wire/Message;", "", "id", "", "events", "", "Lsearch_coprocessor/v1/PredictionEventsList$Item;", "show_more_deeplink", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getShow_more_deeplink", "getEvents", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Item", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class PredictionEventsList extends Message {

    @JvmField
    public static final ProtoAdapter<PredictionEventsList> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.PredictionEventsList$Item#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Item> events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "showMoreDeeplink", schemaIndex = 2, tag = 3)
    private final String show_more_deeplink;

    public PredictionEventsList() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29975newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ PredictionEventsList(String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getShow_more_deeplink() {
        return this.show_more_deeplink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictionEventsList(String id, List<Item> events, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.show_more_deeplink = str;
        this.events = Internal.immutableCopyOf("events", events);
    }

    public final List<Item> getEvents() {
        return this.events;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29975newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PredictionEventsList)) {
            return false;
        }
        PredictionEventsList predictionEventsList = (PredictionEventsList) other;
        return Intrinsics.areEqual(unknownFields(), predictionEventsList.unknownFields()) && Intrinsics.areEqual(this.id, predictionEventsList.id) && Intrinsics.areEqual(this.events, predictionEventsList.events) && Intrinsics.areEqual(this.show_more_deeplink, predictionEventsList.show_more_deeplink);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.events.hashCode()) * 37;
        String str = this.show_more_deeplink;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        if (!this.events.isEmpty()) {
            arrayList.add("events=" + this.events);
        }
        String str = this.show_more_deeplink;
        if (str != null) {
            arrayList.add("show_more_deeplink=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PredictionEventsList{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PredictionEventsList copy$default(PredictionEventsList predictionEventsList, String str, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = predictionEventsList.id;
        }
        if ((i & 2) != 0) {
            list = predictionEventsList.events;
        }
        if ((i & 4) != 0) {
            str2 = predictionEventsList.show_more_deeplink;
        }
        if ((i & 8) != 0) {
            byteString = predictionEventsList.unknownFields();
        }
        return predictionEventsList.copy(str, list, str2, byteString);
    }

    public final PredictionEventsList copy(String id, List<Item> events, String show_more_deeplink, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PredictionEventsList(id, events, show_more_deeplink, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PredictionEventsList.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PredictionEventsList>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.PredictionEventsList$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PredictionEventsList value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return size + PredictionEventsList.Item.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getEvents()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getShow_more_deeplink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PredictionEventsList value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                PredictionEventsList.Item.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getEvents());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getShow_more_deeplink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PredictionEventsList value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getShow_more_deeplink());
                PredictionEventsList.Item.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getEvents());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PredictionEventsList decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PredictionEventsList(strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(PredictionEventsList.Item.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PredictionEventsList redact(PredictionEventsList value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PredictionEventsList.copy$default(value, null, Internal.m26823redactElements(value.getEvents(), PredictionEventsList.Item.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }

    /* compiled from: PredictionEventsList.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lsearch_coprocessor/v1/PredictionEventsList$Item;", "Lcom/squareup/wire/Message;", "", "event_id", "", "override_title", "preferred_contract_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getEvent_id", "()Ljava/lang/String;", "getOverride_title", "getPreferred_contract_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Item extends Message {

        @JvmField
        public static final ProtoAdapter<Item> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String event_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "overrideTitle", schemaIndex = 1, tag = 2)
        private final String override_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "preferredContractId", schemaIndex = 2, tag = 3)
        private final String preferred_contract_id;

        public Item() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29976newBuilder();
        }

        public final String getEvent_id() {
            return this.event_id;
        }

        public /* synthetic */ Item(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getOverride_title() {
            return this.override_title;
        }

        public final String getPreferred_contract_id() {
            return this.preferred_contract_id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(String event_id, String str, String str2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.event_id = event_id;
            this.override_title = str;
            this.preferred_contract_id = str2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29976newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(unknownFields(), item.unknownFields()) && Intrinsics.areEqual(this.event_id, item.event_id) && Intrinsics.areEqual(this.override_title, item.override_title) && Intrinsics.areEqual(this.preferred_contract_id, item.preferred_contract_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.event_id.hashCode()) * 37;
            String str = this.override_title;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.preferred_contract_id;
            int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("event_id=" + Internal.sanitize(this.event_id));
            String str = this.override_title;
            if (str != null) {
                arrayList.add("override_title=" + Internal.sanitize(str));
            }
            String str2 = this.preferred_contract_id;
            if (str2 != null) {
                arrayList.add("preferred_contract_id=" + Internal.sanitize(str2));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Item{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.event_id;
            }
            if ((i & 2) != 0) {
                str2 = item.override_title;
            }
            if ((i & 4) != 0) {
                str3 = item.preferred_contract_id;
            }
            if ((i & 8) != 0) {
                byteString = item.unknownFields();
            }
            return item.copy(str, str2, str3, byteString);
        }

        public final Item copy(String event_id, String override_title, String preferred_contract_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Item(event_id, override_title, preferred_contract_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Item.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Item>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.PredictionEventsList$Item$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PredictionEventsList.Item value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_id());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    return size + protoAdapter.encodedSizeWithTag(2, value.getOverride_title()) + protoAdapter.encodedSizeWithTag(3, value.getPreferred_contract_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PredictionEventsList.Item value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getOverride_title());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPreferred_contract_id());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PredictionEventsList.Item value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPreferred_contract_id());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getOverride_title());
                    if (Intrinsics.areEqual(value.getEvent_id(), "")) {
                        return;
                    }
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getEvent_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PredictionEventsList.Item redact(PredictionEventsList.Item value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return PredictionEventsList.Item.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PredictionEventsList.Item decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = null;
                    String strDecode3 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PredictionEventsList.Item(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
