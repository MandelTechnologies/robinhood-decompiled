package trivia.p550v1;

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
import p479j$.time.Instant;

/* compiled from: SetTriviaEventReminderRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ[\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001aR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b$\u0010#¨\u0006&"}, m3636d2 = {"Ltrivia/v1/SetTriviaEventReminderRequest;", "Lcom/squareup/wire/Message;", "", "", "title", "description", "event_url", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_timestamp", "end_timestamp", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Ltrivia/v1/SetTriviaEventReminderRequest;", "Ljava/lang/String;", "getTitle", "getDescription", "getEvent_url", "Lj$/time/Instant;", "getStart_timestamp", "()Lj$/time/Instant;", "getEnd_timestamp", "Companion", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class SetTriviaEventReminderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SetTriviaEventReminderRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "endTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant end_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventUrl", schemaIndex = 2, tag = 3)
    private final String event_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "startTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant start_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public SetTriviaEventReminderRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ SetTriviaEventReminderRequest(String str, String str2, String str3, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30019newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEvent_url() {
        return this.event_url;
    }

    public final Instant getStart_timestamp() {
        return this.start_timestamp;
    }

    public final Instant getEnd_timestamp() {
        return this.end_timestamp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTriviaEventReminderRequest(String title, String description, String str, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.event_url = str;
        this.start_timestamp = instant;
        this.end_timestamp = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30019newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetTriviaEventReminderRequest)) {
            return false;
        }
        SetTriviaEventReminderRequest setTriviaEventReminderRequest = (SetTriviaEventReminderRequest) other;
        return Intrinsics.areEqual(unknownFields(), setTriviaEventReminderRequest.unknownFields()) && Intrinsics.areEqual(this.title, setTriviaEventReminderRequest.title) && Intrinsics.areEqual(this.description, setTriviaEventReminderRequest.description) && Intrinsics.areEqual(this.event_url, setTriviaEventReminderRequest.event_url) && Intrinsics.areEqual(this.start_timestamp, setTriviaEventReminderRequest.start_timestamp) && Intrinsics.areEqual(this.end_timestamp, setTriviaEventReminderRequest.end_timestamp);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37;
        String str = this.event_url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Instant instant = this.start_timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.end_timestamp;
        int iHashCode4 = iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        String str = this.event_url;
        if (str != null) {
            arrayList.add("event_url=" + Internal.sanitize(str));
        }
        Instant instant = this.start_timestamp;
        if (instant != null) {
            arrayList.add("start_timestamp=" + instant);
        }
        Instant instant2 = this.end_timestamp;
        if (instant2 != null) {
            arrayList.add("end_timestamp=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetTriviaEventReminderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetTriviaEventReminderRequest copy$default(SetTriviaEventReminderRequest setTriviaEventReminderRequest, String str, String str2, String str3, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setTriviaEventReminderRequest.title;
        }
        if ((i & 2) != 0) {
            str2 = setTriviaEventReminderRequest.description;
        }
        if ((i & 4) != 0) {
            str3 = setTriviaEventReminderRequest.event_url;
        }
        if ((i & 8) != 0) {
            instant = setTriviaEventReminderRequest.start_timestamp;
        }
        if ((i & 16) != 0) {
            instant2 = setTriviaEventReminderRequest.end_timestamp;
        }
        if ((i & 32) != 0) {
            byteString = setTriviaEventReminderRequest.unknownFields();
        }
        Instant instant3 = instant2;
        ByteString byteString2 = byteString;
        return setTriviaEventReminderRequest.copy(str, str2, str3, instant, instant3, byteString2);
    }

    public final SetTriviaEventReminderRequest copy(String title, String description, String event_url, Instant start_timestamp, Instant end_timestamp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetTriviaEventReminderRequest(title, description, event_url, start_timestamp, end_timestamp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetTriviaEventReminderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetTriviaEventReminderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: trivia.v1.SetTriviaEventReminderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetTriviaEventReminderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEvent_url());
                if (value.getStart_timestamp() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getStart_timestamp());
                }
                return value.getEnd_timestamp() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getEnd_timestamp()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetTriviaEventReminderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEvent_url());
                if (value.getStart_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getStart_timestamp());
                }
                if (value.getEnd_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getEnd_timestamp());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetTriviaEventReminderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnd_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getEnd_timestamp());
                }
                if (value.getStart_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getStart_timestamp());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEvent_url());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetTriviaEventReminderRequest redact(SetTriviaEventReminderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant start_timestamp = value.getStart_timestamp();
                Instant instantRedact = start_timestamp != null ? ProtoAdapter.INSTANT.redact(start_timestamp) : null;
                Instant end_timestamp = value.getEnd_timestamp();
                return SetTriviaEventReminderRequest.copy$default(value, null, null, null, instantRedact, end_timestamp != null ? ProtoAdapter.INSTANT.redact(end_timestamp) : null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetTriviaEventReminderRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetTriviaEventReminderRequest(strDecode, strDecode3, strDecode2, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 5) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
