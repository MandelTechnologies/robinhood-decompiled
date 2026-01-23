package event_contract_hub.proto.p461v1;

import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.util.notification.RhGcmListenerService;
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

/* compiled from: EventTopic.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\rH\u0016J\b\u0010#\u001a\u00020\u0004H\u0016Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopic;", "Lcom/squareup/wire/Message;", "", "id", "", "name", RhGcmListenerService.EXTRA_CATEGORY, "type", "Levent_contract_hub/proto/v1/EventTopicType;", "type_id", "image_url", "dark_image_url", "rank", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Levent_contract_hub/proto/v1/EventTopicType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getName", "getCategory", "getType", "()Levent_contract_hub/proto/v1/EventTopicType;", "getType_id", "getImage_url", "getDark_image_url", "getRank", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class EventTopic extends Message {

    @JvmField
    public static final ProtoAdapter<EventTopic> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkImageUrl", schemaIndex = 6, tag = 7)
    private final String dark_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 5, tag = 6)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int rank;

    @WireField(adapter = "event_contract_hub.proto.v1.EventTopicType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EventTopicType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "typeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String type_id;

    public EventTopic() {
        this(null, null, null, null, null, null, null, 0, null, 511, null);
    }

    public /* synthetic */ EventTopic(String str, String str2, String str3, EventTopicType eventTopicType, String str4, String str5, String str6, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED : eventTopicType, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28078newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCategory() {
        return this.category;
    }

    public final EventTopicType getType() {
        return this.type;
    }

    public final String getType_id() {
        return this.type_id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getDark_image_url() {
        return this.dark_image_url;
    }

    public final int getRank() {
        return this.rank;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTopic(String id, String name, String category, EventTopicType type2, String type_id, String str, String str2, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(type_id, "type_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.category = category;
        this.type = type2;
        this.type_id = type_id;
        this.image_url = str;
        this.dark_image_url = str2;
        this.rank = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28078newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventTopic)) {
            return false;
        }
        EventTopic eventTopic = (EventTopic) other;
        return Intrinsics.areEqual(unknownFields(), eventTopic.unknownFields()) && Intrinsics.areEqual(this.id, eventTopic.id) && Intrinsics.areEqual(this.name, eventTopic.name) && Intrinsics.areEqual(this.category, eventTopic.category) && this.type == eventTopic.type && Intrinsics.areEqual(this.type_id, eventTopic.type_id) && Intrinsics.areEqual(this.image_url, eventTopic.image_url) && Intrinsics.areEqual(this.dark_image_url, eventTopic.dark_image_url) && this.rank == eventTopic.rank;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.category.hashCode()) * 37) + this.type.hashCode()) * 37) + this.type_id.hashCode()) * 37;
        String str = this.image_url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.dark_image_url;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + Integer.hashCode(this.rank);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("category=" + Internal.sanitize(this.category));
        arrayList.add("type=" + this.type);
        arrayList.add("type_id=" + Internal.sanitize(this.type_id));
        String str = this.image_url;
        if (str != null) {
            arrayList.add("image_url=" + Internal.sanitize(str));
        }
        String str2 = this.dark_image_url;
        if (str2 != null) {
            arrayList.add("dark_image_url=" + Internal.sanitize(str2));
        }
        arrayList.add("rank=" + this.rank);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventTopic{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventTopic copy$default(EventTopic eventTopic, String str, String str2, String str3, EventTopicType eventTopicType, String str4, String str5, String str6, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventTopic.id;
        }
        if ((i2 & 2) != 0) {
            str2 = eventTopic.name;
        }
        if ((i2 & 4) != 0) {
            str3 = eventTopic.category;
        }
        if ((i2 & 8) != 0) {
            eventTopicType = eventTopic.type;
        }
        if ((i2 & 16) != 0) {
            str4 = eventTopic.type_id;
        }
        if ((i2 & 32) != 0) {
            str5 = eventTopic.image_url;
        }
        if ((i2 & 64) != 0) {
            str6 = eventTopic.dark_image_url;
        }
        if ((i2 & 128) != 0) {
            i = eventTopic.rank;
        }
        if ((i2 & 256) != 0) {
            byteString = eventTopic.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return eventTopic.copy(str, str2, str10, eventTopicType, str9, str7, str8, i3, byteString2);
    }

    public final EventTopic copy(String id, String name, String category, EventTopicType type2, String type_id, String image_url, String dark_image_url, int rank, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(type_id, "type_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventTopic(id, name, category, type2, type_id, image_url, dark_image_url, rank, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventTopic.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventTopic>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: event_contract_hub.proto.v1.EventTopic$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventTopic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCategory());
                }
                if (value.getType() != EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED) {
                    size += EventTopicType.ADAPTER.encodedSizeWithTag(4, value.getType());
                }
                if (!Intrinsics.areEqual(value.getType_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getType_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getImage_url()) + protoAdapter.encodedSizeWithTag(7, value.getDark_image_url());
                return value.getRank() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getRank())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventTopic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCategory());
                }
                if (value.getType() != EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED) {
                    EventTopicType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getType_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getType_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getImage_url());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getDark_image_url());
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getRank()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventTopic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getRank()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getDark_image_url());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getImage_url());
                if (!Intrinsics.areEqual(value.getType_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getType_id());
                }
                if (value.getType() != EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED) {
                    EventTopicType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getCategory());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventTopic decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventTopicType eventTopicType = EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                int iIntValue = 0;
                EventTopicType eventTopicTypeDecode = eventTopicType;
                String strDecode5 = strDecode2;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                try {
                                    eventTopicTypeDecode = EventTopicType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new EventTopic(strDecode5, strDecode6, strDecode, eventTopicTypeDecode, strDecode2, strDecode3, strDecode4, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventTopic redact(EventTopic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EventTopic.copy$default(value, null, null, null, null, null, null, null, 0, ByteString.EMPTY, 255, null);
            }
        };
    }
}
