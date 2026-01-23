package com.robinhood.arsenal.proto.p281v1.idl;

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
import p479j$.time.Instant;

/* compiled from: EventTopic.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0083\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0089\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010 R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b/\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b2\u0010 ¨\u00064"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "Lcom/squareup/wire/Message;", "", "", "id", "name", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicType;", "type", "type_id", "detail_deeplink", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "expiration_timestamp", "image_url", "", "rank", "dark_image_url", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicType;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicType;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "Ljava/lang/String;", "getId", "getName", "getCategory", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicType;", "getType", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicType;", "getType_id", "getDetail_deeplink", "Lj$/time/Instant;", "getExpiration_timestamp", "()Lj$/time/Instant;", "getImage_url", "I", "getRank", "getDark_image_url", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EventTopic extends Message {

    @JvmField
    public static final ProtoAdapter<EventTopic> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkImageUrl", schemaIndex = 9, tag = 10)
    private final String dark_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailDeeplink", schemaIndex = 5, tag = 6)
    private final String detail_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expirationTimestamp", schemaIndex = 6, tag = 7)
    private final Instant expiration_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 7, tag = 8)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int rank;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventTopicType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EventTopicType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "typeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String type_id;

    public EventTopic() {
        this(null, null, null, null, null, null, null, null, 0, null, null, 2047, null);
    }

    public /* synthetic */ EventTopic(String str, String str2, String str3, EventTopicType eventTopicType, String str4, String str5, Instant instant, String str6, int i, String str7, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED : eventTopicType, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : instant, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20138newBuilder();
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

    public final String getDetail_deeplink() {
        return this.detail_deeplink;
    }

    public final Instant getExpiration_timestamp() {
        return this.expiration_timestamp;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getDark_image_url() {
        return this.dark_image_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTopic(String id, String name, String category, EventTopicType type2, String type_id, String str, Instant instant, String str2, int i, String str3, ByteString unknownFields) {
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
        this.detail_deeplink = str;
        this.expiration_timestamp = instant;
        this.image_url = str2;
        this.rank = i;
        this.dark_image_url = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20138newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), eventTopic.unknownFields()) && Intrinsics.areEqual(this.id, eventTopic.id) && Intrinsics.areEqual(this.name, eventTopic.name) && Intrinsics.areEqual(this.category, eventTopic.category) && this.type == eventTopic.type && Intrinsics.areEqual(this.type_id, eventTopic.type_id) && Intrinsics.areEqual(this.detail_deeplink, eventTopic.detail_deeplink) && Intrinsics.areEqual(this.expiration_timestamp, eventTopic.expiration_timestamp) && Intrinsics.areEqual(this.image_url, eventTopic.image_url) && this.rank == eventTopic.rank && Intrinsics.areEqual(this.dark_image_url, eventTopic.dark_image_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.category.hashCode()) * 37) + this.type.hashCode()) * 37) + this.type_id.hashCode()) * 37;
        String str = this.detail_deeplink;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Instant instant = this.expiration_timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str2 = this.image_url;
        int iHashCode4 = (((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37) + Integer.hashCode(this.rank)) * 37;
        String str3 = this.dark_image_url;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("category=" + Internal.sanitize(this.category));
        arrayList.add("type=" + this.type);
        arrayList.add("type_id=" + Internal.sanitize(this.type_id));
        String str = this.detail_deeplink;
        if (str != null) {
            arrayList.add("detail_deeplink=" + Internal.sanitize(str));
        }
        Instant instant = this.expiration_timestamp;
        if (instant != null) {
            arrayList.add("expiration_timestamp=" + instant);
        }
        String str2 = this.image_url;
        if (str2 != null) {
            arrayList.add("image_url=" + Internal.sanitize(str2));
        }
        arrayList.add("rank=" + this.rank);
        String str3 = this.dark_image_url;
        if (str3 != null) {
            arrayList.add("dark_image_url=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventTopic{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventTopic copy$default(EventTopic eventTopic, String str, String str2, String str3, EventTopicType eventTopicType, String str4, String str5, Instant instant, String str6, int i, String str7, ByteString byteString, int i2, Object obj) {
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
            str5 = eventTopic.detail_deeplink;
        }
        if ((i2 & 64) != 0) {
            instant = eventTopic.expiration_timestamp;
        }
        if ((i2 & 128) != 0) {
            str6 = eventTopic.image_url;
        }
        if ((i2 & 256) != 0) {
            i = eventTopic.rank;
        }
        if ((i2 & 512) != 0) {
            str7 = eventTopic.dark_image_url;
        }
        if ((i2 & 1024) != 0) {
            byteString = eventTopic.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str6;
        int i3 = i;
        String str10 = str5;
        Instant instant2 = instant;
        String str11 = str4;
        String str12 = str3;
        return eventTopic.copy(str, str2, str12, eventTopicType, str11, str10, instant2, str9, i3, str8, byteString2);
    }

    public final EventTopic copy(String id, String name, String category, EventTopicType type2, String type_id, String detail_deeplink, Instant expiration_timestamp, String image_url, int rank, String dark_image_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(type_id, "type_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventTopic(id, name, category, type2, type_id, detail_deeplink, expiration_timestamp, image_url, rank, dark_image_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventTopic.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventTopic>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.EventTopic$Companion$ADAPTER$1
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
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getDetail_deeplink()) + ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getExpiration_timestamp()) + protoAdapter.encodedSizeWithTag(8, value.getImage_url());
                if (value.getRank() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getRank()));
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getDark_image_url());
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
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDetail_deeplink());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getExpiration_timestamp());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getImage_url());
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getRank()));
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDark_image_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventTopic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getDark_image_url());
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getRank()));
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getImage_url());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getExpiration_timestamp());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDetail_deeplink());
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
                EventTopicType eventTopicType;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventTopicType eventTopicType2 = EventTopicType.EVENT_TOPIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                Instant instantDecode = null;
                String strDecode4 = null;
                String strDecode5 = null;
                int iIntValue = 0;
                EventTopicType eventTopicTypeDecode = eventTopicType2;
                String strDecode6 = strDecode2;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                try {
                                    eventTopicTypeDecode = EventTopicType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    eventTopicType = eventTopicTypeDecode;
                                    str = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                eventTopicType = eventTopicTypeDecode;
                                str = strDecode6;
                                break;
                        }
                        strDecode6 = str;
                        eventTopicTypeDecode = eventTopicType;
                    } else {
                        return new EventTopic(strDecode6, strDecode7, strDecode, eventTopicTypeDecode, strDecode2, strDecode3, instantDecode, strDecode4, iIntValue, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventTopic redact(EventTopic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant expiration_timestamp = value.getExpiration_timestamp();
                return EventTopic.copy$default(value, null, null, null, null, null, null, expiration_timestamp != null ? ProtoAdapter.INSTANT.redact(expiration_timestamp) : null, null, 0, null, ByteString.EMPTY, 959, null);
            }
        };
    }
}
