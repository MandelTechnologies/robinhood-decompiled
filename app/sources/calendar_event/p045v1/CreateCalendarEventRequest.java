package calendar_event.p045v1;

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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: CreateCalendarEventRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BY\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u001bR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010#R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcalendar_event/v1/CreateCalendarEventRequest;", "Lcom/squareup/wire/Message;", "", "", "title", "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_time", "end_time", "", "", "reminders", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lokio/ByteString;)Lcalendar_event/v1/CreateCalendarEventRequest;", "Ljava/lang/String;", "getTitle", "getDescription", "Lj$/time/Instant;", "getStart_time", "()Lj$/time/Instant;", "getEnd_time", "Ljava/util/List;", "getReminders", "()Ljava/util/List;", "Companion", "calendar_event.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CreateCalendarEventRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateCalendarEventRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.PACKED, schemaIndex = 4, tag = 5)
    private final List<Integer> reminders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "startTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant start_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public CreateCalendarEventRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CreateCalendarEventRequest(String str, String str2, Instant instant, Instant instant2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9080newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Instant getStart_time() {
        return this.start_time;
    }

    public final Instant getEnd_time() {
        return this.end_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCalendarEventRequest(String title, String description, Instant instant, Instant instant2, List<Integer> reminders, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(reminders, "reminders");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.start_time = instant;
        this.end_time = instant2;
        this.reminders = Internal.immutableCopyOf("reminders", reminders);
    }

    public final List<Integer> getReminders() {
        return this.reminders;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9080newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateCalendarEventRequest)) {
            return false;
        }
        CreateCalendarEventRequest createCalendarEventRequest = (CreateCalendarEventRequest) other;
        return Intrinsics.areEqual(unknownFields(), createCalendarEventRequest.unknownFields()) && Intrinsics.areEqual(this.title, createCalendarEventRequest.title) && Intrinsics.areEqual(this.description, createCalendarEventRequest.description) && Intrinsics.areEqual(this.start_time, createCalendarEventRequest.start_time) && Intrinsics.areEqual(this.end_time, createCalendarEventRequest.end_time) && Intrinsics.areEqual(this.reminders, createCalendarEventRequest.reminders);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37;
        Instant instant = this.start_time;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.end_time;
        int iHashCode3 = ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.reminders.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        Instant instant = this.start_time;
        if (instant != null) {
            arrayList.add("start_time=" + instant);
        }
        Instant instant2 = this.end_time;
        if (instant2 != null) {
            arrayList.add("end_time=" + instant2);
        }
        if (!this.reminders.isEmpty()) {
            arrayList.add("reminders=" + this.reminders);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateCalendarEventRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateCalendarEventRequest copy$default(CreateCalendarEventRequest createCalendarEventRequest, String str, String str2, Instant instant, Instant instant2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCalendarEventRequest.title;
        }
        if ((i & 2) != 0) {
            str2 = createCalendarEventRequest.description;
        }
        if ((i & 4) != 0) {
            instant = createCalendarEventRequest.start_time;
        }
        if ((i & 8) != 0) {
            instant2 = createCalendarEventRequest.end_time;
        }
        if ((i & 16) != 0) {
            list = createCalendarEventRequest.reminders;
        }
        if ((i & 32) != 0) {
            byteString = createCalendarEventRequest.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        return createCalendarEventRequest.copy(str, str2, instant, instant2, list2, byteString2);
    }

    public final CreateCalendarEventRequest copy(String title, String description, Instant start_time, Instant end_time, List<Integer> reminders, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(reminders, "reminders");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateCalendarEventRequest(title, description, start_time, end_time, reminders, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateCalendarEventRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateCalendarEventRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: calendar_event.v1.CreateCalendarEventRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateCalendarEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getStart_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getStart_time());
                }
                if (value.getEnd_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getEnd_time());
                }
                return size + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(5, value.getReminders());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateCalendarEventRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getStart_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getStart_time());
                }
                if (value.getEnd_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getEnd_time());
                }
                ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 5, (int) value.getReminders());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateCalendarEventRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 5, (int) value.getReminders());
                if (value.getEnd_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getEnd_time());
                }
                if (value.getStart_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateCalendarEventRequest redact(CreateCalendarEventRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant start_time = value.getStart_time();
                Instant instantRedact = start_time != null ? ProtoAdapter.INSTANT.redact(start_time) : null;
                Instant end_time = value.getEnd_time();
                return CreateCalendarEventRequest.copy$default(value, null, null, instantRedact, end_time != null ? ProtoAdapter.INSTANT.redact(end_time) : null, null, ByteString.EMPTY, 19, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateCalendarEventRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                List listEmptyList = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        break;
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 5) {
                        if (listEmptyList == null) {
                            listEmptyList = new ArrayList((int) RangesKt.coerceAtMost(reader.nextFieldMinLengthInBytes() / 1, 2147483647L));
                        }
                        listEmptyList.add(ProtoAdapter.INT32.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
                ByteString byteStringEndMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(jBeginMessage);
                String str = strDecode;
                String str2 = strDecode2;
                Instant instant = instantDecode;
                Instant instant2 = instantDecode2;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                return new CreateCalendarEventRequest(str, str2, instant, instant2, listEmptyList, byteStringEndMessageAndGetUnknownFields);
            }
        };
    }
}
